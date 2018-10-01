export class NutritionValue {
  id: number;
  nameAndAmount: string;
  calories: number;
  caloriesFromFat: number;
  totalFat: number;
  saturatedFat: number;
  transFat: number;
  cholesterol: number;
  sodium: number;
  potassium: number;
  totalCarbohydrate: number;
  dietaryFiber: number;
  sugars: number;
  protein: number;

  constructor(
    id?: number,
    nameAndAmount?: string,
    calories?: number,
    caloriesFromFat?: number,
    totalFat?: number,
    saturatedFat?: number,
    transFat?: number,
    cholesterol?: number,
    sodium?: number,
    potassium?: number,
    totalCarbohydrate?: number,
    dietaryFiber?: number,
    sugars?: number,
    protein?: number
  ) {
    this.id = id;
    this.nameAndAmount = nameAndAmount;
    this.calories = calories;
    this.caloriesFromFat = caloriesFromFat;
    this.totalFat = totalFat;
    this.saturatedFat = saturatedFat;
    this.transFat = transFat;
    this.cholesterol = cholesterol;
    this.sodium = sodium;
    this.potassium = potassium;
    this.totalCarbohydrate = totalCarbohydrate;
    this.dietaryFiber = dietaryFiber;
    this.sugars = sugars;
    this.protein = protein;

  }
}
