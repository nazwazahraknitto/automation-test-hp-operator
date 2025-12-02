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

WebUI.callTestCase(findTestCase('TC3. Pindahkan Kain/TC3.3. Scan Roll/TC3.3.1. Scan Roll Success'), [('noroll') : 'R24010638'
        , ('kodeverif') : '123'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Pemindahan Kain Rollan - Page/Scan No Roll/Button Form Scan Roll'), 
    0)

Mobile.sendKeys(findTestObject('Application/App/Activity/Pemindahan Kain Rollan - Page/Scan No Roll/Field No Roll'), 'R24010638')

Mobile.sendKeys(findTestObject('Application/App/Activity/Pemindahan Kain Rollan - Page/Scan No Roll/Field Kode Verifikasi'), 
    '123')

Mobile.verifyElementExist(findTestObject('Application/App/Activity/Pemindahan Kain Rollan - Page/Scan No Roll/Toast - No Roll Sudah Di scan'), 
    0)

