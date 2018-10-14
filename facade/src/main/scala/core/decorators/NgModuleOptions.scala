package core.decorators

import core.Type

import scala.scalajs.js

trait NgModuleOptions extends js.Object {

  val imports: js.Array[Type[_]]

  val declarations: js.Array[_]

  val bootstrap: js.Array[_]

  val providers: js.Array[_]

}
