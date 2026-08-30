package s9;

import aj.g;
import android.os.Build;
import android.view.View;
import android.view.Window;
import i3.s;
import i3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Window f12849a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.b f12850b;

    public a(View view, Window window) {
        a0.b bVar;
        view.getClass();
        this.f12849a = window;
        if (window != null) {
            bVar = new a0.b(view, window);
        } else {
            bVar = null;
        }
        this.f12850b = bVar;
    }

    public static void b(a aVar, long j2) {
        boolean z10;
        if (z.r(j2) > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        b bVar = c.f12852b;
        aVar.getClass();
        a0.b bVar2 = aVar.f12850b;
        bVar.getClass();
        if (bVar2 != null) {
            bVar2.X(z10);
        }
        Window window = aVar.f12849a;
        if (window == null) {
            return;
        }
        if (z10 && (bVar2 == null || !((g) bVar2.B).K())) {
            j2 = ((s) bVar.k(new s(j2))).f6689a;
        }
        window.setStatusBarColor(z.y(j2));
    }

    public final void a(boolean z10) {
        Window window;
        if (Build.VERSION.SDK_INT >= 29 && (window = this.f12849a) != null) {
            window.setNavigationBarContrastEnforced(z10);
        }
    }

    public final void c(boolean z10) {
        a0.b bVar = this.f12850b;
        if (z10) {
            if (bVar != null) {
                ((g) bVar.B).q0(1);
            }
        } else if (bVar != null) {
            ((g) bVar.B).H(1);
        }
    }
}
