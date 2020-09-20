<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Basic_Item_Search_Request_TC02</name>
   <tag></tag>
   <elementGuidId>2d3dc4fb-ff53-459e-8c85-477d90b7fa6c</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{  \n   \&quot;condition\&quot;:{  \n      \&quot;conditionType\&quot;:\&quot;or\&quot;,\n      \&quot;conditions\&quot;:[  \n         {  \n            \&quot;conditionType\&quot;:\&quot;name\&quot;,\n            \&quot;operator\&quot;:\&quot;like\&quot;,\n            \&quot;queryString\&quot;:\&quot;${B_Name}\&quot;,\n            \&quot;ignoreCase\&quot;:\&quot;true\&quot;\n         },\n         {  \n            \&quot;conditionType\&quot;:\&quot;id\&quot;,\n            \&quot;operator\&quot;:\&quot;like\&quot;,\n            \&quot;queryString\&quot;:\&quot;PPH_Level1*\&quot;,\n            \&quot;ignoreCase\&quot;:\&quot;true\&quot;\n         }\n      ]\n   }\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic QVJJOjEyMzQ=</value>
   </httpHeaderProperties>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://mdmdev.thewarehousegroup.co.nz/restapiv2/products/search?context=en-NZ&amp;workspace=Main</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
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
