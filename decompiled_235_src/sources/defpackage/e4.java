package defpackage;

import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qa4 B;

    public /* synthetic */ e4(qa4 qa4Var, int i) {
        this.A = i;
        this.B = qa4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x032c  */
    @Override // defpackage.eo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj, Object obj2) {
        float min;
        boolean z;
        boolean z2;
        int i = this.A;
        du duVar = ju.b;
        x64 x64Var = x64.a;
        vs0 vs0Var = ox0.a;
        float f = 1.0f;
        boolean z3 = false;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.B;
        switch (i) {
            case 0:
                o6 o6Var = (o6) obj;
                Boolean bool = (Boolean) obj2;
                bool.booleanValue();
                o6Var.getClass();
                qa4Var.setValue(new vr4(o6Var, bool));
                return jg7Var;
            case 1:
                m93 m93Var = (m93) obj;
                m93 m93Var2 = (m93) obj2;
                int i2 = m93Var2.a;
                int i3 = m93Var2.d;
                int i4 = m93Var2.c;
                int i5 = m93Var2.b;
                int i6 = m93Var.c;
                int i7 = m93Var.b;
                int i8 = m93Var.d;
                int i9 = m93Var.a;
                if (i2 < i6) {
                    if (i4 <= i9) {
                        min = 1.0f;
                    } else if (i4 - i2 != 0) {
                        min = (((Math.min(m93Var.c, i4) + Math.max(i9, i2)) / 2) - i2) / (i4 - m93Var2.a);
                    }
                    if (i5 < i8) {
                        if (i3 > i7) {
                            if (m93Var2.a() != 0) {
                                f = (((Math.min(i8, i3) + Math.max(i7, i5)) / 2) - i5) / m93Var2.a();
                            }
                        }
                        qa4Var.setValue(new i97(jx2.g(min, f)));
                        return jg7Var;
                    }
                    f = 0.0f;
                    qa4Var.setValue(new i97(jx2.g(min, f)));
                    return jg7Var;
                }
                min = 0.0f;
                if (i5 < i8) {
                }
                f = 0.0f;
                qa4Var.setValue(new i97(jx2.g(min, f)));
                return jg7Var;
            case 2:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    ((eo2) qa4Var.getValue()).o(xq2Var, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 3:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    ((eo2) qa4Var.getValue()).o(xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 4:
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z3)) {
                    String O = yh2.O(xq2Var3, R.string.cancel);
                    boolean f2 = xq2Var3.f(qa4Var);
                    Object P = xq2Var3.P();
                    if (f2 || P == vs0Var) {
                        P = new f4(qa4Var, 24);
                        xq2Var3.l0(P);
                    }
                    q60.b(O, false, (on2) P, xq2Var3, 0, 2);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 5:
                o6 o6Var2 = (o6) obj;
                Boolean bool2 = (Boolean) obj2;
                bool2.booleanValue();
                o6Var2.getClass();
                qa4Var.setValue(new vr4(o6Var2, bool2));
                return jg7Var;
            case 6:
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z3)) {
                    a74 P2 = ge7.P(dj6.c(x64Var, 1.0f), 16.0f, 8.0f);
                    l26 a = k26.a(duVar, d90.h0, xq2Var4, 6);
                    int hashCode = Long.hashCode(xq2Var4.T);
                    xv4 l = xq2Var4.l();
                    a74 E = l.E(xq2Var4, P2);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var4.f0();
                    if (xq2Var4.S) {
                        xq2Var4.k(iy0Var);
                    } else {
                        xq2Var4.o0();
                    }
                    yh2.K(xq2Var4, ix0.f, a);
                    yh2.K(xq2Var4, ix0.e, l);
                    yh2.K(xq2Var4, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var4, ix0.h);
                    yh2.K(xq2Var4, ix0.d, E);
                    Object P3 = xq2Var4.P();
                    if (P3 == vs0Var) {
                        P3 = new fb7(qa4Var, 3);
                        xq2Var4.l0(P3);
                    }
                    mb3.o((on2) P3, null, false, null, jw2.h, xq2Var4, 805306374, 510);
                    xq2Var4.p(true);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 7:
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z3)) {
                    a74 P4 = ge7.P(dj6.c(x64Var, 1.0f), 16.0f, 8.0f);
                    l26 a2 = k26.a(duVar, d90.h0, xq2Var5, 6);
                    int hashCode2 = Long.hashCode(xq2Var5.T);
                    xv4 l2 = xq2Var5.l();
                    a74 E2 = l.E(xq2Var5, P4);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var5.f0();
                    if (xq2Var5.S) {
                        xq2Var5.k(iy0Var2);
                    } else {
                        xq2Var5.o0();
                    }
                    yh2.K(xq2Var5, ix0.f, a2);
                    yh2.K(xq2Var5, ix0.e, l2);
                    yh2.K(xq2Var5, ix0.g, Integer.valueOf(hashCode2));
                    yh2.F(xq2Var5, ix0.h);
                    yh2.K(xq2Var5, ix0.d, E2);
                    Object P5 = xq2Var5.P();
                    if (P5 == vs0Var) {
                        P5 = new fb7(qa4Var, 2);
                        xq2Var5.l0(P5);
                    }
                    mb3.o((on2) P5, null, false, null, jw2.j, xq2Var5, 805306374, 510);
                    xq2Var5.p(true);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 8:
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z3)) {
                    a74 P6 = ge7.P(dj6.c(x64Var, 1.0f), 16.0f, 8.0f);
                    l26 a3 = k26.a(duVar, d90.h0, xq2Var6, 6);
                    int hashCode3 = Long.hashCode(xq2Var6.T);
                    xv4 l3 = xq2Var6.l();
                    a74 E3 = l.E(xq2Var6, P6);
                    jx0.i.getClass();
                    iy0 iy0Var3 = ix0.b;
                    xq2Var6.f0();
                    if (xq2Var6.S) {
                        xq2Var6.k(iy0Var3);
                    } else {
                        xq2Var6.o0();
                    }
                    yh2.K(xq2Var6, ix0.f, a3);
                    yh2.K(xq2Var6, ix0.e, l3);
                    yh2.K(xq2Var6, ix0.g, Integer.valueOf(hashCode3));
                    yh2.F(xq2Var6, ix0.h);
                    yh2.K(xq2Var6, ix0.d, E3);
                    Object P7 = xq2Var6.P();
                    if (P7 == vs0Var) {
                        P7 = new oe4(qa4Var, 28);
                        xq2Var6.l0(P7);
                    }
                    mb3.o((on2) P7, null, false, null, jw2.l, xq2Var6, 805306374, 510);
                    xq2Var6.p(true);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
            default:
                px0 px0Var7 = (px0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var7 = (xq2) px0Var7;
                if (xq2Var7.S(intValue7 & 1, z3)) {
                    x37.b(lb1.k("Установленные (", ((pr7) qa4Var.getValue()).f.size() + 1, ")"), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var7, 0, 0, 131070);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
        }
    }
}
