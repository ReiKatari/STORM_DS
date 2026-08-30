package me.magnum.melonds.ui.romdetails;

import android.hardware.display.DisplayManager;
import android.os.Bundle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class RomDetailsActivity extends xp implements el2 {
    public static final /* synthetic */ int I0 = 0;
    public rp5 A0;
    public final va7 B0;
    public final va7 C0;
    public rg5 D0;
    public final h9 E0;
    public final il6 F0;
    public final ee6 G0;
    public final ee6 H0;
    public volatile q8 w0;
    public final Object x0 = new Object();
    public boolean y0 = false;
    public a50 z0;

    public RomDetailsActivity() {
        q(new wp(this, 9));
        this.B0 = new va7(q75.a(sl5.class), new rk5(this, 1), new rk5(this, 0), new rk5(this, 2));
        this.C0 = new va7(q75.a(al5.class), new rk5(this, 4), new rk5(this, 3), new rk5(this, 5));
        this.E0 = (h9) s(new b9(0), new j9(3, this));
        this.F0 = new il6(new jk5(this, 3));
        this.G0 = fe6.a(null);
        this.H0 = fe6.a(null);
    }

    public final al5 A() {
        return (al5) this.C0.getValue();
    }

    public final void B(Bundle bundle) {
        super.onCreate(bundle);
        z().c();
    }

    @Override // defpackage.dl2
    public final Object d() {
        return z().d();
    }

    @Override // defpackage.ys0, defpackage.lq2
    public final xa7 getDefaultViewModelProviderFactory() {
        return l07.K(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.p, defpackage.ys0, defpackage.xs0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        jn1.a(this, null, 3);
        B(bundle);
        zs0.a(this, new et0(-1391400277, true, new i15(2, this, new r9(this, new dz4(this)))));
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().a();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        A().p();
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        super.onStart();
        il6 il6Var = this.F0;
        d42 d42Var = (d42) il6Var.getValue();
        Object systemService = d42Var.a.getSystemService("display");
        systemService.getClass();
        ((DisplayManager) systemService).registerDisplayListener(d42Var.d, null);
        d42Var.b();
        d42 d42Var2 = (d42) il6Var.getValue();
        et0 et0Var = new et0(157275554, true, new kk5(this, 1));
        d42Var2.c = et0Var;
        f42 f42Var = d42Var2.b;
        if (f42Var != null) {
            f42Var.B.setValue(et0Var);
        }
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        ((d42) this.F0.getValue()).a();
        super.onStop();
    }

    public final q8 z() {
        if (this.w0 == null) {
            synchronized (this.x0) {
                try {
                    if (this.w0 == null) {
                        this.w0 = new q8(this);
                    }
                } finally {
                }
            }
        }
        return this.w0;
    }
}
