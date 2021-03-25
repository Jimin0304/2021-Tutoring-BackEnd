package com.alwayslearn.blog.contorller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/boards/{boardsId}/posts/{postId}/comments")
public class CommentController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public void getComments(@RequestParam(required = false) long size, @PathVariable String boardsId, @PathVariable String postId){

    }
}
