
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/CA2.0 final/conf/routes
// @DATE:Wed Dec 20 22:08:21 GMT 2017


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
