package exception_handling;

import java.io.File;
import java.io.IOException;

public class Ex8_16_2 {
    public static void main(String[] args) {

        File f = createFile(""); // 예외발생
        System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
    }

    static File createFile(String fileName) { // -> 여기서 직접 예외처리 하기
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일 이름이 유효하지 않습니다.");
        } catch (Exception e) {
            fileName = "testFile.txt";
        }
        File f = new File(fileName); // File 클래스의 객체를 만듦
        // File 객체의 createNewFile 메서드를 이용해 실제 파일을 생성
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return f;
    }
}

// scr 디렉토리 맨 밑에 test.txt 폴더 생성됨
