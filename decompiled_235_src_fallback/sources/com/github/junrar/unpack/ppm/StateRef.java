package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class StateRef {
    private int freq;
    private int successor;
    private int symbol;

    public StateRef() {
            r0 = this;
            r0.<init>()
            return
    }

    public void decFreq(int r2) {
            r1 = this;
            int r0 = r1.freq
            int r0 = r0 - r2
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1.freq = r2
            return
    }

    public int getFreq() {
            r0 = this;
            int r0 = r0.freq
            return r0
    }

    public int getSuccessor() {
            r0 = this;
            int r0 = r0.successor
            return r0
    }

    public int getSymbol() {
            r0 = this;
            int r0 = r0.symbol
            return r0
    }

    public void incFreq(int r2) {
            r1 = this;
            int r0 = r1.freq
            int r0 = r0 + r2
            r2 = r0 & 255(0xff, float:3.57E-43)
            r1.freq = r2
            return
    }

    public void setFreq(int r1) {
            r0 = this;
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.freq = r1
            return
    }

    public void setSuccessor(int r1) {
            r0 = this;
            r0.successor = r1
            return
    }

    public void setSuccessor(com.github.junrar.unpack.ppm.PPMContext r1) {
            r0 = this;
            int r1 = r1.getAddress()
            r0.setSuccessor(r1)
            return
    }

    public void setSymbol(int r1) {
            r0 = this;
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.symbol = r1
            return
    }

    public void setValues(com.github.junrar.unpack.ppm.State r2) {
            r1 = this;
            int r0 = r2.getFreq()
            r1.setFreq(r0)
            int r0 = r2.getSuccessor()
            r1.setSuccessor(r0)
            int r2 = r2.getSymbol()
            r1.setSymbol(r2)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "State[\n  symbol="
            r0.<init>(r1)
            int r1 = r2.getSymbol()
            r0.append(r1)
            java.lang.String r1 = "\n  freq="
            r0.append(r1)
            int r1 = r2.getFreq()
            r0.append(r1)
            java.lang.String r1 = "\n  successor="
            r0.append(r1)
            int r2 = r2.getSuccessor()
            r0.append(r2)
            java.lang.String r2 = "\n]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
