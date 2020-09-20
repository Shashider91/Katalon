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

WS.sendRequest(findTestObject('COMPOSITE_ITEM/UPLOAD AND INVOKE/01_Request_POST/Composite_Item_Request_TC01', [('C_Name') : C_Name
            , ('C_ParentId') : C_ParentId, ('C_WSL_AT_ProductDescriptionWebstore') : C_WSL_AT_ProductDescriptionWebstore
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
            , ('C_AT_ProductName') : C_AT_ProductName, ('C_AT_ProductShortName') : C_AT_ProductShortName, ('C_AT_DangerousGoodsTransportIndicator') : C_AT_DangerousGoodsTransportIndicator
            , ('C_AT_InStoreEndDate') : C_AT_InStoreEndDate, ('C_AT_InStoreStartDate') : C_AT_InStoreStartDate, ('C_AT_ParallelImportCode') : C_AT_ParallelImportCode
            , ('C_AT_PreOrderAvailable') : C_AT_PreOrderAvailable, ('C_AT_ProductImageURLIndicator') : C_AT_ProductImageURLIndicator
            , ('C_AT_SupplierCode') : C_AT_SupplierCode, ('C_AT_HighRiskIndicator') : C_AT_HighRiskIndicator, ('C_AT_PackagingFormat') : C_AT_PackagingFormat
            , ('C_AT_RecallStatus') : C_AT_RecallStatus, ('C_AT_ProductStatus') : C_AT_ProductStatus, ('C_AT_ShippingProductDepth') : C_AT_ShippingProductDepth
            , ('C_AT_ShippingProductHeight') : C_AT_ShippingProductHeight, ('C_AT_ShippingProductVolume') : C_AT_ShippingProductVolume
            , ('C_AT_ShippingProductWeight') : C_AT_ShippingProductWeight, ('C_AT_ShippingProductWidth') : C_AT_ShippingProductWidth
            , ('C_AT_TUIProductKey') : C_AT_TUIProductKey, ('C_AT_TUIItemKey') : C_AT_TUIItemKey, ('C_AT_AssetImageURL') : C_AT_AssetImageURL
            , ('C_AT_AssemblyAttribute') : C_AT_AssemblyAttribute, ('C_AT_BestBeforeDateIndicator') : C_AT_BestBeforeDateIndicator
            , ('C_AT_BetterCottonInitiative') : C_AT_BetterCottonInitiative, ('C_AT_Character') : C_AT_Character, ('C_AT_Colour') : C_AT_Colour
            , ('C_AT_ColourFamily') : C_AT_ColourFamily, ('C_AT_ForestStewardshipCouncil') : C_AT_ForestStewardshipCouncil
            , ('C_AT_Gender') : C_AT_Gender, ('C_AT_License') : C_AT_License, ('C_AT_ReducetoSellIndicator') : C_AT_ReducetoSellIndicator
            , ('C_AT_Season') : C_AT_Season, ('C_AT_ShelfLife') : C_AT_ShelfLife, ('C_AT_Size') : C_AT_Size, ('C_AT_SchooltexProductType') : C_AT_SchooltexProductType
            , ('C_AT_FabricContent') : C_AT_FabricContent, ('C_AT_LegalAgeRestriction') : C_AT_LegalAgeRestriction, ('C_AT_GSTExempt') : C_AT_GSTExempt
            , ('C_AT_ArtistorAuthor') : C_AT_ArtistorAuthor, ('C_AT_BookGenre') : C_AT_BookGenre, ('C_AT_MultimediaPackSize') : C_AT_MultimediaPackSize
            , ('C_AT_NewRelease') : C_AT_NewRelease, ('C_AT_NewReleaseExpiryDate') : C_AT_NewReleaseExpiryDate, ('C_AT_CalculatorType') : C_AT_CalculatorType
            , ('C_AT_DVDGenre') : C_AT_DVDGenre, ('C_AT_GameGenre') : C_AT_GameGenre, ('C_AT_GamingSoftwareType') : C_AT_GamingSoftwareType
            , ('C_AT_HeadphoneType') : C_AT_HeadphoneType, ('C_AT_HPSureSupplySKUCode') : C_AT_HPSureSupplySKUCode, ('C_AT_iPhoneModel') : C_AT_iPhoneModel
            , ('C_AT_MusicGenre') : C_AT_MusicGenre, ('C_AT_OperatingSystem') : C_AT_OperatingSystem, ('C_AT_PrinterType') : C_AT_PrinterType
            , ('C_AT_BedSize') : C_AT_BedSize, ('C_AT_BroadSpectrumCover') : C_AT_BroadSpectrumCover, ('C_AT_ChristmasDecorationType') : C_AT_ChristmasDecorationType
            , ('C_AT_ChristmasDesign') : C_AT_ChristmasDesign, ('C_AT_ChristmasProduct') : C_AT_ChristmasProduct, ('C_AT_GiftOccasion') : C_AT_GiftOccasion
            , ('C_AT_GiftingRecipient') : C_AT_GiftingRecipient, ('C_AT_ProductDepth') : C_AT_ProductDepth, ('C_AT_ProductDiameter') : C_AT_ProductDiameter
            , ('C_AT_ProductHeight') : C_AT_ProductHeight, ('C_AT_ProductLength') : C_AT_ProductLength, ('C_AT_ProductType') : C_AT_ProductType
            , ('C_AT_ProductVolume') : C_AT_ProductVolume, ('C_AT_ProductWeight') : C_AT_ProductWeight, ('C_AT_ProductWidth') : C_AT_ProductWidth
            , ('C_AT_SunProtectionFactor') : C_AT_SunProtectionFactor, ('C_AT_WarrantyPeriod') : C_AT_WarrantyPeriod, ('C_AT_WaterResistantCover') : C_AT_WaterResistantCover
            , ('C_AT_DeliveryDate') : C_AT_DeliveryDate, ('C_AT_DeliveryLocation') : C_AT_DeliveryLocation, ('C_AT_HalloweenProduct') : C_AT_HalloweenProduct
            , ('C_AT_PetType') : C_AT_PetType, ('C_AT_CandleType') : C_AT_CandleType, ('C_AT_ChairType') : C_AT_ChairType
            , ('C_AT_CutleryType') : C_AT_CutleryType, ('C_AT_DeskType') : C_AT_DeskType, ('C_AT_DimensionalShape') : C_AT_DimensionalShape
            , ('C_AT_EnergyEfficiencyRating') : C_AT_EnergyEfficiencyRating, ('C_AT_Ergonomic') : C_AT_Ergonomic, ('C_AT_FillType') : C_AT_FillType
            , ('C_AT_FurnitureStyle') : C_AT_FurnitureStyle, ('C_AT_HeatingorCooling') : C_AT_HeatingorCooling, ('C_AT_HomeFragrance') : C_AT_HomeFragrance
            , ('C_AT_Mattresstype') : C_AT_Mattresstype, ('C_AT_PrintIndicator') : C_AT_PrintIndicator, ('C_AT_PrintorPattern') : C_AT_PrintorPattern
            , ('C_AT_RugType') : C_AT_RugType, ('C_AT_TableandChairSettings') : C_AT_TableandChairSettings, ('C_AT_TowelType') : C_AT_TowelType
            , ('C_AT_Usesuitability') : C_AT_Usesuitability, ('C_AT_WaterEfficiencyRating') : C_AT_WaterEfficiencyRating
            , ('C_AT_AdditivesType') : C_AT_AdditivesType, ('C_AT_CleaningAccessoryType') : C_AT_CleaningAccessoryType, ('C_AT_CoverType') : C_AT_CoverType
            , ('C_AT_EngineOilType') : C_AT_EngineOilType, ('C_AT_GPS') : C_AT_GPS, ('C_AT_OutdoorFurnitureMaterial') : C_AT_OutdoorFurnitureMaterial
            , ('C_AT_PaperorCardType') : C_AT_PaperorCardType, ('C_AT_PaperSize') : C_AT_PaperSize, ('C_AT_PaperWeight') : C_AT_PaperWeight
            , ('C_AT_RollType') : C_AT_RollType, ('C_AT_ActivityUse') : C_AT_ActivityUse, ('C_AT_ArtPadType') : C_AT_ArtPadType
            , ('C_AT_BookCoverType') : C_AT_BookCoverType, ('C_AT_ClipType') : C_AT_ClipType, ('C_AT_EnvelopeType') : C_AT_EnvelopeType
            , ('C_AT_ExerciseBookLineType') : C_AT_ExerciseBookLineType, ('C_AT_LabelType') : C_AT_LabelType, ('C_AT_Material') : C_AT_Material
            , ('C_AT_PackSize') : C_AT_PackSize, ('C_AT_PaintBrushType') : C_AT_PaintBrushType, ('C_AT_PaintType') : C_AT_PaintType
            , ('C_AT_PenType') : C_AT_PenType, ('C_AT_PencilType') : C_AT_PencilType, ('C_AT_ReportCoverType') : C_AT_ReportCoverType
            , ('C_AT_RingBinderType') : C_AT_RingBinderType, ('C_AT_SchoolYear') : C_AT_SchoolYear, ('C_AT_SprialBound') : C_AT_SprialBound
            , ('C_AT_StampType') : C_AT_StampType, ('C_AT_StaplerType') : C_AT_StaplerType, ('C_AT_StationeryBookType') : C_AT_StationeryBookType
            , ('C_AT_STEAMSubject') : C_AT_STEAMSubject, ('C_AT_Subject') : C_AT_Subject, ('C_AT_TapeType') : C_AT_TapeType
            , ('C_AT_WhiteboardType') : C_AT_WhiteboardType, ('C_AT_CableConnections') : C_AT_WhiteboardType, ('C_AT_ConnectionPort') : C_AT_ConnectionPort
            , ('C_AT_DeviceType') : C_AT_DeviceType, ('C_AT_IMEIRequired') : C_AT_IMEIRequired, ('C_AT_InkandTonerColours') : C_AT_InkandTonerColours
            , ('C_AT_ScreenSize') : C_AT_ScreenSize, ('C_AT_ScreenType') : C_AT_ScreenType, ('C_AT_TelcoNetwork') : C_AT_TelcoNetwork
            , ('C_AT_TouchScreen') : C_AT_TouchScreen, ('C_AT_Age') : C_AT_Age, ('C_AT_ToyType') : C_AT_ToyType, ('C_BarCode_Name') : C_BarCode_Name
            , ('C_AT_ProductBarcode') : C_AT_ProductBarcode, ('C_AT_ProductBarcodeNumber') : C_AT_ProductBarcodeNumber, ('C_AT_BarcodeFormat') : C_AT_BarcodeFormat
            , ('C_AT_BarcodeType') : C_AT_BarcodeType]))

def requestlist = [('C_Name') : C_Name]

println(C_Name)

Thread.sleep(25000)

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

def objectx = Js.parseText(results)

println(objectx['name'])

//****************************>>> WSL<<********************************************************************
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

//************************ >>>> Core ATTRIBUTES <<<<<*******************************************************************************
WS.verifyElementPropertyValue(rs, 'values.CompositeProduct_To_Product.value.valueId', CompositeProduct_To_Product, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductName.value.value', C_AT_ProductName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductShortName.value.value', C_AT_ProductShortName, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_DangerousGoodsTransportIndicator.value.valueId', C_AT_DangerousGoodsTransportIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreEndDate.value.value', C_AT_InStoreEndDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_InStoreStartDate.value.value', C_AT_InStoreStartDate, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ParallelImportCode.value.valueId', C_AT_ParallelImportCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PreOrderAvailable.value.value', C_AT_PreOrderAvailable, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductImageURLIndicator.value.valueId', C_AT_ProductImageURLIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_SupplierCode.value.value', C_AT_SupplierCode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_HighRiskIndicator.value.valueId', C_AT_HighRiskIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_PackagingFormat.value.valueId', C_AT_PackagingFormat, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_RecallStatus.value.valueId', C_AT_RecallStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductStatus.value.value', C_AT_ProductStatus, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductDepth.value.value', C_AT_ShippingProductDepth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductHeight.value.value', C_AT_ShippingProductHeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductVolume.value.value', C_AT_ShippingProductVolume, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWeight.value.value', C_AT_ShippingProductWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShippingProductWidth.value.value', C_AT_ShippingProductWidth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIProductKey.value.value', C_AT_TUIProductKey, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_TUIItemKey.value.value', C_AT_TUIItemKey, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_AssetImageURL.value.value', C_AT_AssetImageURL, FailureHandling.CONTINUE_ON_FAILURE)

//************************ >>>> TUI Attributes <<<<<*******************************************************************************
WS.verifyElementPropertyValue(rs, 'values.AT_AssemblyAttribute.values[0].valueId', C_AT_AssemblyAttribute, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BestBeforeDateIndicator.value.valueId', C_AT_BestBeforeDateIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BetterCottonInitiative.value.valueId', C_AT_BetterCottonInitiative, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Character.values[0].valueId', C_AT_Character, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Colour.value.valueId', C_AT_Colour, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ColourFamily.value.valueId', C_AT_ColourFamily, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ForestStewardshipCouncil.value.valueId', C_AT_ForestStewardshipCouncil, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Gender.value.valueId', C_AT_Gender, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_License.values[0].valueId', C_AT_License, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ReducetoSellIndicator.value.valueId', C_AT_ReducetoSellIndicator, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Season.value.valueId', C_AT_Season, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ShelfLife.value.value', C_AT_ShelfLife, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_Size.values[0].valueId', C_AT_Size, FailureHandling.CONTINUE_ON_FAILURE)

C_AT_SchooltexProductType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_SchooltexProductType.value.valueId', C_AT_SchooltexProductType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_FabricContent != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_FabricContent.value.value', C_AT_FabricContent, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_LegalAgeRestriction != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_LegalAgeRestriction.values.valueId', C_AT_LegalAgeRestriction, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_GSTExempt != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GSTExempt.value.valueId', C_AT_GSTExempt, FailureHandling.CONTINUE_ON_FAILURE) : null


C_AT_ArtistorAuthor != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ArtistorAuthor.value.valueId', C_AT_ArtistorAuthor, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_BookGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_BookGenre.value.valueId', C_AT_BookGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_MultimediaPackSize != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_MultimediaPackSize.value.value', C_AT_MultimediaPackSize, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_NewRelease != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_NewRelease.values.valueId', C_AT_NewRelease, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_NewReleaseExpiryDate != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_NewReleaseExpiryDate.value.value', C_AT_NewReleaseExpiryDate, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_CalculatorType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_CalculatorType.values[0].valueId', C_AT_CalculatorType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_DVDGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_DVDGenre.values.valueId', C_AT_DVDGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_GameGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GameGenre.values.valueId', C_AT_GameGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

C_GamingSoftwareType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GamingSoftwareType.value.valueId', C_GamingSoftwareType, 
    FailureHandling.CONTINUE_ON_FAILURE) : Null

C_AT_HeadphoneType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_HeadphoneType.values[0].valueId', C_AT_HeadphoneType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_HPSureSupplySKUCode != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_HPSureSupplySKUCode.value.valueId', C_AT_HPSureSupplySKUCode, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_iPhoneModel != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_iPhoneModel.value.value', C_AT_iPhoneModel, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_MusicGenre != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_MusicGenre.value.valueId', C_AT_MusicGenre, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_OperatingSystem != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_OperatingSystem.values.valueId', C_AT_OperatingSystem, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PrinterType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PrinterType.values[0].valueId', C_AT_PrinterType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

//************************ >>>> PIMAttributes <<<<<*******************************************************************************
C_AT_BedSize != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_BedSize.values.valueId', C_AT_BedSize, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_BroadSpectrumCover != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_BroadSpectrumCover.values[0].valueId', C_AT_BroadSpectrumCover, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ChristmasDecorationType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasDecorationType.values.valueId', 
    C_AT_ChristmasDecorationType, FailureHandling.CONTINUE_ON_FAILURE) : null

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasDesign.values[0].valueId', C_AT_ChristmasDesign, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ChristmasProduct.values.valueId', C_AT_ChristmasProduct, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GiftOccasion.values[0].valueId', C_AT_GiftOccasion, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_GiftingRecipient.values[0].valueId', C_AT_GiftingRecipient, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductDepth.value.value', C_AT_ProductDepth, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductDiameter.value.value', C_AT_ProductDiameter, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductHeight.value.value', C_AT_ProductHeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductLength.value.value', C_AT_ProductLength, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductType.value.value', C_AT_ProductType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductVolume.value.value', C_AT_ProductVolume, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductWeight.value.value', C_AT_ProductWeight, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductWidth.value.value', C_AT_ProductWidth, FailureHandling.CONTINUE_ON_FAILURE)

C_AT_SunProtectionFactor != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_SunProtectionFactor.values.valueId', C_AT_SunProtectionFactor, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_WarrantyPeriod != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_WarrantyPeriod.values.valueId', C_AT_WarrantyPeriod, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_WaterResistantCover != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_WaterResistantCover.values.valueId', C_AT_WaterResistantCover, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_DeliveryDate != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_DeliveryDate.value.value', C_AT_DeliveryDate, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_DeliveryLocation != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_DeliveryLocation.values.valueId', C_AT_DeliveryLocation, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

WS.verifyElementPropertyValue(rs, 'values.AT_HalloweenProduct.values.valueId', C_AT_HalloweenProduct, FailureHandling.CONTINUE_ON_FAILURE)

C_AT_PetType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PetType.values.valueId', C_AT_PetType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_CandleType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_CandleType.values.valueId', C_AT_CandleType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ChairType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ChairType.values.valueId', C_AT_ChairType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_CutleryType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_CutleryType.values[0].valueId', C_AT_CutleryType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_DeskType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_DeskType.values[0].valueId', C_AT_DeskType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_DimensionalShape != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_DimensionalShape.values[0].valueId', C_AT_DimensionalShape, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_EnergyEfficiencyRating != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_EnergyEfficiencyRating.values.valueId', 
    C_AT_EnergyEfficiencyRating, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_Ergonomic != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Ergonomic.values.valueId', C_AT_Ergonomic, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_FillType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_FillType.values[0].valueId', C_AT_FillType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_FurnitureStyle != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_FurnitureStyle.values.valueId', C_AT_FurnitureStyle, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_HeatingorCooling != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_HeatingorCooling.values.valueId', C_AT_HeatingorCooling, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_HomeFragrance != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_HomeFragrance.values[0].valueId', C_AT_HomeFragrance, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_Mattresstype != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Mattresstype.values.valueId', C_AT_Mattresstype, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PrintIndicator != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PrintIndicator.values.valueId', C_AT_PrintIndicator, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PrintorPattern != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PrintorPattern.values[0].valueId', C_AT_PrintorPattern, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_RugType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_RugType.values.valueId', C_AT_RugType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_TableandChairSettings != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Table&amp;ChairSettings.values[0].valueId', 
    C_AT_TableandChairSettings, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_TowelType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_TowelType.values.valueId', C_AT_TowelType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_Usesuitability != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Usesuitability.values[0].valueId', C_AT_Usesuitability, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_WaterEfficiencyRating != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_WaterEfficiencyRating.values.valueId', C_AT_WaterEfficiencyRating, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_AdditivesType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_AdditivesType.values.valueId', C_AT_AdditivesType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_CleaningAccessoryType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_CleaningAccessoryType.values.valueId', C_AT_CleaningAccessoryType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_CoverType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_CoverType.values.valueId', C_AT_CoverType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_EngineOilType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_EngineOilType.values.valueId', C_AT_EngineOilType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_GPS != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_GPS.values.valueId', C_AT_GPS, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_OutdoorFurnitureMaterial != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_OutdoorFurnitureMaterial.values[0].valueId', 
    C_AT_OutdoorFurnitureMaterial, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PaperorCardType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PaperorCardType.values.valueId', C_AT_PaperorCardType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PaperSize != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PaperSize.values.valueId', C_AT_PaperSize, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PaperWeight != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PaperWeight.values.valueId', C_AT_PaperWeight, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_RollType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_RollType.values.valueId', C_AT_RollType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ActivityUse != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ActivityUse.values[0].valueId', C_AT_ActivityUse, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ArtPadType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ArtPadType.values.valueId', C_AT_ArtPadType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_BookCoverType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_BookCoverType.values.valueId', C_AT_BookCoverType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ClipType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ClipType.values.valueId', C_AT_ClipType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_EnvelopeType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_EnvelopeType.values.valueId', C_AT_EnvelopeType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ExerciseBookLineType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ExerciseBookLineType.values[0].valueId', 
    C_AT_ExerciseBookLineType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_LabelType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_LabelType.values.valueId', C_AT_LabelType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_Material != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Material.values[0].valueId', C_AT_Material, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PackSize != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PackSize.values[0].valueId', C_AT_PackSize, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PaintBrushType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PaintBrushType.values.valueId', C_AT_PaintBrushType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PaintType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PaintType.values.valueId', C_AT_PaintType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_PenType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_PenType.values.valueId', C_AT_PenType, FailureHandling.CONTINUE_ON_FAILURE) : null

WC_AT_PencilType != '' ? S.verifyElementPropertyValue(rs, 'values.AT_PencilType.values.valueId', C_AT_PencilType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ReportCoverType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ReportCoverType.values.valueId', C_AT_ReportCoverType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_RingBinderType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_RingBinderType.values.valueId', C_AT_RingBinderType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_SchoolYear != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_SchoolYear.values[0].valueId', C_AT_SchoolYear, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_SprialBound != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_SprialBound.values.valueId', C_AT_SprialBound, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_StampType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_StampType.values.valueId', C_AT_StampType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_StaplerType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_StaplerType.values.valueId', C_AT_StaplerType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_StationeryBookType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_StationeryBookType.values.valueId', C_AT_StationeryBookType, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_STEAMSubject != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_STEAMSubject.values[0].valueId', C_AT_STEAMSubject, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_Subject != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Subject.values[0].valueId', C_AT_Subject, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_TapeType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_TapeType.values.valueId', C_AT_TapeType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_WhiteboardType != '' ? WC_AT_WhiteboardTypeS.verifyElementPropertyValue(rs, 'values.AT_WhiteboardType.values.valueId', 
    C_AT_WhiteboardType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_CableConnections != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_CableConnections.values[0].valueId', C_AT_CableConnections, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ConnectionPort != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ConnectionPort.values[0].value', C_AT_ConnectionPort, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_DeviceType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_DeviceType.values.valueId', C_AT_DeviceType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_IMEIRequired != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_IMEIRequired.values.valueId', C_AT_IMEIRequired, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_InkandTonerColours != '' ? WS.verifyElementPropertyValue(rs, 'values."AT_Ink&amp;TonerColours".values[0].valueId', 
    C_AT_InkandTonerColours, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ScreenSize != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ScreenSize.values.valueId', C_AT_ScreenSize, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ScreenType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ScreenType.values.valueId', C_AT_ScreenType, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_TelcoNetwork != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_TelcoNetwork.values[0].valueId', C_AT_TelcoNetwork, 
    FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_TouchScreen != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_TouchScreen.values.valueId', C_AT_TouchScreen, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_Age != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_Age.values[0].valueId', C_AT_Age, FailureHandling.CONTINUE_ON_FAILURE) : null

C_AT_ToyType != '' ? WS.verifyElementPropertyValue(rs, 'values.AT_ToyType.values.valueId', C_AT_ToyType, FailureHandling.CONTINUE_ON_FAILURE) : null

//*****************>>>>>>>>>>>>>>Barcode<<<<<<<<<<<<****************
WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcode.value.value', C_AT_ProductBarcode, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_BarcodeType.value.value', C_AT_BarcodeType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.AT_ProductBarcodeNumber.value.value', C_AT_ProductBarcodeNumber, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.DC_BarcodeType.value.valueId', C_DC_BarcodeType, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyElementPropertyValue(rs, 'values.C_AT_BarcodeFormat.value.valueId', C_DC_BarcodeFormat, FailureHandling.CONTINUE_ON_FAILURE)

