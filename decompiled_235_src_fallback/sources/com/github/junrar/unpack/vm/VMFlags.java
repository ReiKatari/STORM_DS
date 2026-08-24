package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum VMFlags extends java.lang.Enum<com.github.junrar.unpack.vm.VMFlags> {
    private static final /* synthetic */ com.github.junrar.unpack.vm.VMFlags[] $VALUES = null;
    public static final com.github.junrar.unpack.vm.VMFlags VM_FC = null;
    public static final com.github.junrar.unpack.vm.VMFlags VM_FS = null;
    public static final com.github.junrar.unpack.vm.VMFlags VM_FZ = null;
    private final int flag;

    static {
            com.github.junrar.unpack.vm.VMFlags r0 = new com.github.junrar.unpack.vm.VMFlags
            java.lang.String r1 = "VM_FC"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.github.junrar.unpack.vm.VMFlags.VM_FC = r0
            com.github.junrar.unpack.vm.VMFlags r1 = new com.github.junrar.unpack.vm.VMFlags
            java.lang.String r2 = "VM_FZ"
            r4 = 2
            r1.<init>(r2, r3, r4)
            com.github.junrar.unpack.vm.VMFlags.VM_FZ = r1
            com.github.junrar.unpack.vm.VMFlags r2 = new com.github.junrar.unpack.vm.VMFlags
            java.lang.String r3 = "VM_FS"
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.<init>(r3, r4, r5)
            com.github.junrar.unpack.vm.VMFlags.VM_FS = r2
            com.github.junrar.unpack.vm.VMFlags[] r0 = new com.github.junrar.unpack.vm.VMFlags[]{r0, r1, r2}
            com.github.junrar.unpack.vm.VMFlags.$VALUES = r0
            return
    }

    VMFlags(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.flag = r3
            return
    }

    public static com.github.junrar.unpack.vm.VMFlags findFlag(int r2) {
            com.github.junrar.unpack.vm.VMFlags r0 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L9
            return r0
        L9:
            com.github.junrar.unpack.vm.VMFlags r0 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L12
            return r0
        L12:
            com.github.junrar.unpack.vm.VMFlags r0 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1b
            return r0
        L1b:
            r2 = 0
            return r2
    }

    public static com.github.junrar.unpack.vm.VMFlags valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.unpack.vm.VMFlags> r0 = com.github.junrar.unpack.vm.VMFlags.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.unpack.vm.VMFlags r1 = (com.github.junrar.unpack.vm.VMFlags) r1
            return r1
    }

    public static com.github.junrar.unpack.vm.VMFlags[] values() {
            com.github.junrar.unpack.vm.VMFlags[] r0 = com.github.junrar.unpack.vm.VMFlags.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.unpack.vm.VMFlags[] r0 = (com.github.junrar.unpack.vm.VMFlags[]) r0
            return r0
    }

    public boolean equals(int r1) {
            r0 = this;
            int r0 = r0.flag
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int getFlag() {
            r0 = this;
            int r0 = r0.flag
            return r0
    }
}
