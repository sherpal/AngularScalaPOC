package customcomponents

import core.decorators.{Component, ComponentOptions}
import core.OnInit

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportStatic


class HeroComponent extends OnInit {

  val title: String = "Hero Detail"

  val hero: String = "Windstorm"

  override def ngOnInit(): Unit = {
    println("HeroComponent OnInit")
  }

}


object HeroComponent {

  @JSExportStatic
  val annotations: js.Array[Component] = js.Array(
    new Component(new ComponentOptions {
      override val selector: String = "app-heroes"
      override val template: js.UndefOr[String] = "<h1>{{title}}: {{ hero }}</h1>"
    })
  )

}