package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ep2  reason: default package */
/* loaded from: classes.dex */
public abstract class ep2 {
    public static nh b;
    public static id c;
    public static rh0 d;
    public static ax2 e;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ ep2(int i) {
        this.a = i;
    }

    public static final uv3 A(pr5 pr5Var, int i, int i2, int i3, int i4, int i5, vv3 vv3Var, List list, yn4[] yn4VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        int i10;
        int i11;
        float f2;
        boolean z;
        int i12;
        long j;
        int i13;
        int i14;
        int i15;
        List list2 = list;
        long j2 = i5;
        int i16 = i7 - i6;
        int[] iArr2 = new int[i16];
        int i17 = i6;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        float f3 = RecyclerView.A1;
        while (i17 < i7) {
            mv3 mv3Var = (mv3) list2.get(i17);
            float M = oo2.M(oo2.K(mv3Var));
            if (M > RecyclerView.A1) {
                f3 += M;
                i19++;
                j = j2;
                i13 = i17;
            } else {
                int i22 = i3 - i20;
                yn4 yn4Var = yn4VarArr[i17];
                j = j2;
                if (yn4Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i13 = i17;
                        i14 = i19;
                        i15 = Preference.DEFAULT_ORDER;
                    } else {
                        i13 = i17;
                        i14 = i19;
                        if (i22 < 0) {
                            i15 = 0;
                        } else {
                            i15 = i22;
                        }
                    }
                    yn4Var = mv3Var.c(pr5Var.d(0, i15, i4, false));
                } else {
                    i13 = i17;
                    i14 = i19;
                }
                yn4 yn4Var2 = yn4Var;
                int h = pr5Var.h(yn4Var2);
                int e2 = pr5Var.e(yn4Var2);
                iArr2[i13 - i6] = h;
                int i23 = i22 - h;
                if (i23 < 0) {
                    i23 = 0;
                }
                i21 = Math.min(i5, i23);
                i20 += h + i21;
                i18 = Math.max(i18, e2);
                yn4VarArr[i13] = yn4Var2;
                i19 = i14;
            }
            i17 = i13 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i19 == 0) {
            i20 -= i21;
            i11 = 0;
        } else {
            if (i3 != Integer.MAX_VALUE) {
                i10 = i3;
            } else {
                i10 = i;
            }
            long j4 = (i9 - 1) * j3;
            long j5 = (i10 - i20) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f4 = ((float) j5) / f3;
            for (int i24 = i6; i24 < i7; i24++) {
                j5 -= Math.round(oo2.M(oo2.K((mv3) list2.get(i24))) * f4);
            }
            int i25 = i6;
            int i26 = i18;
            int i27 = 0;
            while (i25 < i7) {
                if (yn4VarArr[i25] == null) {
                    mv3 mv3Var2 = (mv3) list2.get(i25);
                    f2 = f4;
                    qr5 K = oo2.K(mv3Var2);
                    float M2 = oo2.M(K);
                    if (M2 <= RecyclerView.A1) {
                        kz2.b("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j5);
                    long j6 = j5 - signum;
                    int max = Math.max(0, Math.round(M2 * f2) + signum);
                    if (K != null) {
                        z = K.b;
                    } else {
                        z = true;
                    }
                    if (z && max != Integer.MAX_VALUE) {
                        i12 = max;
                    } else {
                        i12 = 0;
                    }
                    yn4 c2 = mv3Var2.c(pr5Var.d(i12, max, i4, true));
                    int h2 = pr5Var.h(c2);
                    int e3 = pr5Var.e(c2);
                    iArr2[i25 - i6] = h2;
                    i27 += h2;
                    int max2 = Math.max(i26, e3);
                    yn4VarArr[i25] = c2;
                    i26 = max2;
                    j5 = j6;
                } else {
                    f2 = f4;
                }
                i25++;
                list2 = list;
                f4 = f2;
            }
            i11 = (int) (i27 + j4);
            int i28 = i3 - i20;
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 > i28) {
                i11 = i28;
            }
            i18 = i26;
        }
        int i29 = i11 + i20;
        if (i29 < 0) {
            i29 = 0;
        }
        int max3 = Math.max(i29, i);
        int max4 = Math.max(i18, Math.max(i2, 0));
        int[] iArr3 = new int[i16];
        pr5Var.c(max3, iArr2, iArr3, vv3Var);
        return pr5Var.j(yn4VarArr, vv3Var, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean B(ed2 ed2Var, zm zmVar) {
        ed2[] ed2VarArr = new ed2[16];
        if (!ed2Var.A.i0) {
            mz2.c("visitChildren called on an unattached node");
        }
        o24 o24Var = new o24(new yy3[16]);
        yy3 yy3Var = ed2Var.A;
        yy3 yy3Var2 = yy3Var.Y;
        if (yy3Var2 == null) {
            l.l(o24Var, yy3Var);
        } else {
            o24Var.b(yy3Var2);
        }
        int i = 0;
        while (true) {
            int i2 = o24Var.L;
            if (i2 == 0) {
                break;
            }
            yy3 yy3Var3 = (yy3) o24Var.l(i2 - 1);
            if ((yy3Var3.R & 1024) == 0) {
                l.l(o24Var, yy3Var3);
            } else {
                while (true) {
                    if (yy3Var3 == null) {
                        break;
                    } else if ((yy3Var3.L & 1024) != 0) {
                        o24 o24Var2 = null;
                        while (yy3Var3 != null) {
                            if (yy3Var3 instanceof ed2) {
                                ed2 ed2Var2 = (ed2) yy3Var3;
                                int i3 = i + 1;
                                if (ed2VarArr.length < i3) {
                                    int length = ed2VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(ed2VarArr, 0, r10, 0, length);
                                    ed2VarArr = r10;
                                }
                                ed2VarArr[i] = ed2Var2;
                                i = i3;
                            } else if ((yy3Var3.L & 1024) != 0 && (yy3Var3 instanceof xc1)) {
                                int i4 = 0;
                                for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                    if ((yy3Var4.L & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            yy3Var3 = yy3Var4;
                                        } else {
                                            if (o24Var2 == null) {
                                                o24Var2 = new o24(new yy3[16]);
                                            }
                                            if (yy3Var3 != null) {
                                                o24Var2.b(yy3Var3);
                                                yy3Var3 = null;
                                            }
                                            o24Var2.b(yy3Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            yy3Var3 = l.p(o24Var2);
                        }
                    } else {
                        yy3Var3 = yy3Var3.Y;
                    }
                }
            }
        }
        Arrays.sort(ed2VarArr, 0, i, hd2.b);
        int i5 = i - 1;
        if (i5 < ed2VarArr.length) {
            while (i5 >= 0) {
                ed2 ed2Var3 = ed2VarArr[i5];
                if (ii7.i(ed2Var3) && k(ed2Var3, zmVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean C(ed2 ed2Var, zm zmVar) {
        ed2[] ed2VarArr = new ed2[16];
        if (!ed2Var.A.i0) {
            mz2.c("visitChildren called on an unattached node");
        }
        o24 o24Var = new o24(new yy3[16]);
        yy3 yy3Var = ed2Var.A;
        yy3 yy3Var2 = yy3Var.Y;
        if (yy3Var2 == null) {
            l.l(o24Var, yy3Var);
        } else {
            o24Var.b(yy3Var2);
        }
        int i = 0;
        while (true) {
            int i2 = o24Var.L;
            if (i2 == 0) {
                break;
            }
            yy3 yy3Var3 = (yy3) o24Var.l(i2 - 1);
            if ((yy3Var3.R & 1024) == 0) {
                l.l(o24Var, yy3Var3);
            } else {
                while (true) {
                    if (yy3Var3 == null) {
                        break;
                    } else if ((yy3Var3.L & 1024) != 0) {
                        o24 o24Var2 = null;
                        while (yy3Var3 != null) {
                            if (yy3Var3 instanceof ed2) {
                                ed2 ed2Var2 = (ed2) yy3Var3;
                                int i3 = i + 1;
                                if (ed2VarArr.length < i3) {
                                    int length = ed2VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(ed2VarArr, 0, r10, 0, length);
                                    ed2VarArr = r10;
                                }
                                ed2VarArr[i] = ed2Var2;
                                i = i3;
                            } else if ((yy3Var3.L & 1024) != 0 && (yy3Var3 instanceof xc1)) {
                                int i4 = 0;
                                for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                    if ((yy3Var4.L & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            yy3Var3 = yy3Var4;
                                        } else {
                                            if (o24Var2 == null) {
                                                o24Var2 = new o24(new yy3[16]);
                                            }
                                            if (yy3Var3 != null) {
                                                o24Var2.b(yy3Var3);
                                                yy3Var3 = null;
                                            }
                                            o24Var2.b(yy3Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            yy3Var3 = l.p(o24Var2);
                        }
                    } else {
                        yy3Var3 = yy3Var3.Y;
                    }
                }
            }
        }
        Arrays.sort(ed2VarArr, 0, i, hd2.b);
        for (int i5 = 0; i5 < i; i5++) {
            ed2 ed2Var3 = ed2VarArr[i5];
            if (ii7.i(ed2Var3) && s(ed2Var3, zmVar)) {
                return true;
            }
        }
        return false;
    }

    public static void D(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static final uq6 E(tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        if (L == su0.a) {
            L = new uq6();
            sk2Var.h0(L);
        }
        return (uq6) L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x019b A[EDGE_INSN: B:160:0x019b->B:127:0x019b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean F(defpackage.ed2 r12, defpackage.ed2 r13, int r14, defpackage.zm r15) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep2.F(ed2, ed2, int, zm):boolean");
    }

    public static void G(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (hasOnClickListeners || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static final void H(int i, int i2, h06 h06Var) {
        String str;
        h06Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(h06Var.e(i4));
            }
            i3 >>>= 1;
        }
        String b2 = h06Var.b();
        b2.getClass();
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + b2 + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + b2 + "', but they were missing";
        }
        throw new vy3(str, null, arrayList, b2);
    }

    public static final int I(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final void J(iz5 iz5Var, int i, sv5 sv5Var) {
        iz5 iz5Var2;
        o24 o24Var = new o24(new iz5[16]);
        List i2 = iz5Var.i(false, false);
        while (true) {
            o24Var.d(o24Var.L, i2);
            while (true) {
                int i3 = o24Var.L;
                if (i3 != 0) {
                    iz5Var2 = (iz5) o24Var.l(i3 - 1);
                    boolean v = w81.v(iz5Var2);
                    ez5 ez5Var = iz5Var2.d;
                    d24 d24Var = ez5Var.A;
                    if (!v && !d24Var.c(mz5.j)) {
                        m74 d2 = iz5Var2.d();
                        if (d2 != null) {
                            e33 e0 = gk2.e0(me2.j(d2, true));
                            if (e0.a < e0.c && e0.b < e0.d) {
                                Object g2 = ez5Var.A.g(dz5.e);
                                rv5 rv5Var = null;
                                if (g2 == null) {
                                    g2 = null;
                                }
                                aj2 aj2Var = (aj2) g2;
                                Object g3 = d24Var.g(mz5.w);
                                if (g3 != null) {
                                    rv5Var = g3;
                                }
                                rv5 rv5Var2 = rv5Var;
                                if (aj2Var != null && rv5Var2 != null && ((Number) rv5Var2.b.c()).floatValue() > RecyclerView.A1) {
                                    int i4 = 1 + i;
                                    sv5Var.n(new tv5(iz5Var2, i4, e0, d2));
                                    J(iz5Var2, i4, sv5Var);
                                }
                            }
                        } else {
                            throw b31.e("Expected semantics node to have a coordinator.");
                        }
                    }
                } else {
                    return;
                }
            }
            i2 = iz5Var2.i(false, false);
        }
    }

    public static Class K(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Void.TYPE) {
            return Void.class;
        }
        return cls;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [b33, d33] */
    public static final void a(final wc3 wc3Var, final int i, final int i2, final int i3, final mi2 mi2Var, final ki2 ki2Var, tu0 tu0Var, final int i4) {
        int ordinal;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        wc3 wc3Var2;
        final int i11;
        int i12;
        int i13;
        mi2 mi2Var2;
        sk2 sk2Var;
        m55 r;
        aj2 aj2Var;
        boolean z2;
        final boolean z3;
        String o;
        int intValue;
        mi2Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(-559582182);
        if (wc3Var == null) {
            ordinal = -1;
        } else {
            ordinal = wc3Var.ordinal();
        }
        if (sk2Var2.d(ordinal)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i4 | i5;
        if (sk2Var2.d(i)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i15 = i14 | i6;
        if (sk2Var2.d(i2)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i16 = i15 | i7;
        if (sk2Var2.d(i3)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i17 = i16 | i8;
        if (sk2Var2.h(mi2Var)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        int i18 = i17 | i9;
        if (sk2Var2.h(ki2Var)) {
            i10 = 131072;
        } else {
            i10 = 65536;
        }
        int i19 = i10 | i18;
        if ((74899 & i19) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i19 & 1, z)) {
            if (wc3Var == null) {
                r = sk2Var2.r();
                if (r != null) {
                    aj2Var = new aj2(wc3Var, i, i2, i3, mi2Var, ki2Var, i4, 0) { // from class: dd3
                        public final /* synthetic */ int A;
                        public final /* synthetic */ wc3 B;
                        public final /* synthetic */ int L;
                        public final /* synthetic */ int R;
                        public final /* synthetic */ int X;
                        public final /* synthetic */ mi2 Y;
                        public final /* synthetic */ ki2 Z;

                        {
                            this.A = r8;
                        }

                        @Override // defpackage.aj2
                        public final Object j(Object obj, Object obj2) {
                            int i20 = this.A;
                            o27 o27Var = o27.a;
                            switch (i20) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int I = ep2.I(1);
                                    ep2.a(this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I);
                                    return o27Var;
                                default:
                                    ((Integer) obj2).getClass();
                                    int I2 = ep2.I(1);
                                    ep2.a(this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I2);
                                    return o27Var;
                            }
                        }
                    };
                    r.d = aj2Var;
                }
                return;
            }
            wc3Var2 = wc3Var;
            i11 = i;
            i12 = i2;
            i13 = i3;
            final ?? b33Var = new b33(i12, i13, 1);
            Object[] objArr = {wc3Var2, Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)};
            if ((i19 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = sk2Var2.L();
            if (z2 || L == su0.a) {
                L = new ki2() { // from class: ed3
                    @Override // defpackage.ki2
                    public final Object c() {
                        return me2.G(String.valueOf(i11));
                    }
                };
                sk2Var2.h0(L);
            }
            final k24 k24Var = (k24) jk2.M(objArr, (ki2) L, sk2Var2, 0);
            Integer o0 = gh6.o0((String) k24Var.getValue());
            if (o0 == null || i12 > (intValue = o0.intValue()) || intValue > b33Var.B) {
                o0 = null;
            }
            if (((String) k24Var.getValue()).length() > 0 && o0 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i20 = gd3.a[wc3Var2.ordinal()];
            if (i20 != 1) {
                if (i20 != 2) {
                    if (i20 == 3) {
                        o = b31.o(sk2Var2, -887536097, R.string.label_height, sk2Var2, false);
                    } else {
                        throw ej6.d(sk2Var2, -887544085, false);
                    }
                } else {
                    o = b31.o(sk2Var2, -887539010, R.string.label_width, sk2Var2, false);
                }
            } else {
                o = b31.o(sk2Var2, -887541859, R.string.label_size, sk2Var2, false);
            }
            String str = o;
            final Integer num = o0;
            mi2Var2 = mi2Var;
            sk2Var = sk2Var2;
            mh7.a(str, ki2Var, ct3.H0(1791564517, new bj2() { // from class: fd3
                @Override // defpackage.bj2
                public final Object i(Object obj, Object obj2, Object obj3) {
                    boolean z4;
                    long f2;
                    int i21;
                    ih4 ih4Var = (ih4) obj;
                    tu0 tu0Var2 = (tu0) obj2;
                    int intValue2 = ((Integer) obj3).intValue();
                    ih4Var.getClass();
                    if ((intValue2 & 6) == 0) {
                        if (((sk2) tu0Var2).f(ih4Var)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        intValue2 |= i21;
                    }
                    if ((intValue2 & 19) != 18) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sk2 sk2Var3 = (sk2) tu0Var2;
                    if (sk2Var3.O(intValue2 & 1, z4)) {
                        wy3 wy3Var = wy3.a;
                        zy3 W = b53.W(o76.c(wy3Var, 1.0f), ih4Var);
                        lr0 a = jr0.a(new ot(4.0f, true, new i(1)), y60.j0, sk2Var3, 6);
                        int hashCode = Long.hashCode(sk2Var3.T);
                        sm4 l = sk2Var3.l();
                        zy3 e0 = l07.e0(sk2Var3, W);
                        nu0.i.getClass();
                        mv0 mv0Var = mu0.b;
                        sk2Var3.b0();
                        if (sk2Var3.S) {
                            sk2Var3.k(mv0Var);
                        } else {
                            sk2Var3.k0();
                        }
                        oo2.S(sk2Var3, mu0.f, a);
                        oo2.S(sk2Var3, mu0.e, l);
                        oo2.S(sk2Var3, mu0.g, Integer.valueOf(hashCode));
                        oo2.P(sk2Var3, mu0.h);
                        oo2.S(sk2Var3, mu0.d, e0);
                        zy3 c2 = o76.c(wy3Var, 1.0f);
                        k24 k24Var2 = k24Var;
                        String str2 = (String) k24Var2.getValue();
                        yb1 w = pu.w(sk2Var3);
                        fb3 fb3Var = new fb3(0, 3, 7, 115);
                        Integer num2 = num;
                        boolean f3 = sk2Var3.f(num2);
                        mi2 mi2Var3 = mi2Var;
                        boolean f4 = f3 | sk2Var3.f(mi2Var3);
                        Object L2 = sk2Var3.L();
                        sn1 sn1Var = su0.a;
                        if (f4 || L2 == sn1Var) {
                            L2 = new gi2(7, num2, mi2Var3);
                            sk2Var3.h0(L2);
                        }
                        db3 db3Var = new db3(62, (mi2) L2);
                        boolean f5 = sk2Var3.f(k24Var2);
                        Object L3 = sk2Var3.L();
                        if (f5 || L3 == sn1Var) {
                            L3 = new j4(k24Var2, 11);
                            sk2Var3.h0(L3);
                        }
                        boolean z5 = z3;
                        vf4.b(str2, (mi2) L3, c2, false, null, null, z5, null, fb3Var, db3Var, true, 0, 0, null, w, sk2Var3, RendererDebugBridge.CAPTURE_HEIGHT, 24576, 494584);
                        d33 d33Var = b33Var;
                        String W2 = me2.W(R.string.layout_position_allowed_range, new Object[]{Integer.valueOf(d33Var.A), Integer.valueOf(d33Var.B)}, sk2Var3);
                        ds6 ds6Var = ((c17) sk2Var3.j(d17.b)).l;
                        if (z5) {
                            sk2Var3.X(-325335148);
                            f2 = ((hr0) sk2Var3.j(ir0.a)).b();
                        } else {
                            sk2Var3.X(-325334120);
                            f2 = ((hr0) sk2Var3.j(ir0.a)).f();
                        }
                        sk2Var3.p(false);
                        ir6.b(W2, null, f2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ds6Var, sk2Var3, 0, 0, 65530);
                        sk2Var3.p(true);
                    } else {
                        sk2Var3.R();
                    }
                    return o27.a;
                }
            }, sk2Var2), ct3.H0(620005923, new w3(ki2Var, num, mi2Var2, 17), sk2Var2), false, sk2Var, ((i19 >> 12) & 112) | 3456, 16);
        } else {
            wc3Var2 = wc3Var;
            i11 = i;
            i12 = i2;
            i13 = i3;
            mi2Var2 = mi2Var;
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        r = sk2Var.r();
        if (r != null) {
            final wc3 wc3Var3 = wc3Var2;
            final mi2 mi2Var3 = mi2Var2;
            final int i21 = i11;
            final int i22 = i12;
            final int i23 = i13;
            aj2Var = new aj2(wc3Var3, i21, i22, i23, mi2Var3, ki2Var, i4, 1) { // from class: dd3
                public final /* synthetic */ int A;
                public final /* synthetic */ wc3 B;
                public final /* synthetic */ int L;
                public final /* synthetic */ int R;
                public final /* synthetic */ int X;
                public final /* synthetic */ mi2 Y;
                public final /* synthetic */ ki2 Z;

                {
                    this.A = r8;
                }

                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    int i202 = this.A;
                    o27 o27Var = o27.a;
                    switch (i202) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int I = ep2.I(1);
                            ep2.a(this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I);
                            return o27Var;
                        default:
                            ((Integer) obj2).getClass();
                            int I2 = ep2.I(1);
                            ep2.a(this.B, this.L, this.R, this.X, this.Y, this.Z, (tu0) obj, I2);
                            return o27Var;
                    }
                }
            };
            r.d = aj2Var;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0268, code lost:
        if (r14.g(false) != false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.zy3 r37, defpackage.ki3 r38, defpackage.ho2 r39, defpackage.ih4 r40, defpackage.a92 r41, boolean r42, defpackage.eg r43, defpackage.qt r44, defpackage.nt r45, defpackage.mi2 r46, defpackage.tu0 r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep2.b(zy3, ki3, ho2, ih4, a92, boolean, eg, qt, nt, mi2, tu0, int, int):void");
    }

    public static final void c(n3 n3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        long j;
        l3 l3Var = n3Var.e;
        j15 j15Var = n3Var.b;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1577380411);
        if (sk2Var.h(n3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            String X = me2.X(sk2Var, me2.F(j15Var.e));
            String str = n3Var.d;
            if (zg6.B0(str)) {
                str = "--";
            }
            String W = me2.W(R.string.leaderboard_attempt_value, new Object[]{X, str}, sk2Var);
            Long valueOf = Long.valueOf(j15Var.a);
            boolean h = sk2Var.h(n3Var);
            Object L = sk2Var.L();
            if (h || L == su0.a) {
                L = new a6(n3Var, null, 28);
                sk2Var.h0(L);
            }
            l.h(valueOf, l3Var, (aj2) L, sk2Var);
            zy3 X2 = b53.X(wy3.a, 8.0f);
            URL url = n3Var.c;
            os osVar = n3Var.f;
            if (l3Var == l3.SUCCESS) {
                j = s25.a;
            } else {
                j = s25.b;
            }
            pu.a(X2, url, osVar, new xq0(j), ct3.H0(-92076065, new l4(4, n3Var, W), sk2Var), sk2Var, 24582, 0);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 14, n3Var);
        }
    }

    public static final void d(zy3 zy3Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1854833411);
        if (sk2Var.f(zy3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = wf.j;
                sk2Var.h0(L);
            }
            tv3 tv3Var = (tv3) L;
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, tv3Var);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            et0Var.j(sk2Var, 6);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new i15(i, 7, zy3Var, et0Var);
        }
    }

    public static final wg6 e(t63 t63Var, String str) {
        t63Var.getClass();
        str.getClass();
        return new wg6(str, t63Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r17, defpackage.uq6 r18, defpackage.mi2 r19, defpackage.ki2 r20, defpackage.tu0 r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep2.f(java.lang.String, uq6, mi2, ki2, tu0, int, int):void");
    }

    public static final long g(float f2, float f3) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        int i = sw6.c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r36, final defpackage.ki2 r37, defpackage.zy3 r38, java.util.List r39, defpackage.aj2 r40, defpackage.tu5 r41, final defpackage.et0 r42, defpackage.tu0 r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep2.h(java.lang.String, ki2, zy3, java.util.List, aj2, tu5, et0, tu0, int, int):void");
    }

    public static void i(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final Object j(fq3 fq3Var, k11 k11Var) {
        try {
            if (fq3Var.isDone()) {
                return q1.f(fq3Var);
            }
            ih0 ih0Var = new ih0(1, nk2.J(k11Var));
            fq3Var.a(new vt6(fq3Var, ih0Var, 1), of1.INSTANCE);
            ih0Var.z(new yb(20, fq3Var));
            Object v = ih0Var.v();
            p31 p31Var = p31.COROUTINE_SUSPENDED;
            return v;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                throw cause;
            }
            NullPointerException nullPointerException = new NullPointerException();
            b53.e0(nullPointerException, b53.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean k(defpackage.ed2 r9, defpackage.zm r10) {
        /*
            bd2 r0 = r9.W0()
            int[] r1 = defpackage.bd4.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r2 = 4
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r0 == r6) goto L3f
            if (r0 == r5) goto L3a
            if (r0 == r3) goto L3a
            if (r0 != r2) goto L36
            boolean r0 = B(r9, r10)
            if (r0 != 0) goto L88
            rc2 r0 = r9.T0()
            boolean r0 = r0.a
            if (r0 == 0) goto L32
            java.lang.Object r9 = r10.n(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            goto L33
        L32:
            r9 = r4
        L33:
            if (r9 == 0) goto L87
            goto L88
        L36:
            defpackage.i.c()
            return r4
        L3a:
            boolean r9 = B(r9, r10)
            return r9
        L3f:
            ed2 r0 = defpackage.ii7.d(r9)
            java.lang.String r7 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L89
            bd2 r8 = r0.W0()
            int r8 = r8.ordinal()
            r1 = r1[r8]
            if (r1 == r6) goto L66
            if (r1 == r5) goto L61
            if (r1 == r3) goto L61
            if (r1 == r2) goto L5d
            defpackage.i.c()
            return r4
        L5d:
            defpackage.i.n(r7)
            return r4
        L61:
            boolean r9 = t(r9, r0, r5, r10)
            return r9
        L66:
            boolean r1 = k(r0, r10)
            if (r1 != 0) goto L88
            boolean r9 = t(r9, r0, r5, r10)
            if (r9 != 0) goto L88
            rc2 r9 = r0.T0()
            boolean r9 = r9.a
            if (r9 == 0) goto L87
            java.lang.Object r9 = r10.n(r0)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L87
            goto L88
        L87:
            return r4
        L88:
            return r6
        L89:
            defpackage.i.n(r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ep2.k(ed2, zm):boolean");
    }

    public static final int l(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            int i3 = (j > jArr[i2] ? 1 : (j == jArr[i2] ? 0 : -1));
            if (i3 > 0) {
                i = i2 + 1;
            } else if (i3 < 0) {
                length = i2 - 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    public static ImageView.ScaleType m(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static final Object n(t63 t63Var, m93 m93Var, t71 t71Var) {
        m93Var.getClass();
        m45 m45Var = new m45(t71Var, bk0.c.d(16384), t63Var.a);
        try {
            Object n = new og6(t63Var, ej7.OBJ, m45Var, m93Var.e()).n(m93Var);
            m45Var.o();
            return n;
        } finally {
            m45Var.D();
        }
    }

    public static final float o(ki4 ki4Var) {
        if (ki4Var.m().e == jf4.Horizontal) {
            return Float.intBitsToFloat((int) (ki4Var.q() >> 32));
        }
        return Float.intBitsToFloat((int) (ki4Var.q() & 4294967295L));
    }

    public static final void p(t63 t63Var, b43 b43Var, m93 m93Var, Object obj) {
        m93Var.getClass();
        ej7 ej7Var = ej7.OBJ;
        ej7Var.getClass();
        new qg6(new i40(b43Var), t63Var, ej7Var, new qg6[((k0) ej7.getEntries()).b()]).l(m93Var, obj);
    }

    public static final float q(float f2) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = intBitsToFloat - ((intBitsToFloat - (f2 / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static View r(View view, int i) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View findViewById = viewGroup.getChildAt(i2).findViewById(i);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }

    public static final boolean s(ed2 ed2Var, zm zmVar) {
        int i = bd4.a[ed2Var.W0().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (ed2Var.T0().a) {
                        return ((Boolean) zmVar.n(ed2Var)).booleanValue();
                    }
                    return C(ed2Var, zmVar);
                }
                i.c();
                return false;
            }
            return C(ed2Var, zmVar);
        }
        ed2 d2 = ii7.d(ed2Var);
        if (d2 != null) {
            if (!s(d2, zmVar) && !t(ed2Var, d2, 1, zmVar)) {
                return false;
            }
            return true;
        }
        i.n("ActiveParent must have a focusedChild");
        return false;
    }

    public static final boolean t(ed2 ed2Var, ed2 ed2Var2, int i, zm zmVar) {
        if (F(ed2Var, ed2Var2, i, zmVar)) {
            return true;
        }
        Boolean bool = (Boolean) pu.H(ed2Var, i, new cd4(((nc2) ((ee) l.Q(ed2Var)).getFocusOwner()).f(), ed2Var, ed2Var2, i, zmVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final Class u(h06 h06Var) {
        String l0 = gh6.l0(h06Var.b(), "?", "");
        try {
            return Class.forName(l0);
        } catch (ClassNotFoundException unused) {
            if (zg6.q0(l0, ".", false)) {
                Pattern compile = Pattern.compile("(\\.+)(?!.*\\.)");
                compile.getClass();
                String replaceAll = compile.matcher(l0).replaceAll("\\$");
                replaceAll.getClass();
                return Class.forName(replaceAll);
            }
            String str = "Cannot find class with name \"" + h06Var.b() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (h06Var.c() instanceof m06) {
                str = str.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            i.i(str);
            return null;
        }
    }

    public static final ax2 v() {
        ax2 ax2Var = e;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.RestartAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = f77.a;
        long j = xq0.b;
        mb6 mb6Var = new mb6(j);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(12.0f, 5.0f);
        vq2Var.t(2.0f);
        vq2Var.m(8.0f, 6.0f);
        vq2Var.n(4.0f, 4.0f);
        vq2Var.t(7.0f);
        vq2Var.i(3.31f, RecyclerView.A1, 6.0f, 2.69f, 6.0f, 6.0f);
        vq2Var.i(RecyclerView.A1, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
        vq2Var.u(2.02f);
        vq2Var.i(3.95f, -0.49f, 7.0f, -3.85f, 7.0f, -7.93f);
        vq2Var.h(20.0f, 8.58f, 16.42f, 5.0f, 12.0f, 5.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        mb6 mb6Var2 = new mb6(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new rk4(6.0f, 13.0f));
        arrayList.add(new wk4(RecyclerView.A1, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f));
        arrayList.add(new qk4(6.34f, 7.34f));
        arrayList.add(new ok4(4.9f, 8.79f, 4.0f, 10.79f, 4.0f, 13.0f));
        arrayList.add(new wk4(RecyclerView.A1, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f));
        arrayList.add(new dl4(-2.02f));
        arrayList.add(new ok4(8.17f, 18.43f, 6.0f, 15.97f, 6.0f, 13.0f));
        arrayList.add(nk4.c);
        zw2.a(zw2Var, arrayList, 0, mb6Var2);
        ax2 b2 = zw2Var.b();
        e = b2;
        return b2;
    }

    public static boolean w(MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & i) == i) {
            return true;
        }
        return false;
    }

    public static final boolean x(ki4 ki4Var, float f2) {
        float o;
        boolean z;
        ki4Var.m().getClass();
        if (ki4Var.r()) {
            o = -f2;
        } else {
            o = o(ki4Var);
        }
        if (o > RecyclerView.A1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return true;
    }

    public static final float y(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int z(float f2, int i, int i2) {
        return i + ((int) Math.round((i2 - i) * f2));
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
                String c2 = q75.a(getClass()).c();
                c2.getClass();
                return c2;
            default:
                return super.toString();
        }
    }
}
