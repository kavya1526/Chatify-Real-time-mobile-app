# Chatify : Android Studio based real time chatting app

Chatify is a real-time mobile chat application that allows users to send and receive text and photos in realtime across platforms. It offers features such as text and photo exchange, user authentication, dual login, private and group chats, and customizable profile pages.

## Features

- **Real-Time Messaging**: Exchange text messages and photos in real-time.
- **User Authentication**: Secure login and registration using Firebase Authentication.
- **Dual Login**: Simultaneous login on multiple devices.
- **Private and Group Chats**: Create private one-on-one chats or join group conversations.
- **Profile Pages**: Customize your profile with a profile picture and status.

Video link: https://drive.google.com/file/d/16CCqI-GweQSplYmwP9MCYS6QTxY6weOw/view?usp=sharing

The screenshot below shows the login and homescreen of the application.
<img src="https://user-images.githubusercontent.com/61109166/210130380-5f0249bd-c81c-48a1-ac09-57f35cf74181.png" alt="drawing" width="750" height="500"/>


The personalized chatting functionality is shown below. All the real time data was stored in Firebase.

<img src="https://user-images.githubusercontent.com/61109166/210130294-c285e888-9b7f-4b8b-a683-668591d882db.png" alt="drawing" width="750" height="400"/>


The group chatting functionality and the user profile page is shown in the screenshot below.

<img src="https://user-images.githubusercontent.com/61109166/210130395-492da42d-e4e0-43a8-a20b-f617584cf62f.png" alt="drawing" width="550" height="400"/>

## Technologies Used

- **Frontend**: Android Studio for Android development.
- **Backend**: Firebase for authentication, real-time database, and storage.

## Getting Started

### Prerequisites

- Android Studio installed on your development machine.
- Firebase account set up with a project for the app.

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/yourusername/Chatify-Real-time-mobile-app.git
    ```
2. Open the project in Android Studio.

### Firebase Configuration

1. Go to the Firebase Console and create a new project.
2. Add your Android app to the project.
3. Download the `google-services.json` file and place it in the `app` directory of your Android project.
4. Enable Authentication in Firebase Console and choose the authentication methods you want to use (e.g., Email/Password).
5. Enable Firebase Realtime Database and Firebase Storage in the Firebase Console.

### Running the App

1. Connect your Android device or start an emulator.
2. Build and run the project from Android Studio.

## Usage

- **Sign Up**: Register a new account using your email and password.
- **Log In**: Log in with your registered credentials.
- **Chat**: Start a private chat or create a group chat to exchange messages and photos in real-time.
- **Profile**: Customize your profile with a picture and status message.

## Contributing

We welcome contributions! Follow these steps to contribute:

1. Fork the repository.
2. Create your feature branch:
    ```sh
    git checkout -b feature/your-feature
    ```
3. Commit your changes:
    ```sh
    git commit -m 'Add your feature'
    ```
4. Push to the branch:
    ```sh
    git push origin feature/your-feature
    ```
5. Open a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For questions or suggestions, feel free to open an issue or contact me directly at [kparik10@asu.edu](mailto:kparik10@asu.edu).

---

### Acknowledgements

- [Firebase](https://firebase.google.com/)
- [Android Studio](https://developer.android.com/studio)

---

### References

- [Firebase Authentication Documentation](https://firebase.google.com/docs/auth)
- [Firebase Realtime Database Documentation](https://firebase.google.com/docs/database)
- [Firebase Storage Documentation](https://firebase.google.com/docs/storage)

