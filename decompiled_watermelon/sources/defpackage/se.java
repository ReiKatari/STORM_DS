package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.view.DragEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.net.URL;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: se  reason: default package */
/* loaded from: classes.dex */
public abstract class se {
    public static final g20 a = new g20(-1.0f);
    public static final g20 b = new g20(1.0f);
    public static final et0 c = new et0(-1571120048, false, new Object());
    public static final et0 d = new et0(-1455401925, false, new ot0(22));
    public static final Object e = new Object();
    public static final lx2 f = new lx2(false);
    public static final int[] g = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] h = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] i = {3, 6};
    public static final int[] j = {1, 2, 4, 5, 7, 8};
    public static final n44 k = new n44(23);
    public static final kt0 l = new kt0(2);
    public static ax2 m;
    public static ax2 n;
    public static final /* synthetic */ int o = 0;

    public static final ax2 A() {
        ax2 ax2Var = m;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(20.0f, 11.0f);
        vq2Var.k(7.83f);
        vq2Var.n(5.59f, -5.59f);
        vq2Var.m(12.0f, 4.0f);
        vq2Var.n(-8.0f, 8.0f);
        vq2Var.n(8.0f, 8.0f);
        vq2Var.n(1.41f, -1.41f);
        vq2Var.m(7.83f, 13.0f);
        vq2Var.k(20.0f);
        vq2Var.u(-2.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        m = b2;
        return b2;
    }

    public static final ku B(ce0 ce0Var) {
        ce0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = {0};
        Object c2 = ((ia0) ce0Var).c(key);
        if (c2 != null) {
            iArr = c2;
        }
        return new ku(iArr);
    }

    public static final ku C(ce0 ce0Var) {
        ce0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = {0};
        Object c2 = ((ia0) ce0Var).c(key);
        if (c2 != null) {
            iArr = c2;
        }
        return new ku(iArr);
    }

    public static final ku D(ce0 ce0Var) {
        ce0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = {0};
        Object c2 = ((ia0) ce0Var).c(key);
        if (c2 != null) {
            iArr = c2;
        }
        return new ku(iArr);
    }

    public static int E(int i2, byte[] bArr) {
        return (bArr[i2 + 3] & 255) | (bArr[i2] << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    public static final long F(t71 t71Var) {
        DragEvent dragEvent = (DragEvent) t71Var.B;
        return (Float.floatToRawIntBits(dragEvent.getX()) << 32) | (Float.floatToRawIntBits(dragEvent.getY()) & 4294967295L);
    }

    public static final int G(ce0 ce0Var, int i2) {
        ce0Var.getClass();
        if (B(ce0Var).contains(Integer.valueOf(i2))) {
            return i2;
        }
        if (B(ce0Var).contains(1)) {
            return 1;
        }
        return 0;
    }

    public static final boolean H(ce0 ce0Var) {
        ce0Var.getClass();
        if (Build.VERSION.SDK_INT >= 28 && G(ce0Var, 5) == 5) {
            return true;
        }
        return false;
    }

    public static final uj0 I(u92... u92VarArr) {
        Iterable luVar;
        int i2 = xa2.a;
        if (u92VarArr.length == 0) {
            luVar = pp1.A;
        } else {
            luVar = new lu(0, u92VarArr);
        }
        return new uj0(luVar, mp1.A, -2, h60.SUSPEND);
    }

    public static e31 J(c31 c31Var, d31 d31Var) {
        d31Var.getClass();
        if (b53.x(c31Var.getKey(), d31Var)) {
            return mp1.A;
        }
        return c31Var;
    }

    public static zy3 K(zy3 zy3Var, u54 u54Var) {
        return zy3Var.f(new x54(u54Var));
    }

    public static final k91 L(CharSequence charSequence, String str, int i2, mi2 mi2Var) {
        char charAt = charSequence.charAt(i2);
        if (((Boolean) mi2Var.n(Character.valueOf(charAt))).booleanValue()) {
            return null;
        }
        return M(charSequence, "Expected " + str + ", but got '" + charAt + "' at position " + i2);
    }

    public static final k91 M(CharSequence charSequence, String str) {
        StringBuilder t = b31.t(str, " when parsing an Instant from \"");
        t.append(Y(64, charSequence));
        t.append('\"');
        return new k91(charSequence, t.toString());
    }

    public static final int N(int i2, CharSequence charSequence) {
        return (charSequence.charAt(i2 + 1) - '0') + ((charSequence.charAt(i2) - '0') * 10);
    }

    public static e31 O(c31 c31Var, e31 e31Var) {
        e31Var.getClass();
        if (e31Var == mp1.A) {
            return c31Var;
        }
        return (e31) e31Var.N(new qt0(6), c31Var);
    }

    public static final void P(float[] fArr, float[] fArr2) {
        float r = r(fArr2, 0, fArr, 0);
        float r2 = r(fArr2, 0, fArr, 1);
        float r3 = r(fArr2, 0, fArr, 2);
        float r4 = r(fArr2, 0, fArr, 3);
        float r5 = r(fArr2, 1, fArr, 0);
        float r6 = r(fArr2, 1, fArr, 1);
        float r7 = r(fArr2, 1, fArr, 2);
        float r8 = r(fArr2, 1, fArr, 3);
        float r9 = r(fArr2, 2, fArr, 0);
        float r10 = r(fArr2, 2, fArr, 1);
        float r11 = r(fArr2, 2, fArr, 2);
        float r12 = r(fArr2, 2, fArr, 3);
        float r13 = r(fArr2, 3, fArr, 0);
        float r14 = r(fArr2, 3, fArr, 1);
        float r15 = r(fArr2, 3, fArr, 2);
        float r16 = r(fArr2, 3, fArr, 3);
        fArr[0] = r;
        fArr[1] = r2;
        fArr[2] = r3;
        fArr[3] = r4;
        fArr[4] = r5;
        fArr[5] = r6;
        fArr[6] = r7;
        fArr[7] = r8;
        fArr[8] = r9;
        fArr[9] = r10;
        fArr[10] = r11;
        fArr[11] = r12;
        fArr[12] = r13;
        fArr[13] = r14;
        fArr[14] = r15;
        fArr[15] = r16;
    }

    public static final mj0 Q(q60 q60Var) {
        return new mj0(q60Var, false);
    }

    public static final fw5 R(tu0 tu0Var) {
        Object[] objArr = new Object[0];
        boolean d2 = ((sk2) tu0Var).d(0);
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        if (d2 || L == su0.a) {
            L = new zv5(0);
            sk2Var.h0(L);
        }
        return (fw5) jk2.N(objArr, fw5.j, (ki2) L, sk2Var, 0);
    }

    public static final View S(yy3 yy3Var) {
        if (!yy3Var.A.i0) {
            mz2.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) yf3.a(l.P(yy3Var));
    }

    public static void T(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >>> 24);
        bArr[i2 + 1] = (byte) (i3 >>> 16);
        bArr[i2 + 2] = (byte) (i3 >>> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public static final o45 U(u92 u92Var, o31 o31Var, r56 r56Var, int i2) {
        s31 s31Var;
        oi a2 = jg7.a(u92Var, i2);
        c46 a3 = d46.a(i2, a2.B, (h60) a2.R);
        e31 e31Var = (e31) a2.X;
        u92 u92Var2 = (u92) a2.L;
        if (r56Var.equals(q56.a)) {
            s31Var = s31.DEFAULT;
        } else {
            s31Var = s31.UNDISPATCHED;
        }
        tq5.v(o31Var, e31Var, s31Var, new m5(r56Var, u92Var2, a3, d46.a, null, 15));
        return new o45(a3);
    }

    public static final q45 V(u92 u92Var, o31 o31Var, r56 r56Var, Object obj) {
        s31 s31Var;
        oi a2 = jg7.a(u92Var, 1);
        ee6 a3 = fe6.a(obj);
        e31 e31Var = (e31) a2.X;
        u92 u92Var2 = (u92) a2.L;
        if (r56Var.equals(q56.a)) {
            s31Var = s31.DEFAULT;
        } else {
            s31Var = s31.UNDISPATCHED;
        }
        tq5.v(o31Var, e31Var, s31Var, new m5(r56Var, u92Var2, a3, obj, null, 15));
        return new q45(a3);
    }

    public static final zy3 W(zy3 zy3Var, wv6 wv6Var, oa0 oa0Var, wp6 wp6Var, k21 k21Var) {
        return zy3Var.f(new oo6(wv6Var, oa0Var, wp6Var, k21Var));
    }

    public static final tj0 X(u92 u92Var, bj2 bj2Var) {
        int i2 = xa2.a;
        return new tj0(bj2Var, u92Var, mp1.A, -2, h60.SUSPEND);
    }

    public static final String Y(int i2, CharSequence charSequence) {
        if (charSequence.length() <= i2) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i2).toString() + "...";
    }

    public static zy3 Z(zy3 zy3Var, fw5 fw5Var) {
        jf4 jf4Var = jf4.Vertical;
        return zy3Var.f(a53.t(wy3.a, is2.c)).f(new gw5(null, null, null, fw5Var.d, jf4Var, fw5Var, true, true)).f(new tw5(fw5Var));
    }

    public static final void a(rg5 rg5Var, String str, String str2, boolean z, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        um umVar;
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1644469026);
        if (sk2Var.h(rg5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (sk2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (sk2Var.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i10 = i9 | i5;
        if (sk2Var.g(z)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (sk2Var.h(ki2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i12 & 1, z2)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = a53.c(RecyclerView.A1);
                sk2Var.h0(L);
            }
            um umVar2 = (um) L;
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = me2.G(Boolean.FALSE);
                sk2Var.h0(L2);
            }
            k24 k24Var = (k24) L2;
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = new x5(k24Var, null, 1);
                sk2Var.h0(L3);
            }
            l.g(sk2Var, (aj2) L3, o27.a);
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool = (Boolean) k24Var.getValue();
            bool.booleanValue();
            if ((i12 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h2 = z3 | sk2Var.h(umVar2);
            if ((57344 & i12) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = h2 | z4;
            Object L4 = sk2Var.L();
            if (!z5 && L4 != sn1Var) {
                umVar = umVar2;
            } else {
                umVar = umVar2;
                x30 x30Var = new x30(z, umVar, ki2Var, k24Var, null, 0);
                sk2Var.h0(x30Var);
                L4 = x30Var;
            }
            l.h(valueOf, bool, (aj2) L4, sk2Var);
            zy3 r = l.r(o76.c, 1.0f - ((Number) umVar.d()).floatValue());
            tv3 d2 = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, r);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d2);
            oo2.S(sk2Var, mu0.e, l2);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            pu.c(rg5Var, str, str2, sk2Var, i12 & 1022);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new gi(rg5Var, str, str2, z, ki2Var, i2, 1);
        }
    }

    public static final void b(k3 k3Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        URL url;
        long j2;
        dy4 dy4Var = k3Var.a;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-492343204);
        if (sk2Var.h(k3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        boolean z2 = false;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            l3 l3Var = k3Var.b;
            if (l3Var == l3.SUCCESS) {
                z2 = true;
            }
            Long valueOf = Long.valueOf(dy4Var.a);
            boolean h2 = sk2Var.h(k3Var);
            Object L = sk2Var.L();
            if (h2 || L == su0.a) {
                L = new a6(k3Var, null, 9);
                sk2Var.h0(L);
            }
            l.h(l3Var, valueOf, (aj2) L, sk2Var);
            zy3 X = b53.X(wy3.a, 8.0f);
            if (z2) {
                url = dy4Var.j;
            } else {
                url = dy4Var.k;
            }
            URL url2 = url;
            boolean z3 = z2;
            os osVar = k3Var.c;
            if (z3) {
                j2 = s25.a;
            } else {
                j2 = s25.b;
            }
            pu.a(X, url2, osVar, new xq0(j2), ct3.H0(1085724290, new nl(z3, k3Var), sk2Var), sk2Var, 24582, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i2, 4, k3Var);
        }
    }

    public static final void c(rb4 rb4Var, ub ubVar, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        boolean h2;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1090171650);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = sk2Var.f(rb4Var);
            } else {
                h2 = sk2Var.h(rb4Var);
            }
            if (h2) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.f(ubVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(et0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        boolean z3 = true;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !sk2Var.f(rb4Var))) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object L = sk2Var.L();
            if (z4 || L == su0.a) {
                L = new fp2(ubVar, rb4Var);
                sk2Var.h0(L);
            }
            oj.a((fp2) L, null, new dr4(false, mx5.Inherit, false, 0), et0Var, sk2Var, ((i3 << 3) & 7168) | RendererDebugBridge.CAPTURE_HEIGHT, 2);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(rb4Var, ubVar, et0Var, i2, 0);
        }
    }

    public static final void d(final rb4 rb4Var, final boolean z, final rb5 rb5Var, final boolean z2, long j2, final float f2, final zy3 zy3Var, tu0 tu0Var, final int i2) {
        int i3;
        boolean z3;
        final long j3;
        int i4;
        long j4;
        final boolean z4;
        g20 g20Var;
        boolean z5;
        boolean z6;
        boolean z7;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h2;
        int i9;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-466280168);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = sk2Var.f(rb4Var);
            } else {
                h2 = sk2Var.h(rb4Var);
            }
            if (h2) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.g(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.d(rb5Var.ordinal())) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.g(z2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((1572864 & i2) == 0) {
            if (sk2Var.f(zy3Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((533651 & i3) != 533650) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sk2Var.O(i3 & 1, z3)) {
            sk2Var.T();
            if ((i2 & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
                i4 = i3 & (-57345);
                j4 = j2;
            } else {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            }
            sk2Var.q();
            if (z) {
                qz5 qz5Var = az5.a;
                if ((rb5Var == rb5.Ltr && !z2) || (rb5Var == rb5.Rtl && z2)) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z4 = z7;
            } else {
                qz5 qz5Var2 = az5.a;
                if ((rb5Var == rb5.Ltr && !z2) || (rb5Var == rb5.Rtl && z2)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            }
            if (z4) {
                g20Var = b;
            } else {
                g20Var = a;
            }
            int i10 = i4 & 14;
            if (i10 != 4 && ((i4 & 8) == 0 || !sk2Var.h(rb4Var))) {
                z5 = false;
            } else {
                z5 = true;
            }
            if ((i4 & 112) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean g2 = z6 | z5 | sk2Var.g(z4);
            Object L = sk2Var.L();
            if (g2 || L == su0.a) {
                L = new mi2() { // from class: hl
                    @Override // defpackage.mi2
                    public final Object n(Object obj) {
                        dp2 dp2Var;
                        yy5 yy5Var;
                        boolean z8;
                        rz5 rz5Var = (rz5) obj;
                        long a2 = rb4.this.a();
                        qz5 qz5Var3 = az5.a;
                        if (z) {
                            dp2Var = dp2.SelectionStart;
                        } else {
                            dp2Var = dp2.SelectionEnd;
                        }
                        if (z4) {
                            yy5Var = yy5.Left;
                        } else {
                            yy5Var = yy5.Right;
                        }
                        yy5 yy5Var2 = yy5Var;
                        if ((9223372034707292159L & a2) != 9205357640488583168L) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        rz5Var.b(qz5Var3, new zy5(dp2Var, a2, yy5Var2, z8));
                        return o27.a;
                    }
                };
                sk2Var.h0(L);
            }
            final zy3 a2 = fz5.a(zy3Var, false, (mi2) L);
            final fa7 fa7Var = (fa7) sk2Var.j(ov0.t);
            long j5 = j4;
            g20 g20Var2 = g20Var;
            j3 = j5;
            c(rb4Var, g20Var2, ct3.H0(1365123137, new aj2() { // from class: il
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    boolean z8;
                    tu0 tu0Var2 = (tu0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    sk2 sk2Var2 = (sk2) tu0Var2;
                    if (sk2Var2.O(intValue & 1, z8)) {
                        dq a3 = ov0.t.a(fa7.this);
                        final long j6 = j3;
                        final boolean z9 = z4;
                        final zy3 zy3Var2 = a2;
                        final rb4 rb4Var2 = rb4Var;
                        dk7.a(a3, ct3.H0(1260045569, new aj2() { // from class: kl
                            @Override // defpackage.aj2
                            public final Object j(Object obj3, Object obj4) {
                                boolean z10;
                                lt ltVar;
                                tu0 tu0Var3 = (tu0) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                sk2 sk2Var3 = (sk2) tu0Var3;
                                if (sk2Var3.O(intValue2 & 1, z10)) {
                                    long j7 = j6;
                                    int i11 = (j7 > 9205357640488583168L ? 1 : (j7 == 9205357640488583168L ? 0 : -1));
                                    boolean z11 = z9;
                                    zy3 zy3Var3 = zy3Var2;
                                    final rb4 rb4Var3 = rb4Var2;
                                    sn1 sn1Var = su0.a;
                                    if (i11 != 0) {
                                        sk2Var3.X(3458246);
                                        if (z11) {
                                            ltVar = tq5.b;
                                        } else {
                                            ltVar = tq5.a;
                                        }
                                        zy3 g3 = o76.g(zy3Var3, ni1.b(j7), ni1.a(j7), RecyclerView.A1, RecyclerView.A1, 12);
                                        sr5 a4 = rr5.a(ltVar, y60.g0, sk2Var3, 0);
                                        int hashCode = Long.hashCode(sk2Var3.T);
                                        sm4 l2 = sk2Var3.l();
                                        zy3 e0 = l07.e0(sk2Var3, g3);
                                        nu0.i.getClass();
                                        mv0 mv0Var = mu0.b;
                                        sk2Var3.b0();
                                        if (sk2Var3.S) {
                                            sk2Var3.k(mv0Var);
                                        } else {
                                            sk2Var3.k0();
                                        }
                                        oo2.S(sk2Var3, mu0.f, a4);
                                        oo2.S(sk2Var3, mu0.e, l2);
                                        oo2.S(sk2Var3, mu0.g, Integer.valueOf(hashCode));
                                        oo2.P(sk2Var3, mu0.h);
                                        oo2.S(sk2Var3, mu0.d, e0);
                                        boolean h3 = sk2Var3.h(rb4Var3);
                                        Object L2 = sk2Var3.L();
                                        if (h3 || L2 == sn1Var) {
                                            L2 = new ki2() { // from class: ll
                                                @Override // defpackage.ki2
                                                public final Object c() {
                                                    int i12 = r2;
                                                    boolean z12 = false;
                                                    rb4 rb4Var4 = rb4Var3;
                                                    switch (i12) {
                                                        case 0:
                                                            if ((9223372034707292159L & rb4Var4.a()) != 9205357640488583168L) {
                                                                z12 = true;
                                                            }
                                                            return Boolean.valueOf(z12);
                                                        default:
                                                            if ((9223372034707292159L & rb4Var4.a()) != 9205357640488583168L) {
                                                                z12 = true;
                                                            }
                                                            return Boolean.valueOf(z12);
                                                    }
                                                }
                                            };
                                            sk2Var3.h0(L2);
                                        }
                                        se.e(wy3.a, (ki2) L2, z11, sk2Var3, 6);
                                        sk2Var3.p(true);
                                        sk2Var3.p(false);
                                    } else {
                                        sk2Var3.X(4389176);
                                        boolean h4 = sk2Var3.h(rb4Var3);
                                        Object L3 = sk2Var3.L();
                                        if (h4 || L3 == sn1Var) {
                                            L3 = new ki2() { // from class: ll
                                                @Override // defpackage.ki2
                                                public final Object c() {
                                                    int i12 = r2;
                                                    boolean z12 = false;
                                                    rb4 rb4Var4 = rb4Var3;
                                                    switch (i12) {
                                                        case 0:
                                                            if ((9223372034707292159L & rb4Var4.a()) != 9205357640488583168L) {
                                                                z12 = true;
                                                            }
                                                            return Boolean.valueOf(z12);
                                                        default:
                                                            if ((9223372034707292159L & rb4Var4.a()) != 9205357640488583168L) {
                                                                z12 = true;
                                                            }
                                                            return Boolean.valueOf(z12);
                                                    }
                                                }
                                            };
                                            sk2Var3.h0(L3);
                                        }
                                        se.e(zy3Var3, (ki2) L3, z11, sk2Var3, 0);
                                        sk2Var3.p(false);
                                    }
                                } else {
                                    sk2Var3.R();
                                }
                                return o27.a;
                            }
                        }, sk2Var2), sk2Var2, 56);
                    } else {
                        sk2Var2.R();
                    }
                    return o27.a;
                }
            }, sk2Var), sk2Var, i10 | RendererDebugBridge.CAPTURE_HEIGHT);
        } else {
            sk2Var.R();
            j3 = j2;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            final long j6 = j3;
            r.d = new aj2() { // from class: jl
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    se.d(rb4.this, z, rb5Var, z2, j6, f2, zy3Var, (tu0) obj, ep2.I(i2 | 1));
                    return o27.a;
                }
            };
        }
    }

    public static final void e(zy3 zy3Var, ki2 ki2Var, boolean z, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(2111672474);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if (sk2Var.h(ki2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i3 | i4;
        if (sk2Var.g(z)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i8 & 1, z2)) {
            qz5 qz5Var = az5.a;
            cg2.k(sk2Var, l07.A(o76.i(zy3Var, 25.0f, 25.0f), new nl(ki2Var, z)));
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ml(zy3Var, ki2Var, z, i2);
        }
    }

    public static final int f(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.ki2 r5, defpackage.aj2 r6, defpackage.k11 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.fc
            if (r0 == 0) goto L13
            r0 = r7
            fc r0 = (defpackage.fc) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            fc r0 = new fc
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r7)     // Catch: defpackage.bc -> L40
            goto L40
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2e:
            defpackage.me2.a0(r7)
            a0 r7 = new a0     // Catch: defpackage.bc -> L40
            r2 = 3
            r7.<init>(r5, r6, r3, r2)     // Catch: defpackage.bc -> L40
            r0.X = r4     // Catch: defpackage.bc -> L40
            java.lang.Object r5 = defpackage.iq2.k(r7, r0)     // Catch: defpackage.bc -> L40
            if (r5 != r1) goto L40
            return r1
        L40:
            o27 r5 = defpackage.o27.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.g(ki2, aj2, k11):java.lang.Object");
    }

    public static final Object h(pc pcVar, Object obj, float f2, nk6 nk6Var) {
        Object b2 = pcVar.b(obj, r24.Default, new ec(pcVar, f2, null), nk6Var);
        if (b2 == p31.COROUTINE_SUSPENDED) {
            return b2;
        }
        return o27.a;
    }

    public static int i(int i2, int i3) {
        return (i2 & 16777215) | (i3 << 24);
    }

    public static u92 j(u92 u92Var, int i2) {
        h60 h60Var = h60.SUSPEND;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            i.g(wh1.g(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i2 == -1) {
            h60Var = h60.DROP_OLDEST;
            i2 = 0;
        }
        int i3 = i2;
        h60 h60Var2 = h60Var;
        if (u92Var instanceof nj2) {
            return mj2.w((nj2) u92Var, null, i3, h60Var2, 1);
        }
        return new pj0(u92Var, null, i3, h60Var2, 2);
    }

    public static final h90 k(aj2 aj2Var) {
        return new h90(aj2Var, mp1.A, -2, h60.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable l(defpackage.u92 r6, defpackage.w92 r7, defpackage.k11 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.na2
            if (r0 == 0) goto L13
            r0 = r8
            na2 r0 = (defpackage.na2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            na2 r0 = new na2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            n75 r6 = r0.R
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L2a
            goto L4b
        L2a:
            r7 = move-exception
            goto L4e
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L32:
            defpackage.me2.a0(r8)
            n75 r8 = new n75
            r8.<init>()
            r90 r2 = new r90     // Catch: java.lang.Throwable -> L4c
            r5 = 6
            r2.<init>(r5, r7, r8)     // Catch: java.lang.Throwable -> L4c
            r0.R = r8     // Catch: java.lang.Throwable -> L4c
            r0.Y = r4     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 != r1) goto L4b
            return r1
        L4b:
            return r3
        L4c:
            r7 = move-exception
            r6 = r8
        L4e:
            java.lang.Object r6 = r6.A
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 == 0) goto L5a
            boolean r8 = r6.equals(r7)
            if (r8 != 0) goto L7d
        L5a:
            e31 r8 = r0.B
            r8.getClass()
            k45 r0 = defpackage.k45.d0
            c31 r8 = r8.I(r0)
            c63 r8 = (defpackage.c63) r8
            if (r8 == 0) goto L7e
            boolean r0 = r8.isCancelled()
            if (r0 != 0) goto L70
            goto L7e
        L70:
            java.util.concurrent.CancellationException r8 = r8.K()
            if (r8 == 0) goto L7e
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L7d
            goto L7e
        L7d:
            throw r7
        L7e:
            if (r6 != 0) goto L81
            return r7
        L81:
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 == 0) goto L89
            defpackage.pu.k(r6, r7)
            throw r6
        L89:
            defpackage.pu.k(r7, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.l(u92, w92, k11):java.io.Serializable");
    }

    public static final Object m(u92 u92Var, aj2 aj2Var, j11 j11Var) {
        int i2 = xa2.a;
        Object a2 = j(X(u92Var, new dx1(aj2Var, (j11) null, 1)), 0).a(a84.A, j11Var);
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        o27 o27Var = o27.a;
        if (a2 != p31Var) {
            a2 = o27Var;
        }
        if (a2 == p31Var) {
            return a2;
        }
        return o27Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1 <= r6.getHeight()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.nh n(defpackage.g80 r27, float r28) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.n(g80, float):nh");
    }

    public static final u92 o(u92 u92Var, long j2) {
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 >= 0) {
            if (i2 == 0) {
                return u92Var;
            }
            return new bz0(3, new da2(new u4(7, j2), u92Var, null));
        }
        i.i("Debounce timeout should not be negative");
        return null;
    }

    public static boolean p(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File file2 : listFiles) {
                if (p(file2) && z) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    public static final u92 q(u92 u92Var) {
        if (u92Var instanceof ce6) {
            return u92Var;
        }
        return w81.k(u92Var, w81.n);
    }

    public static final float r(float[] fArr, int i2, float[] fArr2, int i3) {
        int i4 = i2 * 4;
        float f2 = (fArr[i4 + 1] * fArr2[4 + i3]) + (fArr[i4] * fArr2[i3]);
        return (fArr[i4 + 3] * fArr2[12 + i3]) + (fArr[i4 + 2] * fArr2[8 + i3]) + f2;
    }

    public static final Object s(w92 w92Var, u92 u92Var, nk6 nk6Var) {
        if (!(w92Var instanceof ft6)) {
            Object a2 = u92Var.a(w92Var, nk6Var);
            if (a2 == p31.COROUTINE_SUSPENDED) {
                return a2;
            }
            return o27.a;
        }
        throw ((ft6) w92Var).A;
    }

    public static final Enum t(String str, Enum[] enumArr) {
        enumArr.getClass();
        str.getClass();
        for (Enum r2 : enumArr) {
            if (gh6.g0(r2.name(), str, true)) {
                return r2;
            }
        }
        i.i(wh1.A("Value ", str, " does not represent an enum entry"));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.u92 r7, defpackage.k11 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ab2
            if (r0 == 0) goto L13
            r0 = r8
            ab2 r0 = (defpackage.ab2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ab2 r0 = new ab2
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            an1 r4 = defpackage.n84.a
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L30
            ya2 r7 = r0.X
            n75 r1 = r0.R
            defpackage.me2.a0(r8)     // Catch: defpackage.o -> L2e
            goto L65
        L2e:
            r8 = move-exception
            goto L59
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r3
        L36:
            defpackage.me2.a0(r8)
            n75 r8 = new n75
            r8.<init>()
            r8.A = r4
            ya2 r2 = new ya2
            r6 = 0
            r2.<init>(r6, r8)
            r0.R = r8     // Catch: defpackage.o -> L55
            r0.X = r2     // Catch: defpackage.o -> L55
            r0.Z = r5     // Catch: defpackage.o -> L55
            java.lang.Object r7 = r7.a(r2, r0)     // Catch: defpackage.o -> L55
            if (r7 != r1) goto L53
            return r1
        L53:
            r1 = r8
            goto L65
        L55:
            r7 = move-exception
            r1 = r8
            r8 = r7
            r7 = r2
        L59:
            java.lang.Object r2 = r8.A
            if (r2 != r7) goto L70
            e31 r7 = r0.B
            r7.getClass()
            defpackage.ln2.B(r7)
        L65:
            java.lang.Object r7 = r1.A
            if (r7 == r4) goto L6a
            return r7
        L6a:
            java.lang.String r7 = "Expected at least one element"
            defpackage.vd6.e(r7)
            return r3
        L70:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.u(u92, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(defpackage.u92 r7, defpackage.aj2 r8, defpackage.j11 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.bb2
            if (r0 == 0) goto L13
            r0 = r9
            bb2 r0 = (defpackage.bb2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            bb2 r0 = new bb2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            an1 r4 = defpackage.n84.a
            r5 = 1
            if (r2 == 0) goto L36
            if (r2 != r5) goto L30
            r90 r7 = r0.X
            n75 r8 = r0.R
            defpackage.me2.a0(r9)     // Catch: defpackage.o -> L2e
            goto L66
        L2e:
            r9 = move-exception
            goto L5a
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r3
        L36:
            defpackage.me2.a0(r9)
            n75 r9 = new n75
            r9.<init>()
            r9.A = r4
            r90 r2 = new r90
            r6 = 9
            r2.<init>(r6, r8, r9)
            r0.R = r9     // Catch: defpackage.o -> L56
            r0.X = r2     // Catch: defpackage.o -> L56
            r0.Z = r5     // Catch: defpackage.o -> L56
            java.lang.Object r7 = r7.a(r2, r0)     // Catch: defpackage.o -> L56
            if (r7 != r1) goto L54
            return r1
        L54:
            r8 = r9
            goto L66
        L56:
            r7 = move-exception
            r8 = r9
            r9 = r7
            r7 = r2
        L5a:
            java.lang.Object r1 = r9.A
            if (r1 != r7) goto L71
            e31 r7 = r0.B
            r7.getClass()
            defpackage.ln2.B(r7)
        L66:
            java.lang.Object r7 = r8.A
            if (r7 == r4) goto L6b
            return r7
        L6b:
            java.lang.String r7 = "Expected at least one element matching the predicate"
            defpackage.vd6.e(r7)
            return r3
        L71:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.v(u92, aj2, j11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.u92 r4, defpackage.k11 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.cb2
            if (r0 == 0) goto L13
            r0 = r5
            cb2 r0 = (defpackage.cb2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            cb2 r0 = new cb2
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ya2 r4 = r0.X
            n75 r1 = r0.R
            defpackage.me2.a0(r5)     // Catch: defpackage.o -> L2b
            goto L60
        L2b:
            r5 = move-exception
            goto L54
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L34:
            defpackage.me2.a0(r5)
            n75 r5 = new n75
            r5.<init>()
            ya2 r2 = new ya2
            r2.<init>(r3, r5)
            r0.R = r5     // Catch: defpackage.o -> L50
            r0.X = r2     // Catch: defpackage.o -> L50
            r0.Z = r3     // Catch: defpackage.o -> L50
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: defpackage.o -> L50
            if (r4 != r1) goto L4e
            return r1
        L4e:
            r1 = r5
            goto L60
        L50:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L54:
            java.lang.Object r2 = r5.A
            if (r2 != r4) goto L63
            e31 r4 = r0.B
            r4.getClass()
            defpackage.ln2.B(r4)
        L60:
            java.lang.Object r4 = r1.A
            return r4
        L63:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.w(u92, k11):java.lang.Object");
    }

    public static final u92 x(u92 u92Var, e31 e31Var) {
        if (e31Var.I(k45.d0) == null) {
            if (e31Var.equals(mp1.A)) {
                return u92Var;
            }
            if (u92Var instanceof nj2) {
                return mj2.w((nj2) u92Var, e31Var, 0, null, 6);
            }
            return new pj0(u92Var, e31Var, 0, null, 12);
        }
        c44.u(e31Var, "Flow context cannot contain job in it. Had ");
        return null;
    }

    public static final void y(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static c31 z(c31 c31Var, d31 d31Var) {
        d31Var.getClass();
        if (b53.x(c31Var.getKey(), d31Var)) {
            return c31Var;
        }
        return null;
    }
}
