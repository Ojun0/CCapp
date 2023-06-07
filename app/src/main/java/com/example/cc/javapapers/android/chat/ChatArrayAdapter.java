package com.example.cc.javapapers.android.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.cc.R;

import java.util.ArrayList;
import java.util.List;

public class ChatArrayAdapter extends ArrayAdapter<ChatMessage> {

	private TextView chatText;
	private List<ChatMessage> chatMessageList = new ArrayList<ChatMessage>();
	private LinearLayout singleMessageContainer;
	private LinearLayout ImageMessageContainer;
	private TextView timeTextView;
	private TextView imageTimeTextView;
	private ImageView imageView;



	@Override
	public void add(ChatMessage object) {
		chatMessageList.add(object);
		super.add(object);
	}

	public ChatArrayAdapter(Context context, int textViewResourceId) {
		super(context, textViewResourceId);
	}

	public int getCount() {
		return this.chatMessageList.size();
	}

	public ChatMessage getItem(int index) {
		return this.chatMessageList.get(index);
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		if (row == null) {
			LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.activity_chat_singlemessage, parent, false);
		}
		ChatMessage chatMessageObj = getItem(position);

		singleMessageContainer = (LinearLayout) row.findViewById(R.id.singleMessageContainer);
		timeTextView = row.findViewById(R.id.time_textView);
		chatText = (TextView) row.findViewById(R.id.singleMessage);
		chatText.setText(chatMessageObj.message);
		timeTextView.setText(chatMessageObj.time);
		chatText.setBackgroundResource(chatMessageObj.left ? R.drawable.bubble_b : R.drawable.bubble_a);
		singleMessageContainer.setGravity(chatMessageObj.left ? Gravity.LEFT : Gravity.RIGHT);

		ImageMessageContainer = row.findViewById(R.id.ImageMessageContainer);
		imageView = row.findViewById(R.id.imageView);
		imageTimeTextView = row.findViewById(R.id.image_time_textView);

		ImageMessageContainer.setGravity(Gravity.LEFT);
		if (chatMessageObj.message.contains("?!+-_=image")) {
			// 이미지 소스 넣기
			singleMessageContainer.setVisibility(View.GONE);
		} else {
			ImageMessageContainer.setVisibility(View.GONE);
		}
		return row;
	}

	public Bitmap decodeToBitmap(byte[] decodedByte) {
		return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
	}

}