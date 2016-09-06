excludeFilter in unmanagedSources := HiddenFileFilter || "*zepellin*" 

val root = (project in file(".")).
  settings(
    name := "hello",
    version := "1.0",
    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq("org.json4s" %% "json4s-native" % "3.4.0",
                             "org.apache.spark" %% "spark-core" % "1.4.0",
                             "org.apache.spark" % "spark-streaming_2.11" % "1.4.0",
                             "org.apache.spark" % "spark-streaming-twitter_2.11" % "1.4.0")
  )
