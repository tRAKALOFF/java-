package pe.egcc.buensabor.ventaapp.service;

import pe.egcc.buensabor.ventaapp.model.ItemDto;

/**
 * 
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 */
public class BoletaService extends ComprobanteAbstract{

  @Override
  public ItemDto[] procesar(double total) {
        // Variables
    double servicio, totalGeneral;
    // Calculos
    servicio = total * 0.10;
    totalGeneral = total + servicio;
    // Reporte
    ItemDto[] repo = {
      new ItemDto("Total", total),
      new ItemDto("Servicio", servicio),
      new ItemDto("Total General", totalGeneral),
    };
    return repo;
  }

}
