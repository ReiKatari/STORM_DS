package q7;

import a0.j;
import android.os.Bundle;
import androidx.lifecycle.q;
import java.util.Arrays;
import java.util.Map;
import m9.o;
import p7.m;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final s7.a f12312a;

    /* renamed from: b  reason: collision with root package name */
    public final d f12313b;

    public e(s7.a aVar) {
        this.f12312a = aVar;
        this.f12313b = new d(aVar);
    }

    public final void a() {
        this.f12312a.a();
    }

    public final void b(Bundle bundle) {
        s7.a aVar = this.f12312a;
        f fVar = aVar.f12835a;
        if (!aVar.f12839e) {
            aVar.a();
        }
        if (!fVar.getLifecycle().b().isAtLeast(q.STARTED)) {
            if (!aVar.f12841g) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    if (bundle3 != null) {
                        bundle2 = bundle3;
                    } else {
                        m.z("androidx.lifecycle.BundlableSavedStateRegistry.key");
                        throw null;
                    }
                }
                aVar.f12840f = bundle2;
                aVar.f12841g = true;
                return;
            }
            j.p("SavedStateRegistry was already restored.");
            return;
        }
        o.u(fVar.getLifecycle().b(), "performRestore cannot be called when owner is ");
    }

    public final void c(Bundle bundle) {
        s7.a aVar = this.f12312a;
        Bundle b10 = k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
        Bundle bundle2 = aVar.f12840f;
        if (bundle2 != null) {
            b10.putAll(bundle2);
        }
        synchronized (aVar.f12837c) {
            for (Map.Entry entry : aVar.f12838d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a10 = ((c) entry.getValue()).a();
                str.getClass();
                b10.putBundle(str, a10);
            }
        }
        if (!b10.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", b10);
        }
    }
}
