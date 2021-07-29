package Testing;

abstract class AbstractClassEx  { 
    int multiplyBy;
    public AbstractClassEx( int multiplyBy ) {
        this.multiplyBy = multiplyBy;
    }

    public int mutiply(int val) {
       return multiplyBy * val;
    }
}

class TimesTwo extends AbstractClassEx {
    public TimesTwo() {
        super(2);
    }
}

class TimesWhat extends AbstractClassEx {
    public TimesWhat(int what) {
        super(what);
    }
    public static void main(String[] args)
    {
    	/*AbstractClassEx abstractclass=TimesTwo();
    	abstractclass.multiplyBy();
    	
    	AbstractClassEx abstractclass=TimesWhat();
    	abstractclass.multiplyBy();
	}*/
    }
    
}




