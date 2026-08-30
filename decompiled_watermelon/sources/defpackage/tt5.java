package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tt5  reason: default package */
/* loaded from: classes.dex */
public final class tt5 implements wt5 {
    public final xt5 a;
    public boolean b;
    public Bundle c;
    public final il6 d;

    public tt5(xt5 xt5Var, ab7 ab7Var) {
        xt5Var.getClass();
        this.a = xt5Var;
        this.d = new il6(new bz2(24, ab7Var));
    }

    @Override // defpackage.wt5
    public final Bundle a() {
        Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            k.putAll(bundle);
        }
        for (Map.Entry entry : ((ut5) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((ss0) ((pt5) entry.getValue()).b.e).a();
            if (!a.isEmpty()) {
                str.getClass();
                k.putBundle(str, a);
            }
        }
        this.b = false;
        return k;
    }

    public final void b() {
        if (!this.b) {
            Bundle a = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
            Bundle bundle = this.c;
            if (bundle != null) {
                k.putAll(bundle);
            }
            if (a != null) {
                k.putAll(a);
            }
            this.c = k;
            this.b = true;
            ut5 ut5Var = (ut5) this.d.getValue();
        }
    }
}
