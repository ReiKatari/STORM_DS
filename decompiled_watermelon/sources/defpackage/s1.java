package defpackage;

import androidx.preference.Preference;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s1  reason: default package */
/* loaded from: classes.dex */
public abstract class s1 {
    public t1[] A;
    public int B;
    public int L;
    public gi6 R;

    public final t1 e() {
        t1 t1Var;
        gi6 gi6Var;
        synchronized (this) {
            try {
                t1[] t1VarArr = this.A;
                if (t1VarArr == null) {
                    t1VarArr = g();
                    this.A = t1VarArr;
                } else if (this.B >= t1VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(t1VarArr, t1VarArr.length * 2);
                    this.A = (t1[]) copyOf;
                    t1VarArr = (t1[]) copyOf;
                }
                int i = this.L;
                do {
                    t1Var = t1VarArr[i];
                    if (t1Var == null) {
                        t1Var = f();
                        t1VarArr[i] = t1Var;
                    }
                    i++;
                    if (i >= t1VarArr.length) {
                        i = 0;
                    }
                } while (!t1Var.a(this));
                this.L = i;
                this.B++;
                gi6Var = this.R;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gi6Var != null) {
            gi6Var.x(1);
        }
        return t1Var;
    }

    public abstract t1 f();

    public abstract t1[] g();

    public final void h(t1 t1Var) {
        gi6 gi6Var;
        int i;
        j11[] b;
        synchronized (this) {
            try {
                int i2 = this.B - 1;
                this.B = i2;
                gi6Var = this.R;
                if (i2 == 0) {
                    this.L = 0;
                }
                t1Var.getClass();
                b = t1Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (j11 j11Var : b) {
            if (j11Var != null) {
                j11Var.k(o27.a);
            }
        }
        if (gi6Var != null) {
            gi6Var.x(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [c46, gi6] */
    public final gi6 i() {
        gi6 gi6Var;
        synchronized (this) {
            gi6 gi6Var2 = this.R;
            gi6Var = gi6Var2;
            if (gi6Var2 == null) {
                int i = this.B;
                ?? c46Var = new c46(1, Preference.DEFAULT_ORDER, h60.DROP_OLDEST);
                c46Var.p(Integer.valueOf(i));
                this.R = c46Var;
                gi6Var = c46Var;
            }
        }
        return gi6Var;
    }
}
