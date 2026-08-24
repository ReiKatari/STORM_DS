package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n5  reason: default package */
/* loaded from: classes.dex */
public final class n5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ java.util.List Y;
    public final /* synthetic */ defpackage.qa4 Z;

    public /* synthetic */ n5(java.util.List r1, defpackage.qa4 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            n5 r2 = (defpackage.n5) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            n5 r2 = (defpackage.n5) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            switch(r4) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            n5 r4 = new n5
            qa4 r0 = r2.Z
            r1 = 1
            java.util.List r2 = r2.Y
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            n5 r4 = new n5
            qa4 r0 = r2.Z
            r1 = 0
            java.util.List r2 = r2.Y
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            qa4 r2 = r3.Z
            java.util.List r3 = r3.Y
            switch(r0) {
                case 0: goto L22;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            java.lang.Object r4 = r2.getValue()
            g6 r4 = (defpackage.g6) r4
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L21
            g6 r3 = defpackage.g6.All
            r2.setValue(r3)
        L21:
            return r1
        L22:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            java.lang.Object r4 = r2.getValue()
            l6 r4 = (defpackage.l6) r4
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L38
            l6 r3 = defpackage.l6.All
            r2.setValue(r3)
        L38:
            return r1
    }
}
