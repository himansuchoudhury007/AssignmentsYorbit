package com.mindtree.chat.dao;

import java.util.List;

import com.mindtree.chat.domain.ChatMessage;


public interface MessageDao {
    public ChatMessage getMessage(Long messageId);
    public void addMessage(ChatMessage message);
    public List<ChatMessage> getRecentMessages(int limit);
}
