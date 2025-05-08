package Deco_Assign;
import java.io.IOException;

import java.io.OutputStream;

public class LogOutputStream extends OutputStreamDecorator {
   private long position=0;
   public LogOutputStream(OutputStream is)
    {
       super(is);
    }
    long numberOfCharacter()
    {
       
        return position;
    }


    @Override
    public void write(int b) throws IOException {
           position++;
           ins.write(b);
    }
    @Override
    public void close() throws IOException {
        ins.close();
    }
}