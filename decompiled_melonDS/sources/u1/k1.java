package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public final l4.o0 f13358a;

    /* renamed from: b  reason: collision with root package name */
    public y3.z f13359b = null;

    /* renamed from: c  reason: collision with root package name */
    public y3.z f13360c;

    public k1(l4.o0 o0Var, y3.z zVar) {
        this.f13358a = o0Var;
        this.f13360c = zVar;
    }

    public final long a(long j2) {
        h3.c cVar;
        y3.z zVar = this.f13359b;
        h3.c cVar2 = h3.c.f6051e;
        if (zVar != null) {
            if (zVar.U()) {
                y3.z zVar2 = this.f13360c;
                if (zVar2 != null) {
                    cVar = zVar2.k(zVar, true);
                } else {
                    cVar = null;
                }
            } else {
                cVar = cVar2;
            }
            if (cVar != null) {
                cVar2 = cVar;
            }
        }
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i2);
        float f8 = cVar2.f6052a;
        if (intBitsToFloat >= f8) {
            float intBitsToFloat2 = Float.intBitsToFloat(i2);
            f8 = cVar2.f6054c;
            if (intBitsToFloat2 <= f8) {
                f8 = Float.intBitsToFloat(i2);
            }
        }
        int i10 = (int) (j2 & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i10);
        float f10 = cVar2.f6053b;
        if (intBitsToFloat3 >= f10) {
            float intBitsToFloat4 = Float.intBitsToFloat(i10);
            f10 = cVar2.f6055d;
            if (intBitsToFloat4 <= f10) {
                f10 = Float.intBitsToFloat(i10);
            }
        }
        return (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
    }

    public final int b(long j2, boolean z10) {
        if (z10) {
            j2 = a(j2);
        }
        return this.f13358a.f8866b.g(d(j2));
    }

    public final boolean c(long j2) {
        long d4 = d(a(j2));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d4));
        l4.o0 o0Var = this.f13358a;
        int e6 = o0Var.f8866b.e(intBitsToFloat);
        int i2 = (int) (d4 >> 32);
        if (Float.intBitsToFloat(i2) >= o0Var.d(e6) && Float.intBitsToFloat(i2) <= o0Var.e(e6)) {
            return true;
        }
        return false;
    }

    public final long d(long j2) {
        y3.z zVar;
        y3.z zVar2 = this.f13359b;
        if (zVar2 != null) {
            y3.z zVar3 = null;
            if (!zVar2.U()) {
                zVar2 = null;
            }
            if (zVar2 != null && (zVar = this.f13360c) != null) {
                if (zVar.U()) {
                    zVar3 = zVar;
                }
                if (zVar3 != null) {
                    return zVar2.C(zVar3, j2);
                }
                return j2;
            }
            return j2;
        }
        return j2;
    }

    public final long e(long j2) {
        y3.z zVar;
        y3.z zVar2 = this.f13359b;
        if (zVar2 != null) {
            y3.z zVar3 = null;
            if (!zVar2.U()) {
                zVar2 = null;
            }
            if (zVar2 != null && (zVar = this.f13360c) != null) {
                if (zVar.U()) {
                    zVar3 = zVar;
                }
                if (zVar3 != null) {
                    return zVar3.C(zVar2, j2);
                }
                return j2;
            }
            return j2;
        }
        return j2;
    }
}
