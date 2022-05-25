package com.Chegg.Address;

public class Driver {

	public static void main(String args[]) {
		Directory d = new Directory(10);
		// creating entries
		Entry e1 = new Entry("Mangali Kowlutla", "3-182,P.kota Konda,kurnool,Andhra Pradesh,518225", "994934794");
		Entry e2 = new Entry("Maruvada Sudeepthi", "5-14 Kurnool,kurnool,Andhra Pradesh, 518943", "9934534534");
		Entry e3 = new Entry("Mangali Keshavaiah", "6-122,Nellore,Nellore, Andhra Pradesh,519478", "9948298494");
		Entry e4 = new Entry("Kalluri Aruna", "2-92 kanipakam,Chittor,Andhra Pradesh,517384", "794934794");
		Entry e5 = new Entry("Maruvada Hari", "3-88 Devenakonda, kurnool,518324", "894644894");

		// inserting entry
		d.insert(e1);
		d.insert(e2);
		d.insert(e3);
		d.insert(e4);
		d.insert(e5);
		// displaying entries in sorted order
		System.out.println("Entries Details: ");
		d.display();
		// search for entry 5
		System.out.println("\nSearch for entry: ");
		d.searchAndDisplay(e5);
		System.out.println();
		// deleting entry
		d.deleteEntry(new Entry("Maruvada Hari", "3-88 Devenakonda, kurnool,518324", "894644894"));
		System.out.println();
		System.out.println("Entries details after deletion: ");
		// displaying entries in sorted order
		d.display();
	}

}
