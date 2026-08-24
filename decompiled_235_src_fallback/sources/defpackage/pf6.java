package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf6  reason: default package */
/* loaded from: classes.dex */
public abstract class pf6 {
    public static final defpackage.gr1 a = null;

    static {
            gr1 r0 = new gr1
            java.lang.String r1 = "NO_VALUE"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.pf6.a = r0
            return
    }

    public static final defpackage.of6 a(int r1, int r2, defpackage.m80 r3) {
            if (r1 < 0) goto L2a
            if (r2 < 0) goto L20
            if (r1 > 0) goto L14
            if (r2 > 0) goto L14
            m80 r0 = defpackage.m80.SUSPEND
            if (r3 != r0) goto Ld
            goto L14
        Ld:
            java.lang.String r1 = "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy "
            defpackage.u34.w(r3, r1)
        L12:
            r1 = 0
            return r1
        L14:
            int r2 = r2 + r1
            if (r2 >= 0) goto L1a
            r2 = 2147483647(0x7fffffff, float:NaN)
        L1a:
            of6 r0 = new of6
            r0.<init>(r1, r2, r3)
            return r0
        L20:
            java.lang.String r1 = "extraBufferCapacity cannot be negative, but was "
            java.lang.String r1 = defpackage.lb1.g(r2, r1)
            defpackage.i.f(r1)
            goto L12
        L2a:
            java.lang.String r2 = "replay cannot be negative, but was "
            java.lang.String r1 = defpackage.lb1.g(r1, r2)
            defpackage.i.f(r1)
            goto L12
    }

    public static /* synthetic */ defpackage.of6 b(int r2, int r3, defpackage.m80 r4, int r5) {
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r2 = r1
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lb
            r3 = r1
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L11
            m80 r4 = defpackage.m80.SUSPEND
        L11:
            of6 r2 = a(r2, r3, r4)
            return r2
    }

    public static final void c(java.lang.Object[] r0, long r1, java.lang.Object r3) {
            int r1 = (int) r1
            int r2 = r0.length
            int r2 = r2 + (-1)
            r1 = r1 & r2
            r0[r1] = r3
            return
    }

    public static final defpackage.le2 d(defpackage.kf6 r1, defpackage.l61 r2, int r3, defpackage.m80 r4) {
            if (r3 == 0) goto L5
            r0 = -3
            if (r3 != r0) goto La
        L5:
            m80 r0 = defpackage.m80.SUSPEND
            if (r4 != r0) goto La
            return r1
        La:
            yl0 r0 = new yl0
            r0.<init>(r3, r4, r2, r1)
            return r0
    }
}
