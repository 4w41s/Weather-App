package com.awais.weatherapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocationWeather(
    @PrimaryKey val id: Int,
    val name: String,
    val weather: ArrayList<Weather>,
    val main: Main,
)

data class Weather(
    val main: String,
    val description: String,
    val icon: String
)

data class Main(
    val temp: Float,
    val feelsLike: Float,
    val tempMin: Float,
    val tempMax: Float,
)

/*{
    "coord": {
    "lon": 73.0995,
    "lat": 33.6528
},
    "weather": [{
    "id": 800,
    "main": "Clear",
    "description": "clear sky",
    "icon": "01n"
}],
    "base": "stations",
    "main": {
    "temp": 287.22,
    "feels_like": 285.44,
    "temp_min": 287.22,
    "temp_max": 287.22,
    "pressure": 1015,
    "humidity": 29,
    "sea_level": 1015,
    "grnd_level": 957
},
    "visibility": 10000,
    "wind": {
    "speed": 2.16,
    "deg": 7,
    "gust": 2.07
},
    "clouds": {
    "all": 0
},
    "dt": 1637532550,
    "sys": {
    "country": "PK",
    "sunrise": 1637545560,
    "sunset": 1637582506
},
    "timezone": 18000,
    "id": 1341330,
    "name": "Nai Ābādi",
    "cod": 200
}*/