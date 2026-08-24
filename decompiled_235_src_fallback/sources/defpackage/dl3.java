package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dl3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dl3 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

    public /* synthetic */ dl3(me.magnum.melonds.ui.layouteditor.b r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            jg7 r1 = defpackage.jg7.a
            me.magnum.melonds.ui.layouteditor.b r2 = r2.B
            switch(r0) {
                case 0: goto L25;
                case 1: goto L1f;
                case 2: goto L19;
                case 3: goto Lf;
                default: goto L9;
            }
        L9:
            uj3 r3 = (defpackage.uj3) r3
            me.magnum.melonds.ui.layouteditor.b.i(r2, r3)
            return r1
        Lf:
            zj3 r3 = (defpackage.zj3) r3
            r3.getClass()
            r3 = 1
            r2.u(r3)
            return r1
        L19:
            me.magnum.melonds.domain.model.layout.BackgroundMode r3 = (me.magnum.melonds.domain.model.layout.BackgroundMode) r3
            me.magnum.melonds.ui.layouteditor.b.m(r2, r3)
            return r1
        L1f:
            java.lang.String r3 = (java.lang.String) r3
            me.magnum.melonds.ui.layouteditor.b.e(r2, r3)
            return r1
        L25:
            java.lang.String r3 = (java.lang.String) r3
            me.magnum.melonds.ui.layouteditor.b.a(r2, r3)
            return r1
    }
}
