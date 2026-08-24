package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.widget.Toast;
import androidx.core.graphics.drawable.IconCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qo2 */
/* loaded from: classes.dex */
public abstract class qo2 {
    public static final /* synthetic */ int a = 0;

    public static ac4 B(ap7 ap7Var) {
        m9 m9Var = bc4.a;
        h71 h71Var = h71.b;
        m9Var.getClass();
        h71Var.getClass();
        eb ebVar = new eb(ap7Var, m9Var, h71Var);
        ar0 a2 = gh5.a(ac4.class);
        String b = a2.b();
        if (b != null) {
            return (ac4) ebVar.G(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        i.h("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [rb6, java.lang.Object, r41] */
    public static rb6 C(eo2 eo2Var) {
        ?? obj = new Object();
        obj.R = np2.F(eo2Var, obj, obj);
        return obj;
    }

    public static BigDecimal D(String str) {
        n(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static PorterDuff.Mode E(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final List G(j36 j36Var) {
        int s = ej2.s(j36Var, "id");
        int s2 = ej2.s(j36Var, "seq");
        int s3 = ej2.s(j36Var, "from");
        int s4 = ej2.s(j36Var, "to");
        kw3 I = hf.I();
        while (j36Var.f0()) {
            I.add(new yj2(j36Var.R(s3), (int) j36Var.getLong(s), (int) j36Var.getLong(s2), j36Var.R(s4)));
        }
        return gt0.c1(hf.A(I));
    }

    public static final py6 H(e36 e36Var, String str, boolean z) {
        String str2;
        j36 i0 = e36Var.i0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int s = ej2.s(i0, "seqno");
            int s2 = ej2.s(i0, "cid");
            int s3 = ej2.s(i0, "name");
            int s4 = ej2.s(i0, "desc");
            if (s != -1 && s2 != -1 && s3 != -1 && s4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (i0.f0()) {
                    if (((int) i0.getLong(s2)) >= 0) {
                        int i = (int) i0.getLong(s);
                        String R = i0.R(s3);
                        if (i0.getLong(s4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(i), R);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List<Map.Entry> d1 = gt0.d1(linkedHashMap.entrySet(), new tp5(6));
                ArrayList arrayList = new ArrayList(ht0.v0(d1, 10));
                for (Map.Entry entry : d1) {
                    arrayList.add((String) entry.getValue());
                }
                List k1 = gt0.k1(arrayList);
                List<Map.Entry> d12 = gt0.d1(linkedHashMap2.entrySet(), new tp5(7));
                ArrayList arrayList2 = new ArrayList(ht0.v0(d12, 10));
                for (Map.Entry entry2 : d12) {
                    arrayList2.add((String) entry2.getValue());
                }
                py6 py6Var = new py6(str, z, k1, gt0.k1(arrayList2));
                lb4.p(i0, null);
                return py6Var;
            }
            lb4.p(i0, null);
            return null;
        } finally {
        }
    }

    public static final Object I(Object[] objArr, on2 on2Var, px0 px0Var, int i) {
        return K(Arrays.copyOf(objArr, objArr.length), jw2.A, on2Var, px0Var, ((i << 6) & 7168) | RendererDebugBridge.CAPTURE_HEIGHT, 0);
    }

    public static final Object J(Object[] objArr, j56 j56Var, on2 on2Var, px0 px0Var, int i) {
        return K(Arrays.copyOf(objArr, objArr.length), j56Var, on2Var, px0Var, 384 | ((i << 3) & 7168), 0);
    }

    public static final Object K(Object[] objArr, j56 j56Var, on2 on2Var, px0 px0Var, int i, int i2) {
        Object[] objArr2;
        j56 j56Var2;
        boolean z;
        Object obj;
        Object obj2;
        Object e;
        xq2 xq2Var = (xq2) px0Var;
        long j = xq2Var.T;
        g04.y(36);
        String l = Long.toString(j, 36);
        l.getClass();
        j56Var.getClass();
        q46 q46Var = (q46) xq2Var.j(s46.a);
        Object P = xq2Var.P();
        Object obj3 = null;
        vs0 vs0Var = ox0.a;
        if (P == vs0Var) {
            if (q46Var != null && (e = q46Var.e(l)) != null) {
                obj2 = j56Var.c(e);
            } else {
                obj2 = null;
            }
            if (obj2 == null) {
                obj2 = on2Var.c();
            }
            objArr2 = objArr;
            j56Var2 = j56Var;
            n46 n46Var = new n46(j56Var2, q46Var, l, obj2, objArr2);
            xq2Var.l0(n46Var);
            P = n46Var;
        } else {
            objArr2 = objArr;
            j56Var2 = j56Var;
        }
        n46 n46Var2 = (n46) P;
        if (Arrays.equals(objArr2, n46Var2.X)) {
            obj3 = n46Var2.R;
        }
        if (obj3 == null) {
            obj3 = on2Var.c();
        }
        boolean h = xq2Var.h(n46Var2);
        if ((((i & 112) ^ 48) > 32 && xq2Var.h(j56Var2)) || (i & 48) == 32) {
            z = true;
        } else {
            z = false;
        }
        boolean h2 = h | z | xq2Var.h(q46Var) | xq2Var.f(l) | xq2Var.h(obj3) | xq2Var.h(objArr2);
        Object P2 = xq2Var.P();
        if (!h2 && P2 != vs0Var) {
            obj = obj3;
        } else {
            Object[] objArr3 = objArr2;
            obj = obj3;
            cj5 cj5Var = new cj5(n46Var2, j56Var2, q46Var, l, obj, objArr3, 0);
            xq2Var.l0(cj5Var);
            P2 = cj5Var;
        }
        mb3.n((on2) P2, xq2Var);
        return obj;
    }

    public static final void L(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static TypedValue M(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean N(Context context, int i, boolean z) {
        TypedValue M = M(context, i);
        if (M != null && M.type == 18) {
            if (M.data != 0) {
                return true;
            }
            return false;
        }
        return z;
    }

    public static TypedValue O(Context context, int i, String str) {
        TypedValue M = M(context, i);
        if (M != null) {
            return M;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final String P(Context context, Boolean bool, boolean z) {
        int i;
        int i2;
        if (bool == null) {
            if (z) {
                i2 = R.string.retro_achievements_global_enabled;
            } else {
                i2 = R.string.retro_achievements_global_disabled;
            }
            String string = context.getString(i2);
            string.getClass();
            return string;
        } else if (bool.equals(Boolean.TRUE)) {
            if (z) {
                i = R.string.retro_achievements_enabled;
            } else {
                i = R.string.retro_achievements_enabled_global_disabled;
            }
            String string2 = context.getString(i);
            string2.getClass();
            return string2;
        } else if (bool.equals(Boolean.FALSE)) {
            String string3 = context.getString(R.string.retro_achievements_disabled);
            string3.getClass();
            return string3;
        } else {
            i.d();
            return null;
        }
    }

    public static final long Q(long j) {
        int round = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (round << 32);
    }

    public static final long R(long j, hn3 hn3Var) {
        if (hn3Var == hn3.Horizontal) {
            return s21.a(q21.j(j), q21.h(j), q21.i(j), q21.g(j));
        }
        return s21.a(q21.i(j), q21.g(j), q21.j(j), q21.h(j));
    }

    public static final long S(long j) {
        return (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final ze7 T(int i, String str) {
        mf7 U = U(i, str);
        if (U != null) {
            int i2 = U.A;
            if (Integer.compare(Integer.MIN_VALUE ^ i2, -2147483393) <= 0) {
                return new ze7((byte) i2);
            }
            return null;
        }
        return null;
    }

    public static final mf7 U(int i, String str) {
        int i2;
        g04.y(i);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            if (nb3.p(charAt, 48) < 0) {
                i2 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i2 = 0;
            }
            int i4 = 119304647;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    int i5 = i3 ^ Integer.MIN_VALUE;
                    if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                        if (i4 == 119304647) {
                            i4 = (int) (4294967295L / (i & 4294967295L));
                            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int i6 = i3 * i;
                    int i7 = digit + i6;
                    if (Integer.compare(i7 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                        return null;
                    }
                    i2++;
                    i3 = i7;
                } else {
                    return null;
                }
            }
            return new mf7(i3);
        }
        return null;
    }

    public static final rf7 V(String str) {
        str.getClass();
        int i = 10;
        g04.y(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            if (nb3.p(charAt, 48) < 0) {
                i2 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            }
            long j = 0;
            long j2 = 512409557603043100L;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    long j3 = j ^ Long.MIN_VALUE;
                    int i3 = length;
                    if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                        if (j2 == 512409557603043100L && Long.compare(j3, -7378697629483820647L) <= 0) {
                            j2 = 1844674407370955161L;
                        } else {
                            return null;
                        }
                    }
                    long j4 = j * 10;
                    long j5 = (digit & 4294967295L) + j4;
                    if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                        return null;
                    }
                    i2++;
                    j = j5;
                    length = i3;
                    i = 10;
                } else {
                    return null;
                }
            }
            return new rf7(j);
        }
        return null;
    }

    public static final void W(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i > 0 && i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            s53.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            z2 = true;
        }
        if (!z2) {
            s53.a("minLines " + i + " must be less than or equal to maxLines " + i2);
        }
    }

    public static final Object X(r41 r41Var, qn2 qn2Var, m16 m16Var) {
        n61 n61Var;
        zb6 zb6Var;
        w81 w81Var = new w81(qn2Var, null);
        b97 b97Var = (b97) r41Var.b().Z(b97.B);
        if (b97Var != null) {
            n61Var = b97Var.A;
        } else {
            n61Var = null;
        }
        if (n61Var != null) {
            return hv.d0(n61Var, w81Var, r41Var);
        }
        rj0 rj0Var = new rj0(1, np2.V(r41Var));
        rj0Var.v();
        try {
            zb6Var = m16Var.d;
        } catch (RejectedExecutionException e) {
            rj0Var.w(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (zb6Var != null) {
            zb6Var.execute(new h15(rj0Var, m16Var, w81Var, 3));
            Object s = rj0Var.s();
            x61 x61Var = x61.COROUTINE_SUSPENDED;
            return s;
        }
        nb3.a0("internalTransactionExecutor");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:298:0x01dc, code lost:
        if ((r8 != 1 ? r8 != 2 ? true : r41 : r38) != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x05b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(a74 a74Var, lq4 lq4Var, final pq5 pq5Var, final zt5 zt5Var, final qn2 qn2Var, on2 on2Var, px0 px0Var, int i) {
        xq2 xq2Var;
        boolean z;
        int i2;
        boolean z2;
        VideoRenderer videoRenderer;
        boolean z3;
        VideoRenderer videoRenderer2;
        VideoFiltering videoFiltering;
        String str;
        String str2;
        String str3;
        String string;
        String str4;
        String str5;
        String str6;
        String str7;
        Object P;
        boolean z4;
        Object P2;
        Object P3;
        boolean z5;
        Object P4;
        Object P5;
        boolean z6;
        Object P6;
        ConfigurationInfo deviceConfigurationInfo;
        qn2 qn2Var2 = qn2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1491308090);
        int i3 = i | (xq2Var2.f(a74Var) ? 4 : 2) | (xq2Var2.f(lq4Var) ? 32 : 16) | (xq2Var2.h(pq5Var) ? 256 : 128) | (xq2Var2.h(zt5Var) ? 2048 : 1024) | (xq2Var2.h(qn2Var2) ? 16384 : 8192) | (xq2Var2.h(on2Var) ? 131072 : 65536);
        if (xq2Var2.S(i3 & 1, (74899 & i3) != 74898)) {
            final Context context = (Context) xq2Var2.j(kf.b);
            j37 T = mp2.T(xq2Var2);
            final mi6 J = jx2.J(xq2Var2);
            final mi6 J2 = jx2.J(xq2Var2);
            mi6 J3 = jx2.J(xq2Var2);
            mi6 J4 = jx2.J(xq2Var2);
            final mi6 J5 = jx2.J(xq2Var2);
            final mi6 J6 = jx2.J(xq2Var2);
            final mi6 J7 = jx2.J(xq2Var2);
            final mi6 J8 = jx2.J(xq2Var2);
            mi6 J9 = jx2.J(xq2Var2);
            final j37 T2 = mp2.T(xq2Var2);
            final j37 T3 = mp2.T(xq2Var2);
            c9 c9Var = new c9(5);
            boolean z7 = (i3 & 458752) == 131072;
            Object P7 = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (z7 || P7 == vs0Var) {
                P7 = new mn0(5, on2Var);
                xq2Var2.l0(P7);
            }
            j04 K = l.K(c9Var, (qn2) P7, xq2Var2, 0);
            c9 c9Var2 = new c9(5);
            int i4 = i3 & 57344;
            boolean z8 = i4 == 16384;
            Object P8 = xq2Var2.P();
            if (z8 || P8 == vs0Var) {
                P8 = new y00(15, qn2Var2);
                xq2Var2.l0(P8);
            }
            j04 K2 = l.K(c9Var2, (qn2) P8, xq2Var2, 0);
            zj1 zj1Var = new zj1(sv4.READ, 1);
            boolean z9 = i4 == 16384;
            Object P9 = xq2Var2.P();
            if (z9 || P9 == vs0Var) {
                P9 = new y00(17, qn2Var2);
                xq2Var2.l0(P9);
            }
            j04 K3 = l.K(zj1Var, (qn2) P9, xq2Var2, 0);
            zj1 zj1Var2 = new zj1(sv4.READ_WRITE, 1);
            boolean z10 = i4 == 16384;
            Object P10 = xq2Var2.P();
            if (z10 || P10 == vs0Var) {
                P10 = new y00(18, qn2Var2);
                xq2Var2.l0(P10);
            }
            j04 K4 = l.K(zj1Var2, (qn2) P10, xq2Var2, 0);
            final String[] M = yh2.M(xq2Var2, R.array.game_runtime_console_type_options);
            String[] M2 = yh2.M(xq2Var2, R.array.game_runtime_mic_source_options);
            String[] M3 = yh2.M(xq2Var2, R.array.rom_input_mode_options);
            String[] M4 = yh2.M(xq2Var2, R.array.gba_slot_options);
            final String[] M5 = yh2.M(xq2Var2, R.array.video_renderer_options);
            final String[] M6 = yh2.M(xq2Var2, R.array.video_internal_resolution_options);
            final String[] M7 = yh2.M(xq2Var2, R.array.video_filtering_options);
            yh2.O(xq2Var2, R.string.use_global_preference);
            ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
            boolean z11 = ((activityManager == null || (deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo()) == null) ? 0 : deviceConfigurationInfo.reqGlEsVersion) >= 196610;
            if (z11) {
                z = z11;
                i2 = i4;
                if (xs6.Z(Build.HARDWARE, "qcom", true)) {
                    z2 = true;
                    VideoRenderer videoRenderer3 = zt5Var.l;
                    VideoRenderer videoRenderer4 = zt5Var.m;
                    videoRenderer = videoRenderer3;
                    if (videoRenderer == null) {
                        int i5 = yt5.a[videoRenderer.ordinal()];
                        z3 = z2;
                    } else {
                        z3 = z2;
                    }
                    videoRenderer = null;
                    videoRenderer2 = videoRenderer != null ? videoRenderer4 : videoRenderer;
                    VideoFiltering videoFiltering2 = zt5Var.r;
                    VideoFiltering videoFiltering3 = (videoFiltering2 == null && videoFiltering2.isSupportedByRenderer(videoRenderer2)) ? videoFiltering2 : null;
                    videoFiltering = zt5Var.s;
                    if (!videoFiltering.isSupportedByRenderer(videoRenderer2)) {
                        videoFiltering = null;
                    }
                    if (videoFiltering == null) {
                        videoFiltering = VideoFiltering.NONE;
                    }
                    VideoFiltering videoFiltering4 = videoFiltering;
                    VideoFiltering videoFiltering5 = videoFiltering3 != null ? videoFiltering4 : videoFiltering3;
                    String str8 = (String) fv.J0(zt5Var.b.ordinal() + 1, M);
                    String str9 = "";
                    String str10 = (str8 == null || (str8 = (String) fv.E0(M)) != null) ? str8 : "";
                    str = (String) fv.J0(zt5Var.d.ordinal() + 1, M2);
                    if (str == null || (str = (String) fv.E0(M2)) != null) {
                        str9 = str;
                    }
                    String string2 = context.getString(R.string.global_controller_mapping);
                    string2.getClass();
                    str2 = zt5Var.g;
                    if (str2 == null) {
                        str2 = context.getString(R.string.not_set);
                        str2.getClass();
                    }
                    String str11 = str2;
                    str3 = (String) fv.J0(videoRenderer4.ordinal(), M5);
                    if (str3 == null) {
                        str3 = videoRenderer4.name();
                    }
                    final String str12 = str3;
                    if (!zt5Var.o) {
                        string = context.getString(R.string.on);
                    } else {
                        string = context.getString(R.string.off);
                    }
                    final String str13 = string;
                    str13.getClass();
                    str4 = (String) fv.J0(gi2.r(zt5Var.q - 1, fv.G0(M6)), M6);
                    if (str4 == null) {
                        str4 = "1x";
                    }
                    final String str14 = str4;
                    str5 = (String) fv.J0(videoFiltering4.ordinal(), M7);
                    if (str5 == null) {
                        str5 = videoFiltering4.name();
                    }
                    final String str15 = str5;
                    str6 = zt5Var.u;
                    if (str6 == null) {
                        str6 = context.getString(R.string.not_set);
                        str6.getClass();
                    }
                    final String str16 = str6;
                    str7 = zt5Var.w;
                    if (str7 == null) {
                        str7 = context.getString(R.string.not_set);
                        str7.getClass();
                    }
                    final String str17 = str7;
                    kw3 I = hf.I();
                    I.add(null);
                    I.add(VideoRenderer.SOFTWARE);
                    if (z) {
                        I.add(VideoRenderer.OPENGL);
                    }
                    I.add(VideoRenderer.VULKAN);
                    if (z3) {
                        I.add(VideoRenderer.COMPUTE);
                    }
                    final kw3 A = hf.A(I);
                    List b0 = hf.b0(null);
                    t52 entries = VideoFiltering.getEntries();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : entries) {
                        String[] strArr = M2;
                        if (((VideoFiltering) obj).isSupportedByRenderer(videoRenderer2)) {
                            arrayList.add(obj);
                        }
                        M2 = strArr;
                    }
                    final String[] strArr2 = M2;
                    final ArrayList V0 = gt0.V0(b0, arrayList);
                    a74 W = nb3.W(a74Var, nb3.U(xq2Var2), true);
                    nq6 nq6Var = ky0.n;
                    a74 S = ge7.S(W, ge7.r(lq4Var, (kk3) xq2Var2.j(nq6Var)), RecyclerView.B1, ge7.q(lq4Var, (kk3) xq2Var2.j(nq6Var)), RecyclerView.B1, 10);
                    yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var2, 0);
                    int hashCode = Long.hashCode(xq2Var2.T);
                    xv4 l = xq2Var2.l();
                    a74 E = l.E(xq2Var2, S);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var2.f0();
                    final VideoRenderer videoRenderer5 = videoRenderer2;
                    if (!xq2Var2.S) {
                        xq2Var2.k(iy0Var);
                    } else {
                        xq2Var2.o0();
                    }
                    yh2.K(xq2Var2, ix0.f, a2);
                    yh2.K(xq2Var2, ix0.e, l);
                    yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var2, ix0.h);
                    yh2.K(xq2Var2, ix0.d, E);
                    lt5.b(yh2.O(xq2Var2, R.string.rom_details_configuration_tab), null, n16.I(2117585922, new dq3(zt5Var, pq5Var, T, qn2Var2, 4), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                    int i6 = i2;
                    final String str18 = str9;
                    final String str19 = str10;
                    lt5.b(yh2.O(xq2Var2, R.string.console_type), null, n16.I(584870393, new fo2() { // from class: ut5
                        @Override // defpackage.fo2
                        public final Object e(Object obj2, Object obj3, Object obj4) {
                            boolean z12;
                            String str20;
                            qn2 qn2Var3;
                            String str21;
                            px0 px0Var2 = (px0) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            ((zt0) obj2).getClass();
                            if ((intValue & 17) != 16) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            xq2 xq2Var3 = (xq2) px0Var2;
                            if (xq2Var3.S(intValue & 1, z12)) {
                                String O = yh2.O(xq2Var3, R.string.label_rom_config_console);
                                zt5 zt5Var2 = zt5.this;
                                u26 u26Var = zt5Var2.a;
                                u26 u26Var2 = u26.DEFAULT;
                                String str22 = str19;
                                String[] strArr3 = M;
                                Context context2 = context;
                                if (u26Var == u26Var2) {
                                    str20 = qo2.c(context2, str22);
                                } else {
                                    str20 = strArr3[u26Var.ordinal()];
                                }
                                String str23 = str20;
                                boolean z13 = !pq5Var.h;
                                mi6 mi6Var = J;
                                boolean f = xq2Var3.f(mi6Var) | xq2Var3.h(context2) | xq2Var3.f(str22) | xq2Var3.h(strArr3) | xq2Var3.h(zt5Var2);
                                qn2 qn2Var4 = qn2Var;
                                boolean f2 = f | xq2Var3.f(qn2Var4);
                                Object P11 = xq2Var3.P();
                                vs0 vs0Var2 = ox0.a;
                                if (!f2 && P11 != vs0Var2) {
                                    qn2Var3 = qn2Var4;
                                } else {
                                    tt5 tt5Var = new tt5(mi6Var, context2, zt5Var2, str22, strArr3, qn2Var4, 2);
                                    qn2Var3 = qn2Var4;
                                    xq2Var3.l0(tt5Var);
                                    P11 = tt5Var;
                                }
                                lt5.a(O, str23, z13, true, (on2) P11, xq2Var3, 3072, 0);
                                String O2 = yh2.O(xq2Var3, R.string.microphone_source);
                                a36 a36Var = zt5Var2.c;
                                a36 a36Var2 = a36.DEFAULT;
                                String str24 = str18;
                                String[] strArr4 = strArr2;
                                if (a36Var == a36Var2) {
                                    str21 = qo2.c(context2, str24);
                                } else {
                                    str21 = strArr4[a36Var.ordinal()];
                                }
                                mi6 mi6Var2 = J2;
                                boolean f3 = xq2Var3.f(mi6Var2) | xq2Var3.h(context2) | xq2Var3.f(str24) | xq2Var3.h(strArr4) | xq2Var3.h(zt5Var2) | xq2Var3.f(qn2Var3);
                                Object P12 = xq2Var3.P();
                                if (f3 || P12 == vs0Var2) {
                                    tt5 tt5Var2 = new tt5(mi6Var2, context2, zt5Var2, str24, strArr4, qn2Var3, 3);
                                    xq2Var3.l0(tt5Var2);
                                    P12 = tt5Var2;
                                }
                                lt5.a(O2, str21, false, true, (on2) P12, xq2Var3, 3072, 4);
                                String O3 = yh2.O(xq2Var3, R.string.label_rom_config_hg_engine_fix);
                                boolean z14 = zt5Var2.j;
                                boolean f4 = xq2Var3.f(qn2Var3);
                                Object P13 = xq2Var3.P();
                                if (f4 || P13 == vs0Var2) {
                                    P13 = new y00(20, qn2Var3);
                                    xq2Var3.l0(P13);
                                }
                                lt5.c(O3, z14, false, (qn2) P13, xq2Var3, 0);
                            } else {
                                xq2Var3.V();
                            }
                            return jg7.a;
                        }
                    }, xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                    String O = yh2.O(xq2Var2, R.string.label_rom_config_video);
                    final VideoRenderer videoRenderer6 = videoRenderer;
                    final VideoFiltering videoFiltering6 = videoFiltering3;
                    final VideoFiltering videoFiltering7 = videoFiltering5;
                    lt5.b(O, null, n16.I(-455421446, new fo2() { // from class: vt5
                        /* JADX WARN: Code restructure failed: missing block: B:48:0x0150, code lost:
                            if (r6 == null) goto L65;
                         */
                        @Override // defpackage.fo2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object e(Object obj2, Object obj3, Object obj4) {
                            boolean z12;
                            String c;
                            int ordinal;
                            final qn2 qn2Var3;
                            Context context2;
                            boolean z13;
                            boolean z14;
                            String c2;
                            boolean z15;
                            VideoRenderer videoRenderer7;
                            Context context3;
                            qn2 qn2Var4;
                            boolean z16;
                            int i7;
                            zt0 zt0Var = (zt0) obj2;
                            px0 px0Var2 = (px0) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            zt0Var.getClass();
                            if ((intValue & 6) == 0) {
                                if (((xq2) px0Var2).f(zt0Var)) {
                                    i7 = 4;
                                } else {
                                    i7 = 2;
                                }
                                intValue |= i7;
                            }
                            if ((intValue & 19) != 18) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            xq2 xq2Var3 = (xq2) px0Var2;
                            if (xq2Var3.S(intValue & 1, z12)) {
                                String O2 = yh2.O(xq2Var3, R.string.renderer);
                                final VideoRenderer videoRenderer8 = VideoRenderer.this;
                                final String str20 = str12;
                                final Context context4 = context;
                                final String[] strArr3 = M5;
                                if (videoRenderer8 == null || (c = strArr3[videoRenderer8.ordinal()]) == null) {
                                    c = qo2.c(context4, str20);
                                }
                                final mi6 mi6Var = J5;
                                boolean f = xq2Var3.f(mi6Var) | xq2Var3.h(context4);
                                final List list = A;
                                boolean h = f | xq2Var3.h(list) | xq2Var3.h(strArr3) | xq2Var3.f(str20);
                                int i8 = -1;
                                if (videoRenderer8 == null) {
                                    ordinal = -1;
                                } else {
                                    ordinal = videoRenderer8.ordinal();
                                }
                                boolean d = h | xq2Var3.d(ordinal);
                                qn2 qn2Var5 = qn2Var;
                                boolean f2 = d | xq2Var3.f(qn2Var5);
                                Object P11 = xq2Var3.P();
                                vs0 vs0Var2 = ox0.a;
                                if (!f2 && P11 != vs0Var2) {
                                    qn2Var3 = qn2Var5;
                                    context2 = context4;
                                } else {
                                    qn2Var3 = qn2Var5;
                                    on2 on2Var2 = new on2() { // from class: wt5
                                        @Override // defpackage.on2
                                        public final Object c() {
                                            Context context5 = context4;
                                            String string3 = context5.getString(R.string.renderer);
                                            string3.getClass();
                                            mi6.this.a(string3, list, new st5(str20, strArr3, context5, 5), videoRenderer8, new y00(22, qn2Var3));
                                            return jg7.a;
                                        }
                                    };
                                    context2 = context4;
                                    xq2Var3.l0(on2Var2);
                                    P11 = on2Var2;
                                }
                                lt5.a(O2, c, false, true, (on2) P11, xq2Var3, 3072, 4);
                                VideoRenderer videoRenderer9 = VideoRenderer.SOFTWARE;
                                final VideoRenderer videoRenderer10 = videoRenderer5;
                                final Context context5 = context2;
                                if (videoRenderer10 == videoRenderer9) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                zt5 zt5Var2 = zt5Var;
                                final qn2 qn2Var6 = qn2Var3;
                                int i9 = (intValue & 14) | 1572864;
                                g04.c(zt0Var, z13, null, null, null, null, n16.I(777356834, new u91(zt5Var2, str13, J6, context5, qn2Var6, 4), xq2Var3), xq2Var3, i9);
                                if (videoRenderer10 != VideoRenderer.OPENGL && videoRenderer10 != VideoRenderer.VULKAN) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                                g04.c(zt0Var, z14, null, null, null, null, n16.I(2096384011, new h10(zt5Var2, str14, J7, context5, M6, qn2Var6, 2), xq2Var3), xq2Var3, i9);
                                String O3 = yh2.O(xq2Var3, R.string.filter);
                                final VideoFiltering videoFiltering8 = videoFiltering6;
                                final String str21 = str15;
                                final String[] strArr4 = M7;
                                if (videoRenderer10 == videoRenderer9) {
                                    c2 = "Недоступно в Software (Выкл)";
                                } else {
                                    if (videoFiltering8 != null) {
                                        c2 = (String) fv.J0(videoFiltering8.ordinal(), strArr4);
                                        if (c2 == null) {
                                            c2 = videoFiltering8.name();
                                        }
                                    }
                                    c2 = qo2.c(context5, str21);
                                }
                                VideoRenderer videoRenderer11 = VideoRenderer.VULKAN;
                                VideoFiltering videoFiltering9 = videoFiltering7;
                                if (videoRenderer10 == videoRenderer11 && videoFiltering9 == VideoFiltering.RETROARCH) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                final mi6 mi6Var2 = J8;
                                final ArrayList arrayList2 = V0;
                                boolean d2 = xq2Var3.d(videoRenderer10.ordinal()) | xq2Var3.h(context5) | xq2Var3.f(mi6Var2) | xq2Var3.h(arrayList2) | xq2Var3.h(strArr4) | xq2Var3.f(str21);
                                if (videoFiltering8 != null) {
                                    i8 = videoFiltering8.ordinal();
                                }
                                boolean d3 = xq2Var3.d(i8) | d2 | xq2Var3.f(qn2Var6);
                                Object P12 = xq2Var3.P();
                                if (!d3 && P12 != vs0Var2) {
                                    videoRenderer7 = videoRenderer10;
                                    qn2Var4 = qn2Var6;
                                    context3 = context5;
                                } else {
                                    P12 = new on2() { // from class: xt5
                                        @Override // defpackage.on2
                                        public final Object c() {
                                            VideoRenderer videoRenderer12 = VideoRenderer.SOFTWARE;
                                            VideoRenderer videoRenderer13 = VideoRenderer.this;
                                            Context context6 = context5;
                                            if (videoRenderer13 == videoRenderer12) {
                                                Toast.makeText(context6, "Шейдерная фильтрация и AI-Upscale недоступны при программном (Software) рендеринге.", 0).show();
                                            } else {
                                                String string3 = context6.getString(R.string.filter);
                                                string3.getClass();
                                                mi6Var2.a(string3, arrayList2, new st5(str21, strArr4, context6, 3), videoFiltering8, new y00(16, qn2Var6));
                                            }
                                            return jg7.a;
                                        }
                                    };
                                    videoRenderer7 = videoRenderer10;
                                    context3 = context5;
                                    qn2Var4 = qn2Var6;
                                    xq2Var3.l0(P12);
                                }
                                lt5.a(O3, c2, false, z15, (on2) P12, xq2Var3, 0, 4);
                                if (videoRenderer7 == videoRenderer11 && videoFiltering9 == VideoFiltering.RETROARCH) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                g04.c(zt0Var, z16, null, null, null, null, n16.I(223170474, new ln3(zt5Var2, str16, T2, qn2Var4, context3, str17, T3), xq2Var3), xq2Var3, i9);
                            } else {
                                xq2Var3.V();
                            }
                            return jg7.a;
                        }
                    }, xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                    lt5.b(yh2.O(xq2Var2, R.string.label_rom_config_input_mode), null, n16.I(-1495713285, new xn3(zt5Var, string2, M3, J3, context, qn2Var, K, pq5Var), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                    lt5.b(yh2.O(xq2Var2, R.string.label_rom_config_retroachievements), null, n16.I(1758962172, new dq3(context, zt5Var, J9, qn2Var, 5), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                    lt5.b(yh2.O(xq2Var2, R.string.controller_layout), null, n16.I(718670333, new dq3(zt5Var, str11, context, K2, 6), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                    qn2Var2 = qn2Var;
                    lt5.b(yh2.O(xq2Var2, R.string.label_rom_config_gba_slot), null, n16.I(-321621506, new ln3(zt5Var, M4, J4, context, qn2Var, K3, K4), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
                    gi2.h(xq2Var2, dj6.e(x64.a, lq4Var.a() + 96.0f));
                    xq2Var2.p(true);
                    String O2 = yh2.O(xq2Var2, R.string.label_rom_config_custom_name);
                    P = xq2Var2.P();
                    if (P == vs0Var) {
                        P = new gn5(16);
                        xq2Var2.l0(P);
                    }
                    qn2 qn2Var3 = (qn2) P;
                    z4 = i6 != 16384;
                    P2 = xq2Var2.P();
                    if (!z4 || P2 == vs0Var) {
                        P2 = new j91(12, qn2Var2);
                        xq2Var2.l0(P2);
                    }
                    xq2Var = xq2Var2;
                    mp2.e(O2, T, qn2Var3, (on2) P2, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                    jx2.e(J, xq2Var, 0);
                    jx2.e(J2, xq2Var, 0);
                    jx2.e(J3, xq2Var, 0);
                    jx2.e(J4, xq2Var, 0);
                    jx2.e(J5, xq2Var, 0);
                    jx2.e(J6, xq2Var, 0);
                    jx2.e(J7, xq2Var, 0);
                    jx2.e(J8, xq2Var, 0);
                    jx2.e(J9, xq2Var, 0);
                    String O3 = yh2.O(xq2Var, R.string.video_retroarch_shader_preset_title);
                    P3 = xq2Var.P();
                    if (P3 == vs0Var) {
                        P3 = new gn5(17);
                        xq2Var.l0(P3);
                    }
                    qn2 qn2Var4 = (qn2) P3;
                    z5 = i6 != 16384;
                    P4 = xq2Var.P();
                    if (!z5 || P4 == vs0Var) {
                        P4 = new j91(13, qn2Var2);
                        xq2Var.l0(P4);
                    }
                    mp2.e(O3, T2, qn2Var4, (on2) P4, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                    String O4 = yh2.O(xq2Var, R.string.video_retroarch_shader_parameters_title);
                    P5 = xq2Var.P();
                    if (P5 == vs0Var) {
                        P5 = new gn5(18);
                        xq2Var.l0(P5);
                    }
                    qn2 qn2Var5 = (qn2) P5;
                    z6 = i6 != 16384;
                    P6 = xq2Var.P();
                    if (!z6 || P6 == vs0Var) {
                        P6 = new j91(14, qn2Var2);
                        xq2Var.l0(P6);
                    }
                    mp2.e(O4, T3, qn2Var5, (on2) P6, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                }
            } else {
                z = z11;
                i2 = i4;
            }
            z2 = false;
            VideoRenderer videoRenderer32 = zt5Var.l;
            VideoRenderer videoRenderer42 = zt5Var.m;
            videoRenderer = videoRenderer32;
            if (videoRenderer == null) {
            }
            videoRenderer = null;
            if (videoRenderer != null) {
            }
            VideoFiltering videoFiltering22 = zt5Var.r;
            if (videoFiltering22 == null) {
            }
            videoFiltering = zt5Var.s;
            if (!videoFiltering.isSupportedByRenderer(videoRenderer2)) {
            }
            if (videoFiltering == null) {
            }
            VideoFiltering videoFiltering42 = videoFiltering;
            if (videoFiltering3 != null) {
            }
            String str82 = (String) fv.J0(zt5Var.b.ordinal() + 1, M);
            String str92 = "";
            if (str82 == null) {
            }
            str = (String) fv.J0(zt5Var.d.ordinal() + 1, M2);
            if (str == null) {
            }
            str92 = str;
            String string22 = context.getString(R.string.global_controller_mapping);
            string22.getClass();
            str2 = zt5Var.g;
            if (str2 == null) {
            }
            String str112 = str2;
            str3 = (String) fv.J0(videoRenderer42.ordinal(), M5);
            if (str3 == null) {
            }
            final String str122 = str3;
            if (!zt5Var.o) {
            }
            final String str132 = string;
            str132.getClass();
            str4 = (String) fv.J0(gi2.r(zt5Var.q - 1, fv.G0(M6)), M6);
            if (str4 == null) {
            }
            final String str142 = str4;
            str5 = (String) fv.J0(videoFiltering42.ordinal(), M7);
            if (str5 == null) {
            }
            final String str152 = str5;
            str6 = zt5Var.u;
            if (str6 == null) {
            }
            final String str162 = str6;
            str7 = zt5Var.w;
            if (str7 == null) {
            }
            final String str172 = str7;
            kw3 I2 = hf.I();
            I2.add(null);
            I2.add(VideoRenderer.SOFTWARE);
            if (z) {
            }
            I2.add(VideoRenderer.VULKAN);
            if (z3) {
            }
            final kw3 A2 = hf.A(I2);
            List b02 = hf.b0(null);
            t52 entries2 = VideoFiltering.getEntries();
            ArrayList arrayList2 = new ArrayList();
            while (r8.hasNext()) {
            }
            final String[] strArr22 = M2;
            final ArrayList V02 = gt0.V0(b02, arrayList2);
            a74 W2 = nb3.W(a74Var, nb3.U(xq2Var2), true);
            nq6 nq6Var2 = ky0.n;
            a74 S2 = ge7.S(W2, ge7.r(lq4Var, (kk3) xq2Var2.j(nq6Var2)), RecyclerView.B1, ge7.q(lq4Var, (kk3) xq2Var2.j(nq6Var2)), RecyclerView.B1, 10);
            yt0 a22 = wt0.a(ju.c, d90.k0, xq2Var2, 0);
            int hashCode2 = Long.hashCode(xq2Var2.T);
            xv4 l2 = xq2Var2.l();
            a74 E2 = l.E(xq2Var2, S2);
            jx0.i.getClass();
            iy0 iy0Var2 = ix0.b;
            xq2Var2.f0();
            final VideoRenderer videoRenderer52 = videoRenderer2;
            if (!xq2Var2.S) {
            }
            yh2.K(xq2Var2, ix0.f, a22);
            yh2.K(xq2Var2, ix0.e, l2);
            yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode2));
            yh2.F(xq2Var2, ix0.h);
            yh2.K(xq2Var2, ix0.d, E2);
            lt5.b(yh2.O(xq2Var2, R.string.rom_details_configuration_tab), null, n16.I(2117585922, new dq3(zt5Var, pq5Var, T, qn2Var2, 4), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
            int i62 = i2;
            final String str182 = str92;
            final String str192 = str10;
            lt5.b(yh2.O(xq2Var2, R.string.console_type), null, n16.I(584870393, new fo2() { // from class: ut5
                @Override // defpackage.fo2
                public final Object e(Object obj2, Object obj3, Object obj4) {
                    boolean z12;
                    String str20;
                    qn2 qn2Var32;
                    String str21;
                    px0 px0Var2 = (px0) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    ((zt0) obj2).getClass();
                    if ((intValue & 17) != 16) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    xq2 xq2Var3 = (xq2) px0Var2;
                    if (xq2Var3.S(intValue & 1, z12)) {
                        String O5 = yh2.O(xq2Var3, R.string.label_rom_config_console);
                        zt5 zt5Var2 = zt5.this;
                        u26 u26Var = zt5Var2.a;
                        u26 u26Var2 = u26.DEFAULT;
                        String str22 = str192;
                        String[] strArr3 = M;
                        Context context2 = context;
                        if (u26Var == u26Var2) {
                            str20 = qo2.c(context2, str22);
                        } else {
                            str20 = strArr3[u26Var.ordinal()];
                        }
                        String str23 = str20;
                        boolean z13 = !pq5Var.h;
                        mi6 mi6Var = J;
                        boolean f = xq2Var3.f(mi6Var) | xq2Var3.h(context2) | xq2Var3.f(str22) | xq2Var3.h(strArr3) | xq2Var3.h(zt5Var2);
                        qn2 qn2Var42 = qn2Var;
                        boolean f2 = f | xq2Var3.f(qn2Var42);
                        Object P11 = xq2Var3.P();
                        vs0 vs0Var2 = ox0.a;
                        if (!f2 && P11 != vs0Var2) {
                            qn2Var32 = qn2Var42;
                        } else {
                            tt5 tt5Var = new tt5(mi6Var, context2, zt5Var2, str22, strArr3, qn2Var42, 2);
                            qn2Var32 = qn2Var42;
                            xq2Var3.l0(tt5Var);
                            P11 = tt5Var;
                        }
                        lt5.a(O5, str23, z13, true, (on2) P11, xq2Var3, 3072, 0);
                        String O22 = yh2.O(xq2Var3, R.string.microphone_source);
                        a36 a36Var = zt5Var2.c;
                        a36 a36Var2 = a36.DEFAULT;
                        String str24 = str182;
                        String[] strArr4 = strArr22;
                        if (a36Var == a36Var2) {
                            str21 = qo2.c(context2, str24);
                        } else {
                            str21 = strArr4[a36Var.ordinal()];
                        }
                        mi6 mi6Var2 = J2;
                        boolean f3 = xq2Var3.f(mi6Var2) | xq2Var3.h(context2) | xq2Var3.f(str24) | xq2Var3.h(strArr4) | xq2Var3.h(zt5Var2) | xq2Var3.f(qn2Var32);
                        Object P12 = xq2Var3.P();
                        if (f3 || P12 == vs0Var2) {
                            tt5 tt5Var2 = new tt5(mi6Var2, context2, zt5Var2, str24, strArr4, qn2Var32, 3);
                            xq2Var3.l0(tt5Var2);
                            P12 = tt5Var2;
                        }
                        lt5.a(O22, str21, false, true, (on2) P12, xq2Var3, 3072, 4);
                        String O32 = yh2.O(xq2Var3, R.string.label_rom_config_hg_engine_fix);
                        boolean z14 = zt5Var2.j;
                        boolean f4 = xq2Var3.f(qn2Var32);
                        Object P13 = xq2Var3.P();
                        if (f4 || P13 == vs0Var2) {
                            P13 = new y00(20, qn2Var32);
                            xq2Var3.l0(P13);
                        }
                        lt5.c(O32, z14, false, (qn2) P13, xq2Var3, 0);
                    } else {
                        xq2Var3.V();
                    }
                    return jg7.a;
                }
            }, xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
            String O5 = yh2.O(xq2Var2, R.string.label_rom_config_video);
            final VideoRenderer videoRenderer62 = videoRenderer;
            final VideoFiltering videoFiltering62 = videoFiltering3;
            final VideoFiltering videoFiltering72 = videoFiltering5;
            lt5.b(O5, null, n16.I(-455421446, new fo2() { // from class: vt5
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0150, code lost:
                    if (r6 == null) goto L65;
                 */
                @Override // defpackage.fo2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object e(Object obj2, Object obj3, Object obj4) {
                    boolean z12;
                    String c;
                    int ordinal;
                    final qn2 qn2Var32;
                    Context context2;
                    boolean z13;
                    boolean z14;
                    String c2;
                    boolean z15;
                    VideoRenderer videoRenderer7;
                    Context context3;
                    qn2 qn2Var42;
                    boolean z16;
                    int i7;
                    zt0 zt0Var = (zt0) obj2;
                    px0 px0Var2 = (px0) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    zt0Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (((xq2) px0Var2).f(zt0Var)) {
                            i7 = 4;
                        } else {
                            i7 = 2;
                        }
                        intValue |= i7;
                    }
                    if ((intValue & 19) != 18) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    xq2 xq2Var3 = (xq2) px0Var2;
                    if (xq2Var3.S(intValue & 1, z12)) {
                        String O22 = yh2.O(xq2Var3, R.string.renderer);
                        final VideoRenderer videoRenderer8 = VideoRenderer.this;
                        final String str20 = str122;
                        final Context context4 = context;
                        final String[] strArr3 = M5;
                        if (videoRenderer8 == null || (c = strArr3[videoRenderer8.ordinal()]) == null) {
                            c = qo2.c(context4, str20);
                        }
                        final mi6 mi6Var = J5;
                        boolean f = xq2Var3.f(mi6Var) | xq2Var3.h(context4);
                        final List list = A2;
                        boolean h = f | xq2Var3.h(list) | xq2Var3.h(strArr3) | xq2Var3.f(str20);
                        int i8 = -1;
                        if (videoRenderer8 == null) {
                            ordinal = -1;
                        } else {
                            ordinal = videoRenderer8.ordinal();
                        }
                        boolean d = h | xq2Var3.d(ordinal);
                        qn2 qn2Var52 = qn2Var;
                        boolean f2 = d | xq2Var3.f(qn2Var52);
                        Object P11 = xq2Var3.P();
                        vs0 vs0Var2 = ox0.a;
                        if (!f2 && P11 != vs0Var2) {
                            qn2Var32 = qn2Var52;
                            context2 = context4;
                        } else {
                            qn2Var32 = qn2Var52;
                            on2 on2Var2 = new on2() { // from class: wt5
                                @Override // defpackage.on2
                                public final Object c() {
                                    Context context5 = context4;
                                    String string3 = context5.getString(R.string.renderer);
                                    string3.getClass();
                                    mi6.this.a(string3, list, new st5(str20, strArr3, context5, 5), videoRenderer8, new y00(22, qn2Var32));
                                    return jg7.a;
                                }
                            };
                            context2 = context4;
                            xq2Var3.l0(on2Var2);
                            P11 = on2Var2;
                        }
                        lt5.a(O22, c, false, true, (on2) P11, xq2Var3, 3072, 4);
                        VideoRenderer videoRenderer9 = VideoRenderer.SOFTWARE;
                        final VideoRenderer videoRenderer10 = videoRenderer52;
                        final Context context5 = context2;
                        if (videoRenderer10 == videoRenderer9) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        zt5 zt5Var2 = zt5Var;
                        final qn2 qn2Var6 = qn2Var32;
                        int i9 = (intValue & 14) | 1572864;
                        g04.c(zt0Var, z13, null, null, null, null, n16.I(777356834, new u91(zt5Var2, str132, J6, context5, qn2Var6, 4), xq2Var3), xq2Var3, i9);
                        if (videoRenderer10 != VideoRenderer.OPENGL && videoRenderer10 != VideoRenderer.VULKAN) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        g04.c(zt0Var, z14, null, null, null, null, n16.I(2096384011, new h10(zt5Var2, str142, J7, context5, M6, qn2Var6, 2), xq2Var3), xq2Var3, i9);
                        String O32 = yh2.O(xq2Var3, R.string.filter);
                        final VideoFiltering videoFiltering8 = videoFiltering62;
                        final String str21 = str152;
                        final String[] strArr4 = M7;
                        if (videoRenderer10 == videoRenderer9) {
                            c2 = "Недоступно в Software (Выкл)";
                        } else {
                            if (videoFiltering8 != null) {
                                c2 = (String) fv.J0(videoFiltering8.ordinal(), strArr4);
                                if (c2 == null) {
                                    c2 = videoFiltering8.name();
                                }
                            }
                            c2 = qo2.c(context5, str21);
                        }
                        VideoRenderer videoRenderer11 = VideoRenderer.VULKAN;
                        VideoFiltering videoFiltering9 = videoFiltering72;
                        if (videoRenderer10 == videoRenderer11 && videoFiltering9 == VideoFiltering.RETROARCH) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        final mi6 mi6Var2 = J8;
                        final ArrayList arrayList22 = V02;
                        boolean d2 = xq2Var3.d(videoRenderer10.ordinal()) | xq2Var3.h(context5) | xq2Var3.f(mi6Var2) | xq2Var3.h(arrayList22) | xq2Var3.h(strArr4) | xq2Var3.f(str21);
                        if (videoFiltering8 != null) {
                            i8 = videoFiltering8.ordinal();
                        }
                        boolean d3 = xq2Var3.d(i8) | d2 | xq2Var3.f(qn2Var6);
                        Object P12 = xq2Var3.P();
                        if (!d3 && P12 != vs0Var2) {
                            videoRenderer7 = videoRenderer10;
                            qn2Var42 = qn2Var6;
                            context3 = context5;
                        } else {
                            P12 = new on2() { // from class: xt5
                                @Override // defpackage.on2
                                public final Object c() {
                                    VideoRenderer videoRenderer12 = VideoRenderer.SOFTWARE;
                                    VideoRenderer videoRenderer13 = VideoRenderer.this;
                                    Context context6 = context5;
                                    if (videoRenderer13 == videoRenderer12) {
                                        Toast.makeText(context6, "Шейдерная фильтрация и AI-Upscale недоступны при программном (Software) рендеринге.", 0).show();
                                    } else {
                                        String string3 = context6.getString(R.string.filter);
                                        string3.getClass();
                                        mi6Var2.a(string3, arrayList22, new st5(str21, strArr4, context6, 3), videoFiltering8, new y00(16, qn2Var6));
                                    }
                                    return jg7.a;
                                }
                            };
                            videoRenderer7 = videoRenderer10;
                            context3 = context5;
                            qn2Var42 = qn2Var6;
                            xq2Var3.l0(P12);
                        }
                        lt5.a(O32, c2, false, z15, (on2) P12, xq2Var3, 0, 4);
                        if (videoRenderer7 == videoRenderer11 && videoFiltering9 == VideoFiltering.RETROARCH) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        g04.c(zt0Var, z16, null, null, null, null, n16.I(223170474, new ln3(zt5Var2, str162, T2, qn2Var42, context3, str172, T3), xq2Var3), xq2Var3, i9);
                    } else {
                        xq2Var3.V();
                    }
                    return jg7.a;
                }
            }, xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
            lt5.b(yh2.O(xq2Var2, R.string.label_rom_config_input_mode), null, n16.I(-1495713285, new xn3(zt5Var, string22, M3, J3, context, qn2Var, K, pq5Var), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
            lt5.b(yh2.O(xq2Var2, R.string.label_rom_config_retroachievements), null, n16.I(1758962172, new dq3(context, zt5Var, J9, qn2Var, 5), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
            lt5.b(yh2.O(xq2Var2, R.string.controller_layout), null, n16.I(718670333, new dq3(zt5Var, str112, context, K2, 6), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
            qn2Var2 = qn2Var;
            lt5.b(yh2.O(xq2Var2, R.string.label_rom_config_gba_slot), null, n16.I(-321621506, new ln3(zt5Var, M4, J4, context, qn2Var, K3, K4), xq2Var2), xq2Var2, RendererDebugBridge.CAPTURE_HEIGHT);
            gi2.h(xq2Var2, dj6.e(x64.a, lq4Var.a() + 96.0f));
            xq2Var2.p(true);
            String O22 = yh2.O(xq2Var2, R.string.label_rom_config_custom_name);
            P = xq2Var2.P();
            if (P == vs0Var) {
            }
            qn2 qn2Var32 = (qn2) P;
            if (i62 != 16384) {
            }
            P2 = xq2Var2.P();
            if (!z4) {
            }
            P2 = new j91(12, qn2Var2);
            xq2Var2.l0(P2);
            xq2Var = xq2Var2;
            mp2.e(O22, T, qn2Var32, (on2) P2, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            jx2.e(J, xq2Var, 0);
            jx2.e(J2, xq2Var, 0);
            jx2.e(J3, xq2Var, 0);
            jx2.e(J4, xq2Var, 0);
            jx2.e(J5, xq2Var, 0);
            jx2.e(J6, xq2Var, 0);
            jx2.e(J7, xq2Var, 0);
            jx2.e(J8, xq2Var, 0);
            jx2.e(J9, xq2Var, 0);
            String O32 = yh2.O(xq2Var, R.string.video_retroarch_shader_preset_title);
            P3 = xq2Var.P();
            if (P3 == vs0Var) {
            }
            qn2 qn2Var42 = (qn2) P3;
            if (i62 != 16384) {
            }
            P4 = xq2Var.P();
            if (!z5) {
            }
            P4 = new j91(13, qn2Var2);
            xq2Var.l0(P4);
            mp2.e(O32, T2, qn2Var42, (on2) P4, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            String O42 = yh2.O(xq2Var, R.string.video_retroarch_shader_parameters_title);
            P5 = xq2Var.P();
            if (P5 == vs0Var) {
            }
            qn2 qn2Var52 = (qn2) P5;
            if (i62 != 16384) {
            }
            P6 = xq2Var.P();
            if (!z6) {
            }
            P6 = new j91(14, qn2Var2);
            xq2Var.l0(P6);
            mp2.e(O42, T3, qn2Var52, (on2) P6, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new c4(a74Var, lq4Var, pq5Var, zt5Var, qn2Var2, on2Var, i);
        }
    }

    public static final void b(zn5 zn5Var, zn5 zn5Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        long j;
        int i6;
        xq2 xq2Var;
        String str;
        nq6 nq6Var;
        int i7;
        g53 g53Var;
        int i8;
        String str2;
        fp f;
        int e;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(537291603);
        if (xq2Var2.f(zn5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (xq2Var2.f(zn5Var2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if ((i10 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i10 & 1, z)) {
            nq6 nq6Var2 = ye7.b;
            long j2 = ((xe7) xq2Var2.j(nq6Var2)).i.b.c;
            Resources resources = (Resources) xq2Var2.j(kf.c);
            g53 H = yh2.H("spinner-rotation", xq2Var2, 0);
            if ((i10 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = xq2Var2.P();
            if (!z2 && P != ox0.a) {
                str = "checkmark";
                nq6Var = nq6Var2;
                f = P;
                str2 = "spinner";
                j = j2;
                g53Var = H;
            } else {
                if (zn5Var2 != null) {
                    i4 = zn5Var2.a;
                } else {
                    i4 = 0;
                }
                if (zn5Var2 != null) {
                    i5 = zn5Var2.b;
                } else {
                    i5 = 0;
                }
                dp dpVar = new dp();
                j = j2;
                if (zn5Var != null) {
                    i6 = zn5Var.a;
                } else {
                    i6 = 0;
                }
                if (i6 > 0) {
                    g53Var = H;
                    hi2.v(j);
                    nq6Var = nq6Var2;
                    xq2Var = xq2Var2;
                    i7 = i5;
                    e = dpVar.e(new ds4(hi2.J(x47.c(j) * 1.5f, j & 1095216660480L), new g37(2, g90.a)));
                    try {
                        oi2.i(dpVar, "pending-achievement");
                        dpVar.b("\u2003");
                        String quantityString = resources.getQuantityString(R.plurals.retroachievements_pending_achievement_unlocks, i4, Integer.valueOf(i4));
                        quantityString.getClass();
                        dpVar.b(quantityString);
                        dpVar.b(" ");
                        if (i4 <= 0) {
                            str = "checkmark";
                            oi2.i(dpVar, str);
                        } else {
                            oi2.i(dpVar, "spinner");
                            str = "checkmark";
                        }
                    } finally {
                        dpVar.d(e);
                    }
                } else {
                    xq2Var = xq2Var2;
                    str = "checkmark";
                    nq6Var = nq6Var2;
                    i7 = i5;
                    g53Var = H;
                }
                if (zn5Var != null) {
                    i8 = zn5Var.b;
                } else {
                    i8 = 0;
                }
                if (i8 <= 0) {
                    str2 = "spinner";
                } else {
                    hi2.v(j);
                    str2 = "spinner";
                    e = dpVar.e(new ds4(hi2.J(x47.c(j) * 1.5f, j & 1095216660480L), new g37(2, g90.a)));
                    try {
                        oi2.i(dpVar, "pending-leaderboard");
                        dpVar.b("\u2003");
                        int i11 = i7;
                        String quantityString2 = resources.getQuantityString(R.plurals.retroachievements_pending_leaderboard_entries, i11, Integer.valueOf(i7));
                        quantityString2.getClass();
                        dpVar.b(quantityString2);
                        dpVar.b(" ");
                        if (i11 > 0) {
                            oi2.i(dpVar, str2);
                        } else {
                            oi2.i(dpVar, str);
                        }
                    } finally {
                        dpVar.d(e);
                    }
                }
                f = dpVar.f();
                xq2Var2 = xq2Var;
                xq2Var2.l0(f);
            }
            fp fpVar = (fp) f;
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var2, 0);
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
            yh2.K(xq2Var2, ix0.f, a2);
            yh2.K(xq2Var2, ix0.e, l);
            yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var2, ix0.h);
            yh2.K(xq2Var2, ix0.d, E);
            nq6 nq6Var3 = nq6Var;
            xq2 xq2Var3 = xq2Var2;
            long j3 = j;
            x37.b(yh2.O(xq2Var2, R.string.retroachievements_unsynchronized_data_info), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var2.j(nq6Var3)).i, xq2Var3, 0, 0, 65534);
            x37.c(fpVar, ge7.Q(x64Var, RecyclerView.B1, 8.0f, 1), 0L, 0L, null, 0L, 0L, 0, false, 0, 0, c14.m0(new vr4("pending-achievement", new w53(new hx4(j3, j3), lb4.d)), new vr4("pending-leaderboard", new w53(new hx4(j3, j3), lb4.e)), new vr4(str2, new w53(new hx4(j3, j3), n16.I(-1509985660, new ov4(g53Var, 0), xq2Var3))), new vr4(str, new w53(new hx4(((xe7) xq2Var3.j(nq6Var3)).i.a.b, ((xe7) xq2Var3.j(nq6Var3)).i.a.b), lb4.f))), null, ((xe7) xq2Var3.j(nq6Var3)).i, xq2Var3, 48, 0, 98300);
            dp dpVar2 = new dp();
            dpVar2.append(resources.getString(R.string.retroachievements_unsynchronized_data_connect_internet));
            dpVar2.append('\n');
            cp cpVar = new cp(new nn6(0L, 0L, oj2.e0, (ij2) null, (jj2) null, (li2) null, (String) null, 0L, (x20) null, (f37) null, (gy3) null, 0L, (b17) null, (ge6) null, 65531), dpVar2.A.length(), 0, 12);
            ArrayList arrayList = dpVar2.B;
            arrayList.add(cpVar);
            dpVar2.L.add(cpVar);
            int size = arrayList.size() - 1;
            try {
                String string = resources.getString(R.string.retroachievements_unsynchronized_data_loss_info);
                string.getClass();
                dpVar2.b(string);
                dpVar2.d(size);
                x37.c(dpVar2.f(), null, 0L, 0L, null, 0L, 0L, 0, false, 0, 0, null, null, ((xe7) xq2Var3.j(nq6Var3)).i, xq2Var3, 0, 0, 131070);
                xq2Var2 = xq2Var3;
                xq2Var2.p(true);
            } catch (Throwable th) {
                dpVar2.d(size);
                throw th;
            }
        } else {
            xq2Var2.V();
        }
        cf5 t = xq2Var2.t();
        if (t != null) {
            t.d = new ql1(zn5Var, i, 29, zn5Var2);
        }
    }

    public static final String c(Context context, String str) {
        String string = context.getString(R.string.use_global_preference_with_value, str);
        string.getClass();
        return string;
    }

    public static final void d(px0 px0Var, int i) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1829798492);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i & 1, z)) {
            yt0 a2 = wt0.a(new gu(8.0f, true, new i(1)), d90.k0, xq2Var, 6);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, x64.a);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a2);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            xq2Var.b0(1163639459);
            dp dpVar = new dp();
            dpVar.b(yh2.O(xq2Var, R.string.retroachievements_unsynchronized_data_synchronized));
            dpVar.b(" ");
            oi2.i(dpVar, "checkmark");
            fp f = dpVar.f();
            xq2Var.p(false);
            nq6 nq6Var = ye7.b;
            s47 s47Var = ((xe7) xq2Var.j(nq6Var)).i;
            oj2 oj2Var = oj2.e0;
            Map singletonMap = Collections.singletonMap("checkmark", new w53(new hx4(((xe7) xq2Var.j(nq6Var)).i.a.b, ((xe7) xq2Var.j(nq6Var)).i.a.b), lb4.g));
            singletonMap.getClass();
            x37.c(f, null, 0L, 0L, oj2Var, 0L, 0L, 0, false, 0, 0, singletonMap, null, s47Var, xq2Var, 196608, 0, 98270);
            x37.b(yh2.O(xq2Var, R.string.retroachievements_unsynchronized_data_exiting), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var.j(nq6Var)).i, xq2Var, 0, 0, 65534);
            xq2Var = xq2Var;
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ep3(i);
        }
    }

    public static final long e(int i) {
        long j = i << 32;
        int i2 = kg3.X;
        return j;
    }

    public static final void f(Object obj, int i, mq3 mq3Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        qn2 qn2Var;
        int i4;
        int i5;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(872548579);
        if ((i2 & 6) == 0) {
            if (xq2Var.h(obj)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.d(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(mq3Var)) {
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
            boolean f = xq2Var.f(obj) | xq2Var.f(mq3Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (f || P == vs0Var) {
                P = new lq3(obj, mq3Var);
                xq2Var.l0(P);
            }
            lq3 lq3Var = (lq3) P;
            lq3Var.c = i;
            vs4 vs4Var = lq3Var.g;
            py0 py0Var = zw4.a;
            lq3 lq3Var2 = (lq3) xq2Var.j(py0Var);
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            } else {
                qn2Var = null;
            }
            vl6 N = ln2.N(t);
            try {
                if (lq3Var2 != ((lq3) vs4Var.getValue())) {
                    vs4Var.setValue(lq3Var2);
                    if (lq3Var.d > 0) {
                        lq3 lq3Var3 = lq3Var.e;
                        if (lq3Var3 != null) {
                            lq3Var3.b();
                        }
                        if (lq3Var2 != null) {
                            lq3Var2.a();
                        } else {
                            lq3Var2 = null;
                        }
                        lq3Var.e = lq3Var2;
                    }
                }
                ln2.V(t, N, qn2Var);
                boolean f2 = xq2Var.f(lq3Var);
                Object P2 = xq2Var.P();
                if (f2 || P2 == vs0Var) {
                    P2 = new bg2(lq3Var, 6);
                    xq2Var.l0(P2);
                }
                mb3.d(lq3Var, (qn2) P2, xq2Var);
                hv.d(py0Var.a(lq3Var), zv0Var, xq2Var, ((i3 >> 6) & 112) | 8);
            } catch (Throwable th) {
                ln2.V(t, N, qn2Var);
                throw th;
            }
        } else {
            xq2Var.V();
        }
        cf5 t2 = xq2Var.t();
        if (t2 != null) {
            t2.d = new g4(obj, i, mq3Var, zv0Var, i2);
        }
    }

    public static final void g(a74 a74Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1625210322);
        if (xq2Var.f(a74Var)) {
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
            e34 d = h70.d(d90.L, false);
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
            yh2.K(xq2Var, ix0.f, d);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            e45.a(vs0.Y.n(x64.a, d90.Z), ((ut0) xq2Var.j(vt0.a)).i(), RecyclerView.B1, 0L, 0, xq2Var, 0, 28);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new v00(a74Var, i, 3);
        }
    }

    public static final void h(le2 le2Var, on2 on2Var, on2 on2Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        on2 on2Var3;
        xq2 xq2Var;
        boolean z2;
        eo2 u12Var;
        qa4 qa4Var;
        le2Var.getClass();
        on2Var.getClass();
        on2Var2.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-778426770);
        if (xq2Var2.h(le2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (xq2Var2.h(on2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (xq2Var2.h(on2Var2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        boolean z3 = false;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i7 & 1, z)) {
            qa4 l = nb3.l(le2Var, null, xq2Var2, (i7 & 14) | 48);
            if (((zn5) l.getValue()) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean g = xq2Var2.g(z2);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (g || P == vs0Var) {
                P = (zn5) l.getValue();
                xq2Var2.l0(P);
            }
            zn5 zn5Var = (zn5) P;
            Object P2 = xq2Var2.P();
            if (P2 == vs0Var) {
                P2 = np2.Y(Boolean.FALSE);
                xq2Var2.l0(P2);
            }
            qa4 qa4Var2 = (qa4) P2;
            zn5 zn5Var2 = (zn5) l.getValue();
            boolean f = xq2Var2.f(l);
            if ((i7 & 112) == 32) {
                z3 = true;
            }
            boolean z4 = f | z3;
            Object P3 = xq2Var2.P();
            if (!z4 && P3 != vs0Var) {
                on2Var3 = on2Var;
                u12Var = P3;
                qa4Var = qa4Var2;
            } else {
                qa4Var = qa4Var2;
                u12Var = new u12(on2Var, l, qa4Var, (r41) null, 20);
                on2Var3 = on2Var;
                xq2Var2.l0(u12Var);
            }
            mb3.i(xq2Var2, u12Var, zn5Var2);
            String O = yh2.O(xq2Var2, R.string.retroachievements_unsynchronized_data);
            Object P4 = xq2Var2.P();
            if (P4 == vs0Var) {
                P4 = new c5(17);
                xq2Var2.l0(P4);
            }
            xq2Var = xq2Var2;
            q60.a(O, (on2) P4, n16.I(-1186299645, new m4(zn5Var, qa4Var, l, 6), xq2Var2), n16.I(-913176187, new pn0(on2Var2, on2Var3, 2), xq2Var2), false, xq2Var, 3504, 16);
        } else {
            on2Var3 = on2Var;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x3(le2Var, on2Var3, on2Var2, i, 26);
        }
    }

    public static final void i(a74 a74Var, ra5 ra5Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        String str;
        int i4;
        a74 a74Var2 = a74Var;
        a74Var2.getClass();
        ra5Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(765706284);
        if (xq2Var.f(a74Var2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (xq2Var.h(ra5Var)) {
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
            URL a2 = ra5Var.a();
            if (a2 != null) {
                str = a2.toString();
            } else {
                str = null;
            }
            if (ra5Var instanceof qa5) {
                xq2Var.b0(584785047);
                String str2 = str;
                y16 y16Var = ls7.a;
                e33 F = q60.F();
                String O = yh2.O(xq2Var, R.string.ra_welcome_eyebrow);
                qa5 qa5Var = (qa5) ra5Var;
                String N = yh2.N(R.string.ra_welcome_title, new Object[]{qa5Var.b}, xq2Var);
                if (qa5Var.c) {
                    i4 = R.string.ra_welcome_hardcore;
                } else {
                    i4 = R.string.ra_welcome_softcore;
                }
                ls7.a(a74Var2, str2, y16Var, F, O, N, yh2.O(xq2Var, i4), 0, 0L, xq2Var, (i6 & 14) | RendererDebugBridge.CAPTURE_HEIGHT, RendererDebugBridge.CAPTURE_HEIGHT);
                xq2Var.p(false);
                a74Var2 = a74Var;
            } else {
                String str3 = str;
                if (ra5Var instanceof ma5) {
                    xq2Var.b0(585363941);
                    ma5 ma5Var = (ma5) ra5Var;
                    a74Var2 = a74Var;
                    ls7.a(a74Var2, str3, null, ej2.G(), yh2.O(xq2Var, R.string.ra_now_playing), yh2.O(xq2Var, R.string.achievements_loaded), yh2.N(R.string.ra_achievements_progress, new Object[]{Integer.valueOf(ma5Var.b), Integer.valueOf(ma5Var.c)}, xq2Var), 0, 0L, xq2Var, i6 & 14, 388);
                    xq2Var.p(false);
                } else if (ra5Var instanceof na5) {
                    xq2Var.b0(585939146);
                    a74Var2 = a74Var;
                    ls7.a(a74Var2, str3, null, ej2.G(), yh2.O(xq2Var, R.string.ra_now_playing), yh2.O(xq2Var, R.string.game_has_no_achievements), yh2.O(xq2Var, R.string.ra_no_achievements), 0, 0L, xq2Var, i6 & 14, 388);
                    xq2Var.p(false);
                } else if (ra5Var instanceof la5) {
                    xq2Var.b0(586375657);
                    a74Var2 = a74Var;
                    ls7.a(a74Var2, str3, null, ds7.b(), yh2.O(xq2Var, R.string.ra_welcome_eyebrow), yh2.O(xq2Var, R.string.achievements_failed_load), yh2.O(xq2Var, R.string.achievements_failed_load_tip), 2, fs7.a.j, xq2Var, (i6 & 14) | 113246208, 4);
                    xq2Var.p(false);
                } else if (ra5Var instanceof oa5) {
                    xq2Var.b0(586911461);
                    a74Var2 = a74Var;
                    ls7.a(a74Var2, str3, null, ds7.b(), yh2.O(xq2Var, R.string.ra_welcome_eyebrow), yh2.O(xq2Var, R.string.achievements_login_expired), yh2.O(xq2Var, R.string.achievements_login_expired_tip), 2, fs7.a.j, xq2Var, (i6 & 14) | 113246208, 4);
                    xq2Var.p(false);
                } else if (ra5Var instanceof pa5) {
                    xq2Var.b0(587461463);
                    a74Var2 = a74Var;
                    ls7.a(a74Var2, str3, null, ds7.b(), yh2.O(xq2Var, R.string.ra_welcome_eyebrow), yh2.O(xq2Var, R.string.offline_ra_disabled_no_cache_title), yh2.O(xq2Var, R.string.offline_ra_disabled_no_cache_message), 2, fs7.a.j, xq2Var, (i6 & 14) | 113246208, 4);
                    xq2Var.p(false);
                } else {
                    throw xg6.f(xq2Var, 1404338292, false);
                }
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new sa5(a74Var2, i, 0, ra5Var);
        }
    }

    public static final void j(a74 a74Var, lq4 lq4Var, pq5 pq5Var, cu5 cu5Var, qn2 qn2Var, on2 on2Var, eo2 eo2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        a74Var.getClass();
        lq4Var.getClass();
        pq5Var.getClass();
        cu5Var.getClass();
        qn2Var.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1562456105);
        if (xq2Var.f(a74Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (xq2Var.f(lq4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (xq2Var.h(pq5Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (xq2Var.f(cu5Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(on2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (xq2Var.h(eo2Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i15 & 1, z)) {
            hv.d(lt5.a.a(eo2Var), n16.I(-1152441111, new c4(cu5Var, a74Var, lq4Var, pq5Var, qn2Var, on2Var), xq2Var), xq2Var, 56);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fo0(a74Var, lq4Var, pq5Var, cu5Var, qn2Var, on2Var, eo2Var, i);
        }
    }

    public static final long k(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final String l(Object[] objArr, int i, int i2, d1 d1Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == d1Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void n(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        throw new NumberFormatException("Number string too large: " + substring + "...");
    }

    public static void o(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static final Object p(r41 r41Var, qn2 qn2Var, m16 m16Var) {
        if (m16Var.k() && m16Var.n() && m16Var.l()) {
            return qn2Var.g(r41Var);
        }
        if (r41Var.b().Z(wj0.L) == null) {
            return qn2Var.g(r41Var);
        }
        return X(r41Var, qn2Var, m16Var);
    }

    public static long q(long j, hn3 hn3Var) {
        int i;
        int g;
        int j2;
        int h;
        hn3 hn3Var2 = hn3.Horizontal;
        if (hn3Var == hn3Var2) {
            i = q21.j(j);
        } else {
            i = q21.i(j);
        }
        if (hn3Var == hn3Var2) {
            g = q21.h(j);
        } else {
            g = q21.g(j);
        }
        if (hn3Var == hn3Var2) {
            j2 = q21.i(j);
        } else {
            j2 = q21.j(j);
        }
        if (hn3Var == hn3Var2) {
            h = q21.g(j);
        } else {
            h = q21.h(j);
        }
        return s21.a(i, g, j2, h);
    }

    public static long r(int i, long j) {
        int i2;
        int h = q21.h(j);
        if ((i & 4) != 0) {
            i2 = q21.i(j);
        } else {
            i2 = 0;
        }
        return s21.a(0, h, i2, q21.g(j));
    }

    public static k54 s(ar0 ar0Var, String str) {
        k54 k54Var;
        HashMap hashMap = k54.c;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new k54(ar0Var, str);
                    hashMap.put(str, obj);
                }
                k54Var = (k54) obj;
                if (!k54Var.b.equals(ar0Var)) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k54Var;
    }

    public static Intent t(Context context, pa paVar) {
        Intent intent;
        Bitmap bitmap;
        Object obj;
        Resources resources;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder intents;
        ShortcutInfo build;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ShortcutManager e = is1.e(context.getSystemService(is1.f()));
            is1.g();
            shortLabel = is1.a((Context) paVar.B, (String) paVar.L).setShortLabel((CharSequence) paVar.X);
            intents = shortLabel.setIntents((Intent[]) paVar.R);
            IconCompat iconCompat = (IconCompat) paVar.Y;
            if (iconCompat != null) {
                intents.setIcon(iconCompat.f((Context) paVar.B));
            }
            if (!TextUtils.isEmpty(null)) {
                intents.setLongLabel(null);
            }
            if (!TextUtils.isEmpty(null)) {
                intents.setDisabledMessage(null);
            }
            intents.setRank(0);
            PersistableBundle persistableBundle = (PersistableBundle) paVar.Z;
            if (persistableBundle != null) {
                intents.setExtras(persistableBundle);
            }
            if (i >= 29) {
                intents.setLongLived(false);
            } else {
                if (((PersistableBundle) paVar.Z) == null) {
                    paVar.Z = new PersistableBundle();
                }
                ((PersistableBundle) paVar.Z).putBoolean("extraLongLived", false);
                intents.setExtras((PersistableBundle) paVar.Z);
            }
            if (i >= 33) {
                r2.l(intents);
            }
            build = intents.build();
            intent = e.createShortcutResultIntent(build);
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = new Intent();
        }
        Intent[] intentArr = (Intent[]) paVar.R;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", ((CharSequence) paVar.X).toString());
        IconCompat iconCompat2 = (IconCompat) paVar.Y;
        if (iconCompat2 != null) {
            Context context2 = (Context) paVar.B;
            if (iconCompat2.a == 2 && (obj = iconCompat2.b) != null) {
                String str = (String) obj;
                if (str.contains(":")) {
                    String str2 = str.split(":", -1)[1];
                    String str3 = str2.split("/", -1)[0];
                    String str4 = str2.split("/", -1)[1];
                    String str5 = str.split(":", -1)[0];
                    if ("0_resource_name_obfuscated".equals(str4)) {
                        Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                    } else {
                        String d = iconCompat2.d();
                        if ("android".equals(d)) {
                            resources = Resources.getSystem();
                        } else {
                            PackageManager packageManager = context2.getPackageManager();
                            try {
                                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(d, 8192);
                                if (applicationInfo != null) {
                                    resources = packageManager.getResourcesForApplication(applicationInfo);
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                Log.e("IconCompat", "Unable to find pkg=" + d + " for icon", e2);
                            }
                            resources = null;
                        }
                        int identifier = resources.getIdentifier(str4, str3, str5);
                        if (iconCompat2.e != identifier) {
                            Log.i("IconCompat", "Id has changed for " + d + " " + str);
                            iconCompat2.e = identifier;
                        }
                    }
                }
            }
            int i2 = iconCompat2.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 5) {
                        bitmap = IconCompat.a((Bitmap) iconCompat2.b, true);
                    } else {
                        i.h("Icon type not supported for intent shortcuts");
                        return null;
                    }
                } else {
                    try {
                        intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(context2.createPackageContext(iconCompat2.d(), 0), iconCompat2.e));
                    } catch (PackageManager.NameNotFoundException e3) {
                        throw new IllegalArgumentException("Can't find package " + iconCompat2.b, e3);
                    }
                }
            } else {
                bitmap = (Bitmap) iconCompat2.b;
            }
            intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
        }
        return intent;
    }

    public static String u(ea0 ea0Var) {
        StringBuilder sb = new StringBuilder(ea0Var.size());
        for (int i = 0; i < ea0Var.size(); i++) {
            byte a2 = ea0Var.a(i);
            if (a2 != 34) {
                if (a2 != 39) {
                    if (a2 != 92) {
                        switch (a2) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (a2 >= 32 && a2 <= 126) {
                                    sb.append((char) a2);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((a2 >>> 6) & 3) + 48));
                                    sb.append((char) (((a2 >>> 3) & 7) + 48));
                                    sb.append((char) ((a2 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final Object v(jz4 jz4Var, String str, s41 s41Var) {
        Object b = jz4Var.b(str, new h37(6), s41Var);
        if (b == x61.COROUTINE_SUSPENDED) {
            return b;
        }
        return jg7.a;
    }

    public static final int w(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int x(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static /* synthetic */ le2 y(ro2 ro2Var, l61 l61Var, int i, m80 m80Var, int i2) {
        if ((i2 & 1) != 0) {
            l61Var = vt1.A;
        }
        if ((i2 & 2) != 0) {
            i = -3;
        }
        if ((i2 & 4) != 0) {
            m80Var = m80.SUSPEND;
        }
        return ro2Var.c(l61Var, i, m80Var);
    }

    public static final String z(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public abstract Object A(ar0 ar0Var);

    public abstract qo2 F(ar0 ar0Var, Object obj);

    public abstract void m();
}
