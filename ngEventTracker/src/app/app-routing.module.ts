import { NutritionalValuesComponent } from './nutritional-values/nutritional-values.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', component: NutritionalValuesComponent },
  { path: 'home', component: NutritionalValuesComponent }]
  ;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
