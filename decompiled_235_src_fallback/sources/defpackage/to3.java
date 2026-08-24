package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: to3  reason: default package */
/* loaded from: classes.dex */
public final class to3 {
    public final defpackage.ap3 a;
    public final int b;
    public final int c;
    public final defpackage.so3 d;
    public final defpackage.dp3 e;
    public final /* synthetic */ defpackage.ap3 f;

    public to3(defpackage.ap3 r1, int r2, int r3, defpackage.so3 r4, defpackage.dp3 r5) {
            r0 = this;
            r0.<init>()
            r0.f = r1
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final long a(int r3, int r4) {
            r2 = this;
            ap3 r2 = r2.a
            java.lang.Object r0 = r2.B
            int[] r0 = (int[]) r0
            r1 = 1
            if (r4 != r1) goto Lc
            r2 = r0[r3]
            goto L1b
        Lc:
            int r4 = r4 + r3
            int r4 = r4 - r1
            java.lang.Object r2 = r2.L
            int[] r2 = (int[]) r2
            r1 = r2[r4]
            r4 = r0[r4]
            int r1 = r1 + r4
            r2 = r2[r3]
            int r2 = r1 - r2
        L1b:
            r3 = 0
            if (r2 >= 0) goto L1f
            r2 = r3
        L1f:
            if (r2 < 0) goto L22
            goto L27
        L22:
            java.lang.String r4 = "width must be >= 0"
            defpackage.r53.a(r4)
        L27:
            r4 = 2147483647(0x7fffffff, float:NaN)
            long r2 = defpackage.s21.h(r2, r2, r3, r4)
            return r2
    }

    public final defpackage.yo3 b(int r13) {
            r12 = this;
            dp3 r0 = r12.e
            qj2 r0 = r0.c(r13)
            int r1 = r0.a
            java.util.List r2 = r0.b
            int r2 = r2.size()
            r3 = 0
            if (r2 == 0) goto L1c
            int r4 = r1 + r2
            int r5 = r12.b
            if (r4 != r5) goto L18
            goto L1c
        L18:
            int r4 = r12.c
            r9 = r4
            goto L1d
        L1c:
            r9 = r3
        L1d:
            xo3[] r4 = new defpackage.xo3[r2]
            r7 = r3
            r10 = r9
        L21:
            java.util.List r9 = r0.b
            if (r3 >= r2) goto L42
            java.lang.Object r5 = r9.get(r3)
            ju2 r5 = (defpackage.ju2) r5
            long r5 = r5.a
            int r8 = (int) r5
            r9 = r10
            long r10 = r12.a(r7, r8)
            so3 r5 = r12.d
            int r6 = r1 + r3
            xo3 r5 = r5.o(r6, r7, r8, r9, r10)
            r10 = r9
            int r7 = r7 + r8
            r4[r3] = r5
            int r3 = r3 + 1
            goto L21
        L42:
            yo3 r5 = new yo3
            ap3 r8 = r12.f
            r6 = r13
            r7 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
    }
}
