package defpackage;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: so6  reason: default package */
/* loaded from: classes.dex */
public final class so6 {
    public final to a;
    public final ds6 b;
    public final boolean e;
    public final od1 g;
    public final od2 h;
    public r9 j;
    public sd3 k;
    public final int c = Preference.DEFAULT_ORDER;
    public final int d = 1;
    public final int f = 1;
    public final List i = pp1.A;

    public so6(to toVar, ds6 ds6Var, boolean z, od1 od1Var, od2 od2Var, int i) {
        this.a = toVar;
        this.b = ds6Var;
        this.e = z;
        this.g = od1Var;
        this.h = od2Var;
    }

    public final void a(sd3 sd3Var) {
        r9 r9Var = this.j;
        if (r9Var == null || sd3Var != this.k || r9Var.b()) {
            this.k = sd3Var;
            r9Var = new r9(this.a, cg2.T(this.b, sd3Var), this.i, this.g, this.h);
        }
        this.j = r9Var;
    }
}
