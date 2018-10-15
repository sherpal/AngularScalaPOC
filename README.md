# Angular Scala POC

Use [Angular](https://angular.io/) 6 with [Scala](https://www.scala-lang.org/) and [Scala.js](https://www.scala-js.org/).

Currently only the QuickStart guide is implemented.

## TypeScript decorators

Scala.js compiles to pure JavaScript, and not TypeScript. Unfortunately, decorators do not exist in JS and we have to
translate them. The way it's supposed to be done is explained 
[here](https://v2.angular.io/docs/ts/latest/cookbook/ts-to-js.html).

In Scala.js, that translate to the decorated class having a companion object, that has a val `annotations` that is a
`js.Array` that contains a Component, or a NgModule...

## Things to do

- Automate source import in index.html
- Find better way to handle the decorators
- Check how to handle external template and style URL's

## To make it run

You need [npm](https://www.npmjs.com/) to be installed on your machine. Then go to the `angular-build` in the command
line and use the command `npm install`. The required files will be downloaded based on the content of the
`angular-build/package.json` file.

Then use the `fastOptJS` task in [sbt](https://www.scala-sbt.org/). This will generate the `renderer-fastopt.js` file.
You can now open `angular-build/index.html` in any web browser.