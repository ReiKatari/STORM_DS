package d1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ Object L;

    public /* synthetic */ o1(q1 q1Var, float f8) {
        this.A = 0;
        this.L = q1Var;
        this.B = f8;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int i2 = this.A;
        boolean z10 = true;
        yb.y yVar = yb.y.f14813a;
        Object obj2 = this.L;
        float f8 = this.B;
        switch (i2) {
            case 0:
                q1 q1Var = (q1) obj2;
                long longValue = ((Long) obj).longValue();
                boolean g10 = q1Var.g();
                n2.d1 d1Var = q1Var.f3655g;
                if (!g10) {
                    if (d1Var.g() == Long.MIN_VALUE) {
                        d1Var.h(longValue);
                        ((n2.f1) q1Var.f3649a.f147a).setValue(Boolean.TRUE);
                    }
                    long g11 = longValue - d1Var.g();
                    int i10 = (f8 > 0.0f ? 1 : (f8 == 0.0f ? 0 : -1));
                    if (i10 != 0) {
                        g11 = pc.a.N(g11 / f8);
                    }
                    q1Var.n(g11);
                    if (i10 != 0) {
                        z10 = false;
                    }
                    q1Var.h(g11, z10);
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                sc.a aVar = (sc.a) obj2;
                i4.h hVar = new i4.h(((Number) p7.j.i(Float.valueOf(f8), aVar)).floatValue(), aVar);
                tc.c[] cVarArr = i4.v.f6808a;
                i4.w wVar = i4.t.f6783c;
                tc.c cVar = i4.v.f6808a[1];
                ((i4.x) obj).a(wVar, hVar);
                return yVar;
            default:
                n2.w0 w0Var = (n2.w0) obj2;
                h3.e eVar = (h3.e) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (eVar.f6064a >> 32)) * f8;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (eVar.f6064a & 4294967295L)) * f8;
                if (Float.intBitsToFloat((int) (((h3.e) w0Var.getValue()).f6064a >> 32)) != intBitsToFloat || Float.intBitsToFloat((int) (((h3.e) w0Var.getValue()).f6064a & 4294967295L)) != intBitsToFloat2) {
                    w0Var.setValue(new h3.e((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)));
                }
                return yVar;
        }
    }

    public /* synthetic */ o1(float f8, Object obj, int i2) {
        this.A = i2;
        this.B = f8;
        this.L = obj;
    }
}
