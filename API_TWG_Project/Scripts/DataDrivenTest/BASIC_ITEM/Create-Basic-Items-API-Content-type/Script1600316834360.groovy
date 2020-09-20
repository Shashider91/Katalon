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

def response=WS.sendRequest(findTestObject('BASIC_ITEM/UPLOAD AND INVOKE/01_Request_POST/Basic_Item_Request_TC01', [('B_Name') : B_Name
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
            , ('B_AT_ArtistorAuthor') : B_AT_ArtistorAuthor, ('B_AT_BookGenre') : B_AT_BookGenre, ('B_AT_MultimediaPackSize') : B_AT_MultimediaPackSize
            , ('B_AT_NewRelease') : B_AT_NewRelease, ('B_AT_NewReleaseExpiryDate') : B_AT_NewReleaseExpiryDate, ('B_AT_CalculatorType') : B_AT_CalculatorType
            , ('B_AT_DVDGenre') : B_AT_DVDGenre, ('B_AT_GameGenre') : B_AT_GameGenre, ('B_AT_GamingSoftwareType') : B_AT_GamingSoftwareType
            , ('B_AT_HeadphoneType') : B_AT_HeadphoneType, ('B_AT_HPSureSupplySKUCode') : B_AT_HPSureSupplySKUCode, ('B_AT_iPhoneModel') : B_AT_iPhoneModel
            , ('B_AT_MusicGenre') : B_AT_MusicGenre, ('B_AT_OperatingSystem') : B_AT_OperatingSystem, ('B_AT_PrinterType') : B_AT_PrinterType
            , ('B_AT_BedSize') : B_AT_BedSize, ('B_AT_BroadSpectrumCover') : B_AT_BroadSpectrumCover, ('B_AT_ChristmasDecorationType') : B_AT_ChristmasDecorationType
            , ('B_AT_ChristmasDesign') : B_AT_ChristmasDesign, ('B_AT_ChristmasProduct') : B_AT_ChristmasProduct, ('B_AT_GiftOccasion') : B_AT_GiftOccasion
            , ('B_AT_GiftingRecipient') : B_AT_GiftingRecipient, ('B_AT_ProductDepth') : B_AT_ProductDepth, ('B_AT_ProductDiameter') : B_AT_ProductDiameter
            , ('B_AT_ProductHeight') : B_AT_ProductHeight, ('B_AT_ProductLength') : B_AT_ProductLength, ('B_AT_ProductType') : B_AT_ProductType
            , ('B_AT_ProductVolume') : B_AT_ProductVolume, ('B_AT_ProductWeight') : B_AT_ProductWeight, ('B_AT_ProductWidth') : B_AT_ProductWidth
            , ('B_AT_SunProtectionFactor') : B_AT_SunProtectionFactor, ('B_AT_WarrantyPeriod') : B_AT_WarrantyPeriod, ('B_AT_WaterResistantCover') : B_AT_WaterResistantCover
            , ('B_AT_DeliveryDate') : B_AT_DeliveryDate, ('B_AT_DeliveryLocation') : B_AT_DeliveryLocation, ('B_AT_HalloweenProduct') : B_AT_HalloweenProduct
            , ('B_AT_PetType') : B_AT_PetType, ('B_AT_CandleType') : B_AT_CandleType, ('B_AT_ChairType') : B_AT_ChairType
            , ('B_AT_CutleryType') : B_AT_CutleryType, ('B_AT_DeskType') : B_AT_DeskType, ('B_AT_DimensionalShape') : B_AT_DimensionalShape
            , ('B_AT_EnergyEfficiencyRating') : B_AT_EnergyEfficiencyRating, ('B_AT_Ergonomic') : B_AT_Ergonomic, ('B_AT_FillType') : B_AT_FillType
            , ('B_AT_FurnitureStyle') : B_AT_FillType, ('B_AT_HeatingorCooling') : B_AT_HeatingorCooling, ('B_AT_HomeFragrance') : B_AT_HomeFragrance
            , ('B_AT_Mattresstype') : B_AT_Mattresstype, ('B_AT_PrintIndicator') : B_AT_PrintIndicator, ('B_AT_PrintorPattern') : B_AT_PrintorPattern
            , ('B_AT_RugType') : B_AT_RugType, ('B_AT_TableandChairSettings') : B_AT_TableandChairSettings, ('B_AT_TowelType') : B_AT_TowelType
            , ('B_AT_Usesuitability') : B_AT_Usesuitability, ('B_AT_WaterEfficiencyRating') : B_AT_WaterEfficiencyRating
            , ('B_AT_AdditivesType') : B_AT_AdditivesType, ('B_AT_CleaningAccessoryType') : B_AT_CleaningAccessoryType, ('B_AT_CoverType') : B_AT_CoverType
            , ('B_AT_EngineOilType') : B_AT_EngineOilType, ('B_AT_GPS') : B_AT_GPS, ('B_AT_OutdoorFurnitureMaterial') : B_AT_OutdoorFurnitureMaterial
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


println(response)

def contentType=response.getHeaderField("Content-Type");

assertThat(contentType).is("application/octet-stream")

