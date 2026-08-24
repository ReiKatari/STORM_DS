package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa4  reason: default package */
/* loaded from: classes.dex */
public final class fa4 extends dm5 implements eo2 {
    public rr2 L;
    public ga4 R;
    public long[] X;
    public int Y;
    public int Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ ga4 e0;
    public final /* synthetic */ rr2 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa4(ga4 ga4Var, rr2 rr2Var, r41 r41Var) {
        super(2, r41Var);
        this.e0 = ga4Var;
        this.f0 = rr2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((fa4) q((r41) obj2, (rb6) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        fa4 fa4Var = new fa4(this.e0, this.f0, r41Var);
        fa4Var.d0 = obj;
        return fa4Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        ga4 ga4Var;
        long[] jArr;
        int i;
        rr2 rr2Var;
        rb6 rb6Var;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.Z;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.Y;
                long[] jArr2 = this.X;
                ga4 ga4Var2 = this.R;
                rr2Var = this.L;
                rb6Var = (rb6) this.d0;
                oi2.Y(obj);
                i = i3;
                ga4Var = ga4Var2;
                jArr = jArr2;
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            ga4Var = this.e0;
            ea4 ea4Var = ga4Var.B;
            jArr = ea4Var.c;
            i = ea4Var.e;
            rr2Var = this.f0;
            rb6Var = (rb6) this.d0;
        }
        while (i != Integer.MAX_VALUE) {
            int i4 = (int) ((jArr[i] >> 31) & 2147483647L);
            rr2Var.B = i;
            Object obj2 = ga4Var.B.b[i];
            this.d0 = rb6Var;
            this.L = rr2Var;
            this.R = ga4Var;
            this.X = jArr;
            this.Y = i4;
            this.Z = 1;
            if (rb6Var.c(this, obj2) == x61Var) {
                return x61Var;
            }
            i = i4;
        }
        return jg7.a;
    }
}
