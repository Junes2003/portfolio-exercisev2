package market;

/**
 * Represents a stock ticker symbol.
 *  @author OSNB
 *  @version 1.0
 */
public enum Symbol {
    //TODO: Tilføj aktie ticker symboler (fx AAPL, GOOG osv)
    AAPL,  // Apple
    GOOG,  // Google
    TSLA,  // Tesla
    AMZN;  // Amazon
    ;
    public static boolean isValidSymbol(String symbol) {
        //TODO: Tjek om inputstrengen findes i de eksisterende symboler i enum'en
        //      Returner true hvis den eksistere ellers returner false
        for (Symbol s : Symbol.values()) {
            if (s.name().equalsIgnoreCase(symbol)) {
                return true;
            }
        }
        return false;
    }
}
