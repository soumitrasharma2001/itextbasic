package com.itextdemo.basic;

import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class ArrayTablePro {
	public static void main(String[] args) throws IOException{
		Table table=new Table(new float[]{200f,50f,100f});
		
		String tableHeader[]= {"Item","QTY","Price"};
		String itemsArray[][]= {
				{"Laptop","13","34000"},
				{"Mobile","34","14000"},
				{"Tablet","11","24000"}
		};
		
		//Heading
		table.addCell(new Cell().add(new Paragraph(tableHeader[0])));
		table.addCell(new Cell().add(new Paragraph(tableHeader[1])));
		table.addCell(new Cell().add(new Paragraph(tableHeader[2])));
		
		//Entries
		for(int i=0;i<itemsArray.length;i++) {
			for(int j=0;j<tableHeader.length;j++) {
				table.addCell(new Cell().add(new Paragraph(itemsArray[i][j])));
			}
		}
		Document doc=new Document(new PdfDocument(new PdfWriter("sample.pdf")));
		doc.add(table);
		doc.close();
	}
}
