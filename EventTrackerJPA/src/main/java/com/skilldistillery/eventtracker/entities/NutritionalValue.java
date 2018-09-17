package com.skilldistillery.eventtracker.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NutritionalValue {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name_and_amount")
	private String nameAndAmount;
	
	private Integer calories;
	
	@Column(name="calories_from_fat")
	private Integer caloriesFromFat;
	
	@Column(name="total_fat")
	private Double totalFat;
	
	@Column(name="saturated_fat")
	private Double saturatedFat;
	
	@Column(name="trans_fat")
	private Double transFat;
	
	private Integer cholesterol;
	
	private Integer sodium;
	
	private Integer potassium;
	
	@Column(name="total_carbohydrate")
	private Double totalCarbohydrate;
	
	@Column(name="dietary_fiber")
	private Double dietaryFiber;
	
	private Double sugars;
	
	private Double protein;
	
	public NutritionalValue() {

	}

	public NutritionalValue(String nameAndAmount, Integer calories, Integer caloriesFromFat, Double totalFat,
			Double saturatedFat, Double transFat, Integer cholesterol, Integer sodium, Integer potassium,
			Double totalCarbohydrate, Double dietaryFiber, Double sugars, Double protein) {
		super();
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameAndAmount() {
		return nameAndAmount;
	}

	public void setNameAndAmount(String nameAndAmount) {
		this.nameAndAmount = nameAndAmount;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getCaloriesFromFat() {
		return caloriesFromFat;
	}

	public void setCaloriesFromFat(Integer caloriesFromFat) {
		this.caloriesFromFat = caloriesFromFat;
	}

	public Double getTotalFat() {
		return totalFat;
	}

	public void setTotalFat(Double totalFat) {
		this.totalFat = totalFat;
	}

	public Double getSaturatedFat() {
		return saturatedFat;
	}

	public void setSaturatedFat(Double saturatedFat) {
		this.saturatedFat = saturatedFat;
	}

	public Double getTransFat() {
		return transFat;
	}

	public void setTransFat(Double transFat) {
		this.transFat = transFat;
	}

	public Integer getCholesterol() {
		return cholesterol;
	}

	public void setCholesterol(Integer cholesterol) {
		this.cholesterol = cholesterol;
	}

	public Integer getSodium() {
		return sodium;
	}

	public void setSodium(Integer sodium) {
		this.sodium = sodium;
	}

	public Integer getPotassium() {
		return potassium;
	}

	public void setPotassium(Integer potassium) {
		this.potassium = potassium;
	}

	public Double getTotalCarbohydrate() {
		return totalCarbohydrate;
	}

	public void setTotalCarbohydrate(Double totalCarbohydrate) {
		this.totalCarbohydrate = totalCarbohydrate;
	}

	public Double getDietaryFiber() {
		return dietaryFiber;
	}

	public void setDietaryFiber(Double dietaryFiber) {
		this.dietaryFiber = dietaryFiber;
	}

	public Double getSugars() {
		return sugars;
	}

	public void setSugars(Double sugars) {
		this.sugars = sugars;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	@Override
	public String toString() {
		return "NutritionalValue [id=" + id + ", nameAndAmount=" + nameAndAmount + ", calories=" + calories
				+ ", caloriesFromFat=" + caloriesFromFat + ", totalFat=" + totalFat + ", saturatedFat=" + saturatedFat
				+ ", transFat=" + transFat + ", cholesterol=" + cholesterol + ", sodium=" + sodium + ", potassium="
				+ potassium + ", totalCarbohydrate=" + totalCarbohydrate + ", dietaryFiber=" + dietaryFiber
				+ ", sugars=" + sugars + ", protein=" + protein + "]";
	}

}
