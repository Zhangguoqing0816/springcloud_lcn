package com.example.serverc.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ServerC_Demo {
    private Long id;
    private String kid;
    private String demoField;
    private String groupId;
    private Date createTime;
    private String appName;

}