<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>BI_36_Nursery_Blankets_N_Comforters_PPH_L4_105744_TC01</name>
   <tag></tag>
   <elementGuidId>db0b6814-a683-44f4-abb8-825756fef4c8</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;\u003c?xml version\u003d\&quot;1.0\&quot; encoding\u003d\&quot;UTF-8\&quot;?\u003e\n\u003cSTEP-ProductInformation UseContextLocale\u003d\&quot;false\&quot; WorkspaceID\u003d\&quot;Main\&quot; ContextID\u003d\&quot;en-NZ\&quot;\u003e\n    \u003cProducts\u003e\n        \u003cProduct ParentID\u003d\&quot;${B_ParentID}\&quot; UserTypeID\u003d\&quot;PPH_BasicItem\&quot;\u003e\n            \u003cName\u003e${B_Name}\u003c/Name\u003e\n            \u003cClassificationReference Type\u003d\&quot;Product_To_BrandHierarchy\&quot;\u003e\n                \u003cKeyValue KeyID\u003d\&quot;KEY_Brand\&quot;\u003eANTHEM\u003c/KeyValue\u003e\n            \u003c/ClassificationReference\u003e\n            \u003cClassificationReference Type\u003d\&quot;Product_To_MerchandiseHierarchy\&quot; ClassificationID\u003d\&quot;MERCH_L5_1308\&quot; /\u003e\n            \u003cClassificationCrossReference Type\u003d\&quot;WSLOnlineDetails\&quot; ClassificationID\u003d\&quot;WSLHierarchy\&quot;\u003e\n                \u003cMetaData\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_ProductDescriptionWebstore\&quot;\u003e${B_WSL_AT_ProductDescriptionWebstore}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_OnlineDeliveryMinimumDays\&quot;\u003e${B_WSL_AT_OnlineDeliveryMinimumDays}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_SoldOnlineIndicator\&quot; ID\u003d\&quot;${B_WSL_AT_SoldOnlineIndicator}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_OnlineDeliveryMaximumDays\&quot;\u003e${B_WSL_AT_OnlineDeliveryMaximumDays}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebEnabled\&quot; ID\u003d\&quot;${B_WSL_AT_WebEnabled}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_OnlineDeliverySizeOverride\&quot; ID\u003d\&quot;${B_WSL_AT_OnlineDeliverySizeOverride}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_OnlineDeliverySizeDefault\&quot; ID\u003d\&quot;${B_WSL_AT_OnlineDeliverySizeDefault}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebItemSku\&quot;\u003e${B_WSL_AT_WebItemSku}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebExpiryDate\&quot;\u003e${B_WSL_AT_WebExpiryDate}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_FeaturesAndBenefits\&quot;\u003e${B_WSL_AT_FeaturesAndBenefits}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_ClickAndCollectFlag\&quot; ID\u003d\&quot;${B_WSL_AT_ClickAndCollectFlag}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebClearanceIndicator\&quot; ID\u003d\&quot;${B_WSL_AT_WebClearanceIndicator}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebEffectiveDate\&quot;\u003e${B_WSL_AT_WebEffectiveDate}\u003c/Value\u003e\n                \u003c/MetaData\u003e\n            \u003c/ClassificationCrossReference\u003e\n            \u003cClassificationCrossReference Type\u003d\&quot;TWLOnlineDetails\&quot; ClassificationID\u003d\&quot;TWLHierarchy\&quot;\u003e\n                \u003cMetaData\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_ProductDescriptionWebstore\&quot;\u003e${B_TWL_AT_ProductDescriptionWebstore}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_OnlineDeliveryMinimumDays\&quot;\u003e${B_TWL_AT_OnlineDeliveryMinimumDays}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_SoldOnlineIndicator\&quot; ID\u003d\&quot;${B_TWL_AT_SoldOnlineIndicator}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_OnlineDeliveryMaximumDays\&quot;\u003e${B_TWL_AT_OnlineDeliveryMaximumDays}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebEnabled\&quot; ID\u003d\&quot;${B_TWL_AT_WebEnabled}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_OnlineDeliverySizeOverride\&quot; ID\u003d\&quot;${B_TWL_AT_OnlineDeliverySizeOverride}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_OnlineDeliverySizeDefault\&quot; ID\u003d\&quot;${B_TWL_AT_OnlineDeliverySizeDefault}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebItemSku\&quot;\u003e${B_TWL_AT_WebItemSku}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebExpiryDate\&quot;\u003e${B_TWL_AT_WebExpiryDate}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_FeaturesAndBenefits\&quot;\u003e${B_TWL_AT_FeaturesAndBenefits}\u003c/Value\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_ClickAndCollectFlag\&quot; ID\u003d\&quot;${B_TWL_AT_ClickAndCollectFlag}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebClearanceIndicator\&quot; ID\u003d\&quot;${B_TWL_AT_WebClearanceIndicator}\&quot; /\u003e\n                    \u003cValue AttributeID\u003d\&quot;AT_WebEffectiveDate\&quot;\u003e${B_TWL_AT_WebEffectiveDate}\u003c/Value\u003e\n                \u003c/MetaData\u003e\n            \u003c/ClassificationCrossReference\u003e\n            \u003cValues\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ProductName\&quot;\u003e${B_AT_ProductName}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ProductShortName\&quot;\u003e${B_AT_ProductShortName}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_DangerousGoodsTransportIndicator\&quot; ID\u003d\&quot;${B_AT_DangerousGoodsTransportIndicator}\&quot; /\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_InStoreEndDate\&quot;\u003e${B_AT_InStoreEndDate}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_InStoreStartDate\&quot;\u003e${B_AT_InStoreStartDate}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ParallelImportCode\&quot; ID\u003d\&quot;${B_AT_ParallelImportCode}\&quot; /\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_PreOrderAvailable\&quot; ID\u003d\&quot;${B_AT_PreOrderAvailable}\&quot; /\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ProductImageURLIndicator\&quot; ID\u003d\&quot;${B_AT_ProductImageURLIndicator}\&quot; /\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_SupplierCode\&quot;\u003e${B_AT_SupplierCode}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_HighRiskIndicator\&quot; ID\u003d\&quot;${B_AT_HighRiskIndicator}\&quot; /\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_PackagingFormat\&quot; ID\u003d\&quot;${B_AT_PackagingFormat}\&quot; /\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_RecallStatus\&quot; ID\u003d\&quot;${B_AT_RecallStatus}\&quot; /\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ProductStatus\&quot; ID\u003d\&quot;${B_AT_ProductStatus}\&quot; /\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ShippingProductDepth\&quot; UnitID\u003d\&quot;unece.unit.MMT\&quot;\u003e${B_AT_ShippingProductDepth}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ShippingProductHeight\&quot; UnitID\u003d\&quot;unece.unit.MMT\&quot;\u003e${B_AT_ShippingProductHeight}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ShippingProductVolume\&quot; UnitID\u003d\&quot;unece.unit.MTQ\&quot;\u003e${B_AT_ShippingProductVolume}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ShippingProductWeight\&quot; UnitID\u003d\&quot;unece.unit.KGM\&quot;\u003e${B_AT_ShippingProductWeight}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_ShippingProductWidth\&quot; UnitID\u003d\&quot;unece.unit.MMT\&quot;\u003e${B_AT_ShippingProductWidth}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_TUIProductKey\&quot;\u003e${B_AT_TUIProductKey}\u003c/Value\u003e\n                \u003cValue AttributeID\u003d\&quot;AT_TUIItemKey\&quot;\u003e${B_AT_TUIItemKey}\u003c/Value\u003e\n               \n              \n                \u003cMultiValue AttributeID\u003d\&quot;AT_Character\&quot;\u003e\n                    \u003cValue ID\u003d\&quot;${B_AT_Character}\&quot; /\u003e\n                \u003c/MultiValue\u003e\n                \u003cMultiValue AttributeID\u003d\&quot;AT_License\&quot;\u003e\n                    \u003cValue ID\u003d\&quot;${B_AT_License}\&quot; /\u003e\n                \u003c/MultiValue\u003e\n             \n                \u003cMultiValue AttributeID\u003d\&quot;AT_Size\&quot;\u003e\n                    \u003cValue ID\u003d\&quot;${B_AT_Size}\&quot; /\u003e\n                \u003c/MultiValue\u003e\n            \u003c/Values\u003e\n            \u003cDataContainers\u003e\n                \u003cMultiDataContainer Type\u003d\&quot;DC_BarcodeType\&quot;\u003e\n                    \u003cDataContainer ID\u003d\&quot;${B_DC_BarcodeType}\&quot;\u003e\n                        \u003cValues\u003e\n                            \u003cValue AttributeID\u003d\&quot;AT_ProductBarcode\&quot;\u003e${B_AT_ProductBarcode}\u003c/Value\u003e\n                            \u003cValue AttributeID\u003d\&quot;AT_BarcodeType\&quot; ID\u003d\&quot;${B_AT_BarcodeType}\&quot; /\u003e\n                            \u003cValue AttributeID\u003d\&quot;AT_ProductBarcodeNumber\&quot;\u003e${B_AT_ProductBarcodeNumber}\u003c/Value\u003e\n                            \u003cValue AttributeID\u003d\&quot;AT_BarcodeFormat\&quot; ID\u003d\&quot;${B_AT_BarcodeFormat}\&quot; /\u003e\n                        \u003c/Values\u003e\n                    \u003c/DataContainer\u003e\n                \u003c/MultiDataContainer\u003e\n            \u003c/DataContainers\u003e\n        \u003c/Product\u003e\n    \u003c/Products\u003e\n\u003c/STEP-ProductInformation\u003e&quot;,
  &quot;contentType&quot;: &quot;application/xml&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/octet-stream</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic SU5CT1VORFVTRVI6MTIzNA==</value>
   </httpHeaderProperties>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://mdmdev.thewarehousegroup.co.nz/restapiv2/inbound-integration-endpoints/IIEP_ProductDeltaTUI/upload-and-invoke?context=en-NZ&amp;workspace=Main</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>'\r\n'</defaultValue>
      <description></description>
      <id>2e024158-dee5-4c68-a8d5-996c00aa6130</id>
      <masked>false</masked>
      <name>B_Name</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>24f427b2-dbb8-4693-930a-2a713869d417</id>
      <masked>false</masked>
      <name>B_ParentID</name>
   </variables>
   <variables>
      <defaultValue>'\r\n'</defaultValue>
      <description></description>
      <id>72940e25-7d83-4b20-8d9f-d59f491e0975</id>
      <masked>false</masked>
      <name>B_WSL_AT_ProductDescriptionWebstore</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f0335078-4e77-46a2-b3ff-670ea01a5509</id>
      <masked>false</masked>
      <name>B_WSL_AT_OnlineDeliveryMinimumDays</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6d8c8efd-163d-4b1f-85ba-e12eee10fda6</id>
      <masked>false</masked>
      <name>B_WSL_AT_SoldOnlineIndicator</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>c8d7cf9a-3ea9-47f7-a8a6-80b5c46c39ce</id>
      <masked>false</masked>
      <name>B_WSL_AT_OnlineDeliveryMaximumDays</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>785d1b5f-1269-4500-9574-a46c7c5ff8b2</id>
      <masked>false</masked>
      <name>B_WSL_AT_WebEnabled</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>9b3b0691-f7f1-4f69-8e56-4f5e63b393b2</id>
      <masked>false</masked>
      <name>B_WSL_AT_OnlineDeliverySizeOverride</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>86f208cd-ca3d-4ed9-bfb5-fef6d040e91a</id>
      <masked>false</masked>
      <name>B_WSL_AT_OnlineDeliverySizeDefault</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b597c6de-c022-4751-aba2-b3b3fce80e21</id>
      <masked>false</masked>
      <name>B_WSL_AT_WebItemSku</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>49a28240-8d0e-49ac-95b8-3a726ab81de9</id>
      <masked>false</masked>
      <name>B_WSL_AT_WebExpiryDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>046ee7e6-28a6-48db-9523-b3663df6c4d1</id>
      <masked>false</masked>
      <name>B_WSL_AT_FeaturesAndBenefits</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>128eae1a-5c85-49ef-a49f-da7abba33171</id>
      <masked>false</masked>
      <name>B_WSL_AT_ClickAndCollectFlag</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>4df5af94-d188-4089-ab3d-d5131adf3364</id>
      <masked>false</masked>
      <name>B_WSL_AT_WebClearanceIndicator</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>ac558271-4477-4785-b24e-7ccd8cf3e421</id>
      <masked>false</masked>
      <name>B_WSL_AT_WebEffectiveDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d9a3dc95-7f98-4af9-912f-1aa2f56e6e3c</id>
      <masked>false</masked>
      <name>B_TWL_AT_ProductDescriptionWebstore</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>143b659f-197c-4d6e-9b3d-686de2275266</id>
      <masked>false</masked>
      <name>B_TWL_AT_OnlineDeliveryMinimumDays</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d5a77334-4920-47bf-9812-c0a783ed5c7f</id>
      <masked>false</masked>
      <name>B_TWL_AT_SoldOnlineIndicator</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>bf6b2ac4-e9e1-40a9-8bb6-322d9c010f32</id>
      <masked>false</masked>
      <name>B_TWL_AT_OnlineDeliveryMaximumDays</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>baea04da-5a36-427a-98b3-5d39cca0f2a2</id>
      <masked>false</masked>
      <name>B_TWL_AT_WebEnabled</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e4b58752-56d5-4c70-bac1-cc01cd276f37</id>
      <masked>false</masked>
      <name>B_TWL_AT_OnlineDeliverySizeOverride</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>efd4848c-af93-413a-aca9-0615b74603b1</id>
      <masked>false</masked>
      <name>B_TWL_AT_OnlineDeliverySizeDefault</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>3ad45a51-41cc-41c8-95af-e37150f2af51</id>
      <masked>false</masked>
      <name>B_TWL_AT_WebItemSku</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>0a2dd5a6-3626-448a-862f-2e127c358b10</id>
      <masked>false</masked>
      <name>B_TWL_AT_WebExpiryDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>ed63a1f9-c217-4e37-be90-7fc6b00b1fb2</id>
      <masked>false</masked>
      <name>B_TWL_AT_FeaturesAndBenefits</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>72c0b532-a092-4cf4-aac4-f0abfd1e500e</id>
      <masked>false</masked>
      <name>B_TWL_AT_ClickAndCollectFlag</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>ec8340ea-d511-4471-98f1-5b3a673abf99</id>
      <masked>false</masked>
      <name>B_TWL_AT_WebClearanceIndicator</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>73e17882-8ed0-4f84-9034-106f3f6ef6c4</id>
      <masked>false</masked>
      <name>B_TWL_AT_WebEffectiveDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>137b5e0b-5539-4039-b0f7-c52635969212</id>
      <masked>false</masked>
      <name>B_AT_ProductName</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>89be1ddc-73d1-425a-a86e-087fe8442373</id>
      <masked>false</masked>
      <name>B_AT_ProductShortName</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b69faf01-8f8d-4faa-b181-c11fdae39389</id>
      <masked>false</masked>
      <name>B_AT_DangerousGoodsTransportIndicator</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>5b4490b8-2002-4518-b9b8-e898d9ff48c5</id>
      <masked>false</masked>
      <name>B_AT_InStoreEndDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>235c7802-03eb-4996-9da7-56bfb6a07f8b</id>
      <masked>false</masked>
      <name>B_AT_InStoreStartDate</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>3ea36af5-48a7-4860-9414-138d1a25c4e5</id>
      <masked>false</masked>
      <name>B_AT_ParallelImportCode</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f2bb4cf6-1f56-4f38-a33f-65d9d6cc9abc</id>
      <masked>false</masked>
      <name>B_AT_PreOrderAvailable</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>e426f365-da29-4061-b7cc-620044707fc3</id>
      <masked>false</masked>
      <name>B_AT_ProductImageURLIndicator</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>372d95cb-7ed3-4229-a51f-563f60ea2d07</id>
      <masked>false</masked>
      <name>B_AT_SupplierCode</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>2a36e354-55d3-458d-a3c7-3fd3ffbee1ef</id>
      <masked>false</masked>
      <name>B_AT_HighRiskIndicator</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>631232a5-358f-4fe4-bad2-8d111022329d</id>
      <masked>false</masked>
      <name>B_AT_PackagingFormat</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>b29ebf49-a303-48e2-a8ed-a13730772397</id>
      <masked>false</masked>
      <name>B_AT_RecallStatus</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>9aac9f77-e19d-4b51-a167-bcd7a3884e31</id>
      <masked>false</masked>
      <name>B_AT_ProductStatus</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>0927c7e7-0a16-45b6-9b15-130bb04a4a40</id>
      <masked>false</masked>
      <name>B_AT_ShippingProductDepth</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>65508a0d-e30a-4d69-81f9-3b3bb3ebbb6c</id>
      <masked>false</masked>
      <name>B_AT_ShippingProductHeight</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>c7309bb1-62c6-49df-a631-35a7c9e7af8b</id>
      <masked>false</masked>
      <name>B_AT_ShippingProductVolume</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>5a4043cb-7810-4af4-9158-4da2424f6c5c</id>
      <masked>false</masked>
      <name>B_AT_ShippingProductWeight</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>98032c0c-0a17-4912-a05b-12aa17dafbae</id>
      <masked>false</masked>
      <name>B_AT_ShippingProductWidth</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>79be888a-fa12-4ba0-b1f7-2de6e4c2f220</id>
      <masked>false</masked>
      <name>B_AT_TUIProductKey</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>81bf990a-1406-41a5-995f-ef3623df54b7</id>
      <masked>false</masked>
      <name>B_AT_TUIItemKey</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>173f7c88-a892-4c4c-bd55-6cec866792ea</id>
      <masked>false</masked>
      <name>B_AT_Character</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>7405acc9-7925-45a8-a965-75c727026d88</id>
      <masked>false</masked>
      <name>B_AT_License</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>d768a1ad-4784-4bf2-b81c-df36cd83651b</id>
      <masked>false</masked>
      <name>B_AT_Size</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>84b9567d-d99d-48de-aa54-cc52dc806be3</id>
      <masked>false</masked>
      <name>B_DC_BarcodeType</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>7bc16c70-bd1e-4fe0-a1ce-b80a669984c7</id>
      <masked>false</masked>
      <name>B_AT_ProductBarcode</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>a8bb719c-6ca8-4294-9903-9a42c58abe73</id>
      <masked>false</masked>
      <name>B_AT_BarcodeType</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>7b192b6e-c012-4403-b151-d877fa13b3d4</id>
      <masked>false</masked>
      <name>B_AT_ProductBarcodeNumber</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>38432c05-8674-492c-b577-e34232213b5a</id>
      <masked>false</masked>
      <name>B_AT_BarcodeFormat</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()


WS.verifyResponseStatusCode(response, 200)

assertThat(response.getStatusCode()).isEqualTo(200)</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
