package angular.core

import scala.scalajs.js

/**
  * https://angular.io/api/angular.core/PlatformRef
  */
@js.native
trait PlatformRef extends js.Object {

  val injector: Injector = js.native

  def destroyed: Boolean = js.native // Boolean TBC

  def bootstrapModuleFactory[M](
                                 moduleFactory: NgModuleFactory[M], options: BootstrapOptions = js.native
                               ): js.Promise[NgModuleRef[M]] = js.native

  def bootstrapModule[M](
                        moduleType: Type[M] // TODO: extra argument compilerOptions
                        ): js.Promise[NgModuleRef[M]] = js.native

  def onDestroy(callback: js.Function0[Unit]): Unit = js.native

  def destroy(): Unit = js.native

}
