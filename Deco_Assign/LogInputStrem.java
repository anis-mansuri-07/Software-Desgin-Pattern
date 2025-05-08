package Deco_Assign;
import java.io.IOException;
import java.io.InputStream;

public class LogInputStrem extends InputStreamDecorator {
    private long position=0,words=0,lines=0,pre=32;
    LogInputStrem(InputStream is)
    {
       super(is);
    }
    long numberOfCharacter()
    {
       
        return position;
    }
    long numberOfWords()
    {
        if(words==0 && position==1)
           return 0;
        else
          return words+1;
    }
    long numberOfLines()
    {
   
       if(lines==0)
         return 0;
       else
         return lines+1;
    }

    @Override
    public int read() throws IOException {
           position++;
           int b = ins.read();
            if(b == 32 && pre!=32)
                  words++;
            if(pre==10 && b!=-1)
                words++;
            if(b==10){
                // words++;
                lines++;
            }   
            pre=b;
            return b;
    }
    @Override
    public void close() throws IOException {
        ins.close();
    }
}