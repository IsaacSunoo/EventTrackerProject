import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NutritionalValuesComponent } from './nutritional-values/nutritional-values.component';
import { NutritionService } from './nutrition.service';

@NgModule({
  declarations: [
    AppComponent,
    NutritionalValuesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [NutritionService],
  bootstrap: [AppComponent]
})
export class AppModule { }
