package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.net.Uri;
import android.os.Build;
import android.text.format.DateUtils;
import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ak7  reason: default package */
/* loaded from: classes.dex */
public abstract class ak7 implements ov0 {
    public static zj7 a = null;
    public static boolean b = false;
    public static final zv0 c = new zv0(-1689893858, false, new kw0(21));
    public static final zv0 d = new zv0(851538357, false, new fn0(13));
    public static final zv0 e = new zv0(-1235955948, false, new iw0(11));
    public static final zv0 f = new zv0(53928376, false, new iw0(12));
    public static final Object g = new Object();
    public static final Type[] h = new Type[0];
    public static boolean i = true;
    public static e33 j;
    public static e33 k;

    public static final void A(boolean z, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1700814396);
        if (xq2Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (xq2Var.h(on2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i6 & 1, z2)) {
            String O = yh2.O(xq2Var, R.string.none);
            sr4 R = kj2.R(xq2Var, R.drawable.ic_block);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new c5(17);
                xq2Var.l0(P);
            }
            on2 on2Var2 = (on2) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new c5(17);
                xq2Var.l0(P2);
            }
            h(null, O, R, z, false, null, null, on2Var, on2Var2, (on2) P2, xq2Var, ((i6 << 9) & 7168) | 907764230 | ((i6 << 18) & 29360128));
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new u4(z, on2Var, i2, 1);
        }
    }

    public static final void B(a74 a74Var, lq4 lq4Var, List list, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, eo2 eo2Var2, qn2 qn2Var3, px0 px0Var, int i2) {
        int i3;
        List list2;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-185279727);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(lq4Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            list2 = list;
            if (xq2Var.h(list2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            list2 = list;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(qn2Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var.h(qn2Var2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (xq2Var.h(eo2Var)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i2) == 0) {
            if (xq2Var.h(eo2Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((12582912 & i2) == 0) {
            if (xq2Var.h(qn2Var3)) {
                i4 = 8388608;
            } else {
                i4 = Compress.MAXWINSIZE;
            }
            i3 |= i4;
        }
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            e34 d2 = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
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
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            vs0 vs0Var = vs0.Y;
            if (list2.isEmpty()) {
                xq2Var.b0(1634656859);
                x37.b(yh2.O(xq2Var, R.string.no_dsiware_titles_installed), ge7.O(vs0Var.n(q60.s(ge7.N(x64.a, lq4Var), lq4Var), d90.Z), 24.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 131068);
                xq2Var = xq2Var;
                xq2Var.p(false);
            } else {
                xq2Var.b0(1634990264);
                r(dj6.c, lq4Var, list, qn2Var, qn2Var2, eo2Var, eo2Var2, qn2Var3, xq2Var, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
                xq2Var.p(false);
            }
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new s91(a74Var, lq4Var, list, qn2Var, qn2Var2, eo2Var, eo2Var2, qn2Var3, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void C(final String str, final boolean z, final on2 on2Var, a74 a74Var, long j2, long j3, float f2, float f3, float f4, px0 px0Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        long j4;
        int i7;
        int i8;
        final long j5;
        int i9;
        int i10;
        float f5;
        int i11;
        int i12;
        float f6;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z2;
        final float f7;
        final long j6;
        final float f8;
        final x64 x64Var;
        cf5 t;
        long j7;
        x64 x64Var2;
        long j8;
        float f9;
        long j9;
        long j10;
        r94 r94Var;
        float f10;
        long j11;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-900185131);
        if (xq2Var.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i17 = i2 | i4;
        if (xq2Var.g(z)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i18 = i17 | i5;
        if (xq2Var.h(on2Var)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i19 = i18 | i6 | 3072;
        if ((i3 & 16) == 0) {
            j4 = j2;
            if (xq2Var.e(j4)) {
                i7 = 16384;
                int i20 = i19 | i7;
                i8 = i3 & 32;
                if (i8 == 0) {
                    i20 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    j5 = j3;
                    if (xq2Var.e(j5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i20 |= i9;
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i20 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        f5 = f2;
                        if (xq2Var.c(f5)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i20 |= i11;
                        i12 = i3 & 128;
                        if (i12 == 0) {
                            i20 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            f6 = f3;
                            if (xq2Var.c(f6)) {
                                i13 = 8388608;
                            } else {
                                i13 = Compress.MAXWINSIZE;
                            }
                            i20 |= i13;
                            i14 = i3 & 256;
                            if (i14 != 0) {
                                i15 = i20 | 100663296;
                            } else {
                                int i21 = i20;
                                if ((i2 & 100663296) == 0) {
                                    if (xq2Var.c(f4)) {
                                        i16 = 67108864;
                                    } else {
                                        i16 = 33554432;
                                    }
                                    i15 = i21 | i16;
                                } else {
                                    i15 = i21;
                                }
                            }
                            if ((i15 & 38347923) != 38347922) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (xq2Var.S(i15 & 1, z2)) {
                                xq2Var.X();
                                int i22 = i2 & 1;
                                x64 x64Var3 = x64.a;
                                if (i22 != 0 && !xq2Var.B()) {
                                    xq2Var.V();
                                    if ((i3 & 16) != 0) {
                                        i15 &= -57345;
                                    }
                                    x64Var2 = a74Var;
                                    f9 = f4;
                                    j8 = j5;
                                } else {
                                    if ((i3 & 16) != 0) {
                                        j4 = bl2.F(xq2Var).j;
                                        i15 &= -57345;
                                    }
                                    if (i8 != 0) {
                                        j7 = hi2.D(10.5d);
                                    } else {
                                        j7 = j5;
                                    }
                                    if (i10 != 0) {
                                        f5 = 20.0f;
                                    }
                                    if (i12 != 0) {
                                        f6 = 13.0f;
                                    }
                                    if (i14 != 0) {
                                        j8 = j7;
                                        f9 = 7.0f;
                                        x64Var2 = x64Var3;
                                    } else {
                                        x64Var2 = x64Var3;
                                        j8 = j7;
                                        f9 = f4;
                                    }
                                }
                                xq2Var.q();
                                es7 F = bl2.F(xq2Var);
                                y16 b2 = z16.b(f5);
                                Object P = xq2Var.P();
                                if (P == ox0.a) {
                                    P = i61.f(xq2Var);
                                }
                                r94 r94Var2 = (r94) P;
                                qa4 a2 = bw7.a(r94Var2, xq2Var, 6);
                                a74 g2 = u24.g(x64Var2, b2);
                                if (z) {
                                    j9 = j4;
                                    j10 = j9;
                                } else if (F.a) {
                                    j9 = j4;
                                    j10 = F.d;
                                } else {
                                    j9 = j4;
                                    j10 = F.e;
                                }
                                a74 L = vy7.L(g2, j10, u24.m);
                                if (((Boolean) a2.getValue()).booleanValue()) {
                                    r94Var = r94Var2;
                                    f10 = f5;
                                    L = I(L, 1.0f, F.j, b2);
                                } else {
                                    r94Var = r94Var2;
                                    f10 = f5;
                                }
                                a74 t2 = mb3.t(L, r94Var, null, false, null, on2Var, 28);
                                e34 d2 = h70.d(d90.L, false);
                                int hashCode = Long.hashCode(xq2Var.T);
                                xv4 l = xq2Var.l();
                                a74 E = l.E(xq2Var, t2);
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
                                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                                yh2.F(xq2Var, ix0.h);
                                yh2.K(xq2Var, ix0.d, E);
                                if (z) {
                                    j11 = kt0.d;
                                } else {
                                    j11 = F.h;
                                }
                                long j12 = j11;
                                x37.b(str, ge7.P(x64Var3, f6, f9), j12, j8, oj2.e0, qs7.a, hi2.D(0.5d), null, j8, 0, false, 0, 0, null, null, xq2Var, (i15 & 14) | 14352384 | ((i15 >> 6) & 7168), (i15 >> 15) & 14, 129808);
                                xq2Var.p(true);
                                f8 = f10;
                                x64Var = x64Var2;
                                f7 = f9;
                                j5 = j8;
                                j6 = j9;
                            } else {
                                xq2Var.V();
                                f7 = f4;
                                j6 = j4;
                                f8 = f5;
                                x64Var = a74Var;
                            }
                            final float f11 = f6;
                            t = xq2Var.t();
                            if (t != null) {
                                t.d = new eo2() { // from class: xq5
                                    @Override // defpackage.eo2
                                    public final Object o(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int a0 = ii2.a0(i2 | 1);
                                        ak7.C(str, z, on2Var, x64Var, j6, j5, f8, f11, f7, (px0) obj, a0, i3);
                                        return jg7.a;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        f6 = f3;
                        i14 = i3 & 256;
                        if (i14 != 0) {
                        }
                        if ((i15 & 38347923) != 38347922) {
                        }
                        if (xq2Var.S(i15 & 1, z2)) {
                        }
                        final float f112 = f6;
                        t = xq2Var.t();
                        if (t != null) {
                        }
                    }
                    f5 = f2;
                    i12 = i3 & 128;
                    if (i12 == 0) {
                    }
                    f6 = f3;
                    i14 = i3 & 256;
                    if (i14 != 0) {
                    }
                    if ((i15 & 38347923) != 38347922) {
                    }
                    if (xq2Var.S(i15 & 1, z2)) {
                    }
                    final float f1122 = f6;
                    t = xq2Var.t();
                    if (t != null) {
                    }
                }
                j5 = j3;
                i10 = i3 & 64;
                if (i10 != 0) {
                }
                f5 = f2;
                i12 = i3 & 128;
                if (i12 == 0) {
                }
                f6 = f3;
                i14 = i3 & 256;
                if (i14 != 0) {
                }
                if ((i15 & 38347923) != 38347922) {
                }
                if (xq2Var.S(i15 & 1, z2)) {
                }
                final float f11222 = f6;
                t = xq2Var.t();
                if (t != null) {
                }
            }
        } else {
            j4 = j2;
        }
        i7 = 8192;
        int i202 = i19 | i7;
        i8 = i3 & 32;
        if (i8 == 0) {
        }
        j5 = j3;
        i10 = i3 & 64;
        if (i10 != 0) {
        }
        f5 = f2;
        i12 = i3 & 128;
        if (i12 == 0) {
        }
        f6 = f3;
        i14 = i3 & 256;
        if (i14 != 0) {
        }
        if ((i15 & 38347923) != 38347922) {
        }
        if (xq2Var.S(i15 & 1, z2)) {
        }
        final float f112222 = f6;
        t = xq2Var.t();
        if (t != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v36, types: [int] */
    /* JADX WARN: Type inference failed for: r5v45 */
    public static final void D(boolean z, String str, n06 n06Var, qn2 qn2Var, on2 on2Var, on2 on2Var2, on2 on2Var3, on2 on2Var4, on2 on2Var5, on2 on2Var6, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        qn2 qn2Var2;
        x64 x64Var;
        jy2 jy2Var;
        float f2;
        iy0 iy0Var;
        boolean z3;
        boolean z4;
        qa4 qa4Var;
        int i13;
        qa4 qa4Var2;
        x64 x64Var2;
        es7 es7Var;
        ?? r5;
        boolean z5;
        float f3;
        boolean z6;
        boolean z7;
        boolean z8;
        str.getClass();
        n06Var.getClass();
        qn2Var.getClass();
        on2Var.getClass();
        on2Var2.getClass();
        on2Var3.getClass();
        on2Var4.getClass();
        on2Var5.getClass();
        on2Var6.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1992567122);
        if (xq2Var.g(z)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i14 = i2 | i3;
        if (xq2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i15 = i14 | i4;
        if (xq2Var.d(n06Var.ordinal())) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i16 = i15 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i17 = i16 | i6;
        if (xq2Var.h(on2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i18 = i17 | i7;
        if (xq2Var.h(on2Var2)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i19 = i18 | i8;
        if (xq2Var.h(on2Var3)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i20 = i19 | i9;
        if (xq2Var.h(on2Var4)) {
            i10 = 8388608;
        } else {
            i10 = Compress.MAXWINSIZE;
        }
        int i21 = i20 | i10;
        if (xq2Var.h(on2Var5)) {
            i11 = 67108864;
        } else {
            i11 = 33554432;
        }
        int i22 = i21 | i11;
        if (xq2Var.h(on2Var6)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i23 = i22 | i12;
        if ((306783379 & i23) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (xq2Var.S(i23 & 1, z2)) {
            es7 F = bl2.F(xq2Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.valueOf(z));
                xq2Var.l0(P);
            }
            qa4 qa4Var3 = (qa4) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = np2.Y(Boolean.FALSE);
                xq2Var.l0(P2);
            }
            qa4 qa4Var4 = (qa4) P2;
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = new nh2();
                xq2Var.l0(P3);
            }
            nh2 nh2Var = (nh2) P3;
            x64 x64Var3 = x64.a;
            a74 c2 = dj6.c(x64Var3, 1.0f);
            long j2 = F.b;
            jy2 jy2Var2 = u24.m;
            a74 L = vy7.L(c2, j2, jy2Var2);
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, L);
            jx0.i.getClass();
            iy0 iy0Var2 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 S = ge7.S(dj6.e(dj6.c(x64Var3, 1.0f), 56.0f), 18.0f, RecyclerView.B1, 6.0f, RecyclerView.B1, 10);
            d40 d40Var = d90.i0;
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, S);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            if (((Boolean) qa4Var3.getValue()).booleanValue()) {
                xq2Var.b0(163464897);
                int i24 = i23 & 7168;
                if (i24 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object P4 = xq2Var.P();
                if (z5 || P4 == vs0Var) {
                    P4 = new tq5(qn2Var, qa4Var3, 0);
                    xq2Var.l0(P4);
                }
                ej2.b((on2) P4, dj6.i(x64Var3, 42.0f), false, n16.I(1874886591, new d4(F, 7), xq2Var), xq2Var, 24624, 12);
                xh3 xh3Var = new xh3(0, 0, 3, 119);
                s47 s47Var = new s47(F.g, hi2.E(16), null, 0L, 0L, 0, 0L, 16777212);
                cn6 cn6Var = new cn6(F.j);
                if (1.0f <= 0.0d) {
                    n53.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f3 = Float.MAX_VALUE;
                } else {
                    f3 = 1.0f;
                }
                a74 S2 = S(ge7.Q(new vn3(f3, true), 8.0f, RecyclerView.B1, 2), nh2Var);
                if (i24 == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object P5 = xq2Var.P();
                if (z6 || P5 == vs0Var) {
                    P5 = new y00(5, qn2Var);
                    xq2Var.l0(P5);
                }
                jy2Var = jy2Var2;
                k30.b(str, (qn2) P5, S2, false, s47Var, xh3Var, null, true, 0, 0, null, null, null, cn6Var, n16.I(-1350942304, new l4(11, str, F), xq2Var), xq2Var, ((i23 >> 3) & 14) | 102236160, 196608, 16024);
                xq2Var = xq2Var;
                Object P6 = xq2Var.P();
                if (P6 == vs0Var) {
                    z7 = false;
                    P6 = new jr5(nh2Var, null, 0);
                    xq2Var.l0(P6);
                } else {
                    z7 = false;
                }
                mb3.i(xq2Var, (eo2) P6, jg7.a);
                if (i24 == 2048) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                Object P7 = xq2Var.P();
                if (!z8 && P7 != vs0Var) {
                    qn2Var2 = qn2Var;
                } else {
                    qn2Var2 = qn2Var;
                    P7 = new j91(11, qn2Var2);
                    xq2Var.l0(P7);
                }
                ej2.b((on2) P7, dj6.i(x64Var3, 42.0f), false, n16.I(1003810422, new d4(F, 8), xq2Var), xq2Var, 24624, 12);
                xq2Var.p(z7);
                x64Var2 = x64Var3;
                es7Var = F;
                r5 = z7;
                z3 = true;
            } else {
                jy2Var = jy2Var2;
                xq2Var.b0(165559815);
                js7.a(24.0f, 48, xq2Var, null);
                gi2.h(xq2Var, dj6.l(x64Var3, 9.0f));
                if (1.0f <= 0.0d) {
                    n53.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                } else {
                    f2 = 1.0f;
                }
                vn3 vn3Var = new vn3(f2, true);
                l26 a4 = k26.a(duVar, d90.h0, xq2Var, 0);
                int hashCode3 = Long.hashCode(xq2Var.T);
                xv4 l3 = xq2Var.l();
                a74 E3 = l.E(xq2Var, vn3Var);
                xq2Var.f0();
                if (xq2Var.S) {
                    iy0Var = iy0Var2;
                    xq2Var.k(iy0Var);
                } else {
                    iy0Var = iy0Var2;
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, a4);
                yh2.K(xq2Var, pnVar2, l3);
                i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
                yh2.K(xq2Var, pnVar4, E3);
                iy0 iy0Var3 = iy0Var;
                long j3 = F.g;
                pi2 pi2Var = qs7.a;
                long E4 = hi2.E(21);
                oj2 oj2Var = oj2.e0;
                x37.b("STORM ", null, j3, E4, oj2Var, pi2Var, hi2.D(-0.3d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772550, 0, 130834);
                x37.b("DS", null, hv.c(4278248959L), hi2.E(21), oj2Var, pi2Var, hi2.D(-0.3d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772934, 0, 130834);
                z3 = true;
                xq2Var.p(true);
                if ((i23 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object P8 = xq2Var.P();
                if (!z4 && P8 != vs0Var) {
                    qn2Var2 = qn2Var;
                } else {
                    qn2Var2 = qn2Var;
                    P8 = new tq5(qn2Var2, qa4Var3, 1);
                    xq2Var.l0(P8);
                }
                ej2.b((on2) P8, dj6.i(x64Var3, 42.0f), false, n16.I(1931642056, new d4(F, 9), xq2Var), xq2Var, 24624, 12);
                ej2.b(on2Var, dj6.i(x64Var3, 42.0f), false, n16.I(-2078198465, new sa5(1, n06Var, F), xq2Var), xq2Var, ((i23 >> 12) & 14) | 24624, 12);
                e34 d2 = h70.d(d90.L, false);
                int hashCode4 = Long.hashCode(xq2Var.T);
                xv4 l4 = xq2Var.l();
                a74 E5 = l.E(xq2Var, x64Var3);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var3);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar, d2);
                yh2.K(xq2Var, pnVar2, l4);
                i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
                yh2.K(xq2Var, pnVar4, E5);
                Object P9 = xq2Var.P();
                if (P9 == vs0Var) {
                    qa4Var = qa4Var4;
                    i13 = 5;
                    P9 = new oe4(qa4Var, 5);
                    xq2Var.l0(P9);
                } else {
                    qa4Var = qa4Var4;
                    i13 = 5;
                }
                qa4 qa4Var5 = qa4Var;
                ej2.b((on2) P9, dj6.i(x64Var3, 42.0f), false, n16.I(144968782, new d4(F, i13), xq2Var), xq2Var, 24630, 12);
                boolean booleanValue = ((Boolean) qa4Var5.getValue()).booleanValue();
                Object P10 = xq2Var.P();
                if (P10 == vs0Var) {
                    qa4Var2 = qa4Var5;
                    P10 = new oe4(qa4Var2, 4);
                    xq2Var.l0(P10);
                } else {
                    qa4Var2 = qa4Var5;
                }
                x64Var2 = x64Var3;
                es7Var = F;
                ti.a(booleanValue, (on2) P10, null, 0L, null, null, n16.I(811231013, new u91(on2Var2, on2Var3, on2Var4, on2Var5, qa4Var2, 3), xq2Var), xq2Var, 1572912);
                xq2Var = xq2Var;
                xq2Var.p(true);
                ej2.b(on2Var6, dj6.i(x64Var2, 42.0f), false, n16.I(-614560448, new d4(es7Var, 6), xq2Var), xq2Var, ((i23 >> 27) & 14) | 24624, 12);
                r5 = 0;
                xq2Var.p(false);
            }
            xq2Var.p(z3);
            h70.a(vy7.L(dj6.e(dj6.c(x64Var2, 1.0f), 1.0f), es7Var.f, jy2Var), xq2Var, r5);
            xq2Var.p(z3);
            x64Var = x64Var2;
        } else {
            qn2Var2 = qn2Var;
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new wq4(z, str, n06Var, qn2Var2, on2Var, on2Var2, on2Var3, on2Var4, on2Var5, on2Var6, x64Var, i2);
        }
    }

    public static final void E(qa4 qa4Var, boolean z) {
        qa4Var.setValue(Boolean.valueOf(z));
    }

    public static final void F(int i2, boolean z, on2 on2Var, List list, Map map, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, eo2 eo2Var, float f2) {
        if (((Number) qa4Var.getValue()).intValue() > 0 && i2 != 0) {
            int q = gi2.q((int) (f2 / (((Number) qa4Var.getValue()).intValue() / i2)), 0, i2 - 1);
            if (z && q == 0) {
                if (!((Boolean) qa4Var2.getValue()).booleanValue()) {
                    qa4Var2.setValue(Boolean.TRUE);
                    qa4Var3.setValue(null);
                    on2Var.c();
                    return;
                }
                return;
            }
            if (((Boolean) qa4Var2.getValue()).booleanValue()) {
                qa4Var2.setValue(Boolean.FALSE);
            }
            Character ch = (Character) gt0.K0(q - (z ? 1 : 0), list);
            if (ch != null) {
                char charValue = ch.charValue();
                Character ch2 = (Character) qa4Var3.getValue();
                if (ch2 == null || charValue != ch2.charValue()) {
                    qa4Var3.setValue(ch);
                    Integer num = (Integer) map.get(ch);
                    if (num != null) {
                        eo2Var.o(Integer.valueOf(num.intValue()), ch);
                    }
                }
            }
        }
    }

    public static final long F0(float f2, long j2) {
        return (Float.floatToRawIntBits(Math.max((float) RecyclerView.B1, Float.intBitsToFloat((int) (j2 >> 32)) - f2)) << 32) | (Float.floatToRawIntBits(Math.max((float) RecyclerView.B1, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2)) & 4294967295L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
        if (r5 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int G(int i2, int i3, int i4, boolean z) {
        if (i3 >= i4) {
            if (z) {
                return 0;
            }
            return i4 - i3;
        }
        if (!z) {
            if (z ? i4 - i3 > i2 : i3 <= i2) {
                if (z) {
                    return i2 - i3;
                }
            } else if (!z) {
                return 0;
            } else {
                return i4 - i3;
            }
        } else if (z) {
            if (!z) {
            }
        } else if (!z) {
        }
        return i2;
    }

    public static a74 H(a74 a74Var, float f2) {
        return a74Var.d(new iv(f2));
    }

    public static void H0(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th);
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public static final a74 I(a74 a74Var, float f2, long j2, ke6 ke6Var) {
        return a74Var.d(new b60(f2, new cn6(j2), ke6Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ae5, gx0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList I0(lk6 lk6Var, int i2, Integer num) {
        Object obj;
        ?? ae5Var = new ae5(lk6Var);
        int q = lk6Var.q(i2);
        sq2 a2 = lk6Var.a(i2);
        while (i2 >= 0) {
            if (lk6Var.k(i2)) {
                obj = lk6Var.p(lk6Var.b, i2);
            } else {
                obj = ox0.a;
            }
            ae5Var.i(lk6Var.i(i2), obj, lk6Var.a.g(i2), num);
            if (q >= 0) {
                sq2 sq2Var = a2;
                a2 = lk6Var.a(q);
                i2 = q;
                q = lk6Var.q(q);
                num = sq2Var;
            } else {
                i2 = q;
                num = a2;
            }
        }
        return (ArrayList) ae5Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0092 -> B:27:0x0061). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List J(pk6 pk6Var, Integer num, int i2, Integer num2) {
        int i3;
        int i4;
        int s;
        sq2 sq2Var;
        sq2 sq2Var2;
        Object obj;
        int i5;
        ca4 ca4Var;
        if (!pk6Var.w && pk6Var.p() != 0) {
            ae5 ae5Var = new ae5(pk6Var);
            if (num2 != null) {
                i3 = num2.intValue();
            } else {
                i3 = pk6Var.v;
                if (i3 < 0) {
                    i3 = pk6Var.E(pk6Var.b, i2);
                }
            }
            if (num == 0) {
                int N = pk6Var.i - pk6Var.N(pk6Var.b, pk6Var.r(i2));
                p94 p94Var = pk6Var.s;
                if (p94Var != null && (ca4Var = (ca4) p94Var.b(i2)) != null) {
                    i5 = ca4Var.b;
                } else {
                    i5 = 0;
                }
                num = Integer.valueOf(N + i5);
            }
            int r = pk6Var.r(i2) * 5;
            int[] iArr = pk6Var.b;
            if (r < iArr.length) {
                s = pk6Var.s(i2);
                sq2Var2 = num;
                while (i2 >= 0) {
                    if ((pk6Var.b[(pk6Var.r(i2) * 5) + 1] & 536870912) != 0) {
                        obj = pk6Var.t(i2);
                    } else {
                        obj = ox0.a;
                    }
                    ae5Var.i(s, obj, pk6Var.O(i2), sq2Var2);
                    sq2Var2 = pk6Var.b(i2);
                    if (i3 >= 0) {
                        i4 = pk6Var.E(pk6Var.b, i3);
                        s = pk6Var.s(i3);
                        sq2Var = sq2Var2;
                        int i6 = i3;
                        i3 = i4;
                        i2 = i6;
                        sq2Var2 = sq2Var;
                        while (i2 >= 0) {
                        }
                    } else {
                        i2 = i3;
                    }
                }
                return (ArrayList) ae5Var.a;
            }
            if (i3 >= 0) {
                i4 = pk6Var.E(iArr, i3);
            } else {
                i4 = i3;
            }
            s = pk6Var.s(i3);
            sq2Var = num;
            int i62 = i3;
            i3 = i4;
            i2 = i62;
            sq2Var2 = sq2Var;
            while (i2 >= 0) {
            }
            return (ArrayList) ae5Var.a;
        }
        return yt1.A;
    }

    public static String J0(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static void K(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            u34.t();
        }
    }

    public static final void K0() {
        throw new UnsupportedOperationException();
    }

    public static final double N(int i2, int i3, int i4, int i5, y56 y56Var) {
        double d2 = i4 / i2;
        double d3 = i5 / i3;
        int i6 = rc1.a[y56Var.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                return Math.min(d2, d3);
            }
            i.d();
            return 0.0d;
        }
        return Math.max(d2, d3);
    }

    public static uo O(uo uoVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) uoVar.B.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((wo) uoVar.L).a;
        }
        return new uo(uoVar.A, Float.valueOf(f2), new wo(f3), uoVar.R, uoVar.X, uoVar.Y);
    }

    public static boolean Q(Type type, Type type2) {
        boolean z;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z = false;
            } else {
                z = true;
            }
            boolean equals = parameterizedType.getRawType().equals(parameterizedType2.getRawType());
            boolean equals2 = Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            if (z && equals && equals2) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return Q(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static final Integer R(lk6 lk6Var, zx0 zx0Var, int i2, int i3) {
        Integer R;
        br2 br2Var;
        Object obj;
        int[] iArr = lk6Var.b;
        while (true) {
            uq2 uq2Var = null;
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (lk6Var.j(i2) && lk6Var.i(i2) == 206 && nb3.k(lk6Var.p(iArr, i2), tx0.e)) {
                Object h2 = lk6Var.h(i2, 0);
                if (h2 instanceof br2) {
                    br2Var = (br2) h2;
                } else {
                    br2Var = null;
                }
                if (br2Var != null) {
                    obj = br2Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof uq2) {
                    uq2Var = (uq2) obj;
                }
                if (uq2Var != null && uq2Var.A == zx0Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (lk6Var.d(i2) && (R = R(lk6Var, zx0Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(R.intValue());
            }
            i2 = i4;
        }
    }

    public static final a74 S(a74 a74Var, nh2 nh2Var) {
        return a74Var.d(new oh2(nh2Var));
    }

    public static d51 T(lg0 lg0Var) {
        lg0Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        d51 d51Var = null;
        if (i2 >= 33) {
            CameraCharacteristics.Key f2 = a81.f();
            f2.getClass();
            DynamicRangeProfiles g2 = a81.g(((qc0) lg0Var).c(f2));
            if (g2 != null) {
                if (i2 >= 33) {
                    d51Var = new d51(new cr1(g2), 14);
                } else {
                    u34.f(lb1.k("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", i2, " (requires API 33)"));
                    return null;
                }
            }
        }
        if (d51Var == null) {
            return dr1.a;
        }
        return d51Var;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, ak7, e81] */
    /* JADX WARN: Type inference failed for: r9v4, types: [zu3, java.lang.Object, ak7] */
    public static ak7 U(int i2, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i2 = 2;
        }
        if (i2 != 0) {
            if (i2 != 2) {
                ?? obj = new Object();
                int length = dArr2[0].length;
                obj.n = new double[length];
                obj.l = dArr;
                obj.m = dArr2;
                if (length > 2) {
                    double d2 = 0.0d;
                    int i3 = 0;
                    while (true) {
                        double d3 = d2;
                        if (i3 >= dArr.length) {
                            break;
                        }
                        double d4 = dArr2[i3][0];
                        if (i3 > 0) {
                            Math.hypot(d4 - d2, d4 - d3);
                        }
                        i3++;
                        d2 = d4;
                    }
                }
                return obj;
            }
            double d5 = dArr[0];
            double[] dArr3 = dArr2[0];
            ?? obj2 = new Object();
            obj2.l = d5;
            obj2.m = dArr3;
            return obj2;
        }
        return new g74(dArr, dArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r1v0, types: [hl5, java.lang.Object] */
    public static tb0 W(rb0 rb0Var) {
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = rb0Var.getClass();
        try {
            Object s = rb0Var.s(obj);
            if (s != null) {
                obj.a = s;
                return tb0Var;
            }
            return tb0Var;
        } catch (Exception e2) {
            tb0Var.b(e2);
            return tb0Var;
        }
    }

    public static Type X(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return X(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return X(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type Y(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder t = xg6.t("Index ", i2, " not in range [0,");
        t.append(actualTypeArguments.length);
        t.append(") for ");
        t.append(parameterizedType);
        throw new IllegalArgumentException(t.toString());
    }

    public static Class c0(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            u34.t();
            return null;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(c0(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return c0(((WildcardType) type).getUpperBounds()[0]);
            }
            StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(type);
            fa6.g(sb, "> is of type ", type.getClass().getName());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x051a  */
    /* JADX WARN: Type inference failed for: r0v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final Map map, final Character ch, final boolean z, final boolean z2, final on2 on2Var, final eo2 eo2Var, final a74 a74Var, px0 px0Var, final int i2) {
        final eo2 eo2Var2;
        xq2 xq2Var;
        qa4 qa4Var;
        vs0 vs0Var;
        int i3;
        int i4;
        x64 x64Var;
        pn pnVar;
        es7 es7Var;
        pn pnVar2;
        vs0 vs0Var2;
        a74 a74Var2;
        ne neVar;
        pn pnVar3;
        qa4 qa4Var2;
        List<Character> list;
        qa4 qa4Var3;
        qa4 qa4Var4;
        on2 on2Var2;
        float f2;
        e40 e40Var;
        es7 es7Var2;
        vs0 vs0Var3;
        boolean z3;
        String str;
        int i5;
        boolean z4;
        char c2;
        float f3;
        float f4;
        final char c3;
        Object P;
        Object H;
        boolean z5;
        boolean z6;
        String str2;
        long j2;
        oj2 oj2Var;
        long j3;
        e40 e40Var2 = d90.Z;
        map.getClass();
        on2Var.getClass();
        eo2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1025716400);
        int i6 = i2 | (xq2Var2.h(map) ? 4 : 2) | (xq2Var2.f(ch) ? 32 : 16) | (xq2Var2.g(z) ? 256 : 128) | (xq2Var2.g(z2) ? 2048 : 1024) | (xq2Var2.h(on2Var) ? 16384 : 8192) | (xq2Var2.h(eo2Var) ? 131072 : 65536) | (xq2Var2.f(a74Var) ? 1048576 : 524288);
        if (xq2Var2.S(i6 & 1, (599187 & i6) != 599186)) {
            if (map.isEmpty() && !z) {
                cf5 t = xq2Var2.t();
                if (t != null) {
                    t.d = new eo2(map, ch, z, z2, on2Var, eo2Var, a74Var, i2, 1) { // from class: sq5
                        public final /* synthetic */ int A;
                        public final /* synthetic */ Map B;
                        public final /* synthetic */ Character L;
                        public final /* synthetic */ boolean R;
                        public final /* synthetic */ boolean X;
                        public final /* synthetic */ on2 Y;
                        public final /* synthetic */ eo2 Z;
                        public final /* synthetic */ a74 d0;

                        {
                            this.A = r9;
                        }

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            int i7 = this.A;
                            jg7 jg7Var = jg7.a;
                            switch (i7) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int a0 = ii2.a0(1);
                                    ak7.e(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, (px0) obj, a0);
                                    return jg7Var;
                                default:
                                    ((Integer) obj2).getClass();
                                    int a02 = ii2.a0(1);
                                    ak7.e(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, (px0) obj, a02);
                                    return jg7Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            es7 F = bl2.F(xq2Var2);
            boolean f5 = xq2Var2.f(map);
            Object P2 = xq2Var2.P();
            vs0 vs0Var4 = ox0.a;
            if (f5 || P2 == vs0Var4) {
                P2 = gt0.k1(map.keySet());
                xq2Var2.l0(P2);
            }
            List list2 = (List) P2;
            int size = list2.size() + (z ? 1 : 0);
            Object P3 = xq2Var2.P();
            if (P3 == vs0Var4) {
                P3 = np2.Y(null);
                xq2Var2.l0(P3);
            }
            qa4 qa4Var5 = (qa4) P3;
            Object P4 = xq2Var2.P();
            if (P4 == vs0Var4) {
                P4 = np2.Y(Boolean.FALSE);
                xq2Var2.l0(P4);
            }
            qa4 qa4Var6 = (qa4) P4;
            Object P5 = xq2Var2.P();
            if (P5 == vs0Var4) {
                P5 = np2.Y(Boolean.FALSE);
                xq2Var2.l0(P5);
            }
            qa4 qa4Var7 = (qa4) P5;
            Object P6 = xq2Var2.P();
            if (P6 == vs0Var4) {
                P6 = np2.Y(0);
                xq2Var2.l0(P6);
            }
            qa4 qa4Var8 = (qa4) P6;
            e40 e40Var3 = d90.L;
            e34 d2 = h70.d(e40Var3, false);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l = xq2Var2.l();
            a74 E = l.E(xq2Var2, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar4 = ix0.f;
            yh2.K(xq2Var2, pnVar4, d2);
            pn pnVar5 = ix0.e;
            yh2.K(xq2Var2, pnVar5, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar6 = ix0.g;
            yh2.K(xq2Var2, pnVar6, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var2, neVar2);
            pn pnVar7 = ix0.d;
            yh2.K(xq2Var2, pnVar7, E);
            vs0 vs0Var5 = vs0.Y;
            e40 e40Var4 = d90.d0;
            x64 x64Var2 = x64.a;
            a74 b2 = dj6.b(dj6.l(vs0Var5.n(x64Var2, e40Var4), 24.0f), 1.0f);
            Object P7 = xq2Var2.P();
            if (P7 == vs0Var4) {
                qa4Var = qa4Var7;
                P7 = new gn5(12);
                xq2Var2.l0(P7);
            } else {
                qa4Var = qa4Var7;
            }
            a74 y = ge7.y(b2, (qn2) P7);
            Object P8 = xq2Var2.P();
            if (P8 == vs0Var4) {
                P8 = new j4(qa4Var8, 18);
                xq2Var2.l0(P8);
            }
            a74 E2 = lb4.E(y, (qn2) P8);
            Boolean valueOf2 = Boolean.valueOf(z);
            int i7 = i6 & 57344;
            int i8 = i6 & 458752;
            boolean d3 = ((i6 & 896) == 256) | xq2Var2.d(size) | (i7 == 16384) | xq2Var2.h(list2) | xq2Var2.h(map) | (i8 == 131072);
            Object P9 = xq2Var2.P();
            if (d3 || P9 == vs0Var4) {
                vs0Var = vs0Var4;
                i3 = i7;
                i4 = i8;
                x64Var = x64Var2;
                pnVar = pnVar6;
                es7Var = F;
                pnVar2 = pnVar4;
                vs0Var2 = vs0Var5;
                eo2Var2 = eo2Var;
                a74Var2 = E2;
                neVar = neVar2;
                qa4 qa4Var9 = qa4Var;
                pnVar3 = pnVar5;
                P9 = new er5(qa4Var9, size, z, on2Var, list2, map, qa4Var8, qa4Var6, qa4Var5, eo2Var2);
                qa4Var2 = qa4Var9;
                list = list2;
                qa4Var3 = qa4Var6;
                qa4Var4 = qa4Var5;
                on2Var2 = on2Var;
                xq2Var2.l0(P9);
            } else {
                eo2Var2 = eo2Var;
                list = list2;
                vs0Var = vs0Var4;
                i3 = i7;
                i4 = i8;
                qa4Var3 = qa4Var6;
                x64Var = x64Var2;
                pnVar = pnVar6;
                es7Var = F;
                qa4Var4 = qa4Var5;
                pnVar2 = pnVar4;
                vs0Var2 = vs0Var5;
                qa4Var2 = qa4Var;
                a74Var2 = E2;
                neVar = neVar2;
                pnVar3 = pnVar5;
                on2Var2 = on2Var;
            }
            oy4 oy4Var = jw6.a;
            a74 d4 = a74Var2.d(new iw6(list, valueOf2, null, P9, 4));
            e34 d5 = h70.d(e40Var3, false);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E3 = l.E(xq2Var2, d4);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar2, d5);
            yh2.K(xq2Var2, pnVar3, l2);
            ne neVar3 = neVar;
            pn pnVar8 = pnVar;
            i61.w(hashCode2, xq2Var2, pnVar8, xq2Var2, neVar3);
            yh2.K(xq2Var2, pnVar7, E3);
            x64 x64Var3 = x64Var;
            a74 b3 = dj6.b(x64Var3, 1.0f);
            yt0 a2 = wt0.a(ju.c, d90.l0, xq2Var2, 48);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E4 = l.E(xq2Var2, b3);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar2, a2);
            yh2.K(xq2Var2, pnVar3, l3);
            i61.w(hashCode3, xq2Var2, pnVar8, xq2Var2, neVar3);
            yh2.K(xq2Var2, pnVar7, E4);
            if (z) {
                xq2Var2.b0(-884038258);
                boolean z7 = ((Boolean) qa4Var3.getValue()).booleanValue() || (((Character) qa4Var4.getValue()) == null && !((Boolean) qa4Var2.getValue()).booleanValue() && z2);
                a74 c4 = dj6.c(zt0.a(x64Var3), 1.0f);
                Object P10 = xq2Var2.P();
                vs0 vs0Var6 = vs0Var;
                gn5 gn5Var = P10;
                if (P10 == vs0Var6) {
                    gn5 gn5Var2 = new gn5(8);
                    xq2Var2.l0(gn5Var2);
                    gn5Var = gn5Var2;
                }
                a74 y2 = ge7.y(c4, (qn2) gn5Var);
                boolean z8 = i3 == 16384;
                Object P11 = xq2Var2.P();
                x7 x7Var = P11;
                if (z8 || P11 == vs0Var6) {
                    x7 x7Var2 = new x7(16, on2Var2);
                    xq2Var2.l0(x7Var2);
                    x7Var = x7Var2;
                }
                a74 u = mb3.u(y2, false, null, (on2) x7Var, 15);
                e34 d6 = h70.d(e40Var2, false);
                int hashCode4 = Long.hashCode(xq2Var2.T);
                xv4 l4 = xq2Var2.l();
                a74 E5 = l.E(xq2Var2, u);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar2, d6);
                yh2.K(xq2Var2, pnVar3, l4);
                i61.w(hashCode4, xq2Var2, pnVar8, xq2Var2, neVar3);
                yh2.K(xq2Var2, pnVar7, E5);
                e33 A = hi2.A();
                if (z7) {
                    es7Var2 = es7Var;
                    j3 = es7Var2.l;
                } else {
                    es7Var2 = es7Var;
                    j3 = es7Var2.i;
                }
                e40Var = e40Var2;
                xq2Var = xq2Var2;
                vs0Var3 = vs0Var6;
                f2 = 1.0f;
                str = null;
                i5 = 48;
                i13.a(A, null, dj6.i(x64Var3, 12.0f), j3, xq2Var, 432, 0);
                z3 = true;
                xq2Var.p(true);
                xq2Var.p(false);
            } else {
                f2 = 1.0f;
                xq2Var = xq2Var2;
                e40Var = e40Var2;
                es7Var2 = es7Var;
                vs0Var3 = vs0Var;
                z3 = true;
                str = null;
                i5 = 48;
                xq2Var.b0(-883232940);
                xq2Var.p(false);
            }
            xq2Var.b0(-859772748);
            for (Character ch2 : list) {
                char charValue = ch2.charValue();
                Character ch3 = (Character) qa4Var4.getValue();
                boolean z9 = ((ch3 != null && ch3.charValue() == charValue) || !(((Character) qa4Var4.getValue()) != null || ((Boolean) qa4Var2.getValue()).booleanValue() || z2 || ch == null || ch.charValue() != charValue)) ? z3 : false;
                Character ch4 = (Character) qa4Var4.getValue();
                if (ch4 != null && ch4.charValue() == charValue) {
                    f4 = 1.7f;
                } else if (z9) {
                    f4 = 1.15f;
                } else {
                    c2 = charValue;
                    f3 = f2;
                    xq2 xq2Var3 = xq2Var;
                    c3 = c2;
                    pp6 b4 = in.b(f3, ge7.U(0.5f, 1500.0f, str, 4), "letter_scale", xq2Var3, 3120, 20);
                    xq2Var = xq2Var3;
                    a74 c5 = dj6.c(zt0.a(x64Var3), f2);
                    P = xq2Var.P();
                    if (P == vs0Var3) {
                        P = new gn5(9);
                        xq2Var.l0(P);
                    }
                    a74 y3 = ge7.y(c5, (qn2) P);
                    boolean h2 = xq2Var.h(map);
                    H = xq2Var.H();
                    if ((H instanceof Character) || c3 != ((Character) H).charValue()) {
                        xq2Var.m0(ch2);
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z10 = h2 | z5;
                    int i9 = i4;
                    z6 = z10 | (i9 != 131072);
                    Object P12 = xq2Var.P();
                    on2 on2Var3 = P12;
                    if (!z6 || P12 == vs0Var3) {
                        on2 on2Var4 = new on2() { // from class: rq5
                            @Override // defpackage.on2
                            public final Object c() {
                                char c6 = c3;
                                Integer num = (Integer) map.get(Character.valueOf(c6));
                                if (num != null) {
                                    eo2Var2.o(Integer.valueOf(num.intValue()), Character.valueOf(c6));
                                }
                                return jg7.a;
                            }
                        };
                        xq2Var.l0(on2Var4);
                        on2Var3 = on2Var4;
                    }
                    a74 u2 = mb3.u(y3, false, str, (on2) on2Var3, 15);
                    e34 d7 = h70.d(e40Var, false);
                    i4 = i9;
                    int hashCode5 = Long.hashCode(xq2Var.T);
                    xv4 l5 = xq2Var.l();
                    a74 E6 = l.E(xq2Var, u2);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var.f0();
                    if (!xq2Var.S) {
                        xq2Var.k(iy0Var2);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, d7);
                    yh2.K(xq2Var, ix0.e, l5);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode5));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E6);
                    String valueOf3 = String.valueOf(c3);
                    a74 X = ln2.X(x64Var3, ((Number) b4.getValue()).floatValue());
                    sr2 sr2Var = qs7.c;
                    long D = hi2.D(8.5d);
                    long E7 = hi2.E(11);
                    if (!z9) {
                        str2 = valueOf3;
                        j2 = es7Var2.l;
                    } else {
                        str2 = valueOf3;
                        j2 = es7Var2.i;
                    }
                    if (!z9) {
                        oj2Var = oj2.e0;
                    } else {
                        oj2Var = oj2.d0;
                    }
                    x37.b(str2, X, j2, D, oj2Var, sr2Var, 0L, new wz6(3), E7, 0, false, 0, 0, null, null, xq2Var, 1575936, 6, 129424);
                    xq2Var.p(true);
                    x64Var3 = x64Var3;
                    z3 = true;
                    vs0Var3 = vs0Var3;
                    str = null;
                    f2 = 1.0f;
                }
                float f6 = f4;
                c2 = charValue;
                f3 = f6;
                xq2 xq2Var32 = xq2Var;
                c3 = c2;
                pp6 b42 = in.b(f3, ge7.U(0.5f, 1500.0f, str, 4), "letter_scale", xq2Var32, 3120, 20);
                xq2Var = xq2Var32;
                a74 c52 = dj6.c(zt0.a(x64Var3), f2);
                P = xq2Var.P();
                if (P == vs0Var3) {
                }
                a74 y32 = ge7.y(c52, (qn2) P);
                boolean h22 = xq2Var.h(map);
                H = xq2Var.H();
                if (H instanceof Character) {
                }
                xq2Var.m0(ch2);
                z5 = true;
                boolean z102 = h22 | z5;
                int i92 = i4;
                z6 = z102 | (i92 != 131072);
                Object P122 = xq2Var.P();
                on2 on2Var32 = P122;
                if (!z6) {
                }
                on2 on2Var42 = new on2() { // from class: rq5
                    @Override // defpackage.on2
                    public final Object c() {
                        char c6 = c3;
                        Integer num = (Integer) map.get(Character.valueOf(c6));
                        if (num != null) {
                            eo2Var2.o(Integer.valueOf(num.intValue()), Character.valueOf(c6));
                        }
                        return jg7.a;
                    }
                };
                xq2Var.l0(on2Var42);
                on2Var32 = on2Var42;
                a74 u22 = mb3.u(y32, false, str, (on2) on2Var32, 15);
                e34 d72 = h70.d(e40Var, false);
                i4 = i92;
                int hashCode52 = Long.hashCode(xq2Var.T);
                xv4 l52 = xq2Var.l();
                a74 E62 = l.E(xq2Var, u22);
                jx0.i.getClass();
                iy0 iy0Var22 = ix0.b;
                xq2Var.f0();
                if (!xq2Var.S) {
                }
                yh2.K(xq2Var, ix0.f, d72);
                yh2.K(xq2Var, ix0.e, l52);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode52));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E62);
                String valueOf32 = String.valueOf(c3);
                a74 X2 = ln2.X(x64Var3, ((Number) b42.getValue()).floatValue());
                sr2 sr2Var2 = qs7.c;
                long D2 = hi2.D(8.5d);
                long E72 = hi2.E(11);
                if (!z9) {
                }
                if (!z9) {
                }
                x37.b(str2, X2, j2, D2, oj2Var, sr2Var2, 0L, new wz6(3), E72, 0, false, 0, 0, null, null, xq2Var, 1575936, 6, 129424);
                xq2Var.p(true);
                x64Var3 = x64Var3;
                z3 = true;
                vs0Var3 = vs0Var3;
                str = null;
                f2 = 1.0f;
            }
            boolean z11 = z3;
            x64 x64Var4 = x64Var3;
            xq2Var.p(false);
            xq2Var.p(z11);
            xq2Var.p(z11);
            if (((Boolean) qa4Var2.getValue()).booleanValue() && (((Character) qa4Var4.getValue()) != null || ((Boolean) qa4Var3.getValue()).booleanValue())) {
                xq2Var.b0(-1598636826);
                a74 i10 = dj6.i(vs0Var2.n(x64Var4, e40Var), 96.0f);
                y16 y16Var = z16.a;
                a74 L = vy7.L(u24.g(nj2.E(i10, 8.0f, y16Var, false, 0L, 28), y16Var), es7Var2.j, u24.m);
                e34 d8 = h70.d(e40Var, false);
                int hashCode6 = Long.hashCode(xq2Var.T);
                xv4 l6 = xq2Var.l();
                a74 E8 = l.E(xq2Var, L);
                jx0.i.getClass();
                iy0 iy0Var3 = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var3);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, d8);
                yh2.K(xq2Var, ix0.e, l6);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode6));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E8);
                if (((Boolean) qa4Var3.getValue()).booleanValue()) {
                    xq2Var.b0(2000453355);
                    e33 A2 = hi2.A();
                    int i11 = kt0.i;
                    z4 = false;
                    i13.a(A2, null, dj6.i(x64Var4, 48.0f), kt0.d, xq2Var, 3504, 0);
                    xq2Var.p(false);
                } else {
                    z4 = false;
                    xq2Var.b0(2000749374);
                    Character ch5 = (Character) qa4Var4.getValue();
                    if (ch5 == null) {
                        xq2Var.b0(2000749373);
                        xq2Var.p(false);
                    } else {
                        xq2Var.b0(2000749374);
                        String valueOf4 = String.valueOf(ch5.charValue());
                        int i12 = kt0.i;
                        x37.b(valueOf4, null, kt0.d, hi2.E(i5), oj2.e0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772928, 0, 130962);
                        xq2Var.p(false);
                    }
                    xq2Var.p(false);
                }
                xq2Var.p(z11);
                xq2Var.p(z4);
            } else {
                xq2Var.b0(-1597604712);
                xq2Var.p(false);
            }
            xq2Var.p(z11);
        } else {
            eo2Var2 = eo2Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            final eo2 eo2Var3 = eo2Var2;
            t2.d = new eo2(map, ch, z, z2, on2Var, eo2Var3, a74Var, i2, 0) { // from class: sq5
                public final /* synthetic */ int A;
                public final /* synthetic */ Map B;
                public final /* synthetic */ Character L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ on2 Y;
                public final /* synthetic */ eo2 Z;
                public final /* synthetic */ a74 d0;

                {
                    this.A = r9;
                }

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    int i72 = this.A;
                    jg7 jg7Var = jg7.a;
                    switch (i72) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(1);
                            ak7.e(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, (px0) obj, a0);
                            return jg7Var;
                        default:
                            ((Integer) obj2).getClass();
                            int a02 = ii2.a0(1);
                            ak7.e(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, (px0) obj, a02);
                            return jg7Var;
                    }
                }
            };
        }
    }

    public static Type e0(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return y0(type, cls, X(type, cls, Map.class));
        }
        u34.t();
        return null;
    }

    public static uo f(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = RecyclerView.B1;
        }
        return new uo(nw7.e0, Float.valueOf(f2), new wo(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final void g(n00 n00Var, boolean z, sg6 sg6Var, sn snVar, on2 on2Var, on2 on2Var2, on2 on2Var3, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        xq2 xq2Var;
        String str;
        sg6Var.getClass();
        snVar.getClass();
        on2Var.getClass();
        on2Var2.getClass();
        on2Var3.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(2119961070);
        if (xq2Var2.h(n00Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var2.f(sg6Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var2.h(snVar)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (xq2Var2.h(on2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if (xq2Var2.h(on2Var2)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        if (xq2Var2.h(on2Var3)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = i15 | i9;
        if ((599187 & i16) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var2.S(i16 & 1, z2)) {
            UUID uuid = n00Var.a;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            String str2 = str;
            String str3 = n00Var.b;
            xq2Var2.c0(236159766);
            lw n0 = nw7.n0(n00Var, kn2.E(yx3.a, xq2Var2), lw.p0, null, y31.b, 1, xq2Var2);
            xq2Var2.p(false);
            int i17 = i16 << 9;
            h(str2, str3, n0, z, true, sg6Var, snVar, on2Var, on2Var2, on2Var3, xq2Var2, ((i16 << 6) & 7168) | 24576 | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (234881024 & i17) | (i17 & 1879048192));
            xq2Var = xq2Var2;
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new yq5(n00Var, z, sg6Var, snVar, on2Var, on2Var2, on2Var3, i2);
        }
    }

    public static final void h(final String str, final String str2, final sr4 sr4Var, final boolean z, final boolean z2, final sg6 sg6Var, final sn snVar, final on2 on2Var, final on2 on2Var2, final on2 on2Var3, px0 px0Var, final int i2) {
        int i3;
        boolean z3;
        xq2 xq2Var;
        qa4 qa4Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean h2;
        int i11;
        int i12;
        int i13;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1538479222);
        if ((i2 & 6) == 0) {
            if (xq2Var2.f(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var2.f(str2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if ((i2 & 512) == 0) {
                h2 = xq2Var2.f(sr4Var);
            } else {
                h2 = xq2Var2.h(sr4Var);
            }
            if (h2) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i3 |= i11;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var2.g(z)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var2.g(z2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i2) == 0) {
            if (xq2Var2.f(sg6Var)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((1572864 & i2) == 0) {
            if (xq2Var2.h(snVar)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((12582912 & i2) == 0) {
            if (xq2Var2.h(on2Var)) {
                i6 = 8388608;
            } else {
                i6 = Compress.MAXWINSIZE;
            }
            i3 |= i6;
        }
        if ((100663296 & i2) == 0) {
            if (xq2Var2.h(on2Var2)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i3 |= i5;
        }
        if ((805306368 & i2) == 0) {
            if (xq2Var2.h(on2Var3)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i3 |= i4;
        }
        int i14 = i3;
        if ((306783379 & i14) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq2Var2.S(i14 & 1, z3)) {
            Object P = xq2Var2.P();
            if (P == ox0.a) {
                P = np2.Y(Boolean.FALSE);
                xq2Var2.l0(P);
            }
            qa4 qa4Var2 = (qa4) P;
            a74 a74Var = x64.a;
            if (z) {
                xq2Var2.b0(1238955584);
                qa4Var = qa4Var2;
                a74Var = I(a74Var, 3.0f, bl2.F(xq2Var2).j, ((ye6) xq2Var2.j(ze6.a)).b);
                xq2Var2.p(false);
            } else {
                qa4Var = qa4Var2;
                xq2Var2.b0(1239158572);
                xq2Var2.p(false);
            }
            a74 a74Var2 = a74Var;
            final qa4 qa4Var3 = qa4Var;
            zv0 I = n16.I(-1422284196, new eo2() { // from class: p00
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    boolean z4;
                    pn pnVar;
                    pn pnVar2;
                    iy0 iy0Var;
                    float f2;
                    x64 x64Var;
                    sn snVar2;
                    px0 px0Var2 = (px0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    xq2 xq2Var3 = (xq2) px0Var2;
                    if (xq2Var3.S(intValue & 1, z4)) {
                        x64 x64Var2 = x64.a;
                        a74 Y = g04.Y(ge7.O(x64Var2, 4.0f), gb3.Min);
                        yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var3, 0);
                        int hashCode = Long.hashCode(xq2Var3.T);
                        xv4 l = xq2Var3.l();
                        a74 E = l.E(xq2Var3, Y);
                        jx0.i.getClass();
                        iy0 iy0Var2 = ix0.b;
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var2);
                        } else {
                            xq2Var3.o0();
                        }
                        pn pnVar3 = ix0.f;
                        yh2.K(xq2Var3, pnVar3, a2);
                        pn pnVar4 = ix0.e;
                        yh2.K(xq2Var3, pnVar4, l);
                        Integer valueOf = Integer.valueOf(hashCode);
                        pn pnVar5 = ix0.g;
                        yh2.K(xq2Var3, pnVar5, valueOf);
                        ne neVar = ix0.h;
                        yh2.F(xq2Var3, neVar);
                        pn pnVar6 = ix0.d;
                        yh2.K(xq2Var3, pnVar6, E);
                        if (((Boolean) xq2Var3.j(q83.a)).booleanValue()) {
                            xq2Var3.b0(-1061882019);
                            h70.a(vy7.L(ge7.S(ak7.H(dj6.c(x64Var2, 1.0f), 1.0f), 4.0f, 4.0f, 4.0f, RecyclerView.B1, 8), kt0.c, u24.m), xq2Var3, 6);
                            xq2Var3.p(false);
                            iy0Var = iy0Var2;
                            pnVar = pnVar3;
                            pnVar2 = pnVar6;
                            f2 = 1.0f;
                            x64Var = x64Var2;
                        } else {
                            xq2Var3.b0(-1061699212);
                            sg6 sg6Var2 = sg6.this;
                            sr4 sr4Var2 = sr4Var;
                            if (sg6Var2 != null && (snVar2 = snVar) != null) {
                                xq2Var3.b0(-1061627261);
                                a74 S = ge7.S(x64Var2, 4.0f, 4.0f, 4.0f, RecyclerView.B1, 8);
                                String str3 = str;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                a74 H = ak7.H(dj6.c(sg6.e(sg6Var2, S, sg6.d(str3, xq2Var3), snVar2), 1.0f), 1.0f);
                                pnVar2 = pnVar6;
                                pnVar = pnVar3;
                                iy0Var = iy0Var2;
                                bl2.b(sr4Var2, H, null, null, RecyclerView.B1, xq2Var3, 56, 120);
                                xq2Var3.p(false);
                                x64Var = x64Var2;
                                f2 = 1.0f;
                            } else {
                                pnVar = pnVar3;
                                pnVar2 = pnVar6;
                                iy0Var = iy0Var2;
                                xq2Var3.b0(-1060871822);
                                f2 = 1.0f;
                                x64Var = x64Var2;
                                bl2.b(sr4Var2, ak7.H(dj6.c(ge7.S(x64Var2, 4.0f, 4.0f, 4.0f, RecyclerView.B1, 8), 1.0f), 1.0f), null, null, RecyclerView.B1, xq2Var3, 440, 120);
                                xq2Var3.p(false);
                            }
                            xq2Var3.p(false);
                        }
                        a74 S2 = ge7.S(dj6.c(x64Var, f2), 8.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14);
                        l26 a3 = k26.a(ju.a, d90.i0, xq2Var3, 48);
                        int hashCode2 = Long.hashCode(xq2Var3.T);
                        xv4 l2 = xq2Var3.l();
                        a74 E2 = l.E(xq2Var3, S2);
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, pnVar, a3);
                        yh2.K(xq2Var3, pnVar4, l2);
                        i61.w(hashCode2, xq2Var3, pnVar5, xq2Var3, neVar);
                        yh2.K(xq2Var3, pnVar2, E2);
                        x37.b(str2, new vn3(f2, true), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var3, 0, 3120, 120828);
                        xq2 xq2Var4 = xq2Var3;
                        if (z2) {
                            xq2Var4.b0(1139922924);
                            Object P2 = xq2Var4.P();
                            vs0 vs0Var = ox0.a;
                            qa4 qa4Var4 = qa4Var3;
                            if (P2 == vs0Var) {
                                P2 = new f4(qa4Var4, 4);
                                xq2Var4.l0(P2);
                            }
                            ej2.b((on2) P2, null, false, n16.I(120533037, new x3(qa4Var4, on2Var2, on2Var3, 4), xq2Var4), xq2Var4, 24582, 14);
                            xq2Var4 = xq2Var4;
                            xq2Var4.p(false);
                        } else {
                            xq2Var4.b0(1141245260);
                            xq2Var4.p(false);
                        }
                        xq2Var4.p(true);
                        xq2Var4.p(true);
                    } else {
                        xq2Var3.V();
                    }
                    return jg7.a;
                }
            }, xq2Var2);
            y16 y16Var = ((ye6) xq2Var2.j(ze6.a)).b;
            long j2 = ((ut0) xq2Var2.j(vt0.a)).j();
            xq2Var = xq2Var2;
            ej2.d(on2Var, a74Var2, true, y16Var, j2, vt0.b(j2, xq2Var2), null, 4.0f, null, I, xq2Var, (((i14 >> 21) & 14) | 817889280) & 2147483646, 0);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: q00
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ak7.h(str, str2, sr4Var, z, z2, sg6Var, snVar, on2Var, on2Var2, on2Var3, (px0) obj, ii2.a0(i2 | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static final void i(final List list, final boolean z, final boolean z2, final boolean z3, final on2 on2Var, a74 a74Var, px0 px0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        xq2 xq2Var;
        final x64 x64Var;
        boolean z5;
        String P0;
        int i7;
        int i8;
        list.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-919742006);
        if (xq2Var2.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (xq2Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (xq2Var2.g(z3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (xq2Var2.h(on2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6 | 196608;
        if ((74771 & i12) != 74770) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xq2Var2.S(i12 & 1, z4)) {
            if (!z3) {
                cf5 t = xq2Var2.t();
                if (t != null) {
                    t.d = new eo2(list, z, z2, z3, on2Var, i2) { // from class: vq5
                        public final /* synthetic */ List A;
                        public final /* synthetic */ boolean B;
                        public final /* synthetic */ boolean L;
                        public final /* synthetic */ boolean R;
                        public final /* synthetic */ on2 X;

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(1);
                            ak7.i(this.A, this.B, this.L, this.R, this.X, x64.a, (px0) obj, a0);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
            es7 F = bl2.F(xq2Var2);
            x64 x64Var2 = x64.a;
            a74 P = ge7.P(dj6.c(x64Var2, 1.0f), 16.0f, 8.0f);
            d40 d40Var = d90.i0;
            du duVar = ju.a;
            l26 a2 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l = xq2Var2.l();
            a74 E = l.E(xq2Var2, P);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var2, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var2, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            if (z && !z3) {
                xq2Var2.b0(-2031026150);
                a74 S = ge7.S(mb3.u(u24.g(x64Var2, z16.b(8.0f)), false, null, on2Var, 15), RecyclerView.B1, RecyclerView.B1, 8.0f, RecyclerView.B1, 11);
                l26 a3 = k26.a(duVar, d40Var, xq2Var2, 48);
                int hashCode2 = Long.hashCode(xq2Var2.T);
                xv4 l2 = xq2Var2.l();
                a74 E2 = l.E(xq2Var2, S);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar, a3);
                yh2.K(xq2Var2, pnVar2, l2);
                i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                yh2.K(xq2Var2, pnVar4, E2);
                i13.a(jw2.q(), yh2.O(xq2Var2, R.string.rom_browser_navigate_up), dj6.i(x64Var2, 18.0f), F.h, xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                gi2.h(xq2Var2, dj6.l(x64Var2, 3.0f));
                i13.a(hi2.A(), null, dj6.i(x64Var2, 17.0f), F.l, xq2Var2, 432, 0);
                xq2Var2 = xq2Var2;
                xq2Var2.p(true);
                z5 = false;
                xq2Var2.p(false);
            } else {
                z5 = false;
                xq2Var2.b0(-2030406956);
                xq2Var2.p(false);
            }
            if (z3) {
                i7 = 627241537;
                i8 = R.string.rom_browser_search_results;
            } else if (list.isEmpty()) {
                i7 = 627244383;
                i8 = R.string.rom_browser_virtual_root;
            } else {
                xq2Var2.b0(627246977);
                xq2Var2.p(z5);
                P0 = gt0.P0(list, " / ", null, null, null, 62);
                xq2 xq2Var3 = xq2Var2;
                x37.b(P0, new vn3(1.0f, true), F.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var3, 1772544, 3120, 120720);
                xq2Var = xq2Var3;
                xq2Var.p(true);
                x64Var = x64Var2;
            }
            P0 = i61.l(xq2Var2, i7, i8, xq2Var2, z5);
            xq2 xq2Var32 = xq2Var2;
            x37.b(P0, new vn3(1.0f, true), F.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var32, 1772544, 3120, 120720);
            xq2Var = xq2Var32;
            xq2Var.p(true);
            x64Var = x64Var2;
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new eo2(list, z, z2, z3, on2Var, x64Var, i2) { // from class: wq5
                public final /* synthetic */ List A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ on2 X;
                public final /* synthetic */ a74 Y;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1);
                    ak7.i(this.A, this.B, this.L, this.R, this.X, this.Y, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static boolean i0(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (i0(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return i0(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                name = "null";
            } else {
                name = type.getClass().getName();
            }
            fa6.f("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", name);
            return false;
        }
    }

    public static final void j(a74 a74Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-932836462);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(qn2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            gi2.h(xq2Var, q60.v(a74Var, qn2Var));
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hp(a74Var, i2, 1, qn2Var);
        }
    }

    public static final void k(a74 a74Var, Cheat cheat, on2 on2Var, on2 on2Var2, on2 on2Var3, px0 px0Var, int i2) {
        int i3;
        boolean z;
        on2 on2Var4;
        String description;
        boolean z2;
        qa4 qa4Var;
        r94 r94Var;
        long j2;
        boolean z3;
        qa4 qa4Var2;
        boolean z4;
        int i4;
        int i5;
        int i6;
        a74Var.getClass();
        cheat.getClass();
        on2Var.getClass();
        on2Var2.getClass();
        on2Var3.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1297853370);
        if (xq2Var.f(cheat)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i3 | i2;
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(on2Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i7 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(on2Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i7 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var.h(on2Var3)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i7 |= i4;
        }
        int i8 = i7;
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            if (cheat.getDescription() != null && (!qs6.v0(description))) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.FALSE);
                xq2Var.l0(P);
            }
            qa4 qa4Var3 = (qa4) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                nh2 nh2Var = nh2.b;
                P2 = mh2.a;
                xq2Var.l0(P2);
            }
            ((mh2) P2).getClass();
            nh2 nh2Var2 = new nh2();
            nh2 nh2Var3 = new nh2();
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = i61.f(xq2Var);
            }
            r94 r94Var2 = (r94) P3;
            qa4 a2 = bw7.a(r94Var2, xq2Var, 6);
            y16 b2 = z16.b(13.0f);
            a74 g2 = u24.g(a74Var, b2);
            if (((Boolean) a2.getValue()).booleanValue()) {
                qa4Var = qa4Var3;
                r94Var = r94Var2;
                j2 = F.e;
            } else {
                qa4Var = qa4Var3;
                r94Var = r94Var2;
                j2 = F.d;
            }
            a74 L = vy7.L(g2, j2, u24.m);
            if (((Boolean) a2.getValue()).booleanValue()) {
                L = I(L, 2.0f, F.j, b2);
            }
            a74 S = S(L, nh2Var2);
            boolean f2 = xq2Var.f(nh2Var3);
            Object P4 = xq2Var.P();
            if (f2 || P4 == vs0Var) {
                P4 = new do0(nh2Var3, 0);
                xq2Var.l0(P4);
            }
            qa4 qa4Var4 = qa4Var;
            a74 t = mb3.t(ge7.y(S, (qn2) P4), r94Var, null, false, null, on2Var, 28);
            Object P5 = xq2Var.P();
            if (P5 == vs0Var) {
                P5 = new eo0(qa4Var4, 0);
                xq2Var.l0(P5);
            }
            a74 R = ge7.R(u24.A(t, (qn2) P5), 14.0f, 11.0f, 6.0f, 11.0f);
            l26 a3 = k26.a(new gu(10.0f, true, new i(1)), d90.i0, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, R);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a3);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a4 = wt0.a(new gu(3.0f, true, new i(1)), d90.k0, xq2Var, 6);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a4);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(cheat.getName(), null, F.g, hi2.D(13.5d), oj2.Z, null, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var, 199680, 3120, 120786);
            xq2 xq2Var2 = xq2Var;
            if (z2) {
                xq2Var2.b0(1179612777);
                String description2 = cheat.getDescription();
                description2.getClass();
                x37.b(description2, null, F.i, hi2.D(11.5d), null, null, 0L, null, hi2.E(15), 2, false, 2, 0, null, null, xq2Var2, 3072, 3126, 119794);
                xq2Var2 = xq2Var2;
                xq2Var2.p(false);
            } else {
                xq2Var2.b0(1179896706);
                xq2Var2.p(false);
            }
            if (!qs6.v0(cheat.getCode())) {
                xq2Var2.b0(1179965712);
                xq2 xq2Var3 = xq2Var2;
                x37.b(qs6.T0(xs6.d0(cheat.getCode(), '\n', ' ')).toString(), null, F.i, hi2.D(9.5d), null, qs7.c, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var3, 1575936, 3120, 120754);
                xq2Var2 = xq2Var3;
                z3 = false;
                xq2Var2.p(false);
            } else {
                z3 = false;
                xq2Var2.b0(1180273666);
                xq2Var2.p(false);
            }
            xq2Var2.p(true);
            e34 d2 = h70.d(d90.L, z3);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            x64 x64Var = x64.a;
            a74 E3 = l.E(xq2Var2, x64Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d2);
            yh2.K(xq2Var2, pnVar2, l3);
            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E3);
            e33 A = oi2.A();
            String O = yh2.O(xq2Var2, R.string.options);
            long j3 = F.i;
            a74 S2 = S(u24.g(dj6.i(x64Var, 34.0f), z16.b(8.0f)), nh2Var3);
            boolean f3 = xq2Var2.f(nh2Var2);
            Object P6 = xq2Var2.P();
            if (f3 || P6 == vs0Var) {
                P6 = new do0(nh2Var2, 1);
                xq2Var2.l0(P6);
            }
            a74 y = ge7.y(S2, (qn2) P6);
            Object P7 = xq2Var2.P();
            if (P7 == vs0Var) {
                qa4Var2 = qa4Var4;
                P7 = new f4(qa4Var2, 9);
                xq2Var2.l0(P7);
            } else {
                qa4Var2 = qa4Var4;
            }
            i13.a(A, O, ge7.O(mb3.u(y, false, null, (on2) P7, 15), 7.0f), j3, xq2Var2, 0, 0);
            boolean booleanValue = ((Boolean) qa4Var2.getValue()).booleanValue();
            Object P8 = xq2Var2.P();
            if (P8 == vs0Var) {
                P8 = new f4(qa4Var2, 10);
                xq2Var2.l0(P8);
            }
            on2Var4 = on2Var3;
            xq2 xq2Var4 = xq2Var2;
            ti.a(booleanValue, (on2) P8, null, 0L, null, null, n16.I(-1291925597, new r00(on2Var2, on2Var4, qa4Var2, 1), xq2Var2), xq2Var4, 1572912);
            xq2Var = xq2Var4;
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var, 2.0f));
            boolean enabled = cheat.getEnabled();
            if ((i8 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P9 = xq2Var.P();
            if (z4 || P9 == vs0Var) {
                P9 = new mn0(2, on2Var);
                xq2Var.l0(P9);
            }
            is7.f(enabled, (qn2) P9, null, false, xq2Var, 0, 12);
            xq2Var.p(true);
        } else {
            on2Var4 = on2Var3;
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new r4(a74Var, (Object) cheat, (Object) on2Var, (Object) on2Var2, (ao2) on2Var4, i2, 1);
        }
    }

    public static final void l(int i2, qw5 qw5Var, qn2 qn2Var, a74 a74Var, px0 px0Var, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z;
        x64 x64Var;
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        qw5Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1927411608);
        if (xq2Var.d(i2)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i7 = i3 | i4;
        if (xq2Var.d(qw5Var.ordinal())) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i8 = i7 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i9 = i8 | i6 | 3072;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i9 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            a74 g2 = u24.g(dj6.c, z16.b(14.0f));
            long j4 = F.c;
            long j5 = F.d;
            jy2 jy2Var = u24.m;
            a74 O = ge7.O(I(vy7.L(g2, j4, jy2Var), 1.0f, F.f, z16.b(14.0f)), 16.0f);
            yt0 a2 = wt0.a(ju.d, d90.l0, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            x64 x64Var2 = x64.a;
            a74 L = vy7.L(u24.g(dj6.i(x64Var2, 48.0f), z16.a), j5, jy2Var);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, L);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d2);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            i13.a(ej2.G(), null, dj6.i(x64Var2, 24.0f), F.j, xq2Var, 432, 0);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.e(x64Var2, 10.0f));
            x37.b("STORM DS", null, F.g, hi2.E(15), oj2.e0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772550, 0, 130962);
            x37.b(lb1.g(i2, "Всего игр: "), null, F.h, hi2.E(11), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1575936, 0, 130994);
            gi2.h(xq2Var, dj6.e(x64Var2, 14.0f));
            a74 g3 = u24.g(x64Var2, z16.b(8.0f));
            qw5 qw5Var2 = qw5.FAVORITES;
            if (qw5Var == qw5Var2) {
                j2 = F.j;
            } else {
                j2 = j5;
            }
            a74 L2 = vy7.L(g3, j2, jy2Var);
            if ((i9 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i9 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z4 = z3 | z2;
            Object P = xq2Var.P();
            if (z4 || P == ox0.a) {
                P = new ci2(21, qn2Var, qw5Var);
                xq2Var.l0(P);
            }
            a74 P2 = ge7.P(mb3.u(L2, false, null, (on2) P, 15), 12.0f, 7.0f);
            e34 d3 = h70.d(d90.L, false);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, P2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            if (qw5Var == qw5Var2) {
                j3 = kt0.d;
            } else {
                j3 = F.h;
            }
            x37.b("★ Избранное", null, j3, hi2.E(11), oj2.d0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 199686, 0, 131026);
            xq2Var = xq2Var;
            xq2Var.p(true);
            xq2Var.p(true);
            x64Var = x64Var2;
        } else {
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(i2, qw5Var, qn2Var, x64Var, i3);
        }
    }

    public static boolean l0(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static final void m(pq5 pq5Var, String str, String str2, boolean z, on2 on2Var, on2 on2Var2, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        r94 r94Var;
        fr5 fr5Var;
        qa4 qa4Var;
        String str3;
        float f2;
        c40 c40Var;
        eu euVar;
        a74 a74Var;
        String str4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(414607229);
        if (xq2Var.h(pq5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var.g(z)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(on2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if (xq2Var.h(on2Var2)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        if (xq2Var.h(qn2Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = i15 | i9;
        if ((i16 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i16 & 1, z2)) {
            es7 F = bl2.F(xq2Var);
            y16 b2 = z16.b(8.0f);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = i61.f(xq2Var);
            }
            r94 r94Var2 = (r94) P;
            qa4 a2 = bw7.a(r94Var2, xq2Var, 6);
            qa4 u = gi2.u(r94Var2, xq2Var);
            Boolean bool = (Boolean) a2.getValue();
            bool.booleanValue();
            boolean f3 = xq2Var.f(a2);
            if ((i16 & 3670016) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h2 = f3 | z3 | xq2Var.h(pq5Var);
            Object P2 = xq2Var.P();
            if (!h2 && P2 != vs0Var) {
                qa4Var = a2;
                str3 = null;
                fr5Var = P2;
                r94Var = r94Var2;
            } else {
                r94Var = r94Var2;
                fr5Var = new fr5(qn2Var, pq5Var, a2, null, 0);
                qa4Var = a2;
                str3 = null;
                xq2Var.l0(fr5Var);
            }
            mb3.i(xq2Var, (eo2) fr5Var, bool);
            if (((Boolean) u.getValue()).booleanValue()) {
                f2 = 0.95f;
            } else {
                f2 = 1.0f;
            }
            String str5 = str3;
            pp6 b3 = in.b(f2, ge7.U(1.0f, 4000.0f, str3, 4), "press", xq2Var, 3120, 20);
            x64 x64Var = x64.a;
            a74 v = mb3.v(ln2.X(dj6.l(x64Var, 116.0f), ((Number) b3.getValue()).floatValue()), r94Var, false, on2Var2, on2Var, 444);
            c40 c40Var2 = d90.k0;
            eu euVar2 = ju.c;
            yt0 a3 = wt0.a(euVar2, c40Var2, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, v);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a3);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 g2 = u24.g(nj2.E(H(dj6.c(x64Var, 1.0f), 1.117904f), 6.0f, b2, false, 0L, 28), b2);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                c40Var = c40Var2;
                euVar = euVar2;
                a74Var = I(x64Var, 3.0f, F.j, b2);
            } else {
                c40Var = c40Var2;
                euVar = euVar2;
                a74Var = x64Var;
            }
            a74 d2 = g2.d(a74Var);
            e40 e40Var = d90.L;
            e34 d3 = h70.d(e40Var, false);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, d2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d3);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            vs0 vs0Var2 = vs0.Y;
            hf.u(pq5Var, str2, str, H(dj6.c(x64Var, 1.0f), 1.117904f), hi2.E(26), null, z, null, xq2Var, ((i16 << 3) & 896) | (i16 & 14) | 27648 | ((i16 >> 3) & 112) | ((i16 << 9) & 3670016), 160);
            hf.i(hf.n0(pq5Var), ge7.S(vs0Var2.n(x64Var, e40Var), 6.0f, 6.0f, RecyclerView.B1, RecyclerView.B1, 12), hi2.E(8), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            a74 c2 = dj6.c(vs0Var2.n(x64Var, d90.e0), 1.0f);
            kt0 kt0Var = new kt0(kt0.g);
            long j2 = kt0.b;
            a74 R = ge7.R(vy7.J(c2, d90.m(hf.c0(kt0Var, new kt0(kt0.c(0.72f, j2))), RecyclerView.B1, RecyclerView.B1, 14)), 8.0f, 9.0f, 8.0f, 7.0f);
            yt0 a4 = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, R);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a4);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            String k0 = hf.k0(pq5Var);
            long j3 = kt0.d;
            x37.b(k0, null, j3, hi2.D(10.5d), oj2.e0, null, 0L, null, hi2.E(12), 2, false, 1, 0, null, null, xq2Var, 200064, 3126, 119762);
            xq2Var = xq2Var;
            xq2Var.p(true);
            a74 i17 = dj6.i(ge7.S(vs0Var2.n(x64Var, d90.g0), RecyclerView.B1, RecyclerView.B1, 6.0f, 7.0f, 3), 22.0f);
            y16 y16Var = z16.a;
            a74 I = I(vy7.L(u24.g(i17, y16Var), kt0.c(0.4f, j2), u24.m), 1.0f, kt0.c(0.25f, j3), y16Var);
            e34 d4 = h70.d(d90.Z, false);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E4 = l.E(xq2Var, I);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d4);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E4);
            i13.a(gi2.H(), null, dj6.i(x64Var, 12.0f), j3, xq2Var, 3504, 0);
            xq2Var.p(true);
            xq2Var.p(true);
            Date date = pq5Var.g;
            if (date != null) {
                str4 = DateUtils.getRelativeTimeSpanString(date.getTime(), System.currentTimeMillis(), 60000L).toString();
            } else {
                str4 = str5;
            }
            if (str4 != null) {
                xq2Var.b0(-1814920112);
                x37.b(yh2.N(R.string.rom_last_played_format, new Object[]{str4}, xq2Var), ge7.S(x64Var, 1.0f, 5.0f, RecyclerView.B1, RecyclerView.B1, 12), bl2.F(xq2Var).i, hi2.E(9), null, qs7.c, 0L, null, hi2.E(11), 2, false, 1, 0, null, null, xq2Var, 1575984, 3126, 119728);
                xq2Var = xq2Var;
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1814511377);
                xq2Var.p(false);
            }
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new yq5(pq5Var, str, str2, z, on2Var, on2Var2, qn2Var, i2, 1);
        }
    }

    public static final boolean m0(long j2, int i2, int i3) {
        int j3 = q21.j(j2);
        if (i2 <= q21.h(j2) && j3 <= i2) {
            int i4 = q21.i(j2);
            if (i3 <= q21.g(j2) && i4 <= i3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void n(pq5 pq5Var, String str, String str2, boolean z, on2 on2Var, on2 on2Var2, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        eo2 fr5Var;
        r94 r94Var;
        y16 y16Var;
        qa4 qa4Var;
        String str3;
        float f2;
        long j2;
        float f3;
        r94 r94Var2;
        long j3;
        iy0 iy0Var;
        String str4;
        x64 x64Var;
        iy0 iy0Var2;
        pn pnVar;
        pn pnVar2;
        pn pnVar3;
        ne neVar;
        pn pnVar4;
        es7 es7Var;
        boolean z4;
        long c2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-550584698);
        if (xq2Var.h(pq5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var.g(z)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(on2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if (xq2Var.h(on2Var2)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        if (xq2Var.h(qn2Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = i15 | i9;
        if ((i16 & 599187) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i16 & 1, z2)) {
            es7 F = bl2.F(xq2Var);
            y16 b2 = z16.b(10.0f);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = i61.f(xq2Var);
            }
            r94 r94Var3 = (r94) P;
            qa4 a2 = bw7.a(r94Var3, xq2Var, 6);
            qa4 u = gi2.u(r94Var3, xq2Var);
            Boolean bool = (Boolean) a2.getValue();
            bool.booleanValue();
            boolean f4 = xq2Var.f(a2);
            if ((i16 & 3670016) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h2 = f4 | z3 | xq2Var.h(pq5Var);
            Object P2 = xq2Var.P();
            if (!h2 && P2 != vs0Var) {
                str3 = null;
                qa4Var = a2;
                fr5Var = P2;
                y16Var = b2;
                r94Var = r94Var3;
            } else {
                r94Var = r94Var3;
                y16Var = b2;
                fr5Var = new fr5(qn2Var, pq5Var, a2, null, 1);
                qa4Var = a2;
                str3 = null;
                xq2Var.l0(fr5Var);
            }
            mb3.i(xq2Var, fr5Var, bool);
            if (((Boolean) u.getValue()).booleanValue()) {
                f2 = 0.97f;
            } else {
                f2 = 1.0f;
            }
            pp6 b3 = in.b(f2, null, "press", xq2Var, 3072, 22);
            d40 d40Var = d90.i0;
            x64 x64Var2 = x64.a;
            a74 g2 = u24.g(ln2.X(dj6.c(x64Var2, 1.0f), ((Number) b3.getValue()).floatValue()), y16Var);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                j2 = F.d;
            } else {
                j2 = F.c;
            }
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g2, j2, jy2Var);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                f3 = 2.0f;
            } else {
                f3 = 1.0f;
            }
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                r94Var2 = r94Var;
                j3 = F.j;
            } else {
                r94Var2 = r94Var;
                j3 = F.f;
            }
            a74 O = ge7.O(mb3.v(I(L, f3, j3, y16Var), r94Var2, false, on2Var2, on2Var, 444), 8.0f);
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var3 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            pn pnVar5 = ix0.f;
            yh2.K(xq2Var, pnVar5, a3);
            pn pnVar6 = ix0.e;
            yh2.K(xq2Var, pnVar6, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar7 = ix0.g;
            yh2.K(xq2Var, pnVar7, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var, neVar2);
            pn pnVar8 = ix0.d;
            yh2.K(xq2Var, pnVar8, E);
            a74 g3 = u24.g(H(dj6.l(x64Var2, 52.0f), 1.117904f), z16.b(6.0f));
            e34 d2 = h70.d(d90.L, false);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, g3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar5, d2);
            yh2.K(xq2Var, pnVar6, l2);
            i61.w(hashCode2, xq2Var, pnVar7, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar8, E2);
            hf.u(pq5Var, str2, str, dj6.c, hi2.E(14), null, z, null, xq2Var, ((i16 << 9) & 3670016) | (i16 & 14) | 27648 | ((i16 >> 3) & 112) | ((i16 << 3) & 896), 160);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var2, 10.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a4 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar5, a4);
            yh2.K(xq2Var, pnVar6, l3);
            i61.w(hashCode3, xq2Var, pnVar7, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar8, E3);
            x37.b(hf.k0(pq5Var), null, F.g, hi2.D(12.5d), oj2.e0, null, 0L, null, hi2.E(16), 2, false, 2, 0, null, null, xq2Var, 199680, 3126, 119762);
            xq2Var = xq2Var;
            gi2.h(xq2Var, dj6.e(x64Var2, 3.0f));
            l26 a5 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E4 = l.E(xq2Var, x64Var2);
            xq2Var.f0();
            if (xq2Var.S) {
                iy0Var = iy0Var3;
                xq2Var.k(iy0Var);
            } else {
                iy0Var = iy0Var3;
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar5, a5);
            yh2.K(xq2Var, pnVar6, l4);
            i61.w(hashCode4, xq2Var, pnVar7, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar8, E4);
            hf.i(hf.n0(pq5Var), null, hi2.E(8), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 2);
            Date date = pq5Var.g;
            if (date != null) {
                str4 = DateUtils.getRelativeTimeSpanString(date.getTime(), System.currentTimeMillis(), 60000L).toString();
            } else {
                str4 = str3;
            }
            if (str4 != null) {
                xq2Var.b0(-2119831928);
                gi2.h(xq2Var, dj6.l(x64Var2, 6.0f));
                pnVar4 = pnVar8;
                x64Var = x64Var2;
                pnVar2 = pnVar6;
                neVar = neVar2;
                pnVar3 = pnVar7;
                es7Var = F;
                iy0Var2 = iy0Var;
                pnVar = pnVar5;
                x37.b(str4, null, F.i, hi2.D(8.5d), null, qs7.c, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var, 1575936, 3120, 120754);
                xq2Var = xq2Var;
                z4 = false;
                xq2Var.p(false);
            } else {
                x64Var = x64Var2;
                iy0Var2 = iy0Var;
                pnVar = pnVar5;
                pnVar2 = pnVar6;
                pnVar3 = pnVar7;
                neVar = neVar2;
                pnVar4 = pnVar8;
                es7Var = F;
                z4 = false;
                xq2Var.b0(-2119445606);
                xq2Var.p(false);
            }
            xq2Var.p(true);
            xq2Var.p(true);
            x64 x64Var3 = x64Var;
            gi2.h(xq2Var, dj6.l(x64Var3, 6.0f));
            a74 g4 = u24.g(dj6.i(x64Var3, 28.0f), z16.a);
            if (((Boolean) qa4Var.getValue()).booleanValue()) {
                c2 = es7Var.j;
            } else {
                c2 = kt0.c(0.1f, kt0.d);
            }
            a74 L2 = vy7.L(g4, c2, jy2Var);
            e34 d3 = h70.d(d90.Z, z4);
            int hashCode5 = Long.hashCode(xq2Var.T);
            xv4 l5 = xq2Var.l();
            a74 E5 = l.E(xq2Var, L2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d3);
            yh2.K(xq2Var, pnVar2, l5);
            i61.w(hashCode5, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E5);
            i13.a(gi2.H(), null, dj6.i(x64Var3, 16.0f), kt0.d, xq2Var, 3504, 0);
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new yq5(pq5Var, str, str2, z, on2Var, on2Var2, qn2Var, i2, 0);
        }
    }

    public static final a74 n0(tp3 tp3Var, p70 p70Var, lo4 lo4Var) {
        return new op3(tp3Var, p70Var, lo4Var);
    }

    public static final void o(List list, Map map, Map map2, qn2 qn2Var, qn2 qn2Var2, a74 a74Var, qn2 qn2Var3, qn2 qn2Var4, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        x64 x64Var;
        pn pnVar;
        ne neVar;
        iy0 iy0Var;
        pn pnVar2;
        pn pnVar3;
        pn pnVar4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        x64 x64Var2;
        boolean z7;
        boolean z8;
        iy0 iy0Var2;
        jy2 jy2Var = u24.m;
        list.getClass();
        map.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(50685696);
        if (xq2Var.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var.h(map)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var.h(map2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(qn2Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7 | 196608;
        if (xq2Var.h(qn2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if (xq2Var.h(qn2Var4)) {
            i9 = 8388608;
        } else {
            i9 = Compress.MAXWINSIZE;
        }
        int i16 = i15 | i9;
        if ((4793491 & i16) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i16 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            lc2 lc2Var = dj6.c;
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, lc2Var);
            jx0.i.getClass();
            iy0 iy0Var3 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            pn pnVar5 = ix0.f;
            yh2.K(xq2Var, pnVar5, a2);
            pn pnVar6 = ix0.e;
            yh2.K(xq2Var, pnVar6, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar7 = ix0.g;
            yh2.K(xq2Var, pnVar7, valueOf);
            ne neVar2 = ix0.h;
            yh2.F(xq2Var, neVar2);
            pn pnVar8 = ix0.d;
            yh2.K(xq2Var, pnVar8, E);
            d40 d40Var = d90.i0;
            x64 x64Var3 = x64.a;
            a74 S = ge7.S(dj6.c(x64Var3, 1.0f), RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 10.0f, 7);
            l26 a3 = k26.a(ju.a, d40Var, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, S);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar5, a3);
            yh2.K(xq2Var, pnVar6, l2);
            i61.w(hashCode2, xq2Var, pnVar7, xq2Var, neVar2);
            yh2.K(xq2Var, pnVar8, E2);
            i13.a(gi2.H(), null, dj6.i(x64Var3, 20.0f), F.j, xq2Var, 432, 0);
            gi2.h(xq2Var, dj6.l(x64Var3, 8.0f));
            String O = yh2.O(xq2Var, R.string.rom_continue_playing);
            long j2 = F.g;
            pi2 pi2Var = qs7.a;
            long E3 = hi2.E(16);
            oj2 oj2Var = oj2.e0;
            x37.b(O, new vn3(1.0f, true), j2, E3, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772544, 0, 130960);
            xq2 xq2Var2 = xq2Var;
            if (!list.isEmpty()) {
                xq2Var2.b0(-1324010074);
                a74 P = ge7.P(vy7.L(u24.g(x64Var3, z16.b(6.0f)), F.d, jy2Var), 7.0f, 2.0f);
                e34 d2 = h70.d(d90.L, false);
                int hashCode3 = Long.hashCode(xq2Var2.T);
                xv4 l3 = xq2Var2.l();
                a74 E4 = l.E(xq2Var2, P);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    iy0Var2 = iy0Var3;
                    xq2Var2.k(iy0Var2);
                } else {
                    iy0Var2 = iy0Var3;
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar5, d2);
                yh2.K(xq2Var2, pnVar6, l3);
                i61.w(hashCode3, xq2Var2, pnVar7, xq2Var2, neVar2);
                yh2.K(xq2Var2, pnVar8, E4);
                pnVar = pnVar6;
                neVar = neVar2;
                pnVar4 = pnVar8;
                iy0Var = iy0Var2;
                pnVar2 = pnVar5;
                pnVar3 = pnVar7;
                x37.b(String.valueOf(list.size()), null, es7.p, hi2.E(11), oj2Var, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772928, 0, 130962);
                xq2Var2 = xq2Var2;
                z2 = true;
                xq2Var2.p(true);
                xq2Var2.p(false);
            } else {
                pnVar = pnVar6;
                neVar = neVar2;
                iy0Var = iy0Var3;
                pnVar2 = pnVar5;
                pnVar3 = pnVar7;
                pnVar4 = pnVar8;
                z2 = true;
                xq2Var2.b0(-1323435396);
                xq2Var2.p(false);
            }
            xq2Var2.p(z2);
            if (list.isEmpty()) {
                xq2Var2.b0(221937824);
                a74 O2 = ge7.O(I(vy7.L(u24.g(zt0.a(dj6.c(x64Var3, 1.0f)), z16.b(12.0f)), F.c, jy2Var), 1.0f, F.f, z16.b(12.0f)), 16.0f);
                e34 d3 = h70.d(d90.Z, false);
                int hashCode4 = Long.hashCode(xq2Var2.T);
                xv4 l4 = xq2Var2.l();
                a74 E5 = l.E(xq2Var2, O2);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar2, d3);
                yh2.K(xq2Var2, pnVar, l4);
                i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
                yh2.K(xq2Var2, pnVar4, E5);
                boolean z9 = z2;
                xq2 xq2Var3 = xq2Var2;
                x37.b(yh2.O(xq2Var2, R.string.no_roms_found), null, F.h, hi2.E(12), null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var3, 3072, 0, 130546);
                xq2Var = xq2Var3;
                xq2Var.p(z9);
                xq2Var.p(false);
                z8 = z9;
                x64Var2 = x64Var3;
            } else {
                boolean z10 = z2;
                xq2Var2.b0(222624846);
                gu guVar = new gu(8.0f, z10, new i(z10 ? 1 : 0));
                a74 a4 = zt0.a(dj6.c(x64Var3, 1.0f));
                boolean h2 = xq2Var2.h(list);
                if ((i16 & 29360128) == 8388608) {
                    z3 = z10 ? 1 : 0;
                } else {
                    z3 = false;
                }
                boolean h3 = h2 | z3 | xq2Var2.h(map) | xq2Var2.h(map2);
                if ((i16 & 7168) == 2048) {
                    z4 = z10 ? 1 : 0;
                } else {
                    z4 = false;
                }
                boolean z11 = h3 | z4;
                if ((57344 & i16) == 16384) {
                    z5 = z10 ? 1 : 0;
                } else {
                    z5 = false;
                }
                boolean z12 = z11 | z5;
                if ((i16 & 3670016) == 1048576) {
                    z6 = z10 ? 1 : 0;
                } else {
                    z6 = false;
                }
                boolean z13 = z12 | z6;
                Object P2 = xq2Var2.P();
                if (!z13 && P2 != ox0.a) {
                    z8 = z10 ? 1 : 0;
                    x64Var2 = x64Var3;
                    z7 = false;
                } else {
                    x64Var2 = x64Var3;
                    z7 = false;
                    z8 = z10 ? 1 : 0;
                    uq5 uq5Var = new uq5(list, qn2Var4, map, map2, qn2Var, qn2Var2, qn2Var3, 0);
                    xq2Var2.l0(uq5Var);
                    P2 = uq5Var;
                }
                xq2 xq2Var4 = xq2Var2;
                gi2.e(a4, null, null, guVar, null, null, false, null, (qn2) P2, xq2Var4, 24576, 494);
                xq2Var = xq2Var4;
                xq2Var.p(z7);
            }
            xq2Var.p(z8);
            x64Var = x64Var2;
        } else {
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new m73(list, map, map2, qn2Var, qn2Var2, x64Var, qn2Var3, qn2Var4, i2);
        }
    }

    public static IllegalArgumentException o0(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder r = i61.r(String.format(str, objArr), "\n    for method ");
        r.append(method.getDeclaringClass().getSimpleName());
        r.append(".");
        r.append(method.getName());
        return new IllegalArgumentException(r.toString(), exc);
    }

    public static final void p(final List list, final Map map, final Map map2, final qn2 qn2Var, final qn2 qn2Var2, a74 a74Var, final float f2, final qn2 qn2Var3, final qn2 qn2Var4, px0 px0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        float f3;
        final x64 x64Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        list.getClass();
        map.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(117035113);
        if (xq2Var.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var.h(map)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var.h(map2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(qn2Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7 | 196608;
        if (xq2Var.h(qn2Var3)) {
            i8 = 8388608;
        } else {
            i8 = Compress.MAXWINSIZE;
        }
        int i15 = i14 | i8;
        if (xq2Var.h(qn2Var4)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i16 = i15 | i9;
        if ((38347923 & i16) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i16 & 1, z)) {
            if (list.isEmpty()) {
                cf5 t = xq2Var.t();
                if (t != null) {
                    t.d = new eo2(list, map, map2, qn2Var, qn2Var2, f2, qn2Var3, qn2Var4, i2) { // from class: zq5
                        public final /* synthetic */ List A;
                        public final /* synthetic */ Map B;
                        public final /* synthetic */ Map L;
                        public final /* synthetic */ qn2 R;
                        public final /* synthetic */ qn2 X;
                        public final /* synthetic */ float Y;
                        public final /* synthetic */ qn2 Z;
                        public final /* synthetic */ qn2 d0;

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(1572865);
                            ak7.p(this.A, this.B, this.L, this.R, this.X, x64.a, this.Y, this.Z, this.d0, (px0) obj, a0);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
            es7 F = bl2.F(xq2Var);
            x64 x64Var2 = x64.a;
            a74 S = ge7.S(x64Var2, RecyclerView.B1, 16.0f, RecyclerView.B1, 4.0f, 5);
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, S);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(yh2.O(xq2Var, R.string.rom_continue_playing), ge7.S(x64Var2, f2, RecyclerView.B1, f2, 10.0f, 2), F.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772544, 0, 130960);
            f3 = f2;
            xq2Var = xq2Var;
            pq4 i17 = ge7.i(2, f3);
            gu guVar = new gu(12.0f, true, new i(1));
            boolean h2 = xq2Var.h(list);
            if ((234881024 & i16) == 67108864) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h3 = h2 | z2 | xq2Var.h(map) | xq2Var.h(map2);
            if ((i16 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z6 = h3 | z3;
            if ((57344 & i16) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            if ((i16 & 29360128) == 8388608) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = z7 | z5;
            Object P = xq2Var.P();
            if (z8 || P == ox0.a) {
                uq5 uq5Var = new uq5(list, qn2Var4, map, map2, qn2Var, qn2Var2, qn2Var3, 1);
                xq2Var.l0(uq5Var);
                P = uq5Var;
            }
            gi2.f(null, null, i17, guVar, null, null, false, null, (qn2) P, xq2Var, 24576, 491);
            xq2Var.p(true);
            x64Var = x64Var2;
        } else {
            f3 = f2;
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            final float f4 = f3;
            t2.d = new eo2(list, map, map2, qn2Var, qn2Var2, x64Var, f4, qn2Var3, qn2Var4, i2) { // from class: ar5
                public final /* synthetic */ List A;
                public final /* synthetic */ Map B;
                public final /* synthetic */ Map L;
                public final /* synthetic */ qn2 R;
                public final /* synthetic */ qn2 X;
                public final /* synthetic */ a74 Y;
                public final /* synthetic */ float Z;
                public final /* synthetic */ qn2 d0;
                public final /* synthetic */ qn2 e0;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1572865);
                    ak7.p(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void q(la1 la1Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        la1 la1Var2;
        xq2 xq2Var;
        Context context;
        qa4 qa4Var;
        xq2 xq2Var2;
        vs0 vs0Var;
        sv4 sv4Var;
        qa4 qa4Var2;
        r41 r41Var;
        on2 on2Var2 = on2Var;
        on2Var2.getClass();
        xq2 xq2Var3 = (xq2) px0Var;
        xq2Var3.d0(-134762069);
        if (xq2Var3.h(la1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (xq2Var3.h(on2Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var3.S(i6 & 1, z)) {
            qa4 C = np2.C(la1Var.h, xq2Var3);
            de5 de5Var = la1Var.j;
            Boolean bool = Boolean.FALSE;
            qa4 B = np2.B(de5Var, bool, null, xq2Var3, 48, 2);
            Context context2 = (Context) xq2Var3.j(kf.b);
            Object[] objArr = {null};
            Object P = xq2Var3.P();
            vs0 vs0Var2 = ox0.a;
            if (P == vs0Var2) {
                P = new c5(26);
                xq2Var3.l0(P);
            }
            qa4 qa4Var3 = (qa4) qo2.I(objArr, (on2) P, xq2Var3, 48);
            j37 T = mp2.T(xq2Var3);
            boolean h2 = xq2Var3.h(la1Var);
            Object P2 = xq2Var3.P();
            if (!h2 && P2 != vs0Var2) {
                xq2Var2 = xq2Var3;
                context = context2;
                qa4Var = qa4Var3;
                vs0Var = vs0Var2;
            } else {
                context = context2;
                qa4Var = qa4Var3;
                xq2Var2 = xq2Var3;
                vs0Var = vs0Var2;
                o80 o80Var = new o80(3, la1Var, la1.class, "importDSiWareTitleFile", "importDSiWareTitleFile(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;Landroid/net/Uri;)V", 0, 0, 3);
                xq2Var2.l0(o80Var);
                P2 = o80Var;
            }
            fo2 fo2Var = (fo2) ((po2) P2);
            fo2Var.getClass();
            sv4 sv4Var2 = sv4.READ;
            final qa4 b0 = np2.b0(fo2Var, xq2Var2);
            Object P3 = xq2Var2.P();
            if (P3 == vs0Var) {
                P3 = new Object();
                xq2Var2.l0(P3);
            }
            final ab1 ab1Var = (ab1) P3;
            zj1 zj1Var = new zj1(sv4Var2, 1);
            boolean h3 = xq2Var2.h(ab1Var) | xq2Var2.f(b0);
            Object P4 = xq2Var2.P();
            if (h3 || P4 == vs0Var) {
                P4 = new qn2() { // from class: ya1
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        bb1 bb1Var;
                        bb1 bb1Var2;
                        int i7 = r3;
                        jg7 jg7Var = jg7.a;
                        qa4 qa4Var4 = b0;
                        ab1 ab1Var2 = ab1Var;
                        Uri uri = (Uri) obj;
                        switch (i7) {
                            case 0:
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle = ab1Var2.a;
                                    if (dSiWareTitle != null && (bb1Var = ab1Var2.b) != null) {
                                        ((fo2) qa4Var4.getValue()).e(dSiWareTitle, bb1Var, uri);
                                    }
                                    return jg7Var;
                                }
                                ab1Var2.a = null;
                                ab1Var2.b = null;
                                return jg7Var;
                            default:
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle2 = ab1Var2.a;
                                    if (dSiWareTitle2 != null && (bb1Var2 = ab1Var2.b) != null) {
                                        ((fo2) qa4Var4.getValue()).e(dSiWareTitle2, bb1Var2, uri);
                                    }
                                    return jg7Var;
                                }
                                ab1Var2.a = null;
                                ab1Var2.b = null;
                                return jg7Var;
                        }
                    }
                };
                xq2Var2.l0(P4);
            }
            j04 K = l.K(zj1Var, (qn2) P4, xq2Var2, 0);
            Object P5 = xq2Var2.P();
            if (P5 == vs0Var) {
                P5 = new za1(ab1Var, K);
                xq2Var2.l0(P5);
            }
            za1 za1Var = (za1) P5;
            boolean h4 = xq2Var2.h(la1Var);
            Object P6 = xq2Var2.P();
            if (!h4 && P6 != vs0Var) {
                sv4Var = sv4Var2;
            } else {
                sv4Var = sv4Var2;
                o80 o80Var2 = new o80(3, la1Var, la1.class, "exportDSiWareTitleFile", "exportDSiWareTitleFile(Lme/magnum/melonds/domain/model/DSiWareTitle;Lme/magnum/melonds/domain/model/dsinand/DSiWareTitleFileType;Landroid/net/Uri;)V", 0, 0, 2);
                xq2Var2.l0(o80Var2);
                P6 = o80Var2;
            }
            fo2 fo2Var2 = (fo2) ((po2) P6);
            fo2Var2.getClass();
            final qa4 b02 = np2.b0(fo2Var2, xq2Var2);
            Object P7 = xq2Var2.P();
            if (P7 == vs0Var) {
                P7 = new Object();
                xq2Var2.l0(P7);
            }
            final ab1 ab1Var2 = (ab1) P7;
            c9 c9Var = new c9(6);
            boolean h5 = xq2Var2.h(ab1Var2) | xq2Var2.f(b02);
            Object P8 = xq2Var2.P();
            if (h5 || P8 == vs0Var) {
                P8 = new qn2() { // from class: ya1
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        bb1 bb1Var;
                        bb1 bb1Var2;
                        int i7 = r3;
                        jg7 jg7Var = jg7.a;
                        qa4 qa4Var4 = b02;
                        ab1 ab1Var22 = ab1Var2;
                        Uri uri = (Uri) obj;
                        switch (i7) {
                            case 0:
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle = ab1Var22.a;
                                    if (dSiWareTitle != null && (bb1Var = ab1Var22.b) != null) {
                                        ((fo2) qa4Var4.getValue()).e(dSiWareTitle, bb1Var, uri);
                                    }
                                    return jg7Var;
                                }
                                ab1Var22.a = null;
                                ab1Var22.b = null;
                                return jg7Var;
                            default:
                                if (uri != null) {
                                    DSiWareTitle dSiWareTitle2 = ab1Var22.a;
                                    if (dSiWareTitle2 != null && (bb1Var2 = ab1Var22.b) != null) {
                                        ((fo2) qa4Var4.getValue()).e(dSiWareTitle2, bb1Var2, uri);
                                    }
                                    return jg7Var;
                                }
                                ab1Var22.a = null;
                                ab1Var22.b = null;
                                return jg7Var;
                        }
                    }
                };
                xq2Var2.l0(P8);
            }
            j04 K2 = l.K(c9Var, (qn2) P8, xq2Var2, 0);
            Object P9 = xq2Var2.P();
            if (P9 == vs0Var) {
                P9 = new cb1(ab1Var2, K2);
                xq2Var2.l0(P9);
            }
            cb1 cb1Var = (cb1) P9;
            zj1 zj1Var2 = new zj1(sv4Var, 1);
            boolean h6 = xq2Var2.h(la1Var);
            Object P10 = xq2Var2.P();
            if (h6 || P10 == vs0Var) {
                P10 = new k0(la1Var, 18);
                xq2Var2.l0(P10);
            }
            j04 K3 = l.K(zj1Var2, (qn2) P10, xq2Var2, 0);
            fa1 fa1Var = (fa1) C.getValue();
            Object P11 = xq2Var2.P();
            if (P11 == vs0Var) {
                P11 = np2.Y(bool);
                xq2Var2.l0(P11);
            }
            qa4 qa4Var4 = (qa4) P11;
            vs0 vs0Var3 = vs0Var;
            xq2 xq2Var4 = xq2Var2;
            la1Var2 = la1Var;
            ps7.a(yh2.O(xq2Var2, R.string.dsiware_manager), on2Var, null, null, n16.I(-689990950, new ql1(8, fa1Var, qa4Var4), xq2Var2), null, n16.I(1272777695, new u91(fa1Var, la1Var, T, za1Var, cb1Var, 0), xq2Var2), xq2Var4, (i6 & 112) | 1597440, 44);
            on2Var2 = on2Var;
            xq2Var = xq2Var4;
            mp2.e(yh2.O(xq2Var, R.string.dsiware_manager_rename), T, null, null, xq2Var, 0, 12);
            if (((Boolean) qa4Var4.getValue()).booleanValue()) {
                xq2Var.b0(1101144853);
                String O = yh2.O(xq2Var, R.string.import_dsiware_title);
                Object P12 = xq2Var.P();
                if (P12 == vs0Var3) {
                    P12 = new f4(qa4Var4, 19);
                    xq2Var.l0(P12);
                }
                qa4Var2 = qa4Var;
                mb3.b(O, (on2) P12, n16.I(-1505443618, new m4(K3, qa4Var2, qa4Var4, 4), xq2Var), xq2Var, 432);
                xq2Var.p(false);
            } else {
                qa4Var2 = qa4Var;
                xq2Var.b0(1101700311);
                xq2Var.p(false);
            }
            if (((Boolean) qa4Var2.getValue()).booleanValue()) {
                xq2Var.b0(1101739712);
                boolean f2 = xq2Var.f(qa4Var2);
                Object P13 = xq2Var.P();
                if (f2 || P13 == vs0Var3) {
                    P13 = new f4(qa4Var2, 20);
                    xq2Var.l0(P13);
                }
                on2 on2Var3 = (on2) P13;
                boolean h7 = xq2Var.h(la1Var2) | xq2Var.f(qa4Var2);
                Object P14 = xq2Var.P();
                if (h7 || P14 == vs0Var3) {
                    P14 = new y(20, la1Var2, qa4Var2);
                    xq2Var.l0(P14);
                }
                r41Var = null;
                nb3.e(null, on2Var3, (qn2) P14, xq2Var, 0);
                xq2Var.p(false);
            } else {
                r41Var = null;
                xq2Var.b0(1101977079);
                xq2Var.p(false);
            }
            if (((Boolean) B.getValue()).booleanValue()) {
                xq2Var.b0(1102025842);
                jj1 jj1Var = new jj1(4, false, false);
                Object P15 = xq2Var.P();
                if (P15 == vs0Var3) {
                    P15 = new c5(17);
                    xq2Var.l0(P15);
                }
                nw7.o((on2) P15, jj1Var, hf.b, xq2Var, 438, 0);
                xq2Var = xq2Var;
                xq2Var.p(false);
            } else {
                xq2Var.b0(1102251863);
                xq2Var.p(false);
            }
            Context context3 = context;
            boolean h8 = xq2Var.h(la1Var2) | xq2Var.h(context3);
            Object P16 = xq2Var.P();
            if (h8 || P16 == vs0Var3) {
                P16 = new w91(la1Var2, context3, r41Var, 0);
                xq2Var.l0(P16);
            }
            mb3.i(xq2Var, (eo2) P16, r41Var);
            boolean h9 = xq2Var.h(la1Var2) | xq2Var.h(context3);
            Object P17 = xq2Var.P();
            if (h9 || P17 == vs0Var3) {
                P17 = new w91(la1Var2, context3, r41Var, 1);
                xq2Var.l0(P17);
            }
            mb3.i(xq2Var, (eo2) P17, r41Var);
        } else {
            la1Var2 = la1Var;
            xq2Var = xq2Var3;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(la1Var2, i2, 9, on2Var2);
        }
    }

    public static final void r(a74 a74Var, lq4 lq4Var, List list, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, eo2 eo2Var2, qn2 qn2Var3, px0 px0Var, int i2) {
        a74 a74Var2;
        int i3;
        qn2 qn2Var4;
        qn2 qn2Var5;
        eo2 eo2Var3;
        eo2 eo2Var4;
        qn2 qn2Var6;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-667671623);
        if ((i2 & 6) == 0) {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            a74Var2 = a74Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(lq4Var)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(list)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i2 & 3072) == 0) {
            qn2Var4 = qn2Var;
            if (xq2Var.h(qn2Var4)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        } else {
            qn2Var4 = qn2Var;
        }
        if ((i2 & 24576) == 0) {
            qn2Var5 = qn2Var2;
            if (xq2Var.h(qn2Var5)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        } else {
            qn2Var5 = qn2Var2;
        }
        if ((196608 & i2) == 0) {
            eo2Var3 = eo2Var;
            if (xq2Var.h(eo2Var3)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        } else {
            eo2Var3 = eo2Var;
        }
        if ((1572864 & i2) == 0) {
            eo2Var4 = eo2Var2;
            if (xq2Var.h(eo2Var4)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        } else {
            eo2Var4 = eo2Var2;
        }
        if ((12582912 & i2) == 0) {
            qn2Var6 = qn2Var3;
            if (xq2Var.h(qn2Var6)) {
                i4 = 8388608;
            } else {
                i4 = Compress.MAXWINSIZE;
            }
            i3 |= i4;
        } else {
            qn2Var6 = qn2Var3;
        }
        boolean z6 = false;
        if ((i3 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            a74 s = q60.s(a74Var, lq4Var);
            nq6 nq6Var = ky0.n;
            pq4 pq4Var = new pq4(ge7.r(lq4Var, (kk3) xq2Var.j(nq6Var)), lq4Var.d(), ge7.q(lq4Var, (kk3) xq2Var.j(nq6Var)), lq4Var.a() + 16.0f + 56.0f + 16.0f);
            boolean h2 = xq2Var.h(list);
            if ((57344 & i3) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = h2 | z2;
            if ((i3 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z7 | z3;
            if ((458752 & i3) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z9 = z8 | z4;
            if ((3670016 & i3) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z10 = z9 | z5;
            if ((i3 & 29360128) == 8388608) {
                z6 = true;
            }
            boolean z11 = z10 | z6;
            Object P = xq2Var.P();
            if (z11 || P == ox0.a) {
                j70 j70Var = new j70(list, qn2Var5, qn2Var4, eo2Var3, eo2Var4, qn2Var6);
                xq2Var.l0(j70Var);
                P = j70Var;
            }
            gi2.e(s, null, pq4Var, null, null, null, false, null, (qn2) P, xq2Var, 0, 506);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new s91(a74Var2, lq4Var, list, qn2Var, qn2Var2, eo2Var, eo2Var2, qn2Var3, i2, 1);
        }
    }

    public static final uh1 s(Context context) {
        float f2 = context.getResources().getConfiguration().fontScale;
        float f3 = context.getResources().getDisplayMetrics().density;
        fj2 a2 = gj2.a(f2);
        if (a2 == null) {
            a2 = new av3(f2);
        }
        return new uh1(f3, f2, a2);
    }

    public static final void t(a74 a74Var, lq4 lq4Var, rp0 rp0Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        a74Var.getClass();
        lq4Var.getClass();
        rp0Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1863343579);
        if (xq2Var.f(lq4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i2 | i3;
        if (xq2Var.f(rp0Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if (xq2Var.h(qn2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            if (rp0Var instanceof pp0) {
                xq2Var.b0(328191092);
                hi2.e(ge7.N(a74Var, lq4Var), xq2Var, 0);
                xq2Var.p(false);
            } else if (rp0Var instanceof qp0) {
                xq2Var.b0(328194029);
                y(a74Var, lq4Var, (List) ((qp0) rp0Var).a, qn2Var, xq2Var, i8 & 7294);
                xq2Var.p(false);
            } else {
                throw xg6.f(xq2Var, 328189509, false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new s32(a74Var, lq4Var, rp0Var, qn2Var, i2, 0);
        }
    }

    public static final void u(a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-853335576);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            a74 O = ge7.O(a74Var, 24.0f);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, O);
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
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(yh2.O(xq2Var, R.string.dsiware_manager_load_error), null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130558);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new f5(a74Var, i2, 3, (byte) 0);
        }
    }

    public static a74 u0(a74 a74Var, sr4 sr4Var, ic icVar, z31 z31Var, float f2, z40 z40Var, int i2) {
        if ((i2 & 4) != 0) {
            icVar = d90.Z;
        }
        ic icVar2 = icVar;
        if ((i2 & 16) != 0) {
            f2 = 1.0f;
        }
        return a74Var.d(new tr4(sr4Var, icVar2, z31Var, f2, z40Var));
    }

    public static final void v(qw5 qw5Var, qn2 qn2Var, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        x64 x64Var;
        boolean z2;
        qw5Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1469230584);
        if (xq2Var.d(qw5Var.ordinal())) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | RendererDebugBridge.CAPTURE_HEIGHT;
        boolean z3 = true;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            List c0 = hf.c0(new vr4(qw5.ALL, Integer.valueOf((int) R.string.rom_filter_all)), new vr4(qw5.FAVORITES, Integer.valueOf((int) R.string.rom_filter_favorites)), new vr4(qw5.DS_ONLY, Integer.valueOf((int) R.string.rom_filter_ds)), new vr4(qw5.DSIWARE_ONLY, Integer.valueOf((int) R.string.rom_filter_dsiware)), new vr4(qw5.WITH_RETRO_ACHIEVEMENTS, Integer.valueOf((int) R.string.rom_filter_retro_achievements)));
            x64 x64Var2 = x64.a;
            a74 c2 = dj6.c(x64Var2, 1.0f);
            pq4 pq4Var = new pq4(16.0f, 14.0f, 16.0f, 4.0f);
            gu guVar = new gu(7.0f, true, new i(1));
            boolean f2 = xq2Var.f(c0);
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z2 | f2;
            if ((i6 & 112) != 32) {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            Object P = xq2Var.P();
            if (z5 || P == ox0.a) {
                P = new t00(c0, qw5Var, qn2Var, 19);
                xq2Var.l0(P);
            }
            gi2.f(c2, null, pq4Var, guVar, null, null, false, null, (qn2) P, xq2Var, 24576, 490);
            x64Var = x64Var2;
        } else {
            xq2Var.V();
            x64Var = a74Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(qw5Var, qn2Var, x64Var, i2, 27);
        }
    }

    public static IllegalArgumentException v0(Method method, int i2, String str, Object... objArr) {
        String f2 = jx4.b.f(method, i2);
        return o0(method, null, str + " (" + f2 + ")", objArr);
    }

    public static final void w(a74 a74Var, cz0 cz0Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(121602030);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.d(cz0Var.ordinal())) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            Context context = (Context) xq2Var.j(kf.b);
            c9 c9Var = new c9(5);
            if ((i3 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z2 || P == vs0Var) {
                P = new mn0(3, on2Var);
                xq2Var.l0(P);
            }
            j04 K = l.K(c9Var, (qn2) P, xq2Var, 0);
            a74 O = ge7.O(a74Var, 24.0f);
            yt0 a2 = wt0.a(ju.d, d90.l0, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            int i7 = aa1.a[cz0Var.ordinal()];
            x64 x64Var = x64.a;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        xq2Var.b0(-1376837873);
                        xq2Var.p(false);
                        z4 = true;
                    } else {
                        throw xg6.f(xq2Var, -44468706, false);
                    }
                } else {
                    xq2Var.b0(-1377651034);
                    x37.b(yh2.O(xq2Var, R.string.dsiware_manager_invalid_dsi_setup), null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130558);
                    xq2Var = xq2Var;
                    gi2.h(xq2Var, dj6.e(x64Var, 8.0f));
                    boolean h2 = xq2Var.h(context) | xq2Var.h(K);
                    Object P2 = xq2Var.P();
                    if (!h2 && P2 != vs0Var) {
                        z5 = true;
                    } else {
                        z5 = true;
                        P2 = new t91(context, K, 1);
                        xq2Var.l0(P2);
                    }
                    mb3.a((on2) P2, null, false, null, null, null, mb3.I(xq2Var), null, hf.d, xq2Var, 805306368, 382);
                    xq2Var.p(false);
                    z4 = z5;
                }
            } else {
                xq2Var.b0(-1378481617);
                x37.b(yh2.O(xq2Var, R.string.dsiware_manager_no_dsi_setup), null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130558);
                xq2Var = xq2Var;
                gi2.h(xq2Var, dj6.e(x64Var, 8.0f));
                boolean h3 = xq2Var.h(context) | xq2Var.h(K);
                Object P3 = xq2Var.P();
                if (!h3 && P3 != vs0Var) {
                    z3 = false;
                } else {
                    z3 = false;
                    P3 = new t91(context, K, 0);
                    xq2Var.l0(P3);
                }
                mb3.a((on2) P3, null, false, null, null, null, mb3.I(xq2Var), null, hf.c, xq2Var, 805306368, 382);
                xq2Var.p(z3);
                z4 = true;
            }
            xq2Var.p(z4);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(a74Var, cz0Var, on2Var, i2, 7);
        }
    }

    public static IllegalArgumentException w0(Method method, Exception exc, int i2, String str, Object... objArr) {
        String f2 = jx4.b.f(method, i2);
        return o0(method, exc, str + " (" + f2 + ")", objArr);
    }

    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public static final void x(String str, boolean z, gn6 gn6Var, hn6 hn6Var, int i2, on2 on2Var, qn2 qn2Var, a74 a74Var, px0 px0Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        gn6 gn6Var2;
        hn6 hn6Var2;
        int i11;
        es7 es7Var;
        float f2;
        ?? r1;
        boolean z3;
        int i12;
        int i13;
        xq2 xq2Var;
        boolean z4;
        boolean z5;
        boolean z6;
        str.getClass();
        gn6Var.getClass();
        hn6Var.getClass();
        on2Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-558285369);
        if (xq2Var2.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i14 = i3 | i4;
        if (xq2Var2.g(z)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i15 = i14 | i5;
        if (xq2Var2.d(gn6Var.ordinal())) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i16 = i15 | i6;
        if (xq2Var2.d(hn6Var.ordinal())) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i17 = i16 | i7;
        if (xq2Var2.d(i2)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i18 = i17 | i8;
        if (xq2Var2.h(on2Var)) {
            i9 = 131072;
        } else {
            i9 = 65536;
        }
        int i19 = i18 | i9;
        if (xq2Var2.h(qn2Var)) {
            i10 = 1048576;
        } else {
            i10 = 524288;
        }
        int i20 = i19 | i10;
        if ((4793491 & i20) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var2.S(i20 & 1, z2)) {
            es7 F = bl2.F(xq2Var2);
            a74 R = ge7.R(dj6.c(a74Var, 1.0f), 16.0f, 18.0f, 16.0f, 10.0f);
            d40 d40Var = d90.i0;
            du duVar = ju.a;
            l26 a2 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l = xq2Var2.l();
            a74 E = l.E(xq2Var2, R);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var2, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var2, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            x64 x64Var = x64.a;
            if (z) {
                xq2Var2.b0(-22144029);
                i11 = i20;
                a74 u = mb3.u(u24.g(x64Var, z16.b(8.0f)), false, null, on2Var, 15);
                l26 a3 = k26.a(duVar, d40Var, xq2Var2, 48);
                int hashCode2 = Long.hashCode(xq2Var2.T);
                xv4 l2 = xq2Var2.l();
                a74 E2 = l.E(xq2Var2, u);
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, pnVar, a3);
                yh2.K(xq2Var2, pnVar2, l2);
                i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
                yh2.K(xq2Var2, pnVar4, E2);
                es7Var = F;
                r1 = 1;
                z3 = false;
                i12 = 1048576;
                i13 = 2048;
                f2 = 1.0f;
                i13.a(jw2.q(), yh2.O(xq2Var2, R.string.rom_browser_navigate_up), dj6.i(x64Var, 18.0f), F.h, xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                gi2.h(xq2Var2, dj6.l(x64Var, 3.0f));
                i13.a(hi2.A(), null, dj6.i(x64Var, 17.0f), es7Var.l, xq2Var2, 432, 0);
                gi2.h(xq2Var2, dj6.l(x64Var, 6.0f));
                x37.b(str, null, es7Var.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var2, (i11 & 14) | 1772544, 3120, 120722);
                xq2Var = xq2Var2;
                xq2Var.p(true);
                xq2Var.p(false);
            } else {
                i11 = i20;
                es7Var = F;
                f2 = 1.0f;
                r1 = 1;
                z3 = false;
                i12 = 1048576;
                i13 = 2048;
                xq2Var2.b0(-21163406);
                x37.b(str, null, es7Var.g, hi2.E(16), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var2, (i11 & 14) | 1772544, 3120, 120722);
                xq2Var = xq2Var2;
                xq2Var.p(false);
            }
            if (f2 <= 0.0d) {
                n53.a("invalid weight; must be greater than zero");
            }
            float f3 = Float.MAX_VALUE;
            if (f2 > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            gi2.h(xq2Var, new vn3(f2, r1));
            gu guVar = new gu(4.0f, r1, new i((int) r1));
            if (2.0f <= 0.0d) {
                n53.a("invalid weight; must be greater than zero");
            }
            if (2.0f <= Float.MAX_VALUE) {
                f3 = 2.0f;
            }
            vn3 vn3Var = new vn3(f3, z3);
            int i21 = i11;
            if ((i21 & 896) == 256) {
                z4 = r1;
            } else {
                z4 = z3;
            }
            if ((i21 & 7168) == i13) {
                z5 = r1;
            } else {
                z5 = z3;
            }
            boolean z7 = z5 | z4;
            if ((i21 & 3670016) == i12) {
                z6 = r1;
            } else {
                z6 = z3;
            }
            boolean z8 = z7 | z6;
            Object P = xq2Var.P();
            if (!z8 && P != ox0.a) {
                gn6Var2 = gn6Var;
                hn6Var2 = hn6Var;
            } else {
                gn6Var2 = gn6Var;
                hn6Var2 = hn6Var;
                P = new t00(gn6Var2, hn6Var2, qn2Var, 18);
                xq2Var.l0(P);
            }
            xq2 xq2Var3 = xq2Var;
            gi2.f(vn3Var, null, null, guVar, null, null, false, null, (qn2) P, xq2Var3, 24576, 494);
            gi2.h(xq2Var3, dj6.l(x64Var, 8.0f));
            x37.b(yh2.N(R.string.rom_games_count, new Object[]{Integer.valueOf(i2)}, xq2Var3), null, es7Var.i, hi2.D(10.5d), null, qs7.c, 0L, null, 0L, 0, false, 1, 0, null, null, xq2Var3, 1575936, 3072, 122802);
            xq2Var2 = xq2Var3;
            xq2Var2.p(r1);
        } else {
            gn6Var2 = gn6Var;
            hn6Var2 = hn6Var;
            xq2Var2.V();
        }
        cf5 t = xq2Var2.t();
        if (t != null) {
            t.d = new u51(str, z, gn6Var2, hn6Var2, i2, on2Var, qn2Var, a74Var, i3);
        }
    }

    public static final void x0(String str) {
        System.err.println("SLF4J: ".concat(str));
    }

    public static final void y(a74 a74Var, lq4 lq4Var, List list, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1661538873);
        if (xq2Var.f(lq4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i2 | i3;
        if (xq2Var.h(list)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if (xq2Var.h(qn2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            if (list.isEmpty()) {
                xq2Var.b0(593703914);
                a74 N = ge7.N(a74Var, lq4Var);
                e34 d2 = h70.d(d90.L, false);
                int hashCode = Long.hashCode(xq2Var.T);
                xv4 l = xq2Var.l();
                a74 E = l.E(xq2Var, N);
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
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E);
                x37.b(yh2.O(xq2Var, R.string.no_enabled_cheats_for_rom), vs0.Y.n(ge7.O(x64.a, 24.0f), d90.Z), 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130556);
                xq2Var = xq2Var;
                xq2Var.p(true);
                xq2Var.p(false);
            } else {
                boolean z2 = true;
                xq2Var.b0(594043643);
                a74 s = q60.s(a74Var, lq4Var);
                gu guVar = new gu(8.0f, true, new i(1));
                nq6 nq6Var = ky0.n;
                pq4 pq4Var = new pq4(ge7.r(lq4Var, (kk3) xq2Var.j(nq6Var)) + 16.0f, lq4Var.d() + 12.0f, ge7.q(lq4Var, (kk3) xq2Var.j(nq6Var)) + 16.0f, lq4Var.a() + 16.0f);
                boolean h2 = xq2Var.h(list);
                if ((i8 & 7168) != 2048) {
                    z2 = false;
                }
                boolean z3 = h2 | z2;
                Object P = xq2Var.P();
                if (z3 || P == ox0.a) {
                    P = new t32(list, qn2Var, 0);
                    xq2Var.l0(P);
                }
                gi2.e(s, null, pq4Var, guVar, null, null, false, null, (qn2) P, xq2Var, 24576, 490);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new u32(a74Var, lq4Var, list, qn2Var, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[LOOP:0: B:2:0x0000->B:24:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Type y0(Type type, Class cls, Type type2) {
        TypeVariable typeVariable;
        boolean z;
        Class cls2;
        TypeVariable typeVariable2;
        while (true) {
            int i2 = 0;
            if (typeVariable instanceof TypeVariable) {
                TypeVariable typeVariable3 = (TypeVariable) typeVariable;
                GenericDeclaration genericDeclaration = typeVariable3.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type X = X(type, cls, cls2);
                    if (X instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        while (i2 < typeParameters.length) {
                            if (typeVariable3.equals(typeParameters[i2])) {
                                typeVariable2 = ((ParameterizedType) X).getActualTypeArguments()[i2];
                                if (typeVariable2 != typeVariable3) {
                                    return typeVariable2;
                                }
                                typeVariable = typeVariable2;
                            } else {
                                i2++;
                            }
                        }
                        fa6.c();
                        return null;
                    }
                }
                typeVariable2 = typeVariable3;
                if (typeVariable2 != typeVariable3) {
                }
            } else {
                if (typeVariable instanceof Class) {
                    Class cls3 = (Class) typeVariable;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type y0 = y0(type, cls, componentType);
                        if (componentType == y0) {
                            return cls3;
                        }
                        return new uu2(1, y0);
                    }
                }
                if (typeVariable instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) typeVariable;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type y02 = y0(type, cls, genericComponentType);
                    if (genericComponentType == y02) {
                        return genericArrayType;
                    }
                    return new uu2(1, y02);
                } else if (typeVariable instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) typeVariable;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type y03 = y0(type, cls, ownerType);
                    if (y03 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i2 < length) {
                        Type y04 = y0(type, cls, actualTypeArguments[i2]);
                        if (y04 != actualTypeArguments[i2]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i2] = y04;
                        }
                        i2++;
                    }
                    if (z) {
                        return new vu2(y03, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                } else {
                    boolean z2 = typeVariable instanceof WildcardType;
                    WildcardType wildcardType = typeVariable;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) typeVariable;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type y05 = y0(type, cls, lowerBounds[0]);
                            wildcardType = wildcardType2;
                            if (y05 != lowerBounds[0]) {
                                return new wu2(new Type[]{Object.class}, new Type[]{y05}, 1);
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type y06 = y0(type, cls, upperBounds[0]);
                                wildcardType = wildcardType2;
                                if (y06 != upperBounds[0]) {
                                    return new wu2(new Type[]{y06}, h, 1);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        }
    }

    public static final void z(a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-791636580);
        if (xq2Var.f(a74Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            e34 d2 = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
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
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            e45.a(vs0.Y.n(x64.a, d90.Z), bl2.F(xq2Var).j, RecyclerView.B1, 0L, 0, xq2Var, 0, 28);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new v00(a74Var, i2, 1);
        }
    }

    public static final void z0(rj0 rj0Var, r41 r41Var, boolean z) {
        Object g2;
        eg7 eg7Var;
        Object u = rj0Var.u();
        Throwable e2 = rj0Var.e(u);
        if (e2 != null) {
            g2 = new em5(e2);
        } else {
            g2 = rj0Var.g(u);
        }
        if (z) {
            r41Var.getClass();
            nk1 nk1Var = (nk1) r41Var;
            s41 s41Var = nk1Var.X;
            Object obj = nk1Var.Z;
            l61 b2 = s41Var.b();
            Object c2 = k57.c(b2, obj);
            if (c2 != k57.a) {
                eg7Var = mb3.O(s41Var, b2, c2);
            } else {
                eg7Var = null;
            }
            try {
                s41Var.i(g2);
                if (eg7Var != null && !eg7Var.x0()) {
                    return;
                }
                k57.a(b2, c2);
                return;
            } catch (Throwable th) {
                if (eg7Var == null || eg7Var.x0()) {
                    k57.a(b2, c2);
                }
                throw th;
            }
        }
        r41Var.i(g2);
    }

    public abstract void A0(boolean z);

    public abstract void B0(boolean z);

    public abstract void C0(boolean z);

    public abstract void D0(String str);

    public abstract void E0(CharSequence charSequence);

    public k8 G0(u63 u63Var) {
        return null;
    }

    public boolean L() {
        return false;
    }

    public abstract boolean M();

    public abstract void P(boolean z);

    public abstract int V();

    public abstract double Z(double d2);

    @Override // defpackage.ov0
    public Object a(Class cls) {
        o55 b2 = b(cls);
        if (b2 == null) {
            return null;
        }
        return b2.get();
    }

    public abstract void a0(double d2, double[] dArr);

    public abstract void b0(double d2, float[] fArr);

    @Override // defpackage.ov0
    public Set d(Class cls) {
        return (Set) c(cls).get();
    }

    public abstract void d0(double d2, double[] dArr);

    public abstract Context f0();

    public abstract double[] g0();

    public abstract CharSequence h0();

    public abstract void j0();

    public boolean k0() {
        return false;
    }

    public abstract void p0();

    public abstract boolean r0(int i2, KeyEvent keyEvent);

    public boolean s0(KeyEvent keyEvent) {
        return false;
    }

    public boolean t0() {
        return false;
    }

    public void q0() {
    }
}
