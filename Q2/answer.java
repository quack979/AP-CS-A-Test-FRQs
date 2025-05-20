public class SignedText{
  private String first;
  private String last;
  public SignedText(String fir,String las){
    first=fir;
    last=las;
  }

  public String getSignature (){
    if(first.length()>0){
      return first.substring(0,1)+"-"+last;
    }else{
      return last;
    }
  }
  public String addSignature (String str){
    String sign = getSignature();
    int index = str.indexOf(sign);
    if(index==0){
      return str.substring(sign.length())+sign;
    }else if(index==str.length()-sign.length()){
      return str;
    }else{
      return str+sign;
    }
  }
}
