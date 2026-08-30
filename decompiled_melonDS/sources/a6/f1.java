package a6;

import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f454a;

    public f1(View view) {
        this.f454a = new WeakReference(view);
    }

    public final void a(float f8) {
        View view = (View) this.f454a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
    }

    public final void b() {
        View view = (View) this.f454a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f454a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(g1 g1Var) {
        View view = (View) this.f454a.get();
        if (view != null) {
            if (g1Var != null) {
                view.animate().setListener(new e1(g1Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f8) {
        View view = (View) this.f454a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
    }
}
