package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ru4  reason: default package */
/* loaded from: classes.dex */
public abstract class ru4 {
    public static final pb5 a = new Object();
    public static final Object b = new Object();
    public static so1 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return p2.b(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static so1 b() {
        so1 so1Var = new so1(18);
        c = so1Var;
        a.j(so1Var);
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c5, code lost:
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ru4.c(android.content.Context, boolean):void");
    }
}
