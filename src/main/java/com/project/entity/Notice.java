package com.project.entity;

import javax.persistence.*;

/*
     招新公告
 */
@Entity
@Table(name = "notice")
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long lab_id;// 实验室ID
    private String info;//公告内容
}
