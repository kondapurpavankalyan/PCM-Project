package com.pcm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pcm.qa.base.TestBase;

public class CreateApiEndpointPage extends TestBase {
	

	@FindBy(xpath = "( //span[contains(text(),'API Endpoint')])[1]")
	public WebElement Endpointclick;
	
	@FindBy(xpath = "//span[contains(text(),'Create API Endpoint')][1]")
	public WebElement CreateEndPointClick;
	
	@FindBy(xpath = "(//span[contains(text(),'Manage API Endpoint')])")
	public WebElement MangeEndPointClick;
			
	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement 	EnterAPIName;

	@FindBy(xpath = "(//div[@id='swal2-content'])")
	public WebElement 	SuccessMsgPop;
	
	@FindBy(xpath = "(//div[contains(text(),'Body')])")
	public WebElement 	ClickonBody;
	
	@FindBy(xpath = "(//textarea[@id='mat-input-79'])")
	public WebElement EnterJsonBody;
	
	@FindBy(xpath = "(//div[@class='mat-select-arrow-wrapper'])[1]")
	public WebElement ClickOnDropdow;		
			
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	public WebElement ClickOCreateAPIFromDropDown;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	public WebElement ClickOnInvokeAPIFromDropDown;		
		
	@FindBy(xpath = "(//mat-select//div[@class='mat-select-arrow-wrapper'])[2]")
	public WebElement ClickOnProxyWebMethod;

			
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	public WebElement ClickOnGetMethod;		


	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	public WebElement ClickOnPostMethod;		
			
  
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	public WebElement ClickOnPutMethod;

			
	@FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
	public WebElement ClickOnDeleteMethod;		


	@FindBy(xpath = "(//input[@formcontrolname='proxyUrl'])")
	public WebElement EnterProxyURL;			
			

	@FindBy(xpath = "(//input[@formcontrolname='serverUrl'])")
	public WebElement EnterServerURL;		
	
	

	
	

	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[1]")
	public WebElement ClickOnProxyAuthorization;
			
	@FindBy(xpath = "(//mat-select//div[@class='mat-select-arrow-wrapper'])[4]")
	public WebElement ClickOnAuthDropDown;	
	
	@FindBy(xpath = "(//mat-select//div[@class='mat-select-arrow-wrapper'])[3]")
	public WebElement ClickOnAuthDropDown1;	

	@FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[1]")
	public WebElement SelectNoAuth;	

	@FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[2]")
	public WebElement SelectBasicAuth;	
	
	//Proxy Token Authorization
	@FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[3]")
	public WebElement SelectTokenAuth;
	
	@FindBy(xpath = "(//input[@formcontrolname='proxyTokenApiUrl'])")
	public WebElement ProxyTokenUrl;	

	@FindBy(xpath = "(//input[@formcontrolname='proxyTokenKey'])")
	public WebElement ProxyTokenKey;		
			
	@FindBy(xpath = "(//div//input[@formcontrolname='proxyUsername'])")
	public WebElement ProxyUserName;
	
	@FindBy(xpath = "(//div//input[@formcontrolname='proxyPassword'])")
	public WebElement ProxyPassword;
	
	@FindBy(xpath = "(//div//mat-error[contains(text(),'User Name is required.')])")
	public WebElement ProxyUsernameErrorMsg;
	
	@FindBy(xpath = "(//div//mat-error[contains(text(),'Password is required.')])")
	public WebElement ProxyPasswordErrorMsg;		
			
	@FindBy(xpath = "(//input[@formcontrolname='proxyTokenPrefix'])")
	public WebElement ProxyPrefix;
	
	@FindBy(xpath = "(//input[@formcontrolname='proxyTokenHeader'])")
	public WebElement ProxyHeader;
	
	
	@FindBy(xpath = "//mat-error[contains(text(),'Token URL is required.')]")
	public WebElement TokenUrlErrorMsg;
	
	@FindBy(xpath = "//mat-error[contains(text(),'Token Key is required.')]")
	public WebElement TokenKeyErrorMsg;
	
	
	/// Proxy authorization
	

	@FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[4]")
	public WebElement SelectOAuth1;	
	
	@FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[5]")
	public WebElement SelectOAuth2;	
	
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
	public WebElement ClickOnServerAuthorization;
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[1]")
	public WebElement ClickOnServerAuthorization1;
			
	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	public WebElement ClickOnServerGetMethod;		


	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	public WebElement ClickOnServerPostMethod;		
			
  
	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	public WebElement ClickOnServerPutMethod;

			
	@FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
	public WebElement ClickOnServerDeleteMethod;		
	
	
	@FindBy(xpath = "(//div[contains(text(),'Params')])")
	public WebElement ClickOnParams;

	@FindBy(xpath = "(//input[@class='form-control col-md-11 ng-untouched ng-pristine ng-valid'])[1]")
	public WebElement EnterKey;
	
	@FindBy(xpath = "(//input[@class='form-control col-md-11 ng-untouched ng-pristine ng-valid'])[2]")
	public WebElement EnterValue;
	
	@FindBy(xpath = "(//input[@class='form-control col-md-11 ng-untouched ng-pristine ng-valid'])[3]")
	public WebElement EnterDescription;
	
	@FindBy(xpath = "(//input[@class='mat-checkbox-input cdk-visually-hidden'])[1]")
	public WebElement ClickOnRequiredCheckBox;
	
	@FindBy(xpath = "(//input[@class='mat-checkbox-input cdk-visually-hidden'])[2]")
	public WebElement ClickOnDynamicValueCheckBox;
	
	
	@FindBy(xpath = "(//button[@class='btn btn-primary ng-star-inserted'])")
	public WebElement ClickOnAddButton;
	
	@FindBy(xpath = "(//div[contains(text(),'Headers')])")
	public WebElement ClickOnHeaders;
	
	
	@FindBy(xpath = "(//input[@class='form-control col-md-11 ng-untouched ng-pristine ng-valid'])[1]")
	public WebElement EnterHeadersKey;
	
	@FindBy(xpath = "(//input[@formcontrolname='value'])")
	public WebElement EnterHeadersValue;
	
	
	@FindBy(xpath = "(//input[@placeholder='Description'])")
	public WebElement EnterHeadersDescription;
	
	@FindBy(xpath = "(//input[@class='mat-checkbox-input cdk-visually-hidden'])[1]")
	public WebElement ClickOnHeadersRequiredCheckBox;
	
	@FindBy(xpath = "(//input[@class='mat-checkbox-input cdk-visually-hidden'])[2]")
	public WebElement ClickOnHeadersDynamicValueCheckBox;
	
	
	@FindBy(xpath = "(//button[@class='btn btn-primary ng-star-inserted'])")
	public WebElement ClickOnHeadersAddButton;
	

	@FindBy(xpath = "( //button[contains(text(),'Create')])")
	public WebElement ClickOnCreateButton;
	
	
	@FindBy(xpath = "(//button[@class='btn btn-danger'])")
	public WebElement ClickOnCancelButton;
	
	@FindBy(xpath = "(//textarea[@class='mat-input-element mat-form-field-autofill-control cdk-text-field-autofill-monitored'])")
	public WebElement EnterJsonData;
	
	@FindBy(xpath = "(//h4[@class='font-weight-bold'])[1]")
	public WebElement CreateAPIEndPointTitle;
	
	@FindBy(xpath = "(//mat-error[contains(text(),'API Name is required')])")
	public WebElement ApiNameErrorMsg;
	
	
	@FindBy(xpath = "( //mat-error[contains(text(),'Server URL is required.')])")
	public WebElement serverurlErrorMsg;
	

	
	
	
	@FindBy(xpath = "( //mat-error[contains(text(),'User Name is required.')])")
	public WebElement UserNameErrorMsg;
	
	@FindBy(xpath = "( //mat-error[contains(text(),'Password is required.')])")
	public WebElement passwordErrorMsg;
	
	@FindBy(xpath = "( //mat-error[contains(text(),'Token Header is required.')])")
	public WebElement TokenHeaderErrorMsg;
	
	
	
	@FindBy(xpath = "( //input[@formcontrolname='serverUsername'])")
	public WebElement ServerAuthorizationUserName;
	
	@FindBy(xpath = "( //input[@formcontrolname='serverPassword'])")
	public WebElement ServerAuthorizationPassword;
	
	
	@FindBy(xpath = "( //mat-error[contains(text(),'user Name is required.')])")
	public WebElement ServerUsernameErrorMsg;
	
	@FindBy(xpath = "(//input[@formcontrolname='serverTokenApiUrl'])")
	public WebElement ServerTokenUrl;
	
	@FindBy(xpath = "(//input[@formcontrolname='serverTokenKey'])")
	public WebElement ServerTokenKey;
	
	@FindBy(xpath = "(//input[@formcontrolname='serverUsername'])")
	public WebElement ServerUserName;
	
	@FindBy(xpath = "(//input[@formcontrolname='serverPassword'])")
	public WebElement Serverpassword;
	
	@FindBy(xpath = "(//input[@formcontrolname='serverTokenPrefix'])")
	public WebElement ServerPrefix;
	
	@FindBy(xpath = "(//input[@formcontrolname='serverTokenHeader'])")
	public WebElement ServerHeader;
	
	
	@FindBy(xpath = "( //mat-error[contains(text(),'Token URL is required.')])")
	public WebElement ServerTokenURLErrorMsg;
	
	@FindBy(xpath = "( //mat-error[contains(text(),'Token Key is required.')])")
	public WebElement ServerTokenKeyErrorMsg;
	
	@FindBy(xpath = "( //mat-error[contains(text(),'User Name is required.')])")
	public WebElement ServerUserNameErrorMsg;
	
	@FindBy(xpath = "(//mat-error[contains(text(),'Password is required.')])")
	public WebElement ServerPasswordErrorMsg;
	
	
	@FindBy(xpath = "(//mat-error[contains(text(),'Token Header is required.')])")
	public WebElement ServerHeaderErrorMsg;
	
	
	//PARAMS XPATHS
	@FindBy(xpath = "(//input[@formcontrolname='key'])")
	public WebElement ParamsKey;
	
	
	@FindBy(xpath = "(//input[@formcontrolname='value'])")
	public WebElement ParamsValue;
	
	
	@FindBy(xpath = "(//input[@formcontrolname='description'])")
	public WebElement ParamsDescription;
	
	
	@FindBy(xpath = "(//mat-checkbox[@formcontrolname='required'])[1]")
	public WebElement ParamsRequiredCheckBox;
	
	
	@FindBy(xpath = "(//mat-checkbox[@formcontrolname='dynamicValue'])")
	public WebElement ParamsDynamicCheckBox;
	
	@FindBy(xpath = "( //button[contains(text(),'Add')])")
	public WebElement ParamsAddButton;
	
	
	@FindBy(xpath = "(//mat-checkbox[@formcontrolname='required'])[1]")
	public WebElement HeadersRequiredCheckBox;
	
	@FindBy(xpath = "(//mat-checkbox[@formcontrolname='dynamicValue'])")
	public WebElement HeadersDynamicCheckBox;
	
/////////////// INVOKE API//////////////////////////////////////////////////////
	
	
	@FindBy(xpath = "(//mat-select//div[@class='mat-select-arrow-wrapper'])[3]")
	public WebElement ClickOnPollingIntervalDropdown;
	
	
	@FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[2]")
	public WebElement ClickOnPollingIntervalOnArrival;
	

	@FindBy(xpath = "(//mat-option//span[@class='mat-option-text'])[3]")
	public WebElement ClickOnPollingIntervalOne;
	
	@FindBy(xpath = "(//input[@formcontrolname='key'])")
	public WebElement ClickOnServerParamsKey;
	
	
	@FindBy(xpath = "(//input[@formcontrolname='value'])")
	public WebElement ClickOnServerParamsValue;
	
	@FindBy(xpath = "(//input[@formcontrolname='description'])")
	public WebElement ClickOnServerParamsDescription;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	public WebElement ClickOnServerParamsRequiredCheckBox;
	
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement ClickOnServerParamsDynamicCheckBox;

	// Initializing the Page Objects:
	public CreateApiEndpointPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String verifyCreateAPIEndpointpagetitle() throws InterruptedException {

		Endpointclick.click();

		Thread.sleep(1000);
		CreateEndPointClick.click();

		Thread.sleep(3000);
		return CreateAPIEndPointTitle.getText();
	}

}
