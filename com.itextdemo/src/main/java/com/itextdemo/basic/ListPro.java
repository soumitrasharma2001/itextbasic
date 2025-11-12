package com.itextdemo.basic;

import java.io.FileNotFoundException;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.List;

public class ListPro {

	public static void main(String[] args) throws FileNotFoundException {
		List list1=new List();
		list1.add("Java");
		list1.add("C++");
		list1.add("Python");
		list1.add("React");
		Document doc=new Document(new PdfDocument(new PdfWriter("sample.pdf")));
		doc.add(list1);
		doc.close();
	}

}
