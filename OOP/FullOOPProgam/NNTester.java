class NeuralNetwork {
    private static int numOfLayers;
    private static int nodesPerLayer;
  
    
     public NeuralNetwork(int nol, int npl){
         numOfLayers = nol;
         nodesPerLayer = npl;
     }
        
    static void addLayerAndNodes(){
        numOfLayers++;
        nodesPerLayer++;
    }
    
    static int howManyLayers(){
     return numOfLayers;   
    }
    
    static int howManyNodes(){
     return nodesPerLayer;   
    }
    
}

class CNN extends NeuralNetwork {
    CNN(int a, int b){
     super(a, b);   
    }
}

class RNN extends NeuralNetwork {
    RNN(){
     super(50, 40);   
    }
}

public class NNTester {
    public static void main(String args[]){
        NeuralNetwork mine = new NeuralNetwork(20, 4);
        System.out.println("Super class layers: " + mine.howManyLayers());
        System.out.println("Super class nodes: " + mine.howManyNodes());
        
        
        CNN myCNN = new CNN(6, 7);
        System.out.println("CNN sub class layers: " + myCNN.howManyLayers());
        System.out.println("CNN sub class nodes: " + myCNN.howManyNodes());
        
        RNN myRNN = new RNN();
        System.out.println("RNN sub class layers: " + myCNN.howManyLayers());
        System.out.println("RNN sub class nodes: " + myCNN.howManyNodes());
        
    }
}









