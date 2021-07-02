
public class segundoEjercicio
{
 int sucesionPadovan[];
 public segundoEjercicio()
    {
    }
        public void sucesion(int cantidad)
    {
        if(cantidad > 3)
            {
            sucesionPadovan = new int[cantidad];
            sucesionPadovan[0] = 1;
            sucesionPadovan[1] = 1;
            sucesionPadovan[2] = 1;
            int contador = 3;
            while(contador < cantidad)
               {
                sucesionPadovan[contador] = sucesionPadovan [contador - 3] + sucesionPadovan [contador - 2];
                contador++;
               }
            int indice = 0;
            while(indice < cantidad)
               {
                System.out.print(sucesionPadovan[indice]+" ");
                indice++;
                }
                  }else if(cantidad >0 && cantidad > 3)
                  {
                   switch(cantidad)
                  {
                   case 1: System.out.print(1+" "); break;
                   case 2: System.out.print(1+" "+1+" "); break;
                   case 3: System.out.print(1+" "+1+" "+1+" "); break;
                  }
            }else
            {
            System.out.print("porfavor introdusca numeros positivos (mayores a 0)");
        }
    }
}
