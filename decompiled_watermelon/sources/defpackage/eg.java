package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eg  reason: default package */
/* loaded from: classes.dex */
public final class eg {
    public final od1 a;
    public long b = 9205357640488583168L;
    public final gn1 c;
    public final tj4 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final xc1 i;

    public eg(Context context, od1 od1Var, long j, ih4 ih4Var) {
        mm2 mm2Var;
        this.a = od1Var;
        gn1 gn1Var = new gn1(context, mh7.h0(j));
        this.c = gn1Var;
        this.d = new tj4(o27.a, k45.f0);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        dg dgVar = new dg(0, this);
        kp4 kp4Var = pk6.a;
        uk6 uk6Var = new uk6(null, null, null, dgVar);
        if (Build.VERSION.SDK_INT >= 31) {
            mm2Var = new mm2(uk6Var, this, gn1Var);
        } else {
            mm2Var = new mm2(uk6Var, this, gn1Var, ih4Var);
        }
        this.i = mm2Var;
    }

    public final void a() {
        boolean z;
        gn1 gn1Var = this.c;
        EdgeEffect edgeEffect = gn1Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = gn1Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (edgeEffect2.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect3 = gn1Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect4 = gn1Var.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
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
    public final java.lang.Object b(long r19, defpackage.yw5 r21, defpackage.k11 r22) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg.b(long, yw5, k11):java.lang.Object");
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = mj2.y(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32))) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(o27.a);
        }
    }

    public final float e(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect b = this.c.b();
        float f2 = -intBitsToFloat2;
        float f3 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f2 = ip.g(b, f2, f3);
        } else {
            b.onPull(f2, f3);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f2);
        if (i2 >= 31) {
            f = ip.e(b);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.A1) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float f(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = ip.g(c, intBitsToFloat2, f2);
        } else {
            c.onPull(intBitsToFloat2, f2);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = ip.e(c);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.A1) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() & 4294967295L));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f2 = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f2 = ip.g(d, f2, intBitsToFloat);
        } else {
            d.onPull(f2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * (-f2);
        if (i2 >= 31) {
            f = ip.e(d);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.A1) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c() >> 32));
        int i = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = ip.g(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = ip.e(e);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.A1) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final void i(long j) {
        boolean b = i76.b(this.g, 0L);
        boolean b2 = i76.b(j, this.g);
        this.g = j;
        if (!b2) {
            int X = jv3.X(Float.intBitsToFloat((int) (j >> 32)));
            long X2 = (jv3.X(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (X << 32);
            gn1 gn1Var = this.c;
            gn1Var.c = X2;
            EdgeEffect edgeEffect = gn1Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (X2 >> 32), (int) (X2 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = gn1Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (X2 >> 32), (int) (X2 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = gn1Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (X2 & 4294967295L), (int) (X2 >> 32));
            }
            EdgeEffect edgeEffect4 = gn1Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (X2 & 4294967295L), (int) (X2 >> 32));
            }
            EdgeEffect edgeEffect5 = gn1Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (X2 >> 32), (int) (X2 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = gn1Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (X2 >> 32), (int) (X2 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = gn1Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (X2 & 4294967295L), (int) (X2 >> 32));
            }
            EdgeEffect edgeEffect8 = gn1Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & X2), (int) (X2 >> 32));
            }
        }
        if (!b && !b2) {
            a();
        }
    }
}
