import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test3 {

	public static void main(String[] args) throws Exception {
			/*
			 * MD_ANALYZE_INFO 에 등록               =>> change_id를 받아서, id값을 result에 넣어줘야함.
			 * MD_MEASURE_RESULT 에 등록          =>> analyze_info.id / measure_object.id / metric_info(맵핑테이블).id 에서 가져와서 넣는다.
			 * MD_MEASURE_OBJECT 에 등록 (o)
			 * MD_MEASURE_RESULT : MD_MEASURE_OBJECT = 1 : 1 의 구조로 됨.
			 */
			//test kkkkkkkkkkkkkkkkkkkkkkkkkk
			String s = "";
			String word_list_dir = "/Calendar3/src/com/android/calendar/EventGeometry.java";
//			String word_list_dir = "Calendar3";
			String test = word_list_dir;
//			String word_list_dir = "c:/func.txt";
		
			StringBuilder sb = new StringBuilder();
			int firstStrIndex = 0;
			int lastStrIndex = 0;
			String[] firstStr = word_list_dir.split("/");
			firstStrIndex = word_list_dir.lastIndexOf("/");
			System.out.println(word_list_dir.indexOf("/"));
			System.out.println(word_list_dir.lastIndexOf("/"));
			if(firstStrIndex > 0) {
				System.out.println("word_list_dir1 : " + word_list_dir.substring(0, word_list_dir.lastIndexOf("/")));
				
				
				System.out.println("111 : " + word_list_dir.substring(firstStrIndex, word_list_dir.length()).replace("/", ""));
			}
			
			test = (String) test.substring(0, test.lastIndexOf("/"));
			test = (String) test.substring(0, test.lastIndexOf("/"));
			test = (String) test.substring(0, test.lastIndexOf("/"));
			test = (String) test.substring(0, test.lastIndexOf("/"));
//			
//			word_list_dir = (String) word_list_dir.substring(0, word_list_dir.lastIndexOf("/"));
//			lastStrIndex = word_list_dir.lastIndexOf("/");
//			System.out.println("word_list_dir2 Index : " + (word_list_dir.lastIndexOf("/")));
//			System.out.println("word_list_dir2 : " + word_list_dir.substring(0, word_list_dir.lastIndexOf("/")));
//			
//			System.out.println("test : " + test);
//			System.out.println("Index : " + firstStrIndex + " / " + lastStrIndex);
//			System.out.println("Index : " + (test.substring(lastStrIndex,firstStrIndex )).replace("/", ""));
//			
//			firstStrIndex = word_list_dir.lastIndexOf("/");
//			word_list_dir = (String) word_list_dir.substring(0, word_list_dir.lastIndexOf("/"));
//			lastStrIndex = word_list_dir.lastIndexOf("/");
//			System.out.println("Index2 : " + (test.substring(lastStrIndex,firstStrIndex )).replace("/", ""));
//			
			for (int ii = 0; ii < firstStr.length; ii++) {
//			System.out.println("문자열 테스트 : " + firstStr[ii] + " / 순번 : " + firstStrCount);
				System.out.println("firstStr : " + firstStr[ii]);
			}
			
			System.out.println("firstStr1111 : " + word_list_dir.substring(1,word_list_dir.length()));
			
			if ("/".equals(word_list_dir.substring(0,1))) {
				System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;");
			}
			
			
			String fileNameTag = "file.txt";	//파일들의 결과 구조
			String funcNameTag = "func.txt";	//함수 결과 구조
//			String fileName = "/home/test/test/file.txt";
			String fileName = "c:\file.txt";
			System.out.println("fileName : " + fileName);
			System.out.println("test : " + fileName.indexOf(fileNameTag));
			System.out.println("test : " + fileNameTag.indexOf(fileName));
			if(fileName.indexOf(fileNameTag) > 0) {	//파일결과구조는 3개
				System.out.println("11111111111");
			}
			
			System.out.println("test : " + fileName.substring(fileName.length()-8, fileName.length()));
			
			String user_id="크크크!~~~";
			
			if(!fileNameTag.matches("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힝]*")){ 
				System.out.println("특수문자있음");
			}else{
				System.out.println("특수문자없음");
			}
			
			
			String word_list_dir22 = "/Calendar3/src/com/android/calendar/file_lkfjalsf.txt";
			System.out.println("test : " + word_list_dir22.indexOf("file"));
			System.out.println("test222 : " + word_list_dir22.substring(word_list_dir22.indexOf("file"), word_list_dir22.length()));
			
			String word_list_dir33 = "/Calendar3/src/com/android/calendar/func_alsdfjaslkd.txt";
//			String name = word_list_dir22;
			String name = word_list_dir33;
			File file = new File(name);
			String name1 = file.getName();
			//System.out.println("name : "+name1);
			
			if(name1.startsWith("file")) {
				System.out.println("file : " + name1);
			}
			if(name1.startsWith("func")) {
				System.out.println("func : " + name1);
			}
		}
	
}
