package f1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final x4.c f4568a;

    /* renamed from: b  reason: collision with root package name */
    public long f4569b = 9205357640488583168L;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f4570c;

    /* renamed from: d  reason: collision with root package name */
    public final n2.f1 f4571d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4572e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4573f;

    /* renamed from: g  reason: collision with root package name */
    public long f4574g;

    /* renamed from: h  reason: collision with root package name */
    public long f4575h;

    /* renamed from: i  reason: collision with root package name */
    public final a4.k f4576i;

    public i(Context context, x4.c cVar, long j2, l1.d1 d1Var) {
        o0 o0Var;
        this.f4568a = cVar;
        i0 i0Var = new i0(context, i3.z.y(j2));
        this.f4570c = i0Var;
        this.f4571d = new n2.f1(yb.y.f14813a, n2.e.R);
        this.f4572e = true;
        this.f4574g = 0L;
        this.f4575h = -1L;
        a2.h hVar = new a2.h(2, this);
        v3.k kVar = v3.c0.f13637a;
        v3.h0 h0Var = new v3.h0(null, null, null, hVar);
        if (Build.VERSION.SDK_INT >= 31) {
            o0Var = new o0(h0Var, this, i0Var);
        } else {
            o0Var = new o0(h0Var, this, i0Var, d1Var);
        }
        this.f4576i = o0Var;
    }

    public final void a() {
        boolean z10;
        i0 i0Var = this.f4570c;
        EdgeEffect edgeEffect = i0Var.f4580d;
        boolean z11 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = !edgeEffect.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = i0Var.f4581e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (edgeEffect2.isFinished() && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        EdgeEffect edgeEffect3 = i0Var.f4582f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z10) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        EdgeEffect edgeEffect4 = i0Var.f4583g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z10) {
                z11 = false;
            }
            z10 = z11;
        }
        if (z10) {
            d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0137, code lost:
        if (r4 == r6) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r19, h1.o2 r21, ec.c r22) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.i.b(long, h1.o2, ec.c):java.lang.Object");
    }

    public final long c() {
        long j2 = this.f4569b;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            j2 = a.a.v(this.f4574g);
        }
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (this.f4574g & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (this.f4574g >> 32))) << 32);
    }

    public final void d() {
        if (this.f4572e) {
            this.f4571d.setValue(yb.y.f14813a);
        }
    }

    public final float e(long j2) {
        float f8;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i2 = (int) (j2 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.f4574g & 4294967295L));
        EdgeEffect b10 = this.f4570c.b();
        float f10 = -intBitsToFloat2;
        float f11 = 1 - intBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f10 = l.c(b10, f10, f11);
        } else {
            b10.onPull(f10, f11);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.f4574g)) * (-f10);
        if (i10 >= 31) {
            f8 = l.b(b10);
        } else {
            f8 = 0.0f;
        }
        if (f8 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }

    public final float f(long j2) {
        float f8;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.f4574g >> 32));
        EdgeEffect c4 = this.f4570c.c();
        float f10 = 1 - intBitsToFloat;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            intBitsToFloat2 = l.c(c4, intBitsToFloat2, f10);
        } else {
            c4.onPull(intBitsToFloat2, f10);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.f4574g >> 32)) * intBitsToFloat2;
        if (i10 >= 31) {
            f8 = l.b(c4);
        } else {
            f8 = 0.0f;
        }
        if (f8 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }

    public final float g(long j2) {
        float f8;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i2 = (int) (j2 >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.f4574g >> 32));
        EdgeEffect d4 = this.f4570c.d();
        float f10 = -intBitsToFloat2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            f10 = l.c(d4, f10, intBitsToFloat);
        } else {
            d4.onPull(f10, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.f4574g >> 32)) * (-f10);
        if (i10 >= 31) {
            f8 = l.b(d4);
        } else {
            f8 = 0.0f;
        }
        if (f8 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }

    public final float h(long j2) {
        float f8;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i2 = (int) (j2 & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i2) / Float.intBitsToFloat((int) (this.f4574g & 4294967295L));
        EdgeEffect e6 = this.f4570c.e();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            intBitsToFloat2 = l.c(e6, intBitsToFloat2, intBitsToFloat);
        } else {
            e6.onPull(intBitsToFloat2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.f4574g & 4294967295L)) * intBitsToFloat2;
        if (i10 >= 31) {
            f8 = l.b(e6);
        } else {
            f8 = 0.0f;
        }
        if (f8 == 0.0f) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i2);
    }

    public final void i(long j2) {
        boolean b10 = h3.e.b(this.f4574g, 0L);
        boolean b11 = h3.e.b(j2, this.f4574g);
        this.f4574g = j2;
        if (!b11) {
            int M = pc.a.M(Float.intBitsToFloat((int) (j2 >> 32)));
            long M2 = (pc.a.M(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (M << 32);
            i0 i0Var = this.f4570c;
            i0Var.f4579c = M2;
            EdgeEffect edgeEffect = i0Var.f4580d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (M2 >> 32), (int) (M2 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = i0Var.f4581e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (M2 >> 32), (int) (M2 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = i0Var.f4582f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (M2 & 4294967295L), (int) (M2 >> 32));
            }
            EdgeEffect edgeEffect4 = i0Var.f4583g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (M2 & 4294967295L), (int) (M2 >> 32));
            }
            EdgeEffect edgeEffect5 = i0Var.f4584h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (M2 >> 32), (int) (M2 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = i0Var.f4585i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (M2 >> 32), (int) (M2 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = i0Var.f4586j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (M2 & 4294967295L), (int) (M2 >> 32));
            }
            EdgeEffect edgeEffect8 = i0Var.f4587k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & M2), (int) (M2 >> 32));
            }
        }
        if (!b10 && !b11) {
            a();
        }
    }
}
