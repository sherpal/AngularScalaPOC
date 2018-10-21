package heroeditor

import angular.common.Location
import angular.core.{OnInit, Type}
import angular.core.decorators.{Component, ComponentOptions}
import angular.router.ActivatedRoute

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSExportStatic

import Type.typeOf

final class HeroDetailComponent(
                               route: ActivatedRoute,
                               heroService: HeroService,
                               location: Location
                               ) extends OnInit {

  var hero: Hero = _

  def getHero(): Unit = {
    val id = route.snapshot.paramMap.get("id").toInt

    hero = heroService.getHero(id)
  }

  override def ngOnInit(): Unit = {
    getHero()

    println(hero)
  }

  def goBack(): Unit = {
    location.back()
  }

}


object HeroDetailComponent {

  @JSExportStatic
  val annotations: js.Array[Component] = js.Array(
    new Component(new ComponentOptions {
      override val selector: String = "app-hero-detail"

      override val templateUrl: UndefOr[String] = "./html/hero-detail-component.html"

      override val styleUrls: UndefOr[js.Array[String]] = js.Array("./css/hero-detail-component.css")

      override val inputs: UndefOr[js.Array[String]] = js.Array("hero")
    })
  )

  @JSExportStatic
  val parameters: js.Array[Type[_]] = js.Array(
    ActivatedRoute,
    typeOf[HeroService],
    Location
  )

}