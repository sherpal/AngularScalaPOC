package core.decorators

import scala.scalajs.js

trait ComponentOptions extends js.Object {

  val selector: String

  val template: js.UndefOr[String] = js.undefined

  val templateUrl: js.UndefOr[String] = js.undefined

  val styleUrls: js.UndefOr[js.Array[String]] = js.undefined

  val styles: js.UndefOr[js.Array[String]] = js.undefined

  val inputs: js.UndefOr[js.Array[String]] = js.undefined

}
