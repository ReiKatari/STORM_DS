package me.magnum.melonds.ui.layouts;

import a7.a;
import a7.v;
import ah.i1;
import android.os.Bundle;
import androidx.lifecycle.a1;
import d.c0;
import d.n;
import e.f;
import kb.b;
import l.i;
import mb.c;
import nc.u;
import xh.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class LayoutListActivity extends i implements c {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f9556y0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public volatile b f9557u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Object f9558v0 = new Object();

    /* renamed from: w0  reason: collision with root package name */
    public boolean f9559w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public final v f9560x0;

    public LayoutListActivity() {
        q(new i1(this, 9));
        this.f9560x0 = new v(u.a(d.class), new uh.b(this, 1), new uh.b(this, 0), new uh.b(this, 2));
    }

    public final void A(Bundle bundle) {
        super.onCreate(bundle);
        z().c();
    }

    @Override // mb.b
    public final Object d() {
        return z().d();
    }

    @Override // d.k, androidx.lifecycle.k
    public final a1 getDefaultViewModelProviderFactory() {
        return k0.d.w(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n.a(this, new c0(0, 0, new a(14)));
        A(bundle);
        f.a(this, new v2.c(-1270758206, true, new uh.a(this, 0)));
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().a();
    }

    public final b z() {
        if (this.f9557u0 == null) {
            synchronized (this.f9558v0) {
                try {
                    if (this.f9557u0 == null) {
                        this.f9557u0 = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9557u0;
    }
}
