# Angular Scala POC

Use [Angular](https://angular.io/) 6 with [Scala](https://www.scala-lang.org/) and [Scala.js](https://www.scala-js.org/).

The beginning of the "Tour of Heroes" tutorial is implemented.

## TypeScript decorators

Scala.js compiles to pure JavaScript, and not TypeScript. Unfortunately, decorators do not exist in JS and we have to
translate them. The way it's supposed to be done is explained 
[here](https://v2.angular.io/docs/ts/latest/cookbook/ts-to-js.html).

In Scala.js, that translate to the decorated class having a companion object, that has a val `annotations` that is a
`js.Array` that contains a Component, or a NgModule...

## Scala.js Angular specificities

### Decorators

[This page](https://v2.angular.io/docs/ts/latest/cookbook/ts-to-js.html) explains how TypeScript decorators have to be
translated into JavaScript. Essentially, for 
```typescript
@SomeDecorator({ ... })
class Foo {}
```
there has to be a JS array `annotations` on the object `Foo`. 
In Scala, this will be translated by setting a value 
`annotations: js.Array[Decorator]` to the companion object, and annotate it by `@JSExportStatic`.

### Injectables

Injectables must be

- set as providers within the NgModule
- have their companion object have an `annotations` js-exported static field, which is a `js.Array[Injectable]`
- be specified in the static js-exported `parameters` of the companion object in which they must be injected

 

### External templates and style sheets

For HTML templates and CSS style sheets that are associated to a component via its decorator, the specified path has to
be relative to the `index.html` file.

## Things to do

- Automate source import in index.html
- Find better way to handle the decorators

## To make it run

You need [npm](https://www.npmjs.com/) to be installed on your machine. Then go to the `angular-build` in the command
line and use the command `npm install`. The required files will be downloaded based on the content of the
`angular-build/package.json` file.

Then use the `fastOptJS` task in [sbt](https://www.scala-sbt.org/). This will generate the `renderer-fastopt.js` file.

Open a local server in the project directory (for example with [http-server](https://www.npmjs.com/package/http-server))
and, in a browser, go to `localhost:[port]/angular-build/index.html`, with the port of the server.
