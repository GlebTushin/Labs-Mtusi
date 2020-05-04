public class URLDephPair {
    private String URL;
    private int depth;
    public URLDephPair()
    {depth=0;
    URL="";
    }
    public URLDephPair(String URL,int depth)
    {this.depth=depth;
        this.URL=URL;
    }
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public void setURL(String URL){
        this.URL=URL;
    }

    public int getDepth() {
        return depth;
    }
    public String getURL(){
        return URL;
    }
}
