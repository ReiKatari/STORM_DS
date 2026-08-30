package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yt5  reason: default package */
/* loaded from: classes.dex */
public final class yt5 {
    public final zt5 a;
    public final xt5 b;

    public yt5(zt5 zt5Var) {
        this.a = zt5Var;
        this.b = new xt5(zt5Var);
    }

    public final void a() {
        this.a.a();
    }

    public final void b(Bundle bundle) {
        zt5 zt5Var = this.a;
        au5 au5Var = zt5Var.a;
        if (!zt5Var.e) {
            zt5Var.a();
        }
        if (!au5Var.getLifecycle().b().isAtLeast(qm3.STARTED)) {
            if (!zt5Var.g) {
                Bundle bundle2 = null;
                if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    if (bundle3 != null) {
                        bundle2 = bundle3;
                    } else {
                        jk2.H("androidx.lifecycle.BundlableSavedStateRegistry.key");
                        throw null;
                    }
                }
                zt5Var.f = bundle2;
                zt5Var.g = true;
                return;
            }
            i.n("SavedStateRegistry was already restored.");
            return;
        }
        c44.h(au5Var.getLifecycle().b(), "performRestore cannot be called when owner is ");
    }

    public final void c(Bundle bundle) {
        zt5 zt5Var = this.a;
        Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
        Bundle bundle2 = zt5Var.f;
        if (bundle2 != null) {
            k.putAll(bundle2);
        }
        synchronized (zt5Var.c) {
            for (Map.Entry entry : zt5Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle a = ((wt5) entry.getValue()).a();
                str.getClass();
                k.putBundle(str, a);
            }
        }
        if (!k.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", k);
        }
    }
}
