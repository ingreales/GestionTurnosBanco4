package interfaces;

import TurnoBancoDTO.BancoDTO;

import java.util.List;

public interface IBancoService {
    List<BancoDTO> listar();
    BancoDTO porId(Integer id);
    void crear(BancoDTO banco);
    void editar(BancoDTO banco);
    void eliminar(Integer id);
    public int total();
}
