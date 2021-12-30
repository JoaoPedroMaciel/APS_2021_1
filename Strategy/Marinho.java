abstract public class Marinho {

  protected MergulharStrategy mergulhoEstrategico;
  protected MorderStrategy morderEstrategico;
  protected TamanhoStrategy tamanhoEstrategico;
  protected NadarStrategy nadarEstrategico;
  
    abstract public void mergulhar();
    abstract public void morder();
    abstract public void tamanho();
    abstract public void nadar();

  public void setMergulharStrategy( MergulharStrategy mergulhoEstrategico ){
        this.mergulhoEstrategico = mergulhoEstrategico;
    }
    
  public void performarMergulhar(){
        mergulhoEstrategico.mergulhar();
  }

  public void setMorderStrategy( MorderStrategy morderEstrategico ){
        this.morderEstrategico = morderEstrategico;
    }
    
  public void performarMorder(){
        morderEstrategico.morder();
  }

  public void setTamanhoStrategy( TamanhoStrategy tamanhoEstrategico ){
        this.tamanhoEstrategico = tamanhoEstrategico;
    }
    
  public void performarTamanho(){
        tamanhoEstrategico.tamanho();
  }

  public void setNadarStrategy( NadarStrategy nadarEstrategico){
        this.nadarEstrategico = nadarEstrategico;
    }
    
  public void performarNadar(){
        nadarEstrategico.nadar();
  }
}
