package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qi  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qi implements eo2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ ta4 B;
    public final /* synthetic */ qa4 L;
    public final /* synthetic */ s76 R;
    public final /* synthetic */ a74 X;
    public final /* synthetic */ zv0 Y;

    public /* synthetic */ qi(ta4 ta4Var, qa4 qa4Var, s76 s76Var, a74 a74Var, zv0 zv0Var) {
        this.B = ta4Var;
        this.L = qa4Var;
        this.R = s76Var;
        this.X = a74Var;
        this.Y = zv0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
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
                if (xq2Var.S(intValue & 1, z)) {
                    ln2.a(this.B, this.L, this.R, this.X, this.Y, xq2Var, 48);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                ln2.a(this.B, this.L, this.R, this.X, this.Y, (px0) obj, ii2.a0(49));
                return jg7Var;
        }
    }

    public /* synthetic */ qi(ta4 ta4Var, qa4 qa4Var, s76 s76Var, a74 a74Var, zv0 zv0Var, int i) {
        this.B = ta4Var;
        this.L = qa4Var;
        this.R = s76Var;
        this.X = a74Var;
        this.Y = zv0Var;
    }
}
