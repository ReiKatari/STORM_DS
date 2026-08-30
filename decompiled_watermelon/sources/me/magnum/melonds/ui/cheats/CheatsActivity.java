package me.magnum.melonds.ui.cheats;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class CheatsActivity extends xp implements el2 {
    public static final /* synthetic */ int A0 = 0;
    public volatile q8 w0;
    public final Object x0 = new Object();
    public boolean y0 = false;
    public final va7 z0;

    public CheatsActivity() {
        q(new wp(this, 2));
        this.z0 = new va7(q75.a(pn0.class), new fm0(this, 1), new fm0(this, 0), new fm0(this, 2));
    }

    public final void A(Bundle bundle) {
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
        Object parcelableExtra;
        tq5 tm0Var;
        jn1.a(this, new ml6(0, 0, 2, new d96(6)), 2);
        A(bundle);
        Intent intent = getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = p2.e(intent);
        } else {
            parcelableExtra = intent.getParcelableExtra("key_rom_info");
            if (!xm5.class.isInstance(parcelableExtra)) {
                parcelableExtra = null;
            }
        }
        if (((xm5) ((Parcelable) parcelableExtra)) == null) {
            tm0Var = um0.INSTANCE;
        } else {
            tm0Var = new tm0(null);
        }
        zs0.a(this, new et0(-936098303, true, new cm0(this, tm0Var, 0)));
        tq5.w(hk2.y(this), null, null, new em0(this, null, 1), 3);
    }

    @Override // defpackage.xp, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().a();
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
