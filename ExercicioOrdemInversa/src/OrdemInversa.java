import javax.xml.transform.Source;

public class OrdemInversa {
    public static void main(String[] args) throws Exception {
        
        int[] vetor= {5,9,7,4,3,6};

        System.out.println("Vetor: ");

        int count= 0; 
        while(count<(vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i= (vetor.length -1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
}
