package com.booqueen.partner.common;

import java.io.File;

public class S3TestMain {
	
	public S3Service s3 = S3Service.getInstance();
	
	public static void main(String[] args) {
		
		S3TestMain main = new S3TestMain();
		
		File file = new File("C:\\Users\\jkho0\\OneDrive\\문서\\호텔사진\\부산\\해운대 센트럴호텔.jpg");
		String key = "해운대 센트럴호텔.jpg";
		
		try {
			main.upload(file, key);
			System.out.println("성공");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void upload(File file, String key) {
		s3.upload(file, key);
	}
	
	public void delete(String key) {
		s3.delete(key);
	}

}
