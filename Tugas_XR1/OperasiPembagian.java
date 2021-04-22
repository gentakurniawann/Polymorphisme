package Tugas_XR1;

/**
 *
 * @author genta
 */
public class OperasiPembagian extends OperasiBilanganAbs{
    protected double a,b,c;
    
    @Override
    protected void set_A(double a){
        this.a=a;
    }
    @Override
    protected void set_B(double b){
        this.b=b;
    } 
    @Override
    protected void set_C() {
        c=a/b;
    }
    @Override
    protected double get_A(){
        return a;
    }
    @Override
    protected double get_B(){
        return b;
    }    
    @Override
    protected double get_C(){
        return c;
    }
    @Override
    protected void tampil(){
        System.out.println("Hasil Pembagian "+get_A()+" / "+get_B()+" = "+get_C());
    }
}
