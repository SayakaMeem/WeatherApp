# WeatherApp 🌦️

A clean, fast, and lightweight Android weather application that provides real-time weather information for any city in the world.

Built with modern Android development practices, WeatherApp delivers current temperature, weather conditions, humidity, wind speed, and more — in a simple and beautiful UI.

> Repository: [SayakaMeem/WeatherApp](https://github.com/SayakaMeem/WeatherApp)

![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=flat&logo=android)
![Language](https://img.shields.io/badge/Language-Kotlin%2FJava-7F52FF?style=flat)
![License](https://img.shields.io/badge/License-MIT-blue)

### ✨ Features

- 🌍 **Search any city** - Get weather worldwide
- 🌡️ **Real-time data** - Temperature, feels like, min/max
- 💧 **Detailed metrics** - Humidity, wind speed, pressure, visibility
- 🌤️ **Weather condition** - Clear, cloudy, rain, etc. with icons
- 📍 **Location based** - Auto-detect current location weather (if permission granted)
- 🎨 **Clean UI** - Material Design 3, responsive and user-friendly
- ⚡ **Fast & Lightweight** - Optimized API calls and caching

### 📸 Screenshots

| Home | Search | Details |
| :---: | :---: | :---: |
| <img src="screenshots/home.png" width="200"/> | <img src="screenshots/search.png" width="200"/> | <img src="screenshots/details.png" width="200"/> |

> Add your screenshots in a `/screenshots` folder.

### 🛠️ Tech Stack

- **Language:** Kotlin / Java
- **IDE:** Android Studio
- **Architecture:** MVVM (Model-View-ViewModel)
- **Networking:** Retrofit2 + OkHttp
- **JSON Parsing:** GSON / Moshi
- **Async:** Coroutines / LiveData
- **API:** [OpenWeatherMap API](https://openweathermap.org/api)

  WeatherApp/
├── app/
│ ├── src/main/
│ │ ├── java/com/sayakameem/weatherapp/
│ │ │ ├── ui/ # Activities, Fragments
│ │ │ ├── data/ # Models, Repository
│ │ │ ├── network/ # Retrofit ApiService
│ │ │ └── utils/ # Constants, Helpers
│ │ ├── res/
│ │ │ ├── layout/
│ │ │ └── drawable/
│ │ └── AndroidManifest.xml
│ └── build.gradle
├── gradle/
└── build.gradle


### 🚀 Getting Started

#### 1. Prerequisites
- Android Studio Hedgehog or later
- Android SDK 24+
- OpenWeatherMap API Key (free)

#### 2. Clone the repository

git clone https://github.com/SayakaMeem/WeatherApp.git
cd WeatherApp

3. Get API Key
Go to https://openweathermap.org/api
Sign up and get a free API key
Create a file local.properties or add to utils/Constants.kt:
Kotlin
const val API_KEY = "YOUR_API_KEY_HERE"
const val BASE_URL = "https://api.openweathermap.org/data/2.5/"
4. Build and Run
Open project in Android Studio
Sync Gradle
Run on emulator or physical device
🔑 API Usage Example
Kotlin
@GET("weather")
suspend fun getWeather(
    @Query("q") cityName: String,
    @Query("appid") apiKey: String,
    @Query("units") units: String = "metric"
): WeatherResponse

🔮 Future Improvements
 7-day forecast
 Hourly forecast chart
 Dark / Light theme toggle
 Weather widgets
 Save favorite cities
 Air Quality Index (AQI)
🤝 Contributing
Contributions are welcome!

Fork the project
Create your feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request
📄 License
This project is licensed under the MIT License - see the LICENSE [blocked] file for details.

👩‍💻 Author
Sayaka Meem

GitHub: @SayakaMeem
⭐ If you like this project, please give it a star!





