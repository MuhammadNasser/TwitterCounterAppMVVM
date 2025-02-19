# 📱 Twitter Counter App (MVVM + Jetpack Compose)

A modern Android app built using **MVVM**, **Jetpack Compose**, **Hilt Dependency Injection**, and **Retrofit** to post tweets and count characters using **Twitter's official rules**.

---

## 🚀 Features

- ✅ **Post tweets** directly to Twitter using OAuth 1.0a
- ✅ **Character counting** with official Twitter API rules
- ✅ **Live character limit updates** (with UI warnings for exceeding 280 characters)
- ✅ **Modern UI with Jetpack Compose**
- ✅ **MVVM Architecture + Clean Architecture**
- ✅ **Hilt Dependency Injection**
- ✅ **Retrofit API calls for Twitter integration**

---

## 🏗️ Tech Stack

- **Programming Language**: Kotlin
- **UI**: Jetpack Compose
- **Architecture**: MVVM + Clean Architecture
- **Dependency Injection**: Hilt
- **Networking**: Retrofit + OkHttp
- **Authentication**: OAuth 1.0a (for Twitter API)
- **State Management**: StateFlow

---

## 🛠️ Setup Instructions

### 1️⃣ Clone the Repository

```sh
git clone https://github.com/yourusername/TwitterCounterAppMVVM.git
cd TwitterCounterAppMVVM
```

### 2️⃣ Add Twitter API Keys

1. Go to **[Twitter Developer Portal](https://developer.twitter.com/)**.
2. Create an App and **enable OAuth 1.0a (User Context)**.
3. Get your API keys and **Access Token & Secret**.
4. Add them to `secrets.properties` (ignored by Git):
   ```properties
   CONSUMER_KEY=your_consumer_key
   CONSUMER_SECRET=your_consumer_secret
   ACCESS_TOKEN=your_access_token
   ACCESS_SECRET=your_access_secret
   ```

### 3️⃣ Run the App

- Open the project in **Android Studio**.
- Sync Gradle and **Run** the app.
