package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bs2  reason: default package */
/* loaded from: classes.dex */
public final class bs2 {
    public final Context a;
    public final yr2 b;
    public final SharedPreferences c;
    public final SharedPreferences d;
    public final on2 e;

    public bs2(Context context, yr2 yr2Var, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        zr2 zr2Var = zr2.d0;
        this.a = context;
        this.b = yr2Var;
        this.c = sharedPreferences;
        this.d = sharedPreferences2;
        this.e = zr2Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:10)(2:48|49))(2:50|(1:60)(2:52|(1:56)(2:57|(1:59))))|11|12|(5:17|18|(1:20)(1:42)|21|(6:23|(2:24|(2:26|(2:28|29))(2:38|39))|30|(1:32)|33|(2:35|36)(1:37))(2:40|41))(2:14|15)))|63|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
        r1.getClass();
        defpackage.yh2.o(r1);
        r4 = new defpackage.em5(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s41 s41Var) {
        as2 as2Var;
        int i;
        Object em5Var;
        PackageInfo packageInfo;
        Object obj;
        PackageManager.PackageInfoFlags of;
        Context context = this.a;
        if (s41Var instanceof as2) {
            as2Var = (as2) s41Var;
            int i2 = as2Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                as2Var.Y = i2 - Integer.MIN_VALUE;
                l61 l61Var = as2Var.B;
                Object obj2 = as2Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = as2Var.Y;
                on2 on2Var = this.e;
                SharedPreferences sharedPreferences = this.c;
                SharedPreferences sharedPreferences2 = this.d;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj2);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj2);
                    boolean z = sharedPreferences.getBoolean("github_check_for_updates", true);
                    long j = sharedPreferences2.getLong("github_updates_last_check", -1L);
                    long longValue = ((Number) on2Var.c()).longValue();
                    if (!z) {
                        return null;
                    }
                    if (j != -1 && longValue - j < 79200000) {
                        return null;
                    }
                    yr2 yr2Var = this.b;
                    as2Var.Y = 1;
                    obj2 = yr2Var.a(as2Var);
                    if (obj2 == x61Var) {
                        return x61Var;
                    }
                }
                em5Var = (List) obj2;
                if (em5Var instanceof em5) {
                    try {
                        oi2.Y(em5Var);
                        List list = (List) em5Var;
                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                        edit.putLong("github_updates_last_check", ((Number) on2Var.c()).longValue());
                        edit.apply();
                        PackageManager packageManager = context.getPackageManager();
                        packageManager.getClass();
                        String packageName = context.getPackageName();
                        packageName.getClass();
                        if (Build.VERSION.SDK_INT >= 33) {
                            of = PackageManager.PackageInfoFlags.of(0L);
                            packageInfo = packageManager.getPackageInfo(packageName, of);
                            packageInfo.getClass();
                        } else {
                            packageInfo = packageManager.getPackageInfo(packageName, 0);
                            packageInfo.getClass();
                        }
                        bm7 bm7Var = bm7.Z;
                        String str = packageInfo.versionName;
                        if (str != null) {
                            bm7 N = np2.N(str);
                            bm7 Z = np2.Z(sharedPreferences2.getString("github_updates_skip_version", null));
                            es2 es2Var = fs2.Companion;
                            String string = sharedPreferences.getString("github_update_channel", fs2.STABLE.getPreferenceValue());
                            es2Var.getClass();
                            Iterator<E> it = fs2.getEntries().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    if (nb3.k(((fs2) obj).getPreferenceValue(), string)) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            fs2 fs2Var = (fs2) obj;
                            if (fs2Var == null) {
                                fs2Var = fs2.STABLE;
                            }
                            cs2 a = ds2.a.a(list, N, fs2Var, Z);
                            if (a == null) {
                                return null;
                            }
                            jt jtVar = jt.PRODUCTION;
                            pv pvVar = a.b;
                            long j2 = pvVar.a;
                            Uri parse = Uri.parse(pvVar.b);
                            bm7 bm7Var2 = a.c;
                            ki5 ki5Var = a.a;
                            return new kt(jtVar, j2, parse, bm7Var2, ki5Var.c, a.b.d, a.d, ki5Var.a, ki5Var.f);
                        }
                        throw new IllegalArgumentException("Installed versionName is missing");
                    } catch (Throwable th) {
                        l61Var.getClass();
                        yh2.o(l61Var);
                        return new em5(th);
                    }
                }
                Throwable a2 = hm5.a(em5Var);
                a2.getClass();
                return new em5(a2);
            }
        }
        as2Var = new as2(this, s41Var);
        l61 l61Var2 = as2Var.B;
        Object obj22 = as2Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = as2Var.Y;
        on2 on2Var2 = this.e;
        SharedPreferences sharedPreferences3 = this.c;
        SharedPreferences sharedPreferences22 = this.d;
        if (i == 0) {
        }
        em5Var = (List) obj22;
        if (em5Var instanceof em5) {
        }
    }
}
