# Angular Scala POC

Use [Angular](https://angular.io/) 6 with [Scala](https://www.scala-lang.org/) and [Scala.js](https://www.scala-js.org/).

Currently only the QuickStart guide is implemented.

## Things to do

- Automate source import in index.html
- Find better way to handle the decorators

## To make it run

You need [npm](https://www.npmjs.com/) to be installed on your machine. Then go to the `angular-build` in the command
line and use the command `npm install`. The required files will be downloaded based on the content of the
`angular-build/package.json` file.

Then use the `fastOptJS` task in [sbt](https://www.scala-sbt.org/). This will generate the `renderer-fastopt.js` file.
You can now open `angular-build/index.html` in any web browser.