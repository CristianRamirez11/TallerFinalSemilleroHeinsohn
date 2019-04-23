import { ClienteDTO } from '../../apoyo/modelo/clienteDTO';

export interface FacturaDTO {
    idFactura: number;
    idCliente: ClienteDTO;
    iva: string;
    valorTotal: string;
  }