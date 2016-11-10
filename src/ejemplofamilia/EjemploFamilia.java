
package ejemplofamilia;

import java.util.ArrayList;


public class EjemploFamilia {

    static ArrayList <Familia> familias = new ArrayList <>();
    
    public static void rellenarDatos(){
        
        Familia f;
        
        for (int i = 0; i < 10; i++) {
            f = new Familia();
            f.setNombre("FAMILIA " + i);
            f.setEdad(50 + i);
            f.setCapital(10000+i);
            familias.add(f);           
        }
    }
    
    // 1) Unimos dos familias, y fusionamos sus capitales
    
    public static void casar(Familia f1, Familia f2){
        Familia familianueva = new Familia();
        familianueva.setNombre("FAMILIA NUEVA ");
        familianueva.setCapital(f1.getCapital()+f2.getCapital());
        familias.remove(f1);
        familias.remove(f2);
        familias.add(familianueva);
 }
    
    public static void main(String[] args) {
        rellenarDatos();
        
    // 1) Unimos dos familias, y fusionamos sus capitales 
    
    casar(familias.get(3),familias.get(7));
        for (int i = 0; i < familias.size(); i ++){
          System.out.println(familias.get(i).getNombre());  
        }
        
    
     
        
        
        
        
        
    }
    
}
