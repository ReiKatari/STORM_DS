package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum VMOpType {
    VM_OPREG(0),
    VM_OPINT(1),
    VM_OPREGMEM(2),
    VM_OPNONE(3);
    
    private final int opType;

    VMOpType(int i) {
        this.opType = i;
    }

    public static VMOpType findOpType(int i) {
        VMOpType vMOpType = VM_OPREG;
        if (vMOpType.equals(i)) {
            return vMOpType;
        }
        VMOpType vMOpType2 = VM_OPINT;
        if (vMOpType2.equals(i)) {
            return vMOpType2;
        }
        VMOpType vMOpType3 = VM_OPREGMEM;
        if (vMOpType3.equals(i)) {
            return vMOpType3;
        }
        VMOpType vMOpType4 = VM_OPNONE;
        if (vMOpType4.equals(i)) {
            return vMOpType4;
        }
        return null;
    }

    public boolean equals(int i) {
        if (this.opType == i) {
            return true;
        }
        return false;
    }

    public int getOpType() {
        return this.opType;
    }
}
