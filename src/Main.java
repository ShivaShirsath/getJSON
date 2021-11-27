import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Main {
	public static void getKey(JSONObject obj, String key) {
		try {
			if (obj.has(key)) {
				System.out.println(obj.get(key));	
			} else {
				while (obj.keys().hasNext()) {
					if (obj.get(obj.keys().next().toString()) instanceof JSONObject) {
						getKey(obj.getJSONObject(obj.keys().next().toString()), key);
					} else if (obj.get(obj.keys().next().toString()) instanceof JSONArray) {
						for (int i=0; i < obj.getJSONArray(obj.keys().next().toString()).length(); i++) {
							getKey(new JSONObject(obj.getJSONArray(obj.keys().next().toString()).get(i).toString()), key);
						}
					}
				}
			}
		} catch (Exception e) {
			System.out.println("\\033[1;31mError : " + e + "\\033[0m");
		}
	}
	public static void main(String[] args) {
		try {
			getKey(
				new JSONObject(
					"{\n  \"login\": \"ShivaShirsath\",\n  \"id\": 59221352,\n  \"node_id\": \"MDQ6VXNlcjU5MjIxMzUy\",\n  \"avatar_url\": \"https:\\/\\/avatars.githubusercontent.com\\/u\\/59221352?v=4\",\n  \"gravatar_id\": \"\",\n  \"url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\",\n  \"html_url\": \"https:\\/\\/github.com\\/ShivaShirsath\",\n  \"followers_url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\\/followers\",\n  \"following_url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\\/following{\\/other_user}\",\n  \"gists_url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\\/gists{\\/gist_id}\",\n  \"starred_url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\\/starred{\\/owner}{\\/repo}\",\n  \"subscriptions_url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\\/subscriptions\",\n  \"organizations_url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\\/orgs\",\n  \"repos_url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\\/repos\",\n  \"events_url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\\/events{\\/privacy}\",\n  \"received_events_url\": \"https:\\/\\/api.github.com\\/users\\/ShivaShirsath\\/received_events\",\n  \"type\": \"User\",\n  \"site_admin\": false,\n  \"name\": \"Shiva Shirsath\",\n  \"company\": \"SS\",\n  \"blog\": \"ShivaShirsath.Github.IO\",\n  \"location\": \"India\",\n  \"email\": null,\n  \"hireable\": true,\n  \"bio\": \"@ShivaShirsath\",\n  \"twitter_username\": \"ShivaShirsath\",\n  \"public_repos\": 73,\n  \"public_gists\": 0,\n  \"followers\": 9,\n  \"following\": 0,\n  \"created_at\": \"2019-12-25T08:19:55Z\",\n  \"updated_at\": \"2021-11-10T08:19:56Z\"\n}"
				),
				"bio");
		} catch (JSONException e) {}
	}
}
// © https://github.com/ShivaShirsath
