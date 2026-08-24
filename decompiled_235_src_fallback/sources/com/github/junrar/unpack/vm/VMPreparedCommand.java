package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VMPreparedCommand {
    private boolean ByteMode;
    private com.github.junrar.unpack.vm.VMPreparedOperand Op1;
    private com.github.junrar.unpack.vm.VMPreparedOperand Op2;
    private com.github.junrar.unpack.vm.VMCommands OpCode;

    public VMPreparedCommand() {
            r1 = this;
            r1.<init>()
            com.github.junrar.unpack.vm.VMPreparedOperand r0 = new com.github.junrar.unpack.vm.VMPreparedOperand
            r0.<init>()
            r1.Op1 = r0
            com.github.junrar.unpack.vm.VMPreparedOperand r0 = new com.github.junrar.unpack.vm.VMPreparedOperand
            r0.<init>()
            r1.Op2 = r0
            return
    }

    public com.github.junrar.unpack.vm.VMPreparedOperand getOp1() {
            r0 = this;
            com.github.junrar.unpack.vm.VMPreparedOperand r0 = r0.Op1
            return r0
    }

    public com.github.junrar.unpack.vm.VMPreparedOperand getOp2() {
            r0 = this;
            com.github.junrar.unpack.vm.VMPreparedOperand r0 = r0.Op2
            return r0
    }

    public com.github.junrar.unpack.vm.VMCommands getOpCode() {
            r0 = this;
            com.github.junrar.unpack.vm.VMCommands r0 = r0.OpCode
            return r0
    }

    public boolean isByteMode() {
            r0 = this;
            boolean r0 = r0.ByteMode
            return r0
    }

    public void setByteMode(boolean r1) {
            r0 = this;
            r0.ByteMode = r1
            return
    }

    public void setOp1(com.github.junrar.unpack.vm.VMPreparedOperand r1) {
            r0 = this;
            r0.Op1 = r1
            return
    }

    public void setOp2(com.github.junrar.unpack.vm.VMPreparedOperand r1) {
            r0 = this;
            r0.Op2 = r1
            return
    }

    public void setOpCode(com.github.junrar.unpack.vm.VMCommands r1) {
            r0 = this;
            r0.OpCode = r1
            return
    }
}
