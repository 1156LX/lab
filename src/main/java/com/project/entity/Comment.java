package com.project.entity;

import javax.persistence.*;

/*
   评论留言
 */
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
}
