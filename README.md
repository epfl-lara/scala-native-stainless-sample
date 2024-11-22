## Scala native with Stainless Libraries Sample Project 

This is an sbt project to compile to native code using scala native, 
using an example application that uses the library of Stainless system.

Tested with: 
  * sbt 10.1.0
  * openjdk 17.0.13 2024-10-15

## Running and deploying

To build, install the JDK and `sbt`. In the root directory run
`sbt nativeLink`. Given scala version 3.5.2, your executable
will be in

`target/scala-3.5.2/scala-native-stainless-sample`

See scala native documentation at:

https://scala-native.org/en/stable/

## Verifying

To verify your code, obtain Stainless from GitHub:

https://github.com/epfl-lara/stainless/

then run

`stainless src/main/scala/Main.scala`

If you want your code to be re-verified as you are editing, use `--watch` mode.

See Stainless documentation at

https://epfl-lara.github.io/stainless/
