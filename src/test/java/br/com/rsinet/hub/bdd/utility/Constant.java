package br.com.rsinet.hub.bdd.utility;

public class Constant {
    
	/** Configura��o do caminho e arquivo Excel */
	public static final String Path_TestData = "./src/test/java/br/com/rsinet/hub/bdd/testdata/";
	public static final String File_TestData = "TestData.xlsx";
	
	/** M�todo que recebe o arquivo do Excel e informa qual planilha cont�m a Massa de Dados */
	public static void recebeDadosDoExcel(String planilha) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, planilha);
	}

	/** M�todos que capturam os dados da Massa de Dados em Excel */
	public static String categoria() throws Exception {
		return ExcelUtils.getCellData(2, 0);
	}
	public static String categoriaInvalida() throws Exception {
		return ExcelUtils.getCellData(11, 0);
	}
	public static String produto() throws Exception {
		return ExcelUtils.getCellData(2, 1);
	}
	public static String confirmaProduto() throws Exception {
		return ExcelUtils.getCellData(2, 2);
	}
	public static String confirmaProdutoInvalido() throws Exception {
		return ExcelUtils.getCellData(11, 1);
	}

}
