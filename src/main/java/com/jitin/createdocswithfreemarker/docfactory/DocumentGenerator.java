package com.jitin.createdocswithfreemarker.docfactory;

import com.jitin.createdocswithfreemarker.factory.DocumentFactory;
import com.jitin.createdocswithfreemarker.factory.TemplateEngineFactory;
import com.jitin.createdocswithfreemarker.model.DocumentRequest;
import com.jitin.createdocswithfreemarker.templateprocessor.TemplateProcessor;

public abstract class DocumentGenerator {
	public static byte[] generateDocument(DocumentRequest documentRequestDTO) {
		TemplateProcessor templateProcessor = TemplateEngineFactory.getInstance(documentRequestDTO.getTemplateEngine());
		String processedtext = templateProcessor.getProcessedText(documentRequestDTO);
		System.out.println("Processed text : " + processedtext);
		DocumentProducer generateDocument = DocumentFactory.getInstance(documentRequestDTO.getDocumentType());
		return generateDocument.generateDocumentFromProcessedText(processedtext,documentRequestDTO.getWatermark());
	}
}
