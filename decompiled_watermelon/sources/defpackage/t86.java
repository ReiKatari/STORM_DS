package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t86  reason: default package */
/* loaded from: classes.dex */
public abstract class t86 {
    public static final zy3 a = o76.e(RecyclerView.A1, 1, o76.l(RecyclerView.A1, 2, wy3.a));
    public static final xy6 b = new xy6(100, (bn1) null, 6);

    public static final void a(final mi2 mi2Var, final op0 op0Var, final op0 op0Var2, final k24 k24Var, final float f, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-743965752);
        if (sk2Var.h(mi2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (sk2Var.f(op0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (sk2Var.f(op0Var2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (sk2Var.c(f)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        boolean z5 = false;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i9 & 1, z)) {
            if ((i9 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i9 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = z3 | z2;
            if ((57344 & i9) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            if ((i9 & 896) == 256) {
                z5 = true;
            }
            boolean z8 = z7 | z5;
            Object L = sk2Var.L();
            if (z8 || L == su0.a) {
                ki2 ki2Var = new ki2() { // from class: g86
                    @Override // defpackage.ki2
                    public final Object c() {
                        op0 op0Var3 = op0.this;
                        float floatValue = ((Number) mi2Var.n(Float.valueOf(f))).floatValue();
                        k24 k24Var2 = k24Var;
                        if (Math.abs(floatValue - ((Number) k24Var2.getValue()).floatValue()) > (op0Var3.b - op0Var3.a) / 1000.0f) {
                            float floatValue2 = ((Number) ((Comparable) k24Var2.getValue())).floatValue();
                            op0 op0Var4 = op0Var2;
                            if (floatValue2 >= op0Var4.a && floatValue2 <= op0Var4.b) {
                                k24Var2.setValue(Float.valueOf(floatValue));
                            }
                        }
                        return o27.a;
                    }
                };
                sk2Var.h0(ki2Var);
                L = ki2Var;
            }
            l.j((ki2) L, sk2Var);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(op0Var, op0Var2, k24Var, f, i) { // from class: h86
                public final /* synthetic */ op0 B;
                public final /* synthetic */ op0 L;
                public final /* synthetic */ k24 R;
                public final /* synthetic */ float X;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(3073);
                    t86.a(mi2.this, this.B, this.L, this.R, this.X, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void b(final float f, final mi2 mi2Var, zy3 zy3Var, final boolean z, final op0 op0Var, final ki2 ki2Var, final eb1 eb1Var, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        zy3 zy3Var2;
        boolean z3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1962335196);
        if (sk2Var.c(f)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (sk2Var.h(mi2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (sk2Var.g(z)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i10 = i9 | i4;
        if (sk2Var.f(op0Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5 | 196608;
        if (sk2Var.h(ki2Var)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        int i12 = i11 | i6 | 12582912;
        if (sk2Var.f(eb1Var)) {
            i7 = 67108864;
        } else {
            i7 = 33554432;
        }
        int i13 = i12 | i7;
        if ((38347923 & i13) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i13 & 1, z2)) {
            sk2Var.T();
            if ((i & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
            }
            sk2Var.q();
            sk2Var.X(-1127489737);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = b31.f(sk2Var);
            }
            final l14 l14Var = (l14) L;
            sk2Var.p(false);
            final k24 L2 = me2.L(mi2Var, sk2Var);
            k24 L3 = me2.L(ki2Var, sk2Var);
            Object L4 = sk2Var.L();
            if (L4 == sn1Var) {
                L4 = pp1.A;
                sk2Var.h0(L4);
            }
            final List list = (List) L4;
            ye6 ye6Var = m33.a;
            zy3Var2 = zy3Var;
            zy3 g = o76.g(zy3Var2.f(ty3.a), 20.0f, 20.0f, RecyclerView.A1, RecyclerView.A1, 12);
            final float l = io2.l(f, op0Var.a, op0Var.b);
            zy3 e0 = ct3.e0(fz5.a(fz5.a(g, false, new mi2() { // from class: f86
                @Override // defpackage.mi2
                public final Object n(Object obj) {
                    rz5 rz5Var = (rz5) obj;
                    o27 o27Var = o27.a;
                    if (!z) {
                        l93[] l93VarArr = pz5.a;
                        rz5Var.b(mz5.j, o27Var);
                    }
                    ca6 ca6Var = new ca6(op0Var, l, mi2Var, ki2Var);
                    l93[] l93VarArr2 = pz5.a;
                    rz5Var.b(dz5.i, new w1(null, ca6Var));
                    return o27Var;
                }
            }), true, new n4(f, op0Var, 1)), z, l14Var);
            if (sk2Var.j(ov0.n) == sd3.Rtl) {
                z3 = true;
            } else {
                z3 = false;
            }
            ct3.r(w81.A(e0, new q86(z, op0Var, L2, f, z3, L3)), null, ct3.H0(2085116814, new bj2() { // from class: d86
                /* JADX WARN: Type inference failed for: r4v6, types: [k75, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v4, types: [k75, java.lang.Object, java.io.Serializable] */
                @Override // defpackage.bj2
                public final Object i(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    final boolean z5;
                    float f2;
                    op0 op0Var2;
                    pj4 pj4Var;
                    k75 k75Var;
                    k75 k75Var2;
                    List list2;
                    k75 k75Var3;
                    float f3;
                    float f4;
                    float f5;
                    int i14;
                    op0 op0Var3 = op0.this;
                    float f6 = op0Var3.b;
                    float f7 = op0Var3.a;
                    h50 h50Var = (h50) obj;
                    tu0 tu0Var2 = (tu0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        if (((sk2) tu0Var2).f(h50Var)) {
                            i14 = 4;
                        } else {
                            i14 = 2;
                        }
                        intValue |= i14;
                    }
                    if ((intValue & 19) != 18) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sk2 sk2Var2 = (sk2) tu0Var2;
                    if (sk2Var2.O(intValue & 1, z4)) {
                        if (sk2Var2.j(ov0.n) == sd3.Rtl) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        final float h = lz0.h(h50Var.b);
                        ?? obj4 = new Object();
                        ?? obj5 = new Object();
                        od1 od1Var = (od1) sk2Var2.j(ov0.h);
                        obj4.A = Math.max(h - od1Var.C(10.0f), (float) RecyclerView.A1);
                        obj5.A = Math.min(od1Var.C(10.0f), obj4.A);
                        Object L5 = sk2Var2.L();
                        Object obj6 = su0.a;
                        if (L5 == obj6) {
                            L5 = l.A(sk2Var2);
                            sk2Var2.h0(L5);
                        }
                        o31 o31Var = (o31) L5;
                        Object L6 = sk2Var2.L();
                        float f8 = f;
                        if (L6 == obj6) {
                            float f9 = obj5.A;
                            float f10 = obj4.A;
                            float f11 = f6 - f7;
                            if (f11 == RecyclerView.A1) {
                                f5 = 0.0f;
                            } else {
                                f5 = (f8 - f7) / f11;
                            }
                            if (f5 < RecyclerView.A1) {
                                f5 = 0.0f;
                            }
                            if (f5 > 1.0f) {
                                f5 = 1.0f;
                            }
                            Object pj4Var2 = new pj4(ep2.y(f9, f10, f5));
                            sk2Var2.h0(pj4Var2);
                            L6 = pj4Var2;
                        }
                        final pj4 pj4Var3 = (pj4) L6;
                        Object L7 = sk2Var2.L();
                        if (L7 == obj6) {
                            L7 = new pj4(RecyclerView.A1);
                            sk2Var2.h0(L7);
                        }
                        pj4 pj4Var4 = (pj4) L7;
                        boolean c = sk2Var2.c(obj5.A) | sk2Var2.c(obj4.A) | sk2Var2.f(op0Var3);
                        Object L8 = sk2Var2.L();
                        if (!c && L8 != obj6) {
                            op0Var2 = op0Var3;
                            f2 = f8;
                            k75Var2 = obj5;
                            k75Var = obj4;
                            pj4Var = pj4Var4;
                        } else {
                            f2 = f8;
                            op0Var2 = op0Var3;
                            pj4Var = pj4Var4;
                            k75Var = obj4;
                            k75Var2 = obj5;
                            Object b86Var = new b86(new f50(pj4Var3, pj4Var4, obj5, obj4, L2, op0Var2, 2));
                            sk2Var2.h0(b86Var);
                            L8 = b86Var;
                        }
                        final b86 b86Var2 = (b86) L8;
                        boolean f12 = sk2Var2.f(op0Var2) | sk2Var2.c(k75Var2.A) | sk2Var2.c(k75Var.A);
                        Object L9 = sk2Var2.L();
                        if (f12 || L9 == obj6) {
                            L9 = new m86(op0Var2, k75Var2, k75Var);
                            sk2Var2.h0(L9);
                        }
                        k75 k75Var4 = k75Var2;
                        float f13 = f2;
                        t86.a((mi2) ((lj2) L9), op0Var2, new op0(k75Var2.A, k75Var.A), pj4Var3, f13, sk2Var2, 3072);
                        List list3 = list;
                        boolean h2 = sk2Var2.h(list3) | sk2Var2.c(k75Var4.A) | sk2Var2.c(k75Var.A) | sk2Var2.h(o31Var) | sk2Var2.h(b86Var2);
                        ki2 ki2Var2 = ki2Var;
                        boolean f14 = h2 | sk2Var2.f(ki2Var2);
                        Object L10 = sk2Var2.L();
                        if (!f14 && L10 != obj6) {
                            list2 = list3;
                            k75Var3 = k75Var4;
                        } else {
                            L10 = new iz(pj4Var3, list3, k75Var4, k75Var, o31Var, b86Var2, ki2Var2);
                            list2 = list3;
                            k75Var3 = k75Var4;
                            sk2Var2.h0(L10);
                        }
                        final k24 L11 = me2.L((mi2) L10, sk2Var2);
                        final boolean z6 = z;
                        final l14 l14Var2 = l14Var;
                        final pj4 pj4Var5 = pj4Var;
                        ru0 ru0Var = new ru0(new bj2() { // from class: i86
                            @Override // defpackage.bj2
                            public final Object i(Object obj7, Object obj8, Object obj9) {
                                zy3 zy3Var3 = (zy3) obj7;
                                ((Integer) obj9).getClass();
                                sk2 sk2Var3 = (sk2) ((tu0) obj8);
                                sk2Var3.X(1945228890);
                                if (z6) {
                                    sk2Var3.X(-1679801122);
                                    Object L12 = sk2Var3.L();
                                    Object obj10 = su0.a;
                                    if (L12 == obj10) {
                                        L12 = l.A(sk2Var3);
                                        sk2Var3.h0(L12);
                                    }
                                    o31 o31Var2 = (o31) L12;
                                    float f15 = h;
                                    Float valueOf = Float.valueOf(f15);
                                    boolean z7 = z5;
                                    Boolean valueOf2 = Boolean.valueOf(z7);
                                    ak1 ak1Var = b86Var2;
                                    Object[] objArr = {ak1Var, l14Var2, valueOf, valueOf2};
                                    k24 k24Var = pj4Var5;
                                    ae6 ae6Var = pj4Var3;
                                    k24 k24Var2 = L11;
                                    boolean f16 = sk2Var3.f(k24Var2) | sk2Var3.g(z7) | sk2Var3.c(f15) | sk2Var3.f(k24Var) | sk2Var3.f(ae6Var) | sk2Var3.h(o31Var2) | sk2Var3.h(ak1Var);
                                    Object L13 = sk2Var3.L();
                                    if (f16 || L13 == obj10) {
                                        Object s86Var = new s86(z7, f15, k24Var, ae6Var, o31Var2, ak1Var, k24Var2);
                                        sk2Var3.h0(s86Var);
                                        L13 = s86Var;
                                    }
                                    kp4 kp4Var = pk6.a;
                                    zy3Var3 = zy3Var3.f(new ok6(null, null, objArr, (PointerInputEventHandler) L13, 3));
                                    sk2Var3.p(false);
                                } else {
                                    sk2Var3.X(-1678708124);
                                    sk2Var3.p(false);
                                }
                                sk2Var3.p(false);
                                return zy3Var3;
                            }
                        });
                        jf4 jf4Var = jf4.Horizontal;
                        boolean booleanValue = ((Boolean) b86Var2.B.getValue()).booleanValue();
                        boolean f15 = sk2Var2.f(L11);
                        Object L12 = sk2Var2.L();
                        if (f15 || L12 == obj6) {
                            L12 = new n86(L11, null);
                            sk2Var2.h0(L12);
                        }
                        zy3 a2 = yj1.a(wy3.a, b86Var2, jf4Var, z6, l14Var2, booleanValue, (bj2) L12, z5);
                        float l2 = io2.l(f13, f7, f6);
                        float f16 = f6 - f7;
                        if (f16 == RecyclerView.A1) {
                            f3 = 0.0f;
                        } else {
                            f3 = (l2 - f7) / f16;
                        }
                        if (f3 < RecyclerView.A1) {
                            f3 = 0.0f;
                        }
                        if (f3 > 1.0f) {
                            f4 = 1.0f;
                        } else {
                            f4 = f3;
                        }
                        List list4 = list2;
                        t86.c(z6, f4, list4, eb1Var, k75Var.A - k75Var3.A, l14Var2, ru0Var.f(a2), sk2Var2, 0);
                    } else {
                        sk2Var2.R();
                    }
                    return o27.a;
                }
            }, sk2Var), sk2Var, 3072);
        } else {
            zy3Var2 = zy3Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            final zy3 zy3Var3 = zy3Var2;
            r.d = new aj2(f, mi2Var, zy3Var3, z, op0Var, ki2Var, eb1Var, i) { // from class: e86
                public final /* synthetic */ float A;
                public final /* synthetic */ mi2 B;
                public final /* synthetic */ zy3 L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ op0 X;
                public final /* synthetic */ ki2 Y;
                public final /* synthetic */ eb1 Z;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(385);
                    t86.b(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void c(final boolean z, final float f, final List list, final eb1 eb1Var, final float f2, final l14 l14Var, final zy3 zy3Var, tu0 tu0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1679682785);
        if (sk2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (sk2Var.c(f)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (sk2Var.h(list)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (sk2Var.f(eb1Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (sk2Var.c(f2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (sk2Var.f(l14Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (sk2Var.f(zy3Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i15 & 1, z2)) {
            zy3 f3 = zy3Var.f(a);
            tv3 d = d50.d(y60.L, false);
            int j0 = dt3.j0(sk2Var);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, f3);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            dn dnVar = mu0.g;
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                b31.w(j0, sk2Var, j0, dnVar);
            }
            oo2.S(sk2Var, mu0.d, e0);
            od1 od1Var = (od1) sk2Var.j(ov0.h);
            float C = od1Var.C(4.0f);
            float C2 = od1Var.C(10.0f);
            float D0 = od1Var.D0(f2) * f;
            int i16 = i15 >> 6;
            int i17 = i15 << 9;
            e(o76.c, eb1Var, z, f, list, C2, C, sk2Var, (i16 & 112) | 3078 | ((i15 << 6) & 896) | (i17 & 57344) | (i17 & 458752));
            d(D0, l14Var, eb1Var, z, sk2Var, (i16 & 7168) | 1572918 | ((i15 << 3) & 57344) | ((i15 << 15) & 458752));
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(z, f, list, eb1Var, f2, l14Var, zy3Var, i) { // from class: j86
                public final /* synthetic */ boolean A;
                public final /* synthetic */ float B;
                public final /* synthetic */ List L;
                public final /* synthetic */ eb1 R;
                public final /* synthetic */ float X;
                public final /* synthetic */ l14 Y;
                public final /* synthetic */ zy3 Z;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    t86.c(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final void d(final float f, final l14 l14Var, final eb1 eb1Var, final boolean z, tu0 tu0Var, final int i) {
        int i2;
        boolean z2;
        boolean z3;
        float f2;
        long j;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        y60 y60Var = y60.n0;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(428907178);
        if ((i & 6) == 0) {
            if (sk2Var.f(y60Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        int i10 = i & 48;
        wy3 wy3Var = wy3.a;
        if (i10 == 0) {
            if (sk2Var.f(wy3Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.c(f)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.f(l14Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.f(eb1Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.g(z)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (sk2Var.c(20.0f)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i2 |= i3;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i2 & 1, z2)) {
            zy3 i11 = y60Var.i(b53.b0(wy3Var, f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14), y60.Y);
            tv3 d = d50.d(y60.L, false);
            int j0 = dt3.j0(sk2Var);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, i11);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            dn dnVar = mu0.g;
            if (sk2Var.S || !b53.x(sk2Var.L(), Integer.valueOf(j0))) {
                b31.w(j0, sk2Var, j0, dnVar);
            }
            oo2.S(sk2Var, mu0.d, e0);
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = new xa6();
                sk2Var.h0(L);
            }
            xa6 xa6Var = (xa6) L;
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L2 = sk2Var.L();
            if (z3 || L2 == sn1Var) {
                L2 = new h91(l14Var, xa6Var, null, 1);
                sk2Var.h0(L2);
            }
            l.g(sk2Var, (aj2) L2, l14Var);
            if (!xa6Var.isEmpty()) {
                f2 = 6.0f;
            } else {
                f2 = 1.0f;
            }
            zy3 Q = mh7.Q(gy2.a(o76.i(wy3Var, 20.0f, 20.0f), l14Var, lg5.a(4, false)), l14Var);
            if (!z) {
                f2 = RecyclerView.A1;
            }
            float f3 = f2;
            fr5 fr5Var = gr5.a;
            zy3 Q2 = jk2.Q(Q, f3, fr5Var, false, 0L, 24);
            sk2Var.X(-1733795637);
            if (z) {
                j = eb1Var.a;
            } else {
                j = eb1Var.b;
            }
            k24 L3 = me2.L(new xq0(j), sk2Var);
            sk2Var.p(false);
            cg2.k(sk2Var, dk7.i(Q2, ((xq0) L3.getValue()).a, fr5Var));
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: k86
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t86.d(f, l14Var, eb1Var, z, (tu0) obj, ep2.I(i | 1));
                    return o27.a;
                }
            };
        }
    }

    public static final void e(final zy3 zy3Var, final eb1 eb1Var, final boolean z, final float f, final List list, final float f2, final float f3, tu0 tu0Var, final int i) {
        int i2;
        final float f4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1833126050);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(eb1Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.g(z)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.c(RecyclerView.A1)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.c(f)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.h(list)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            f4 = f2;
            if (sk2Var.c(f4)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            f4 = f2;
        }
        if ((12582912 & i) == 0) {
            if (sk2Var.c(f3)) {
                i3 = 8388608;
            } else {
                i3 = 4194304;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((4793491 & i11) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i11 & 1, z2)) {
            final k24 b2 = eb1Var.b(z, false, sk2Var);
            final k24 b3 = eb1Var.b(z, true, sk2Var);
            final k24 a2 = eb1Var.a(z, false, sk2Var);
            final k24 a3 = eb1Var.a(z, true, sk2Var);
            if ((i11 & 3670016) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f5 = z3 | sk2Var.f(b2);
            if ((29360128 & i11) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = f5 | z4;
            if ((57344 & i11) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = z7 | z5;
            if ((i11 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean f6 = z8 | z6 | sk2Var.f(b3) | sk2Var.h(list) | sk2Var.f(a2) | sk2Var.f(a3);
            Object L = sk2Var.L();
            if (f6 || L == su0.a) {
                mi2 mi2Var = new mi2() { // from class: l86
                    @Override // defpackage.mi2
                    public final Object n(Object obj) {
                        boolean z9;
                        float f7;
                        long j;
                        long j2;
                        int i12;
                        k24 k24Var;
                        boolean z10;
                        hk1 hk1Var = (hk1) obj;
                        if (hk1Var.getLayoutDirection() == sd3.Rtl) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        float intBitsToFloat = Float.intBitsToFloat((int) (hk1Var.f0() & 4294967295L));
                        long floatToRawIntBits = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (hk1Var.d() >> 32)) - f4;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (hk1Var.f0() & 4294967295L));
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                        if (z9) {
                            j2 = floatToRawIntBits;
                            j = floatToRawIntBits2;
                        } else {
                            j = floatToRawIntBits;
                            j2 = j;
                        }
                        if (!z9) {
                            j2 = floatToRawIntBits2;
                        }
                        long j3 = ((xq0) b2.getValue()).a;
                        float f8 = f3;
                        hk1.W(hk1Var, j3, j, j2, f8, 1, 480);
                        int i13 = (int) (j >> 32);
                        float f9 = f;
                        float intBitsToFloat4 = ((Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat(i13)) * f9) + Float.intBitsToFloat(i13);
                        long j4 = j;
                        long j5 = j2;
                        hk1.W(hk1Var, ((xq0) b3.getValue()).a, (Float.floatToRawIntBits(((Float.intBitsToFloat(i12) - Float.intBitsToFloat(i13)) * RecyclerView.A1) + Float.intBitsToFloat(i13)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hk1Var.f0() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (hk1Var.f0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32), f8, 1, 480);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list) {
                            float floatValue = ((Number) obj2).floatValue();
                            if (floatValue <= f9 && floatValue >= RecyclerView.A1) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            Boolean valueOf = Boolean.valueOf(z10);
                            Object obj3 = linkedHashMap.get(valueOf);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(valueOf, obj3);
                            }
                            ((List) obj3).add(obj2);
                        }
                        Iterator it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list2 = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(list2.size());
                            int size = list2.size();
                            int i14 = 0;
                            while (i14 < size) {
                                float intBitsToFloat5 = Float.intBitsToFloat((int) (ln2.J(j4, j5, ((Number) list2.get(i14)).floatValue()) >> 32));
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (hk1Var.f0() & 4294967295L));
                                arrayList.add(new mb4((Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L)));
                                i14++;
                                it = it;
                                list2 = list2;
                            }
                            Iterator it2 = it;
                            if (booleanValue) {
                                k24Var = a2;
                            } else {
                                k24Var = a3;
                            }
                            hk1Var.U(arrayList, ((xq0) k24Var.getValue()).a, f8);
                            it = it2;
                        }
                        return o27.a;
                    }
                };
                sk2Var.h0(mi2Var);
                L = mi2Var;
            }
            dt3.j(zy3Var, (mi2) L, sk2Var, i11 & 14);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: c86
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t86.e(zy3.this, eb1Var, z, f, list, f2, f3, (tu0) obj, ep2.I(i | 1));
                    return o27.a;
                }
            };
        }
    }
}
