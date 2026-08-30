package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hz implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ mi2 B;

    public /* synthetic */ hz(int i, mi2 mi2Var) {
        this.A = i;
        this.B = mi2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        String stringExtra;
        int i = this.A;
        String str = null;
        r1 = null;
        UUID uuid = null;
        String str2 = null;
        String str3 = null;
        mi2 mi2Var = this.B;
        switch (i) {
            case 0:
                vy vyVar = (vy) obj;
                vyVar.getClass();
                mi2Var.n(vyVar);
                return o27.a;
            case 1:
                return new yk1((zk1) obj, mi2Var);
            case 2:
                String str4 = (String) obj;
                str4.getClass();
                mi2Var.n(str4);
                return o27.a;
            case 3:
                zx6 zx6Var = (zx6) obj;
                if (zx6Var instanceof ql2) {
                    Boolean bool = (Boolean) mi2Var.n(((ql2) zx6Var).j0);
                    bool.getClass();
                    return bool;
                }
                i.n("Node is not a GestureNode instance");
                return null;
            case 4:
                mi2Var.n(((f12) BackgroundMode.getEntries()).get(((Integer) obj).intValue()));
                return o27.a;
            case 5:
                String str5 = (String) obj;
                str5.getClass();
                mi2Var.n(str5);
                return o27.a;
            case ig7.b /* 6 */:
                mi2Var.n(new uj5((Boolean) obj));
                return o27.a;
            case 7:
                lm5 lm5Var = (lm5) obj;
                lm5Var.getClass();
                mi2Var.n(new qj5(lm5Var));
                return o27.a;
            case 8:
                mi2Var.n(new bk5((VideoFiltering) obj));
                return o27.a;
            case 9:
                cs5 cs5Var = (cs5) obj;
                cs5Var.getClass();
                mi2Var.n(new xj5(cs5Var));
                return o27.a;
            case 10:
                mi2Var.n(new zj5((Boolean) obj));
                return o27.a;
            case 11:
                String str6 = (String) obj;
                str6.getClass();
                if (!zg6.B0(str6)) {
                    str = str6;
                }
                mi2Var.n(new wj5(str));
                return o27.a;
            case mj2.L /* 12 */:
                mi2Var.n(new sj5((Integer) obj));
                return o27.a;
            case 13:
                String str7 = (String) obj;
                str7.getClass();
                if (!zg6.B0(str7)) {
                    str3 = str7;
                }
                mi2Var.n(new vj5(str3));
                return o27.a;
            case 14:
                String str8 = (String) obj;
                str8.getClass();
                if (!zg6.B0(str8)) {
                    str2 = str8;
                }
                mi2Var.n(new nj5(str2));
                return o27.a;
            case ig7.e /* 15 */:
                y8 y8Var = (y8) obj;
                y8Var.getClass();
                if (y8Var.A == -1) {
                    Intent intent = y8Var.B;
                    if (intent != null && (stringExtra = intent.getStringExtra("selected_layout_id")) != null) {
                        uuid = UUID.fromString(stringExtra);
                    }
                    mi2Var.n(new tj5(uuid));
                }
                return o27.a;
            case 16:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    mi2Var.n(new oj5(uri));
                }
                return o27.a;
            case 17:
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    mi2Var.n(new pj5(uri2));
                }
                return o27.a;
            case 18:
                is5 is5Var = (is5) obj;
                is5Var.getClass();
                mi2Var.n(new yj5(is5Var));
                return o27.a;
            case 19:
                mi2Var.n(new ak5(((Boolean) obj).booleanValue()));
                return o27.a;
            case 20:
                mi2Var.n(new ck5((VideoRenderer) obj));
                return o27.a;
            case 21:
                ym5 ym5Var = (ym5) obj;
                ym5Var.getClass();
                mi2Var.n(new rj5(ym5Var));
                return o27.a;
            case 22:
                n6 n6Var = (n6) obj;
                n6Var.getClass();
                mi2Var.n(n6Var);
                return o27.a;
            case 23:
                ga6 ga6Var = (ga6) mi2Var.n((ka6) obj);
                synchronized (ma6.c) {
                    ma6.d = ma6.d.j(ga6Var.g());
                }
                return ga6Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return mi2Var.n(l);
        }
    }
}
