package modules

import core.Type
import core.decorators.{NgModule, NgModuleOptions}
import customcomponents.AppComponent
import platformbrowser.BrowserModule

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportStatic


/**
  * The @NgModule Decorator is implemented in the companion object, under annotations static field.
  */
final class AppModule extends js.Object


object AppModule {

  @JSExportStatic
  val annotations: js.Array[NgModule] = js.Array(
    new NgModule(new NgModuleOptions {
      override val imports: js.Array[Type[_]] = js.Array(
        BrowserModule
      )
      override val declarations: js.Array[_] = js.Array(
        js.constructorOf[AppComponent]
      )
      override val bootstrap: js.Array[_] = js.Array(
        js.constructorOf[AppComponent]
      )
      override val providers: js.Array[_] = js.Array()
    })
  )

}