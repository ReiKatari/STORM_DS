package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce6  reason: default package */
/* loaded from: classes.dex */
public final class ce6 {
    public final SharedPreferences a;

    public ce6(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("shader_compile_times", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    public final void a(String str, be6 be6Var, long j) {
        str.getClass();
        be6Var.getClass();
        if (!qs6.v0(str) && j > 0) {
            this.a.edit().putLong(lb1.m(be6Var.name(), "|", str), j).apply();
        }
    }
}
