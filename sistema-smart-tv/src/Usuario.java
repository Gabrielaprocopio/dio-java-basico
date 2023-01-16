import javax.sound.midi.Soundbank;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(13);

        System.out.println("Canal sincronizado: " + smartTv.canal);

        System.out.println("Novo volume: " + smartTv.volume);
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

    }
}
