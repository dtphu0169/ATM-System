package common;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import Model.Date;
import Model.Trade;
import Model.TradeTransfer;
import Model.TradeWithdrawals;


public class TradeIO {
	private String path = "src/common/DataTrade";
	private static TradeIO instance;
	
	private TradeIO() {
		// TODO Auto-generated constructor stub
	}
	
	public static TradeIO getInstance() {
		if (instance == null) {
			instance = new TradeIO();
		}
		return instance;
	}

	public ArrayList<Trade> RestoreDataTrade() {
		ArrayList<Trade> result = new ArrayList<Trade>();

		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF8");
			BufferedReader br = new BufferedReader(isr);

			String line = br.readLine();
			while (line != null) {
				String[] arr = line.split(";");
				Trade tr = null;

				checktrade: if (arr.length == 6) {
					String[] arrdate = arr[4].split("/");
					
					if (arr[1].equals("0")) {
						tr = new TradeWithdrawals(Integer.parseInt(arr[0]), Integer.parseInt(arr[2]),
								Double.parseDouble(arr[3]),
								new Date(arrdate[0], arrdate[1], arrdate[2], arrdate[3], arrdate[4], arrdate[5]),Double.parseDouble(arr[5]));
						break checktrade;
					}

					tr = new TradeTransfer(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]),
							Double.parseDouble(arr[3]),
							new Date(arrdate[0], arrdate[1], arrdate[2], arrdate[3], arrdate[4], arrdate[5]),Double.parseDouble(arr[5]));

				}
				if (tr != null)
					result.add(tr);

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

	public void SaveDataTrade(List<Trade> lstTrade) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);

			for (Trade trade : lstTrade) {
				String line = trade.getID() + ";" + trade.getSender() + ";" + trade.getReceiver() + ";"
						+ trade.getMoney() + ";" + trade.getDate()+";"+
						+ trade.getTransferFees();
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
