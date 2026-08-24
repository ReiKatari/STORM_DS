package me.magnum.melonds.ui.romdetails;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RomDetailsActivity extends defpackage.jq implements defpackage.kr2 {
    public static final /* synthetic */ int J0 = 0;
    public defpackage.e70 A0;
    public defpackage.l06 B0;
    public final defpackage.uo7 C0;
    public final defpackage.uo7 D0;
    public defpackage.pq5 E0;
    public final defpackage.i9 F0;
    public final defpackage.ex6 G0;
    public final defpackage.tp6 H0;
    public final defpackage.tp6 I0;
    public volatile defpackage.r8 x0;
    public final java.lang.Object y0;
    public boolean z0;

    public RomDetailsActivity() {
            r8 = this;
            r8.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r8.y0 = r0
            r0 = 0
            r8.z0 = r0
            iq r1 = new iq
            r2 = 9
            r1.<init>(r8, r2)
            r8.q(r1)
            hv5 r1 = new hv5
            r1.<init>(r8, r0)
            uo7 r0 = new uo7
            java.lang.Class<hw5> r2 = defpackage.hw5.class
            ar0 r2 = defpackage.gh5.a(r2)
            hv5 r3 = new hv5
            r4 = 1
            r3.<init>(r8, r4)
            hv5 r5 = new hv5
            r6 = 2
            r5.<init>(r8, r6)
            r0.<init>(r2, r3, r1, r5)
            r8.C0 = r0
            hv5 r0 = new hv5
            r1 = 3
            r0.<init>(r8, r1)
            uo7 r2 = new uo7
            java.lang.Class<qv5> r3 = defpackage.qv5.class
            ar0 r3 = defpackage.gh5.a(r3)
            hv5 r5 = new hv5
            r6 = 4
            r5.<init>(r8, r6)
            hv5 r6 = new hv5
            r7 = 5
            r6.<init>(r8, r7)
            r2.<init>(r3, r5, r0, r6)
            r8.D0 = r2
            c9 r0 = new c9
            r0.<init>(r4)
            k9 r2 = new k9
            r2.<init>(r8, r1)
            d9 r0 = r8.s(r0, r2)
            i9 r0 = (defpackage.i9) r0
            r8.F0 = r0
            av5 r0 = new av5
            r0.<init>(r8, r1)
            ex6 r1 = new ex6
            r1.<init>(r0)
            r8.G0 = r1
            r0 = 0
            tp6 r1 = defpackage.up6.a(r0)
            r8.H0 = r1
            tp6 r0 = defpackage.up6.a(r0)
            r8.I0 = r0
            return
    }

    public final defpackage.qv5 A() {
            r0 = this;
            uo7 r0 = r0.D0
            java.lang.Object r0 = r0.getValue()
            qv5 r0 = (defpackage.qv5) r0
            return r0
    }

    public final void B(android.os.Bundle r1) {
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
            r4.B(r5)
            g57 r5 = defpackage.ht.a()
            g57 r0 = defpackage.g57.LIGHT
            r1 = 0
            r2 = 1
            if (r5 != r0) goto L28
            ix6 r5 = new ix6
            r76 r0 = new r76
            r3 = 17
            r0.<init>(r3)
            r5.<init>(r1, r1, r2, r0)
            defpackage.tr1.a(r4, r5)
            goto L38
        L28:
            ix6 r5 = new ix6
            r76 r0 = new r76
            r3 = 18
            r0.<init>(r3)
            r3 = 2
            r5.<init>(r1, r1, r3, r0)
            defpackage.tr1.a(r4, r5)
        L38:
            s9 r5 = new s9
            s35 r0 = new s35
            r0.<init>(r4)
            r5.<init>(r4, r0)
            sa5 r0 = new sa5
            r1 = 4
            r0.<init>(r1, r4, r5)
            zv0 r5 = new zv0
            r1 = -1391400277(0xffffffffad10eaab, float:-8.237559E-12)
            r5.<init>(r1, r2, r0)
            defpackage.nv0.a(r4, r5)
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

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
            r0 = this;
            super.onResume()
            qv5 r0 = r0.A()     // Catch: java.lang.Throwable -> La
            r0.p()     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
            r5 = this;
            ex6 r0 = r5.G0
            super.onStart()
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L40
            v82 r1 = (defpackage.v82) r1     // Catch: java.lang.Throwable -> L40
            mv0 r2 = r1.a     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = "display"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L40
            r2.getClass()     // Catch: java.lang.Throwable -> L40
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2     // Catch: java.lang.Throwable -> L40
            zk1 r3 = r1.d     // Catch: java.lang.Throwable -> L40
            r4 = 0
            r2.registerDisplayListener(r3, r4)     // Catch: java.lang.Throwable -> L40
            r1.b()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L40
            v82 r0 = (defpackage.v82) r0     // Catch: java.lang.Throwable -> L40
            bv5 r1 = new bv5     // Catch: java.lang.Throwable -> L40
            r2 = 1
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L40
            zv0 r5 = new zv0     // Catch: java.lang.Throwable -> L40
            r3 = -1680020134(0xffffffff9bdced5a, float:-3.6549332E-22)
            r5.<init>(r3, r2, r1)     // Catch: java.lang.Throwable -> L40
            r0.c = r5     // Catch: java.lang.Throwable -> L40
            x82 r0 = r0.b     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L40
            vs4 r0 = r0.B     // Catch: java.lang.Throwable -> L40
            r0.setValue(r5)     // Catch: java.lang.Throwable -> L40
        L40:
            return
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
            r1 = this;
            ex6 r0 = r1.G0     // Catch: java.lang.Throwable -> Lb
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lb
            v82 r0 = (defpackage.v82) r0     // Catch: java.lang.Throwable -> Lb
            r0.a()     // Catch: java.lang.Throwable -> Lb
        Lb:
            super.onStop()
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
