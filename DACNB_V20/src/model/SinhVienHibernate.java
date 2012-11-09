package model;

import org.eclipse.swt.widgets.DateTime;

public class SinhVienHibernate {
	
	private String name;
	private DateTime birth;
	private String email;
	private String address;
	private String schoolyear;
	private long id;
	
	// Get method
	public String getName(){
		return name;
	}
	
	public DateTime getBirth(){
		return birth;
	}
	
	public String Email(){
		return email;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getSchoolyear(){
		return schoolyear;
	}
	
	public long getId(){
		return id;
	}
	// Set method
	public void setName(String string){
		name = string;
	}
	
	public void setBirth(DateTime datetime){
		birth = datetime;
	}
	
	public void Email(String string){
		email= string;
	}
	
	public void getAddress(String string){
		address = string;
	}
	
	public void getSchoolyear(String string){
		schoolyear = string;
	}
	
	public void getId(long longid){
		id = longid;
	}
	
}
