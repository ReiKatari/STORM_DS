package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te1  reason: default package */
/* loaded from: classes.dex */
public final class te1 implements ae4 {
    public final ue1 A;
    public final lo4 B;

    public te1(ue1 ue1Var, lo4 lo4Var) {
        this.A = ue1Var;
        this.B = lo4Var;
    }

    @Override // defpackage.ae4
    public final long N(int i, long j) {
        long j2;
        long j3;
        float intBitsToFloat;
        if (i == 1) {
            ue1 ue1Var = this.A;
            if (Math.abs(ue1Var.l()) > 1.0E-6d) {
                lo4 lo4Var = lo4.Horizontal;
                lo4 lo4Var2 = this.B;
                if (lo4Var2 == lo4Var) {
                    j2 = j >> 32;
                } else {
                    j2 = j & 4294967295L;
                }
                if (Math.abs(Float.intBitsToFloat((int) j2)) > RecyclerView.B1) {
                    cr4 m = ue1Var.m();
                    float l = ue1Var.l() * ue1Var.o();
                    float f = ((m.b + m.c) * (-Math.signum(ue1Var.l()))) + l;
                    if (ue1Var.l() > RecyclerView.B1) {
                        l = f;
                        f = l;
                    }
                    if (lo4Var2 == lo4Var) {
                        j3 = j >> 32;
                    } else {
                        j3 = j & 4294967295L;
                    }
                    float f2 = -ue1Var.k.e(-gi2.p(Float.intBitsToFloat((int) j3), l, f));
                    if (lo4Var2 == lo4Var) {
                        intBitsToFloat = f2;
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    }
                    if (lo4Var2 != lo4.Vertical) {
                        f2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    }
                    return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.ae4
    public final long w0(long j, long j2, int i) {
        long j3;
        if (i == 2) {
            if (this.B == lo4.Horizontal) {
                j3 = j2 >> 32;
            } else {
                j3 = 4294967295L & j2;
            }
            if (Float.intBitsToFloat((int) j3) != RecyclerView.B1) {
                throw new CancellationException("Scroll cancelled");
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.ae4
    public final Object z0(long j, long j2, r41 r41Var) {
        long a;
        if (this.B == lo4.Vertical) {
            a = ol7.a(j2, RecyclerView.B1, RecyclerView.B1, 2);
        } else {
            a = ol7.a(j2, RecyclerView.B1, RecyclerView.B1, 1);
        }
        return new ol7(a);
    }
}
