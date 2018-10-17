package customcomponents

import core.OnInit
import core.decorators.{Component, ComponentOptions}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportStatic

/**
  * An example of a component. The @Component decorator is taken care of in the companion object, under annotations.
  *
  * AppComponent extends from [[OnInit]] so that it does stuff when initiated.
  */
final class AppComponent extends OnInit {

  val title: String = "Angular with Scala.js"

  def subtitle(): String = "This is a subtitle"

  override def ngOnInit(): Unit = { println("AppComponent") }

}

object AppComponent {

  /**
    * The @Component decorator for AppComponent.
    */
  @JSExportStatic
  val annotations: js.Array[Component] = js.Array(
    new Component(new ComponentOptions {
      val selector: String = "app-root"

      override val templateUrl: js.UndefOr[String] = "./html/app-component.html"

//      override val template: js.UndefOr[String] =
//        """
//          |<h1>{{ title }}</h1>
//          |<app-heroes></app-heroes>
//        """.stripMargin
    })
  )

}