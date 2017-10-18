class Chick implements Animal 
{     
  private String myType;
  private String mySound;
  private String mySound2;
  public Chick(String type, String sound, String sound2) {
    myType = type;
    mySound = sound;
    mySound2 = sound2;
  }
  public Chick() {
    mySound = "unknown";
    mySound2 = "unknown";
  }
  public String getSound() {
   if ((int)Math.random()*2 == 0){
     return mySound2; 
    }
    else{
      return mySound;
    }
  }
  public String getType() {
    return myType;
  }
}