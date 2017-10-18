class NamedCow extends Cow
{
  private String myName;
  //private String type;
  //private String sound;
  public NamedCow(String type, String name, String sound){
    super(type,sound);
    myName = name;
}
public String getmyName() {
  return myName;
}

}