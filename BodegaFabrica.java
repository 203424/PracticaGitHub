public class BodegaFabrica {
    public static final int DEFAULT_SIZE=30;
	private CajaFruta data[];
	private int index;
	public BodegaFabrica(){
		data=new CajaFruta[DEFAULT_SIZE];
	}

	public BodegaFabrica(int s){
		data=new CajaFruta[s];
	}
	
	public boolean isEmpty(){
		return index==0;
	}

	public void enqueue(CajaFruta obj) throws Exception{
		if(index == DEFAULT_SIZE){
			throw new Exception("Queue is full. Dequeue some objects");
		}
		this.data[index]=obj;
		this.index++;
	}
	
	public CajaFruta dequeue() throws Exception{
		if(isEmpty())throw new Exception("Queue is empty");
		CajaFruta obj=this.data[0];
		for(int i =0; i<this.index-1; i++){
			data[i]=data[i+1];
		}
		this.index--;
		return obj;
	}
}
