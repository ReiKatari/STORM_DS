package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xa1  reason: default package */
/* loaded from: classes.dex */
public final class xa1 implements u54 {
    public final ya1 A;
    public final jf4 B;

    public xa1(ya1 ya1Var, jf4 jf4Var) {
        this.A = ya1Var;
        this.B = jf4Var;
    }

    @Override // defpackage.u54
    public final long j0(long j, long j2, int i) {
        long j3;
        if (i == 2) {
            if (this.B == jf4.Horizontal) {
                j3 = j2 >> 32;
            } else {
                j3 = 4294967295L & j2;
            }
            if (Float.intBitsToFloat((int) j3) != RecyclerView.A1) {
                throw new CancellationException("Scroll cancelled");
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.u54
    public final Object o0(long j, long j2, j11 j11Var) {
        long a;
        if (this.B == jf4.Vertical) {
            a = p77.a(j2, RecyclerView.A1, RecyclerView.A1, 2);
        } else {
            a = p77.a(j2, RecyclerView.A1, RecyclerView.A1, 1);
        }
        return new p77(a);
    }

    @Override // defpackage.u54
    public final long w0(int i, long j) {
        long j2;
        long j3;
        float intBitsToFloat;
        if (i == 1) {
            ya1 ya1Var = this.A;
            if (Math.abs(ya1Var.l()) > 1.0E-6d) {
                jf4 jf4Var = jf4.Horizontal;
                jf4 jf4Var2 = this.B;
                if (jf4Var2 == jf4Var) {
                    j2 = j >> 32;
                } else {
                    j2 = j & 4294967295L;
                }
                if (Math.abs(Float.intBitsToFloat((int) j2)) > RecyclerView.A1) {
                    zh4 m = ya1Var.m();
                    float l = ya1Var.l() * ya1Var.o();
                    float f = ((m.b + m.c) * (-Math.signum(ya1Var.l()))) + l;
                    if (ya1Var.l() > RecyclerView.A1) {
                        l = f;
                        f = l;
                    }
                    if (jf4Var2 == jf4Var) {
                        j3 = j >> 32;
                    } else {
                        j3 = j & 4294967295L;
                    }
                    float f2 = -ya1Var.k.d(-io2.l(Float.intBitsToFloat((int) j3), l, f));
                    if (jf4Var2 == jf4Var) {
                        intBitsToFloat = f2;
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    }
                    if (jf4Var2 != jf4.Vertical) {
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
}
