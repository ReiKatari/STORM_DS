package me.magnum.melonds.ui.cheats;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CheatsActivity extends defpackage.jq implements defpackage.kr2 {
    public static final /* synthetic */ int B0 = 0;
    public final defpackage.uo7 A0;
    public volatile defpackage.r8 x0;
    public final java.lang.Object y0;
    public boolean z0;

    public CheatsActivity() {
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.y0 = r0
            r0 = 0
            r6.z0 = r0
            iq r1 = new iq
            r2 = 2
            r1.<init>(r6, r2)
            r6.q(r1)
            no0 r1 = new no0
            r1.<init>(r6, r0)
            uo7 r0 = new uo7
            java.lang.Class<aq0> r3 = defpackage.aq0.class
            ar0 r3 = defpackage.gh5.a(r3)
            no0 r4 = new no0
            r5 = 1
            r4.<init>(r6, r5)
            no0 r5 = new no0
            r5.<init>(r6, r2)
            r0.<init>(r3, r4, r1, r5)
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
            android.content.Intent r5 = r4.getIntent()
            r5.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r3 = 0
            if (r0 < r1) goto L32
            java.lang.Object r5 = defpackage.r2.e(r5)
            goto L42
        L32:
            java.lang.String r0 = "key_rom_info"
            android.os.Parcelable r5 = r5.getParcelableExtra(r0)
            java.lang.Class<mx5> r0 = defpackage.mx5.class
            boolean r0 = r0.isInstance(r5)
            if (r0 == 0) goto L41
            goto L42
        L41:
            r5 = r3
        L42:
            android.os.Parcelable r5 = (android.os.Parcelable) r5
            mx5 r5 = (defpackage.mx5) r5
            if (r5 != 0) goto L4b
            dp0 r5 = defpackage.dp0.INSTANCE
            goto L50
        L4b:
            cp0 r5 = new cp0
            r5.<init>(r3)
        L50:
            ko0 r0 = new ko0
            r0.<init>(r4, r5, r2)
            zv0 r5 = new zv0
            r1 = -936098303(0xffffffffc8344601, float:-184600.02)
            r2 = 1
            r5.<init>(r1, r2, r0)
            defpackage.nv0.a(r4, r5)
            au3 r5 = defpackage.bl2.C(r4)
            mo0 r0 = new mo0
            r0.<init>(r4, r3, r2)
            r4 = 3
            defpackage.hv.L(r5, r3, r3, r0, r4)
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
