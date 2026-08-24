package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t1  reason: default package */
/* loaded from: classes.dex */
public abstract class t1 {
    public u1[] A;
    public int B;
    public int L;
    public yt6 R;

    public final u1 d() {
        u1 u1Var;
        yt6 yt6Var;
        synchronized (this) {
            try {
                u1[] u1VarArr = this.A;
                if (u1VarArr == null) {
                    u1VarArr = f();
                    this.A = u1VarArr;
                } else if (this.B >= u1VarArr.length) {
                    Object[] copyOf = Arrays.copyOf(u1VarArr, u1VarArr.length * 2);
                    this.A = (u1[]) copyOf;
                    u1VarArr = (u1[]) copyOf;
                }
                int i = this.L;
                do {
                    u1Var = u1VarArr[i];
                    if (u1Var == null) {
                        u1Var = e();
                        u1VarArr[i] = u1Var;
                    }
                    i++;
                    if (i >= u1VarArr.length) {
                        i = 0;
                    }
                } while (!u1Var.a(this));
                this.L = i;
                this.B++;
                yt6Var = this.R;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yt6Var != null) {
            yt6Var.x(1);
        }
        return u1Var;
    }

    public abstract u1 e();

    public abstract u1[] f();

    public final void g(u1 u1Var) {
        yt6 yt6Var;
        int i;
        r41[] b;
        synchronized (this) {
            try {
                int i2 = this.B - 1;
                this.B = i2;
                yt6Var = this.R;
                if (i2 == 0) {
                    this.L = 0;
                }
                u1Var.getClass();
                b = u1Var.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (r41 r41Var : b) {
            if (r41Var != null) {
                r41Var.i(jg7.a);
            }
        }
        if (yt6Var != null) {
            yt6Var.x(-1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [yt6, of6] */
    public final yt6 i() {
        yt6 yt6Var;
        synchronized (this) {
            yt6 yt6Var2 = this.R;
            yt6Var = yt6Var2;
            if (yt6Var2 == null) {
                int i = this.B;
                ?? of6Var = new of6(1, Integer.MAX_VALUE, m80.DROP_OLDEST);
                of6Var.k(Integer.valueOf(i));
                this.R = of6Var;
                yt6Var = of6Var;
            }
        }
        return yt6Var;
    }
}
