package com.chatapplication.service.message;

import com.chatapplication.data.models.Message;
import com.chatapplication.web.exceptions.ChatException;
import com.chatapplication.web.dto.MessageDto;


public interface MessageService {

    Message createMessage(MessageDto messageDto) throws Exception, ChatException;

//      Message addMessage(MessageDto messageDto);
//    Message sendMessage(MessageDto messageDto);

//    boolean deleteMessage(Long messageId);
}
