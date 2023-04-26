def wrap(s: String) = s match {
  case s if (s != null) => Some(s)
  case _ => None
}

import scala.language.implicitConversions
implicit def unwrap(opt: Option[String]) = opt match {
  case Some(s) => s
  case None => ""
}