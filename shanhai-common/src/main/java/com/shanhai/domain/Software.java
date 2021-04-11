package com.shanhai.domain;

public class Software {
    /**
     * CREATE TABLE `software` (
     *   `id` int(11) NOT NULL AUTO_INCREMENT,
     *   `name` varchar(50) DEFAULT NULL,
     *   `decription` varchar(1024) DEFAULT NULL,
     *   PRIMARY KEY (`id`)
     * ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
     */

    private int id;
    private String name;
    private String decription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }
}
