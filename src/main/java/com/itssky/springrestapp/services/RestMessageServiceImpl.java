package com.itssky.springrestapp.services;
import com.itssky.springrestapp.model.Message;
import org.springframework.stereotype.Service;

/**
 * Created by quentin on 08/04/2021
 **/
@Service
public class RestMessageServiceImpl implements RestMessageService {
    private final Message message;

    public RestMessageServiceImpl() {
        this.message = new Message("SpringRestApp", "Hello World");
    }

    @Override
    public Message getMessage() {
        return this.message;
    }
}
