package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: do1  reason: default package */
/* loaded from: classes.dex */
public final class do1 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;

    public /* synthetic */ do1(int r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            int r2 = r2.X
            jg7 r0 = defpackage.jg7.a
            r1 = 3
            switch(r2) {
                case 0: goto L2d;
                case 1: goto L1a;
                default: goto L8;
            }
        L8:
            j25 r3 = (defpackage.j25) r3
            jk4 r4 = (defpackage.jk4) r4
            long r2 = r4.a
            r41 r5 = (defpackage.r41) r5
            do1 r2 = new do1
            r3 = 2
            r2.<init>(r1, r5, r3)
            r2.s(r0)
            return r0
        L1a:
            w61 r3 = (defpackage.w61) r3
            java.lang.Number r4 = (java.lang.Number) r4
            r4.floatValue()
            r41 r5 = (defpackage.r41) r5
            do1 r2 = new do1
            r3 = 1
            r2.<init>(r1, r5, r3)
            r2.s(r0)
            return r0
        L2d:
            w61 r3 = (defpackage.w61) r3
            jk4 r4 = (defpackage.jk4) r4
            long r2 = r4.a
            r41 r5 = (defpackage.r41) r5
            do1 r2 = new do1
            r3 = 0
            r2.<init>(r1, r5, r3)
            r2.s(r0)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r2) {
            r1 = this;
            int r1 = r1.X
            jg7 r0 = defpackage.jg7.a
            switch(r1) {
                case 0: goto L13;
                case 1: goto Ld;
                default: goto L7;
            }
        L7:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            return r0
        Ld:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            return r0
        L13:
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r2)
            return r0
    }
}
