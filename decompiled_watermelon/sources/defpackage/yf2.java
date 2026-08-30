package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.SQLException;
import android.graphics.Typeface;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.HandwritingGesture;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yf2  reason: default package */
/* loaded from: classes.dex */
public abstract class yf2 {
    public static final /* synthetic */ int a = 0;
    public static ax2 b;
    public static ax2 c;
    public static ax2 d;

    public static boolean A() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Blu")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Blu")) {
                return false;
            }
        }
        if ("studio x10".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static final boolean B(float[] fArr) {
        if (fArr.length < 16 || fArr[0] != 1.0f || fArr[1] != RecyclerView.A1 || fArr[2] != RecyclerView.A1 || fArr[3] != RecyclerView.A1 || fArr[4] != RecyclerView.A1 || fArr[5] != 1.0f || fArr[6] != RecyclerView.A1 || fArr[7] != RecyclerView.A1 || fArr[8] != RecyclerView.A1 || fArr[9] != RecyclerView.A1 || fArr[10] != 1.0f || fArr[11] != RecyclerView.A1 || fArr[12] != RecyclerView.A1 || fArr[13] != RecyclerView.A1 || fArr[14] != RecyclerView.A1 || fArr[15] != 1.0f) {
            return false;
        }
        return true;
    }

    public static boolean C() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Itel")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Itel")) {
                return false;
            }
        }
        if ("itel w6004".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static boolean D() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Positivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Positivo")) {
                return false;
            }
        }
        if ("twist 2 pro".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    public static final boolean E(f47 f47Var) {
        f47Var.getClass();
        if (f47Var.h.a(b57.S)) {
            if (f47Var.h.n() != d57.VIDEO_CAPTURE) {
                return false;
            }
            return true;
        }
        ve2.w("UseCaseUtil", f47Var + " UseCase does not have capture type.");
        return false;
    }

    public static boolean F() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Vivo")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Vivo")) {
                return false;
            }
        }
        if ("vivo 1805".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [pb5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [m14, pq3] */
    /* JADX WARN: Type inference failed for: r5v0, types: [i90, java.lang.Object] */
    public static final iq0 G(y60 y60Var, String str, Executor executor, ki2 ki2Var) {
        y60Var.getClass();
        executor.getClass();
        ?? pq3Var = new pq3(iq0.l0);
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = b31.class;
        try {
            executor.execute(new w10(y60Var, str, ki2Var, pq3Var, obj));
            o27 o27Var = o27.a;
            if (o27Var != null) {
                obj.a = o27Var;
            }
        } catch (Exception e) {
            l90Var.b(e);
        }
        return new iq0(13);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [gh3, java.lang.Object, xs5] */
    /* JADX WARN: Type inference failed for: r2v6, types: [gh3, java.lang.Object, g37] */
    public static gh3 H(wk3 wk3Var, ki2 ki2Var) {
        sn1 sn1Var = sn1.u0;
        wk3Var.getClass();
        int i = oi3.a[wk3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ?? obj = new Object();
                    obj.A = ki2Var;
                    obj.B = sn1Var;
                    return obj;
                }
                i.c();
                return null;
            }
            ?? obj2 = new Object();
            obj2.A = ki2Var;
            obj2.B = sn1Var;
            return obj2;
        }
        return new il6(ki2Var);
    }

    public static il6 I(ki2 ki2Var) {
        ki2Var.getClass();
        return new il6(ki2Var);
    }

    public static void P(long j, to toVar, boolean z, kb2 kb2Var) {
        int i;
        if (z) {
            int i2 = vr6.c;
            int i3 = (int) (j >> 32);
            int i4 = (int) (j & 4294967295L);
            int i5 = 10;
            if (i3 > 0) {
                i = Character.codePointBefore(toVar, i3);
            } else {
                i = 10;
            }
            if (i4 < toVar.B.length()) {
                i5 = Character.codePointAt(toVar, i4);
            }
            if (cg2.P(i) && (cg2.O(i5) || cg2.N(i5))) {
                do {
                    i3 -= Character.charCount(i);
                    if (i3 == 0) {
                        break;
                    }
                    i = Character.codePointBefore(toVar, i3);
                } while (cg2.P(i));
                j = ve2.g(i3, i4);
            } else if (cg2.P(i5) && (cg2.O(i) || cg2.N(i))) {
                do {
                    i4 += Character.charCount(i5);
                    if (i4 == toVar.B.length()) {
                        break;
                    }
                    i5 = Character.codePointAt(toVar, i4);
                } while (cg2.P(i5));
                j = ve2.g(i3, i4);
            }
        }
        int i6 = (int) (4294967295L & j);
        kb2Var.n(new rp2(new tn1[]{new p16(i6, i6), new fd1(vr6.d(j), 0)}));
    }

    public static zy3 Q(zy3 zy3Var, gj gjVar) {
        return zy3Var.f(new np4(gjVar));
    }

    public static final String R(Reader reader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = reader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.m93 S(defpackage.vn1 r5, defpackage.n93 r6, boolean r7) {
        /*
            qo0 r0 = defpackage.mh7.T(r6)
            boolean r1 = r6.b()
            java.util.List r6 = r6.a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.uq0.y0(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto Lad
            boolean r6 = r2.isEmpty()
            r3 = 0
            if (r6 == 0) goto L47
            boolean r6 = defpackage.ln2.H(r0)
            if (r6 == 0) goto L31
            r5.getClass()
        L31:
            q03 r6 = defpackage.s06.a
            if (r1 != 0) goto L40
            q03 r6 = defpackage.s06.a
            m93 r6 = r6.i(r0)
            if (r6 == 0) goto L3e
            goto L62
        L3e:
            r6 = r3
            goto L62
        L40:
            q03 r6 = defpackage.s06.b
            m93 r6 = r6.i(r0)
            goto L62
        L47:
            r5.getClass()
            q03 r6 = defpackage.s06.a
            if (r1 != 0) goto L55
            q03 r6 = defpackage.s06.c
            java.lang.Object r6 = r6.j(r0, r2)
            goto L5b
        L55:
            q03 r6 = defpackage.s06.d
            java.lang.Object r6 = r6.j(r0, r2)
        L5b:
            boolean r4 = r6 instanceof defpackage.kc5
            if (r4 == 0) goto L60
            r6 = r3
        L60:
            m93 r6 = (defpackage.m93) r6
        L62:
            if (r6 == 0) goto L65
            return r6
        L65:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L83
            m93 r6 = defpackage.me2.Q(r0)
            if (r6 != 0) goto La2
            r5.getClass()
            boolean r5 = defpackage.ln2.H(r0)
            if (r5 == 0) goto L81
            bq4 r5 = new bq4
            r5.<init>(r0)
        L7f:
            r6 = r5
            goto La2
        L81:
            r6 = r3
            goto La2
        L83:
            java.util.ArrayList r5 = defpackage.me2.S(r5, r2, r7)
            if (r5 != 0) goto L8a
            goto Lac
        L8a:
            t06 r6 = new t06
            r7 = 0
            r6.<init>(r7, r2)
            m93 r6 = defpackage.me2.I(r0, r5, r6)
            if (r6 != 0) goto La2
            boolean r5 = defpackage.ln2.H(r0)
            if (r5 == 0) goto L81
            bq4 r5 = new bq4
            r5.<init>(r0)
            goto L7f
        La2:
            if (r6 == 0) goto Lac
            if (r1 == 0) goto Lab
            m93 r5 = defpackage.l07.R(r6)
            return r5
        Lab:
            return r6
        Lac:
            return r3
        Lad:
            java.lang.ClassCastException r5 = defpackage.b31.m(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf2.S(vn1, n93, boolean):m93");
    }

    public static final void T(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static int U(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final ExtractedText V(oq6 oq6Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = oq6Var.a.B;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = oq6Var.b;
        extractedText.selectionStart = vr6.f(j);
        extractedText.selectionEnd = vr6.e(j);
        extractedText.flags = !zg6.r0(oq6Var.a.B, '\n') ? 1 : 0;
        return extractedText;
    }

    public static qi a(String str, ds6 ds6Var, long j, od1 od1Var, od2 od2Var, int i, int i2) {
        pp1 pp1Var = pp1.A;
        return new qi(new ui(str, ds6Var, pp1Var, pp1Var, od2Var, od1Var), i, 1, j);
    }

    public static final y55 b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new y55(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void c(String str, ki2 ki2Var, aj2 aj2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        ki2Var.getClass();
        aj2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1397612710);
        if ((i & 6) == 0) {
            if (sk2Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i | i5;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(ki2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if (sk2Var.h(aj2Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i6 = i2 | i3;
        if ((i6 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            Object[] objArr = new Object[0];
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z2 || L == sn1Var) {
                L = new f44(str, 1);
                sk2Var.h0(L);
            }
            k24 k24Var = (k24) jk2.M(objArr, (ki2) L, sk2Var, 0);
            Object L2 = sk2Var.L();
            if (L2 == sn1Var) {
                L2 = me2.G("");
                sk2Var.h0(L2);
            }
            dt3.t(ki2Var, new ff1(3), ct3.H0(1384474927, new od5(k24Var, (k24) L2, ki2Var, aj2Var, 1), sk2Var), sk2Var, ((i6 >> 3) & 14) | 432, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(str, ki2Var, aj2Var, i, 14);
        }
    }

    public static final void d(String str, List list, int i, mi2 mi2Var, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1472832339);
        if ((i2 & 6) == 0) {
            if (sk2Var.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var.h(list)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.d(i)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var.h(mi2Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (sk2Var.h(ki2Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i9 & 1, z)) {
            iq2.d(ki2Var, null, ct3.H0(960321110, new nx0(list, mi2Var, ki2Var, i, str, 1), sk2Var), sk2Var, ((i9 >> 12) & 14) | RendererDebugBridge.CAPTURE_HEIGHT);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vf5(str, list, i, mi2Var, ki2Var, i2, 1);
        }
    }

    public static final void e(final String str, final String str2, final List list, final int i, final mi2 mi2Var, boolean z, final float f, tu0 tu0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        final boolean z3;
        float f2;
        str.getClass();
        str2.getClass();
        mi2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1352551305);
        if (sk2Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (sk2Var.f(str2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (sk2Var.h(list)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i11 = i10 | i5;
        if (sk2Var.d(i)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        if (sk2Var.h(mi2Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i12 | i7 | 196608;
        if (sk2Var.c(f)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i14 = i13 | i8;
        if ((599187 & i14) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i14 & 1, z2)) {
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = me2.G(Boolean.FALSE);
                sk2Var.h0(L);
            }
            final k24 k24Var = (k24) L;
            tv0 tv0Var = b01.a;
            sk2Var.X(-1573274739);
            long j = ((xq0) sk2Var.j(e01.a)).a;
            if (!((hr0) sk2Var.j(ir0.a)).k() ? mh7.V(j) < 0.5d : mh7.V(j) > 0.5d) {
                f2 = 1.0f;
            } else {
                f2 = 0.87f;
            }
            sk2Var.p(false);
            dk7.a(tv0Var.a(Float.valueOf(f2)), ct3.H0(1427320905, new aj2() { // from class: y66
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    boolean z4;
                    tu0 tu0Var2 = (tu0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sk2 sk2Var2 = (sk2) tu0Var2;
                    if (sk2Var2.O(intValue & 1, z4)) {
                        zy3 c2 = o76.c(wy3.a, 1.0f);
                        Object L2 = sk2Var2.L();
                        if (L2 == su0.a) {
                            L2 = new wg5(k24Var, 11);
                            sk2Var2.h0(L2);
                        }
                        zy3 e = o76.e(64.0f, 2, ct3.f0(a53.s(c2, true, null, (ki2) L2, 14), true, null, 2));
                        float f3 = f;
                        zy3 a0 = b53.a0(e, f3, 8.0f, f3, 8.0f);
                        lr0 a2 = jr0.a(rt.d, y60.j0, sk2Var2, 6);
                        int hashCode = Long.hashCode(sk2Var2.T);
                        sm4 l = sk2Var2.l();
                        zy3 e0 = l07.e0(sk2Var2, a0);
                        nu0.i.getClass();
                        mv0 mv0Var = mu0.b;
                        sk2Var2.b0();
                        if (sk2Var2.S) {
                            sk2Var2.k(mv0Var);
                        } else {
                            sk2Var2.k0();
                        }
                        oo2.S(sk2Var2, mu0.f, a2);
                        oo2.S(sk2Var2, mu0.e, l);
                        oo2.S(sk2Var2, mu0.g, Integer.valueOf(hashCode));
                        oo2.P(sk2Var2, mu0.h);
                        oo2.S(sk2Var2, mu0.d, e0);
                        ir6.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((c17) sk2Var2.j(d17.b)).i, sk2Var2, 0, 3120, 55294);
                        f34.a(str2, null, 0L, 0L, 0L, 0L, 2, false, 1, 0, null, null, sk2Var2, 0, 120830);
                        sk2Var2.p(true);
                    } else {
                        sk2Var2.R();
                    }
                    return o27.a;
                }
            }, sk2Var), sk2Var, 56);
            if (((Boolean) k24Var.getValue()).booleanValue()) {
                sk2Var.X(-1526048517);
                Object L2 = sk2Var.L();
                if (L2 == sn1Var) {
                    L2 = new wg5(k24Var, 10);
                    sk2Var.h0(L2);
                }
                int i15 = i14 >> 3;
                d(str, list, i, mi2Var, (ki2) L2, sk2Var, (i14 & 14) | 24576 | (i15 & 112) | (i15 & 896) | (i15 & 7168));
                sk2Var.p(false);
            } else {
                sk2Var.X(-1525804423);
                sk2Var.p(false);
            }
            z3 = true;
        } else {
            sk2Var.R();
            z3 = z;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2(str, str2, list, i, mi2Var, z3, f, i2) { // from class: z66
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ List L;
                public final /* synthetic */ int R;
                public final /* synthetic */ mi2 X;
                public final /* synthetic */ boolean Y;
                public final /* synthetic */ float Z;

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(1);
                    yf2.e(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I);
                    return o27.a;
                }
            };
        }
    }

    public static final Object[] f(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        nu.i0(objArr, objArr2, 0, i, 6);
        nu.f0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] g(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        nu.i0(objArr, objArr2, 0, i, 6);
        nu.f0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] h(int i, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        nu.i0(objArr, objArr2, 0, i, 6);
        nu.f0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static void i(StringBuilder sb, Object obj, mi2 mi2Var) {
        boolean z;
        if (mi2Var != null) {
            sb.append((CharSequence) mi2Var.n(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.nu4 r5, defpackage.ki2 r6, defpackage.j11 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.lu4
            if (r0 == 0) goto L13
            r0 = r7
            lu4 r0 = (defpackage.lu4) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            lu4 r0 = new lu4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ki2 r6 = r0.R
            defpackage.me2.a0(r7)     // Catch: java.lang.Throwable -> L2a
            goto L63
        L2a:
            r5 = move-exception
            goto L69
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L32:
            defpackage.me2.a0(r7)
            e31 r7 = r0.B
            r7.getClass()
            k45 r2 = defpackage.k45.d0
            c31 r7 = r7.I(r2)
            if (r7 != r5) goto L6d
            r0.R = r6     // Catch: java.lang.Throwable -> L2a
            r0.Y = r4     // Catch: java.lang.Throwable -> L2a
            ih0 r7 = new ih0     // Catch: java.lang.Throwable -> L2a
            j11 r0 = defpackage.nk2.J(r0)     // Catch: java.lang.Throwable -> L2a
            r7.<init>(r4, r0)     // Catch: java.lang.Throwable -> L2a
            r7.x()     // Catch: java.lang.Throwable -> L2a
            z50 r0 = new z50     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r4, r7)     // Catch: java.lang.Throwable -> L2a
            q60 r5 = r5.Y     // Catch: java.lang.Throwable -> L2a
            r5.D(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r5 = r7.v()     // Catch: java.lang.Throwable -> L2a
            if (r5 != r1) goto L63
            return r1
        L63:
            r6.c()
            o27 r5 = defpackage.o27.a
            return r5
        L69:
            r6.c()
            throw r5
        L6d:
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            defpackage.i.n(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yf2.j(nu4, ki2, j11):java.lang.Object");
    }

    public static final boolean m(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f47 f47Var = (f47) obj;
            if (f47Var != null && E(f47Var)) {
                return true;
            }
        }
        return false;
    }

    public static ra7 n(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (Modifier.isPublic(declaredConstructor.getModifiers())) {
                try {
                    Object newInstance = declaredConstructor.newInstance(null);
                    newInstance.getClass();
                    return (ra7) newInstance;
                } catch (IllegalAccessException e) {
                    c44.n("Cannot create an instance of ", cls, e);
                    return null;
                } catch (InstantiationException e2) {
                    c44.n("Cannot create an instance of ", cls, e2);
                    return null;
                }
            }
            f81.t(cls, "Cannot create an instance of ");
            return null;
        } catch (NoSuchMethodException e3) {
            c44.n("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static final void o(ls5 ls5Var, String str) {
        ls5Var.getClass();
        ns5 i0 = ls5Var.i0(str);
        try {
            i0.a0();
            iq2.h(i0, null);
        } finally {
        }
    }

    public static int p(HandwritingGesture handwritingGesture, kb2 kb2Var) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        kb2Var.n(new cs0(fallbackText, 1));
        return 5;
    }

    public static final int q(int i, List list) {
        int i2;
        char c2;
        int i3 = ((wi4) tq0.T0(list)).c;
        if (i > ((wi4) tq0.T0(list)).c) {
            nz2.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 <= size) {
                i2 = (i4 + size) >>> 1;
                wi4 wi4Var = (wi4) list.get(i2);
                if (wi4Var.b > i) {
                    c2 = 1;
                } else if (wi4Var.c <= i) {
                    c2 = 65535;
                } else {
                    c2 = 0;
                }
                if (c2 < 0) {
                    i4 = i2 + 1;
                } else if (c2 <= 0) {
                    break;
                } else {
                    size = i2 - 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder s = wh1.s("Found paragraph index ", i2, " should be in range [0, ");
        s.append(list.size());
        s.append(").\nDebug info: index=");
        s.append(i);
        s.append(", paragraphs=[");
        s.append(dq3.a(31, new gi3(18), null, list));
        s.append(']');
        nz2.a(s.toString());
        return i2;
    }

    public static final int r(int i, List list) {
        char c2;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            wi4 wi4Var = (wi4) list.get(i3);
            if (wi4Var.d > i) {
                c2 = 1;
            } else if (wi4Var.e <= i) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i2 = i3 + 1;
            } else if (c2 > 0) {
                size = i3 - 1;
            } else {
                return i3;
            }
        }
        return -(i2 + 1);
    }

    public static final int s(ArrayList arrayList, float f) {
        char c2;
        if (f <= RecyclerView.A1) {
            return 0;
        }
        if (f >= ((wi4) tq0.T0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            wi4 wi4Var = (wi4) arrayList.get(i2);
            if (wi4Var.f > f) {
                c2 = 1;
            } else if (wi4Var.g <= f) {
                c2 = 65535;
            } else {
                c2 = 0;
            }
            if (c2 < 0) {
                i = i2 + 1;
            } else if (c2 > 0) {
                size = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static final void t(ArrayList arrayList, long j, mi2 mi2Var) {
        int size = arrayList.size();
        for (int q = q(vr6.f(j), arrayList); q < size; q++) {
            wi4 wi4Var = (wi4) arrayList.get(q);
            if (wi4Var.b < vr6.e(j)) {
                if (wi4Var.b != wi4Var.c) {
                    mi2Var.n(wi4Var);
                }
            } else {
                return;
            }
        }
    }

    public static final ax2 u() {
        ax2 ax2Var = b;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Leaderboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(7.5f, 21.0f);
        vq2Var.k(2.0f);
        vq2Var.t(9.0f);
        vq2Var.l(5.5f);
        vq2Var.t(21.0f);
        vq2Var.g();
        vq2Var.o(14.75f, 3.0f);
        vq2Var.l(-5.5f);
        vq2Var.u(18.0f);
        vq2Var.l(5.5f);
        vq2Var.t(3.0f);
        vq2Var.g();
        vq2Var.o(22.0f, 11.0f);
        vq2Var.l(-5.5f);
        vq2Var.u(10.0f);
        vq2Var.k(22.0f);
        vq2Var.t(11.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        b = b2;
        return b2;
    }

    public static final ax2 v() {
        ax2 ax2Var = c;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("AutoMirrored.Filled.Logout", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(17.0f, 7.0f);
        vq2Var.n(-1.41f, 1.41f);
        vq2Var.m(18.17f, 11.0f);
        vq2Var.k(8.0f);
        vq2Var.u(2.0f);
        vq2Var.l(10.17f);
        vq2Var.n(-2.58f, 2.58f);
        vq2Var.m(17.0f, 17.0f);
        vq2Var.n(5.0f, -5.0f);
        vq2Var.g();
        vq2Var.o(4.0f, 5.0f);
        vq2Var.l(8.0f);
        vq2Var.t(3.0f);
        vq2Var.k(4.0f);
        vq2Var.i(-1.1f, RecyclerView.A1, -2.0f, 0.9f, -2.0f, 2.0f);
        vq2Var.u(14.0f);
        vq2Var.i(RecyclerView.A1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        vq2Var.l(8.0f);
        vq2Var.u(-2.0f);
        vq2Var.k(4.0f);
        vq2Var.t(5.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        c = b2;
        return b2;
    }

    public static final i97 w(ArrayList arrayList, mi2 mi2Var) {
        h97 h97Var = i97.Companion;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int z = ((b57) mi2Var.n((f47) obj)).z();
            if (z != 0) {
                if (i2 != z && i2 != 0) {
                    ve2.c0("UseCaseUtil", "Unexpected configurations: Overwriting current previewStabilizationMode(" + i2 + ") with useCasePreviewStabilization(" + z + ")!");
                }
                i2 = z;
            }
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            int o = ((b57) mi2Var.n((f47) obj2)).o();
            if (o != 0) {
                if (i != o && i != 0) {
                    ve2.c0("UseCaseUtil", "Unexpected configurations: Overwriting current videoStabilizationMode(" + i + ") with useCaseVideoStabilization(" + o + ")!");
                }
                i = o;
            }
        }
        h97Var.getClass();
        if (i2 != 1 && i != 1) {
            if (i2 == 2) {
                return i97.PREVIEW;
            }
            if (i == 2) {
                return i97.ON;
            }
            return i97.UNSPECIFIED;
        }
        return i97.OFF;
    }

    public static final int z(int i, int i2) {
        return (i >> i2) & 31;
    }

    public abstract void J(int i);

    public abstract void K(Typeface typeface, boolean z);

    public abstract void M(int i);

    public abstract void N(View view, int i, int i2);

    public abstract void O(View view, float f, float f2);

    public abstract boolean W(View view, int i);

    public abstract int k(View view, int i);

    public abstract int l(View view, int i);

    public int x(View view) {
        return 0;
    }

    public int y() {
        return 0;
    }

    public void L(View view, int i) {
    }
}
