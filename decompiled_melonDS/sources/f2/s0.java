package f2;

import me.magnum.melonds.common.camera.DSiCameraSource;
import u1.k1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ b1 B;

    public /* synthetic */ s0(b1 b1Var, int i2) {
        this.A = i2;
        this.B = b1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        h3.c cVar;
        u1.p0 p0Var;
        y3.z c4;
        long j2;
        char c10;
        long j10;
        float f8;
        y3.z c11;
        float f10;
        y3.z c12;
        float f11;
        y3.z c13;
        y3.z c14;
        int i2 = this.A;
        b1 b1Var = this.B;
        switch (i2) {
            case 0:
                y3.z zVar = (y3.z) obj;
                u1.p0 p0Var2 = b1Var.f4709d;
                h3.c cVar2 = h3.c.f6051e;
                if (p0Var2 != null) {
                    if (p0Var2.f13393p) {
                        p0Var2 = null;
                    }
                    if (p0Var2 != null) {
                        q4.q qVar = b1Var.f4707b;
                        long j11 = b1Var.n().f12277b;
                        int i10 = l4.q0.f8884c;
                        int m = qVar.m((int) (j11 >> 32));
                        int m10 = b1Var.f4707b.m((int) (b1Var.n().f12277b & 4294967295L));
                        u1.p0 p0Var3 = b1Var.f4709d;
                        long j12 = 0;
                        if (p0Var3 != null && (c14 = p0Var3.c()) != null) {
                            j2 = c14.a0(b1Var.l(true));
                        } else {
                            j2 = 0;
                        }
                        u1.p0 p0Var4 = b1Var.f4709d;
                        if (p0Var4 != null && (c13 = p0Var4.c()) != null) {
                            j12 = c13.a0(b1Var.l(false));
                        }
                        u1.p0 p0Var5 = b1Var.f4709d;
                        float f12 = 0.0f;
                        if (p0Var5 != null && (c12 = p0Var5.c()) != null) {
                            k1 d4 = p0Var2.d();
                            if (d4 != null) {
                                f11 = d4.f13358a.c(m).f6053b;
                            } else {
                                f11 = 0.0f;
                            }
                            c10 = ' ';
                            j10 = j12;
                            f8 = Float.intBitsToFloat((int) (c12.a0((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)) & 4294967295L));
                        } else {
                            c10 = ' ';
                            j10 = j12;
                            f8 = 0.0f;
                        }
                        u1.p0 p0Var6 = b1Var.f4709d;
                        if (p0Var6 != null && (c11 = p0Var6.c()) != null) {
                            k1 d10 = p0Var2.d();
                            if (d10 != null) {
                                f10 = d10.f13358a.c(m10).f6053b;
                            } else {
                                f10 = 0.0f;
                            }
                            f12 = Float.intBitsToFloat((int) (c11.a0((Float.floatToRawIntBits(0.0f) << c10) | (Float.floatToRawIntBits(f10) & 4294967295L)) & 4294967295L));
                        }
                        int i11 = (int) (j2 >> c10);
                        int i12 = (int) (j10 >> c10);
                        cVar = new h3.c(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.min(f8, f12), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), (p0Var2.f13379a.f13449g.b() * 25) + Math.max(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j10 & 4294967295L))));
                        p0Var = b1Var.f4709d;
                        if (p0Var == null && (c4 = p0Var.c()) != null) {
                            if (c4.U() && zVar.U()) {
                                return pc.a.h(zVar.C(y3.c0.i(c4), cVar.d()), cVar.c());
                            }
                            return cVar2;
                        }
                        return null;
                    }
                }
                cVar = cVar2;
                p0Var = b1Var.f4709d;
                if (p0Var == null) {
                }
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.h0 h0Var = (n2.h0) obj;
                return new a5.a(10, b1Var);
            default:
                h3.b bVar = (h3.b) obj;
                b1Var.r();
                return yb.y.f14813a;
        }
    }
}
