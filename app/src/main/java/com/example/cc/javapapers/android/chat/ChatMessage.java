package com.example.cc.javapapers.android.chat;

public class ChatMessage {
	public boolean left;
	public String message;
	public String time;

	public ChatMessage(boolean left, String message, String time) {
		super();
		this.left = left;
		this.message = message;
		this.time = time;
	}
}