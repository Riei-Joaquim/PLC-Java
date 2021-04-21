package Q3;

public enum IdentidadeGenero {
    CISGENERO("cisgênero"), 
    TRANSGENERO("transgênero"), 
    GENERO_FLUIDO("gênero fluido"), 
    NAO_BINARIO("não-binário");

    private String _strValue;

    IdentidadeGenero(String strValue) {
        this._strValue = strValue;
    }

    public String toString() {
        return this._strValue;
    }
}
