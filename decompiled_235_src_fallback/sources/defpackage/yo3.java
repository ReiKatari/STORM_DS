package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yo3  reason: default package */
/* loaded from: classes.dex */
public final class yo3 {
    public final int a;
    public final defpackage.xo3[] b;
    public final defpackage.ap3 c;
    public final java.util.List d;
    public final int e;
    public final int f;
    public final int g;

    public yo3(int r2, defpackage.xo3[] r3, defpackage.ap3 r4, java.util.List r5, int r6) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            int r2 = r3.length
            r4 = 0
            r5 = r4
            r6 = r5
        L11:
            if (r5 >= r2) goto L1e
            r0 = r3[r5]
            int r0 = r0.k
            int r6 = java.lang.Math.max(r6, r0)
            int r5 = r5 + 1
            goto L11
        L1e:
            r1.f = r6
            int r2 = r1.e
            int r6 = r6 + r2
            if (r6 >= 0) goto L26
            goto L27
        L26:
            r4 = r6
        L27:
            r1.g = r4
            return
    }

    public final defpackage.xo3[] a(int r13, int r14, int r15) {
            r12 = this;
            xo3[] r0 = r12.b
            int r1 = r0.length
            r2 = 0
            r3 = r2
            r10 = r3
        L6:
            if (r2 >= r1) goto L2c
            r4 = r0[r2]
            int r11 = r3 + 1
            java.util.List r5 = r12.d
            java.lang.Object r3 = r5.get(r3)
            ju2 r3 = (defpackage.ju2) r3
            long r5 = r3.a
            int r3 = (int) r5
            ap3 r5 = r12.c
            java.lang.Object r5 = r5.L
            int[] r5 = (int[]) r5
            r6 = r5[r10]
            int r9 = r12.a
            r5 = r13
            r7 = r14
            r8 = r15
            r4.k(r5, r6, r7, r8, r9, r10)
            int r10 = r10 + r3
            int r2 = r2 + 1
            r3 = r11
            goto L6
        L2c:
            return r0
    }
}
