import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

public class NonenseCoinChain {
	 ArrayList<Block> blockList;
	
	public  NonenseCoinChain(String data) throws Exception {
	
		blockList = new ArrayList<Block>();
		Block createBlock=new Block(data, "0", getHashCode(data));
		blockList.add(createBlock);
		validate(blockList);
	}
	
	
	public void validate(List<Block> bchain)
	{
		boolean result=true;
		for(int i=1;i<bchain.size();i++)
		{
			if(bchain.get(i).getPreviousHash()==bchain.get(i-1).getHash())
			{
				result=true;
				System.out.println("Matched with previous Hash !!!!!!!");
			}
			else
			{
				result=false;
				System.out.println("No match found");
			}
		}
		
	}
	
	public void view()
	{
		for(int i=0; i < this.blockList.size() ; i++) {
			System.out.println("Block '" + (i+1) +"' - "+ this.blockList.get(i).getHash());
		}
		
	}
	
	public boolean mineNewCoin() throws Exception {
		
		String data = "Data" + this.blockList.get(this.blockList.size()-1).getHash();
		int num = 0;
		
		while(true) { 
			num++;
			String newhashcode = this.getHashCode(data + num);
			
			if(newhashcode.contains("ABCD")) {
				System.out.println("Found new Coin");
				Block createBlock=new Block("Data",this.blockList.get(this.blockList.size()-1).getHash() , newhashcode);
				blockList.add(createBlock);
				return true;
			} else {
				System.out.println("Finding new HashCode " + newhashcode);
			}
			
		}
	}
	
	public String getHashCode(String data) throws Exception {
		
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			byte[] digest = md.digest(data.getBytes(StandardCharsets.UTF_8));
			String md5 = DatatypeConverter.printHexBinary(digest);

			// print MD5 Message Digest
			return md5;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error in Hash Function");
		}
		
	}
	
	
	
	
	
}
