package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e01  reason: default package */
/* loaded from: classes.dex */
public class e01 {
    public final nt0 a;
    public final nt0 b;
    public final nt0 c;
    public final float[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e01(nt0 nt0Var, nt0 nt0Var2, int i) {
        this(nt0Var2, r0, r1, r4);
        nt0 nt0Var3;
        nt0 nt0Var4;
        float[] fArr;
        float[] fArr2;
        if (q60.A(nt0Var.b, 12884901888L)) {
            nt0Var3 = nc1.B(nt0Var);
        } else {
            nt0Var3 = nt0Var;
        }
        if (q60.A(nt0Var2.b, 12884901888L)) {
            nt0Var4 = nc1.B(nt0Var2);
        } else {
            nt0Var4 = nt0Var2;
        }
        float[] fArr3 = jw2.u;
        if (i == 3) {
            boolean A = q60.A(nt0Var.b, 12884901888L);
            boolean A2 = q60.A(nt0Var2.b, 12884901888L);
            if ((!A || !A2) && (A || A2)) {
                ys7 ys7Var = ((cq5) (A ? nt0Var : nt0Var2)).d;
                if (A) {
                    fArr2 = ys7Var.a();
                } else {
                    fArr2 = fArr3;
                }
                fArr3 = A2 ? ys7Var.a() : fArr3;
                fArr = new float[]{fArr2[0] / fArr3[0], fArr2[1] / fArr3[1], fArr2[2] / fArr3[2]};
            }
        }
        fArr = null;
    }

    public long a(long j) {
        float i = kt0.i(j);
        float h = kt0.h(j);
        float f = kt0.f(j);
        float e = kt0.e(j);
        nt0 nt0Var = this.b;
        long d = nt0Var.d(i, h, f);
        float intBitsToFloat = Float.intBitsToFloat((int) (d >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d & 4294967295L));
        float e2 = nt0Var.e(i, h, f);
        float[] fArr = this.d;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            e2 *= fArr[2];
        }
        float f2 = intBitsToFloat;
        float f3 = intBitsToFloat2;
        return this.c.f(f2, f3, e2, e, this.a);
    }

    public e01(nt0 nt0Var, nt0 nt0Var2, nt0 nt0Var3, float[] fArr) {
        this.a = nt0Var;
        this.b = nt0Var2;
        this.c = nt0Var3;
        this.d = fArr;
    }
}
