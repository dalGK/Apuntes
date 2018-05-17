public static int cocheMasBarato(Vehiculo coches[]) { //En el metodo pedimos el Array[] coches Tipo Vehiculo
float precio;		  // Creamos variable precio
int indice = 0;			//Aqui guardamos el resultado
				// Pedimos el precio de coches y lo recorremos
                      
precio = coches[0].getPrecio();	    // Guardamos en la variable precio el precio del coche introducido en el array[0]
for(int i=1;i<coches.length;i++) {  // Creamos un bucle para recorrer todos los valores dentro del array
if(coches[i].getPrecio()<precio) {  // si el precio del coche[i] es < que precio actual
precio = coches[i].getPrecio();     // si es mas pequeño lo guarda en precio
				
			}
		}
		return indice;
}
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		String marca,modelo;
		int precio,numVehiculos,icocheMasbarato;

		System.out.println("Cuantos coches quieres introducir");
		numVehiculos = entrada.nextInt();
		
		// Creamos los objetos para los coches;
		
		Vehiculo coches[] = new Vehiculo[numVehiculos];
		
		for(int i=0;i<coches.length;i++) {
			entrada.nextLine();
			System.out.println("Introduce las caracteristicas del coche nº "+(1+i));
			System.out.println("Introduce la marca: ");
			marca = entrada.nextLine();
			System.out.println("Introduce el modelo: ");
			modelo = entrada.nextLine();
			System.out.println("Introduzca precio: ");
			precio = entrada.nextInt(); 
			
			coches[i] = new Vehiculo(marca, modelo, precio);
			
		}
		icocheMasbarato = cocheMasBarato(coches);
		
		System.out.println("El coche mas barato es: ");
		System.out.println(coches[cocheMasBarato(coches)].mostrarDatos());
	

		





	}

}
