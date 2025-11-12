package com.itextdemo.basic;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class ParagraphPro {
	public static void main(String[] args) throws FileNotFoundException {
		Document doc=new Document(new PdfDocument(new PdfWriter("sample.pdf")));
		Paragraph para1=new Paragraph("Hello I am Soumitra Sharma");
		doc.add(para1);
		doc.close();
		System.out.println("Done");
	}
}
