package home.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

// 웹에서는 vo 단어 대신 dto를 많이 씁니다.
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ProductDto {
	private String pcode;
    private String category;
    private String pname;
    private int price;
    
    @Override
    public String toString() {
        return String.format("\n%6s %15s %40s\t %,8d", 
                            category,pcode,pname,price);
    }
}