package br.com.ofm.gnre.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.ofm.gnre.model.TConfigUf;
import br.com.ofm.gnre.model.TUf;
import br.com.ofm.gnre.service.LoteConfiguracaoReceitaUF;
import br.com.ofm.gnre.service.impl.LoteConfiguracaoReceitaUFImpl;

/**
 *
 * @author efraim.silva
 */
public class ConfiguracaoReceitaUfUtil {
    
    public static final String cacertsPath = "C:\\Users\\efraim.silva\\NFeCacerts";
    public static final String pathCertificado = "c:\\dir_certificado\\Certificado.pfx";
    public static final String keyStorePassword = "ceal2017";
    public static final char[] passwordPin = keyStorePassword.toCharArray();
    
    private static final String[] receitasAcre = {"100013","100021","100030","100048","100056","100099","100102","100110"};
    private static final String[] receitasAlagoas = {"100013","100021","100030","100048","100056","100056","100080","100102","100110","100129","100137","100145","600016"};
    private static final String[] receitasAmazonas = {"100013","100021","100048","100056","100056","100064","100072","100080","100099","100102","100110","100129","100137","150010","500011","600016"};
    private static final String[] receitasAmapa = {"100013","100021","100030","100048","100056","100056","100099","100102","100110"};
    private static final String[] receitasBahia = {"100013","100021","100030","100048","100056","100056","100099","100102","100110","100129","100137"};
    private static final String[] receitasCeara = {"100013","100030","100048","100056","100056","100080","100099","100102","100110","100129","100137"};
    private static final String[] receitasDistritoFederal = {"100013","100021","100030","100048","100056","100056","100064","100099","100102","100110","100129","100137","500011"};
    private static final String[] receitasGoias = {"100013","100021","100030","100048","100056","100056","100099","100102","100110"};
    private static final String[] receitasMaranhao = {"100013","100021","100030","100048","100056","100056","100080","100099","100102","100110","100129","100137","600016"};
    private static final String[] receitasMinasGerais = {"100013","100021","100030","100048","100056","100056","100064","100080","100099","100102","100110","100129","100137","600016"};
    private static final String[] receitasMatoGrossoDoSul = {"100013","100021","100030","100048","100056","100056","100064","100072","100099","100102","100110","100129","100137","150010","500011","600016"};
    private static final String[] receitasMatoGrosso = {"100013","100030","100048","100056","100056","100080","100102","100110","100129","100137"};
    private static final String[] receitasPara = {"100013","100021","100030","100048","100056","100056","100064","100072","100080","100099","100102","100110","150010","500011","600016"};
    private static final String[] receitasParaiba = {"100013","100021","100030","100048","100056","100056","100080","100099","100102","100110","100129","100137"};
    private static final String[] receitasPernanbuco = {"100013","100021","100030","100048","100056","100056","100099","100102","100110","100137","100145","500011"};
    private static final String[] receitasPiaui = {"100013","100021","100030","100048","100056","100056","100099","100102","100110","100129","100137","500011"};
    private static final String[] receitasParana = {"100013","100021","100030","100048","100056","100056","100099","100102","100110","100145"};
    private static final String[] receitasRioGrandeDoNorte = {"100013","100021","100030","100048","100056","100080","100099","100102","100110","100129","100137"};
    private static final String[] receitasRondonia = {"100013","100021","100030","100048","100056","100056","100080","100099","100102","100110"};
    private static final String[] receitasRoraima = {"100003","100021","100030","100048","100048","100056","100056","100080","100099","100102","100110"};
    private static final String[] receitasRioGrandeDoSul = {"100013","100021","100030","100048","100056","100056","100064","100072","100080","100099","100102","100110","100129","100137","150010","500011","600016"};
    private static final String[] receitasSantaCatarina = {"100013","100021","100030","100048","100056","100056","100064","100072","100080","100099","100102","100110","100145","150010","600016"};
    private static final String[] receitasSergipe = {"100030","100048","100056","100056","100080","100099","100102","100110","100129","100137"};
    private static final String[] receitasTocatins = {"100013","100021","100030","100048","100056","100056","100080","100099","100102","100110","100129","100137"};
    
    public static List<TConfigUf> listaRegrasPreenchimentoPorUFAnReceita() {

    	List<TUf> listaUF = Arrays.asList(TUf.values());
    	List<TConfigUf> listaConfigUF = new ArrayList<TConfigUf>();
        
        //Para cada Estado, verificar a receita com as devidas regras de prenchimento
        for (TUf uf : listaUF) {
            
            switch (uf){
                case AC:
                    for (String codigoReceita : receitasAcre) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case AL:
                    for (String codigoReceita : receitasAlagoas) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case AM:
                    for (String codigoReceita : receitasAmazonas) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case AP:
                    for (String codigoReceita : receitasAmapa) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case BA:
                    for (String codigoReceita : receitasBahia) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case CE:
                    for (String codigoReceita : receitasCeara) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case DF:
                    for (String codigoReceita : receitasDistritoFederal) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                /*case ES:
                    for (String codigoReceita : receitas) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    listaConfigUF.add(retornaConfiguracaoUF(uf, cacertsPath));
                    break;*/
                case GO:
                    for (String codigoReceita : receitasGoias) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                 case MA:
                    for (String codigoReceita : receitasMaranhao) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case MG:
                    for (String codigoReceita : receitasMinasGerais) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case MS:
                    for (String codigoReceita : receitasMatoGrossoDoSul) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case MT:
                    for (String codigoReceita : receitasMatoGrosso) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case PA:
                    for (String codigoReceita : receitasPara) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case PB:
                    for (String codigoReceita : receitasParaiba) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case PE:
                    for (String codigoReceita : receitasPernanbuco) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case PI:
                    for (String codigoReceita : receitasPiaui) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case PR:
                    for (String codigoReceita : receitasParana) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                /*case RJ:
                    for (String codigoReceita : receitasDistritoFederal) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    listaConfigUF.add(retornaConfiguracaoUF(uf, cacertsPath));
                    break;*/
                case RN:
                    for (String codigoReceita : receitasRioGrandeDoNorte) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case RO:
                    for (String codigoReceita : receitasRondonia) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case RR:
                    for (String codigoReceita : receitasRoraima) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case RS:
                    for (String codigoReceita : receitasRioGrandeDoSul) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case SC:
                    for (String codigoReceita : receitasSantaCatarina) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                case SE:
                    for (String codigoReceita : receitasSergipe) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
//                case SP:
//                    listaConfigUF.add(retornaConfiguracaoUF(uf, cacertsPath));
//                    break;
                case TO:
                    for (String codigoReceita : receitasTocatins) {
                        listaConfigUF.add(retornaConfiguracaoUF(uf, codigoReceita));
                    }
                    break;
                 default:
                    break;
            }
        }
        return listaConfigUF;
    }
    
    private static TConfigUf retornaConfiguracaoUF(TUf uf, String codigoReceita){
        LoteConfiguracaoReceitaUF  loteConfiguracaoReceitaUF = new LoteConfiguracaoReceitaUFImpl();
        
        return loteConfiguracaoReceitaUF.retornaConfiguracaoUF(uf, codigoReceita,pathCertificado,null, keyStorePassword, cacertsPath);
    }
    
    /*private static TSimNao setarCourier(String codigoReceita) {
    	return "".equals(codigoReceita) ? TSimNao.S 
    }*/

}


