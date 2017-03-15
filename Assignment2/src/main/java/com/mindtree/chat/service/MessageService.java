package com.mindtree.chat.service;

import java.util.List;

import com.mindtree.chat.domain.ChatMessage;

public interface MessageService {
    public ChatMessage getMessage(Long messageId);
    public List<ChatMessage> getRecentMessages(int limit);
    public void addMessage(ChatMessage message);
    public StringBuilder fetchChatHistory(int limit);
}
