public class Main {
    public static void main(String[] args) {
        String fileType = "csv";  // Choose "csv", "json", or "xml"
        String fileContent = ...;  // Load file content here

        BankStatementParser parser = ParserFactory.getParser(fileType);
        BankStatementAnalyzer analyzer = new BankStatementAnalyzer(parser);

        List<Transaction> transactions = analyzer.analyze(fileContent);
        System.out.println("Total Profit/Loss: " + analyzer.calculateTotal(transactions));
    }
}
