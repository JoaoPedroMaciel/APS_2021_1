public class Baiacu extends Marinho {
   public Baiacu(){
      mergulhoEstrategico = new MergulharBaiacu();
      morderEstrategico = new MorderBaiacu();
      tamanhoEstrategico = new TamanhoBaiacu();
      nadarEstrategico = new NadarBaiacu();
    }
  @Override
    public void mergulhar(){
        System.out.println( "não muito fundo" );
    }

    @Override
    public void morder(){
        System.out.println( "não morde mas é venenoso" );
    }
    
    @Override
    public void tamanho(){
        System.out.println( "pequeno...");
    }

    @Override
    public void nadar(){
        System.out.println( "meio meh..." );
    }
}
