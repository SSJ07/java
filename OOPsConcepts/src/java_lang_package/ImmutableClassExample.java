package java_lang_package;


final class ImmutableClass{
	private int id;
	ImmutableClass(int id){
		this.id = id;
	}
	public ImmutableClass modify(int id){
		if(this.id == id)
			return this;
		return new ImmutableClass(id);
	}
}

public class ImmutableClassExample {

	public static void main(String[] args) {
		ImmutableClass ic = new ImmutableClass(10);
		ImmutableClass ic1 = ic.modify(100); // it will create new object
		ImmutableClass ic2 = new ImmutableClass(10);
		System.out.println("ic="+ic + " and hashCode="+ic.hashCode());
		System.out.println("ic1="+ic1 + " and hashCode="+ic1.hashCode());
		System.out.println("ic2="+ic2 + " and hashCode="+ic2.hashCode());
	}

}
