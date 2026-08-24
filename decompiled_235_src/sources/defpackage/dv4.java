package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dv4 implements qn2 {
    public final /* synthetic */ int A;

    public /* synthetic */ dv4(uh1 uh1Var) {
        this.A = 3;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        j36 i0;
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                av4 av4Var = (av4) obj;
                av4Var.getClass();
                return Long.valueOf(av4Var.a.d());
            case 1:
                av4 av4Var2 = (av4) obj;
                av4Var2.getClass();
                return Long.valueOf(av4Var2.a.f());
            case 2:
                av4 av4Var3 = (av4) obj;
                av4Var3.getClass();
                return av4Var3.a.c();
            case 3:
                lj2 lj2Var = (lj2) obj;
                return "'" + lj2Var.a() + "' " + lj2Var.b();
            case 4:
                Void r0 = (Void) obj;
                return f35.b;
            case 5:
                Context context = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList = new ArrayList(queryIntentActivities.size());
                int size = queryIntentActivities.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i2);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null && context.checkSelfPermission(str) != 0) {
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
                return arrayList;
            case 6:
                bi3 bi3Var = (bi3) obj;
                bi3Var.a = 1332;
                bi3Var.a(Float.valueOf((float) RecyclerView.B1), 0).b = e45.e;
                bi3Var.a(Float.valueOf(290.0f), 666);
                return jg7Var;
            case 7:
                gb6 gb6Var = (gb6) obj;
                v71 v71Var = e45.a;
                return jg7Var;
            case 8:
                bi3 bi3Var2 = (bi3) obj;
                bi3Var2.a = 1332;
                bi3Var2.a(Float.valueOf((float) RecyclerView.B1), 666).b = e45.e;
                bi3Var2.a(Float.valueOf(290.0f), bi3Var2.a);
                return jg7Var;
            case 9:
                bi3 bi3Var3 = (bi3) obj;
                bi3Var3.a = 1800;
                bi3Var3.a(Float.valueOf((float) RecyclerView.B1), 0).b = e45.a;
                bi3Var3.a(Float.valueOf(1.0f), 750);
                return jg7Var;
            case 10:
                bi3 bi3Var4 = (bi3) obj;
                bi3Var4.a = 1800;
                bi3Var4.a(Float.valueOf((float) RecyclerView.B1), 333).b = e45.b;
                bi3Var4.a(Float.valueOf(1.0f), 1183);
                return jg7Var;
            case 11:
                bi3 bi3Var5 = (bi3) obj;
                bi3Var5.a = 1800;
                bi3Var5.a(Float.valueOf((float) RecyclerView.B1), 1000).b = e45.c;
                bi3Var5.a(Float.valueOf(1.0f), 1567);
                return jg7Var;
            case 12:
                bi3 bi3Var6 = (bi3) obj;
                bi3Var6.a = 1800;
                bi3Var6.a(Float.valueOf((float) RecyclerView.B1), 1267).b = e45.d;
                bi3Var6.a(Float.valueOf(1.0f), 1800);
                return jg7Var;
            case 13:
                x35 x35Var = x35.d;
                fg3[] fg3VarArr = eb6.a;
                fb6 fb6Var = bb6.c;
                fg3 fg3Var = eb6.a[1];
                ((gb6) obj).a(fb6Var, x35Var);
                return jg7Var;
            case 14:
                ((List) obj).getClass();
                return jg7Var;
            case 15:
                gb6 gb6Var2 = (gb6) obj;
                y16 y16Var = k65.a;
                return jg7Var;
            case 16:
                um3 um3Var = (um3) obj;
                bt btVar = um3Var.A.B;
                long L = btVar.L();
                btVar.G().h();
                try {
                    ((os0) btVar.B).Q(-3.4028235E38f, RecyclerView.B1, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    um3Var.b();
                    return jg7Var;
                } finally {
                    xg6.v(btVar, L);
                }
            case 17:
                String str2 = (String) obj;
                if (str2 != null && xs6.g0(str2, "User already has", false)) {
                    return jg7Var;
                }
                if (str2 == null) {
                    str2 = "Unknown reason";
                }
                throw new Exception(str2);
            case 18:
                b63 b63Var = (b63) obj;
                o41 o41Var = ReleaseStateCommandReceiver.a;
                b63Var.getClass();
                return b63Var.name();
            case 19:
                b63 b63Var2 = (b63) obj;
                o41 o41Var2 = ReleaseStateCommandReceiver.a;
                b63Var2.getClass();
                return b63Var2.name();
            case 20:
                vj5 vj5Var = (vj5) obj;
                vj5Var.getClass();
                String name = vj5Var.name();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = name.toLowerCase(locale);
                lowerCase.getClass();
                return lowerCase;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                vj5 vj5Var2 = (vj5) obj;
                vj5Var2.getClass();
                String name2 = vj5Var2.name();
                Locale locale2 = Locale.US;
                locale2.getClass();
                String lowerCase2 = name2.toLowerCase(locale2);
                lowerCase2.getClass();
                return lowerCase2;
            case 22:
                vr4 vr4Var = (vr4) obj;
                vr4Var.getClass();
                return vr4Var.A + ":" + vr4Var.B;
            case ConnectionResult.API_DISABLED /* 23 */:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                i0 = e36Var.i0("SELECT * FROM ra_pending_achievement_award");
                try {
                    int B = ej2.B(i0, "achievement_id");
                    int B2 = ej2.B(i0, "game_id");
                    int B3 = ej2.B(i0, "for_hardcore_mode");
                    int B4 = ej2.B(i0, "created_at_epoch_ms");
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.f0()) {
                        long j = i0.getLong(B);
                        long j2 = i0.getLong(B2);
                        if (((int) i0.getLong(B3)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList2.add(new ab5(j, j2, z, i0.getLong(B4)));
                    }
                    return arrayList2;
                } finally {
                }
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                i0 = e36Var2.i0("SELECT game_hash FROM ra_game_hash_library");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (i0.f0()) {
                        arrayList3.add(i0.R(0));
                    }
                    return arrayList3;
                } finally {
                }
            case 25:
                e36 e36Var3 = (e36) obj;
                e36Var3.getClass();
                try {
                    e36Var3.i0("DELETE FROM ra_user_achievement").f0();
                    return jg7Var;
                } finally {
                }
            case SubAllocator.N4 /* 26 */:
                e36 e36Var4 = (e36) obj;
                e36Var4.getClass();
                try {
                    e36Var4.i0("UPDATE ra_game_set_metadata SET last_user_data_updated = NULL, last_hardcore_user_data_updated = NULL").f0();
                    return jg7Var;
                } finally {
                }
            case 27:
                e36 e36Var5 = (e36) obj;
                e36Var5.getClass();
                try {
                    e36Var5.i0("DELETE FROM ra_pending_achievement_award").f0();
                    return jg7Var;
                } finally {
                }
            case 28:
                e36 e36Var6 = (e36) obj;
                e36Var6.getClass();
                i0 = e36Var6.i0("\n        SELECT gh.game_hash AS hash, g.icon AS iconUrl\n        FROM ra_game_hash_library gh\n        INNER JOIN ra_game g ON g.game_id = gh.game_id\n    ");
                try {
                    ArrayList arrayList4 = new ArrayList();
                    while (i0.f0()) {
                        arrayList4.add(new nw2(i0.R(0), i0.R(1)));
                    }
                    return arrayList4;
                } finally {
                }
            default:
                e36 e36Var7 = (e36) obj;
                e36Var7.getClass();
                try {
                    e36Var7.i0("DELETE FROM ra_game_hash_library").f0();
                    return jg7Var;
                } finally {
                }
        }
    }

    public /* synthetic */ dv4(int i) {
        this.A = i;
    }
}
