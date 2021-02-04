public class ContenedorCaja {
    private CajaFruta pila[];
	private int tope;
	
	public ContenedorCaja(int capacidad){ 
		pila = new CajaFruta[capacidad];
		tope = -1;
	} 
	
	public boolean isEmpty(){
		return tope == -1;
	}
	
	public void push(CajaFruta i){
		if(tope+1 < pila.length)
			pila[++tope] = i;
	}
	public CajaFruta pop(){
		if(isEmpty())
			return null;
		return 
			pila[tope--];
	}
}
