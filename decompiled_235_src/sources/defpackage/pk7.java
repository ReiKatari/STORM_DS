package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk7  reason: default package */
/* loaded from: classes.dex */
public final class pk7 extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ qk7 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk7(qk7 qk7Var, int i) {
        super(1);
        this.B = i;
        this.L = qk7Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        jg7 jg7Var = jg7.a;
        qk7 qk7Var = this.L;
        switch (i) {
            case 0:
                gk7 gk7Var = (gk7) obj;
                qk7Var.d = true;
                qk7Var.f.c();
                return jg7Var;
            default:
                no1 no1Var = (no1) obj;
                mu2 mu2Var = qk7Var.b;
                float f = qk7Var.k;
                float f2 = qk7Var.l;
                bt i0 = no1Var.i0();
                long L = i0.L();
                i0.G().h();
                try {
                    ((os0) i0.B).f0(f, f2, 0L);
                    mu2Var.a(no1Var);
                    return jg7Var;
                } finally {
                    xg6.v(i0, L);
                }
        }
    }
}
