package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ls7  reason: default package */
/* loaded from: classes.dex */
public abstract class ls7 {
    public static final y16 a = z16.a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final a74 a74Var, final String str, ke6 ke6Var, final e33 e33Var, final String str2, final String str3, final String str4, int i, long j, px0 px0Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final long j2;
        int i12;
        boolean z;
        xq2 xq2Var;
        final ke6 ke6Var2;
        final int i13;
        cf5 t;
        ke6 ke6Var3;
        int i14;
        int i15;
        ke6 ke6Var4;
        int i16;
        long j3;
        pn pnVar;
        iy0 iy0Var;
        pn pnVar2;
        du duVar;
        ?? r13;
        float f;
        ne neVar;
        long j4;
        pn pnVar3;
        pn pnVar4;
        boolean z2;
        int i17;
        int i18;
        str2.getClass();
        str3.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1625939988);
        if (xq2Var2.f(a74Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i19 = i4 | i2;
        if (xq2Var2.f(str)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i20 = i19 | i5;
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if ((i3 & 4) == 0 && xq2Var2.f(ke6Var)) {
                i18 = 256;
                i20 |= i18;
            }
            i18 = 128;
            i20 |= i18;
        }
        if (xq2Var2.f(e33Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i21 = i20 | i6;
        if (xq2Var2.f(str2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i22 = i21 | i7;
        if (xq2Var2.f(str3)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i23 = i22 | i8;
        if (xq2Var2.f(str4)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i24 = i23 | i9;
        int i25 = i3 & 128;
        if (i25 != 0) {
            i24 |= 12582912;
        } else if ((12582912 & i2) == 0) {
            if (xq2Var2.d(i)) {
                i10 = 8388608;
            } else {
                i10 = Compress.MAXWINSIZE;
            }
            i24 |= i10;
            i11 = i3 & 256;
            if (i11 == 0) {
                i24 |= 100663296;
            } else if ((100663296 & i2) == 0) {
                j2 = j;
                if (xq2Var2.e(j2)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i24 |= i12;
                if ((i24 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq2Var2.S(i24 & 1, z)) {
                    xq2Var2.X();
                    if ((i2 & 1) != 0 && !xq2Var2.B()) {
                        xq2Var2.V();
                        if ((i3 & 4) != 0) {
                            i24 &= -897;
                        }
                        i16 = i;
                        i15 = i24;
                        j3 = j2;
                        ke6Var4 = ke6Var;
                    } else {
                        if ((i3 & 4) != 0) {
                            ke6Var3 = z16.b(10.0f);
                            i24 &= -897;
                        } else {
                            ke6Var3 = ke6Var;
                        }
                        if (i25 != 0) {
                            i14 = 1;
                        } else {
                            i14 = i;
                        }
                        if (i11 != 0) {
                            j2 = es7.p;
                        }
                        i15 = i24;
                        ke6Var4 = ke6Var3;
                        i16 = i14;
                        j3 = j2;
                    }
                    xq2Var2.q();
                    es7 es7Var = fs7.a;
                    y16 b = z16.b(15.0f);
                    a74 g = u24.g(nj2.E(dj6.m(400.0f, 1, ge7.O(a74Var, 12.0f)), 10.0f, b, false, 0L, 28), b);
                    long j5 = es7Var.d;
                    jy2 jy2Var = u24.m;
                    a74 I = ak7.I(vy7.L(g, j5, jy2Var), 1.0f, kt0.c(0.35f, j3), b);
                    e34 d = h70.d(d90.L, false);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, I);
                    jx0.i.getClass();
                    long j6 = j3;
                    iy0 iy0Var2 = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    pn pnVar5 = ix0.f;
                    yh2.K(xq2Var2, pnVar5, d);
                    pn pnVar6 = ix0.e;
                    yh2.K(xq2Var2, pnVar6, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar7 = ix0.g;
                    yh2.K(xq2Var2, pnVar7, valueOf);
                    ne neVar2 = ix0.h;
                    yh2.F(xq2Var2, neVar2);
                    pn pnVar8 = ix0.d;
                    yh2.K(xq2Var2, pnVar8, E);
                    x64 x64Var = x64.a;
                    a74 O = ge7.O(x64Var, 12.0f);
                    d40 d40Var = d90.i0;
                    du duVar2 = ju.a;
                    l26 a2 = k26.a(duVar2, d40Var, xq2Var2, 48);
                    int hashCode2 = Long.hashCode(xq2Var2.T);
                    xv4 l2 = xq2Var2.l();
                    a74 E2 = l.E(xq2Var2, O);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var2);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar5, a2);
                    yh2.K(xq2Var2, pnVar6, l2);
                    i61.w(hashCode2, xq2Var2, pnVar7, xq2Var2, neVar2);
                    yh2.K(xq2Var2, pnVar8, E2);
                    if (str == null || qs6.v0(str)) {
                        pnVar = pnVar5;
                        iy0Var = iy0Var2;
                        pnVar2 = pnVar6;
                        duVar = duVar2;
                        r13 = 0;
                        f = 12.0f;
                        xq2Var2.b0(-147409995);
                        a74 L = vy7.L(u24.g(dj6.i(x64Var, 48.0f), ke6Var4), kt0.c(0.18f, j6), jy2Var);
                        e34 d2 = h70.d(d90.Z, false);
                        int hashCode3 = Long.hashCode(xq2Var2.T);
                        xv4 l3 = xq2Var2.l();
                        a74 E3 = l.E(xq2Var2, L);
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, pnVar, d2);
                        yh2.K(xq2Var2, pnVar2, l3);
                        i61.w(hashCode3, xq2Var2, pnVar7, xq2Var2, neVar2);
                        yh2.K(xq2Var2, pnVar8, E3);
                        neVar = neVar2;
                        j4 = j6;
                        pnVar3 = pnVar8;
                        pnVar4 = pnVar7;
                        i13.a(e33Var, null, dj6.i(x64Var, 26.0f), j4, xq2Var2, ((i15 >> 15) & 7168) | ((i15 >> 9) & 14) | 432, 0);
                        z2 = true;
                        xq2Var2.p(true);
                        xq2Var2.p(false);
                    } else {
                        xq2Var2.b0(-147074699);
                        x23 x23Var = new x23((Context) xq2Var2.j(kf.b));
                        x23Var.c = str;
                        x23Var.b(false);
                        iy0Var = iy0Var2;
                        pnVar = pnVar5;
                        duVar = duVar2;
                        pnVar2 = pnVar6;
                        f = 12.0f;
                        r13 = 0;
                        gi2.b(x23Var.a(), null, u24.g(dj6.i(x64Var, 48.0f), ke6Var4), null, RecyclerView.B1, xq2Var2, 48, 4088);
                        xq2Var2.p(false);
                        j4 = j6;
                        pnVar4 = pnVar7;
                        neVar = neVar2;
                        pnVar3 = pnVar8;
                        z2 = true;
                    }
                    a74 S = ge7.S(x64Var, f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                    yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var2, r13);
                    long j7 = j4;
                    int hashCode4 = Long.hashCode(xq2Var2.T);
                    xv4 l4 = xq2Var2.l();
                    a74 E4 = l.E(xq2Var2, S);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a3);
                    yh2.K(xq2Var2, pnVar2, l4);
                    i61.w(hashCode4, xq2Var2, pnVar4, xq2Var2, neVar);
                    pn pnVar9 = pnVar3;
                    yh2.K(xq2Var2, pnVar9, E4);
                    l26 a4 = k26.a(duVar, d40Var, xq2Var2, 48);
                    int hashCode5 = Long.hashCode(xq2Var2.T);
                    xv4 l5 = xq2Var2.l();
                    a74 E5 = l.E(xq2Var2, x64Var);
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, pnVar, a4);
                    yh2.K(xq2Var2, pnVar2, l5);
                    i61.w(hashCode5, xq2Var2, pnVar4, xq2Var2, neVar);
                    yh2.K(xq2Var2, pnVar9, E5);
                    int i26 = i15 >> 15;
                    boolean z3 = z2;
                    i13.a(e33Var, null, dj6.i(x64Var, 12.0f), j7, xq2Var2, ((i15 >> 9) & 14) | 432 | (i26 & 7168), 0);
                    int i27 = i15 >> 12;
                    int i28 = i15 >> 18;
                    boolean z4 = r13;
                    x37.b(str2, ge7.S(x64Var, 5.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), j7, hi2.E(9), oj2.e0, qs7.c, hi2.D(0.8d), null, 0L, 0, false, 0, 0, null, null, xq2Var2, (i27 & 14) | 14355504 | (i28 & 896), 0, 130832);
                    xq2Var = xq2Var2;
                    xq2Var.p(z3);
                    x37.b(str3, ge7.S(x64Var, RecyclerView.B1, 2.0f, RecyclerView.B1, RecyclerView.B1, 13), es7Var.g, hi2.E(15), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var2, (i26 & 14) | 1772976, 3120, 120720);
                    if (!qs6.v0(str4)) {
                        xq2Var.b0(1457584335);
                        i17 = i16;
                        x37.b(str4, null, es7Var.h, hi2.D(11.5d), null, qs7.b, 0L, null, hi2.E(15), 2, false, i17, 0, null, null, xq2Var, (i28 & 14) | 1576320, (i27 & 7168) | 54, 119730);
                        xq2Var.p(z4);
                    } else {
                        i17 = i16;
                        xq2Var.b0(1457947190);
                        xq2Var.p(z4);
                    }
                    i61.y(xq2Var, z3, z3, z3);
                    ke6Var2 = ke6Var4;
                    j2 = j7;
                    i13 = i17;
                } else {
                    xq2Var = xq2Var2;
                    xq2Var.V();
                    ke6Var2 = ke6Var;
                    i13 = i;
                }
                t = xq2Var.t();
                if (t != null) {
                    t.d = new eo2() { // from class: ks7
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ls7.a(a74.this, str, ke6Var2, e33Var, str2, str3, str4, i13, j2, (px0) obj, ii2.a0(i2 | 1), i3);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
            j2 = j;
            if ((i24 & 38347923) != 38347922) {
            }
            if (xq2Var2.S(i24 & 1, z)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        j2 = j;
        if ((i24 & 38347923) != 38347922) {
        }
        if (xq2Var2.S(i24 & 1, z)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }
}
