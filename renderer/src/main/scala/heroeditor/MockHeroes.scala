package heroeditor

import scala.scalajs.js

import scala.scalajs.js.JSConverters._


object MockHeroes {

  private val names: List[String] = List(
    "Mr. Nice", "Narco", "Bombasto", "Celeritas", "Magneta", "RubberMan",
    "Dynama", "Dr IQ", "Magma", "Tornado"
  )

  val heroes: js.Array[Hero] = names.zipWithIndex.map({
    case (n, index) => new Hero {
      val id: Int = index + 11
      val name: String = n
    }
  }).toJSArray


}
