package br.com.rsinet.hub.bdd.utility;

public class Constant {
    
	/** Configuracao do caminho e arquivo Excel */
	private static final String Path_TestData = "./src/test/java/br/com/rsinet/hub/bdd/testdata/";
	private static final String File_TestData = "TestData.xlsx";
	
	/** Metodo que recebe o arquivo do Excel e informa qual planilha contem a Massa de Dados */
	protected static void recebeDadosDoExcel(String planilha) throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, planilha);
	}

	/** Metodos que capturam os dados da Massa de Dados em Excel */
	public static String categoria() throws Exception {
		return ExcelUtils.getCellData(4, 0);
	}
	public static String categoriaInvalida() throws Exception {
		return ExcelUtils.getCellData(11, 0);
	}
	public static String produto() throws Exception {
		return ExcelUtils.getCellData(4, 1);
	}
	public static String confirmaProduto() throws Exception {
		return ExcelUtils.getCellData(4, 2);
	}
	public static String confirmaProdutoInvalido() throws Exception {
		return ExcelUtils.getCellData(14, 1);
	}

}
