package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VMPreparedCommand {
    private boolean ByteMode;
    private VMPreparedOperand Op1 = new VMPreparedOperand();
    private VMPreparedOperand Op2 = new VMPreparedOperand();
    private VMCommands OpCode;

    public VMPreparedOperand getOp1() {
        return this.Op1;
    }

    public VMPreparedOperand getOp2() {
        return this.Op2;
    }

    public VMCommands getOpCode() {
        return this.OpCode;
    }

    public boolean isByteMode() {
        return this.ByteMode;
    }

    public void setByteMode(boolean z) {
        this.ByteMode = z;
    }

    public void setOp1(VMPreparedOperand vMPreparedOperand) {
        this.Op1 = vMPreparedOperand;
    }

    public void setOp2(VMPreparedOperand vMPreparedOperand) {
        this.Op2 = vMPreparedOperand;
    }

    public void setOpCode(VMCommands vMCommands) {
        this.OpCode = vMCommands;
    }
}
