package mh;

import n2.b1;
import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u implements u3.a {
    public final /* synthetic */ s2 A;
    public final /* synthetic */ b1 B;
    public final /* synthetic */ zc.u L;
    public final /* synthetic */ float R;
    public final /* synthetic */ float X;
    public final /* synthetic */ mc.a Y;

    public u(s2 s2Var, b1 b1Var, zc.u uVar, float f8, float f10, mc.a aVar) {
        this.A = s2Var;
        this.B = b1Var;
        this.L = uVar;
        this.R = f8;
        this.X = f10;
        this.Y = aVar;
    }

    @Override // u3.a
    public final Object F(long j2, cc.c cVar) {
        if (this.B.g() > 0.0f) {
            zc.x.v(this.L, null, null, new t(j2, this.R, this.X, this.Y, this.B, null), 3);
            return new x4.q(j2);
        }
        return new x4.q(0L);
    }

    @Override // u3.a
    public final long n0(int i2, long j2) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        if (((Boolean) this.A.getValue()).booleanValue()) {
            int i10 = (int) (j2 & 4294967295L);
            int i11 = (Float.intBitsToFloat(i10) > 0.0f ? 1 : (Float.intBitsToFloat(i10) == 0.0f ? 0 : -1));
            b1 b1Var = this.B;
            if (i11 > 0) {
                float intBitsToFloat = Float.intBitsToFloat(i10);
                b1Var.h(b1Var.g() + intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            } else if (Float.intBitsToFloat(i10) < 0.0f && b1Var.g() > 0.0f) {
                float max = Math.max(Float.intBitsToFloat(i10), -b1Var.g());
                b1Var.h(b1Var.g() + max);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits2 = Float.floatToRawIntBits(max);
            } else {
                return 0L;
            }
            return (floatToRawIntBits << 32) | (4294967295L & floatToRawIntBits2);
        }
        return 0L;
    }
}
