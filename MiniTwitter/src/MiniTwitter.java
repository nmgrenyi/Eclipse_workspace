import java.util.*;

public class MiniTwitter {

	public static class Tweet {
		     public int id;
		     public int user_id;
		     public String text;
		     public Tweet (int user_id, String text) {
		    	 this.user_id = user_id;
		    	 this.text = text;
		     }
		     public static Tweet create(int user_id, String tweet_text) {
		         // This will create a new tweet object,
		         // and auto fill id
		    	 Tweet tweet = new Tweet(user_id, tweet_text);
		    	 tweet.id = order;
		    	 return tweet;
		     }
		 }
	
	static int order = 0;
    HashMap<Integer, ArrayList<Node>> user_TweetList_map = new HashMap<Integer, ArrayList<Node>>();
    HashMap<Integer, Set<Integer>> friends;  // = new HashMap<Integer, HashSet<Integer>>();
    
    class SortByOrder implements Comparator<Node> {
        public int compare(Node tweet1, Node tweet2) {
            if (tweet1.order < tweet2.order) {
                return 1;
            }else {
                return -1;
            }
        }
    }
    
    class Node {
        int order;
        Tweet tweet;
        public Node (int order, Tweet tweet) {
            this.order = order;
            this.tweet = tweet;
        }
    }
    
    public MiniTwitter() {
        // initialize your data structure here.
        this.friends = new HashMap<Integer, Set<Integer>>();
    }

    // @param user_id an integer
    // @param tweet a string
    // return a tweet
    public Tweet postTweet(int user_id, String tweet_text) {
        //  Write your code here
        Tweet tweet = Tweet.create(user_id, tweet_text);
        if (!user_TweetList_map.containsKey(user_id)) {
            user_TweetList_map.put(user_id, new ArrayList<Node>());
            friends.put(user_id, new HashSet<Integer>());
            friends.get(user_id).add(user_id);
        }
        Node node = new Node(order, tweet);
        user_TweetList_map.get(user_id).add(node);
        order++;
        //System.out.println("size " + friends.get(user_id).size());
        System.out.println("postTweet " + order + " " + tweet_text);
        return tweet;
    }

    // @param user_id an integer
    // return a list of 10 new feeds recently
    // and sort by timeline
    public List<Tweet> getNewsFeed(int user_id) {
        // Write your code here
        SortByOrder sbo = new SortByOrder();
        PriorityQueue<Node> allTweet_pq = new PriorityQueue<Node>(friends.get(user_id).size() * 10, sbo);
        List<Tweet> res = new ArrayList<>();
        System.out.println("size : " + friends.get(user_id).size());
        for (int friend : friends.get(user_id)) {
            for (int lastIndex = 0; lastIndex < 10; lastIndex++) {
                if (!user_TweetList_map.containsKey(friend)) {
                    break;
                }
                if (user_TweetList_map.get(friend).size() - 1 - lastIndex < 0) {
                    break;
                }
                allTweet_pq.offer(user_TweetList_map.get(friend).get(user_TweetList_map.get(friend).size() - 1 - lastIndex));
            }
        }
        int i = 10;
        while (i > 0 && allTweet_pq.size() != 0) {
            i--;
            res.add(allTweet_pq.poll().tweet);
            //System.out.println(i);
        }
        
        System.out.println("getNewsFeed " + res.size());
        return res;
    }
        
    // @param user_id an integer
    // return a list of 10 new posts recently
    // and sort by timeline
    public List<Tweet>  getTimeline(int user_id) {
        // Write your code here
        List<Tweet> res = new ArrayList<>();
        int lastIndex = 0;
        
        while (lastIndex < 10) {
            if (user_TweetList_map.get(user_id).size() - 1 - lastIndex < 0) {
                break;
            }
            res.add(user_TweetList_map.get(user_id).get(user_TweetList_map.get(user_id).size() - 1 - lastIndex).tweet );
            lastIndex++;
        }
        
        System.out.println("getTimeLine " + res.size());
        return res;
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id follows to_user_id
    public void follow(int from_user_id, int to_user_id) {
        // Write your code here
        if (!friends.containsKey(from_user_id)) {
            friends.put(from_user_id, new HashSet<Integer>());
            friends.get(from_user_id).add(from_user_id);
        }
        //if (!friends.containsKey(to_user_id)) {
        //    friends.put(to_user_id, new HashSet<Integer>());
        //    friends.get(to_user_id).add(to_user_id);
        //}
        //System.out.println("size " + friends.get(from_user_id).size());
        friends.get(from_user_id).add(to_user_id);
        //System.out.println("from_user_id " + from_user_id + " to_user_id " + to_user_id);
        System.out.println("size " + friends.get(from_user_id).size());
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id unfollows to_user_id
    public void unfollow(int from_user_id, int to_user_id) {
        // Write your code here
        friends.get(from_user_id).remove(to_user_id);
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiniTwitter mt = new MiniTwitter();
		mt.postTweet(1, "LintCode is Good!!!");
		mt.getNewsFeed(1);
		mt.getTimeline(1);
		mt.follow(2, 1);
		mt.follow(2, 3);
		mt.postTweet(3, "LintCode is Coll!!!");
		mt.postTweet(3, "how To do A + B problem");
		mt.postTweet(3, "I favoriate A + B problem.");
		mt.postTweet(1, "I favorite A + B problem too.");
		mt.postTweet(2, "Nani");
		mt.postTweet(2, "I want to solve this problem now");
		mt.postTweet(3, "I want to solve this problem now");
		mt.postTweet(1, "hehe");
		mt.postTweet(2, "Let's to d  it together.");
		mt.postTweet(2, "haha");
		mt.getNewsFeed(2);
		mt.getTimeline(2);
		mt.getNewsFeed(1);
		mt.follow(1, 2);
		mt.getNewsFeed(1);
		mt.follow(1, 3);
		mt.getNewsFeed(1);
		mt.unfollow(2, 1);
		mt.getNewsFeed(2);

	}

}
