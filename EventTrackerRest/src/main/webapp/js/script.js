window.addEventListener('load', function(e) {
	console.log('document loaded');
	init();
});

function init() {
	document.nutritionForm.lookup.addEventListener('click', function(event) {

		event.preventDefault();

		var xhr = new XMLHttpRequest();
		xhr.open('GET', 'api/nutritionalvalues/' + foodId);

		xhr.onreadystatechange = function() {
			if (xhr.readyState === 4)
				if (xhr.status === 200) {
					let foodData = JSON.parse(xhr.responseText);
					console.log(xhr.responseText);
					displayFood(foodData);
				} else {
					console.err("ERROR retrieving data")
				}
			if (xhr.readyState === 4 && xhr.status != 200) {
				console.error(xhr.status + ': ' + xhr.responseText);
			}
		}
		xhr.send();
	});
}

function displayFood(food) {
	var dataDiv = document.getElementById('foodData');
	dataDiv.textContent = '';

	var table = document.createElement('table');
	var foodName = document.createElement('h2');
	foodName.textContent = food.nameAndAmount;
	var tableRow = document.createElement('tr');
	var tableRow1 = document.createElement('tr');
	var tableRow2 = document.createElement('tr');
	var tableRow3 = document.createElement('tr');
	var tableRow4 = document.createElement('tr');
	var tableRow5 = document.createElement('tr');
	var tableRow6 = document.createElement('tr');
	var tableRow7 = document.createElement('tr');
	var tableRow8 = document.createElement('tr');
	var tableRow9 = document.createElement('tr');
	var tableRow10 = document.createElement('tr');
	var tableRow11 = document.createElement('tr');
	var calories = document.createElement('td');
	calories.textContent = "Calories";
	var caloriesValue = document.createElement('td');
	caloriesValue.textContent = food.calories;
	var calFromFat = document.createElement('td');
	calFromFat.textContent = "Calories From Fat";
	var calFromFatValue = document.createElement('td');
	calFromFatValue.textContent = food.caloriesFromFat;
	var totalFat = document.createElement('td');
	totalFat.textContent = "Total Fat";
	var totalFatValue = document.createElement('td');
	totalFatValue.textContent = food.totalFat;
	var satFat = document.createElement('td');
	satFat.textContent = "Saturated Fat";
	var satFatValue = document.createElement('td');
	satFatValue.textContent = food.saturatedFat;
	var transFat = document.createElement('td');
	transFat.textContent = "Trans Fat";
	var transFatValue = document.createElement('td');
	transFatValue.textContent = food.transFat;
	var cholesterol = document.createElement('td');
	cholesterol.textContent = "Cholesterol";
	var cholesterolValue = document.createElement('td');
	cholesterolValue.textContent = food.cholesterol;
	var sodium = document.createElement('td');
	sodium.textContent = "Sodium";
	var sodiumValue = document.createElement('td');
	sodiumValue.textContent = food.sodium;
	var potassium = document.createElement('td');
	potassium.textContent = "Potassium";
	var potassiumValue = document.createElement('td');
	potassiumValue.textContent = food.potassium;
	var totCarb = document.createElement('td');
	totCarb.textContent = "Total Carbohydrates";
	var totCarbValue = document.createElement('td');
	totCarbValue.textContent = food.totalCarbohydrate;
	var fiber = document.createElement('td');
	fiber.textContent = "Fiber";
	var fiberValue = document.createElement('td');
	fiberValue.textContent = food.fiber;
	var sugars = document.createElement('td');
	sugars.textContent = "Sugars";
	var sugarValue = document.createElement('td');
	sugarValue.textContent = food.sugars;
	var protein = document.createElement('td');
	protein.textContent = "Protein";
	var proteinValue = document.createElement('td');
	proteinValue.textContent = food.protein;

	table.append(foodName);
	table.append(tableRow);
	tableRow.append(calories);
	tableRow.append(caloriesValue);
	table.append(tableRow1);
	tableRow1.append(calFromFat);
	tableRow1.append(calFromFatValue);
	table.append(tableRow2);
	tableRow2.append(totalFat);
	tableRow2.append(totalFatValue);
	table.append(tableRow3);
	tableRow3.append(satFat);
	tableRow3.append(satFatValue);
	table.append(tableRow4);
	tableRow4.append(transFat);
	tableRow4.append(transFatValue);
	table.append(tableRow5);
	tableRow5.append(cholesterol);
	tableRow5.append(cholesterolValue);
	table.append(tableRow6);
	tableRow6.append(sodium);
	tableRow6.append(sodiumValue);
	table.append(tableRow7);
	tableRow7.append(potassium);
	tableRow7.append(potassiumValue);
	table.append(tableRow8);
	tableRow8.append(totCarb);
	tableRow8.append(totCarbValue);
	table.append(tableRow9);
	tableRow9.append(fiber);
	tableRow9.append(fiberValue);
	table.append(tableRow10);
	tableRow10.append(sugars);
	tableRow10.append(sugarValue);
	table.append(tableRow11);
	tableRow11.append(protein);
	tableRow11.append(proteinValue);
	dataDiv.appendChild(table);
}
