package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf4  reason: default package */
/* loaded from: classes.dex */
public final class wf4 extends androidx.fragment.app.o implements defpackage.kr2 {
    public static final java.util.List d0 = null;
    public defpackage.bo7 A;
    public boolean B;
    public volatile defpackage.mt L;
    public final java.lang.Object R;
    public boolean X;
    public final defpackage.uo7 Y;
    public final defpackage.d9 Z;

    static {
            java.lang.String r0 = "com.google.android.documentsui"
            java.lang.String r1 = "com.android.documentsui"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.wf4.d0 = r0
            return
    }

    public wf4() {
            r7 = this;
            r7.<init>()
            r0 = 0
            r7.B = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r7.R = r1
            r7.X = r0
            java.lang.Class<tz5> r1 = defpackage.tz5.class
            ar0 r1 = defpackage.gh5.a(r1)
            vf4 r2 = new vf4
            r2.<init>(r7, r0)
            vf4 r3 = new vf4
            r4 = 1
            r3.<init>(r7, r4)
            vf4 r4 = new vf4
            r5 = 2
            r4.<init>(r7, r5)
            uo7 r6 = new uo7
            r6.<init>(r1, r2, r4, r3)
            r7.Y = r6
            zj1 r1 = new zj1
            sv4 r2 = defpackage.sv4.READ_WRITE
            r1.<init>(r2, r0)
            k9 r0 = new k9
            r0.<init>(r7, r5)
            d9 r0 = r7.registerForActivityResult(r1, r0)
            r0.getClass()
            r7.Z = r0
            return
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r2 = this;
            mt r0 = r2.L
            if (r0 != 0) goto L19
            java.lang.Object r0 = r2.R
            monitor-enter(r0)
            mt r1 = r2.L     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            mt r1 = new mt     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r2.L = r1     // Catch: java.lang.Throwable -> L13
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
            mt r2 = r2.L
            java.lang.Object r2 = r2.c()
            return r2
    }

    @Override // androidx.fragment.app.o
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = super.getContext()
            if (r0 != 0) goto Lc
            boolean r0 = r1.B
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            r1.h()
            bo7 r1 = r1.A
            return r1
    }

    @Override // androidx.fragment.app.o, defpackage.mw2
    public final defpackage.yo7 getDefaultViewModelProviderFactory() {
            r1 = this;
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.T(r1, r0)
            return r1
    }

    public final void h() {
            r2 = this;
            bo7 r0 = r2.A
            if (r0 != 0) goto L19
            android.content.Context r0 = super.getContext()
            bo7 r1 = new bo7
            r1.<init>(r0, r2)
            r2.A = r1
            android.content.Context r0 = super.getContext()
            boolean r0 = defpackage.bl2.I(r0)
            r2.B = r0
        L19:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(android.app.Activity r4) {
            r3 = this;
            super.onAttach(r4)
            bo7 r0 = r3.A
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L12
            android.content.Context r0 = defpackage.mt.d(r0)
            if (r0 != r4) goto L10
            goto L12
        L10:
            r4 = r2
            goto L13
        L12:
            r4 = r1
        L13:
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            java.lang.Object[] r2 = new java.lang.Object[r2]
            defpackage.qo2.o(r4, r0, r2)
            r3.h()
            boolean r4 = r3.X
            if (r4 != 0) goto L2c
            r3.X = r1
            java.lang.Object r3 = r3.c()
            yf4 r3 = (defpackage.yf4) r3
            r3.getClass()
        L2c:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(android.content.Context r1) {
            r0 = this;
            super.onAttach(r1)
            r0.h()
            boolean r1 = r0.X
            if (r1 != 0) goto L16
            r1 = 1
            r0.X = r1
            java.lang.Object r0 = r0.c()
            yf4 r0 = (defpackage.yf4) r0
            r0.getClass()
        L16:
            return
    }

    @Override // androidx.fragment.app.o
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
            r8 = this;
            r9.getClass()
            androidx.fragment.app.p r9 = r8.requireActivity()
            android.content.pm.PackageManager r9 = r9.getPackageManager()
            sv4 r10 = defpackage.sv4.READ_WRITE
            r10.getClass()
            android.content.Context r11 = r8.requireContext()
            r11.getClass()
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT_TREE"
            r11.<init>(r0)
            int r10 = r10.toFlags()
            r10 = r10 | 192(0xc0, float:2.69E-43)
            r11.addFlags(r10)
            r10 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r9 = r9.resolveActivity(r11, r10)
            r10 = 0
            r11 = 0
            if (r9 != 0) goto L5a
            java.util.List r0 = defpackage.wf4.d0
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            androidx.fragment.app.p r2 = r8.requireActivity()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r1.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            boolean r2 = r1.enabled     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 != 0) goto L37
            goto L58
        L57:
            r1 = r11
        L58:
            r6 = r1
            goto L5b
        L5a:
            r6 = r11
        L5b:
            r0 = 1
            if (r9 != 0) goto L62
            if (r6 != 0) goto L62
            r4 = r0
            goto L63
        L62:
            r4 = r10
        L63:
            if (r6 == 0) goto L67
            r3 = r0
            goto L68
        L67:
            r3 = r10
        L68:
            androidx.compose.ui.platform.ComposeView r9 = new androidx.compose.ui.platform.ComposeView
            android.content.Context r10 = r8.requireContext()
            r10.getClass()
            r1 = 6
            r9.<init>(r10, r11, r1)
            cs1 r10 = defpackage.cs1.p0
            r9.setViewCompositionStrategy(r10)
            tf4 r2 = new tf4
            r7 = 0
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            zv0 r8 = new zv0
            r10 = 1355535377(0x50cbd411, float:2.7357383E10)
            r8.<init>(r10, r0, r2)
            r9.setContent(r8)
            return r9
    }

    @Override // androidx.fragment.app.o
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r2) {
            r1 = this;
            android.view.LayoutInflater r2 = super.onGetLayoutInflater(r2)
            bo7 r0 = new bo7
            r0.<init>(r2, r1)
            android.view.LayoutInflater r1 = r2.cloneInContext(r0)
            return r1
    }
}
