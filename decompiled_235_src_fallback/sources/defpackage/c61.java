package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c61  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c61 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.e61 B;

    public /* synthetic */ c61(defpackage.e61 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            r1 = 1
            jg7 r2 = defpackage.jg7.a
            e61 r3 = r3.B
            switch(r0) {
                case 0: goto L52;
                case 1: goto L4c;
                case 2: goto L46;
                case 3: goto L40;
                case 4: goto L3c;
                case 5: goto L36;
                case 6: goto L24;
                default: goto La;
            }
        La:
            jt3 r0 = r3.o0
            nh2 r3 = r3.u0
            boolean r1 = r0.b()
            if (r1 != 0) goto L18
            defpackage.nh2.a(r3)
            goto L21
        L18:
            xm6 r3 = r0.c
            if (r3 == 0) goto L21
            bh1 r3 = (defpackage.bh1) r3
            r3.b()
        L21:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L24:
            jt3 r0 = r3.o0
            w51 r0 = r0.w
            l33 r3 = r3.t0
            int r3 = r3.e
            jt3 r0 = r0.B
            uh3 r0 = r0.r
            r0.b(r3)
        L33:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            return r3
        L36:
            p27 r3 = r3.s0
            r3.p()
            goto L33
        L3c:
            defpackage.nc1.c0(r3)
            return r2
        L40:
            p27 r3 = r3.s0
            r3.f()
            goto L33
        L46:
            p27 r3 = r3.s0
            r3.d(r1)
            goto L33
        L4c:
            p27 r3 = r3.s0
            r3.h(r1)
            goto L33
        L52:
            defpackage.nc1.c0(r3)
            return r2
    }
}
