package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ga1  reason: default package */
/* loaded from: classes.dex */
public final class ga1 implements mv3 {
    public final /* synthetic */ int A;
    public final mv3 B;
    public final Enum L;
    public final Enum R;

    public /* synthetic */ ga1(mv3 mv3Var, Enum r2, Enum r3, int i) {
        this.A = i;
        this.B = mv3Var;
        this.L = r2;
        this.R = r3;
    }

    @Override // defpackage.mv3
    public final int T(int i) {
        switch (this.A) {
            case 0:
                return this.B.T(i);
            case 1:
                return this.B.T(i);
            default:
                return this.B.T(i);
        }
    }

    @Override // defpackage.mv3
    public final yn4 c(long j) {
        int g0;
        int T;
        int g02;
        int T2;
        int g03;
        int T3;
        switch (this.A) {
            case 0:
                x43 x43Var = (x43) this.R;
                x43 x43Var2 = x43.Width;
                t43 t43Var = (t43) this.L;
                int i = 32767;
                mv3 mv3Var = this.B;
                if (x43Var == x43Var2) {
                    if (t43Var == t43.Max) {
                        T = mv3Var.e0(lz0.g(j));
                    } else {
                        T = mv3Var.T(lz0.g(j));
                    }
                    if (lz0.c(j)) {
                        i = lz0.g(j);
                    }
                    return new s82(T, i, 0);
                }
                if (t43Var == t43.Max) {
                    g0 = mv3Var.f(lz0.h(j));
                } else {
                    g0 = mv3Var.g0(lz0.h(j));
                }
                if (lz0.d(j)) {
                    i = lz0.h(j);
                }
                return new s82(i, g0, 0);
            case 1:
                aw3 aw3Var = (aw3) this.R;
                aw3 aw3Var2 = aw3.Width;
                zv3 zv3Var = (zv3) this.L;
                int i2 = 32767;
                mv3 mv3Var2 = this.B;
                if (aw3Var == aw3Var2) {
                    if (zv3Var == zv3.Max) {
                        T2 = mv3Var2.e0(lz0.g(j));
                    } else {
                        T2 = mv3Var2.T(lz0.g(j));
                    }
                    if (lz0.c(j)) {
                        i2 = lz0.g(j);
                    }
                    return new s82(T2, i2, 1);
                }
                if (zv3Var == zv3.Max) {
                    g02 = mv3Var2.f(lz0.h(j));
                } else {
                    g02 = mv3Var2.g0(lz0.h(j));
                }
                if (lz0.d(j)) {
                    i2 = lz0.h(j);
                }
                return new s82(i2, g02, 1);
            default:
                q74 q74Var = (q74) this.R;
                q74 q74Var2 = q74.Width;
                p74 p74Var = (p74) this.L;
                int i3 = 32767;
                mv3 mv3Var3 = this.B;
                if (q74Var == q74Var2) {
                    if (p74Var == p74.Max) {
                        T3 = mv3Var3.e0(lz0.g(j));
                    } else {
                        T3 = mv3Var3.T(lz0.g(j));
                    }
                    if (lz0.c(j)) {
                        i3 = lz0.g(j);
                    }
                    return new s82(T3, i3, 2);
                }
                if (p74Var == p74.Max) {
                    g03 = mv3Var3.f(lz0.h(j));
                } else {
                    g03 = mv3Var3.g0(lz0.h(j));
                }
                if (lz0.d(j)) {
                    i3 = lz0.h(j);
                }
                return new s82(i3, g03, 2);
        }
    }

    @Override // defpackage.mv3
    public final int e0(int i) {
        switch (this.A) {
            case 0:
                return this.B.e0(i);
            case 1:
                return this.B.e0(i);
            default:
                return this.B.e0(i);
        }
    }

    @Override // defpackage.mv3
    public final int f(int i) {
        switch (this.A) {
            case 0:
                return this.B.f(i);
            case 1:
                return this.B.f(i);
            default:
                return this.B.f(i);
        }
    }

    @Override // defpackage.mv3
    public final int g0(int i) {
        switch (this.A) {
            case 0:
                return this.B.g0(i);
            case 1:
                return this.B.g0(i);
            default:
                return this.B.g0(i);
        }
    }

    @Override // defpackage.mv3
    public final Object l() {
        switch (this.A) {
            case 0:
                return this.B.l();
            case 1:
                return this.B.l();
            default:
                return this.B.l();
        }
    }
}
