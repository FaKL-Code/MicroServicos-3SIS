package br.com.optimusprime.sprint2.mocks;

import java.util.ArrayList;
import java.util.HashMap;

import br.com.optimusprime.sprint2.dto.CargoUsuarioDTO;
import br.com.optimusprime.sprint2.dto.EmpresaDTO;
import br.com.optimusprime.sprint2.dto.EstadoDTO;
import br.com.optimusprime.sprint2.dto.PaisDTO;

public class Mocks {
	static PaisDTO brasil = new PaisDTO(1L, "Brasil");
	static PaisDTO argentina = new PaisDTO(2L, "Argentina");
	static PaisDTO uruguai = new PaisDTO(3L, "Uruguai");
	
	static EstadoDTO saoPauloBR = new EstadoDTO(1L, "São Paulo", brasil);
	static EstadoDTO rioJaneiroBR = new EstadoDTO(2L, "Rio de Janeiro", brasil);
	static EstadoDTO buenosAiresAR = new EstadoDTO(3L, "Buenos Aires", argentina);
	static EstadoDTO mendozaAR = new EstadoDTO(4L, "Mendoza", argentina);
	static EstadoDTO canelonesUR = new EstadoDTO(5L, "Canelones", uruguai);
	static EstadoDTO cerroLargoUR = new EstadoDTO(6L, "Cerro Largo", uruguai);
	
	static CargoUsuarioDTO cargoCEO = new CargoUsuarioDTO(1L, "CEO", "CEO da Scania", 1);
	static CargoUsuarioDTO cargoCTO = new CargoUsuarioDTO(2L, "CTO", "CTO da Scania", 2);
	static CargoUsuarioDTO cargoAdmin = new CargoUsuarioDTO(3L, "Administrador", "Administrador do aplicativo", 3);
	static CargoUsuarioDTO cargoGerenteFuncionarios = new CargoUsuarioDTO(4L, "Gerente 1", "Gerente dos funcionários que usam o aplicativo", 4);
	static CargoUsuarioDTO cargoGerenteEmpresas = new CargoUsuarioDTO(5L, "Gerente 2", "Gerente das empresas que usam o aplicativo", 4);
	static CargoUsuarioDTO cargoFuncionario = new CargoUsuarioDTO(6L, "Funcionário", "Um funcionário comum que usa o aplicativo", 5);
	static CargoUsuarioDTO cargoEmpresa = new CargoUsuarioDTO(7L, "Empresa", "Uma empresa que se cadastrou no aplicativo", 5);
	
	static EmpresaDTO empresaA = new EmpresaDTO(1L, "Empresa A", 0.5, 1);
	static EmpresaDTO empresaB = new EmpresaDTO(2L, "Empresa B", 0.0, 5);
	static EmpresaDTO empresaC = new EmpresaDTO(2L, "Empresa C", 0.7, 3);
	
	public static ArrayList<PaisDTO> getPaises() {
		ArrayList<PaisDTO> paises = new ArrayList<PaisDTO>();
		paises.add(brasil);
		paises.add(argentina);
		paises.add(uruguai);
		return paises;
	}
	
	public static ArrayList<EstadoDTO> getEstados() {
		ArrayList<EstadoDTO> estados = new ArrayList<EstadoDTO>();
		estados.add(saoPauloBR);
		estados.add(rioJaneiroBR);
		estados.add(buenosAiresAR);
		estados.add(mendozaAR);
		estados.add(canelonesUR);
		estados.add(cerroLargoUR);
		return estados;
	}
	
	public static ArrayList<CargoUsuarioDTO> getCargos() {
		ArrayList<CargoUsuarioDTO> cargos = new ArrayList<CargoUsuarioDTO>();
		cargos.add(cargoCEO);
		cargos.add(cargoCTO);
		cargos.add(cargoAdmin);
		cargos.add(cargoGerenteFuncionarios);
		cargos.add(cargoGerenteEmpresas);
		cargos.add(cargoFuncionario);
		cargos.add(cargoEmpresa);
		return cargos;
	}
	
	public static HashMap<Long, EstadoDTO> getEstadosAsSelect() {
		HashMap<Long, EstadoDTO> estados = new HashMap<Long, EstadoDTO>();
		estados.put(saoPauloBR.getId(), saoPauloBR);
		estados.put(rioJaneiroBR.getId(), rioJaneiroBR);
		estados.put(buenosAiresAR.getId(), buenosAiresAR);
		estados.put(mendozaAR.getId(), mendozaAR);
		estados.put(canelonesUR.getId(), canelonesUR);
		estados.put(cerroLargoUR.getId(), cerroLargoUR);
		return estados;
	}
	
	public static ArrayList<EmpresaDTO> getEmpresas() {
		ArrayList<EmpresaDTO> empresas = new ArrayList<EmpresaDTO>();
		empresas.add(empresaA);
		empresas.add(empresaB);
		empresas.add(empresaC);
		return empresas;
	}
}
