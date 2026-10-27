package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.CrepeDulceDAO;
import co.edu.unbosque.model.persistence.CrepeSaladoDAO;
import co.edu.unbosque.model.persistence.HeladoDAO;
import co.edu.unbosque.model.persistence.WaffleDAO;

public class ModelFacade {


	private CrepeDulceDAO crepeDulceDAO;
	private CrepeSaladoDAO crepeSaladoDAO;
	private HeladoDAO heladoDAO;
	private WaffleDAO waffleDAO;
	
	public ModelFacade() {
		

		crepeDulceDAO = new CrepeDulceDAO();
		crepeSaladoDAO = new CrepeSaladoDAO();
		heladoDAO = new HeladoDAO();
		waffleDAO = new WaffleDAO();
	}

	
	public CrepeDulceDAO getCrepeDulceDAO() {
		return crepeDulceDAO;
	}

	public void setCrepeDulceDAO(CrepeDulceDAO crepeDulceDAO) {
		this.crepeDulceDAO = crepeDulceDAO;
	}

	public CrepeSaladoDAO getCrepeSaladoDAO() {
		return crepeSaladoDAO;
	}

	public void setCrepeSaladoDAO(CrepeSaladoDAO crepeSaladoDAO) {
		this.crepeSaladoDAO = crepeSaladoDAO;
	}

	public HeladoDAO getHeladoDAO() {
		return heladoDAO;
	}

	public void setHeladoDAO(HeladoDAO heladoDAO) {
		this.heladoDAO = heladoDAO;
	}

	public WaffleDAO getWaffleDAO() {
		return waffleDAO;
	}

	public void setWaffleDAO(WaffleDAO waffleDAO) {
		this.waffleDAO = waffleDAO;
	}
	public CrepeDulce crearCrepeNutella() {
        return new CrepeDulce(
                "Crepe de Nutella",
                9000,
                false,
                false,
                false,
                "Chocolate"
        );
    }

    public CrepeDulce crearCrepeFresas() {
        return new CrepeDulce(
                "Crepe de Fresas",
                11000,
                false,
                true,
                true,
                "Vainilla"
        );
    }

    public CrepeDulce crearCrepeMontBlanc() {
        return new CrepeDulce(
                "Crepe Mont Blanc",
                11600,
                false,
                true,
                true,
                "Avellana"
        );
    }
}
