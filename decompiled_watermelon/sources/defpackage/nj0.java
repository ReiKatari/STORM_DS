package defpackage;

import androidx.preference.Preference;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nj0  reason: default package */
/* loaded from: classes.dex */
public abstract class nj0 implements nj2 {
    public final e31 A;
    public final int B;
    public final h60 L;

    public nj0(e31 e31Var, int i, h60 h60Var) {
        this.A = e31Var;
        this.B = i;
        this.L = h60Var;
    }

    @Override // defpackage.u92
    public Object a(w92 w92Var, j11 j11Var) {
        Object k = iq2.k(new a0(w92Var, this, null, 13), j11Var);
        if (k == p31.COROUTINE_SUSPENDED) {
            return k;
        }
        return o27.a;
    }

    @Override // defpackage.nj2
    public final u92 c(e31 e31Var, int i, h60 h60Var) {
        e31 e31Var2 = this.A;
        e31 C = e31Var.C(e31Var2);
        h60 h60Var2 = h60.SUSPEND;
        h60 h60Var3 = this.L;
        int i2 = this.B;
        if (h60Var == h60Var2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Preference.DEFAULT_ORDER;
                            }
                        }
                    }
                }
                i = i2;
            }
            h60Var = h60Var3;
        }
        if (b53.x(C, e31Var2) && i == i2 && h60Var == h60Var3) {
            return this;
        }
        return g(C, i, h60Var);
    }

    public String e() {
        return null;
    }

    public abstract Object f(nu4 nu4Var, j11 j11Var);

    public abstract nj0 g(e31 e31Var, int i, h60 h60Var);

    public u92 h() {
        return null;
    }

    public lj0 i(o31 o31Var) {
        int i = this.B;
        if (i == -3) {
            i = -2;
        }
        s31 s31Var = s31.ATOMIC;
        y yVar = new y(this, (j11) null, 13);
        nu4 nu4Var = new nu4(pu.y(o31Var, this.A), n40.f(i, this.L, null, 4));
        s31Var.invoke(yVar, nu4Var, nu4Var);
        return nu4Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String e = e();
        if (e != null) {
            arrayList.add(e);
        }
        mp1 mp1Var = mp1.A;
        e31 e31Var = this.A;
        if (e31Var != mp1Var) {
            arrayList.add("context=" + e31Var);
        }
        int i = this.B;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        h60 h60Var = h60.SUSPEND;
        h60 h60Var2 = this.L;
        if (h60Var2 != h60Var) {
            arrayList.add("onBufferOverflow=" + h60Var2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return wh1.o(sb, tq0.S0(arrayList, ", ", null, null, null, 62), ']');
    }
}
