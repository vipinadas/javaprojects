package com.avantika.infosys;

import java.util.Set;
import java.util.TreeSet;

public class Height {
public int h1,h2,h3,h4,h5;

public Set<Integer> height_order(int h1,int h2,int h3,int h4,int h5)
{
Set<Integer> hght=new TreeSet<>();
hght.add(this.h1);
hght.add(this.h2);
hght.add(this.h3);
hght.add(this.h4);
hght.add(this.h5);
return hght;
	}

}
