// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vtex/scala-first-steps/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Mon Aug 03 12:47:46 BRT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
