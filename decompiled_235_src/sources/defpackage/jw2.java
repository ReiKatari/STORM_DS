package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw2  reason: default package */
/* loaded from: classes.dex */
public abstract class jw2 {
    public static final ap3 A;
    public static final char[] B;
    public static e33 C;
    public static e33 D;
    public static final /* synthetic */ int E = 0;
    public static f74 w;
    public static final sj y;
    public static final sj z;
    public static final int[] a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] d = {16842755, 16843781, 16844062};
    public static final int[] e = {16843161};
    public static final int[] f = {16842755, 16843213};
    public static final zv0 g = new zv0(-1656469621, false, new fn0(21));
    public static final zv0 h = new zv0(2080030467, false, new iw0(24));
    public static final zv0 i = new zv0(697729124, false, new lw0(8, (byte) 0));
    public static final zv0 j = new zv0(1635758060, false, new iw0(25));
    public static final zv0 k = new zv0(389061901, false, new lw0(9, (byte) 0));
    public static final zv0 l = new zv0(976691979, false, new iw0(26));
    public static final zv0 m = new zv0(-270004180, false, new lw0(10, (byte) 0));
    public static final zv0 n = new zv0(-1837235583, false, new iw0(27));
    public static final zv0 o = new zv0(1591546666, false, new iw0(28));
    public static final String[] p = new String[0];
    public static final ys7 q = new ys7(0.31006f, 0.31616f);
    public static final ys7 r = new ys7(0.34567f, 0.3585f);
    public static final ys7 s = new ys7(0.32168f, 0.33767f);
    public static final ys7 t = new ys7(0.31271f, 0.32902f);
    public static final float[] u = {0.964212f, 1.0f, 0.825188f};
    public static final f74 v = new f74(null, null, null);
    public static final sj x = new sj(1000);

    static {
        new sj(1007);
        y = new sj(1008);
        z = new sj(1002);
        A = new ap3(28, new ep3(15, (byte) 0), new gn5(23));
        B = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public static void C(EditorInfo editorInfo, CharSequence charSequence) {
        int i2;
        int i3;
        CharSequence subSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            q2.k(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i4 >= 30) {
            q2.k(editorInfo, charSequence);
            return;
        }
        int i5 = editorInfo.initialSelStart;
        int i6 = editorInfo.initialSelEnd;
        if (i5 > i6) {
            i2 = i6;
        } else {
            i2 = i5;
        }
        if (i5 <= i6) {
            i5 = i6;
        }
        int length = charSequence.length();
        if (i2 >= 0 && i5 <= length) {
            int i7 = editorInfo.inputType & 4095;
            if (i7 != 129 && i7 != 225 && i7 != 18) {
                if (length <= 2048) {
                    E(editorInfo, charSequence, i2, i5);
                    return;
                }
                int i8 = i5 - i2;
                if (i8 > 1024) {
                    i3 = 0;
                } else {
                    i3 = i8;
                }
                int i9 = 2048 - i3;
                int min = Math.min(charSequence.length() - i5, i9 - Math.min(i2, (int) (i9 * 0.8d)));
                int min2 = Math.min(i2, i9 - min);
                int i10 = i2 - min2;
                if (Character.isLowSurrogate(charSequence.charAt(i10))) {
                    i10++;
                    min2--;
                }
                if (Character.isHighSurrogate(charSequence.charAt((i5 + min) - 1))) {
                    min--;
                }
                int i11 = min2 + i3;
                int i12 = i11 + min;
                if (i3 != i8) {
                    subSequence = TextUtils.concat(charSequence.subSequence(i10, i10 + min2), charSequence.subSequence(i5, min + i5));
                } else {
                    subSequence = charSequence.subSequence(i10, i12 + i10);
                }
                E(editorInfo, subSequence, min2, i11);
                return;
            }
            E(editorInfo, null, 0, 0);
            return;
        }
        E(editorInfo, null, 0, 0);
    }

    public static void D(EditorInfo editorInfo, boolean z2) {
        if (Build.VERSION.SDK_INT >= 35) {
            js1.b(editorInfo, z2);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z2);
    }

    public static void E(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final a74 G(a74 a74Var, fp fpVar, s47 s47Var, qn2 qn2Var, int i2, boolean z2, int i3, int i4, ki2 ki2Var, List list, qn2 qn2Var2, lt0 lt0Var, qn2 qn2Var3) {
        return a74Var.d(x64.a).d(new zz6(fpVar, s47Var, ki2Var, qn2Var, i2, z2, i3, i4, list, qn2Var2, lt0Var, qn2Var3));
    }

    public static Object H(zf0 zf0Var, ar0 ar0Var) {
        if (zf0Var instanceof hh7) {
            return ((hh7) zf0Var).e(ar0Var);
        }
        if (zf0Var instanceof cg0) {
            cg0 cg0Var = (cg0) zf0Var;
            if (cg0Var.f() != zf0Var) {
                cg0 f2 = cg0Var.f();
                f2.getClass();
                return H(f2, ar0Var);
            }
            return null;
        }
        return null;
    }

    public static final void a(final fp fpVar, final a74 a74Var, final s47 s47Var, final qn2 qn2Var, final int i2, final boolean z2, final int i3, final int i4, final Map map, final lt0 lt0Var, px0 px0Var, final int i5) {
        int i6;
        qn2 qn2Var2;
        int i7;
        boolean z3;
        xq2 xq2Var;
        int i8;
        boolean z4;
        boolean z5;
        boolean z6;
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
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1343466571);
        if ((i5 & 6) == 0) {
            if (xq2Var2.f(fpVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i6 = i18 | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            if (xq2Var2.f(a74Var)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i6 |= i17;
        }
        if ((i5 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.f(s47Var)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i6 |= i16;
        }
        if ((i5 & 3072) == 0) {
            qn2Var2 = qn2Var;
            if (xq2Var2.h(qn2Var2)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i6 |= i15;
        } else {
            qn2Var2 = qn2Var;
        }
        if ((i5 & 24576) == 0) {
            i7 = i2;
            if (xq2Var2.d(i7)) {
                i14 = 16384;
            } else {
                i14 = 8192;
            }
            i6 |= i14;
        } else {
            i7 = i2;
        }
        if ((196608 & i5) == 0) {
            if (xq2Var2.g(z2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i6 |= i13;
        }
        if ((1572864 & i5) == 0) {
            if (xq2Var2.d(i3)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i6 |= i12;
        }
        if ((12582912 & i5) == 0) {
            if (xq2Var2.d(i4)) {
                i11 = 8388608;
            } else {
                i11 = Compress.MAXWINSIZE;
            }
            i6 |= i11;
        }
        if ((100663296 & i5) == 0) {
            if (xq2Var2.h(map)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i6 |= i10;
        }
        if ((805306368 & i5) == 0) {
            if (xq2Var2.h(lt0Var)) {
                i9 = 536870912;
            } else {
                i9 = 268435456;
            }
            i6 |= i9;
        }
        if ((306783379 & i6) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (xq2Var2.S(i6 & 1, z3)) {
            qo2.W(i4, i3);
            if (xq2Var2.j(ra6.a) == null) {
                xq2Var2.b0(1588759409);
                xq2Var2.p(false);
                vr4 vr4Var = jp.a;
                int length = fpVar.B.length();
                List list = fpVar.A;
                if (list != null) {
                    int size = list.size();
                    int i19 = 0;
                    while (i19 < size) {
                        i8 = i6;
                        ep epVar = (ep) list.get(i19);
                        int i20 = i19;
                        if ((epVar.a instanceof ms6) && "androidx.compose.foundation.text.inlineContent".equals(epVar.d)) {
                            z4 = false;
                            if (gp.b(0, length, epVar.b, epVar.c)) {
                                z5 = true;
                                break;
                            }
                        }
                        i19 = i20 + 1;
                        i6 = i8;
                    }
                }
                i8 = i6;
                z4 = false;
                z5 = false;
                boolean w2 = yh2.w(fpVar);
                ki2 ki2Var = (ki2) xq2Var2.j(ky0.k);
                if (!z5 && !w2) {
                    xq2Var2.b0(1589006262);
                    s30.a(fpVar, s47Var, ki2Var, null, xq2Var2);
                    a74 G = G(a74Var, fpVar, s47Var, qn2Var2, i7, z2, i3, i4, ki2Var, null, null, lt0Var, null);
                    fc fcVar = fc.h;
                    int hashCode = Long.hashCode(xq2Var2.T);
                    a74 E2 = l.E(xq2Var2, G);
                    xv4 l2 = xq2Var2.l();
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    if (xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, fcVar);
                    yh2.K(xq2Var2, ix0.e, l2);
                    yh2.F(xq2Var2, ix0.h);
                    yh2.K(xq2Var2, ix0.d, E2);
                    yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                    xq2Var2.p(true);
                    xq2Var2.p(false);
                    xq2Var = xq2Var2;
                } else {
                    xq2Var2.b0(1590022070);
                    if ((i8 & 14) == 4) {
                        z6 = true;
                    } else {
                        z6 = z4;
                    }
                    Object P = xq2Var2.P();
                    vs0 vs0Var = ox0.a;
                    if (z6 || P == vs0Var) {
                        P = np2.Y(fpVar);
                        xq2Var2.l0(P);
                    }
                    qa4 qa4Var = (qa4) P;
                    fp fpVar2 = (fp) qa4Var.getValue();
                    boolean f2 = xq2Var2.f(qa4Var);
                    Object P2 = xq2Var2.P();
                    if (f2 || P2 == vs0Var) {
                        P2 = new j4(qa4Var, 6);
                        xq2Var2.l0(P2);
                    }
                    int i21 = i8 << 6;
                    xq2Var = xq2Var2;
                    e(a74Var, fpVar2, qn2Var, z5, map, s47Var, i2, z2, i3, i4, ki2Var, lt0Var, (qn2) P2, xq2Var, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i21) | (29360128 & i21) | (234881024 & i21) | (i21 & 1879048192), ((i8 >> 21) & 896) | 24576);
                    xq2Var.p(false);
                }
            } else {
                u34.a();
                return;
            }
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new eo2() { // from class: n30
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jw2.a(fp.this, a74Var, s47Var, qn2Var, i2, z2, i3, i4, map, lt0Var, (px0) obj, ii2.a0(i5 | 1));
                    return jg7.a;
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
    */
    public static final void b(final String str, final a74 a74Var, final s47 s47Var, qn2 qn2Var, int i2, boolean z2, final int i3, int i4, lt0 lt0Var, px0 px0Var, final int i5, final int i6) {
        int i7;
        s47 s47Var2;
        final qn2 qn2Var2;
        int i8;
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
        int i19;
        int i20;
        boolean z3;
        final int i21;
        final lt0 lt0Var2;
        final int i22;
        final boolean z4;
        cf5 t2;
        qn2 qn2Var3;
        int i23;
        boolean z5;
        int i24;
        boolean z6;
        lt0 lt0Var3;
        int i25;
        boolean z7;
        int i26;
        qn2 qn2Var4;
        boolean z8;
        a74 G;
        int i27;
        int i28;
        int i29;
        int i30;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1040751001);
        if ((i5 & 6) == 0) {
            if (xq2Var.f(str)) {
                i30 = 4;
            } else {
                i30 = 2;
            }
            i7 = i30 | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            if (xq2Var.f(a74Var)) {
                i29 = 32;
            } else {
                i29 = 16;
            }
            i7 |= i29;
        }
        if ((i5 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            s47Var2 = s47Var;
            if (xq2Var.f(s47Var2)) {
                i28 = 256;
            } else {
                i28 = 128;
            }
            i7 |= i28;
        } else {
            s47Var2 = s47Var;
        }
        int i31 = i6 & 8;
        if (i31 != 0) {
            i7 |= 3072;
        } else if ((i5 & 3072) == 0) {
            qn2Var2 = qn2Var;
            if (xq2Var.h(qn2Var2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i7 |= i8;
            i9 = i6 & 16;
            if (i9 == 0) {
                i7 |= 24576;
            } else if ((i5 & 24576) == 0) {
                i10 = i2;
                if (xq2Var.d(i10)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i7 |= i11;
                i12 = i6 & 32;
                if (i12 != 0) {
                    i7 |= 196608;
                } else if ((196608 & i5) == 0) {
                    if (xq2Var.g(z2)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i7 |= i13;
                    if ((1572864 & i5) == 0) {
                        if (xq2Var.d(i3)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i7 |= i27;
                    }
                    i14 = i6 & 128;
                    if (i14 == 0) {
                        i7 |= 12582912;
                    } else if ((12582912 & i5) == 0) {
                        if (xq2Var.d(i4)) {
                            i15 = 8388608;
                        } else {
                            i15 = Compress.MAXWINSIZE;
                        }
                        i7 |= i15;
                        int i32 = i7;
                        i16 = i6 & 256;
                        if (i16 != 0) {
                            i18 = i32 | 100663296;
                            i17 = i16;
                        } else if ((i5 & 100663296) == 0) {
                            i17 = i16;
                            if (xq2Var.h(lt0Var)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i18 = i32 | i19;
                        } else {
                            i17 = i16;
                            i18 = i32;
                        }
                        i20 = i18 | 805306368;
                        if ((i20 & 306783379) != 306783378) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (xq2Var.S(i20 & 1, z3)) {
                            if (i31 != 0) {
                                qn2Var3 = null;
                            } else {
                                qn2Var3 = qn2Var2;
                            }
                            if (i9 != 0) {
                                i23 = 1;
                            } else {
                                i23 = i10;
                            }
                            if (i12 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i14 != 0) {
                                i24 = 1;
                            } else {
                                i24 = i4;
                            }
                            if (i17 != 0) {
                                z6 = z5;
                                lt0Var3 = null;
                            } else {
                                z6 = z5;
                                lt0Var3 = lt0Var;
                            }
                            qo2.W(i24, i3);
                            if (xq2Var.j(ra6.a) == null) {
                                xq2Var.b0(356914239);
                                xq2Var.p(false);
                                ki2 ki2Var = (ki2) xq2Var.j(ky0.k);
                                Executor executor = (Executor) xq2Var.j(s30.a);
                                if (executor != null && s30.b(str.length())) {
                                    xq2Var.b0(1254298614);
                                    try {
                                        executor.execute(new q30(s47Var2, (kk3) xq2Var.j(ky0.n), str, (qh1) xq2Var.j(ky0.h), ki2Var, 0));
                                    } catch (RejectedExecutionException unused) {
                                    }
                                    xq2Var.p(false);
                                } else {
                                    xq2Var.b0(1255914055);
                                    xq2Var.p(false);
                                }
                                if (qn2Var3 == null) {
                                    xq2Var.b0(357875859);
                                    xq2Var.p(false);
                                    i25 = i24;
                                    z7 = z6;
                                    i26 = i23;
                                    G = a74Var.d(new o47(str, s47Var, ki2Var, i26, z7, i3, i25, lt0Var3));
                                    qn2Var4 = qn2Var3;
                                    z8 = true;
                                } else {
                                    i25 = i24;
                                    z7 = z6;
                                    i26 = i23;
                                    xq2Var.b0(357232113);
                                    lt0 lt0Var4 = lt0Var3;
                                    qn2Var4 = qn2Var3;
                                    z8 = true;
                                    G = G(a74Var, new fp(str), s47Var, qn2Var4, i26, z7, i3, i25, (ki2) xq2Var.j(ky0.k), null, null, lt0Var4, null);
                                    lt0Var3 = lt0Var4;
                                    xq2Var.p(false);
                                }
                                fc fcVar = fc.h;
                                int hashCode = Long.hashCode(xq2Var.T);
                                a74 E2 = l.E(xq2Var, G);
                                xv4 l2 = xq2Var.l();
                                jx0.i.getClass();
                                iy0 iy0Var = ix0.b;
                                xq2Var.f0();
                                if (xq2Var.S) {
                                    xq2Var.k(iy0Var);
                                } else {
                                    xq2Var.o0();
                                }
                                yh2.K(xq2Var, ix0.f, fcVar);
                                yh2.K(xq2Var, ix0.e, l2);
                                yh2.F(xq2Var, ix0.h);
                                yh2.K(xq2Var, ix0.d, E2);
                                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                                xq2Var.p(z8);
                                z4 = z7;
                                lt0Var2 = lt0Var3;
                                i22 = i26;
                                i21 = i25;
                                qn2Var2 = qn2Var4;
                            } else {
                                u34.a();
                                return;
                            }
                        } else {
                            xq2Var.V();
                            i21 = i4;
                            lt0Var2 = lt0Var;
                            i22 = i10;
                            z4 = z2;
                        }
                        t2 = xq2Var.t();
                        if (t2 != null) {
                            t2.d = new eo2() { // from class: l30
                                @Override // defpackage.eo2
                                public final Object o(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    jw2.b(str, a74Var, s47Var, qn2Var2, i22, z4, i3, i21, lt0Var2, (px0) obj, ii2.a0(i5 | 1), i6);
                                    return jg7.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    int i322 = i7;
                    i16 = i6 & 256;
                    if (i16 != 0) {
                    }
                    i20 = i18 | 805306368;
                    if ((i20 & 306783379) != 306783378) {
                    }
                    if (xq2Var.S(i20 & 1, z3)) {
                    }
                    t2 = xq2Var.t();
                    if (t2 != null) {
                    }
                }
                if ((1572864 & i5) == 0) {
                }
                i14 = i6 & 128;
                if (i14 == 0) {
                }
                int i3222 = i7;
                i16 = i6 & 256;
                if (i16 != 0) {
                }
                i20 = i18 | 805306368;
                if ((i20 & 306783379) != 306783378) {
                }
                if (xq2Var.S(i20 & 1, z3)) {
                }
                t2 = xq2Var.t();
                if (t2 != null) {
                }
            }
            i10 = i2;
            i12 = i6 & 32;
            if (i12 != 0) {
            }
            if ((1572864 & i5) == 0) {
            }
            i14 = i6 & 128;
            if (i14 == 0) {
            }
            int i32222 = i7;
            i16 = i6 & 256;
            if (i16 != 0) {
            }
            i20 = i18 | 805306368;
            if ((i20 & 306783379) != 306783378) {
            }
            if (xq2Var.S(i20 & 1, z3)) {
            }
            t2 = xq2Var.t();
            if (t2 != null) {
            }
        }
        qn2Var2 = qn2Var;
        i9 = i6 & 16;
        if (i9 == 0) {
        }
        i10 = i2;
        i12 = i6 & 32;
        if (i12 != 0) {
        }
        if ((1572864 & i5) == 0) {
        }
        i14 = i6 & 128;
        if (i14 == 0) {
        }
        int i322222 = i7;
        i16 = i6 & 256;
        if (i16 != 0) {
        }
        i20 = i18 | 805306368;
        if ((i20 & 306783379) != 306783378) {
        }
        if (xq2Var.S(i20 & 1, z3)) {
        }
        t2 = xq2Var.t();
        if (t2 != null) {
        }
    }

    public static final void c(m3 m3Var, px0 px0Var, int i2) {
        int i3;
        boolean z2;
        URL url;
        long j2;
        o75 o75Var = m3Var.a;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-492343204);
        if (xq2Var.h(m3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        boolean z3 = false;
        if ((i4 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i4 & 1, z2)) {
            n3 n3Var = m3Var.b;
            if (n3Var == n3.SUCCESS) {
                z3 = true;
            }
            Long valueOf = Long.valueOf(o75Var.a);
            boolean h2 = xq2Var.h(m3Var);
            Object P = xq2Var.P();
            if (h2 || P == ox0.a) {
                P = new a6(m3Var, null, 9);
                xq2Var.l0(P);
            }
            mb3.j(n3Var, valueOf, (eo2) P, xq2Var);
            a74 O = ge7.O(x64.a, 8.0f);
            if (z3) {
                url = o75Var.j;
            } else {
                url = o75Var.k;
            }
            URL url2 = url;
            boolean z4 = z3;
            bt btVar = m3Var.c;
            if (z4) {
                j2 = cc5.a;
            } else {
                j2 = cc5.b;
            }
            f04.a(O, url2, btVar, new kt0(j2), n16.I(1085724290, new zl(z4, m3Var), xq2Var), xq2Var, 24582, 0);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new z5(m3Var, i2, 4);
        }
    }

    public static final void d(aq0 aq0Var, vy7 vy7Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        aq0 aq0Var2 = aq0Var;
        vy7 vy7Var2 = vy7Var;
        aq0Var2.getClass();
        vy7Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1723248195);
        if (xq2Var.h(aq0Var2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (xq2Var.f(vy7Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i7 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i7 & 1, z2)) {
            String O = yh2.O(xq2Var, R.string.enabled_cheats);
            rc4 I = yh2.I(new qd4[0], xq2Var);
            qa4 B2 = np2.B(new be5(I.b.z), null, null, xq2Var, 48, 2);
            boolean f2 = xq2Var.f((sb4) B2.getValue());
            Object P = xq2Var.P();
            Object obj = ox0.a;
            if (f2 || P == obj) {
                P = np2.I(new f4(B2, 13));
                xq2Var.l0(P);
            }
            pp6 pp6Var = (pp6) P;
            boolean f3 = xq2Var.f((sb4) B2.getValue());
            Object P2 = xq2Var.P();
            if (f3 || P2 == obj) {
                P2 = np2.I(new lp0(O, B2, 0));
                xq2Var.l0(P2);
            }
            pp6 pp6Var2 = (pp6) P2;
            Resources resources = (Resources) xq2Var.j(kf.c);
            Object P3 = xq2Var.P();
            if (P3 == obj) {
                P3 = new gl6();
                xq2Var.l0(P3);
            }
            gl6 gl6Var = (gl6) P3;
            x56 d2 = v56.d(gl6Var, xq2Var, 1);
            Object P4 = xq2Var.P();
            if (P4 == obj) {
                P4 = mb3.w(xq2Var);
                xq2Var.l0(P4);
            }
            w61 w61Var = (w61) P4;
            boolean h2 = xq2Var.h(I) | xq2Var.h(aq0Var2);
            Object P5 = xq2Var.P();
            if (h2 || P5 == obj) {
                P5 = new q6(17, I, aq0Var2);
                xq2Var.l0(P5);
            }
            on2 on2Var = (on2) P5;
            boolean h3 = xq2Var.h(aq0Var2) | xq2Var.h(I);
            Object P6 = xq2Var.P();
            if (h3 || P6 == obj) {
                P6 = new op0(aq0Var2, I, null, 0);
                xq2Var.l0(P6);
            }
            jg7 jg7Var = jg7.a;
            mb3.i(xq2Var, (eo2) P6, jg7Var);
            boolean h4 = xq2Var.h(aq0Var2) | xq2Var.h(I);
            Object P7 = xq2Var.P();
            if (h4 || P7 == obj) {
                P7 = new op0(aq0Var2, I, null, 1);
                xq2Var.l0(P7);
            }
            mb3.i(xq2Var, (eo2) P7, jg7Var);
            boolean h5 = xq2Var.h(aq0Var2) | xq2Var.h(I);
            Object P8 = xq2Var.P();
            if (h5 || P8 == obj) {
                P8 = new op0(aq0Var2, I, null, 2);
                xq2Var.l0(P8);
            }
            mb3.i(xq2Var, (eo2) P8, jg7Var);
            boolean h6 = xq2Var.h(aq0Var2) | xq2Var.h(I);
            Object P9 = xq2Var.P();
            if (h6 || P9 == obj) {
                P9 = new op0(aq0Var2, I, null, 3);
                xq2Var.l0(P9);
            }
            mb3.i(xq2Var, (eo2) P9, jg7Var);
            boolean f4 = xq2Var.f(on2Var);
            Object P10 = xq2Var.P();
            if (!f4 && P10 != obj) {
                i5 = 1;
            } else {
                i5 = 1;
                P10 = new x7(1, on2Var);
                xq2Var.l0(P10);
            }
            ge7.b(false, (on2) P10, xq2Var, 0, i5);
            lc2 lc2Var = dj6.c;
            long j2 = bl2.F(xq2Var).b;
            WeakHashMap weakHashMap = dv7.w;
            vy7Var2 = vy7Var;
            aq0Var2 = aq0Var;
            v56.b(th7.d(xq2Var).l, lc2Var, d2, n16.I(-1680009411, new p4(on2Var, aq0Var2, pp6Var2, pp6Var, 2), xq2Var), nw7.B, null, null, 0, false, null, RecyclerView.B1, 0L, 0L, 0L, j2, 0L, n16.I(47562212, new h10(I, vy7Var, aq0Var, w61Var, resources, gl6Var, 1), xq2Var), xq2Var, 27696, 100663296, 196576);
            xq2Var = xq2Var;
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new ql1(aq0Var2, i2, 6, vy7Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [qa4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [yt1] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList] */
    public static final void e(final a74 a74Var, final fp fpVar, final qn2 qn2Var, final boolean z2, final Map map, final s47 s47Var, final int i2, final boolean z3, final int i3, final int i4, final ki2 ki2Var, final lt0 lt0Var, final qn2 qn2Var2, px0 px0Var, final int i5, final int i6) {
        int i7;
        int i8;
        xq2 xq2Var;
        f47 f47Var;
        on2 on2Var;
        on2 on2Var2;
        vr4 vr4Var;
        qn2 qn2Var3;
        qa4 qa4Var;
        boolean z4;
        o30 o30Var;
        Object xjVar;
        ?? r9;
        int i9;
        Map map2 = map;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-2118572703);
        if ((i5 & 6) == 0) {
            i7 = (xq2Var2.f(a74Var) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= xq2Var2.f(fpVar) ? 32 : 16;
        }
        if ((i5 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i7 |= xq2Var2.h(qn2Var) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= xq2Var2.g(z2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= xq2Var2.h(map2) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i7 |= xq2Var2.f(s47Var) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i7 |= xq2Var2.d(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= xq2Var2.g(z3) ? 8388608 : Compress.MAXWINSIZE;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= xq2Var2.d(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= xq2Var2.d(i4) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (xq2Var2.h(ki2Var) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= xq2Var2.h(null) ? 32 : 16;
        }
        if ((i6 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i8 |= xq2Var2.h(lt0Var) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i8 |= xq2Var2.h(qn2Var2) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= (32768 & i6) == 0 ? xq2Var2.f(null) : xq2Var2.h(null) ? 16384 : 8192;
        }
        if (xq2Var2.S(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean w2 = yh2.w(fpVar);
            vs0 vs0Var = ox0.a;
            if (w2) {
                xq2Var2.b0(145641571);
                boolean z5 = (i7 & 112) == 32;
                Object P = xq2Var2.P();
                f47 f47Var2 = P;
                if (z5 || P == vs0Var) {
                    f47 f47Var3 = new f47(fpVar);
                    xq2Var2.l0(f47Var3);
                    f47Var2 = f47Var3;
                }
                xq2Var2.p(false);
                f47Var = f47Var2;
            } else {
                xq2Var2.b0(145707228);
                xq2Var2.p(false);
                f47Var = null;
            }
            if (yh2.w(fpVar)) {
                xq2Var2.b0(145905443);
                boolean f2 = ((i7 & 112) == 32) | xq2Var2.f(f47Var);
                Object P2 = xq2Var2.P();
                q6 q6Var = P2;
                if (f2 || P2 == vs0Var) {
                    q6 q6Var2 = new q6(12, f47Var, fpVar);
                    xq2Var2.l0(q6Var2);
                    q6Var = q6Var2;
                }
                on2Var = q6Var;
                xq2Var2.p(false);
            } else {
                xq2Var2.b0(146002721);
                boolean z6 = (i7 & 112) == 32;
                Object P3 = xq2Var2.P();
                a5 a5Var = P3;
                if (z6 || P3 == vs0Var) {
                    a5 a5Var2 = new a5(fpVar, 7);
                    xq2Var2.l0(a5Var2);
                    a5Var = a5Var2;
                }
                on2Var = (on2) a5Var;
                xq2Var2.p(false);
            }
            if (z2) {
                if (map2 != null) {
                    vr4 vr4Var2 = jp.a;
                    if (!map2.isEmpty()) {
                        int length = fpVar.B.length();
                        on2Var2 = on2Var;
                        List list = fpVar.A;
                        if (list != null) {
                            r9 = new ArrayList(list.size());
                            int size = list.size();
                            int i10 = 0;
                            while (i10 < size) {
                                List list2 = list;
                                ep epVar = (ep) list.get(i10);
                                int i11 = size;
                                Object obj = epVar.a;
                                int i12 = i10;
                                int i13 = epVar.c;
                                int i14 = epVar.b;
                                String str = epVar.d;
                                if ((obj instanceof ms6) && "androidx.compose.foundation.text.inlineContent".equals(str) && gp.b(0, length, i14, i13)) {
                                    Object obj2 = epVar.a;
                                    obj2.getClass();
                                    r9.add(new ep(((ms6) obj2).a, i14, i13, str));
                                }
                                i10 = i12 + 1;
                                size = i11;
                                list = list2;
                            }
                        } else {
                            r9 = yt1.A;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = r9.size();
                        int i15 = 0;
                        List list3 = r9;
                        while (i15 < size2) {
                            ep epVar2 = (ep) list3.get(i15);
                            Object obj3 = epVar2.a;
                            List list4 = list3;
                            int i16 = epVar2.c;
                            int i17 = epVar2.b;
                            w53 w53Var = (w53) map2.get(obj3);
                            if (w53Var != null) {
                                i9 = size2;
                                arrayList.add(new ep(w53Var.a, i17, i16));
                                arrayList2.add(new ep(w53Var.b, i17, i16));
                            } else {
                                i9 = size2;
                            }
                            i15++;
                            map2 = map;
                            list3 = list4;
                            size2 = i9;
                        }
                        vr4Var = new vr4(arrayList, arrayList2);
                        qn2Var3 = null;
                    }
                }
                on2Var2 = on2Var;
                vr4Var = jp.a;
                qn2Var3 = null;
            } else {
                on2Var2 = on2Var;
                qn2Var3 = null;
                vr4Var = new vr4(null, null);
            }
            List list5 = (List) vr4Var.A;
            List list6 = (List) vr4Var.B;
            if (z2) {
                xq2Var2.b0(146318828);
                Object P4 = xq2Var2.P();
                vs4 vs4Var = P4;
                if (P4 == vs0Var) {
                    vs4 Y = np2.Y(qn2Var3);
                    xq2Var2.l0(Y);
                    vs4Var = Y;
                }
                xq2Var2.p(false);
                qa4Var = (qa4) vs4Var;
            } else {
                xq2Var2.b0(146406588);
                xq2Var2.p(false);
                qa4Var = qn2Var3;
            }
            if (z2) {
                xq2Var2.b0(146499837);
                boolean f3 = xq2Var2.f(qa4Var);
                Object P5 = xq2Var2.P();
                j4 j4Var = P5;
                if (f3 || P5 == vs0Var) {
                    j4 j4Var2 = new j4(qa4Var, 7);
                    xq2Var2.l0(j4Var2);
                    j4Var = j4Var2;
                }
                qn2Var3 = j4Var;
                xq2Var2.p(false);
            } else {
                xq2Var2.b0(146571260);
                xq2Var2.p(false);
            }
            int i18 = (i7 >> 3) & 14;
            s30.a(fpVar, s47Var, ki2Var, list5, xq2Var2);
            fp fpVar2 = (fp) on2Var2.c();
            boolean h2 = ((i7 & 896) == 256) | xq2Var2.h(f47Var);
            Object P6 = xq2Var2.P();
            if (h2 || P6 == vs0Var) {
                z4 = false;
                o30 o30Var2 = new o30(f47Var, qn2Var, 0);
                xq2Var2.l0(o30Var2);
                o30Var = o30Var2;
            } else {
                z4 = false;
                o30Var = P6;
            }
            qn2 qn2Var4 = qn2Var3;
            xq2 xq2Var3 = xq2Var2;
            qa4 qa4Var2 = qa4Var;
            boolean z7 = z4;
            a74 G = G(a74Var, fpVar2, s47Var, (qn2) o30Var, i2, z3, i3, i4, ki2Var, list5, qn2Var4, lt0Var, qn2Var2);
            if (!z2) {
                xq2Var3.b0(147750935);
                boolean h3 = xq2Var3.h(f47Var);
                Object P7 = xq2Var3.P();
                p30 p30Var = P7;
                if (h3 || P7 == vs0Var) {
                    p30 p30Var2 = new p30(f47Var, z7 ? 1 : 0);
                    xq2Var3.l0(p30Var2);
                    p30Var = p30Var2;
                }
                xjVar = new fw3((on2) p30Var);
                xq2Var3.p(z7);
            } else {
                xq2Var3.b0(147927697);
                boolean h4 = xq2Var3.h(f47Var);
                Object P8 = xq2Var3.P();
                p30 p30Var3 = P8;
                if (h4 || P8 == vs0Var) {
                    p30 p30Var4 = new p30(f47Var, 1);
                    xq2Var3.l0(p30Var4);
                    p30Var3 = p30Var4;
                }
                on2 on2Var3 = (on2) p30Var3;
                boolean f4 = xq2Var3.f(qa4Var2);
                Object P9 = xq2Var3.P();
                f4 f4Var = P9;
                if (f4 || P9 == vs0Var) {
                    f4 f4Var2 = new f4(qa4Var2, 8);
                    xq2Var3.l0(f4Var2);
                    f4Var = f4Var2;
                }
                xjVar = new xj(2, on2Var3, (on2) f4Var);
                xq2Var3.p(z7);
            }
            int hashCode = Long.hashCode(xq2Var3.T);
            xv4 l2 = xq2Var3.l();
            a74 E2 = l.E(xq2Var3, G);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, ix0.f, xjVar);
            yh2.K(xq2Var3, ix0.e, l2);
            yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var3, ix0.h);
            yh2.K(xq2Var3, ix0.d, E2);
            if (f47Var == null) {
                xq2Var3.b0(-433557001);
            } else {
                xq2Var3.b0(-291080374);
                f47Var.a(xq2Var3, z7 ? 1 : 0);
            }
            xq2Var3.p(z7);
            if (list6 == null) {
                xq2Var3.b0(-433506223);
                xq2Var3.p(z7);
            } else {
                xq2Var3.b0(-433506222);
                jp.a(fpVar, list6, xq2Var3, i18);
                xq2Var3.p(z7);
            }
            xq2Var3.p(true);
            xq2Var = xq2Var3;
        } else {
            xq2 xq2Var4 = xq2Var2;
            xq2Var4.V();
            xq2Var = xq2Var4;
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new eo2() { // from class: m30
                @Override // defpackage.eo2
                public final Object o(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int a0 = ii2.a0(i5 | 1);
                    int a02 = ii2.a0(i6);
                    jw2.e(a74.this, fpVar, qn2Var, z2, map, s47Var, i2, z3, i3, i4, ki2Var, lt0Var, qn2Var2, (px0) obj4, a0, a02);
                    return jg7.a;
                }
            };
        }
    }

    public static final boolean f(ym1 ym1Var, long j2) {
        if (ym1Var.A.j0) {
            y53 y53Var = (y53) nc1.f0(ym1Var).B0.d;
            if (y53Var.P0.j0) {
                long P = y53Var.P(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (P >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (P & 4294967295L));
                long j3 = ym1Var.m0;
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

    public static final ExecutorService g(boolean z2) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new fz0(z2));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static final boolean h(s47 s47Var) {
        jt1 jt1Var;
        ux4 ux4Var;
        hy4 hy4Var = s47Var.c;
        if (hy4Var != null && (ux4Var = hy4Var.b) != null) {
            jt1Var = new jt1(ux4Var.b);
        } else {
            jt1Var = null;
        }
        boolean z2 = false;
        if (jt1Var != null && jt1Var.a == 1) {
            z2 = true;
        }
        return !z2;
    }

    public static final ArrayList i(List list, on2 on2Var) {
        r90 r90Var;
        if (((Boolean) on2Var.c()).booleanValue()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                x24 x24Var = (x24) list.get(i2);
                Object B2 = x24Var.B();
                B2.getClass();
                pk0 pk0Var = ((l47) B2).a;
                ep epVar = (ep) pk0Var.L;
                a47 a47Var = (a47) ((f47) pk0Var.B).a.getValue();
                if (a47Var == null) {
                    r90Var = new r90(0, 0, new kt5(13));
                } else {
                    ep c2 = f47.c(epVar, a47Var);
                    if (c2 == null) {
                        r90Var = new r90(0, 0, new kt5(14));
                    } else {
                        m93 W = ln2.W(a47Var.i(c2.b, c2.c).d());
                        r90Var = new r90(W.c - W.a, W.a(), new t46(W, 15));
                    }
                }
                int i3 = r90Var.A;
                int i4 = r90Var.B;
                arrayList.add(new vr4(x24Var.y(nb3.t(i3, i3, i4, i4)), (on2) r90Var.L));
            }
            return arrayList;
        }
        return null;
    }

    public static final a74 j(a74 a74Var, float f2) {
        if (f2 == 1.0f) {
            return a74Var;
        }
        return hv.I(a74Var, RecyclerView.B1, RecyclerView.B1, f2, RecyclerView.B1, RecyclerView.B1, null, 520187);
    }

    public static int k(int i2, int i3) {
        return (i2 & 16777215) | (i3 << 24);
    }

    public static final Bundle l(vr4... vr4VarArr) {
        Bundle bundle = new Bundle(vr4VarArr.length);
        for (vr4 vr4Var : vr4VarArr) {
            String str = (String) vr4Var.A;
            Object obj = vr4Var.B;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    e41.l("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                e41.l("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                return null;
            }
        }
        return bundle;
    }

    public static String m(String str, int i2, int i3, String str2, int i4) {
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if ((i4 & 1) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i4 & 16) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i4 & 32) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if ((i4 & 64) != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        str.getClass();
        return n(str, i5, i6, str2, z2, z3, z4, z5, 128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [k80] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [k80, java.lang.Object] */
    public static String n(String str, int i2, int i3, String str2, boolean z2, boolean z3, boolean z4, boolean z5, int i4) {
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        boolean z8 = false;
        if ((i4 & 1) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i6 = str.length();
        } else {
            i6 = i3;
        }
        if ((i4 & 8) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i4 & 16) != 0) {
            z7 = false;
        } else {
            z7 = z3;
        }
        if ((i4 & 64) == 0) {
            z8 = z5;
        }
        str.getClass();
        int i7 = i5;
        while (i7 < i6) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 128;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z8) && !qs6.k0(str2, (char) codePointAt) && ((codePointAt != 37 || (z6 && (!z7 || v(i7, i6, str)))) && (codePointAt != 43 || !z4)))) {
                i7 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.s0(i5, i7, str);
                ?? r2 = 0;
                while (i7 < i6) {
                    int codePointAt2 = str.codePointAt(i7);
                    if (!z6 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        String str3 = "+";
                        if (codePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            obj.t0("+");
                        } else if (codePointAt2 == 43 && z4) {
                            if (!z6) {
                                str3 = "%2B";
                            }
                            obj.t0(str3);
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < i8 || z8) && !qs6.k0(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z6 && (!z7 || v(i7, i6, str)))))) {
                            obj.u0(codePointAt2);
                        } else {
                            if (r2 == 0) {
                                r2 = new Object();
                            }
                            r2.u0(codePointAt2);
                            while (!r2.u()) {
                                byte readByte = r2.readByte();
                                obj.n0(37);
                                char[] cArr = B;
                                obj.n0(cArr[((readByte & 255) >> 4) & 15]);
                                obj.n0(cArr[readByte & 15]);
                            }
                        }
                    }
                    i7 += Character.charCount(codePointAt2);
                    i8 = 128;
                    r2 = r2;
                }
                return obj.c0();
            }
        }
        return str.substring(i5, i6);
    }

    public static final Enum o(String str, Enum[] enumArr) {
        enumArr.getClass();
        str.getClass();
        for (Enum r2 : enumArr) {
            if (xs6.Z(r2.name(), str, true)) {
                return r2;
            }
        }
        i.h(lb1.A("Value ", str, " does not represent an enum entry"));
        return null;
    }

    public static j61 p(j61 j61Var, k61 k61Var) {
        k61Var.getClass();
        if (nb3.k(j61Var.getKey(), k61Var)) {
            return j61Var;
        }
        return null;
    }

    public static final e33 q() {
        e33 e33Var = C;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(20.0f, 11.0f);
        ww2Var.k(7.83f);
        ww2Var.n(5.59f, -5.59f);
        ww2Var.m(12.0f, 4.0f);
        ww2Var.n(-8.0f, 8.0f);
        ww2Var.n(8.0f, 8.0f);
        ww2Var.n(1.41f, -1.41f);
        ww2Var.m(7.83f, 13.0f);
        ww2Var.k(20.0f);
        ww2Var.u(-2.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        C = b2;
        return b2;
    }

    public static final e33 r() {
        e33 e33Var = D;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new tt4(9.0f, 16.17f));
        arrayList.add(new st4(4.83f, 12.0f));
        arrayList.add(new au4(-1.42f, 1.41f));
        arrayList.add(new st4(9.0f, 19.0f));
        arrayList.add(new st4(21.0f, 7.0f));
        arrayList.add(new au4(-1.41f, -1.41f));
        arrayList.add(pt4.c);
        d33.a(d33Var, arrayList, 0, cn6Var);
        e33 b2 = d33Var.b();
        D = b2;
        return b2;
    }

    public static final boolean v(int i2, int i3, String str) {
        str.getClass();
        int i4 = i2 + 2;
        if (i4 < i3 && str.charAt(i2) == '%' && yy7.n(str.charAt(i2 + 1)) != -1 && yy7.n(str.charAt(i4)) != -1) {
            return true;
        }
        return false;
    }

    public static l61 w(j61 j61Var, k61 k61Var) {
        k61Var.getClass();
        if (nb3.k(j61Var.getKey(), k61Var)) {
            return vt1.A;
        }
        return j61Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k80, java.lang.Object] */
    public static String x(int i2, int i3, int i4, String str) {
        int i5;
        boolean z2 = false;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) == 0) {
            z2 = true;
        }
        str.getClass();
        int i6 = i2;
        while (i6 < i3) {
            char charAt = str.charAt(i6);
            if (charAt != '%' && (charAt != '+' || !z2)) {
                i6++;
            } else {
                ?? obj = new Object();
                obj.s0(i2, i6, str);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt == 37 && (i5 = i6 + 2) < i3) {
                        int n2 = yy7.n(str.charAt(i6 + 1));
                        int n3 = yy7.n(str.charAt(i5));
                        if (n2 != -1 && n3 != -1) {
                            obj.n0((n2 << 4) + n3);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        obj.u0(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z2) {
                            obj.n0(32);
                            i6++;
                        }
                        obj.u0(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return obj.c0();
            }
        }
        return str.substring(i2, i3);
    }

    public static l61 y(j61 j61Var, l61 l61Var) {
        l61Var.getClass();
        if (l61Var == vt1.A) {
            return j61Var;
        }
        return (l61) l61Var.x(new lw0(20, (byte) 0), j61Var);
    }

    public static final View z(z64 z64Var) {
        if (!z64Var.A.j0) {
            p53.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) vm3.a(nc1.f0(z64Var));
    }

    public abstract void A(boolean z2);

    public abstract void B(boolean z2);

    public abstract void F(xe6 xe6Var, float f2);

    public abstract TransformationMethod I(TransformationMethod transformationMethod);

    public abstract InputFilter[] s(InputFilter[] inputFilterArr);

    public abstract float t(xe6 xe6Var);

    public abstract boolean u();
}
