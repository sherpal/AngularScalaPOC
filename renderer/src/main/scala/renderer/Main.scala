package renderer

import core.Type
import modules.AppModule
import org.scalajs.dom
import platformbrowserdynamic.PlatformBrowserDynamic

object Main {

  def main(args: Array[String]): Unit = {

    /**
      * Waiting the DOM to be loaded otherwise the CSS selectors won't exist.
      */
    dom.document.addEventListener("DOMContentLoaded", (_: dom.Event) => {

      println("Charging App")
      PlatformBrowserDynamic().bootstrapModule(Type.typeOf[AppModule])
//    PlatformBrowserDynamic().bootstrapModule(js.constructorOf[AppModule].asInstanceOf[Type[AppModule]])

    })

  }

}
