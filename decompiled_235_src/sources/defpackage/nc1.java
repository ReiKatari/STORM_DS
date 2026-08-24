package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.BufferUnderflowException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc1  reason: default package */
/* loaded from: classes.dex */
public abstract class nc1 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final zv0 e = new zv0(636288403, false, new fw0(0));
    public static final zv0 f = new zv0(-1357803046, false, new fw0(1));
    public static final zv0 g = new zv0(-1216856915, false, new lw0(7, (byte) 0));
    public static final gg3[] h = new gg3[0];
    public static final Object i = new Object();
    public static final Object j = new Object();
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static final Object m = new Object();
    public static final rk7 n = new rk7(7);
    public static final rk7 o = new rk7(8);
    public static final rk7 p = new rk7(9);
    public static final rk7 q = new rk7(10);
    public static final rk7 r = new rk7(11);
    public static e33 s;

    public static final z64 A(ua4 ua4Var) {
        int i2;
        if (ua4Var != null && (i2 = ua4Var.L) != 0) {
            return (z64) ua4Var.l(i2 - 1);
        }
        return null;
    }

    public static nt0 B(nt0 nt0Var) {
        ys7 ys7Var = jw2.r;
        if (q60.A(nt0Var.b, 12884901888L)) {
            cq5 cq5Var = (cq5) nt0Var;
            ys7 ys7Var2 = cq5Var.d;
            if (!H(ys7Var2, ys7Var)) {
                return new cq5(cq5Var.a, cq5Var.h, ys7Var, X(G(t9.c.b, ys7Var2.a(), ys7Var.a()), cq5Var.i), cq5Var.k, cq5Var.n, cq5Var.e, cq5Var.f, cq5Var.g, -1);
            }
        }
        return nt0Var;
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
    */
    public static void C(m21 m21Var, jv3 jv3Var, ArrayList arrayList, int i2) {
        int i3;
        jl0[] jl0VarArr;
        int i4;
        int i5;
        h11[] h11VarArr;
        float f2;
        boolean z;
        float f3;
        boolean z2;
        boolean z3;
        boolean z4;
        l21 l21Var;
        boolean z5;
        boolean z6;
        int i6;
        ArrayList arrayList2;
        l21 l21Var2;
        int i7;
        boolean z7;
        l21 l21Var3;
        l21 l21Var4;
        jv3 jv3Var2;
        h11 h11Var;
        h11 h11Var2;
        h11 h11Var3;
        l21 l21Var5;
        en6 en6Var;
        h11 h11Var4;
        en6 en6Var2;
        int i8;
        l21 l21Var6;
        boolean z8;
        int i9;
        en6 en6Var3;
        h11[] h11VarArr2;
        h11 h11Var5;
        h11 h11Var6;
        en6 en6Var4;
        en6 en6Var5;
        l21 l21Var7;
        l21 l21Var8;
        int i10;
        int i11;
        h11 h11Var7;
        h11[] h11VarArr3;
        int i12;
        h11 h11Var8;
        h11 h11Var9;
        en6 en6Var6;
        h11 h11Var10;
        en6 en6Var7;
        en6 en6Var8;
        en6 en6Var9;
        float f4;
        int size;
        int i13;
        ArrayList arrayList3;
        int i14;
        l21 l21Var9;
        float f5;
        float f6;
        int i15;
        float f7;
        int i16;
        boolean z9;
        int i17;
        l21 l21Var10;
        int i18;
        int i19;
        boolean z10;
        boolean z11;
        int i20;
        int i21;
        h11[] h11VarArr4;
        h11 h11Var11;
        l21 l21Var11;
        float f8;
        m21 m21Var2 = m21Var;
        jv3 jv3Var3 = jv3Var;
        ArrayList arrayList4 = arrayList;
        if (i2 == 0) {
            i3 = m21Var2.C0;
            jl0VarArr = m21Var2.F0;
            i4 = 0;
        } else {
            i3 = m21Var2.D0;
            jl0VarArr = m21Var2.E0;
            i4 = 2;
        }
        int i22 = i3;
        jl0[] jl0VarArr2 = jl0VarArr;
        int i23 = 0;
        while (i23 < i22) {
            jl0 jl0Var = jl0VarArr2[i23];
            boolean z12 = jl0Var.q;
            l21 l21Var12 = jl0Var.a;
            h11[] h11VarArr5 = l21Var12.Q;
            en6 en6Var10 = null;
            int i24 = 8;
            if (!z12) {
                int i25 = jl0Var.l;
                int i26 = i25 * 2;
                l21 l21Var13 = l21Var12;
                l21 l21Var14 = l21Var13;
                boolean z13 = false;
                f2 = RecyclerView.B1;
                while (!z13) {
                    jl0Var.i++;
                    l21[] l21VarArr = l21Var13.o0;
                    h11[] h11VarArr6 = l21Var13.Q;
                    l21VarArr[i25] = null;
                    l21Var13.n0[i25] = null;
                    if (l21Var13.h0 != i24) {
                        l21Var13.k(i25);
                        k21 k21Var = k21.MATCH_CONSTRAINT;
                        h11VarArr6[i26].e();
                        int i27 = i26 + 1;
                        h11VarArr6[i27].e();
                        h11VarArr6[i26].e();
                        h11VarArr6[i27].e();
                        if (jl0Var.b == null) {
                            jl0Var.b = l21Var13;
                        }
                        jl0Var.d = l21Var13;
                        k21 k21Var2 = l21Var13.T[i25];
                        if (k21Var2 == k21Var) {
                            i20 = i23;
                            int i28 = l21Var13.t[i25];
                            i21 = i25;
                            if (i28 != 0 && i28 != 3 && i28 != 2) {
                                h11VarArr4 = h11VarArr5;
                            } else {
                                jl0Var.j++;
                                float f9 = l21Var13.m0[i21];
                                if (f9 > RecyclerView.B1) {
                                    f8 = f9;
                                    jl0Var.k += f8;
                                } else {
                                    f8 = f9;
                                }
                                h11VarArr4 = h11VarArr5;
                                if (l21Var13.h0 != 8 && k21Var2 == k21Var && (i28 == 0 || i28 == 3)) {
                                    if (f8 < RecyclerView.B1) {
                                        jl0Var.n = true;
                                    } else {
                                        jl0Var.o = true;
                                    }
                                    if (jl0Var.h == null) {
                                        jl0Var.h = new ArrayList();
                                    }
                                    jl0Var.h.add(l21Var13);
                                }
                                if (jl0Var.f == null) {
                                    jl0Var.f = l21Var13;
                                }
                                l21 l21Var15 = jl0Var.g;
                                if (l21Var15 != null) {
                                    l21Var15.n0[i21] = l21Var13;
                                }
                                jl0Var.g = l21Var13;
                            }
                            if (i21 == 0) {
                                if (l21Var13.r == 0 && l21Var13.u == 0) {
                                    int i29 = l21Var13.v;
                                }
                            } else if (l21Var13.s == 0 && l21Var13.x == 0) {
                                int i30 = l21Var13.y;
                            }
                            if (l21Var14 != l21Var13) {
                                l21Var14.o0[i21] = l21Var13;
                            }
                            h11Var11 = h11VarArr6[i26 + 1].f;
                            if (h11Var11 != null) {
                                l21Var11 = h11Var11.d;
                                h11 h11Var12 = l21Var11.Q[i26].f;
                                if (h11Var12 != null) {
                                }
                            }
                            l21Var11 = null;
                            if (l21Var11 != null) {
                                l21Var11 = l21Var13;
                                z13 = true;
                            }
                            l21Var14 = l21Var13;
                            i25 = i21;
                            h11VarArr5 = h11VarArr4;
                            i24 = 8;
                            l21Var13 = l21Var11;
                            i23 = i20;
                        }
                    }
                    i20 = i23;
                    i21 = i25;
                    h11VarArr4 = h11VarArr5;
                    if (l21Var14 != l21Var13) {
                    }
                    h11Var11 = h11VarArr6[i26 + 1].f;
                    if (h11Var11 != null) {
                    }
                    l21Var11 = null;
                    if (l21Var11 != null) {
                    }
                    l21Var14 = l21Var13;
                    i25 = i21;
                    h11VarArr5 = h11VarArr4;
                    i24 = 8;
                    l21Var13 = l21Var11;
                    i23 = i20;
                }
                i5 = i23;
                int i31 = i25;
                h11VarArr = h11VarArr5;
                l21 l21Var16 = jl0Var.b;
                if (l21Var16 != null) {
                    l21Var16.Q[i26].e();
                }
                l21 l21Var17 = jl0Var.d;
                if (l21Var17 != null) {
                    l21Var17.Q[i26 + 1].e();
                }
                jl0Var.c = l21Var13;
                if (i31 == 0 && jl0Var.m) {
                    jl0Var.e = l21Var13;
                } else {
                    jl0Var.e = l21Var12;
                }
                if (jl0Var.o && jl0Var.n) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                jl0Var.p = z11;
            } else {
                i5 = i23;
                h11VarArr = h11VarArr5;
                f2 = RecyclerView.B1;
            }
            jl0Var.q = true;
            if (arrayList4 != null && !arrayList4.contains(l21Var12)) {
                i6 = i22;
            } else {
                l21 l21Var18 = jl0Var.c;
                l21 l21Var19 = jl0Var.b;
                l21 l21Var20 = jl0Var.d;
                l21 l21Var21 = jl0Var.e;
                float f10 = jl0Var.k;
                k21[] k21VarArr = m21Var2.T;
                h11[] h11VarArr7 = m21Var2.Q;
                if (k21VarArr[i2] == k21.WRAP_CONTENT) {
                    z = true;
                } else {
                    z = false;
                }
                if (i2 == 0) {
                    int i32 = l21Var21.k0;
                    if (i32 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f3 = f10;
                    if (i32 == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i32 == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    l21Var = l21Var12;
                    z5 = z;
                    z6 = z10;
                } else {
                    f3 = f10;
                    int i33 = l21Var21.l0;
                    if (i33 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i33 == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i33 == 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    l21Var = l21Var12;
                    z5 = z;
                    z6 = z2;
                }
                boolean z14 = false;
                while (!z14) {
                    h11[] h11VarArr8 = l21Var.Q;
                    h11 h11Var13 = h11VarArr8[i4];
                    if (z4) {
                        i16 = 1;
                    } else {
                        i16 = 4;
                    }
                    int e2 = h11Var13.e();
                    h11[] h11VarArr9 = h11VarArr7;
                    k21 k21Var3 = l21Var.T[i2];
                    boolean z15 = z4;
                    k21 k21Var4 = k21.MATCH_CONSTRAINT;
                    if (k21Var3 == k21Var4 && l21Var.t[i2] == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    h11 h11Var14 = h11Var13.f;
                    if (h11Var14 != null && l21Var != l21Var12) {
                        e2 = h11Var14.e() + e2;
                    }
                    int i34 = e2;
                    if (z15 && l21Var != l21Var12 && l21Var != l21Var19) {
                        i16 = 8;
                    }
                    l21 l21Var22 = l21Var12;
                    h11 h11Var15 = h11Var13.f;
                    if (h11Var15 != null) {
                        en6 en6Var11 = h11Var13.i;
                        en6 en6Var12 = h11Var15.i;
                        if (l21Var == l21Var19) {
                            i17 = i22;
                            jv3Var3.f(en6Var11, en6Var12, i34, 6);
                        } else {
                            i17 = i22;
                            jv3Var3.f(en6Var11, en6Var12, i34, 8);
                        }
                        if (z9 && !z15) {
                            i16 = 5;
                        }
                        if (l21Var == l21Var19 && z15 && l21Var.S[i2]) {
                            i19 = 5;
                        } else {
                            i19 = i16;
                        }
                        jv3Var3.e(h11Var13.i, h11Var13.f.i, i34, i19);
                    } else {
                        i17 = i22;
                    }
                    if (z5) {
                        if (l21Var.h0 != 8 && l21Var.T[i2] == k21Var4) {
                            i18 = 0;
                            jv3Var3.f(h11VarArr8[i4 + 1].i, h11VarArr8[i4].i, 0, 5);
                        } else {
                            i18 = 0;
                        }
                        jv3Var3.f(h11VarArr8[i4].i, h11VarArr9[i4].i, i18, 8);
                    }
                    h11 h11Var16 = h11VarArr8[i4 + 1].f;
                    if (h11Var16 != null) {
                        l21Var10 = h11Var16.d;
                        h11 h11Var17 = l21Var10.Q[i4].f;
                        if (h11Var17 != null) {
                        }
                    }
                    l21Var10 = null;
                    if (l21Var10 != null) {
                        l21Var = l21Var10;
                    } else {
                        z14 = true;
                    }
                    l21Var12 = l21Var22;
                    h11VarArr7 = h11VarArr9;
                    z4 = z15;
                    i22 = i17;
                }
                h11[] h11VarArr10 = h11VarArr7;
                boolean z16 = z4;
                i6 = i22;
                if (l21Var20 != null) {
                    int i35 = i4 + 1;
                    if (l21Var18.Q[i35].f != null) {
                        h11 h11Var18 = l21Var20.Q[i35];
                        if (l21Var20.T[i2] == k21.MATCH_CONSTRAINT && l21Var20.t[i2] == 0 && !z16) {
                            h11 h11Var19 = h11Var18.f;
                            if (h11Var19.d == m21Var2) {
                                jv3Var3.e(h11Var18.i, h11Var19.i, -h11Var18.e(), 5);
                                jv3Var3.g(h11Var18.i, l21Var18.Q[i35].f.i, -h11Var18.e(), 6);
                                if (z5) {
                                    int i36 = i4 + 1;
                                    en6 en6Var13 = h11VarArr10[i36].i;
                                    h11 h11Var20 = l21Var18.Q[i36];
                                    jv3Var3.f(en6Var13, h11Var20.i, h11Var20.e(), 8);
                                }
                                arrayList2 = jl0Var.h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    if (jl0Var.n && !jl0Var.p) {
                                        f3 = jl0Var.j;
                                    }
                                    l21 l21Var23 = null;
                                    float f11 = f2;
                                    i13 = 0;
                                    while (i13 < size) {
                                        l21 l21Var24 = (l21) arrayList2.get(i13);
                                        float[] fArr = l21Var24.m0;
                                        h11[] h11VarArr11 = l21Var24.Q;
                                        float f12 = fArr[i2];
                                        if (f12 < f2) {
                                            if (jl0Var.p) {
                                                arrayList3 = arrayList2;
                                                jv3Var3.e(h11VarArr11[i4 + 1].i, h11VarArr11[i4].i, 0, 4);
                                                f7 = f11;
                                                i14 = size;
                                                f6 = f2;
                                                f11 = f7;
                                                i15 = i13;
                                                i13 = i15 + 1;
                                                arrayList2 = arrayList3;
                                                size = i14;
                                                f2 = f6;
                                            } else {
                                                f12 = 1.0f;
                                            }
                                        }
                                        arrayList3 = arrayList2;
                                        int i37 = (f12 > f2 ? 1 : (f12 == f2 ? 0 : -1));
                                        if (i37 == 0) {
                                            f7 = f11;
                                            jv3Var3.e(h11VarArr11[i4 + 1].i, h11VarArr11[i4].i, 0, 8);
                                            i14 = size;
                                            f6 = f2;
                                            f11 = f7;
                                            i15 = i13;
                                            i13 = i15 + 1;
                                            arrayList2 = arrayList3;
                                            size = i14;
                                            f2 = f6;
                                        } else {
                                            float f13 = f11;
                                            if (l21Var23 != null) {
                                                h11[] h11VarArr12 = l21Var23.Q;
                                                en6 en6Var14 = h11VarArr12[i4].i;
                                                int i38 = i4 + 1;
                                                en6 en6Var15 = h11VarArr12[i38].i;
                                                en6 en6Var16 = h11VarArr11[i4].i;
                                                en6 en6Var17 = h11VarArr11[i38].i;
                                                i14 = size;
                                                yu l2 = jv3Var3.l();
                                                l21Var9 = l21Var24;
                                                float f14 = f2;
                                                l2.b = f14;
                                                f6 = f14;
                                                if (f3 == f14 || f13 == f12) {
                                                    i15 = i13;
                                                    f5 = f12;
                                                    l2.d.g(en6Var14, 1.0f);
                                                    l2.d.g(en6Var15, -1.0f);
                                                    l2.d.g(en6Var17, 1.0f);
                                                    l2.d.g(en6Var16, -1.0f);
                                                } else {
                                                    int i39 = (f13 > f6 ? 1 : (f13 == f6 ? 0 : -1));
                                                    qu quVar = l2.d;
                                                    if (i39 == 0) {
                                                        i15 = i13;
                                                        quVar.g(en6Var14, 1.0f);
                                                        l2.d.g(en6Var15, -1.0f);
                                                        f5 = f12;
                                                    } else {
                                                        i15 = i13;
                                                        f5 = f12;
                                                        if (i37 == 0) {
                                                            quVar.g(en6Var16, 1.0f);
                                                            l2.d.g(en6Var17, -1.0f);
                                                        } else {
                                                            float f15 = (f13 / f3) / (f5 / f3);
                                                            quVar.g(en6Var14, 1.0f);
                                                            l2.d.g(en6Var15, -1.0f);
                                                            l2.d.g(en6Var17, f15);
                                                            l2.d.g(en6Var16, -f15);
                                                        }
                                                    }
                                                }
                                                jv3Var3.c(l2);
                                            } else {
                                                i14 = size;
                                                l21Var9 = l21Var24;
                                                f5 = f12;
                                                f6 = f2;
                                                i15 = i13;
                                            }
                                            l21Var23 = l21Var9;
                                            f11 = f5;
                                            i13 = i15 + 1;
                                            arrayList2 = arrayList3;
                                            size = i14;
                                            f2 = f6;
                                        }
                                    }
                                }
                                if (l21Var19 != null || (l21Var19 != l21Var20 && !z16)) {
                                    l21Var2 = l21Var20;
                                    if (!z6 && l21Var19 != null) {
                                        int i40 = jl0Var.j;
                                        if (i40 > 0 && jl0Var.i == i40) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        l21 l21Var25 = l21Var19;
                                        l21 l21Var26 = l21Var25;
                                        while (true) {
                                            h11[] h11VarArr13 = l21Var26.Q;
                                            if (l21Var25 == null) {
                                                break;
                                            }
                                            h11[] h11VarArr14 = l21Var25.Q;
                                            l21 l21Var27 = l21Var25.o0[i2];
                                            while (true) {
                                                if (l21Var27 != null) {
                                                    i9 = 8;
                                                    if (l21Var27.h0 != 8) {
                                                        break;
                                                    }
                                                    l21Var27 = l21Var27.o0[i2];
                                                } else {
                                                    i9 = 8;
                                                    break;
                                                }
                                            }
                                            if (l21Var27 == null && l21Var25 != l21Var2) {
                                                l21Var7 = l21Var27;
                                                l21Var8 = l21Var26;
                                                i10 = i9;
                                            } else {
                                                h11 h11Var21 = h11VarArr14[i4];
                                                en6 en6Var18 = h11Var21.i;
                                                h11 h11Var22 = h11Var21.f;
                                                if (h11Var22 != null) {
                                                    en6Var3 = h11Var22.i;
                                                } else {
                                                    en6Var3 = null;
                                                }
                                                if (l21Var26 != l21Var25) {
                                                    en6Var3 = h11VarArr13[i4 + 1].i;
                                                } else if (l21Var25 == l21Var19) {
                                                    h11 h11Var23 = h11VarArr[i4].f;
                                                    if (h11Var23 != null) {
                                                        en6Var3 = h11Var23.i;
                                                    } else {
                                                        en6Var3 = null;
                                                    }
                                                }
                                                int e3 = h11Var21.e();
                                                int i41 = i4 + 1;
                                                int e4 = h11VarArr14[i41].e();
                                                if (l21Var27 != null) {
                                                    h11Var5 = l21Var27.Q[i4];
                                                    h11VarArr2 = h11VarArr13;
                                                    en6Var5 = h11Var5.i;
                                                } else {
                                                    h11VarArr2 = h11VarArr13;
                                                    h11Var5 = l21Var18.Q[i41].f;
                                                    if (h11Var5 != null) {
                                                        en6Var5 = h11Var5.i;
                                                    } else {
                                                        h11Var6 = h11Var5;
                                                        en6Var4 = null;
                                                        en6 en6Var19 = h11VarArr14[i41].i;
                                                        if (h11Var6 != null) {
                                                            e4 += h11Var6.e();
                                                        }
                                                        int e5 = h11VarArr2[i41].e() + e3;
                                                        if (en6Var18 == null && en6Var3 != null && en6Var4 != null && en6Var19 != null) {
                                                            if (l21Var25 == l21Var19) {
                                                                e5 = l21Var19.Q[i4].e();
                                                            }
                                                            int i42 = e5;
                                                            if (l21Var25 == l21Var2) {
                                                                e4 = l21Var2.Q[i41].e();
                                                            }
                                                            int i43 = e4;
                                                            if (z8) {
                                                                i11 = 8;
                                                            } else {
                                                                i11 = 5;
                                                            }
                                                            l21Var7 = l21Var27;
                                                            l21Var8 = l21Var26;
                                                            i10 = 8;
                                                            jv3Var.b(en6Var18, en6Var3, i42, 0.5f, en6Var4, en6Var19, i43, i11);
                                                        } else {
                                                            l21Var7 = l21Var27;
                                                            l21Var8 = l21Var26;
                                                            i10 = 8;
                                                        }
                                                    }
                                                }
                                                h11 h11Var24 = h11Var5;
                                                en6Var4 = en6Var5;
                                                h11Var6 = h11Var24;
                                                en6 en6Var192 = h11VarArr14[i41].i;
                                                if (h11Var6 != null) {
                                                }
                                                int e52 = h11VarArr2[i41].e() + e3;
                                                if (en6Var18 == null) {
                                                }
                                                l21Var7 = l21Var27;
                                                l21Var8 = l21Var26;
                                                i10 = 8;
                                            }
                                            if (l21Var25.h0 != i10) {
                                                l21Var8 = l21Var25;
                                            }
                                            l21Var25 = l21Var7;
                                            l21Var26 = l21Var8;
                                        }
                                    } else {
                                        int i44 = 8;
                                        if (z3 && l21Var19 != null) {
                                            i7 = jl0Var.j;
                                            if (i7 <= 0 && jl0Var.i == i7) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            l21Var3 = l21Var19;
                                            l21Var4 = l21Var3;
                                            while (true) {
                                                h11[] h11VarArr15 = l21Var3.Q;
                                                if (l21Var4 != null) {
                                                    break;
                                                }
                                                h11[] h11VarArr16 = l21Var4.Q;
                                                l21 l21Var28 = l21Var4.o0[i2];
                                                while (l21Var28 != null && l21Var28.h0 == i44) {
                                                    l21Var28 = l21Var28.o0[i2];
                                                }
                                                if (l21Var4 != l21Var19 && l21Var4 != l21Var2 && l21Var28 != null) {
                                                    if (l21Var28 == l21Var2) {
                                                        l21Var28 = null;
                                                    }
                                                    h11 h11Var25 = h11VarArr16[i4];
                                                    en6 en6Var20 = h11Var25.i;
                                                    int i45 = i4 + 1;
                                                    en6 en6Var21 = h11VarArr15[i45].i;
                                                    int e6 = h11Var25.e();
                                                    int e7 = h11VarArr16[i45].e();
                                                    if (l21Var28 != null) {
                                                        h11Var4 = l21Var28.Q[i4];
                                                        en6Var = h11Var4.i;
                                                        l21Var5 = l21Var3;
                                                        h11 h11Var26 = h11Var4.f;
                                                        if (h11Var26 != null) {
                                                            en6Var2 = h11Var26.i;
                                                        } else {
                                                            en6Var2 = null;
                                                        }
                                                    } else {
                                                        l21Var5 = l21Var3;
                                                        h11 h11Var27 = l21Var2.Q[i4];
                                                        if (h11Var27 != null) {
                                                            en6Var = h11Var27.i;
                                                        } else {
                                                            en6Var = null;
                                                        }
                                                        en6 en6Var22 = h11VarArr16[i45].i;
                                                        h11Var4 = h11Var27;
                                                        en6Var2 = en6Var22;
                                                    }
                                                    if (h11Var4 != null) {
                                                        e7 += h11Var4.e();
                                                    }
                                                    int e8 = h11VarArr15[i45].e() + e6;
                                                    if (z7) {
                                                        i8 = 8;
                                                    } else {
                                                        i8 = 4;
                                                    }
                                                    if (en6Var20 != null && en6Var21 != null && en6Var != null && en6Var2 != null) {
                                                        en6 en6Var23 = en6Var;
                                                        l21Var6 = l21Var28;
                                                        jv3Var.b(en6Var20, en6Var21, e8, 0.5f, en6Var23, en6Var2, e7, i8);
                                                    } else {
                                                        l21Var6 = l21Var28;
                                                    }
                                                    l21Var28 = l21Var6;
                                                } else {
                                                    l21Var5 = l21Var3;
                                                }
                                                i44 = 8;
                                                if (l21Var4.h0 != 8) {
                                                    l21Var5 = l21Var4;
                                                }
                                                l21Var4 = l21Var28;
                                                l21Var3 = l21Var5;
                                            }
                                            jv3Var2 = jv3Var;
                                            h11 h11Var28 = l21Var19.Q[i4];
                                            h11Var = h11VarArr[i4].f;
                                            int i46 = i4 + 1;
                                            h11Var2 = l21Var2.Q[i46];
                                            h11Var3 = l21Var18.Q[i46].f;
                                            if (h11Var != null) {
                                                if (l21Var19 != l21Var2) {
                                                    jv3Var2.e(h11Var28.i, h11Var.i, h11Var28.e(), 5);
                                                } else if (h11Var3 != null) {
                                                    jv3Var2.b(h11Var28.i, h11Var.i, h11Var28.e(), 0.5f, h11Var2.i, h11Var3.i, h11Var2.e(), 5);
                                                }
                                            }
                                            if (h11Var3 != null && l21Var19 != l21Var2) {
                                                jv3Var2.e(h11Var2.i, h11Var3.i, -h11Var2.e(), 5);
                                            }
                                            if ((!z6 || z3) && l21Var19 != null && l21Var19 != l21Var2) {
                                                h11[] h11VarArr17 = l21Var19.Q;
                                                h11Var7 = h11VarArr17[i4];
                                                if (l21Var2 == null) {
                                                    l21Var2 = l21Var19;
                                                }
                                                h11VarArr3 = l21Var2.Q;
                                                i12 = i4 + 1;
                                                h11Var8 = h11VarArr3[i12];
                                                h11Var9 = h11Var7.f;
                                                if (h11Var9 != null) {
                                                    en6Var6 = h11Var9.i;
                                                } else {
                                                    en6Var6 = null;
                                                }
                                                h11Var10 = h11Var8.f;
                                                if (h11Var10 != null) {
                                                    en6Var7 = h11Var10.i;
                                                } else {
                                                    en6Var7 = null;
                                                }
                                                if (l21Var18 != l21Var2) {
                                                    h11 h11Var29 = l21Var18.Q[i12].f;
                                                    if (h11Var29 != null) {
                                                        en6Var10 = h11Var29.i;
                                                    }
                                                    en6Var7 = en6Var10;
                                                }
                                                if (l21Var19 == l21Var2) {
                                                    h11Var8 = h11VarArr17[i12];
                                                }
                                                if (en6Var6 == null && en6Var7 != null) {
                                                    jv3Var2.b(h11Var7.i, en6Var6, h11Var7.e(), 0.5f, en6Var7, h11Var8.i, h11VarArr3[i12].e(), 5);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    h11 h11Var30 = h11VarArr[i4];
                                    int i47 = i4 + 1;
                                    h11 h11Var31 = l21Var18.Q[i47];
                                    h11 h11Var32 = h11Var30.f;
                                    if (h11Var32 != null) {
                                        en6Var8 = h11Var32.i;
                                    } else {
                                        en6Var8 = null;
                                    }
                                    h11 h11Var33 = h11Var31.f;
                                    if (h11Var33 != null) {
                                        en6Var9 = h11Var33.i;
                                    } else {
                                        en6Var9 = null;
                                    }
                                    h11 h11Var34 = l21Var19.Q[i4];
                                    if (l21Var20 != null) {
                                        h11Var31 = l21Var20.Q[i47];
                                    }
                                    if (en6Var8 != null && en6Var9 != null) {
                                        if (i2 == 0) {
                                            f4 = l21Var21.e0;
                                        } else {
                                            f4 = l21Var21.f0;
                                        }
                                        float f16 = f4;
                                        int e9 = h11Var34.e();
                                        int e10 = h11Var31.e();
                                        en6 en6Var24 = h11Var34.i;
                                        en6 en6Var25 = h11Var31.i;
                                        en6 en6Var26 = en6Var8;
                                        l21Var2 = l21Var20;
                                        jv3Var3.b(en6Var24, en6Var26, e9, f16, en6Var9, en6Var25, e10, 7);
                                    } else {
                                        l21Var2 = l21Var20;
                                    }
                                }
                                jv3Var2 = jv3Var;
                                if (!z6) {
                                }
                                h11[] h11VarArr172 = l21Var19.Q;
                                h11Var7 = h11VarArr172[i4];
                                if (l21Var2 == null) {
                                }
                                h11VarArr3 = l21Var2.Q;
                                i12 = i4 + 1;
                                h11Var8 = h11VarArr3[i12];
                                h11Var9 = h11Var7.f;
                                if (h11Var9 != null) {
                                }
                                h11Var10 = h11Var8.f;
                                if (h11Var10 != null) {
                                }
                                if (l21Var18 != l21Var2) {
                                }
                                if (l21Var19 == l21Var2) {
                                }
                                if (en6Var6 == null) {
                                    jv3Var2.b(h11Var7.i, en6Var6, h11Var7.e(), 0.5f, en6Var7, h11Var8.i, h11VarArr3[i12].e(), 5);
                                }
                            }
                        }
                        if (z16) {
                            h11 h11Var35 = h11Var18.f;
                            if (h11Var35.d == m21Var2) {
                                jv3Var3.e(h11Var18.i, h11Var35.i, -h11Var18.e(), 4);
                            }
                        }
                        jv3Var3.g(h11Var18.i, l21Var18.Q[i35].f.i, -h11Var18.e(), 6);
                        if (z5) {
                        }
                        arrayList2 = jl0Var.h;
                        if (arrayList2 != null) {
                            if (jl0Var.n) {
                                f3 = jl0Var.j;
                            }
                            l21 l21Var232 = null;
                            float f112 = f2;
                            i13 = 0;
                            while (i13 < size) {
                            }
                        }
                        if (l21Var19 != null) {
                        }
                        l21Var2 = l21Var20;
                        if (!z6) {
                        }
                        int i442 = 8;
                        if (z3) {
                            i7 = jl0Var.j;
                            if (i7 <= 0) {
                            }
                            z7 = false;
                            l21Var3 = l21Var19;
                            l21Var4 = l21Var3;
                            while (true) {
                                h11[] h11VarArr152 = l21Var3.Q;
                                if (l21Var4 != null) {
                                }
                                l21Var4 = l21Var28;
                                l21Var3 = l21Var5;
                            }
                            jv3Var2 = jv3Var;
                            h11 h11Var282 = l21Var19.Q[i4];
                            h11Var = h11VarArr[i4].f;
                            int i462 = i4 + 1;
                            h11Var2 = l21Var2.Q[i462];
                            h11Var3 = l21Var18.Q[i462].f;
                            if (h11Var != null) {
                            }
                            if (h11Var3 != null) {
                                jv3Var2.e(h11Var2.i, h11Var3.i, -h11Var2.e(), 5);
                            }
                            if (!z6) {
                            }
                            h11[] h11VarArr1722 = l21Var19.Q;
                            h11Var7 = h11VarArr1722[i4];
                            if (l21Var2 == null) {
                            }
                            h11VarArr3 = l21Var2.Q;
                            i12 = i4 + 1;
                            h11Var8 = h11VarArr3[i12];
                            h11Var9 = h11Var7.f;
                            if (h11Var9 != null) {
                            }
                            h11Var10 = h11Var8.f;
                            if (h11Var10 != null) {
                            }
                            if (l21Var18 != l21Var2) {
                            }
                            if (l21Var19 == l21Var2) {
                            }
                            if (en6Var6 == null) {
                            }
                        }
                        jv3Var2 = jv3Var;
                        if (!z6) {
                        }
                        h11[] h11VarArr17222 = l21Var19.Q;
                        h11Var7 = h11VarArr17222[i4];
                        if (l21Var2 == null) {
                        }
                        h11VarArr3 = l21Var2.Q;
                        i12 = i4 + 1;
                        h11Var8 = h11VarArr3[i12];
                        h11Var9 = h11Var7.f;
                        if (h11Var9 != null) {
                        }
                        h11Var10 = h11Var8.f;
                        if (h11Var10 != null) {
                        }
                        if (l21Var18 != l21Var2) {
                        }
                        if (l21Var19 == l21Var2) {
                        }
                        if (en6Var6 == null) {
                        }
                    }
                }
                if (z5) {
                }
                arrayList2 = jl0Var.h;
                if (arrayList2 != null) {
                }
                if (l21Var19 != null) {
                }
                l21Var2 = l21Var20;
                if (!z6) {
                }
                int i4422 = 8;
                if (z3) {
                }
                jv3Var2 = jv3Var;
                if (!z6) {
                }
                h11[] h11VarArr172222 = l21Var19.Q;
                h11Var7 = h11VarArr172222[i4];
                if (l21Var2 == null) {
                }
                h11VarArr3 = l21Var2.Q;
                i12 = i4 + 1;
                h11Var8 = h11VarArr3[i12];
                h11Var9 = h11Var7.f;
                if (h11Var9 != null) {
                }
                h11Var10 = h11Var8.f;
                if (h11Var10 != null) {
                }
                if (l21Var18 != l21Var2) {
                }
                if (l21Var19 == l21Var2) {
                }
                if (en6Var6 == null) {
                }
            }
            i23 = i5 + 1;
            m21Var2 = m21Var;
            jv3Var3 = jv3Var;
            arrayList4 = arrayList;
            i22 = i6;
        }
    }

    public static final jm3 D(z64 z64Var) {
        if ((z64Var.L & 2) != 0) {
            if (z64Var instanceof jm3) {
                return (jm3) z64Var;
            }
            if (z64Var instanceof zg1) {
                z64 z64Var2 = ((zg1) z64Var).l0;
                while (z64Var2 != null) {
                    if (z64Var2 instanceof jm3) {
                        return (jm3) z64Var2;
                    }
                    if ((z64Var2 instanceof zg1) && (z64Var2.L & 2) != 0) {
                        z64Var2 = ((zg1) z64Var2).l0;
                    } else {
                        z64Var2 = z64Var2.Y;
                    }
                }
            }
        }
        return null;
    }

    public static final h30 E(zv0 zv0Var, px0 px0Var, int i2) {
        boolean z;
        if ((((i2 & 14) ^ 6) > 4 && ((xq2) px0Var).f(zv0Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (z || P == vs0Var) {
            P = new h30(zv0Var);
            xq2Var.l0(P);
        }
        h30 h30Var = (h30) P;
        boolean f2 = xq2Var.f(h30Var);
        Object P2 = xq2Var.P();
        if (f2 || P2 == vs0Var) {
            P2 = new k0(h30Var, 14);
            xq2Var.l0(P2);
        }
        mb3.d(h30Var, (qn2) P2, xq2Var);
        return h30Var;
    }

    public static final String F(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static final float[] G(float[] fArr, float[] fArr2, float[] fArr3) {
        Y(fArr, fArr2);
        Y(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] U = U(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return X(U, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean H(ys7 ys7Var, ys7 ys7Var2) {
        if (ys7Var == ys7Var2) {
            return true;
        }
        if (Math.abs(ys7Var.a - ys7Var2.a) < 0.001f && Math.abs(ys7Var.b - ys7Var2.b) < 0.001f) {
            return true;
        }
        return false;
    }

    public static final void I(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        e41.q(xg6.m(i2, i3, "toIndex (", ") is greater than size (", ")."));
    }

    public static final yf0 J(String str, String str2, ky kyVar) {
        str.getClass();
        ArrayList d0 = hf.d0(str);
        if (str2 != null) {
            d0.add(str2);
        }
        return new yf0(d0, kyVar);
    }

    public static final e01 K(nt0 nt0Var, nt0 nt0Var2) {
        if (nt0Var == nt0Var2) {
            return new e01(nt0Var, nt0Var, 1);
        }
        if (q60.A(nt0Var.b, 12884901888L) && q60.A(nt0Var2.b, 12884901888L)) {
            return new d01((cq5) nt0Var, (cq5) nt0Var2);
        }
        return new e01(nt0Var, nt0Var2, 0);
    }

    public static final u52 L(Enum[] enumArr) {
        enumArr.getClass();
        return new u52(enumArr);
    }

    public static final yf0 M(w9 w9Var, w9 w9Var2) {
        String str;
        if (w9Var2 != null) {
            str = w9Var2.A.d();
        } else {
            str = null;
        }
        ky kyVar = ((qe0) w9Var.L).A;
        kyVar.getClass();
        String d2 = w9Var.A.d();
        d2.getClass();
        return J(d2, str, kyVar);
    }

    public static oa N(int i2) {
        Object obj;
        Iterator it = oa.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((oa) obj).a == i2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (oa) obj;
    }

    public static Set O() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set<Object> set = (Set) invoke;
            for (Object obj : set) {
                if (!(obj instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final String P(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final Paint Q(aj ajVar) {
        if (ajVar == null) {
            o53.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + gh5.a(ajVar.getClass()).b());
        }
        return (Paint) ajVar.L;
    }

    public static Object R(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return r2.c(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static a74 S(a74 a74Var, r94 r94Var) {
        return a74Var.d(new qy2(r94Var));
    }

    public static int T(float f2) {
        float f3;
        boolean z;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return tt0.a(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }

    public static final float[] U(float[] fArr) {
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

    public static boolean V(sg0 sg0Var) {
        Boolean bool;
        sg0Var.getClass();
        try {
            lg0 lg0Var = sg0Var.b;
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            key.getClass();
            bool = (Boolean) ((qc0) lg0Var).c(key);
        } catch (BufferUnderflowException e2) {
            if (si1.a().b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                }
            } else if (kj2.G()) {
                Log.e("CXCP", "Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. Flash is not available.", e2);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null && kj2.L()) {
            Log.w("CXCP", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static float W(int i2) {
        float pow;
        float f2 = i2 / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static final float[] X(float[] fArr, float[] fArr2) {
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

    public static final float[] Y(float[] fArr, float[] fArr2) {
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

    public static final void Z(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                Z(sb, i2, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Z(sb, i2, str, entry);
            }
        } else {
            sb.append('\n');
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                ca0 ca0Var = ea0.B;
                sb.append(qo2.u(new ca0(((String) obj).getBytes(aa3.a))));
                sb.append('\"');
            } else if (obj instanceof ea0) {
                sb.append(": \"");
                sb.append(qo2.u((ea0) obj));
                sb.append('\"');
            } else if (obj instanceof pr2) {
                sb.append(" {");
                b0((pr2) obj, sb, i2 + 2);
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i5 = i2 + 2;
                Z(sb, i5, "key", entry2.getKey());
                Z(sb, i5, "value", entry2.getValue());
                sb.append("\n");
                while (i3 < i2) {
                    sb.append(' ');
                    i3++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static final void a(a74 a74Var, j06 j06Var, eo2 eo2Var, qn2 qn2Var, eo2 eo2Var2, on2 on2Var, on2 on2Var2, qn2 qn2Var2, px0 px0Var, int i2) {
        int i3;
        eo2 eo2Var3;
        qn2 qn2Var3;
        eo2 eo2Var4;
        qn2 qn2Var4;
        boolean z;
        xq2 xq2Var;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        a74Var.getClass();
        j06Var.getClass();
        eo2Var.getClass();
        qn2Var.getClass();
        eo2Var2.getClass();
        on2Var.getClass();
        on2Var2.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(2093948359);
        if ((i2 & 6) == 0) {
            if (xq2Var2.f(a74Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var2.f(j06Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            eo2Var3 = eo2Var;
            if (xq2Var2.h(eo2Var3)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        } else {
            eo2Var3 = eo2Var;
        }
        if ((i2 & 3072) == 0) {
            qn2Var3 = qn2Var;
            if (xq2Var2.h(qn2Var3)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        } else {
            qn2Var3 = qn2Var;
        }
        if ((i2 & 24576) == 0) {
            eo2Var4 = eo2Var2;
            if (xq2Var2.h(eo2Var4)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        } else {
            eo2Var4 = eo2Var2;
        }
        if ((196608 & i2) == 0) {
            if (xq2Var2.h(on2Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((12582912 & i2) == 0) {
            qn2Var4 = qn2Var2;
            if (xq2Var2.h(qn2Var4)) {
                i4 = 8388608;
            } else {
                i4 = Compress.MAXWINSIZE;
            }
            i3 |= i4;
        } else {
            qn2Var4 = qn2Var2;
        }
        if ((4269203 & i3) != 4269202) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i3 & 1, z)) {
            Object P = xq2Var2.P();
            if (P == ox0.a) {
                P = mb3.w(xq2Var2);
                xq2Var2.l0(P);
            }
            w61 w61Var = (w61) P;
            pr3 a2 = qr3.a(xq2Var2);
            a74 d2 = a74Var.d(dj6.c);
            yt0 a3 = wt0.a(ju.d, d90.l0, xq2Var2, 54);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E = l.E(xq2Var2, d2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.f, a3);
            yh2.K(xq2Var2, ix0.e, l2);
            yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var2, ix0.h);
            yh2.K(xq2Var2, ix0.d, E);
            if (j06Var.equals(f06.a)) {
                xq2Var2.b0(-2144371299);
                z2 = true;
                e45.a(null, ((ut0) xq2Var2.j(vt0.a)).i(), RecyclerView.B1, 0L, 0, xq2Var2, 0, 29);
                xq2Var = xq2Var2;
                xq2Var.p(false);
            } else {
                xq2Var = xq2Var2;
                z2 = true;
                boolean z3 = j06Var instanceof i06;
                x64 x64Var = x64.a;
                if (z3) {
                    xq2Var.b0(-2144156810);
                    h70.a(nw7.f0(x64Var, false, null, 3), xq2Var, 6);
                    a74 d3 = dj6.m(760.0f, 1, x64Var).d(new vn3(1.0f, true));
                    i06 i06Var = (i06) j06Var;
                    eo2 eo2Var5 = eo2Var3;
                    e(d3, i06Var.a, i06Var.b, eo2Var5, qn2Var3, eo2Var4, a2, qn2Var4, xq2Var, ((i3 << 3) & 523264) | (i3 & 29360128));
                    xq2Var = xq2Var;
                    xq2Var.p(false);
                } else if (!j06Var.equals(e06.a) && !(j06Var instanceof g06) && !j06Var.equals(h06.a)) {
                    throw xg6.f(xq2Var, 762110097, false);
                } else {
                    xq2Var.b0(-2143013964);
                    q(ge7.O(dj6.m(640.0f, 1, x64Var), 32.0f), on2Var, xq2Var, ((i3 >> 12) & 112) | 6);
                    xq2Var.p(false);
                }
            }
            xq2Var.p(z2);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new s91(a74Var, j06Var, eo2Var, qn2Var, eo2Var2, on2Var, on2Var2, qn2Var2, i2);
        }
    }

    public static final void a0(jg1 jg1Var, tu0 tu0Var) {
        jg1Var.getClass();
        tu0Var.getClass();
        ((ed3) jg1Var).a0(new y(17, jg1Var, tu0Var));
    }

    public static final void b(qq5 qq5Var, l6 l6Var, List list, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        iy0 iy0Var;
        x64 x64Var;
        float f2;
        long j2;
        long j3;
        iy0 iy0Var2;
        int i7;
        String g2;
        int i8;
        String str;
        long j4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-213808454);
        if (xq2Var.f(qq5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (xq2Var.d(l6Var.ordinal())) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (xq2Var.h(list)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i11 = i10 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        if ((i12 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i12 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            x64 x64Var2 = x64.a;
            a74 P = ge7.P(dj6.c(x64Var2, 1.0f), 12.0f, 6.0f);
            gu guVar = new gu(6.0f, true, new i(1));
            c40 c40Var = d90.k0;
            yt0 a2 = wt0.a(guVar, c40Var, xq2Var, 6);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
            jx0.i.getClass();
            iy0 iy0Var3 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            d40 d40Var = d90.i0;
            a74 c2 = dj6.c(x64Var2, 1.0f);
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, c2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var3);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            String O = yh2.O(xq2Var, R.string.achievements);
            long j5 = F.g;
            long j6 = F.f;
            long j7 = F.c;
            pi2 pi2Var = qs7.a;
            long E3 = hi2.E(14);
            oj2 oj2Var = oj2.e0;
            x37.b(O, null, j5, E3, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772544, 0, 130962);
            n26 n26Var = n26.a;
            gi2.h(xq2Var, n26Var.b(x64Var2, 1.0f, true));
            d(gt0.d1(list, new zh2(5)), l6Var, qn2Var, new kw0(5), dj6.m(360.0f, 1, x64Var2), xq2Var, (i12 & 112) | 24576 | ((i12 >> 3) & 896));
            xq2Var.p(true);
            a74 c3 = dj6.c(x64Var2, 1.0f);
            l26 a4 = k26.a(new gu(8.0f, true, new i(1)), d90.h0, xq2Var, 6);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E4 = l.E(xq2Var, c3);
            xq2Var.f0();
            if (xq2Var.S) {
                iy0Var = iy0Var3;
                xq2Var.k(iy0Var);
            } else {
                iy0Var = iy0Var3;
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a4);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E4);
            a74 g3 = u24.g(n26Var.b(x64Var2, 1.0f, true), z16.b(10.0f));
            jy2 jy2Var = u24.m;
            a74 L = vy7.L(g3, j7, jy2Var);
            boolean z2 = qq5Var.a;
            int i13 = qq5Var.d;
            boolean z3 = qq5Var.a;
            int i14 = qq5Var.c;
            int i15 = qq5Var.b;
            if (!z2) {
                x64Var = x64Var2;
                f2 = 10.0f;
                j2 = kt0.c(0.45f, hv.c(4281908728L));
            } else {
                x64Var = x64Var2;
                f2 = 10.0f;
                j2 = j6;
            }
            a74 P2 = ge7.P(ak7.I(L, 1.0f, j2, z16.b(f2)), f2, 7.0f);
            e40 e40Var = d90.L;
            e34 d2 = h70.d(e40Var, false);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l5 = xq2Var.l();
            a74 E5 = l.E(xq2Var, P2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d2);
            yh2.K(xq2Var, pnVar2, l5);
            i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E5);
            eu euVar = ju.c;
            yt0 a5 = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode5 = Long.hashCode(xq2Var.T);
            xv4 l6 = xq2Var.l();
            x64 x64Var3 = x64Var;
            a74 E6 = l.E(xq2Var, x64Var3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a5);
            yh2.K(xq2Var, pnVar2, l6);
            i61.w(hashCode5, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E6);
            l26 a6 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode6 = Long.hashCode(xq2Var.T);
            xv4 l7 = xq2Var.l();
            a74 E7 = l.E(xq2Var, x64Var3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a6);
            yh2.K(xq2Var, pnVar2, l7);
            i61.w(hashCode6, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E7);
            h70.a(vy7.L(u24.g(dj6.i(x64Var3, 6.0f), z16.b(3.0f)), hv.c(4281908728L), jy2Var), xq2Var, 0);
            gi2.h(xq2Var, dj6.l(x64Var3, 5.0f));
            iy0 iy0Var4 = iy0Var;
            x37.b("СОФТКОР", null, hv.c(4281908728L), hi2.D(9.5d), oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772934, 0, 130962);
            gi2.h(xq2Var, n26Var.b(x64Var3, 1.0f, true));
            sr2 sr2Var = qs7.c;
            long D = hi2.D(9.5d);
            oj2 oj2Var2 = oj2.d0;
            x37.b(i14 + "/" + i15, null, F.g, D, oj2Var2, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772544, 0, 130962);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.e(x64Var3, 3.0f));
            x37.b(i13 + " очков (" + ((int) ((i14 / i15) * 100.0f)) + "%)", null, F.i, hi2.E(9), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1575936, 0, 130994);
            xq2Var.p(true);
            xq2Var.p(true);
            a74 L2 = vy7.L(u24.g(n26Var.b(x64Var3, 1.0f, true), z16.b(10.0f)), j7, jy2Var);
            if (z3) {
                j3 = kt0.c(0.6f, hv.c(4294688548L));
            } else {
                j3 = j6;
            }
            a74 P3 = ge7.P(ak7.I(L2, 1.0f, j3, z16.b(10.0f)), 10.0f, 7.0f);
            e34 d3 = h70.d(e40Var, false);
            int hashCode7 = Long.hashCode(xq2Var.T);
            xv4 l8 = xq2Var.l();
            a74 E8 = l.E(xq2Var, P3);
            xq2Var.f0();
            if (xq2Var.S) {
                iy0Var2 = iy0Var4;
                xq2Var.k(iy0Var2);
            } else {
                iy0Var2 = iy0Var4;
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d3);
            yh2.K(xq2Var, pnVar2, l8);
            i61.w(hashCode7, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E8);
            yt0 a7 = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode8 = Long.hashCode(xq2Var.T);
            xv4 l9 = xq2Var.l();
            a74 E9 = l.E(xq2Var, x64Var3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a7);
            yh2.K(xq2Var, pnVar2, l9);
            i61.w(hashCode8, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E9);
            l26 a8 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode9 = Long.hashCode(xq2Var.T);
            xv4 l10 = xq2Var.l();
            a74 E10 = l.E(xq2Var, x64Var3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a8);
            yh2.K(xq2Var, pnVar2, l10);
            i61.w(hashCode9, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E10);
            h70.a(vy7.L(u24.g(dj6.i(x64Var3, 6.0f), z16.b(3.0f)), hv.c(4294688548L), jy2Var), xq2Var, 0);
            gi2.h(xq2Var, dj6.l(x64Var3, 5.0f));
            x37.b("ХАРДКОР (x2)", null, hv.c(4294688548L), hi2.D(9.5d), oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772934, 0, 130962);
            gi2.h(xq2Var, n26Var.b(x64Var3, 1.0f, true));
            if (z3) {
                StringBuilder sb = new StringBuilder();
                sb.append(i14);
                sb.append("/");
                i7 = i15;
                sb.append(i7);
                g2 = sb.toString();
            } else {
                i7 = i15;
                g2 = lb1.g(i7, "0/");
            }
            x37.b(g2, null, F.g, hi2.D(9.5d), oj2Var2, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772544, 0, 130962);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.e(x64Var3, 3.0f));
            if (z3) {
                i8 = i13;
            } else {
                i8 = i13 * 2;
            }
            if (z3) {
                str = lb1.k("(", (int) ((i14 / i7) * 100.0f), "%)");
            } else {
                str = "(Заблокировано)";
            }
            String str2 = i8 + " очков " + str;
            long E11 = hi2.E(9);
            if (z3) {
                j4 = hv.c(4294688548L);
            } else {
                j4 = F.i;
            }
            x37.b(str2, null, j4, E11, null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1575936, 0, 130994);
            xq2Var = xq2Var;
            i61.y(xq2Var, true, true, true);
            l.c(null, F.f, RecyclerView.B1, xq2Var, 0, 13);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new p4(qq5Var, l6Var, list, qn2Var, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a5, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a7, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b9, code lost:
        if (((java.lang.Float) r4).floatValue() == androidx.recyclerview.widget.RecyclerView.B1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cb, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(pr2 pr2Var, StringBuilder sb, int i2) {
        Method[] declaredMethods;
        String str;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : pr2Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.startsWith("get")) {
                str = str2.substring(3);
            } else {
                str = str2;
            }
            boolean z = true;
            if (str.endsWith("List") && !str.endsWith("OrBuilderList") && !str.equals("List")) {
                String str3 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 4);
                Method method2 = (Method) hashMap.get(str2);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    Z(sb, i2, F(str3), pr2.h(method2, pr2Var, new Object[0]));
                }
            }
            if (str.endsWith("Map") && !str.equals("Map")) {
                String str4 = str.substring(0, 1).toLowerCase() + str.substring(1, str.length() - 3);
                Method method3 = (Method) hashMap.get(str2);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    Z(sb, i2, F(str4), pr2.h(method3, pr2Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(str))) != null && (!str.endsWith("Bytes") || !hashMap.containsKey("get".concat(str.substring(0, str.length() - 5))))) {
                String str5 = str.substring(0, 1).toLowerCase() + str.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(str));
                Method method5 = (Method) hashMap.get("has".concat(str));
                if (method4 != null) {
                    Object h2 = pr2.h(method4, pr2Var, new Object[0]);
                    if (method5 == null) {
                        if (h2 instanceof Boolean) {
                            equals = !((Boolean) h2).booleanValue();
                        } else if (!(h2 instanceof Integer)) {
                            if (!(h2 instanceof Float)) {
                                if (!(h2 instanceof Double)) {
                                    if (h2 instanceof String) {
                                        equals = h2.equals("");
                                    } else if (h2 instanceof ea0) {
                                        equals = h2.equals(ea0.B);
                                    } else {
                                        equals = !(h2 instanceof c1) ? false : false;
                                    }
                                }
                            }
                        }
                        if (equals) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) pr2.h(method5, pr2Var, new Object[0])).booleanValue();
                    }
                    if (z) {
                        Z(sb, i2, F(str5), h2);
                    }
                }
            }
        }
        mg7 mg7Var = pr2Var.unknownFields;
        if (mg7Var != null) {
            for (int i3 = 0; i3 < mg7Var.a; i3++) {
                Z(sb, i2, String.valueOf(mg7Var.b[i3] >>> 3), mg7Var.c[i3]);
            }
        }
    }

    public static final void c(String str, px0 px0Var, int i2) {
        int i3;
        boolean z;
        xq2 xq2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1418047088);
        if (xq2Var2.f(str)) {
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
        if (xq2Var2.S(i4 & 1, z)) {
            es7 F = bl2.F(xq2Var2);
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            xq2Var = xq2Var2;
            x37.b(upperCase, ge7.S(dj6.c(x64.a, 1.0f), 2.0f, 15.0f, RecyclerView.B1, 8.0f, 4), F.i, hi2.D(9.5d), oj2.d0, qs7.c, hi2.D(0.8d), null, 0L, 0, false, 0, 0, null, null, xq2Var, 14355504, 0, 130832);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new g5(str, i2, 0);
        }
    }

    public static final void c0(xg1 xg1Var) {
        nd ndVar;
        sm3 f0 = f0(xg1Var);
        if (!f0.p0) {
            te teVar = (te) vm3.a(f0);
            if (te.d() && (ndVar = teVar.L0) != null) {
                ndVar.R.b.m(f0.B, new md(ndVar, f0));
            }
        }
    }

    public static final void d(final List list, final Object obj, final qn2 qn2Var, final fo2 fo2Var, a74 a74Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        xq2 xq2Var;
        boolean z2;
        boolean z3;
        final int i6;
        int i7;
        int i8;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-926502816);
        if (xq2Var2.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i3 | i2;
        if (xq2Var2.f(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.h(qn2Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i10 |= i8;
        }
        if (xq2Var2.h(fo2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if ((i2 & 24576) == 0) {
            if (xq2Var2.f(a74Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i11 |= i7;
        }
        boolean z4 = false;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i11 & 1, z)) {
            final es7 F = bl2.F(xq2Var2);
            gu guVar = new gu(5.0f, true, new i(1));
            boolean h2 = xq2Var2.h(list);
            if ((i11 & 112) != 32) {
                z2 = false;
            } else {
                z2 = true;
            }
            boolean z5 = z2 | h2;
            if ((i11 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f2 = z5 | z3 | xq2Var2.f(F);
            if ((i11 & 896) == 256) {
                z4 = true;
            }
            boolean z6 = f2 | z4;
            Object P = xq2Var2.P();
            if (z6 || P == ox0.a) {
                i6 = i11;
                qn2 qn2Var2 = new qn2() { // from class: q4
                    @Override // defpackage.qn2
                    public final Object g(Object obj2) {
                        er3 er3Var = (er3) obj2;
                        er3Var.getClass();
                        List list2 = list;
                        er3Var.h0(list2.size(), null, new j5(0, list2), new zv0(802480018, true, new k5(list2, obj, fo2Var, i6, F, qn2Var)));
                        return jg7.a;
                    }
                };
                xq2Var2.l0(qn2Var2);
                P = qn2Var2;
            } else {
                i6 = i11;
            }
            xq2Var = xq2Var2;
            gi2.f(a74Var, null, null, guVar, null, null, false, null, (qn2) P, xq2Var, ((i6 >> 12) & 14) | 24576, 494);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new r4(list, obj, qn2Var, fo2Var, a74Var, i2, 0);
        }
    }

    public static final eg4 d0(xg1 xg1Var, int i2) {
        eg4 eg4Var = ((z64) xg1Var).A.d0;
        eg4Var.getClass();
        if (eg4Var.Y0() == xg1Var && fg4.g(i2)) {
            eg4 eg4Var2 = eg4Var.n0;
            eg4Var2.getClass();
            return eg4Var2;
        }
        return eg4Var;
    }

    public static final void e(final a74 a74Var, final List list, final Set set, final eo2 eo2Var, final qn2 qn2Var, final eo2 eo2Var2, final pr3 pr3Var, final qn2 qn2Var2, px0 px0Var, final int i2) {
        int i3;
        Set set2;
        eo2 eo2Var3;
        pr3 pr3Var2;
        qn2 qn2Var3;
        boolean z;
        xq2 xq2Var;
        boolean z2;
        Object obj;
        g6 g6Var;
        boolean z3;
        Object c0;
        final boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-124944075);
        if ((i2 & 6) == 0) {
            if (xq2Var2.f(a74Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var2.h(list)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            set2 = set;
            if (xq2Var2.h(set2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        } else {
            set2 = set;
        }
        if ((i2 & 3072) == 0) {
            eo2Var3 = eo2Var;
            if (xq2Var2.h(eo2Var3)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        } else {
            eo2Var3 = eo2Var;
        }
        if ((i2 & 24576) == 0) {
            if (xq2Var2.h(qn2Var)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i2) == 0) {
            if (xq2Var2.h(eo2Var2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((1572864 & i2) == 0) {
            pr3Var2 = pr3Var;
            if (xq2Var2.f(pr3Var2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        } else {
            pr3Var2 = pr3Var;
        }
        if ((12582912 & i2) == 0) {
            qn2Var3 = qn2Var2;
            if (xq2Var2.h(qn2Var3)) {
                i4 = 8388608;
            } else {
                i4 = Compress.MAXWINSIZE;
            }
            i3 |= i4;
        } else {
            qn2Var3 = qn2Var2;
        }
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i3 & 1, z)) {
            if (list.isEmpty()) {
                xq2Var2.b0(1528149555);
                l(a74Var, xq2Var2, i3 & 14);
                xq2Var2.p(false);
                cf5 t = xq2Var2.t();
                if (t != null) {
                    final Set set3 = set2;
                    final eo2 eo2Var4 = eo2Var3;
                    final pr3 pr3Var3 = pr3Var2;
                    final qn2 qn2Var4 = qn2Var3;
                    t.d = new eo2() { // from class: y4
                        @Override // defpackage.eo2
                        public final Object o(Object obj2, Object obj3) {
                            int i12 = r10;
                            jg7 jg7Var = jg7.a;
                            int i13 = i2;
                            switch (i12) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int a0 = ii2.a0(i13 | 1);
                                    nc1.e(a74Var, list, set3, eo2Var4, qn2Var, eo2Var2, pr3Var3, qn2Var4, (px0) obj2, a0);
                                    return jg7Var;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    int a02 = ii2.a0(i13 | 1);
                                    nc1.e(a74Var, list, set3, eo2Var4, qn2Var, eo2Var2, pr3Var3, qn2Var4, (px0) obj2, a02);
                                    return jg7Var;
                                default:
                                    ((Integer) obj3).getClass();
                                    int a03 = ii2.a0(i13 | 1);
                                    nc1.e(a74Var, list, set3, eo2Var4, qn2Var, eo2Var2, pr3Var3, qn2Var4, (px0) obj2, a03);
                                    return jg7Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
            xq2Var2.b0(1528205293);
            xq2Var2.p(false);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(null);
                xq2Var2.l0(P);
            }
            final qa4 qa4Var = (qa4) P;
            ta5 ta5Var = (ta5) qa4Var.getValue();
            if (ta5Var == null) {
                xq2Var2.b0(1528353379);
                xq2Var2.p(false);
                Object[] objArr = new Object[0];
                boolean h2 = xq2Var2.h(list);
                Object P2 = xq2Var2.P();
                if (h2 || P2 == vs0Var) {
                    P2 = new b5(0, list);
                    xq2Var2.l0(P2);
                }
                final ts4 ts4Var = (ts4) qo2.I(objArr, (on2) P2, xq2Var2, 0);
                Object[] objArr2 = new Object[0];
                Object P3 = xq2Var2.P();
                if (P3 == vs0Var) {
                    P3 = new c5(0);
                    xq2Var2.l0(P3);
                }
                final qa4 qa4Var2 = (qa4) qo2.I(objArr2, (on2) P3, xq2Var2, 48);
                Object[] objArr3 = new Object[0];
                Object P4 = xq2Var2.P();
                if (P4 == vs0Var) {
                    P4 = new c5(1);
                    xq2Var2.l0(P4);
                }
                final qa4 qa4Var3 = (qa4) qo2.I(objArr3, (on2) P4, xq2Var2, 48);
                Object[] objArr4 = new Object[0];
                Object P5 = xq2Var2.P();
                if (P5 == vs0Var) {
                    P5 = new c5(2);
                    xq2Var2.l0(P5);
                }
                final qa4 qa4Var4 = (qa4) qo2.I(objArr4, (on2) P5, xq2Var2, 48);
                boolean h3 = xq2Var2.h(list) | xq2Var2.f(ts4Var);
                Object P6 = xq2Var2.P();
                if (h3 || P6 == vs0Var) {
                    P6 = new m5(list, ts4Var, (r41) null, 0);
                    xq2Var2.l0(P6);
                }
                mb3.i(xq2Var2, (eo2) P6, list);
                boolean e2 = xq2Var2.e(ts4Var.h()) | xq2Var2.f(list);
                Object P7 = xq2Var2.P();
                if (e2 || P7 == vs0Var) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((c6) obj).a == ts4Var.h()) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    P7 = (c6) obj;
                    if (P7 == null) {
                        P7 = (c6) gt0.H0(list);
                    }
                    xq2Var2.l0(P7);
                }
                final c6 c6Var = (c6) P7;
                boolean f2 = xq2Var2.f(c6Var);
                Object P8 = xq2Var2.P();
                if (f2 || P8 == vs0Var) {
                    kw3 I = hf.I();
                    I.add(g6.All);
                    I.add(g6.Unlocked);
                    I.add(g6.Locked);
                    List<h3> list2 = c6Var.f;
                    ArrayList arrayList = new ArrayList(ht0.v0(list2, 10));
                    for (h3 h3Var : list2) {
                        e6 e6Var = g6.Companion;
                        g3 g3Var = h3Var.a;
                        e6Var.getClass();
                        g3Var.getClass();
                        switch (d6.a[g3Var.ordinal()]) {
                            case 1:
                                g6Var = g6.PendingSubmissions;
                                break;
                            case 2:
                                g6Var = g6.ActiveChallenges;
                                break;
                            case 3:
                                g6Var = g6.RecentlyUnlocked;
                                break;
                            case 4:
                                g6Var = g6.Unsynced;
                                break;
                            case 5:
                                g6Var = g6.AlmostThere;
                                break;
                            case 6:
                                g6Var = g6.Locked;
                                break;
                            case 7:
                                g6Var = g6.Unsupported;
                                break;
                            case 8:
                                g6Var = g6.Unofficial;
                                break;
                            case 9:
                                g6Var = g6.Unlocked;
                                break;
                            default:
                                i.d();
                                g6Var = null;
                                break;
                        }
                        arrayList.add(g6Var);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        g6 g6Var2 = (g6) obj2;
                        if (g6Var2 != g6.Unlocked && g6Var2 != g6.Locked && g6Var2 != g6.All) {
                            arrayList2.add(obj2);
                        }
                    }
                    I.addAll(gt0.d1(gt0.k1(gt0.o1(arrayList2)), new zh2(6)));
                    P8 = hf.A(I);
                    xq2Var2.l0(P8);
                }
                final List list3 = (List) P8;
                boolean f3 = xq2Var2.f(c6Var);
                Object P9 = xq2Var2.P();
                if (f3 || P9 == vs0Var) {
                    kw3 I2 = hf.I();
                    I2.add(l6.All);
                    I2.add(l6.Core);
                    if (!c6Var.g.isEmpty()) {
                        I2.add(l6.Leaderboards);
                    }
                    I2.add(l6.Unofficial);
                    P9 = hf.A(I2);
                    xq2Var2.l0(P9);
                }
                final List list4 = (List) P9;
                boolean h4 = xq2Var2.h(list4) | xq2Var2.f(qa4Var2);
                Object P10 = xq2Var2.P();
                if (h4 || P10 == vs0Var) {
                    P10 = new n5(list4, qa4Var2, null, 0);
                    xq2Var2.l0(P10);
                }
                mb3.i(xq2Var2, (eo2) P10, list4);
                boolean h5 = xq2Var2.h(list3) | xq2Var2.f(qa4Var3);
                Object P11 = xq2Var2.P();
                if (h5 || P11 == vs0Var) {
                    P11 = new n5(list3, qa4Var3, null, 1);
                    xq2Var2.l0(P11);
                }
                mb3.i(xq2Var2, (eo2) P11, list3);
                boolean d2 = xq2Var2.d(((l6) qa4Var2.getValue()).ordinal()) | xq2Var2.f(c6Var) | xq2Var2.d(((g6) qa4Var3.getValue()).ordinal()) | xq2Var2.g(((Boolean) qa4Var4.getValue()).booleanValue());
                Object P12 = xq2Var2.P();
                if (!d2 && P12 != vs0Var) {
                    z3 = true;
                } else {
                    if (((l6) qa4Var2.getValue()) == l6.Leaderboards) {
                        c0 = yt1.A;
                        z3 = true;
                    } else {
                        z3 = true;
                        c0 = sb6.c0(new pc2(new qd2(new pc2(gt0.B0(c6Var.f), true, new j4(qa4Var3, 2)), new w4(qa4Var2, qa4Var4, 0), 2), true, new k4(4)));
                    }
                    P12 = c0;
                    xq2Var2.l0(P12);
                }
                final List list5 = (List) P12;
                if (!c6Var.g.isEmpty() && (((l6) qa4Var2.getValue()) == l6.Leaderboards || (((l6) qa4Var2.getValue()) == l6.All && c6Var.f.isEmpty()))) {
                    z4 = z3;
                } else {
                    z4 = false;
                }
                final long a2 = ((ut0) xq2Var2.j(vt0.a)).a();
                qh1 qh1Var = (qh1) xq2Var2.j(ky0.h);
                final kk3 kk3Var = (kk3) xq2Var2.j(ky0.n);
                Object P13 = xq2Var2.P();
                if (P13 == vs0Var) {
                    P13 = mb3.w(xq2Var2);
                    xq2Var2.l0(P13);
                }
                final w61 w61Var = (w61) P13;
                boolean f4 = xq2Var2.f(qh1Var);
                Object P14 = xq2Var2.P();
                if (f4 || P14 == vs0Var) {
                    float e0 = qh1Var.e0(40.0f);
                    a4 a4Var = new a4(e0, e0);
                    xq2Var2.l0(a4Var);
                    P14 = a4Var;
                }
                a4 a4Var2 = (a4) P14;
                boolean f5 = xq2Var2.f(qh1Var);
                Object P15 = xq2Var2.P();
                if (f5 || P15 == vs0Var) {
                    P15 = Float.valueOf(qh1Var.e0(80.0f));
                    xq2Var2.l0(P15);
                }
                final float floatValue = ((Number) P15).floatValue();
                final qq5 qq5Var = c6Var.e;
                xq2Var = xq2Var2;
                hv.d(b80.a.a(a4Var2), n16.I(-1098754955, new eo2() { // from class: x4
                    @Override // defpackage.eo2
                    public final Object o(Object obj3, Object obj4) {
                        boolean z5;
                        px0 px0Var2 = (px0) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if ((intValue & 3) != 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        xq2 xq2Var3 = (xq2) px0Var2;
                        if (xq2Var3.S(intValue & 1, z5)) {
                            a74 d3 = a74.this.d(dj6.c);
                            yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var3, 0);
                            int hashCode = Long.hashCode(xq2Var3.T);
                            xv4 l2 = xq2Var3.l();
                            a74 E = l.E(xq2Var3, d3);
                            jx0.i.getClass();
                            on2 on2Var = ix0.b;
                            xq2Var3.f0();
                            if (xq2Var3.S) {
                                xq2Var3.k(on2Var);
                            } else {
                                xq2Var3.o0();
                            }
                            yh2.K(xq2Var3, ix0.f, a3);
                            yh2.K(xq2Var3, ix0.e, l2);
                            yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode));
                            yh2.F(xq2Var3, ix0.h);
                            yh2.K(xq2Var3, ix0.d, E);
                            final qa4 qa4Var5 = qa4Var2;
                            l6 l6Var = (l6) qa4Var5.getValue();
                            boolean f6 = xq2Var3.f(qa4Var5);
                            Object P16 = xq2Var3.P();
                            Object obj5 = ox0.a;
                            if (f6 || P16 == obj5) {
                                P16 = new j4(qa4Var5, 0);
                                xq2Var3.l0(P16);
                            }
                            nc1.b(qq5Var, l6Var, list4, (qn2) P16, xq2Var3, 0);
                            a74 d4 = dj6.c(x64.a, 1.0f).d(new vn3(1.0f, true));
                            pr3 pr3Var4 = pr3Var;
                            boolean f7 = xq2Var3.f(pr3Var4);
                            w61 w61Var2 = w61Var;
                            boolean h6 = f7 | xq2Var3.h(w61Var2);
                            float f8 = floatValue;
                            boolean c2 = h6 | xq2Var3.c(f8);
                            Object P17 = xq2Var3.P();
                            if (c2 || P17 == obj5) {
                                P17 = new o4(pr3Var4, w61Var2, f8, 1);
                                xq2Var3.l0(P17);
                            }
                            a74 y = ge7.y(d4, (qn2) P17);
                            kk3 kk3Var2 = kk3Var;
                            boolean d5 = xq2Var3.d(kk3Var2.ordinal());
                            final List list6 = list;
                            boolean h7 = d5 | xq2Var3.h(list6);
                            final ts4 ts4Var2 = ts4Var;
                            boolean f9 = h7 | xq2Var3.f(ts4Var2);
                            Object P18 = xq2Var3.P();
                            if (f9 || P18 == obj5) {
                                P18 = new p5(list6, kk3Var2, ts4Var2);
                                xq2Var3.l0(P18);
                            }
                            a74 A = u24.A(y, (qn2) P18);
                            long j2 = a2;
                            boolean e3 = xq2Var3.e(j2);
                            Object P19 = xq2Var3.P();
                            if (e3 || P19 == obj5) {
                                P19 = new t4(0, j2);
                                xq2Var3.l0(P19);
                            }
                            a74 x = q60.x(A, (qn2) P19);
                            c40 c40Var = d90.l0;
                            pq4 pq4Var = new pq4(16.0f, 2.0f, 16.0f, 40.0f);
                            boolean h8 = xq2Var3.h(list6) | xq2Var3.f(ts4Var2) | xq2Var3.f(qa4Var5);
                            final List list7 = list3;
                            boolean h9 = h8 | xq2Var3.h(list7);
                            final qa4 qa4Var6 = qa4Var3;
                            boolean f10 = h9 | xq2Var3.f(qa4Var6);
                            final qa4 qa4Var7 = qa4Var4;
                            final List list8 = list5;
                            boolean f11 = f10 | xq2Var3.f(qa4Var7) | xq2Var3.h(list8);
                            final boolean z6 = z4;
                            final Set set4 = set;
                            final eo2 eo2Var5 = eo2Var;
                            final qn2 qn2Var5 = qn2Var2;
                            final c6 c6Var2 = c6Var;
                            boolean g2 = f11 | xq2Var3.g(z6) | xq2Var3.h(set4) | xq2Var3.f(eo2Var5) | xq2Var3.f(qn2Var5) | xq2Var3.h(c6Var2);
                            Object P20 = xq2Var3.P();
                            if (g2 || P20 == obj5) {
                                final qa4 qa4Var8 = qa4Var;
                                Object obj6 = new qn2() { // from class: z4
                                    @Override // defpackage.qn2
                                    public final Object g(Object obj7) {
                                        er3 er3Var = (er3) obj7;
                                        er3Var.getClass();
                                        List list9 = list6;
                                        if (list9.size() > 1) {
                                            er3.g0(er3Var, null, null, new zv0(777685903, true, new l4(0, list9, ts4Var2)), 3);
                                        }
                                        if (((l6) qa4Var5.getValue()) != l6.Leaderboards) {
                                            er3.g0(er3Var, null, "filters", new zv0(-540957320, true, new m4(list7, qa4Var6, qa4Var7, 0)), 1);
                                        }
                                        List<h3> list10 = list8;
                                        boolean isEmpty = list10.isEmpty();
                                        boolean z7 = z6;
                                        if (isEmpty && !z7) {
                                            er3.g0(er3Var, null, "achievement", f04.b, 1);
                                        }
                                        for (h3 h3Var2 : list10) {
                                            er3.g0(er3Var, null, "bucket-header", new zv0(-56377967, true, new ov4(h3Var2, 1)), 1);
                                            List list11 = h3Var2.b;
                                            er3Var.h0(list11.size(), null, new r5(2, new k4(1), list11), new zv0(802480018, true, new t5(0, qn2Var5, set4, eo2Var5, list11)));
                                        }
                                        if (z7) {
                                            er3.g0(er3Var, null, "leaderboard-header", f04.c, 1);
                                            List list12 = c6Var2.g;
                                            er3Var.h0(list12.size(), new r5(0, new k4(2), list12), new r5(1, new k4(3), list12), new zv0(802480018, true, new s5(list12, qa4Var8, 0)));
                                        }
                                        return jg7.a;
                                    }
                                };
                                xq2Var3.l0(obj6);
                                P20 = obj6;
                            }
                            gi2.e(x, pr3Var4, pq4Var, null, c40Var, null, false, null, (qn2) P20, xq2Var3, 196608, 472);
                            xq2Var3.p(true);
                        } else {
                            xq2Var3.V();
                        }
                        return jg7.a;
                    }
                }, xq2Var), xq2Var, 56);
            } else {
                long j2 = ta5Var.a;
                xq2Var2.b0(1528353380);
                boolean e3 = xq2Var2.e(j2);
                Object P16 = xq2Var2.P();
                if (e3 || P16 == vs0Var) {
                    P16 = new ts4(0L);
                    xq2Var2.l0(P16);
                }
                ts4 ts4Var2 = (ts4) P16;
                boolean e4 = xq2Var2.e(j2);
                Object P17 = xq2Var2.P();
                if (e4 || P17 == vs0Var) {
                    P17 = np2.Y(qs3.b);
                    xq2Var2.l0(P17);
                }
                qa4 qa4Var5 = (qa4) P17;
                Long valueOf = Long.valueOf(j2);
                Long valueOf2 = Long.valueOf(ts4Var2.h());
                boolean f6 = xq2Var2.f(qa4Var5) | xq2Var2.h(eo2Var2) | xq2Var2.h(ta5Var);
                Object P18 = xq2Var2.P();
                if (f6 || P18 == vs0Var) {
                    P18 = new l5(eo2Var2, ta5Var, qa4Var5, (r41) null);
                    xq2Var2.l0(P18);
                }
                mb3.j(valueOf, valueOf2, (eo2) P18, xq2Var2);
                ss3 ss3Var = (ss3) qa4Var5.getValue();
                Object P19 = xq2Var2.P();
                if (P19 == vs0Var) {
                    P19 = new f4(qa4Var, 2);
                    xq2Var2.l0(P19);
                }
                on2 on2Var = (on2) P19;
                boolean f7 = xq2Var2.f(ts4Var2);
                Object P20 = xq2Var2.P();
                if (!f7 && P20 != vs0Var) {
                    z2 = false;
                } else {
                    z2 = false;
                    P20 = new a5(ts4Var2, 0);
                    xq2Var2.l0(P20);
                }
                m(a74Var, ta5Var, ss3Var, on2Var, (on2) P20, qn2Var, xq2Var2, ((i3 << 3) & 458752) | (i3 & 14) | 3072);
                xq2Var2.p(z2);
                cf5 t2 = xq2Var2.t();
                if (t2 != null) {
                    t2.d = new eo2() { // from class: y4
                        @Override // defpackage.eo2
                        public final Object o(Object obj22, Object obj3) {
                            int i122 = r10;
                            jg7 jg7Var = jg7.a;
                            int i13 = i2;
                            switch (i122) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int a0 = ii2.a0(i13 | 1);
                                    nc1.e(a74Var, list, set, eo2Var, qn2Var, eo2Var2, pr3Var, qn2Var2, (px0) obj22, a0);
                                    return jg7Var;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    int a02 = ii2.a0(i13 | 1);
                                    nc1.e(a74Var, list, set, eo2Var, qn2Var, eo2Var2, pr3Var, qn2Var2, (px0) obj22, a02);
                                    return jg7Var;
                                default:
                                    ((Integer) obj3).getClass();
                                    int a03 = ii2.a0(i13 | 1);
                                    nc1.e(a74Var, list, set, eo2Var, qn2Var, eo2Var2, pr3Var, qn2Var2, (px0) obj22, a03);
                                    return jg7Var;
                            }
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t3 = xq2Var.t();
        if (t3 != null) {
            t3.d = new eo2() { // from class: y4
                @Override // defpackage.eo2
                public final Object o(Object obj22, Object obj3) {
                    int i122 = r10;
                    jg7 jg7Var = jg7.a;
                    int i13 = i2;
                    switch (i122) {
                        case 0:
                            ((Integer) obj3).getClass();
                            int a0 = ii2.a0(i13 | 1);
                            nc1.e(a74Var, list, set, eo2Var, qn2Var, eo2Var2, pr3Var, qn2Var2, (px0) obj22, a0);
                            return jg7Var;
                        case 1:
                            ((Integer) obj3).getClass();
                            int a02 = ii2.a0(i13 | 1);
                            nc1.e(a74Var, list, set, eo2Var, qn2Var, eo2Var2, pr3Var, qn2Var2, (px0) obj22, a02);
                            return jg7Var;
                        default:
                            ((Integer) obj3).getClass();
                            int a03 = ii2.a0(i13 | 1);
                            nc1.e(a74Var, list, set, eo2Var, qn2Var, eo2Var2, pr3Var, qn2Var2, (px0) obj22, a03);
                            return jg7Var;
                    }
                }
            };
        }
    }

    public static final eg4 e0(xg1 xg1Var) {
        if (!((z64) xg1Var).A.j0) {
            p53.c("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        eg4 d0 = d0(xg1Var, 2);
        if (!d0.Y0().j0) {
            p53.c("LayoutCoordinates is not attached.");
        }
        return d0;
    }

    public static final long f(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final sm3 f0(xg1 xg1Var) {
        eg4 eg4Var = ((z64) xg1Var).A.d0;
        if (eg4Var != null) {
            return eg4Var.k0;
        }
        throw i61.e("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final void g(hq1 hq1Var, final boolean z, final String str, a74 a74Var, String str2, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        a74 a74Var2;
        boolean z3;
        boolean z4;
        gn gnVar;
        eo2 v50Var;
        final qa4 qa4Var;
        gn gnVar2;
        Boolean bool;
        Boolean bool2;
        float f2;
        final boolean z5;
        final boolean z6;
        final boolean z7;
        float f3;
        float f4;
        hq1Var.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1047753199);
        if (xq2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i2 | i3;
        if (xq2Var.f(str)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4 | 3072;
        if (xq2Var.f(str2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if (xq2Var.h(on2Var)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i10 = i9 | i6;
        if ((74899 & i10) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i10 & 1, z2)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = nb3.b(RecyclerView.B1);
                xq2Var.l0(P);
            }
            gn gnVar3 = (gn) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = nb3.b(RecyclerView.B1);
                xq2Var.l0(P2);
            }
            gn gnVar4 = (gn) P2;
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = np2.Y(Boolean.FALSE);
                xq2Var.l0(P3);
            }
            qa4 qa4Var2 = (qa4) P3;
            boolean h2 = xq2Var.h(gnVar3);
            Object P4 = xq2Var.P();
            if (h2 || P4 == vs0Var) {
                P4 = new gq1(gnVar3, qa4Var2, null, 0);
                xq2Var.l0(P4);
            }
            mb3.i(xq2Var, (eo2) P4, jg7.a);
            Boolean valueOf = Boolean.valueOf(z);
            Boolean bool3 = (Boolean) qa4Var2.getValue();
            bool3.getClass();
            if ((i10 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h3 = z3 | xq2Var.h(gnVar4);
            if ((i10 & 458752) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z4 | h3;
            Object P5 = xq2Var.P();
            if (z8 || P5 == vs0Var) {
                gnVar = gnVar3;
                qa4Var = qa4Var2;
                gnVar2 = gnVar4;
                bool = valueOf;
                bool2 = bool3;
                f2 = RecyclerView.B1;
                v50Var = new v50(z, gnVar2, on2Var, qa4Var, null, 1);
                xq2Var.l0(v50Var);
            } else {
                gnVar = gnVar3;
                qa4Var = qa4Var2;
                bool2 = bool3;
                gnVar2 = gnVar4;
                f2 = RecyclerView.B1;
                v50Var = P5;
                bool = valueOf;
            }
            mb3.j(bool, bool2, v50Var, xq2Var);
            float floatValue = ((Number) gnVar.d()).floatValue();
            float h0 = 1.0f - h0(((Number) gnVar2.d()).floatValue());
            hq1 hq1Var2 = hq1.BOTH;
            if (hq1Var != hq1Var2 && hq1Var != hq1.TOP) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (hq1Var != hq1Var2 && hq1Var != hq1.BOTTOM) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (hq1Var == hq1Var2) {
                z7 = true;
            } else {
                z7 = false;
            }
            final float h02 = h0((floatValue - 0.04f) / 0.42f);
            final float h03 = h0(gi2.p((floatValue - 0.42f) / 0.34f, f2, 1.0f));
            final float p2 = gi2.p((floatValue - 0.58f) / 0.32f, f2, 1.0f);
            final float p3 = gi2.p((floatValue - 0.16f) / 0.2f, f2, 1.0f);
            if (z7) {
                f3 = 0.36f;
            } else {
                f3 = 0.48f;
            }
            final float f5 = f3;
            a74 L = vy7.L(jw2.j(dj6.c, h0), es7.r, u24.m);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, L);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            vs0 vs0Var2 = vs0.Y;
            if (z7) {
                f4 = 0.78f;
            } else {
                f4 = 0.64f;
            }
            a74Var2 = x64.a;
            nw7.j(ge7.P(ak7.I(vy7.J(u24.g(dj6.b(a74Var2, f4), z16.b(20.0f)), d90.m(hf.c0(new kt0(hv.c(4279835168L)), new kt0(hv.c(4279045650L))), RecyclerView.B1, RecyclerView.B1, 14)), 1.0f, kt0.c(0.05f, kt0.d), z16.b(20.0f)), 18.0f, 16.0f), null, n16.I(-920238867, new fo2() { // from class: xp1
                @Override // defpackage.fo2
                public final Object e(Object obj, Object obj2, Object obj3) {
                    boolean z9;
                    a74 a74Var3;
                    int i11;
                    l70 l70Var = (l70) obj;
                    px0 px0Var2 = (px0) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    l70Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (((xq2) px0Var2).f(l70Var)) {
                            i11 = 4;
                        } else {
                            i11 = 2;
                        }
                        intValue |= i11;
                    }
                    if ((intValue & 19) != 18) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    xq2 xq2Var2 = (xq2) px0Var2;
                    if (xq2Var2.S(intValue & 1, z9)) {
                        float a2 = l70Var.a() * f5;
                        c40 c40Var = d90.l0;
                        x64 x64Var = x64.a;
                        a74 b2 = dj6.b(x64Var, 1.0f);
                        yt0 a3 = wt0.a(ju.d, c40Var, xq2Var2, 54);
                        int hashCode2 = Long.hashCode(xq2Var2.T);
                        xv4 l3 = xq2Var2.l();
                        a74 E2 = l.E(xq2Var2, b2);
                        jx0.i.getClass();
                        iy0 iy0Var2 = ix0.b;
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(iy0Var2);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, ix0.f, a3);
                        yh2.K(xq2Var2, ix0.e, l3);
                        yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode2));
                        yh2.F(xq2Var2, ix0.h);
                        yh2.K(xq2Var2, ix0.d, E2);
                        boolean z10 = z5;
                        float f6 = h03;
                        boolean z11 = z7;
                        float f7 = h02;
                        float f8 = p2;
                        if (z10) {
                            xq2Var2.b0(1214458387);
                            a74 H = ak7.H(dj6.e(x64Var, a2), 1.3333334f);
                            if (z11) {
                                xq2Var2.b0(1214748020);
                                boolean c2 = xq2Var2.c(f7);
                                Object P6 = xq2Var2.P();
                                if (c2 || P6 == ox0.a) {
                                    P6 = new aq1(0, f7);
                                    xq2Var2.l0(P6);
                                }
                                a74Var3 = hv.G(x64Var, (qn2) P6);
                                xq2Var2.p(false);
                            } else {
                                xq2Var2.b0(1215043791);
                                xq2Var2.p(false);
                                a74Var3 = x64Var;
                            }
                            nc1.i(f6, H.d(a74Var3), n16.I(2725160, new bq1(f8), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                            xq2Var2.p(false);
                        } else {
                            xq2Var2.b0(1215269471);
                            xq2Var2.p(false);
                        }
                        if (z11) {
                            xq2Var2.b0(1215316436);
                            h70.a(vy7.L(u24.g(dj6.e(dj6.l(ge7.Q(x64Var, RecyclerView.B1, 5.0f, 1), 52.0f), 2.0f), z16.a), kt0.c((f7 * 0.45f) + 0.2f, bl2.F(xq2Var2).j), u24.m), xq2Var2, 0);
                            xq2Var2.p(false);
                        } else {
                            xq2Var2.b0(1215696031);
                            xq2Var2.p(false);
                        }
                        if (z6) {
                            xq2Var2.b0(1215745538);
                            nc1.i(f6, ak7.H(dj6.e(x64Var, a2), 1.3333334f), n16.I(-2105757344, new cq1(str, z, f8, qa4Var), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                            xq2Var2.p(false);
                        } else {
                            xq2Var2.b0(1216234687);
                            xq2Var2.p(false);
                        }
                        xq2Var2.p(true);
                        nc1.u(p3, 0, xq2Var2, ge7.S(vs0.Y.n(x64Var, d90.e0), 2.0f, RecyclerView.B1, RecyclerView.B1, 2.0f, 6));
                    } else {
                        xq2Var2.V();
                    }
                    return jg7.a;
                }
            }, xq2Var), xq2Var, 3072);
            if (str2 != null && !qs6.v0(str2)) {
                xq2Var.b0(2039473322);
                String upperCase = str2.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                long c2 = hv.c(4288324272L);
                sr2 sr2Var = qs7.c;
                x37.b(upperCase, jw2.j(ge7.S(dj6.c(vs0Var2.n(a74Var2, d90.f0), 1.0f), 32.0f, RecyclerView.B1, 32.0f, 22.0f, 2), p2), c2, hi2.E(11), null, sr2Var, hi2.D(1.2d), new wz6(3), hi2.E(15), 0, false, 0, 0, null, null, xq2Var, 14159232, 6, 129328);
                xq2Var.p(false);
            } else {
                xq2Var.b0(2040006987);
                xq2Var.p(false);
            }
            xq2Var.p(true);
        } else {
            xq2Var.V();
            a74Var2 = a74Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new zp1(hq1Var, z, str, a74Var2, str2, on2Var, i2);
        }
    }

    public static final zp4 g0(xg1 xg1Var) {
        zp4 zp4Var = f0(xg1Var).k0;
        if (zp4Var != null) {
            return zp4Var;
        }
        throw i61.e("This node does not have an owner.");
    }

    public static final void h(final String str, final boolean z, final float f2, px0 px0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        String str2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1957019050);
        if (xq2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (xq2Var.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (xq2Var.c(f2)) {
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
        if (xq2Var.S(i8 & 1, z2)) {
            c40 c40Var = d90.l0;
            x64 x64Var = x64.a;
            a74 Q = ge7.Q(jw2.j(x64Var, f2), 10.0f, RecyclerView.B1, 2);
            yt0 a2 = wt0.a(ju.c, c40Var, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, Q);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            if (str != null) {
                str2 = str.toUpperCase(Locale.ROOT);
                str2.getClass();
            } else {
                str2 = "NINTENDO DS";
            }
            long c2 = hv.c(4289969095L);
            sr2 sr2Var = qs7.c;
            String str3 = str2;
            x37.b(str3, null, c2, hi2.E(11), oj2.d0, sr2Var, hi2.E(1), new wz6(3), hi2.E(14), 2, false, 2, 0, null, null, xq2Var, 14355840, 3126, 119058);
            xq2Var = xq2Var;
            if (z) {
                xq2Var.b0(1182857542);
                gi2.h(xq2Var, dj6.e(x64Var, 7.0f));
                r(hv.c(4286350482L), xq2Var, 6);
                xq2Var.p(false);
            } else {
                xq2Var.b0(1182957486);
                xq2Var.p(false);
            }
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(str, z, f2, i2) { // from class: dq1
                public final /* synthetic */ String A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ float L;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1);
                    nc1.h(this.A, this.B, this.L, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final float h0(float f2) {
        float p2 = gi2.p(f2, RecyclerView.B1, 1.0f);
        return (3.0f - (p2 * 2.0f)) * p2 * p2;
    }

    public static final void i(final float f2, final a74 a74Var, final zv0 zv0Var, px0 px0Var, final int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1778930922);
        if (xq2Var.c(f2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (xq2Var.f(a74Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            long j2 = bl2.F(xq2Var).j;
            a74 g2 = u24.g(a74Var, z16.b(9.0f));
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var.P();
            if (z2 || P == ox0.a) {
                P = new aq1(1, f2);
                xq2Var.l0(P);
            }
            a74 I = ak7.I(q60.v(g2, (qn2) P), 1.0f, kt0.c(0.3f * f2, j2), z16.b(9.0f));
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, I);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            zv0Var.o(xq2Var, 6);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(f2, a74Var, zv0Var, i2) { // from class: eq1
                public final /* synthetic */ float A;
                public final /* synthetic */ a74 B;
                public final /* synthetic */ zv0 L;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(385);
                    nc1.i(this.A, this.B, this.L, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final String i0(r41 r41Var) {
        Object em5Var;
        if (r41Var instanceof nk1) {
            return ((nk1) r41Var).toString();
        }
        try {
            em5Var = r41Var + '@' + P(r41Var);
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (hm5.a(em5Var) != null) {
            em5Var = r41Var.getClass().getName() + '@' + P(r41Var);
        }
        return (String) em5Var;
    }

    public static final void j(float f2, px0 px0Var, int i2) {
        int i3;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1634967559);
        if (xq2Var.c(f2)) {
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
            d40 d40Var = d90.i0;
            a74 j2 = jw2.j(x64.a, f2);
            l26 a2 = k26.a(ju.a, d40Var, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, j2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            long c2 = hv.c(4293060848L);
            pi2 pi2Var = qs7.a;
            oj2 oj2Var = oj2.e0;
            x37.b("STORM ", null, c2, hi2.E(20), oj2Var, pi2Var, 0L, null, hi2.E(20), 0, false, 0, 0, null, null, xq2Var, 1772934, 6, 129938);
            x37.b("DS", null, hv.c(4278248959L), hi2.E(20), oj2Var, pi2Var, 0L, null, hi2.E(20), 0, false, 0, 0, null, null, xq2Var, 1772934, 6, 129938);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new bq1(i2, f2);
        }
    }

    public static final a74 j0(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new qx6(qn2Var));
    }

    public static final void k(c46 c46Var, List list, on2 on2Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2059687881);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(c46Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.h(list)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(on2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(qn2Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            nw7.o(on2Var, null, n16.I(1813634464, new f46(bl2.F(xq2Var), c46Var, on2Var, list, qn2Var, 1), xq2Var), xq2Var, ((i3 >> 6) & 14) | RendererDebugBridge.CAPTURE_HEIGHT, 2);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new i10(c46Var, list, on2Var, qn2Var, i2);
        }
    }

    public static float k0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final void l(a74 a74Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2032668943);
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
            a74 O = ge7.O(a74Var, 32.0f);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
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
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(yh2.O(xq2Var, R.string.retro_achievements_no_achievements), null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130558);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new f5(a74Var, i2, 0, (byte) 0);
        }
    }

    public static final void m(a74 a74Var, ta5 ta5Var, ss3 ss3Var, on2 on2Var, on2 on2Var2, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        ss3 ss3Var2;
        on2 on2Var3;
        on2 on2Var4;
        qn2 qn2Var2;
        boolean z;
        xq2 xq2Var;
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
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-951879649);
        if ((i2 & 6) == 0) {
            if (xq2Var2.f(a74Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var2.h(ta5Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            ss3Var2 = ss3Var;
            if (xq2Var2.f(ss3Var2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        } else {
            ss3Var2 = ss3Var;
        }
        if ((i2 & 3072) == 0) {
            on2Var3 = on2Var;
            if (xq2Var2.h(on2Var3)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        } else {
            on2Var3 = on2Var;
        }
        if ((i2 & 24576) == 0) {
            on2Var4 = on2Var2;
            if (xq2Var2.h(on2Var4)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        } else {
            on2Var4 = on2Var2;
        }
        if ((196608 & i2) == 0) {
            qn2Var2 = qn2Var;
            if (xq2Var2.h(qn2Var2)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        } else {
            qn2Var2 = qn2Var;
        }
        int i10 = i3;
        if ((74899 & i10) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i10 & 1, z)) {
            c40 c40Var = d90.l0;
            pq4 i11 = ge7.i(1, RecyclerView.B1);
            boolean h2 = xq2Var2.h(ta5Var);
            if ((i10 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = h2 | z2;
            if ((i10 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z6 | z3;
            if ((458752 & i10) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            if ((57344 & i10) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            Object P = xq2Var2.P();
            if (z9 || P == ox0.a) {
                d5 d5Var = new d5(ss3Var2, ta5Var, on2Var3, qn2Var2, on2Var4);
                xq2Var2.l0(d5Var);
                P = d5Var;
            }
            xq2Var = xq2Var2;
            gi2.e(a74Var, null, i11, null, c40Var, null, false, null, (qn2) P, xq2Var, (i10 & 14) | 196992, 474);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new e5(a74Var, ta5Var, ss3Var, on2Var, on2Var2, qn2Var, i2);
        }
    }

    public static final void n(a74 a74Var, za5 za5Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        za5 za5Var2;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-959915823);
        if (xq2Var.h(za5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i2 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            a74 P = ge7.P(a74Var, 16.0f, 8.0f);
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
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
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 l3 = dj6.l(x64.a, 56.0f);
            String g2 = lb1.g(za5Var.b, "#");
            nq6 nq6Var = ye7.b;
            s47 s47Var = ((xe7) xq2Var.j(nq6Var)).j;
            oj2 oj2Var = oj2.e0;
            nq6 nq6Var2 = vt0.a;
            i4 = 1;
            x37.b(g2, l3, ((ut0) xq2Var.j(nq6Var2)).i(), 0L, oj2Var, null, 0L, null, 0L, 0, false, 0, 0, null, s47Var, xq2Var, 196656, 0, 65496);
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E2 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            za5Var2 = za5Var;
            x37.b(za5Var2.a, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((xe7) xq2Var.j(nq6Var)).i, xq2Var, 0, 3120, 55294);
            x37.b(za5Var2.d, null, kt0.c(0.72f, ((ut0) xq2Var.j(nq6Var2)).f()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var.j(nq6Var)).j, xq2Var, 0, 0, 65530);
            xq2Var = xq2Var;
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            za5Var2 = za5Var;
            i4 = 1;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(a74Var, i2, i4, za5Var2);
        }
    }

    public static final void o(a74 a74Var, final ta5 ta5Var, ss3 ss3Var, on2 on2Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        final qn2 qn2Var2;
        String str;
        boolean z2;
        final qn2 qn2Var3;
        int i7;
        vs0 vs0Var;
        boolean z3;
        boolean z4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(564527569);
        if (xq2Var.h(ta5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i2 | i3;
        if (xq2Var.f(ss3Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i11 & 1, z)) {
            c40 c40Var = d90.k0;
            eu euVar = ju.c;
            yt0 a2 = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
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
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            x64 x64Var = x64.a;
            a74 c2 = dj6.c(x64Var, 1.0f);
            l26 a3 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, c2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            ej2.b(on2Var, null, false, f04.g, xq2Var, ((i11 >> 9) & 14) | 24576, 14);
            gi2.h(xq2Var, dj6.l(x64Var, 4.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a4 = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E3 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a4);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            String str2 = ta5Var.g;
            nq6 nq6Var = ye7.b;
            x37.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, ((xe7) xq2Var.j(nq6Var)).f, xq2Var, 0, 3120, 55294);
            if (ss3Var instanceof rs3) {
                xq2Var.b0(661371107);
                str = yh2.N(R.string.leaderboard_total_entries, new Object[]{Integer.valueOf(((rs3) ss3Var).a.b)}, xq2Var);
                xq2Var.p(false);
            } else {
                xq2Var.b0(661500191);
                xq2Var.p(false);
                str = ta5Var.e;
            }
            s47 s47Var = ((xe7) xq2Var.j(nq6Var)).l;
            nq6 nq6Var2 = vt0.a;
            x37.b(str, null, kt0.c(0.64f, ((ut0) xq2Var.j(nq6Var2)).f()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47Var, xq2Var, 0, 0, 65530);
            xq2 xq2Var2 = xq2Var;
            xq2Var2.p(true);
            int i12 = i11 & 57344;
            if (i12 == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h2 = xq2Var2.h(ta5Var) | z2;
            Object P = xq2Var2.P();
            vs0 vs0Var2 = ox0.a;
            if (!h2 && P != vs0Var2) {
                qn2Var3 = qn2Var;
            } else {
                qn2Var3 = qn2Var;
                P = new on2() { // from class: s4
                    @Override // defpackage.on2
                    public final Object c() {
                        int i13 = r3;
                        jg7 jg7Var = jg7.a;
                        ta5 ta5Var2 = ta5Var;
                        qn2 qn2Var4 = qn2Var3;
                        switch (i13) {
                            case 0:
                                qn2Var4.g(ta5Var2);
                                return jg7Var;
                            default:
                                qn2Var4.g(ta5Var2);
                                return jg7Var;
                        }
                    }
                };
                xq2Var2.l0(P);
            }
            ej2.b((on2) P, null, false, f04.h, xq2Var2, 24576, 14);
            xq2Var2.p(true);
            if (!qs6.v0(ta5Var.h)) {
                xq2Var2.b0(-83727040);
                a74 S = ge7.S(x64Var, 56.0f, 4.0f, 8.0f, RecyclerView.B1, 8);
                String str3 = ta5Var.h;
                s47 s47Var2 = ((xe7) xq2Var2.j(nq6Var)).j;
                vs0Var = vs0Var2;
                i7 = i12;
                qn2Var2 = qn2Var;
                x37.b(str3, S, kt0.c(0.72f, ((ut0) xq2Var2.j(nq6Var2)).f()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47Var2, xq2Var2, 48, 0, 65528);
                xq2Var2 = xq2Var2;
                xq2Var2.p(false);
            } else {
                i7 = i12;
                vs0Var = vs0Var2;
                qn2Var2 = qn2Var3;
                xq2Var2.b0(-83445157);
                xq2Var2.p(false);
            }
            a74 S2 = ge7.S(x64Var, 48.0f, 4.0f, RecyclerView.B1, RecyclerView.B1, 12);
            if (i7 == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h3 = xq2Var2.h(ta5Var) | z3;
            Object P2 = xq2Var2.P();
            if (!h3 && P2 != vs0Var) {
                z4 = true;
            } else {
                z4 = true;
                P2 = new on2() { // from class: s4
                    @Override // defpackage.on2
                    public final Object c() {
                        int i13 = r3;
                        jg7 jg7Var = jg7.a;
                        ta5 ta5Var2 = ta5Var;
                        qn2 qn2Var4 = qn2Var2;
                        switch (i13) {
                            case 0:
                                qn2Var4.g(ta5Var2);
                                return jg7Var;
                            default:
                                qn2Var4.g(ta5Var2);
                                return jg7Var;
                        }
                    }
                };
                xq2Var2.l0(P2);
            }
            xq2 xq2Var3 = xq2Var2;
            mb3.o((on2) P2, S2, false, null, f04.i, xq2Var3, 805306416, 508);
            xq2Var = xq2Var3;
            xq2Var.p(z4);
        } else {
            qn2Var2 = qn2Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ne4(a74Var, ta5Var, ss3Var, on2Var, qn2Var2, i2);
        }
    }

    public static final void p(a74 a74Var, ta5 ta5Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(611316189);
        if (xq2Var.h(ta5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i2 | i3;
        if (xq2Var.h(on2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            a74 P = ge7.P(mb3.u(a74Var, false, null, on2Var, 15), 16.0f, 8.0f);
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
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
            yh2.K(xq2Var, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            e33 C = ej2.C();
            x64 x64Var = x64.a;
            i13.a(C, null, dj6.i(x64Var, 52.0f), gi2.E(xq2Var).i(), xq2Var, 432, 0);
            gi2.h(xq2Var, dj6.l(x64Var, 12.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E2 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(ta5Var.g, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gi2.I(xq2Var).i, xq2Var, 0, 3120, 55294);
            xq2 xq2Var2 = xq2Var;
            if (!qs6.v0(ta5Var.h)) {
                xq2Var2.b0(-1702891504);
                x37.b(ta5Var.h, null, kt0.c(0.72f, gi2.E(xq2Var2).f()), 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, gi2.I(xq2Var2).j, xq2Var2, 0, 3120, 55290);
                xq2Var2 = xq2Var2;
                xq2Var2.p(false);
            } else {
                xq2Var2.b0(-1702586433);
                xq2Var2.p(false);
            }
            xq2 xq2Var3 = xq2Var2;
            x37.b(ta5Var.e, null, kt0.c(0.56f, gi2.E(xq2Var2).f()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gi2.I(xq2Var2).l, xq2Var3, 0, 0, 65530);
            x37.b(yh2.O(xq2Var3, R.string.leaderboard_view_ranking), null, gi2.E(xq2Var3).i(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gi2.I(xq2Var3).l, xq2Var3, 0, 0, 65530);
            xq2Var = xq2Var3;
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(a74Var, ta5Var, on2Var, i2, 1);
        }
    }

    public static final void q(a74 a74Var, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2119940746);
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
            if (xq2Var.h(on2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            yt0 a2 = wt0.a(new gu(32.0f, true, new i(1)), d90.l0, xq2Var, 54);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x37.b(yh2.O(xq2Var, R.string.retro_achievements_load_error), null, 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130558);
            i4 = 0;
            xq2Var = xq2Var;
            mb3.a(on2Var, null, false, null, null, null, mb3.I(xq2Var), null, f04.j, xq2Var, ((i3 >> 3) & 14) | 805306368, 382);
            xq2Var.p(true);
        } else {
            i4 = 0;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new v4(a74Var, on2Var, i2, i4);
        }
    }

    public static final void r(long j2, px0 px0Var, int i2) {
        boolean z;
        boolean z2;
        float f2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-577745276);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            e53 h2 = yh2.h(yh2.H("dsBootDots", xq2Var, 0), RecyclerView.B1, 3.0f, ge7.G(ge7.Y(1050, 0, ir1.c, 2), null, 6), "dsBootDotsPhase", xq2Var, 29112, 0);
            l26 a2 = k26.a(ju.a, d90.h0, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            x64 x64Var = x64.a;
            a74 E = l.E(xq2Var, x64Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            xq2Var.b0(-1459646081);
            for (int i3 = 0; i3 < 3; i3++) {
                if (((int) ((Number) h2.R.getValue()).floatValue()) % 3 == i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a74 g2 = u24.g(dj6.i(ge7.Q(x64Var, 2.0f, RecyclerView.B1, 2), 4.0f), z16.a);
                if (z2) {
                    f2 = 0.95f;
                } else {
                    f2 = 0.3f;
                }
                h70.a(vy7.L(g2, kt0.c(f2, j2), u24.m), xq2Var, 0);
            }
            xq2Var.p(false);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new yp1(j2, i2, 0);
        }
    }

    public static final void s(boolean z, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        long j2;
        long j3;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1099344387);
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
            es7 F = bl2.F(xq2Var);
            long j4 = es7.p;
            d40 d40Var = d90.i0;
            y16 b2 = z16.b(13.0f);
            x64 x64Var = x64.a;
            a74 g2 = u24.g(x64Var, b2);
            if (z) {
                j2 = j4;
            } else {
                j2 = F.d;
            }
            a74 P = ge7.P(mb3.u(vy7.L(g2, j2, u24.m), false, null, on2Var, 15), 10.0f, 4.0f);
            l26 a2 = k26.a(ju.a, d40Var, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, P);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            sr4 R = kj2.R(xq2Var, R.drawable.ic_status_warn);
            if (z) {
                j4 = kt0.b;
            }
            i13.b(R, null, dj6.i(x64Var, 11.0f), j4, xq2Var, 440, 0);
            gi2.h(xq2Var, dj6.l(x64Var, 4.0f));
            String O = yh2.O(xq2Var, R.string.retro_achievements_filter_missable);
            if (z) {
                j3 = kt0.b;
            } else {
                j3 = F.i;
            }
            x37.b(O, null, j3, hi2.D(8.5d), oj2.d0, qs7.c, hi2.D(0.4d), null, 0L, 0, false, 1, 0, null, null, xq2Var, 14355456, 3072, 122642);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new u4(z, on2Var, i2, 0);
        }
    }

    public static final aj t() {
        return new aj(new Paint(7));
    }

    public static final void u(float f2, int i2, px0 px0Var, a74 a74Var) {
        int i3;
        int i4;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-713067316);
        if (xq2Var.c(f2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (xq2Var.f(a74Var)) {
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
        if (xq2Var.S(i6 & 1, z)) {
            e53 h2 = yh2.h(yh2.H("dsBootLed", xq2Var, 0), 0.75f, 1.0f, ge7.G(ge7.Y(1300, 0, ir1.c, 2), ck5.Reverse, 4), "dsBootLedBreathe", xq2Var, 29112, 0);
            long j2 = bl2.F(xq2Var).l;
            float floatValue = ((Number) h2.R.getValue()).floatValue() * f2;
            a74 i7 = dj6.i(a74Var, 14.0f);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, i7);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            x64 x64Var = x64.a;
            a74 i8 = dj6.i(x64Var, 14.0f);
            y16 y16Var = z16.a;
            a74 g2 = u24.g(i8, y16Var);
            long c2 = kt0.c(0.3f * floatValue, j2);
            jy2 jy2Var = u24.m;
            h70.a(vy7.L(g2, c2, jy2Var), xq2Var, 0);
            h70.a(vy7.L(u24.g(dj6.i(x64Var, 6.0f), y16Var), kt0.c((floatValue * 0.55f) + 0.45f, j2), jy2Var), xq2Var, 0);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fq1(f2, i2, a74Var);
        }
    }

    public static final void v(a74 a74Var, l55 l55Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-714464401);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(l55Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        int i8 = i2 & RendererDebugBridge.CAPTURE_HEIGHT;
        zv0 zv0Var2 = e;
        if (i8 == 0) {
            if (xq2Var.h(zv0Var2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            Object P = xq2Var.P();
            if (P == ox0.a) {
                vs4 vs4Var = new vs4(null, vs0.j0);
                xq2Var.l0(vs4Var);
                P = vs4Var;
            }
            h30 E = E(zv0Var2, xq2Var, (i3 >> 6) & 14);
            hv.d(l55Var.a(E), n16.I(274270255, new p4(a74Var, (qa4) P, zv0Var, E, 1), xq2Var), xq2Var, 56);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(a74Var, l55Var, zv0Var, i2, 1);
        }
    }

    public static final void w(c46 c46Var, on2 on2Var, qn2 qn2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        qn2 qn2Var2;
        xq2 xq2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1376377826);
        if (xq2Var2.h(c46Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (xq2Var2.h(qn2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i6 = i5 | i4;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i6 & 1, z)) {
            es7 F = bl2.F(xq2Var2);
            Object P = xq2Var2.P();
            if (P == ox0.a) {
                String str = c46Var.e;
                if (str == null) {
                    str = "";
                }
                P = np2.Y(str);
                xq2Var2.l0(P);
            }
            qn2Var2 = qn2Var;
            xq2Var = xq2Var2;
            nw7.o(on2Var, null, n16.I(-722327367, new d46(F, c46Var, (qa4) P, hf.c0("Перед боссом", "Чекпоинт", "Секрет", "Новая локация", "Перед развилкой", "Тест"), qn2Var, on2Var), xq2Var2), xq2Var, 390, 2);
        } else {
            qn2Var2 = qn2Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new e46(c46Var, on2Var, qn2Var2, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0895, code lost:
        if (r10 == null) goto L128;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void x(c46 c46Var, boolean z, String str, nh2 nh2Var, on2 on2Var, on2 on2Var2, on2 on2Var3, on2 on2Var4, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        on2 on2Var5;
        boolean z3;
        boolean z4;
        float f2;
        on2 on2Var6;
        float f3;
        long j2;
        long c2;
        pn pnVar;
        pn pnVar2;
        jy2 jy2Var;
        x64 x64Var;
        String str2;
        int i10;
        boolean z5;
        ne neVar;
        es7 es7Var;
        boolean z6;
        e40 e40Var;
        e40 e40Var2;
        es7 es7Var2;
        long j3;
        ?? r2;
        long c3;
        String g2;
        boolean z7;
        es7 es7Var3;
        String str3;
        es7 es7Var4;
        boolean z8;
        String l2;
        String str4;
        long j4;
        ne neVar2;
        pn pnVar3;
        e33 e33Var;
        float f4;
        pn pnVar4;
        pn pnVar5;
        c46 c46Var2 = c46Var;
        e40 e40Var3 = d90.Z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(284670636);
        if (xq2Var.h(c46Var2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i2 | i3;
        if (xq2Var.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i12 = i11 | i4;
        if (xq2Var.f(nh2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (xq2Var.h(on2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (xq2Var.h(on2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i15 = i14 | i7;
        if (xq2Var.h(on2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (xq2Var.h(on2Var4)) {
            i9 = 8388608;
        } else {
            i9 = Compress.MAXWINSIZE;
        }
        int i17 = i16 | i9;
        if ((4793363 & i17) != 4793362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i17 & 1, z2)) {
            es7 F = bl2.F(xq2Var);
            Context context = (Context) xq2Var.j(kf.b);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P;
            qa4 a2 = bw7.a(r94Var, xq2Var, 6);
            boolean z9 = c46Var2.b;
            String str5 = c46Var2.e;
            Uri uri = c46Var2.d;
            int i18 = c46Var2.a;
            boolean z10 = c46Var2.b;
            if (!z9 && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i18 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            y16 b2 = z16.b(12.0f);
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.getDefault());
                xq2Var.l0(P2);
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) P2;
            if (z3) {
                f2 = 1.0f;
            } else {
                f2 = 0.45f;
            }
            x64 x64Var2 = x64.a;
            a74 j5 = jw2.j(x64Var2, f2);
            if (nh2Var != null) {
                j5 = ak7.S(j5, nh2Var);
            }
            if (z10) {
                on2Var6 = on2Var3;
            } else {
                on2Var6 = null;
            }
            a74 v = mb3.v(j5, r94Var, z3, on2Var6, on2Var, 440);
            c40 c40Var = d90.k0;
            eu euVar = ju.c;
            yt0 a3 = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E = l.E(xq2Var, v);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar6 = ix0.f;
            yh2.K(xq2Var, pnVar6, a3);
            pn pnVar7 = ix0.e;
            yh2.K(xq2Var, pnVar7, l3);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar8 = ix0.g;
            yh2.K(xq2Var, pnVar8, valueOf);
            ne neVar3 = ix0.h;
            yh2.F(xq2Var, neVar3);
            pn pnVar9 = ix0.d;
            yh2.K(xq2Var, pnVar9, E);
            a74 g3 = u24.g(ak7.H(dj6.c(x64Var2, 1.0f), 1.3333334f), b2);
            long j6 = F.d;
            long j7 = F.j;
            jy2 jy2Var2 = u24.m;
            a74 L = vy7.L(g3, j6, jy2Var2);
            if (((Boolean) a2.getValue()).booleanValue()) {
                f3 = 2.5f;
            } else {
                f3 = 1.5f;
            }
            if (((Boolean) a2.getValue()).booleanValue()) {
                j2 = j7;
            } else {
                if (z4 && z10) {
                    c2 = kt0.c(0.85f, j7);
                    j2 = j7;
                } else {
                    j2 = j7;
                    j7 = F.f;
                    if (!z10) {
                        c2 = kt0.c(0.5f, j7);
                    }
                }
                j7 = c2;
            }
            a74 I = ak7.I(L, f3, j7, b2);
            e40 e40Var4 = d90.L;
            e34 d2 = h70.d(e40Var4, false);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E2 = l.E(xq2Var, I);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar6, d2);
            yh2.K(xq2Var, pnVar7, l4);
            i61.w(hashCode2, xq2Var, pnVar8, xq2Var, neVar3);
            yh2.K(xq2Var, pnVar9, E2);
            vs0 vs0Var2 = vs0.Y;
            if (z10 && uri != null) {
                xq2Var.b0(1024513123);
                x23 x23Var = new x23(context);
                x23Var.c = uri;
                pnVar = pnVar9;
                x64Var = x64Var2;
                jy2Var = jy2Var2;
                str2 = str5;
                i10 = i18;
                z5 = z10;
                pnVar2 = pnVar7;
                gi2.b(x23Var.a(), null, dj6.c, y31.a, RecyclerView.B1, xq2Var, 1573296, 4024);
                a74 n2 = vs0Var2.n(dj6.e(dj6.c(x64Var, 1.0f), 38.0f), d90.f0);
                int i19 = kt0.i;
                h70.a(vy7.J(n2, d90.m(hf.c0(new kt0(kt0.g), new kt0(kt0.c(0.75f, kt0.b))), RecyclerView.B1, RecyclerView.B1, 14)), xq2Var, 0);
                xq2Var.p(false);
                e40Var2 = e40Var4;
                neVar = neVar3;
                es7Var = F;
                r2 = 1;
                e40Var = e40Var3;
            } else {
                pnVar = pnVar9;
                pnVar2 = pnVar7;
                jy2Var = jy2Var2;
                x64Var = x64Var2;
                str2 = str5;
                i10 = i18;
                z5 = z10;
                if (!z5) {
                    xq2Var.b0(1025355765);
                    a74 n3 = vs0Var2.n(x64Var, e40Var3);
                    yt0 a4 = wt0.a(euVar, d90.l0, xq2Var, 48);
                    int hashCode3 = Long.hashCode(xq2Var.T);
                    xv4 l5 = xq2Var.l();
                    a74 E3 = l.E(xq2Var, n3);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar6, a4);
                    yh2.K(xq2Var, pnVar2, l5);
                    i61.w(hashCode3, xq2Var, pnVar8, xq2Var, neVar3);
                    yh2.K(xq2Var, pnVar, E3);
                    e33 e33Var2 = hf.q;
                    if (e33Var2 == null) {
                        d33 d33Var = new d33("Filled.AddCircleOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i20 = el7.a;
                        cn6 cn6Var = new cn6(kt0.b);
                        ww2 ww2Var = new ww2(1, (byte) 0);
                        ww2Var.o(13.0f, 7.0f);
                        ww2Var.l(-2.0f);
                        ww2Var.u(4.0f);
                        ww2Var.m(7.0f, 11.0f);
                        ww2Var.u(2.0f);
                        ww2Var.l(4.0f);
                        ww2Var.u(4.0f);
                        ww2Var.l(2.0f);
                        ww2Var.u(-4.0f);
                        ww2Var.l(4.0f);
                        ww2Var.u(-2.0f);
                        ww2Var.l(-4.0f);
                        ww2Var.m(13.0f, 7.0f);
                        ww2Var.g();
                        ww2Var.o(12.0f, 2.0f);
                        ww2Var.h(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        ww2Var.q(4.48f, 10.0f, 10.0f, 10.0f);
                        ww2Var.q(10.0f, -4.48f, 10.0f, -10.0f);
                        ww2Var.p(17.52f, 2.0f, 12.0f, 2.0f);
                        ww2Var.g();
                        ww2Var.o(12.0f, 20.0f);
                        ww2Var.i(-4.41f, RecyclerView.B1, -8.0f, -3.59f, -8.0f, -8.0f);
                        ww2Var.q(3.59f, -8.0f, 8.0f, -8.0f);
                        ww2Var.q(8.0f, 3.59f, 8.0f, 8.0f);
                        ww2Var.q(-3.59f, 8.0f, -8.0f, 8.0f);
                        ww2Var.g();
                        d33.a(d33Var, ww2Var.b, 0, cn6Var);
                        e33Var2 = d33Var.b();
                        hf.q = e33Var2;
                    }
                    pnVar = pnVar;
                    String O = yh2.O(xq2Var, R.string.save_state_empty_slot);
                    if (((Boolean) a2.getValue()).booleanValue()) {
                        j3 = j2;
                        es7Var2 = F;
                    } else {
                        es7Var2 = F;
                        j3 = es7Var2.i;
                    }
                    neVar = neVar3;
                    es7Var = es7Var2;
                    z6 = true;
                    e40Var = e40Var3;
                    i13.a(e33Var2, O, dj6.i(x64Var, 32.0f), j3, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                    gi2.h(xq2Var, dj6.e(x64Var, 4.0f));
                    x37.b("СВОБОДНЫЙ СЛОТ", null, es7Var.i, hi2.D(8.5d), oj2.Z, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772550, 0, 130962);
                    xq2Var = xq2Var;
                    xq2Var.p(true);
                    xq2Var.p(false);
                } else {
                    neVar = neVar3;
                    es7Var = F;
                    z6 = true;
                    e40Var = e40Var3;
                    xq2Var.b0(1026221626);
                    xq2Var.p(false);
                }
                e40Var2 = e40Var4;
                r2 = z6;
            }
            a74 g4 = u24.g(ge7.S(vs0Var2.n(x64Var, e40Var2), 8.0f, 8.0f, RecyclerView.B1, RecyclerView.B1, 12), z16.b(6.0f));
            if (z4) {
                c3 = j2;
            } else {
                int i21 = kt0.i;
                c3 = kt0.c(0.75f, kt0.b);
            }
            jy2 jy2Var3 = jy2Var;
            a74 P3 = ge7.P(vy7.L(g4, c3, jy2Var3), 7.0f, 3.0f);
            e34 d3 = h70.d(e40Var2, false);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l6 = xq2Var.l();
            a74 E4 = l.E(xq2Var, P3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar6, d3);
            yh2.K(xq2Var, pnVar2, l6);
            ne neVar4 = neVar;
            i61.w(hashCode4, xq2Var, pnVar8, xq2Var, neVar4);
            pn pnVar10 = pnVar;
            yh2.K(xq2Var, pnVar10, E4);
            if (z4) {
                g2 = "⚡ БЫСТРОЕ";
            } else {
                g2 = lb1.g(i10, "СЛОТ ");
            }
            int i22 = kt0.i;
            long j8 = kt0.d;
            sr2 sr2Var = qs7.c;
            xq2 xq2Var2 = xq2Var;
            x37.b(g2, null, j8, hi2.D(8.5d), oj2.e0, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772928, 0, 130962);
            xq2 xq2Var3 = xq2Var2;
            xq2Var3.p(r2);
            if (z5) {
                xq2Var3.b0(1027233559);
                a74 O2 = ge7.O(vs0Var2.n(x64Var, d90.X), 6.0f);
                l26 a5 = k26.a(new gu(4.0f, r2, new i((int) r2)), d90.h0, xq2Var3, 6);
                int hashCode5 = Long.hashCode(xq2Var3.T);
                xv4 l7 = xq2Var3.l();
                a74 E5 = l.E(xq2Var3, O2);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar6, a5);
                yh2.K(xq2Var3, pnVar2, l7);
                i61.w(hashCode5, xq2Var3, pnVar8, xq2Var3, neVar4);
                yh2.K(xq2Var3, pnVar10, E5);
                a74 i23 = dj6.i(x64Var, 24.0f);
                y16 y16Var = z16.a;
                a74 g5 = u24.g(i23, y16Var);
                es7Var3 = es7Var;
                long j9 = kt0.b;
                pn pnVar11 = pnVar2;
                a74 u = mb3.u(vy7.L(g5, kt0.c(0.65f, j9), jy2Var3), false, null, on2Var3, 15);
                e40 e40Var5 = e40Var;
                e34 d4 = h70.d(e40Var5, false);
                int hashCode6 = Long.hashCode(xq2Var3.T);
                xv4 l8 = xq2Var3.l();
                a74 E6 = l.E(xq2Var3, u);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar6, d4);
                yh2.K(xq2Var3, pnVar11, l8);
                i61.w(hashCode6, xq2Var3, pnVar8, xq2Var3, neVar4);
                yh2.K(xq2Var3, pnVar10, E6);
                e33 e33Var3 = l.k;
                if (e33Var3 != null) {
                    neVar2 = neVar4;
                    pnVar3 = pnVar10;
                    f4 = 13.0f;
                    e33Var = e33Var3;
                } else {
                    d33 d33Var2 = new d33("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i24 = el7.a;
                    cn6 cn6Var2 = new cn6(j9);
                    neVar2 = neVar4;
                    pnVar3 = pnVar10;
                    ww2 ww2Var2 = new ww2(1, (byte) 0);
                    ww2Var2.o(3.0f, 17.25f);
                    ww2Var2.t(21.0f);
                    ww2Var2.l(3.75f);
                    ww2Var2.m(17.81f, 9.94f);
                    ww2Var2.n(-3.75f, -3.75f);
                    ww2Var2.m(3.0f, 17.25f);
                    ww2Var2.g();
                    ww2Var2.o(20.71f, 7.04f);
                    ww2Var2.i(0.39f, -0.39f, 0.39f, -1.02f, RecyclerView.B1, -1.41f);
                    ww2Var2.n(-2.34f, -2.34f);
                    ww2Var2.i(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, RecyclerView.B1);
                    ww2Var2.n(-1.83f, 1.83f);
                    ww2Var2.n(3.75f, 3.75f);
                    ww2Var2.n(1.83f, -1.83f);
                    ww2Var2.g();
                    d33.a(d33Var2, ww2Var2.b, 0, cn6Var2);
                    e33 b3 = d33Var2.b();
                    l.k = b3;
                    e33Var = b3;
                    f4 = 13.0f;
                }
                ne neVar5 = neVar2;
                pn pnVar12 = pnVar3;
                i13.a(e33Var, "Переименовать", dj6.i(x64Var, f4), j8, xq2Var3, 3504, 0);
                xq2Var3.p(true);
                a74 u2 = mb3.u(vy7.L(u24.g(dj6.i(x64Var, 24.0f), y16Var), kt0.c(0.65f, j9), jy2Var3), false, null, on2Var4, 15);
                e34 d5 = h70.d(e40Var5, false);
                int hashCode7 = Long.hashCode(xq2Var3.T);
                xv4 l9 = xq2Var3.l();
                a74 E7 = l.E(xq2Var3, u2);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar6, d5);
                yh2.K(xq2Var3, pnVar11, l9);
                i61.w(hashCode7, xq2Var3, pnVar8, xq2Var3, neVar5);
                yh2.K(xq2Var3, pnVar12, E7);
                e33 e33Var4 = g04.l;
                if (e33Var4 != null) {
                    pnVar4 = pnVar11;
                    pnVar5 = pnVar12;
                } else {
                    d33 d33Var3 = new d33("Filled.ContentCopy", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i25 = el7.a;
                    cn6 cn6Var3 = new cn6(j9);
                    pnVar4 = pnVar11;
                    pnVar5 = pnVar12;
                    ww2 ww2Var3 = new ww2(1, (byte) 0);
                    ww2Var3.o(16.0f, 1.0f);
                    ww2Var3.m(4.0f, 1.0f);
                    ww2Var3.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
                    ww2Var3.u(14.0f);
                    ww2Var3.l(2.0f);
                    ww2Var3.m(4.0f, 3.0f);
                    ww2Var3.l(12.0f);
                    ww2Var3.m(16.0f, 1.0f);
                    ww2Var3.g();
                    ww2Var3.o(19.0f, 5.0f);
                    ww2Var3.m(8.0f, 5.0f);
                    ww2Var3.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
                    ww2Var3.u(14.0f);
                    ww2Var3.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                    ww2Var3.l(11.0f);
                    ww2Var3.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
                    ww2Var3.m(21.0f, 7.0f);
                    ww2Var3.i(RecyclerView.B1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                    ww2Var3.g();
                    ww2Var3.o(19.0f, 21.0f);
                    ww2Var3.m(8.0f, 21.0f);
                    ww2Var3.m(8.0f, 7.0f);
                    ww2Var3.l(11.0f);
                    ww2Var3.u(14.0f);
                    ww2Var3.g();
                    d33.a(d33Var3, ww2Var3.b, 0, cn6Var3);
                    e33Var4 = d33Var3.b();
                    g04.l = e33Var4;
                }
                pn pnVar13 = pnVar4;
                pn pnVar14 = pnVar5;
                i13.a(e33Var4, "Дублировать", dj6.i(x64Var, 13.0f), j8, xq2Var3, 3504, 0);
                xq2Var3.p(true);
                a74 L2 = vy7.L(u24.g(dj6.i(x64Var, 24.0f), y16Var), kt0.c(0.65f, j9), jy2Var3);
                on2Var5 = on2Var2;
                str3 = null;
                a74 u3 = mb3.u(L2, false, null, on2Var5, 15);
                e34 d6 = h70.d(e40Var5, false);
                int hashCode8 = Long.hashCode(xq2Var3.T);
                xv4 l10 = xq2Var3.l();
                a74 E8 = l.E(xq2Var3, u3);
                xq2Var3.f0();
                if (xq2Var3.S) {
                    xq2Var3.k(iy0Var);
                } else {
                    xq2Var3.o0();
                }
                yh2.K(xq2Var3, pnVar6, d6);
                yh2.K(xq2Var3, pnVar13, l10);
                i61.w(hashCode8, xq2Var3, pnVar8, xq2Var3, neVar5);
                yh2.K(xq2Var3, pnVar14, E8);
                i13.a(nb3.x(), "Удалить", dj6.i(x64Var, 13.0f), hv.c(4294922834L), xq2Var3, 3504, 0);
                z7 = true;
                i61.y(xq2Var3, true, true, false);
            } else {
                z7 = r2;
                es7Var3 = es7Var;
                str3 = null;
                on2Var5 = on2Var2;
                xq2Var3.b0(1029604346);
                xq2Var3.p(false);
            }
            xq2Var3.p(z7);
            if (z5) {
                xq2Var3.b0(-930355032);
                if (str2 != null) {
                    if (!qs6.v0(str2)) {
                        str4 = str2;
                    } else {
                        str4 = str3;
                    }
                }
                str4 = "Без названия";
                String concat = "🏷️ ".concat(str4);
                if (str2 == null || qs6.v0(str2)) {
                    es7Var4 = es7Var3;
                    j4 = es7Var4.h;
                } else {
                    es7Var4 = es7Var3;
                    j4 = j2;
                }
                x37.b(concat, ge7.S(x64Var, 2.0f, 6.0f, RecyclerView.B1, RecyclerView.B1, 12), j4, hi2.E(11), oj2.d0, qs7.a, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var3, 1772592, 3120, 120720);
                xq2Var3 = xq2Var3;
                z8 = false;
                xq2Var3.p(false);
            } else {
                es7Var4 = es7Var3;
                z8 = false;
                xq2Var3.b0(-929839936);
                xq2Var3.p(false);
            }
            c46Var2 = c46Var;
            Date date = c46Var2.c;
            if (z5 && date != null) {
                xq2Var3.b0(-929691043);
                xq2Var3.p(z8);
                l2 = i61.m("📅 ", simpleDateFormat.format(date));
            } else {
                l2 = i61.l(xq2Var3, -929618286, R.string.save_state_empty_slot, xq2Var3, z8);
            }
            xq2 xq2Var4 = xq2Var3;
            x37.b(l2, ge7.S(x64Var, 2.0f, 2.0f, RecyclerView.B1, RecyclerView.B1, 12), es7Var4.i, hi2.E(9), null, sr2Var, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var4, 1575984, 3120, 120752);
            xq2Var = xq2Var4;
            xq2Var.p(true);
        } else {
            on2Var5 = on2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new g46(c46Var2, z, str, nh2Var, on2Var, on2Var5, on2Var3, on2Var4, i2);
        }
    }

    public static final void y(List list, boolean z, String str, qn2 qn2Var, qn2 qn2Var2, eo2 eo2Var, eo2 eo2Var2, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        final eo2 eo2Var3;
        final eo2 eo2Var4;
        xq2 xq2Var;
        boolean z3;
        boolean z4;
        on2 on2Var2;
        int i11;
        long j2;
        long j3;
        String str2;
        es7 es7Var;
        int i12;
        int i13;
        jy2 jy2Var;
        int i14;
        int i15;
        int i16;
        int i17;
        qn2 i46Var;
        int i18;
        nh2 nh2Var;
        qa4 qa4Var;
        qa4 qa4Var2;
        int i19;
        boolean z5;
        boolean z6;
        final qa4 qa4Var3;
        boolean z7;
        list.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(4856271);
        if (xq2Var2.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i20 = i2 | i3;
        if (xq2Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i21 = i20 | i4;
        if (xq2Var2.f(str)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i22 = i21 | i5;
        if (xq2Var2.h(qn2Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i23 = i22 | i6;
        if (xq2Var2.h(qn2Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i24 = i23 | i7;
        if (xq2Var2.h(eo2Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i25 = i24 | i8;
        if (xq2Var2.h(eo2Var2)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i26 = i25 | i9;
        if (xq2Var2.h(on2Var)) {
            i10 = 8388608;
        } else {
            i10 = Compress.MAXWINSIZE;
        }
        int i27 = i26 | i10;
        if ((i27 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var2.S(i27 & 1, z2)) {
            es7 F = bl2.F(xq2Var2);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new nh2();
                xq2Var2.l0(P);
            }
            nh2 nh2Var2 = (nh2) P;
            Object P2 = xq2Var2.P();
            if (P2 == vs0Var) {
                P2 = np2.Y(null);
                xq2Var2.l0(P2);
            }
            qa4 qa4Var4 = (qa4) P2;
            Object P3 = xq2Var2.P();
            if (P3 == vs0Var) {
                P3 = np2.Y(null);
                xq2Var2.l0(P3);
            }
            qa4 qa4Var5 = (qa4) P3;
            int i28 = 29360128 & i27;
            if (i28 == 8388608) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P4 = xq2Var2.P();
            if (z3 || P4 == vs0Var) {
                P4 = new x7(18, on2Var);
                xq2Var2.l0(P4);
            }
            ge7.b(false, (on2) P4, xq2Var2, 0, 1);
            lc2 lc2Var = dj6.c;
            long j4 = F.b;
            long j5 = F.j;
            jy2 jy2Var2 = u24.m;
            a74 j0 = j0(vy7.L(lc2Var, j4, jy2Var2), o);
            if (i28 == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P5 = xq2Var2.P();
            if (!z4 && P5 != vs0Var) {
                on2Var2 = on2Var;
            } else {
                on2Var2 = on2Var;
                P5 = new m01(4, on2Var2);
                xq2Var2.l0(P5);
            }
            a74 B = u24.B(j0, (qn2) P5);
            c40 c40Var = d90.k0;
            eu euVar = ju.c;
            yt0 a2 = wt0.a(euVar, c40Var, xq2Var2, 0);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E = l.E(xq2Var2, B);
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
            yh2.K(xq2Var2, pnVar2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var2, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var2, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var2, pnVar4, E);
            d40 d40Var = d90.i0;
            x64 x64Var = x64.a;
            a74 R = ge7.R(dj6.c(x64Var, 1.0f), 8.0f, 8.0f, 16.0f, 8.0f);
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l3 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, R);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a3);
            yh2.K(xq2Var2, pnVar2, l3);
            i61.w(hashCode2, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E2);
            a74 u = mb3.u(u24.g(dj6.i(x64Var, 40.0f), z16.a), false, null, on2Var2, 15);
            e34 d2 = h70.d(d90.Z, false);
            int hashCode3 = Long.hashCode(xq2Var2.T);
            xv4 l4 = xq2Var2.l();
            a74 E3 = l.E(xq2Var2, u);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d2);
            yh2.K(xq2Var2, pnVar2, l4);
            i61.w(hashCode3, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E3);
            i13.a(jw2.q(), yh2.O(xq2Var2, R.string.cancel), dj6.i(x64Var, 22.0f), F.g, xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            xq2Var2.p(true);
            gi2.h(xq2Var2, dj6.l(x64Var, 8.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a4 = wt0.a(euVar, c40Var, xq2Var2, 0);
            int hashCode4 = Long.hashCode(xq2Var2.T);
            xv4 l5 = xq2Var2.l();
            a74 E4 = l.E(xq2Var2, vn3Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a4);
            yh2.K(xq2Var2, pnVar2, l5);
            i61.w(hashCode4, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E4);
            l26 a5 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode5 = Long.hashCode(xq2Var2.T);
            xv4 l6 = xq2Var2.l();
            a74 E5 = l.E(xq2Var2, x64Var);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, a5);
            yh2.K(xq2Var2, pnVar2, l6);
            i61.w(hashCode5, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E5);
            if (z) {
                i11 = R.string.save_state;
            } else {
                i11 = R.string.load_state;
            }
            String O = yh2.O(xq2Var2, i11);
            long j6 = F.g;
            pi2 pi2Var = qs7.a;
            long E6 = hi2.E(16);
            oj2 oj2Var = oj2.e0;
            x37.b(O, null, j6, E6, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130962);
            gi2.h(xq2Var2, dj6.l(x64Var, 8.0f));
            a74 g2 = u24.g(x64Var, z16.b(4.0f));
            if (z) {
                j2 = j5;
                j3 = kt0.c(0.2f, j2);
            } else {
                j2 = j5;
                j3 = F.d;
            }
            a74 P6 = ge7.P(vy7.L(g2, j3, jy2Var2), 6.0f, 2.0f);
            e34 d3 = h70.d(d90.L, false);
            int hashCode6 = Long.hashCode(xq2Var2.T);
            xv4 l7 = xq2Var2.l();
            a74 E7 = l.E(xq2Var2, P6);
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, pnVar, d3);
            yh2.K(xq2Var2, pnVar2, l7);
            i61.w(hashCode6, xq2Var2, pnVar3, xq2Var2, neVar);
            yh2.K(xq2Var2, pnVar4, E7);
            if (z) {
                str2 = "СОХРАНЕНИЕ";
            } else {
                str2 = "ЗАГРУЗКА";
            }
            String str3 = str2;
            if (!z) {
                j2 = F.h;
            }
            sr2 sr2Var = qs7.c;
            x37.b(str3, null, j2, hi2.D(8.5d), oj2Var, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 1772544, 0, 130962);
            xq2 xq2Var3 = xq2Var2;
            xq2Var3.p(true);
            xq2Var3.p(true);
            if (str != null) {
                xq2Var3.b0(687653713);
                es7Var = F;
                i13 = i27;
                jy2Var = jy2Var2;
                i12 = 0;
                x37.b(str, null, F.i, hi2.E(10), null, sr2Var, 0L, null, 0L, 2, false, 1, 0, null, null, xq2Var3, ((i27 >> 6) & 14) | 1575936, 3120, 120754);
                xq2Var3 = xq2Var3;
                xq2Var3.p(false);
            } else {
                es7Var = F;
                i12 = 0;
                i13 = i27;
                jy2Var = jy2Var2;
                xq2Var3.b0(687965635);
                xq2Var3.p(false);
            }
            xq2Var3.p(true);
            xq2Var3.p(true);
            h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), es7Var.f, jy2Var), xq2Var3, i12);
            gu2 gu2Var = new gu2(160.0f);
            gu guVar = new gu(12.0f, true, new i(1));
            gu guVar2 = new gu(12.0f, true, new i(1));
            a74 Q = ge7.Q(dj6.m(840.0f, 1, zt0.a(x64Var)).d(new cy2(d90.l0)), 16.0f, RecyclerView.B1, 2);
            pq4 j7 = ge7.j(RecyclerView.B1, 14.0f, 20.0f, 5);
            boolean h2 = xq2Var3.h(list);
            if ((i13 & 112) == 32) {
                i14 = 1;
            } else {
                i14 = i12;
            }
            int i29 = h2 | i14;
            if ((i13 & 896) == 256) {
                i15 = 1;
            } else {
                i15 = i12;
            }
            int i30 = i29 | i15;
            if ((i13 & 7168) == 2048) {
                i16 = 1;
            } else {
                i16 = i12;
            }
            int i31 = i30 | i16;
            if ((57344 & i13) == 16384) {
                i17 = 1;
            } else {
                i17 = i12;
            }
            int i32 = i31 | i17;
            Object P7 = xq2Var3.P();
            if (i32 == 0 && P7 != vs0Var) {
                i18 = i13;
                i46Var = P7;
                nh2Var = nh2Var2;
                qa4Var = qa4Var4;
                qa4Var2 = qa4Var5;
            } else {
                i18 = i13;
                nh2Var = nh2Var2;
                qa4Var = qa4Var4;
                qa4Var2 = qa4Var5;
                i46Var = new i46(list, z, str, nh2Var, qn2Var, qn2Var2, qa4Var, qa4Var2);
                xq2Var3.l0(i46Var);
            }
            xq2 xq2Var4 = xq2Var3;
            nh2 nh2Var3 = nh2Var;
            final qa4 qa4Var6 = qa4Var;
            qa4 qa4Var7 = qa4Var2;
            hi2.c(gu2Var, Q, null, j7, guVar2, guVar, null, false, null, i46Var, xq2Var4, 1772544, 916);
            xq2Var = xq2Var4;
            rq2 rq2Var = new rq2(null, yh2.O(xq2Var, R.string.pause_hint_navigate));
            if (z) {
                i19 = R.string.save_state;
            } else {
                i19 = R.string.load_state;
            }
            is7.a(hf.c0(rq2Var, new rq2("A", yh2.O(xq2Var, i19)), new rq2("X", "Переименовать"), new rq2("Y", "Дублировать"), new rq2("B", yh2.O(xq2Var, R.string.cancel))), null, false, xq2Var, 0, 6);
            xq2Var.p(true);
            final c46 c46Var = (c46) qa4Var6.getValue();
            if (c46Var == null) {
                xq2Var.b0(-1350480632);
                z5 = false;
                xq2Var.p(false);
                eo2Var4 = eo2Var;
            } else {
                z5 = false;
                xq2Var.b0(-1350480631);
                Object P8 = xq2Var.P();
                if (P8 == vs0Var) {
                    P8 = new oe4(qa4Var6, 22);
                    xq2Var.l0(P8);
                }
                on2 on2Var3 = (on2) P8;
                if ((i18 & 458752) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean h3 = z6 | xq2Var.h(c46Var);
                Object P9 = xq2Var.P();
                if (!h3 && P9 != vs0Var) {
                    eo2Var4 = eo2Var;
                } else {
                    eo2Var4 = eo2Var;
                    P9 = new qn2() { // from class: j46
                        @Override // defpackage.qn2
                        public final Object g(Object obj) {
                            int i33 = r4;
                            jg7 jg7Var = jg7.a;
                            qa4 qa4Var8 = qa4Var6;
                            c46 c46Var2 = c46Var;
                            eo2 eo2Var5 = eo2Var4;
                            switch (i33) {
                                case 0:
                                    eo2Var5.o(c46Var2, (String) obj);
                                    qa4Var8.setValue(null);
                                    return jg7Var;
                                default:
                                    Integer num = (Integer) obj;
                                    num.getClass();
                                    eo2Var5.o(c46Var2, num);
                                    qa4Var8.setValue(null);
                                    return jg7Var;
                            }
                        }
                    };
                    xq2Var.l0(P9);
                }
                w(c46Var, on2Var3, (qn2) P9, xq2Var, 48);
                xq2Var.p(false);
            }
            final c46 c46Var2 = (c46) qa4Var7.getValue();
            if (c46Var2 == null) {
                xq2Var.b0(-1350159875);
                xq2Var.p(z5);
                eo2Var3 = eo2Var2;
            } else {
                xq2Var.b0(-1350159874);
                Object P10 = xq2Var.P();
                if (P10 == vs0Var) {
                    qa4Var3 = qa4Var7;
                    P10 = new oe4(qa4Var3, 23);
                    xq2Var.l0(P10);
                } else {
                    qa4Var3 = qa4Var7;
                }
                on2 on2Var4 = (on2) P10;
                if ((i18 & 3670016) == 1048576) {
                    z7 = true;
                } else {
                    z7 = z5;
                }
                boolean h4 = xq2Var.h(c46Var2) | z7;
                Object P11 = xq2Var.P();
                if (!h4 && P11 != vs0Var) {
                    eo2Var3 = eo2Var2;
                } else {
                    eo2Var3 = eo2Var2;
                    P11 = new qn2() { // from class: j46
                        @Override // defpackage.qn2
                        public final Object g(Object obj) {
                            int i33 = r4;
                            jg7 jg7Var = jg7.a;
                            qa4 qa4Var8 = qa4Var3;
                            c46 c46Var22 = c46Var2;
                            eo2 eo2Var5 = eo2Var3;
                            switch (i33) {
                                case 0:
                                    eo2Var5.o(c46Var22, (String) obj);
                                    qa4Var8.setValue(null);
                                    return jg7Var;
                                default:
                                    Integer num = (Integer) obj;
                                    num.getClass();
                                    eo2Var5.o(c46Var22, num);
                                    qa4Var8.setValue(null);
                                    return jg7Var;
                            }
                        }
                    };
                    xq2Var.l0(P11);
                }
                k(c46Var2, list, on2Var4, (qn2) P11, xq2Var, ((i18 << 3) & 112) | RendererDebugBridge.CAPTURE_HEIGHT);
                xq2Var.p(z5);
            }
            is7.b(nh2Var3, xq2Var, 6);
        } else {
            eo2Var3 = eo2Var2;
            eo2Var4 = eo2Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new g46(list, z, str, qn2Var, qn2Var2, eo2Var4, eo2Var3, on2Var, i2);
        }
    }

    public static final void z(ua4 ua4Var, z64 z64Var) {
        ua4 z = f0(z64Var).z();
        int i2 = z.L - 1;
        Object[] objArr = z.A;
        if (i2 < objArr.length) {
            while (i2 >= 0) {
                ua4Var.b((z64) ((sm3) objArr[i2]).B0.g);
                i2--;
            }
        }
    }
}
