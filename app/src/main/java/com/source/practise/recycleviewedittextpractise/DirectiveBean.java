package com.source.practise.recycleviewedittextpractise;

import java.util.List;

/**
 * <p>Class: com.source.practise.recycleviewedittextpractise.DirectiveBean</p>
 * <p>Description: </p>
 * <pre>
 *
 *  </pre>
 *
 * @author lujunjie
 * @date 2019/4/19/14:34.
 */
public class DirectiveBean {
    /**
     * calculateScore : null
     * calculate : INDICATOR_232_444T + INDICATOR_232_445T
     * reference : [{"dataType":"NUMBER","isInSameGroup":1,"name":"体重","value":"INDICATOR_232_445T"},{"dataType":"NUMBER","isInSameGroup":1,"name":"身高","value":"INDICATOR_232_444T"}]
     */

    private Object calculateScore;
    private String calculate;
    private List<ReferenceBean> reference;



    public Object getCalculateScore() {
        return calculateScore;
    }

    public void setCalculateScore(Object calculateScore) {
        this.calculateScore = calculateScore;
    }

    public String getCalculate() {
        return calculate;
    }

    public void setCalculate(String calculate) {
        this.calculate = calculate;
    }

    public List<ReferenceBean> getReference() {
        return reference;
    }

    public void setReference(List<ReferenceBean> reference) {
        this.reference = reference;
    }
}
