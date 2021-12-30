public class Golfinho extends Marinho {
    public Golfinho(){
      mergulharstrategy = new MergulharGolfinho();
      morderstrategy = new MorderGolfinho();
      tamanhostrategy = new TamanhoGolfinho();
      nadarstrategy = new NadarGolfinho();
    }
    @Override
    public void mergulhar(){
        System.out.println( "fica na surfice e brinca um antes de mergulhar" );
    }

    @Override
    public void morder(){
        System.out.println( "sim eles mordem, cuidado" );
    }
    
    @Override
    public void tamanho(){
        System.out.println( "relativamente grande, tipo uma orca");
    }

    @Override
    public void nadar(){
        System.out.println( "não é inofensivo" );
    }
}