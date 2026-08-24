package me.magnum.melonds.ui.settings.vulkandriver;

import android.os.Bundle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class VulkanDriverManagerActivity extends jq implements kr2 {
    public static final /* synthetic */ int B0 = 0;
    public final uo7 A0;
    public volatile r8 x0;
    public final Object y0 = new Object();
    public boolean z0 = false;

    public VulkanDriverManagerActivity() {
        q(new iq(this, 13));
        this.A0 = new uo7(gh5.a(qr7.class), new br7(this, 1), new br7(this, 0), new br7(this, 2));
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
        setTheme(ht.a().getThemeResId());
        tr1.a(this, new ix6(0, 0, 2, new r76(18)));
        A(bundle);
        nv0.a(this, new zv0(-1666177623, true, new ar7(this, 0)));
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
