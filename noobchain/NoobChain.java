package noobchain;
public class NoobChain {
  public static void main(String[] args) {
    Block genesisBlock = new Block("This is the first block", "0");
    System.out.println("Block 1 Hash: " + genesisBlock.hash);
  }
}