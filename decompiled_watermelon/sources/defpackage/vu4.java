package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vu4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vu4 implements mi2 {
    public final /* synthetic */ int A;

    public /* synthetic */ vu4(int i) {
        this.A = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        ns5 i0;
        boolean z;
        String str;
        String str2;
        int i = this.A;
        boolean z2 = false;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                jb3 jb3Var = (jb3) obj;
                jb3Var.a = 1800;
                jb3Var.a(Float.valueOf((float) RecyclerView.A1), 1267).b = yu4.d;
                jb3Var.a(Float.valueOf(1.0f), 1800);
                return o27Var;
            case 1:
                su4 su4Var = su4.c;
                l93[] l93VarArr = pz5.a;
                qz5 qz5Var = mz5.c;
                l93 l93Var = pz5.a[1];
                ((rz5) obj).b(qz5Var, su4Var);
                return o27Var;
            case 2:
                ((List) obj).getClass();
                return o27Var;
            case 3:
                rz5 rz5Var = (rz5) obj;
                fr5 fr5Var = bx4.a;
                return o27Var;
            case 4:
                xf3 xf3Var = (xf3) obj;
                os osVar = xf3Var.A.B;
                long E = osVar.E();
                osVar.s().m();
                try {
                    ((bq0) osVar.B).P(-3.4028235E38f, RecyclerView.A1, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    xf3Var.a();
                    return o27Var;
                } finally {
                    wh1.u(osVar, E);
                }
            case 5:
                String str3 = (String) obj;
                if (str3 != null && gh6.n0(str3, "User already has", false)) {
                    return o27Var;
                }
                if (str3 == null) {
                    str3 = "Unknown reason";
                }
                throw new Exception(str3);
            case ig7.b /* 6 */:
                yz2 yz2Var = (yz2) obj;
                g11 g11Var = ReleaseStateCommandReceiver.a;
                yz2Var.getClass();
                return yz2Var.name();
            case 7:
                yz2 yz2Var2 = (yz2) obj;
                g11 g11Var2 = ReleaseStateCommandReceiver.a;
                yz2Var2.getClass();
                return yz2Var2.name();
            case 8:
                da5 da5Var = (da5) obj;
                da5Var.getClass();
                String name = da5Var.name();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = name.toLowerCase(locale);
                lowerCase.getClass();
                return lowerCase;
            case 9:
                da5 da5Var2 = (da5) obj;
                da5Var2.getClass();
                String name2 = da5Var2.name();
                Locale locale2 = Locale.US;
                locale2.getClass();
                String lowerCase2 = name2.toLowerCase(locale2);
                lowerCase2.getClass();
                return lowerCase2;
            case 10:
                ti4 ti4Var = (ti4) obj;
                ti4Var.getClass();
                return ti4Var.A + ":" + ti4Var.B;
            case 11:
                ls5 ls5Var = (ls5) obj;
                ls5Var.getClass();
                i0 = ls5Var.i0("SELECT * FROM ra_pending_achievement_award");
                try {
                    int r = hi2.r(i0, "achievement_id");
                    int r2 = hi2.r(i0, "game_id");
                    int r3 = hi2.r(i0, "for_hardcore_mode");
                    int r4 = hi2.r(i0, "created_at_epoch_ms");
                    ArrayList arrayList = new ArrayList();
                    while (i0.a0()) {
                        long j = i0.getLong(r);
                        long j2 = i0.getLong(r2);
                        if (((int) i0.getLong(r3)) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        arrayList.add(new q15(j, j2, z, i0.getLong(r4)));
                    }
                    return arrayList;
                } finally {
                }
            case mj2.L /* 12 */:
                ls5 ls5Var2 = (ls5) obj;
                ls5Var2.getClass();
                i0 = ls5Var2.i0("SELECT game_hash FROM ra_game_hash_library");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.a0()) {
                        arrayList2.add(i0.q(0));
                    }
                    return arrayList2;
                } finally {
                }
            case 13:
                ls5 ls5Var3 = (ls5) obj;
                ls5Var3.getClass();
                try {
                    ls5Var3.i0("DELETE FROM ra_user_achievement").a0();
                    return o27Var;
                } finally {
                }
            case 14:
                ls5 ls5Var4 = (ls5) obj;
                ls5Var4.getClass();
                try {
                    ls5Var4.i0("UPDATE ra_game_set_metadata SET last_user_data_updated = NULL, last_hardcore_user_data_updated = NULL").a0();
                    return o27Var;
                } finally {
                }
            case ig7.e /* 15 */:
                ls5 ls5Var5 = (ls5) obj;
                ls5Var5.getClass();
                try {
                    ls5Var5.i0("DELETE FROM ra_pending_achievement_award").a0();
                    return o27Var;
                } finally {
                }
            case 16:
                ls5 ls5Var6 = (ls5) obj;
                ls5Var6.getClass();
                i0 = ls5Var6.i0("\n        SELECT gh.game_hash AS hash, g.icon AS iconUrl\n        FROM ra_game_hash_library gh\n        INNER JOIN ra_game g ON g.game_id = gh.game_id\n    ");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (i0.a0()) {
                        arrayList3.add(new mq2(i0.q(0), i0.q(1)));
                    }
                    return arrayList3;
                } finally {
                }
            case 17:
                ls5 ls5Var7 = (ls5) obj;
                ls5Var7.getClass();
                try {
                    ls5Var7.i0("DELETE FROM ra_game_hash_library").a0();
                    return o27Var;
                } finally {
                }
            case 18:
                return zg6.Z0((String) obj).toString();
            case 19:
                if (((String) obj).length() > 0) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 20:
                File file = (File) obj;
                file.getClass();
                return Boolean.valueOf(file.isFile());
            case 21:
                ku3 ku3Var = (ku3) obj;
                ku3Var.getClass();
                String str4 = (String) tq0.N0(1, ku3Var.a());
                if (str4 == null) {
                    return null;
                }
                return zg6.Z0(str4).toString();
            case 22:
                ((String) obj).getClass();
                return Boolean.valueOf(!zg6.B0(str));
            case 23:
                ku3 ku3Var2 = (ku3) obj;
                ku3Var2.getClass();
                String str5 = (String) tq0.N0(1, ku3Var2.a());
                if (str5 == null) {
                    return null;
                }
                return zg6.Z0(str5).toString();
            case 24:
                ((String) obj).getClass();
                return Boolean.valueOf(!zg6.B0(str2));
            case 25:
                ((o27) obj).getClass();
                return Boolean.TRUE;
            case 26:
                oc2 oc2Var = (oc2) obj;
                oc2Var.getClass();
                oc2Var.b();
                return o27Var;
            case 27:
                oc2 oc2Var2 = (oc2) obj;
                oc2Var2.getClass();
                oc2Var2.b();
                return o27Var;
            case 28:
                rg5 rg5Var = (rg5) obj;
                rg5Var.getClass();
                String uri = rg5Var.d.toString();
                uri.getClass();
                return uri;
            default:
                oc2 oc2Var3 = (oc2) obj;
                oc2Var3.getClass();
                oc2Var3.b();
                return o27Var;
        }
    }
}
