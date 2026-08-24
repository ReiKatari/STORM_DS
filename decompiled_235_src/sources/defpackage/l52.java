package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l52  reason: default package */
/* loaded from: classes.dex */
public final class l52 extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ n52 L;
    public final /* synthetic */ long R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l52(n52 n52Var, long j, int i) {
        super(1);
        this.B = i;
        this.L = n52Var;
        this.R = j;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i;
        long j;
        long j2;
        int i2 = this.B;
        long j3 = 0;
        long j4 = this.R;
        n52 n52Var = this.L;
        switch (i2) {
            case 0:
                int i3 = j52.a[((z42) obj).ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            sl0 sl0Var = n52Var.q0.a.c;
                            if (sl0Var != null) {
                                j4 = ((q93) sl0Var.b.g(new q93(j4))).a;
                            }
                        } else {
                            i.d();
                            return null;
                        }
                    } else {
                        sl0 sl0Var2 = n52Var.p0.a.c;
                        if (sl0Var2 != null) {
                            j4 = ((q93) sl0Var2.b.g(new q93(j4))).a;
                        }
                    }
                }
                return new q93(j4);
            case 1:
                z42 z42Var = (z42) obj;
                if (n52Var.u0 != null && n52Var.T0() != null && !nb3.k(n52Var.u0, n52Var.T0()) && (i = j52.a[z42Var.ordinal()]) != 1 && i != 2) {
                    if (i == 3) {
                        sl0 sl0Var3 = n52Var.q0.a.c;
                        if (sl0Var3 != null) {
                            qn2 qn2Var = sl0Var3.b;
                            long j5 = this.R;
                            long j6 = ((q93) qn2Var.g(new q93(j5))).a;
                            ic T0 = n52Var.T0();
                            T0.getClass();
                            kk3 kk3Var = kk3.Ltr;
                            long a = ((e40) T0).a(j5, j6, kk3Var);
                            ic icVar = n52Var.u0;
                            icVar.getClass();
                            j3 = i93.b(a, icVar.a(j5, j6, kk3Var));
                        }
                    } else {
                        i.d();
                        return null;
                    }
                }
                return new i93(j3);
            default:
                z42 z42Var2 = (z42) obj;
                pj6 pj6Var = n52Var.p0.a.b;
                if (pj6Var != null) {
                    j = ((i93) pj6Var.a.g(new q93(j4))).a;
                } else {
                    j = 0;
                }
                pj6 pj6Var2 = n52Var.q0.a.b;
                if (pj6Var2 != null) {
                    j2 = ((i93) pj6Var2.a.g(new q93(j4))).a;
                } else {
                    j2 = 0;
                }
                int i4 = j52.a[z42Var2.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            j3 = j2;
                        } else {
                            i.d();
                            return null;
                        }
                    } else {
                        j3 = j;
                    }
                }
                return new i93(j3);
        }
    }
}
