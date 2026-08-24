package me.magnum.melonds.ui.romdetails;

import android.hardware.display.DisplayManager;
import android.os.Bundle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RomDetailsActivity extends jq implements kr2 {
    public static final /* synthetic */ int J0 = 0;
    public e70 A0;
    public l06 B0;
    public final uo7 C0;
    public final uo7 D0;
    public pq5 E0;
    public final i9 F0;
    public final ex6 G0;
    public final tp6 H0;
    public final tp6 I0;
    public volatile r8 x0;
    public final Object y0 = new Object();
    public boolean z0 = false;

    public RomDetailsActivity() {
        q(new iq(this, 9));
        this.C0 = new uo7(gh5.a(hw5.class), new hv5(this, 1), new hv5(this, 0), new hv5(this, 2));
        this.D0 = new uo7(gh5.a(qv5.class), new hv5(this, 4), new hv5(this, 3), new hv5(this, 5));
        this.F0 = (i9) s(new c9(1), new k9(this, 3));
        this.G0 = new ex6(new av5(this, 3));
        this.H0 = up6.a(null);
        this.I0 = up6.a(null);
    }

    public final qv5 A() {
        return (qv5) this.D0.getValue();
    }

    public final void B(Bundle bundle) {
        super.onCreate(bundle);
        z().d();
    }

    @Override // defpackage.jr2
    public final Object c() {
        return z().c();
    }

    @Override // defpackage.mv0, defpackage.mw2
    public final yo7 getDefaultViewModelProviderFactory() {
        return hf.R(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        setTheme(ht.a().getThemeResId());
        B(bundle);
        if (ht.a() == g57.LIGHT) {
            tr1.a(this, new ix6(0, 0, 1, new r76(17)));
        } else {
            tr1.a(this, new ix6(0, 0, 2, new r76(18)));
        }
        nv0.a(this, new zv0(-1391400277, true, new sa5(4, this, new s9(this, new s35(this)))));
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().a();
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            A().p();
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStart() {
        ex6 ex6Var = this.G0;
        super.onStart();
        try {
            v82 v82Var = (v82) ex6Var.getValue();
            Object systemService = v82Var.a.getSystemService("display");
            systemService.getClass();
            ((DisplayManager) systemService).registerDisplayListener(v82Var.d, null);
            v82Var.b();
            v82 v82Var2 = (v82) ex6Var.getValue();
            zv0 zv0Var = new zv0(-1680020134, true, new bv5(this, 1));
            v82Var2.c = zv0Var;
            x82 x82Var = v82Var2.b;
            if (x82Var != null) {
                x82Var.B.setValue(zv0Var);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onStop() {
        try {
            ((v82) this.G0.getValue()).a();
        } catch (Throwable unused) {
        }
        super.onStop();
    }

    public final r8 z() {
        if (this.x0 == null) {
            synchronized (this.y0) {
                try {
                    if (this.x0 == null) {
                        this.x0 = new r8(this);
                    }
                } finally {
                }
            }
        }
        return this.x0;
    }
}
