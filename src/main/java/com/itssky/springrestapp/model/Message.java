package com.itssky.springrestapp.model;

import java.io.Serializable;

/**
 * Created by quentin on 08/04/2021
 **/
public class Message implements Serializable {
    private String author, content;

    public Message(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
