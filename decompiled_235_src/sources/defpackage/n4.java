package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n4 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ Object L;

    public /* synthetic */ n4(ga7 ga7Var, float f) {
        this.A = 2;
        this.L = ga7Var;
        this.B = f;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        float f = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                bv3 bv3Var = (bv3) obj2;
                um3 um3Var = (um3) obj;
                um3Var.getClass();
                um3Var.b();
                zj0 zj0Var = um3Var.A;
                no1.D0(um3Var, bv3Var, (Float.floatToRawIntBits(RecyclerView.B1) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L)) - f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (zj0Var.e() >> 32))) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), RecyclerView.B1, null, 56);
                return jg7Var;
            case 1:
                qa4 qa4Var = (qa4) obj2;
                xi6 xi6Var = (xi6) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (xi6Var.a >> 32)) * f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (xi6Var.a & 4294967295L)) * f;
                if (Float.intBitsToFloat((int) (((xi6) qa4Var.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((xi6) qa4Var.getValue()).a & 4294967295L)) != intBitsToFloat2) {
                    qa4Var.setValue(new xi6((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
                }
                return jg7Var;
            default:
                ga7 ga7Var = (ga7) obj2;
                long longValue = ((Long) obj).longValue();
                boolean g = ga7Var.g();
                ts4 ts4Var = ga7Var.g;
                if (!g) {
                    if (ts4Var.h() == Long.MIN_VALUE) {
                        ts4Var.i(longValue);
                        ((vs4) ga7Var.a.a).setValue(Boolean.TRUE);
                    }
                    long h = longValue - ts4Var.h();
                    int i2 = (f > RecyclerView.B1 ? 1 : (f == RecyclerView.B1 ? 0 : -1));
                    if (i2 != 0) {
                        h = u24.F(h / f);
                    }
                    ga7Var.n(h);
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ga7Var.h(h, z);
                }
                return jg7Var;
        }
    }

    public /* synthetic */ n4(float f, Object obj, int i) {
        this.A = i;
        this.B = f;
        this.L = obj;
    }
}
