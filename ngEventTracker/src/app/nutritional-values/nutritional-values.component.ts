import { NutritionService } from './../nutrition.service';
import { Component, OnInit } from '@angular/core';
import { NutritionValue } from '../models/nutrition-value';
import { ActivatedRoute, Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-nutritional-values',
  templateUrl: './nutritional-values.component.html',
  styleUrls: ['./nutritional-values.component.css']
})
export class NutritionalValuesComponent implements OnInit {
  selected: NutritionValue = null;
  newNutrition: NutritionValue = new NutritionValue();
  editNutrition: NutritionValue = null;
  nutritions: NutritionValue[] = [];

  setEditNutrition = function (nutrition: NutritionValue) {

    this.editNutrition = Object.assign({}, nutrition);
  };

  displayTable = function () {
    this.selected = null;
  };

  cancel = function () {
    this.editNutrition = null;
  };

  updateNutrition = function (nutrition: NutritionValue) {
    console.log(nutrition);

    this.nutritionService.update(nutrition).subscribe(
      data => {
        this.selected = nutrition;
        this.editNutrition = null;
        this.reload();
      },
      err => { console.error('Observer got an error: ' + err.status); }
    );
  };

  deleteNutrition = function (id: number) {
    this.nutritionService.destroy(id).subscribe(
      data => {
        this.reload();
      });
  };

  displayNutrition = function (nutrition: NutritionValue) {
    this.selected = nutrition;

    console.log(nutrition);
  };

  addNutrition = function (form: NgForm) {
    const newNutrition = form.value;
    this.nutritionService.create(newNutrition).subscribe(
      data => {
        this.reload();
      }
    );
  };

  reload = function () {
    this.nutritionService.index()
      .subscribe(
        data => { this.nutritions = data; }
      );
  };

  show = function (id) {
    this.nutritionService.show(id).subscribe(
      data => {
        this.selected = data;
      },
      err => console.error('Observer got an error: ' + err)
    );
  };


  constructor(private nutritionService: NutritionService,
    private activatedRoute: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
    this.reload();
  }
}
