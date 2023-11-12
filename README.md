# Guidelines
1. Clone repository
`https://github.com/shansty/task.mobile`
2. Open Appium with:
   `127.0.0.1` host and `4723` port
3. Open Android Studio and create device. In application.properties `Pixel 6` and Android version `11.0`
4. Run tests:
   `mvn test`
5. Generate allure report
   `mvn allure:serve`
6. If you want to use another device you need to change property in PropertyHelper class. Also if you want to test IOS you need to change IOS selector in parts and pages packages.