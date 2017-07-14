package kekwok.digital.deloitte.uk.com.demolitho.model;

/**
 * Created by kekwok on 12/07/2017.
 */

public class NewsfeedItem {

    private int type;
    private String paragraph1, paragraph2, paragraph3;
    private String comment;

    public NewsfeedItem(int type) {
        this.type = type;

        paragraph1 = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. ";
        paragraph2 = "Integer tincidunt. Cras dapibus. Vivamus elementum semper nisi. Aenean vulputate eleifend tellus. Aenean leo ligula, porttitor eu, consequat vitae, eleifend ac, enim. Aliquam lorem ante, dapibus in, viverra quis, feugiat a, tellus.";
        paragraph3 = "Curabitur ullamcorper ultricies nisi. Nam eget dui. Etiam rhoncus. Maecenas tempus, tellus eget condimentum rhoncus, sem quam semper libero, sit amet adipiscing sem neque sed ipsum.";

        comment = "This is some short comment that I\'ve decided to add in here!";

    }

    public String getComment() {
        return comment;
    }

    public int getType() {
        return type;
    }

    public String getParagraph1() {
        return paragraph1;
    }

    public String getParagraph2() {
        return paragraph2;
    }

    public String getParagraph3() {
        return paragraph3;
    }
}
