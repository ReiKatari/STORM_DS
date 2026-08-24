package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum RARVersion extends java.lang.Enum<com.github.junrar.rarfile.RARVersion> {
    private static final /* synthetic */ com.github.junrar.rarfile.RARVersion[] $VALUES = null;
    public static final com.github.junrar.rarfile.RARVersion OLD = null;
    public static final com.github.junrar.rarfile.RARVersion V4 = null;
    public static final com.github.junrar.rarfile.RARVersion V5 = null;

    static {
            com.github.junrar.rarfile.RARVersion r0 = new com.github.junrar.rarfile.RARVersion
            java.lang.String r1 = "OLD"
            r2 = 0
            r0.<init>(r1, r2)
            com.github.junrar.rarfile.RARVersion.OLD = r0
            com.github.junrar.rarfile.RARVersion r1 = new com.github.junrar.rarfile.RARVersion
            java.lang.String r2 = "V4"
            r3 = 1
            r1.<init>(r2, r3)
            com.github.junrar.rarfile.RARVersion.V4 = r1
            com.github.junrar.rarfile.RARVersion r2 = new com.github.junrar.rarfile.RARVersion
            java.lang.String r3 = "V5"
            r4 = 2
            r2.<init>(r3, r4)
            com.github.junrar.rarfile.RARVersion.V5 = r2
            com.github.junrar.rarfile.RARVersion[] r0 = new com.github.junrar.rarfile.RARVersion[]{r0, r1, r2}
            com.github.junrar.rarfile.RARVersion.$VALUES = r0
            return
    }

    RARVersion(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static boolean isOldFormat(com.github.junrar.rarfile.RARVersion r1) {
            com.github.junrar.rarfile.RARVersion r0 = com.github.junrar.rarfile.RARVersion.OLD
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static com.github.junrar.rarfile.RARVersion valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.rarfile.RARVersion> r0 = com.github.junrar.rarfile.RARVersion.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.rarfile.RARVersion r1 = (com.github.junrar.rarfile.RARVersion) r1
            return r1
    }

    public static com.github.junrar.rarfile.RARVersion[] values() {
            com.github.junrar.rarfile.RARVersion[] r0 = com.github.junrar.rarfile.RARVersion.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.rarfile.RARVersion[] r0 = (com.github.junrar.rarfile.RARVersion[]) r0
            return r0
    }
}
