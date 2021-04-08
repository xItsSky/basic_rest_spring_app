package com.itssky.springrestapp.controllers;

import com.itssky.springrestapp.model.Message;
import com.itssky.springrestapp.services.RestMessageService;
import com.itssky.springrestapp.services.RestMessageServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by quentin on 08/04/2021
 **/
@RestController
public class RestMessageController {
    private final RestMessageService restMessageService;

    public RestMessageController() {
        restMessageService = new RestMessageServiceImpl();
    }

    @GetMapping("/message")
    public Message getMessage() {
        return this.restMessageService.getMessage();
    }

}
