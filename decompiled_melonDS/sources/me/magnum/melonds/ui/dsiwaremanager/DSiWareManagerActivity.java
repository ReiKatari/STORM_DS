package me.magnum.melonds.ui.dsiwaremanager;

import a7.a;
import a7.v;
import ah.i1;
import android.os.Bundle;
import androidx.lifecycle.a1;
import d.c0;
import d.n;
import e.f;
import k0.d;
import kb.b;
import l.i;
import mb.c;
import nc.u;
import xg.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class DSiWareManagerActivity extends i implements c {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f9498y0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public volatile b f9499u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Object f9500v0 = new Object();

    /* renamed from: w0  reason: collision with root package name */
    public boolean f9501w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public final v f9502x0;

    public DSiWareManagerActivity() {
        q(new i1(this, 11));
        this.f9502x0 = new v(u.a(h.class), new xg.b(this, 1), new xg.b(this, 0), new xg.b(this, 2));
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
        return d.w(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n.a(this, new c0(0, 0, new a(14)));
        A(bundle);
        f.a(this, new v2.c(750990527, true, new xg.a(this, 0)));
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().a();
    }

    public final b z() {
        if (this.f9499u0 == null) {
            synchronized (this.f9500v0) {
                try {
                    if (this.f9499u0 == null) {
                        this.f9499u0 = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9499u0;
    }
}
