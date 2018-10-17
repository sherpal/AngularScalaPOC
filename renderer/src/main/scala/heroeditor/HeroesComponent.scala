package heroeditor

import core.OnInit
import core.decorators.{Component, ComponentOptions}

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSExportStatic

final class HeroesComponent extends OnInit {

//  val hero: Hero = new Hero {
//    val id: Int = 1
//    val name: String = "Windstorm"
//  }

  var selectedHero: Hero = _

  def onSelect(hero: Hero): Unit =
    selectedHero = hero

  val heroes: js.Array[Hero] = MockHeroes.heroes

//  val hero: String = "Windstorm"

  override def ngOnInit(): Unit = {
    println("Heroes Component")
  }

}

object HeroesComponent {

  @JSExportStatic
  val annotations: js.Array[Component] = js.Array(
    new Component(new ComponentOptions {
      override val selector: String = "app-heroes"

      override val templateUrl: UndefOr[String] = "./html/heroes-component.html"

      override val styles: UndefOr[js.Array[String]] = js.Array[String]()
    })
  )




}