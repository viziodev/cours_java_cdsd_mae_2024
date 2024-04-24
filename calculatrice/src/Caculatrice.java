
public class Caculatrice {
    private  double nbre1,nbre2;

    public Caculatrice(double nbre1, double nbre2) {
        this.nbre1 = nbre1;
        this.nbre2 = nbre2;
    }

    public Caculatrice() {
    }

    public double getNbre1() {
        return nbre1;
    }

    public void setNbre1(double nbre1) {
        this.nbre1 = nbre1;
    }

    public double getNbre2() {
        return nbre2;
    }

    public void setNbre2(double nbre2) {
        this.nbre2 = nbre2;
    } 

    public double somme(){
        return nbre1+nbre2;
    }
    public double soustaction(){
        return nbre1-nbre2;
    }

    public double division(){
        if(nbre2!=0){
            return nbre1/nbre2;
          }
          return 0;
    }


   

    
}
