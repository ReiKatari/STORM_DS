package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u51  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class u51 implements eo2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int L;
    public final /* synthetic */ qn2 R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    public /* synthetic */ u51(p27 p27Var, jt3 jt3Var, boolean z, qn2 qn2Var, c37 c37Var, mk4 mk4Var, qh1 qh1Var, int i) {
        this.X = p27Var;
        this.Y = jt3Var;
        this.B = z;
        this.R = qn2Var;
        this.Z = c37Var;
        this.d0 = mk4Var;
        this.e0 = qh1Var;
        this.L = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d6, code lost:
        if (r0 != false) goto L21;
     */
    @Override // defpackage.eo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.e0;
        Object obj4 = this.d0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        Object obj7 = this.X;
        switch (i) {
            case 0:
                p27 p27Var = (p27) obj7;
                jt3 jt3Var = (jt3) obj6;
                c37 c37Var = (c37) obj5;
                mk4 mk4Var = (mk4) obj4;
                qh1 qh1Var = (qh1) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z2 = true;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    x51 x51Var = new x51(jt3Var, this.R, c37Var, mk4Var, qh1Var, this.L);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, x64.a);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, x51Var);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    xq2Var.p(true);
                    hv2 a = jt3Var.a();
                    hv2 hv2Var = hv2.None;
                    boolean z3 = this.B;
                    if (a != hv2Var && jt3Var.c() != null) {
                        jk3 c = jt3Var.c();
                        c.getClass();
                        if (c.t()) {
                        }
                    }
                    z2 = false;
                    hf.s(p27Var, z2, xq2Var, 0);
                    if (jt3Var.a() == hv2.Cursor && z3) {
                        xq2Var.b0(-714666198);
                        hf.t(p27Var, xq2Var, 0);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(-714589318);
                        xq2Var.p(false);
                    }
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                ak7.x((String) obj7, this.B, (gn6) obj6, (hn6) obj5, this.L, (on2) obj4, this.R, (a74) obj3, (px0) obj, ii2.a0(12582913));
                return jg7Var;
        }
    }

    public /* synthetic */ u51(String str, boolean z, gn6 gn6Var, hn6 hn6Var, int i, on2 on2Var, qn2 qn2Var, a74 a74Var, int i2) {
        this.X = str;
        this.B = z;
        this.Y = gn6Var;
        this.Z = hn6Var;
        this.L = i;
        this.d0 = on2Var;
        this.R = qn2Var;
        this.e0 = a74Var;
    }
}
