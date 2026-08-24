package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny5  reason: default package */
/* loaded from: classes.dex */
public final class ny5 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.romlist.RomListActivity B;

    public /* synthetic */ ny5(me.magnum.melonds.ui.romlist.RomListActivity r1, int r2) {
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
            me.magnum.melonds.ui.romlist.RomListActivity r1 = r1.B
            switch(r0) {
                case 0: goto L20;
                case 1: goto L1b;
                case 2: goto L16;
                case 3: goto L11;
                case 4: goto Lc;
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
        L16:
            j71 r1 = r1.getDefaultViewModelCreationExtras()
            return r1
        L1b:
            ap7 r1 = r1.getViewModelStore()
            return r1
        L20:
            yo7 r1 = r1.getDefaultViewModelProviderFactory()
            return r1
    }
}
