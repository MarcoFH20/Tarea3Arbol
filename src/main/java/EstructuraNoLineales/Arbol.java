
package EstructuraNoLineales;


public class Arbol {
    
    NodoArbol inicial;
    
    
    
    public Arbol(){
        this.inicial=null;
        
    }
    public void insertar(int valor){
        
        if(this.inicial == null){
             this.inicial= new NodoArbol(valor);
        }else{
            this.inicial.insertar(valor);
        }
       
    }
    
    public void dispararPreorden(){
        this.preorden(this.inicial);
    }
    public void preorden(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            System.out.print(nodo.getValor()+" , ");
            preorden(nodo.getNodoIzq());
            preorden(nodo.getNodoDerecho());
            
        }
    }
    
    public void dispararInorden(){
        this.Inorden(this.inicial);
    }
    public void Inorden(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            
            Inorden(nodo.getNodoIzq());
            System.out.print(nodo.getValor()+" , ");
            Inorden(nodo.getNodoDerecho());
            
        }
    }
    public void dispararPostorden(){
        this.postorden(this.inicial);
    }
    public void postorden(NodoArbol nodo){
        if(nodo == null){
            return;
        }else{
            
            postorden(nodo.getNodoIzq());           
            postorden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+" , ");
            
        }
    }
    
}
