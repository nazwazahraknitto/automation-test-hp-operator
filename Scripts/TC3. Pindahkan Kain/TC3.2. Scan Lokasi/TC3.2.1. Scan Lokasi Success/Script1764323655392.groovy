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

WebUI.callTestCase(findTestCase('TC3. Pindahkan Kain/TC3.1. Akses Menu Pindahkan Kain'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Pemindahan Kain Rollan - Page/Scan No Lokasi/Pop Up Awal - Button Scan Lokasi'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Pemindahan Kain Rollan - Page/Scan No Lokasi/Button Buka Form Lokasi'), 
    0)

Mobile.delay(1)

Mobile.sendKeys(findTestObject('Object Repository/Application/App/Activity/Pemindahan Kain Rollan - Page/Scan No Lokasi/Pemindahan Kain Rollan - Field No Lokasi'), 
    nolokasi)

Mobile.sendKeys(findTestObject('Application/App/Activity/Pemindahan Kain Rollan - Page/Scan No Lokasi/Pemindahan Kain Rollan - Field Kode Verifikasi'), 
    kodeverif)

Mobile.tap(findTestObject('Application/App/Activity/Pemindahan Kain Rollan - Page/Scan No Lokasi/Scan Lokasi - Button Submit'), 0)

