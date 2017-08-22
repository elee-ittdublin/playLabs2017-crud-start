
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- Pass page title and content """),format.raw/*1.34*/("""{"""),format.raw/*1.35*/("""html between braces"""),format.raw/*1.54*/("""}"""),format.raw/*1.55*/(""" """),format.raw/*1.56*/("""to the main view -->
"""),_display_(/*2.2*/main("Products")/*2.18*/ {_display_(Seq[Any](format.raw/*2.20*/("""
  """),format.raw/*3.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Categories</h4>
        </div>
      </div>
      <div class="col-sm-10">
        <table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Description</th>
            <th>Category</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
            <tr>
              <td>1</td>
              <td>Television</td>
              <td>Sony 42" LCD</td>
              <td>Audio Visual</td>
              <td>100</td>
              <td>720.00</td>
            </tr>
            <tr>
              <td>2</td>
              <td>Kettle</td>
              <td>Blue glass 1.8l</td>
              <td>Kitchen</td>
              <td>10</td>
              <td>89.00</td>
            </tr>
          </tbody>
        </table>
      </div>
  </div>
  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Aug 22 11:32:19 IST 2017
                  SOURCE: /home/wdd/webapps/playapps/playLab_crud-start/app/views/products.scala.html
                  HASH: ca17a7d29ebe4bf722e6336910bc259993f1fd3e
                  MATRIX: 1033->0|1093->33|1121->34|1167->53|1195->54|1223->55|1270->77|1294->93|1333->95|1362->98
                  LINES: 33->1|33->1|33->1|33->1|33->1|33->1|34->2|34->2|34->2|35->3
                  -- GENERATED --
              */
          