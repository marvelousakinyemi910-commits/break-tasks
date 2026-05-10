package BankApp;

public enum BankCode {
    ACCESS_BANK("044"),
    AFRI_BANK("014"),
    GTBANK("058"),
    ZENITH("057");

    private final String code;

    BankCode(String code){
        this.code = code;
    }
   public String getCode(){
        return code;
   }
}
