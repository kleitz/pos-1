package com.refresh.pos.database;

import java.util.List;

import com.refresh.pos.domain.LineItem;
import com.refresh.pos.domain.Sale;

public interface SaleDao {

	Sale initiateSale(String startTime);

	void endSale(Sale sale, String endTime);

	int addLineItem(int saleId, LineItem lineItem);
	
	List<Sale> getAllSale();

	Sale getSaleById(int id);

	void clearSaleLedger();

	List<LineItem> getLineItem(int saleId);

	List<Sale> getAllSaleDuring(String start, String end);

}
