package me.magnum.melonds.ui.layouts;

import android.os.Bundle;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class LayoutListActivity extends xp implements el2 {
    public static final /* synthetic */ int A0 = 0;
    public volatile q8 w0;
    public final Object x0 = new Object();
    public boolean y0 = false;
    public final va7 z0;

    public LayoutListActivity() {
        q(new wp(this, 7));
        this.z0 = new va7(q75.a(eh3.class), new if3(this, 1), new if3(this, 0), new if3(this, 2));
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
        zs0.a(this, new et0(-1270758206, true, new hf3(this, 0)));
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
