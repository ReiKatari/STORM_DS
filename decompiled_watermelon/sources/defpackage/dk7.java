package defpackage;

import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Size;
import android.util.SizeF;
import android.view.inputmethod.EditorInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dk7  reason: default package */
/* loaded from: classes.dex */
public abstract class dk7 {
    public static final et0 a = new et0(-1894838564, false, new xk0(14));
    public static final et0 b = new et0(-531717168, false, new pt0(15));
    public static final String[] c = new String[0];
    public static final xd7 d = new xd7(0.31006f, 0.31616f);
    public static final xd7 e = new xd7(0.34567f, 0.3585f);
    public static final xd7 f = new xd7(0.32168f, 0.33767f);
    public static final xd7 g = new xd7(0.31271f, 0.32902f);
    public static final float[] h = {0.964212f, 1.0f, 0.825188f};
    public static final m93[] i = new m93[0];
    public static final ci3 j = new ci3(22, new eu5(0), new nh5(12));
    public static final Object k = new Object();
    public static final Object l = new Object();
    public static final Object m = new Object();
    public static final Object n = new Object();
    public static final Object o = new Object();
    public static final char[] p = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final /* synthetic */ int q = 0;

    public static final int A(hu huVar, Object obj, int i2) {
        int i3 = huVar.L;
        if (i3 == 0) {
            return -1;
        }
        try {
            int l2 = pu.l(i3, i2, huVar.A);
            if (l2 < 0 || b53.x(obj, huVar.B[l2])) {
                return l2;
            }
            int i4 = l2 + 1;
            while (i4 < i3 && huVar.A[i4] == i2) {
                if (b53.x(obj, huVar.B[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = l2 - 1; i5 >= 0 && huVar.A[i5] == i2; i5--) {
                if (b53.x(obj, huVar.B[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final boolean B(int i2, int i3, String str) {
        str.getClass();
        int i4 = i2 + 2;
        if (i4 < i3 && str.charAt(i2) == '%' && gk7.m(str.charAt(i2 + 1)) != -1 && gk7.m(str.charAt(i4)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f60, java.lang.Object] */
    public static String C(String str, int i2, int i3, int i4) {
        int i5;
        boolean z = false;
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = str.length();
        }
        if ((i4 & 4) == 0) {
            z = true;
        }
        str.getClass();
        int i6 = i2;
        while (i6 < i3) {
            char charAt = str.charAt(i6);
            if (charAt != '%' && (charAt != '+' || !z)) {
                i6++;
            } else {
                ?? obj = new Object();
                obj.r0(i2, i6, str);
                while (i6 < i3) {
                    int codePointAt = str.codePointAt(i6);
                    if (codePointAt == 37 && (i5 = i6 + 2) < i3) {
                        int m2 = gk7.m(str.charAt(i6 + 1));
                        int m3 = gk7.m(str.charAt(i5));
                        if (m2 != -1 && m3 != -1) {
                            obj.m0((m2 << 4) + m3);
                            i6 = Character.charCount(codePointAt) + i5;
                        }
                        obj.t0(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z) {
                            obj.m0(32);
                            i6++;
                        }
                        obj.t0(codePointAt);
                        i6 += Character.charCount(codePointAt);
                    }
                }
                return obj.V();
            }
        }
        return str.substring(i2, i3);
    }

    public static final void D(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                D(sb, i2, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                D(sb, i2, str, entry);
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
                v70 v70Var = x70.B;
                sb.append(oo2.B(new v70(((String) obj).getBytes(s33.a))));
                sb.append('\"');
            } else if (obj instanceof x70) {
                sb.append(": \"");
                sb.append(oo2.B((x70) obj));
                sb.append('\"');
            } else if (obj instanceof jl2) {
                sb.append(" {");
                F((jl2) obj, sb, i2 + 2);
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
                D(sb, i5, "key", entry2.getKey());
                D(sb, i5, "value", entry2.getValue());
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

    public static final String E(ns5 ns5Var) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        do {
            if (i2 == 0) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(ns5Var.q(0));
                sb.append("'.\n");
            }
            String q2 = ns5Var.q(3);
            if (!linkedHashMap.containsKey(q2)) {
                linkedHashMap.put(q2, ns5Var.q(2));
            }
            i2++;
        } while (ns5Var.a0());
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(i2);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            b31.B(sb, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb.append("\n");
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01a5, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01a7, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b9, code lost:
        if (((java.lang.Float) r4).floatValue() == androidx.recyclerview.widget.RecyclerView.A1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01cb, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void F(defpackage.jl2 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk7.F(jl2, java.lang.StringBuilder, int):void");
    }

    public static void G(EditorInfo editorInfo, CharSequence charSequence) {
        int i2;
        int i3;
        CharSequence subSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            o2.k(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i4 >= 30) {
            o2.k(editorInfo, charSequence);
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
                    I(editorInfo, charSequence, i2, i5);
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
                I(editorInfo, subSequence, min2, i11);
                return;
            }
            I(editorInfo, null, 0, 0);
            return;
        }
        I(editorInfo, null, 0, 0);
    }

    public static void H(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            zn1.b(editorInfo, z);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }

    public static void I(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
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

    public static final long J(long j2) {
        boolean z;
        hm1 hm1Var = im1.B;
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return im1.e(im1.j(j2, b53.l0(999999L, om1.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        i.c();
        return 0L;
    }

    public static String K(long j2) {
        if (s(j2, 12884901888L)) {
            return "Rgb";
        }
        if (s(j2, 12884901889L)) {
            return "Xyz";
        }
        if (s(j2, 12884901890L)) {
            return "Lab";
        }
        if (s(j2, 17179869187L)) {
            return "Cmyk";
        }
        return "Unknown";
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.dq r11, defpackage.aj2 r12, defpackage.tu0 r13, int r14) {
        /*
            sk2 r13 = (defpackage.sk2) r13
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.Z(r0)
            j33 r0 = r13.x
            sm4 r1 = r13.l()
            r2 = 201(0xc9, float:2.82E-43)
            jd4 r3 = defpackage.xu0.b
            r13.U(r2, r3)
            java.lang.Object r2 = r13.L()
            sn1 r3 = defpackage.su0.a
            boolean r3 = defpackage.b53.x(r2, r3)
            r4 = 0
            if (r3 == 0) goto L24
            r2 = r4
            goto L29
        L24:
            r2.getClass()
            o67 r2 = (defpackage.o67) r2
        L29:
            java.lang.Object r3 = r11.f
            ew4 r3 = (defpackage.ew4) r3
            o67 r5 = r3.c(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3a
            r13.h0(r5)
        L3a:
            boolean r6 = r13.S
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L52
            boolean r2 = r11.e
            if (r2 != 0) goto L4a
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4e
        L4a:
            sm4 r1 = r1.d(r3, r5)
        L4e:
            r13.J = r7
        L50:
            r2 = r8
            goto L8d
        L52:
            v86 r6 = r13.G
            int r9 = r6.g
            int[] r10 = r6.b
            java.lang.Object r6 = r6.b(r10, r9)
            r6.getClass()
            sm4 r6 = (defpackage.sm4) r6
            boolean r9 = r13.A()
            if (r9 == 0) goto L69
            if (r2 != 0) goto L74
        L69:
            boolean r9 = r11.e
            if (r9 != 0) goto L82
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L74
            goto L82
        L74:
            if (r2 == 0) goto L7b
            boolean r2 = r13.w
            if (r2 != 0) goto L7b
            goto L80
        L7b:
            boolean r2 = r13.w
            if (r2 == 0) goto L80
            goto L86
        L80:
            r1 = r6
            goto L86
        L82:
            sm4 r1 = r1.d(r3, r5)
        L86:
            boolean r2 = r13.y
            if (r2 != 0) goto L8c
            if (r6 == r1) goto L50
        L8c:
            r2 = r7
        L8d:
            if (r2 == 0) goto L96
            boolean r3 = r13.S
            if (r3 != 0) goto L96
            r13.J(r1)
        L96:
            boolean r3 = r13.w
            r0.c(r3)
            r13.w = r2
            r13.K = r1
            r2 = 202(0xca, float:2.83E-43)
            jd4 r3 = defpackage.xu0.c
            r13.S(r2, r8, r3, r1)
            int r1 = r14 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.j(r13, r1)
            r13.p(r8)
            r13.p(r8)
            int r0 = r0.b()
            if (r0 == 0) goto Lbe
            goto Lbf
        Lbe:
            r7 = r8
        Lbf:
            r13.w = r7
            r13.K = r4
            m55 r13 = r13.r()
            if (r13 == 0) goto Ld1
            vo r0 = new vo
            r1 = 3
            r0.<init>(r14, r1, r11, r12)
            r13.d = r0
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk7.a(dq, aj2, tu0, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v4, types: [rm4, vm4] */
    /* JADX WARN: Type inference failed for: r7v6, types: [rm4, vm4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.dq[] r10, defpackage.aj2 r11, defpackage.tu0 r12, int r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk7.b(dq[], aj2, tu0, int):void");
    }

    public static final long c(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void d(final ki2 ki2Var, final zy3 zy3Var, y26 y26Var, long j2, long j3, ca1 ca1Var, final et0 et0Var, tu0 tu0Var, final int i2) {
        int i3;
        int i4;
        boolean z;
        final y26 y26Var2;
        final long j4;
        final long j5;
        final ca1 ca1Var2;
        y26 fr5Var;
        long i5;
        long b2;
        int i6;
        Object obj;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-482679837);
        if (sk2Var.h(ki2Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (sk2Var.f(zy3Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4 | 599424;
        if ((4793491 & i8) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            sk2Var.T();
            int i9 = i2 & 1;
            Object obj2 = su0.a;
            if (i9 != 0 && !sk2Var.y()) {
                sk2Var.R();
                fr5Var = y26Var;
                i5 = j2;
                b2 = j3;
                i6 = i8 & (-4193281);
                obj = ca1Var;
            } else {
                fr5 fr5Var2 = ((m36) sk2Var.j(n36.a)).a;
                lm4 lm4Var = new lm4(50.0f);
                fr5Var2.getClass();
                fr5Var = new fr5(lm4Var, lm4Var, lm4Var, lm4Var);
                i5 = ((hr0) sk2Var.j(ir0.a)).i();
                b2 = ir0.b(i5, sk2Var);
                boolean c2 = sk2Var.c(6.0f) | sk2Var.c(12.0f) | sk2Var.c(8.0f) | sk2Var.c(8.0f);
                Object L = sk2Var.L();
                if (c2 || L == obj2) {
                    L = new Object();
                    sk2Var.h0(L);
                }
                i6 = i8 & (-4193281);
                obj = (ca1) L;
            }
            sk2Var.q();
            sk2Var.X(36032728);
            Object L2 = sk2Var.L();
            if (L2 == obj2) {
                L2 = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L2;
            sk2Var.p(false);
            Object L3 = sk2Var.L();
            if (L3 == obj2) {
                L3 = new qu1(5);
                sk2Var.h0(L3);
            }
            zy3 a2 = fz5.a(zy3Var, false, (mi2) L3);
            obj.getClass();
            sk2Var.X(-478475335);
            boolean f2 = sk2Var.f(l14Var);
            Object L4 = sk2Var.L();
            if (f2 || L4 == obj2) {
                L4 = new q92();
                sk2Var.h0(L4);
            }
            q92 q92Var = (q92) L4;
            boolean h2 = sk2Var.h(q92Var) | sk2Var.f(obj);
            Object L5 = sk2Var.L();
            if (h2 || L5 == obj2) {
                L5 = new ba1(q92Var, obj, null, 0);
                sk2Var.h0(L5);
            }
            l.g(sk2Var, (aj2) L5, obj);
            boolean f3 = sk2Var.f(l14Var) | sk2Var.h(q92Var);
            Object L6 = sk2Var.L();
            if (f3 || L6 == obj2) {
                L6 = new a0(l14Var, q92Var, (j11) null);
                sk2Var.h0(L6);
            }
            l.g(sk2Var, (aj2) L6, l14Var);
            io ioVar = q92Var.a.c;
            sk2Var.p(false);
            y26 y26Var3 = fr5Var;
            long j6 = i5;
            long j7 = b2;
            mj2.g(ki2Var, a2, false, y26Var3, j6, j7, ((ji1) ioVar.B.getValue()).A, l14Var, ct3.H0(-1823447062, new df(1, b2, et0Var), sk2Var), sk2Var, (i6 & 14) | 805306368, 68);
            y26Var2 = y26Var3;
            j4 = j6;
            j5 = j7;
            ca1Var2 = obj;
        } else {
            sk2Var.R();
            y26Var2 = y26Var;
            j4 = j2;
            j5 = j3;
            ca1Var2 = ca1Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(zy3Var, y26Var2, j4, j5, ca1Var2, et0Var, i2) { // from class: r92
                public final /* synthetic */ zy3 B;
                public final /* synthetic */ y26 L;
                public final /* synthetic */ long R;
                public final /* synthetic */ long X;
                public final /* synthetic */ ca1 Y;
                public final /* synthetic */ et0 Z;

                @Override // defpackage.aj2
                public final Object j(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int I = ep2.I(12582913);
                    dk7.d(ki2.this, this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj3, I);
                    return o27.a;
                }
            };
        }
    }

    public static final oi e() {
        return new oi(new Paint(7));
    }

    public static final void f(zy3 zy3Var, ew4 ew4Var, et0 et0Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        et0 et0Var2 = w81.k;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-714464401);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.f(ew4Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(et0Var2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.h(et0Var)) {
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
        if (sk2Var.O(i3 & 1, z)) {
            Object L = sk2Var.L();
            if (L == su0.a) {
                tj4 tj4Var = new tj4(null, k45.f0);
                sk2Var.h0(tj4Var);
                L = tj4Var;
            }
            n10 j2 = j(et0Var2, sk2Var, (i3 >> 6) & 14);
            a(ew4Var.a(j2), ct3.H0(274270255, new p4(zy3Var, (k24) L, et0Var, j2, 1), sk2Var), sk2Var, 56);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(zy3Var, ew4Var, et0Var, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.p31 g(defpackage.k11 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.tc1
            if (r0 == 0) goto L13
            r0 = r5
            tc1 r0 = (defpackage.tc1) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            tc1 r0 = new tc1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2a:
            defpackage.me2.a0(r5)
            goto L46
        L2e:
            defpackage.me2.a0(r5)
            r0.X = r4
            ih0 r5 = new ih0
            j11 r0 = defpackage.nk2.J(r0)
            r5.<init>(r4, r0)
            r5.x()
            java.lang.Object r5 = r5.v()
            if (r5 != r1) goto L46
            return r1
        L46:
            defpackage.f81.c()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk7.g(k11):p31");
    }

    public static zy3 h(zy3 zy3Var, zn3 zn3Var) {
        return zy3Var.f(new wy(0L, zn3Var, iq2.g, 1));
    }

    public static final zy3 i(zy3 zy3Var, long j2, y26 y26Var) {
        return zy3Var.f(new wy(j2, null, y26Var, 2));
    }

    public static final n10 j(et0 et0Var, tu0 tu0Var, int i2) {
        boolean z;
        if ((((i2 & 14) ^ 6) > 4 && ((sk2) tu0Var).f(et0Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (z || L == sn1Var) {
            L = new n10(et0Var);
            sk2Var.h0(L);
        }
        n10 n10Var = (n10) L;
        boolean f2 = sk2Var.f(n10Var);
        Object L2 = sk2Var.L();
        if (f2 || L2 == sn1Var) {
            L2 = new j0(14, n10Var);
            sk2Var.h0(L2);
        }
        l.d(n10Var, (mi2) L2, sk2Var);
        return n10Var;
    }

    public static final Bundle k(ti4... ti4VarArr) {
        Bundle bundle = new Bundle(ti4VarArr.length);
        for (ti4 ti4Var : ti4VarArr) {
            String str = (String) ti4Var.A;
            Object obj = ti4Var.B;
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
                    f81.l("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
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
                f81.l("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                return null;
            }
        }
        return bundle;
    }

    public static final String l(String str) {
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

    public static String m(String str, int i2, int i3, String str2, int i4) {
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
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
            z = false;
        } else {
            z = true;
        }
        if ((i4 & 16) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if ((i4 & 32) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if ((i4 & 64) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        str.getClass();
        return n(str, i5, i6, str2, z, z2, z3, z4, 128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [f60] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [f60, java.lang.Object] */
    public static String n(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i4) {
        int i5;
        int i6;
        boolean z5;
        boolean z6;
        boolean z7 = false;
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
            z5 = false;
        } else {
            z5 = z;
        }
        if ((i4 & 16) != 0) {
            z6 = false;
        } else {
            z6 = z2;
        }
        if ((i4 & 64) == 0) {
            z7 = z4;
        }
        str.getClass();
        int i7 = i5;
        while (i7 < i6) {
            int codePointAt = str.codePointAt(i7);
            int i8 = 128;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z7) && !zg6.r0(str2, (char) codePointAt) && ((codePointAt != 37 || (z5 && (!z6 || B(i7, i6, str)))) && (codePointAt != 43 || !z3)))) {
                i7 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.r0(i5, i7, str);
                ?? r2 = 0;
                while (i7 < i6) {
                    int codePointAt2 = str.codePointAt(i7);
                    if (!z5 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        String str3 = "+";
                        if (codePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            obj.s0("+");
                        } else if (codePointAt2 == 43 && z3) {
                            if (!z5) {
                                str3 = "%2B";
                            }
                            obj.s0(str3);
                        } else if (codePointAt2 >= 32 && codePointAt2 != 127 && ((codePointAt2 < i8 || z7) && !zg6.r0(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z5 && (!z6 || B(i7, i6, str)))))) {
                            obj.t0(codePointAt2);
                        } else {
                            if (r2 == 0) {
                                r2 = new Object();
                            }
                            r2.t0(codePointAt2);
                            while (!r2.C()) {
                                byte readByte = r2.readByte();
                                obj.m0(37);
                                char[] cArr = p;
                                obj.m0(cArr[((readByte & 255) >> 4) & 15]);
                                obj.m0(cArr[readByte & 15]);
                            }
                        }
                    }
                    i7 += Character.charCount(codePointAt2);
                    i8 = 128;
                    r2 = r2;
                }
                return obj.V();
            }
        }
        return str.substring(i5, i6);
    }

    public static final pd0 p(String str, String str2, cx cxVar) {
        str.getClass();
        ArrayList f0 = l07.f0(str);
        if (str2 != null) {
            f0.add(str2);
        }
        return new pd0(f0, cxVar);
    }

    public static final Object q(long j2, j11 j11Var) {
        if (j2 > 0) {
            ih0 ih0Var = new ih0(1, nk2.J(j11Var));
            ih0Var.x();
            if (j2 < Long.MAX_VALUE) {
                x(ih0Var.X).w(j2, ih0Var);
            }
            Object v = ih0Var.v();
            if (v == p31.COROUTINE_SUSPENDED) {
                return v;
            }
        }
        return o27.a;
    }

    public static final Object r(long j2, j11 j11Var) {
        Object q2 = q(J(j2), j11Var);
        if (q2 == p31.COROUTINE_SUSPENDED) {
            return q2;
        }
        return o27.a;
    }

    public static final boolean s(long j2, long j3) {
        if (j2 == j3) {
            return true;
        }
        return false;
    }

    public static final pd0 t(v9 v9Var, v9 v9Var2) {
        String str;
        if (v9Var2 != null) {
            str = v9Var2.A.f();
        } else {
            str = null;
        }
        cx cxVar = ((hc0) v9Var.L).A;
        cxVar.getClass();
        String f2 = v9Var.A.f();
        f2.getClass();
        return p(f2, str, cxVar);
    }

    public static ja u(int i2) {
        Object obj;
        Iterator it = ja.b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((ja) obj).a == i2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (ja) obj;
    }

    public static Object v(Class cls, Object obj) {
        if (obj instanceof cl2) {
            return cls.cast(obj);
        }
        if (obj instanceof dl2) {
            return v(cls, ((dl2) obj).d());
        }
        Class<?> cls2 = obj.getClass();
        throw new IllegalStateException("Given component holder " + cls2 + " does not implement " + cl2.class + " or " + dl2.class);
    }

    public static final sc1 x(e31 e31Var) {
        sc1 sc1Var;
        c31 I = e31Var.I(k45.Y);
        if (I instanceof sc1) {
            sc1Var = (sc1) I;
        } else {
            sc1Var = null;
        }
        if (sc1Var == null) {
            return x91.a;
        }
        return sc1Var;
    }

    public static Set y() {
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

    public static final Paint z(oi oiVar) {
        if (oiVar == null) {
            lz2.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + q75.a(oiVar.getClass()).b());
        }
        return (Paint) oiVar.L;
    }

    public abstract List o(String str, List list);

    public abstract void w(k36 k36Var, float f2, float f3);
}
