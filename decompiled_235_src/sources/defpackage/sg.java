package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sg  reason: default package */
/* loaded from: classes.dex */
public final class sg {
    public final qh1 a;
    public long b = 9205357640488583168L;
    public final mr1 c;
    public final vs4 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final zg1 i;

    public sg(Context context, qh1 qh1Var, long j, lq4 lq4Var) {
        rs2 rs2Var;
        this.a = qh1Var;
        mr1 mr1Var = new mr1(context, hv.b0(j));
        this.c = mr1Var;
        this.d = new vs4(jg7.a, vs0.j0);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        rg rgVar = new rg(this, 0);
        oy4 oy4Var = jw6.a;
        ow6 ow6Var = new ow6(null, null, null, rgVar);
        if (Build.VERSION.SDK_INT >= 31) {
            rs2Var = new rs2(ow6Var, this, mr1Var);
        } else {
            rs2Var = new rs2(ow6Var, this, mr1Var, lq4Var);
        }
        this.i = rs2Var;
    }

    public final void a() {
        boolean z;
        mr1 mr1Var = this.c;
        EdgeEffect edgeEffect = mr1Var.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = mr1Var.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (edgeEffect2.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect3 = mr1Var.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (edgeEffect3.isFinished() && !z) {
                z = false;
            } else {
                z = true;
            }
        }
        EdgeEffect edgeEffect4 = mr1Var.g;
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
    */
    public final Object b(long j, l86 l86Var, s41 s41Var) {
        pg pgVar;
        int i;
        float f;
        float f2;
        long d;
        long d2;
        if (s41Var instanceof pg) {
            pgVar = (pg) s41Var;
            int i2 = pgVar.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pgVar.Z = i2 - Integer.MIN_VALUE;
                Object obj = pgVar.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = pgVar.Z;
                jg7 jg7Var = jg7.a;
                mr1 mr1Var = this.c;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            d = pgVar.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                } else {
                    oi2.Y(obj);
                    if (xi6.f(this.g)) {
                        pgVar.Z = 1;
                        l86Var.getClass();
                        l86 l86Var2 = new l86(l86Var.d0, pgVar);
                        l86Var2.Z = j;
                        if (l86Var2.s(jg7Var) != x61Var) {
                            return jg7Var;
                        }
                    } else {
                        boolean g = mr1.g(mr1Var.f);
                        qh1 qh1Var = this.a;
                        if (g && ol7.b(j) < RecyclerView.B1) {
                            f = vy7.G(mr1Var.c(), ol7.b(j), Float.intBitsToFloat((int) (this.g >> 32)), qh1Var);
                        } else if (mr1.g(mr1Var.g) && ol7.b(j) > RecyclerView.B1) {
                            f = -vy7.G(mr1Var.d(), -ol7.b(j), Float.intBitsToFloat((int) (this.g >> 32)), qh1Var);
                        } else {
                            f = 0.0f;
                        }
                        if (mr1.g(mr1Var.d) && ol7.c(j) < RecyclerView.B1) {
                            f2 = vy7.G(mr1Var.e(), ol7.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), qh1Var);
                        } else if (mr1.g(mr1Var.e) && ol7.c(j) > RecyclerView.B1) {
                            f2 = -vy7.G(mr1Var.b(), -ol7.c(j), Float.intBitsToFloat((int) (this.g & 4294967295L)), qh1Var);
                        } else {
                            f2 = 0.0f;
                        }
                        long k = qo2.k(f, f2);
                        if (k != 0) {
                            d();
                        }
                        d = ol7.d(j, k);
                        pgVar.R = d;
                        pgVar.Z = 2;
                        l86Var.getClass();
                        l86 l86Var3 = new l86(l86Var.d0, pgVar);
                        l86Var3.Z = d;
                        obj = l86Var3.s(jg7Var);
                    }
                    return x61Var;
                }
                d2 = ol7.d(d, ((ol7) obj).a);
                this.f = false;
                if (ol7.b(d2) <= RecyclerView.B1) {
                    EdgeEffect c = mr1Var.c();
                    int E = u24.E(ol7.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c.onAbsorb(E);
                    } else if (c.isFinished()) {
                        c.onAbsorb(E);
                    }
                } else if (ol7.b(d2) < RecyclerView.B1) {
                    EdgeEffect d3 = mr1Var.d();
                    int i3 = -u24.E(ol7.b(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d3.onAbsorb(i3);
                    } else if (d3.isFinished()) {
                        d3.onAbsorb(i3);
                    }
                }
                if (ol7.c(d2) <= RecyclerView.B1) {
                    EdgeEffect e = mr1Var.e();
                    int E2 = u24.E(ol7.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e.onAbsorb(E2);
                    } else if (e.isFinished()) {
                        e.onAbsorb(E2);
                    }
                } else if (ol7.c(d2) < RecyclerView.B1) {
                    EdgeEffect b = mr1Var.b();
                    int i4 = -u24.E(ol7.c(d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b.onAbsorb(i4);
                    } else if (b.isFinished()) {
                        b.onAbsorb(i4);
                    }
                }
                a();
                return jg7Var;
            }
        }
        pgVar = new pg(this, s41Var);
        Object obj2 = pgVar.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = pgVar.Z;
        jg7 jg7Var2 = jg7.a;
        mr1 mr1Var2 = this.c;
        if (i == 0) {
        }
        d2 = ol7.d(d, ((ol7) obj2).a);
        this.f = false;
        if (ol7.b(d2) <= RecyclerView.B1) {
        }
        if (ol7.c(d2) <= RecyclerView.B1) {
        }
        a();
        return jg7Var2;
    }

    public final long c() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = ii2.v(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) / Float.intBitsToFloat((int) (this.g & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32))) << 32);
    }

    public final void d() {
        if (this.e) {
            this.d.setValue(jg7.a);
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
            f2 = up.g(b, f2, f3);
        } else {
            b.onPull(f2, f3);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (4294967295L & this.g)) * (-f2);
        if (i2 >= 31) {
            f = up.e(b);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.B1) {
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
            intBitsToFloat2 = up.g(c, intBitsToFloat2, f2);
        } else {
            c.onPull(intBitsToFloat2, f2);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = up.e(c);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.B1) {
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
            f2 = up.g(d, f2, intBitsToFloat);
        } else {
            d.onPull(f2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g >> 32)) * (-f2);
        if (i2 >= 31) {
            f = up.e(d);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.B1) {
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
            intBitsToFloat2 = up.g(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        float intBitsToFloat3 = Float.intBitsToFloat((int) (this.g & 4294967295L)) * intBitsToFloat2;
        if (i2 >= 31) {
            f = up.e(e);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.B1) {
            return intBitsToFloat3;
        }
        return Float.intBitsToFloat(i);
    }

    public final void i(long j) {
        boolean b = xi6.b(this.g, 0L);
        boolean b2 = xi6.b(j, this.g);
        this.g = j;
        if (!b2) {
            int E = u24.E(Float.intBitsToFloat((int) (j >> 32)));
            long E2 = (u24.E(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (E << 32);
            mr1 mr1Var = this.c;
            mr1Var.c = E2;
            EdgeEffect edgeEffect = mr1Var.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (E2 >> 32), (int) (E2 & 4294967295L));
            }
            EdgeEffect edgeEffect2 = mr1Var.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (E2 >> 32), (int) (E2 & 4294967295L));
            }
            EdgeEffect edgeEffect3 = mr1Var.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (E2 & 4294967295L), (int) (E2 >> 32));
            }
            EdgeEffect edgeEffect4 = mr1Var.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (E2 & 4294967295L), (int) (E2 >> 32));
            }
            EdgeEffect edgeEffect5 = mr1Var.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (E2 >> 32), (int) (E2 & 4294967295L));
            }
            EdgeEffect edgeEffect6 = mr1Var.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (E2 >> 32), (int) (E2 & 4294967295L));
            }
            EdgeEffect edgeEffect7 = mr1Var.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (E2 & 4294967295L), (int) (E2 >> 32));
            }
            EdgeEffect edgeEffect8 = mr1Var.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & E2), (int) (E2 >> 32));
            }
        }
        if (!b && !b2) {
            a();
        }
    }
}
