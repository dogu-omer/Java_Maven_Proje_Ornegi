package Controller;

import com.test.database.Repository;

public class Control {
	 
	public static void main(String[] args) {
		
		Repository repo=new Repository();
		repo.insert("Yasemin");
		repo.delete("Sandal");
		//repo.update("ömer doğu");
	}
	

} 
