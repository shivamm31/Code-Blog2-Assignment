package SOLID.DependancyInversion



object SwitchAppliance extends App {


  val electricSwitch = (client: Switchables) => {
    if (client.isOn) {
      println(client.name + " is off")
      client.isOn = false
    }
    else {
      println(client.name + " is On")
      client.isOn = true
    }
  }
  val bulbSwitch = new Switchables {
    override var isOn: Boolean = false
    override var name: String = "Bulb"
  }
  electricSwitch(bulbSwitch)
  electricSwitch(bulbSwitch)

  println()
  val fanSwitch = new Fan
  electricSwitch(fanSwitch)
  electricSwitch(fanSwitch)


}