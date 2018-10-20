package rxjs.index

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal


@js.native
@JSGlobal("rxjs.Observable")
class Observable[T] extends js.Object {

  def subscribe(
                 next: T => Unit = js.native,
                 error: js.Any => Unit = js.native,
                 complete: () => Unit = js.native
               ): Subscription = js.native

}
