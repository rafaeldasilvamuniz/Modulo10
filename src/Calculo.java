/**Classe para o cálculo da média dos valores.
 *@author : Rafael da Silva Muniz
 *@since : 26/07/23
 */

public class Calculo {

    private float md;

    private float n1;
    private float n2;
    private float n3;
    private float n4;

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public float getN4() {
        return n4;
    }

    public void setN4(float n4) {
        this.n4 = n4;
    }

    public float retornaMedia() {


        md = (n1 + n2 + n3 + n4)/4;
       
        return md;

    }


}
