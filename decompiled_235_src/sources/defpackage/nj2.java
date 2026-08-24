package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nj2  reason: default package */
/* loaded from: classes.dex */
public abstract class nj2 {
    public static zh a;
    public static wd b;
    public static zj0 c;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static e33 g;
    public static e33 h;

    public static final int B(int i, String str) {
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }

    public static final p46 C(px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.b0(1967007413);
        Object[] objArr = new Object[0];
        Object P = xq2Var.P();
        if (P == ox0.a) {
            P = new kt5(3);
            xq2Var.l0(P);
        }
        p46 p46Var = (p46) qo2.J(objArr, p46.X, (on2) P, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT);
        p46Var.L = (q46) xq2Var.j(s46.a);
        xq2Var.p(false);
        return p46Var;
    }

    public static void D(Runnable runnable) {
        if (x()) {
            runnable.run();
        } else {
            np2.A("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static a74 E(a74 a74Var, float f2, ke6 ke6Var, boolean z, long j, int i) {
        boolean z2;
        long j2;
        boolean z3;
        if ((i & 4) != 0) {
            if (om1.a(f2, RecyclerView.B1) > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            z2 = z3;
        } else {
            z2 = z;
        }
        long j3 = yt2.a;
        if ((i & 16) != 0) {
            j2 = j3;
        } else {
            j2 = j;
        }
        if (om1.a(f2, RecyclerView.B1) <= 0 && !z2) {
            return a74Var;
        }
        return a74Var.d(new he6(f2, ke6Var, z2, j3, j2));
    }

    public static String F(long j) {
        return "PointerId(value=" + j + ')';
    }

    public static final qo7 G(ar0 ar0Var, bp7 bp7Var, m9 m9Var, j71 j71Var, px0 px0Var) {
        os0 a2;
        if (m9Var != null) {
            ap7 viewModelStore = bp7Var.getViewModelStore();
            viewModelStore.getClass();
            j71Var.getClass();
            a2 = new os0(viewModelStore, m9Var, j71Var);
        } else if (bp7Var instanceof mw2) {
            ap7 viewModelStore2 = bp7Var.getViewModelStore();
            yo7 defaultViewModelProviderFactory = ((mw2) bp7Var).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            j71Var.getClass();
            a2 = new os0(viewModelStore2, defaultViewModelProviderFactory, j71Var);
        } else {
            a2 = xo7.a(bp7Var, null, 6);
        }
        return a2.Z(ar0Var);
    }

    public static final void a(final b37 b37Var, final String str, final eo2 eo2Var, final wq7 wq7Var, final eo2 eo2Var2, final eo2 eo2Var3, final boolean z, final boolean z2, final boolean z3, final r94 r94Var, final lq4 lq4Var, final ke6 ke6Var, final i17 i17Var, final zv0 zv0Var, px0 px0Var, final int i, final int i2) {
        int i3;
        eo2 eo2Var4;
        int i4;
        eo2 eo2Var5;
        int i5;
        lq4 lq4Var2;
        xq2 xq2Var;
        z63 z63Var;
        vs0 vs0Var;
        boolean z4;
        boolean z5;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(418608794);
        if ((i & 6) == 0) {
            i3 = (xq2Var2.d(b37Var.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq2Var2.f(str) ? 32 : 16;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            eo2Var4 = eo2Var;
            i3 |= xq2Var2.h(eo2Var4) ? 256 : 128;
        } else {
            eo2Var4 = eo2Var;
        }
        if ((i & 3072) == 0) {
            i3 |= xq2Var2.f(wq7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= xq2Var2.h(eo2Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            eo2Var5 = eo2Var3;
            i3 |= xq2Var2.h(eo2Var5) ? 131072 : 65536;
        } else {
            i4 = 196608;
            eo2Var5 = eo2Var3;
        }
        if ((i & 1572864) == 0) {
            i3 |= xq2Var2.h(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= xq2Var2.h(null) ? 8388608 : Compress.MAXWINSIZE;
        }
        if ((100663296 & i) == 0) {
            i3 |= xq2Var2.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= xq2Var2.g(z2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (xq2Var2.g(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= xq2Var2.f(r94Var) ? 32 : 16;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            lq4Var2 = lq4Var;
            i5 |= xq2Var2.f(lq4Var2) ? 256 : 128;
        } else {
            lq4Var2 = lq4Var;
        }
        if ((i2 & 3072) == 0) {
            i5 |= xq2Var2.f(ke6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= xq2Var2.f(i17Var) ? 16384 : 8192;
        }
        if ((i2 & i4) == 0) {
            i5 |= xq2Var2.h(zv0Var) ? 131072 : 65536;
        }
        if (xq2Var2.S(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            boolean z6 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object P = xq2Var2.P();
            if (z6 || P == ox0.a) {
                P = wq7Var.a(new fp(str));
                xq2Var2.l0(P);
            }
            String str2 = ((p97) P).a.B;
            if (((Boolean) bw7.a(r94Var, xq2Var2, (i5 >> 3) & 14).getValue()).booleanValue()) {
                z63Var = z63.Focused;
            } else {
                z63Var = str2.length() == 0 ? z63.UnfocusedEmpty : z63.UnfocusedNotEmpty;
            }
            t17 t17Var = new t17(i17Var, z2, z3, r94Var);
            nq6 nq6Var = ye7.b;
            xe7 xe7Var = (xe7) xq2Var2.j(nq6Var);
            s47 s47Var = xe7Var.g;
            s47 s47Var2 = xe7Var.l;
            long b2 = s47Var.b();
            long j = kt0.h;
            boolean z7 = (kt0.d(b2, j) && !kt0.d(s47Var2.b(), j)) || (!kt0.d(s47Var.b(), j) && kt0.d(s47Var2.b(), j));
            vs0 vs0Var2 = vs0.x0;
            xq2Var2.b0(-1443813555);
            long b3 = ((xe7) xq2Var2.j(nq6Var)).l.b();
            if (z7) {
                xq2Var2.b0(-887928539);
                if (b3 == 16) {
                    b3 = ((kt0) t17Var.e(z63Var, xq2Var2, 0)).a;
                }
                z4 = false;
                xq2Var2.p(false);
                vs0Var = vs0Var2;
            } else {
                vs0Var = vs0Var2;
                z4 = false;
                xq2Var2.b0(1218284988);
                xq2Var2.p(false);
            }
            xq2Var2.p(z4);
            xq2Var2.b0(-1443806289);
            long b4 = ((xe7) xq2Var2.j(nq6Var)).g.b();
            if (z7) {
                xq2Var2.b0(-1026713946);
                if (b4 == 16) {
                    b4 = ((kt0) t17Var.e(z63Var, xq2Var2, 0)).a;
                }
                z5 = false;
                xq2Var2.p(false);
            } else {
                z5 = false;
                xq2Var2.b0(798166043);
                xq2Var2.p(false);
            }
            xq2Var2.p(z5);
            xq2Var = xq2Var2;
            vs0Var.m(z63Var, b3, b4, t17Var, eo2Var2 != null ? true : z5, n16.I(33336375, new s17(eo2Var2, eo2Var5, str2, i17Var, z2, z3, r94Var, ke6Var, b37Var, eo2Var4, z, lq4Var2, z7, zv0Var), xq2Var2), xq2Var, 1769472);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: m17
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(i | 1);
                    int a02 = ii2.a0(i2);
                    nj2.a(b37.this, str, eo2Var, wq7Var, eo2Var2, eo2Var3, z, z2, z3, r94Var, lq4Var, ke6Var, i17Var, zv0Var, (px0) obj, a0, a02);
                    return jg7.a;
                }
            };
        }
    }

    public static final void b(long j, s47 s47Var, eo2 eo2Var, px0 px0Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2064632657);
        if (xq2Var.e(j)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i3 | i;
        int i9 = i2 & 2;
        if (i9 != 0) {
            i5 = i8 | 48;
        } else {
            if (xq2Var.f(s47Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 = i8 | i4;
        }
        if ((i2 & 4) != 0) {
            i5 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(null)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i5 |= i6;
        }
        if (xq2Var.h(eo2Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i10 = i5 | i7;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            if (i9 != 0) {
                s47Var = null;
            }
            zv0 I = n16.I(-650790565, new n17(j, (Float) null, eo2Var), xq2Var);
            if (s47Var != null) {
                xq2Var.b0(-162880673);
                x37.a(s47Var, I, xq2Var, ((i10 >> 3) & 14) | 48);
            } else {
                xq2Var.b0(-162879037);
                I.o(xq2Var, 6);
            }
            xq2Var.p(false);
        } else {
            xq2Var.V();
        }
        s47 s47Var2 = s47Var;
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new o17(j, s47Var2, eo2Var, i, i2);
        }
    }

    public static cj c(String str, s47 s47Var, long j, qh1 qh1Var, ki2 ki2Var, int i, int i2) {
        yt1 yt1Var = yt1.A;
        return new cj(new gj(str, s47Var, yt1Var, yt1Var, ki2Var, qh1Var), i, 1, j);
    }

    public static final void d(lb5 lb5Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        iy0 iy0Var;
        iy0 iy0Var2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-713521460);
        if (xq2Var.h(lb5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            y16 b2 = z16.b(15.0f);
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            x64 x64Var = x64.a;
            a74 g2 = u24.g(ge7.P(x64Var, 16.0f, 8.0f), b2);
            long j = F.d;
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g2, j, jy2Var);
            long j2 = es7.p;
            a74 I = ak7.I(L, 1.0f, kt0.c(0.35f, j2), b2);
            e40 e40Var = d90.L;
            e34 d2 = h70.d(e40Var, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, I);
            jx0.i.getClass();
            iy0 iy0Var3 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 O = ge7.O(x64Var, 14.0f);
            d40 d40Var = d90.i0;
            du duVar = ju.a;
            l26 a2 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, O);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x23 x23Var = new x23((Context) xq2Var.j(kf.b));
            x23Var.c = lb1.A("https://media.retroachievements.org/UserPic/", lb5Var.a, ".png");
            x23Var.b(true);
            gi2.b(x23Var.a(), null, vy7.L(u24.g(dj6.i(x64Var, 46.0f), z16.a), kt0.c(0.18f, j2), jy2Var), null, RecyclerView.B1, xq2Var, 48, 4088);
            a74 S = ge7.S(x64Var, 13.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
            yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, S);
            xq2Var.f0();
            if (xq2Var.S) {
                iy0Var = iy0Var3;
                xq2Var.k(iy0Var);
            } else {
                iy0Var = iy0Var3;
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            l26 a4 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E4 = l.E(xq2Var, x64Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a4);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E4);
            iy0 iy0Var4 = iy0Var;
            i13.a(q60.F(), null, dj6.i(x64Var, 12.0f), j2, xq2Var, 3504, 0);
            x37.b(yh2.O(xq2Var, R.string.ra_welcome_eyebrow), ge7.S(x64Var, 5.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), j2, hi2.E(9), oj2.e0, qs7.c, hi2.D(0.8d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 14355888, 0, 130832);
            xq2Var.p(true);
            x37.b(lb5Var.a, ge7.S(x64Var, RecyclerView.B1, 2.0f, RecyclerView.B1, RecyclerView.B1, 13), F.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var, 1772592, 3120, 120720);
            xq2Var = xq2Var;
            a74 S2 = ge7.S(x64Var, RecyclerView.B1, 6.0f, RecyclerView.B1, RecyclerView.B1, 13);
            l26 a5 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode5 = Long.hashCode(xq2Var.T);
            xv4 l5 = xq2Var.l();
            a74 E5 = l.E(xq2Var, S2);
            xq2Var.f0();
            if (xq2Var.S) {
                iy0Var2 = iy0Var4;
                xq2Var.k(iy0Var2);
            } else {
                iy0Var2 = iy0Var4;
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a5);
            yh2.K(xq2Var, pnVar2, l5);
            i61.w(hashCode5, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E5);
            String format = integerInstance.format(lb5Var.b);
            format.getClass();
            e(yh2.N(R.string.ra_profile_hardcore_points, new Object[]{format}, xq2Var), j2, xq2Var, 48);
            a74 S3 = ge7.S(x64Var, 6.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
            e34 d3 = h70.d(e40Var, false);
            int hashCode6 = Long.hashCode(xq2Var.T);
            xv4 l6 = xq2Var.l();
            a74 E6 = l.E(xq2Var, S3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d3);
            yh2.K(xq2Var, pnVar2, l6);
            i61.w(hashCode6, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E6);
            String format2 = integerInstance.format(lb5Var.c);
            format2.getClass();
            e(yh2.N(R.string.ra_profile_casual_points, new Object[]{format2}, xq2Var), F.l, xq2Var, 0);
            xq2Var.p(true);
            xq2Var.p(true);
            xq2Var.p(true);
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(lb5Var, i, 24);
        }
    }

    public static final void e(final String str, final long j, px0 px0Var, final int i) {
        int i2;
        boolean z;
        xq2 xq2Var;
        int i3;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-47713197);
        if (xq2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if ((i & 48) == 0) {
            if (xq2Var2.e(j)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i4 |= i3;
        }
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i4 & 1, z)) {
            pi2 pi2Var = qs7.b;
            int i5 = i4;
            xq2Var = xq2Var2;
            x37.b(str, ge7.P(vy7.L(u24.g(x64.a, z16.b(6.0f)), kt0.c(0.14f, j), u24.m), 7.0f, 3.0f), j, hi2.E(10), oj2.d0, pi2Var, hi2.D(0.4d), null, 0L, 0, false, 0, 0, null, null, xq2Var, (i5 & 14) | 14355456 | ((i5 << 3) & 896), 0, 130832);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: on5
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(i | 1);
                    nj2.e(str, j, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final boolean f(float f2) {
        if (!Float.isNaN(f2) && Math.abs(f2) >= 0.5f) {
            return false;
        }
        return true;
    }

    public static final List g(cq3 cq3Var, mq3 mq3Var, p70 p70Var) {
        boolean z;
        j93 j93Var;
        ua4 ua4Var = p70Var.a;
        if (ua4Var.L != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && mq3Var.A.isEmpty()) {
            return yt1.A;
        }
        ArrayList arrayList = new ArrayList();
        if (p70Var.a.L != 0) {
            int i = ua4Var.L;
            if (i != 0) {
                Object[] objArr = ua4Var.A;
                int i2 = ((np3) objArr[0]).a;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = ((np3) objArr[i3]).a;
                    if (i4 < i2) {
                        i2 = i4;
                    }
                }
                if (i2 < 0) {
                    s53.a("negative minIndex");
                }
                int i5 = ua4Var.L;
                if (i5 != 0) {
                    Object[] objArr2 = ua4Var.A;
                    int i6 = ((np3) objArr2[0]).b;
                    for (int i7 = 0; i7 < i5; i7++) {
                        int i8 = ((np3) objArr2[i7]).b;
                        if (i8 > i6) {
                            i6 = i8;
                        }
                    }
                    j93Var = new j93(i2, Math.min(i6, cq3Var.a() - 1), 1);
                } else {
                    fa6.e("MutableVector is empty.");
                    return null;
                }
            } else {
                fa6.e("MutableVector is empty.");
                return null;
            }
        } else {
            j93Var = l93.R;
        }
        int size = mq3Var.A.size();
        for (int i9 = 0; i9 < size; i9++) {
            lq3 lq3Var = (lq3) mq3Var.get(i9);
            int y = bl2.y(lq3Var.c, cq3Var, lq3Var.a);
            int i10 = j93Var.A;
            if ((y > j93Var.B || i10 > y) && y >= 0 && y < cq3Var.a()) {
                arrayList.add(Integer.valueOf(y));
            }
        }
        int i11 = j93Var.A;
        int i12 = j93Var.B;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public static void h() {
        np2.A("Not in application's main thread", x());
    }

    public static rf1 i(long j, long j2, long j3, long j4, px0 px0Var, int i) {
        long j5;
        long j6;
        long j7;
        long j8;
        if ((i & 1) != 0) {
            j5 = ((kt0) ((ut0) ((xq2) px0Var).j(vt0.a)).d.getValue()).a;
        } else {
            j5 = j;
        }
        if ((i & 2) != 0) {
            j6 = j5;
        } else {
            j6 = j2;
        }
        if ((i & 8) != 0) {
            j7 = ((ut0) ((xq2) px0Var).j(vt0.a)).j();
        } else {
            j7 = j3;
        }
        if ((i & 16) != 0) {
            j8 = ((ut0) ((xq2) px0Var).j(vt0.a)).f();
        } else {
            j8 = j4;
        }
        py0 py0Var = j31.a;
        xq2 xq2Var = (xq2) px0Var;
        long j9 = ((kt0) xq2Var.j(py0Var)).a;
        nq6 nq6Var = vt0.a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j9);
        } else {
            hv.N(j9);
        }
        long l = hv.l(kt0.c(0.38f, j5), ((ut0) xq2Var.j(nq6Var)).j());
        xq2 xq2Var2 = (xq2) px0Var;
        long j10 = ((kt0) xq2Var2.j(py0Var)).a;
        if (((ut0) xq2Var2.j(nq6Var)).k()) {
            hv.N(j10);
        } else {
            hv.N(j10);
        }
        long j11 = j5;
        long l2 = hv.l(kt0.c(0.38f, j6), ((ut0) xq2Var2.j(nq6Var)).j());
        xq2 xq2Var3 = (xq2) px0Var;
        long j12 = ((kt0) xq2Var3.j(py0Var)).a;
        if (((ut0) xq2Var3.j(nq6Var)).k()) {
            hv.N(j12);
        } else {
            hv.N(j12);
        }
        long j13 = j7;
        long l3 = hv.l(kt0.c(0.38f, j7), ((ut0) xq2Var3.j(nq6Var)).j());
        xq2 xq2Var4 = (xq2) px0Var;
        long j14 = ((kt0) xq2Var4.j(py0Var)).a;
        if (((ut0) xq2Var4.j(nq6Var)).k()) {
            hv.N(j14);
        } else {
            hv.N(j14);
        }
        return new rf1(j11, kt0.c(0.54f, j6), j13, kt0.c(0.38f, j8), l, kt0.c(0.54f, l2), l3, kt0.c(0.38f, hv.l(kt0.c(0.38f, j8), ((ut0) xq2Var4.j(nq6Var)).j())));
    }

    public static final boolean j(of5 of5Var, float f2, float f3) {
        float f4 = of5Var.a;
        if (f2 <= of5Var.c && f4 <= f2) {
            float f5 = of5Var.b;
            if (f3 <= of5Var.d && f5 <= f3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static qo7 k(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    newInstance.getClass();
                    return (qo7) newInstance;
                } catch (IllegalAccessException e2) {
                    u34.o("Cannot create an instance of ", cls, e2);
                    return null;
                } catch (InstantiationException e3) {
                    u34.o("Cannot create an instance of ", cls, e3);
                    return null;
                }
            }
            e41.p(cls, "Cannot create an instance of ");
            return null;
        } catch (NoSuchMethodException e4) {
            u34.o("Cannot create an instance of ", cls, e4);
            return null;
        }
    }

    public static void l(String str, String str2, Object obj) {
        Log.d("TransportRuntime.".concat(str), String.format(str2, obj));
    }

    public static final boolean o(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static oj2 p() {
        return oj2.e0;
    }

    public static hh5 q(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return hh5.ALLOW;
        }
        throw i61.j(it);
    }

    public static final Object r(x24 x24Var) {
        cm3 cm3Var;
        Object B = x24Var.B();
        if (B instanceof cm3) {
            cm3Var = (cm3) B;
        } else {
            cm3Var = null;
        }
        if (cm3Var == null) {
            return null;
        }
        return cm3Var.k0;
    }

    public static final int s(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else if (i3 < 0) {
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        } else {
            i.h("Step is zero.");
            return 0;
        }
        return i2;
    }

    public static oj2 t() {
        return oj2.d0;
    }

    public static final jl5 u(a47 a47Var, int i) {
        z37 z37Var = a47Var.a;
        v84 v84Var = a47Var.b;
        if (z37Var.a.B.length() != 0) {
            int d2 = v84Var.d(i);
            if ((i != 0 && d2 == v84Var.d(i - 1)) || (i != z37Var.a.B.length() && d2 == v84Var.d(i + 1))) {
                return a47Var.a(i);
            }
        }
        return a47Var.h(i);
    }

    public static final e33 v() {
        e33 e33Var = h;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Tv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(21.0f, 3.0f);
        ww2Var.m(3.0f, 3.0f);
        ww2Var.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
        ww2Var.u(12.0f);
        ww2Var.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        ww2Var.l(5.0f);
        ww2Var.u(2.0f);
        ww2Var.l(8.0f);
        ww2Var.u(-2.0f);
        ww2Var.l(5.0f);
        ww2Var.i(1.1f, RecyclerView.B1, 1.99f, -0.9f, 1.99f, -2.0f);
        ww2Var.m(23.0f, 5.0f);
        ww2Var.i(RecyclerView.B1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        ww2Var.g();
        ww2Var.o(21.0f, 17.0f);
        ww2Var.m(3.0f, 17.0f);
        ww2Var.m(3.0f, 5.0f);
        ww2Var.l(18.0f);
        ww2Var.u(12.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        h = b2;
        return b2;
    }

    public static final boolean w(float[] fArr) {
        if (fArr.length < 16 || fArr[0] != 1.0f || fArr[1] != RecyclerView.B1 || fArr[2] != RecyclerView.B1 || fArr[3] != RecyclerView.B1 || fArr[4] != RecyclerView.B1 || fArr[5] != 1.0f || fArr[6] != RecyclerView.B1 || fArr[7] != RecyclerView.B1 || fArr[8] != RecyclerView.B1 || fArr[9] != RecyclerView.B1 || fArr[10] != 1.0f || fArr[11] != RecyclerView.B1 || fArr[12] != RecyclerView.B1 || fArr[13] != RecyclerView.B1 || fArr[14] != RecyclerView.B1 || fArr[15] != 1.0f) {
            return false;
        }
        return true;
    }

    public static boolean x() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static final boolean y(Throwable th) {
        String message;
        if (!(th instanceof kh7) || (message = ((kh7) th).getMessage()) == null) {
            return false;
        }
        if (!qs6.j0(message, "Unpromoted_achievements_cannot_be_unlocked", true) && (!qs6.j0(message, "\"Code\":\"invalid_state\"", true) || !qs6.j0(message, "Unpromoted", true))) {
            return false;
        }
        return true;
    }

    public abstract int A(byte[] bArr, int i, int i2);

    public abstract String m(byte[] bArr, int i, int i2);

    public abstract int n(String str, byte[] bArr, int i, int i2);

    public boolean z(byte[] bArr, int i, int i2) {
        if (A(bArr, i, i2) == 0) {
            return true;
        }
        return false;
    }
}
