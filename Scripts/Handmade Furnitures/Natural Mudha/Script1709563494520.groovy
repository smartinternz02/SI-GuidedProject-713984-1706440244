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

WebUI.navigateToUrl('https://craferia.com/handmade-furnitures/')

WebUI.mouseOver(findTestObject('Object Repository/Handmade Furnitures/Page_Handcrafted  Handmade Bamboo Cane Furn_32f547/a_Handmade Furnitures'))

WebUI.click(findTestObject('Object Repository/Handmade Furnitures/Page_Handcrafted  Handmade Bamboo Cane Furn_32f547/a_Natural Mudha'))

WebUI.verifyElementText(findTestObject('Object Repository/Handmade Furnitures/Page_Natural Mudha made of Bamboo  Woods  Craferia/h1_Natural Mudha'), 
    'Natural Mudha')

WebUI.verifyElementVisible(findTestObject('Object Repository/Handmade Furnitures/Page_Natural Mudha made of Bamboo  Woods  Craferia/img_attachment-woocommerce_thumbnail size-w_8f6098'))

WebUI.verifyElementText(findTestObject('Object Repository/Handmade Furnitures/Page_Natural Mudha made of Bamboo  Woods  Craferia/span_1,599.00'), 
    '₹1,599.00')

WebUI.verifyElementClickable(findTestObject('Object Repository/Handmade Furnitures/Page_Natural Mudha made of Bamboo  Woods  Craferia/a_Add to cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Handmade Furnitures/Page_Natural Mudha made of Bamboo  Woods  Craferia/span_FREE SHIPPING'))

WebUI.closeBrowser()

