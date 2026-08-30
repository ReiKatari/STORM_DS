package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.media.ImageReader;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mj2 */
/* loaded from: classes.dex */
public abstract class mj2 implements ij2 {
    public static final int A = 9;
    public static final int B = 10;
    public static final int L = 12;
    public static final /* synthetic */ int R = 0;
    public static final /* synthetic */ int X = 0;
    public static ax2 Y;
    public static ax2 Z;

    public static final ax2 A() {
        ax2 ax2Var = Z;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Settings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(19.14f, 12.94f);
        vq2Var.i(0.04f, -0.3f, 0.06f, -0.61f, 0.06f, -0.94f);
        vq2Var.i(RecyclerView.A1, -0.32f, -0.02f, -0.64f, -0.07f, -0.94f);
        vq2Var.n(2.03f, -1.58f);
        vq2Var.i(0.18f, -0.14f, 0.23f, -0.41f, 0.12f, -0.61f);
        vq2Var.n(-1.92f, -3.32f);
        vq2Var.i(-0.12f, -0.22f, -0.37f, -0.29f, -0.59f, -0.22f);
        vq2Var.n(-2.39f, 0.96f);
        vq2Var.i(-0.5f, -0.38f, -1.03f, -0.7f, -1.62f, -0.94f);
        vq2Var.m(14.4f, 2.81f);
        vq2Var.i(-0.04f, -0.24f, -0.24f, -0.41f, -0.48f, -0.41f);
        vq2Var.l(-3.84f);
        vq2Var.i(-0.24f, RecyclerView.A1, -0.43f, 0.17f, -0.47f, 0.41f);
        vq2Var.m(9.25f, 5.35f);
        vq2Var.h(8.66f, 5.59f, 8.12f, 5.92f, 7.63f, 6.29f);
        vq2Var.m(5.24f, 5.33f);
        vq2Var.i(-0.22f, -0.08f, -0.47f, RecyclerView.A1, -0.59f, 0.22f);
        vq2Var.m(2.74f, 8.87f);
        vq2Var.h(2.62f, 9.08f, 2.66f, 9.34f, 2.86f, 9.48f);
        vq2Var.n(2.03f, 1.58f);
        vq2Var.h(4.84f, 11.36f, 4.8f, 11.69f, 4.8f, 12.0f);
        vq2Var.q(0.02f, 0.64f, 0.07f, 0.94f);
        vq2Var.n(-2.03f, 1.58f);
        vq2Var.i(-0.18f, 0.14f, -0.23f, 0.41f, -0.12f, 0.61f);
        vq2Var.n(1.92f, 3.32f);
        vq2Var.i(0.12f, 0.22f, 0.37f, 0.29f, 0.59f, 0.22f);
        vq2Var.n(2.39f, -0.96f);
        vq2Var.i(0.5f, 0.38f, 1.03f, 0.7f, 1.62f, 0.94f);
        vq2Var.n(0.36f, 2.54f);
        vq2Var.i(0.05f, 0.24f, 0.24f, 0.41f, 0.48f, 0.41f);
        vq2Var.l(3.84f);
        vq2Var.i(0.24f, RecyclerView.A1, 0.44f, -0.17f, 0.47f, -0.41f);
        vq2Var.n(0.36f, -2.54f);
        vq2Var.i(0.59f, -0.24f, 1.13f, -0.56f, 1.62f, -0.94f);
        vq2Var.n(2.39f, 0.96f);
        vq2Var.i(0.22f, 0.08f, 0.47f, RecyclerView.A1, 0.59f, -0.22f);
        vq2Var.n(1.92f, -3.32f);
        vq2Var.i(0.12f, -0.22f, 0.07f, -0.47f, -0.12f, -0.61f);
        vq2Var.m(19.14f, 12.94f);
        vq2Var.g();
        vq2Var.o(12.0f, 15.6f);
        vq2Var.i(-1.98f, RecyclerView.A1, -3.6f, -1.62f, -3.6f, -3.6f);
        vq2Var.q(1.62f, -3.6f, 3.6f, -3.6f);
        vq2Var.q(3.6f, 1.62f, 3.6f, 3.6f);
        vq2Var.p(13.98f, 15.6f, 12.0f, 15.6f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b = zw2Var.b();
        Z = b;
        return b;
    }

    public static mr4 B(ds dsVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new mr4(dp.q(dsVar));
        }
        TextPaint textPaint = new TextPaint(dsVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = dsVar.getBreakStrategy();
        int hyphenationFrequency = dsVar.getHyphenationFrequency();
        if (dsVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = true;
            if (i >= 28 && (dsVar.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(dp.e(DecimalFormatSymbols.getInstance(dsVar.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (dsVar.getLayoutDirection() != 1) {
                    z = false;
                }
                switch (dsVar.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case ig7.b /* 6 */:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new mr4(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final jd7 C(tu0 tu0Var) {
        return (jd7) ((sk2) tu0Var).j(kd7.c);
    }

    public static final boolean D(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static final int E(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean F(y55 y55Var, y55 y55Var2, y55 y55Var3, int i) {
        if (G(i, y55Var, y55Var3)) {
            if (G(i, y55Var2, y55Var3) && !l(y55Var3, y55Var, y55Var2, i)) {
                if (!l(y55Var3, y55Var2, y55Var, i) && H(i, y55Var3, y55Var) < H(i, y55Var3, y55Var2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean G(int i, y55 y55Var, y55 y55Var2) {
        if (i == 3) {
            float f = y55Var2.c;
            float f2 = y55Var2.a;
            float f3 = y55Var.c;
            if ((f <= f3 && f2 < f3) || f2 <= y55Var.a) {
                return false;
            }
            return true;
        } else if (i == 4) {
            float f4 = y55Var2.a;
            float f5 = y55Var2.c;
            float f6 = y55Var.a;
            if ((f4 >= f6 && f5 > f6) || f5 >= y55Var.c) {
                return false;
            }
            return true;
        } else if (i == 5) {
            float f7 = y55Var2.d;
            float f8 = y55Var2.b;
            float f9 = y55Var.d;
            if ((f7 <= f9 && f8 < f9) || f8 <= y55Var.b) {
                return false;
            }
            return true;
        } else if (i == 6) {
            float f10 = y55Var2.b;
            float f11 = y55Var2.d;
            float f12 = y55Var.b;
            if ((f10 >= f12 && f11 > f12) || f11 >= y55Var.d) {
                return false;
            }
            return true;
        } else {
            i.n("This function should only be used for 2-D focus search");
            return false;
        }
    }

    public static final long H(int i, y55 y55Var, y55 y55Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = y55Var.a;
            f2 = y55Var2.c;
        } else if (i == 4) {
            f = y55Var2.a;
            f2 = y55Var.c;
        } else if (i == 5) {
            f = y55Var.b;
            f2 = y55Var2.d;
        } else if (i == 6) {
            f = y55Var2.b;
            f2 = y55Var.d;
        } else {
            i.n("This function should only be used for 2-D focus search");
            return 0L;
        }
        float f6 = f - f2;
        if (f6 < RecyclerView.A1) {
            f6 = 0.0f;
        }
        long j = f6;
        if (i == 3 || i == 4) {
            float f7 = y55Var.b;
            f3 = ((y55Var.d - f7) / 2.0f) + f7;
            f4 = y55Var2.b;
            f5 = y55Var2.d;
        } else if (i == 5 || i == 6) {
            float f8 = y55Var.a;
            f3 = ((y55Var.c - f8) / 2.0f) + f8;
            f4 = y55Var2.a;
            f5 = y55Var2.c;
        } else {
            i.n("This function should only be used for 2-D focus search");
            return 0L;
        }
        long j2 = f3 - (((f5 - f4) / 2.0f) + f4);
        return (j2 * j2) + (13 * j * j);
    }

    public static boolean I(int i, CharSequence charSequence) {
        if (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            switch (charAt) {
                case '!':
                case '\"':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (charAt) {
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (charAt) {
                                        case '{':
                                        case '|':
                                        case '}':
                                        case '~':
                                            return true;
                                        default:
                                            return false;
                                    }
                            }
                    }
            }
        }
        return false;
    }

    public static final boolean J(vf3 vf3Var) {
        vf3 vf3Var2;
        if (vf3Var.d0 != null) {
            vf3 u = vf3Var.u();
            if (u != null) {
                vf3Var2 = u.d0;
            } else {
                vf3Var2 = null;
            }
            if (vf3Var2 == null || vf3Var.B0.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String[] K(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            ve2.c0("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            ve2.d0("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    public static final long L(float f, long j) {
        if (!Float.isNaN(f) && f < 1.0f) {
            return xq0.b(xq0.d(j) * f, j);
        }
        return j;
    }

    public static final long M(long j, long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L))) & 4294967295L);
    }

    public static vs3 N(kj7 kj7Var) {
        if (kj7Var == null) {
            kj7Var = sn2.d(System.nanoTime());
        }
        return new vs3(tq0.X0(vs3.b, tq0.n1(new f17(kj7Var.c(new byte[3])))));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashSet O(java.lang.String[] r8) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L4a
            r3 = r8[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r5 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.Class<kx4> r6 = defpackage.kx4.class
            boolean r6 = r6.isAssignableFrom(r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            if (r6 == 0) goto L1a
            goto L42
        L1a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.<init>()     // Catch: java.lang.ClassNotFoundException -> L2f
            r5.append(r3)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r6 = " does not implement the Quirk interface."
            r5.append(r6)     // Catch: java.lang.ClassNotFoundException -> L2f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.ClassNotFoundException -> L2f
            defpackage.ve2.c0(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L2f
            goto L41
        L2f:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Class not found: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            defpackage.ve2.d0(r4, r3, r5)
        L41:
            r5 = 0
        L42:
            if (r5 == 0) goto L47
            r0.add(r5)
        L47:
            int r2 = r2 + 1
            goto L7
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj2.O(java.lang.String[]):java.util.HashSet");
    }

    public static final long P(long j) {
        int round = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (round << 32);
    }

    public static final boolean Q(int i, zm zmVar, ed2 ed2Var, y55 y55Var) {
        ed2 s;
        o24 o24Var = new o24(new ed2[16]);
        if (!ed2Var.A.i0) {
            mz2.c("visitChildren called on an unattached node");
        }
        o24 o24Var2 = new o24(new yy3[16]);
        yy3 yy3Var = ed2Var.A;
        yy3 yy3Var2 = yy3Var.Y;
        if (yy3Var2 == null) {
            l.l(o24Var2, yy3Var);
        } else {
            o24Var2.b(yy3Var2);
        }
        while (true) {
            int i2 = o24Var2.L;
            if (i2 == 0) {
                break;
            }
            yy3 yy3Var3 = (yy3) o24Var2.l(i2 - 1);
            if ((yy3Var3.R & 1024) == 0) {
                l.l(o24Var2, yy3Var3);
            } else {
                while (true) {
                    if (yy3Var3 == null) {
                        break;
                    } else if ((yy3Var3.L & 1024) != 0) {
                        o24 o24Var3 = null;
                        while (yy3Var3 != null) {
                            if (yy3Var3 instanceof ed2) {
                                ed2 ed2Var2 = (ed2) yy3Var3;
                                if (ed2Var2.i0) {
                                    o24Var.b(ed2Var2);
                                }
                            } else if ((yy3Var3.L & 1024) != 0 && (yy3Var3 instanceof xc1)) {
                                int i3 = 0;
                                for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                    if ((yy3Var4.L & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            yy3Var3 = yy3Var4;
                                        } else {
                                            if (o24Var3 == null) {
                                                o24Var3 = new o24(new yy3[16]);
                                            }
                                            if (yy3Var3 != null) {
                                                o24Var3.b(yy3Var3);
                                                yy3Var3 = null;
                                            }
                                            o24Var3.b(yy3Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            yy3Var3 = l.p(o24Var3);
                        }
                    } else {
                        yy3Var3 = yy3Var3.Y;
                    }
                }
            }
        }
        while (o24Var.L != 0 && (s = s(o24Var, y55Var, i)) != null) {
            if (s.T0().a) {
                return ((Boolean) zmVar.n(s)).booleanValue();
            }
            if (x(i, zmVar, s, y55Var)) {
                return true;
            }
            o24Var.k(s);
        }
        return false;
    }

    public static void R(TextView textView, int i) {
        int i2;
        nl2.B(i);
        if (Build.VERSION.SDK_INT >= 28) {
            dp.t(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void S(TextView textView, int i) {
        int i2;
        nl2.B(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void T(TextView textView, int i) {
        nl2.B(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static int U(char c, int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int V(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final zy3 W(float f, long j, zy3 zy3Var, y26 y26Var) {
        return a53.t(dk7.i(jk2.Q(zy3Var, f, y26Var, false, 0L, 24).f(wy3.a), j, y26Var), y26Var);
    }

    public static final long X(long j, u91 u91Var, float f, sk2 sk2Var) {
        if (xq0.c(j, ((hr0) sk2Var.j(ir0.a)).j()) && u91Var != null) {
            sk2Var.X(-1124614454);
            long a = u91.a(j, f, sk2Var, 0);
            sk2Var.p(false);
            return a;
        }
        sk2Var.X(-1124546347);
        sk2Var.p(false);
        return j;
    }

    public static final Boolean Y(int i, zm zmVar, ed2 ed2Var, y55 y55Var) {
        bd2 W0 = ed2Var.W0();
        int[] iArr = zy6.a;
        int i2 = iArr[W0.ordinal()];
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                if (i2 == 4) {
                    if (ed2Var.T0().a) {
                        return (Boolean) zmVar.n(ed2Var);
                    }
                    if (y55Var == null) {
                        return Boolean.valueOf(t(ed2Var, i, zmVar));
                    }
                    return Boolean.valueOf(Q(i, zmVar, ed2Var, y55Var));
                }
                i.c();
                return null;
            }
            return Boolean.valueOf(t(ed2Var, i, zmVar));
        }
        ed2 d = ii7.d(ed2Var);
        if (d != null) {
            int i3 = iArr[d.W0().ordinal()];
            if (i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    if (i3 != 4) {
                        i.c();
                        return null;
                    }
                    i.n("ActiveParent must have a focusedChild");
                    return null;
                }
                if (y55Var == null) {
                    y55Var = ii7.c(d);
                }
                return Boolean.valueOf(x(i, zmVar, ed2Var, y55Var));
            }
            Boolean Y2 = Y(i, zmVar, d, y55Var);
            if (!b53.x(Y2, Boolean.FALSE)) {
                return Y2;
            }
            if (y55Var == null) {
                if (d.W0() == bd2.ActiveParent) {
                    ed2 b = ii7.b(d);
                    if (b != null) {
                        y55Var = ii7.c(b);
                    } else {
                        i.n("ActiveParent must have a focusedChild");
                        return null;
                    }
                } else {
                    i.n("Searching for active node in inactive hierarchy");
                    return null;
                }
            }
            return Boolean.valueOf(x(i, zmVar, ed2Var, y55Var));
        }
        i.n("ActiveParent must have a focusedChild");
        return null;
    }

    public static ActionMode.Callback Z(ActionMode.Callback callback) {
        if ((callback instanceof ks6) && Build.VERSION.SDK_INT >= 26) {
            return ((ks6) callback).a;
        }
        return callback;
    }

    public static final void a(l34 l34Var, jt5 jt5Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(233973821);
        if (sk2Var.h(l34Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var.h(jt5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        if (((i4 | i3) & 147) == 146 && sk2Var.A()) {
            sk2Var.R();
        } else {
            dk7.b(new dq[]{dr3.a.a(l34Var), yq3.a.a(l34Var), cr3.a.a(l34Var)}, ct3.H0(1808964477, new ze1(1, jt5Var, et0Var), sk2Var), sk2Var, 56);
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w3(l34Var, jt5Var, et0Var, i, 20);
        }
    }

    public static final void a0(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0 && i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            pz2.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            z2 = true;
        }
        if (!z2) {
            pz2.a("minLines " + i + " must be less than or equal to maxLines " + i2);
        }
    }

    public static final void b(final boolean z, final et0 et0Var, tu0 tu0Var, final int i, final int i2) {
        int i3;
        boolean z2;
        jd7 jd7Var;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1734155591);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0 && sk2Var.g(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i3 & 1, z2)) {
            sk2Var.T();
            if ((i & 1) != 0 && !sk2Var.y()) {
                sk2Var.R();
                int i5 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                if ((((Configuration) sk2Var.j(ue.a)).uiMode & 48) == 32) {
                    z = true;
                } else {
                    z = false;
                }
            }
            sk2Var.q();
            if (z) {
                jd7Var = kd7.a;
            } else {
                jd7Var = kd7.b;
            }
            dk7.a(kd7.c.a(jd7Var), ct3.H0(-889841799, new s4(25, jd7Var, et0Var), sk2Var), sk2Var, 56);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: mw3
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(i | 1);
                    mj2.b(z, et0Var, (tu0) obj, I, i2);
                    return o27.a;
                }
            };
        }
    }

    public static final boolean b0(String str, ki2 ki2Var) {
        try {
            boolean booleanValue = ((Boolean) ki2Var.c()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static final void c(jt5 jt5Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        z31 z31Var;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(832919318);
        if (sk2Var.h(jt5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var.h(et0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) == 18 && sk2Var.A()) {
            sk2Var.R();
        } else {
            Object L2 = sk2Var.L();
            if (L2 == su0.a) {
                L2 = new gi3(20);
                sk2Var.h0(L2);
            }
            mi2 mi2Var = (mi2) L2;
            ab7 a = dr3.a(sk2Var);
            if (a != null) {
                qo0 a2 = q75.a(ty.class);
                e81 e81Var = new e81(2, (byte) 0);
                e81Var.b(q75.a(ty.class), mi2Var);
                l9 d = e81Var.d();
                if (a instanceof lq2) {
                    z31Var = ((lq2) a).getDefaultViewModelCreationExtras();
                } else {
                    z31Var = x31.b;
                }
                ty tyVar = (ty) c0(a2, a, d, z31Var, sk2Var);
                tyVar.c = new u57(jt5Var);
                jt5Var.b(tyVar.b, et0Var, sk2Var, ((i5 << 6) & 896) | (i5 & 112));
            } else {
                i.n("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i, 26, jt5Var, et0Var);
        }
    }

    public static final ra7 c0(qo0 qo0Var, ab7 ab7Var, l9 l9Var, z31 z31Var, tu0 tu0Var) {
        bq0 k;
        if (l9Var != null) {
            za7 viewModelStore = ab7Var.getViewModelStore();
            viewModelStore.getClass();
            z31Var.getClass();
            k = new bq0(viewModelStore, l9Var, z31Var);
        } else if (ab7Var instanceof lq2) {
            za7 viewModelStore2 = ab7Var.getViewModelStore();
            xa7 defaultViewModelProviderFactory = ((lq2) ab7Var).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            z31Var.getClass();
            k = new bq0(viewModelStore2, defaultViewModelProviderFactory, z31Var);
        } else {
            k = hm1.k(ab7Var, null, 6);
        }
        return k.X(qo0Var);
    }

    public static final long d(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static ActionMode.Callback d0(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof ks6) && callback != null) {
            return new ks6(callback, textView);
        }
        return callback;
    }

    public static final void e(ej3 ej3Var, Object obj, int i, Object obj2, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1439843069);
        if (sk2Var.f(ej3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i3 | i2;
        if (sk2Var.f(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (sk2Var.d(i)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5;
        if (sk2Var.f(obj2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i10 & 1, z)) {
            ((jt5) obj).b(obj2, ct3.H0(980966366, new vo(i, ej3Var, obj2), sk2Var), sk2Var, 48);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(ej3Var, obj, i, obj2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final defpackage.zy3 r18, defpackage.y26 r19, final long r20, long r22, float r24, final defpackage.et0 r25, defpackage.tu0 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj2.f(zy3, y26, long, long, float, et0, tu0, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final defpackage.ki2 r20, final defpackage.zy3 r21, boolean r22, final defpackage.y26 r23, final long r24, final long r26, final float r28, final defpackage.l14 r29, final defpackage.et0 r30, defpackage.tu0 r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj2.g(ki2, zy3, boolean, y26, long, long, float, l14, et0, tu0, int, int):void");
    }

    public static final ry5 h(qh qhVar, p40 p40Var) {
        boolean z;
        c41 l = qhVar.l();
        yp0 yp0Var = (yp0) qhVar.R;
        if (l == c41.CROSSED) {
            z = true;
        } else {
            z = false;
        }
        return new ry5(j(yp0Var, z, true, p40Var), j(yp0Var, z, false, p40Var), z);
    }

    public static final qy5 i(qh qhVar, yp0 yp0Var, qy5 qy5Var) {
        int i;
        int i2;
        c41 c41Var;
        boolean z;
        int i3 = yp0Var.c;
        int i4 = yp0Var.b;
        boolean z2 = qhVar.B;
        if (z2) {
            i = i4;
        } else {
            i = i3;
        }
        lr6 lr6Var = (lr6) yp0Var.e;
        int i5 = yp0Var.d;
        wk3 wk3Var = wk3.NONE;
        gh3 H = yf2.H(wk3Var, new li4(i, yp0Var));
        if (z2) {
            i2 = i3;
        } else {
            i2 = i4;
        }
        gh3 H2 = yf2.H(wk3Var, new vh5(yp0Var, i, i2, qhVar, H));
        if (1 != qy5Var.c) {
            return (qy5) H2.getValue();
        }
        if (i == i5) {
            return qy5Var;
        }
        if (((Number) H.getValue()).intValue() != lr6Var.b.d(i5)) {
            return (qy5) H2.getValue();
        }
        int i6 = qy5Var.b;
        long j = lr6Var.j(i6);
        if (i5 != -1) {
            if (i != i5) {
                if (i4 < i3) {
                    c41Var = c41.NOT_CROSSED;
                } else if (i4 > i3) {
                    c41Var = c41.CROSSED;
                } else {
                    c41Var = c41.COLLAPSED;
                }
                if (c41Var == c41.CROSSED) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(z ^ z2)) {
                }
            }
            return yp0Var.b(i);
        }
        int i7 = vr6.c;
        if (i6 != ((int) (j >> 32)) && i6 != ((int) (4294967295L & j))) {
            return yp0Var.b(i);
        }
        return (qy5) H2.getValue();
    }

    public static final qy5 j(yp0 yp0Var, boolean z, boolean z2, p40 p40Var) {
        int i;
        long j;
        if (z2) {
            i = yp0Var.b;
        } else {
            i = yp0Var.c;
        }
        long j2 = p40Var.j(i, yp0Var);
        if (z ^ z2) {
            int i2 = vr6.c;
            j = j2 >> 32;
        } else {
            int i3 = vr6.c;
            j = 4294967295L & j2;
        }
        return yp0Var.b((int) j);
    }

    public static final void k(ra7 ra7Var, xt5 xt5Var, rm3 rm3Var) {
        xt5Var.getClass();
        rm3Var.getClass();
        qt5 qt5Var = (qt5) ra7Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (qt5Var != null && !qt5Var.L) {
            qt5Var.i(rm3Var, xt5Var);
            qm3 b = rm3Var.b();
            if (b != qm3.INITIALIZED && !b.isAtLeast(qm3.STARTED)) {
                rm3Var.a(new wa1(rm3Var, xt5Var));
            } else {
                xt5Var.d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0075, code lost:
        if (r21 != 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0077, code lost:
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x007a, code lost:
        if (r21 != 5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x007c, code lost:
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x007f, code lost:
        if (r21 != 6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0081, code lost:
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0087, code lost:
        if (r11 >= 1.0f) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0089, code lost:
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x008c, code lost:
        if (r1 >= r11) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x008e, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x008f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0090, code lost:
        defpackage.i.n("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0093, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0094, code lost:
        defpackage.i.n("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0097, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0098, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0033, code lost:
        if (r11 >= r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x003a, code lost:
        if (r10 <= r7) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0041, code lost:
        if (r9 >= r6) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0048, code lost:
        if (r8 <= r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x004a, code lost:
        if (r21 != 3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x004d, code lost:
        if (r21 != 4) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x004f, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0050, code lost:
        if (r21 != 3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0052, code lost:
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0057, code lost:
        if (r21 != 4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0059, code lost:
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x005d, code lost:
        if (r21 != 5) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x005f, code lost:
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0064, code lost:
        if (r21 != 6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0066, code lost:
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x006d, code lost:
        if (r1 >= androidx.recyclerview.widget.RecyclerView.A1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x006f, code lost:
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0071, code lost:
        if (r21 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0073, code lost:
        r11 = r11 - r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean l(defpackage.y55 r18, defpackage.y55 r19, defpackage.y55 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = m(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = m(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.i.n(r4)
            return r12
        L94:
            defpackage.i.n(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.i.n(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj2.l(y55, y55, y55, int):boolean");
    }

    public static final boolean m(int i, y55 y55Var, y55 y55Var2) {
        if (i == 3 || i == 4) {
            if (y55Var.d <= y55Var2.b || y55Var.b >= y55Var2.d) {
                return false;
            }
            return true;
        } else if (i == 5 || i == 6) {
            if (y55Var.c <= y55Var2.a || y55Var.a >= y55Var2.c) {
                return false;
            }
            return true;
        } else {
            i.n("This function should only be used for 2-D focus search");
            return false;
        }
    }

    public static lx4 n(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] K = K(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] K2 = K(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        ve2.v("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        ve2.v("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        ve2.v("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(K));
        ve2.v("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(K2));
        return new lx4(z, new HashSet(O(K)), new HashSet(O(K2)));
    }

    public static final qy5 o(qy5 qy5Var, yp0 yp0Var, int i) {
        return new qy5(((lr6) yp0Var.e).a(i), i, qy5Var.c);
    }

    public static final void p(ed2 ed2Var, o24 o24Var) {
        if (!ed2Var.A.i0) {
            mz2.c("visitChildren called on an unattached node");
        }
        o24 o24Var2 = new o24(new yy3[16]);
        yy3 yy3Var = ed2Var.A;
        yy3 yy3Var2 = yy3Var.Y;
        if (yy3Var2 == null) {
            l.l(o24Var2, yy3Var);
        } else {
            o24Var2.b(yy3Var2);
        }
        while (true) {
            int i = o24Var2.L;
            if (i != 0) {
                yy3 yy3Var3 = (yy3) o24Var2.l(i - 1);
                if ((yy3Var3.R & 1024) == 0) {
                    l.l(o24Var2, yy3Var3);
                } else {
                    while (true) {
                        if (yy3Var3 == null) {
                            break;
                        } else if ((yy3Var3.L & 1024) != 0) {
                            o24 o24Var3 = null;
                            while (yy3Var3 != null) {
                                if (yy3Var3 instanceof ed2) {
                                    ed2 ed2Var2 = (ed2) yy3Var3;
                                    if (ed2Var2.i0 && !l.P(ed2Var2).J0) {
                                        if (ed2Var2.T0().a) {
                                            o24Var.b(ed2Var2);
                                        } else {
                                            p(ed2Var2, o24Var);
                                        }
                                    }
                                } else if ((yy3Var3.L & 1024) != 0 && (yy3Var3 instanceof xc1)) {
                                    int i2 = 0;
                                    for (yy3 yy3Var4 = ((xc1) yy3Var3).k0; yy3Var4 != null; yy3Var4 = yy3Var4.Y) {
                                        if ((yy3Var4.L & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                yy3Var3 = yy3Var4;
                                            } else {
                                                if (o24Var3 == null) {
                                                    o24Var3 = new o24(new yy3[16]);
                                                }
                                                if (yy3Var3 != null) {
                                                    o24Var3.b(yy3Var3);
                                                    yy3Var3 = null;
                                                }
                                                o24Var3.b(yy3Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                yy3Var3 = l.p(o24Var3);
                            }
                        } else {
                            yy3Var3 = yy3Var3.Y;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static qh q(int i, int i2, int i3, int i4) {
        return new qh(ImageReader.newInstance(i, i2, i3, i4));
    }

    public static m64 r(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                y70 f = y70.f();
                String str = m64.b;
                String str2 = m64.b;
                String e2 = ej6.e("Ignoring adding capability '", i, '\'');
                if (f.b <= 5) {
                    Log.w(str2, e2, e);
                }
            }
        }
        int[] iArr3 = pu.s;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!nu.Y(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e3) {
                    y70 f2 = y70.f();
                    String str3 = m64.b;
                    String str4 = m64.b;
                    String e4 = ej6.e("Ignoring removing default capability '", i3, '\'');
                    if (f2.b <= 5) {
                        Log.w(str4, e4, e3);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new m64(build);
    }

    public static final ed2 s(o24 o24Var, y55 y55Var, int i) {
        y55 h;
        ed2 ed2Var = null;
        if (i == 3) {
            h = y55Var.h((y55Var.c - y55Var.a) + 1.0f, RecyclerView.A1);
        } else if (i == 4) {
            h = y55Var.h(-((y55Var.c - y55Var.a) + 1.0f), RecyclerView.A1);
        } else if (i == 5) {
            h = y55Var.h(RecyclerView.A1, (y55Var.d - y55Var.b) + 1.0f);
        } else if (i == 6) {
            h = y55Var.h(RecyclerView.A1, -((y55Var.d - y55Var.b) + 1.0f));
        } else {
            i.n("This function should only be used for 2-D focus search");
            return null;
        }
        Object[] objArr = o24Var.A;
        int i2 = o24Var.L;
        for (int i3 = 0; i3 < i2; i3++) {
            ed2 ed2Var2 = (ed2) objArr[i3];
            if (ii7.i(ed2Var2)) {
                y55 c = ii7.c(ed2Var2);
                if (F(c, h, y55Var, i)) {
                    ed2Var = ed2Var2;
                    h = c;
                }
            }
        }
        return ed2Var;
    }

    public static final boolean t(ed2 ed2Var, int i, mi2 mi2Var) {
        y55 y55Var;
        Object obj;
        o24 o24Var = new o24(new ed2[16]);
        p(ed2Var, o24Var);
        int i2 = o24Var.L;
        if (i2 <= 1) {
            if (i2 == 0) {
                obj = null;
            } else {
                obj = o24Var.A[0];
            }
            ed2 ed2Var2 = (ed2) obj;
            if (ed2Var2 != null) {
                return ((Boolean) mi2Var.n(ed2Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                y55 c = ii7.c(ed2Var);
                float f = c.a;
                float f2 = c.b;
                y55Var = new y55(f, f2, f, f2);
            } else if (i == 3 || i == 5) {
                y55 c2 = ii7.c(ed2Var);
                float f3 = c2.c;
                float f4 = c2.d;
                y55Var = new y55(f3, f4, f3, f4);
            } else {
                i.n("This function should only be used for 2-D focus search");
                return false;
            }
            ed2 s = s(o24Var, y55Var, i);
            if (s != null) {
                return ((Boolean) mi2Var.n(s)).booleanValue();
            }
        }
        return false;
    }

    public static final void u(bq4 bq4Var, yu0 yu0Var, String str) {
        bq4Var.getClass();
        vn1 b = yu0Var.b();
        qo0 qo0Var = bq4Var.a;
        b.getClass();
        qo0Var.getClass();
        tq5.D(qo0Var, str);
        throw null;
    }

    public static final void v(bq4 bq4Var, mz1 mz1Var, Object obj) {
        bq4Var.getClass();
        obj.getClass();
        vn1 b = mz1Var.b();
        qo0 qo0Var = bq4Var.a;
        b.getClass();
        qo0Var.getClass();
        qo0Var.d(obj);
        qo0 a = q75.a(obj.getClass());
        String c = a.c();
        if (c == null) {
            c = String.valueOf(a);
        }
        tq5.D(qo0Var, c);
        throw null;
    }

    public static /* synthetic */ u92 w(nj2 nj2Var, e31 e31Var, int i, h60 h60Var, int i2) {
        if ((i2 & 1) != 0) {
            e31Var = mp1.A;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            h60Var = h60.SUSPEND;
        }
        return nj2Var.c(e31Var, i, h60Var);
    }

    public static final boolean x(int i, zm zmVar, ed2 ed2Var, y55 y55Var) {
        if (Q(i, zmVar, ed2Var, y55Var)) {
            return true;
        }
        Boolean bool = (Boolean) pu.H(ed2Var, i, new cd4(((nc2) ((ee) l.Q(ed2Var)).getFocusOwner()).f(), ed2Var, y55Var, i, zmVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final long y(long j) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / 2.0f) << 32);
    }

    public static final ax2 z() {
        ax2 ax2Var = Y;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Save", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(17.0f, 3.0f);
        vq2Var.m(5.0f, 3.0f);
        vq2Var.i(-1.11f, RecyclerView.A1, -2.0f, 0.9f, -2.0f, 2.0f);
        vq2Var.u(14.0f);
        vq2Var.i(RecyclerView.A1, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        vq2Var.l(14.0f);
        vq2Var.i(1.1f, RecyclerView.A1, 2.0f, -0.9f, 2.0f, -2.0f);
        vq2Var.m(21.0f, 7.0f);
        vq2Var.n(-4.0f, -4.0f);
        vq2Var.g();
        vq2Var.o(12.0f, 19.0f);
        vq2Var.i(-1.66f, RecyclerView.A1, -3.0f, -1.34f, -3.0f, -3.0f);
        vq2Var.q(1.34f, -3.0f, 3.0f, -3.0f);
        vq2Var.q(3.0f, 1.34f, 3.0f, 3.0f);
        vq2Var.q(-1.34f, 3.0f, -3.0f, 3.0f);
        vq2Var.g();
        vq2Var.o(15.0f, 9.0f);
        vq2Var.m(5.0f, 9.0f);
        vq2Var.m(5.0f, 5.0f);
        vq2Var.l(10.0f);
        vq2Var.u(4.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b = zw2Var.b();
        Y = b;
        return b;
    }
}
