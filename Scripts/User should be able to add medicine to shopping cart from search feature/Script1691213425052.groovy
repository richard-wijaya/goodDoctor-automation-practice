import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.MobileElement as MobileElement
import org.openqa.selenium.Keys as Keys

Mobile.comment('Test Case : User should be able to add medicine to shopping cart from search feature ')

'Open Good Doctor App'

'Get full directory\'s path of android application'
def appPath = PathUtil.relativeToAbsolutePath(GlobalVariable.G_AppPath, RunConfiguration.getProjectDir())

Mobile.startApplication(appPath, false)

'Click Search Bar'
Mobile.tap(findTestObject('Home Page/Search Box'), 5)
Mobile.waitForElementPresent(findTestObject('Search Page/Search Bar'), 15)

'assert search page successfully opened'
Mobile.verifyElementExist(findTestObject('Search Page/Pencarian Populer Section'), 5)

'Input Keyword "panadol"'
Mobile.setText(findTestObject('Search Page/Search Bar'), 'panadol', 5)
Mobile.waitForElementPresent(findTestObject('Search Page/Medicine item'), 15)

'assert section obat successfully loaded'
Mobile.verifyElementExist(findTestObject('Search Page/Category Tab'), 5)
Mobile.verifyElementExist(findTestObject('Search Page/Toko Kesehatan Section'), 5)

'Click First Panadol Item'
Mobile.tap(findTestObject('Search Page/Medicine item'), 5)
Mobile.waitForElementPresent(findTestObject('Product Detail Page/Webview Product Detail'), 15)

'Assert Webview for product detail page successfully loaded'
Mobile.verifyElementExist(findTestObject('Product Detail Page/Webview Product Detail'), 5)

'Verify Qty = 1'

'Click button add to cart'

'Click icon shopping cart'

'Assert shopping cart page & verify cart item'

Mobile.closeApplication()

