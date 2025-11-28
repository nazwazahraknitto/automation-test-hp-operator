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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC2. Pencarian Kain - Manual/TC2.3. Pencarian Via Filter Tanggal Ambil'), [('noorder') : noorder
        , ('tanggalpilih') : tanggalpilih], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Faktur Asli/Pop Up Scan No Roll - Button Input Manual'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Faktur Asli/Field 3 Digit No Penjualan'), nopenj)

Mobile.sendKeys(findTestObject('Object Repository/Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Faktur Asli/Field Kode Verifikasi'), verif)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Faktur Asli/Pop Up Scan Faktur - Button Pilih'), 0)

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Faktur Asli/Pop Up Scan No Roll - Button Input Manual'), 
    0)

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Faktur Asli/Dropdown Pilih Noroll - Setelah Scan Faktur'), 
    0)

TestObject dynamicObj = new TestObject('dynamicObj')

dynamicObj.addProperty('xpath', ConditionType.EQUALS, ((('//*[@class=\'android.widget.CheckedTextView\' and (@text=\'' + 
    noroll) + '\' or .=\'') + noroll) + '\')]')

Mobile.tap(dynamicObj, 0)

Mobile.sendKeys(findTestObject('Object Repository/Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Faktur Asli/Kode Verifikasi Roll Pilih'), 
    kode)

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Faktur Asli/Button Pilih - Input Roll Manual'), 
    0)

