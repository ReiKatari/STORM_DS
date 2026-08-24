package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa1  reason: default package */
/* loaded from: classes.dex */
public final class xa1 extends defpackage.qo7 {
    public final defpackage.kd6 b;
    public final defpackage.kx5 c;
    public final defpackage.tp6 d;
    public final defpackage.de5 e;

    public xa1(defpackage.p06 r3, defpackage.kd6 r4, defpackage.kx5 r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r2.<init>()
            r2.b = r4
            r2.c = r5
            oa1 r4 = defpackage.oa1.a
            tp6 r4 = defpackage.up6.a(r4)
            r2.d = r4
            de5 r5 = new de5
            r5.<init>(r4)
            r2.e = r5
            xb2 r3 = (defpackage.xb2) r3
            g21 r3 = r3.o()
            g21 r4 = new g21
            r5 = 1
            r4.<init>(r3, r5)
            m5 r3 = new m5
            r5 = 10
            r0 = 0
            r3.<init>(r2, r0, r5)
            cf2 r5 = new cf2
            r1 = 2
            r5.<init>(r4, r3, r1)
            as0 r2 = defpackage.to7.a(r2)
            a6 r3 = new a6
            r4 = 20
            r3.<init>(r5, r0, r4)
            r4 = 3
            defpackage.hv.L(r2, r0, r0, r3, r4)
            return
    }

    public final java.lang.Object e(defpackage.pq5 r7, defpackage.s41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.va1
            if (r0 == 0) goto L13
            r0 = r8
            va1 r0 = (defpackage.va1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            va1 r0 = new va1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r8)
            goto L4a
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L2e:
            defpackage.oi2.Y(r8)
            r0.Y = r4
            kx5 r8 = r6.c
            r8.getClass()
            xe1 r2 = defpackage.xk1.a
            de1 r2 = defpackage.de1.L
            m5 r4 = new m5
            r5 = 28
            r4.<init>(r7, r8, r3, r5)
            java.lang.Object r8 = defpackage.hv.d0(r2, r4, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            kd6 r6 = r6.b
            ng6 r6 = (defpackage.ng6) r6
            jx5 r6 = r6.q()
            ix5 r7 = new ix5
            r7.<init>(r8, r6)
            return r7
    }
}
