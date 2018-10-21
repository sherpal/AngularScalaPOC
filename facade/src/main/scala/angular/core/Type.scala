package angular.core

import scala.scalajs.js

/**
  * This is handled when calling Type.typeOf. It's currently the only way to create Type[T]
  */
@js.native
trait Type[+T] extends js.Function


object Type {

  /**
    * Getting the Type[T] of a Class, by calling js.constructorOf
    */
  def typeOf[T <: js.Any](implicit tag: js.ConstructorTag[T]): Type[T] = tag.constructor.asInstanceOf[Type[T]]

}
