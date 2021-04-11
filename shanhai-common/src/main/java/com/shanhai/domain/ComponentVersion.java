package com.shanhai.domain;

import java.util.Date;

public class ComponentVersion {

    /**
     * CREATE TABLE `component_version` (
     *   `id` int(11) NOT NULL AUTO_INCREMENT,
     *   `group_id` varchar(50) DEFAULT NULL,
     *   `artifact_id` varchar(50) DEFAULT NULL,
     *   `version` varchar(50) DEFAULT NULL,
     *   `component_id` int(11) DEFAULT NULL,
     *   `categories` varchar(50) DEFAULT NULL,
     *   `organization` varchar(50) DEFAULT NULL,
     *   `home_page` varchar(255) DEFAULT NULL,
     *   `license` varchar(50) DEFAULT NULL,
     *   `souce_link` varchar(255) DEFAULT NULL,
     *   `files_link` varchar(255) DEFAULT NULL,
     *   `pom_xml` varchar(255) DEFAULT NULL,
     *   `release_date` datetime DEFAULT NULL,
     *   PRIMARY KEY (`id`)
     * ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
     */

    private int id;
    private String groupId;
    private String artifactId;
    private String version;
    private int componentId;
    private String categories;
    private String organization;
    private String homePage;
    private String license;
    private String souceLink;
    private String filesLink;
    private String pomXml;
    private Date releaseDate;
    private Date createDate;
    private Date updateDate;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getSouceLink() {
        return souceLink;
    }

    public void setSouceLink(String souceLink) {
        this.souceLink = souceLink;
    }

    public String getFilesLink() {
        return filesLink;
    }

    public void setFilesLink(String filesLink) {
        this.filesLink = filesLink;
    }

    public String getPomXml() {
        return pomXml;
    }

    public void setPomXml(String pomXml) {
        this.pomXml = pomXml;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }


}
