package fapplication;



public class Section {

	private Student [] arrstu;
	private int nb;
	
	public Section(int size){
		
	}
	public boolean addStudent(Student st) {
		if (nb<arrstu.length) {
			arrstu[nb]= st;
			nb++;
			return true;
		}else 
			return false;
	
	}
	public int searchStu(int id) {
		for(int i=0;i<nb;i++)
			if(arrstu[i].getStudentId()==id)
				return i;
		
		return -1;
	}
	public boolean deleteStu(int id) {
		if(searchStu(id)==-1)
			return false;
		else {
			id =searchStu(id); 
			arrstu[id]=arrstu[nb-1];
			nb--;
			return true;			
		}
		
		}
			void displayAll() {
				for(int i=0;i<nb;i++) {
					System.out.println(arrstu[i]);
				}
				
				
			}
			void display(int index) {
				if(index>=0&&index<nb)
					System.out.println(arrstu[index]);
			}
			void display(String name) {
				for(int i=0;i<nb;i++) {
					if(arrstu[i].getStudentName().equals(name)) 
						display(i);
				
			}
				}
			void displaySameAs(Student st) {
				for(int i=0;i<nb;i++) {
					if(arrstu[i].getStudentName().equals(st.getStudentName()))
						if(arrstu[i].getStudentAge()==st.getStudentAge())
							if(arrstu[i].getStudentGender().equals(st.getStudentGender()))
								display(i);
					
				}
			}
			public Student searchFirst(String name) {
				for(int i=0;i<nb;i++) {
					if(arrstu[i].getStudentName().equals(name))
						return arrstu[i];
							
				}
				return null;
			}
			public Student searchlast(String name) {
				for(int i=0;i<nb;i++) {
					if(arrstu[i].getStudentName().equals(name))
						return arrstu[i];
							
				}
				return null;
			}
	
	
	
	public static void main(String[] args) {
		

	}

}
