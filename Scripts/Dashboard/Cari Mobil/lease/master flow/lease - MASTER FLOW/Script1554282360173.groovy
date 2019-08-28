import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

Mobile.waitForElementPresent(findTestObject('Dashboard/Cari Mobil/Lease/Lease_BtnUsedCar'), 0)

switch (varNewUsed.toString()) {
    case 'N':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_BnNewCar'), 7)

        break
    case 'U':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_BtnUsedCar'), 7)

        break
}

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpBrand'), varBrand, 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpBrand'), 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_LOVBrand'), 7, FailureHandling.OPTIONAL)

Mobile.sendKeys(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpType'), varType, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_LOVType'), 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpType'), 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_LOVType'), 7, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpModel'), varModel, 7, FailureHandling.OPTIONAL)

Mobile.hideKeyboard(FailureHandling.OPTIONAL)

CustomKeywords.'mobile.mobileSwipe.UpDown'(0.70, 0.20, 1000)

CustomKeywords.'mobile.pick.ListNaik'(findTestObject('Dashboard/Cari Mobil/Lease/Lease_LOVModel'), 39, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpTahun'), varTahun, 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_LOVTahun'), 7, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpAreaPengajuan'), varAreaPengajuan, 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_LOVAreaPengajuan'), 7, FailureHandling.OPTIONAL)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpCabang'), varCabang, 7, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_LOVCabang'), 7, FailureHandling.OPTIONAL)

'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
Mobile.delay(3, FailureHandling.OPTIONAL)

switch (varTujuanPenggunaan.toString()) {
    case 'Usaha':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_BtnUsaha'), 7, FailureHandling.OPTIONAL)

        Mobile.setText(findTestObject('Dashboard/Cari Mobil/Lease/Lease_InpBidangUsaha'), varBidangUsaha, 7, FailureHandling.OPTIONAL)

        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_LOVBidangUsaha'), 7, FailureHandling.OPTIONAL)

        'diberikan delay sementara, karena belum bisa tap pada list yang diinginkan'
        Mobile.delay(3, FailureHandling.OPTIONAL)

        break
    case 'Pribadi':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_BtnPribadi'), 7, FailureHandling.OPTIONAL)

        break
}

not_run: switch (varTypeCustomer.toString()) {
    case 'Personal':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_BtnPersonal'), 7, FailureHandling.OPTIONAL)

        break
    case 'Company':
        Mobile.tap(findTestObject('Dashboard/Cari Mobil/Lease/Lease_BtnCompany'), 7, FailureHandling.OPTIONAL)

        break
}

not_run: CustomKeywords.'mobile.pick.Listwarna'(findTestObject('DynamicObject/PickListItem', [('text') : varWarna]), FailureHandling.OPTIONAL)

not_run: switch (varPeriode.toString()) {
    case '24':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/SliderLease'), 0.20)

        break
    case '36':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/Slider'), 0.40)

        break
    case '48':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/SliderLease'), 0.60)

        break
    case '60':
        CustomKeywords.'mobile.mobileSlide.Slide'(findTestObject('DynamicObject/SliderLease'), 0.80)

        break
}

