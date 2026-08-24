package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum HostSystem extends java.lang.Enum<com.github.junrar.rarfile.HostSystem> {
    private static final /* synthetic */ com.github.junrar.rarfile.HostSystem[] $VALUES = null;
    public static final com.github.junrar.rarfile.HostSystem beos = null;
    public static final com.github.junrar.rarfile.HostSystem macos = null;
    public static final com.github.junrar.rarfile.HostSystem msdos = null;
    public static final com.github.junrar.rarfile.HostSystem os2 = null;
    public static final com.github.junrar.rarfile.HostSystem unix = null;
    public static final com.github.junrar.rarfile.HostSystem win32 = null;
    private final byte hostByte;

    static {
            com.github.junrar.rarfile.HostSystem r0 = new com.github.junrar.rarfile.HostSystem
            java.lang.String r1 = "msdos"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.github.junrar.rarfile.HostSystem.msdos = r0
            com.github.junrar.rarfile.HostSystem r1 = new com.github.junrar.rarfile.HostSystem
            java.lang.String r2 = "os2"
            r3 = 1
            r1.<init>(r2, r3, r3)
            com.github.junrar.rarfile.HostSystem.os2 = r1
            com.github.junrar.rarfile.HostSystem r2 = new com.github.junrar.rarfile.HostSystem
            java.lang.String r3 = "win32"
            r4 = 2
            r2.<init>(r3, r4, r4)
            com.github.junrar.rarfile.HostSystem.win32 = r2
            com.github.junrar.rarfile.HostSystem r3 = new com.github.junrar.rarfile.HostSystem
            java.lang.String r4 = "unix"
            r5 = 3
            r3.<init>(r4, r5, r5)
            com.github.junrar.rarfile.HostSystem.unix = r3
            com.github.junrar.rarfile.HostSystem r4 = new com.github.junrar.rarfile.HostSystem
            java.lang.String r5 = "macos"
            r6 = 4
            r4.<init>(r5, r6, r6)
            com.github.junrar.rarfile.HostSystem.macos = r4
            com.github.junrar.rarfile.HostSystem r5 = new com.github.junrar.rarfile.HostSystem
            java.lang.String r6 = "beos"
            r7 = 5
            r5.<init>(r6, r7, r7)
            com.github.junrar.rarfile.HostSystem.beos = r5
            com.github.junrar.rarfile.HostSystem[] r0 = new com.github.junrar.rarfile.HostSystem[]{r0, r1, r2, r3, r4, r5}
            com.github.junrar.rarfile.HostSystem.$VALUES = r0
            return
    }

    HostSystem(java.lang.String r1, int r2, byte r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.hostByte = r3
            return
    }

    public static com.github.junrar.rarfile.HostSystem findHostSystem(byte r2) {
            com.github.junrar.rarfile.HostSystem r0 = com.github.junrar.rarfile.HostSystem.msdos
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L9
            return r0
        L9:
            com.github.junrar.rarfile.HostSystem r0 = com.github.junrar.rarfile.HostSystem.os2
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L12
            return r0
        L12:
            com.github.junrar.rarfile.HostSystem r0 = com.github.junrar.rarfile.HostSystem.win32
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L1b
            return r0
        L1b:
            com.github.junrar.rarfile.HostSystem r0 = com.github.junrar.rarfile.HostSystem.unix
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L24
            return r0
        L24:
            com.github.junrar.rarfile.HostSystem r0 = com.github.junrar.rarfile.HostSystem.macos
            boolean r1 = r0.equals(r2)
            if (r1 == 0) goto L2d
            return r0
        L2d:
            com.github.junrar.rarfile.HostSystem r0 = com.github.junrar.rarfile.HostSystem.beos
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L36
            return r0
        L36:
            r2 = 0
            return r2
    }

    public static com.github.junrar.rarfile.HostSystem valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.rarfile.HostSystem> r0 = com.github.junrar.rarfile.HostSystem.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.rarfile.HostSystem r1 = (com.github.junrar.rarfile.HostSystem) r1
            return r1
    }

    public static com.github.junrar.rarfile.HostSystem[] values() {
            com.github.junrar.rarfile.HostSystem[] r0 = com.github.junrar.rarfile.HostSystem.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.rarfile.HostSystem[] r0 = (com.github.junrar.rarfile.HostSystem[]) r0
            return r0
    }

    public boolean equals(byte r1) {
            r0 = this;
            byte r0 = r0.hostByte
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public byte getHostByte() {
            r0 = this;
            byte r0 = r0.hostByte
            return r0
    }
}
