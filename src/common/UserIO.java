package common;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import Model.AccountType;
import Model.User;

public class UserIO {
	private String path = "src/common/DataUser";
	private static UserIO instance;
	private UserIO() {
		// TODO Auto-generated constructor stub
	}
	
	public static UserIO getInstance() {
		if (instance == null) {
			instance = new UserIO();
		}
		return instance;
	}
	
	public ArrayList<User> RestoreDateUser(){
		ArrayList<User> result = new ArrayList<User>();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String line = br.readLine();
			while(line != null) {
				String[] arr = line.split(";");
				if (arr.length == 6) {
					AccountType accounttype = (Integer.parseInt(arr[5]) == 1 ?  AccountType.BUSINESS : AccountType.ECONOMY);
					User user = new User(Integer.parseInt(arr[0]), arr[1], arr[2], Double.parseDouble(arr[3]),accounttype);
					user.setCountWrongLogin(Integer.parseInt(arr[4]));
					result.add(user);
				}
				line = br.readLine();
			}
			fis.close();
			isr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void SaveDataUser(List<User> lstuser) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(User user : lstuser) {
				String line = user.getID() +";"+ user.getName() +";"+ user.getPw() +";"+ 
						user.getMoney() +";"+user.getCountWrongLogin()+";"+
						+ (user.getAccountType() == AccountType.BUSINESS ? 1 : 0);
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
