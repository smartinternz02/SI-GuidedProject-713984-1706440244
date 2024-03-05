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

WebUI.click(findTestObject('Object Repository/Handmade Furnitures/Page_Handcrafted  Handmade Bamboo Cane Furn_32f547/a_Cane Baskets'))

WebUI.verifyElementText(findTestObject('Object Repository/Handmade Furnitures/Page_Cane Baskets by Craferia/h1_Cane Baskets'), 
    'Cane Baskets')

WebUI.verifyElementVisible(findTestObject('Object Repository/Handmade Furnitures/Page_Cane Baskets by Craferia/img_attachment-woocommerce_thumbnail size-w_8f6098'))

WebUI.verifyElementText(findTestObject('Object Repository/Handmade Furnitures/Page_Cane Baskets by Craferia/h2_Square Shaped Design wicker willow kashm_dc45a1'), 
    'Square Shaped Design wicker willow kashmir baskets for gifts, pooja, fruits basket /Multipurpose cane bamboo baskets')

WebUI.verifyElementText(findTestObject('Object Repository/Handmade Furnitures/Page_Cane Baskets by Craferia/span_525.00'), 
    '₹525.00')

WebUI.verifyElementText(findTestObject('Object Repository/Handmade Furnitures/Page_Cane Baskets by Craferia/span_1,750.00'), 
    '₹1,750.00')

WebUI.verifyElementClickable(findTestObject('Object Repository/Handmade Furnitures/Page_Cane Baskets by Craferia/a_Select options'))

WebUI.click(findTestObject('Object Repository/Handmade Furnitures/Page_Cane Baskets by Craferia/a_Select options'))

WebUI.waitForElementVisible(findTestObject('Page_Buy Square Shaped wicker willow kashmi_944595/h1_Square Shaped Design wicker willow kashm_8d8645'), 
    30)

WebUI.closeBrowser()

