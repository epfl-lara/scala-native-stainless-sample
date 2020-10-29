## Scala native with Stainless Libraries Sample Project 

This is an sbt project to compile to native code using scala native, 
using an example application that uses the library of Stainless system.

Tested with: 
  * sbt 1.3.13 
  * Oracle Corporation Java 1.8.0_181

## Running and deploying

To build, install java8 and `sbt` and then run in the root of this project
`sbt nativeLink`. Your executable should be in

`target/scala-2.11/scalanativeexample-out`

See scala native documentation at:

https://github.com/scala-native/scala-native/tree/master/docs/user

## Verifying

To verify your code, obtain Stainless from GitHub:

https://github.com/epfl-lara/stainless/

and put the `stainless` script from a recent release on your path and make sure `z3` and/or `cvc4` executables are on the path, then run

`stainless src/main/scala/Main.scala`

If you want your code to be re-verified as you are editing, use `--watch` mode.

See Stainless documentation at

https://epfl-lara.github.io/stainless/

