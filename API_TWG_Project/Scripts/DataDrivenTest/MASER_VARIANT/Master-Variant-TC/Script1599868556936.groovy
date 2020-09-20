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

WS.sendRequest(findTestObject('MASTER_VARIANT_ITEM/UPLOAD AND INVOKE/01_Request_POST/Master_Vairant_Request_TC01', [('MV_Name') : MV_Name
            , ('MV_ParentId') : MV_ParentId, ('MV_WSL_AT_ProductDescriptionWebstore') : MV_WSL_AT_ProductDescriptionWebstore
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
            , ('MV_TWL_AT_WebEffectiveDate') : MV_TWL_AT_WebEffectiveDate, ('MV_AT_ProductName') : MV_AT_ProductName, ('MV_AT_ProductShortName') : MV_AT_ProductShortName
            , ('MV_AT_TUIItemCode') : MV_AT_TUIItemCode, ('MV_AT_ParallelImportCode') : MV_AT_ParallelImportCode, ('MV_AT_PreOrderAvailable') : MV_AT_PreOrderAvailable
            , ('MV_AT_TUIItemKey') : MV_AT_TUIItemKey, ('MV_AT_AssemblyAttribute') : MV_AT_AssemblyAttribute, ('MV_AT_BestBeforeDateIndicator') : MV_AT_BestBeforeDateIndicator
            , ('MV_AT_BetterCottonInitiative') : MV_AT_BetterCottonInitiative, ('MV_AT_ForestStewardshipCouncil') : MV_AT_ForestStewardshipCouncil
            , ('MV_AT_Gender') : MV_AT_Gender, ('MV_AT_ReducetoSellIndicator') : MV_AT_ReducetoSellIndicator, ('MV_AT_Season') : MV_AT_Season
            , ('MV_AT_ShelfLife') : MV_AT_ShelfLife, ('MV_AT_LegalAgeRestriction') : MV_AT_LegalAgeRestriction, ('MV_AT_GSTExempt') : MV_AT_GSTExempt
            , ('MV_AT_SafetyCheck') : MV_AT_SafetyCheck, ('MV_AT_ArtistorAuthor') : MV_AT_ArtistorAuthor, ('MV_AT_BookGenre') : MV_AT_BookGenre
            , ('MV_AT_MultimediaPackSize') : MV_AT_MultimediaPackSize, ('MV_AT_NewRelease') : MV_AT_NewRelease, ('MV_AT_NewReleaseExpiryDate') : MV_AT_NewReleaseExpiryDate
            , ('MV_AT_CalculatorType') : MV_AT_CalculatorType, ('MV_AT_DVDGenre') : MV_AT_DVDGenre, ('MV_AT_GameGenre') : MV_AT_GameGenre
            , ('MV_AT_GamingSoftwareType') : MV_AT_GamingSoftwareType, ('MV_AT_HPSureSupplySKUCode') : MV_AT_HPSureSupplySKUCode
            , ('MV_AT_iPhoneModel') : MV_AT_iPhoneModel, ('MV_AT_MusicGenre') : MV_AT_MusicGenre, ('MV_AT_OperatingSystem') : MV_AT_OperatingSystem
            , ('MV_AT_PrinterType') : MV_AT_PrinterType, ('MV_AT_BroadSpectrumCover') : MV_AT_BroadSpectrumCover, ('MV_AT_GiftOccasion') : MV_AT_GiftOccasion
            , ('MV_AT_GiftingRecipient') : MV_AT_GiftingRecipient, ('MV_AT_SunProtectionFactor') : MV_AT_SunProtectionFactor
            , ('MV_AT_WarrantyPeriod') : MV_AT_WarrantyPeriod, ('MV_AT_WaterResistantCover') : MV_AT_WaterResistantCover
            , ('MV_AT_CandleType') : MV_AT_CandleType, ('MV_AT_ChairType') : MV_AT_ChairType, ('MV_AT_CutleryType') : MV_AT_CutleryType
            , ('MV_AT_DeskType') : MV_AT_DeskType, ('MV_AT_DimensionalShape') : MV_AT_DimensionalShape, ('MV_AT_EnergyEfficiencyRating') : MV_AT_EnergyEfficiencyRating
            , ('MV_AT_Ergonomic') : MV_AT_Ergonomic, ('MV_AT_FillType') : MV_AT_FillType, ('MV_AT_FurnitureStyle') : MV_AT_FurnitureStyle
            , ('MV_AT_HeatingorCooling') : MV_AT_HeatingorCooling, ('MV_AT_Mattresstype') : MV_AT_Mattresstype, ('MV_AT_TableandChairSettings') : MV_AT_TableandChairSettings
            , ('MV_AT_Usesuitability') : MV_AT_Usesuitability, ('MV_AT_WaterEfficiencyRating') : MV_AT_WaterEfficiencyRating
            , ('MV_AT_AdditivesType') : MV_AT_AdditivesType, ('MV_AT_CleaningAccessoryType') : MV_AT_CleaningAccessoryType
            , ('MV_AT_CoverType') : MV_AT_CoverType, ('MV_AT_EngineOilType') : MV_AT_EngineOilType, ('MV_AT_GPS') : MV_AT_GPS
            , ('MV_AT_OutdoorFurnitureMaterial') : MV_AT_OutdoorFurnitureMaterial, ('MV_AT_ArtPadType') : MV_AT_ArtPadType
            , ('MV_AT_BookCoverType') : MV_AT_BookCoverType, ('MV_AT_ClipType') : MV_AT_ClipType, ('MV_AT_EnvelopeType') : MV_AT_EnvelopeType
            , ('MV_AT_ExerciseBookLineType') : MV_AT_ExerciseBookLineType, ('MV_AT_LabelType') : MV_AT_LabelType, ('MV_AT_Material') : MV_AT_Material
            , ('MV_AT_PackSize') : MV_AT_PackSize, ('MV_AT_PaintBrushType') : MV_AT_PaintBrushType, ('MV_AT_PaintType') : MV_AT_PaintType
            , ('MV_AT_PenType') : MV_AT_PenType, ('MV_AT_PencilType') : MV_AT_PencilType, ('MV_AT_ReportCoverType') : MV_AT_ReportCoverType
            , ('MV_AT_RingBinderType') : MV_AT_RingBinderType, ('MV_AT_SchoolYear') : MV_AT_SchoolYear, ('MV_AT_SprialBound') : MV_AT_SprialBound
            , ('MV_AT_StampType') : MV_AT_StampType, ('MV_AT_StaplerType') : MV_AT_StaplerType, ('MV_AT_StationeryBookType') : MV_AT_StationeryBookType
            , ('MV_AT_STEAMSubject') : MV_AT_STEAMSubject, ('MV_AT_Subject') : MV_AT_Subject, ('MV_AT_TapeType') : MV_AT_TapeType
            , ('MV_AT_WhiteboardType') : MV_AT_WhiteboardType, ('MV_AT_ConnectionPort') : MV_AT_ConnectionPort, ('MV_AT_DeviceType') : MV_AT_DeviceType
            , ('MV_AT_IMEIRequired') : MV_AT_IMEIRequired, ('MV_AT_ScreenSize') : MV_AT_ScreenSize, ('MV_AT_ScreenType') : MV_AT_ScreenType
            , ('MV_AT_TouchScreen') : MV_AT_TouchScreen, ('MV_AT_ToyType') : MV_AT_ToyType, ('MV_BarCode_Name') : MV_BarCode_Name
            , ('MV_AT_ProductBarcode') : MV_AT_ProductBarcode, ('MV_AT_ProductBarcodeNumber') : MV_AT_ProductBarcodeNumber
            , ('MV_AT_BarcodeFormat') : MV_AT_BarcodeFormat, ('MV_AT_BarcodeType') : MV_AT_BarcodeType, ('MVA_AT_ProductName') : MVA_AT_ProductName
            , ('MVA_AT_ProductShortName') : MVA_AT_ProductShortName, ('MVA_AT_DangerousGoodsTransportIndicator') : MVA_AT_DangerousGoodsTransportIndicator
            , ('MVA_AT_InStoreEndDate') : MVA_AT_InStoreEndDate, ('MVA_AT_InStoreStartDate') : MVA_AT_InStoreStartDate, ('MVA_AT_ProductImageURLIndicator') : MVA_AT_ProductImageURLIndicator
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
            , ('MVA_AT_ProductLength') : MVA_AT_ProductLength, ('MVA_AT_ProductType') : MVA_AT_ProductType, ('MVA_AT_ProductVolume') : MVA_AT_ProductVolume
            , ('MVA_AT_ProductWeight') : MVA_AT_ProductWeight, ('MVA_AT_ProductWidth') : MVA_AT_ProductWidth, ('MVA_AT_DeliveryDate') : MVA_AT_DeliveryDate
            , ('MVA_AT_DeliveryLocation') : MVA_AT_DeliveryLocation, ('MVA_AT_HalloweenProduct') : MVA_AT_HalloweenProduct
            , ('MVA_AT_PetType') : MVA_AT_PetType, ('MVA_AT_HomeFragrance') : MVA_AT_HomeFragrance, ('MVA_AT_PrintIndicator') : MVA_AT_PrintIndicator
            , ('MVA_AT_PrintorPattern') : MVA_AT_PrintorPattern, ('MVA_AT_RugType') : MVA_AT_RugType, ('MVA_AT_TowelType') : MVA_AT_TowelType
            , ('MVA_AT_PaperorCardType') : MVA_AT_PaperorCardType, ('MVA_AT_PaperSize') : MVA_AT_PaperSize, ('MVA_AT_PaperWeight') : MVA_AT_PaperWeight
            , ('MVA_AT_RollType') : MVA_AT_RollType, ('MVA_AT_ActivityUse') : MVA_AT_ActivityUse, ('MVA_AT_CableConnections') : MVA_AT_CableConnections
            , ('MVA_AT_InkandTonerColours') : MVA_AT_InkandTonerColours, ('MVA_AT_TelcoNetwork') : MVA_AT_TelcoNetwork, ('MVA_AT_Age') : MVA_AT_Age]))

def requestlist = [('MV_Name') : MV_Name]

println(MV_Name)

Thread.sleep(25000)

ResponseObject resp = WS.sendRequest(findTestObject('MASTER_VARIANT_ITEM/UPLOAD AND INVOKE/02_Request_Search/Master_Variant_Search_Request_TC02', 
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

Thread.sleep(15000)

ResponseObject rs = WS.sendRequest(findTestObject('MASTER_VARIANT_ITEM/UPLOAD AND INVOKE/03_Get/Master_Variant_Get_TC03', 
        [('search') : searchID]))

def results = rs.getResponseText()

VariableCollections.map.put('resultsres', results)

def objectx = Js.parseText(results)

println(objectx['name'])

//************************>>>>>>>>>>> WSLOnlineDetails <<<<<<<<<<<<<<<<************************
WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_ClickAndCollectFlag.value.valueId', MV_WSL_AT_ClickAndCollectFlag, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_FeaturesAndBenefits.value.value', MV_WSL_AT_FeaturesAndBenefits, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliveryMaximumDays.value.value', 
    MV_WSL_AT_OnlineDeliveryMaximumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliveryMinimumDays.value.value', 
    MV_WSL_AT_OnlineDeliveryMinimumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliverySizeDefault.value.valueId', 
    MV_WSL_AT_OnlineDeliverySizeDefault, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_OnlineDeliverySizeOverride.value.valueId', 
    MV_WSL_AT_OnlineDeliverySizeOverride, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_ProductDescriptionWebstore.value.value', 
    MV_WSL_AT_ProductDescriptionWebstore, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_SoldOnlineIndicator.value.valueId', MV_WSL_AT_SoldOnlineIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebClearanceIndicator.value.valueId', 
    MV_WSL_AT_WebClearanceIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebEffectiveDate.value.value', MV_WSL_AT_WebEffectiveDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebEnabled.value.valueId', MV_WSL_AT_WebEnabled, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebExpiryDate.value.value', MV_WSL_AT_WebExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.WSLOnlineDetails.reference.values.AT_WebItemSku.value.value', MV_WSL_AT_WebItemSku, 
    FailureHandling.CONTINUE_ON_FAILURE)

//**********************************>>>>>>>>>>>  TWLOnlineDetails  <<<<<<<<<<<<*************************************
WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_ClickAndCollectFlag.value.valueId', MV_TWL_AT_ClickAndCollectFlag, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_FeaturesAndBenefits.value.value', MV_TWL_AT_FeaturesAndBenefits, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliveryMaximumDays.value.value', 
    MV_TWL_AT_OnlineDeliveryMaximumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliveryMinimumDays.value.value', 
    MV_TWL_AT_OnlineDeliveryMinimumDays, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliverySizeDefault.value.valueId', 
    MV_TWL_AT_OnlineDeliverySizeDefault, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_OnlineDeliverySizeOverride.value.valueId', 
    MV_TWL_AT_OnlineDeliverySizeOverride, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_ProductDescriptionWebstore.value.value', 
    MV_TWL_AT_ProductDescriptionWebstore, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_SoldOnlineIndicator.value.valueId', MV_TWL_AT_SoldOnlineIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebClearanceIndicator.value.valueId', 
    MV_TWL_AT_WebClearanceIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebEffectiveDate.value.value', MV_TWL_AT_WebEffectiveDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebEnabled.value.valueId', MV_TWL_AT_WebEnabled, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebExpiryDate.value.value', MV_TWL_AT_WebExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'references.TWLOnlineDetails.reference.values.AT_WebItemSku.value.value', MV_TWL_AT_WebItemSku, 
    FailureHandling.CONTINUE_ON_FAILURE)

//*************************************>>>>>>>>>>>>>>>    CoreAttributes <<<<<<<<<<<<<<***********************
WS.verifyElementPropertyValue(rs, 'values.AT_ProductName.value.value', MV_AT_ProductName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductShortName.value.value', MV_AT_ProductShortName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIItemCode.value.valueId', MV_AT_TUIItemCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ParallelImportCode.value.valueId', MV_AT_ParallelImportCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PreOrderAvailable.value.valueId', MV_AT_PreOrderAvailable, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIProductKey.value.value', MV_AT_TUIProductKey, FailureHandling.CONTINUE_ON_FAILURE)

// ******************** >>>>>>>>>>>>   TUIAttributes <<<<<<<<<<<<****************************
WS.verifyElementPropertyValue(rs, 'values.AT_AssemblyAttribute.values[0].valueId', MV_AT_AssemblyAttribute, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BestBeforeDateIndicator.value.valueId', MV_AT_BestBeforeDateIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BetterCottonInitiative.value.valueId', MV_AT_BetterCottonInitiative, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ForestStewardshipCouncil.value.valueId', MV_AT_ForestStewardshipCouncil, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Gender.value.valueId', MV_AT_Gender, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ReducetoSellIndicator.value.valueId', MV_AT_ReducetoSellIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Season.value.valueId', MV_AT_Season, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShelfLife.value.value', MV_AT_ShelfLife, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_LegalAgeRestriction.values.valueId', MV_AT_LegalAgeRestriction, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GSTExempt.value.valueId', MV_AT_GSTExempt, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SafetyCheck.value.valueId', MV_AT_SafetyCheck, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ArtistorAuthor.value.valueId', MV_AT_ArtistorAuthor, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BookGenre.value.valueId', MV_AT_BookGenre, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_MultimediaPackSize.value.value', MV_AT_MultimediaPackSize, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_NewRelease.values.valueId', MV_AT_NewRelease, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_NewReleaseExpiryDate.value.valueId', MV_AT_NewReleaseExpiryDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_CalculatorType.values[0].valueId', MV_AT_CalculatorType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DVDGenre.values.valueId', MV_AT_DVDGenre, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GameGenre.values.valueId', MV_AT_GameGenre, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GamingSoftwareType.values.valueId', MV_GamingSoftwareType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HPSureSupplySKUCode.value.value', MV_AT_HPSureSupplySKUCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_iPhoneModel.value.value', MV_AT_iPhoneModel, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_MusicGenre.value.valueId', MV_AT_MusicGenre, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_OperatingSystem.values.valueId', MV_AT_OperatingSystem, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PrinterType.values[0].valueId', MV_AT_PrinterType, FailureHandling.CONTINUE_ON_FAILURE)

//****************************>>>>>>>>>>>>>>>>>>> PIMAttributes <<<<<<<<<<<<<<<<<***************************************
WS.verifyElementPropertyValue(rs, 'values.AT_BroadSpectrumCover.values[0].valueId', MV_AT_BroadSpectrumCover, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GiftOccasion.values[0].valueId', MV_AT_GiftOccasion, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GiftingRecipient.values[0].valueId', MV_AT_GiftingRecipient, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SunProtectionFactor.values.valueId', MV_AT_SunProtectionFactor, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_WarrantyPeriod.values.valueId', MV_AT_WarrantyPeriod, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.MV_AT_WaterResistantCover.values.valueId', MV_AT_WaterResistantCover, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_CandleType.values.valueId', MV_AT_CandleType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChairType.values.valueId', MV_AT_ChairType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_CutleryType.values[0].valueId', MV_AT_CutleryType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DeskType.values[0].valueId', MV_AT_DeskType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DimensionalShape.values[0].valueId', MV_AT_DimensionalShape, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_EnergyEfficiencyRating.values.valueId', MV_AT_EnergyEfficiencyRating, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Ergonomic.values.valueId', MV_AT_Ergonomic, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_FillType.values[0].valueId', MV_AT_FillType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_FurnitureStyle.values.valueId', MV_AT_FurnitureStyle, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HeatingorCooling.values.valueId', MV_AT_HeatingorCooling, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Mattresstype.values.valueId', MV_AT_Mattresstype, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TableandChairSettings.values[0].valueId', MV_AT_TableandChairSettings, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Usesuitability.values.valueId', MV_AT_Usesuitability, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_WaterEfficiencyRating.values.valueId', MV_AT_WaterEfficiencyRating, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_AdditivesType.values.valueId', MV_AT_AdditivesType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_CleaningAccessoryType.values.valueId', MV_AT_CleaningAccessoryType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_CoverType.values.valueId', MV_AT_CoverType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_EngineOilType.values.valueId', MV_AT_EngineOilType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GPS.values.valueId', MV_AT_GPS, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.MV_AT_OutdoorFurnitureMaterial.values[0].valueId', MV_AT_OutdoorFurnitureMaterial, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ArtPadType.values.valueId', MV_AT_ArtPadType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BookCoverType.values.valueId', MV_AT_BookCoverType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ClipType.values.valueId', MV_AT_ClipType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_EnvelopeType.values.valueId', MV_AT_EnvelopeType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ExerciseBookLineType.values[0].valueId', MV_AT_ExerciseBookLineType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_LabelType.values.valueId', MV_AT_LabelType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Material.values[0].valueId', MV_AT_Material, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PackSize.values[0].valueId', MV_AT_PackSize, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PaintBrushType.values.valueId', MV_AT_PaintBrushType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PaintType.values[0].valueId', MV_AT_PaintType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PenType.values.valueId', MV_AT_PenType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PencilType.values.valueId', MV_AT_PencilType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ReportCoverType.values.valueId', MV_AT_ReportCoverType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RingBinderType.values.valueId', MV_AT_RingBinderType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SchoolYear.values[0].valueId', MV_AT_SchoolYear, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SprialBound.values.valueId', MV_AT_SprialBound, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_StampType.values.valueId', MV_AT_StampType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_StaplerType.values.valueId', MV_AT_StaplerType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_StationeryBookType.values.valueId', MV_AT_StationeryBookType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_STEAMSubject.values[0].valueId', MV_AT_STEAMSubject, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Subject.values[0].valueId', MV_AT_Subject, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TapeType.values.valueId', MV_AT_TapeType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_WhiteboardType.values.valueId', MV_AT_WhiteboardType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ConnectionPort.values[0].valueId', MV_AT_ConnectionPort, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DeviceType.values.valueId', MV_AT_DeviceType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_IMEIRequired.values.valueId', MV_AT_IMEIRequired, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ScreenSize.values.valueId', MV_AT_ScreenSize, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ScreenType.values.valueId', MV_AT_ScreenType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TouchScreen.values.valueId', MV_AT_TouchScreen, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ToyType.values.valueId', MV_AT_ToyType, FailureHandling.CONTINUE_ON_FAILURE)

//*****************>>>>>>>>>>>>>> Master and Variant (Core Attributes ) <<<<<<<<<<<<***********************************
WS.verifyElementPropertyValue(rs, 'values.AT_ProductName.value.value', MVA_AT_ProductName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductShortName.value.value', MVA_AT_ProductShortName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DangerousGoodsTransportIndicator.value.valueId', MVA_AT_DangerousGoodsTransportIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreEndDate.value.value', MVA_AT_InStoreEndDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreStartDate.value.value', MVA_AT_InStoreStartDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductImageURLIndicator.value.valueId', MVA_AT_ProductImageURLIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SupplierCode.value.value', MVA_AT_SupplierCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HighRiskIndicator.value.valueId', MVA_AT_HighRiskIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PackagingFormat.value.valueId', MVA_AT_PackagingFormat, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RecallStatus.value.valueId', MVA_AT_RecallStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductStatus.value.value', MVA_AT_ProductStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductDepth.value.value', MVA_AT_ShippingProductDepth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductHeight.value.value', MVA_AT_ShippingProductHeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductVolume.value.value', MVA_AT_ShippingProductVolume, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWeight.value.value', MVA_AT_ShippingProductWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWidth.value.value', MVA_AT_ShippingProductWidth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIProductKey.value.value', MVA_AT_TUIProductKey, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_AssetImageURL.value.value', MVA_AT_AssetImageURL, FailureHandling.CONTINUE_ON_FAILURE)

//*****************>>>>>>>>>>>>>> Master and Variant ( Category Attributes ) <<<<<<<<<<<<***********************************
WS.verifyElementPropertyValue(rs, 'values.AT_Character.values[0].valueId', MVA_AT_Character, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Colour.value.valueId', MVA_AT_Colour, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ColourFamily.value.valueId', MVA_AT_ColourFamily, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_License.values[0].valueId', MVA_AT_License, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Size.values[0].valueId', MVA_AT_Size, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SchooltexProductType.value.valueId', MVA_AT_SchooltexProductType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_FabricContent.values[0].value', MVA_AT_FabricContent, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HeadphoneType.values[0].valueId', MVA_AT_HeadphoneType, FailureHandling.CONTINUE_ON_FAILURE)

//*****************>>>>>>>>>>>>>> Master and Variant ( PIM Attributes ) <<<<<<<<<<<<***********************************
WS.verifyElementPropertyValue(rs, 'values.AT_BedSize.values.valueId', MVA_AT_BedSize, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasDecorationType.values.valueId', MVA_AT_ChristmasDecorationType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasDesign.values[0].valueId', MVA_AT_ChristmasDesign, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasProduct.values.valueId', MVA_AT_ChristmasProduct, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductDepth.value.value', MVA_AT_ProductDepth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductDiameter.value.value', MVA_AT_ProductDiameter, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductHeight.value.value', MVA_AT_ProductHeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductLength.value.value', MVA_AT_ProductLength, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductType.value.value', MVA_AT_ProductType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductVolume.value.value', MVA_AT_ProductVolume, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductWeight.value.value', MVA_AT_ProductWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductWidth.value.value', MVA_AT_ProductWidth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DeliveryDate.value.value', MVA_AT_DeliveryDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DeliveryLocation.values.valueId', MVA_AT_DeliveryLocation, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HalloweenProduct.values.valueId', MVA_AT_HalloweenProduct, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PetType.values.valueId', MVA_AT_PetType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HomeFragrance.values[0].valueId', MVA_AT_HomeFragrance, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PrintIndicator.values.valueId', MVA_AT_PrintIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PrintorPattern.values[0].valueId', MVA_AT_PrintorPattern, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RugType.values.valueId', MVA_AT_RugType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TowelType.values.valueId', MVA_AT_TowelType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PaperorCardType.values.valueId', MVA_AT_PaperorCardType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PaperSize.values.valueId', MVA_AT_PaperSize, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PaperWeight.values.valueId', MVA_AT_PaperWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RollType.values.valueId', MVA_AT_RollType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ActivityUse.values[0].valueId', MVA_AT_ActivityUse, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_CableConnections.values[0].valueId', MVA_AT_CableConnections, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values."AT_Ink&amp;TonerColours".values[0].valueId', 'MVA_AT_Inkandamp;TonerColours', 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TelcoNetwork.values[0].valueId', MVA_AT_TelcoNetwork, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Age.values[0].valueId', MVA_AT_Age, FailureHandling.CONTINUE_ON_FAILURE)

//*****************>>>>>>>>>>>>>>Barcode<<<<<<<<<<<<***********************************
WS.verifyElementPropertyValue(rs, 'values.BarCode_Name.values.valueId', MV_BarCode_Name, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcode.value.value', MV_AT_ProductBarcode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcodeNumber.value.value', MV_AT_ProductBarcodeNumber, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BarcodeFormat.value.valueId', MV_AT_BarcodeFormat, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BarcodeType.value.valueId', MV_AT_BarcodeType, FailureHandling.CONTINUE_ON_FAILURE)

