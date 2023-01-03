package exception_handling;

import java.io.File;

import static java.nio.file.Files.createFile;

public class Ex8_16 {
    public static void main(String[] args) {

        try {
//            File f = createFile("test.txt"); // scr 디렉토리 맨 밑에 txt 파일 생성됨
            File f = createFile(""); // 예외발생
            System.out.println(f.getName() + "파일이 성공적으로 생성되었습니다.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " 다시 입력해 주시기 바랍니다."); // 예외처리
        }
    }

    static File createFile(String fileName) throws Exception { // main 메서드가 호출함
        if (fileName == null || fileName.equals(""))
            throw new Exception("파일 이름이 유효하지 않습니다.");
        File f = new File(fileName); // 파일 객체를 만듦
        f.createNewFile();
        return f; // 생성된 객체의 참조를 반환
    }
}

// scr 디렉토리 맨 밑에 test.txt 폴더 생성됨
