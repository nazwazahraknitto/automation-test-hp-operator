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
//Tambahan Global Function yang dibuat
import helper.GlobalFunction as GF

WebUI.callTestCase(findTestCase('TC2. Pencarian Kain - Manual/TC2.1. Akses Menu Pencarian Kain'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2)

CustomKeywords.'reusablesteps.ReusableStep.checkDataOrderisOpened'()

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Dropdown Filter'), 0)

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Filter - Tanggal Ambil'), 0)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Filter Tanggal/Filter Tanggal - Klik Icon Tanggal'), 
    0)

Mobile.tap(findTestObject('Object Repository/Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Filter Tanggal/Tanggal Pilih'), 
    0)

TestObject dynamicObj = new TestObject('dynamicObj')

dynamicObj.addProperty('xpath', ConditionType.EQUALS, ((('//*[@class=\'android.view.View\' and (@text=\'' + this.tanggalpilih) +
			'\' or .=\'') + this.tanggalpilih) + '\')]')

Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Filter Tanggal/Pilih Tanggal Filter Button OK'), 
    0)

Mobile.delay(4)

CustomKeywords.'helper.GlobalFunction.findTextUntilfound'(this.noorder, 10)

Mobile.delay(1)

if (Mobile.verifyElementExist(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Lokasi - Button OK'),
	3, FailureHandling.OPTIONAL)) {
	Mobile.tap(findTestObject('Application/App/Activity/Pencarian Kain - Page/Filter Pencarian/Pop Up Scan Lokasi - Button OK'),
	0)

}


