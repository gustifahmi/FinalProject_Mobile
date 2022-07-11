import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\095059\\Documents\\BTDP-Katalon\\FinalProject\\Final Project - Mobile\\apk\\app-debug.apk', 
    true)

Mobile.waitForElementPresent(findTestObject('Login Page/Page Title - Bank App Demo'), 0)

Mobile.tap(findTestObject('Login Page/Button - Create a Profile'), 0)

Mobile.waitForElementPresent(findTestObject('Create Profile/Page Title - Create Profile'), 0)

Mobile.setText(findTestObject('Create Profile/Input - First Name'), GlobalVariable.firstname, 0)

Mobile.setText(findTestObject('Create Profile/Input - Last Name'), GlobalVariable.lastname, 0)

Mobile.setText(findTestObject('Create Profile/Input - Country'), GlobalVariable.country, 0)

Mobile.setText(findTestObject('Create Profile/Input - Username'), GlobalVariable.username, 0)

Mobile.setText(findTestObject('Create Profile/Input - Password'), GlobalVariable.password, 0)

Mobile.setText(findTestObject('Create Profile/Input - Confirm Password'), GlobalVariable.password, 0)

Mobile.tap(findTestObject('Create Profile/Button - Create Profile'), 0)

Mobile.waitForElementPresent(findTestObject('Login Page/Page Title - Bank App Demo'), 0)

Mobile.tap(findTestObject('Login Page/Button - Login'), 0)

Mobile.waitForElementPresent(findTestObject('Dashboard/Page Title - Dashboard'), 0)

Mobile.tap(findTestObject('Dashboard/Button - Add Account'), 0)

Mobile.waitForElementPresent(findTestObject('Account/Add Account/Text - Add An Account'), 0)

Mobile.setText(findTestObject('Account/Add Account/Input - Account Name'), account_name, 0)

Mobile.setText(findTestObject('Account/Add Account/Input - Initial Balance'), balance, 0)

Mobile.tap(findTestObject('Account/Add Account/Button - Add'), 0)

Mobile.waitForElementPresent(findTestObject('Account/Image - Account 1'), 0)

Mobile.tap(findTestObject('Account/Button - Add Account'), 0)

Mobile.waitForElementPresent(findTestObject('Account/Add Account/Text - Add An Account'), 0)

Mobile.setText(findTestObject('Account/Add Account/Input - Account Name'), account_name, 0)

Mobile.setText(findTestObject('Account/Add Account/Input - Initial Balance'), balance, 0)

Mobile.tap(findTestObject('Account/Add Account/Button - Add'), 0)

Mobile.verifyElementVisible(findTestObject('Account/Add Account/Text - Add An Account'), 0)

Mobile.verifyElementVisible(findTestObject('Account/Add Account/Input - Account Name'), 0)

Mobile.verifyElementVisible(findTestObject('Account/Add Account/Input - Initial Balance (1000)'), 0)

Mobile.verifyElementVisible(findTestObject('Account/Add Account/Button - Cancel'), 0)

Mobile.verifyElementVisible(findTestObject('Account/Add Account/Button - Add'), 0)

Mobile.tap(findTestObject('Account/Add Account/Button - Cancel'), 0)

Mobile.verifyElementNotVisible(findTestObject('Account/Image - Account 2'), 5)

Mobile.closeApplication()

