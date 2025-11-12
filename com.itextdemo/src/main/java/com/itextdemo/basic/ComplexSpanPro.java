package com.itextdemo.basic;

import java.io.IOException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class ComplexSpanPro {

	public static void main(String[] args) throws IOException{
		Table table=new Table(new float[] {100f,100f,100f,100f,100f,100f})
			.addCell(new Cell().add(new Paragraph("Sarthi Technology")))
			.addCell(new Cell(2,0).add(new Paragraph("Android Battery Manager")))
			.addCell(new Cell(3,0).add(new Paragraph("Android Wifi P2P")))
			.addCell(new Cell(3,0).add(new Paragraph("Android Bluetooth")))
			.addCell(new Cell(0,2).add(new Paragraph("Android Sensor Programming")))
			.addCell(new Cell().add(new Paragraph("Picasso Library")))
			.addCell(new Cell().add(new Paragraph("Android Pdf Document")))
			.addCell(new Cell().add(new Paragraph("User Location")))
			.addCell(new Cell().add(new Paragraph("MP Android Chart")))
			.addCell(new Cell().add(new Paragraph("Graph View")))
			.addCell(new Cell().add(new Paragraph("Text 7 Java")))
			.addCell(new Cell().add(new Paragraph("Text 7 Android")));
			
		Document doc=new Document(new PdfDocument(new PdfWriter("sample.pdf")));
		doc.add(table);
		doc.close();
		System.out.println("Done");

	}

}
