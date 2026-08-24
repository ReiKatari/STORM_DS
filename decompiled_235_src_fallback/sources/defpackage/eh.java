package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eh  reason: default package */
/* loaded from: classes.dex */
public final class eh extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ android.net.Uri Y;

    public /* synthetic */ eh(android.net.Uri r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Y = r1
            r1 = 2
            r0.<init>(r1, r2)
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            eh r2 = (defpackage.eh) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            eh r2 = (defpackage.eh) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            switch(r3) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            eh r3 = new eh
            android.net.Uri r1 = r1.Y
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            eh r3 = new eh
            android.net.Uri r1 = r1.Y
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.X
            android.net.Uri r2 = r2.Y
            me.magnum.melonds.MelonEmulator r1 = me.magnum.melonds.MelonEmulator.a
            switch(r0) {
                case 0: goto L17;
                default: goto L9;
            }
        L9:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            boolean r2 = r1.f(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L17:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            boolean r2 = r1.c(r2)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
    }
}
