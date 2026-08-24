package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.UUID;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class y00 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qn2 B;

    public /* synthetic */ y00(int i, qn2 qn2Var) {
        this.A = i;
        this.B = qn2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        String stringExtra;
        int i = this.A;
        String str = null;
        String str2 = null;
        r1 = null;
        UUID uuid = null;
        String str3 = null;
        qn2 qn2Var = this.B;
        switch (i) {
            case 0:
                Object obj2 = (n00) obj;
                obj2.getClass();
                qn2Var.g(obj2);
                return jg7.a;
            case 1:
                return new ep1((fp1) obj, qn2Var);
            case 2:
                Object obj3 = (String) obj;
                obj3.getClass();
                qn2Var.g(obj3);
                return jg7.a;
            case 3:
                ub7 ub7Var = (ub7) obj;
                if (ub7Var instanceof vr2) {
                    Boolean bool = (Boolean) qn2Var.g(((vr2) ub7Var).k0);
                    bool.getClass();
                    return bool;
                }
                i.m("Node is not a GestureNode instance");
                return null;
            case 4:
                qn2Var.g(((u52) BackgroundMode.getEntries()).get(((Integer) obj).intValue()));
                return jg7.a;
            case 5:
                Object obj4 = (String) obj;
                obj4.getClass();
                qn2Var.g(obj4);
                return jg7.a;
            case 6:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                qn2Var.g(bool2);
                return jg7.a;
            case 7:
                nx5 nx5Var = (nx5) obj;
                nx5Var.getClass();
                qn2Var.g(new hu5(nx5Var));
                return jg7.a;
            case 8:
                qn2Var.g(new ku5((Boolean) obj));
                return jg7.a;
            case 9:
                ax5 ax5Var = (ax5) obj;
                ax5Var.getClass();
                qn2Var.g(new gu5(ax5Var));
                return jg7.a;
            case 10:
                u26 u26Var = (u26) obj;
                u26Var.getClass();
                qn2Var.g(new nu5(u26Var));
                return jg7.a;
            case 11:
                qn2Var.g(new pu5((Boolean) obj));
                return jg7.a;
            case 12:
                String str4 = (String) obj;
                str4.getClass();
                if (!qs6.v0(str4)) {
                    str = str4;
                }
                qn2Var.g(new mu5(str));
                return jg7.a;
            case 13:
                qn2Var.g(new iu5((Integer) obj));
                return jg7.a;
            case 14:
                String str5 = (String) obj;
                str5.getClass();
                if (!qs6.v0(str5)) {
                    str3 = str5;
                }
                qn2Var.g(new lu5(str3));
                return jg7.a;
            case 15:
                z8 z8Var = (z8) obj;
                z8Var.getClass();
                if (z8Var.A == -1) {
                    Intent intent = z8Var.B;
                    if (intent != null && (stringExtra = intent.getStringExtra("selected_layout_id")) != null) {
                        uuid = UUID.fromString(stringExtra);
                    }
                    qn2Var.g(new ju5(uuid));
                }
                return jg7.a;
            case 16:
                qn2Var.g(new ru5((VideoFiltering) obj));
                return jg7.a;
            case 17:
                Uri uri = (Uri) obj;
                if (uri != null) {
                    qn2Var.g(new eu5(uri));
                }
                return jg7.a;
            case 18:
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    qn2Var.g(new fu5(uri2));
                }
                return jg7.a;
            case 19:
                String str6 = (String) obj;
                str6.getClass();
                if (!qs6.v0(str6)) {
                    str2 = str6;
                }
                qn2Var.g(new du5(str2));
                return jg7.a;
            case 20:
                qn2Var.g(new qu5(((Boolean) obj).booleanValue()));
                return jg7.a;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                a36 a36Var = (a36) obj;
                a36Var.getClass();
                qn2Var.g(new ou5(a36Var));
                return jg7.a;
            case 22:
                qn2Var.g(new su5((VideoRenderer) obj));
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                Object obj5 = (o6) obj;
                obj5.getClass();
                qn2Var.g(obj5);
                return jg7.a;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                Object obj6 = (pq5) obj;
                obj6.getClass();
                qn2Var.g(obj6);
                return jg7.a;
            case 25:
                vl6 vl6Var = (vl6) qn2Var.g((zl6) obj);
                synchronized (bm6.c) {
                    bm6.d = bm6.d.f(vl6Var.g());
                }
                return vl6Var;
            default:
                Object obj7 = (Long) obj;
                obj7.getClass();
                return qn2Var.g(obj7);
        }
    }
}
