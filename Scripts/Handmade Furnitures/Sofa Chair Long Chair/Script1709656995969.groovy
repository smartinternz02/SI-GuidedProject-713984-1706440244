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

WebUI.click(findTestObject('Object Repository/Handmade Furnitures/Page_Handcrafted  Handmade Bamboo Cane Furn_32f547/a_Sofa chair  Long chair'))

WebUI.verifyElementText(findTestObject('Object Repository/Handmade Furnitures/Page_Two Seater Sofa, Wooden Sofa  Craferia/h1_Sofa chair  Long chair'), 
    'Sofa chair / Long chair')

WebUI.verifyElementVisible(findTestObject('Object Repository/Handmade Furnitures/Page_Two Seater Sofa, Wooden Sofa  Craferia/img_attachment-woocommerce_thumbnail size-w_8f6098'))

WebUI.verifyElementText(findTestObject('Object Repository/Handmade Furnitures/Page_Two Seater Sofa, Wooden Sofa  Craferia/span_6,500.00'), 
    '₹6,500.00')

WebUI.verifyElementText(findTestObject('Object Repository/Handmade Furnitures/Page_Two Seater Sofa, Wooden Sofa  Craferia/h2_Eco-friendly Bamboo Natural 3 Seater Cha_0f8c43'), 
    'Eco-friendly Bamboo Natural 3 Seater Chair/Bamboo Sofa 3 Seater for indoor outdoor')

WebUI.verifyElementClickable(findTestObject('Object Repository/Handmade Furnitures/Page_Two Seater Sofa, Wooden Sofa  Craferia/a_Add to cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Handmade Furnitures/Page_Two Seater Sofa, Wooden Sofa  Craferia/img_attachment-woocommerce_thumbnail size-w_8f6098_1'), 
    0)

WebUI.closeBrowser()

