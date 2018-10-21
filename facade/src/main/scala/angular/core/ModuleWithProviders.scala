package angular.core

import scala.scalajs.js

@js.native
trait ModuleWithProviders[+T] extends js.Object {

  val ngModule: Type[T] = js.native

}
