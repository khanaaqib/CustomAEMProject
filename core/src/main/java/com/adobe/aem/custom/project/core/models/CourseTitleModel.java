package com.adobe.aem.custom.project.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CourseTitleModel {

    @Inject
    private String courseTitle;

    public String getCourseTitle() {
        return courseTitle;
    }
}
