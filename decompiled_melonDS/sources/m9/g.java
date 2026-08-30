package m9;

import androidx.lifecycle.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends androidx.lifecycle.r {

    /* renamed from: b  reason: collision with root package name */
    public static final g f9384b = new androidx.lifecycle.r();

    /* renamed from: c  reason: collision with root package name */
    public static final f f9385c = new Object();

    @Override // androidx.lifecycle.r
    public final void a(w wVar) {
        if (wVar instanceof androidx.lifecycle.f) {
            androidx.lifecycle.f fVar = (androidx.lifecycle.f) wVar;
            f fVar2 = f9385c;
            fVar2.getClass();
            fVar.onStart(fVar2);
            fVar.onResume(fVar2);
            return;
        }
        fj.j.d(wVar, " must implement androidx.lifecycle.DefaultLifecycleObserver.");
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.q b() {
        return androidx.lifecycle.q.RESUMED;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.r
    public final void c(w wVar) {
    }
}
