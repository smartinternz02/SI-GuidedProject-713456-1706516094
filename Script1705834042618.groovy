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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Category_Elements/Page_Amazon.com. Spend less. Smile more/span_Account  Lists'))

WebUI.setText(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Category_Elements/Page_Amazon Sign-In/input_Email or mobile phone number_email'), 
    'yakatejasivaganeshtsg@gmail.com')

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Page_Amazon Sign-In/input_Enter your email or mobile phone number_continue'))

WebUI.setEncryptedText(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Category_Elements/Page_Amazon Sign-In/input_Forgot your password_password'), 
    'ZGM6yvwC5UE/mm6ehKw+qw==')

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Category_Elements/Page_Amazon Sign-In/input_Enter your password_signInSubmit'))

WebUI.selectOptionByLabel(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Category_Elements/Page_Amazon.com. Spend less. Smile more/Category_Elements'), 
    category, false)

WebUI.setText(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Category_Elements/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
    items)

WebUI.click(findTestObject('AmazonPages/Amazon_ValidateSearchFieldItem_OR/Category_Elements/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))

WebUI.closeBrowser()

