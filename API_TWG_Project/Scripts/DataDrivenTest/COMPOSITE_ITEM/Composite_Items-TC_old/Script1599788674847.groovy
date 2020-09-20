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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import ws.util.VariableCollections as VariableCollections
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.ResponseObject as ResponseObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import static org.assertj.core.api.Assertions.*
import java.lang.ref.ReferenceQueue.Null as Null
import org.junit.After as After
import groovy.json.JsonOutput as JsonOutput

WS.sendRequest(findTestObject('COMPOSITE_ITEM/UPLOAD AND INVOKE/01_Request_POST/Composite_Item_Request_TC01_OLD', [('C_Name') : C_Name
            , ('C_ParentID') : C_ParentID, ('C_WSL_AT_ProductDescriptionWebstore') : C_WSL_AT_ProductDescriptionWebstore
            , ('C_WSL_AT_OnlineDeliveryMinimumDays') : C_WSL_AT_OnlineDeliveryMinimumDays, ('C_WSL_AT_SoldOnlineIndicator') : C_WSL_AT_SoldOnlineIndicator
            , ('C_WSL_AT_OnlineDeliveryMaximumDays') : C_WSL_AT_OnlineDeliveryMaximumDays, ('C_WSL_AT_WebEnabled') : C_WSL_AT_WebEnabled
            , ('C_WSL_AT_OnlineDeliverySizeOverride') : C_WSL_AT_OnlineDeliverySizeOverride, ('C_WSL_AT_OnlineDeliverySizeDefault') : C_WSL_AT_OnlineDeliverySizeDefault
            , ('C_WSL_AT_WebItemSku') : C_WSL_AT_WebItemSku, ('C_WSL_AT_WebExpiryDate') : C_WSL_AT_WebExpiryDate, ('C_WSL_AT_FeaturesAndBenefits') : C_WSL_AT_FeaturesAndBenefits
            , ('C_WSL_AT_ClickAndCollectFlag') : C_WSL_AT_ClickAndCollectFlag, ('C_WSL_AT_WebClearanceIndicator') : C_WSL_AT_WebClearanceIndicator
            , ('C_WSL_AT_WebEffectiveDate') : C_WSL_AT_WebEffectiveDate, ('C_TWL_AT_ProductDescriptionWebstore') : C_TWL_AT_ProductDescriptionWebstore
            , ('C_TWL_AT_OnlineDeliveryMinimumDays') : C_TWL_AT_OnlineDeliveryMinimumDays, ('C_TWL_AT_SoldOnlineIndicator') : C_TWL_AT_SoldOnlineIndicator
            , ('C_TWL_AT_OnlineDeliveryMaximumDays') : C_TWL_AT_OnlineDeliveryMaximumDays, ('C_TWL_AT_WebEnabled') : C_TWL_AT_WebEnabled
            , ('C_TWL_AT_OnlineDeliverySizeOverride') : C_TWL_AT_OnlineDeliverySizeOverride, ('C_TWL_AT_OnlineDeliverySizeDefault') : C_TWL_AT_OnlineDeliverySizeDefault
            , ('C_TWL_AT_WebItemSku') : C_TWL_AT_WebItemSku, ('C_TWL_AT_WebExpiryDate') : C_TWL_AT_WebExpiryDate, ('C_TWL_AT_FeaturesAndBenefits') : C_TWL_AT_FeaturesAndBenefits
            , ('C_TWL_AT_ClickAndCollectFlag') : C_TWL_AT_ClickAndCollectFlag, ('C_TWL_AT_WebClearanceIndicator') : C_TWL_AT_WebClearanceIndicator
            , ('C_TWL_AT_WebEffectiveDate') : C_TWL_AT_WebEffectiveDate, ('CompositeProduct_To_Product') : CompositeProduct_To_Product
            , ('C_AT_DangerousGoodsTransportIndicator') : C_AT_DangerousGoodsTransportIndicator, ('C_AT_HighRiskIndicator') : C_AT_HighRiskIndicator
            , ('C_AT_InStoreEndDate') : C_AT_InStoreEndDate, ('C_AT_InStoreStartDate') : C_AT_InStoreStartDate, ('C_AT_PackagingFormat') : C_AT_PackagingFormat
            , ('C_AT_ParallelImportCode') : C_AT_ParallelImportCode, ('C_AT_PreOrderAvailable') : C_AT_PreOrderAvailable
            , ('C_AT_ProductImageURLIndicator') : C_AT_ProductImageURLIndicator, ('C_AT_ProductName') : C_AT_ProductName
            , ('C_AT_ProductShortName') : C_AT_ProductShortName, ('C_AT_ProductStatus') : C_AT_ProductStatus, ('C_AT_RecallStatus') : C_AT_RecallStatus
            , ('C_AT_ShippingProductDepth') : C_AT_ShippingProductDepth, ('C_AT_ShippingProductHeight') : C_AT_ShippingProductHeight
            , ('C_AT_ShippingProductVolume') : C_AT_ShippingProductVolume, ('C_AT_ShippingProductWeight') : C_AT_ShippingProductWeight
            , ('C_AT_ShippingProductWidth') : C_AT_ShippingProductWidth, ('C_AT_SupplierCode') : C_AT_SupplierCode, ('C_AT_TUIItemKey') : C_AT_TUIItemKey
            , ('C_AT_TUIProductKey') : C_AT_TUIProductKey, ('C_AT_AssemblyAttribute') : C_AT_AssemblyAttribute, ('C_AT_BestBeforeDateIndicator') : C_AT_BestBeforeDateIndicator
            , ('C_AT_BetterCottonInitiative') : C_AT_BetterCottonInitiative, ('C_AT_Character') : C_AT_Character, ('C_AT_Colour') : C_AT_Colour
            , ('C_AT_ColourFamily') : C_AT_ColourFamily, ('C_AT_ForestStewardshipCouncil') : C_AT_ForestStewardshipCouncil
            , ('C_AT_Gender') : C_AT_Gender, ('C_AT_License') : C_AT_License, ('C_AT_ReducetoSellIndicator') : C_AT_ReducetoSellIndicator
            , ('C_AT_Season') : C_AT_Season, ('C_AT_ShelfLife') : C_AT_ShelfLife, ('C_AT_Size') : C_AT_Size, ('C_AT_SchooltexProductType') : C_AT_SchooltexProductType
            , ('C_AT_FabricContent') : C_AT_FabricContent, ('C_AT_LegalAgeRestriction') : C_AT_LegalAgeRestriction, ('C_AT_GSTExempt') : C_AT_GSTExempt
            , ('C_AT_SafetyCheck') : C_AT_SafetyCheck, ('C_AT_ArtistorAuthor') : C_AT_ArtistorAuthor, ('C_AT_BookGenre') : C_AT_BookGenre
            , ('C_AT_MultimediaPackSize') : C_AT_MultimediaPackSize, ('C_AT_NewRelease') : C_AT_NewRelease, ('C_AT_NewReleaseExpiryDate') : C_AT_NewReleaseExpiryDate
            , ('C_AT_CalculatorType') : C_AT_CalculatorType, ('C_AT_DVDGenre') : C_AT_DVDGenre, ('C_AT_GameGenre') : C_AT_GameGenre
            , ('C_AT_GamingSoftwareType') : C_AT_GamingSoftwareType, ('C_AT_HeadphoneType') : C_AT_HeadphoneType, ('C_AT_HPSureSupplySKUCode') : C_AT_HPSureSupplySKUCode
            , ('C_AT_iPhoneModel') : C_AT_iPhoneModel, ('C_AT_MusicGenre') : C_AT_MusicGenre, ('C_AT_PrinterType') : C_AT_PrinterType
            , ('C_DC_BarcodeType') : C_DC_BarcodeType, ('C_AT_ProductBarcode') : C_AT_ProductBarcode, ('C_AT_BarcodeType') : C_AT_BarcodeType
            , ('C_AT_ProductBarcodeNumber') : C_AT_ProductBarcodeNumber, ('C_AT_BarcodeFormat') : C_AT_BarcodeFormat]))

def requestlist = [('C_Name') : C_Name]

println(C_Name)

Thread.sleep(22000)

ResponseObject resp = WS.sendRequest(findTestObject('COMPOSITE_ITEM/UPLOAD AND INVOKE/02_Request_Search/Composite_Item_Search_Request_TC02', 
        requestlist))

String bodyContent = resp.getResponseBodyContent()

JsonSlurper Js = new JsonSlurper()

if (bodyContent && !(bodyContent.empty)) {
    println(bodyContent)

    def ls = Js.parseText(bodyContent)

    println(ls[0])

    println((ls[0])['id'])

    VariableCollections.map.put('searchID', (ls[0])['id'])
}

def searchID = VariableCollections.map.get('searchID')

Thread.sleep(12000)

ResponseObject rs = WS.sendRequest(findTestObject('COMPOSITE_ITEM/UPLOAD AND INVOKE/03_Get/Composite_Item_Get_TC03', [('search') : searchID]))

def results = rs.getResponseText()

VariableCollections.map.put('resultsres', results)

Thread.sleep(12000)

def objectx = Js.parseText(results)

println(objectx['name'])

//************************ >>> WSL<<********************************************************************
WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_ClickAndCollectFlag.value.valueId', C_WSL_AT_ClickAndCollectFlag, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_FeaturesAndBenefits.value.value', C_WSL_AT_FeaturesAndBenefits, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliveryMaximumDays.value.value', 
    C_WSL_AT_OnlineDeliveryMaximumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliveryMinimumDays.value.value', 
    C_WSL_AT_OnlineDeliveryMinimumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliverySizeDefault.value.valueId', 
    C_WSL_AT_OnlineDeliverySizeDefault, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliverySizeOverride.value.valueId', 
    C_WSL_AT_OnlineDeliverySizeOverride, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_ProductDescriptionWebstore.value.value', 
    C_WSL_AT_ProductDescriptionWebstore, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_SoldOnlineIndicator.value.valueId', C_WSL_AT_SoldOnlineIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebClearanceIndicator.value.valueId', 
    C_WSL_AT_WebClearanceIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebEffectiveDate.value.value', C_WSL_AT_WebEffectiveDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebEnabled.value.valueId', C_WSL_AT_WebEnabled, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebExpiryDate.value.value', C_WSL_AT_WebExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebItemSku.value.value', C_WSL_AT_WebItemSku, 
    FailureHandling.CONTINUE_ON_FAILURE)

//************************ >>> TWL <<<********************************************************************
WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_ClickAndCollectFlag.value.valueId', C_TWL_AT_ClickAndCollectFlag, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_FeaturesAndBenefits.value.value', C_TWL_AT_FeaturesAndBenefits, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliveryMaximumDays.value.value', 
    C_TWL_AT_OnlineDeliveryMaximumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliveryMinimumDays.value.value', 
    C_TWL_AT_OnlineDeliveryMinimumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliverySizeDefault.value.valueId', 
    C_TWL_AT_OnlineDeliverySizeDefault, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliverySizeOverride.value.valueId', 
    C_TWL_AT_OnlineDeliverySizeOverride, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_ProductDescriptionWebstore.value.value', 
    C_TWL_AT_ProductDescriptionWebstore, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_SoldOnlineIndicator.value.valueId', C_TWL_AT_SoldOnlineIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebClearanceIndicator.value.valueId', 
    C_TWL_AT_WebClearanceIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebEffectiveDate.value.value', C_TWL_AT_WebEffectiveDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebEnabled.value.valueId', C_TWL_AT_WebEnabled, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebExpiryDate.value.value', C_TWL_AT_WebExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebItemSku.value.value', C_TWL_AT_WebItemSku, 
    FailureHandling.CONTINUE_ON_FAILURE)

//************************ >>>> OTHER ATTRIBUTES <<<<<*******************************************************************************
WS.verifyElementPropertyValue(rs, 'values.CompositeProduct_To_Product.value.valueId', CompositeProduct_To_Product, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DangerousGoodsTransportIndicator.value.valueId', C_AT_DangerousGoodsTransportIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HighRiskIndicator.value.valueId', C_AT_HighRiskIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreEndDate.value.value', C_AT_InStoreEndDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreStartDate.value.value', C_AT_InStoreStartDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PackagingFormat.value.valueId', C_AT_PackagingFormat, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ParallelImportCode.value.valueId', C_AT_ParallelImportCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PreOrderAvailable.value.value', C_AT_PreOrderAvailable, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductImageURLIndicator.value.valueId', C_AT_ProductImageURLIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductName.value.value', C_AT_ProductName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductShortName.value.value', C_AT_ProductShortName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductStatus.value.valueId', C_AT_ProductStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RecallStatus.value.valueId', C_AT_RecallStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductDepth.value.value', C_AT_ShippingProductDepth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductHeight.value.value', C_AT_ShippingProductHeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductVolume.value.value', C_AT_ShippingProductVolume, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWeight.value.value', C_AT_ShippingProductWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWidth.value.value', C_AT_ShippingProductWidth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SupplierCode.value.value', C_AT_SupplierCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIItemKey.value.value', C_AT_TUIItemKey, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIProductKey.value.value', C_AT_TUIProductKey, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_AssemblyAttribute.values[0].valueId', C_AT_AssemblyAttribute, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BestBeforeDateIndicator.value.valueId', C_AT_BestBeforeDateIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BetterCottonInitiative.value.valueId', C_AT_BetterCottonInitiative, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Character.values[0].valueId', C_AT_Character, FailureHandling.CONTINUE_ON_FAILURE)

C_AT_Colour != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Colour.value.valueId', C_AT_Colour, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ColourFamily != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ColourFamily.value.valueId', C_AT_ColourFamily, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ForestStewardshipCouncil != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ForestStewardshipCouncil.value.valueId', 
    C_AT_ForestStewardshipCouncil, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_Gender != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Gender.value.valueId', C_AT_Gender, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_License != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_License.values[0].valueId', C_AT_License, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ReducetoSellIndicator != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ReducetoSellIndicator.value.valueId', C_AT_ReducetoSellIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_Season != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Season.value.valueId', C_AT_Season, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ShelfLife != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ShelfLife.value.value', C_AT_ShelfLife, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_Size != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Size.values[0].valueId', C_AT_Size, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_SchooltexProductType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_SchooltexProductType.value.valueId', C_AT_SchooltexProductType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_FabricContent != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_FabricContent.values[0].value', C_AT_FabricContent, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_LegalAgeRestriction != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_LegalAgeRestriction.value.valueId', C_AT_LegalAgeRestriction, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_GSTExempt != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GSTExempt.value.valueId', C_AT_GSTExempt, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_SafetyCheck != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_SafetyCheck.value.valueId', C_AT_SafetyCheck, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ArtistorAuthor != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ArtistorAuthor.value.value', C_AT_ArtistorAuthor, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_BookGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_BookGenre.value.valueId', C_AT_BookGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_MultimediaPackSize != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_MultimediaPackSize.value.value', C_AT_MultimediaPackSize, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_NewRelease != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_NewRelease.value.value', C_AT_NewRelease, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_NewReleaseExpiryDate != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_NewReleaseExpiryDate.value.value', C_AT_NewReleaseExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_CalculatorType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_CalculatorType.value.valueId', C_AT_CalculatorType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_DVDGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_DVDGenre.value.valueId', C_AT_DVDGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_GameGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GameGenre.value.valueId', C_AT_GameGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

C_GamingSoftwareType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GamingSoftwareType.value.valueId', C_GamingSoftwareType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_HeadphoneType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_HeadphoneType.values[0].valueId', C_AT_HeadphoneType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_HPSureSupplySKUCode != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_HPSureSupplySKUCode.value.valueId', C_AT_HPSureSupplySKUCode, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_iPhoneModel != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_iPhoneModel.value.value', C_AT_iPhoneModel, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_MusicGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_MusicGenre.value.valueId', C_AT_MusicGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_OperatingSystem != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_OperatingSystem.value.valueId', C_AT_OperatingSystem, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PrinterType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PrinterType.values[0].valueId', C_AT_PrinterType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ProductBarcode != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcode.value.value', C_AT_ProductBarcode, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_BarcodeType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_BarcodeType.value.value', C_AT_BarcodeType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ProductBarcodeNumber != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcodeNumber.value.value', C_AT_ProductBarcodeNumber, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_DC_BarcodeType != '' ? WS.verifyElementPropertyValue(rs, 'values.DC_BarcodeType.value.valueId', C_DC_BarcodeType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_DC_BarcodeFormat != '' ? WS.verifyElementPropertyValue(rs, 'values.C_AT_BarcodeFormat.value.valueId', C_DC_BarcodeFormat, 
    FailureHandling.CONTINUE_ON_FAILURE) : null


