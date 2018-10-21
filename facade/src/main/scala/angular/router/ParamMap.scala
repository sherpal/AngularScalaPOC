package angular.router

import scala.scalajs.js

@js.native
trait ParamMap extends js.Object {

  val keys: js.Array[String] = js.native

  def has(name: String): Boolean = js.native

  def get(name: String): String = js.native

  def getAll(): js.Array[String] = js.native


}
