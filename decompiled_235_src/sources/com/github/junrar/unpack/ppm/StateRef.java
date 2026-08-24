package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class StateRef {
    private int freq;
    private int successor;
    private int symbol;

    public void decFreq(int i) {
        this.freq = (this.freq - i) & 255;
    }

    public int getFreq() {
        return this.freq;
    }

    public int getSuccessor() {
        return this.successor;
    }

    public int getSymbol() {
        return this.symbol;
    }

    public void incFreq(int i) {
        this.freq = (this.freq + i) & 255;
    }

    public void setFreq(int i) {
        this.freq = i & 255;
    }

    public void setSuccessor(PPMContext pPMContext) {
        setSuccessor(pPMContext.getAddress());
    }

    public void setSymbol(int i) {
        this.symbol = i & 255;
    }

    public void setValues(State state) {
        setFreq(state.getFreq());
        setSuccessor(state.getSuccessor());
        setSymbol(state.getSymbol());
    }

    public String toString() {
        return "State[\n  symbol=" + getSymbol() + "\n  freq=" + getFreq() + "\n  successor=" + getSuccessor() + "\n]";
    }

    public void setSuccessor(int i) {
        this.successor = i;
    }
}
