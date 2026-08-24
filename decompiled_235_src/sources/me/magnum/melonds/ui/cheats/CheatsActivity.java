package me.magnum.melonds.ui.cheats;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class CheatsActivity extends jq implements kr2 {
    public static final /* synthetic */ int B0 = 0;
    public final uo7 A0;
    public volatile r8 x0;
    public final Object y0 = new Object();
    public boolean z0 = false;

    public CheatsActivity() {
        q(new iq(this, 2));
        this.A0 = new uo7(gh5.a(aq0.class), new no0(this, 1), new no0(this, 0), new no0(this, 2));
    }

    public final void A(Bundle bundle) {
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
        Object parcelableExtra;
        vy7 cp0Var;
        setTheme(ht.a().getThemeResId());
        tr1.a(this, new ix6(0, 0, 2, new r76(18)));
        A(bundle);
        Intent intent = getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = r2.e(intent);
        } else {
            parcelableExtra = intent.getParcelableExtra("key_rom_info");
            if (!mx5.class.isInstance(parcelableExtra)) {
                parcelableExtra = null;
            }
        }
        if (((mx5) ((Parcelable) parcelableExtra)) == null) {
            cp0Var = dp0.INSTANCE;
        } else {
            cp0Var = new cp0(null);
        }
        nv0.a(this, new zv0(-936098303, true, new ko0(this, cp0Var, 0)));
        hv.L(bl2.C(this), null, null, new mo0(this, null, 1), 3);
    }

    @Override // defpackage.jq, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().a();
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
