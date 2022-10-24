let dateNow = new Date();
document.getElementById('container__date').innerText = `Hôm nay: ${dateNow.getDay()} - ${dateNow.getMonth()+1} - ${dateNow.getFullYear()};

/*
navigator.geolocation.getCurrentPosition(async function (position) {
	let lat = position.coords.latitude;
	let lon = position.coords.longitude;
	let apiUrl = 'https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&appid=04970e49d844f27a9ecdddae8c588a72';
	let data = await fetch(apiUrl).then((res) => res.json());
	console.log(data);
	let city = data.name;
	let temp = (data.main.temp) - 273.15;
	document.getElementById('container__location').innerText = city;
	document.getElementById('container__tempera').innerText = temp;
});
*/