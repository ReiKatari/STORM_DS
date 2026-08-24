package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h87  reason: default package */
/* loaded from: classes.dex */
public final class h87 implements defpackage.f87, defpackage.g44 {
    public final /* synthetic */ defpackage.i87 A;

    public /* synthetic */ h87(defpackage.i87 r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.g44
    public void H(defpackage.i44 r4) {
            r3 = this;
            i87 r3 = r3.A
            l87 r0 = r3.l
            androidx.appcompat.widget.Toolbar r0 = r0.a
            boolean r0 = r0.q()
            android.view.Window$Callback r3 = r3.m
            r1 = 108(0x6c, float:1.51E-43)
            if (r0 == 0) goto L14
            r3.onPanelClosed(r1, r4)
            return
        L14:
            r0 = 0
            r2 = 0
            boolean r0 = r3.onPreparePanel(r0, r2, r4)
            if (r0 == 0) goto L1f
            r3.onMenuOpened(r1, r4)
        L1f:
            return
    }

    @Override // defpackage.g44
    public boolean n(defpackage.i44 r1, android.view.MenuItem r2) {
            r0 = this;
            r0 = 0
            return r0
    }
}
