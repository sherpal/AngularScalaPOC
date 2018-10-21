package angular.router

import angular.core.Type

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
trait ActivatedRoute extends js.Object {

  val snapshot: ActivatedRouteSnapshot = js.native

}

@js.native
@JSGlobal("ng.router.ActivatedRoute")
object ActivatedRoute extends Type[ActivatedRoute]