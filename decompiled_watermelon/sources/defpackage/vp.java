package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vp  reason: default package */
/* loaded from: classes.dex */
public final class vp implements wt5 {
    public final /* synthetic */ int a;
    public final Object b;

    public vp(xt5 xt5Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        xt5Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.wt5
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((xp) obj).v().getClass();
                return bundle;
            default:
                Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                nk2.T(k, "classes_to_restore", tq0.n1((LinkedHashSet) obj));
                return k;
        }
    }

    public vp(xp xpVar) {
        this.a = 0;
        this.b = xpVar;
    }
}
