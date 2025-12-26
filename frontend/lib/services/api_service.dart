
import 'dart:convert';
import 'package:http/http.dart' as http;
import '../models/place.dart';

class ApiService {
  static const String url =
    'http://10.0.2.2:8080/api/places/getAllPlace';

  static Future<List<Place>> getAllPlace() async {
    final response = await http.get(Uri.parse(url));
    final data = jsonDecode(response.body) as List;
    return data.map((e) => Place.fromJson(e)).toList();
  }
}
