package service;

import TurnoBancoDTO.BancoDTO;
import interfaces.IBancoService;

import java.util.ArrayList;
import java.util.List;

public class BancoserviceImpl implements IBancoService {

    private List<BancoDTO> dataSource;

    public BancoserviceImpl() {
        this.dataSource = new ArrayList<>();
    }
    @Override
    public List<BancoDTO> listar() {
        return dataSource;
    }

    @Override
    public BancoDTO porId(Integer id) {
        BancoDTO resultado = null;
        for(BancoDTO mas: dataSource){
            if(mas.getId() != null && mas.getId().equals(id)){
                resultado = mas;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(BancoDTO mascota) {
        this.dataSource.add(mascota);
    }

    @Override
    public void editar(BancoDTO mascota) {
        BancoDTO m = this.porId(mascota.getId());
        m.setLlamarcliente(mascota.getLlamarcliente());
        m.setTomarturno(mascota.getTurnos());
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }
    @Override
    public int total() {
        return this.dataSource.size();
    }
}

