package angular.core.decorators

import angular.core.Type

import scala.scalajs.js

trait NgModuleOptions extends js.Object {

  val imports: js.Array[Type[_]]

  val declarations: js.Array[Type[_]]

  val bootstrap: js.Array[Type[_]]

  val providers: js.Array[Type[_]]

}
