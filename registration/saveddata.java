SharedPreferences sp = getSharedPreferences(
        "UserData", MODE_PRIVATE);

String name = sp.getString("name", "");
String email = sp.getString("email", "");
String password = sp.getString("password", "");