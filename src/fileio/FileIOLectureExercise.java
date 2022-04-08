package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLectureExercise {

    public static void main(String[] args) {

        // Lecture examples to work out after students
        String myPath = "/Users/files/this.text";
        String fileName = "test.txt";
        String directory = "data";

        // Getting the file full path from this method get
        Path filePath = Paths.get(directory,fileName);

        System.out.println("filePath.getFileName() = " + filePath.getFileName());
        System.out.println("filePath.toString() = " + filePath.toString());

        Path fakePath = Paths.get("dir1","dir2","dir3","dir4", "file.text");

        System.out.println("fakePath.toAbsolutePath() = " + fakePath.toAbsolutePath());

        //Path, 1 directory being passed as argument
        Path oneDirectoryPath = Paths.get("data");
        System.out.println("oneDirectoryPath.toAbsolutePath() = " + oneDirectoryPath.toAbsolutePath());


        //Path, 3 arguments, 2 dir + filename
        Path threeArgumentsPath = Paths.get("dir1", "dir2", "filename.txt");
        System.out.println("threeArgumentsPath = " + threeArgumentsPath);


        //Absolute Path
        Path absolutePath = Paths.get("/", "User");
        System.out.println("absolutePath =" + absolutePath.isAbsolute());

        //Path, Absolute, verify with isAbsolute
        Path anotherAbsolutePath = Paths.get("./", "user");
        System.out.println("anotherAbsolutePath.isAbsolute() = " + anotherAbsolutePath.isAbsolute());
    }

}
