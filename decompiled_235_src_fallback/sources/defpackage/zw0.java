package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zw0  reason: default package */
/* loaded from: classes.dex */
public final class zw0 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;

    public /* synthetic */ zw0(int r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 2
            r1.X = r0
            r1.<init>(r2, r3)
            return
    }

    public /* synthetic */ zw0(java.lang.Object r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Y = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            ne2 r3 = (defpackage.ne2) r3
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r41 r5 = (defpackage.r41) r5
            switch(r0) {
                case 0: goto L27;
                case 1: goto L19;
                default: goto Ld;
            }
        Ld:
            zw0 r2 = new zw0
            r3 = 3
            r2.<init>(r3, r5)
            r2.Y = r4
            r2.s(r1)
            return r1
        L19:
            zw0 r3 = new zw0
            java.lang.Object r2 = r2.Y
            ci0 r2 = (defpackage.ci0) r2
            r4 = 1
            r3.<init>(r2, r5, r4)
            r3.s(r1)
            return r1
        L27:
            zw0 r3 = new zw0
            java.lang.Object r2 = r2.Y
            zg5 r2 = (defpackage.zg5) r2
            r4 = 0
            r3.<init>(r2, r5, r4)
            r3.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            switch(r0) {
                case 0: goto L38;
                case 1: goto L16;
                default: goto L7;
            }
        L7:
            java.lang.Object r3 = r3.Y
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            boolean r4 = r3 instanceof defpackage.c67
            if (r4 == 0) goto L15
            return r1
        L15:
            throw r3
        L16:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            java.lang.Object r3 = r3.Y
            ci0 r3 = (defpackage.ci0) r3
            java.lang.Object r4 = r3.g
            tp6 r4 = (defpackage.tp6) r4
            r4.getClass()
            r0 = 0
            yt1 r2 = defpackage.yt1.A
            r4.m(r0, r2)
            java.lang.Object r4 = r3.f
            v80 r4 = (defpackage.v80) r4
            if (r4 == 0) goto L35
            r4.h(r0)
        L35:
            r3.f = r0
            return r1
        L38:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            java.lang.Object r3 = r3.Y
            zg5 r3 = (defpackage.zg5) r3
            r4 = 1
            r3.A = r4
            return r1
    }
}
