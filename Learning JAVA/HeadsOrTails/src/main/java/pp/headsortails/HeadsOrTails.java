
package pp.headsortails;


public class HeadsOrTails {
    
    String playerToken;
    
    // Constructor
    public HeadsOrTails(String token){
        playerToken = token;
    }
    
    // Start Game
    public void start(){
        if (Math.random()>= 0.5){
            System.out.println("\nThe coin is spinning...");
            System.out.println("It's Heads!");
            
            if (playerToken.equals("Heads")){
                System.out.println("\nY O U    W I N !!!!!");
            }
            else{
                System.out.println("\nY O U    L O S E !!!!!");
            }
        }
        else{
            System.out.println("\nThe coin is spinning...");
            System.out.println("It's Tails!");
            
            if (playerToken.equals("Tails")){
                System.out.println("\nY O U    W I N !!!!!");
            }
            else{
                System.out.println("\nY O U    L O S E !!!!!");
            }
        }
    }
    

        
    // Object to string... 
    @Override
    public String toString(){
        return "\nYour player token is " + playerToken;
    
    }

    public static void main(String[] args) {
        // Player 1
        HeadsOrTails player1 = new HeadsOrTails("Heads");
        System.out.println(player1);
        player1.start();
        
        // N E W    G A M E
        //Player 2
        //HeadsOrTails player2 = new HeadsOrTails("Tails!");
        //System.out.println(player2);
    }
}
