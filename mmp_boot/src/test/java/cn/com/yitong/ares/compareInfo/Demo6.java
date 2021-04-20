package cn.com.yitong.ares.compareInfo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Setter
@Getter
@ToString
class CardVo implements Comparable<CardVo> {
    private String cardName;
    private String paixu;

    public CardVo(String cardName, String paixu) {
        this.cardName = cardName;
        this.paixu = paixu;
    }

    @Override
    public int compareTo(CardVo o) {
        return Integer.parseInt(this.paixu) - Integer.parseInt(o.paixu);
    }
}

public class Demo6 {
    public static void main(String[] args) {
        CardVo cardVo = new CardVo("E白分类", "10001");
        CardVo cardVo11 = new CardVo("E白分类", "10004");
        CardVo cardVo2 = new CardVo("本卡类", "30112");
        CardVo cardVo22 = new CardVo("E白分类", "10003");
        CardVo cardVo33 = new CardVo("E白分类", "10007");
        CardVo cardVo3 = new CardVo("本卡B类", "20001");
        CardVo cardVo5 = new CardVo("汇通卡类", "50112");
        CardVo cardVo32 = new CardVo("本卡B类", "20003");
        CardVo cardVo4 = new CardVo("国际卡类", "40112");

        CardVo cardVo1[] =
                new CardVo[] {
                    cardVo, cardVo32, cardVo2, cardVo22, cardVo3, cardVo11, cardVo33, cardVo4,
                    cardVo5
                };
        Arrays.sort(cardVo1);
        System.out.println(Arrays.toString(cardVo1));
    }
}
