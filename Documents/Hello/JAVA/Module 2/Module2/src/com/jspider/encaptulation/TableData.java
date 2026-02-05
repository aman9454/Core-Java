package com.jspider.encaptulation;

public class TableData {
	private TableData() {
		
	}
	private static TableData td=new TableData();
	public static TableData getTableData() {
		if(td==null)
		{
			td=new TableData();
			
		}
		return td;
	}
}
