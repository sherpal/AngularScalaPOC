package rxjs.index

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

@js.native
@JSGlobal("rxjs")
object RXJSIndex extends js.Object {

  def of[T](args: T*): Observable[T] = js.native

  def of[T](args: js.Array[T]): Observable[T] = js.native

}
