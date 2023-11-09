# Guidelines
1. Clone repository
`https://github.com/shansty/task.mobile`
2. Open Appium with:
   `127.0.0.1` host and `4723` port
3. Open Android Studio and create device `Pixel 6` with Android version `11.0`
4. Open Appium Inspector with capabilities:
`{
   "platformName": "Android",
   "appium:platformVersion": "11.0",
   "appium:deviceName": "Pixel 6",
   "appium:automationName": "UiAutomator2",
   "appium:app": "C:\\Users\\Anastasiya\\Desktop\\app-staging.apk"
   }`
5. Run tests:
   `mvn test`
6. Generate allure report
   `mvn allure:serve`
7. If you want to use another device you need to change capabilities in DriverSingleton class too.