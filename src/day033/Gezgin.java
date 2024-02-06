package day033;

public class Gezgin {

    private int[] gittigiYol;

    public int[] addYol(int km){
        if (gittigiYol==null){
            gittigiYol=new int[1];
            gittigiYol[0]=km;
        }else {
            int[] tmp=new int[gittigiYol.length];
            for (int i = 0; i < gittigiYol.length; i++) {
                tmp[i]=gittigiYol[i];
            }
            gittigiYol[gittigiYol.length-1]=km;
        }
        return gittigiYol;
    }
}
