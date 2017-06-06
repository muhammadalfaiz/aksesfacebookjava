/**
 * @(#)PostsFromPageExtractor.java
 *
 * PostsFromPageExtractor application
 *
 * @author 
 * @version 1.00 2017/5/23
 */
 
import facebook4j.Comment;
import facebook4j.Facebook;
import facebook4j.FacebookException;
import facebook4j.FacebookFactory;
import facebook4j.PagableList;
import facebook4j.Post;
import facebook4j.Reading;
import facebook4j.ResponseList;
import facebook4j.auth.AccessToken;

public class PostsFromPageExtractor {

/**
 * A simple Facebook4J client which
 * illustrates how to access group feeds / posts / comments.
 * 
 * @param args
 * @throws FacebookException 
 */
public static void main(String[] args) throws FacebookException {

    // Generate facebook instance.
    Facebook facebook = new FacebookFactory().getInstance();
    // Use default values for oauth app id.
    facebook.setOAuthAppId("1432005710192990", "6163e5c7d16d8a4af25b2a48bc74cacf");
    // Get an access token from: 
    // https://developers.facebook.com/tools/explorer
    // Copy and paste it below.
    String accessTokenString = "EAACEdEose0cBANUqOtZAvAtZARsMukFSj5u5LqvOU2DxvZCL63ZAz0YrZBS0NZA1mxozb14q1c3YpTB265DZA9iZBTO4fXwWLUn6S5VIeOOt6CZCLTaIyyyRf6g2JS3KwtYDOkrFPu0MZCGmLGQ1bEXlWJHkUDVTqrDHhBtc5avdmLZC7ugtOKEY8Ub7l27bxy3gZCcZD";
    AccessToken at = new AccessToken(accessTokenString);
    // Set access token.
    facebook.setOAuthAccessToken(at);

    // We're done.
    // Access group feeds.
    // You can get the group ID from:
    // https://developers.facebook.com/tools/explorer

    // Set limit to 25 feeds.
    /*ResponseList<Post> feeds = facebook.getFeed("187446750783",
            new Reading().limit(25));

        // For all 25 feeds...
        for (int i = 0; i < feeds.size(); i++) {
            // Get post.
            Post post = feeds.get(i);
            // Get (string) message.
            String message = post.getMessage();
                            // Print out the message.
            System.out.println(message);

            // Get more stuff...
            PagableList<Comment> comments = post.getComments();
            String date = post.getCreatedTime().toString();
            String name = post.getFrom().getName();
            String id = post.getId();
        }*/
        facebook.postStatusMessage("Hello World from Facebook4J.");         
    }
}