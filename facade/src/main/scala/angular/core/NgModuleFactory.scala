package angular.core

import scala.scalajs.js

/**
  * https://angular.io/api/angular.core/NgModuleFactory
  */
abstract class NgModuleFactory[T] extends js.Object {

  val moduleType: Type[T]

  def create(parentInjector: Injector): NgModuleRef[T]

}
