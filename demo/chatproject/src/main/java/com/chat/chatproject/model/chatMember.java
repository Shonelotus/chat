package com.chat.chatproject.model;

public class chatMember 
{
    private int userId;
    private int chatId;
    private String joinedAt;

    
    /**
     * costruttori della classe chatMember
     */
    public chatMember() 
    {
        this.userId = 0;
        this.chatId = 0;
        this.joinedAt = "";
    }


    public chatMember(int userId, int chatId, String joinedAt) {
        this.userId = userId;
        this.chatId = chatId;
        this.joinedAt = joinedAt;
    }

    
    /**
     * getter e setter della classe chatMember
     * @return
     */
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getChatId() {
        return chatId;
    }
    public void setChatId(int chatId) {
        this.chatId = chatId;
    }
    public String getJoinedAt() {
        return joinedAt;
    }
    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
    }



}
