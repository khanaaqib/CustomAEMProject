package com.adobe.aem.custom.project.core.models;

import com.day.cq.search.QueryBuilder;
import com.day.cq.wcm.api.Page;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.*;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderComponentModel {
    @Inject
    private String logoImage;

    @Inject
    private String homePageTitle;

    @Inject
    private String homePageUrl;

    @Inject
    private String aboutUsTitle;

    @Inject
    private String aboutUsPageUrl;

    @Inject
    private List<HeaderSubNavigationModel> aboutUsSubNavigation;

    @Inject
    private String signupPageTitle;

    @Inject
    private String signupPageUrl;

    @Inject
    private String loginPageTitle;

    @Inject
    private String loginPageUrl;

    public String getLogoImage() {
        return logoImage;
    }

    public String getHomePageTitle() {
        return homePageTitle;
    }

    public String getHomePageUrl() {
        return homePageUrl;
    }

    public String getAboutUsTitle() {
        return aboutUsTitle;
    }

    public String getAboutUsPageUrl() {
        return aboutUsPageUrl;
    }

    public String getSignupPageTitle() {
        return signupPageTitle;
    }

    public String getSignupPageUrl() {
        return signupPageUrl;
    }

    public String getLoginPageTitle() {
        return loginPageTitle;
    }

    public String getLoginPageUrl() {
        return loginPageUrl;
    }

    public List<HeaderSubNavigationModel> getAboutUsSubNavigation() {
        return aboutUsSubNavigation;
    }
}
