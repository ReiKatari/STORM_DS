package zd;

import a0.j;
import a1.q;
import a1.r;
import a1.w0;
import a6.u;
import ij.i;
import j7.j1;
import j7.s1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15044a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15045b;

    public b() {
        this.f15044a = new w0(0);
        this.f15045b = new q((Object) null);
    }

    public void a(j1 j1Var, u uVar) {
        w0 w0Var = (w0) this.f15044a;
        s1 s1Var = (s1) w0Var.get(j1Var);
        if (s1Var == null) {
            s1Var = s1.a();
            w0Var.put(j1Var, s1Var);
        }
        s1Var.f7673c = uVar;
        s1Var.f7671a |= 8;
    }

    public u b(j1 j1Var, int i2) {
        s1 s1Var;
        u uVar;
        w0 w0Var = (w0) this.f15044a;
        int d4 = w0Var.d(j1Var);
        if (d4 >= 0 && (s1Var = (s1) w0Var.i(d4)) != null) {
            int i10 = s1Var.f7671a;
            if ((i10 & i2) != 0) {
                int i11 = i10 & (~i2);
                s1Var.f7671a = i11;
                if (i2 == 4) {
                    uVar = s1Var.f7672b;
                } else if (i2 == 8) {
                    uVar = s1Var.f7673c;
                } else {
                    j.h("Must provide flag PRE or POST");
                    return null;
                }
                if ((i11 & 12) == 0) {
                    w0Var.g(d4);
                    s1Var.f7671a = 0;
                    s1Var.f7672b = null;
                    s1Var.f7673c = null;
                    s1.f7670d.c(s1Var);
                }
                return uVar;
            }
        }
        return null;
    }

    public void c(j1 j1Var) {
        s1 s1Var = (s1) ((w0) this.f15044a).get(j1Var);
        if (s1Var == null) {
            return;
        }
        s1Var.f7671a &= -2;
    }

    public void d(j1 j1Var) {
        q qVar = (q) this.f15045b;
        int j2 = qVar.j() - 1;
        while (true) {
            if (j2 < 0) {
                break;
            } else if (j1Var == qVar.k(j2)) {
                Object[] objArr = qVar.L;
                Object obj = objArr[j2];
                Object obj2 = r.f89a;
                if (obj != obj2) {
                    objArr[j2] = obj2;
                    qVar.A = true;
                }
            } else {
                j2--;
            }
        }
        s1 s1Var = (s1) ((w0) this.f15044a).remove(j1Var);
        if (s1Var != null) {
            s1Var.f7671a = 0;
            s1Var.f7672b = null;
            s1Var.f7673c = null;
            s1.f7670d.c(s1Var);
        }
    }

    public b(i iVar, cc.i iVar2) {
        this.f15044a = iVar;
        this.f15045b = iVar2;
    }
}
