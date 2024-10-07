package kr.co.product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductMain {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product("에어컨",250));
		list.add(new Product("세탁기",300));
		list.add(new Product("건조기",400));
		list.add(new Product("선풍기",90));
		list.add(new Product("전자레인지",50));
		
		List<String> subList = list.stream()
				.filter(t -> t.getPrice() >= 300)
				.sorted((o1,o2) -> Integer.compare(o1.getPrice() ,o2.getPrice()))
				.map(Product :: getName)
				.collect(Collectors.toList());
				System.out.println(subList);
	}
	
}
