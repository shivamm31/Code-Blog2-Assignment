/*
package SOLID.DependancyInversion

class SwitchElec(client: Switchable) extends Switch {


  var switchable: Switchable = client
  var on: Boolean = false

  override def isOn: Boolean = {
    this.on
  }
  override def press: Boolean = {

    val checkOn: Boolean = isOn
    if(checkOn){
     this.on = false
    client.turnOff
    }
    else{
      this.on = true
    client.turnOn

    }
  }

}
*/
