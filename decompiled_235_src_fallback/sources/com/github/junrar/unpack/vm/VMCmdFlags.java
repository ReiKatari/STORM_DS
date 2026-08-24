package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class VMCmdFlags {
    public static final byte VMCF_BYTEMODE = 4;
    public static final byte VMCF_CHFLAGS = 64;
    public static final byte VMCF_JUMP = 8;
    public static final byte VMCF_OP0 = 0;
    public static final byte VMCF_OP1 = 1;
    public static final byte VMCF_OP2 = 2;
    public static final byte VMCF_OPMASK = 3;
    public static final byte VMCF_PROC = 16;
    public static final byte VMCF_USEFLAGS = 32;
    public static byte[] VM_CmdFlags;

    static {
            r0 = 40
            byte[] r0 = new byte[r0]
            r0 = {x000a: FILL_ARRAY_DATA  , data: [6, 70, 70, 70, 41, 41, 69, 69, 9, 70, 70, 70, 70, 41, 41, 41, 41, 41, 41, 1, 1, 17, 16, 5, 70, 70, 70, 69, 0, 0, 32, 64, 2, 2, 6, 6, 6, 102, 102, 0} // fill-array
            com.github.junrar.unpack.vm.VMCmdFlags.VM_CmdFlags = r0
            return
    }

    public VMCmdFlags() {
            r0 = this;
            r0.<init>()
            return
    }
}
