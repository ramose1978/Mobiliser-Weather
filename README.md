# Mobiliser-Weather
WeatherBug App - Demo for Team 
Overview of Functionality 
To deliver source code and binary APK file for a sample weather application running on Android OS with the following minimal functional requirements.

-	The app obtains the current GEO location of the device using the Services Library (Weatherapp SDK).
-	Using this GEO location which is identified as Long/Lat, GEO information such as sub locality name, locality name, country name are retrieved from the Long/Lat from the GEOUtility class.
-	Using this GEO information we then invoke a web-service request to fetch the accurate weather information for the identified location. 
-	The app checks for network availability (achieved prior to any network resource calls) if no network is available then the user is informed and if available then communication with web services is processed. Since this is inside the ServicesLibrary the network conditions can be checked by the project code using the SDK library exposing a number of useful functional api calls for reuse.
-	When a response has been received by the calling app thread the returned JSON data is parsed and (GSON Lib) de-serialized into an appropriate data model. 
-	The parsed result is received from the web service call which is then displayed on the apps Google Maps fragment activity. 
-	The app allows the display of a map with the user’s current location and weather information. 
-	The user is able to interact with the map (zoom, pan, etc.), and after clicking on the map, all the relevant weather data (temp, image of weather, humidity, pressure, wind speed for the user-clicked location is displayed in a custom info window on the map.
-	AsyncTask helper utility API to achieve asynchronous tasks for returned results, which is done from within a callback interface ‘observer pattern’.
-	Storing the Lat/Long in a cached variable. The lifecycle management of this cached information is handled by custom Googlemaps implementation until fragment activity is recycled, which is dependent on device orientation change etc. 
-	The app can be used in portrait and landscape mode. Providing an intuitive UI adhering to Android conventions.

