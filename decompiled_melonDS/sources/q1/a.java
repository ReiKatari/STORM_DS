package q1;

import h1.n1;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements u3.a {
    public final a0 A;
    public final n1 B;

    public a(a0 a0Var, n1 n1Var) {
        this.A = a0Var;
        this.B = n1Var;
    }

    @Override // u3.a
    public final Object V(long j2, long j10, cc.c cVar) {
        long a10;
        if (this.B == n1.Vertical) {
            a10 = x4.q.a(j10, 0.0f, 0.0f, 2);
        } else {
            a10 = x4.q.a(j10, 0.0f, 0.0f, 1);
        }
        return new x4.q(a10);
    }

    @Override // u3.a
    public final long Z(long j2, long j10, int i2) {
        long j11;
        if (i2 == 2) {
            if (this.B == n1.Horizontal) {
                j11 = j10 >> 32;
            } else {
                j11 = 4294967295L & j10;
            }
            if (Float.intBitsToFloat((int) j11) != 0.0f) {
                throw new CancellationException("Scroll cancelled");
            }
            return 0L;
        }
        return 0L;
    }

    @Override // u3.a
    public final long n0(int i2, long j2) {
        long j10;
        long j11;
        float intBitsToFloat;
        if (i2 == 1) {
            a0 a0Var = this.A;
            if (Math.abs(a0Var.l()) > 1.0E-6d) {
                n1 n1Var = n1.Horizontal;
                n1 n1Var2 = this.B;
                if (n1Var2 == n1Var) {
                    j10 = j2 >> 32;
                } else {
                    j10 = j2 & 4294967295L;
                }
                if (Math.abs(Float.intBitsToFloat((int) j10)) > 0.0f) {
                    float l10 = a0Var.l() * a0Var.o();
                    float f8 = ((a0Var.m().f12174b + a0Var.m().f12175c) * (-Math.signum(a0Var.l()))) + l10;
                    if (a0Var.l() > 0.0f) {
                        f8 = l10;
                        l10 = f8;
                    }
                    if (n1Var2 == n1Var) {
                        j11 = j2 >> 32;
                    } else {
                        j11 = j2 & 4294967295L;
                    }
                    float f10 = -a0Var.f12103k.e(-p7.j.f(Float.intBitsToFloat((int) j11), l10, f8));
                    if (n1Var2 == n1Var) {
                        intBitsToFloat = f10;
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                    }
                    if (n1Var2 != n1.Vertical) {
                        f10 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    }
                    return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }
}
