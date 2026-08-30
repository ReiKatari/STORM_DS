package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l  reason: default package */
/* loaded from: classes.dex */
public abstract class l {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final b27 b = new b27(1, false);
    public static final et0 c = new et0(-470160285, false, new xk0(15));
    public static final et0 d = new et0(699429658, false, new xk0(16));
    public static final et0 e;
    public static final ch1 f;
    public static final av4 g;
    public static final av4 h;
    public static final av4 i;
    public static final ez3 j;
    public static ez3 k;
    public static final gj l;
    public static final gj m;
    public static final gj n;
    public static final ci3 o;
    public static final ci3 p;
    public static final ci3 q;
    public static final ci3 r;
    public static final ci3 s;
    public static final /* synthetic */ int t = 0;

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ch1] */
    static {
        new et0(1962446934, false, new xk0(17));
        e = new et0(1890101041, false, new pt0(16));
        f = new Object();
        g = new av4("image-destination");
        h = new av4("image-replacement-text-is-link");
        i = new av4("image-size");
        j = new ez3(null, null, null);
        l = new gj(1000);
        new gj(1007);
        m = new gj(1008);
        n = new gj(1002);
        o = new ci3(22, new gu5(2), new fu5(14));
        p = new ci3(22, new gu5(3), new fu5(15));
        q = new ci3(22, new gu5(4), new fu5(16));
        r = new ci3(22, new gu5(5), new fu5(17));
        s = new ci3(22, new gu5(6), new fu5(18));
    }

    public static final o31 A(tu0 tu0Var) {
        return new p95(((sk2) tu0Var).R);
    }

    public static final gx0 B(ar0 ar0Var, ar0 ar0Var2) {
        if (ar0Var == ar0Var2) {
            return new gx0(ar0Var, ar0Var, 1);
        }
        if (dk7.s(ar0Var.b, 12884901888L) && dk7.s(ar0Var2.b, 12884901888L)) {
            return new fx0((eg5) ar0Var, (eg5) ar0Var2);
        }
        return new gx0(ar0Var, ar0Var2, 0);
    }

    public static final f12 C(Enum[] enumArr) {
        enumArr.getClass();
        return new f12(enumArr);
    }

    public static final int D(Bitmap bitmap) {
        int i2;
        Bitmap.Config config;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 == Bitmap.Config.ALPHA_8) {
                    i2 = 1;
                } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                    i2 = 2;
                } else {
                    if (Build.VERSION.SDK_INT >= 26) {
                        config = Bitmap.Config.RGBA_F16;
                        if (config2 == config) {
                            i2 = 8;
                        }
                    }
                    i2 = 4;
                }
                return height * i2;
            }
        }
        StringBuilder sb = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config3 = bitmap.getConfig();
        sb.append(" [");
        sb.append(width);
        sb.append(" x ");
        sb.append(height2);
        sb.append("] + ");
        sb.append(config3);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final float[] F(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static final boolean H(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final float[] I(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        float f6 = f4 * f5;
        fArr3[0] = f6 + (f2 * f3) + (fArr[0] * fArr2[0]);
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f5;
        fArr3[1] = f11 + (f3 * f9) + (f7 * f8);
        float f12 = fArr[5];
        float f13 = fArr2[1] * f12;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13 + (fArr[2] * f8);
        float f15 = fArr[0];
        float f16 = fArr2[4];
        float f17 = (f2 * f16) + (fArr2[3] * f15);
        float f18 = fArr2[5];
        fArr3[3] = (f4 * f18) + f17;
        float f19 = fArr[1];
        float f20 = fArr2[3];
        float f21 = f9 * f16;
        fArr3[4] = (f10 * f18) + f21 + (f19 * f20);
        float f22 = fArr[2];
        float f23 = f18 * f14;
        fArr3[5] = f23 + (f12 * fArr2[4]) + (f20 * f22);
        float f24 = f15 * fArr2[6];
        float f25 = fArr[3];
        float f26 = fArr2[7];
        float f27 = (f25 * f26) + f24;
        float f28 = fArr2[8];
        fArr3[6] = (f4 * f28) + f27;
        float f29 = fArr2[6];
        float f30 = f10 * f28;
        fArr3[7] = f30 + (fArr[4] * f26) + (f19 * f29);
        float f31 = f14 * f28;
        fArr3[8] = f31 + (fArr[5] * fArr2[7]) + (f22 * f29);
        return fArr3;
    }

    public static final float[] J(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        float f5 = fArr[5] * f3;
        fArr2[2] = (fArr[8] * f4) + f5 + (fArr[2] * f2);
        return fArr2;
    }

    public static final void K(ic1 ic1Var, gs0 gs0Var) {
        ic1Var.getClass();
        gs0Var.getClass();
        ((p63) ic1Var).R(new x(18, ic1Var, gs0Var));
    }

    public static final Object L(sm4 sm4Var, ew4 ew4Var) {
        ew4Var.getClass();
        Object obj = sm4Var.get(ew4Var);
        if (obj == null) {
            obj = ew4Var.b();
        }
        return ((o67) obj).a(sm4Var);
    }

    public static final void M(vc1 vc1Var) {
        yc ycVar;
        vf3 P = P(vc1Var);
        if (!P.o0) {
            ee eeVar = (ee) yf3.a(P);
            if (ee.e() && (ycVar = eeVar.K0) != null) {
                ycVar.R.b.m(P.B, new xc(ycVar, P));
            }
        }
    }

    public static final m74 N(vc1 vc1Var, int i2) {
        m74 m74Var = ((yy3) vc1Var).A.c0;
        m74Var.getClass();
        if (m74Var.Y0() == vc1Var && n74.g(i2)) {
            m74 m74Var2 = m74Var.m0;
            m74Var2.getClass();
            return m74Var2;
        }
        return m74Var;
    }

    public static final m74 O(vc1 vc1Var) {
        if (!((yy3) vc1Var).A.i0) {
            mz2.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        m74 N = N(vc1Var, 2);
        if (!N.Y0().i0) {
            mz2.c("LayoutCoordinates is not attached.");
        }
        return N;
    }

    public static final vf3 P(vc1 vc1Var) {
        m74 m74Var = ((yy3) vc1Var).A.c0;
        if (m74Var != null) {
            return m74Var.j0;
        }
        throw b31.e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final wg4 Q(vc1 vc1Var) {
        wg4 wg4Var = P(vc1Var).j0;
        if (wg4Var != null) {
            return wg4Var;
        }
        throw b31.e("This node does not have an owner.");
    }

    public static final zy3 T(zy3 zy3Var, to toVar, ds6 ds6Var, mi2 mi2Var, int i2, boolean z, int i3, int i4, od2 od2Var, List list, mi2 mi2Var2, yq0 yq0Var, mi2 mi2Var3) {
        return zy3Var.f(wy3.a).f(new nn6(toVar, ds6Var, od2Var, mi2Var, i2, z, i3, i4, list, mi2Var2, yq0Var, mi2Var3));
    }

    public static Object U(qd0 qd0Var, qo0 qo0Var) {
        if (qd0Var instanceof m37) {
            return ((m37) qd0Var).p(qo0Var);
        }
        if (qd0Var instanceof td0) {
            td0 td0Var = (td0) qd0Var;
            if (td0Var.j() != qd0Var) {
                td0 j2 = td0Var.j();
                j2.getClass();
                return U(j2, qo0Var);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [rm4, vm4] */
    public static final sm4 V(dq[] dqVarArr, sm4 sm4Var, sm4 sm4Var2) {
        sm4 sm4Var3 = sm4.R;
        ?? vm4Var = new vm4(sm4Var3);
        vm4Var.Z = sm4Var3;
        for (dq dqVar : dqVarArr) {
            ew4 ew4Var = (ew4) dqVar.f;
            if (dqVar.e || !sm4Var.containsKey(ew4Var)) {
                vm4Var.put(ew4Var, ew4Var.c(dqVar, (o67) sm4Var2.get(ew4Var)));
            }
        }
        return vm4Var.b();
    }

    public static final void a(final to toVar, final zy3 zy3Var, final ds6 ds6Var, final mi2 mi2Var, final int i2, final boolean z, final int i3, final int i4, final Map map, final yq0 yq0Var, tu0 tu0Var, final int i5) {
        int i6;
        mi2 mi2Var2;
        int i7;
        boolean z2;
        sk2 sk2Var;
        int i8;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-1343466571);
        if ((i5 & 6) == 0) {
            if (sk2Var2.f(toVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i6 = i18 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (sk2Var2.f(zy3Var)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i6 |= i17;
        }
        if ((i5 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var2.f(ds6Var)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i6 |= i16;
        }
        if ((i5 & 3072) == 0) {
            mi2Var2 = mi2Var;
            if (sk2Var2.h(mi2Var2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i6 |= i15;
        } else {
            mi2Var2 = mi2Var;
        }
        if ((i5 & 24576) == 0) {
            i7 = i2;
            if (sk2Var2.d(i7)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i6 |= i14;
        } else {
            i7 = i2;
        }
        if ((196608 & i5) == 0) {
            if (sk2Var2.g(z)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i6 |= i13;
        }
        if ((1572864 & i5) == 0) {
            if (sk2Var2.d(i3)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i6 |= i12;
        }
        if ((12582912 & i5) == 0) {
            if (sk2Var2.d(i4)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i6 |= i11;
        }
        if ((100663296 & i5) == 0) {
            if (sk2Var2.h(map)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i6 |= i10;
        }
        if ((805306368 & i5) == 0) {
            if (sk2Var2.h(yq0Var)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i6 |= i9;
        }
        if ((306783379 & i6) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (sk2Var2.O(i6 & 1, z2)) {
            mj2.a0(i4, i3);
            if (sk2Var2.j(cz5.a) == null) {
                sk2Var2.X(1588759409);
                sk2Var2.p(false);
                ti4 ti4Var = xo.a;
                int length = toVar.B.length();
                List list = toVar.A;
                if (list != null) {
                    int size = list.size();
                    int i19 = 0;
                    while (i19 < size) {
                        i8 = i6;
                        so soVar = (so) list.get(i19);
                        int i20 = i19;
                        if ((soVar.a instanceof vg6) && "androidx.compose.foundation.text.inlineContent".equals(soVar.d)) {
                            z3 = false;
                            if (uo.b(0, length, soVar.b, soVar.c)) {
                                z4 = true;
                                break;
                            }
                        }
                        i19 = i20 + 1;
                        i6 = i8;
                    }
                }
                i8 = i6;
                z3 = false;
                z4 = false;
                boolean B = ve2.B(toVar);
                od2 od2Var = (od2) sk2Var2.j(ov0.k);
                if (!z4 && !B) {
                    sk2Var2.X(1589006262);
                    y10.a(toVar, ds6Var, od2Var, null, sk2Var2);
                    zy3 T = T(zy3Var, toVar, ds6Var, mi2Var2, i7, z, i3, i4, od2Var, null, null, yq0Var, null);
                    wf wfVar = wf.g;
                    int hashCode = Long.hashCode(sk2Var2.T);
                    zy3 e0 = l07.e0(sk2Var2, T);
                    sm4 l2 = sk2Var2.l();
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var2.b0();
                    if (sk2Var2.S) {
                        sk2Var2.k(mv0Var);
                    } else {
                        sk2Var2.k0();
                    }
                    oo2.S(sk2Var2, mu0.f, wfVar);
                    oo2.S(sk2Var2, mu0.e, l2);
                    oo2.P(sk2Var2, mu0.h);
                    oo2.S(sk2Var2, mu0.d, e0);
                    oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode));
                    sk2Var2.p(true);
                    sk2Var2.p(false);
                    sk2Var = sk2Var2;
                } else {
                    sk2Var2.X(1590022070);
                    if ((i8 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    Object L = sk2Var2.L();
                    sn1 sn1Var = su0.a;
                    if (z5 || L == sn1Var) {
                        L = me2.G(toVar);
                        sk2Var2.h0(L);
                    }
                    k24 k24Var = (k24) L;
                    to toVar2 = (to) k24Var.getValue();
                    boolean f2 = sk2Var2.f(k24Var);
                    Object L2 = sk2Var2.L();
                    if (f2 || L2 == sn1Var) {
                        L2 = new j4(k24Var, 6);
                        sk2Var2.h0(L2);
                    }
                    int i21 = i8 << 6;
                    sk2Var = sk2Var2;
                    i(zy3Var, toVar2, mi2Var, z4, map, ds6Var, i2, z, i3, i4, od2Var, yq0Var, (mi2) L2, sk2Var, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i21) | (29360128 & i21) | (234881024 & i21) | (i21 & 1879048192), ((i8 >> 21) & 896) | 24576);
                    sk2Var.p(false);
                }
            } else {
                c44.b();
                return;
            }
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2() { // from class: t10
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l.a(to.this, zy3Var, ds6Var, mi2Var, i2, z, i3, i4, map, yq0Var, (tu0) obj, ep2.I(i5 | 1));
                    return o27.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r20, final defpackage.zy3 r21, final defpackage.ds6 r22, defpackage.mi2 r23, int r24, boolean r25, final int r26, int r27, defpackage.yq0 r28, defpackage.tu0 r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.b(java.lang.String, zy3, ds6, mi2, int, boolean, int, int, yq0, tu0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:214:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.ki2 r34, defpackage.zy3 r35, boolean r36, defpackage.j91 r37, defpackage.y26 r38, final defpackage.f91 r39, defpackage.ih4 r40, final defpackage.bj2 r41, defpackage.tu0 r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.c(ki2, zy3, boolean, j91, y26, f91, ih4, bj2, tu0, int, int):void");
    }

    public static final void d(Object obj, mi2 mi2Var, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        boolean f2 = sk2Var.f(obj);
        Object L = sk2Var.L();
        if (f2 || L == su0.a) {
            L = new ah1(mi2Var);
            sk2Var.h0(L);
        }
        ah1 ah1Var = (ah1) L;
    }

    public static final void e(Object obj, Object obj2, mi2 mi2Var, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        boolean f2 = sk2Var.f(obj) | sk2Var.f(obj2);
        Object L = sk2Var.L();
        if (f2 || L == su0.a) {
            L = new ah1(mi2Var);
            sk2Var.h0(L);
        }
        ah1 ah1Var = (ah1) L;
    }

    public static final void f(Object[] objArr, mi2 mi2Var, tu0 tu0Var) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((sk2) tu0Var).f(obj);
        }
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        if (!z && L != su0.a) {
            return;
        }
        sk2Var.h0(new ah1(mi2Var));
    }

    public static final void g(tu0 tu0Var, aj2 aj2Var, Object obj) {
        e31 e31Var = ((sk2) tu0Var).R;
        sk2 sk2Var = (sk2) tu0Var;
        boolean f2 = sk2Var.f(obj);
        Object L = sk2Var.L();
        if (f2 || L == su0.a) {
            L = new qc3(e31Var, aj2Var);
            sk2Var.h0(L);
        }
        qc3 qc3Var = (qc3) L;
    }

    public static final void h(Object obj, Object obj2, aj2 aj2Var, tu0 tu0Var) {
        e31 e31Var = ((sk2) tu0Var).R;
        sk2 sk2Var = (sk2) tu0Var;
        boolean f2 = sk2Var.f(obj) | sk2Var.f(obj2);
        Object L = sk2Var.L();
        if (f2 || L == su0.a) {
            L = new qc3(e31Var, aj2Var);
            sk2Var.h0(L);
        }
        qc3 qc3Var = (qc3) L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, k24] */
    /* JADX WARN: Type inference failed for: r9v14, types: [pp1] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList] */
    public static final void i(final zy3 zy3Var, final to toVar, final mi2 mi2Var, final boolean z, final Map map, final ds6 ds6Var, final int i2, final boolean z2, final int i3, final int i4, final od2 od2Var, final yq0 yq0Var, final mi2 mi2Var2, tu0 tu0Var, final int i5, final int i6) {
        int i7;
        int i8;
        sk2 sk2Var;
        qr6 qr6Var;
        ki2 ki2Var;
        ki2 ki2Var2;
        ti4 ti4Var;
        mi2 mi2Var3;
        k24 k24Var;
        boolean z3;
        u10 u10Var;
        Object ljVar;
        ?? r9;
        int i9;
        Map map2 = map;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-2118572703);
        if ((i5 & 6) == 0) {
            i7 = (sk2Var2.f(zy3Var) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= sk2Var2.f(toVar) ? 32 : 16;
        }
        if ((i5 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i7 |= sk2Var2.h(mi2Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= sk2Var2.g(z) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= sk2Var2.h(map2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= sk2Var2.f(ds6Var) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= sk2Var2.d(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= sk2Var2.g(z2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= sk2Var2.d(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= sk2Var2.d(i4) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (sk2Var2.h(od2Var) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= sk2Var2.h(null) ? 32 : 16;
        }
        if ((i6 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i8 |= sk2Var2.h(yq0Var) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= sk2Var2.h(mi2Var2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= (32768 & i6) == 0 ? sk2Var2.f(null) : sk2Var2.h(null) ? 16384 : 8192;
        }
        if (sk2Var2.O(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean B = ve2.B(toVar);
            sn1 sn1Var = su0.a;
            if (B) {
                sk2Var2.X(145641571);
                boolean z4 = (i7 & 112) == 32;
                Object L = sk2Var2.L();
                qr6 qr6Var2 = L;
                if (z4 || L == sn1Var) {
                    qr6 qr6Var3 = new qr6(toVar);
                    sk2Var2.h0(qr6Var3);
                    qr6Var2 = qr6Var3;
                }
                sk2Var2.p(false);
                qr6Var = qr6Var2;
            } else {
                sk2Var2.X(145707228);
                sk2Var2.p(false);
                qr6Var = null;
            }
            if (ve2.B(toVar)) {
                sk2Var2.X(145905443);
                boolean f2 = ((i7 & 112) == 32) | sk2Var2.f(qr6Var);
                Object L2 = sk2Var2.L();
                p6 p6Var = L2;
                if (f2 || L2 == sn1Var) {
                    p6 p6Var2 = new p6(12, qr6Var, toVar);
                    sk2Var2.h0(p6Var2);
                    p6Var = p6Var2;
                }
                ki2Var = p6Var;
                sk2Var2.p(false);
            } else {
                sk2Var2.X(146002721);
                boolean z5 = (i7 & 112) == 32;
                Object L3 = sk2Var2.L();
                b5 b5Var = L3;
                if (z5 || L3 == sn1Var) {
                    b5 b5Var2 = new b5(7, toVar);
                    sk2Var2.h0(b5Var2);
                    b5Var = b5Var2;
                }
                ki2Var = (ki2) b5Var;
                sk2Var2.p(false);
            }
            if (z) {
                if (map2 != null) {
                    ti4 ti4Var2 = xo.a;
                    if (!map2.isEmpty()) {
                        int length = toVar.B.length();
                        ki2Var2 = ki2Var;
                        List list = toVar.A;
                        if (list != null) {
                            r9 = new ArrayList(list.size());
                            int size = list.size();
                            int i10 = 0;
                            while (i10 < size) {
                                List list2 = list;
                                so soVar = (so) list.get(i10);
                                int i11 = size;
                                Object obj = soVar.a;
                                int i12 = i10;
                                int i13 = soVar.c;
                                int i14 = soVar.b;
                                String str = soVar.d;
                                if ((obj instanceof vg6) && "androidx.compose.foundation.text.inlineContent".equals(str) && uo.b(0, length, i14, i13)) {
                                    Object obj2 = soVar.a;
                                    obj2.getClass();
                                    r9.add(new so(i14, i13, ((vg6) obj2).a, str));
                                }
                                i10 = i12 + 1;
                                size = i11;
                                list = list2;
                            }
                        } else {
                            r9 = pp1.A;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = r9.size();
                        int i15 = 0;
                        List list3 = r9;
                        while (i15 < size2) {
                            so soVar2 = (so) list3.get(i15);
                            Object obj3 = soVar2.a;
                            List list4 = list3;
                            int i16 = soVar2.c;
                            int i17 = soVar2.b;
                            tz2 tz2Var = (tz2) map2.get(obj3);
                            if (tz2Var != null) {
                                i9 = size2;
                                arrayList.add(new so(i17, i16, tz2Var.a));
                                arrayList2.add(new so(i17, i16, tz2Var.b));
                            } else {
                                i9 = size2;
                            }
                            i15++;
                            map2 = map;
                            list3 = list4;
                            size2 = i9;
                        }
                        ti4Var = new ti4(arrayList, arrayList2);
                        mi2Var3 = null;
                    }
                }
                ki2Var2 = ki2Var;
                ti4Var = xo.a;
                mi2Var3 = null;
            } else {
                ki2Var2 = ki2Var;
                mi2Var3 = null;
                ti4Var = new ti4(null, null);
            }
            List list5 = (List) ti4Var.A;
            List list6 = (List) ti4Var.B;
            if (z) {
                sk2Var2.X(146318828);
                Object L4 = sk2Var2.L();
                tj4 tj4Var = L4;
                if (L4 == sn1Var) {
                    tj4 G = me2.G(mi2Var3);
                    sk2Var2.h0(G);
                    tj4Var = G;
                }
                sk2Var2.p(false);
                k24Var = (k24) tj4Var;
            } else {
                sk2Var2.X(146406588);
                sk2Var2.p(false);
                k24Var = mi2Var3;
            }
            if (z) {
                sk2Var2.X(146499837);
                boolean f3 = sk2Var2.f(k24Var);
                Object L5 = sk2Var2.L();
                j4 j4Var = L5;
                if (f3 || L5 == sn1Var) {
                    j4 j4Var2 = new j4(k24Var, 7);
                    sk2Var2.h0(j4Var2);
                    j4Var = j4Var2;
                }
                mi2Var3 = j4Var;
                sk2Var2.p(false);
            } else {
                sk2Var2.X(146571260);
                sk2Var2.p(false);
            }
            int i18 = (i7 >> 3) & 14;
            y10.a(toVar, ds6Var, od2Var, list5, sk2Var2);
            to toVar2 = (to) ki2Var2.c();
            boolean h2 = ((i7 & 896) == 256) | sk2Var2.h(qr6Var);
            Object L6 = sk2Var2.L();
            if (h2 || L6 == sn1Var) {
                z3 = false;
                u10 u10Var2 = new u10(qr6Var, mi2Var, 0);
                sk2Var2.h0(u10Var2);
                u10Var = u10Var2;
            } else {
                z3 = false;
                u10Var = L6;
            }
            mi2 mi2Var4 = mi2Var3;
            sk2 sk2Var3 = sk2Var2;
            k24 k24Var2 = k24Var;
            boolean z6 = z3;
            zy3 T = T(zy3Var, toVar2, ds6Var, (mi2) u10Var, i2, z2, i3, i4, od2Var, list5, mi2Var4, yq0Var, mi2Var2);
            if (!z) {
                sk2Var3.X(147750935);
                boolean h3 = sk2Var3.h(qr6Var);
                Object L7 = sk2Var3.L();
                v10 v10Var = L7;
                if (h3 || L7 == sn1Var) {
                    v10 v10Var2 = new v10(qr6Var, z6 ? 1 : 0);
                    sk2Var3.h0(v10Var2);
                    v10Var = v10Var2;
                }
                ljVar = new dp3((ki2) v10Var);
                sk2Var3.p(z6);
            } else {
                sk2Var3.X(147927697);
                boolean h4 = sk2Var3.h(qr6Var);
                Object L8 = sk2Var3.L();
                v10 v10Var3 = L8;
                if (h4 || L8 == sn1Var) {
                    v10 v10Var4 = new v10(qr6Var, 1);
                    sk2Var3.h0(v10Var4);
                    v10Var3 = v10Var4;
                }
                ki2 ki2Var3 = (ki2) v10Var3;
                boolean f4 = sk2Var3.f(k24Var2);
                Object L9 = sk2Var3.L();
                f4 f4Var = L9;
                if (f4 || L9 == sn1Var) {
                    f4 f4Var2 = new f4(k24Var2, 8);
                    sk2Var3.h0(f4Var2);
                    f4Var = f4Var2;
                }
                ljVar = new lj(1, ki2Var3, (ki2) f4Var);
                sk2Var3.p(z6);
            }
            int hashCode = Long.hashCode(sk2Var3.T);
            sm4 l2 = sk2Var3.l();
            zy3 e0 = l07.e0(sk2Var3, T);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var3.b0();
            if (sk2Var3.S) {
                sk2Var3.k(mv0Var);
            } else {
                sk2Var3.k0();
            }
            oo2.S(sk2Var3, mu0.f, ljVar);
            oo2.S(sk2Var3, mu0.e, l2);
            oo2.S(sk2Var3, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var3, mu0.h);
            oo2.S(sk2Var3, mu0.d, e0);
            if (qr6Var == null) {
                sk2Var3.X(-433557001);
            } else {
                sk2Var3.X(-291080374);
                qr6Var.a(sk2Var3, z6 ? 1 : 0);
            }
            sk2Var3.p(z6);
            if (list6 == null) {
                sk2Var3.X(-433506223);
                sk2Var3.p(z6);
            } else {
                sk2Var3.X(-433506222);
                xo.a(toVar, list6, sk2Var3, i18);
                sk2Var3.p(z6);
            }
            sk2Var3.p(true);
            sk2Var = sk2Var3;
        } else {
            sk2 sk2Var4 = sk2Var2;
            sk2Var4.R();
            sk2Var = sk2Var4;
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new aj2() { // from class: s10
                @Override // defpackage.aj2
                public final Object j(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int I = ep2.I(i5 | 1);
                    int I2 = ep2.I(i6);
                    l.i(zy3.this, toVar, mi2Var, z, map, ds6Var, i2, z2, i3, i4, od2Var, yq0Var, mi2Var2, (tu0) obj4, I, I2);
                    return o27.a;
                }
            };
        }
    }

    public static final void j(ki2 ki2Var, tu0 tu0Var) {
        bf4 bf4Var = ((sk2) tu0Var).M.b.q0;
        bf4Var.h0(pe4.d);
        hi2.V(bf4Var, 0, ki2Var);
    }

    public static final void k(ki2 ki2Var, zy3 zy3Var, boolean z, f91 f91Var, et0 et0Var, tu0 tu0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            zy3Var = wy3.a;
        }
        zy3 zy3Var2 = zy3Var;
        if ((i3 & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        fr5 fr5Var = ((m36) ((sk2) tu0Var).j(n36.a)).a;
        if ((i3 & 128) != 0) {
            f91Var = e70.a(0L, tu0Var, 7);
        }
        c(ki2Var, zy3Var2, z2, null, fr5Var, f91Var, e70.d, et0Var, tu0Var, i2 & 2147483646, 0);
    }

    public static final void l(o24 o24Var, yy3 yy3Var) {
        o24 y = P(yy3Var).y();
        int i2 = y.L - 1;
        Object[] objArr = y.A;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                o24Var.b((yy3) ((vf3) objArr[i2]).A0.g);
                i2--;
            }
        }
    }

    public static final boolean m(si1 si1Var, long j2) {
        if (si1Var.A.i0) {
            vz2 vz2Var = (vz2) P(si1Var).A0.d;
            if (vz2Var.O0.i0) {
                long Q = vz2Var.Q(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (Q >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (Q & 4294967295L));
                long j3 = si1Var.l0;
                float f2 = ((int) (j3 >> 32)) + intBitsToFloat;
                float f3 = ((int) (j3 & 4294967295L)) + intBitsToFloat2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
                if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f2) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f3) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final boolean n(ds6 ds6Var) {
        ap1 ap1Var;
        qo4 qo4Var;
        dp4 dp4Var = ds6Var.c;
        if (dp4Var != null && (qo4Var = dp4Var.b) != null) {
            ap1Var = new ap1(qo4Var.b);
        } else {
            ap1Var = null;
        }
        boolean z = false;
        if (ap1Var != null && ap1Var.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final ArrayList o(List list, ki2 ki2Var) {
        k70 k70Var;
        if (((Boolean) ki2Var.c()).booleanValue()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                mv3 mv3Var = (mv3) list.get(i2);
                Object l2 = mv3Var.l();
                l2.getClass();
                hi0 hi0Var = ((wr6) l2).a;
                so soVar = (so) hi0Var.L;
                lr6 lr6Var = (lr6) ((qr6) hi0Var.B).a.getValue();
                if (lr6Var == null) {
                    k70Var = new k70(0, 0, new zv5(7));
                } else {
                    so c2 = qr6.c(soVar, lr6Var);
                    if (c2 == null) {
                        k70Var = new k70(0, 0, new zv5(8));
                    } else {
                        e33 e0 = gk2.e0(lr6Var.i(c2.b, c2.c).d());
                        k70Var = new k70(e0.c - e0.a, e0.a(), new t06(8, e0));
                    }
                }
                int i3 = k70Var.A;
                int i4 = k70Var.B;
                arrayList.add(new ti4(mv3Var.c(w81.m(i3, i3, i4, i4)), (ki2) k70Var.L));
            }
            return arrayList;
        }
        return null;
    }

    public static final yy3 p(o24 o24Var) {
        int i2;
        if (o24Var != null && (i2 = o24Var.L) != 0) {
            return (yy3) o24Var.l(i2 - 1);
        }
        return null;
    }

    public static ar0 q(ar0 ar0Var) {
        xd7 xd7Var = dk7.e;
        if (dk7.s(ar0Var.b, 12884901888L)) {
            eg5 eg5Var = (eg5) ar0Var;
            xd7 xd7Var2 = eg5Var.d;
            if (!y(xd7Var2, xd7Var)) {
                return new eg5(eg5Var.a, eg5Var.h, xd7Var, I(u(s9.c.b, xd7Var2.a(), xd7Var.a()), eg5Var.i), eg5Var.k, eg5Var.n, eg5Var.e, eg5Var.f, eg5Var.g, -1);
            }
        }
        return ar0Var;
    }

    public static final zy3 r(zy3 zy3Var, float f2) {
        if (f2 == 1.0f) {
            return zy3Var;
        }
        return tq5.s(zy3Var, RecyclerView.A1, RecyclerView.A1, f2, null, 520187);
    }

    /* JADX WARN: Code restructure failed: missing block: B:188:0x0295, code lost:
        if (r7.d == r6) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0115, code lost:
        if (r4.d == r8) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0593 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x069a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x06f1 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x011f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0649 A[EDGE_INSN: B:453:0x0649->B:395:0x0649 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(defpackage.hz0 r39, defpackage.ho3 r40, java.util.ArrayList r41, int r42) {
        /*
            Method dump skipped, instructions count: 1790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l.s(hz0, ho3, java.util.ArrayList, int):void");
    }

    public static final mf3 t(yy3 yy3Var) {
        if ((yy3Var.L & 2) != 0) {
            if (yy3Var instanceof mf3) {
                return (mf3) yy3Var;
            }
            if (yy3Var instanceof xc1) {
                yy3 yy3Var2 = ((xc1) yy3Var).k0;
                while (yy3Var2 != null) {
                    if (yy3Var2 instanceof mf3) {
                        return (mf3) yy3Var2;
                    }
                    if ((yy3Var2 instanceof xc1) && (yy3Var2.L & 2) != 0) {
                        yy3Var2 = ((xc1) yy3Var2).k0;
                    } else {
                        yy3Var2 = yy3Var2.Y;
                    }
                }
            }
        }
        return null;
    }

    public static final float[] u(float[] fArr, float[] fArr2, float[] fArr3) {
        J(fArr, fArr2);
        J(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] F = F(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return I(F, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final k24 v(u92 u92Var, en0 en0Var, tu0 tu0Var, int i2) {
        sk2 sk2Var = (sk2) tu0Var;
        return w(u92Var, en0Var, ((fn3) sk2Var.j(yq3.a)).getLifecycle(), qm3.STARTED, tu0Var, i2 & 112);
    }

    public static final k24 w(u92 u92Var, Object obj, rm3 rm3Var, qm3 qm3Var, tu0 tu0Var, int i2) {
        boolean z;
        mp1 mp1Var = mp1.A;
        Object[] objArr = {u92Var, rm3Var, qm3Var, mp1Var};
        sk2 sk2Var = (sk2) tu0Var;
        boolean h2 = sk2Var.h(rm3Var);
        if ((((i2 & 7168) ^ 3072) > 2048 && sk2Var.d(qm3Var.ordinal())) || (i2 & 3072) == 2048) {
            z = true;
        } else {
            z = false;
        }
        boolean h3 = z | h2 | sk2Var.h(mp1Var) | sk2Var.h(u92Var);
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (h3 || L == sn1Var) {
            m5 m5Var = new m5(rm3Var, qm3Var, u92Var, (j11) null, 12);
            sk2Var.h0(m5Var);
            L = m5Var;
        }
        aj2 aj2Var = (aj2) L;
        Object L2 = sk2Var.L();
        if (L2 == sn1Var) {
            L2 = me2.G(obj);
            sk2Var.h0(L2);
        }
        k24 k24Var = (k24) L2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h4 = sk2Var.h(aj2Var);
        Object L3 = sk2Var.L();
        if (h4 || L3 == sn1Var) {
            L3 = new va6(aj2Var, k24Var, null, 3);
            sk2Var.h0(L3);
        }
        aj2 aj2Var2 = (aj2) L3;
        e31 e31Var = sk2Var.R;
        boolean z2 = false;
        for (Object obj2 : Arrays.copyOf(copyOf, copyOf.length)) {
            z2 |= sk2Var.f(obj2);
        }
        Object L4 = sk2Var.L();
        if (!z2 && L4 != sn1Var) {
            return k24Var;
        }
        sk2Var.h0(new qc3(e31Var, aj2Var2));
        return k24Var;
    }

    public static final k24 x(ce6 ce6Var, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        return w(ce6Var, ce6Var.getValue(), ((fn3) sk2Var.j(yq3.a)).getLifecycle(), qm3.STARTED, tu0Var, 0);
    }

    public static final boolean y(xd7 xd7Var, xd7 xd7Var2) {
        if (xd7Var == xd7Var2) {
            return true;
        }
        if (Math.abs(xd7Var.a - xd7Var2.a) < 0.001f && Math.abs(xd7Var.b - xd7Var2.b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final void z(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        vd6.c(i2, i3, ") is greater than size (", "toIndex (");
    }

    public abstract InputFilter[] E(InputFilter[] inputFilterArr);

    public abstract boolean G();

    public abstract void R(boolean z);

    public abstract void S(boolean z);

    public abstract TransformationMethod W(TransformationMethod transformationMethod);
}
