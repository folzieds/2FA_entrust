package com.phos.entrust.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(namespace = Authentication.AUTH_NS)
public class Authentication {

    //Add the namespace
    public static final String AUTH_NS = "http://ws.waei.uba.com/";

    @XmlElement(namespace = AUTH_NS)
    private String username;

    @XmlElement(namespace = AUTH_NS)
    private String password;

    @XmlElement(namespace = AUTH_NS)
    private String authenticationType;

    public Authentication() {
    }


    public Authentication(String username, String password, String authenticationType) {
        this.username = username;
        this.password = password;
        this.authenticationType = authenticationType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }
}
