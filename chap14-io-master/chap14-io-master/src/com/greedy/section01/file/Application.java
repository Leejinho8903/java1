package com.greedy.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		/* File
		 * JDK 1.0부터 지원하는 API로 파일 처리를 수행하는 대표적인 클래스이다.
		 * 대상 파일에 대한 정보로 인스턴스를 생성하고 파일의 생성, 삭제 등의 처리를 수행하는 기능을 제공하고 있다.
		 * */
		
		/* 파일 클래스를 이용해서 인스턴스를 생성한다. 대상 파일이 존재하지 않아도 인스턴스를 생성할 수 있다. */
		File file = new File("src/com/greedy/section01/file/test.txt");
		
		try {
			/* createNewFile()을 통해 파일을 생성할 수 있고 성공 실패 여부를 boolean으로 반환한다. */
			boolean createSuccess = file.createNewFile();
			
			/* 최초 실행 시 새롭게 파일이 만들어지므로 true가 반환 되고 파일이 한 번 생성 되고 난 이후는
			 * 새롭게 파일을 만들지 않기 때문에 false를 반환한다. */
			System.out.println(createSuccess);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* 생성한 파일의 정보 */
		System.out.println("파일의 크기 : " + file.length() + "byte");
		System.out.println("파일의 경로 : " + file.getPath());
		System.out.println("현재 파일의 상위 경로 : " + file.getParent());
		/* 절대 경로란 최상위 루트 위치부터의 경로를 의미한다. */
		System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());
		
		/* 파일 삭제
		 * 삭제 후 성공 실패 여부를 boolean으로 반환 */
		boolean deleteSuccess = file.delete();
		System.out.println(deleteSuccess);
		
		
		
		
		
		
		
		
		
		
	}

}