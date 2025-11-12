package com.itextdemo.basic;

import java.io.IOException;

import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

public class FontPro {

	public static void main(String[] args) throws IOException {
		Document doc=new Document(new PdfDocument(new PdfWriter("sample.pdf")));
		PdfFont font=PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
		PdfFont boldFont=PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
		doc.add(new Paragraph(new Text("Nice to meet you").setFont(font)));
		doc.add(new Paragraph(new Text("Nice to meet you").setFont(boldFont)));
		doc.close();
	}

}
