package com.alwayslearn.blog.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards/{boardsId}/posts/{postId}/comments")
public class CommentController {
}
