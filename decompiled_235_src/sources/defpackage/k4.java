package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.File;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements qn2 {
    public final /* synthetic */ int A;

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        h3 h3Var;
        long j;
        String str;
        String str2;
        vr4 vr4Var;
        String str3;
        Object em5Var;
        String str4;
        Long valueOf;
        Integer num;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        boolean z = false;
        switch (i) {
            case 0:
                ((za5) obj).getClass();
                return "leaderboard";
            case 1:
                ((o6) obj).getClass();
                return "achievement";
            case 2:
                ta5 ta5Var = (ta5) obj;
                ta5Var.getClass();
                return lb1.h(ta5Var.a, "leaderboard-");
            case 3:
                ((ta5) obj).getClass();
                return "leaderboard";
            case 4:
                ((h3) obj).getClass();
                return Boolean.valueOf(!h3Var.b.isEmpty());
            case 5:
                yn ynVar = (yn) obj;
                ynVar.getClass();
                if (ynVar.c() == h05.SHOW_TITLE) {
                    return f04.U(i52.a(13), i52.e(null, 3));
                }
                return f04.U(i52.i(1, new vn0(6)).a(i52.d(null, 3)), i52.k(new k4(6)).a(i52.e(null, 3)));
            case 6:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 7:
                v3 v3Var = (v3) obj;
                v3Var.getClass();
                if (v3Var instanceof k3) {
                    j = ((k3) v3Var).c;
                    str = "primed-";
                } else if (v3Var instanceof l3) {
                    j = ((l3) v3Var).f;
                    str = "progress-";
                } else if (v3Var instanceof o3) {
                    j = ((o3) v3Var).f;
                    str = "leaderboard-attempt-";
                } else if (v3Var instanceof p3) {
                    j = ((p3) v3Var).g;
                    str = "leaderboard-result-";
                } else if (v3Var instanceof r3) {
                    j = ((r3) v3Var).f;
                    str = "leaderboard-pending-";
                } else if (v3Var instanceof q3) {
                    return lb1.h(((q3) v3Var).j, "leaderboard-");
                } else {
                    if (v3Var instanceof m3) {
                        j = ((m3) v3Var).d;
                        str = "challenge-result-";
                    } else if (v3Var instanceof u3) {
                        j = ((u3) v3Var).d;
                        str = "server-error-";
                    } else {
                        i.d();
                        return null;
                    }
                }
                return lb1.h(j, str);
            case 8:
                Context context = (Context) obj;
                context.getClass();
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
            case 9:
                File file = (File) obj;
                file.getClass();
                if (file.isFile() && jc2.y0(file).equalsIgnoreCase("so")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                return Boolean.TRUE;
            case 11:
                return Boolean.valueOf(!(((bp) obj) instanceof ds4));
            case 12:
                rd3 rd3Var = (rd3) obj;
                rd3Var.getClass();
                rd3Var.b = true;
                rd3Var.a = false;
                return jg7Var;
            case 13:
                return (hw) obj;
            case 14:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 15:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 16:
                int i2 = BackgroundsActivity.B0;
                ((yn) obj).getClass();
                return i52.d(null, 3);
            case 17:
                int i3 = BackgroundsActivity.B0;
                ((yn) obj).getClass();
                return o52.b;
            case 18:
                int i4 = BackgroundsActivity.B0;
                ((yn) obj).getClass();
                return i52.e(null, 3);
            case 19:
                a47 a47Var = (a47) obj;
                int i5 = k30.a;
                return jg7Var;
            case 20:
                ((um3) obj).b();
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ((String) obj).getClass();
                return Boolean.valueOf(!qs6.v0(str2));
            case 22:
                String str5 = (String) obj;
                str5.getClass();
                int s0 = qs6.s0('\t', 0, 6, str5);
                if (s0 != -1) {
                    vr4Var = new vr4(str5.substring(0, s0), str5.substring(s0 + 1));
                } else {
                    vr4Var = new vr4("DS", str5);
                }
                String str6 = (String) vr4Var.B;
                if (nb3.k((String) vr4Var.A, "DSI")) {
                    str3 = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DSi/Named_Boxarts/";
                } else {
                    str3 = "https://thumbnails.libretro.com/Nintendo%20-%20Nintendo%20DS/Named_Boxarts/";
                }
                try {
                    em5Var = URLDecoder.decode(str6, "UTF-8");
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (em5Var instanceof em5) {
                    em5Var = str6;
                }
                String str7 = (String) em5Var;
                str7.getClass();
                String f = e70.f(qs6.Q0(qs6.E0(str7, ".png"), " ("));
                if (qs6.v0(f)) {
                    return null;
                }
                String str8 = str3 + str6;
                List J0 = qs6.J0(f, new char[]{' '}, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : J0) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                return new d70(str8, f, gt0.p1(arrayList));
            case ConnectionResult.API_DISABLED /* 23 */:
                ((String) obj).getClass();
                return Boolean.valueOf(!qs6.j0(str4, "/..", false));
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                xv4 xv4Var = (xv4) obj;
                nq6 nq6Var = kf.b;
                xv4Var.getClass();
                if (!((Context) q60.U(xv4Var, nq6Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    z70.a.getClass();
                    return y70.c;
                }
                return b80.b;
            case 25:
                eb6.d((gb6) obj, 0);
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                ((a47) obj).getClass();
                return jg7Var;
            case 27:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                j36 i0 = e36Var.i0("SELECT * FROM cheat_database");
                try {
                    int B = ej2.B(i0, "id");
                    int B2 = ej2.B(i0, "name");
                    ArrayList arrayList2 = new ArrayList();
                    while (i0.f0()) {
                        if (i0.isNull(B)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(i0.getLong(B));
                        }
                        arrayList2.add(new ym0(i0.R(B2), valueOf));
                    }
                    return arrayList2;
                } finally {
                }
            case 28:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                try {
                    e36Var2.i0("DELETE FROM cheat_folder WHERE id NOT IN (SELECT DISTINCT cheat_folder_id FROM cheat)").f0();
                    return jg7Var;
                } finally {
                }
            default:
                List list = (List) obj;
                list.getClass();
                Object obj3 = list.get(0);
                if (obj3 instanceof Integer) {
                    num = (Integer) obj3;
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    return hn0.b;
                }
                if (num != null && num.intValue() == 1) {
                    return in0.b;
                }
                if (num == null || num.intValue() != 2) {
                    return null;
                }
                Object obj4 = list.get(1);
                obj4.getClass();
                return new gn0(((ho0) obj4).a());
        }
    }

    public /* synthetic */ k4(int i) {
        this.A = i;
    }
}
