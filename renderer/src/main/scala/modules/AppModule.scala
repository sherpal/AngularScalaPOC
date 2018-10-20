package modules

import angular.core.Type
import angular.core.decorators.{NgModule, NgModuleOptions}
import customcomponents.AppComponent
import angular.forms.FormsModule
import heroeditor._
import angular.platformbrowser.BrowserModule

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportStatic


/**
  * The @NgModule Decorator is implemented in the companion object, under annotations static field.
  */
final class AppModule extends js.Object

import Type.typeOf


object AppModule {

  @JSExportStatic
  val annotations: js.Array[NgModule] = js.Array(
    new NgModule(new NgModuleOptions {
      override val imports: js.Array[Type[_]] = js.Array(
        BrowserModule, FormsModule
      )
      override val declarations: js.Array[Type[_]] = js.Array(
        typeOf[AppComponent],
        typeOf[HeroesComponent],
        typeOf[HeroDetailComponent],
        typeOf[MessagesComponent]
      )
      override val bootstrap: js.Array[Type[_]] = js.Array(
        Type.typeOf[AppComponent]
      )
      override val providers: js.Array[Type[_]] = js.Array(
        typeOf[HeroService], typeOf[MessageService]
      )
    })
  )

}