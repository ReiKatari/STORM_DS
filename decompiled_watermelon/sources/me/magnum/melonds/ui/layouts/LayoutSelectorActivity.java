package me.magnum.melonds.ui.layouts;

import android.os.Bundle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class LayoutSelectorActivity extends xp implements el2 {
    public static final /* synthetic */ int A0 = 0;
    public volatile q8 w0;
    public final Object x0 = new Object();
    public boolean y0 = false;
    public final va7 z0;

    public LayoutSelectorActivity() {
        q(new wp(this, 8));
        this.z0 = new va7(q75.a(sg3.class), new qg3(this, 1), new qg3(this, 0), new qg3(this, 2));
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
        jn1.a(this, new ml6(0, 0, 2, new d96(6)), 2);
        A(bundle);
        zs0.a(this, new et0(-618188382, true, new og3(this, 0)));
        tq5.w(hk2.y(this), null, null, new pg3(this, null, 1), 3);
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
