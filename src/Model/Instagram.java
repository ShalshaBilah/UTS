package Model;

public class Instagram {
    public class Instagram_Model {
        public String user;
        public int followers;
        public String caption;
        public String DM;
        public int like = 0;

        public Instagram_Model() {}

        public Instagram_Model(String userPost, int followersUser, String captionPost, int likePost,
                               String DMUser) {
            this.user = userPost;
            this.followers = followersUser;
            this.caption = captionPost;
            this.like = likePost;
            this.DM = DMUser;
        }

        public void DM() {
            System.out.println(this.user);
            System.out.println("-------------------");
            System.out.println(this.DM);
            System.out.println("----------" + DM);
        }

        public void postingan() {
            System.out.println();
            System.out.println(this.user);
            System.out.println("-------------------");
            System.out.println(this.caption);
            System.out.println("[1] Like :" + this.like)
            ;
        }
        public int likes(int suka){
            like = like + 1;
            return like;
        }
        public void followers(){
            System.out.println();
            System.out.println(this.user);
            System.out.println("------");
            System.out.println(this.followers);
            System.out.println("-------"+ followers);
        }
    }
}


