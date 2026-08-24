package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VMPreparedOperand {
    private int Base;
    private int Data;
    private com.github.junrar.unpack.vm.VMOpType Type;
    private int offset;

    public VMPreparedOperand() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getBase() {
            r0 = this;
            int r0 = r0.Base
            return r0
    }

    public int getData() {
            r0 = this;
            int r0 = r0.Data
            return r0
    }

    public int getOffset() {
            r0 = this;
            int r0 = r0.offset
            return r0
    }

    public com.github.junrar.unpack.vm.VMOpType getType() {
            r0 = this;
            com.github.junrar.unpack.vm.VMOpType r0 = r0.Type
            return r0
    }

    public void setBase(int r1) {
            r0 = this;
            r0.Base = r1
            return
    }

    public void setData(int r1) {
            r0 = this;
            r0.Data = r1
            return
    }

    public void setOffset(int r1) {
            r0 = this;
            r0.offset = r1
            return
    }

    public void setType(com.github.junrar.unpack.vm.VMOpType r1) {
            r0 = this;
            r0.Type = r1
            return
    }
}
