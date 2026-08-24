package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jk6  reason: default package */
/* loaded from: classes.dex */
public abstract class jk6 {
    public static final a74 a = dj6.f(dj6.m(RecyclerView.B1, 2, x64.a), RecyclerView.B1, 48.0f, 1);
    public static final sc7 b = new sc7(100, (hr1) null, 6);

    public static final void a(final qn2 qn2Var, final bs0 bs0Var, final bs0 bs0Var2, final qa4 qa4Var, final float f, px0 px0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-743965752);
        if (xq2Var.h(qn2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (xq2Var.f(bs0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (xq2Var.f(bs0Var2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (xq2Var.c(f)) {
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
        if (xq2Var.S(i9 & 1, z)) {
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
            Object P = xq2Var.P();
            if (z8 || P == ox0.a) {
                on2 on2Var = new on2() { // from class: vj6
                    @Override // defpackage.on2
                    public final Object c() {
                        bs0 bs0Var3 = bs0.this;
                        float floatValue = ((Number) qn2Var.g(Float.valueOf(f))).floatValue();
                        qa4 qa4Var2 = qa4Var;
                        if (Math.abs(floatValue - ((Number) qa4Var2.getValue()).floatValue()) > (bs0Var3.b - bs0Var3.a) / 1000.0f) {
                            float floatValue2 = ((Number) ((Comparable) qa4Var2.getValue())).floatValue();
                            bs0 bs0Var4 = bs0Var2;
                            if (floatValue2 >= bs0Var4.a && floatValue2 <= bs0Var4.b) {
                                qa4Var2.setValue(Float.valueOf(floatValue));
                            }
                        }
                        return jg7.a;
                    }
                };
                xq2Var.l0(on2Var);
                P = on2Var;
            }
            mb3.n((on2) P, xq2Var);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(bs0Var, bs0Var2, qa4Var, f, i) { // from class: wj6
                public final /* synthetic */ bs0 B;
                public final /* synthetic */ bs0 L;
                public final /* synthetic */ qa4 R;
                public final /* synthetic */ float X;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(3073);
                    jk6.a(qn2.this, this.B, this.L, this.R, this.X, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final float f, final qn2 qn2Var, a74 a74Var, boolean z, final bs0 bs0Var, int i, on2 on2Var, final cf1 cf1Var, px0 px0Var, final int i2, final int i3) {
        int i4;
        a74 a74Var2;
        int i5;
        int i6;
        final boolean z2;
        int i7;
        int i8;
        final int i9;
        int i10;
        int i11;
        final on2 on2Var2;
        int i12;
        int i13;
        cf1 cf1Var2;
        int i14;
        boolean z3;
        final a74 a74Var3;
        final int i15;
        cf5 t;
        a74 a74Var4;
        boolean z4;
        boolean z5;
        int i16;
        int i17;
        int i18;
        int i19;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1962335196);
        if ((i2 & 6) == 0) {
            if (xq2Var.c(f)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i4 = i19 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(qn2Var)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i4 |= i18;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
            i6 = i3 & 8;
            if (i6 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                z2 = z;
                if (xq2Var.g(z2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
                if ((i2 & 24576) == 0) {
                    if (xq2Var.f(bs0Var)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i4 |= i17;
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= 196608;
                } else if ((196608 & i2) == 0) {
                    i9 = i;
                    if (xq2Var.d(i9)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i4 |= i10;
                    i11 = i3 & 64;
                    if (i11 == 0) {
                        i4 |= 1572864;
                    } else if ((1572864 & i2) == 0) {
                        on2Var2 = on2Var;
                        if (xq2Var.h(on2Var2)) {
                            i12 = 1048576;
                        } else {
                            i12 = 524288;
                        }
                        i4 |= i12;
                        i13 = i4 | 12582912;
                        if ((100663296 & i2) == 0) {
                            cf1Var2 = cf1Var;
                            if (xq2Var.f(cf1Var2)) {
                                i16 = 67108864;
                            } else {
                                i16 = 33554432;
                            }
                            i13 |= i16;
                        } else {
                            cf1Var2 = cf1Var;
                        }
                        i14 = i13;
                        if ((i13 & 38347923) != 38347922) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (xq2Var.S(i14 & 1, z3)) {
                            xq2Var.X();
                            if ((i2 & 1) != 0 && !xq2Var.B()) {
                                xq2Var.V();
                                a74Var4 = a74Var2;
                            } else {
                                if (i20 != 0) {
                                    a74Var4 = x64.a;
                                } else {
                                    a74Var4 = a74Var2;
                                }
                                if (i6 != 0) {
                                    z2 = true;
                                }
                                if (i8 != 0) {
                                    i9 = 0;
                                }
                                if (i11 != 0) {
                                    on2Var2 = null;
                                }
                            }
                            final boolean z6 = z2;
                            xq2Var.q();
                            xq2Var.b0(-1127489737);
                            Object P = xq2Var.P();
                            vs0 vs0Var = ox0.a;
                            if (P == vs0Var) {
                                P = i61.f(xq2Var);
                            }
                            final r94 r94Var = (r94) P;
                            xq2Var.p(false);
                            if (i9 >= 0) {
                                final qa4 b0 = np2.b0(qn2Var, xq2Var);
                                qa4 b02 = np2.b0(on2Var2, xq2Var);
                                if ((i14 & 458752) == 131072) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                ArrayList P2 = xq2Var.P();
                                if (z4 || P2 == vs0Var) {
                                    if (i9 == 0) {
                                        P2 = yt1.A;
                                    } else {
                                        int i21 = i9 + 2;
                                        ArrayList arrayList = new ArrayList(i21);
                                        for (int i22 = 0; i22 < i21; i22++) {
                                            arrayList.add(Float.valueOf(i22 / (i9 + 1)));
                                        }
                                        P2 = arrayList;
                                    }
                                    xq2Var.l0(P2);
                                }
                                final List list = (List) P2;
                                nq6 nq6Var = u93.a;
                                a74 h = dj6.h(a74Var4.d(m64.a), 20.0f, 20.0f, RecyclerView.B1, RecyclerView.B1, 12);
                                final float p = gi2.p(f, bs0Var.a, bs0Var.b);
                                a74 d0 = nw7.d0(ua6.a(ua6.a(h, false, new qn2() { // from class: uj6
                                    @Override // defpackage.qn2
                                    public final Object g(Object obj) {
                                        gb6 gb6Var = (gb6) obj;
                                        jg7 jg7Var = jg7.a;
                                        if (!z6) {
                                            fg3[] fg3VarArr = eb6.a;
                                            gb6Var.a(bb6.j, jg7Var);
                                        }
                                        final bs0 bs0Var2 = bs0Var;
                                        final int i23 = i9;
                                        final float f2 = p;
                                        final qn2 qn2Var2 = qn2Var;
                                        final on2 on2Var3 = on2Var2;
                                        qn2 qn2Var3 = new qn2() { // from class: xj6
                                            @Override // defpackage.qn2
                                            public final Object g(Object obj2) {
                                                int i24;
                                                float floatValue = ((Float) obj2).floatValue();
                                                bs0 bs0Var3 = bs0.this;
                                                float f3 = bs0Var3.a;
                                                float f4 = bs0Var3.b;
                                                float p2 = gi2.p(floatValue, f3, f4);
                                                int i25 = i23;
                                                boolean z7 = false;
                                                if (i25 > 0 && (i24 = i25 + 1) >= 0) {
                                                    float f5 = p2;
                                                    float f6 = f5;
                                                    int i26 = 0;
                                                    while (true) {
                                                        float L = oi2.L(f3, f4, i26 / i24);
                                                        float f7 = L - p2;
                                                        if (Math.abs(f7) <= f5) {
                                                            f5 = Math.abs(f7);
                                                            f6 = L;
                                                        }
                                                        if (i26 == i24) {
                                                            break;
                                                        }
                                                        i26++;
                                                    }
                                                    p2 = f6;
                                                }
                                                if (p2 != f2) {
                                                    qn2Var2.g(Float.valueOf(p2));
                                                    on2 on2Var4 = on2Var3;
                                                    if (on2Var4 != null) {
                                                        on2Var4.c();
                                                    }
                                                    z7 = true;
                                                }
                                                return Boolean.valueOf(z7);
                                            }
                                        };
                                        fg3[] fg3VarArr2 = eb6.a;
                                        gb6Var.a(sa6.i, new y1(null, qn2Var3));
                                        return jg7Var;
                                    }
                                }), true, new f45(f, bs0Var, i9)), z6, r94Var);
                                if (xq2Var.j(ky0.n) == kk3.Rtl) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (i9 >= 0) {
                                    int i23 = i9;
                                    final cf1 cf1Var3 = cf1Var2;
                                    final on2 on2Var3 = on2Var2;
                                    nw7.j(u24.A(d0, new gk6(z6, bs0Var, i23, b0, f, z5, b02)), null, n16.I(2085116814, new fo2() { // from class: sj6
                                        /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, ah5] */
                                        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, ah5, java.io.Serializable] */
                                        @Override // defpackage.fo2
                                        public final Object e(Object obj, Object obj2, Object obj3) {
                                            boolean z7;
                                            final boolean z8;
                                            float f2;
                                            bs0 bs0Var2;
                                            rs4 rs4Var;
                                            ah5 ah5Var;
                                            ah5 ah5Var2;
                                            List list2;
                                            ah5 ah5Var3;
                                            float f3;
                                            float f4;
                                            float f5;
                                            int i24;
                                            bs0 bs0Var3 = bs0.this;
                                            float f6 = bs0Var3.b;
                                            float f7 = bs0Var3.a;
                                            l70 l70Var = (l70) obj;
                                            px0 px0Var2 = (px0) obj2;
                                            int intValue = ((Integer) obj3).intValue();
                                            if ((intValue & 6) == 0) {
                                                if (((xq2) px0Var2).f(l70Var)) {
                                                    i24 = 4;
                                                } else {
                                                    i24 = 2;
                                                }
                                                intValue |= i24;
                                            }
                                            if ((intValue & 19) != 18) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            xq2 xq2Var2 = (xq2) px0Var2;
                                            if (xq2Var2.S(intValue & 1, z7)) {
                                                if (xq2Var2.j(ky0.n) == kk3.Rtl) {
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                final float h2 = q21.h(l70Var.b);
                                                ?? obj4 = new Object();
                                                ?? obj5 = new Object();
                                                qh1 qh1Var = (qh1) xq2Var2.j(ky0.h);
                                                obj4.A = Math.max(h2 - qh1Var.e0(10.0f), (float) RecyclerView.B1);
                                                obj5.A = Math.min(qh1Var.e0(10.0f), obj4.A);
                                                Object P3 = xq2Var2.P();
                                                Object obj6 = ox0.a;
                                                if (P3 == obj6) {
                                                    P3 = mb3.w(xq2Var2);
                                                    xq2Var2.l0(P3);
                                                }
                                                w61 w61Var = (w61) P3;
                                                Object P4 = xq2Var2.P();
                                                float f8 = f;
                                                if (P4 == obj6) {
                                                    float f9 = obj5.A;
                                                    float f10 = obj4.A;
                                                    float f11 = f6 - f7;
                                                    if (f11 == RecyclerView.B1) {
                                                        f5 = 0.0f;
                                                    } else {
                                                        f5 = (f8 - f7) / f11;
                                                    }
                                                    if (f5 < RecyclerView.B1) {
                                                        f5 = 0.0f;
                                                    }
                                                    if (f5 > 1.0f) {
                                                        f5 = 1.0f;
                                                    }
                                                    Object rs4Var2 = new rs4(oi2.L(f9, f10, f5));
                                                    xq2Var2.l0(rs4Var2);
                                                    P4 = rs4Var2;
                                                }
                                                final rs4 rs4Var3 = (rs4) P4;
                                                Object P5 = xq2Var2.P();
                                                if (P5 == obj6) {
                                                    P5 = new rs4(RecyclerView.B1);
                                                    xq2Var2.l0(P5);
                                                }
                                                rs4 rs4Var4 = (rs4) P5;
                                                boolean c = xq2Var2.c(obj5.A) | xq2Var2.c(obj4.A) | xq2Var2.f(bs0Var3);
                                                Object P6 = xq2Var2.P();
                                                if (!c && P6 != obj6) {
                                                    bs0Var2 = bs0Var3;
                                                    f2 = f8;
                                                    ah5Var2 = obj5;
                                                    ah5Var = obj4;
                                                    rs4Var = rs4Var4;
                                                } else {
                                                    f2 = f8;
                                                    bs0Var2 = bs0Var3;
                                                    rs4Var = rs4Var4;
                                                    ah5Var = obj4;
                                                    ah5Var2 = obj5;
                                                    Object qj6Var = new qj6(new j70(rs4Var3, rs4Var4, obj5, obj4, b0, bs0Var2, 2));
                                                    xq2Var2.l0(qj6Var);
                                                    P6 = qj6Var;
                                                }
                                                final qj6 qj6Var2 = (qj6) P6;
                                                boolean f12 = xq2Var2.f(bs0Var2) | xq2Var2.c(ah5Var2.A) | xq2Var2.c(ah5Var.A);
                                                Object P7 = xq2Var2.P();
                                                if (f12 || P7 == obj6) {
                                                    P7 = new ck6(bs0Var2, ah5Var2, ah5Var);
                                                    xq2Var2.l0(P7);
                                                }
                                                ah5 ah5Var4 = ah5Var2;
                                                float f13 = f2;
                                                jk6.a((qn2) ((po2) P7), bs0Var2, new bs0(ah5Var2.A, ah5Var.A), rs4Var3, f13, xq2Var2, 3072);
                                                List list3 = list;
                                                boolean h3 = xq2Var2.h(list3) | xq2Var2.c(ah5Var4.A) | xq2Var2.c(ah5Var.A) | xq2Var2.h(w61Var) | xq2Var2.h(qj6Var2);
                                                on2 on2Var4 = on2Var3;
                                                boolean f14 = h3 | xq2Var2.f(on2Var4);
                                                Object P8 = xq2Var2.P();
                                                if (!f14 && P8 != obj6) {
                                                    list2 = list3;
                                                    ah5Var3 = ah5Var4;
                                                } else {
                                                    P8 = new z00(rs4Var3, list3, ah5Var4, ah5Var, w61Var, qj6Var2, on2Var4);
                                                    list2 = list3;
                                                    ah5Var3 = ah5Var4;
                                                    xq2Var2.l0(P8);
                                                }
                                                final qa4 b03 = np2.b0((qn2) P8, xq2Var2);
                                                final boolean z9 = z6;
                                                final r94 r94Var2 = r94Var;
                                                final rs4 rs4Var5 = rs4Var;
                                                nx0 nx0Var = new nx0(new fo2() { // from class: yj6
                                                    @Override // defpackage.fo2
                                                    public final Object e(Object obj7, Object obj8, Object obj9) {
                                                        a74 a74Var5 = (a74) obj7;
                                                        ((Integer) obj9).getClass();
                                                        xq2 xq2Var3 = (xq2) ((px0) obj8);
                                                        xq2Var3.b0(1945228890);
                                                        if (z9) {
                                                            xq2Var3.b0(-1679801122);
                                                            Object P9 = xq2Var3.P();
                                                            Object obj10 = ox0.a;
                                                            if (P9 == obj10) {
                                                                P9 = mb3.w(xq2Var3);
                                                                xq2Var3.l0(P9);
                                                            }
                                                            w61 w61Var2 = (w61) P9;
                                                            float f15 = h2;
                                                            Float valueOf = Float.valueOf(f15);
                                                            boolean z10 = z8;
                                                            Boolean valueOf2 = Boolean.valueOf(z10);
                                                            go1 go1Var = qj6Var2;
                                                            Object[] objArr = {go1Var, r94Var2, valueOf, valueOf2};
                                                            qa4 qa4Var = rs4Var5;
                                                            pp6 pp6Var = rs4Var3;
                                                            qa4 qa4Var2 = b03;
                                                            boolean f16 = xq2Var3.f(qa4Var2) | xq2Var3.g(z10) | xq2Var3.c(f15) | xq2Var3.f(qa4Var) | xq2Var3.f(pp6Var) | xq2Var3.h(w61Var2) | xq2Var3.h(go1Var);
                                                            Object P10 = xq2Var3.P();
                                                            if (f16 || P10 == obj10) {
                                                                Object ik6Var = new ik6(z10, f15, qa4Var, pp6Var, w61Var2, go1Var, qa4Var2);
                                                                xq2Var3.l0(ik6Var);
                                                                P10 = ik6Var;
                                                            }
                                                            oy4 oy4Var = jw6.a;
                                                            a74Var5 = a74Var5.d(new iw6(null, null, objArr, (PointerInputEventHandler) P10, 3));
                                                            xq2Var3.p(false);
                                                        } else {
                                                            xq2Var3.b0(-1678708124);
                                                            xq2Var3.p(false);
                                                        }
                                                        xq2Var3.p(false);
                                                        return a74Var5;
                                                    }
                                                });
                                                lo4 lo4Var = lo4.Horizontal;
                                                boolean booleanValue = ((Boolean) qj6Var2.B.getValue()).booleanValue();
                                                boolean f15 = xq2Var2.f(b03);
                                                Object P9 = xq2Var2.P();
                                                if (f15 || P9 == obj6) {
                                                    P9 = new dk6(b03, null);
                                                    xq2Var2.l0(P9);
                                                }
                                                a74 a2 = eo1.a(x64.a, qj6Var2, lo4Var, z9, r94Var2, booleanValue, (fo2) P9, z8);
                                                float p2 = gi2.p(f13, f7, f6);
                                                float f16 = f6 - f7;
                                                if (f16 == RecyclerView.B1) {
                                                    f3 = 0.0f;
                                                } else {
                                                    f3 = (p2 - f7) / f16;
                                                }
                                                if (f3 < RecyclerView.B1) {
                                                    f3 = 0.0f;
                                                }
                                                if (f3 > 1.0f) {
                                                    f4 = 1.0f;
                                                } else {
                                                    f4 = f3;
                                                }
                                                List list4 = list2;
                                                jk6.c(z9, f4, list4, cf1Var3, ah5Var.A - ah5Var3.A, r94Var2, nx0Var.d(a2), xq2Var2, 0);
                                            } else {
                                                xq2Var2.V();
                                            }
                                            return jg7.a;
                                        }
                                    }, xq2Var), xq2Var, 3072);
                                    z2 = z6;
                                    a74Var3 = a74Var4;
                                    i15 = i23;
                                } else {
                                    i.h("steps should be >= 0");
                                    return;
                                }
                            } else {
                                i.h("steps should be >= 0");
                                return;
                            }
                        } else {
                            xq2Var.V();
                            a74Var3 = a74Var2;
                            i15 = i9;
                        }
                        final on2 on2Var4 = on2Var2;
                        t = xq2Var.t();
                        if (t != null) {
                            t.d = new eo2() { // from class: tj6
                                @Override // defpackage.eo2
                                public final Object o(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    jk6.b(f, qn2Var, a74Var3, z2, bs0Var, i15, on2Var4, cf1Var, (px0) obj, ii2.a0(i2 | 1), i3);
                                    return jg7.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    on2Var2 = on2Var;
                    i13 = i4 | 12582912;
                    if ((100663296 & i2) == 0) {
                    }
                    i14 = i13;
                    if ((i13 & 38347923) != 38347922) {
                    }
                    if (xq2Var.S(i14 & 1, z3)) {
                    }
                    final on2 on2Var42 = on2Var2;
                    t = xq2Var.t();
                    if (t != null) {
                    }
                }
                i9 = i;
                i11 = i3 & 64;
                if (i11 == 0) {
                }
                on2Var2 = on2Var;
                i13 = i4 | 12582912;
                if ((100663296 & i2) == 0) {
                }
                i14 = i13;
                if ((i13 & 38347923) != 38347922) {
                }
                if (xq2Var.S(i14 & 1, z3)) {
                }
                final on2 on2Var422 = on2Var2;
                t = xq2Var.t();
                if (t != null) {
                }
            }
            z2 = z;
            if ((i2 & 24576) == 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i;
            i11 = i3 & 64;
            if (i11 == 0) {
            }
            on2Var2 = on2Var;
            i13 = i4 | 12582912;
            if ((100663296 & i2) == 0) {
            }
            i14 = i13;
            if ((i13 & 38347923) != 38347922) {
            }
            if (xq2Var.S(i14 & 1, z3)) {
            }
            final on2 on2Var4222 = on2Var2;
            t = xq2Var.t();
            if (t != null) {
            }
        }
        a74Var2 = a74Var;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        z2 = z;
        if ((i2 & 24576) == 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i;
        i11 = i3 & 64;
        if (i11 == 0) {
        }
        on2Var2 = on2Var;
        i13 = i4 | 12582912;
        if ((100663296 & i2) == 0) {
        }
        i14 = i13;
        if ((i13 & 38347923) != 38347922) {
        }
        if (xq2Var.S(i14 & 1, z3)) {
        }
        final on2 on2Var42222 = on2Var2;
        t = xq2Var.t();
        if (t != null) {
        }
    }

    public static final void c(final boolean z, final float f, final List list, final cf1 cf1Var, final float f2, final r94 r94Var, final a74 a74Var, px0 px0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1679682785);
        if (xq2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (xq2Var.c(f)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (xq2Var.h(list)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (xq2Var.f(cf1Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (xq2Var.c(f2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (xq2Var.f(r94Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (xq2Var.f(a74Var)) {
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
        if (xq2Var.S(i15 & 1, z2)) {
            a74 d = a74Var.d(a);
            e34 d2 = h70.d(d90.L, false);
            int B = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, d);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l);
            pn pnVar = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                i61.v(B, xq2Var, B, pnVar);
            }
            yh2.K(xq2Var, ix0.d, E);
            qh1 qh1Var = (qh1) xq2Var.j(ky0.h);
            float e0 = qh1Var.e0(4.0f);
            float e02 = qh1Var.e0(10.0f);
            float T = qh1Var.T(f2) * f;
            int i16 = i15 >> 6;
            int i17 = i15 << 9;
            e(dj6.c, cf1Var, z, f, list, e02, e0, xq2Var, (i16 & 112) | 3078 | ((i15 << 6) & 896) | (i17 & 57344) | (i17 & 458752));
            d(T, r94Var, cf1Var, z, xq2Var, (i16 & 7168) | 1572918 | ((i15 << 3) & 57344) | ((i15 << 15) & 458752));
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(z, f, list, cf1Var, f2, r94Var, a74Var, i) { // from class: zj6
                public final /* synthetic */ boolean A;
                public final /* synthetic */ float B;
                public final /* synthetic */ List L;
                public final /* synthetic */ cf1 R;
                public final /* synthetic */ float X;
                public final /* synthetic */ r94 Y;
                public final /* synthetic */ a74 Z;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1);
                    jk6.c(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void d(final float f, final r94 r94Var, final cf1 cf1Var, final boolean z, px0 px0Var, final int i) {
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
        vs0 vs0Var = vs0.Y;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(428907178);
        if ((i & 6) == 0) {
            if (xq2Var.f(vs0Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        int i10 = i & 48;
        x64 x64Var = x64.a;
        if (i10 == 0) {
            if (xq2Var.f(x64Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.c(f)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.f(r94Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i2 |= i6;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.f(cf1Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i2 |= i5;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.g(z)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i2 |= i4;
        }
        if ((1572864 & i) == 0) {
            if (xq2Var.c(20.0f)) {
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
        if (xq2Var.S(i2 & 1, z2)) {
            a74 n = vs0Var.n(ge7.S(x64Var, f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), d90.Y);
            e34 d = h70.d(d90.L, false);
            int B = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, n);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d);
            yh2.K(xq2Var, ix0.e, l);
            pn pnVar = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                i61.v(B, xq2Var, B, pnVar);
            }
            yh2.K(xq2Var, ix0.d, E);
            Object P = xq2Var.P();
            vs0 vs0Var2 = ox0.a;
            if (P == vs0Var2) {
                P = new mm6();
                xq2Var.l0(P);
            }
            mm6 mm6Var = (mm6) P;
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = xq2Var.P();
            if (z3 || P2 == vs0Var2) {
                P2 = new dd1(r94Var, mm6Var, null, 1);
                xq2Var.l0(P2);
            }
            mb3.i(xq2Var, (eo2) P2, r94Var);
            if (!mm6Var.isEmpty()) {
                f2 = 6.0f;
            } else {
                f2 = 1.0f;
            }
            a74 S = nc1.S(k43.a(dj6.j(x64Var, 20.0f, 20.0f), r94Var, jq5.a(4, 0L, false)), r94Var);
            if (!z) {
                f2 = RecyclerView.B1;
            }
            float f3 = f2;
            y16 y16Var = z16.a;
            a74 E2 = nj2.E(S, f3, y16Var, false, 0L, 24);
            xq2Var.b0(-1733795637);
            if (z) {
                j = cf1Var.a;
            } else {
                j = cf1Var.b;
            }
            qa4 b0 = np2.b0(new kt0(j), xq2Var);
            xq2Var.p(false);
            gi2.h(xq2Var, vy7.L(E2, ((kt0) b0.getValue()).a, y16Var));
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: ak6
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jk6.d(f, r94Var, cf1Var, z, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static final void e(final a74 a74Var, final cf1 cf1Var, final boolean z, final float f, final List list, final float f2, final float f3, px0 px0Var, final int i) {
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
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1833126050);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.f(cf1Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.g(z)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.c(RecyclerView.B1)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.c(f)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.h(list)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            f4 = f2;
            if (xq2Var.c(f4)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        } else {
            f4 = f2;
        }
        if ((12582912 & i) == 0) {
            if (xq2Var.c(f3)) {
                i3 = 8388608;
            } else {
                i3 = Compress.MAXWINSIZE;
            }
            i2 |= i3;
        }
        int i11 = i2;
        if ((4793491 & i11) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i11 & 1, z2)) {
            final qa4 b2 = cf1Var.b(z, false, xq2Var);
            final qa4 b3 = cf1Var.b(z, true, xq2Var);
            final qa4 a2 = cf1Var.a(z, false, xq2Var);
            final qa4 a3 = cf1Var.a(z, true, xq2Var);
            if ((i11 & 3670016) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f5 = z3 | xq2Var.f(b2);
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
            boolean f6 = z8 | z6 | xq2Var.f(b3) | xq2Var.h(list) | xq2Var.f(a2) | xq2Var.f(a3);
            Object P = xq2Var.P();
            if (f6 || P == ox0.a) {
                qn2 qn2Var = new qn2() { // from class: bk6
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        boolean z9;
                        float f7;
                        long j;
                        long j2;
                        int i12;
                        qa4 qa4Var;
                        boolean z10;
                        no1 no1Var = (no1) obj;
                        if (no1Var.getLayoutDirection() == kk3.Rtl) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        float intBitsToFloat = Float.intBitsToFloat((int) (no1Var.t0() & 4294967295L));
                        long floatToRawIntBits = (Float.floatToRawIntBits(f7) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (no1Var.e() >> 32)) - f4;
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (no1Var.t0() & 4294967295L));
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
                        long j3 = ((kt0) b2.getValue()).a;
                        float f8 = f3;
                        no1.p0(no1Var, j3, j, j2, f8, 1, 480);
                        int i13 = (int) (j >> 32);
                        float f9 = f;
                        float intBitsToFloat4 = ((Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat(i13)) * f9) + Float.intBitsToFloat(i13);
                        long j4 = j;
                        long j5 = j2;
                        no1.p0(no1Var, ((kt0) b3.getValue()).a, (Float.floatToRawIntBits(((Float.intBitsToFloat(i12) - Float.intBitsToFloat(i13)) * RecyclerView.B1) + Float.intBitsToFloat(i13)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (no1Var.t0() & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (no1Var.t0() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat4) << 32), f8, 1, 480);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list) {
                            float floatValue = ((Number) obj2).floatValue();
                            if (floatValue <= f9 && floatValue >= RecyclerView.B1) {
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
                                float intBitsToFloat5 = Float.intBitsToFloat((int) (gi2.J(((Number) list2.get(i14)).floatValue(), j4, j5) >> 32));
                                float intBitsToFloat6 = Float.intBitsToFloat((int) (no1Var.t0() & 4294967295L));
                                arrayList.add(new jk4((Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L)));
                                i14++;
                                it = it;
                                list2 = list2;
                            }
                            Iterator it2 = it;
                            if (booleanValue) {
                                qa4Var = a2;
                            } else {
                                qa4Var = a3;
                            }
                            no1Var.n0(arrayList, ((kt0) qa4Var.getValue()).a, f8);
                            it = it2;
                        }
                        return jg7.a;
                    }
                };
                xq2Var.l0(qn2Var);
                P = qn2Var;
            }
            ak7.j(a74Var, (qn2) P, xq2Var, i11 & 14);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: rj6
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jk6.e(a74.this, cf1Var, z, f, list, f2, f3, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }
}
