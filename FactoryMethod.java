
public interface LeectorCodigo{
	public String getCodigo();
}

public class LeectorBarras implements LeectorCodigo{
	private String barsCode;

	public LeectorBarras(String code){
		this.barsCode = code;
	}

	@Override
  public String getCodigo() {
      return barsCode;
  }
}

public class LeectorQr implements LeectorCodigo{
	private String qrCode;

	public LeectorQr(String code){
		this.qrCode = code;
	}

	@Override
	public String getCodigo() {
      return qrCode;
  }
}