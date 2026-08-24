package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VMPreparedOperand {
    private int Base;
    private int Data;
    private VMOpType Type;
    private int offset;

    public int getBase() {
        return this.Base;
    }

    public int getData() {
        return this.Data;
    }

    public int getOffset() {
        return this.offset;
    }

    public VMOpType getType() {
        return this.Type;
    }

    public void setBase(int i) {
        this.Base = i;
    }

    public void setData(int i) {
        this.Data = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setType(VMOpType vMOpType) {
        this.Type = vMOpType;
    }
}
