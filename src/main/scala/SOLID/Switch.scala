/*
package SOLID


//class Bulb(value: Boolean) extends Switchable(value = value)


object main extends App{

  //val bulb = new Bulb(true)
  /*println(bulb.isOn)
  println(switchable.isOn)
*/
  val bulb = new Switchable {
    override var isOn: Boolean = false
    override var name: String = "Bulb"
  }
  val electricSwitch = (client: Switchable) => {
    if(client.isOn) {
      println(client.name+" is off")
      client.isOn=false
    }
    else {
      println(client.name+" is On")
      client.isOn = true
    }
  }
  electricSwitch(bulb)
  electricSwitch(bulb)

  println()
  val fan = new Fan
  electricSwitch( fan)
  electricSwitch(fan)




}*/
