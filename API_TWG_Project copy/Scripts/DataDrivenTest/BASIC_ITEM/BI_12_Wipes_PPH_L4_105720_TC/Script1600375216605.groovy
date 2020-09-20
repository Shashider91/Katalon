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
import org.junit.After as After
import groovy.json.JsonOutput as JsonOutput

WS.sendRequest(findTestObject('BABY CATEGORY/BASIC_ITEM/01_Request_POST/BI_12_Wipes_PPH_L4_105720_TC01', [('B_Name') : B_Name
            , ('B_ParentID') : B_ParentID, ('B_WSL_AT_ProductDescriptionWebstore') : B_WSL_AT_ProductDescriptionWebstore
            , ('B_WSL_AT_OnlineDeliveryMinimumDays') : B_WSL_AT_OnlineDeliveryMinimumDays, ('B_WSL_AT_SoldOnlineIndicator') : B_WSL_AT_SoldOnlineIndicator
            , ('B_WSL_AT_OnlineDeliveryMaximumDays') : B_WSL_AT_OnlineDeliveryMaximumDays, ('B_WSL_AT_WebEnabled') : B_WSL_AT_WebEnabled
            , ('B_WSL_AT_OnlineDeliverySizeOverride') : B_WSL_AT_OnlineDeliverySizeOverride, ('B_WSL_AT_OnlineDeliverySizeDefault') : B_WSL_AT_OnlineDeliverySizeDefault
            , ('B_WSL_AT_WebItemSku') : B_WSL_AT_WebItemSku, ('B_WSL_AT_WebExpiryDate') : B_WSL_AT_WebExpiryDate, ('B_WSL_AT_FeaturesAndBenefits') : B_WSL_AT_FeaturesAndBenefits
            , ('B_WSL_AT_ClickAndCollectFlag') : B_WSL_AT_ClickAndCollectFlag, ('B_WSL_AT_WebClearanceIndicator') : B_WSL_AT_WebClearanceIndicator
            , ('B_WSL_AT_WebEffectiveDate') : B_WSL_AT_WebEffectiveDate, ('B_TWL_AT_ProductDescriptionWebstore') : B_TWL_AT_ProductDescriptionWebstore
            , ('B_TWL_AT_OnlineDeliveryMinimumDays') : B_TWL_AT_OnlineDeliveryMinimumDays, ('B_TWL_AT_SoldOnlineIndicator') : B_TWL_AT_SoldOnlineIndicator
            , ('B_TWL_AT_OnlineDeliveryMaximumDays') : B_TWL_AT_OnlineDeliveryMaximumDays, ('B_TWL_AT_WebEnabled') : B_TWL_AT_WebEnabled
            , ('B_TWL_AT_OnlineDeliverySizeOverride') : B_TWL_AT_OnlineDeliverySizeOverride, ('B_TWL_AT_OnlineDeliverySizeDefault') : B_TWL_AT_OnlineDeliverySizeDefault
            , ('B_TWL_AT_WebItemSku') : B_TWL_AT_WebItemSku, ('B_TWL_AT_WebExpiryDate') : B_TWL_AT_WebExpiryDate, ('B_TWL_AT_FeaturesAndBenefits') : B_TWL_AT_FeaturesAndBenefits
            , ('B_TWL_AT_ClickAndCollectFlag') : B_TWL_AT_ClickAndCollectFlag, ('B_TWL_AT_WebClearanceIndicator') : B_TWL_AT_WebClearanceIndicator
            , ('B_TWL_AT_WebEffectiveDate') : B_TWL_AT_WebEffectiveDate, ('B_AT_ProductName') : B_AT_ProductName, ('B_AT_ProductShortName') : B_AT_ProductShortName
            , ('B_AT_DangerousGoodsTransportIndicator') : B_AT_DangerousGoodsTransportIndicator, ('B_AT_InStoreEndDate') : B_AT_InStoreEndDate
            , ('B_AT_InStoreStartDate') : B_AT_InStoreStartDate, ('B_AT_ParallelImportCode') : B_AT_ParallelImportCode, ('B_AT_PreOrderAvailable') : B_AT_PreOrderAvailable
            , ('B_AT_ProductImageURLIndicator') : B_AT_ProductImageURLIndicator, ('B_AT_SupplierCode') : B_AT_SupplierCode
            , ('B_AT_HighRiskIndicator') : B_AT_HighRiskIndicator, ('B_AT_PackagingFormat') : B_AT_PackagingFormat, ('B_AT_RecallStatus') : B_AT_RecallStatus
            , ('B_AT_ProductStatus') : B_AT_ProductStatus, ('B_AT_ShippingProductDepth') : B_AT_ShippingProductDepth, ('B_AT_ShippingProductHeight') : B_AT_ShippingProductHeight
            , ('B_AT_ShippingProductVolume') : B_AT_ShippingProductVolume, ('B_AT_ShippingProductWeight') : B_AT_ShippingProductWeight
            , ('B_AT_ShippingProductWidth') : B_AT_ShippingProductWidth, ('B_AT_TUIProductKey') : B_AT_TUIProductKey, ('B_AT_TUIItemKey') : B_AT_TUIItemKey
            , ('B_AT_Character') : B_AT_Character, ('B_AT_License') : B_AT_License, ('B_AT_Size') : B_AT_Size, ('B_DC_BarcodeType') : B_DC_BarcodeType
            , ('B_AT_ProductBarcode') : B_AT_ProductBarcode, ('B_AT_BarcodeType') : B_AT_BarcodeType, ('B_AT_ProductBarcodeNumber') : B_AT_ProductBarcodeNumber
            , ('B_AT_BarcodeFormat') : B_AT_BarcodeFormat]))

def requestlist = [('B_Name') : B_Name]

println(B_Name)

Thread.sleep(30000)

ResponseObject resp = WS.sendRequest(findTestObject('BASIC_ITEM/UPLOAD AND INVOKE/02_Request_Search/Basic_Item_Search_Request_TC02', 
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

Thread.sleep(18000)

ResponseObject rs = WS.sendRequest(findTestObject('BASIC_ITEM/UPLOAD AND INVOKE/03_Get/Basic_Item_Get_TC03', [('search') : searchID]))

def results = rs.getResponseText()

VariableCollections.map.put('resultsres', results)

def objectx = Js.parseText(results)

println(objectx['name'])

//************************>>>>>>>>>>> WSLOnlineDetails <<<<<<<<<<<<<<<<************************
WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_ClickAndCollectFlag.value.valueId', B_WSL_AT_ClickAndCollectFlag, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_FeaturesAndBenefits.value.value', B_WSL_AT_FeaturesAndBenefits, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliveryMaximumDays.value.value', 
    B_WSL_AT_OnlineDeliveryMaximumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliveryMinimumDays.value.value', 
    B_WSL_AT_OnlineDeliveryMinimumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliverySizeDefault.value.valueId', 
    B_WSL_AT_OnlineDeliverySizeDefault, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliverySizeOverride.value.valueId', 
    B_WSL_AT_OnlineDeliverySizeOverride, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_ProductDescriptionWebstore.value.value', 
    B_WSL_AT_ProductDescriptionWebstore, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_SoldOnlineIndicator.value.valueId', B_WSL_AT_SoldOnlineIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebClearanceIndicator.value.valueId', 
    B_WSL_AT_WebClearanceIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebEffectiveDate.value.value', B_WSL_AT_WebEffectiveDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebEnabled.value.valueId', B_WSL_AT_WebEnabled, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebExpiryDate.value.value', B_WSL_AT_WebExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebItemSku.value.value', B_WSL_AT_WebItemSku, 
    FailureHandling.CONTINUE_ON_FAILURE)

//**********************************>>>>>>>>>>>  TWLOnlineDetails  <<<<<<<<<<<<*************************************
WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_ClickAndCollectFlag.value.valueId', B_TWL_AT_ClickAndCollectFlag, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_FeaturesAndBenefits.value.value', B_TWL_AT_FeaturesAndBenefits, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliveryMaximumDays.value.value', 
    B_TWL_AT_OnlineDeliveryMaximumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliveryMinimumDays.value.value', 
    B_TWL_AT_OnlineDeliveryMinimumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliverySizeDefault.value.valueId', 
    B_TWL_AT_OnlineDeliverySizeDefault, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliverySizeOverride.value.valueId', 
    B_TWL_AT_OnlineDeliverySizeOverride, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_ProductDescriptionWebstore.value.value', 
    B_TWL_AT_ProductDescriptionWebstore, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_SoldOnlineIndicator.value.valueId', B_TWL_AT_SoldOnlineIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebClearanceIndicator.value.valueId', 
    B_TWL_AT_WebClearanceIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebEffectiveDate.value.value', B_TWL_AT_WebEffectiveDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebEnabled.value.valueId', B_TWL_AT_WebEnabled, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebExpiryDate.value.value', B_TWL_AT_WebExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebItemSku.value.value', B_TWL_AT_WebItemSku, 
    FailureHandling.CONTINUE_ON_FAILURE)

//*************************************>>>>>>>>>>>>>>>    CoreAttributes <<<<<<<<<<<<<<***********************
WS.verifyElementPropertyValue(rs, 'values.AT_ProductName.value.value', B_AT_ProductName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductShortName.value.value', B_AT_ProductShortName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DangerousGoodsTransportIndicator.value.valueId', B_AT_DangerousGoodsTransportIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreEndDate.value.value', B_AT_InStoreEndDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreStartDate.value.value', B_AT_InStoreStartDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ParallelImportCode.value.valueId', B_AT_ParallelImportCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PreOrderAvailable.value.valueId', B_AT_PreOrderAvailable, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductImageURLIndicator.value.valueId', B_AT_ProductImageURLIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SupplierCode.value.value', B_AT_SupplierCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HighRiskIndicator.value.valueId', B_AT_HighRiskIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PackagingFormat.value.valueId', B_AT_PackagingFormat, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RecallStatus.value.valueId', B_AT_RecallStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductStatus.value.value', B_AT_ProductStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductDepth.value.value', B_AT_ShippingProductDepth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductHeight.value.value', B_AT_ShippingProductHeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductVolume.value.value', B_AT_ShippingProductVolume, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWeight.value.value', B_AT_ShippingProductWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWidth.value.value', B_AT_ShippingProductWidth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIProductKey.value.value', B_AT_TUIProductKey, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIItemKey.value.value', B_AT_TUIItemKey, FailureHandling.CONTINUE_ON_FAILURE)

// ******************** >>>>>>>>>>>>   TUIAttributes <<<<<<<<<<<<****************************
WS.verifyElementPropertyValue(rs, 'values.AT_Character.values[0].valueId', B_AT_Character, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_License.values[0].valueId', B_AT_License, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Size.values[0].valueId', B_AT_Size, FailureHandling.CONTINUE_ON_FAILURE)

//B_AT_SchooltexProductType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_SchooltexProductType.value.valueId', B_AT_SchooltexProductType, FailureHandling.CONTINUE_ON_FAILURE) : null
//*****************>>>>>>>>>>>>>>Barcode<<<<<<<<<<<<****************
WS.verifyElementPropertyValue(rs, 'values.DC_BarcodeType.values.value', B_DC_BarcodeType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcode.value.value', B_AT_ProductBarcode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BarcodeType.value.valueId', B_AT_BarcodeType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcodeNumber.value.value', B_AT_ProductBarcodeNumber, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BarcodeFormat.value.valueId', B_AT_BarcodeFormat, FailureHandling.CONTINUE_ON_FAILURE)

