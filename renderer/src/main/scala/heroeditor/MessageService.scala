package heroeditor

import angular.core.decorators.Injectable

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportStatic

final class MessageService extends js.Object {

  val messages: js.Array[String] = js.Array()

  def add(message: String): Unit = {
    messages.push(message)
  }

  def clear(): Unit = {
    messages.clear()
  }

}

object MessageService {

  @JSExportStatic
  val annotations: js.Array[Injectable] = js.Array(
    new Injectable()
  )

}