package com.itextdemo.basic;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;

public class Pro1 {
	public static void main(String[] args) throws FileNotFoundException {
		PdfWriter pdfWriter=new PdfWriter("sample.pdf");
		PdfDocument pdfDoc=new PdfDocument(pdfWriter);
		pdfDoc.addNewPage();
		Document document=new Document(pdfDoc);
		document.close();
	}
}
