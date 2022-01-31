import java.io.File;
import java.util.Arrays;

public class Z3 {
    public static String[] subdirectoryList(String path){

        File f = new File(path);
        return f.list((dir, name) -> dir.isDirectory());
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(subdirectoryList("C:\\Users\\Alan\\IdeaProjects\\162456-E01\\out")));
        System.out.println(Arrays.toString(subdirectoryList("C:\\Users\\Alan\\Desktop\\asd")));
    }
}
