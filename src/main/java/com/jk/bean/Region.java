package com.jk.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Region implements Serializable {
    private Integer id;

    private String name;
}
