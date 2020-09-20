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

WS.sendRequest(findTestObject('BASIC_ITEM/UPLOAD AND INVOKE/01_Request_POST/Basic_Item_Request_TC01', [('B_Name') : B_Name
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
            , ('B_AT_ShippingProductWidth') : B_AT_ShippingProductWidth, ('B_AT_TUIProductKey') : B_AT_TUIProductKey, ('B_AT_TUIItemKey') : B_AT_TUIProductKey
            , ('B_AT_AssetImageURL') : B_AT_AssetImageURL, ('B_AT_AssemblyAttribute') : B_AT_AssemblyAttribute, ('B_AT_BestBeforeDateIndicator') : B_AT_BestBeforeDateIndicator
            , ('B_AT_BetterCottonInitiative') : B_AT_BetterCottonInitiative, ('B_AT_Character') : B_AT_Character, ('B_AT_Colour') : B_AT_Colour
            , ('B_AT_ColourFamily') : B_AT_ColourFamily, ('B_AT_ForestStewardshipCouncil') : B_AT_ForestStewardshipCouncil
            , ('B_AT_Gender') : B_AT_Gender, ('B_AT_License') : B_AT_License, ('B_AT_ReducetoSellIndicator') : B_AT_ReducetoSellIndicator
            , ('B_AT_Season') : B_AT_Season, ('B_AT_ShelfLife') : B_AT_ShelfLife, ('B_AT_Size') : B_AT_Size, ('B_AT_SchooltexProductType') : B_AT_SchooltexProductType
            , ('B_AT_FabricContent') : B_AT_FabricContent, ('B_AT_LegalAgeRestriction') : B_AT_LegalAgeRestriction, ('B_AT_GSTExempt') : B_AT_GSTExempt
            , ('B_AT_SafetyCheck') : B_AT_SafetyCheck, ('B_AT_ArtistorAuthor') : B_AT_ArtistorAuthor, ('B_AT_BookGenre') : B_AT_BookGenre
            , ('B_AT_MultimediaPackSize') : B_AT_MultimediaPackSize, ('B_AT_NewRelease') : B_AT_NewRelease, ('B_AT_NewReleaseExpiryDate') : B_AT_NewReleaseExpiryDate
            , ('B_AT_CalculatorType') : B_AT_CalculatorType, ('B_AT_DVDGenre') : B_AT_DVDGenre, ('B_AT_GameGenre') : B_AT_GameGenre
            , ('B_AT_GamingSoftwareType') : B_AT_GamingSoftwareType, ('B_AT_HeadphoneType') : B_AT_HeadphoneType, ('B_AT_HPSureSupplySKUCode') : B_AT_HPSureSupplySKUCode
            , ('B_AT_iPhoneModel') : B_AT_iPhoneModel, ('B_AT_MusicGenre') : B_AT_MusicGenre, ('B_AT_OperatingSystem') : B_AT_OperatingSystem
            , ('B_AT_PrinterType') : B_AT_PrinterType, ('B_AT_BedSize') : B_AT_BedSize, ('B_AT_BroadSpectrumCover') : B_AT_BroadSpectrumCover
            , ('B_AT_ChristmasDecorationType') : B_AT_ChristmasDecorationType, ('B_AT_ChristmasDesign') : B_AT_ChristmasDesign
            , ('B_AT_ChristmasProduct') : B_AT_ChristmasProduct, ('B_AT_GiftOccasion') : B_AT_GiftOccasion, ('B_AT_GiftingRecipient') : B_AT_GiftingRecipient
            , ('B_AT_ProductDepth') : B_AT_ProductDepth, ('B_AT_ProductDiameter') : B_AT_ProductDiameter, ('B_AT_ProductHeight') : B_AT_ProductHeight
            , ('B_AT_ProductLength') : B_AT_ProductLength, ('B_AT_ProductType') : B_AT_ProductType, ('B_AT_ProductVolume') : B_AT_ProductVolume
            , ('B_AT_ProductWeight') : B_AT_ProductWeight, ('B_AT_ProductWidth') : B_AT_ProductWidth, ('B_AT_SunProtectionFactor') : B_AT_SunProtectionFactor
            , ('B_AT_WarrantyPeriod') : B_AT_WarrantyPeriod, ('B_AT_WaterResistantCover') : B_AT_WaterResistantCover, ('B_AT_DeliveryDate') : B_AT_DeliveryDate
            , ('B_AT_DeliveryLocation') : B_AT_DeliveryLocation, ('B_AT_HalloweenProduct') : B_AT_HalloweenProduct, ('B_AT_PetType') : B_AT_PetType
            , ('B_AT_CandleType') : B_AT_CandleType, ('B_AT_ChairType') : B_AT_ChairType, ('B_AT_CutleryType') : B_AT_CutleryType
            , ('B_AT_DeskType') : B_AT_DeskType, ('B_AT_DimensionalShape') : B_AT_DimensionalShape, ('B_AT_EnergyEfficiencyRating') : B_AT_EnergyEfficiencyRating
            , ('B_AT_Ergonomic') : B_AT_Ergonomic, ('B_AT_FillType') : B_AT_FillType, ('B_AT_FurnitureStyle') : B_AT_FillType
            , ('B_AT_HeatingorCooling') : B_AT_HeatingorCooling, ('B_AT_HomeFragrance') : B_AT_HomeFragrance, ('B_AT_Mattresstype') : B_AT_Mattresstype
            , ('B_AT_PrintIndicator') : B_AT_PrintIndicator, ('B_AT_PrintorPattern') : B_AT_PrintorPattern, ('B_AT_RugType') : B_AT_RugType
            , ('B_AT_TableandChairSettings') : B_AT_TableandChairSettings, ('B_AT_TowelType') : B_AT_TowelType, ('B_AT_Usesuitability') : B_AT_Usesuitability
            , ('B_AT_WaterEfficiencyRating') : B_AT_WaterEfficiencyRating, ('B_AT_AdditivesType') : B_AT_AdditivesType, ('B_AT_CleaningAccessoryType') : B_AT_CleaningAccessoryType
            , ('B_AT_CoverType') : B_AT_CoverType, ('B_AT_EngineOilType') : B_AT_EngineOilType, ('B_AT_GPS') : B_AT_GPS, ('B_AT_OutdoorFurnitureMaterial') : B_AT_OutdoorFurnitureMaterial
            , ('B_AT_PaperorCardType') : B_AT_PaperorCardType, ('B_AT_PaperSize') : B_AT_PaperSize, ('B_AT_PaperWeight') : B_AT_PaperWeight
            , ('B_AT_RollType') : B_AT_RollType, ('B_AT_ActivityUse') : B_AT_ActivityUse, ('B_AT_ArtPadType') : B_AT_ArtPadType
            , ('B_AT_BookCoverType') : B_AT_BookCoverType, ('B_AT_ClipType') : B_AT_ClipType, ('B_AT_EnvelopeType') : B_AT_EnvelopeType
            , ('B_AT_ExerciseBookLineType') : B_AT_ExerciseBookLineType, ('B_AT_LabelType') : B_AT_ExerciseBookLineType, ('B_AT_Material') : B_AT_Material
            , ('B_AT_PackSize') : B_AT_PackSize, ('B_AT_PaintBrushType') : B_AT_PaintBrushType, ('B_AT_PaintType') : B_AT_PaintType
            , ('B_AT_PenType') : B_AT_PenType, ('B_AT_PencilType') : B_AT_PencilType, ('B_AT_ReportCoverType') : B_AT_ReportCoverType
            , ('B_AT_RingBinderType') : B_AT_RingBinderType, ('B_AT_SchoolYear') : B_AT_SchoolYear, ('B_AT_SprialBound') : B_AT_SprialBound
            , ('B_AT_StampType') : B_AT_StampType, ('B_AT_StaplerType') : B_AT_StaplerType, ('B_AT_StationeryBookType') : B_AT_StationeryBookType
            , ('B_AT_STEAMSubject') : B_AT_STEAMSubject, ('B_AT_Subject') : B_AT_Subject, ('B_AT_TapeType') : B_AT_TapeType
            , ('B_AT_WhiteboardType') : B_AT_WhiteboardType, ('B_AT_CableConnections') : B_AT_CableConnections, ('B_AT_ConnectionPort') : B_AT_ConnectionPort
            , ('B_AT_DeviceType') : B_AT_DeviceType, ('B_AT_IMEIRequired') : B_AT_IMEIRequired, ('B_AT_InkandTonerColours') : B_AT_InkandTonerColours
            , ('B_AT_ScreenSize') : B_AT_ScreenSize, ('B_AT_ScreenType') : B_AT_ScreenType, ('B_AT_TelcoNetwork') : B_AT_TelcoNetwork
            , ('B_AT_TouchScreen') : B_AT_TouchScreen, ('B_AT_Age') : B_AT_Age, ('B_AT_ToyType') : B_AT_ToyType, ('B_BarCode_Name') : B_BarCode_Name
            , ('B_AT_ProductBarcode') : B_AT_ProductBarcode, ('B_AT_ProductBarcodeNumber') : B_AT_ProductBarcodeNumber, ('B_AT_BarcodeFormat') : B_AT_BarcodeFormat
            , ('B_AT_BarcodeType') : B_AT_BarcodeType]))

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

WS.verifyElementPropertyValue(rs, 'values.AT_AssetImageURL.value.value', B_AT_AssetImageURL, FailureHandling.CONTINUE_ON_FAILURE)

// ******************** >>>>>>>>>>>>   TUIAttributes <<<<<<<<<<<<****************************
WS.verifyElementPropertyValue(rs, 'values.AT_AssemblyAttribute.values[0].valueId', B_AT_AssemblyAttribute, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BestBeforeDateIndicator.value.valueId', B_AT_BestBeforeDateIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BetterCottonInitiative.value.valueId', B_AT_BetterCottonInitiative, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Character.values[0].valueId', B_AT_Character, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Colour.value.valueId', B_AT_Colour, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ColourFamily.value.valueId', B_AT_ColourFamily, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ForestStewardshipCouncil.value.valueId', B_AT_ForestStewardshipCouncil, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Gender.value.valueId', B_AT_Gender, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_License.values[0].valueId', B_AT_License, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ReducetoSellIndicator.value.valueId', B_AT_ReducetoSellIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Season.value.valueId', B_AT_Season, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShelfLife.value.value', B_AT_ShelfLife, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Size.values[0].valueId', B_AT_Size, FailureHandling.CONTINUE_ON_FAILURE)

B_AT_SchooltexProductType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_SchooltexProductType.value.valueId', B_AT_SchooltexProductType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_FabricContent != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_FabricContent.value.value', B_AT_FabricContent, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_LegalAgeRestriction != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_LegalAgeRestriction.values.valueId', B_AT_LegalAgeRestriction, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_GSTExempt != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GSTExempt.value.valueId', B_AT_GSTExempt, FailureHandling.CONTINUE_ON_FAILURE): null

//WS.verifyElementPropertyValue(rs, 'values.AT_SafetyCheck.value.valueId', B_AT_SafetyCheck, FailureHandling.CONTINUE_ON_FAILURE)

B_AT_ArtistorAuthor != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ArtistorAuthor.value.valueId', B_AT_ArtistorAuthor, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_BookGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_BookGenre.value.valueId', B_AT_BookGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_MultimediaPackSize != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_MultimediaPackSize.value.value', B_AT_MultimediaPackSize, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_MultimediaPackSize != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_NewRelease.values.valueId', B_AT_NewRelease, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_NewReleaseExpiryDate != ''? WS.verifyElementPropertyValue(rs, 'values.AT_NewReleaseExpiryDate.value.value', B_AT_NewReleaseExpiryDate, FailureHandling.CONTINUE_ON_FAILURE): null

B_AT_CalculatorType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_CalculatorType.values[0].valueId', B_AT_CalculatorType, FailureHandling.CONTINUE_ON_FAILURE): null

B_AT_DVDGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_DVDGenre.values.valueId', B_AT_DVDGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_GameGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GameGenre.values.valueId', B_AT_GameGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

B_GamingSoftwareType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GamingSoftwareType.values.valueId', B_GamingSoftwareType, FailureHandling.CONTINUE_ON_FAILURE): null 

B_AT_HeadphoneType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_HeadphoneType.values[0].valueId', B_AT_HeadphoneType, FailureHandling.CONTINUE_ON_FAILURE): null

B_AT_HPSureSupplySKUCode != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_HPSureSupplySKUCode.value.value', B_AT_HPSureSupplySKUCode, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_iPhoneModel != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_iPhoneModel.value.value', B_AT_iPhoneModel, FailureHandling.CONTINUE_ON_FAILURE): null

B_AT_iPhoneModel != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_MusicGenre.value.valueId', B_AT_MusicGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_OperatingSystem !='' ? WS.verifyElementPropertyValue(rs, 'values.AT_OperatingSystem.values.valueId', B_AT_OperatingSystem, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PrinterType !='' ? WS.verifyElementPropertyValue(rs, 'values.AT_PrinterType.values[0].valueId', B_AT_PrinterType, FailureHandling.CONTINUE_ON_FAILURE) : null

//********************>>>>>>>>>>>>>>>>>>> PIMAttributes <<<<<<<<<<<***************************
WS.verifyElementPropertyValue(rs, 'values.AT_BedSize.values.valueId', B_AT_BedSize, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BroadSpectrumCover.values[0].valueId', B_AT_BroadSpectrumCover, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasDecorationType.values.valueId', B_AT_ChristmasDecorationType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasDesign.values[0].valueId', B_AT_ChristmasDesign, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasProduct.values.valueId', B_AT_ChristmasProduct, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GiftOccasion.values[0].valueId', B_AT_GiftOccasion, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GiftingRecipient.values[0].valueId', B_AT_GiftingRecipient, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductDepth.value.value', B_AT_ProductDepth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductDiameter.value.value', B_AT_ProductDiameter, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductHeight.value.value', B_AT_ProductHeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductLength.value.value', B_AT_ProductLength, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductType.value.value', B_AT_ProductType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductVolume.value.value', B_AT_ProductVolume, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductWeight.value.value', B_AT_ProductWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductWidth.value.value', B_AT_ProductWidth, FailureHandling.CONTINUE_ON_FAILURE)

B_AT_SunProtectionFactor != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_SunProtectionFactor.values.valueId', B_AT_SunProtectionFactor, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_WarrantyPeriod != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_WarrantyPeriod.values.valueId', B_AT_WarrantyPeriod, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_WaterResistantCover != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_WaterResistantCover.values.valueId', B_AT_WaterResistantCover, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_DeliveryDate != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_DeliveryDate.value.value', B_AT_DeliveryDate, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_DeliveryLocation != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_DeliveryLocation.values.valueId', B_AT_DeliveryLocation, FailureHandling.CONTINUE_ON_FAILURE) : null

WS.verifyElementPropertyValue(rs, 'values.AT_HalloweenProduct.values.valueId', B_AT_HalloweenProduct, FailureHandling.CONTINUE_ON_FAILURE)

B_AT_PetType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PetType.values.valueId', B_AT_PetType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_CandleType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_CandleType.values.valueId', B_AT_CandleType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ChairType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ChairType.values.valueId', B_AT_ChairType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_CutleryType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_CutleryType.values[0].valueId', B_AT_CutleryType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_DeskType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_DeskType.values[0].valueId', B_AT_DeskType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_DimensionalShape != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_DimensionalShape.values[0].valueId', B_AT_DimensionalShape, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_EnergyEfficiencyRating != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_EnergyEfficiencyRating.values.valueId', B_AT_EnergyEfficiencyRating, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_Ergonomic != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_Ergonomic.values.valueId', B_AT_Ergonomic, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_FillType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_FillType.values[0].valueId', B_AT_FillType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_FurnitureStyle != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_FurnitureStyle.values.valueId', B_AT_FurnitureStyle, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_HeatingorCooling != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_HeatingorCooling.values.valueId', B_AT_HeatingorCooling, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_HomeFragrance != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_HomeFragrance.values[0].valueId', B_AT_HomeFragrance, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_Mattresstype != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_Mattresstype.values.valueId', B_AT_Mattresstype, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PrintIndicator != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PrintIndicator.values.valueId', B_AT_PrintIndicator, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PrintorPattern != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PrintorPattern.values[0].valueId', B_AT_PrintorPattern, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_RugType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_RugType.values.valueId', B_AT_RugType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_TableandChairSettings != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_Table&amp;ChairSettings.values[0].valueId', B_AT_TableandChairSettings, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_TowelType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_TowelType.values.valueId', B_AT_TowelType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_Usesuitability != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_Usesuitability.values[0].valueId', B_AT_Usesuitability, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_WaterEfficiencyRating != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_WaterEfficiencyRating.values.valueId', B_AT_WaterEfficiencyRating, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_AdditivesType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_AdditivesType.values.valueId', B_AT_AdditivesType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_CleaningAccessoryType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_CleaningAccessoryType.values.valueId', B_AT_CleaningAccessoryType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_CoverType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_CoverType.values.valueId', B_AT_CoverType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_EngineOilType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_EngineOil Type.values.valueId', B_AT_EngineOilType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_GPS != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_GPS.values.valueId', B_AT_GPS, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_OutdoorFurnitureMaterial != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_OutdoorFurnitureMaterial.values[0].valueId', B_AT_OutdoorFurnitureMaterial, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PaperorCardType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PaperorCardType.values.valueId', B_AT_PaperorCardType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PaperSize != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PaperSize.values.valueId', B_AT_PaperSize, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PaperWeight != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PaperWeight.values.valueId', B_AT_PaperWeight, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_RollType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_RollType.values.valueId', B_AT_RollType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ActivityUse != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ActivityUse.values[0].valueId', B_AT_ActivityUse, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ArtPadType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ArtPadType.values.valueId', B_AT_ArtPadType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_BookCoverType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_BookCoverType.values.valueId', B_AT_BookCoverType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ClipType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ClipType.values.valueId', B_AT_ClipType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_EnvelopeType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_EnvelopeType.values.valueId', B_AT_EnvelopeType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ExerciseBookLineType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ExerciseBookLineType.values[0].valueId', B_AT_ExerciseBookLineType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_LabelType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_LabelType.values.valueId', B_AT_LabelType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_Material != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_Material.values[0].valueId', B_AT_Material, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PackSize != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PackSize.values[0].valueId', B_AT_PackSize, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PaintBrushType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PaintBrushType.values.valueId', B_AT_PaintBrushType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PaintType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PaintType.values.valueId', B_AT_PaintType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PenType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PenType.values.valueId', B_AT_PenType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_PencilType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_PencilType.values.valueId', B_AT_PencilType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ReportCoverType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ReportCoverType.values.valueId', B_AT_ReportCoverType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_RingBinderType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_RingBinderType.values.valueId', B_AT_RingBinderType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_SchoolYear != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_SchoolYear.values[0].valueId', B_AT_SchoolYear, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_SprialBound != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_SprialBound.values.valueId', B_AT_SprialBound, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_StampType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_StampType.values.valueId', B_AT_StampType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_StaplerType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_StaplerType.values.valueId', B_AT_StaplerType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_StationeryBookType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_StationeryBookType.values.valueId', B_AT_StationeryBookType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_STEAMSubject != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_STEAMSubject.values[0].valueId', B_AT_STEAMSubject, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_Subject != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_Subject.values[0].valueId', B_AT_Subject, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_TapeType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_TapeType.values.valueId', B_AT_TapeType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_WhiteboardType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_WhiteboardType.values.valueId', B_AT_WhiteboardType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_CableConnections != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_CableConnections.values[0].valueId', B_AT_CableConnections, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ConnectionPort != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ConnectionPort.values[0].value', B_AT_ConnectionPort, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_DeviceType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_DeviceType.values.valueId', B_AT_DeviceType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_IMEIRequired != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_IMEIRequired.values.valueId', B_AT_IMEIRequired, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_InkandTonerColours != '' ?  WS.verifyElementPropertyValue(rs, 'values."AT_Ink&amp;TonerColours".values[0].valueId', B_AT_InkandTonerColours, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ScreenSize != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ScreenSize.values.valueId', B_AT_ScreenSize, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ScreenType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ScreenType.values.valueId', B_AT_ScreenType, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_TelcoNetwork != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_TelcoNetwork.values[0].valueId', B_AT_TelcoNetwork, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_TouchScreen != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_TouchScreen.values.valueId', B_AT_TouchScreen, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_Age != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_Age.values[0].valueId', B_AT_Age, FailureHandling.CONTINUE_ON_FAILURE) : null

B_AT_ToyType != '' ?  WS.verifyElementPropertyValue(rs, 'values.AT_ToyType.values.valueId', B_AT_ToyType, FailureHandling.CONTINUE_ON_FAILURE) : null

//*****************>>>>>>>>>>>>>>Barcode<<<<<<<<<<<<****************
WS.verifyElementPropertyValue(rs, 'values.BarCode_Name.values.value', BarCode_Name, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcode.value.value', B_AT_ProductBarcode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcodeNumber.value.value', B_AT_ProductBarcodeNumber, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BarcodeFormat.value.valueId', B_AT_BarcodeFormat, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.DC_BarcodeType.value.valueId', B_DC_BarcodeType, FailureHandling.CONTINUE_ON_FAILURE)

