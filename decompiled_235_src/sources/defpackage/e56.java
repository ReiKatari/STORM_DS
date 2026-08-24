package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e56  reason: default package */
/* loaded from: classes.dex */
public final class e56 {
    public final f56 a;
    public final d56 b;

    public e56(f56 f56Var) {
        this.a = f56Var;
        this.b = new d56(f56Var);
    }

    public final void a() {
        this.a.a();
    }

    public final void b(Bundle bundle) {
        f56 f56Var = this.a;
        g56 g56Var = f56Var.a;
        if (!f56Var.e) {
            f56Var.a();
        }
        if (!g56Var.getLifecycle().b().isAtLeast(tt3.STARTED)) {
            if (!f56Var.g) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    if (bundle3 != null) {
                        bundle2 = bundle3;
                    } else {
                        xk2.B("androidx.lifecycle.BundlableSavedStateRegistry.key");
                        throw null;
                    }
                }
                f56Var.f = bundle2;
                f56Var.g = true;
                return;
            }
            i.m("SavedStateRegistry was already restored.");
            return;
        }
        u34.i(g56Var.getLifecycle().b(), "performRestore cannot be called when owner is ");
    }

    public final void c(Bundle bundle) {
        f56 f56Var = this.a;
        Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
        Bundle bundle2 = f56Var.f;
        if (bundle2 != null) {
            l.putAll(bundle2);
        }
        synchronized (f56Var.c) {
            for (Map.Entry entry : f56Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((c56) entry.getValue()).a();
                str.getClass();
                l.putBundle(str, a);
            }
        }
        if (!l.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", l);
        }
    }
}
