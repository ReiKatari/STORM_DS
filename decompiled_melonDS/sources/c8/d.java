package c8;

import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2627a = false;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f2628b;

    public d(ViewGroup viewGroup) {
        this.f2628b = viewGroup;
    }

    @Override // c8.u, c8.r
    public final void a(t tVar) {
        if (!this.f2627a) {
            k7.w.H(this.f2628b, false);
        }
        tVar.D(this);
    }

    @Override // c8.u, c8.r
    public final void b() {
        k7.w.H(this.f2628b, false);
    }

    @Override // c8.u, c8.r
    public final void c() {
        k7.w.H(this.f2628b, true);
    }

    @Override // c8.u, c8.r
    public final void e(t tVar) {
        k7.w.H(this.f2628b, false);
        this.f2627a = true;
    }
}
