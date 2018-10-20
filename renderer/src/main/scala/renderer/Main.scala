package renderer

import angular.core.{AngularCore, Type}
import modules.AppModule
import org.scalajs.dom
import angular.platformbrowserdynamic.PlatformBrowserDynamic

object Main {

  def main(args: Array[String]): Unit = {

    /**
      * Waiting the DOM to be loaded otherwise the CSS selectors won't exist.
      */
    dom.document.addEventListener("DOMContentLoaded", (_: dom.Event) => {

      if (!scala.scalajs.LinkingInfo.developmentMode) {
        /**
          * Syncing Angular production mode with Scala.js production mode.
          */
        AngularCore.enableProdMode()
      }

      println("Charging App")
      PlatformBrowserDynamic().bootstrapModule(Type.typeOf[AppModule])

    })

  }

}
