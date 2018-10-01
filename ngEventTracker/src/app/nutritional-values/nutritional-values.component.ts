import { NutritionService } from './../nutrition.service';
import { Component, OnInit } from '@angular/core';
import { NutritionValue } from '../models/nutrition-value';
import { ActivatedRoute, Router } from '@angular/router';

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

  setEditNutrition = function () {
    this.editNutrition = Object.assign({}, this.selected);
  };

  displayTable = function () {
    this.selected = null;
  };

  cancel = function () {
    this.editNutrition = null;
  };

  updateNutrition = function (nutrition: NutritionValue) {
    this.todoService.update(nutrition).subscribe(
      data => {
        this.selected = data;
        this.editNutrition = null;
        this.reload();
      });
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

  addNutrition = function () {
    this.nutritionService.create(this.newNutrition).subscribe(
      data => {
        this.newNutrition = new NutritionValue();
        this.reload();
      }
    );
  };

  reload = function () {
    this.NutritionService.index()
      .subscribe(
        data => { this.nutritions = data; }
      );
  };


  constructor(private nutritionService: NutritionService,
    private activatedRoute: ActivatedRoute,
    private router: Router) { }

  ngOnInit() {
    this.reload();
  }
}
