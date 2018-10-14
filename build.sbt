name := "AngularScalaPOC"

version := "0.1"

scalaVersion in ThisBuild := "2.12.6"

lazy val facade = project.in(file("facade"))
  .enablePlugins(ScalaJSPlugin)

lazy val renderer = project.in(file("renderer"))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies +=
      "org.scala-js" %%% "scalajs-dom" % "0.9.6"
  )
  .dependsOn(facade)

