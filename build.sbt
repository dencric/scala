lazy val root = (project in file(".")).
  settings(
    name := "hello",
    version := "1.0",
    scalaVersion := "2.11.8",
    libraryDependencies += "org.json4s" %% "json4s-native" % "3.4.0"
  )
