package angular.core

import scala.scalajs.js

/**
  * https://angular.io/api/angular.core/NgModuleRef
  */
abstract class NgModuleRef[T] extends js.Object {

  val injector: Injector

  // TODO: abstract componentFactoryResolver: ComponentFactoryResolver

  val instance: T

  def destroy(): Unit

  def onDestroy(callback: () => Unit): Unit



}
