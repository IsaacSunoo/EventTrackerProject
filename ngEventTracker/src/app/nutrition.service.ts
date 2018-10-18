import { environment } from './../environments/environment';
import { catchError } from 'rxjs/operators';
import { NutritionValue } from './models/nutrition-value';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { throwError, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NutritionService {
  // private baseUrl = 'http://localhost:8080/';
  // private url = this.baseUrl + 'api/nutritionalvalue';

  private url = environment.baseUrl + 'api/nutritionalvalues';

  public index(): Observable<NutritionValue[]> {
    return this.http.get<NutritionValue[]>(this.url).pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('Error retrieving Food List: ' + ' Status: ' + err.status);
      })
    );
  }

  public show(id: number): Observable<NutritionValue> {
    return this.http.get<NutritionValue>('${this.url/:id}').pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('Error retrieving Food List: ' + ' Status: ' + err.status);
      })
    );
  }

  public create(todo: NutritionValue) {

    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json'
      })
    };

    return this.http.post(this.url, todo, httpOptions).pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('Error saving Food item: ' + ' Status: ' + err.status);
      })
    );
  }

  public update(nutrition: NutritionValue) {
    return this.http.put(this.url + '/' + nutrition.id, nutrition).pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('Error saving Food item: ' + ' Status: ' + err.status);
      })
    );
  }

  public destroy(id: number) {
    return this.http.delete(this.url + '/' + id).pipe(
      catchError((err: any) => {
        console.log(err);
        return throwError('Error saving Food item: ' + ' Status: ' + err.status);
      })
    );
  }

  constructor(private http: HttpClient) {}
}
