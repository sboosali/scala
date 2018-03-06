
/* Haversine Formula is used to calculate the distance between two locations (Latitude/Longitude)

*/

object App1  {


case class Location(lat: Double, long: Double)

  trait DistanceCalculator {

    def calculateDistanceInKilometer(userLocation: Location, warehouseLocation: Location): Int
  }

class DistanceCalculatorImpl extends DistanceCalculator{

  private val AVERAGE_RADIUS_OF_EARTH_KM = 6371

  override def calculateDistanceInKilometer(userLocation: Location, warehouseLocation: Location): Int = {

    val latDistance = Math.toRadians(userLocation.lat - warehouseLocation.lat)
    val lngDistance = Math.toRadians(userLocation.long - warehouseLocation.long)
    val sinLat = Math.sin(latDistance/2);
    val sinLng = Math.sin(lngDistance/2);
    val a = sinLat * sinLng + (Math.cos(Math.toRadians(userLocation.lat))) * (Math.cos(Math.toRadians(warehouseLocation.lat)) *
      sinLng * sinLat)
    val c= 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a))
    (AVERAGE_RADIUS_OF_EARTH_KM*c).toInt

  }
  
}
  new DistanceCalculatorImpl().calculateDistanceInKilometer(Location(10,20), Location(40,20))





