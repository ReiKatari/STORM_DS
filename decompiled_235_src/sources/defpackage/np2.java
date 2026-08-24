package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.io.Serializable;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np2  reason: default package */
/* loaded from: classes.dex */
public abstract class np2 {
    public static e33 b;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ np2(int i) {
        this.a = i;
    }

    public static void A(String str, boolean z) {
        if (z) {
            return;
        }
        i.m(str);
    }

    public static final qa4 B(le2 le2Var, Object obj, l61 l61Var, px0 px0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            l61Var = vt1.A;
        }
        xq2 xq2Var = (xq2) px0Var;
        boolean h = xq2Var.h(l61Var) | xq2Var.h(le2Var);
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (h || P == vs0Var) {
            P = new vy5(l61Var, le2Var, (r41) null, 9);
            xq2Var.l0(P);
        }
        eo2 eo2Var = (eo2) P;
        Object P2 = xq2Var.P();
        if (P2 == vs0Var) {
            P2 = Y(obj);
            xq2Var.l0(P2);
        }
        qa4 qa4Var = (qa4) P2;
        boolean h2 = xq2Var.h(eo2Var);
        Object P3 = xq2Var.P();
        if (h2 || P3 == vs0Var) {
            P3 = new km6(eo2Var, qa4Var, null, 2);
            xq2Var.l0(P3);
        }
        mb3.j(le2Var, l61Var, (eo2) P3, xq2Var);
        return qa4Var;
    }

    public static final qa4 C(rp6 rp6Var, px0 px0Var) {
        return B(rp6Var, rp6Var.getValue(), vt1.A, px0Var, 0, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final fd4 D(wb6 wb6Var, Map map) {
        Object obj;
        fd4 fd4Var;
        fd4 fd4Var2;
        boolean equals;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                hg3 hg3Var = (hg3) obj;
                wb6Var.getClass();
                hg3Var.getClass();
                if (wb6Var.c() != hg3Var.a()) {
                    equals = false;
                    continue;
                } else {
                    gg3 N = jx2.N(ic6.a, hg3Var);
                    if (N != null) {
                        equals = wb6Var.equals(N.e());
                        continue;
                    } else {
                        e41.g(wb6Var.a(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.", "Cannot find KSerializer for [");
                        return null;
                    }
                }
                if (equals) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        hg3 hg3Var2 = (hg3) obj;
        if (hg3Var2 != null) {
            fd4Var = (fd4) map.get(hg3Var2);
        } else {
            fd4Var = null;
        }
        if (fd4Var == null) {
            fd4Var = null;
        }
        wf7 wf7Var = wf7.r;
        if (fd4Var == null) {
            wb6Var.getClass();
            ab3 U = ii2.U(wb6Var);
            int[] iArr = gd4.a;
            switch (iArr[U.ordinal()]) {
                case 1:
                    fd4Var2 = f04.s;
                    fd4Var = fd4Var2;
                    break;
                case 2:
                    fd4Var2 = fd4.n;
                    fd4Var = fd4Var2;
                    break;
                case 3:
                    fd4Var2 = fd4.b;
                    fd4Var = fd4Var2;
                    break;
                case 4:
                    fd4Var2 = fd4.k;
                    fd4Var = fd4Var2;
                    break;
                case 5:
                    fd4Var2 = f04.o;
                    fd4Var = fd4Var2;
                    break;
                case 6:
                    fd4Var2 = fd4.h;
                    fd4Var = fd4Var2;
                    break;
                case 7:
                    fd4Var2 = fd4.e;
                    fd4Var = fd4Var2;
                    break;
                case 8:
                    Class y = oi2.y(wb6Var);
                    if (Parcelable.class.isAssignableFrom(y)) {
                        fd4Var = new dd4(y);
                        break;
                    } else if (Enum.class.isAssignableFrom(y)) {
                        fd4Var = new cd4(y);
                        break;
                    } else if (Serializable.class.isAssignableFrom(y)) {
                        fd4Var = new ed4(y);
                        break;
                    } else {
                        fd4Var = null;
                        break;
                    }
                case 9:
                    fd4Var2 = f04.m;
                    fd4Var = fd4Var2;
                    break;
                case 10:
                    fd4Var2 = f04.n;
                    fd4Var = fd4Var2;
                    break;
                case 11:
                    fd4Var2 = f04.p;
                    fd4Var = fd4Var2;
                    break;
                case 12:
                    fd4Var2 = f04.q;
                    fd4Var = fd4Var2;
                    break;
                case 13:
                    fd4Var2 = f04.r;
                    fd4Var = fd4Var2;
                    break;
                case 14:
                    fd4Var2 = fd4.c;
                    fd4Var = fd4Var2;
                    break;
                case 15:
                    fd4Var2 = fd4.l;
                    fd4Var = fd4Var2;
                    break;
                case 16:
                    fd4Var2 = f04.v;
                    fd4Var = fd4Var2;
                    break;
                case 17:
                    fd4Var2 = fd4.i;
                    fd4Var = fd4Var2;
                    break;
                case 18:
                    fd4Var2 = fd4.f;
                    fd4Var = fd4Var2;
                    break;
                case 19:
                    int i = iArr[ii2.U(wb6Var.j(0)).ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            fd4Var2 = f04.t;
                        }
                        fd4Var = wf7Var;
                        break;
                    } else {
                        fd4Var2 = fd4.o;
                    }
                    fd4Var = fd4Var2;
                    break;
                case 20:
                    switch (iArr[ii2.U(wb6Var.j(0)).ordinal()]) {
                        case 1:
                            fd4Var2 = fd4.p;
                            fd4Var = fd4Var2;
                            break;
                        case 2:
                            fd4Var2 = f04.u;
                            fd4Var = fd4Var2;
                            break;
                        case 3:
                            fd4Var2 = fd4.d;
                            fd4Var = fd4Var2;
                            break;
                        case 4:
                            fd4Var2 = fd4.m;
                            fd4Var = fd4Var2;
                            break;
                        case 5:
                            fd4Var2 = f04.w;
                            fd4Var = fd4Var2;
                            break;
                        case 6:
                            fd4Var2 = fd4.j;
                            fd4Var = fd4Var2;
                            break;
                        case 7:
                            fd4Var2 = fd4.g;
                            fd4Var = fd4Var2;
                            break;
                        case 8:
                            fd4Var = new ba3(oi2.y(wb6Var.j(0)));
                            break;
                        default:
                            fd4Var = wf7Var;
                            break;
                    }
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    Class y2 = oi2.y(wb6Var);
                    if (Enum.class.isAssignableFrom(y2)) {
                        fd4Var = new ca3(y2);
                        break;
                    }
                    fd4Var = wf7Var;
                    break;
            }
        }
        if (fd4Var.equals(wf7Var)) {
            return null;
        }
        return fd4Var;
    }

    public static qa4 E() {
        return new vs4(jg7.a, vs0.j0);
    }

    public static r41 F(eo2 eo2Var, Object obj, r41 r41Var) {
        eo2Var.getClass();
        r41Var.getClass();
        if (eo2Var instanceof d20) {
            return ((d20) eo2Var).q(r41Var, obj);
        }
        l61 b2 = r41Var.b();
        if (b2 == vt1.A) {
            return new ob3(eo2Var, obj, r41Var);
        }
        return new pb3(r41Var, b2, eo2Var, obj);
    }

    public static byte[] G(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                int digit = Character.digit(str.charAt(i2), 16);
                int digit2 = Character.digit(str.charAt(i2 + 1), 16);
                if (digit != -1 && digit2 != -1) {
                    bArr[i] = (byte) ((digit * 16) + digit2);
                } else {
                    i.h("input is not hexadecimal");
                    return null;
                }
            }
            return bArr;
        }
        i.h("Expected a string of even length");
        return null;
    }

    public static final ua4 H() {
        m44 m44Var = jm6.b;
        ua4 ua4Var = (ua4) m44Var.f();
        if (ua4Var == null) {
            ua4 ua4Var2 = new ua4(new wq2[0]);
            m44Var.F(ua4Var2);
            return ua4Var2;
        }
        return ua4Var;
    }

    public static final ii1 I(on2 on2Var) {
        m44 m44Var = jm6.a;
        return new ii1(on2Var, null);
    }

    public static final ii1 J(on2 on2Var, im6 im6Var) {
        m44 m44Var = jm6.a;
        return new ii1(on2Var, im6Var);
    }

    public static final float K(Context context, float f) {
        return (context.getResources().getDisplayMetrics().densityDpi / 160.0f) * f;
    }

    public static String L(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            int i = b2 & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static ic4 M(mc4 mc4Var) {
        Iterator it = sb6.Z(mc4Var, new x84(11)).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return (ic4) next;
        }
        fa6.e("Sequence is empty.");
        return null;
    }

    public static bm7 N(String str) {
        int i;
        int i2;
        str.getClass();
        String obj = qs6.T0(str).toString();
        int i3 = 1;
        if (!xs6.Z(obj, "nightly", true) && !xs6.Z(obj, "nightly-release", true)) {
            n14 c2 = bm7.d0.c(obj);
            int i4 = 0;
            if (c2 != null) {
                wl7 i0 = i0((String) ((l14) c2.a()).get(4));
                int parseInt = Integer.parseInt((String) ((l14) c2.a()).get(1));
                int parseInt2 = Integer.parseInt((String) ((l14) c2.a()).get(2));
                int parseInt3 = Integer.parseInt((String) ((l14) c2.a()).get(3));
                Integer h0 = xs6.h0((String) ((l14) c2.a()).get(5));
                if (h0 != null) {
                    i = h0.intValue();
                } else {
                    i = 0;
                }
                String str2 = (String) ((l14) c2.a()).get(6);
                if (str2.length() != 0 || !xs6.Y(obj, ".fix", true)) {
                    if (str2.length() == 0) {
                        i2 = 0;
                        return new bm7(i0, parseInt, parseInt2, parseInt3, i, i2);
                    }
                    i3 = Integer.parseInt(str2);
                }
                i2 = i3;
                return new bm7(i0, parseInt, parseInt2, parseInt3, i, i2);
            }
            n14 c3 = bm7.e0.c(obj);
            if (c3 != null) {
                wl7 i02 = i0((String) ((l14) c3.a()).get(1));
                int parseInt4 = Integer.parseInt((String) ((l14) c3.a()).get(2));
                int parseInt5 = Integer.parseInt((String) ((l14) c3.a()).get(3));
                int parseInt6 = Integer.parseInt((String) ((l14) c3.a()).get(4));
                Integer h02 = xs6.h0((String) ((l14) c3.a()).get(5));
                if (h02 != null) {
                    i4 = h02.intValue();
                }
                return new bm7(i02, parseInt4, parseInt5, parseInt6, i4, 32, 0);
            }
            i.h("Invalid version string: ".concat(str));
            return null;
        }
        return bm7.Z;
    }

    public static final int O(gg3 gg3Var) {
        int hashCode = gg3Var.e().a().hashCode();
        int f = gg3Var.e().f();
        for (int i = 0; i < f; i++) {
            hashCode = (hashCode * 31) + gg3Var.e().g(i).hashCode();
        }
        return hashCode;
    }

    public static final String P(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        gg3 K = jx2.K(gh5.a(obj.getClass()));
        f26 f26Var = new f26(K, linkedHashMap);
        K.d(f26Var, obj);
        Map s0 = c14.s0(f26Var.k0);
        eb ebVar = new eb(K);
        l4 l4Var = new l4(12, s0, ebVar);
        int f = K.e().f();
        for (int i = 0; i < f; i++) {
            String g = K.e().g(i);
            fd4 fd4Var = (fd4) linkedHashMap.get(g);
            if (fd4Var != null) {
                l4Var.e(Integer.valueOf(i), g, fd4Var);
            } else {
                u34.f(i61.k(']', "Cannot locate NavType for argument [", g));
                return null;
            }
        }
        return ((String) ebVar.L) + ((String) ebVar.R) + ((String) ebVar.X);
    }

    public static final float Q(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static ColorStateList R(Context context, m44 m44Var, int i) {
        int resourceId;
        ColorStateList A;
        TypedArray typedArray = (TypedArray) m44Var.L;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (A = ge7.A(context, resourceId)) != null) {
            return A;
        }
        return m44Var.g(i);
    }

    public static ColorStateList S(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList A;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (A = ge7.A(context, resourceId)) != null) {
            return A;
        }
        return typedArray.getColorStateList(i);
    }

    public static Drawable T(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable S;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (S = hf.S(context, resourceId)) != null) {
            return S;
        }
        return typedArray.getDrawable(i);
    }

    public static final int U(y37 y37Var, Layout layout, s9 s9Var, int i, RectF rectF, q96 q96Var, z5 z5Var, boolean z) {
        boolean z2;
        am3[] am3VarArr;
        j93 j93Var;
        float f;
        float Q;
        am3[] am3VarArr2;
        int i2;
        int d2;
        float f2;
        float Q2;
        int i3;
        int i4;
        int c2;
        float f3;
        float Q3;
        Bidi createLineBidi;
        boolean z3;
        boolean z4;
        float a;
        float a2;
        float f4;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = y37Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int f5 = y37Var.f(i);
        if (i5 < (f5 - lineStart2) * 2) {
            q53.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        fy2 fy2Var = new fy2(y37Var);
        boolean z5 = false;
        if (layout2.getParagraphDirection(i) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i6 = 0;
        while (lineStart2 < f5) {
            boolean isRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z2 && !isRtlCharAt) {
                a = fy2Var.a(lineStart2, z5, z5, true);
                f4 = fy2Var.a(lineStart2 + 1, true, true, true);
                z4 = z2;
            } else if (z2 && isRtlCharAt) {
                z4 = z2;
                f4 = fy2Var.a(lineStart2, false, false, false);
                a = fy2Var.a(lineStart2 + 1, true, true, false);
            } else {
                z4 = z2;
                if (isRtlCharAt) {
                    a2 = fy2Var.a(lineStart2, false, false, true);
                    a = fy2Var.a(lineStart2 + 1, true, true, true);
                } else {
                    a = fy2Var.a(lineStart2, false, false, false);
                    a2 = fy2Var.a(lineStart2 + 1, true, true, false);
                }
                f4 = a2;
            }
            fArr[i6] = a;
            fArr[i6 + 1] = f4;
            i6 += 2;
            lineStart2++;
            z2 = z4;
            z5 = false;
        }
        Layout layout3 = (Layout) s9Var.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int y = s9Var.y(lineStart3, false);
        int z6 = s9Var.z(y);
        int i7 = lineStart3 - z6;
        int i8 = lineEnd2 - z6;
        Bidi j = s9Var.j(y);
        if (j != null && (createLineBidi = j.createLineBidi(i7, i8)) != null) {
            int runCount = createLineBidi.getRunCount();
            am3VarArr = new am3[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int runStart = createLineBidi.getRunStart(i9) + lineStart3;
                int runLimit = createLineBidi.getRunLimit(i9) + lineStart3;
                int i10 = runCount;
                if (createLineBidi.getRunLevel(i9) % 2 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                am3VarArr[i9] = new am3(runStart, z3, runLimit);
                i9++;
                runCount = i10;
            }
        } else {
            am3VarArr = new am3[]{new am3(lineStart3, layout3.isRtlCharAt(lineStart3), lineEnd2)};
        }
        if (z) {
            j93Var = fv.G0(am3VarArr);
        } else {
            j93Var = new j93(am3VarArr.length - 1, 0, -1);
        }
        int i11 = j93Var.A;
        int i12 = j93Var.B;
        int i13 = j93Var.L;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            am3 am3Var = am3VarArr[i11];
            boolean z7 = am3Var.c;
            int i14 = am3Var.a;
            int i15 = am3Var.b;
            if (z7) {
                f = fArr[((i15 - 1) - lineStart) * 2];
            } else {
                f = fArr[(i14 - lineStart) * 2];
            }
            if (z7) {
                Q = Q(i14, lineStart, fArr);
            } else {
                Q = Q(i15 - 1, lineStart, fArr);
            }
            float f6 = rectF.left;
            int i16 = i13;
            if (z) {
                if (Q >= f6) {
                    float f7 = rectF.right;
                    if (f <= f7) {
                        if ((!z7 && f6 <= f) || (z7 && f7 >= Q)) {
                            i4 = i14;
                        } else {
                            int i17 = i15;
                            int i18 = i14;
                            while (true) {
                                i3 = i17;
                                if (i17 - i18 <= 1) {
                                    break;
                                }
                                int i19 = (i3 + i18) / 2;
                                float f8 = fArr[(i19 - lineStart) * 2];
                                if ((!z7 && f8 > rectF.left) || (z7 && f8 < rectF.right)) {
                                    i17 = i19;
                                } else {
                                    i17 = i3;
                                    i18 = i19;
                                }
                            }
                            if (z7) {
                                i4 = i3;
                            } else {
                                i4 = i18;
                            }
                        }
                        int d3 = q96Var.d(i4);
                        if (d3 != -1 && (c2 = q96Var.c(d3)) < i15) {
                            if (c2 >= i14) {
                                i14 = c2;
                            }
                            if (d3 > i15) {
                                d3 = i15;
                            }
                            am3VarArr2 = am3VarArr;
                            RectF rectF2 = new RectF(RecyclerView.B1, lineTop, RecyclerView.B1, lineBottom);
                            int i20 = d3;
                            while (true) {
                                if (z7) {
                                    f3 = fArr[((i20 - 1) - lineStart) * 2];
                                } else {
                                    f3 = fArr[(i14 - lineStart) * 2];
                                }
                                rectF2.left = f3;
                                if (z7) {
                                    Q3 = Q(i14, lineStart, fArr);
                                } else {
                                    Q3 = Q(i20 - 1, lineStart, fArr);
                                }
                                rectF2.right = Q3;
                                if (!((Boolean) z5Var.o(rectF2, rectF)).booleanValue()) {
                                    i14 = q96Var.a(i14);
                                    if (i14 == -1 || i14 >= i15) {
                                        break;
                                    }
                                    i20 = q96Var.d(i14);
                                    if (i20 > i15) {
                                        i20 = i15;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i14 = -1;
                        }
                    }
                }
                am3VarArr2 = am3VarArr;
                i14 = -1;
            } else {
                am3VarArr2 = am3VarArr;
                if (Q >= f6) {
                    float f9 = rectF.right;
                    if (f <= f9) {
                        if ((!z7 && f9 >= Q) || (z7 && f6 <= f)) {
                            i2 = i15 - 1;
                        } else {
                            int i21 = i15;
                            int i22 = i14;
                            while (i21 - i22 > 1) {
                                int i23 = (i21 + i22) / 2;
                                float f10 = fArr[(i23 - lineStart) * 2];
                                int i24 = i21;
                                if ((!z7 && f10 > rectF.right) || (z7 && f10 < rectF.left)) {
                                    i21 = i23;
                                } else {
                                    i21 = i24;
                                    i22 = i23;
                                }
                            }
                            int i25 = i21;
                            if (z7) {
                                i2 = i25;
                            } else {
                                i2 = i22;
                            }
                        }
                        int c3 = q96Var.c(i2 + 1);
                        if (c3 != -1 && (d2 = q96Var.d(c3)) > i14) {
                            if (c3 < i14) {
                                c3 = i14;
                            }
                            if (d2 <= i15) {
                                i15 = d2;
                            }
                            RectF rectF3 = new RectF(RecyclerView.B1, lineTop, RecyclerView.B1, lineBottom);
                            int i26 = c3;
                            while (true) {
                                if (z7) {
                                    f2 = fArr[((i15 - 1) - lineStart) * 2];
                                } else {
                                    f2 = fArr[(i26 - lineStart) * 2];
                                }
                                rectF3.left = f2;
                                if (z7) {
                                    Q2 = Q(i26, lineStart, fArr);
                                } else {
                                    Q2 = Q(i15 - 1, lineStart, fArr);
                                }
                                rectF3.right = Q2;
                                if (!((Boolean) z5Var.o(rectF3, rectF)).booleanValue()) {
                                    i15 = q96Var.b(i15);
                                    if (i15 == -1 || i15 <= i14) {
                                        break;
                                    }
                                    i26 = q96Var.c(i15);
                                    if (i26 < i14) {
                                        i26 = i14;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                i15 = -1;
                i14 = i15;
            }
            if (i14 >= 0) {
                return i14;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i16;
            i13 = i16;
            am3VarArr = am3VarArr2;
        }
    }

    public static r41 V(r41 r41Var) {
        s41 s41Var;
        r41 r41Var2;
        r41Var.getClass();
        if (r41Var instanceof s41) {
            s41Var = (s41) r41Var;
        } else {
            s41Var = null;
        }
        if (s41Var != null && (r41Var = s41Var.L) == null) {
            n61 n61Var = (n61) s41Var.b().Z(d90.r0);
            if (n61Var != null) {
                r41Var2 = new nk1(n61Var, s41Var);
            } else {
                r41Var2 = s41Var;
            }
            s41Var.L = r41Var2;
            return r41Var2;
        }
        return r41Var;
    }

    public static boolean W(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    public static final boolean X(wb6 wb6Var) {
        wb6Var.getClass();
        if (nb3.k(wb6Var.e(), bt6.e) && wb6Var.h() && wb6Var.f() == 1) {
            return true;
        }
        return false;
    }

    public static vs4 Y(Object obj) {
        return new vs4(obj, xd5.s0);
    }

    public static bm7 Z(String str) {
        Object em5Var;
        Object obj = null;
        if (str == null) {
            return null;
        }
        bm7 bm7Var = bm7.Z;
        try {
            em5Var = N(str);
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        if (!(em5Var instanceof em5)) {
            obj = em5Var;
        }
        return (bm7) obj;
    }

    public static final void a(a74 a74Var, lq4 lq4Var, rp0 rp0Var, qn2 qn2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        a74Var.getClass();
        lq4Var.getClass();
        rp0Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1411501135);
        if (xq2Var.f(lq4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (xq2Var.f(rp0Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i7 & 1, z)) {
            if (rp0Var instanceof pp0) {
                xq2Var.b0(-757067682);
                hi2.e(ge7.N(a74Var, lq4Var), xq2Var, 0);
                xq2Var.p(false);
            } else if (rp0Var instanceof qp0) {
                xq2Var.b0(-757064749);
                f(a74Var, lq4Var, (List) ((qp0) rp0Var).a, qn2Var, xq2Var, i7 & 7294);
                xq2Var.p(false);
            } else {
                throw xg6.f(xq2Var, -757069238, false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new s32(a74Var, lq4Var, rp0Var, qn2Var, i, 1);
        }
    }

    public static final qa4 a0(Uri uri, eo2 eo2Var, xq2 xq2Var) {
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (P == vs0Var) {
            P = Y(null);
            xq2Var.l0(P);
        }
        qa4 qa4Var = (qa4) P;
        boolean h = xq2Var.h(eo2Var);
        Object P2 = xq2Var.P();
        if (h || P2 == vs0Var) {
            P2 = new km6(eo2Var, qa4Var, null, 1);
            xq2Var.l0(P2);
        }
        mb3.i(xq2Var, (eo2) P2, uri);
        return qa4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a7, code lost:
        if (r2 == r1) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(fk3 fk3Var, boolean z, on2 on2Var, on2 on2Var2, on2 on2Var3, on2 on2Var4, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        a74 a74Var;
        long j;
        x64 x64Var;
        boolean z4;
        Object obj;
        qa4 qa4Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-911611896);
        if (xq2Var.h(fk3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (xq2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (xq2Var.h(on2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (xq2Var.h(on2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (xq2Var.h(on2Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (xq2Var.h(on2Var4)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i13 & 1, z2)) {
            Object P = xq2Var.P();
            Object obj2 = ox0.a;
            if (P == obj2) {
                P = Y(Boolean.FALSE);
                xq2Var.l0(P);
            }
            qa4 qa4Var2 = (qa4) P;
            Object P2 = xq2Var.P();
            if (P2 == obj2) {
                nh2 nh2Var = nh2.b;
                P2 = mh2.a;
                xq2Var.l0(P2);
            }
            ((mh2) P2).getClass();
            nh2 nh2Var2 = new nh2();
            nh2 nh2Var3 = new nh2();
            if (fk3Var.c == dk3.CUSTOM) {
                z3 = true;
            } else {
                z3 = false;
            }
            es7 F = bl2.F(xq2Var);
            Object P3 = xq2Var.P();
            if (P3 == obj2) {
                P3 = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P3;
            qa4 a = bw7.a(r94Var, xq2Var, 6);
            y16 b2 = z16.b(13.0f);
            x64 x64Var2 = x64.a;
            a74 g = u24.g(dj6.c(x64Var2, 1.0f), b2);
            if (((Boolean) a.getValue()).booleanValue()) {
                a74Var = g;
                j = F.e;
            } else {
                a74Var = g;
                j = F.d;
            }
            a74 L = vy7.L(a74Var, j, u24.m);
            if (((Boolean) a.getValue()).booleanValue()) {
                L = ak7.I(L, 2.0f, F.j, b2);
            }
            a74 S = ak7.S(L, nh2Var2);
            boolean g2 = xq2Var.g(z3) | xq2Var.f(nh2Var3);
            Object P4 = xq2Var.P();
            if (g2 || P4 == obj2) {
                P4 = new g00(z3, nh2Var3, 3);
                xq2Var.l0(P4);
            }
            boolean z5 = z3;
            a74 t = mb3.t(ge7.y(S, (qn2) P4), r94Var, null, false, null, on2Var, 28);
            Object P5 = xq2Var.P();
            if (P5 == obj2) {
                P5 = new eo0(qa4Var2, 1);
                xq2Var.l0(P5);
            }
            a74 R = ge7.R(u24.A(t, (qn2) P5), 14.0f, 4.0f, 6.0f, 4.0f);
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var, 48);
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
            a74 Q = ge7.Q(new vn3(1.0f, true), RecyclerView.B1, 8.0f, 1);
            String str = fk3Var.b;
            if (str == null) {
                str = "";
            }
            x37.b(str, Q, F.g, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((xe7) xq2Var.j(ye7.b)).i, xq2Var, 0, 3120, 55288);
            if (z) {
                xq2Var.b0(-344796843);
                x64Var = x64Var2;
                i13.a(jw2.r(), null, dj6.i(ge7.Q(x64Var, 6.0f, RecyclerView.B1, 2), 20.0f), F.l, xq2Var, 432, 0);
                z4 = false;
                xq2Var.p(false);
            } else {
                x64Var = x64Var2;
                z4 = false;
                xq2Var.b0(-344539946);
                xq2Var.p(false);
            }
            e34 d2 = h70.d(d90.L, z4);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, x64Var);
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
            a74 S2 = ak7.S(x64Var, nh2Var3);
            boolean f = xq2Var.f(nh2Var2);
            Object P6 = xq2Var.P();
            if (!f) {
                obj = obj2;
            } else {
                obj = obj2;
            }
            P6 = new do0(nh2Var2, 3);
            xq2Var.l0(P6);
            a74 y = ge7.y(S2, (qn2) P6);
            Object P7 = xq2Var.P();
            if (P7 == obj) {
                qa4Var = qa4Var2;
                P7 = new f4(qa4Var, 25);
                xq2Var.l0(P7);
            } else {
                qa4Var = qa4Var2;
            }
            ej2.b((on2) P7, y, false, g04.d, xq2Var, 24582, 12);
            boolean booleanValue = ((Boolean) qa4Var.getValue()).booleanValue();
            Object P8 = xq2Var.P();
            if (P8 == obj) {
                P8 = new f4(qa4Var, 26);
                xq2Var.l0(P8);
            }
            ti.a(booleanValue, (on2) P8, null, 0L, null, null, n16.I(-1809361819, new xj3(on2Var2, on2Var3, z5, on2Var4, qa4Var), xq2Var), xq2Var, 1572912);
            xq2Var = xq2Var;
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new zp1(fk3Var, z, on2Var, on2Var2, on2Var3, on2Var4, i);
        }
    }

    public static final qa4 b0(Object obj, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        if (P == ox0.a) {
            P = Y(obj);
            xq2Var.l0(P);
        }
        qa4 qa4Var = (qa4) P;
        qa4Var.setValue(obj);
        return qa4Var;
    }

    public static final void c(qa4 qa4Var, boolean z) {
        qa4Var.setValue(Boolean.valueOf(z));
    }

    public static final Object c0(ut3 ut3Var, tt3 tt3Var, eo2 eo2Var, r41 r41Var) {
        Object C;
        if (tt3Var != tt3.INITIALIZED) {
            if (ut3Var.b() != tt3.DESTROYED && (C = g04.C(new l5(ut3Var, tt3Var, eo2Var, (r41) null), r41Var)) == x61.COROUTINE_SUSPENDED) {
                return C;
            }
            return jg7.a;
        }
        i.h("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final void d(m20 m20Var, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        m20 m20Var2;
        Context context;
        Object obj;
        List list;
        UUID uuid;
        qa4 qa4Var;
        int i4;
        j04 j04Var;
        on2 on2Var2 = on2Var;
        m20Var.getClass();
        on2Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1859478006);
        if (xq2Var.h(m20Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (xq2Var.h(on2Var2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            Context context2 = (Context) xq2Var.j(kf.b);
            qa4 n = nb3.n(m20Var.d, xq2Var);
            qa4 n2 = nb3.n(m20Var.f(), xq2Var);
            c9 c9Var = new c9(5);
            Object P = xq2Var.P();
            Object obj2 = ox0.a;
            if (P == obj2) {
                P = new v83(9);
                xq2Var.l0(P);
            }
            j04 K = l.K(c9Var, (qn2) P, xq2Var, 48);
            Object P2 = xq2Var.P();
            if (P2 == obj2) {
                P2 = mb3.w(xq2Var);
                xq2Var.l0(P2);
            }
            w61 w61Var = (w61) P2;
            Object P3 = xq2Var.P();
            if (P3 == obj2) {
                P3 = Y(null);
                xq2Var.l0(P3);
            }
            qa4 qa4Var2 = (qa4) P3;
            c9 c9Var2 = new c9(0);
            boolean h = xq2Var.h(m20Var) | xq2Var.h(context2);
            Object P4 = xq2Var.P();
            if (h || P4 == obj2) {
                P4 = new t00((Object) m20Var, context2, (Object) qa4Var2, 14);
                xq2Var.l0(P4);
            }
            Object K2 = l.K(c9Var2, (qn2) P4, xq2Var, 0);
            c9 c9Var3 = new c9(1);
            boolean h2 = xq2Var.h(m20Var) | xq2Var.h(context2);
            Object P5 = xq2Var.P();
            if (h2 || P5 == obj2) {
                P5 = new bi2(12, m20Var, context2);
                xq2Var.l0(P5);
            }
            j04 K3 = l.K(c9Var3, (qn2) P5, xq2Var, 0);
            List list2 = (List) n.getValue();
            if (list2 == null) {
                list2 = yt1.A;
            }
            List list3 = list2;
            UUID uuid2 = ((ba6) n2.getValue()).a;
            boolean h3 = xq2Var.h(m20Var);
            Object P6 = xq2Var.P();
            if (!h3 && P6 != obj2) {
                context = context2;
                uuid = uuid2;
                obj = obj2;
                i4 = i6;
                list = list3;
                j04Var = K;
                qa4Var = qa4Var2;
            } else {
                context = context2;
                obj = obj2;
                list = list3;
                uuid = uuid2;
                qa4Var = qa4Var2;
                i4 = i6;
                j04Var = K;
                Object a0Var = new a0(1, m20Var, m20.class, "setSelectedLayoutId", "setSelectedLayoutId(Ljava/util/UUID;)V", 0, 0, 25);
                xq2Var.l0(a0Var);
                P6 = a0Var;
            }
            qn2 qn2Var = (qn2) ((po2) P6);
            boolean h4 = xq2Var.h(context) | xq2Var.h(j04Var);
            Object P7 = xq2Var.P();
            if (h4 || P7 == obj) {
                P7 = new t91(context, j04Var, 2);
                xq2Var.l0(P7);
            }
            on2 on2Var3 = (on2) P7;
            boolean h5 = xq2Var.h(K3);
            Object P8 = xq2Var.P();
            if (h5 || P8 == obj) {
                P8 = new x00(K3, 1);
                xq2Var.l0(P8);
            }
            on2 on2Var4 = (on2) P8;
            boolean h6 = xq2Var.h(K2);
            Object P9 = xq2Var.P();
            if (h6 || P9 == obj) {
                P9 = new bi2(13, K2, qa4Var);
                xq2Var.l0(P9);
            }
            qn2 qn2Var2 = (qn2) P9;
            boolean h7 = xq2Var.h(context) | xq2Var.h(j04Var);
            Object P10 = xq2Var.P();
            if (h7 || P10 == obj) {
                P10 = new bi2(14, context, j04Var);
                xq2Var.l0(P10);
            }
            qn2 qn2Var3 = (qn2) P10;
            boolean h8 = xq2Var.h(m20Var);
            Object P11 = xq2Var.P();
            if (h8 || P11 == obj) {
                Object a0Var2 = new a0(1, m20Var, m20.class, "deleteLayout", "deleteLayout(Lme/magnum/melonds/domain/model/layout/LayoutConfiguration;)V", 0, 0, 26);
                xq2Var.l0(a0Var2);
                P11 = a0Var2;
            }
            qn2 qn2Var4 = (qn2) ((po2) P11);
            boolean h9 = xq2Var.h(m20Var);
            Object P12 = xq2Var.P();
            if (!h9 && P12 != obj) {
                m20Var2 = m20Var;
            } else {
                Object a0Var3 = new a0(1, m20Var, m20.class, "addLayout", "addLayout(Lme/magnum/melonds/domain/model/layout/LayoutConfiguration;)V", 0, 0, 27);
                m20Var2 = m20Var;
                xq2Var.l0(a0Var3);
                P12 = a0Var3;
            }
            on2Var2 = on2Var;
            e(list, uuid, qn2Var, on2Var3, on2Var4, qn2Var2, qn2Var3, qn2Var4, (qn2) ((po2) P12), on2Var2, xq2Var, (i4 << 24) & 1879048192);
        } else {
            m20Var2 = m20Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(m20Var2, i, 18, on2Var2);
        }
    }

    public static final Object d0(hu3 hu3Var, tt3 tt3Var, eo2 eo2Var, hw6 hw6Var) {
        Object c0 = c0(hu3Var.getLifecycle(), tt3Var, eo2Var, hw6Var);
        if (c0 == x61.COROUTINE_SUSPENDED) {
            return c0;
        }
        return jg7.a;
    }

    public static final void e(final List list, final UUID uuid, final qn2 qn2Var, final on2 on2Var, final on2 on2Var2, final qn2 qn2Var2, final qn2 qn2Var3, final qn2 qn2Var4, final qn2 qn2Var5, final on2 on2Var3, px0 px0Var, final int i) {
        int i2;
        Object obj;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1521231061);
        if ((i & 6) == 0) {
            if (xq2Var.h(list)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i2 = i13 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(uuid)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i2 |= i12;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(qn2Var)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i2 |= i11;
        }
        if ((i & 3072) == 0) {
            if (xq2Var.h(on2Var)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i2 |= i10;
        }
        if ((i & 24576) == 0) {
            if (xq2Var.h(on2Var2)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i2 |= i9;
        }
        if ((196608 & i) == 0) {
            if (xq2Var.h(qn2Var2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i2 |= i8;
        }
        if ((1572864 & i) == 0) {
            if (xq2Var.h(qn2Var3)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i2 |= i7;
        }
        if ((12582912 & i) == 0) {
            if (xq2Var.h(qn2Var4)) {
                i6 = 8388608;
            } else {
                i6 = Compress.MAXWINSIZE;
            }
            i2 |= i6;
        }
        if ((100663296 & i) == 0) {
            if (xq2Var.h(qn2Var5)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i2 |= i5;
        }
        if ((805306368 & i) == 0) {
            obj = on2Var3;
            if (xq2Var.h(obj)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i2 |= i4;
        } else {
            obj = on2Var3;
        }
        if ((306783379 & i2) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            Object P = xq2Var.P();
            Object obj2 = ox0.a;
            if (P == obj2) {
                P = new gl6();
                xq2Var.l0(P);
            }
            gl6 gl6Var = (gl6) P;
            x56 d2 = v56.d(gl6Var, xq2Var, 1);
            Object P2 = xq2Var.P();
            if (P2 == obj2) {
                P2 = new nh2();
                xq2Var.l0(P2);
            }
            nh2 nh2Var = (nh2) P2;
            int i14 = i2;
            Object P3 = xq2Var.P();
            if (P3 == obj2) {
                i3 = 1;
                P3 = pf6.b(0, 10, m80.DROP_OLDEST, 1);
                xq2Var.l0(P3);
            } else {
                i3 = 1;
            }
            na4 na4Var = (na4) P3;
            Object P4 = xq2Var.P();
            if (P4 == obj2) {
                P4 = new sn0(nh2Var, null, i3);
                xq2Var.l0(P4);
            }
            mb3.i(xq2Var, (eo2) P4, jg7.a);
            ps7.a(yh2.O(xq2Var, R.string.layouts), obj, null, null, n16.I(-1932144230, new x3(on2Var2, on2Var, bl2.F(xq2Var), 21), xq2Var), d2, n16.I(-583846817, new xn3(nh2Var, list, uuid, qn2Var, qn2Var3, qn2Var2, na4Var, qn2Var4), xq2Var), xq2Var, ((i14 >> 24) & 112) | 1597440, 12);
            Object obj3 = (Resources) xq2Var.j(kf.c);
            boolean h = xq2Var.h(na4Var) | xq2Var.h(obj3);
            if ((i14 & 234881024) == 67108864) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = h | z2;
            Object P5 = xq2Var.P();
            if (z3 || P5 == obj2) {
                Object l5Var = new l5(na4Var, gl6Var, obj3, qn2Var5, null, 20);
                xq2Var.l0(l5Var);
                P5 = l5Var;
            }
            mb3.i(xq2Var, (eo2) P5, na4Var);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: yn3
                @Override // defpackage.eo2
                public final Object o(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    np2.e(list, uuid, qn2Var, on2Var, on2Var2, qn2Var2, qn2Var3, qn2Var4, qn2Var5, on2Var3, (px0) obj4, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static final long e0(of5 of5Var) {
        float f = of5Var.c - of5Var.a;
        float f2 = of5Var.d - of5Var.b;
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void f(a74 a74Var, lq4 lq4Var, List list, qn2 qn2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1123439552);
        if (xq2Var.f(lq4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (xq2Var.h(list)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i5 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i7 & 1, z)) {
            if (list.isEmpty()) {
                xq2Var.b0(-2002361285);
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
                x37.b(yh2.O(xq2Var, R.string.no_cheats_found), vs0.Y.n(ge7.O(x64.a, 24.0f), d90.Z), 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130556);
                xq2Var = xq2Var;
                xq2Var.p(true);
                xq2Var.p(false);
            } else {
                boolean z2 = true;
                xq2Var.b0(-2002034731);
                a74 s = q60.s(a74Var, lq4Var);
                gu guVar = new gu(8.0f, true, new i(1));
                nq6 nq6Var = ky0.n;
                pq4 pq4Var = new pq4(ge7.r(lq4Var, (kk3) xq2Var.j(nq6Var)) + 16.0f, lq4Var.d() + 12.0f, ge7.q(lq4Var, (kk3) xq2Var.j(nq6Var)) + 16.0f, lq4Var.a() + 16.0f);
                boolean h = xq2Var.h(list);
                if ((i7 & 7168) != 2048) {
                    z2 = false;
                }
                boolean z3 = h | z2;
                Object P = xq2Var.P();
                if (z3 || P == ox0.a) {
                    P = new t32(list, qn2Var, 2);
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
            t.d = new u32(a74Var, lq4Var, list, qn2Var, i, 1);
        }
    }

    public static final g21 f0(on2 on2Var) {
        return new g21(new ji(on2Var, null), 7);
    }

    public static final void g(a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        a74 a74Var2;
        zv0 zv0Var2;
        int i3;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(790527681);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(zv0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                vs4 vs4Var = new vs4(null, vs0.j0);
                xq2Var.l0(vs4Var);
                P = vs4Var;
            }
            qa4 qa4Var = (qa4) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new oe4(qa4Var, 3);
                xq2Var.l0(P2);
            }
            on2 on2Var = (on2) P2;
            g05 g05Var = vf1.a;
            h30 E = nc1.E(nc1.f, xq2Var, 6);
            a74Var2 = a74Var;
            zv0Var2 = zv0Var;
            hv.e(new pq[]{v07.b.a(f04.L(on2Var, xq2Var, 2)), v07.a.a(E)}, n16.I(1070596993, new ne4(a74Var2, qa4Var, zv0Var2, E, on2Var), xq2Var), xq2Var, 56);
        } else {
            a74Var2 = a74Var;
            zv0Var2 = zv0Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new im(a74Var2, zv0Var2, i, 4);
        }
    }

    public static final wl5 g0(wl5 wl5Var) {
        wl5Var.getClass();
        ul5 h = wl5Var.h();
        yl5 yl5Var = wl5Var.Z;
        h.g = new vg7(yl5Var.k(), yl5Var.h());
        return h.a();
    }

    public static final void h(a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(155925518);
        if ((i & 6) == 0) {
            if (xq2Var.f(a74Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(zv0Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            if (xq2Var.j(v07.a) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (xq2Var.j(v07.b) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                xq2Var.b0(-1977187922);
                e34 d2 = h70.d(d90.L, true);
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
                zv0Var.o(xq2Var, Integer.valueOf((i2 >> 3) & 14));
                xq2Var.p(true);
                xq2Var.p(false);
            } else if (z2) {
                xq2Var.b0(-1976997706);
                f04.k(a74Var, zv0Var, xq2Var, i2 & 126);
                xq2Var.p(false);
            } else if (z3) {
                xq2Var.b0(-1976846922);
                vf1.d(a74Var, zv0Var, xq2Var, i2 & 126);
                xq2Var.p(false);
            } else {
                xq2Var.b0(-1976716505);
                g(a74Var, zv0Var, xq2Var, i2 & 126);
                xq2Var.p(false);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new im(a74Var, zv0Var, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final x61 h0(Throwable th, r41 r41Var) {
        si3 si3Var;
        int i;
        if (r41Var instanceof si3) {
            si3 si3Var2 = (si3) r41Var;
            int i2 = si3Var2.X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                si3Var2.X = i2 - Integer.MIN_VALUE;
                si3Var = si3Var2;
                Object obj = si3Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = si3Var.X;
                if (i == 0) {
                    if (i != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    e41.c();
                    return null;
                }
                oi2.Y(obj);
                si3Var.X = 1;
                xe1 xe1Var = xk1.a;
                l61 l61Var = si3Var.B;
                l61Var.getClass();
                xe1Var.j0(l61Var, new uo2(11, si3Var, th));
                return x61Var;
            }
        }
        si3Var = new s41(r41Var);
        Object obj2 = si3Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = si3Var.X;
        if (i == 0) {
        }
    }

    public static final ns6 i(id3 id3Var, String str) {
        id3Var.getClass();
        str.getClass();
        return new ns6(str, id3Var.a);
    }

    public static wl7 i0(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int hashCode = lowerCase.hashCode();
        if (hashCode != 0) {
            if (hashCode != 3633) {
                if (hashCode != 3020272) {
                    if (hashCode == 92909918 && lowerCase.equals("alpha")) {
                        return wl7.ALPHA;
                    }
                } else if (lowerCase.equals("beta")) {
                    return wl7.BETA;
                }
            } else if (lowerCase.equals("rc")) {
                return wl7.RC;
            }
        } else if (lowerCase.equals("")) {
            return wl7.FINAL;
        }
        i.h("Unknown release qualifier: ".concat(str));
        return null;
    }

    public static final Long j(xc5 xc5Var) {
        if (nb3.k(xc5Var, uc5.a)) {
            return null;
        }
        if (xc5Var instanceof tc5) {
            return Long.valueOf(((tc5) xc5Var).a);
        }
        if (xc5Var instanceof wc5) {
            return Long.valueOf(((wc5) xc5Var).a);
        }
        if (xc5Var instanceof vc5) {
            return Long.valueOf(((vc5) xc5Var).a);
        }
        i.d();
        return null;
    }

    public static final String j0(String str, String str2, String str3, String str4) {
        StringBuilder u = i61.u("Route ", str3, " could not find any NavType for argument ", str, " of type ");
        u.append(str2);
        u.append(" - typeMap received was ");
        u.append(str4);
        return u.toString();
    }

    public static final sc5 k(mc5 mc5Var) {
        int i = rc5.a[mc5Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return sc5.TERMINAL_EXIT;
            }
            i.d();
            return null;
        }
        return sc5.RESUMABLE_EXIT;
    }

    public static Object k0(eo2 eo2Var, Object obj, r41 r41Var) {
        Object s41Var;
        eo2Var.getClass();
        l61 b2 = r41Var.b();
        if (b2 == vt1.A) {
            s41Var = new cm5(r41Var);
        } else {
            s41Var = new s41(r41Var, b2);
        }
        ge7.p(2, eo2Var);
        return eo2Var.o(obj, s41Var);
    }

    public static final float l(long j) {
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) == RecyclerView.B1 && Float.intBitsToFloat((int) (j & 4294967295L)) == RecyclerView.B1) {
            return RecyclerView.B1;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static final List m(q61 q61Var, int i, int i2, ArrayList arrayList, o94 o94Var, int i3, int i4, int i5, qn2 qn2Var) {
        int i6;
        o94 o94Var2;
        gq3 gq3Var;
        long j;
        long j2;
        int i7;
        Object obj;
        int i8;
        int max;
        long j3;
        if (q61Var != null && !arrayList.isEmpty() && (i6 = o94Var.b) != 0) {
            int i9 = -1;
            if (i2 - i >= 0 && i6 != 0) {
                l93 R = gi2.R(0, i6);
                int i10 = R.A;
                int i11 = R.B;
                int i12 = -1;
                if (i10 <= i11) {
                    while (o94Var.c(i10) <= i) {
                        i12 = o94Var.c(i10);
                        if (i10 == i11) {
                            break;
                        }
                        i10++;
                    }
                }
                if (i12 == -1) {
                    o94Var2 = f93.a;
                } else {
                    o94 o94Var3 = f93.a;
                    o94Var2 = new o94(1);
                    o94Var2.a(i12);
                }
            } else {
                o94Var2 = f93.a;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                Object obj2 = arrayList.get(i13);
                int index = ((gq3) obj2).getIndex();
                int[] iArr = o94Var.a;
                int i14 = o94Var.b;
                int i15 = 0;
                while (true) {
                    if (i15 >= i14) {
                        break;
                    } else if (iArr[i15] == index) {
                        arrayList3.add(obj2);
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            int[] iArr2 = o94Var2.a;
            int i16 = o94Var2.b;
            int i17 = 0;
            while (i17 < i16) {
                int i18 = iArr2[i17];
                int size2 = arrayList.size();
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (i20 < size2) {
                        Object obj3 = arrayList.get(i20);
                        i20++;
                        if (((gq3) obj3).getIndex() == i18) {
                            break;
                        }
                        i19++;
                    } else {
                        i19 = i9;
                        break;
                    }
                }
                if (i19 == i9) {
                    gq3Var = (gq3) qn2Var.g(Integer.valueOf(i18));
                } else {
                    gq3Var = (gq3) arrayList.remove(i19);
                }
                int b2 = gq3Var.b();
                if (i19 == i9) {
                    j = 4294967295L;
                    i7 = Integer.MIN_VALUE;
                } else {
                    long h = gq3Var.h(0);
                    if (gq3Var.e()) {
                        j = 4294967295L;
                        j2 = h & 4294967295L;
                    } else {
                        j = 4294967295L;
                        j2 = h >> 32;
                    }
                    i7 = (int) j2;
                }
                int size3 = arrayList3.size();
                int i21 = 0;
                while (true) {
                    if (i21 < size3) {
                        obj = arrayList3.get(i21);
                        if (((gq3) obj).getIndex() != i18) {
                            break;
                        }
                        i21++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                gq3 gq3Var2 = (gq3) obj;
                if (gq3Var2 != null) {
                    long h2 = gq3Var2.h(0);
                    if (gq3Var2.e()) {
                        j3 = h2 & j;
                    } else {
                        j3 = h2 >> 32;
                    }
                    i8 = (int) j3;
                } else {
                    i8 = Integer.MIN_VALUE;
                }
                if (i7 == Integer.MIN_VALUE) {
                    max = -i3;
                } else {
                    max = Math.max(-i3, i7);
                }
                if (i8 != Integer.MIN_VALUE) {
                    max = Math.min(max, i8 - b2);
                }
                gq3Var.f();
                gq3Var.g(max, i4, i5);
                arrayList2.add(gq3Var);
                i17++;
                i9 = -1;
            }
            return arrayList2;
        }
        return yt1.A;
    }

    public static final Object n(gb0 gb0Var, r41 r41Var) {
        rj0 rj0Var = new rj0(1, V(r41Var));
        rj0Var.v();
        rj0Var.z(new ri3(gb0Var, 0));
        gb0Var.h(new sp2(rj0Var, 1));
        Object s = rj0Var.s();
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return s;
    }

    public static final Object o(gb0 gb0Var, r41 r41Var) {
        rj0 rj0Var = new rj0(1, V(r41Var));
        rj0Var.v();
        rj0Var.z(new ri3(gb0Var, 1));
        gb0Var.h(new sp2(rj0Var, 2));
        Object s = rj0Var.s();
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return s;
    }

    public static void p(qu6 qu6Var, Object[] objArr) {
        long j;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    qu6Var.f(i);
                } else if (obj instanceof byte[]) {
                    qu6Var.d((byte[]) obj, i);
                } else if (obj instanceof Float) {
                    qu6Var.p(i, ((Number) obj).floatValue());
                } else if (obj instanceof Double) {
                    qu6Var.p(i, ((Number) obj).doubleValue());
                } else if (obj instanceof Long) {
                    qu6Var.c(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    qu6Var.c(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    qu6Var.c(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    qu6Var.c(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    qu6Var.m(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    qu6Var.c(i, j);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }

    public static final long q(oy4 oy4Var, boolean z, qn2 qn2Var) {
        long j;
        List list = oy4Var.a;
        int size = list.size();
        long j2 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            vy4 vy4Var = (vy4) list.get(i2);
            if (((Boolean) qn2Var.g(vy4Var)).booleanValue()) {
                if (z) {
                    j = vy4Var.c;
                } else {
                    j = vy4Var.g;
                }
                j2 = jk4.f(j2, j);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return jk4.b(i, j2);
    }

    public static final float r(oy4 oy4Var, boolean z) {
        long j;
        long q = q(oy4Var, z, new h37(7));
        boolean c2 = jk4.c(q, 9205357640488583168L);
        float f = RecyclerView.B1;
        if (c2) {
            return RecyclerView.B1;
        }
        List list = oy4Var.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            vy4 vy4Var = (vy4) list.get(i2);
            if (vy4Var.d && vy4Var.h) {
                if (z) {
                    j = vy4Var.c;
                } else {
                    j = vy4Var.g;
                }
                i++;
                f = jk4.d(jk4.e(j, q)) + f;
            }
        }
        return f / i;
    }

    public static void s(String str, boolean z) {
        if (z) {
            return;
        }
        i.h(str);
    }

    public static void t(boolean z) {
        if (z) {
            return;
        }
        u34.t();
    }

    public static void u(int i, int i2, int i3, String str) {
        if (i >= i2) {
            if (i <= i3) {
                return;
            }
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
    }

    public static void v(int i) {
        if (i >= 0) {
            return;
        }
        u34.t();
    }

    public static final void w(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
    }

    public static void x(Object obj, String str) {
        if (obj != null) {
            return;
        }
        u34.x(str);
    }

    public static final void y(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        e41.q(lb1.j("index: ", i, i2, ", size: "));
    }

    public static final void z(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            i.h(lb1.j("fromIndex: ", i, i2, " > toIndex: "));
            return;
        }
        u34.q(i61.q(i, i2, "fromIndex: ", ", toIndex: ", ", size: "), i3);
    }

    public int hashCode() {
        switch (this.a) {
            case 20:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.a) {
            case 20:
                String c2 = gh5.a(getClass()).c();
                c2.getClass();
                return c2;
            default:
                return super.toString();
        }
    }
}
