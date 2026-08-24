package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gr7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gr7 implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ qr7 B;
    public final /* synthetic */ on2 L;

    public /* synthetic */ gr7(on2 on2Var, qr7 qr7Var) {
        this.L = on2Var;
        this.B = qr7Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        on2 on2Var = this.L;
        qr7 qr7Var = this.B;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(1 & intValue, z)) {
                    gq.c(mb3.f, null, n16.I(1124103538, new j10(on2Var, 6, (byte) 0), xq2Var), n16.I(-1951012197, new ov4(qr7Var, 18), xq2Var), ((ut0) xq2Var.j(vt0.a)).j(), 0L, 4.0f, xq2Var, 1576326, 34);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                vy7.F(qr7Var, on2Var, (px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ gr7(qr7 qr7Var, on2 on2Var, int i) {
        this.B = qr7Var;
        this.L = on2Var;
    }
}
