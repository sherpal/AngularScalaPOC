package modules

import angular.core.{ModuleWithProviders, Type}

import scala.scalajs.js
import angular.core.decorators.{NgModule, NgModuleOptions}
import angular.router.Route.Routes
import angular.router.{Route, RouterModule}
import heroeditor.{DashboardComponent, HeroDetailComponent, HeroesComponent}

import scala.scalajs.js.{UndefOr, |}
import scala.scalajs.js.annotation.JSExportStatic
import Type.typeOf


final class AppRoutingModule extends js.Object

object AppRoutingModule {

  @JSExportStatic
  val annotations: js.Array[NgModule] = {
    val routes: Routes = js.Array(
      new Route {
        override val path: UndefOr[String] = "heroes"
        override val component: UndefOr[Type[js.Any]] = typeOf[HeroesComponent]
      },
      new Route {
        override val path: UndefOr[String] = "dashboard"
        override val component: UndefOr[Type[js.Any]] = typeOf[DashboardComponent]
      },
      new Route {
        override val path: UndefOr[String] = ""
        override val redirectTo: UndefOr[String] = "/dashboard"
        override val pathMatch: UndefOr[String] = "full"
      },
      new Route {
        override val path: UndefOr[String] = "detail/:id"
        override val component: UndefOr[Type[js.Any]] = typeOf[HeroDetailComponent]
      }
    )

    js.Array(
      new NgModule(new NgModuleOptions {
        override val imports: js.Array[Type[_] | ModuleWithProviders[_]] = js.Array(
          RouterModule.forRoot(routes)
        )
        override val declarations: js.Array[Type[_]] = js.Array()
        override val bootstrap: js.Array[Type[_]] = js.Array()
        override val providers: js.Array[Type[_]] = js.Array()
        override val exports: js.Array[Type[_]] = js.Array(
          RouterModule
        )
      })
    )
  }


}