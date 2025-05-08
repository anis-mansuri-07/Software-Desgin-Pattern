package Deco_Assign;


import java.io.InputStream;

public abstract class InputStreamDecorator extends InputStream {
   public InputStream ins;

   public InputStreamDecorator(InputStream ins) {
      this.ins = ins;
   }
}