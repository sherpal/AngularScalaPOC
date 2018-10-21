package angular.router

import angular.core.{ModuleWithProviders, Type}
import angular.router.Route.Routes

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("ng.router.RouterModule")
final class RouterModule extends js.Object


@js.native
@JSGlobal("ng.router.RouterModule")
object RouterModule extends Type[RouterModule] {

  def forRoot(routes: Routes): ModuleWithProviders[RouterModule] = js.native

}
