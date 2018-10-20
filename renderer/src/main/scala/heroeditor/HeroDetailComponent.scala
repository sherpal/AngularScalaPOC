package heroeditor

import angular.core.decorators.{Component, ComponentOptions}

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSExportStatic

final class HeroDetailComponent extends js.Object {

  var hero: Hero = _

}


object HeroDetailComponent {

  @JSExportStatic
  val annotations: js.Array[Component] = js.Array(
    new Component(new ComponentOptions {
      override val selector: String = "<app-hero-detail></app-hero-detail>"

      override val templateUrl: UndefOr[String] = "./html/hero-detail-component.html"

      override val styles: UndefOr[js.Array[String]] = js.Array[String]()

      override val inputs: UndefOr[js.Array[String]] = js.Array("hero")
    })
  )

}