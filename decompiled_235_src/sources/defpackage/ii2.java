package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.SQLException;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii2  reason: default package */
/* loaded from: classes.dex */
public abstract class ii2 implements q96 {
    public static e33 A;
    public static e33 B;
    public static e33 L;

    public static p05 A(qs qsVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new p05(pp.q(qsVar));
        }
        TextPaint textPaint = new TextPaint(qsVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = qsVar.getBreakStrategy();
        int hyphenationFrequency = qsVar.getHyphenationFrequency();
        if (qsVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = true;
            if (i >= 28 && (qsVar.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(pp.e(DecimalFormatSymbols.getInstance(qsVar.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (qsVar.getLayoutDirection() != 1) {
                    z = false;
                }
                switch (qsVar.getTextDirection()) {
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
                    case 6:
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
        return new p05(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final boolean B(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static final boolean C(String str) {
        str.getClass();
        if (!str.equals("POST") && !str.equals("PATCH") && !str.equals("PUT") && !str.equals("DELETE") && !str.equals("MOVE")) {
            return false;
        }
        return true;
    }

    public static final int D(String str) {
        str.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case -1929424669:
                if (!upperCase.equals("POINTS")) {
                    return R.string.leaderboard_attempt_value_label;
                }
                return R.string.leaderboard_attempt_score_label;
            case -1293819249:
                if (upperCase.equals("TIMESECS")) {
                    return R.string.leaderboard_attempt_time_label;
                }
                return R.string.leaderboard_attempt_value_label;
            case 2541122:
                if (upperCase.equals("SECS")) {
                    return R.string.leaderboard_attempt_time_label;
                }
                return R.string.leaderboard_attempt_value_label;
            case 2575053:
                if (upperCase.equals("TIME")) {
                    return R.string.leaderboard_attempt_time_label;
                }
                return R.string.leaderboard_attempt_value_label;
            case 75532016:
                if (!upperCase.equals("OTHER")) {
                    return R.string.leaderboard_attempt_value_label;
                }
                return R.string.leaderboard_attempt_score_label;
            case 78726770:
                if (!upperCase.equals("SCORE")) {
                    return R.string.leaderboard_attempt_value_label;
                }
                return R.string.leaderboard_attempt_score_label;
            case 799745873:
                if (upperCase.equals("SECS_AS_MINS")) {
                    return R.string.leaderboard_attempt_time_label;
                }
                return R.string.leaderboard_attempt_value_label;
            case 1782884543:
                if (upperCase.equals("MINUTES")) {
                    return R.string.leaderboard_attempt_time_label;
                }
                return R.string.leaderboard_attempt_value_label;
            case 1912639343:
                if (upperCase.equals("MILLISECS")) {
                    return R.string.leaderboard_attempt_time_label;
                }
                return R.string.leaderboard_attempt_value_label;
            case 2081781926:
                if (upperCase.equals("FRAMES")) {
                    return R.string.leaderboard_attempt_time_label;
                }
                return R.string.leaderboard_attempt_value_label;
            default:
                return R.string.leaderboard_attempt_value_label;
        }
    }

    public static LinkedHashSet E(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c14.k0(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && nb3.k(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set F(Set set, Iterable iterable) {
        Collection<?> k1;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            k1 = (Collection) iterable;
        } else {
            k1 = gt0.k1(iterable);
        }
        if (k1.isEmpty()) {
            return gt0.p1(set);
        }
        if (k1 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!((Set) k1).contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(k1);
        return linkedHashSet2;
    }

    public static Set G(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(c14.k0(objArr.length));
        fv.P0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final void I(v96 v96Var, long j, qn2 qn2Var) {
        xl4 xl4Var = new xl4(j);
        wl4 wl4Var = wl4.d0;
        ge7.p(3, wl4Var);
        t96 t96Var = new t96(v96Var, xl4Var, wl4Var, gw0.L, w96.e, (hw6) qn2Var, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v96.Y;
        v96Var.j(t96Var, false);
    }

    public static final boolean J(String str) {
        str.getClass();
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static LinkedHashSet K(Set set, Iterable iterable) {
        Integer num;
        int size;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(c14.k0(size));
        linkedHashSet.addAll(set);
        gt0.A0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static LinkedHashSet L(Set set, Object obj) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(c14.k0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static final Object M(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static void O(TextView textView, int i) {
        int i2;
        np2.v(i);
        if (Build.VERSION.SDK_INT >= 28) {
            pp.u(textView, i);
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

    public static void P(TextView textView, int i) {
        int i2;
        np2.v(i);
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

    public static void Q(TextView textView, int i) {
        np2.v(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static Set R(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static final void S(int i, int i2, wb6 wb6Var) {
        String str;
        wb6Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(wb6Var.g(i4));
            }
            i3 >>>= 1;
        }
        String a = wb6Var.a();
        a.getClass();
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + a + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + a + "', but they were missing";
        }
        throw new o64(str, null, arrayList, a);
    }

    public static final void T(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final ab3 U(wb6 wb6Var) {
        String e0 = xs6.e0(wb6Var.a(), "?", "");
        if (nb3.k(wb6Var.e(), bc6.e)) {
            if (wb6Var.c()) {
                return ab3.ENUM_NULLABLE;
            }
            return ab3.ENUM;
        } else if (e0.equals("kotlin.Int")) {
            if (wb6Var.c()) {
                return ab3.INT_NULLABLE;
            }
            return ab3.INT;
        } else if (e0.equals("kotlin.Boolean")) {
            if (wb6Var.c()) {
                return ab3.BOOL_NULLABLE;
            }
            return ab3.BOOL;
        } else if (e0.equals("kotlin.Double")) {
            if (wb6Var.c()) {
                return ab3.DOUBLE_NULLABLE;
            }
            return ab3.DOUBLE;
        } else if (e0.equals("kotlin.Float")) {
            if (wb6Var.c()) {
                return ab3.FLOAT_NULLABLE;
            }
            return ab3.FLOAT;
        } else if (e0.equals("kotlin.Long")) {
            if (wb6Var.c()) {
                return ab3.LONG_NULLABLE;
            }
            return ab3.LONG;
        } else if (e0.equals("kotlin.String")) {
            if (wb6Var.c()) {
                return ab3.STRING_NULLABLE;
            }
            return ab3.STRING;
        } else if (e0.equals("kotlin.IntArray")) {
            return ab3.INT_ARRAY;
        } else {
            if (e0.equals("kotlin.DoubleArray")) {
                return ab3.DOUBLE_ARRAY;
            }
            if (e0.equals("kotlin.BooleanArray")) {
                return ab3.BOOL_ARRAY;
            }
            if (e0.equals("kotlin.FloatArray")) {
                return ab3.FLOAT_ARRAY;
            }
            if (e0.equals("kotlin.LongArray")) {
                return ab3.LONG_ARRAY;
            }
            if (e0.equals("kotlin.Array")) {
                return ab3.ARRAY;
            }
            if (xs6.g0(e0, "kotlin.collections.ArrayList", false)) {
                return ab3.LIST;
            }
            return ab3.UNKNOWN;
        }
    }

    public static final void V(xg1 xg1Var, Object obj, qn2 qn2Var) {
        if0 if0Var;
        if (!((z64) xg1Var).A.j0) {
            p53.c("visitAncestors called on an unattached node");
        }
        z64 z64Var = ((z64) xg1Var).A.X;
        sm3 f0 = nc1.f0(xg1Var);
        while (f0 != null) {
            if ((((z64) f0.B0.g).R & 262144) != 0) {
                while (z64Var != null) {
                    if ((z64Var.L & 262144) != 0) {
                        z64 z64Var2 = z64Var;
                        ua4 ua4Var = null;
                        while (z64Var2 != null) {
                            boolean z = true;
                            if (z64Var2 instanceof ub7) {
                                ub7 ub7Var = (ub7) z64Var2;
                                if (obj.equals(ub7Var.n())) {
                                    z = ((Boolean) qn2Var.g(ub7Var)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((z64Var2.L & 262144) != 0 && (z64Var2 instanceof zg1)) {
                                int i = 0;
                                for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                    if ((z64Var3.L & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            z64Var2 = z64Var3;
                                        } else {
                                            if (ua4Var == null) {
                                                ua4Var = new ua4(new z64[16]);
                                            }
                                            if (z64Var2 != null) {
                                                ua4Var.b(z64Var2);
                                                z64Var2 = null;
                                            }
                                            ua4Var.b(z64Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            z64Var2 = nc1.A(ua4Var);
                        }
                        continue;
                    }
                    z64Var = z64Var.X;
                }
            }
            f0 = f0.v();
            if (f0 != null && (if0Var = f0.B0) != null) {
                z64Var = (vy6) if0Var.f;
            } else {
                z64Var = null;
            }
        }
    }

    public static final void W(ub7 ub7Var, qn2 qn2Var) {
        if0 if0Var;
        z64 z64Var = (z64) ub7Var;
        if (!z64Var.A.j0) {
            p53.c("visitAncestors called on an unattached node");
        }
        z64 z64Var2 = z64Var.A.X;
        sm3 f0 = nc1.f0(ub7Var);
        while (f0 != null) {
            if ((((z64) f0.B0.g).R & 262144) != 0) {
                while (z64Var2 != null) {
                    if ((z64Var2.L & 262144) != 0) {
                        z64 z64Var3 = z64Var2;
                        ua4 ua4Var = null;
                        while (z64Var3 != null) {
                            boolean z = true;
                            if (z64Var3 instanceof ub7) {
                                ub7 ub7Var2 = (ub7) z64Var3;
                                if (nb3.k(ub7Var.n(), ub7Var2.n()) && ub7Var.getClass() == ub7Var2.getClass()) {
                                    z = ((Boolean) qn2Var.g(ub7Var2)).booleanValue();
                                }
                                if (!z) {
                                    return;
                                }
                            } else if ((z64Var3.L & 262144) != 0 && (z64Var3 instanceof zg1)) {
                                int i = 0;
                                for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                    if ((z64Var4.L & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            z64Var3 = z64Var4;
                                        } else {
                                            if (ua4Var == null) {
                                                ua4Var = new ua4(new z64[16]);
                                            }
                                            if (z64Var3 != null) {
                                                ua4Var.b(z64Var3);
                                                z64Var3 = null;
                                            }
                                            ua4Var.b(z64Var4);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            z64Var3 = nc1.A(ua4Var);
                        }
                        continue;
                    }
                    z64Var2 = z64Var2.X;
                }
            }
            f0 = f0.v();
            if (f0 != null && (if0Var = f0.B0) != null) {
                z64Var2 = (vy6) if0Var.f;
            } else {
                z64Var2 = null;
            }
        }
    }

    public static final void X(z64 z64Var, String str, qn2 qn2Var) {
        tb7 tb7Var;
        if (!z64Var.A.j0) {
            p53.c("visitSubtreeIf called on an unattached node");
        }
        ua4 ua4Var = new ua4(new z64[16]);
        z64 z64Var2 = z64Var.A;
        z64 z64Var3 = z64Var2.Y;
        if (z64Var3 == null) {
            nc1.z(ua4Var, z64Var2);
        } else {
            ua4Var.b(z64Var3);
        }
        while (true) {
            int i = ua4Var.L;
            if (i != 0) {
                z64 z64Var4 = (z64) ua4Var.l(i - 1);
                if ((z64Var4.R & 262144) != 0) {
                    for (z64 z64Var5 = z64Var4; z64Var5 != null && z64Var5.j0; z64Var5 = z64Var5.Y) {
                        if ((z64Var5.L & 262144) != 0) {
                            z64 z64Var6 = z64Var5;
                            ua4 ua4Var2 = null;
                            while (z64Var6 != null) {
                                if (z64Var6 instanceof ub7) {
                                    ub7 ub7Var = (ub7) z64Var6;
                                    if (str.equals(ub7Var.n())) {
                                        tb7Var = (tb7) qn2Var.g(ub7Var);
                                    } else {
                                        tb7Var = tb7.ContinueTraversal;
                                    }
                                    if (tb7Var != tb7.CancelTraversal) {
                                        if (tb7Var == tb7.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((z64Var6.L & 262144) != 0 && (z64Var6 instanceof zg1)) {
                                    int i2 = 0;
                                    for (z64 z64Var7 = ((zg1) z64Var6).l0; z64Var7 != null; z64Var7 = z64Var7.Y) {
                                        if ((z64Var7.L & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                z64Var6 = z64Var7;
                                            } else {
                                                if (ua4Var2 == null) {
                                                    ua4Var2 = new ua4(new z64[16]);
                                                }
                                                if (z64Var6 != null) {
                                                    ua4Var2.b(z64Var6);
                                                    z64Var6 = null;
                                                }
                                                ua4Var2.b(z64Var7);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                z64Var6 = nc1.A(ua4Var2);
                            }
                            continue;
                        }
                    }
                }
                nc1.z(ua4Var, z64Var4);
            } else {
                return;
            }
        }
    }

    public static final void Y(ub7 ub7Var, qn2 qn2Var) {
        tb7 tb7Var;
        z64 z64Var = (z64) ub7Var;
        if (!z64Var.A.j0) {
            p53.c("visitSubtreeIf called on an unattached node");
        }
        ua4 ua4Var = new ua4(new z64[16]);
        z64 z64Var2 = z64Var.A;
        z64 z64Var3 = z64Var2.Y;
        if (z64Var3 == null) {
            nc1.z(ua4Var, z64Var2);
        } else {
            ua4Var.b(z64Var3);
        }
        while (true) {
            int i = ua4Var.L;
            if (i != 0) {
                z64 z64Var4 = (z64) ua4Var.l(i - 1);
                if ((z64Var4.R & 262144) != 0) {
                    for (z64 z64Var5 = z64Var4; z64Var5 != null && z64Var5.j0; z64Var5 = z64Var5.Y) {
                        if ((z64Var5.L & 262144) != 0) {
                            z64 z64Var6 = z64Var5;
                            ua4 ua4Var2 = null;
                            while (z64Var6 != null) {
                                if (z64Var6 instanceof ub7) {
                                    ub7 ub7Var2 = (ub7) z64Var6;
                                    if (nb3.k(ub7Var.n(), ub7Var2.n()) && ub7Var.getClass() == ub7Var2.getClass()) {
                                        tb7Var = (tb7) qn2Var.g(ub7Var2);
                                    } else {
                                        tb7Var = tb7.ContinueTraversal;
                                    }
                                    if (tb7Var != tb7.CancelTraversal) {
                                        if (tb7Var == tb7.SkipSubtreeAndContinueTraversal) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((z64Var6.L & 262144) != 0 && (z64Var6 instanceof zg1)) {
                                    int i2 = 0;
                                    for (z64 z64Var7 = ((zg1) z64Var6).l0; z64Var7 != null; z64Var7 = z64Var7.Y) {
                                        if ((z64Var7.L & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                z64Var6 = z64Var7;
                                            } else {
                                                if (ua4Var2 == null) {
                                                    ua4Var2 = new ua4(new z64[16]);
                                                }
                                                if (z64Var6 != null) {
                                                    ua4Var2.b(z64Var6);
                                                    z64Var6 = null;
                                                }
                                                ua4Var2.b(z64Var7);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                z64Var6 = nc1.A(ua4Var2);
                            }
                            continue;
                        }
                    }
                }
                nc1.z(ua4Var, z64Var4);
            } else {
                return;
            }
        }
    }

    public static ActionMode.Callback Z(ActionMode.Callback callback) {
        if ((callback instanceof z47) && Build.VERSION.SDK_INT >= 26) {
            return ((z47) callback).a;
        }
        return callback;
    }

    public static final int a0(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static Class b0(Class cls) {
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

    public static ActionMode.Callback c0(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof z47) && callback != null) {
            return new z47(callback, textView);
        }
        return callback;
    }

    public static final void e(final String str, final String str2, final l93 l93Var, final boolean z, final int i, final qn2 qn2Var, on2 on2Var, px0 px0Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        on2 on2Var2;
        int i9;
        int i10;
        boolean z2;
        xq2 xq2Var;
        final on2 on2Var3;
        on2 on2Var4;
        boolean z3;
        long f;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-2098701988);
        if (xq2Var2.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i11 = i2 | i4;
        if (xq2Var2.f(str2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i12 = i11 | i5;
        if (xq2Var2.h(l93Var)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i13 = i12 | i6;
        if (xq2Var2.g(z)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i14 = i13 | i7;
        if (xq2Var2.h(qn2Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        int i16 = i3 & 64;
        if (i16 != 0) {
            i10 = i15 | 1572864;
            on2Var2 = on2Var;
        } else {
            on2Var2 = on2Var;
            if (xq2Var2.h(on2Var2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i10 = i15 | i9;
        }
        if ((599187 & i10) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var2.S(i10 & 1, z2)) {
            if (i16 != 0) {
                on2Var4 = null;
            } else {
                on2Var4 = on2Var2;
            }
            yt0 a = wt0.a(new gu(4.0f, true, new i(1)), d90.k0, xq2Var2, 6);
            int hashCode = Long.hashCode(xq2Var2.T);
            xv4 l = xq2Var2.l();
            x64 x64Var = x64.a;
            a74 E = l.E(xq2Var2, x64Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var2.f0();
            if (xq2Var2.S) {
                xq2Var2.k(iy0Var);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.f, a);
            yh2.K(xq2Var2, ix0.e, l);
            yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var2, ix0.h);
            yh2.K(xq2Var2, ix0.d, E);
            a74 c = dj6.c(x64Var, 1.0f);
            xf1 J = mb3.J(xq2Var2);
            xh3 xh3Var = new xh3(0, 3, i, 115);
            if ((3670016 & i10) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = xq2Var2.P();
            if (z3 || P == ox0.a) {
                P = new mn0(4, on2Var4);
                xq2Var2.l0(P);
            }
            vh3 vh3Var = new vh3(62, (qn2) P);
            on2 on2Var5 = on2Var4;
            zo4.b(str2, qn2Var, c, false, null, n16.I(-1084697396, new g5(str), xq2Var2), null, z, null, xh3Var, vh3Var, true, 0, 0, null, J, xq2Var2, ((i10 >> 3) & 14) | 1573248 | ((i10 >> 12) & 112), ((i10 >> 9) & 14) | 24576, 494520);
            String N = yh2.N(R.string.layout_position_allowed_range, new Object[]{Integer.valueOf(l93Var.A), Integer.valueOf(l93Var.B)}, xq2Var2);
            s47 s47Var = ((xe7) xq2Var2.j(ye7.b)).l;
            if (z) {
                xq2Var2.b0(-1347124725);
                f = ((ut0) xq2Var2.j(vt0.a)).b();
            } else {
                xq2Var2.b0(-1347123697);
                f = ((ut0) xq2Var2.j(vt0.a)).f();
            }
            xq2Var2.p(false);
            x37.b(N, null, f, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47Var, xq2Var2, 0, 0, 65530);
            xq2Var = xq2Var2;
            xq2Var.p(true);
            on2Var3 = on2Var5;
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
            on2Var3 = on2Var2;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(str, str2, l93Var, z, i, qn2Var, on2Var3, i2, i3) { // from class: qj3
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ l93 L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ int X;
                public final /* synthetic */ qn2 Y;
                public final /* synthetic */ on2 Z;
                public final /* synthetic */ int d0;

                {
                    this.d0 = i3;
                }

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(24577);
                    ii2.e(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a0, this.d0);
                    return jg7.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(String str, String str2, on2 on2Var, a74 a74Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        long j;
        String str3;
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-33197833);
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (xq2Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (xq2Var.h(on2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (xq2Var.f(a74Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5 | 24576;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i9 & 1, z)) {
            es7 F = bl2.F(xq2Var);
            y16 b = z16.b(8.0f);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P;
            qa4 a = bw7.a(r94Var, xq2Var, 6);
            a74 L2 = vy7.L(u24.g(a74Var, b), F.c, u24.m);
            if (((Boolean) a.getValue()).booleanValue()) {
                j = F.j;
            } else {
                j = F.f;
            }
            a74 R = ge7.R(mb3.t(ak7.I(L2, 1.0f, j, b), r94Var, null, false, null, on2Var, 28), 11.0f, 10.0f, 14.0f, 10.0f);
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
            e33 A2 = hi2.A();
            long j2 = F.l;
            x64 x64Var = x64.a;
            i13.a(A2, null, dj6.i(x64Var, 22.0f), j2, xq2Var, 432, 0);
            gi2.h(xq2Var, dj6.l(x64Var, 9.0f));
            yt0 a3 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, x64Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(str, null, F.g, hi2.E(13), oj2.d0, null, 0L, null, hi2.E(16), 2, false, 1, 0, null, null, xq2Var, (i9 & 14) | 199680, 3126, 119762);
            xq2Var = xq2Var;
            if (str2.length() > 0 && !str2.equals(str)) {
                str3 = str2;
                if (str3 == null) {
                    xq2Var.b0(-1911861542);
                    String str4 = str3;
                    x37.b(str4, null, F.i, hi2.E(9), null, qs7.c, 0L, null, hi2.E(11), 2, false, 1, 0, null, null, xq2Var, 1575936, 3126, 119730);
                    xq2Var = xq2Var;
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(-1911548783);
                    xq2Var.p(false);
                }
                xq2Var.p(true);
                xq2Var.p(true);
            }
            str3 = null;
            if (str3 == null) {
            }
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new dx5(str, str2, on2Var, a74Var, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [id3, pe3] */
    /* JADX WARN: Type inference failed for: r1v0, types: [rd3, java.lang.Object] */
    public static pe3 g(qn2 qn2Var) {
        hd3 hd3Var = id3.d;
        hd3Var.getClass();
        ?? obj = new Object();
        td3 td3Var = hd3Var.a;
        obj.a = td3Var.b;
        obj.b = td3Var.a;
        String str = td3Var.c;
        String str2 = td3Var.d;
        zq0 zq0Var = td3Var.f;
        boolean z = td3Var.e;
        jd1 jd1Var = hd3Var.b;
        boolean z2 = td3Var.g;
        qn2Var.g(obj);
        if (nb3.k(str, "    ")) {
            td3 td3Var2 = new td3(obj.b, obj.a, str, str2, z, zq0Var, z2);
            jd1Var.getClass();
            ?? id3Var = new id3(td3Var2, jd1Var);
            if (jd1Var != ic6.a) {
                zq0 zq0Var2 = zq0.NONE;
            }
            return id3Var;
        }
        i.h("Indent should not be specified when default printing mode is used");
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [j93, l93] */
    /* JADX WARN: Type inference failed for: r2v5, types: [j93, l93] */
    public static final void h(final uj3 uj3Var, final on2 on2Var, final eo2 eo2Var, px0 px0Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        cf5 t;
        eo2 eo2Var2;
        boolean z2;
        boolean z3;
        final Integer num;
        final Integer num2;
        boolean z4;
        int intValue;
        int intValue2;
        on2Var.getClass();
        eo2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-2077848882);
        if (xq2Var.f(uj3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (xq2Var.h(on2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (xq2Var.h(eo2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        final boolean z5 = true;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i7 & 1, z)) {
            if (uj3Var == null) {
                t = xq2Var.t();
                if (t != null) {
                    eo2Var2 = new eo2(uj3Var, on2Var, eo2Var, i, 0) { // from class: pj3
                        public final /* synthetic */ int A;
                        public final /* synthetic */ uj3 B;
                        public final /* synthetic */ on2 L;
                        public final /* synthetic */ eo2 R;

                        {
                            this.A = r5;
                        }

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            int i8 = this.A;
                            jg7 jg7Var = jg7.a;
                            eo2 eo2Var3 = this.R;
                            on2 on2Var2 = this.L;
                            uj3 uj3Var2 = this.B;
                            px0 px0Var2 = (px0) obj;
                            ((Integer) obj2).getClass();
                            switch (i8) {
                                case 0:
                                    ii2.h(uj3Var2, on2Var2, eo2Var3, px0Var2, ii2.a0(1));
                                    return jg7Var;
                                default:
                                    ii2.h(uj3Var2, on2Var2, eo2Var3, px0Var2, ii2.a0(1));
                                    return jg7Var;
                            }
                        }
                    };
                    t.d = eo2Var2;
                }
                return;
            }
            int i8 = uj3Var.c;
            int i9 = uj3Var.b;
            int i10 = uj3Var.e;
            int i11 = uj3Var.d;
            nj3 nj3Var = uj3Var.a;
            Object[] objArr = {nj3Var, Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(i11), Integer.valueOf(i10)};
            int i12 = i7 & 14;
            if (i12 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z2 || P == vs0Var) {
                P = new on2() { // from class: rj3
                    @Override // defpackage.on2
                    public final Object c() {
                        int i13 = r2;
                        uj3 uj3Var2 = uj3Var;
                        switch (i13) {
                            case 0:
                                return np2.Y(String.valueOf(uj3Var2.b));
                            default:
                                return np2.Y(String.valueOf(uj3Var2.c));
                        }
                    }
                };
                xq2Var.l0(P);
            }
            final qa4 qa4Var = (qa4) qo2.I(objArr, (on2) P, xq2Var, 0);
            Object[] objArr2 = {nj3Var, Integer.valueOf(i9), Integer.valueOf(i8), Integer.valueOf(i11), Integer.valueOf(i10)};
            if (i12 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = xq2Var.P();
            if (z3 || P2 == vs0Var) {
                P2 = new on2() { // from class: rj3
                    @Override // defpackage.on2
                    public final Object c() {
                        int i13 = r2;
                        uj3 uj3Var2 = uj3Var;
                        switch (i13) {
                            case 0:
                                return np2.Y(String.valueOf(uj3Var2.b));
                            default:
                                return np2.Y(String.valueOf(uj3Var2.c));
                        }
                    }
                };
                xq2Var.l0(P2);
            }
            final qa4 qa4Var2 = (qa4) qo2.I(objArr2, (on2) P2, xq2Var, 0);
            final ?? j93Var = new j93(0, i11, 1);
            final ?? j93Var2 = new j93(0, i10, 1);
            Integer h0 = xs6.h0((String) qa4Var.getValue());
            if (h0 != null && (intValue2 = h0.intValue()) >= 0 && intValue2 <= j93Var.B) {
                num = h0;
            } else {
                num = null;
            }
            Integer h02 = xs6.h0((String) qa4Var2.getValue());
            if (h02 != null && (intValue = h02.intValue()) >= 0 && intValue <= j93Var2.B) {
                num2 = h02;
            } else {
                num2 = null;
            }
            if (((String) qa4Var.getValue()).length() > 0 && num == null) {
                z4 = true;
            } else {
                z4 = true;
                z5 = false;
            }
            if (((String) qa4Var2.getValue()).length() <= 0 || num2 != null) {
                z4 = false;
            }
            final boolean z6 = z4;
            q60.a(yh2.N(R.string.layout_component_position_title, new Object[]{yh2.O(xq2Var, xk2.n(nj3Var))}, xq2Var), on2Var, n16.I(667490787, new fo2() { // from class: sj3
                @Override // defpackage.fo2
                public final Object e(Object obj, Object obj2, Object obj3) {
                    boolean z7;
                    int i13;
                    lq4 lq4Var = (lq4) obj;
                    px0 px0Var2 = (px0) obj2;
                    int intValue3 = ((Integer) obj3).intValue();
                    lq4Var.getClass();
                    if ((intValue3 & 6) == 0) {
                        if (((xq2) px0Var2).f(lq4Var)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        intValue3 |= i13;
                    }
                    if ((intValue3 & 19) != 18) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    xq2 xq2Var2 = (xq2) px0Var2;
                    if (xq2Var2.S(intValue3 & 1, z7)) {
                        a74 N = ge7.N(dj6.c(x64.a, 1.0f), lq4Var);
                        yt0 a = wt0.a(new gu(16.0f, true, new i(1)), d90.k0, xq2Var2, 6);
                        int hashCode = Long.hashCode(xq2Var2.T);
                        xv4 l = xq2Var2.l();
                        a74 E = l.E(xq2Var2, N);
                        jx0.i.getClass();
                        on2 on2Var2 = ix0.b;
                        xq2Var2.f0();
                        if (xq2Var2.S) {
                            xq2Var2.k(on2Var2);
                        } else {
                            xq2Var2.o0();
                        }
                        yh2.K(xq2Var2, ix0.f, a);
                        yh2.K(xq2Var2, ix0.e, l);
                        yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                        yh2.F(xq2Var2, ix0.h);
                        yh2.K(xq2Var2, ix0.d, E);
                        String O = yh2.O(xq2Var2, R.string.input_x);
                        qa4 qa4Var3 = qa4Var;
                        String str = (String) qa4Var3.getValue();
                        boolean f = xq2Var2.f(qa4Var3);
                        Object P3 = xq2Var2.P();
                        Object obj4 = ox0.a;
                        if (f || P3 == obj4) {
                            P3 = new j4(qa4Var3, 9);
                            xq2Var2.l0(P3);
                        }
                        ii2.e(O, str, l93.this, z5, 6, (qn2) P3, null, xq2Var2, 24576, 64);
                        String O2 = yh2.O(xq2Var2, R.string.input_y);
                        qa4 qa4Var4 = qa4Var2;
                        String str2 = (String) qa4Var4.getValue();
                        boolean f2 = xq2Var2.f(qa4Var4);
                        Object P4 = xq2Var2.P();
                        if (f2 || P4 == obj4) {
                            P4 = new j4(qa4Var4, 10);
                            xq2Var2.l0(P4);
                        }
                        qn2 qn2Var = (qn2) P4;
                        Integer num3 = num;
                        boolean f3 = xq2Var2.f(num3);
                        Integer num4 = num2;
                        boolean f4 = f3 | xq2Var2.f(num4);
                        eo2 eo2Var3 = eo2Var;
                        boolean f5 = f4 | xq2Var2.f(eo2Var3);
                        Object P5 = xq2Var2.P();
                        if (f5 || P5 == obj4) {
                            P5 = new tj3(num3, num4, eo2Var3, 1);
                            xq2Var2.l0(P5);
                        }
                        ii2.e(O2, str2, j93Var2, z6, 7, qn2Var, (on2) P5, xq2Var2, 24576, 0);
                        xq2Var2.p(true);
                    } else {
                        xq2Var2.V();
                    }
                    return jg7.a;
                }
            }, xq2Var), n16.I(377972581, new p4(on2Var, num, num2, eo2Var, 7), xq2Var), false, xq2Var, (i7 & 112) | 3456, 16);
        } else {
            xq2Var.V();
        }
        t = xq2Var.t();
        if (t != null) {
            eo2Var2 = new eo2(uj3Var, on2Var, eo2Var, i, 1) { // from class: pj3
                public final /* synthetic */ int A;
                public final /* synthetic */ uj3 B;
                public final /* synthetic */ on2 L;
                public final /* synthetic */ eo2 R;

                {
                    this.A = r5;
                }

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    int i82 = this.A;
                    jg7 jg7Var = jg7.a;
                    eo2 eo2Var3 = this.R;
                    on2 on2Var2 = this.L;
                    uj3 uj3Var2 = this.B;
                    px0 px0Var2 = (px0) obj;
                    ((Integer) obj2).getClass();
                    switch (i82) {
                        case 0:
                            ii2.h(uj3Var2, on2Var2, eo2Var3, px0Var2, ii2.a0(1));
                            return jg7Var;
                        default:
                            ii2.h(uj3Var2, on2Var2, eo2Var3, px0Var2, ii2.a0(1));
                            return jg7Var;
                    }
                }
            };
            t.d = eo2Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0268, code lost:
        if (r14.g(false) != false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(a74 a74Var, ip3 ip3Var, lu2 lu2Var, lq4 lq4Var, sd2 sd2Var, boolean z, sg sgVar, iu iuVar, fu fuVar, qn2 qn2Var, px0 px0Var, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        ip3 ip3Var2;
        xq2 xq2Var;
        boolean z3;
        boolean z4;
        boolean z5;
        q61 q61Var;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean f;
        eq3 uo3Var;
        ip3 ip3Var3;
        sr3 sr3Var;
        boolean z13;
        boolean z14;
        qo3 qo3Var;
        a74 a74Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean h;
        int i14;
        int i15;
        int i16;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(708740370);
        if ((i & 6) == 0) {
            if (xq2Var2.f(a74Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i3 = i16 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var2.f(ip3Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i3 |= i15;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if ((i & 512) == 0) {
                h = xq2Var2.f(lu2Var);
            } else {
                h = xq2Var2.h(lu2Var);
            }
            if (h) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i3 |= i14;
        }
        if ((i & 3072) == 0) {
            if (xq2Var2.f(lq4Var)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i3 |= i13;
        }
        if ((i & 24576) == 0) {
            if (xq2Var2.g(false)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i3 |= i12;
        }
        if ((i & 196608) == 0) {
            if (xq2Var2.g(true)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i3 |= i11;
        }
        if ((i & 1572864) == 0) {
            if (xq2Var2.f(sd2Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((i & 12582912) == 0) {
            if (xq2Var2.g(z)) {
                i9 = 8388608;
            } else {
                i9 = Compress.MAXWINSIZE;
            }
            i3 |= i9;
        }
        if ((i & 100663296) == 0) {
            if (xq2Var2.f(sgVar)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i3 |= i8;
        }
        if ((i & 805306368) == 0) {
            if (xq2Var2.f(iuVar)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i3 |= i7;
        }
        if ((i2 & 6) == 0) {
            if (xq2Var2.f(fuVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var2.h(qn2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 19) == 18) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (xq2Var2.S(i3 & 1, z2)) {
            xq2Var2.X();
            if ((i & 1) != 0 && !xq2Var2.B()) {
                xq2Var2.V();
            }
            xq2Var2.q();
            int i17 = i3 >> 3;
            int i18 = i17 & 14;
            int i19 = i18 | (i4 & 112);
            qa4 b0 = np2.b0(qn2Var, xq2Var2);
            int i20 = i3;
            if ((((i19 & 14) ^ 6) > 4 && xq2Var2.f(ip3Var)) || (i19 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (z3 || P == vs0Var) {
                vs0 vs0Var2 = vs0.s0;
                P = new qo3(0, 0, pp6.class, np2.J(new ci2(9, np2.J(new f4(b0, 27), vs0Var2), ip3Var), vs0Var2), "value", "getValue()Ljava/lang/Object;");
                xq2Var2.l0(P);
            }
            qo3 qo3Var2 = (qo3) P;
            int i21 = i18 | ((i20 >> 9) & 112);
            if ((((i21 & 14) ^ 6) > 4 && xq2Var2.f(ip3Var)) || (i21 & 6) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((((i21 & 112) ^ 48) > 32 && xq2Var2.g(false)) || (i21 & 48) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z15 = z4 | z5;
            Object P2 = xq2Var2.P();
            if (z15 || P2 == vs0Var) {
                P2 = new sr3(ip3Var);
                xq2Var2.l0(P2);
            }
            sr3 sr3Var2 = (sr3) P2;
            Object P3 = xq2Var2.P();
            if (P3 == vs0Var) {
                P3 = mb3.w(xq2Var2);
                xq2Var2.l0(P3);
            }
            w61 w61Var = (w61) P3;
            tt2 tt2Var = (tt2) xq2Var2.j(ky0.g);
            if (!((Boolean) xq2Var2.j(ky0.w)).booleanValue()) {
                q61Var = tq6.a;
            } else {
                q61Var = null;
            }
            q61 q61Var2 = q61Var;
            int i22 = (i20 & 524272) | ((i4 << 18) & 3670016) | ((i20 >> 6) & 29360128);
            if ((((i22 & 112) ^ 48) > 32 && xq2Var2.f(ip3Var)) || (i22 & 48) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((((i22 & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) > 256 && xq2Var2.f(lu2Var)) || (i22 & RendererDebugBridge.CAPTURE_HEIGHT) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z16 = z7 | z6;
            if ((((i22 & 7168) ^ 3072) > 2048 && xq2Var2.f(lq4Var)) || (i22 & 3072) == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z17 = z16 | z8;
            if (((57344 & i22) ^ 24576) <= 16384) {
            }
            if ((i22 & 24576) != 16384) {
                z9 = false;
                boolean z18 = z17 | z9;
                if ((((458752 & i22) ^ 196608) <= 131072 && xq2Var2.g(true)) || (i22 & 196608) == 131072) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z19 = z18 | z10;
                if ((((i22 & 3670016) ^ 1572864) <= 1048576 && xq2Var2.f(fuVar)) || (i22 & 1572864) == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z20 = z19 | z11;
                if ((((i22 & 29360128) ^ 12582912) <= 8388608 && xq2Var2.f(iuVar)) || (i22 & 12582912) == 8388608) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f = z12 | z20 | xq2Var2.f(tt2Var);
                Object P4 = xq2Var2.P();
                if (f && P4 != vs0Var) {
                    uo3Var = P4;
                    sr3Var = sr3Var2;
                    qo3Var = qo3Var2;
                    z13 = false;
                    z14 = true;
                    ip3Var3 = ip3Var;
                } else {
                    ip3Var3 = ip3Var;
                    sr3Var = sr3Var2;
                    z13 = false;
                    z14 = true;
                    uo3Var = new uo3(ip3Var3, lq4Var, qo3Var2, lu2Var, iuVar, fuVar, w61Var, tt2Var, q61Var2);
                    qo3Var = qo3Var2;
                    xq2Var2.l0(uo3Var);
                }
                eq3 eq3Var = uo3Var;
                lo4 lo4Var = lo4.Vertical;
                if (!z) {
                    xq2Var2.b0(27281635);
                    if (((i18 ^ 6) <= 4 || !xq2Var2.f(ip3Var3)) && (i17 & 6) != 4) {
                        z14 = z13;
                    }
                    Object P5 = xq2Var2.P();
                    if (z14 || P5 == vs0Var) {
                        P5 = new ko3(ip3Var3);
                        xq2Var2.l0(P5);
                    }
                    a74Var2 = ak7.n0((ko3) P5, ip3Var3.n, lo4Var);
                    xq2Var2.p(z13);
                } else {
                    xq2Var2.b0(27577840);
                    xq2Var2.p(z13);
                    a74Var2 = x64.a;
                }
                a74 O = f04.O(vy7.p0(a74Var.d(ip3Var3.k).d(ip3Var3.l), qo3Var, sr3Var, lo4Var, z).d(a74Var2).d((a74) ip3Var3.m.i), ip3Var3, lo4Var, sgVar, z, sd2Var, ip3Var3.f, null);
                ip3Var2 = ip3Var3;
                xq2Var = xq2Var2;
                kn2.e(qo3Var, O, ip3Var2.o, eq3Var, xq2Var, 0);
            }
            z9 = true;
            boolean z182 = z17 | z9;
            if (((458752 & i22) ^ 196608) <= 131072) {
            }
            z10 = false;
            boolean z192 = z182 | z10;
            if (((i22 & 3670016) ^ 1572864) <= 1048576) {
            }
            z11 = false;
            boolean z202 = z192 | z11;
            if (((i22 & 29360128) ^ 12582912) <= 8388608) {
            }
            z12 = false;
            f = z12 | z202 | xq2Var2.f(tt2Var);
            Object P42 = xq2Var2.P();
            if (f) {
            }
            ip3Var3 = ip3Var;
            sr3Var = sr3Var2;
            z13 = false;
            z14 = true;
            uo3Var = new uo3(ip3Var3, lq4Var, qo3Var2, lu2Var, iuVar, fuVar, w61Var, tt2Var, q61Var2);
            qo3Var = qo3Var2;
            xq2Var2.l0(uo3Var);
            eq3 eq3Var2 = uo3Var;
            lo4 lo4Var2 = lo4.Vertical;
            if (!z) {
            }
            a74 O2 = f04.O(vy7.p0(a74Var.d(ip3Var3.k).d(ip3Var3.l), qo3Var, sr3Var, lo4Var2, z).d(a74Var2).d((a74) ip3Var3.m.i), ip3Var3, lo4Var2, sgVar, z, sd2Var, ip3Var3.f, null);
            ip3Var2 = ip3Var3;
            xq2Var = xq2Var2;
            kn2.e(qo3Var, O2, ip3Var2.o, eq3Var2, xq2Var, 0);
        } else {
            ip3Var2 = ip3Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new lo3(a74Var, ip3Var2, lu2Var, lq4Var, sd2Var, z, sgVar, iuVar, fuVar, qn2Var, i, i2);
        }
    }

    public static final void j(o3 o3Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(60908354);
        if (xq2Var.h(o3Var)) {
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
        if (xq2Var.S(i3 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = nb3.b(1.0f);
                xq2Var.l0(P);
            }
            gn gnVar = (gn) P;
            String O = yh2.O(xq2Var, D(o3Var.b.e));
            String str = o3Var.d;
            if (qs6.v0(str)) {
                str = "--";
            }
            String N = yh2.N(R.string.leaderboard_attempt_value, new Object[]{O, str}, xq2Var);
            boolean h = xq2Var.h(gnVar);
            Object P2 = xq2Var.P();
            if (h || P2 == vs0Var) {
                P2 = new ns3(gnVar, null, 0);
                xq2Var.l0(P2);
            }
            mb3.i(xq2Var, (eo2) P2, jg7.a);
            a74 O2 = ge7.O(x64.a, 8.0f);
            boolean h2 = xq2Var.h(gnVar);
            Object P3 = xq2Var.P();
            if (h2 || P3 == vs0Var) {
                P3 = new ms3(gnVar, 0);
                xq2Var.l0(P3);
            }
            f04.a(hv.G(O2, (qn2) P3), o3Var.c, o3Var.e, null, n16.I(-1939109924, new l4(6, N, o3Var), xq2Var), xq2Var, 24576, 8);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(o3Var, i, 15);
        }
    }

    public static final void k(zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1677843913);
        if (xq2Var.h(zv0Var)) {
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
        if (xq2Var.S(i3 & 1, z)) {
            zv0Var.o(xq2Var, Integer.valueOf(i3 & 14));
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eq(zv0Var, i, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x01bc, code lost:
        if (r0 == r5) goto L90;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void l(final pq5 pq5Var, final String str, final String str2, final boolean z, final boolean z2, final on2 on2Var, final on2 on2Var2, final a74 a74Var, px0 px0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        float f;
        a74 a74Var2;
        iy0 iy0Var;
        char c;
        pn pnVar;
        boolean z4;
        x64 x64Var;
        x64 x64Var2;
        pn pnVar2;
        vs0 vs0Var;
        pn pnVar3;
        pn pnVar4;
        boolean z5;
        boolean z6;
        e40 e40Var = d90.e0;
        on2Var.getClass();
        on2Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1263458246);
        if (xq2Var.h(pq5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (xq2Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (xq2Var.f(str2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i12 = i11 | i4;
        if (xq2Var.g(z)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (xq2Var.g(z2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (xq2Var.h(on2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i15 = i14 | i7;
        if (xq2Var.h(on2Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (xq2Var.f(a74Var)) {
            i9 = 8388608;
        } else {
            i9 = Compress.MAXWINSIZE;
        }
        int i17 = i16 | i9;
        if ((i17 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (xq2Var.S(i17 & 1, z3)) {
            es7 F = bl2.F(xq2Var);
            y16 b = z16.b(7.0f);
            Object P = xq2Var.P();
            Object obj = ox0.a;
            if (P == obj) {
                P = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P;
            qa4 a = bw7.a(r94Var, xq2Var, 6);
            if (((Boolean) gi2.u(r94Var, xq2Var).getValue()).booleanValue()) {
                f = 0.93f;
            } else {
                f = 1.0f;
            }
            pp6 b2 = in.b(f, ge7.U(1.0f, 4000.0f, null, 4), "press", xq2Var, 3120, 20);
            boolean f2 = xq2Var.f(pq5Var.d);
            Object P2 = xq2Var.P();
            if (f2 || P2 == obj) {
                P2 = np2.Y(Boolean.FALSE);
                xq2Var.l0(P2);
            }
            qa4 qa4Var = (qa4) P2;
            a74 v = mb3.v(u24.g(nj2.E(ak7.H(dj6.c(ln2.X(a74Var, ((Number) b2.getValue()).floatValue()), 1.0f), 1.117904f), 5.0f, b, false, 0L, 28), b), r94Var, false, on2Var2, on2Var, 444);
            e40 e40Var2 = d90.L;
            e34 d = h70.d(e40Var2, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, v);
            jx0.i.getClass();
            iy0 iy0Var2 = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var2);
            } else {
                xq2Var.o0();
            }
            pn pnVar5 = ix0.f;
            yh2.K(xq2Var, pnVar5, d);
            pn pnVar6 = ix0.e;
            yh2.K(xq2Var, pnVar6, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar7 = ix0.g;
            yh2.K(xq2Var, pnVar7, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar8 = ix0.d;
            yh2.K(xq2Var, pnVar8, E);
            vs0 vs0Var2 = vs0.Y;
            long E2 = hi2.E(44);
            x64 x64Var3 = x64.a;
            a74 c2 = dj6.c(ak7.H(x64Var3, 1.117904f), 1.0f);
            boolean f3 = xq2Var.f(qa4Var);
            Object P3 = xq2Var.P();
            if (!f3) {
                a74Var2 = c2;
            } else {
                a74Var2 = c2;
            }
            P3 = new j4(qa4Var, 19);
            xq2Var.l0(P3);
            hf.u(pq5Var, str2, str, a74Var2, E2, null, z, (qn2) P3, xq2Var, ((i17 << 3) & 896) | (i17 & 14) | 27648 | ((i17 >> 3) & 112) | ((i17 << 9) & 3670016), 32);
            a74 c3 = dj6.c(ak7.H(x64Var3, 1.117904f), 1.0f);
            long j = kt0.d;
            h70.a(ak7.I(c3, 1.0f, kt0.c(0.13f, j), b), xq2Var, 0);
            a74 O = ge7.O(vs0Var2.n(x64Var3, e40Var2), 7.0f);
            d40 d40Var = d90.i0;
            du duVar = ju.a;
            l26 a2 = k26.a(duVar, d40Var, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E3 = l.E(xq2Var, O);
            xq2Var.f0();
            if (xq2Var.S) {
                iy0Var = iy0Var2;
                xq2Var.k(iy0Var);
            } else {
                iy0Var = iy0Var2;
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar5, a2);
            yh2.K(xq2Var, pnVar6, l2);
            i61.w(hashCode2, xq2Var, pnVar7, xq2Var, neVar);
            yh2.K(xq2Var, pnVar8, E3);
            vr4 j0 = hf.j0(pq5Var);
            xq2Var.b0(835522958);
            pn pnVar9 = pnVar8;
            hf.k((String) j0.A, (String) j0.B, ge7.S(x64Var3, RecyclerView.B1, RecyclerView.B1, 4.0f, RecyclerView.B1, 11), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            xq2Var = xq2Var;
            xq2Var.p(false);
            hf.i(hf.n0(pq5Var), null, 0L, xq2Var, 0, 6);
            if (z2) {
                xq2Var.b0(835865291);
                gi2.h(xq2Var, dj6.l(x64Var3, 4.0f));
                a74 L2 = vy7.L(u24.g(x64Var3, z16.b(4.0f)), kt0.c(0.85f, hv.c(4279179050L)), u24.m);
                long j2 = es7.p;
                a74 P4 = ge7.P(ak7.I(L2, 0.7f, kt0.c(0.7f, j2), z16.b(4.0f)), 4.0f, 2.0f);
                e34 d2 = h70.d(e40Var2, false);
                int hashCode3 = Long.hashCode(xq2Var.T);
                xv4 l3 = xq2Var.l();
                a74 E4 = l.E(xq2Var, P4);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar5, d2);
                yh2.K(xq2Var, pnVar6, l3);
                i61.w(hashCode3, xq2Var, pnVar7, xq2Var, neVar);
                yh2.K(xq2Var, pnVar9, E4);
                l26 a3 = k26.a(duVar, d40Var, xq2Var, 48);
                int hashCode4 = Long.hashCode(xq2Var.T);
                xv4 l4 = xq2Var.l();
                a74 E5 = l.E(xq2Var, x64Var3);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar5, a3);
                yh2.K(xq2Var, pnVar6, l4);
                i61.w(hashCode4, xq2Var, pnVar7, xq2Var, neVar);
                yh2.K(xq2Var, pnVar9, E5);
                pnVar = pnVar5;
                x64Var = x64Var3;
                c = 39322;
                i13.a(q60.F(), "Achievements", dj6.i(x64Var3, 11.0f), j2, xq2Var, 3504, 0);
                xq2Var = xq2Var;
                gi2.h(xq2Var, dj6.l(x64Var, 2.5f));
                pnVar9 = pnVar9;
                x37.b("RA", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new s47(j2, hi2.D(8.5d), oj2.f0, 0L, 0L, 0, 0L, 16777208), xq2Var, 6, 0, 65534);
                z4 = true;
                i61.y(xq2Var, true, true, false);
            } else {
                c = 39322;
                pnVar = pnVar5;
                z4 = true;
                x64Var = x64Var3;
                xq2Var.b0(837121318);
                xq2Var.p(false);
            }
            xq2Var.p(z4);
            if (pq5Var.k) {
                xq2Var.b0(1459292661);
                xq2 xq2Var2 = xq2Var;
                x64 x64Var4 = x64Var;
                vs0Var = vs0Var2;
                pnVar3 = pnVar;
                x64Var2 = x64Var4;
                pnVar2 = pnVar6;
                pnVar4 = pnVar9;
                i13.a(kj2.D(), null, dj6.i(ge7.S(vs0Var2.n(x64Var, d90.X), RecyclerView.B1, 6.0f, 7.0f, RecyclerView.B1, 9), 13.0f), es7.q, xq2Var2, 3120, 0);
                xq2Var = xq2Var2;
                xq2Var.p(false);
            } else {
                x64Var2 = x64Var;
                pnVar2 = pnVar6;
                vs0Var = vs0Var2;
                pnVar3 = pnVar;
                pnVar4 = pnVar9;
                xq2Var.b0(1459622594);
                xq2Var.p(false);
            }
            if (!((Boolean) qa4Var.getValue()).booleanValue()) {
                xq2Var.b0(1459685834);
                a74 R = ge7.R(vy7.J(dj6.c(vs0Var.n(x64Var2, e40Var), 1.0f), d90.m(hf.c0(new kt0(kt0.g), new kt0(kt0.c(0.85f, kt0.b))), RecyclerView.B1, RecyclerView.B1, 14)), 8.0f, 20.0f, 8.0f, 8.0f);
                yt0 a4 = wt0.a(ju.c, d90.k0, xq2Var, 0);
                int hashCode5 = Long.hashCode(xq2Var.T);
                xv4 l5 = xq2Var.l();
                a74 E6 = l.E(xq2Var, R);
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, pnVar3, a4);
                yh2.K(xq2Var, pnVar2, l5);
                i61.w(hashCode5, xq2Var, pnVar7, xq2Var, neVar);
                yh2.K(xq2Var, pnVar4, E6);
                z5 = true;
                x37.b(hf.k0(pq5Var), null, j, hi2.E(11), oj2.e0, null, 0L, null, hi2.E(14), 2, false, 3, 0, null, null, xq2Var, 200064, 3126, 119762);
                String P5 = hf.P(pq5Var.j);
                if (P5.length() > 0) {
                    xq2Var.b0(-1595450437);
                    x37.b(P5, ge7.S(x64Var2, RecyclerView.B1, 2.0f, RecyclerView.B1, RecyclerView.B1, 13), kt0.c(0.65f, j), hi2.D(8.5d), null, qs7.c, 0L, null, hi2.E(10), 0, false, 0, 0, null, null, xq2Var, 1576368, 6, 129968);
                    z6 = false;
                    xq2Var.p(false);
                } else {
                    z6 = false;
                    xq2Var.b0(-1595110646);
                    xq2Var.p(false);
                }
                xq2Var.p(true);
                xq2Var.p(z6);
            } else {
                z5 = true;
                xq2Var.b0(1460858750);
                hf.p(pq5Var, str, ge7.O(vs0Var.n(x64Var2, e40Var), 7.0f), RecyclerView.B1, xq2Var, i17 & 126, 8);
                xq2Var.p(false);
            }
            if (((Boolean) a.getValue()).booleanValue()) {
                xq2Var.b0(1461075533);
                h70.a(ak7.I(dj6.c(ak7.H(x64Var2, 1.117904f), 1.0f), 3.0f, F.j, b), xq2Var, 0);
                xq2Var.p(false);
            } else {
                xq2Var.b0(1461187970);
                xq2Var.p(false);
            }
            xq2Var.p(z5);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(str, str2, z, z2, on2Var, on2Var2, a74Var, i) { // from class: cx5
                public final /* synthetic */ String B;
                public final /* synthetic */ String L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ boolean X;
                public final /* synthetic */ on2 Y;
                public final /* synthetic */ on2 Z;
                public final /* synthetic */ a74 d0;

                @Override // defpackage.eo2
                public final Object o(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int a0 = ii2.a0(1);
                    ii2.l(pq5.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, (px0) obj2, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final void m(final String str, final float f, final bs0 bs0Var, final boolean z, final qn2 qn2Var, final float f2, px0 px0Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float f3;
        str.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1905014024);
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (xq2Var.c(f)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (xq2Var.f(bs0Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (xq2Var.g(z)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (xq2Var.c(f2)) {
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
            if ((i13 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z3 || P == vs0Var) {
                P = new rs4(f);
                xq2Var.l0(P);
            }
            rs4 rs4Var = (rs4) P;
            int i14 = i13 & 896;
            if (i14 == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = xq2Var.P();
            if (z4 || P2 == vs0Var) {
                P2 = Float.valueOf((bs0Var.b - bs0Var.a) / 20.0f);
                xq2Var.l0(P2);
            }
            float floatValue = ((Number) P2).floatValue();
            a74 c = dj6.c(x64.a, 1.0f);
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = new c5(17);
                xq2Var.l0(P3);
            }
            a74 u = mb3.u(c, z, null, (on2) P3, 14);
            boolean f4 = xq2Var.f(rs4Var) | xq2Var.c(floatValue);
            if (i14 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z6 = z5 | f4;
            Object P4 = xq2Var.P();
            if (z6 || P4 == vs0Var) {
                P4 = new e96(floatValue, bs0Var, rs4Var);
                xq2Var.l0(P4);
            }
            a74 R = ge7.R(dj6.f(u24.A(u, (qn2) P4), 64.0f, RecyclerView.B1, 2), f2, 8.0f, f2, 8.0f);
            yt0 a = wt0.a(ju.c, d90.k0, xq2Var, 0);
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
            yh2.K(xq2Var, ix0.f, a);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            py0 py0Var = g31.a;
            if (z) {
                xq2Var.b0(-838227882);
                long j = ((kt0) xq2Var.j(j31.a)).a;
                if (!((ut0) xq2Var.j(vt0.a)).k() ? hv.N(j) < 0.5d : hv.N(j) > 0.5d) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.87f;
                }
                xq2Var.p(false);
            } else {
                xq2Var.b0(-838227142);
                long j2 = ((kt0) xq2Var.j(j31.a)).a;
                if (((ut0) xq2Var.j(vt0.a)).k()) {
                    hv.N(j2);
                } else {
                    hv.N(j2);
                }
                xq2Var.p(false);
                f3 = 0.38f;
            }
            hv.d(py0Var.a(Float.valueOf(f3)), n16.I(1351204114, new si(str, rs4Var, z, bs0Var, qn2Var), xq2Var), xq2Var, 56);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(str, f, bs0Var, z, qn2Var, f2, i) { // from class: d96
                public final /* synthetic */ String A;
                public final /* synthetic */ float B;
                public final /* synthetic */ bs0 L;
                public final /* synthetic */ boolean R;
                public final /* synthetic */ qn2 X;
                public final /* synthetic */ float Y;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1);
                    ii2.m(this.A, this.B, this.L, this.R, this.X, this.Y, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }

    public static final long n(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final le o(p0 p0Var, ut3 ut3Var) {
        if (ut3Var.b().compareTo(tt3.DESTROYED) > 0) {
            wb4 wb4Var = new wb4(p0Var, 2);
            ut3Var.a(wb4Var);
            return new le(10, ut3Var, wb4Var);
        }
        u34.m("Cannot configure ", p0Var, " to disposeComposition at Lifecycle ON_DESTROY: ", ut3Var, "is already destroyed");
        return null;
    }

    public static ad6 p(ad6 ad6Var) {
        p04 p04Var = ad6Var.A;
        p04Var.b();
        if (p04Var.e0 > 0) {
            return ad6Var;
        }
        return ad6.B;
    }

    public static final int q(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static final long r(nr4 nr4Var) {
        return u24.F(nr4Var.l() * nr4Var.p()) + (nr4Var.k() * nr4Var.p());
    }

    public static final void s(e36 e36Var, String str) {
        e36Var.getClass();
        j36 i0 = e36Var.i0(str);
        try {
            i0.f0();
            lb4.p(i0, null);
        } finally {
        }
    }

    public static final ub7 t(zg1 zg1Var, Object obj) {
        if0 if0Var;
        if (!zg1Var.A.j0) {
            p53.c("visitAncestors called on an unattached node");
        }
        z64 z64Var = zg1Var.A.X;
        sm3 f0 = nc1.f0(zg1Var);
        while (f0 != null) {
            if ((((z64) f0.B0.g).R & 262144) != 0) {
                while (z64Var != null) {
                    if ((z64Var.L & 262144) != 0) {
                        z64 z64Var2 = z64Var;
                        ua4 ua4Var = null;
                        while (z64Var2 != null) {
                            if (z64Var2 instanceof ub7) {
                                ub7 ub7Var = (ub7) z64Var2;
                                if (obj.equals(ub7Var.n())) {
                                    return ub7Var;
                                }
                            }
                            if ((z64Var2.L & 262144) != 0 && (z64Var2 instanceof zg1)) {
                                int i = 0;
                                for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                    if ((z64Var3.L & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            z64Var2 = z64Var3;
                                        } else {
                                            if (ua4Var == null) {
                                                ua4Var = new ua4(new z64[16]);
                                            }
                                            if (z64Var2 != null) {
                                                ua4Var.b(z64Var2);
                                                z64Var2 = null;
                                            }
                                            ua4Var.b(z64Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            z64Var2 = nc1.A(ua4Var);
                        }
                        continue;
                    }
                    z64Var = z64Var.X;
                }
            }
            f0 = f0.v();
            if (f0 != null && (if0Var = f0.B0) != null) {
                z64Var = (vy6) if0Var.f;
            } else {
                z64Var = null;
            }
        }
        return null;
    }

    public static List u(Context context) {
        File file;
        File file2;
        File file3;
        File file4;
        File file5;
        File file6;
        File file7;
        File file8;
        File file9;
        File file10;
        File file11;
        File file12;
        File file13;
        File file14;
        File file15;
        File file16;
        File file17;
        File file18;
        File file19;
        File file20;
        File file21;
        File file22;
        File file23;
        File file24;
        context.getClass();
        File externalFilesDir = context.getExternalFilesDir("tts_models");
        if (externalFilesDir == null || (!externalFilesDir.exists() && !externalFilesDir.mkdirs())) {
            externalFilesDir = new File(context.getFilesDir(), "tts_models");
            if (!externalFilesDir.exists()) {
                externalFilesDir.mkdirs();
            }
        }
        xx3 xx3Var = new xx3("auto_multi", "🎭 24 голоса (Нейро-автораспределение)", "dynamic", null, RecyclerView.B1);
        File file25 = new File(externalFilesDir, "ru_dmitri.onnx");
        if (file25.exists()) {
            file = file25;
        } else {
            file = null;
        }
        xx3 xx3Var2 = new xx3("piper_ru_dmitri_medium", "🎙️ Дмитрий (Нейро-Баритон)", "male", file, 18.4f);
        File file26 = new File(externalFilesDir, "ru_elena.onnx");
        if (file26.exists()) {
            file2 = file26;
        } else {
            file2 = null;
        }
        xx3 xx3Var3 = new xx3("piper_ru_elena_medium", "🎙️ Елена (Нейро-Сопрано)", "female", file2, 19.2f);
        File file27 = new File(externalFilesDir, "ru_hero.onnx");
        if (file27.exists()) {
            file3 = file27;
        } else {
            file3 = null;
        }
        xx3 xx3Var4 = new xx3("piper_ru_hero", "🗡️ Молодой герой (Звонкий тенор)", "male", file3, 18.0f);
        File file28 = new File(externalFilesDir, "ru_dark_knight.onnx");
        if (file28.exists()) {
            file4 = file28;
        } else {
            file4 = null;
        }
        xx3 xx3Var5 = new xx3("piper_ru_dark_knight", "🦇 Темный рыцарь / Бэтмен (Хриплый бас)", "male", file4, 20.5f);
        File file29 = new File(externalFilesDir, "ru_boss_grunt.onnx");
        if (file29.exists()) {
            file5 = file29;
        } else {
            file5 = null;
        }
        xx3 xx3Var6 = new xx3("piper_ru_boss_grunt", "👹 Босс / Тиран / Баузер (Тяжелый бас)", "male", file5, 21.0f);
        File file30 = new File(externalFilesDir, "ru_joker.onnx");
        if (file30.exists()) {
            file6 = file30;
        } else {
            file6 = null;
        }
        xx3 xx3Var7 = new xx3("piper_ru_joker_manic", "🃏 Джокер / Псих (Маниакальный тенор)", "male", file6, 18.2f);
        File file31 = new File(externalFilesDir, "ru_demon.onnx");
        if (file31.exists()) {
            file7 = file31;
        } else {
            file7 = null;
        }
        xx3 xx3Var8 = new xx3("piper_ru_deep_demon", "💀 Демон бездны / Дракула (Глубокий бас)", "male", file7, 22.0f);
        File file32 = new File(externalFilesDir, "ru_elder.onnx");
        if (file32.exists()) {
            file8 = file32;
        } else {
            file8 = null;
        }
        xx3 xx3Var9 = new xx3("piper_ru_elder", "📜 Мудрый старец / Профессор (Хриплый)", "male", file8, 17.5f);
        File file33 = new File(externalFilesDir, "ru_boy.onnx");
        if (file33.exists()) {
            file9 = file33;
        } else {
            file9 = null;
        }
        xx3 xx3Var10 = new xx3("piper_ru_young_boy", "👦 Мальчик / Спутник / Люк (Звонкий)", "male", file9, 16.5f);
        File file34 = new File(externalFilesDir, "ru_girl.onnx");
        if (file34.exists()) {
            file10 = file34;
        } else {
            file10 = null;
        }
        xx3 xx3Var11 = new xx3("piper_ru_young_girl", "👧 Девочка / Перл Фей (Нежный детский)", "female", file10, 16.8f);
        File file35 = new File(externalFilesDir, "ru_queen.onnx");
        if (file35.exists()) {
            file11 = file35;
        } else {
            file11 = null;
        }
        xx3 xx3Var12 = new xx3("piper_ru_royal_queen", "👑 Принцесса / Королева Зельда (Величественный)", "female", file11, 19.5f);
        File file36 = new File(externalFilesDir, "ru_merchant.onnx");
        if (file36.exists()) {
            file12 = file36;
        } else {
            file12 = null;
        }
        xx3 xx3Var13 = new xx3("piper_ru_merchant", "💰 Торговец / Том Нук (Услужливый бодрый)", "male", file12, 17.8f);
        File file37 = new File(externalFilesDir, "ru_soldier.onnx");
        if (file37.exists()) {
            file13 = file37;
        } else {
            file13 = null;
        }
        xx3 xx3Var14 = new xx3("piper_ru_soldier", "🛡️ Стражник / Капитан (Командный суровый)", "male", file13, 18.6f);
        File file38 = new File(externalFilesDir, "ru_robot.onnx");
        if (file38.exists()) {
            file14 = file38;
        } else {
            file14 = null;
        }
        xx3 xx3Var15 = new xx3("piper_ru_robot", "🤖 Робот / Киборг / Покедекс (Синтетический)", "neutral", file14, 15.0f);
        File file39 = new File(externalFilesDir, "ru_narrator.onnx");
        if (file39.exists()) {
            file15 = file39;
        } else {
            file15 = null;
        }
        xx3 xx3Var16 = new xx3("piper_ru_narrator", "📖 Рассказчик / Летописец (Бархатный)", "neutral", file15, 18.5f);
        File file40 = new File(externalFilesDir, "ru_tsundere.onnx");
        if (file40.exists()) {
            file16 = file40;
        } else {
            file16 = null;
        }
        xx3 xx3Var17 = new xx3("piper_ru_tsundere", "🎀 Цундере / Франциска (Капризное сопрано)", "female", file16, 19.0f);
        File file41 = new File(externalFilesDir, "ru_whisper.onnx");
        if (file41.exists()) {
            file17 = file41;
        } else {
            file17 = null;
        }
        xx3 xx3Var18 = new xx3("piper_ru_whisper", "🤫 Таинственный шепот / Тень (Мистический)", "neutral", file17, 16.0f);
        File file42 = new File(externalFilesDir, "ru_fairy.onnx");
        if (file42.exists()) {
            file18 = file42;
        } else {
            file18 = null;
        }
        xx3 xx3Var19 = new xx3("piper_ru_fairy", "✨ Веселая фея / Нави (Игривый высокий альт)", "female", file18, 17.0f);
        File file43 = new File(externalFilesDir, "ru_pirate.onnx");
        if (file43.exists()) {
            file19 = file43;
        } else {
            file19 = null;
        }
        xx3 xx3Var20 = new xx3("piper_ru_pirate", "🏴\u200d☠️ Капитан пиратов (Грубый рычащий бас)", "male", file19, 20.0f);
        File file44 = new File(externalFilesDir, "ru_scientist.onnx");
        if (file44.exists()) {
            file20 = file44;
        } else {
            file20 = null;
        }
        xx3 xx3Var21 = new xx3("piper_ru_mad_scientist", "🔬 Безумный ученый / Вайли (Эксцентричный)", "male", file20, 18.0f);
        File file45 = new File(externalFilesDir, "ru_gentleman.onnx");
        if (file45.exists()) {
            file21 = file45;
        } else {
            file21 = null;
        }
        xx3 xx3Var22 = new xx3("piper_ru_gentleman", "🎩 Джентльмен / Лейтон / Райт (Элегантный)", "male", file21, 19.0f);
        File file46 = new File(externalFilesDir, "ru_ghost.onnx");
        if (file46.exists()) {
            file22 = file46;
        } else {
            file22 = null;
        }
        xx3 xx3Var23 = new xx3("piper_ru_ghost", "👻 Призрак / Фантом (Эфирный эхо-тон)", "neutral", file22, 17.2f);
        File file47 = new File(externalFilesDir, "ru_knight.onnx");
        if (file47.exists()) {
            file23 = file47;
        } else {
            file23 = null;
        }
        xx3 xx3Var24 = new xx3("piper_ru_knight", "⚔️ Благородный рыцарь (Твердый баритон)", "male", file23, 19.4f);
        File file48 = new File(externalFilesDir, "ru_angelic.onnx");
        if (file48.exists()) {
            file24 = file48;
        } else {
            file24 = null;
        }
        return hf.c0(xx3Var, xx3Var2, xx3Var3, xx3Var4, xx3Var5, xx3Var6, xx3Var7, xx3Var8, xx3Var9, xx3Var10, xx3Var11, xx3Var12, xx3Var13, xx3Var14, xx3Var15, xx3Var16, xx3Var17, xx3Var18, xx3Var19, xx3Var20, xx3Var21, xx3Var22, xx3Var23, xx3Var24, new xx3("piper_ru_angelic", "🕊️ Богиня / Ангел Палютена (Священный)", "female", file24, 20.0f));
    }

    public static final long v(long j) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) / 2.0f) << 32);
    }

    public static final e33 w() {
        e33 e33Var = A;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.FolderOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(20.0f, 6.0f);
        ww2Var.l(-8.0f);
        ww2Var.n(-2.0f, -2.0f);
        ww2Var.m(4.0f, 4.0f);
        ww2Var.i(-1.1f, RecyclerView.B1, -1.99f, 0.9f, -1.99f, 2.0f);
        ww2Var.m(2.0f, 18.0f);
        ww2Var.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        ww2Var.l(16.0f);
        ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
        ww2Var.m(22.0f, 8.0f);
        ww2Var.i(RecyclerView.B1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        ww2Var.g();
        ww2Var.o(20.0f, 18.0f);
        ww2Var.m(4.0f, 18.0f);
        ww2Var.m(4.0f, 8.0f);
        ww2Var.l(16.0f);
        ww2Var.u(10.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b = d33Var.b();
        A = b;
        return b;
    }

    public static final um x(l61 l61Var) {
        um umVar = (um) l61Var.Z(vs0.i0);
        if (umVar != null) {
            return umVar;
        }
        i.m("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final e33 y() {
        e33 e33Var = B;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.RestartAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        long j = kt0.b;
        cn6 cn6Var = new cn6(j);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(12.0f, 5.0f);
        ww2Var.t(2.0f);
        ww2Var.m(8.0f, 6.0f);
        ww2Var.n(4.0f, 4.0f);
        ww2Var.t(7.0f);
        ww2Var.i(3.31f, RecyclerView.B1, 6.0f, 2.69f, 6.0f, 6.0f);
        ww2Var.i(RecyclerView.B1, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
        ww2Var.u(2.02f);
        ww2Var.i(3.95f, -0.49f, 7.0f, -3.85f, 7.0f, -7.93f);
        ww2Var.h(20.0f, 8.58f, 16.42f, 5.0f, 12.0f, 5.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        cn6 cn6Var2 = new cn6(j);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new tt4(6.0f, 13.0f));
        arrayList.add(new yt4(RecyclerView.B1, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f));
        arrayList.add(new st4(6.34f, 7.34f));
        arrayList.add(new qt4(4.9f, 8.79f, 4.0f, 10.79f, 4.0f, 13.0f));
        arrayList.add(new yt4(RecyclerView.B1, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f));
        arrayList.add(new fu4(-2.02f));
        arrayList.add(new qt4(8.17f, 18.43f, 6.0f, 15.97f, 6.0f, 13.0f));
        arrayList.add(pt4.c);
        d33.a(d33Var, arrayList, 0, cn6Var2);
        e33 b = d33Var.b();
        B = b;
        return b;
    }

    public static final String z(px0 px0Var, int i) {
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.j(kf.a);
        Resources resources = ((Context) xq2Var.j(kf.b)).getResources();
        if (i == 0) {
            return resources.getString(R.string.navigation_menu);
        }
        if (i == 1) {
            return resources.getString(R.string.close_drawer);
        }
        if (i == 2) {
            return resources.getString(R.string.close_sheet);
        }
        if (i == 3) {
            return resources.getString(R.string.default_error_message);
        }
        if (i == 4) {
            return resources.getString(R.string.dropdown_menu);
        }
        if (i == 5) {
            return resources.getString(R.string.range_start);
        }
        if (i == 6) {
            return resources.getString(R.string.range_end);
        }
        if (i == 7) {
            return resources.getString(R.string.mc2_snackbar_pane_title);
        }
        return "";
    }

    public abstract int H(int i);

    public abstract int N(int i);

    @Override // defpackage.q96
    public int a(int i) {
        int H = H(i);
        if (H == -1 || H(H) == -1) {
            return -1;
        }
        return H;
    }

    @Override // defpackage.q96
    public int b(int i) {
        int N = N(i);
        if (N == -1 || N(N) == -1) {
            return -1;
        }
        return N;
    }

    @Override // defpackage.q96
    public int c(int i) {
        return N(i);
    }

    @Override // defpackage.q96
    public int d(int i) {
        return H(i);
    }
}
