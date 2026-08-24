package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td6  reason: default package */
/* loaded from: classes.dex */
public enum td6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.td6[] $VALUES = null;
    public static final defpackage.td6 AES256SHA256 = null;
    public static final defpackage.td6 BCJ_ARM_FILTER = null;
    public static final defpackage.td6 BCJ_ARM_THUMB_FILTER = null;
    public static final defpackage.td6 BCJ_IA64_FILTER = null;
    public static final defpackage.td6 BCJ_PPC_FILTER = null;
    public static final defpackage.td6 BCJ_SPARC_FILTER = null;
    public static final defpackage.td6 BCJ_X86_FILTER = null;
    public static final defpackage.td6 BZIP2 = null;
    public static final defpackage.td6 COPY = null;
    public static final defpackage.td6 DEFLATE = null;
    public static final defpackage.td6 DEFLATE64 = null;
    public static final defpackage.td6 DELTA_FILTER = null;
    public static final defpackage.td6 LZMA = null;
    public static final defpackage.td6 LZMA2 = null;
    private final byte[] id;

    private static /* synthetic */ defpackage.td6[] $values() {
            td6 r0 = defpackage.td6.COPY
            td6 r1 = defpackage.td6.LZMA
            td6 r2 = defpackage.td6.LZMA2
            td6 r3 = defpackage.td6.DEFLATE
            td6 r4 = defpackage.td6.DEFLATE64
            td6 r5 = defpackage.td6.BZIP2
            td6 r6 = defpackage.td6.AES256SHA256
            td6 r7 = defpackage.td6.BCJ_X86_FILTER
            td6 r8 = defpackage.td6.BCJ_PPC_FILTER
            td6 r9 = defpackage.td6.BCJ_IA64_FILTER
            td6 r10 = defpackage.td6.BCJ_ARM_FILTER
            td6 r11 = defpackage.td6.BCJ_ARM_THUMB_FILTER
            td6 r12 = defpackage.td6.BCJ_SPARC_FILTER
            td6 r13 = defpackage.td6.DELTA_FILTER
            td6[] r0 = new defpackage.td6[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            return r0
    }

    static {
            td6 r0 = new td6
            r1 = 1
            byte[] r2 = new byte[r1]
            r3 = 0
            r2[r3] = r3
            java.lang.String r4 = "COPY"
            r0.<init>(r4, r3, r2)
            defpackage.td6.COPY = r0
            td6 r0 = new td6
            r2 = 3
            byte[] r4 = new byte[r2]
            r4 = {x00de: FILL_ARRAY_DATA  , data: [3, 1, 1} // fill-array
            java.lang.String r5 = "LZMA"
            r0.<init>(r5, r1, r4)
            defpackage.td6.LZMA = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r1]
            r5 = 33
            r4[r3] = r5
            java.lang.String r5 = "LZMA2"
            r6 = 2
            r0.<init>(r5, r6, r4)
            defpackage.td6.LZMA2 = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r2]
            r4 = {x00e4: FILL_ARRAY_DATA  , data: [4, 1, 8} // fill-array
            java.lang.String r5 = "DEFLATE"
            r0.<init>(r5, r2, r4)
            defpackage.td6.DEFLATE = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r2]
            r4 = {x00ea: FILL_ARRAY_DATA  , data: [4, 1, 9} // fill-array
            java.lang.String r5 = "DEFLATE64"
            r6 = 4
            r0.<init>(r5, r6, r4)
            defpackage.td6.DEFLATE64 = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r2]
            r4 = {x00f0: FILL_ARRAY_DATA  , data: [4, 2, 2} // fill-array
            java.lang.String r5 = "BZIP2"
            r7 = 5
            r0.<init>(r5, r7, r4)
            defpackage.td6.BZIP2 = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r6]
            r4 = {x00f6: FILL_ARRAY_DATA  , data: [6, -15, 7, 1} // fill-array
            java.lang.String r5 = "AES256SHA256"
            r7 = 6
            r0.<init>(r5, r7, r4)
            defpackage.td6.AES256SHA256 = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r6]
            r4 = {x00fc: FILL_ARRAY_DATA  , data: [3, 3, 1, 3} // fill-array
            java.lang.String r5 = "BCJ_X86_FILTER"
            r7 = 7
            r0.<init>(r5, r7, r4)
            defpackage.td6.BCJ_X86_FILTER = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r6]
            r4 = {x0102: FILL_ARRAY_DATA  , data: [3, 3, 2, 5} // fill-array
            java.lang.String r5 = "BCJ_PPC_FILTER"
            r7 = 8
            r0.<init>(r5, r7, r4)
            defpackage.td6.BCJ_PPC_FILTER = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r6]
            r4 = {x0108: FILL_ARRAY_DATA  , data: [3, 3, 4, 1} // fill-array
            java.lang.String r5 = "BCJ_IA64_FILTER"
            r7 = 9
            r0.<init>(r5, r7, r4)
            defpackage.td6.BCJ_IA64_FILTER = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r6]
            r4 = {x010e: FILL_ARRAY_DATA  , data: [3, 3, 5, 1} // fill-array
            java.lang.String r5 = "BCJ_ARM_FILTER"
            r7 = 10
            r0.<init>(r5, r7, r4)
            defpackage.td6.BCJ_ARM_FILTER = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r6]
            r4 = {x0114: FILL_ARRAY_DATA  , data: [3, 3, 7, 1} // fill-array
            java.lang.String r5 = "BCJ_ARM_THUMB_FILTER"
            r7 = 11
            r0.<init>(r5, r7, r4)
            defpackage.td6.BCJ_ARM_THUMB_FILTER = r0
            td6 r0 = new td6
            byte[] r4 = new byte[r6]
            r4 = {x011a: FILL_ARRAY_DATA  , data: [3, 3, 8, 5} // fill-array
            java.lang.String r5 = "BCJ_SPARC_FILTER"
            r6 = 12
            r0.<init>(r5, r6, r4)
            defpackage.td6.BCJ_SPARC_FILTER = r0
            td6 r0 = new td6
            byte[] r1 = new byte[r1]
            r1[r3] = r2
            java.lang.String r2 = "DELTA_FILTER"
            r3 = 13
            r0.<init>(r2, r3, r1)
            defpackage.td6.DELTA_FILTER = r0
            td6[] r0 = $values()
            defpackage.td6.$VALUES = r0
            return
    }

    td6(java.lang.String r1, int r2, byte[] r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.id = r3
            return
    }

    public static defpackage.td6 byId(byte[] r5) {
            java.lang.Class<td6> r0 = defpackage.td6.class
            java.lang.Object[] r0 = r0.getEnumConstants()
            td6[] r0 = (defpackage.td6[]) r0
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L1a
            r3 = r0[r2]
            byte[] r4 = r3.id
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L17
            return r3
        L17:
            int r2 = r2 + 1
            goto La
        L1a:
            r5 = 0
            return r5
    }

    public static defpackage.td6 valueOf(java.lang.String r1) {
            java.lang.Class<td6> r0 = defpackage.td6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            td6 r1 = (defpackage.td6) r1
            return r1
    }

    public static defpackage.td6[] values() {
            td6[] r0 = defpackage.td6.$VALUES
            java.lang.Object r0 = r0.clone()
            td6[] r0 = (defpackage.td6[]) r0
            return r0
    }

    public byte[] getId() {
            r1 = this;
            byte[] r1 = r1.id
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            return r1
    }
}
