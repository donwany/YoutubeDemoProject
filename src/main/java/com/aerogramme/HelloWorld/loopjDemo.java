package com.aerogramme.HelloWorld;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.CategorizedFacebookType;
import com.restfb.types.Comment;
import com.restfb.types.Post;

import java.util.List;

public class loopjDemo {

    public static void main(String[] args) {

        String access_token = "EAAEZBfeTrU0wBAPxTsvKnzm1LA2u4O25yvQQkQgj8n3g4FAkBn6ZC7HGNYAdiuTl8m2HjpcHj6sc1iw856WfVdnDMHqXZB2B9MxdkE1sAKC6jmMsZCCljsZALtO817GQKKOexJtyiKWJJdLkmbBgl4fQRl6rHhctKouIbAQXBT9LD5jZA9ZCML6T9J5KCT8KOvw0GiLiOMiJb1ZBfyH6LMB7";


        /////////////////////// post message to timeline
        FacebookClient client = new DefaultFacebookClient(access_token, Version.LATEST);
       /* String messageToPost = "Facebook Java API is Cool!";
        FacebookType response = client.publish("me/feed", FacebookType.class, Parameter.with("message",messageToPost));
        System.out.println("fb.com/"+response.getId());*/

        //////////////////////



        ///////////////////// retrieve picture
        //FacebookClient client = new DefaultFacebookClient(access_token, Version.LATEST);
        /*JsonObject picture = client.fetchObject("me/picture", JsonObject.class, Parameter.with("redirect","false"));
        System.out.println(picture);*/


        //////////////////// retrieve post on timeline
       /*Connection<Post> result = client.fetchConnection("me/feed", Post.class);

        //System.out.println(result.getTotalCount());

        int counter = 0;
        int displayLimit = 50;

        for(List<Post> page: result){

            for (Post aPost: page){
                System.out.println(aPost.getMessage());
                System.out.println("fb.com/" + aPost.getId());
                System.out.println("*************************************************************");

                // insert data into mysql database
                //DBControllers dbControllers = new DBControllers();
                //dbControllers.insertData(aPost.getMessage(), "fb.com/" + aPost.getId());

                displayLimit --;
                counter ++;

                if(displayLimit == 0){
                    return;
                }
            }

        }

        System.out.println("Total post is :" + counter);*/

        //////////////////// Some Post from the GoT Fanpage with likes and comments total count

        Post post = client.fetchObject("290915591524580_291284228154383",Post.class,
                Parameter.with("fields", "from,to,likes.limit(100).summary(true),comments.limit(100).summary(true),shares.limit(100).summary(true)"));

        List<Comment> comments = post.getComments().getData();
        for(Comment comment: comments){
            System.out.println("CreatedTime:" + comment.getCreatedTime() + " | fb.com/" + comment.getId() + " | Comment:" + comment.getMessage());

            // insert into mysql db
            //DBControllers controllers = new DBControllers();
            //controllers.insertData(comment.getMessage(), "fb.com/"+comment.getId());

        }



        System.out.println("***********************************************");
        CategorizedFacebookType categorizedFacebookType = post.getFrom();
        System.out.println(categorizedFacebookType.getName());

        System.out.println("***********************************************");
        System.out.println("Likes count: " + post.getLikesCount());
        System.out.println("Shares count: " + post.getSharesCount());
        System.out.println("Comments count: " + post.getCommentsCount());
        System.out.println("CreatedTime:" + post.getCreatedTime());
        System.out.println("Reaction counts:" + post.getReactionsCount());


       /////////////// account admin

     /*   Connection<Page> result = client.fetchConnection("me/accounts", Page.class);

        System.out.println(result.getTotalCount());

        int counter = 0;
        for(List<Page> page: result){

            for (Page aPost: page){
                System.out.println(aPost.getIsVerified());
                System.out.println("fb.com/" + aPost.getId());
                System.out.println(aPost.getName());
                System.out.println(aPost.getAppId());
                System.out.println(aPost.getLikes());

                counter ++;
            }

        }
        System.out.println("Total post is :" + counter);*/

        //////////////////////////// pages likes
      /*  Connection<Page> result = client.fetchConnection("me/feed", Page.class);

        System.out.println(result.getTotalCount());

        int counter = 0;
        for(List<Page> page: result){

            for (Page aPost: page){
                //System.out.println(aPost.getIsVerified());
                System.out.println("fb.com/" + aPost.getId());
                System.out.println(aPost.getName());
                //System.out.println(aPost.getAppId());
                //System.out.println(aPost.getLikes());

                counter ++;
            }

        }
        System.out.println("Total Pages likes is :" + counter);*/



        //////////////////////////// users group

        /*Connection<Group> result = client.fetchConnection("me/groups", Group.class);

        System.out.println(result.getTotalCount());

        int counter = 0;
        for(List<Group> page: result){

            for (Group aPost: page){
                //System.out.println(aPost.getIsVerified());
                System.out.println("fb.com/" + aPost.getId());
                System.out.println(aPost.getName());
                //System.out.println(aPost.getAppId());
                //System.out.println(aPost.getLikes());

                counter ++;
            }

        }
        System.out.println("Total Groups likes is :" + counter);*/


        ////////////////// access token

       /* FacebookClient.AccessToken extendedAccessToken = client.obtainExtendedAccessToken("350185409172300 ","f7c7d513cafe1cb467a107abd932387f");

        System.out.println(extendedAccessToken.getAccessToken());
        System.out.println(extendedAccessToken.getExpires());
        System.out.println(extendedAccessToken.getTokenType());

        User me = client.fetchObject("me", User.class,Parameter.with("fields", "id,name"));

        System.out.println(me.getName());*/
        //System.out.println(me.getGender());
        //System.out.println(me.getAgeRange());
        //System.out.println(me.getPicture());

        /////////////////// retrieve comments

      /* String postId = "290915591524580_453731471909657";
        Connection<Comment> commentConnection = client.fetchConnection(postId + "/comments", Comment.class, Parameter.with("limit", 10));
        int personalLimit = 50;

        for (List<Comment> commentPage : commentConnection) {
            for (Comment comment : commentPage) {
                System.out.println("Id: " + comment.getId());
                personalLimit--;

                // break both loops
                if (personalLimit == 0) {
                    return;
                }
            }
        }
*/

    }
}
