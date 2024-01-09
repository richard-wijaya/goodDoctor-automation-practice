# goodDoctor-automation-practice

Hi, My Name is Richard Findlay Wijaya and this is my Automation practice using Katalon Studio. This is an automation project spesific for Android device.

**Here's a complete instruction on how to executing the automation test (Mac version)**
1. Make sure the following are already installed and set up in local
   - Homebrew ```/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"```
   - Node JS ```brew install node```
   - Npm ```brew install npm ```
   - Appium ```npm install -g appium```
   - Katalon Studio
   - Android Studio --> install AVD emulator
     
2. Clone this repository to locale ```git clone https://github.com/richard-wijaya/goodDoctor-automation-test.git```
   
4. Set up to run project
   - Connect Appium to Katalon Studio
      - set Appium directory to ```/usr/local/lib/node_modules/appium```
    - Run command in terminal to start appium ```appium```
    - Run emulator
    - Set desired capabilities (Katalon Studio --> Projects --> Settings --> Desired capabilities --> Mobile --> Android)
      - app : "/Users/(user-location)/GoodDoctorTestAssessment/AndroidApp/universal.apk"
      - noReset : true
      - platformVersion : (emulator-version)
      - bundleId : com.pajk.idpersonaldoc
      - appWaitActivity : com.pajk.*
      - automationName : UiAutomator2
      - platformName : android
      - deviceName : emulator-5554

5. Run Test case
   - Go to Test case ```Test Cases/User should be able to add medicine to shopping cart from search feature```
   - Run by clicking play button (Select running android emulator)
   - Check log for automation process\
  
**Notes for reviewer:**
- I skipped login process due to I'm testing on production app.. so in order to login, it need OTP verification which is impossible to be automation, therefore before run the test case, ensure user already logged in manually (this has also been stated in test case precondition)
- The script that I've created only covered on Native page. Therefore there's a skip process on testing webview page.
