package com.mindlinksoft.recruitment.mychat.models;

import java.util.Collection;
import java.util.List;

/**
 * Represents the model of a conversation.
 */
public final class Conversation {
    /**
     * The name of the conversation.
     */
    public String name;

    /**
     * The messages in the conversation.
     */
    public Collection<Message> messages;


    /**
     * Public variable which can show the summary of the conversation 
     */
    public Collection<Activity> activity;

    public void addReport(Collection<Activity> activity) {
        this.activity = activity;
    }

    public List<Message> getMessages() {
        return (List<Message>) this.messages;
    }


    /**
     * Initializes a new instance of the {@link Conversation} class.
     * 
     * @param name     The name of the conversation.
     * @param messages The messages in the conversation.
     */
    public Conversation(String name, Collection<Message> messages) {
        this.name = name;
        this.messages = messages;
    }
}
