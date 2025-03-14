public class Planeta extends CuerpoCeleste {


    public Planeta(String nombre, double periodoOrbital, TipoCuerpoCeleste tipoCuerpo) {
        super(nombre, periodoOrbital, tipoCuerpo);
    }

    public boolean addSateliter (CuerpoCeleste cuerpoCeleste){
        if (cuerpoCeleste.getTipoCuerpo().equals(TipoCuerpoCeleste.LUNA)){
            cuerpoCeleste.addSatelite(cuerpoCeleste);
            return true;
        }else {
            return false;
        }



    }


}