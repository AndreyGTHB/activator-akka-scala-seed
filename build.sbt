name := "akka-scala-seed"

version := "15v09p01"

libraryDependencies ++= Seq(
  TypesafeLibrary.akkaActor.value,
  TypesafeLibrary.akkaTestkit.value % "test",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test")
