package Deco_Assign;

import java.io.OutputStream;

public abstract class OutputStreamDecorator extends OutputStream {

    public OutputStream ins;

    public OutputStreamDecorator(OutputStream ins) {
        this.ins = ins;
    }

}