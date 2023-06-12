##### Test project where you can see how I use appium for automation testing on IOS device
##### You can download an app for testing from here
https://drive.google.com/file/d/1wjihG9qCwdyVqgN3cvOnbQPqZLLQjvDK/view?usp=sharing

##### In these methods change information about your device and app path
options.setDeviceName("Your device name"); <br/>
options.setApp("Path to iOS.app");

##### Maybe you should change URL for appium and IP Address. I use these
service = new AppiumServiceBuilder() <br/>
.withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js")) <br/>
.withIPAddress("127.0.0.1") <br/>
.usingPort(4723).build(); <br/>
service.start(); <br/>

##### In BaseTest:
I run appium server <br/>
Set capabilities <br/>
initialize iOS driver <br/>

##### In iOS actions class I use basic methods which I can use in page object classes
##### In package PageObjects I have my page object classes
##### Run test in StoreTest classes. I am doing the following steps in tests:
- Open the app
- open Alert views screen
- Open popup
- Enter text
- Close popup
- Click confirm/cancel button
- Check text message

 
