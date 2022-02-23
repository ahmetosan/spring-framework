package com.cydeo.proxy;

import com.cydeo.model.Comment;

public class EmailCommentNotificationProxy implements  CommentNotificationProxy{
@Override
    public void sentComment(Comment comment) {
     System.out.println("sending notification for comment  :"  + comment.getText());
}
}
