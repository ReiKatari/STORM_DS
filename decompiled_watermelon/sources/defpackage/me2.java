package defpackage;

import android.animation.TimeInterpolator;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.ExtractedText;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: me2  reason: default package */
/* loaded from: classes.dex */
public abstract class me2 {
    public static final /* synthetic */ int a = 0;
    public static ax2 b;
    public static final /* synthetic */ int c = 0;

    public static Intent A(Context context, ComponentName componentName) {
        String B = B(context, componentName);
        if (B == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), B);
        if (B(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String B(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static final int C(jr6 jr6Var, Layout layout, r9 r9Var, int i, RectF rectF, ey5 ey5Var, z5 z5Var, boolean z) {
        boolean z2;
        df3[] df3VarArr;
        b33 b33Var;
        float f;
        float w;
        df3[] df3VarArr2;
        int i2;
        int b2;
        float f2;
        float w2;
        int i3;
        int i4;
        int a2;
        float f3;
        float w3;
        Bidi createLineBidi;
        boolean z3;
        boolean z4;
        float a3;
        float a4;
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
        Layout layout2 = jr6Var.f;
        int lineStart2 = layout2.getLineStart(i);
        int f5 = jr6Var.f(i);
        if (i5 < (f5 - lineStart2) * 2) {
            nz2.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        es2 es2Var = new es2(jr6Var);
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
                a3 = es2Var.a(lineStart2, z5, z5, true);
                f4 = es2Var.a(lineStart2 + 1, true, true, true);
                z4 = z2;
            } else if (z2 && isRtlCharAt) {
                z4 = z2;
                f4 = es2Var.a(lineStart2, false, false, false);
                a3 = es2Var.a(lineStart2 + 1, true, true, false);
            } else {
                z4 = z2;
                if (isRtlCharAt) {
                    a4 = es2Var.a(lineStart2, false, false, true);
                    a3 = es2Var.a(lineStart2 + 1, true, true, true);
                } else {
                    a3 = es2Var.a(lineStart2, false, false, false);
                    a4 = es2Var.a(lineStart2 + 1, true, true, false);
                }
                f4 = a4;
            }
            fArr[i6] = a3;
            fArr[i6 + 1] = f4;
            i6 += 2;
            lineStart2++;
            z2 = z4;
            z5 = false;
        }
        Layout layout3 = (Layout) r9Var.a;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int y = r9Var.y(lineStart3, false);
        int z6 = r9Var.z(y);
        int i7 = lineStart3 - z6;
        int i8 = lineEnd2 - z6;
        Bidi j = r9Var.j(y);
        if (j != null && (createLineBidi = j.createLineBidi(i7, i8)) != null) {
            int runCount = createLineBidi.getRunCount();
            df3VarArr = new df3[runCount];
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
                df3VarArr[i9] = new df3(runStart, z3, runLimit);
                i9++;
                runCount = i10;
            }
        } else {
            df3VarArr = new df3[]{new df3(lineStart3, layout3.isRtlCharAt(lineStart3), lineEnd2)};
        }
        if (z) {
            b33Var = nu.s0(df3VarArr);
        } else {
            b33Var = new b33(df3VarArr.length - 1, 0, -1);
        }
        int i11 = b33Var.A;
        int i12 = b33Var.B;
        int i13 = b33Var.L;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            df3 df3Var = df3VarArr[i11];
            boolean z7 = df3Var.c;
            int i14 = df3Var.a;
            int i15 = df3Var.b;
            if (z7) {
                f = fArr[((i15 - 1) - lineStart) * 2];
            } else {
                f = fArr[(i14 - lineStart) * 2];
            }
            if (z7) {
                w = w(i14, lineStart, fArr);
            } else {
                w = w(i15 - 1, lineStart, fArr);
            }
            float f6 = rectF.left;
            int i16 = i13;
            if (z) {
                if (w >= f6) {
                    float f7 = rectF.right;
                    if (f <= f7) {
                        if ((!z7 && f6 <= f) || (z7 && f7 >= w)) {
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
                        int b3 = ey5Var.b(i4);
                        if (b3 != -1 && (a2 = ey5Var.a(b3)) < i15) {
                            if (a2 >= i14) {
                                i14 = a2;
                            }
                            if (b3 > i15) {
                                b3 = i15;
                            }
                            df3VarArr2 = df3VarArr;
                            RectF rectF2 = new RectF(RecyclerView.A1, lineTop, RecyclerView.A1, lineBottom);
                            int i20 = b3;
                            while (true) {
                                if (z7) {
                                    f3 = fArr[((i20 - 1) - lineStart) * 2];
                                } else {
                                    f3 = fArr[(i14 - lineStart) * 2];
                                }
                                rectF2.left = f3;
                                if (z7) {
                                    w3 = w(i14, lineStart, fArr);
                                } else {
                                    w3 = w(i20 - 1, lineStart, fArr);
                                }
                                rectF2.right = w3;
                                if (!((Boolean) z5Var.j(rectF2, rectF)).booleanValue()) {
                                    i14 = ey5Var.c(i14);
                                    if (i14 == -1 || i14 >= i15) {
                                        break;
                                    }
                                    i20 = ey5Var.b(i14);
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
                df3VarArr2 = df3VarArr;
                i14 = -1;
            } else {
                df3VarArr2 = df3VarArr;
                if (w >= f6) {
                    float f9 = rectF.right;
                    if (f <= f9) {
                        if ((!z7 && f9 >= w) || (z7 && f6 <= f)) {
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
                        int a5 = ey5Var.a(i2 + 1);
                        if (a5 != -1 && (b2 = ey5Var.b(a5)) > i14) {
                            if (a5 < i14) {
                                a5 = i14;
                            }
                            if (b2 <= i15) {
                                i15 = b2;
                            }
                            RectF rectF3 = new RectF(RecyclerView.A1, lineTop, RecyclerView.A1, lineBottom);
                            int i26 = a5;
                            while (true) {
                                if (z7) {
                                    f2 = fArr[((i15 - 1) - lineStart) * 2];
                                } else {
                                    f2 = fArr[(i26 - lineStart) * 2];
                                }
                                rectF3.left = f2;
                                if (z7) {
                                    w2 = w(i26, lineStart, fArr);
                                } else {
                                    w2 = w(i15 - 1, lineStart, fArr);
                                }
                                rectF3.right = w2;
                                if (!((Boolean) z5Var.j(rectF3, rectF)).booleanValue()) {
                                    i15 = ey5Var.d(i15);
                                    if (i15 == -1 || i15 <= i14) {
                                        break;
                                    }
                                    i26 = ey5Var.a(i15);
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
            df3VarArr = df3VarArr2;
        }
    }

    public static final int D(h06 h06Var, h06[] h06VarArr) {
        boolean z;
        boolean z2;
        int i;
        h06VarArr.getClass();
        int hashCode = (h06Var.b().hashCode() * 31) + Arrays.hashCode(h06VarArr);
        int d = h06Var.d();
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (d > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            int i4 = d - 1;
            int i5 = i2 * 31;
            String b2 = h06Var.j(h06Var.d() - d).b();
            if (b2 != null) {
                i3 = b2.hashCode();
            }
            i2 = i5 + i3;
            d = i4;
        }
        int d2 = h06Var.d();
        int i6 = 1;
        while (true) {
            if (d2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                int i7 = d2 - 1;
                int i8 = i6 * 31;
                ep2 c2 = h06Var.j(h06Var.d() - d2).c();
                if (c2 != null) {
                    i = c2.hashCode();
                } else {
                    i = 0;
                }
                i6 = i8 + i;
                d2 = i7;
            } else {
                return (((hashCode * 31) + i2) * 31) + i6;
            }
        }
    }

    public static boolean E(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static final int F(String str) {
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

    public static tj4 G(Object obj) {
        return new tj4(obj, k45.n0);
    }

    public static final int H(zh3 zh3Var, jf4 jf4Var) {
        long j;
        if (jf4Var == jf4.Vertical) {
            j = zh3Var.o & 4294967295L;
        } else {
            j = zh3Var.o >> 32;
        }
        return (int) j;
    }

    public static final m93 I(qo0 qo0Var, ArrayList arrayList, ki2 ki2Var) {
        m93 ztVar;
        m93 o75Var;
        qo0Var.getClass();
        Class cls = qo0Var.a;
        if (!qo0Var.equals(q75.a(Collection.class)) && !qo0Var.equals(q75.a(List.class)) && !qo0Var.equals(q75.a(List.class)) && !qo0Var.equals(q75.a(ArrayList.class))) {
            if (qo0Var.equals(q75.a(HashSet.class))) {
                ztVar = new zt((m93) arrayList.get(0), 1);
            } else if (!qo0Var.equals(q75.a(Set.class)) && !qo0Var.equals(q75.a(Set.class)) && !qo0Var.equals(q75.a(LinkedHashSet.class))) {
                if (qo0Var.equals(q75.a(HashMap.class))) {
                    ztVar = new pq2((m93) arrayList.get(0), (m93) arrayList.get(1), 0);
                } else if (!qo0Var.equals(q75.a(Map.class)) && !qo0Var.equals(q75.a(Map.class)) && !qo0Var.equals(q75.a(LinkedHashMap.class))) {
                    if (qo0Var.equals(q75.a(Map.Entry.class))) {
                        m93 m93Var = (m93) arrayList.get(0);
                        m93 m93Var2 = (m93) arrayList.get(1);
                        m93Var.getClass();
                        m93Var2.getClass();
                        o75Var = new tt3(m93Var, m93Var2, 0);
                    } else if (qo0Var.equals(q75.a(ti4.class))) {
                        m93 m93Var3 = (m93) arrayList.get(0);
                        m93 m93Var4 = (m93) arrayList.get(1);
                        m93Var3.getClass();
                        m93Var4.getClass();
                        o75Var = new tt3(m93Var3, m93Var4, 1);
                    } else if (qo0Var.equals(q75.a(ty6.class))) {
                        m93 m93Var5 = (m93) arrayList.get(0);
                        m93 m93Var6 = (m93) arrayList.get(1);
                        m93 m93Var7 = (m93) arrayList.get(2);
                        m93Var5.getClass();
                        m93Var6.getClass();
                        m93Var7.getClass();
                        ztVar = new uy6(m93Var5, m93Var6, m93Var7);
                    } else {
                        cls.getClass();
                        if (cls.isArray()) {
                            Object c2 = ki2Var.c();
                            c2.getClass();
                            m93 m93Var8 = (m93) arrayList.get(0);
                            m93Var8.getClass();
                            o75Var = new o75((qo0) c2, m93Var8);
                        } else {
                            ztVar = null;
                        }
                    }
                    ztVar = o75Var;
                } else {
                    ztVar = new pq2((m93) arrayList.get(0), (m93) arrayList.get(1), 1);
                }
            } else {
                ztVar = new zt((m93) arrayList.get(0), 2);
            }
        } else {
            ztVar = new zt((m93) arrayList.get(0), 0);
        }
        if (ztVar == null) {
            m93[] m93VarArr = (m93[]) arrayList.toArray(new m93[0]);
            m93[] m93VarArr2 = (m93[]) Arrays.copyOf(m93VarArr, m93VarArr.length);
            cls.getClass();
            return ln2.x(cls, (m93[]) Arrays.copyOf(m93VarArr2, m93VarArr2.length));
        }
        return ztVar;
    }

    public static final k24 J(Uri uri, aj2 aj2Var, sk2 sk2Var) {
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (L == sn1Var) {
            L = G(null);
            sk2Var.h0(L);
        }
        k24 k24Var = (k24) L;
        boolean h = sk2Var.h(aj2Var);
        Object L2 = sk2Var.L();
        if (h || L2 == sn1Var) {
            L2 = new va6(aj2Var, k24Var, null, 1);
            sk2Var.h0(L2);
        }
        l.g(sk2Var, (aj2) L2, uri);
        return k24Var;
    }

    public static final int K(int i, String str) {
        char charAt = str.charAt(i);
        return (charAt << 7) + str.charAt(i + 1);
    }

    public static final k24 L(Object obj, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        Object L = sk2Var.L();
        if (L == su0.a) {
            L = G(obj);
            sk2Var.h0(L);
        }
        k24 k24Var = (k24) L;
        k24Var.setValue(obj);
        return k24Var;
    }

    public static int M(Context context, int i, int i2) {
        TypedValue O = hk2.O(context, i);
        if (O != null && O.type == 16) {
            return O.data;
        }
        return i2;
    }

    public static TimeInterpolator N(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!E(valueOf, "cubic-bezier") && !E(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (E(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(x(split, 0), x(split, 1), x(split, 2), x(split, 3));
                }
                f81.e(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                return null;
            } else if (E(valueOf, "path")) {
                String substring = valueOf.substring(5, valueOf.length() - 1);
                Path path = new Path();
                try {
                    gl4.b(gk2.A(substring), path);
                    return new PathInterpolator(path);
                } catch (RuntimeException e) {
                    c44.o("Error in parsing ".concat(substring), e);
                    return null;
                }
            } else {
                i.i("Invalid motion easing type: ".concat(valueOf));
                return null;
            }
        }
        i.i("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    public static final m93 O(qo0 qo0Var) {
        qo0Var.getClass();
        m93 Q = Q(qo0Var);
        if (Q != null) {
            return Q;
        }
        throw new IllegalArgumentException(mh7.W(qo0Var));
    }

    public static final m93 P(vn1 vn1Var, Type type) {
        vn1Var.getClass();
        type.getClass();
        m93 R = ve2.R(vn1Var, type, true);
        if (R != null) {
            return R;
        }
        Class N = ve2.N(type);
        N.getClass();
        throw new IllegalArgumentException(mh7.W(q75.a(N)));
    }

    public static final m93 Q(qo0 qo0Var) {
        qo0Var.getClass();
        Class cls = qo0Var.a;
        cls.getClass();
        m93 x = ln2.x(cls, (m93[]) Arrays.copyOf(new m93[0], 0));
        if (x == null) {
            return (m93) yt4.a.get(qo0Var);
        }
        return x;
    }

    public static final m93 R(vn1 vn1Var, n93 n93Var) {
        vn1Var.getClass();
        n93Var.getClass();
        return yf2.S(vn1Var, n93Var, false);
    }

    public static final ArrayList S(vn1 vn1Var, List list, boolean z) {
        vn1Var.getClass();
        list.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n93 n93Var = (n93) it.next();
                n93Var.getClass();
                m93 S = yf2.S(vn1Var, n93Var, true);
                if (S != null) {
                    arrayList.add(S);
                } else {
                    throw new IllegalArgumentException(mh7.W(mh7.T(n93Var)));
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(uq0.y0(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            m93 R = R(vn1Var, (n93) it2.next());
            if (R == null) {
                return null;
            }
            arrayList2.add(R);
        }
        return arrayList2;
    }

    public static final String T(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return simpleName + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final bz0 U(ki2 ki2Var) {
        return new bz0(6, new xh(ki2Var, null));
    }

    public static final String[] V(tu0 tu0Var, int i) {
        return ((Resources) ((sk2) tu0Var).j(ue.c)).getStringArray(i);
    }

    public static final String W(int i, Object[] objArr, tu0 tu0Var) {
        return ((Resources) ((sk2) tu0Var).j(ue.c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String X(tu0 tu0Var, int i) {
        return ((Resources) ((sk2) tu0Var).j(ue.c)).getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y(int r6, java.lang.Object r7, defpackage.tb5 r8, defpackage.pe2 r9, int r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.Typeface
            if (r0 != 0) goto L5
            return r7
        L5:
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L29
            pe2 r0 = r8.b
            boolean r0 = defpackage.b53.x(r0, r9)
            if (r0 != 0) goto L29
            pe2 r0 = defpackage.pe2.R
            int r3 = r9.compareTo(r0)
            if (r3 < 0) goto L29
            pe2 r3 = r8.b
            int r3 = r3.A
            int r0 = r0.A
            int r0 = defpackage.b53.E(r3, r0)
            if (r0 >= 0) goto L29
            r0 = r2
            goto L2a
        L29:
            r0 = r1
        L2a:
            r3 = 2
            r6 = r6 & r3
            if (r6 == 0) goto L36
            r8.getClass()
            if (r10 != 0) goto L34
            goto L36
        L34:
            r6 = r2
            goto L37
        L36:
            r6 = r1
        L37:
            if (r6 != 0) goto L3c
            if (r0 != 0) goto L3c
            return r7
        L3c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r4 >= r5) goto L5d
            if (r6 == 0) goto L48
            if (r10 != r2) goto L48
            r6 = r2
            goto L49
        L48:
            r6 = r1
        L49:
            if (r6 == 0) goto L4f
            if (r0 == 0) goto L4f
            r1 = 3
            goto L56
        L4f:
            if (r0 == 0) goto L53
            r1 = r2
            goto L56
        L53:
            if (r6 == 0) goto L56
            r1 = r3
        L56:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = android.graphics.Typeface.create(r7, r1)
            return r6
        L5d:
            if (r0 == 0) goto L62
            int r9 = r9.A
            goto L66
        L62:
            pe2 r9 = r8.b
            int r9 = r9.A
        L66:
            if (r6 == 0) goto L6c
            if (r10 != r2) goto L6f
            r1 = r2
            goto L6f
        L6c:
            r8.getClass()
        L6f:
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7
            android.graphics.Typeface r6 = defpackage.on1.f(r7, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me2.Y(int, java.lang.Object, tb5, pe2, int):java.lang.Object");
    }

    public static final int Z(i14 i14Var) {
        int c2;
        int i = i14Var.b;
        int c3 = i14Var.c(0);
        while (i14Var.b != 0 && i14Var.c(0) == c3) {
            i14Var.f(0, i14Var.d());
            i14Var.e(i14Var.b - 1);
            int i2 = i14Var.b;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int c4 = i14Var.c(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int c5 = i14Var.c(i6);
                if (i5 < i2 && (c2 = i14Var.c(i5)) > c5) {
                    if (c2 > c4) {
                        i14Var.f(i4, c2);
                        i14Var.f(i5, c4);
                        i4 = i5;
                    }
                } else if (c5 > c4) {
                    i14Var.f(i4, c5);
                    i14Var.f(i6, c4);
                    i4 = i6;
                }
            }
        }
        return c3;
    }

    public static final void a(m3 m3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(60908354);
        if (sk2Var.h(m3Var)) {
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
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L == sn1Var) {
                L = a53.c(1.0f);
                sk2Var.h0(L);
            }
            um umVar = (um) L;
            String X = X(sk2Var, F(m3Var.b.e));
            String str = m3Var.d;
            if (zg6.B0(str)) {
                str = "--";
            }
            String W = W(R.string.leaderboard_attempt_value, new Object[]{X, str}, sk2Var);
            boolean h = sk2Var.h(umVar);
            Object L2 = sk2Var.L();
            if (h || L2 == sn1Var) {
                L2 = new a6(umVar, null, 29);
                sk2Var.h0(L2);
            }
            l.g(sk2Var, (aj2) L2, o27.a);
            zy3 X2 = b53.X(wy3.a, 8.0f);
            boolean h2 = sk2Var.h(umVar);
            Object L3 = sk2Var.L();
            if (h2 || L3 == sn1Var) {
                L3 = new ll3(umVar, 0);
                sk2Var.h0(L3);
            }
            pu.a(tq5.q(X2, (mi2) L3), m3Var.c, m3Var.e, null, ct3.H0(-1939109924, new l4(5, W, m3Var), sk2Var), sk2Var, 24576, 8);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new z5(i, 15, m3Var);
        }
    }

    public static final void a0(Object obj) {
        if (!(obj instanceof kc5)) {
            return;
        }
        throw ((kc5) obj).A;
    }

    public static final void b(zy3 zy3Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        zy3Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-2353038);
        if (sk2Var.f(zy3Var)) {
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
            tv3 d = d50.d(y60.L, false);
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
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            yu4.a(y60.n0.i(wy3.a, y60.Z), 0L, RecyclerView.A1, 0L, 0, sk2Var, 0, 30);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new ez(zy3Var, i, 2);
        }
    }

    public static final String b0(h06 h06Var) {
        d33 t0 = io2.t0(0, h06Var.d());
        return tq0.S0(t0, ", ", h06Var.b() + '(', ")", new kb2(20, h06Var), 24);
    }

    public static final void c(Logger logger, bn6 bn6Var, en6 en6Var, String str) {
        logger.fine(en6Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + bn6Var.a);
    }

    public static final float d(xn4 xn4Var, boolean z, gs2[] gs2VarArr, float f) {
        boolean z2;
        float f2 = Float.NaN;
        for (gs2 gs2Var : gs2VarArr) {
            float c2 = xn4Var.c(gs2Var);
            if (!Float.isNaN(f2)) {
                if (c2 > f2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z != z2) {
                }
            }
            f2 = c2;
        }
        if (Float.isNaN(f2)) {
            return f;
        }
        return f2;
    }

    public static final ExtractedText e(oq6 oq6Var) {
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

    public static final void f(i14 i14Var, int i) {
        if (i14Var.b != 0 && (i14Var.c(0) == i || i14Var.c(i14Var.b - 1) == i)) {
            return;
        }
        int i2 = i14Var.b;
        i14Var.a(i);
        while (i2 > 0) {
            int i3 = ((i2 + 1) >>> 1) - 1;
            int c2 = i14Var.c(i3);
            if (i <= c2) {
                break;
            }
            i14Var.f(i2, c2);
            i2 = i3;
        }
        i14Var.f(i2, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r8v2, types: [k75, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.sw5 r5, float r6, defpackage.sc6 r7, defpackage.k11 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.uv5
            if (r0 == 0) goto L13
            r0 = r8
            uv5 r0 = (defpackage.uv5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            uv5 r0 = new uv5
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            k75 r5 = r0.R
            a0(r8)
            goto L4b
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L30:
            a0(r8)
            k75 r8 = new k75
            r8.<init>()
            vv5 r2 = new vv5
            r2.<init>(r6, r7, r8, r3)
            r0.R = r8
            r0.Y = r4
            r24 r6 = defpackage.r24.Default
            java.lang.Object r5 = r5.e(r6, r2, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            r5 = r8
        L4b:
            float r5 = r5.A
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.me2.g(sw5, float, sc6, k11):java.lang.Object");
    }

    public static void h(wi6 wi6Var, Object[] objArr) {
        long j;
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                if (obj == null) {
                    wi6Var.e(i);
                } else if (obj instanceof byte[]) {
                    wi6Var.j(i, (byte[]) obj);
                } else if (obj instanceof Float) {
                    wi6Var.v(((Number) obj).floatValue(), i);
                } else if (obj instanceof Double) {
                    wi6Var.v(((Number) obj).doubleValue(), i);
                } else if (obj instanceof Long) {
                    wi6Var.g(i, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    wi6Var.g(i, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    wi6Var.g(i, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    wi6Var.g(i, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    wi6Var.t(i, (String) obj);
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    wi6Var.g(i, j);
                } else {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
            }
        }
    }

    public static final y55 i(rd3 rd3Var) {
        rd3 m = rd3Var.m();
        if (m != null) {
            return m.L(rd3Var, true);
        }
        return new y55(RecyclerView.A1, RecyclerView.A1, (int) (rd3Var.O() >> 32), (int) (rd3Var.O() & 4294967295L));
    }

    public static final y55 j(rd3 rd3Var, boolean z) {
        rd3 s = s(rd3Var);
        float O = (int) (s.O() >> 32);
        float O2 = (int) (s.O() & 4294967295L);
        y55 L = s.L(rd3Var, z);
        float f = L.a;
        float f2 = RecyclerView.A1;
        if (z) {
            if (f < RecyclerView.A1) {
                f = 0.0f;
            }
            if (f > O) {
                f = O;
            }
        }
        float f3 = L.b;
        if (z) {
            if (f3 < RecyclerView.A1) {
                f3 = 0.0f;
            }
            if (f3 > O2) {
                f3 = O2;
            }
        }
        float f4 = L.c;
        if (z) {
            if (f4 < RecyclerView.A1) {
                f4 = 0.0f;
            }
            if (f4 <= O) {
                O = f4;
            }
            f4 = O;
        }
        float f5 = L.d;
        if (z) {
            if (f5 >= RecyclerView.A1) {
                f2 = f5;
            }
            if (f2 <= O2) {
                O2 = f2;
            }
            f5 = O2;
        }
        if (f == f4 || f3 == f5) {
            return y55.e;
        }
        long k = s.k((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long k2 = s.k((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long k3 = s.k((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        long k4 = s.k((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (k >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (k2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (k4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (k3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (k & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (k2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (k4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (k3 & 4294967295L));
        return new y55(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static int k(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    public static final k24 l(u92 u92Var, Object obj, e31 e31Var, tu0 tu0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            e31Var = mp1.A;
        }
        sk2 sk2Var = (sk2) tu0Var;
        boolean h = sk2Var.h(e31Var) | sk2Var.h(u92Var);
        Object L = sk2Var.L();
        sn1 sn1Var = su0.a;
        if (h || L == sn1Var) {
            L = new zw5(e31Var, u92Var, null, 5);
            sk2Var.h0(L);
        }
        aj2 aj2Var = (aj2) L;
        Object L2 = sk2Var.L();
        if (L2 == sn1Var) {
            L2 = G(obj);
            sk2Var.h0(L2);
        }
        k24 k24Var = (k24) L2;
        boolean h2 = sk2Var.h(aj2Var);
        Object L3 = sk2Var.L();
        if (h2 || L3 == sn1Var) {
            L3 = new va6(aj2Var, k24Var, null, 2);
            sk2Var.h0(L3);
        }
        l.h(u92Var, e31Var, (aj2) L3, sk2Var);
        return k24Var;
    }

    public static final k24 m(ce6 ce6Var, tu0 tu0Var) {
        return l(ce6Var, ce6Var.getValue(), mp1.A, tu0Var, 0, 0);
    }

    public static Handler n(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return dp.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final kc5 o(Throwable th) {
        th.getClass();
        return new kc5(th);
    }

    public static final o24 p() {
        n85 n85Var = ua6.b;
        o24 o24Var = (o24) n85Var.d();
        if (o24Var == null) {
            o24 o24Var2 = new o24(new rk2[0]);
            n85Var.u(o24Var2);
            return o24Var2;
        }
        return o24Var;
    }

    public static final ee1 q(ki2 ki2Var) {
        n85 n85Var = ua6.a;
        return new ee1(ki2Var, null);
    }

    public static final ee1 r(ki2 ki2Var, ta6 ta6Var) {
        n85 n85Var = ua6.a;
        return new ee1(ki2Var, ta6Var);
    }

    public static final rd3 s(rd3 rd3Var) {
        rd3 rd3Var2;
        m74 m74Var;
        rd3 m = rd3Var.m();
        while (true) {
            rd3 rd3Var3 = m;
            rd3Var2 = rd3Var;
            rd3Var = rd3Var3;
            if (rd3Var == null) {
                break;
            }
            m = rd3Var.m();
        }
        if (rd3Var2 instanceof m74) {
            m74Var = (m74) rd3Var2;
        } else {
            m74Var = null;
        }
        if (m74Var == null) {
            return rd3Var2;
        }
        m74 m74Var2 = m74Var.n0;
        while (true) {
            m74 m74Var3 = m74Var2;
            m74 m74Var4 = m74Var;
            m74Var = m74Var3;
            if (m74Var != null) {
                m74Var2 = m74Var.n0;
            } else {
                return m74Var4;
            }
        }
    }

    public static final String t(long j) {
        String n;
        if (j <= -999500000) {
            n = wh1.n(new StringBuilder(), (j - 500000000) / 1000000000, " s ");
        } else if (j <= -999500) {
            n = wh1.n(new StringBuilder(), (j - 500000) / 1000000, " ms");
        } else if (j <= 0) {
            n = wh1.n(new StringBuilder(), (j - 500) / 1000, " µs");
        } else if (j < 999500) {
            n = wh1.n(new StringBuilder(), (j + 500) / 1000, " µs");
        } else if (j < 999500000) {
            n = wh1.n(new StringBuilder(), (j + 500000) / 1000000, " ms");
        } else {
            n = wh1.n(new StringBuilder(), (j + 500000000) / 1000000000, " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{n}, 1));
    }

    public static s2 u(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new s2(1, cr0.h(view));
        }
        return null;
    }

    public static final Rect v(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final float w(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    public static float x(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= RecyclerView.A1 && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final ax2 y() {
        ax2 ax2Var = b;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("AutoMirrored.Filled.OpenInNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(19.0f, 19.0f);
        vq2Var.k(5.0f);
        vq2Var.t(5.0f);
        vq2Var.l(7.0f);
        vq2Var.t(3.0f);
        vq2Var.k(5.0f);
        vq2Var.i(-1.11f, RecyclerView.A1, -2.0f, 0.9f, -2.0f, 2.0f);
        vq2Var.u(14.0f);
        vq2Var.i(RecyclerView.A1, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        vq2Var.l(14.0f);
        vq2Var.i(1.1f, RecyclerView.A1, 2.0f, -0.9f, 2.0f, -2.0f);
        vq2Var.u(-7.0f);
        vq2Var.l(-2.0f);
        vq2Var.u(7.0f);
        vq2Var.g();
        vq2Var.o(14.0f, 3.0f);
        vq2Var.u(2.0f);
        vq2Var.l(3.59f);
        vq2Var.n(-9.83f, 9.83f);
        vq2Var.n(1.41f, 1.41f);
        vq2Var.m(19.0f, 6.41f);
        vq2Var.t(10.0f);
        vq2Var.l(2.0f);
        vq2Var.t(3.0f);
        vq2Var.l(-7.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b2 = zw2Var.b();
        b = b2;
        return b2;
    }

    public static Intent z(xp xpVar) {
        Intent parentActivityIntent = xpVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String B = B(xpVar, xpVar.getComponentName());
            if (B == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(xpVar, B);
            try {
                if (B(xpVar, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + B + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
