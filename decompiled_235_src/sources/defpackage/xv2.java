package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv2  reason: default package */
/* loaded from: classes.dex */
public final class xv2 {
    public final SharedPreferences a;

    public xv2(Context context) {
        this.a = context.getSharedPreferences("hardcore_offline_loss_tracker", 0);
    }

    public final void a() {
        this.a.edit().remove("user_id").remove("content_id").remove("game_title").remove("achievement_count").remove("leaderboard_count").commit();
    }

    public final void b(String str, String str2) {
        str.getClass();
        str2.getClass();
        wv2 d = d();
        if (d != null && d.a.equals(str) && d.b.equals(str2)) {
            a();
        }
    }

    public final void c(int i, int i2, String str, String str2, String str3) {
        str3.getClass();
        if (i >= 0) {
            if (i2 >= 0) {
                if (i + i2 == 0) {
                    b(str, str2);
                    return;
                } else {
                    this.a.edit().putString("user_id", str).putString("content_id", str2).putString("game_title", str3).putInt("achievement_count", i).putInt("leaderboard_count", i2).commit();
                    return;
                }
            }
            i.h("Failed requirement.");
            return;
        }
        i.h("Failed requirement.");
    }

    public final wv2 d() {
        String string;
        String str;
        vr4 vr4Var;
        SharedPreferences sharedPreferences = this.a;
        String string2 = sharedPreferences.getString("user_id", null);
        if (string2 == null || (string = sharedPreferences.getString("content_id", null)) == null) {
            return null;
        }
        String string3 = sharedPreferences.getString("game_title", null);
        if (string3 == null) {
            string3 = "";
        }
        if (qs6.v0(string3)) {
            str = string;
        } else {
            str = string3;
        }
        boolean contains = sharedPreferences.contains("achievement_count");
        int i = 0;
        int i2 = sharedPreferences.getInt("achievement_count", 0);
        boolean contains2 = sharedPreferences.contains("leaderboard_count");
        int i3 = sharedPreferences.getInt("leaderboard_count", 0);
        if (!contains && !contains2) {
            vr4Var = new vr4(1, 0);
        } else {
            if (i2 < 0) {
                i2 = 0;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i3 >= 0) {
                i = i3;
            }
            vr4Var = new vr4(valueOf, Integer.valueOf(i));
        }
        return new wv2(((Number) vr4Var.A).intValue(), ((Number) vr4Var.B).intValue(), string2, string, str);
    }
}
