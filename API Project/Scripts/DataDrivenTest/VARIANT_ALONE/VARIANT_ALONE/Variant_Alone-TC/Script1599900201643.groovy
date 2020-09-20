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

WS.sendRequest(findTestObject('VARIANT_ALONE/VARIANT_ALONE/UPLOAD AND INVOKE/01_Request_POST/Vairant_Alone_Request_TC01', 
        [('VA_Name') : VA_Name, ('VA_KEY_Master') : VA_KEY_Master, ('MV_WSL_AT_ProductDescriptionWebstore') : MV_WSL_AT_ProductDescriptionWebstore
            , ('MV_WSL_AT_OnlineDeliveryMinimumDays') : MV_WSL_AT_OnlineDeliveryMinimumDays, ('MV_WSL_AT_SoldOnlineIndicator') : MV_WSL_AT_SoldOnlineIndicator
            , ('MV_WSL_AT_OnlineDeliveryMaximumDays') : MV_WSL_AT_OnlineDeliveryMaximumDays, ('MV_WSL_AT_WebEnabled') : MV_WSL_AT_WebEnabled
            , ('MV_WSL_AT_OnlineDeliverySizeOverride') : MV_WSL_AT_OnlineDeliverySizeOverride, ('MV_WSL_AT_OnlineDeliverySizeDefault') : MV_WSL_AT_OnlineDeliverySizeDefault
            , ('MV_WSL_AT_WebItemSku') : MV_WSL_AT_WebItemSku, ('MV_WSL_AT_WebExpiryDate') : MV_WSL_AT_WebExpiryDate, ('MV_WSL_AT_FeaturesAndBenefits') : MV_WSL_AT_FeaturesAndBenefits
            , ('MV_WSL_AT_ClickAndCollectFlag') : MV_WSL_AT_ClickAndCollectFlag, ('MV_WSL_AT_WebClearanceIndicator') : MV_WSL_AT_WebClearanceIndicator
            , ('MV_WSL_AT_WebEffectiveDate') : MV_WSL_AT_WebEffectiveDate, ('MV_TWL_AT_ProductDescriptionWebstore') : MV_TWL_AT_ProductDescriptionWebstore
            , ('MV_TWL_AT_OnlineDeliveryMinimumDays') : MV_TWL_AT_OnlineDeliveryMinimumDays, ('MV_TWL_AT_SoldOnlineIndicator') : MV_TWL_AT_SoldOnlineIndicator
            , ('MV_TWL_AT_OnlineDeliveryMaximumDays') : MV_TWL_AT_OnlineDeliveryMaximumDays, ('MV_TWL_AT_WebEnabled') : MV_TWL_AT_WebEnabled
            , ('MV_TWL_AT_OnlineDeliverySizeOverride') : MV_TWL_AT_OnlineDeliverySizeOverride, ('MV_TWL_AT_OnlineDeliverySizeDefault') : MV_TWL_AT_OnlineDeliverySizeDefault
            , ('MV_TWL_AT_WebItemSku') : MV_TWL_AT_WebItemSku, ('MV_TWL_AT_WebExpiryDate') : MV_TWL_AT_WebExpiryDate, ('MV_TWL_AT_FeaturesAndBenefits') : MV_TWL_AT_FeaturesAndBenefits
            , ('MV_TWL_AT_ClickAndCollectFlag') : MV_TWL_AT_ClickAndCollectFlag, ('MV_TWL_AT_WebClearanceIndicator') : MV_TWL_AT_WebClearanceIndicator
            , ('MV_TWL_AT_WebEffectiveDate') : MV_TWL_AT_WebEffectiveDate, ('MVA_AT_ProductName') : MVA_AT_ProductName, ('MVA_AT_ProductShortName') : MVA_AT_ProductShortName
            , ('MVA_AT_DangerousGoodsTransportIndicator') : MVA_AT_DangerousGoodsTransportIndicator, ('MVA_AT_InStoreEndDate') : MVA_AT_InStoreEndDate
            , ('MVA_AT_InStoreStartDate') : MVA_AT_InStoreStartDate, ('MVA_AT_ProductImageURLIndicator') : MVA_AT_ProductImageURLIndicator
            , ('MVA_AT_SupplierCode') : MVA_AT_SupplierCode, ('MVA_AT_HighRiskIndicator') : MVA_AT_HighRiskIndicator, ('MVA_AT_PackagingFormat') : MVA_AT_PackagingFormat
            , ('MVA_AT_RecallStatus') : MVA_AT_RecallStatus, ('MVA_AT_ProductStatus') : MVA_AT_ProductStatus, ('MVA_AT_ShippingProductDepth') : MVA_AT_ShippingProductDepth
            , ('MVA_AT_ShippingProductHeight') : MVA_AT_ShippingProductHeight, ('MVA_AT_ShippingProductVolume') : MVA_AT_ShippingProductVolume
            , ('MVA_AT_ShippingProductWeight') : MVA_AT_ShippingProductWeight, ('MVA_AT_ShippingProductWidth') : MVA_AT_ShippingProductWidth
            , ('MVA_AT_TUIProductKey') : MVA_AT_TUIProductKey, ('MVA_AT_AssetImageURL') : MVA_AT_AssetImageURL, ('MVA_AT_Character') : MVA_AT_Character
            , ('MVA_AT_Colour') : MVA_AT_Colour, ('MVA_AT_ColourFamily') : MVA_AT_ColourFamily, ('MVA_AT_License') : MVA_AT_License
            , ('MVA_AT_Size') : MVA_AT_Size, ('MVA_AT_SchooltexProductType') : MVA_AT_SchooltexProductType, ('MVA_AT_FabricContent') : MVA_AT_FabricContent
            , ('MVA_AT_HeadphoneType') : MVA_AT_HeadphoneType, ('MVA_AT_BedSize') : MVA_AT_BedSize, ('MVA_AT_ChristmasDecorationType') : MVA_AT_ChristmasDecorationType
            , ('MVA_AT_ChristmasDesign') : MVA_AT_ChristmasDesign, ('MVA_AT_ChristmasProduct') : MVA_AT_ChristmasProduct
            , ('MVA_AT_ProductDepth') : MVA_AT_ProductDepth, ('MVA_AT_ProductDiameter') : MVA_AT_ProductDiameter, ('MVA_AT_ProductHeight') : MVA_AT_ProductHeight
            , ('MVA_AT_ProductVolume') : MVA_AT_ProductVolume, ('MVA_AT_ProductWeight') : MVA_AT_ProductWeight, ('MVA_AT_ProductWidth') : MVA_AT_ProductWidth
            , ('MVA_AT_ProductLength') : MVA_AT_ProductLength, ('MVA_AT_ProductType') : MVA_AT_ProductType, ('MVA_AT_DeliveryDate') : MVA_AT_DeliveryDate
            , ('MVA_AT_DeliveryLocation') : MVA_AT_DeliveryLocation, ('MVA_AT_HalloweenProduct') : MVA_AT_HalloweenProduct
            , ('MVA_AT_PetType') : MVA_AT_PetType, ('MVA_AT_HomeFragrance') : MVA_AT_HomeFragrance, ('MVA_AT_PrintIndicator') : MVA_AT_PrintIndicator
            , ('MVA_AT_PrintorPattern') : MVA_AT_PrintorPattern, ('MVA_AT_RugType') : MVA_AT_RugType, ('MVA_AT_TowelType') : MVA_AT_TowelType
            , ('MVA_AT_PaperorCardType') : MVA_AT_PaperorCardType, ('MVA_AT_PaperSize') : MVA_AT_PaperSize, ('MVA_AT_PaperWeight') : MVA_AT_PaperWeight
            , ('MVA_AT_RollType') : MVA_AT_RollType, ('MVA_AT_ActivityUse') : MVA_AT_ActivityUse, ('MVA_AT_CableConnections') : MVA_AT_CableConnections
            , ('MVA_AT_InkandTonerColours') : MVA_AT_InkandTonerColours, ('MVA_AT_TelcoNetwork') : MVA_AT_TelcoNetwork, ('MVA_AT_Age') : MVA_AT_Age
            , ('VA_DC_BarcodeType') : VA_DC_BarcodeType, ('VA_AT_ProductBarcode') : VA_AT_ProductBarcode, ('VA_AT_BarcodeType') : VA_AT_BarcodeType
            , ('VA_AT_ProductBarcodeNumber') : VA_AT_ProductBarcodeNumber, ('VA_AT_BarcodeFormat') : VA_AT_BarcodeFormat]))

def requestlist = [('MV_Name') : MV_Name]

println(MV_Name)

Thread.sleep(25000)

ResponseObject resp = WS.sendRequest(findTestObject('VARIANT_ALONE/VARIANT_ALONE/UPLOAD AND INVOKE/02_Request_Search/Variant_Alone_Search_Request_TC02'))

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

Thread.sleep(15000)

ResponseObject rs = WS.sendRequest(findTestObject('VARIANT_ALONE/VARIANT_ALONE/UPLOAD AND INVOKE/03_Get/Variant_Alone_Get_TC03', 
        [('search') : searchID]))

def results = rs.getResponseText()

VariableCollections.map.put('resultsres', results)

def objectx = Js.parseText(results)

println(objectx['name'])

//************************>>>>>>>>>>> WSLOnlineDetails <<<<<<<<<<<<<<<<************************
WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_ClickAndCollectFlag.value.valueId', VA_WSL_AT_ClickAndCollectFlag, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_FeaturesAndBenefits.value.value', VA_WSL_AT_FeaturesAndBenefits, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliveryMaximumDays.value.value', 
    VA_WSL_AT_OnlineDeliveryMaximumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliveryMinimumDays.value.value', 
    VA_WSL_AT_OnlineDeliveryMinimumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliverySizeDefault.value.valueId', 
    VA_WSL_AT_OnlineDeliverySizeDefault, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliverySizeOverride.value.valueId', 
    VA_WSL_AT_OnlineDeliverySizeOverride, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_ProductDescriptionWebstore.value.value', 
    VA_WSL_AT_ProductDescriptionWebstore, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_SoldOnlineIndicator.value.valueId', VA_WSL_AT_SoldOnlineIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebClearanceIndicator.value.valueId', 
    VA_WSL_AT_WebClearanceIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebEffectiveDate.value.value', VA_WSL_AT_WebEffectiveDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebEnabled.value.valueId', VA_WSL_AT_WebEnabled, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebExpiryDate.value.value', VA_WSL_AT_WebExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebItemSku.value.value', VA_WSL_AT_WebItemSku, 
    FailureHandling.CONTINUE_ON_FAILURE)

//**********************************>>>>>>>>>>>  TWLOnlineDetails  <<<<<<<<<<<<*************************************
WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_ClickAndCollectFlag.value.valueId', VA_TWL_AT_ClickAndCollectFlag, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_FeaturesAndBenefits.value.value', VA_TWL_AT_FeaturesAndBenefits, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliveryMaximumDays.value.value', 
    VA_TWL_AT_OnlineDeliveryMaximumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliveryMinimumDays.value.value', 
    VA_TWL_AT_OnlineDeliveryMinimumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliverySizeDefault.value.valueId', 
    VA_TWL_AT_OnlineDeliverySizeDefault, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliverySizeOverride.value.valueId', 
    VA_TWL_AT_OnlineDeliverySizeOverride, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_ProductDescriptionWebstore.value.value', 
    VA_TWL_AT_ProductDescriptionWebstore, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_SoldOnlineIndicator.value.valueId', VA_TWL_AT_SoldOnlineIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebClearanceIndicator.value.valueId', 
    VA_TWL_AT_WebClearanceIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebEffectiveDate.value.value', VA_TWL_AT_WebEffectiveDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebEnabled.value.valueId', VA_TWL_AT_WebEnabled, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebExpiryDate.value.value', VA_TWL_AT_WebExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebItemSku.value.value', VA_TWL_AT_WebItemSku, 
    FailureHandling.CONTINUE_ON_FAILURE)

//*****************>>>>>>>>>>>>>> Variant Alone (Core Attributes ) <<<<<<<<<<<<***********************************
WS.verifyElementPropertyValue(rs, 'values.AT_ProductName.value.valueId', VA_AT_ProductName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductShortName.value.valueId', VA_AT_ProductShortName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DangerousGoodsTransportIndicator.value.valueId', VA_AT_DangerousGoodsTransportIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreEndDate.value.value', VA_AT_InStoreEndDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreStartDate.value.value', VA_AT_InStoreStartDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductImageURLIndicator.value.valueId', VA_AT_ProductImageURLIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SupplierCode.value.value', VA_AT_SupplierCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HighRiskIndicator.value.valueId', VA_AT_HighRiskIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PackagingFormat.value.valueId', VA_AT_PackagingFormat, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RecallStatus.value.valueId', VA_AT_RecallStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductStatus.value.valueId', VA_AT_ProductStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductDepth.value.value', VA_AT_ShippingProductDepth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductHeight.value.value', VA_AT_ShippingProductHeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductVolume.value.value', VA_AT_ShippingProductVolume, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWeight.value.value', VA_AT_ShippingProductWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWidth.value.value', VA_AT_ShippingProductWidth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIProductKey.value.value', VA_AT_TUIProductKey, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_AssetImageURL.value.value', VA_AT_AssetImageURL, FailureHandling.CONTINUE_ON_FAILURE)

//*****************>>>>>>>>>>>>>> Master and Variant ( Category Attributes ) <<<<<<<<<<<<***********************************
WS.verifyElementPropertyValue(rs, 'values.AT_Character.values[0].valueId', VA_AT_Character, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Colour.value.valueId', VA_AT_Colour, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ColourFamily.value.valueId', VA_AT_ColourFamily, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_License.values[0].valueId', VA_AT_License, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Size.values[0].valueId', VA_AT_Size, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SchooltexProductType.value.valueId', VA_AT_SchooltexProductType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_FabricContent.values[0].value', VA_AT_FabricContent, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HeadphoneType.values[0].valueId', VA_AT_HeadphoneType, FailureHandling.CONTINUE_ON_FAILURE)

//*****************>>>>>>>>>>>>>> Master and Variant ( PIM Attributes ) <<<<<<<<<<<<***********************************
WS.verifyElementPropertyValue(rs, 'values.AT_BedSize.values[0].valueId', VA_AT_BedSize, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasDecorationType.values[0].valueId', VA_AT_ChristmasDecorationType, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasDesign.values[0].valueId', VA_AT_ChristmasDesign, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasProduct.values[0].valueId', VA_AT_ChristmasProduct, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductDepth.values[0].valueId', VA_AT_ProductDepth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductDiameter.values[0].valueId', VA_AT_ProductDiameter, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductHeight.values[0].valueId', VA_AT_ProductHeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductLength.values[0].valueId', VA_AT_ProductLength, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductType.values[0].valueId', VA_AT_ProductType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductVolume.values[0].valueId', VA_AT_ProductVolume, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductWeight.values[0].valueId', VA_AT_ProductWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductWidth.values[0].valueId', VA_AT_ProductWidth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DeliveryDate.values[0].valueId', VA_AT_DeliveryDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DeliveryLocation.values[0].valueId', VA_AT_DeliveryLocation, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HalloweenProduct.values[0].valueId', VA_AT_HalloweenProduct, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PetType.values[0].valueId', VA_AT_PetType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HomeFragrance.values[0].valueId', VA_AT_HomeFragrance, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PrintIndicator.values[0].valueId', VA_AT_PrintIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PrintorPattern.values[0].valueId', VA_AT_PrintorPattern, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RugType.values[0].valueId', VA_AT_RugType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TowelType.values[0].valueId', VA_AT_TowelType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PaperorCardType.values[0].valueId', VA_AT_PaperorCardType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PaperSize.values[0].valueId', VA_AT_PaperSize, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PaperWeight.values[0].valueId', VA_AT_PaperWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RollType.values[0].valueId', VA_AT_RollType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ActivityUse.values[0].valueId', VA_AT_ActivityUse, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_CableConnections.values[0].valueId', VA_AT_CableConnections, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values."AT_Ink&amp;TonerColours".values[0].valueId', 'VA_AT_InkandTonerColours', FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TelcoNetwork.values[0].valueId', VA_AT_TelcoNetwork, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Age.values[0].valueId', VA_AT_Age, FailureHandling.CONTINUE_ON_FAILURE)

//*****************>>>>>>>>>>>>>>Barcode<<<<<<<<<<<<***********************************
WS.verifyElementPropertyValue(rs, 'values.BarCode_Name.values[0].valueId', MV_BarCode_Name, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcode.value.value', VA_AT_ProductBarcode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcodeNumber.value.value', VA_AT_ProductBarcodeNumber, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BarcodeFormat.value.value', VA_AT_BarcodeFormat, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BarcodeType.value.valueId', VA_AT_BarcodeType, FailureHandling.CONTINUE_ON_FAILURE)

