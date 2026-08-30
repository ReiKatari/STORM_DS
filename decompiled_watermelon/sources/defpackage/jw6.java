package defpackage;

import android.content.Context;
import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jw6  reason: default package */
/* loaded from: classes.dex */
public final class jw6 {
    public final Context a;
    public final vy0 b;
    public final b20 c;
    public final t64 d;
    public final vy0 e;

    public jw6(Context context, nh7 nh7Var) {
        t64 t64Var;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        b20 b20Var = new b20(applicationContext, nh7Var, 0);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        b20 b20Var2 = new b20(applicationContext2, nh7Var, 1);
        if (Build.VERSION.SDK_INT < 28) {
            Context applicationContext3 = context.getApplicationContext();
            applicationContext3.getClass();
            String str = s64.a;
            t64Var = new t64(applicationContext3, nh7Var);
        } else {
            t64Var = null;
        }
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        b20 b20Var3 = new b20(applicationContext4, nh7Var, 2);
        this.a = context;
        this.b = b20Var;
        this.c = b20Var2;
        this.d = t64Var;
        this.e = b20Var3;
    }
}
