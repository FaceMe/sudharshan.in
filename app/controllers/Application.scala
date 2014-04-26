package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Universe is under construction..."))
  }
    
def home = Action {
    Ok(views.html.home("Hello"))
}
    

}
