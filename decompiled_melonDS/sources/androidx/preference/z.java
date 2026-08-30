package androidx.preference;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends j7.m0 {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f1601a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f1602b;

    /* renamed from: c  reason: collision with root package name */
    public final Preference f1603c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1604d;

    public z(d0 d0Var, RecyclerView recyclerView, Preference preference, String str) {
        this.f1601a = d0Var;
        this.f1602b = recyclerView;
        this.f1603c = preference;
        this.f1604d = str;
    }

    @Override // j7.m0
    public final void a() {
        f();
    }

    @Override // j7.m0
    public final void b(int i2, int i10, Object obj) {
        f();
    }

    @Override // j7.m0
    public final void c(int i2, int i10) {
        f();
    }

    @Override // j7.m0
    public final void d(int i2, int i10) {
        f();
    }

    @Override // j7.m0
    public final void e(int i2, int i10) {
        f();
    }

    public final void f() {
        int m;
        d0 d0Var = this.f1601a;
        d0Var.f7619a.unregisterObserver(this);
        Preference preference = this.f1603c;
        if (preference != null) {
            m = d0Var.l(preference);
        } else {
            m = d0Var.m(this.f1604d);
        }
        if (m != -1) {
            this.f1602b.h0(m);
        }
    }
}
