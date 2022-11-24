package model

// to do ...
  // same as Airport
case class Runway (id: String,
                    airport_ref: String,
                    airport_ident: String,
                    length_ft: Option[Int],
                    width_ft: Option[Int],
                    surface: String,
                    lighted: Option[Boolean],
                    closed: Option[Boolean],
                    le_ident: String,
                    le_latitude_deg: Option[Float],
                    le_longitude_deg: Option[Float],
                    le_elevation_ft: Option[Int],
                    le_heading_degT: Option[Float],
                    le_displaced_threshold_ft: Option[Float],
                    he_ident: String,
                    he_latitude_deg: Option[Float],
                    he_longitude_deg: Option[Float],
                    he_elevation_ft: Option[Int],
                    he_heading_degT: Option[Float],
                    he_displaced_threshold_ft: Option[Float])

object Runway {
  def toRunway()
  // to do ...
}