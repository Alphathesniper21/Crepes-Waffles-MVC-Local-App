package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.CrepeDulce;
import co.edu.unbosque.model.CrepeDulceDTO;
import co.edu.unbosque.model.CrepeSalado;
import co.edu.unbosque.model.CrepeSaladoDTO;
import co.edu.unbosque.model.Helado;
import co.edu.unbosque.model.HeladoDTO;
import co.edu.unbosque.model.Waffle;
import co.edu.unbosque.model.WaffleDTO;

public class DataMapper {

    public static CrepeDulceDTO convertirCrepeDulceACrepeDulceDTO(CrepeDulce crepeDulce) {

        return new CrepeDulceDTO(
                crepeDulce.getNombre(),
                crepeDulce.getPrecio(),
                crepeDulce.isEsVegano(),
                crepeDulce.isTieneFruta(),
                crepeDulce.isTieneHelado(),
                crepeDulce.getSabor()
        );
    }

    public static CrepeDulce convertirCrepeDulceDTOACrepeDulce(CrepeDulceDTO crepeDulceDTO) {

        return new CrepeDulce(
                crepeDulceDTO.getNombre(),
                crepeDulceDTO.getPrecio(),
                crepeDulceDTO.isEsVegano(),
                crepeDulceDTO.isTieneFruta(),
                crepeDulceDTO.isTieneHelado(),
                crepeDulceDTO.getSabor()
        );
    }

    public static ArrayList<CrepeDulceDTO> convertirListaCrepeDulceAListaCrepeDulceDTO(ArrayList<CrepeDulce> listaCrepe){

        ArrayList<CrepeDulceDTO> listaDTO = new ArrayList<>();

        for (CrepeDulce crepeDulce : listaCrepe) {
            listaDTO.add(convertirCrepeDulceACrepeDulceDTO(crepeDulce));
        }

        return listaDTO;
    }

    public static ArrayList<CrepeDulce> convertirListaCrepeDulceDTOAListaCrepeDulce(ArrayList<CrepeDulceDTO> listaCrepeDTO){

        ArrayList<CrepeDulce> listaCrepe = new ArrayList<>();

        for (CrepeDulceDTO crepeDulceDTO : listaCrepeDTO) {
            listaCrepe.add(convertirCrepeDulceDTOACrepeDulce(crepeDulceDTO));
        }

        return listaCrepe;
    }


    public static CrepeSaladoDTO convertirCrepeSaladoACrepeSaladoDTO(CrepeSalado crepeSalado) {

        return new CrepeSaladoDTO(
                crepeSalado.getNombre(),
                crepeSalado.getPrecio(),
                crepeSalado.isEsVegano(),
                crepeSalado.getProteina(),
                crepeSalado.getSalsa()
        );
    }

    public static CrepeSalado convertirCrepeSaladoDTOACrepeSalado(CrepeSaladoDTO crepeSaladoDTO) {

        return new CrepeSalado(
                crepeSaladoDTO.getNombre(),
                crepeSaladoDTO.getPrecio(),
                crepeSaladoDTO.isEsVegano(),
                crepeSaladoDTO.getProteina(),
                crepeSaladoDTO.getSalsa()
        );
    }

    public static ArrayList<CrepeSaladoDTO> convertirListaCrepeSaladoAListaCrepeSaladoDTO(ArrayList<CrepeSalado> listaCrepeSalado){

        ArrayList<CrepeSaladoDTO> listaDTO = new ArrayList<>();

        for (CrepeSalado crepeSalado : listaCrepeSalado) {
            listaDTO.add(convertirCrepeSaladoACrepeSaladoDTO(crepeSalado));
        }

        return listaDTO;
    }

    public static ArrayList<CrepeSalado> convertirListaCrepeSaladoDTOAListaCrepeSalado(ArrayList<CrepeSaladoDTO> listaCrepeSaladoDTO){

        ArrayList<CrepeSalado> listaCrepeSalado = new ArrayList<>();

        for (CrepeSaladoDTO crepeSaladoDTO : listaCrepeSaladoDTO) {
            listaCrepeSalado.add(convertirCrepeSaladoDTOACrepeSalado(crepeSaladoDTO));
        }

        return listaCrepeSalado;
    }

    public static Helado convertirHeladoDTOAHelado(HeladoDTO heladoDTO) {

        return new Helado(
                heladoDTO.getNombre(),
                heladoDTO.getSabor(),
                heladoDTO.isesLight()
        );
    }

    public static HeladoDTO convertirHeladoAHeladoDTO(Helado helado) {

        return new HeladoDTO(
                helado.getNombre(),
                helado.calcularPrecio(),
                helado.getSabor(),
                helado.isEsLight()
        );
    }

    public static ArrayList<HeladoDTO> convertirListaHeladoAListaHeladoDTO(ArrayList<Helado> listaHelado){

        ArrayList<HeladoDTO> listaHeladoDTO = new ArrayList<>();

        for (Helado helado : listaHelado) {
            listaHeladoDTO.add(convertirHeladoAHeladoDTO(helado));
        }

        return listaHeladoDTO;
    }

    public static ArrayList<Helado> convertirListaHeladoDTOAListaHelado(ArrayList<HeladoDTO> listaHeladoDTO){

        ArrayList<Helado> listaHelado = new ArrayList<>();

        for (HeladoDTO heladoDTO : listaHeladoDTO) {
            listaHelado.add(convertirHeladoDTOAHelado(heladoDTO));
        }

        return listaHelado;
    }

    public static WaffleDTO convertirWaffleAWaffleDTO(Waffle waffle) {

        return new WaffleDTO(
                waffle.getNombre(),
                waffle.getPrecio(),
                waffle.getHeladoBase(),
                waffle.isTieneSalsa()
        );
    }

    public static Waffle convertirWaffleDTOAWaffle(WaffleDTO waffleDTO) {

        return new Waffle(
                waffleDTO.getNombre(),
                waffleDTO.getPrecio(),
                waffleDTO.getHeladoBase(),
                waffleDTO.isTieneSalsa()
        );
    }

    public static ArrayList<WaffleDTO> convertirListaWaffleAListaWaffleDTO(ArrayList<Waffle> listaWaffle){

        ArrayList<WaffleDTO> listaWaffleDTO = new ArrayList<>();

        for (Waffle waffle : listaWaffle) {
            listaWaffleDTO.add(convertirWaffleAWaffleDTO(waffle));
        }

        return listaWaffleDTO;
    }

    public static ArrayList<Waffle> convertirListaWaffleDTOAListaWaffle(ArrayList<WaffleDTO> listaWaffleDTO){

        ArrayList<Waffle> listaWaffle = new ArrayList<>();

        for (WaffleDTO waffleDTO : listaWaffleDTO) {
            listaWaffle.add(convertirWaffleDTOAWaffle(waffleDTO));
        }

        return listaWaffle;
    }
}
