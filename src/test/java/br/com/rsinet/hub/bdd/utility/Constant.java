package br.com.rsinet.hub.bdd.utility;

public class Constant {
    
	/** Configuração do caminho e arquivo Excel */
	public static final String Path_TestData = "./src/test/java/br/com/rsinet/hub/bdd/testdata/";
	public static final String File_TestData = "TestData.xlsx";
	
	/** Método que recebe o arquivo do Excel e informa qual planilha contém a Massa de Dados */
	public static void recebeDadosDoExcel(String planilha) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, planilha);
	}

	/** Métodos que capturam os dados da Massa de Dados em Excel */
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
