public class Tubarao extends Marinho {
    public Tubarao(){
      mergulharstrategy = new MergulharTubarao();
      morderstrategy = new MorderTubarao();
      tamanhostrategy = new TamanhoTubarao();
      nadarstrategy = new NadarTubarao();
    }
     @Override
    public void mergulhar(){
        System.out.println( "Tubarão profundo, pacas" );
    }

    @Override
    public void morder(){
        System.out.println( "tira pedaço, nhac" );
    }
    
    @Override
    public void tamanho(){
        System.out.println( "grande pra carambolas");
    }

    @Override
    public void nadar(){
        System.out.println( "much fast much mordida" );
    }
}
