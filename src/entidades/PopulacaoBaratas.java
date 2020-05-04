
package entidades;


public class PopulacaoBaratas {
    private int populacaoBarata;

    public PopulacaoBaratas() {
    }

    public PopulacaoBaratas(Integer populacaoBarata) {
        this.populacaoBarata = populacaoBarata;
    }

    public Integer getPopulacaoBarata() {
        return populacaoBarata;
    }

    public void setPopulacaoBarata(Integer populacaoBarata) {
        this.populacaoBarata = populacaoBarata;
    }
    public Integer sprayVeneno (){
       
      double aux = (double)populacaoBarata;
      
     double px = aux-((aux/100)*10);
     int res = (int) px;
     populacaoBarata=res;
     return populacaoBarata;
    }
    public int dubrarPopulacao(){
    
  return populacaoBarata*=2;
      
    }
}
