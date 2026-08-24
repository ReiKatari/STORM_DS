package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nn  reason: default package */
/* loaded from: classes.dex */
public final class nn extends aj3 implements eo2 {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ zv0 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(ta4 ta4Var, a74 a74Var, o52 o52Var, z72 z72Var, String str, zv0 zv0Var, int i) {
        super(2);
        this.R = ta4Var;
        this.X = a74Var;
        this.Y = o52Var;
        this.Z = z72Var;
        this.d0 = str;
        this.L = zv0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        Object obj3;
        int i = this.B;
        jg7 jg7Var = jg7.a;
        Object obj4 = this.d0;
        Object obj5 = this.Z;
        Object obj6 = this.Y;
        Object obj7 = this.R;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Number) obj2).intValue();
                qn2 qn2Var = (qn2) obj6;
                yn ynVar = (yn) obj5;
                ga7 ga7Var = (ga7) obj7;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    Object P = xq2Var.P();
                    Object obj8 = ox0.a;
                    if (P == obj8) {
                        P = (b41) qn2Var.g(ynVar);
                        xq2Var.l0(P);
                    }
                    b41 b41Var = (b41) P;
                    aa7 f = ga7Var.f();
                    vs4 vs4Var = ga7Var.d;
                    Object c = f.c();
                    Object obj9 = this.X;
                    boolean g = xq2Var.g(nb3.k(c, obj9));
                    Object P2 = xq2Var.P();
                    if (g || P2 == obj8) {
                        if (nb3.k(ga7Var.f().c(), obj9)) {
                            obj3 = z72.b;
                        } else {
                            obj3 = ((b41) qn2Var.g(ynVar)).b;
                        }
                        P2 = obj3;
                        xq2Var.l0(P2);
                    }
                    z72 z72Var = (z72) P2;
                    Object P3 = xq2Var.P();
                    if (P3 == obj8) {
                        P3 = new tn(nb3.k(obj9, vs4Var.getValue()));
                        xq2Var.l0(P3);
                    }
                    tn tnVar = (tn) P3;
                    o52 o52Var = b41Var.a;
                    boolean h = xq2Var.h(b41Var);
                    Object P4 = xq2Var.P();
                    if (h || P4 == obj8) {
                        P4 = new ug6(b41Var, 1);
                        xq2Var.l0(P4);
                    }
                    a74 L = ge7.L(x64.a, (fo2) P4);
                    tnVar.a.setValue(Boolean.valueOf(nb3.k(obj9, vs4Var.getValue())));
                    a74 d = L.d(tnVar);
                    ga7 ga7Var2 = (ga7) obj7;
                    boolean h2 = xq2Var.h(obj9);
                    Object P5 = xq2Var.P();
                    if (h2 || P5 == obj8) {
                        P5 = new mc(obj9, 5);
                        xq2Var.l0(P5);
                    }
                    qn2 qn2Var2 = (qn2) P5;
                    boolean f2 = xq2Var.f(z72Var);
                    Object P6 = xq2Var.P();
                    if (f2 || P6 == obj8) {
                        P6 = new o0(z72Var, 2);
                        xq2Var.l0(P6);
                    }
                    g04.b(ga7Var2, qn2Var2, d, o52Var, z72Var, (eo2) P6, n16.I(-143346359, new mn((mm6) obj4, obj9, ynVar, this.L, 0), xq2Var), xq2Var, 12582912);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                ((Number) obj2).intValue();
                g04.d((ta4) obj7, (a74) this.X, (o52) obj6, (z72) obj5, (String) obj4, this.L, (px0) obj, ii2.a0(199681));
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(ga7 ga7Var, Object obj, qn2 qn2Var, yn ynVar, mm6 mm6Var, zv0 zv0Var) {
        super(2);
        this.R = ga7Var;
        this.X = obj;
        this.Y = qn2Var;
        this.Z = ynVar;
        this.d0 = mm6Var;
        this.L = zv0Var;
    }
}
