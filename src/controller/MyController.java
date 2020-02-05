package controller;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import model.StockDetails;

public class MyController {
	ObjectMapper objectMapper = new ObjectMapper();
	File file = new File("/home/admin1/workspace-pro/StockAccountManagement/stock.json");

	public List<StockDetails> readFile() throws IOException{
		List<StockDetails> list = objectMapper.readValue(file, new TypeReference <List<StockDetails>>() {});
		return list;

	}
	public List<StockDetails> writeFile(List<StockDetails> list) throws IOException {
		// TODO Auto-generated method stub
		objectMapper.enableDefaultTyping().writeValue(file, list);
		return list;
	}


}