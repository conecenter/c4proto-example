
scalaVersion := "2.11.8"

ivyConfigurations += config("compileonly").hide
unmanagedClasspath in Compile ++= update.value.select(configurationFilter("compileonly"))
resolvers += Resolver.url("scalameta", url("http://dl.bintray.com/scalameta/maven"))(Resolver.ivyStylePatterns)
libraryDependencies += "org.scalameta" % "scalameta_2.11" % "1.4.0.544" % "compileonly"
addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0.132" cross CrossVersion.full)

resolvers += Resolver.url("conecenter", url("http://dl.bintray.com/conecenter2b/maven"))(Resolver.ivyStylePatterns)
libraryDependencies += "ee.cone" %% "c4event-source-base" % "0.3.2"
libraryDependencies += "ee.cone" %% "c4proto-macros" % "0.3.2"