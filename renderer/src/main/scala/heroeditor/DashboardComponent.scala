package heroeditor

import angular.core.{OnInit, Type}
import angular.core.decorators.{Component, ComponentOptions}

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSExportStatic

final class DashboardComponent(heroService: HeroService) extends OnInit {

  var heroes: js.Array[Hero] = MockHeroes.heroes.slice(1, 5)

  def ngOnInit(): Unit =
    getHeroes()

  def getHeroes(): Unit = {
    heroService.heroes
      .subscribe(hs => heroes = hs.slice(1, 5))
  }

}

object DashboardComponent {

  @JSExportStatic
  val annotations: js.Array[Component] = js.Array(
    new Component(new ComponentOptions {
      override val selector: String = "app-dashboard"

      override val templateUrl: UndefOr[String] = "./html/dashboard-component.html"

      override val styleUrls: UndefOr[js.Array[String]] = js.Array("./css/dashboard-component.css")
    })
  )

  @JSExportStatic
  val parameters: js.Array[Type[_]] = js.Array(Type.typeOf[HeroService])

}
