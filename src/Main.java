import java.io.File;
public class Main {
      public static void main(String[] args) {
            File f = new File("C:\\Users\\timon\\.android\\avd\\Pixel_3a_API_34_extension_level_7_x86_64.avd");
            FileLister.listFile(f, "| ");
      }
}