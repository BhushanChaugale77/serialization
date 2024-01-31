package com.prowings.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class User implements Serializable {

	private int uId;
	private String name;
	private String passward;
	
	public User() {
		super();
  }

	public User(int uId, String name, String passward) {
		super();
		this.uId = uId;
		this.name = name;
		this.passward = passward;
	}
	
	private void writeObject(ObjectOutputStream oos) throws IOException
	
	{
		System.out.println(">>>>>>>>>Inside Writeobject Method<<<<<<<<<");
		oos.defaultWriteObject();
		oos.writeInt(uId);
		oos.writeUTF(name);
		String encryptedpwd = Base64.getEncoder().encodeToString(this.passward.getBytes());
		System.out.println("------->writing encrypted password : "+encryptedpwd);
		oos.writeUTF(encryptedpwd);

	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException
	{
		System.out.println(">>>>>>>>>>Inside ReadObject Method<<<<<<<<<<");
		ois.defaultReadObject();
		
		this.uId = ois.readInt();
		this.name = ois.readUTF();
		String ePwd = ois.readUTF();
		byte[] originalPwdBytes = Base64.getDecoder().decode(ePwd.getBytes());
		String originalPwd = new String(originalPwdBytes);
		this.passward = originalPwd;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassward() {
		return passward;
	}

	public void setPassward(String passward) {
		this.passward = passward;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", passward=" + passward + "]";
	}
	
	
	
}
