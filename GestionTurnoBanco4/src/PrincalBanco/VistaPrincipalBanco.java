package PrincalBanco;

import TurnoBancoDTO.BancoDTO;
import interfaces.IBancoService;
import service.BancoserviceImpl;

import java.util.List;
import java.util.Scanner;

public class VistaPrincipalBanco {
    public static void main(String[] args) {
        String opc = "1";
        IBancoService repo = new BancoserviceImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar \n 5. Contar \n 6. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Ingrese nombre: ");
                    String tomarturno= s.next();
                    System.out.println("ingrese Raza: ");
                    String llamarcliente = s.next();
                    repo.crear(new BancoDTO(llamarcliente, tomarturno));
                    break;
                }
                case "2": {
                    List<BancoDTO> mascotas = repo.listar();
                    mascotas.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("ingrese id del registro mascota: ");
                    Integer i = s.nextInt();
                    System.out.print("ingrese nombre: ");
                    String nom = s.next();
                    System.out.print("ingrese Raza: ");
                    String raza = s.next();
                    BancoDTO beaActualizar = new BancoDTO(nom, raza);
                    beaActualizar.setId(i);
                    repo.editar(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id del registro: ");
                    Integer id = s.nextInt();
                    repo.eliminar(id);
                    repo.listar().forEach(System.out::println);
                    break;
                }
                case "5": {
                    System.out.println("===== total ===== ");
                    System.out.print("Total registros: " + repo.total());
                    break;
                }
                case "6": {
                    opc = "6";
                    break;
                }
            }
        } while (opc != "6");
    }
}


