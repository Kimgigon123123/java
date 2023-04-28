package practiceNastedClass;

public class practice1 {
	public static class AA{
		public static class AAB{
			void methodAAB() { System.out.println("AAB!");}
		}
		public class BB{
			void methodAAB() { System.out.println("BB!");}
			public class CC{
				void methodAAB() { System.out.println("CC!");}
				public class DD{
					int a = 10;
				}
			}
		}
	}

}
