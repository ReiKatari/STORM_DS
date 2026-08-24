package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: us0  reason: default package */
/* loaded from: classes.dex */
public abstract class us0 {
    public static final defpackage.qs0 a = null;

    static {
            qs0 r0 = new qs0
            r0.<init>()
            td6 r1 = defpackage.td6.COPY
            ts0 r2 = new ts0
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]
            r4 = 3
            r2.<init>(r3, r4)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.LZMA
            ts0 r2 = new ts0
            java.lang.Class<wi3> r3 = defpackage.wi3.class
            java.lang.Class<java.lang.Number> r4 = java.lang.Number.class
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r4}
            r6 = 7
            r2.<init>(r5, r6)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.LZMA2
            ts0 r2 = new ts0
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}
            r5 = 6
            r2.<init>(r3, r5)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.DEFLATE
            ts0 r2 = new ts0
            java.lang.Class[] r3 = new java.lang.Class[]{r4}
            r5 = 0
            r2.<init>(r3, r5)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.DEFLATE64
            ts0 r2 = new ts0
            java.lang.Class[] r3 = new java.lang.Class[]{r4}
            r5 = 4
            r2.<init>(r3, r5)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.BZIP2
            ts0 r2 = new ts0
            java.lang.Class[] r3 = new java.lang.Class[]{r4}
            r5 = 2
            r2.<init>(r3, r5)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.AES256SHA256
            ts0 r2 = new ts0
            java.lang.Class<l> r3 = defpackage.l.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            r5 = 1
            r2.<init>(r3, r5)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.BCJ_X86_FILTER
            rs0 r2 = new rs0
            n r3 = new n
            r5 = 5
            r3.<init>(r5)
            r2.<init>(r3)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.BCJ_PPC_FILTER
            rs0 r2 = new rs0
            n r3 = new n
            r5 = 3
            r3.<init>(r5)
            r2.<init>(r3)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.BCJ_IA64_FILTER
            rs0 r2 = new rs0
            n r3 = new n
            r5 = 2
            r3.<init>(r5)
            r2.<init>(r3)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.BCJ_ARM_FILTER
            rs0 r2 = new rs0
            n r3 = new n
            r5 = 0
            r3.<init>(r5)
            r2.<init>(r3)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.BCJ_ARM_THUMB_FILTER
            rs0 r2 = new rs0
            n r3 = new n
            r5 = 1
            r3.<init>(r5)
            r2.<init>(r3)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.BCJ_SPARC_FILTER
            rs0 r2 = new rs0
            n r3 = new n
            r5 = 4
            r3.<init>(r5)
            r2.<init>(r3)
            r0.put(r1, r2)
            td6 r1 = defpackage.td6.DELTA_FILTER
            ts0 r2 = new ts0
            java.lang.Class[] r3 = new java.lang.Class[]{r4}
            r4 = 5
            r2.<init>(r3, r4)
            r0.put(r1, r2)
            defpackage.us0.a = r0
            return
    }

    public static java.io.InputStream a(java.lang.String r9, java.io.InputStream r10, long r11, defpackage.ps0 r13, byte[] r14, int r15) {
            byte[] r8 = r13.a
            td6 r0 = defpackage.td6.byId(r8)
            qs0 r1 = defpackage.us0.a
            java.lang.Object r0 = r1.get(r0)
            j0 r0 = (defpackage.j0) r0
            if (r0 == 0) goto L1b
            r1 = r9
            r2 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r15
            java.io.InputStream r0 = r0.a(r1, r2, r3, r5, r6, r7)
            return r0
        L1b:
            java.lang.String r0 = java.util.Arrays.toString(r8)
            java.lang.String r1 = " used in "
            java.lang.String r2 = "Unsupported compression method "
            defpackage.fa6.i(r2, r0, r1, r9)
            r0 = 0
            return r0
    }
}
