
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/playLab_crud-start/conf/routes
// @DATE:Tue Aug 22 11:32:19 IST 2017


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