package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jk7  reason: default package */
/* loaded from: classes.dex */
public abstract class jk7 {
    public static final defpackage.r90 a = null;

    static {
            r90 r0 = new r90
            jd1 r1 = defpackage.lk4.a
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.jk7.a = r0
            return
    }

    public static final defpackage.p97 a(defpackage.wq7 r8, defpackage.fp r9) {
            p97 r8 = r8.a(r9)
            java.lang.String r0 = r9.B
            int r0 = r0.length()
            fp r1 = r8.a
            mk4 r8 = r8.b
            java.lang.String r2 = r1.B
            int r2 = r2.length()
            r3 = 100
            int r4 = java.lang.Math.min(r0, r3)
            r5 = 0
            r6 = r5
        L1c:
            if (r6 >= r4) goto L28
            int r7 = r8.s(r6)
            b(r7, r2, r6)
            int r6 = r6 + 1
            goto L1c
        L28:
            int r4 = r8.s(r0)
            b(r4, r2, r0)
            int r3 = java.lang.Math.min(r2, r3)
        L33:
            if (r5 >= r3) goto L3f
            int r4 = r8.i(r5)
            c(r4, r0, r5)
            int r5 = r5 + 1
            goto L33
        L3f:
            int r3 = r8.i(r2)
            c(r3, r0, r2)
            p97 r0 = new p97
            r90 r2 = new r90
            java.lang.String r9 = r9.B
            int r9 = r9.length()
            java.lang.String r3 = r1.B
            int r3 = r3.length()
            r2.<init>(r8, r9, r3)
            r0.<init>(r1, r2)
            return r0
    }

    public static final void b(int r3, int r4, int r5) {
            r0 = 0
            if (r3 < 0) goto L6
            if (r3 > r4) goto L6
            r0 = 1
        L6:
            if (r0 != 0) goto L21
            java.lang.String r0 = " -> "
            java.lang.String r1 = " is not in range of transformed text [0, "
            java.lang.String r2 = "OffsetMapping.originalToTransformed returned invalid mapping: "
            java.lang.StringBuilder r3 = defpackage.i61.q(r5, r3, r2, r0, r1)
            r3.append(r4)
            r4 = 93
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.s53.c(r3)
        L21:
            return
    }

    public static final void c(int r3, int r4, int r5) {
            r0 = 0
            if (r3 < 0) goto L6
            if (r3 > r4) goto L6
            r0 = 1
        L6:
            if (r0 != 0) goto L21
            java.lang.String r0 = " -> "
            java.lang.String r1 = " is not in range of original text [0, "
            java.lang.String r2 = "OffsetMapping.transformedToOriginal returned invalid mapping: "
            java.lang.StringBuilder r3 = defpackage.i61.q(r5, r3, r2, r0, r1)
            r3.append(r4)
            r4 = 93
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.s53.c(r3)
        L21:
            return
    }
}
