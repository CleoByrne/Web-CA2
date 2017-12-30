
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProductForm: Form[models.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.Product
/*5.2*/import helper._


Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/productAdmin/*7.14*/.main("New Product", user)/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""
	"""),format.raw/*8.2*/("""<main>
<div class="container">
	<h3 style='text-align: center;'>Add a new Product</h3>

	<div class="col-sm-12">

			"""),_display_(/*14.5*/form(action = routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*14.143*/ {_display_(Seq[Any](format.raw/*14.145*/("""
					"""),_display_(/*15.7*/CSRF/*15.11*/.formField),format.raw/*15.21*/("""
			"""),format.raw/*16.4*/("""<form>
							
					<div class="row">

										<div class="col-sm-12 form-group">
												<input type="text" name="Name" class="form-control input-xs" placeholder="Name" value=""""),_display_(/*21.101*/addProductForm("name")/*21.123*/.value),format.raw/*21.129*/("""">
										</div>

											<div class="col-sm-12 form-group">
													"""),_display_(/*25.15*/inputRadioGroup(addProductForm("category"), options = options("TV"->"TV","TV Accessories"->"TV Accessories","Computing"->"Computing","Phone"->"Phone","Phone_Accessories"->"Phone Accessories","Tablets"->"Tablets"),'_label -> "Category",'class -> "form-control")),format.raw/*25.275*/("""
													"""),format.raw/*26.14*/("""</div>

							<div class="col-sm-12 form-group">
									<input type="text" name="descriptionS" class="form-control input-xs" placeholder="Short Description" value=""""),_display_(/*29.119*/addProductForm("descriptionS")/*29.149*/.value),format.raw/*29.155*/("""">
							</div>
							<div class="col-sm-12 form-group">
									<textarea type="text" name="descriptionL" class="form-control input-xs" placeholder="Long Description" rows="8" value=""""),_display_(/*32.130*/addProductForm("descriptionL")/*32.160*/.value),format.raw/*32.166*/(""""></textarea>
							</div>
							
							<div class="col-sm-12 form-group">
											<input type="number" name="stock" class="form-control input-xs" placeholder="Stock" min="0" value=""""),_display_(/*36.112*/addProductForm("stock")/*36.135*/.value),format.raw/*36.141*/("""">
									</div>
							<div class="col-sm-12 form-group">
									<input type="number" name="price" class="form-control input-xs" placeholder="Price" min="0" step="0.01" value=""""),_display_(/*39.122*/addProductForm("price")/*39.145*/.value),format.raw/*39.151*/("""">
							</div>
							
							<div class="col-sm-12 form-group">
									<input type="number" name="salePrice" class="form-control input-xs" placeholder="Sale Price" min="0" step="0.01"value=""""),_display_(/*43.130*/addProductForm("salePrice")/*43.157*/.value),format.raw/*43.163*/("""">
							</div>

							<div class="col-sm-12 form-group">
									<input type="number" name="onSale" class="form-control input-xs" min="0" max="1" placeholder="On Sale?" value=""""),_display_(/*47.122*/addProductForm("onSale")/*47.146*/.value),format.raw/*47.152*/("""">
							</div>

							<div class="col-sm-12 form-group">
									<input type="text" name="spec1" class="form-control input-xs" placeholder="Specification 1" value=""""),_display_(/*51.110*/addProductForm("spec1")/*51.133*/.value),format.raw/*51.139*/("""">
							</div>

							<div class="col-sm-12 form-group">
									<input type="text" name="spec2" class="form-control input-xs" placeholder="Specification 2" value=""""),_display_(/*55.110*/addProductForm("spec2")/*55.133*/.value),format.raw/*55.139*/("""">
							</div>
							
							<div class="col-sm-12 form-group">
									<input type="text" name="spec3" class="form-control input-xs" placeholder="Specification 3" value=""""),_display_(/*59.110*/addProductForm("spec3")/*59.133*/.value),format.raw/*59.139*/("""">
							</div>
							
		<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

	<div class="col-sm-12 form-group">
  <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-success pull-right">
			<a href=""""),_display_(/*70.14*/routes/*70.20*/.HomeController.index()),format.raw/*70.43*/("""">
				<button class="btn btn-danger pull-left">Cancel</button>
			</a>
	</div>
</div>
					</div>


			</form>
	""")))}),format.raw/*79.3*/("""
"""),format.raw/*80.1*/("""</div>
</div>
</main>
""")))}),format.raw/*83.2*/("""


"""))
      }
    }
  }

  def render(addProductForm:Form[models.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((Form[models.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 22:08:26 GMT 2017
                  SOURCE: C:/Users/User/Documents/CA2.0 final/app/views/productAdmin/addProduct.scala.html
                  HASH: 5e1bc1a1215b1aa034339110488f743898e7a8f3
                  MATRIX: 998->1|1134->69|1163->95|1208->64|1238->92|1266->112|1294->115|1314->127|1348->153|1387->155|1416->158|1566->282|1714->420|1755->422|1789->430|1802->434|1833->444|1865->449|2082->638|2114->660|2142->666|2254->751|2536->1011|2579->1026|2778->1197|2818->1227|2846->1233|3065->1424|3105->1454|3133->1460|3354->1653|3387->1676|3415->1682|3628->1867|3661->1890|3689->1896|3917->2096|3954->2123|3982->2129|4195->2314|4229->2338|4257->2344|4458->2517|4491->2540|4519->2546|4720->2719|4753->2742|4781->2748|4989->2928|5022->2951|5050->2957|5371->3251|5386->3257|5430->3280|5583->3403|5612->3405|5668->3431
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|39->7|39->7|39->7|39->7|40->8|46->14|46->14|46->14|47->15|47->15|47->15|48->16|53->21|53->21|53->21|57->25|57->25|58->26|61->29|61->29|61->29|64->32|64->32|64->32|68->36|68->36|68->36|71->39|71->39|71->39|75->43|75->43|75->43|79->47|79->47|79->47|83->51|83->51|83->51|87->55|87->55|87->55|91->59|91->59|91->59|102->70|102->70|102->70|111->79|112->80|115->83
                  -- GENERATED --
              */
          