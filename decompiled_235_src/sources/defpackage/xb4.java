package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xb4 implements qn2 {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ xb4(jt3 jt3Var, nh2 nh2Var, boolean z, p27 p27Var, mk4 mk4Var) {
        this.L = jt3Var;
        this.R = nh2Var;
        this.B = z;
        this.X = p27Var;
        this.Y = mk4Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.Y;
        Object obj3 = this.X;
        boolean z = this.B;
        Object obj4 = this.R;
        Object obj5 = this.L;
        switch (i) {
            case 0:
                sb4 sb4Var = (sb4) obj;
                sb4Var.getClass();
                ((zg5) obj5).A = true;
                ((zg5) obj4).A = true;
                ((zb4) obj3).m(sb4Var, z, (pu) obj2);
                return jg7Var;
            default:
                jt3 jt3Var = (jt3) obj5;
                nh2 nh2Var = (nh2) obj4;
                p27 p27Var = (p27) obj3;
                mk4 mk4Var = (mk4) obj2;
                jk4 jk4Var = (jk4) obj;
                if (!jt3Var.b()) {
                    nh2.a(nh2Var);
                } else {
                    xm6 xm6Var = jt3Var.c;
                    if (xm6Var != null) {
                        ((bh1) xm6Var).b();
                    }
                }
                if (jt3Var.b() && z) {
                    if (jt3Var.a() != hv2.Selection) {
                        b47 d = jt3Var.d();
                        if (d != null) {
                            long j = jk4Var.a;
                            yc1 yc1Var = jt3Var.d;
                            w51 w51Var = jt3Var.v;
                            int i2 = mk4Var.i(d.b(j, true));
                            w51Var.g(c37.a((c37) yc1Var.A, null, jx2.f(i2, i2), 5));
                            if (jt3Var.a.a.B.length() > 0) {
                                jt3Var.k.setValue(hv2.Cursor);
                            }
                        }
                    } else {
                        p27Var.g(jk4Var);
                    }
                }
                return jg7Var;
        }
    }

    public /* synthetic */ xb4(zg5 zg5Var, zg5 zg5Var2, zb4 zb4Var, boolean z, pu puVar) {
        this.L = zg5Var;
        this.R = zg5Var2;
        this.X = zb4Var;
        this.B = z;
        this.Y = puVar;
    }
}
