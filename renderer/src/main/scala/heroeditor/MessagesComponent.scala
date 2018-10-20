package heroeditor

import angular.core.{OnInit, Type}
import angular.core.decorators.{Component, ComponentOptions}

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSExportStatic

final class MessagesComponent(val messageService: MessageService) extends OnInit {

  override def ngOnInit(): Unit = {

  }

}

object MessagesComponent {

  @JSExportStatic
  val annotations: js.Array[Component] = js.Array(
    new Component(new ComponentOptions {
      override val selector: String = "app-messages"

      override val templateUrl: UndefOr[String] = "./html/messages-component.html"

      override val styleUrls: UndefOr[js.Array[String]] = js.Array("./css/messages-component.css")
    })
  )

  @JSExportStatic
  val parameters: js.Array[Type[_]] = js.Array(
    Type.typeOf[MessageService]
  )

}