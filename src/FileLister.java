import java.io.File;
import java.text.SimpleDateFormat;

public class FileLister {
      public static void listFile(File file, String lvl) {
            if (file.isDirectory()) {
                  lvl += " ";
                  System.out.println(lvl + "+" + file.getName());
                  File[] files = file.listFiles();
                  if (files != null) {
                        for (File f : files) {
                              listFile(f, lvl);
                        }
                  }
            } else {
                  SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy - HH:mm");
                  String lastModified = sdf.format(file.lastModified());
                  System.out.println(lvl + file.getName() + " - " + lastModified + " - " + file.length() + " Byte");
            }
      }
}