import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class GradeListTest {

	@Test
	void getMedianTest() {
		GradeList list=new GradeList();
		List<Integer>grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(15);
		grades.add(30);
		grades.add(5);
		grades.add(12);
		grades.add(18);
		grades.add(13);
		grades.add(14);
		double median=list.getMedian(grades);
		assertEquals(13.50, median);
	}

}
