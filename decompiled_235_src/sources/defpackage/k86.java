package defpackage;

import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k86  reason: default package */
/* loaded from: classes.dex */
public final class k86 {
    public final /* synthetic */ m86 a;

    public k86(m86 m86Var) {
        this.a = m86Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x024f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(int i, long j) {
        float f;
        long j2;
        float f2;
        int i2;
        float g;
        float intBitsToFloat;
        long floatToRawIntBits;
        long e;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        m86 m86Var = this.a;
        m86Var.j = i;
        sg sgVar = m86Var.b;
        if (sgVar != null && (m86Var.a.c() || m86Var.a.b())) {
            int i4 = m86Var.j;
            ro5 ro5Var = m86Var.m;
            mr1 mr1Var = sgVar.c;
            if (xi6.f(sgVar.g)) {
                m86 m86Var2 = (m86) ro5Var.B;
                return new jk4(m86Var2.c(m86Var2.k, j, m86Var2.j)).a;
            }
            if (!sgVar.f) {
                if (mr1.g(mr1Var.f)) {
                    sgVar.f(0L);
                }
                if (mr1.g(mr1Var.g)) {
                    sgVar.g(0L);
                }
                if (mr1.g(mr1Var.d)) {
                    sgVar.h(0L);
                }
                if (mr1.g(mr1Var.e)) {
                    sgVar.e(0L);
                }
                sgVar.f = true;
            }
            int i5 = yi.a;
            if (i4 == 2) {
                f = 4.0f;
            } else {
                f = 1.0f;
            }
            long g2 = jk4.g(f, j);
            int i6 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i6) == RecyclerView.B1) {
                j2 = 4294967295L;
            } else {
                if (mr1.g(mr1Var.d) && Float.intBitsToFloat(i6) < RecyclerView.B1) {
                    float h = sgVar.h(g2);
                    j2 = 4294967295L;
                    if (!mr1.g(mr1Var.d)) {
                        mr1Var.e().finish();
                    }
                    if (h == Float.intBitsToFloat((int) (g2 & 4294967295L))) {
                        f2 = Float.intBitsToFloat(i6);
                    } else {
                        f2 = h / f;
                    }
                } else {
                    j2 = 4294967295L;
                    if (mr1.g(mr1Var.e) && Float.intBitsToFloat(i6) > RecyclerView.B1) {
                        float e2 = sgVar.e(g2);
                        if (!mr1.g(mr1Var.e)) {
                            mr1Var.b().finish();
                        }
                        if (e2 == Float.intBitsToFloat((int) (g2 & 4294967295L))) {
                            f2 = Float.intBitsToFloat(i6);
                        } else {
                            f2 = e2 / f;
                        }
                    }
                }
                i2 = (int) (j >> 32);
                if (Float.intBitsToFloat(i2) != RecyclerView.B1) {
                    if (mr1.g(mr1Var.f) && Float.intBitsToFloat(i2) < RecyclerView.B1) {
                        g = sgVar.f(g2);
                        if (!mr1.g(mr1Var.f)) {
                            mr1Var.c().finish();
                        }
                        if (g == Float.intBitsToFloat((int) (g2 >> 32))) {
                            intBitsToFloat = Float.intBitsToFloat(i2);
                        }
                        intBitsToFloat = g / f;
                    } else if (mr1.g(mr1Var.g) && Float.intBitsToFloat(i2) > RecyclerView.B1) {
                        g = sgVar.g(g2);
                        if (!mr1.g(mr1Var.g)) {
                            mr1Var.d().finish();
                        }
                        if (g == Float.intBitsToFloat((int) (g2 >> 32))) {
                            intBitsToFloat = Float.intBitsToFloat(i2);
                        }
                        intBitsToFloat = g / f;
                    }
                    floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f2) & j2);
                    if (!jk4.c(floatToRawIntBits, 0L)) {
                        sgVar.d();
                    }
                    e = jk4.e(j, floatToRawIntBits);
                    m86 m86Var3 = (m86) ro5Var.B;
                    long j3 = new jk4(m86Var3.c(m86Var3.k, e, m86Var3.j)).a;
                    long e3 = jk4.e(e, j3);
                    if ((Float.intBitsToFloat((int) (e >> 32)) == RecyclerView.B1 || Float.intBitsToFloat((int) (e & j2)) != RecyclerView.B1) && ((Float.intBitsToFloat((int) (j3 >> 32)) != RecyclerView.B1 || Float.intBitsToFloat((int) (j3 & j2)) != RecyclerView.B1) && (mr1.g(mr1Var.f) || mr1.g(mr1Var.d) || mr1.g(mr1Var.g) || mr1.g(mr1Var.e)))) {
                        sgVar.a();
                    }
                    if (i4 == 1) {
                        int i7 = (int) (e3 >> 32);
                        if (Float.intBitsToFloat(i7) > 0.5f) {
                            sgVar.f(e3);
                        } else if (Float.intBitsToFloat(i7) < -0.5f) {
                            sgVar.g(e3);
                        } else {
                            z4 = false;
                            i3 = (int) (e3 & j2);
                            if (Float.intBitsToFloat(i3) <= 0.5f) {
                                sgVar.h(e3);
                            } else if (Float.intBitsToFloat(i3) < -0.5f) {
                                sgVar.e(e3);
                            } else {
                                z5 = false;
                                if (!z4 || z5) {
                                    z = true;
                                    if (!jk4.c(e, 0L)) {
                                        if (mr1.f(mr1Var.f) && Float.intBitsToFloat(i2) < RecyclerView.B1) {
                                            EdgeEffect c = mr1Var.c();
                                            float intBitsToFloat2 = Float.intBitsToFloat(i2);
                                            if (c instanceof qs2) {
                                                qs2 qs2Var = (qs2) c;
                                                float f3 = qs2Var.b + intBitsToFloat2;
                                                qs2Var.b = f3;
                                                if (Math.abs(f3) > qs2Var.a) {
                                                    qs2Var.onRelease();
                                                }
                                            } else {
                                                c.onRelease();
                                            }
                                            z2 = mr1.f(mr1Var.f);
                                        } else {
                                            z2 = false;
                                        }
                                        if (mr1.f(mr1Var.g) && Float.intBitsToFloat(i2) > RecyclerView.B1) {
                                            EdgeEffect d = mr1Var.d();
                                            float intBitsToFloat3 = Float.intBitsToFloat(i2);
                                            if (d instanceof qs2) {
                                                qs2 qs2Var2 = (qs2) d;
                                                float f4 = qs2Var2.b + intBitsToFloat3;
                                                qs2Var2.b = f4;
                                                if (Math.abs(f4) > qs2Var2.a) {
                                                    qs2Var2.onRelease();
                                                }
                                            } else {
                                                d.onRelease();
                                            }
                                            if (!z2 && !mr1.f(mr1Var.g)) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                        }
                                        if (mr1.f(mr1Var.d) && Float.intBitsToFloat(i6) < RecyclerView.B1) {
                                            EdgeEffect e4 = mr1Var.e();
                                            float intBitsToFloat4 = Float.intBitsToFloat(i6);
                                            if (e4 instanceof qs2) {
                                                qs2 qs2Var3 = (qs2) e4;
                                                float f5 = qs2Var3.b + intBitsToFloat4;
                                                qs2Var3.b = f5;
                                                if (Math.abs(f5) > qs2Var3.a) {
                                                    qs2Var3.onRelease();
                                                }
                                            } else {
                                                e4.onRelease();
                                            }
                                            if (!z2 && !mr1.f(mr1Var.d)) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                        }
                                        if (mr1.f(mr1Var.e) && Float.intBitsToFloat(i6) > RecyclerView.B1) {
                                            EdgeEffect b = mr1Var.b();
                                            float intBitsToFloat5 = Float.intBitsToFloat(i6);
                                            if (b instanceof qs2) {
                                                qs2 qs2Var4 = (qs2) b;
                                                float f6 = qs2Var4.b + intBitsToFloat5;
                                                qs2Var4.b = f6;
                                                if (Math.abs(f6) > qs2Var4.a) {
                                                    qs2Var4.onRelease();
                                                }
                                            } else {
                                                b.onRelease();
                                            }
                                            if (!z2 && !mr1.f(mr1Var.e)) {
                                                z2 = false;
                                            } else {
                                                z2 = true;
                                            }
                                        }
                                        if (!z2 && !z) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        z = z3;
                                    }
                                    if (z) {
                                        sgVar.d();
                                    }
                                    return jk4.f(floatToRawIntBits, j3);
                                }
                            }
                            z5 = true;
                            if (!z4) {
                            }
                            z = true;
                            if (!jk4.c(e, 0L)) {
                            }
                            if (z) {
                            }
                            return jk4.f(floatToRawIntBits, j3);
                        }
                        z4 = true;
                        i3 = (int) (e3 & j2);
                        if (Float.intBitsToFloat(i3) <= 0.5f) {
                        }
                        z5 = true;
                        if (!z4) {
                        }
                        z = true;
                        if (!jk4.c(e, 0L)) {
                        }
                        if (z) {
                        }
                        return jk4.f(floatToRawIntBits, j3);
                    }
                    z = false;
                    if (!jk4.c(e, 0L)) {
                    }
                    if (z) {
                    }
                    return jk4.f(floatToRawIntBits, j3);
                }
                intBitsToFloat = 0.0f;
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f2) & j2);
                if (!jk4.c(floatToRawIntBits, 0L)) {
                }
                e = jk4.e(j, floatToRawIntBits);
                m86 m86Var32 = (m86) ro5Var.B;
                long j32 = new jk4(m86Var32.c(m86Var32.k, e, m86Var32.j)).a;
                long e32 = jk4.e(e, j32);
                if (Float.intBitsToFloat((int) (e >> 32)) == RecyclerView.B1) {
                }
                sgVar.a();
                if (i4 == 1) {
                }
                z = false;
                if (!jk4.c(e, 0L)) {
                }
                if (z) {
                }
                return jk4.f(floatToRawIntBits, j32);
            }
            f2 = 0.0f;
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != RecyclerView.B1) {
            }
            intBitsToFloat = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(f2) & j2);
            if (!jk4.c(floatToRawIntBits, 0L)) {
            }
            e = jk4.e(j, floatToRawIntBits);
            m86 m86Var322 = (m86) ro5Var.B;
            long j322 = new jk4(m86Var322.c(m86Var322.k, e, m86Var322.j)).a;
            long e322 = jk4.e(e, j322);
            if (Float.intBitsToFloat((int) (e >> 32)) == RecyclerView.B1) {
            }
            sgVar.a();
            if (i4 == 1) {
            }
            z = false;
            if (!jk4.c(e, 0L)) {
            }
            if (z) {
            }
            return jk4.f(floatToRawIntBits, j322);
        }
        return m86Var.c(m86Var.k, j, i);
    }
}
