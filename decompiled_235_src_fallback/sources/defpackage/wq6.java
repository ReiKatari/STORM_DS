package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wq6  reason: default package */
/* loaded from: classes.dex */
public final class wq6 implements defpackage.gi7 {
    public final defpackage.od2 a;
    public final defpackage.kj7 b;
    public final defpackage.hb4 c;
    public defpackage.li7 d;
    public final java.util.LinkedList e;

    public wq6(defpackage.od2 r1, defpackage.kj7 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            hb4 r1 = new hb4
            r1.<init>()
            r0.c = r1
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r0.e = r1
            return
    }

    public static final java.lang.Object a(defpackage.wq6 r6, defpackage.uq6 r7, defpackage.li7 r8, defpackage.s41 r9) {
            r6.getClass()
            boolean r0 = r9 instanceof defpackage.vq6
            if (r0 == 0) goto L16
            r0 = r9
            vq6 r0 = (defpackage.vq6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Y = r1
            goto L1b
        L16:
            vq6 r0 = new vq6
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            java.lang.String r5 = "CXCP"
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2d
            defpackage.oi2.Y(r9)
            goto L60
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L33:
            defpackage.oi2.Y(r9)
            boolean r9 = defpackage.kj2.F(r5)
            if (r9 == 0) goto L55
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "StillCaptureRequestControl: submitting "
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r7 = " at "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            android.util.Log.d(r5, r7)
        L55:
            od2 r6 = r6.a
            r0.Y = r4
            java.lang.Object r9 = r6.a(r0)
            if (r9 != r1) goto L60
            return r1
        L60:
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            boolean r6 = defpackage.kj2.F(r5)
            if (r6 == 0) goto L70
            java.lang.String r6 = "StillCaptureRequestControl: Issuing single capture"
            android.util.Log.d(r5, r6)
        L70:
            throw r3
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r3) {
            r2 = this;
            r2.d = r3
            kj7 r3 = r2.b
            o41 r3 = r3.f
            hn r0 = new hn
            r1 = 0
            r0.<init>(r2, r1)
            r2 = 3
            defpackage.hv.L(r3, r1, r1, r0, r2)
            return
    }

    @Override // defpackage.gi7
    public final void reset() {
            r4 = this;
            kj7 r0 = r4.b
            o41 r0 = r0.f
            vy5 r1 = new vy5
            r2 = 10
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }
}
