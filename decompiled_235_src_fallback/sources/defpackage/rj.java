package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rj  reason: default package */
/* loaded from: classes.dex */
public final class rj implements defpackage.w61 {
    public final android.view.View A;
    public final defpackage.o37 B;
    public final defpackage.w61 L;
    public final java.util.concurrent.atomic.AtomicReference R;

    public rj(android.view.View r1, defpackage.o37 r2, defpackage.w61 r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r2 = 0
            r1.<init>(r2)
            r0.R = r1
            return
    }

    @Override // defpackage.w61
    public final defpackage.l61 A() {
            r0 = this;
            w61 r0 = r0.L
            l61 r0 = r0.A()
            return r0
    }

    public final defpackage.x61 a(defpackage.kt3 r11, defpackage.s41 r12) {
            r10 = this;
            boolean r0 = r12 instanceof defpackage.oj
            if (r0 == 0) goto L13
            r0 = r12
            oj r0 = (defpackage.oj) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            oj r0 = new oj
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r3
        L2a:
            defpackage.oi2.Y(r12)
            goto L4f
        L2e:
            defpackage.oi2.Y(r12)
            qj r5 = new qj
            r12 = 0
            r5.<init>(r12, r11, r10)
            z r7 = new z
            r11 = 4
            r8 = 0
            r7.<init>(r10, r8, r11)
            r0.Y = r4
            kp5 r4 = new kp5
            r9 = 5
            java.util.concurrent.atomic.AtomicReference r6 = r10.R
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r10 = defpackage.g04.C(r4, r0)
            if (r10 != r1) goto L4f
            return r1
        L4f:
            defpackage.e41.c()
            return r3
    }
}
