public class Baleia extends Marinho {
  public Baleia(){
      mergulharstrategy = new MergulharBaleia();
      morderstrategy = new MorderBaleia();
      tamanhostrategy = new TamanhoBaleia();
      nadarstrategy = new NadarBaleia();
    }
  @Override
    public void mergulhar(){
        System.out.println( "pode preender a respiração por até duas horas" );
    }

    @Override
    public void morder(){
        System.out.println( "não consegue engolir seres humanos" );
    }

    @Override
    public void tamanho(){
        System.out.println( "IMENSA");
    }

    @Override
    public void nadar(){
        System.out.println( "majestoso" );
    }
}
