package funcoes;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Mensagens {
	FacesContext context = FacesContext.getCurrentInstance();
	
	public void INFO(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Informa��o", msg));
	}
	
	public void ATENCAO(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aten��o", msg));
	}
	
	public void FATAL(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "ERRO!", msg));
	}
	
	public void NEGADO(String msg){
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Acesso Negado!", msg));
	}
}
