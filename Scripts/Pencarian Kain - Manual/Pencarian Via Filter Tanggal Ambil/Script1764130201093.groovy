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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Pencarian Kain - Manual/Akses Menu Pencarian Kain'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Dropdown Filter'), 0)

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Filter - Tanggal Ambil'), 0)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Filter Tanggal/Filter Tanggal - Klik Icon Tanggal'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Filter Tanggal/Pop Up Scan Lokasi - Button OK'), 
    0)

Mobile.delay(4)

String targetText = 'OH201125012'

TestObject dynamicObj = new TestObject('dynamicObj')

dynamicObj.addProperty('xpath', ConditionType.EQUALS, ((('//*[@class=\'android.widget.TextView\' and (@text=\'' + targetText) + 
    '\' or .=\'') + targetText) + '\')]')

int maxSwipe = 10

boolean found = false

for (int i = 0; i < maxSwipe; i++) {
    println('Cek elemen: ' + targetText)

    if (Mobile.verifyElementExist(dynamicObj, 2, FailureHandling.OPTIONAL)) {
        println('KETEMU → STOP LOOP')

        Mobile.delay(2)

        found = true

        Mobile.tap(dynamicObj, 0)

        break
    }
    
    Mobile.swipe(0, 876, 0, 300)

    Mobile.delay(2)
}

if (!(found)) {
    println('Text tidak ditemukan: ' + targetText)
}

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Filter Tanggal/Pop Up Scan Lokasi - Button OK'), 
    0)

