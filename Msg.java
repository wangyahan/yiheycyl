package com.yihe.mongo;

//import java.text.SimpleDateFormat;
//import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "msg_coll")
public class Msg {

	@Id
	private String id;

	String src_account;
	int msg_type;
	int client_type;
	int group_id;
	String recv_time;
	int data_length;
	String data;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSrc_account() {
		return src_account;
	}

	public void setSrc_account(String src_account) {
		this.src_account = src_account;
	}
	
	public int getMsg_type() {
		return msg_type;
	}

	public void setMsg_type(int msg_type) {
		this.msg_type = msg_type;
	}

	public int getClient_type() {
		return client_type;
	}

	public void setClient_type(int client_type) {
		this.client_type = client_type;
	}
	
	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	
	public String getRecv_time() {
		return recv_time;
	}

	public void setRecv_time(String recv_time) {
		this.recv_time = recv_time;
	}
	
	public int getData_length() {
		return data_length;
	}

	public void setData_length(int data_length) {
		this.data_length = data_length;
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Msg(String src_account,
					int msg_type,
					int client_type,
					int group_id,
					String recv_time,
					int data_length,
					String data) {
		super();
		this.src_account = src_account;
		this.msg_type = msg_type;
		this.client_type = client_type;
		this.group_id = group_id;
		this.recv_time = recv_time;
		this.data_length = data_length;
		this.data = data;
	}

	@Override
	public String toString() {
		return "No Use";
	}

}
