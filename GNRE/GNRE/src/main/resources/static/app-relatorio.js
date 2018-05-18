function imprimir(relatorio, parametros) {
    var form = document.createElement("form");
    form.setAttribute("method", 'POST');
    form.setAttribute("target", '_blank');
    form.setAttribute("action", '/relatorio/gerar/' + relatorio);
    
    _mapearParametrosForm(form, parametros);
}

function imprimirDanfe(idNota, idEmpresa, endAssinaFiscal, download = false) {
	var form = document.createElement("form");
    form.setAttribute("method", 'POST');
    form.setAttribute("target", '_blank');
    form.setAttribute("action", endAssinaFiscal + '/danfe/imprimir');
	
    parametros = {};
    parametros['idEmpresa'] = idEmpresa;
    parametros['idNotaFiscal'] = idNota; 
    parametros['download'] = download; 

    _mapearParametrosForm(form, parametros);    
}

function imprimirVariosDanfe(idNotas, idEmpresa, endAssinaFiscal, formato) {
	var form = document.createElement("form");
    form.setAttribute("method", 'POST');
    form.setAttribute("target", '_blank');
    form.setAttribute("action", endAssinaFiscal + '/danfe/imprimirVarios');
	
    parametros = {};
    parametros['idEmpresa'] = idEmpresa;
    parametros['idNotaFiscalList'] = idNotas; 
    parametros['formato'] = formato; 

    _mapearParametrosForm(form, parametros);    
}

function _mapearParametrosForm(form, parametros) {
	for (var key in parametros) {
        if (parametros.hasOwnProperty(key)) {

            var hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", key);
            hiddenField.setAttribute("value", parametros[key]);

            form.appendChild(hiddenField);
        }
    }

    document.body.appendChild(form);
    form.submit();
    form.remove();
}

/*var url_apex_reports = "http://10.1.1.154:8080/AssinaFiscal/";
function _getUrlAssinaFiscal() {
	// return $v('PG_P_END_ASSINA_FISCAL');
	return url_apex_reports;
}*/