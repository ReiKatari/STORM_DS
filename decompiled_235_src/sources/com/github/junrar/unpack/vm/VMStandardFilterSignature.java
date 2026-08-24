package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VMStandardFilterSignature {
    private int CRC;
    private int length;
    private VMStandardFilters type;

    public VMStandardFilterSignature(int i, int i2, VMStandardFilters vMStandardFilters) {
        this.length = i;
        this.CRC = i2;
        this.type = vMStandardFilters;
    }

    public int getCRC() {
        return this.CRC;
    }

    public int getLength() {
        return this.length;
    }

    public VMStandardFilters getType() {
        return this.type;
    }

    public void setCRC(int i) {
        this.CRC = i;
    }

    public void setLength(int i) {
        this.length = i;
    }

    public void setType(VMStandardFilters vMStandardFilters) {
        this.type = vMStandardFilters;
    }
}
