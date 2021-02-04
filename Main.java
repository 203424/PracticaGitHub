public class Main {
    public static void main(String[] args) throws Exception{
        BodegaFabrica bodega = new BodegaFabrica(30);

        ContenedorCaja contenedorFr = new ContenedorCaja(30);
        ContenedorCaja contenedorMa = new ContenedorCaja(30);
        ContenedorCaja contenedorMe = new ContenedorCaja(30);

        //camion 1
        bodega.enqueue(new CajaFruta("Caja 1","Fresa",12));
        bodega.enqueue(new CajaFruta("Caja 2","Membrillo",13));
        bodega.enqueue(new CajaFruta("Caja 3","Manzana",15));
        bodega.enqueue(new CajaFruta("Caja 4","Fresa",20));
        bodega.enqueue(new CajaFruta("Caja 5","Membrillo",11));
        bodega.enqueue(new CajaFruta("Caja 6","Fresa",13));
        bodega.enqueue(new CajaFruta("Caja 7","Manzana",13));
        bodega.enqueue(new CajaFruta("Caja 8","Fresa",14));
        bodega.enqueue(new CajaFruta("Caja 9","Membrillo",16));
        bodega.enqueue(new CajaFruta("Caja 10","Membrillo",12));
        //camion2
        bodega.enqueue(new CajaFruta("Caja 11","Membrillo",11));
        bodega.enqueue(new CajaFruta("Caja 12","Manzana",13));
        bodega.enqueue(new CajaFruta("Caja 13","Fresa",17));
        bodega.enqueue(new CajaFruta("Caja 14","Membrillo",18));
        bodega.enqueue(new CajaFruta("Caja 15","Fresa",12));
        bodega.enqueue(new CajaFruta("Caja 16","Manzana",10));
        bodega.enqueue(new CajaFruta("Caja 17","Fresa",19));
        bodega.enqueue(new CajaFruta("Caja 18","Manzana",11));
        bodega.enqueue(new CajaFruta("Caja 19","Membrillo",13));
        bodega.enqueue(new CajaFruta("Caja 20","Manzana",14));
        //camion3
        bodega.enqueue(new CajaFruta("Caja 21","Manzana",11));
        bodega.enqueue(new CajaFruta("Caja 22","Membrillo",15));
        bodega.enqueue(new CajaFruta("Caja 23","Fresa",14));
        bodega.enqueue(new CajaFruta("Caja 24","Manzana",17));
        bodega.enqueue(new CajaFruta("Caja 25","Fresa",16));
        bodega.enqueue(new CajaFruta("Caja 26","Membrillo",19));
        bodega.enqueue(new CajaFruta("Caja 27","Manzana",20));
        bodega.enqueue(new CajaFruta("Caja 28","Fresa",11));
        bodega.enqueue(new CajaFruta("Caja 29","Membrillo",15));
        bodega.enqueue(new CajaFruta("Caja 30","Manzana",11));

        while(!bodega.isEmpty()){
            CajaFruta caja = bodega.dequeue();
            if(caja.getFruta()=="Fresa"){
                contenedorFr.push(caja);
            }
            if(caja.getFruta()=="Manzana"){
                contenedorMa.push(caja);
            }
            if(caja.getFruta()=="Membrillo"){
                contenedorMe.push(caja);
            }
        }
        System.out.println("Contenedor de Fresas: ");
        while(!contenedorFr.isEmpty()){
            CajaFruta caja = contenedorFr.pop();
            System.out.println(caja.getIdentificador()+" : "+caja.getFruta()+" pesa "+caja.getPeso());
        }
        System.out.println("Contenedor de Manzanas: ");
        while(!contenedorMa.isEmpty()){
            CajaFruta caja = contenedorMa.pop();
            System.out.println(caja.getIdentificador()+" : "+caja.getFruta()+" pesa "+caja.getPeso());
        }
        System.out.println("Contenedor de Membrillo: ");
        while(!contenedorMe.isEmpty()){
            CajaFruta caja = contenedorMe.pop();
            System.out.println(caja.getIdentificador()+" : "+caja.getFruta()+" pesa "+caja.getPeso());
        }
        //si los numeros estan de mayor a menor significa que salieron de la pila de manera correcta
    }
}
