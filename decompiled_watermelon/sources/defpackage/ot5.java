package defpackage;

import android.os.Bundle;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ot5  reason: default package */
/* loaded from: classes.dex */
public final class ot5 implements lt5, au5 {
    public final /* synthetic */ mt5 A;
    public in3 B;
    public yt5 L;

    public ot5(mt5 mt5Var) {
        Bundle bundle;
        this.A = mt5Var;
        Object e = mt5Var.e("androidx.savedstate.SavedStateRegistry");
        if (e instanceof Bundle) {
            bundle = (Bundle) e;
        } else {
            bundle = null;
        }
        if (bundle != null && this.L == null) {
            yt5 yt5Var = new yt5(new zt5(this, new bz2(25, this)));
            this.L = yt5Var;
            yt5Var.b(bundle);
        }
        mt5Var.a("androidx.savedstate.SavedStateRegistry", new bz2(23, this));
    }

    @Override // defpackage.lt5
    public final n85 a(String str, ki2 ki2Var) {
        return this.A.a(str, ki2Var);
    }

    @Override // defpackage.lt5
    public final boolean c(Object obj) {
        return this.A.c(obj);
    }

    @Override // defpackage.lt5
    public final Map d() {
        return this.A.d();
    }

    @Override // defpackage.lt5
    public final Object e(String str) {
        return this.A.e(str);
    }

    @Override // defpackage.fn3
    public final rm3 getLifecycle() {
        in3 in3Var = this.B;
        if (in3Var == null) {
            in3 in3Var2 = new in3(this, false);
            this.B = in3Var2;
            return in3Var2;
        }
        return in3Var;
    }

    @Override // defpackage.au5
    public final xt5 getSavedStateRegistry() {
        yt5 yt5Var = this.L;
        if (yt5Var == null) {
            yt5 yt5Var2 = new yt5(new zt5(this, new bz2(25, this)));
            this.L = yt5Var2;
            yt5Var2.b(null);
            yt5Var = yt5Var2;
        }
        return yt5Var.b;
    }
}
