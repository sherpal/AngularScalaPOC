package angular.core.decorators

import angular.core.{ModuleWithProviders, Type}

import scala.scalajs.js
import scala.scalajs.js.|

trait NgModuleOptions extends js.Object {

  val imports: js.Array[Type[_] | ModuleWithProviders[_]]

  val declarations: js.Array[Type[_]]

  val bootstrap: js.Array[Type[_]]

  val providers: js.Array[Type[_]]

  val exports: js.Array[Type[_]]

}
