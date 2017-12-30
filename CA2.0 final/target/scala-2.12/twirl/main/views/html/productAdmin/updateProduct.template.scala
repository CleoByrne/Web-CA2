
package views.html.productAdmin

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

object updateProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Long,Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.Product
/*5.2*/import helper._


Seq[Any](format.raw/*1.78*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/productAdmin/*7.14*/.main("Update Product", user)/*7.43*/ {_display_(Seq[Any](format.raw/*7.45*/("""
	"""),format.raw/*8.2*/("""<main>
		<div class="container">
			<h3 style='text-align: center;'>Update Product</h3>
		
			<div class="col-sm-12">
		
					"""),_display_(/*14.7*/form(action = routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*14.150*/ {_display_(Seq[Any](format.raw/*14.152*/("""
							"""),_display_(/*15.9*/CSRF/*15.13*/.formField),format.raw/*15.23*/("""
					"""),format.raw/*16.6*/("""<form>
									
							<div class="row">
		
												<div class="col-sm-12 form-group">
														<input type="text" name="Name" class="form-control input-xs" placeholder="Name" value=""""),_display_(/*21.103*/updateProductForm("name")/*21.128*/.value),format.raw/*21.134*/("""">
												</div>
		
													<div class="col-sm-12 form-group">
															"""),_display_(/*25.17*/inputRadioGroup(updateProductForm("category"), options = options("TV"->"TV","TV Accessories"->"TV Accessories","Computing"->"Computing","Phone"->"Phone","Phone_Accessories"->"Phone Accessories","Tablets"->"Tablets"),'_label -> "Category",'class -> "form-control")),format.raw/*25.280*/("""
															"""),format.raw/*26.16*/("""</div>
		
									<div class="col-sm-12 form-group">
											<input type="text" name="descriptionS" class="form-control input-xs" placeholder="Short Description" value=""""),_display_(/*29.121*/updateProductForm("descriptionS")/*29.154*/.value),format.raw/*29.160*/("""">
									</div>
									<div class="col-sm-12 form-group">
											<textarea type="text" name="descriptionL" class="form-control input-xs" placeholder="Long Description" rows="8">"""),_display_(/*32.125*/updateProductForm("descriptionL")/*32.158*/.value),format.raw/*32.164*/("""</textarea>
									</div>
									
									<div class="col-sm-12 form-group">
													<input type="number" name="stock" class="form-control input-xs" placeholder="Stock" min="0" value=""""),_display_(/*36.114*/updateProductForm("stock")/*36.140*/.value),format.raw/*36.146*/("""">
											</div>
									<div class="col-sm-12 form-group">
											<input type="number" name="price" class="form-control input-xs" placeholder="Price" min="0" step="0.01" value=""""),_display_(/*39.124*/updateProductForm("price")/*39.150*/.value),format.raw/*39.156*/("""">
									</div>
									
									<div class="col-sm-12 form-group">
											<input type="number" name="salePrice" class="form-control input-xs" placeholder="Sale Price" min="0" step="0.01"value=""""),_display_(/*43.132*/updateProductForm("salePrice")/*43.162*/.value),format.raw/*43.168*/("""">
									</div>
		
									<div class="col-sm-12 form-group">
											<input type="number" name="onSale" class="form-control input-xs" min="0" max="1" placeholder="On Sale?" value=""""),_display_(/*47.124*/updateProductForm("onSale")/*47.151*/.value),format.raw/*47.157*/("""">
									</div>
		
									<div class="col-sm-12 form-group">
											<input type="text" name="spec1" class="form-control input-xs" placeholder="Specification 1" value=""""),_display_(/*51.112*/updateProductForm("spec1")/*51.138*/.value),format.raw/*51.144*/("""">
									</div>
		
									<div class="col-sm-12 form-group">
											<input type="text" name="spec2" class="form-control input-xs" placeholder="Specification 2" value=""""),_display_(/*55.112*/updateProductForm("spec2")/*55.138*/.value),format.raw/*55.144*/("""">
									</div>
									
									<div class="col-sm-12 form-group">
											<input type="text" name="spec3" class="form-control input-xs" placeholder="Specification 3" value=""""),_display_(/*59.112*/updateProductForm("spec3")/*59.138*/.value),format.raw/*59.144*/("""">
									</div>
									
				<label>Image</label>
				<input class="btn-sm btn-default" type="file" name="upload">
			
				<br><br>
		
			<div class="col-sm-12 form-group">
			<div class="actions">
					<input type="submit" value="Save" class="btn btn-success pull-right">
					<a href=""""),_display_(/*70.16*/routes/*70.22*/.HomeController.index()),format.raw/*70.45*/("""">
						<button class="btn btn-danger pull-left">Cancel</button>
					</a>
			</div>
		</div>
							</div>
		
		
					</form>
			""")))}),format.raw/*79.5*/("""
		"""),format.raw/*80.3*/("""</div>
		</div>
		</main>
""")))}),format.raw/*83.2*/("""


"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user)

  def f:((Long,Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user) => apply(id,updateProductForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:08:26 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/productAdmin/updateProduct.scala.html
                  HASH: 8f5fb27751afb6b4405392d686fee73a2b3f09ca
                  MATRIX: 1006->1|1155->82|1184->108|1229->77|1259->105|1287->125|1315->128|1335->140|1372->169|1411->171|1440->174|1599->307|1752->450|1793->452|1829->462|1842->466|1873->476|1907->483|2134->682|2169->707|2197->713|2317->806|2602->1069|2647->1086|2852->1263|2895->1296|2923->1302|3141->1492|3184->1525|3212->1531|3439->1730|3475->1756|3503->1762|3722->1953|3758->1979|3786->1985|4022->2193|4062->2223|4090->2229|4311->2422|4348->2449|4376->2455|4585->2636|4621->2662|4649->2668|4858->2849|4894->2875|4922->2881|5138->3069|5174->3095|5202->3101|5532->3404|5547->3410|5591->3433|5762->3574|5793->3578|5853->3608
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|39->7|39->7|39->7|39->7|40->8|46->14|46->14|46->14|47->15|47->15|47->15|48->16|53->21|53->21|53->21|57->25|57->25|58->26|61->29|61->29|61->29|64->32|64->32|64->32|68->36|68->36|68->36|71->39|71->39|71->39|75->43|75->43|75->43|79->47|79->47|79->47|83->51|83->51|83->51|87->55|87->55|87->55|91->59|91->59|91->59|102->70|102->70|102->70|111->79|112->80|115->83
                  -- GENERATED --
              */
          