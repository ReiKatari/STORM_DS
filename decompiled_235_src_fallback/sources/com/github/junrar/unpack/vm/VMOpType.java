package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum VMOpType extends java.lang.Enum<com.github.junrar.unpack.vm.VMOpType> {
    private static final /* synthetic */ com.github.junrar.unpack.vm.VMOpType[] $VALUES = null;
    public static final com.github.junrar.unpack.vm.VMOpType VM_OPINT = null;
    public static final com.github.junrar.unpack.vm.VMOpType VM_OPNONE = null;
    public static final com.github.junrar.unpack.vm.VMOpType VM_OPREG = null;
    public static final com.github.junrar.unpack.vm.VMOpType VM_OPREGMEM = null;
    private final int opType;

    static {
            com.github.junrar.unpack.vm.VMOpType r0 = new com.github.junrar.unpack.vm.VMOpType
            java.lang.String r1 = "VM_OPREG"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.github.junrar.unpack.vm.VMOpType.VM_OPREG = r0
            com.github.junrar.unpack.vm.VMOpType r1 = new com.github.junrar.unpack.vm.VMOpType
            java.lang.String r2 = "VM_OPINT"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.github.junrar.unpack.vm.VMOpType.VM_OPINT = r1
            com.github.junrar.unpack.vm.VMOpType r2 = new com.github.junrar.unpack.vm.VMOpType
            java.lang.String r3 = "VM_OPREGMEM"
            r4 = 2
            r2.<init>(r3, r4, r4)
            com.github.junrar.unpack.vm.VMOpType.VM_OPREGMEM = r2
            com.github.junrar.unpack.vm.VMOpType r3 = new com.github.junrar.unpack.vm.VMOpType
            java.lang.String r4 = "VM_OPNONE"
            r5 = 3
            r3.<init>(r4, r5, r5)
            com.github.junrar.unpack.vm.VMOpType.VM_OPNONE = r3
            com.github.junrar.unpack.vm.VMOpType[] r0 = new com.github.junrar.unpack.vm.VMOpType[]{r0, r1, r2, r3}
            com.github.junrar.unpack.vm.VMOpType.$VALUES = r0
            return
    }

    VMOpType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.opType = r3
            return
    }

    public static com.github.junrar.unpack.vm.VMOpType findOpType(int r2) {
            com.github.junrar.unpack.vm.VMOpType r0 = com.github.junrar.unpack.vm.VMOpType.VM_OPREG
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L9
            return r0
        L9:
            com.github.junrar.unpack.vm.VMOpType r0 = com.github.junrar.unpack.vm.VMOpType.VM_OPINT
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L12
            return r0
        L12:
            com.github.junrar.unpack.vm.VMOpType r0 = com.github.junrar.unpack.vm.VMOpType.VM_OPREGMEM
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L1b
            return r0
        L1b:
            com.github.junrar.unpack.vm.VMOpType r0 = com.github.junrar.unpack.vm.VMOpType.VM_OPNONE
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L24
            return r0
        L24:
            r2 = 0
            return r2
    }

    public static com.github.junrar.unpack.vm.VMOpType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.unpack.vm.VMOpType> r0 = com.github.junrar.unpack.vm.VMOpType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.unpack.vm.VMOpType r1 = (com.github.junrar.unpack.vm.VMOpType) r1
            return r1
    }

    public static com.github.junrar.unpack.vm.VMOpType[] values() {
            com.github.junrar.unpack.vm.VMOpType[] r0 = com.github.junrar.unpack.vm.VMOpType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.unpack.vm.VMOpType[] r0 = (com.github.junrar.unpack.vm.VMOpType[]) r0
            return r0
    }

    public boolean equals(int r1) {
            r0 = this;
            int r0 = r0.opType
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int getOpType() {
            r0 = this;
            int r0 = r0.opType
            return r0
    }
}
