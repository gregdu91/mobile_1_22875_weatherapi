package com.example.project_list

class WeatherCoord (val lat: Double, var lon: Double)

class WeatherMain (val temp: Double, val feels_like: Double, val pressure: Double, val humidity: Double)

class WeatherStation (val dt: Int, val main: WeatherMain)

class Weather(val list: List<WeatherStation>, val city: WeatherCity)
