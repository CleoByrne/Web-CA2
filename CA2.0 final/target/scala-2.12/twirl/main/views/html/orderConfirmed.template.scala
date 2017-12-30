
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.69*/("""


"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Order Confirmation", customer)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""


"""),format.raw/*11.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*14.4*/if(flash.containsKey("success"))/*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""
			  """),format.raw/*15.6*/("""<div class="alert alert-success">
			      """),_display_(/*16.11*/flash/*16.16*/.get("success")),format.raw/*16.31*/("""
			  """),format.raw/*17.6*/("""</div>
		""")))}),format.raw/*18.4*/(""" 

		"""),format.raw/*20.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*31.18*/if(order != null)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
                    """),_display_(/*32.22*/for(i <- order.getItems) yield /*32.46*/ {_display_(Seq[Any](format.raw/*32.48*/("""
                    """),format.raw/*33.21*/("""<tr>
                        <td>"""),_display_(/*34.30*/i/*34.31*/.getProduct.getName),format.raw/*34.50*/("""</td>
                        <td>"""),_display_(/*35.30*/i/*35.31*/.getProduct.getDescriptionS),format.raw/*35.58*/("""</td>
                        """),_display_(/*36.26*/if(i.getOnSale == 1)/*36.46*/{_display_(Seq[Any](format.raw/*36.47*/("""
                            """),format.raw/*37.29*/("""<td data-th="Price">&euro; """),_display_(/*37.57*/("%.2f".format(i.getSalePrice))),format.raw/*37.88*/("""</td>
                          """)))}),format.raw/*38.28*/(""" 
                          """),format.raw/*39.27*/("""else """),format.raw/*39.32*/("""{"""),format.raw/*39.33*/("""
                          """),format.raw/*40.27*/("""<td data-th="Price">&euro; """),_display_(/*40.55*/("%.2f".format(i.getPrice))),format.raw/*40.82*/("""</td>
                          """),format.raw/*41.27*/("""}"""),format.raw/*41.28*/("""
                        """),format.raw/*42.25*/("""<td>"""),_display_(/*42.30*/i/*42.31*/.getQuantity()),format.raw/*42.45*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getItemTotal))),format.raw/*43.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*45.22*/("""
              """)))}),format.raw/*46.16*/("""
			"""),format.raw/*47.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*51.68*/("%.2f".format(order.getOrderTotal))),format.raw/*51.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:08:25 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/orderConfirmed.scala.html
                  HASH: ffc880d5c9c161cc8e63ec5e8cd98a2f3e5e7e7d
                  MATRIX: 998->1|1138->75|1174->106|1206->133|1260->68|1292->159|1320->162|1364->198|1403->200|1436->206|1512->256|1553->288|1593->290|1627->297|1699->342|1713->347|1749->362|1783->369|1824->380|1858->387|2149->651|2175->668|2215->670|2265->693|2305->717|2345->719|2395->741|2457->776|2467->777|2507->796|2570->832|2580->833|2628->860|2687->892|2716->912|2755->913|2813->943|2868->971|2920->1002|2985->1036|3042->1065|3075->1070|3104->1071|3160->1099|3215->1127|3263->1154|3324->1187|3353->1188|3407->1214|3439->1219|3449->1220|3484->1234|3554->1277|3606->1308|3692->1363|3740->1380|3772->1385|3952->1538|4010->1574
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|40->8|40->8|43->11|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|52->20|63->31|63->31|63->31|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|74->42|74->42|74->42|74->42|75->43|75->43|77->45|78->46|79->47|83->51|83->51
                  -- GENERATED --
              */
          