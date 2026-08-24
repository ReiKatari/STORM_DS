package defpackage;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.view.DragEvent;
import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mb3  reason: default package */
/* loaded from: classes.dex */
public abstract class mb3 {
    public static e33 D;
    public static final /* synthetic */ int E = 0;
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781};
    public static final zv0 e = new zv0(1504001887, false, new fn0(22));
    public static final zv0 f = new zv0(878295664, false, new lw0(11, (byte) 0));
    public static final zv0 g = new zv0(-235308274, false, new lw0(13, (byte) 0));
    public static final zv0 h = new zv0(-254577537, false, new lw0(14, (byte) 0));
    public static final zv0 i = new zv0(-20431393, false, new lw0(15, (byte) 0));
    public static final zv0 j = new zv0(-105240864, false, new lw0(16, (byte) 0));
    public static final zv0 k = new zv0(1647229897, false, new lw0(17, (byte) 0));
    public static final zv0 l = new zv0(1738023229, false, new lw0(18, (byte) 0));
    public static final zv0 m = new zv0(1029610183, false, new lw0(19, (byte) 0));
    public static final zv0 n = new zv0(1537745828, false, new iw0(29));
    public static final zv0 o = new zv0(488732356, false, new nw0(0));
    public static final zv0 p = new zv0(-1936883664, false, new lw0(12, (byte) 0));
    public static final zv0 q = new zv0(-486941431, false, new nw0(1));
    public static final gl1 r = new Object();
    public static final h45 s = new h45("image-destination");
    public static final h45 t = new h45("image-replacement-text-is-link");
    public static final h45 u = new h45("image-size");
    public static final dv4 v = new dv4(5);
    public static final fw0 w = new fw0(2);
    public static final ap3 x = new ap3(28, new l56(17, (byte) 0), new k56(25));
    public static final ap3 y = new ap3(28, new l56(18, (byte) 0), new k56(26));
    public static final ap3 z = new ap3(28, new l56(19, (byte) 0), new k56(27));
    public static final ap3 A = new ap3(28, new l56(20, (byte) 0), new k56(28));
    public static final ap3 B = new ap3(28, new l56(21, (byte) 0), new k56(29));
    public static final byte[] C = new byte[0];

    public static final l61 A(l61 l61Var, l61 l61Var2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) l61Var.x(new lw0(21, (byte) 0), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) l61Var2.x(new lw0(21, (byte) 0), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return l61Var.N(l61Var2);
        }
        lw0 lw0Var = new lw0(22, (byte) 0);
        vt1 vt1Var = vt1.A;
        l61 l61Var3 = (l61) l61Var.x(lw0Var, vt1Var);
        l61 l61Var4 = l61Var2;
        if (booleanValue2) {
            l61Var4 = l61Var2.x(new lw0(23, (byte) 0), vt1Var);
        }
        return l61Var3.N(l61Var4);
    }

    public static final cv B(lg0 lg0Var) {
        lg0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = {0};
        Object c2 = ((qc0) lg0Var).c(key);
        if (c2 != null) {
            iArr = c2;
        }
        return new cv(iArr);
    }

    public static final cv C(lg0 lg0Var) {
        lg0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = {0};
        Object c2 = ((qc0) lg0Var).c(key);
        if (c2 != null) {
            iArr = c2;
        }
        return new cv(iArr);
    }

    public static final cv D(lg0 lg0Var) {
        lg0Var.getClass();
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
        key.getClass();
        int[] iArr = {0};
        Object c2 = ((qc0) lg0Var).c(key);
        if (c2 != null) {
            iArr = c2;
        }
        return new cv(iArr);
    }

    public static final long E(d51 d51Var) {
        DragEvent dragEvent = (DragEvent) d51Var.B;
        return (Float.floatToRawIntBits(dragEvent.getX()) << 32) | (Float.floatToRawIntBits(dragEvent.getY()) & 4294967295L);
    }

    public static final int F(lg0 lg0Var, int i2) {
        lg0Var.getClass();
        if (B(lg0Var).contains(Integer.valueOf(i2))) {
            return i2;
        }
        if (B(lg0Var).contains(1)) {
            return 1;
        }
        return 0;
    }

    public static final boolean G(KeyEvent keyEvent) {
        long m2 = xk2.m(keyEvent);
        int i2 = kg3.X;
        if (!kg3.a(m2, kg3.h) && !kg3.a(m2, kg3.t) && !kg3.a(m2, kg3.N) && !kg3.a(m2, kg3.s)) {
            return false;
        }
        return true;
    }

    public static final boolean H(lg0 lg0Var) {
        lg0Var.getClass();
        if (Build.VERSION.SDK_INT >= 28 && F(lg0Var, 5) == 5) {
            return true;
        }
        return false;
    }

    public static final bd1 I(px0 px0Var) {
        pq4 pq4Var = k90.a;
        nq6 nq6Var = vt0.a;
        xq2 xq2Var = (xq2) px0Var;
        return k90.a(((ut0) xq2Var.j(nq6Var)).i(), ((ut0) xq2Var.j(nq6Var)).e(), px0Var, 0, 12);
    }

    public static final xf1 J(px0 px0Var) {
        float f2;
        float f3;
        nq6 nq6Var = vt0.a;
        xq2 xq2Var = (xq2) px0Var;
        long i2 = ((ut0) xq2Var.j(nq6Var)).i();
        long c2 = ((ut0) xq2Var.j(nq6Var)).c();
        long c3 = kt0.c(f04.G(px0Var), ((ut0) xq2Var.j(nq6Var)).i());
        long c4 = kt0.c(f04.G(px0Var), ((ut0) xq2Var.j(nq6Var)).i());
        long c5 = kt0.c(f04.G(px0Var), ((ut0) xq2Var.j(nq6Var)).i());
        py0 py0Var = j31.a;
        long c6 = kt0.c(((Number) xq2Var.j(g31.a)).floatValue(), ((kt0) xq2Var.j(py0Var)).a);
        long j2 = ((kt0) xq2Var.j(py0Var)).a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j2);
        } else {
            hv.N(j2);
        }
        long c7 = kt0.c(0.38f, c6);
        long j3 = kt0.g;
        long b2 = ((ut0) xq2Var.j(nq6Var)).b();
        long j4 = ((kt0) xq2Var.j(py0Var)).a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j4);
        } else {
            hv.N(j4);
        }
        long c8 = kt0.c(0.38f, c2);
        long b3 = ((ut0) xq2Var.j(nq6Var)).b();
        long c9 = kt0.c(0.54f, ((ut0) xq2Var.j(nq6Var)).f());
        long j5 = ((kt0) xq2Var.j(py0Var)).a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j5);
        } else {
            hv.N(j5);
        }
        long c10 = kt0.c(0.38f, c9);
        long c11 = kt0.c(0.54f, ((ut0) xq2Var.j(nq6Var)).f());
        long j6 = ((kt0) xq2Var.j(py0Var)).a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j6);
        } else {
            hv.N(j6);
        }
        long c12 = kt0.c(0.38f, c11);
        long b4 = ((ut0) xq2Var.j(nq6Var)).b();
        long f4 = ((ut0) xq2Var.j(nq6Var)).f();
        long j7 = ((kt0) xq2Var.j(py0Var)).a;
        if (!((ut0) xq2Var.j(nq6Var)).k() ? hv.N(j7) < 0.5d : hv.N(j7) > 0.5d) {
            f2 = 0.74f;
        } else {
            f2 = 0.6f;
        }
        long c13 = kt0.c(f2, f4);
        long j8 = ((kt0) xq2Var.j(py0Var)).a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j8);
        } else {
            hv.N(j8);
        }
        long c14 = kt0.c(0.38f, c13);
        long b5 = ((ut0) xq2Var.j(nq6Var)).b();
        long f5 = ((ut0) xq2Var.j(nq6Var)).f();
        long j9 = ((kt0) xq2Var.j(py0Var)).a;
        if (!((ut0) xq2Var.j(nq6Var)).k() ? hv.N(j9) < 0.5d : hv.N(j9) > 0.5d) {
            f3 = 0.74f;
        } else {
            f3 = 0.6f;
        }
        long c15 = kt0.c(f3, f5);
        long j10 = ((kt0) xq2Var.j(py0Var)).a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j10);
        } else {
            hv.N(j10);
        }
        return new xf1(c6, c7, i2, b2, c3, c2, b3, c8, c9, c10, c9, c11, c5, c12, b4, j3, c4, c13, c14, b5, c15, kt0.c(0.38f, c15));
    }

    public static final bd1 K(px0 px0Var) {
        pq4 pq4Var = k90.a;
        return k90.b(((ut0) ((xq2) px0Var).j(vt0.a)).i(), px0Var, 5);
    }

    public static a74 L(a74 a74Var, ae4 ae4Var) {
        return a74Var.d(new de4(ae4Var));
    }

    public static final l61 M(w61 w61Var, l61 l61Var) {
        l61 A2 = A(w61Var.A(), l61Var, true);
        xe1 xe1Var = xk1.a;
        if (A2 != xe1Var && A2.Z(d90.r0) == null) {
            return A2.N(xe1Var);
        }
        return A2;
    }

    public static final a74 N(a74 a74Var, rr6 rr6Var, wc0 wc0Var, k27 k27Var, s51 s51Var) {
        return a74Var.d(new z07(rr6Var, wc0Var, k27Var, s51Var));
    }

    public static final eg7 O(r41 r41Var, l61 l61Var, Object obj) {
        eg7 eg7Var = null;
        if ((r41Var instanceof y61) && l61Var.Z(wj0.R) != null) {
            y61 y61Var = (y61) r41Var;
            while (true) {
                if (!(y61Var instanceof pk1) && (y61Var = y61Var.f()) != null) {
                    if (y61Var instanceof eg7) {
                        eg7Var = (eg7) y61Var;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (eg7Var != null) {
                eg7Var.z0(l61Var, obj);
            }
        }
        return eg7Var;
    }

    public static final Object P(l61 l61Var, Object obj, Object obj2, eo2 eo2Var, r41 r41Var) {
        Object o2;
        Object c2 = k57.c(l61Var, obj2);
        try {
            so6 so6Var = new so6(r41Var, l61Var);
            if (eo2Var == null) {
                o2 = np2.k0(eo2Var, obj, so6Var);
            } else {
                ge7.p(2, eo2Var);
                o2 = eo2Var.o(obj, so6Var);
            }
            k57.a(l61Var, c2);
            if (o2 == x61.COROUTINE_SUSPENDED) {
                r41Var.getClass();
            }
            return o2;
        } catch (Throwable th) {
            k57.a(l61Var, c2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00ff  */
    /* JADX WARN: Type inference failed for: r3v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(on2 on2Var, a74 a74Var, boolean z2, fd1 fd1Var, ke6 ke6Var, c60 c60Var, bd1 bd1Var, lq4 lq4Var, fo2 fo2Var, px0 px0Var, int i2, int i3) {
        int i4;
        x64 x64Var;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        fd1 fd1Var2;
        y16 y16Var;
        int i9;
        c60 c60Var2;
        int i10;
        int i11;
        lq4 lq4Var2;
        int i12;
        int i13;
        boolean z4;
        xq2 xq2Var;
        a74 a74Var2;
        boolean z5;
        fd1 fd1Var3;
        lq4 lq4Var3;
        cf5 t2;
        float f2;
        int i14;
        c60 c60Var3;
        lq4 lq4Var4;
        long j2;
        long j3;
        long j4;
        long j5;
        float f3;
        r94 r94Var;
        ke6 ke6Var2;
        boolean z6;
        fd1 fd1Var4;
        uo uoVar;
        float f4;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1084573925);
        if ((i2 & 6) == 0) {
            if (xq2Var2.h(on2Var)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i4 = i19 | i2;
        } else {
            i4 = i2;
        }
        int i20 = i3 & 2;
        if (i20 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            x64Var = a74Var;
            if (xq2Var2.f(x64Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
            i6 = i3 & 4;
            if (i6 == 0) {
                i4 |= RendererDebugBridge.CAPTURE_HEIGHT;
            } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                z3 = z2;
                if (xq2Var2.g(z3)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i4 |= i7;
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    if (xq2Var2.f(null)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        fd1Var2 = fd1Var;
                        if (xq2Var2.f(fd1Var2)) {
                            i18 = 16384;
                            i4 |= i18;
                        }
                    } else {
                        fd1Var2 = fd1Var;
                    }
                    i18 = 8192;
                    i4 |= i18;
                } else {
                    fd1Var2 = fd1Var;
                }
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        y16Var = ke6Var;
                        if (xq2Var2.f(y16Var)) {
                            i17 = 131072;
                            i4 |= i17;
                        }
                    } else {
                        y16Var = ke6Var;
                    }
                    i17 = 65536;
                    i4 |= i17;
                } else {
                    y16Var = ke6Var;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    c60Var2 = c60Var;
                } else {
                    c60Var2 = c60Var;
                    if ((i2 & 1572864) == 0) {
                        if (xq2Var2.f(c60Var2)) {
                            i10 = 1048576;
                        } else {
                            i10 = 524288;
                        }
                        i4 |= i10;
                    }
                }
                if ((i2 & 12582912) == 0) {
                    if (xq2Var2.f(bd1Var)) {
                        i16 = 8388608;
                    } else {
                        i16 = Compress.MAXWINSIZE;
                    }
                    i4 |= i16;
                }
                i11 = i3 & 256;
                if (i11 != 0) {
                    i4 |= 100663296;
                    lq4Var2 = lq4Var;
                } else {
                    lq4Var2 = lq4Var;
                    if ((i2 & 100663296) == 0) {
                        if (xq2Var2.f(lq4Var2)) {
                            i12 = 67108864;
                        } else {
                            i12 = 33554432;
                        }
                        i4 |= i12;
                    }
                }
                if ((i2 & 805306368) == 0) {
                    if (xq2Var2.h(fo2Var)) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i4 |= i15;
                }
                i13 = i4;
                boolean z7 = true;
                if ((i13 & 306783379) != 306783378) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (xq2Var2.S(i13 & 1, z4)) {
                    xq2Var2.X();
                    int i21 = i2 & 1;
                    vs0 vs0Var = ox0.a;
                    if (i21 != 0 && !xq2Var2.B()) {
                        xq2Var2.V();
                        if ((i3 & 16) != 0) {
                            i14 = i13 & (-57345);
                        } else {
                            i14 = i13;
                        }
                        if ((i3 & 32) != 0) {
                            i14 &= -458753;
                        }
                        c60Var3 = c60Var2;
                        lq4Var4 = lq4Var2;
                        f2 = RecyclerView.B1;
                    } else {
                        if (i20 != 0) {
                            x64Var = x64.a;
                        }
                        if (i6 != 0) {
                            z3 = true;
                        }
                        if ((i3 & 16) != 0) {
                            pq4 pq4Var = k90.a;
                            boolean c2 = xq2Var2.c(2.0f) | xq2Var2.c(8.0f) | xq2Var2.c(RecyclerView.B1) | xq2Var2.c(4.0f) | xq2Var2.c(4.0f);
                            Object P = xq2Var2.P();
                            if (c2 || P == vs0Var) {
                                P = new Object();
                                xq2Var2.l0(P);
                            }
                            f2 = 0.0f;
                            fd1Var2 = P;
                            i14 = i13 & (-57345);
                        } else {
                            f2 = RecyclerView.B1;
                            i14 = i13;
                        }
                        y16Var = y16Var;
                        if ((i3 & 32) != 0) {
                            i14 &= -458753;
                            y16Var = ((ye6) xq2Var2.j(ze6.a)).a;
                        }
                        if (i9 != 0) {
                            c60Var2 = null;
                        }
                        if (i11 != 0) {
                            lq4Var4 = k90.a;
                            c60Var3 = c60Var2;
                        } else {
                            c60Var3 = c60Var2;
                            lq4Var4 = lq4Var2;
                        }
                    }
                    boolean z8 = z3;
                    xq2Var2.q();
                    xq2Var2.b0(497721888);
                    Object P2 = xq2Var2.P();
                    if (P2 == vs0Var) {
                        P2 = i61.f(xq2Var2);
                    }
                    r94 r94Var2 = (r94) P2;
                    xq2Var2.p(false);
                    int i22 = i14 >> 6;
                    bd1Var.getClass();
                    xq2Var2.b0(-2133647540);
                    if (z8) {
                        j2 = bd1Var.b;
                    } else {
                        j2 = bd1Var.d;
                    }
                    qa4 g2 = i61.g(j2, xq2Var2, false);
                    Object P3 = xq2Var2.P();
                    if (P3 == vs0Var) {
                        P3 = new k4(25);
                        xq2Var2.l0(P3);
                    }
                    a74 a2 = ua6.a(x64Var, false, (qn2) P3);
                    xq2Var2.b0(-655254499);
                    if (z8) {
                        j3 = bd1Var.a;
                    } else {
                        j3 = bd1Var.c;
                    }
                    qa4 b0 = np2.b0(new kt0(j3), xq2Var2);
                    xq2Var2.p(false);
                    long j6 = ((kt0) b0.getValue()).a;
                    a74 a74Var3 = x64Var;
                    long c3 = kt0.c(1.0f, ((kt0) g2.getValue()).a);
                    if (fd1Var2 == null) {
                        xq2Var2.b0(498128545);
                        xq2Var2.p(false);
                        r94Var = r94Var2;
                        j4 = c3;
                        j5 = j6;
                        fd1Var4 = fd1Var2;
                        ke6Var2 = y16Var;
                        uoVar = null;
                    } else {
                        xq2Var2.b0(1401541984);
                        xq2Var2.b0(-1588756907);
                        Object P4 = xq2Var2.P();
                        if (P4 == vs0Var) {
                            P4 = new mm6();
                            xq2Var2.l0(P4);
                        }
                        mm6 mm6Var = (mm6) P4;
                        boolean f5 = xq2Var2.f(r94Var2);
                        j4 = c3;
                        Object P5 = xq2Var2.P();
                        if (!f5 && P5 != vs0Var) {
                            j5 = j6;
                        } else {
                            j5 = j6;
                            P5 = new dd1(r94Var2, mm6Var, null, 0);
                            xq2Var2.l0(P5);
                        }
                        i(xq2Var2, (eo2) P5, r94Var2);
                        t93 t93Var = (t93) gt0.R0(mm6Var);
                        if (!z8) {
                            f3 = f2;
                        } else if (t93Var instanceof l25) {
                            f3 = 8.0f;
                        } else if ((t93Var instanceof oy2) || (t93Var instanceof sg2)) {
                            f3 = 4.0f;
                        } else {
                            f3 = 2.0f;
                        }
                        Object P6 = xq2Var2.P();
                        if (P6 == vs0Var) {
                            r94Var = r94Var2;
                            ke6Var2 = y16Var;
                            P6 = new gn(new om1(f3), nw7.g0, null, 12);
                            xq2Var2.l0(P6);
                        } else {
                            r94Var = r94Var2;
                            ke6Var2 = y16Var;
                        }
                        gn gnVar = (gn) P6;
                        om1 om1Var = new om1(f3);
                        boolean h2 = xq2Var2.h(gnVar) | xq2Var2.c(f3);
                        if ((((i22 & 14) ^ 6) > 4 && xq2Var2.g(z8)) || (i22 & 6) == 4) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        boolean z9 = h2 | z6;
                        if ((((i22 & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) <= 256 || !xq2Var2.f(fd1Var2)) && (i22 & RendererDebugBridge.CAPTURE_HEIGHT) != 256) {
                            z7 = false;
                        }
                        boolean h3 = z9 | z7 | xq2Var2.h(t93Var);
                        Object P7 = xq2Var2.P();
                        if (!h3 && P7 != vs0Var) {
                            fd1Var4 = fd1Var2;
                        } else {
                            fd1Var4 = fd1Var2;
                            P7 = new ed1(gnVar, f3, z8, fd1Var4, t93Var, null);
                            xq2Var2.l0(P7);
                        }
                        i(xq2Var2, (eo2) P7, om1Var);
                        uoVar = gnVar.c;
                        xq2Var2.p(false);
                        xq2Var2.p(false);
                    }
                    if (uoVar != null) {
                        f4 = ((om1) uoVar.B.getValue()).A;
                    } else {
                        f4 = f2;
                    }
                    xq2Var = xq2Var2;
                    y16Var = ke6Var2;
                    ej2.d(on2Var, a2, z8, y16Var, j5, j4, c60Var3, f4, r94Var, n16.I(-20345758, new x3(g2, lq4Var4, fo2Var, 5), xq2Var2), xq2Var, (i14 & 14) | 805306368 | (i14 & 896) | (i22 & 7168) | (i14 & 3670016), 0);
                    lq4Var3 = lq4Var4;
                    z5 = z8;
                    c60Var2 = c60Var3;
                    a74Var2 = a74Var3;
                    fd1Var3 = fd1Var4;
                } else {
                    xq2Var = xq2Var2;
                    xq2Var.V();
                    a74Var2 = x64Var;
                    z5 = z3;
                    fd1Var3 = fd1Var2;
                    lq4Var3 = lq4Var2;
                }
                ke6 ke6Var3 = y16Var;
                t2 = xq2Var.t();
                if (t2 != null) {
                    t2.d = new l90(on2Var, a74Var2, z5, fd1Var3, ke6Var3, c60Var2, bd1Var, lq4Var3, fo2Var, i2, i3);
                    return;
                }
                return;
            }
            z3 = z2;
            if ((i3 & 8) != 0) {
            }
            if ((i2 & 24576) == 0) {
            }
            if ((196608 & i2) == 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            if ((i2 & 12582912) == 0) {
            }
            i11 = i3 & 256;
            if (i11 != 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            i13 = i4;
            boolean z72 = true;
            if ((i13 & 306783379) != 306783378) {
            }
            if (xq2Var2.S(i13 & 1, z4)) {
            }
            ke6 ke6Var32 = y16Var;
            t2 = xq2Var.t();
            if (t2 != null) {
            }
        }
        x64Var = a74Var;
        i6 = i3 & 4;
        if (i6 == 0) {
        }
        z3 = z2;
        if ((i3 & 8) != 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        if ((i2 & 12582912) == 0) {
        }
        i11 = i3 & 256;
        if (i11 != 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        i13 = i4;
        boolean z722 = true;
        if ((i13 & 306783379) != 306783378) {
        }
        if (xq2Var2.S(i13 & 1, z4)) {
        }
        ke6 ke6Var322 = y16Var;
        t2 = xq2Var.t();
        if (t2 != null) {
        }
    }

    public static final void b(String str, on2 on2Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        str.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-97185720);
        if (xq2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if ((i2 & 48) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i5 & 1, z2)) {
            nw7.o(on2Var, null, n16.I(865092945, new x3(bl2.F(xq2Var), str, zv0Var, 9), xq2Var), xq2Var, ((i5 >> 3) & 14) | RendererDebugBridge.CAPTURE_HEIGHT, 2);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new rl(str, on2Var, zv0Var, i2, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, boolean z2, boolean z3, on2 on2Var, px0 px0Var, int i2, int i3) {
        int i4;
        boolean z4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        xq2 xq2Var;
        boolean z7;
        boolean z8;
        cf5 t2;
        boolean z9;
        boolean z10;
        long j2;
        int i8;
        str.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1722762420);
        if (xq2Var2.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i9 = i4 | i2;
        int i10 = i3 & 2;
        if (i10 != 0) {
            i6 = i9 | 48;
            z4 = z2;
        } else {
            z4 = z2;
            if (xq2Var2.g(z4)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 = i9 | i5;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i6 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            z5 = z3;
            if (xq2Var2.g(z5)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i6 |= i7;
            if ((i2 & 3072) == 0) {
                if (xq2Var2.h(on2Var)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i6 |= i8;
            }
            if ((i6 & 1171) == 1170) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!xq2Var2.S(i6 & 1, z6)) {
                if (i10 != 0) {
                    z9 = true;
                } else {
                    z9 = z4;
                }
                if (i11 != 0) {
                    z10 = false;
                } else {
                    z10 = z5;
                }
                es7 F = bl2.F(xq2Var2);
                if (!z9) {
                    j2 = kt0.c(0.5f, F.i);
                } else if (z10) {
                    j2 = F.j;
                } else {
                    j2 = F.g;
                }
                long j3 = j2;
                long E2 = hi2.E(15);
                a74 a74Var = x64.a;
                a74 c2 = dj6.c(a74Var, 1.0f);
                if (z9) {
                    a74Var = u(a74Var, false, null, on2Var, 15);
                }
                xq2Var = xq2Var2;
                x37.b(str, ge7.P(c2.d(a74Var), 20.0f, 13.0f), j3, E2, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, (i6 & 14) | 3072, 0, 131056);
                z7 = z9;
                z8 = z10;
            } else {
                xq2Var = xq2Var2;
                xq2Var.V();
                z7 = z4;
                z8 = z5;
            }
            t2 = xq2Var.t();
            if (t2 == null) {
                t2.d = new j01(str, z7, z8, on2Var, i2, i3);
                return;
            }
            return;
        }
        z5 = z3;
        if ((i2 & 3072) == 0) {
        }
        if ((i6 & 1171) == 1170) {
        }
        if (!xq2Var2.S(i6 & 1, z6)) {
        }
        t2 = xq2Var.t();
        if (t2 == null) {
        }
    }

    public static final void d(Object obj, qn2 qn2Var, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        boolean f2 = xq2Var.f(obj);
        Object P = xq2Var.P();
        if (f2 || P == ox0.a) {
            P = new el1(qn2Var);
            xq2Var.l0(P);
        }
        el1 el1Var = (el1) P;
    }

    public static final void e(Object obj, Object obj2, qn2 qn2Var, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        boolean f2 = xq2Var.f(obj) | xq2Var.f(obj2);
        Object P = xq2Var.P();
        if (f2 || P == ox0.a) {
            P = new el1(qn2Var);
            xq2Var.l0(P);
        }
        el1 el1Var = (el1) P;
    }

    public static final void f(Object[] objArr, qn2 qn2Var, px0 px0Var) {
        boolean z2 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z2 |= ((xq2) px0Var).f(obj);
        }
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        if (!z2 && P != ox0.a) {
            return;
        }
        xq2Var.l0(new el1(qn2Var));
    }

    public static final void g(on2 on2Var, a74 a74Var, ke6 ke6Var, long j2, long j3, yd1 yd1Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        ke6 ke6Var2;
        long j4;
        long j5;
        yd1 yd1Var2;
        ke6 y16Var;
        long i5;
        long b2;
        int i6;
        Object obj;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-482679837);
        if (xq2Var.h(on2Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (xq2Var.f(a74Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4 | 599424;
        if ((4793491 & i8) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i8 & 1, z2)) {
            xq2Var.X();
            int i9 = i2 & 1;
            Object obj2 = ox0.a;
            if (i9 != 0 && !xq2Var.B()) {
                xq2Var.V();
                y16Var = ke6Var;
                i5 = j2;
                b2 = j3;
                i6 = i8 & (-4193281);
                obj = yd1Var;
            } else {
                y16 y16Var2 = ((ye6) xq2Var.j(ze6.a)).a;
                qv4 qv4Var = new qv4(50.0f);
                y16Var2.getClass();
                y16Var = new y16(qv4Var, qv4Var, qv4Var, qv4Var);
                i5 = ((ut0) xq2Var.j(vt0.a)).i();
                b2 = vt0.b(i5, xq2Var);
                boolean c2 = xq2Var.c(6.0f) | xq2Var.c(12.0f) | xq2Var.c(8.0f) | xq2Var.c(8.0f);
                Object P = xq2Var.P();
                if (c2 || P == obj2) {
                    P = new Object();
                    xq2Var.l0(P);
                }
                i6 = i8 & (-4193281);
                obj = (yd1) P;
            }
            xq2Var.q();
            xq2Var.b0(36032728);
            Object P2 = xq2Var.P();
            if (P2 == obj2) {
                P2 = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P2;
            xq2Var.p(false);
            Object P3 = xq2Var.P();
            if (P3 == obj2) {
                P3 = new bz1(6);
                xq2Var.l0(P3);
            }
            a74 a2 = ua6.a(a74Var, false, (qn2) P3);
            obj.getClass();
            xq2Var.b0(-478475335);
            boolean f2 = xq2Var.f(r94Var);
            Object P4 = xq2Var.P();
            if (f2 || P4 == obj2) {
                P4 = new ie2();
                xq2Var.l0(P4);
            }
            ie2 ie2Var = (ie2) P4;
            boolean h2 = xq2Var.h(ie2Var) | xq2Var.f(obj);
            Object P5 = xq2Var.P();
            if (h2 || P5 == obj2) {
                P5 = new xd1(ie2Var, obj, null, 0);
                xq2Var.l0(P5);
            }
            i(xq2Var, (eo2) P5, obj);
            boolean f3 = xq2Var.f(r94Var) | xq2Var.h(ie2Var);
            Object P6 = xq2Var.P();
            if (f3 || P6 == obj2) {
                P6 = new b0(r94Var, ie2Var, (r41) null);
                xq2Var.l0(P6);
            }
            i(xq2Var, (eo2) P6, r94Var);
            uo uoVar = ie2Var.a.c;
            xq2Var.p(false);
            long j6 = i5;
            long j7 = b2;
            ke6 ke6Var3 = y16Var;
            ej2.d(on2Var, a2, false, ke6Var3, j6, j7, null, ((om1) uoVar.B.getValue()).A, r94Var, n16.I(-1823447062, new tf(zv0Var, b2, 1), xq2Var), xq2Var, (i6 & 14) | 805306368, 68);
            ke6Var2 = ke6Var3;
            j4 = j6;
            j5 = j7;
            yd1Var2 = obj;
        } else {
            xq2Var.V();
            ke6Var2 = ke6Var;
            j4 = j2;
            j5 = j3;
            yd1Var2 = yd1Var;
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new dc(on2Var, a74Var, ke6Var2, j4, j5, yd1Var2, zv0Var, i2);
        }
    }

    public static final void h(ok4 ok4Var, ic icVar, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        boolean h2;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1090171650);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = xq2Var.f(ok4Var);
            } else {
                h2 = xq2Var.h(ok4Var);
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
            if (xq2Var.f(icVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        boolean z4 = true;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i3 & 1, z2)) {
            if ((i3 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !xq2Var.f(ok4Var))) {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object P = xq2Var.P();
            if (z5 || P == ox0.a) {
                P = new gv2(icVar, ok4Var);
                xq2Var.l0(P);
            }
            ak.a((gv2) P, null, new g05(false, y86.Inherit, false, 0), zv0Var, xq2Var, ((i3 << 3) & 7168) | RendererDebugBridge.CAPTURE_HEIGHT, 2);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new rl(ok4Var, icVar, zv0Var, i2, 0);
        }
    }

    public static final void i(px0 px0Var, eo2 eo2Var, Object obj) {
        l61 l61Var = ((xq2) px0Var).R;
        xq2 xq2Var = (xq2) px0Var;
        boolean f2 = xq2Var.f(obj);
        Object P = xq2Var.P();
        if (f2 || P == ox0.a) {
            P = new ij3(l61Var, eo2Var);
            xq2Var.l0(P);
        }
        ij3 ij3Var = (ij3) P;
    }

    public static final void j(Object obj, Object obj2, eo2 eo2Var, px0 px0Var) {
        l61 l61Var = ((xq2) px0Var).R;
        xq2 xq2Var = (xq2) px0Var;
        boolean f2 = xq2Var.f(obj) | xq2Var.f(obj2);
        Object P = xq2Var.P();
        if (f2 || P == ox0.a) {
            P = new ij3(l61Var, eo2Var);
            xq2Var.l0(P);
        }
        ij3 ij3Var = (ij3) P;
    }

    public static final void k(Object[] objArr, eo2 eo2Var, px0 px0Var) {
        l61 l61Var = ((xq2) px0Var).R;
        boolean z2 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z2 |= ((xq2) px0Var).f(obj);
        }
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        if (!z2 && P != ox0.a) {
            return;
        }
        xq2Var.l0(new ij3(l61Var, eo2Var));
    }

    public static final void l(final ok4 ok4Var, final boolean z2, final jl5 jl5Var, final boolean z3, long j2, final float f2, final a74 a74Var, px0 px0Var, final int i2) {
        int i3;
        boolean z4;
        final long j3;
        int i4;
        long j4;
        final boolean z5;
        b40 b40Var;
        boolean z6;
        boolean z7;
        boolean z8;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h2;
        int i9;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-466280168);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = xq2Var.f(ok4Var);
            } else {
                h2 = xq2Var.h(ok4Var);
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
            if (xq2Var.g(z2)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.d(jl5Var.ordinal())) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.g(z3)) {
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
            if (xq2Var.f(a74Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((533651 & i3) != 533650) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xq2Var.S(i3 & 1, z4)) {
            xq2Var.X();
            if ((i2 & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                i4 = i3 & (-57345);
                j4 = j2;
            } else {
                i4 = i3 & (-57345);
                j4 = 9205357640488583168L;
            }
            xq2Var.q();
            if (z2) {
                fb6 fb6Var = pa6.a;
                if ((jl5Var == jl5.Ltr && !z3) || (jl5Var == jl5.Rtl && z3)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z5 = z8;
            } else {
                fb6 fb6Var2 = pa6.a;
                if ((jl5Var == jl5.Ltr && !z3) || (jl5Var == jl5.Rtl && z3)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
            }
            if (z5) {
                b40Var = hv.b;
            } else {
                b40Var = hv.a;
            }
            int i10 = i4 & 14;
            if (i10 != 4 && ((i4 & 8) == 0 || !xq2Var.h(ok4Var))) {
                z6 = false;
            } else {
                z6 = true;
            }
            if ((i4 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean g2 = z7 | z6 | xq2Var.g(z5);
            Object P = xq2Var.P();
            if (g2 || P == ox0.a) {
                P = new qn2() { // from class: tl
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        fv2 fv2Var;
                        na6 na6Var;
                        boolean z9;
                        gb6 gb6Var = (gb6) obj;
                        long a2 = ok4.this.a();
                        fb6 fb6Var3 = pa6.a;
                        if (z2) {
                            fv2Var = fv2.SelectionStart;
                        } else {
                            fv2Var = fv2.SelectionEnd;
                        }
                        if (z5) {
                            na6Var = na6.Left;
                        } else {
                            na6Var = na6.Right;
                        }
                        na6 na6Var2 = na6Var;
                        if ((9223372034707292159L & a2) != 9205357640488583168L) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        gb6Var.a(fb6Var3, new oa6(fv2Var, a2, na6Var2, z9));
                        return jg7.a;
                    }
                };
                xq2Var.l0(P);
            }
            final a74 a2 = ua6.a(a74Var, false, (qn2) P);
            final fo7 fo7Var = (fo7) xq2Var.j(ky0.t);
            long j5 = j4;
            b40 b40Var2 = b40Var;
            j3 = j5;
            h(ok4Var, b40Var2, n16.I(1365123137, new eo2() { // from class: ul
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    boolean z9;
                    px0 px0Var2 = (px0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    xq2 xq2Var2 = (xq2) px0Var2;
                    if (xq2Var2.S(intValue & 1, z9)) {
                        pq a3 = ky0.t.a(fo7.this);
                        final long j6 = j3;
                        final boolean z10 = z5;
                        final a74 a74Var2 = a2;
                        final ok4 ok4Var2 = ok4Var;
                        hv.d(a3, n16.I(1260045569, new eo2() { // from class: wl
                            @Override // defpackage.eo2
                            public final Object o(Object obj3, Object obj4) {
                                boolean z11;
                                du duVar;
                                px0 px0Var3 = (px0) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if ((intValue2 & 3) != 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                xq2 xq2Var3 = (xq2) px0Var3;
                                if (xq2Var3.S(intValue2 & 1, z11)) {
                                    long j7 = j6;
                                    int i11 = (j7 > 9205357640488583168L ? 1 : (j7 == 9205357640488583168L ? 0 : -1));
                                    boolean z12 = z10;
                                    a74 a74Var3 = a74Var2;
                                    final ok4 ok4Var3 = ok4Var2;
                                    vs0 vs0Var = ox0.a;
                                    if (i11 != 0) {
                                        xq2Var3.b0(3458246);
                                        if (z12) {
                                            duVar = ge7.b;
                                        } else {
                                            duVar = ge7.a;
                                        }
                                        a74 h3 = dj6.h(a74Var3, sm1.b(j7), sm1.a(j7), RecyclerView.B1, RecyclerView.B1, 12);
                                        l26 a4 = k26.a(duVar, d90.h0, xq2Var3, 0);
                                        int hashCode = Long.hashCode(xq2Var3.T);
                                        xv4 l2 = xq2Var3.l();
                                        a74 E2 = l.E(xq2Var3, h3);
                                        jx0.i.getClass();
                                        iy0 iy0Var = ix0.b;
                                        xq2Var3.f0();
                                        if (xq2Var3.S) {
                                            xq2Var3.k(iy0Var);
                                        } else {
                                            xq2Var3.o0();
                                        }
                                        yh2.K(xq2Var3, ix0.f, a4);
                                        yh2.K(xq2Var3, ix0.e, l2);
                                        yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode));
                                        yh2.F(xq2Var3, ix0.h);
                                        yh2.K(xq2Var3, ix0.d, E2);
                                        boolean h4 = xq2Var3.h(ok4Var3);
                                        Object P2 = xq2Var3.P();
                                        if (h4 || P2 == vs0Var) {
                                            P2 = new on2() { // from class: xl
                                                @Override // defpackage.on2
                                                public final Object c() {
                                                    int i12 = r2;
                                                    boolean z13 = false;
                                                    ok4 ok4Var4 = ok4Var3;
                                                    switch (i12) {
                                                        case 0:
                                                            if ((9223372034707292159L & ok4Var4.a()) != 9205357640488583168L) {
                                                                z13 = true;
                                                            }
                                                            return Boolean.valueOf(z13);
                                                        default:
                                                            if ((9223372034707292159L & ok4Var4.a()) != 9205357640488583168L) {
                                                                z13 = true;
                                                            }
                                                            return Boolean.valueOf(z13);
                                                    }
                                                }
                                            };
                                            xq2Var3.l0(P2);
                                        }
                                        mb3.m(x64.a, (on2) P2, z12, xq2Var3, 6);
                                        xq2Var3.p(true);
                                        xq2Var3.p(false);
                                    } else {
                                        xq2Var3.b0(4389176);
                                        boolean h5 = xq2Var3.h(ok4Var3);
                                        Object P3 = xq2Var3.P();
                                        if (h5 || P3 == vs0Var) {
                                            P3 = new on2() { // from class: xl
                                                @Override // defpackage.on2
                                                public final Object c() {
                                                    int i12 = r2;
                                                    boolean z13 = false;
                                                    ok4 ok4Var4 = ok4Var3;
                                                    switch (i12) {
                                                        case 0:
                                                            if ((9223372034707292159L & ok4Var4.a()) != 9205357640488583168L) {
                                                                z13 = true;
                                                            }
                                                            return Boolean.valueOf(z13);
                                                        default:
                                                            if ((9223372034707292159L & ok4Var4.a()) != 9205357640488583168L) {
                                                                z13 = true;
                                                            }
                                                            return Boolean.valueOf(z13);
                                                    }
                                                }
                                            };
                                            xq2Var3.l0(P3);
                                        }
                                        mb3.m(a74Var3, (on2) P3, z12, xq2Var3, 0);
                                        xq2Var3.p(false);
                                    }
                                } else {
                                    xq2Var3.V();
                                }
                                return jg7.a;
                            }
                        }, xq2Var2), xq2Var2, 56);
                    } else {
                        xq2Var2.V();
                    }
                    return jg7.a;
                }
            }, xq2Var), xq2Var, i10 | RendererDebugBridge.CAPTURE_HEIGHT);
        } else {
            xq2Var.V();
            j3 = j2;
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            final long j6 = j3;
            t2.d = new eo2() { // from class: vl
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mb3.l(ok4.this, z2, jl5Var, z3, j6, f2, a74Var, (px0) obj, ii2.a0(i2 | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static final void m(a74 a74Var, on2 on2Var, boolean z2, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2111672474);
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
        if (xq2Var.h(on2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i3 | i4;
        if (xq2Var.g(z2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq2Var.S(i8 & 1, z3)) {
            fb6 fb6Var = pa6.a;
            gi2.h(xq2Var, l.p(dj6.j(a74Var, 25.0f, 25.0f), new zl(on2Var, z2)));
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new yl(a74Var, on2Var, z2, i2);
        }
    }

    public static final void n(on2 on2Var, px0 px0Var) {
        co4 co4Var = ((xq2) px0Var).M.b.m;
        co4Var.h0(qn4.d);
        bl2.P(co4Var, 0, on2Var);
    }

    public static final void o(on2 on2Var, a74 a74Var, boolean z2, bd1 bd1Var, fo2 fo2Var, px0 px0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            a74Var = x64.a;
        }
        a74 a74Var2 = a74Var;
        if ((i3 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        y16 y16Var = ((ye6) ((xq2) px0Var).j(ze6.a)).a;
        if ((i3 & 128) != 0) {
            bd1Var = k90.b(0L, px0Var, 7);
        }
        a(on2Var, a74Var2, z3, null, y16Var, null, bd1Var, k90.e, fo2Var, px0Var, i2 & 2147483646, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(on2 on2Var, eo2 eo2Var, s41 s41Var) {
        tc tcVar;
        int i2;
        if (s41Var instanceof tc) {
            tc tcVar2 = (tc) s41Var;
            int i3 = tcVar2.X;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tcVar2.X = i3 - Integer.MIN_VALUE;
                tcVar = tcVar2;
                Object obj = tcVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = tcVar.X;
                if (i2 == 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    b0 b0Var = new b0(on2Var, eo2Var, null, 3);
                    tcVar.X = 1;
                    if (g04.C(b0Var, tcVar) == x61Var) {
                        return x61Var;
                    }
                }
                return jg7.a;
            }
        }
        tcVar = new s41(s41Var);
        Object obj2 = tcVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = tcVar.X;
        if (i2 == 0) {
        }
        return jg7.a;
    }

    public static void q(Throwable th, Throwable th2) {
        boolean z2;
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = gc3.a;
            if (num != null && num.intValue() < 19) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                th.addSuppressed(th2);
                return;
            }
            Method method = mx4.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final Object r(dd ddVar, Object obj, float f2, hw6 hw6Var) {
        Object b2 = ddVar.b(obj, xa4.Default, new sc(ddVar, f2, null), hw6Var);
        if (b2 == x61.COROUTINE_SUSPENDED) {
            return b2;
        }
        return jg7.a;
    }

    public static final void s(long j2, lo4 lo4Var) {
        if (lo4Var == lo4.Vertical) {
            if (q21.g(j2) == Integer.MAX_VALUE) {
                s53.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (q21.h(j2) != Integer.MAX_VALUE) {
        } else {
            s53.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static a74 t(a74 a74Var, r94 r94Var, kq5 kq5Var, boolean z2, mq5 mq5Var, on2 on2Var, int i2) {
        a74 p2;
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            mq5Var = null;
        }
        mq5 mq5Var2 = mq5Var;
        if (kq5Var != null) {
            p2 = new mr0(r94Var, kq5Var, false, z3, null, mq5Var2, on2Var);
        } else if (kq5Var == null) {
            p2 = new mr0(r94Var, null, false, z3, null, mq5Var2, on2Var);
        } else {
            x64 x64Var = x64.a;
            if (r94Var != null) {
                p2 = k43.a(x64Var, r94Var, kq5Var).d(new mr0(r94Var, null, false, z3, null, mq5Var2, on2Var));
            } else {
                p2 = l.p(x64Var, new nr0(kq5Var, z3, mq5Var2, on2Var));
            }
        }
        return a74Var.d(p2);
    }

    public static a74 u(a74 a74Var, boolean z2, String str, on2 on2Var, int i2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 2) != 0) {
            str = null;
        }
        return a74Var.d(new mr0(null, null, true, z3, str, null, on2Var));
    }

    public static a74 v(a74 a74Var, r94 r94Var, boolean z2, on2 on2Var, on2 on2Var2, int i2) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 64) != 0) {
            on2Var = null;
        }
        return a74Var.d(new du0(on2Var2, on2Var, r94Var, z2));
    }

    public static final w61 w(px0 px0Var) {
        return new ej5(((xq2) px0Var).R);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1 <= r6.getHeight()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zh x(oa0 oa0Var, float f2) {
        int ceil = ((int) Math.ceil(f2)) * 2;
        zh zhVar = nj2.a;
        wd wdVar = nj2.b;
        zj0 zj0Var = nj2.c;
        if (zhVar != null && wdVar != null) {
            Bitmap bitmap = zhVar.a;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        zhVar = uj2.d(ceil, ceil, 1, 24);
        nj2.a = zhVar;
        wdVar = ge7.c(zhVar);
        nj2.b = wdVar;
        zh zhVar2 = zhVar;
        wd wdVar2 = wdVar;
        if (zj0Var == null) {
            zj0Var = new zj0();
            nj2.c = zj0Var;
        }
        zj0 zj0Var2 = zj0Var;
        yj0 yj0Var = zj0Var2.A;
        kk3 layoutDirection = oa0Var.A.getLayoutDirection();
        Bitmap bitmap2 = zhVar2.a;
        long floatToRawIntBits = (Float.floatToRawIntBits(bitmap2.getWidth()) << 32) | (Float.floatToRawIntBits(bitmap2.getHeight()) & 4294967295L);
        qh1 qh1Var = yj0Var.a;
        kk3 kk3Var = yj0Var.b;
        xj0 xj0Var = yj0Var.c;
        long j2 = yj0Var.d;
        yj0Var.a = oa0Var;
        yj0Var.b = layoutDirection;
        yj0Var.c = wdVar2;
        yj0Var.d = floatToRawIntBits;
        wdVar2.h();
        no1.F(zj0Var2, kt0.b, 0L, zj0Var2.e(), RecyclerView.B1, null, 58);
        no1.F(zj0Var2, hv.c(4278190080L), 0L, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), RecyclerView.B1, null, 120);
        no1.j0(zj0Var2, hv.c(4278190080L), f2, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), null, 120);
        wdVar2.p();
        yj0Var.a = qh1Var;
        yj0Var.b = kk3Var;
        yj0Var.c = xj0Var;
        yj0Var.d = j2;
        return zhVar2;
    }

    public static boolean y(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File file2 : listFiles) {
                if (y(file2) && z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static final ArrayList z(List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fh1 fh1Var = (fh1) it.next();
            if (fh1Var.b) {
                obj = null;
            } else {
                obj = fh1Var.a;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
