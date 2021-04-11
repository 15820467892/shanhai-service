package com.shanhai.domain;

public class Component {


    /**
     * CREATE TABLE `component` (
     *   `id` int(11) NOT NULL AUTO_INCREMENT,
     *   `software_id` int(11) DEFAULT NULL,
     *   `categories` varchar(50) DEFAULT NULL,
     *   `license` varchar(50) DEFAULT NULL,
     *   PRIMARY KEY (`id`)
     * ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
     */

    private int id;
    private int softwareId;
    private String categories;
    private String license;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(int softwareId) {
        this.softwareId = softwareId;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
