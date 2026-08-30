package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q26  reason: default package */
/* loaded from: classes.dex */
public final class q26 {
    public final SharedPreferences a;

    public q26(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("shader_compile_times", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    public final void a(String str, p26 p26Var, long j) {
        str.getClass();
        p26Var.getClass();
        if (!zg6.B0(str) && j > 0) {
            this.a.edit().putLong(wh1.l(p26Var.name(), "|", str), j).apply();
        }
    }
}
