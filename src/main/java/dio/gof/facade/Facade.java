package dio.gof.facade;

// subsistema1/crm
// subsistema2/cep

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

// facade -> subsistema1/crm, subsistema2/cep
public class Facade {

    public void migrarCliente (String nome, String cep){

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
