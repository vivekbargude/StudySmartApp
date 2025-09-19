
---

# 📚 StudySmartApp

**StudySmartApp** is an **offline-first Android app** built with Kotlin that helps students **track study hours, subjects, and tasks** with smart session timers and progress analytics.

---

## ✨ Features

* 📖 **Subject Management**

  * Add, edit, and delete subjects.
  * Assign a total number of hours to each subject.

* ✅ **Task Tracking**

  * Add and delete tasks for each subject.
  * Set **priority levels** for tasks.
  * View tasks as **Completed** and **Incomplete** lists.

* ⏳ **Smart Study Sessions**

  * Start a **study session with a timer**.
  * Timer runs **in the background** with notifications (even if app is closed).
  * **Deep linking** to timer screen for quick access.

* 📊 **Progress Monitoring**

  * Track recent study sessions per subject.
  * Visualize study progress with a **percentage progress bar** showing completed vs. assigned hours.
  * Get insights on time spent on each subject.

* 📶 **Offline-First Approach**

  * Works seamlessly offline, ensuring study tracking without internet dependency.

---

## 📸 Screenshots

| Home Screen                   | Subject Details                     | Study Session Timer             | Progress Tracking                     |
| ----------------------------- | ----------------------------------- | ------------------------------- | ------------------------------------- |
| ![Home](screenshots/home.png) | ![Subject](screenshots/subject.png) | ![Timer](screenshots/timer.png) | ![Progress](screenshots/progress.png) |

---

## 🚀 Getting Started

### Prerequisites

* Android Studio (latest stable)
* Kotlin
* Android SDK (API 26+)

### Installation

1. Clone the repo:

   ```bash
   git clone https://github.com/vivekbargude/StudySmartApp.git
   ```
2. Open the project in **Android Studio**.
3. Let Gradle sync and build the project.

### Running

1. Connect a physical device or start an emulator.
2. Run the app via **Android Studio > Run App**.

---

## 📂 Project Structure

```
StudySmartApp/
├── app/                     # Main Android app module
│   ├── data/                # Local database & repositories
│   ├── ui/                  # UI screens & components
│   ├── viewmodel/           # ViewModels for state management
│   └── utils/               # Helpers & utility classes
├── gradle/                  # Gradle wrapper files
├── build.gradle.kts         # Project-level build config
├── settings.gradle.kts      # Modules included
└── README.md                # Project documentation
```

---

## 🛠️ Technologies Used

* **Kotlin** – App logic and UI
* **Room Database / SQLite** – Offline-first local storage
* **Android Jetpack Components** – ViewModel, LiveData, Navigation
* **WorkManager / Services** – Background timers & notifications
* **Material Design** – UI/UX

---

## 🤝 Contributing

Contributions are welcome!

1. Fork this repo
2. Create a new branch (`feature/my-feature`)
3. Commit changes with clear messages
4. Open a Pull Request

---


👉 Would you like me to also create a **visual architecture diagram** (showing how `Subjects → Tasks → Sessions → Progress` are linked) for this README? That would make it even more professional.
