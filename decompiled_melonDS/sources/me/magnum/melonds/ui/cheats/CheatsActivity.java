package me.magnum.melonds.ui.cheats;

import a5.z;
import a7.a;
import a7.v;
import ah.i1;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.a1;
import androidx.lifecycle.s0;
import d.c0;
import d.n;
import e.f;
import eg.h;
import jg.k;
import jg.l;
import k0.d;
import kb.b;
import l.i;
import mb.c;
import nc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class CheatsActivity extends i implements c {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f9493y0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public volatile b f9494u0;

    /* renamed from: v0  reason: collision with root package name */
    public final Object f9495v0 = new Object();

    /* renamed from: w0  reason: collision with root package name */
    public boolean f9496w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public final v f9497x0;

    public CheatsActivity() {
        q(new i1(this, 5));
        this.f9497x0 = new v(u.a(jg.u.class), new jg.c(this, 1), new jg.c(this, 0), new jg.c(this, 2));
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
        Object parcelableExtra;
        d kVar;
        n.a(this, new c0(0, 0, new a(14)));
        A(bundle);
        Intent intent = getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            parcelableExtra = z.c(intent);
        } else {
            parcelableExtra = intent.getParcelableExtra("key_rom_info");
            if (!h.class.isInstance(parcelableExtra)) {
                parcelableExtra = null;
            }
        }
        if (((h) ((Parcelable) parcelableExtra)) == null) {
            kVar = l.INSTANCE;
        } else {
            kVar = new k(null);
        }
        f.a(this, new v2.c(-936098303, true, new jg.a(this, kVar, 0)));
        x.v(s0.f(this), null, null, new jg.b(this, null, 1), 3);
    }

    @Override // l.i, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        z().a();
    }

    public final b z() {
        if (this.f9494u0 == null) {
            synchronized (this.f9495v0) {
                try {
                    if (this.f9494u0 == null) {
                        this.f9494u0 = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9494u0;
    }
}
