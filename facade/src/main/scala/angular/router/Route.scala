package angular.router

import angular.core.Type

import scala.scalajs.js

trait Route extends js.Object {

  val path: js.UndefOr[String] = js.undefined

  val redirectTo: js.UndefOr[String] = js.undefined

  val pathMatch: js.UndefOr[String] = js.undefined

  val component: js.UndefOr[Type[js.Any]] = js.undefined

}

object Route {

  type Routes = js.Array[Route]

}