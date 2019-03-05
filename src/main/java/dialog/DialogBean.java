package dialog;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

@ManagedBean
@ViewScoped
public class DialogBean {

	public void view() {
		Map<String,Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		
		PrimeFaces.current().dialog().openDynamic("test", options, null);
	}
}
