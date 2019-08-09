
public class Block {
	
	private String data;
	private String previousHash;
	private String hash;
	
	public Block(String data,String pHash,String hash)
	{
		this.data=data;
		this.previousHash=pHash;
		this.hash=hash;
		
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

}
