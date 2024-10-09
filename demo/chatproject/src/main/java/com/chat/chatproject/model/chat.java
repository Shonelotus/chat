package com.chat.chatproject.model;

public class chat 
{

    private int id;
    private String name;
    private boolean isGroup;
    private String createdAt;


    /**
     * costruttori della classe chat
     */
    public chat() 
    {
        this.id = 0;
        this.name = "";
        this.isGroup = false;
        this.createdAt = "";
    }


    public chat(int id, String name, boolean isGroup, String createdAt)
    {
        this.id = id;
        this.name = name;
        this.isGroup = isGroup;
        this.createdAt = createdAt;
    }



    /**
     * getter e setter della classe chat
     * @return
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isGroup() {
        return isGroup;
    }
    public void setGroup(boolean isGroup) {
        this.isGroup = isGroup;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }


}
