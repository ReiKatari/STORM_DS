package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n4 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ Object L;

    public /* synthetic */ n4(kx6 kx6Var, float f) {
        this.A = 3;
        this.L = kx6Var;
        this.B = f;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        boolean z = true;
        o27 o27Var = o27.a;
        float f = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                zn3 zn3Var = (zn3) obj2;
                xf3 xf3Var = (xf3) obj;
                xf3Var.getClass();
                xf3Var.a();
                rh0 rh0Var = xf3Var.A;
                hk1.y0(xf3Var, zn3Var, (Float.floatToRawIntBits(RecyclerView.A1) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L)) - f) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (rh0Var.d() >> 32))) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), RecyclerView.A1, null, 56);
                return o27Var;
            case 1:
                op0 op0Var = (op0) obj2;
                su4 su4Var = new su4(((Number) io2.p(Float.valueOf(f), op0Var)).floatValue(), op0Var);
                l93[] l93VarArr = pz5.a;
                qz5 qz5Var = mz5.c;
                l93 l93Var = pz5.a[1];
                ((rz5) obj).b(qz5Var, su4Var);
                return o27Var;
            case 2:
                k24 k24Var = (k24) obj2;
                i76 i76Var = (i76) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (i76Var.a >> 32)) * f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (i76Var.a & 4294967295L)) * f;
                if (Float.intBitsToFloat((int) (((i76) k24Var.getValue()).a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((i76) k24Var.getValue()).a & 4294967295L)) != intBitsToFloat2) {
                    k24Var.setValue(new i76((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)));
                }
                return o27Var;
            default:
                kx6 kx6Var = (kx6) obj2;
                long longValue = ((Long) obj).longValue();
                boolean g = kx6Var.g();
                rj4 rj4Var = kx6Var.g;
                if (!g) {
                    if (rj4Var.h() == Long.MIN_VALUE) {
                        rj4Var.i(longValue);
                        ((tj4) kx6Var.a.a).setValue(Boolean.TRUE);
                    }
                    long h = longValue - rj4Var.h();
                    int i2 = (f > RecyclerView.A1 ? 1 : (f == RecyclerView.A1 ? 0 : -1));
                    if (i2 != 0) {
                        h = jv3.Y(h / f);
                    }
                    kx6Var.n(h);
                    if (i2 != 0) {
                        z = false;
                    }
                    kx6Var.h(h, z);
                }
                return o27Var;
        }
    }

    public /* synthetic */ n4(float f, Object obj, int i) {
        this.A = i;
        this.B = f;
        this.L = obj;
    }
}
