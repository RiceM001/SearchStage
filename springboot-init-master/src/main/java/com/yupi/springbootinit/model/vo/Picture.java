package com.yupi.springbootinit.model.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Picture implements Serializable {

    private String title;
    private String url;
}
