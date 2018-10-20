package heroeditor

import angular.core.Type
import angular.core.decorators.Injectable
import rxjs.index.{Observable, RXJSIndex}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportStatic

final class HeroService(messageService: MessageService) extends js.Object {

  def heroes: Observable[js.Array[Hero]] = {
    messageService.add("HeroService: fetched heroes")
    RXJSIndex.of[js.Array[Hero]](MockHeroes.heroes)
  }

}


object HeroService {

  @JSExportStatic
  val annotations: js.Array[Injectable] = js.Array(
    new Injectable()
  )

  @JSExportStatic
  val parameters: js.Array[Type[_]] = js.Array(
    Type.typeOf[MessageService]
  )

}