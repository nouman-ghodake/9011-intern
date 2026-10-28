package aaaa;
import java.util.ArrayList;
public class AA {
  public static void main(String[] args){
    ArrayList<ArrayList<String>> albaharwali = new ArrayList<ArrayList<String>>();
    ArrayList<String> alInner1=new ArrayList<>();
    alInner1.add("RAM");
    alInner1.add("SITA");
    ArrayList<String> alInner2=new ArrayList<>();
    alInner2.add("SUGREEVE");
    alInner2.add("SHYAM");
    albaharwali.add(alInner1);
    albaharwali.add(alInner2);

    for (ArrayList<String> alinnerwali : albaharwali) {
      for (String actors : alinnerwali) {
        if (!actors.contains("A")){
          System.out.println(actors);
        }
      }
    }
  }
}
