package com.abc;
import java.util.Arrays;
public class Sorting {
  void main() {
    int [] arr = {40,20,10,50,30};

    // Arrays.sort(arr);
    // IO.println(Arrays.toString(arr));

    int a = 10 ;
    int b = 5 ;

    int temp = a ;
    a = b ;
    b = temp ;

    IO.println("a =" + a);
    IO.println("b =" + b);

    for (int i = 0; i < arr.lenght; i++) {
      for (int j = i+1 ; j < arr.lenght; j++) {
        if (arr [i] > arr[j]) {

          int  tempp = arr[i];
          arr[i] = arr[j];
          arr[j] = tempp;
        }
      }
    }
  }
}
