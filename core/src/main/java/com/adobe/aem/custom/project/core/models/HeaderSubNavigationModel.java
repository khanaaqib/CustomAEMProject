package com.adobe.aem.custom.project.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderSubNavigationModel {

    @Inject
    private String aboutUsSubNavTitle;

    @Inject
    private String aboutUsSubNavUrl;

    @Inject
    private List<HeaderSubNavigationChildModel> subNavChild;

    public String getAboutUsSubNavTitle() {
        return aboutUsSubNavTitle;
    }

    public String getAboutUsSubNavUrl() {
        return aboutUsSubNavUrl;
    }

    public List<HeaderSubNavigationChildModel> getSubNavChild() {
        return subNavChild;
    }
}
