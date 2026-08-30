package dd;

import androidx.preference.Preference;
import cd.e1;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {
    public d[] A;
    public int B;
    public int L;
    public a0 R;

    public final d d() {
        d dVar;
        a0 a0Var;
        synchronized (this) {
            try {
                d[] dVarArr = this.A;
                if (dVarArr == null) {
                    dVarArr = f();
                    this.A = dVarArr;
                } else if (this.B >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    this.A = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i2 = this.L;
                do {
                    dVar = dVarArr[i2];
                    if (dVar == null) {
                        dVar = e();
                        dVarArr[i2] = dVar;
                    }
                    i2++;
                    if (i2 >= dVarArr.length) {
                        i2 = 0;
                    }
                } while (!dVar.a(this));
                this.L = i2;
                this.B++;
                a0Var = this.R;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (a0Var != null) {
            a0Var.x(1);
        }
        return dVar;
    }

    public abstract d e();

    public abstract d[] f();

    public final void g(d dVar) {
        a0 a0Var;
        int i2;
        cc.c[] b10;
        synchronized (this) {
            try {
                int i10 = this.B - 1;
                this.B = i10;
                a0Var = this.R;
                if (i10 == 0) {
                    this.L = 0;
                }
                dVar.getClass();
                b10 = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (cc.c cVar : b10) {
            if (cVar != null) {
                cVar.h(yb.y.f14813a);
            }
        }
        if (a0Var != null) {
            a0Var.x(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [dd.a0, cd.e1] */
    public final a0 h() {
        a0 a0Var;
        synchronized (this) {
            a0 a0Var2 = this.R;
            a0Var = a0Var2;
            if (a0Var2 == null) {
                int i2 = this.B;
                ?? e1Var = new e1(1, Preference.DEFAULT_ORDER, bd.a.DROP_OLDEST);
                e1Var.p(Integer.valueOf(i2));
                this.R = e1Var;
                a0Var = e1Var;
            }
        }
        return a0Var;
    }
}
