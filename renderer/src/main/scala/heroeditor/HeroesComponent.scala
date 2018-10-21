package heroeditor

import angular.core.{OnInit, Type}
import angular.core.decorators.{Component, ComponentOptions}

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSExportStatic

final class HeroesComponent(heroService: HeroService) extends OnInit {

  var heroes: js.Array[Hero] = _

  def getHeroes(): Unit = {

    heroService.heroes
      .subscribe(hs => heroes = hs)

    heroes = MockHeroes.heroes

  }

  override def ngOnInit(): Unit = {
    println("Heroes Component")

    getHeroes()
  }

}

object HeroesComponent {

  @JSExportStatic
  val annotations: js.Array[Component] = js.Array(
    new Component(new ComponentOptions {
      override val selector: String = "app-heroes"

      override val templateUrl: UndefOr[String] = "./html/heroes-component.html"

      override val styleUrls: UndefOr[js.Array[String]] = js.Array("./css/heroes-component.css")
    })
  )

  @JSExportStatic
  val parameters: js.Array[Type[_]] = js.Array(
    Type.typeOf[HeroService]
  )


}