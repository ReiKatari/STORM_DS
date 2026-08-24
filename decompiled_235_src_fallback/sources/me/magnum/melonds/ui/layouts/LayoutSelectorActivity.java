package me.magnum.melonds.ui.layouts;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class LayoutSelectorActivity extends defpackage.jq implements defpackage.kr2 {
    public static final /* synthetic */ int B0 = 0;
    public final defpackage.uo7 A0;
    public volatile defpackage.r8 x0;
    public final java.lang.Object y0;
    public boolean z0;

    public LayoutSelectorActivity() {
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.y0 = r0
            r0 = 0
            r6.z0 = r0
            iq r1 = new iq
            r2 = 8
            r1.<init>(r6, r2)
            r6.q(r1)
            on3 r1 = new on3
            r1.<init>(r6, r0)
            uo7 r0 = new uo7
            java.lang.Class<qn3> r2 = defpackage.qn3.class
            ar0 r2 = defpackage.gh5.a(r2)
            on3 r3 = new on3
            r4 = 1
            r3.<init>(r6, r4)
            on3 r4 = new on3
            r5 = 2
            r4.<init>(r6, r5)
            r0.<init>(r2, r3, r1, r4)
            r6.A0 = r0
            return
    }

    public final void A(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            r8 r0 = r0.z()
            r0.d()
            return
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r0 = this;
            r8 r0 = r0.z()
            java.lang.Object r0 = r0.c()
            return r0
    }

    @Override // defpackage.mv0, defpackage.mw2
    public final defpackage.yo7 getDefaultViewModelProviderFactory() {
            r1 = this;
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.R(r1, r0)
            return r1
    }

    @Override // androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(android.os.Bundle r5) {
            r4 = this;
            g57 r0 = defpackage.ht.a()
            int r0 = r0.getThemeResId()
            r4.setTheme(r0)
            ix6 r0 = new ix6
            r76 r1 = new r76
            r2 = 18
            r1.<init>(r2)
            r2 = 0
            r3 = 2
            r0.<init>(r2, r2, r3, r1)
            defpackage.tr1.a(r4, r0)
            r4.A(r5)
            mn3 r5 = new mn3
            r5.<init>(r4, r2)
            zv0 r0 = new zv0
            r1 = -618188382(0xffffffffdb2731a2, float:-4.7060893E16)
            r2 = 1
            r0.<init>(r1, r2, r5)
            defpackage.nv0.a(r4, r0)
            au3 r5 = defpackage.bl2.C(r4)
            nn3 r0 = new nn3
            r1 = 0
            r0.<init>(r4, r1, r2)
            r4 = 3
            defpackage.hv.L(r5, r1, r1, r0, r4)
            return
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
            r0 = this;
            super.onDestroy()
            r8 r0 = r0.z()
            r0.a()
            return
    }

    public final defpackage.r8 z() {
            r2 = this;
            r8 r0 = r2.x0
            if (r0 != 0) goto L19
            java.lang.Object r0 = r2.y0
            monitor-enter(r0)
            r8 r1 = r2.x0     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            r8 r1 = new r8     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r2.x0 = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            r8 r2 = r2.x0
            return r2
    }
}
