package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.csv.grpc.CSVGrpc.CSVImplBase;
import com.csv.grpc.Csv.Empty;
import com.csv.grpc.Csv.Item;
import com.csv.grpc.Csv.ItemResponse;

import io.grpc.stub.StreamObserver;

public class CSVService extends CSVImplBase{
	


	  
	

@Override
public void getCSVStream(Empty request, StreamObserver<ItemResponse> responseObserver) {

		ItemResponse.Builder response = ItemResponse.newBuilder();
		
		try {
		
	
            URL urlCSV = new URL(
                    "https://www.stats.govt.nz/assets/Uploads/Business-price-indexes/Business-price-indexes-March-2020-quarter/Download-data/business-price-indexes-march-2020-quarter-csv.csv");
       
            URLConnection urlConn = urlCSV.openConnection();

            InputStreamReader inputCSV = new InputStreamReader(
                    ((URLConnection) urlConn).getInputStream());
         
            BufferedReader br = new BufferedReader(inputCSV);
            
           
           
           // DepartmentOuter.Response.Builder builder = DepartmentOuter.Response.newBuilder();
    		
            String line;
            int count=0;
            while ((line = br.readLine()) != null) {
            	if(count>200) {break;}
            	if(count>0) {
            	 String reference=line.split(",")[0];
            	 String period=line.split(",")[1];
            	 String value=line.split(",")[2];
            	 Item.Builder item=Item.newBuilder();
            	
            	 item.setReference(reference);
            	 item.setPeriod(Float.parseFloat(period));
            	 item.setValue(Integer.parseInt(value));
            	 
            	 response.addItems(item.build());
            	}
            	
            	 count++;
            }
           
            br.close();
           
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		 responseObserver.onNext(response.build());
		
		
		responseObserver.onCompleted();
	}

	


	
	 
}
