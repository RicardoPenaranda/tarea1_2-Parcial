
public class primerEjercicio
{
   int sucesionDeNumeros[];
    public primerEjercicio()
    { 
    }
     public void sucesion(int cantidad)
    {
        if(cantidad > 1)
        {
            sucesionDeNumeros = new int[cantidad];
            sucesionDeNumeros[0] = 1;
            int sum = 1;
            int contador = 1;
            int contadorAumento = 0;
            int contadorDisminucion = 0;
            while(contador < cantidad)
            {
                sucesionDeNumeros[contador] = sucesionDeNumeros[contador-1]+sum;
                if(sum == 1)
                {
                    sum = 2;
                    contadorAumento++;
                }else if(sum == 3)
                    {
                    sum = 2;
                    contadorDisminucion++;
                    }else
                    {
                    if(contadorAumento > contadorDisminucion)
                    {
                        sum = 3;
                    }else
                    {
                        sum = 1;
                    }
                }
                contador++;
            }
            int indice = 0;
            while(indice < cantidad){
                System.out.print(sucesionDeNumeros[indice]+" ");
                indice++;
            }
        }else if(cantidad == 1)
        {
            System.out.print(1+" ");
        }else
        {
            System.out.println("porfavor introdusca numeros positivos (mayores a 0)");
        }
    }
}

