package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w02  reason: default package */
/* loaded from: classes.dex */
public final class w02 extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ y02 L;
    public final /* synthetic */ long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w02(y02 y02Var, long j, int i) {
        super(1);
        this.B = i;
        this.L = y02Var;
        this.R = j;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i;
        long j;
        long j2;
        int i2 = this.B;
        long j3 = 0;
        long j4 = this.R;
        y02 y02Var = this.L;
        switch (i2) {
            case 0:
                int i3 = u02.a[((k02) obj).ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            jj0 jj0Var = y02Var.p0.a.c;
                            if (jj0Var != null) {
                                j4 = ((i33) jj0Var.b.n(new i33(j4))).a;
                            }
                        } else {
                            i.c();
                            return null;
                        }
                    } else {
                        jj0 jj0Var2 = y02Var.o0.a.c;
                        if (jj0Var2 != null) {
                            j4 = ((i33) jj0Var2.b.n(new i33(j4))).a;
                        }
                    }
                }
                return new i33(j4);
            case 1:
                k02 k02Var = (k02) obj;
                if (y02Var.t0 != null && y02Var.T0() != null && !b53.x(y02Var.t0, y02Var.T0()) && (i = u02.a[k02Var.ordinal()]) != 1 && i != 2) {
                    if (i == 3) {
                        jj0 jj0Var3 = y02Var.p0.a.c;
                        if (jj0Var3 != null) {
                            mi2 mi2Var = jj0Var3.b;
                            long j5 = this.R;
                            long j6 = ((i33) mi2Var.n(new i33(j5))).a;
                            ub T0 = y02Var.T0();
                            T0.getClass();
                            sd3 sd3Var = sd3.Ltr;
                            long a = ((j20) T0).a(j5, j6, sd3Var);
                            ub ubVar = y02Var.t0;
                            ubVar.getClass();
                            j3 = a33.b(a, ubVar.a(j5, j6, sd3Var));
                        }
                    } else {
                        i.c();
                        return null;
                    }
                }
                return new a33(j3);
            default:
                k02 k02Var2 = (k02) obj;
                a86 a86Var = y02Var.o0.a.b;
                if (a86Var != null) {
                    j = ((a33) a86Var.a.n(new i33(j4))).a;
                } else {
                    j = 0;
                }
                a86 a86Var2 = y02Var.p0.a.b;
                if (a86Var2 != null) {
                    j2 = ((a33) a86Var2.a.n(new i33(j4))).a;
                } else {
                    j2 = 0;
                }
                int i4 = u02.a[k02Var2.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            j3 = j2;
                        } else {
                            i.c();
                            return null;
                        }
                    } else {
                        j3 = j;
                    }
                }
                return new a33(j3);
        }
    }
}
