
package com.uba.waei.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uba.waei.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FetchAuthenticationSecreet_QNAME = new QName("http://ws.waei.uba.com/", "fetchAuthenticationSecreet");
    private final static QName _AdaptiveAuthentication_QNAME = new QName("http://ws.waei.uba.com/", "adaptiveAuthentication");
    private final static QName _AuthenticateOTP_QNAME = new QName("http://ws.waei.uba.com/", "authenticateOTP");
    private final static QName _CreateAuthenticationSecreetResponse_QNAME = new QName("http://ws.waei.uba.com/", "createAuthenticationSecreetResponse");
    private final static QName _UpdateOrCreateuserContactInfo_QNAME = new QName("http://ws.waei.uba.com/", "updateOrCreateuserContactInfo");
    private final static QName _CreateNewCorporateEntrustUser_QNAME = new QName("http://ws.waei.uba.com/", "createNewCorporateEntrustUser");
    private final static QName _AuthenticateAdaptiveSecurityQuestionResponse_QNAME = new QName("http://ws.waei.uba.com/", "authenticateAdaptiveSecurityQuestionResponse");
    private final static QName _CreateNewOrUpdateUserQAResponse_QNAME = new QName("http://ws.waei.uba.com/", "createNewOrUpdateUserQAResponse");
    private final static QName _CreateNewEntrustUser_QNAME = new QName("http://ws.waei.uba.com/", "createNewEntrustUser");
    private final static QName _AuthBiometric_QNAME = new QName("http://ws.waei.uba.com/", "authBiometric");
    private final static QName _AddBiometricDataResponse_QNAME = new QName("http://ws.waei.uba.com/", "addBiometricDataResponse");
    private final static QName _CreateNewEntrustUserResponse_QNAME = new QName("http://ws.waei.uba.com/", "createNewEntrustUserResponse");
    private final static QName _ViewOTP_QNAME = new QName("http://ws.waei.uba.com/", "viewOTP");
    private final static QName _AuthBiometricResponse_QNAME = new QName("http://ws.waei.uba.com/", "authBiometricResponse");
    private final static QName _AuthenticateOTPResponse_QNAME = new QName("http://ws.waei.uba.com/", "authenticateOTPResponse");
    private final static QName _CreateAuthenticationSecreet_QNAME = new QName("http://ws.waei.uba.com/", "createAuthenticationSecreet");
    private final static QName _AddBiometricData_QNAME = new QName("http://ws.waei.uba.com/", "addBiometricData");
    private final static QName _AdaptiveAuthenticationResponse_QNAME = new QName("http://ws.waei.uba.com/", "adaptiveAuthenticationResponse");
    private final static QName _UserSetCallParms_QNAME = new QName("http://ws.waei.uba.com/", "userSetCallParms");
    private final static QName _FetchAuthenticationSecreetResponse_QNAME = new QName("http://ws.waei.uba.com/", "fetchAuthenticationSecreetResponse");
    private final static QName _ViewOTPResponse_QNAME = new QName("http://ws.waei.uba.com/", "viewOTPResponse");
    private final static QName _CreateNewCorporateEntrustUserResponse_QNAME = new QName("http://ws.waei.uba.com/", "createNewCorporateEntrustUserResponse");
    private final static QName _AuthenticateAdaptiveSecurityQuestion_QNAME = new QName("http://ws.waei.uba.com/", "authenticateAdaptiveSecurityQuestion");
    private final static QName _UserSetCallParmsResponse_QNAME = new QName("http://ws.waei.uba.com/", "userSetCallParmsResponse");
    private final static QName _GenerateOTPResponse_QNAME = new QName("http://ws.waei.uba.com/", "generateOTPResponse");
    private final static QName _CreateEntrustUser_QNAME = new QName("http://ws.waei.uba.com/", "createEntrustUser");
    private final static QName _UpdateOrCreateuserContactInfoResponse_QNAME = new QName("http://ws.waei.uba.com/", "updateOrCreateuserContactInfoResponse");
    private final static QName _CreateEntrustUserResponse_QNAME = new QName("http://ws.waei.uba.com/", "createEntrustUserResponse");
    private final static QName _GenerateOTP_QNAME = new QName("http://ws.waei.uba.com/", "generateOTP");
    private final static QName _AuthenticateTokenResponse_QNAME = new QName("http://ws.waei.uba.com/", "authenticateTokenResponse");
    private final static QName _GetOneSecurityQuestionResponse_QNAME = new QName("http://ws.waei.uba.com/", "getOneSecurityQuestionResponse");
    private final static QName _CreateNewOrUpdateUserQA_QNAME = new QName("http://ws.waei.uba.com/", "createNewOrUpdateUserQA");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://ws.waei.uba.com/", "deleteUserResponse");
    private final static QName _SynchronizeToken_QNAME = new QName("http://ws.waei.uba.com/", "synchronizeToken");
    private final static QName _AuthenticateSecurityQuestion_QNAME = new QName("http://ws.waei.uba.com/", "authenticateSecurityQuestion");
    private final static QName _GetOneSecurityQuestion_QNAME = new QName("http://ws.waei.uba.com/", "getOneSecurityQuestion");
    private final static QName _AuthenticateSecurityQuestionResponse_QNAME = new QName("http://ws.waei.uba.com/", "authenticateSecurityQuestionResponse");
    private final static QName _DeleteUser_QNAME = new QName("http://ws.waei.uba.com/", "deleteUser");
    private final static QName _SynchronizeTokenResponse_QNAME = new QName("http://ws.waei.uba.com/", "synchronizeTokenResponse");
    private final static QName _AuthenticateToken_QNAME = new QName("http://ws.waei.uba.com/", "authenticateToken");
    private final static QName _UserSetAliases_QNAME = new QName("", "aliases");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uba.waei.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateNewCorporateEntrustUser }
     * 
     */
    public CreateNewCorporateEntrustUser createCreateNewCorporateEntrustUser() {
        return new CreateNewCorporateEntrustUser();
    }

    /**
     * Create an instance of {@link AuthenticateAdaptiveSecurityQuestionResponse }
     * 
     */
    public AuthenticateAdaptiveSecurityQuestionResponse createAuthenticateAdaptiveSecurityQuestionResponse() {
        return new AuthenticateAdaptiveSecurityQuestionResponse();
    }

    /**
     * Create an instance of {@link AdaptiveAuthentication }
     * 
     */
    public AdaptiveAuthentication createAdaptiveAuthentication() {
        return new AdaptiveAuthentication();
    }

    /**
     * Create an instance of {@link AuthenticateOTP }
     * 
     */
    public AuthenticateOTP createAuthenticateOTP() {
        return new AuthenticateOTP();
    }

    /**
     * Create an instance of {@link CreateAuthenticationSecreetResponse }
     * 
     */
    public CreateAuthenticationSecreetResponse createCreateAuthenticationSecreetResponse() {
        return new CreateAuthenticationSecreetResponse();
    }

    /**
     * Create an instance of {@link UpdateOrCreateuserContactInfo }
     * 
     */
    public UpdateOrCreateuserContactInfo createUpdateOrCreateuserContactInfo() {
        return new UpdateOrCreateuserContactInfo();
    }

    /**
     * Create an instance of {@link FetchAuthenticationSecreet }
     * 
     */
    public FetchAuthenticationSecreet createFetchAuthenticationSecreet() {
        return new FetchAuthenticationSecreet();
    }

    /**
     * Create an instance of {@link CreateNewEntrustUser }
     * 
     */
    public CreateNewEntrustUser createCreateNewEntrustUser() {
        return new CreateNewEntrustUser();
    }

    /**
     * Create an instance of {@link CreateNewOrUpdateUserQAResponse }
     * 
     */
    public CreateNewOrUpdateUserQAResponse createCreateNewOrUpdateUserQAResponse() {
        return new CreateNewOrUpdateUserQAResponse();
    }

    /**
     * Create an instance of {@link GetContactInfoResponse }
     * 
     */
    public GetContactInfoResponse createGetContactInfoResponse() {
        return new GetContactInfoResponse();
    }

    /**
     * Create an instance of {@link GetContactInfoRespType }
     * 
     */
    public GetContactInfoRespType createGetContactInfoRespType() {
        return new GetContactInfoRespType();
    }

    /**
     * Create an instance of {@link AuthenticateOTPResponse }
     * 
     */
    public AuthenticateOTPResponse createAuthenticateOTPResponse() {
        return new AuthenticateOTPResponse();
    }

    /**
     * Create an instance of {@link CreateAuthenticationSecreet }
     * 
     */
    public CreateAuthenticationSecreet createCreateAuthenticationSecreet() {
        return new CreateAuthenticationSecreet();
    }

    /**
     * Create an instance of {@link ViewOTP }
     * 
     */
    public ViewOTP createViewOTP() {
        return new ViewOTP();
    }

    /**
     * Create an instance of {@link AuthBiometricResponse }
     * 
     */
    public AuthBiometricResponse createAuthBiometricResponse() {
        return new AuthBiometricResponse();
    }

    /**
     * Create an instance of {@link AuthBiometric }
     * 
     */
    public AuthBiometric createAuthBiometric() {
        return new AuthBiometric();
    }

    /**
     * Create an instance of {@link AddBiometricDataResponse }
     * 
     */
    public AddBiometricDataResponse createAddBiometricDataResponse() {
        return new AddBiometricDataResponse();
    }

    /**
     * Create an instance of {@link CreateNewEntrustUserResponse }
     * 
     */
    public CreateNewEntrustUserResponse createCreateNewEntrustUserResponse() {
        return new CreateNewEntrustUserResponse();
    }

    /**
     * Create an instance of {@link UserSet }
     * 
     */
    public UserSet createUserSet() {
        return new UserSet();
    }

    /**
     * Create an instance of {@link FetchAuthenticationSecreetResponse }
     * 
     */
    public FetchAuthenticationSecreetResponse createFetchAuthenticationSecreetResponse() {
        return new FetchAuthenticationSecreetResponse();
    }

    /**
     * Create an instance of {@link AdaptiveAuthenticationResponse }
     * 
     */
    public AdaptiveAuthenticationResponse createAdaptiveAuthenticationResponse() {
        return new AdaptiveAuthenticationResponse();
    }

    /**
     * Create an instance of {@link AddBiometricData }
     * 
     */
    public AddBiometricData createAddBiometricData() {
        return new AddBiometricData();
    }

    /**
     * Create an instance of {@link GetContactInfo }
     * 
     */
    public GetContactInfo createGetContactInfo() {
        return new GetContactInfo();
    }

    /**
     * Create an instance of {@link GetContactInfoReqType }
     * 
     */
    public GetContactInfoReqType createGetContactInfoReqType() {
        return new GetContactInfoReqType();
    }

    /**
     * Create an instance of {@link UserSetResponse }
     * 
     */
    public UserSetResponse createUserSetResponse() {
        return new UserSetResponse();
    }

    /**
     * Create an instance of {@link AuthenticateAdaptiveSecurityQuestion }
     * 
     */
    public AuthenticateAdaptiveSecurityQuestion createAuthenticateAdaptiveSecurityQuestion() {
        return new AuthenticateAdaptiveSecurityQuestion();
    }

    /**
     * Create an instance of {@link CreateNewCorporateEntrustUserResponse }
     * 
     */
    public CreateNewCorporateEntrustUserResponse createCreateNewCorporateEntrustUserResponse() {
        return new CreateNewCorporateEntrustUserResponse();
    }

    /**
     * Create an instance of {@link ViewOTPResponse }
     * 
     */
    public ViewOTPResponse createViewOTPResponse() {
        return new ViewOTPResponse();
    }

    /**
     * Create an instance of {@link AuthenticateTokenResponse }
     * 
     */
    public AuthenticateTokenResponse createAuthenticateTokenResponse() {
        return new AuthenticateTokenResponse();
    }

    /**
     * Create an instance of {@link GetOneSecurityQuestionResponse }
     * 
     */
    public GetOneSecurityQuestionResponse createGetOneSecurityQuestionResponse() {
        return new GetOneSecurityQuestionResponse();
    }

    /**
     * Create an instance of {@link CreateEntrustUserResponse }
     * 
     */
    public CreateEntrustUserResponse createCreateEntrustUserResponse() {
        return new CreateEntrustUserResponse();
    }

    /**
     * Create an instance of {@link GenerateOTP }
     * 
     */
    public GenerateOTP createGenerateOTP() {
        return new GenerateOTP();
    }

    /**
     * Create an instance of {@link GenerateOTPResponse }
     * 
     */
    public GenerateOTPResponse createGenerateOTPResponse() {
        return new GenerateOTPResponse();
    }

    /**
     * Create an instance of {@link CreateEntrustUser }
     * 
     */
    public CreateEntrustUser createCreateEntrustUser() {
        return new CreateEntrustUser();
    }

    /**
     * Create an instance of {@link UpdateOrCreateuserContactInfoResponse }
     * 
     */
    public UpdateOrCreateuserContactInfoResponse createUpdateOrCreateuserContactInfoResponse() {
        return new UpdateOrCreateuserContactInfoResponse();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link SynchronizeTokenResponse }
     * 
     */
    public SynchronizeTokenResponse createSynchronizeTokenResponse() {
        return new SynchronizeTokenResponse();
    }

    /**
     * Create an instance of {@link AuthenticateToken }
     * 
     */
    public AuthenticateToken createAuthenticateToken() {
        return new AuthenticateToken();
    }

    /**
     * Create an instance of {@link GetOneSecurityQuestion }
     * 
     */
    public GetOneSecurityQuestion createGetOneSecurityQuestion() {
        return new GetOneSecurityQuestion();
    }

    /**
     * Create an instance of {@link AuthenticateSecurityQuestionResponse }
     * 
     */
    public AuthenticateSecurityQuestionResponse createAuthenticateSecurityQuestionResponse() {
        return new AuthenticateSecurityQuestionResponse();
    }

    /**
     * Create an instance of {@link AuthenticateSecurityQuestion }
     * 
     */
    public AuthenticateSecurityQuestion createAuthenticateSecurityQuestion() {
        return new AuthenticateSecurityQuestion();
    }

    /**
     * Create an instance of {@link CreateNewOrUpdateUserQA }
     * 
     */
    public CreateNewOrUpdateUserQA createCreateNewOrUpdateUserQA() {
        return new CreateNewOrUpdateUserQA();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link SynchronizeToken }
     * 
     */
    public SynchronizeToken createSynchronizeToken() {
        return new SynchronizeToken();
    }

    /**
     * Create an instance of {@link OtpRequest }
     * 
     */
    public OtpRequest createOtpRequest() {
        return new OtpRequest();
    }

    /**
     * Create an instance of {@link UserContactDetailList }
     * 
     */
    public UserContactDetailList createUserContactDetailList() {
        return new UserContactDetailList();
    }

    /**
     * Create an instance of {@link PaRequest }
     * 
     */
    public PaRequest createPaRequest() {
        return new PaRequest();
    }

    /**
     * Create an instance of {@link ResetToken }
     * 
     */
    public ResetToken createResetToken() {
        return new ResetToken();
    }

    /**
     * Create an instance of {@link ListOfXsdAlias }
     * 
     */
    public ListOfXsdAlias createListOfXsdAlias() {
        return new ListOfXsdAlias();
    }

    /**
     * Create an instance of {@link NameValue }
     * 
     */
    public NameValue createNameValue() {
        return new NameValue();
    }

    /**
     * Create an instance of {@link RetailUser }
     * 
     */
    public RetailUser createRetailUser() {
        return new RetailUser();
    }

    /**
     * Create an instance of {@link DeleteUserRequest }
     * 
     */
    public DeleteUserRequest createDeleteUserRequest() {
        return new DeleteUserRequest();
    }

    /**
     * Create an instance of {@link GetOneSecurityQuestionRequest }
     * 
     */
    public GetOneSecurityQuestionRequest createGetOneSecurityQuestionRequest() {
        return new GetOneSecurityQuestionRequest();
    }

    /**
     * Create an instance of {@link AdaptiveAuthenticationRequest }
     * 
     */
    public AdaptiveAuthenticationRequest createAdaptiveAuthenticationRequest() {
        return new AdaptiveAuthenticationRequest();
    }

    /**
     * Create an instance of {@link AuthenticateTokenRequest }
     * 
     */
    public AuthenticateTokenRequest createAuthenticateTokenRequest() {
        return new AuthenticateTokenRequest();
    }

    /**
     * Create an instance of {@link QaRequest }
     * 
     */
    public QaRequest createQaRequest() {
        return new QaRequest();
    }

    /**
     * Create an instance of {@link CorporateUser }
     * 
     */
    public CorporateUser createCorporateUser() {
        return new CorporateUser();
    }

    /**
     * Create an instance of {@link QandA }
     * 
     */
    public QandA createQandA() {
        return new QandA();
    }

    /**
     * Create an instance of {@link BinaryResponse }
     * 
     */
    public BinaryResponse createBinaryResponse() {
        return new BinaryResponse();
    }

    /**
     * Create an instance of {@link UserContactDetails }
     * 
     */
    public UserContactDetails createUserContactDetails() {
        return new UserContactDetails();
    }

    /**
     * Create an instance of {@link AuthenticateSecurityQuestionRequest }
     * 
     */
    public AuthenticateSecurityQuestionRequest createAuthenticateSecurityQuestionRequest() {
        return new AuthenticateSecurityQuestionRequest();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchAuthenticationSecreet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "fetchAuthenticationSecreet")
    public JAXBElement<FetchAuthenticationSecreet> createFetchAuthenticationSecreet(FetchAuthenticationSecreet value) {
        return new JAXBElement<FetchAuthenticationSecreet>(_FetchAuthenticationSecreet_QNAME, FetchAuthenticationSecreet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdaptiveAuthentication }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "adaptiveAuthentication")
    public JAXBElement<AdaptiveAuthentication> createAdaptiveAuthentication(AdaptiveAuthentication value) {
        return new JAXBElement<AdaptiveAuthentication>(_AdaptiveAuthentication_QNAME, AdaptiveAuthentication.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateOTP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authenticateOTP")
    public JAXBElement<AuthenticateOTP> createAuthenticateOTP(AuthenticateOTP value) {
        return new JAXBElement<AuthenticateOTP>(_AuthenticateOTP_QNAME, AuthenticateOTP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAuthenticationSecreetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createAuthenticationSecreetResponse")
    public JAXBElement<CreateAuthenticationSecreetResponse> createCreateAuthenticationSecreetResponse(CreateAuthenticationSecreetResponse value) {
        return new JAXBElement<CreateAuthenticationSecreetResponse>(_CreateAuthenticationSecreetResponse_QNAME, CreateAuthenticationSecreetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrCreateuserContactInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "updateOrCreateuserContactInfo")
    public JAXBElement<UpdateOrCreateuserContactInfo> createUpdateOrCreateuserContactInfo(UpdateOrCreateuserContactInfo value) {
        return new JAXBElement<UpdateOrCreateuserContactInfo>(_UpdateOrCreateuserContactInfo_QNAME, UpdateOrCreateuserContactInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewCorporateEntrustUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createNewCorporateEntrustUser")
    public JAXBElement<CreateNewCorporateEntrustUser> createCreateNewCorporateEntrustUser(CreateNewCorporateEntrustUser value) {
        return new JAXBElement<CreateNewCorporateEntrustUser>(_CreateNewCorporateEntrustUser_QNAME, CreateNewCorporateEntrustUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateAdaptiveSecurityQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authenticateAdaptiveSecurityQuestionResponse")
    public JAXBElement<AuthenticateAdaptiveSecurityQuestionResponse> createAuthenticateAdaptiveSecurityQuestionResponse(AuthenticateAdaptiveSecurityQuestionResponse value) {
        return new JAXBElement<AuthenticateAdaptiveSecurityQuestionResponse>(_AuthenticateAdaptiveSecurityQuestionResponse_QNAME, AuthenticateAdaptiveSecurityQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewOrUpdateUserQAResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createNewOrUpdateUserQAResponse")
    public JAXBElement<CreateNewOrUpdateUserQAResponse> createCreateNewOrUpdateUserQAResponse(CreateNewOrUpdateUserQAResponse value) {
        return new JAXBElement<CreateNewOrUpdateUserQAResponse>(_CreateNewOrUpdateUserQAResponse_QNAME, CreateNewOrUpdateUserQAResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewEntrustUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createNewEntrustUser")
    public JAXBElement<CreateNewEntrustUser> createCreateNewEntrustUser(CreateNewEntrustUser value) {
        return new JAXBElement<CreateNewEntrustUser>(_CreateNewEntrustUser_QNAME, CreateNewEntrustUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthBiometric }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authBiometric")
    public JAXBElement<AuthBiometric> createAuthBiometric(AuthBiometric value) {
        return new JAXBElement<AuthBiometric>(_AuthBiometric_QNAME, AuthBiometric.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBiometricDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "addBiometricDataResponse")
    public JAXBElement<AddBiometricDataResponse> createAddBiometricDataResponse(AddBiometricDataResponse value) {
        return new JAXBElement<AddBiometricDataResponse>(_AddBiometricDataResponse_QNAME, AddBiometricDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewEntrustUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createNewEntrustUserResponse")
    public JAXBElement<CreateNewEntrustUserResponse> createCreateNewEntrustUserResponse(CreateNewEntrustUserResponse value) {
        return new JAXBElement<CreateNewEntrustUserResponse>(_CreateNewEntrustUserResponse_QNAME, CreateNewEntrustUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewOTP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "viewOTP")
    public JAXBElement<ViewOTP> createViewOTP(ViewOTP value) {
        return new JAXBElement<ViewOTP>(_ViewOTP_QNAME, ViewOTP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthBiometricResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authBiometricResponse")
    public JAXBElement<AuthBiometricResponse> createAuthBiometricResponse(AuthBiometricResponse value) {
        return new JAXBElement<AuthBiometricResponse>(_AuthBiometricResponse_QNAME, AuthBiometricResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateOTPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authenticateOTPResponse")
    public JAXBElement<AuthenticateOTPResponse> createAuthenticateOTPResponse(AuthenticateOTPResponse value) {
        return new JAXBElement<AuthenticateOTPResponse>(_AuthenticateOTPResponse_QNAME, AuthenticateOTPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAuthenticationSecreet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createAuthenticationSecreet")
    public JAXBElement<CreateAuthenticationSecreet> createCreateAuthenticationSecreet(CreateAuthenticationSecreet value) {
        return new JAXBElement<CreateAuthenticationSecreet>(_CreateAuthenticationSecreet_QNAME, CreateAuthenticationSecreet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddBiometricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "addBiometricData")
    public JAXBElement<AddBiometricData> createAddBiometricData(AddBiometricData value) {
        return new JAXBElement<AddBiometricData>(_AddBiometricData_QNAME, AddBiometricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdaptiveAuthenticationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "adaptiveAuthenticationResponse")
    public JAXBElement<AdaptiveAuthenticationResponse> createAdaptiveAuthenticationResponse(AdaptiveAuthenticationResponse value) {
        return new JAXBElement<AdaptiveAuthenticationResponse>(_AdaptiveAuthenticationResponse_QNAME, AdaptiveAuthenticationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "userSetCallParms")
    public JAXBElement<UserSet> createUserSetCallParms(UserSet value) {
        return new JAXBElement<UserSet>(_UserSetCallParms_QNAME, UserSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchAuthenticationSecreetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "fetchAuthenticationSecreetResponse")
    public JAXBElement<FetchAuthenticationSecreetResponse> createFetchAuthenticationSecreetResponse(FetchAuthenticationSecreetResponse value) {
        return new JAXBElement<FetchAuthenticationSecreetResponse>(_FetchAuthenticationSecreetResponse_QNAME, FetchAuthenticationSecreetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewOTPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "viewOTPResponse")
    public JAXBElement<ViewOTPResponse> createViewOTPResponse(ViewOTPResponse value) {
        return new JAXBElement<ViewOTPResponse>(_ViewOTPResponse_QNAME, ViewOTPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewCorporateEntrustUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createNewCorporateEntrustUserResponse")
    public JAXBElement<CreateNewCorporateEntrustUserResponse> createCreateNewCorporateEntrustUserResponse(CreateNewCorporateEntrustUserResponse value) {
        return new JAXBElement<CreateNewCorporateEntrustUserResponse>(_CreateNewCorporateEntrustUserResponse_QNAME, CreateNewCorporateEntrustUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateAdaptiveSecurityQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authenticateAdaptiveSecurityQuestion")
    public JAXBElement<AuthenticateAdaptiveSecurityQuestion> createAuthenticateAdaptiveSecurityQuestion(AuthenticateAdaptiveSecurityQuestion value) {
        return new JAXBElement<AuthenticateAdaptiveSecurityQuestion>(_AuthenticateAdaptiveSecurityQuestion_QNAME, AuthenticateAdaptiveSecurityQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "userSetCallParmsResponse")
    public JAXBElement<UserSetResponse> createUserSetCallParmsResponse(UserSetResponse value) {
        return new JAXBElement<UserSetResponse>(_UserSetCallParmsResponse_QNAME, UserSetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateOTPResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "generateOTPResponse")
    public JAXBElement<GenerateOTPResponse> createGenerateOTPResponse(GenerateOTPResponse value) {
        return new JAXBElement<GenerateOTPResponse>(_GenerateOTPResponse_QNAME, GenerateOTPResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEntrustUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createEntrustUser")
    public JAXBElement<CreateEntrustUser> createCreateEntrustUser(CreateEntrustUser value) {
        return new JAXBElement<CreateEntrustUser>(_CreateEntrustUser_QNAME, CreateEntrustUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrCreateuserContactInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "updateOrCreateuserContactInfoResponse")
    public JAXBElement<UpdateOrCreateuserContactInfoResponse> createUpdateOrCreateuserContactInfoResponse(UpdateOrCreateuserContactInfoResponse value) {
        return new JAXBElement<UpdateOrCreateuserContactInfoResponse>(_UpdateOrCreateuserContactInfoResponse_QNAME, UpdateOrCreateuserContactInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEntrustUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createEntrustUserResponse")
    public JAXBElement<CreateEntrustUserResponse> createCreateEntrustUserResponse(CreateEntrustUserResponse value) {
        return new JAXBElement<CreateEntrustUserResponse>(_CreateEntrustUserResponse_QNAME, CreateEntrustUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateOTP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "generateOTP")
    public JAXBElement<GenerateOTP> createGenerateOTP(GenerateOTP value) {
        return new JAXBElement<GenerateOTP>(_GenerateOTP_QNAME, GenerateOTP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authenticateTokenResponse")
    public JAXBElement<AuthenticateTokenResponse> createAuthenticateTokenResponse(AuthenticateTokenResponse value) {
        return new JAXBElement<AuthenticateTokenResponse>(_AuthenticateTokenResponse_QNAME, AuthenticateTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOneSecurityQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "getOneSecurityQuestionResponse")
    public JAXBElement<GetOneSecurityQuestionResponse> createGetOneSecurityQuestionResponse(GetOneSecurityQuestionResponse value) {
        return new JAXBElement<GetOneSecurityQuestionResponse>(_GetOneSecurityQuestionResponse_QNAME, GetOneSecurityQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateNewOrUpdateUserQA }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "createNewOrUpdateUserQA")
    public JAXBElement<CreateNewOrUpdateUserQA> createCreateNewOrUpdateUserQA(CreateNewOrUpdateUserQA value) {
        return new JAXBElement<CreateNewOrUpdateUserQA>(_CreateNewOrUpdateUserQA_QNAME, CreateNewOrUpdateUserQA.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SynchronizeToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "synchronizeToken")
    public JAXBElement<SynchronizeToken> createSynchronizeToken(SynchronizeToken value) {
        return new JAXBElement<SynchronizeToken>(_SynchronizeToken_QNAME, SynchronizeToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateSecurityQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authenticateSecurityQuestion")
    public JAXBElement<AuthenticateSecurityQuestion> createAuthenticateSecurityQuestion(AuthenticateSecurityQuestion value) {
        return new JAXBElement<AuthenticateSecurityQuestion>(_AuthenticateSecurityQuestion_QNAME, AuthenticateSecurityQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOneSecurityQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "getOneSecurityQuestion")
    public JAXBElement<GetOneSecurityQuestion> createGetOneSecurityQuestion(GetOneSecurityQuestion value) {
        return new JAXBElement<GetOneSecurityQuestion>(_GetOneSecurityQuestion_QNAME, GetOneSecurityQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateSecurityQuestionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authenticateSecurityQuestionResponse")
    public JAXBElement<AuthenticateSecurityQuestionResponse> createAuthenticateSecurityQuestionResponse(AuthenticateSecurityQuestionResponse value) {
        return new JAXBElement<AuthenticateSecurityQuestionResponse>(_AuthenticateSecurityQuestionResponse_QNAME, AuthenticateSecurityQuestionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SynchronizeTokenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "synchronizeTokenResponse")
    public JAXBElement<SynchronizeTokenResponse> createSynchronizeTokenResponse(SynchronizeTokenResponse value) {
        return new JAXBElement<SynchronizeTokenResponse>(_SynchronizeTokenResponse_QNAME, SynchronizeTokenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticateToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.waei.uba.com/", name = "authenticateToken")
    public JAXBElement<AuthenticateToken> createAuthenticateToken(AuthenticateToken value) {
        return new JAXBElement<AuthenticateToken>(_AuthenticateToken_QNAME, AuthenticateToken.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfXsdAlias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "aliases", scope = UserSet.class)
    public JAXBElement<ListOfXsdAlias> createUserSetAliases(ListOfXsdAlias value) {
        return new JAXBElement<ListOfXsdAlias>(_UserSetAliases_QNAME, ListOfXsdAlias.class, UserSet.class, value);
    }

}
