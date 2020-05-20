import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ReviewCollectorTest {

    ReviewCollector rc;

    @Before
    public void setUp() throws Exception {
        rc = new ReviewCollector();
        rc.addReview(new ProductReview("pizza", "this is the best pizza ever"));
        rc.addReview(new ProductReview("tables", "definitely has four legs. That's Great"));
        rc.addReview(new ProductReview("pizza", "Best. Pizza. In the world!"));
        rc.addReview(new ProductReview("tables", "What, is this table made of asbestos?"));
        rc.addReview(new ProductReview("pizza", "this is the best pizza ever"));
        rc.addReview(new ProductReview("table", "I eat the best pizza on this cruddy table"));
        rc.addReview(new ProductReview("pizza", "Not merely good, but super great."));
        rc.addReview(new ProductReview("tables", "What a nice(best)table. I bought two."));
        rc.addReview(new ProductReview("tables", "Not the best table, but cheap."));
    }

    @Test
    public void noDuplicateProducts() {

        ArrayList<String> rv = new ArrayList<>();
        rv.add("pizza");
        rv.add("tables");
        rv.add("table");
        assertEquals(rv, rc.getProductList());


    }

    @Test
    public void allReviewsAdded() {
        ReviewCollector after = new ReviewCollector();
        after.addReview(new ProductReview("pizza", "this is the best pizza ever"));
        after.addReview(new ProductReview("tables", "definitely has four legs. That's Great"));
        after.addReview(new ProductReview("pizza", "Best. Pizza. In the world!"));
        after.addReview(new ProductReview("tables", "What, is this table made of asbestos?"));
        after.addReview(new ProductReview("pizza", "this is the best pizza ever"));
        after.addReview(new ProductReview("table", "I eat the best pizza on this cruddy table"));
        after.addReview(new ProductReview("pizza", "Not merely good, but super great."));
        after.addReview(new ProductReview("tables", "What a nice(best)table. I bought two."));
        after.addReview(new ProductReview("tables", "Not the best table, but cheap."));

        boolean allSame = true;
        for (int i=0; i<after.getReviewList().size(); i++) {
            if (!after.getReviewList().get(i).getReview().equals(rc.getReviewList().get(i).getReview())) {
                allSame = false;
                break;
            }
        }

        assertTrue(allSame);
    }

    @Test
    public void getNumGoodReviewsPizza() {
        assertEquals(2, rc.getNumGoodReviews("pizza"));
    }

    @Test
    public void getNumGoodReviewsTable() {
        assertEquals(3, rc.getNumGoodReviews("tables"));
    }
}