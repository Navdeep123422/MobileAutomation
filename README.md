## Description

This is a mobile automation framework for testing the "Create Wallet" functionality of the Trust Wallet app.

## Setup Instructions

1. Download the latest Android APK from https://trustwallet.com/.
2. Install Xcode
3. Configure Apple ID in Account preferences
4. Install Xcode command line tools
5. Command: xcode-select --install
6. Install xcpretty [to make Xcode output reasonable]
7. Command to install xcpretty: gem install xcpretty
8. Install Carthage [dependency manager, required for WebDriverAgent]
9. Install Appium-doctor and check Appium setup
10. Command to install Appium doctor: npm install -g appium-doctor
11. Command to get help: appium-doctor --h
12. Command to check setup for iOS: appium-doctor --ios
13. Install XCUITest driver (using Appium CLI)
14. Command to install driver: appium driver install XCUITest
15. Download link: https://github.com/appium/ios-uicatalog
16. Command to get simulator name: xcodebuild -showsdks
17. Command to get UDID: xcrun simctl list
18. Install Appium and ensure it is running with the command: `appium server -p 4723 -a 127.0.0.1 -pa /wd/hub`.
19. Clone this repository
6. Run the SampleTests using TestNG.

## Notes

- Ensure proper configuration of Appium capabilities for iOS testing.
- Ensure that the Trust Wallet APK is placed in the appropriate directory.
- Modify the test scenarios in SampleTest.java as per requirements.
