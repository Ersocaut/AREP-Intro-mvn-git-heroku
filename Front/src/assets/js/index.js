import { api } from './api/api.js';

const numberInput = document.getElementById('numberInput');
const selectType = document.getElementById('SelectType');
const button = document.getElementById('mainButton');

function toCelsius () {
    api.toCelsius(numberInput.value).then(result => {
        const {Celsius} = result;
        alert(`${numberInput.value} °F son ${Celsius}°C`);
    });
}

function toFahrenheit () {
    api.toFahrenheit(numberInput.value).then(result => {
        const {Fahrenheit} = result;
        alert(`${numberInput.value} °C son ${Fahrenheit}°F`);
    });
}

function convert () {
    if (selectType.options[selectType.selectedIndex].value == 0){
        toFahrenheit();
    }else {
        toCelsius();
    }
}

setListeners();

function setListeners(){
    button.addEventListener('click', convert);
}