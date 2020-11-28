public class Television implements Subject{
  int channel;
  int volume;

  public void setChannel(int new_channel){
    this.channel = new_channel;
  }

  public void setVolume(int new_volume){
    this.volume = new_volume;
  }

  public int getChannel(){
    return this.channel;
  }

  public int getVolume(){
    return this.volume;
  }
}