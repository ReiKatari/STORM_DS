package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no0  reason: default package */
/* loaded from: classes.dex */
public final class no0 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.cheats.CheatsActivity B;

    public /* synthetic */ no0(me.magnum.melonds.ui.cheats.CheatsActivity r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r1 = this;
            int r0 = r1.A
            me.magnum.melonds.ui.cheats.CheatsActivity r1 = r1.B
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            j71 r1 = r1.getDefaultViewModelCreationExtras()
            return r1
        Lc:
            ap7 r1 = r1.getViewModelStore()
            return r1
        L11:
            yo7 r1 = r1.getDefaultViewModelProviderFactory()
            return r1
    }
}
