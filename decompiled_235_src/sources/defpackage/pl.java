package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pl  reason: default package */
/* loaded from: classes.dex */
public final class pl implements pn5 {
    public final l85 a;
    public final qf4 b;
    public final hk c;
    public final jk d;
    public final SharedPreferences e;
    public final Context f;
    public final cn5 g;
    public final bk1 h = new bk1(7);

    public pl(l85 l85Var, qf4 qf4Var, hk hkVar, jk jkVar, SharedPreferences sharedPreferences, Context context, cn5 cn5Var) {
        this.a = l85Var;
        this.b = qf4Var;
        this.c = hkVar;
        this.d = jkVar;
        this.e = sharedPreferences;
        this.f = context;
        this.g = cn5Var;
    }

    public static void t(String str, vr4... vr4VarArr) {
        StringBuilder sb = new StringBuilder("event_type=");
        sb.append(str);
        for (vr4 vr4Var : vr4VarArr) {
            String str2 = (String) vr4Var.A;
            Object obj = vr4Var.B;
            if (obj != null) {
                sb.append(' ');
                sb.append(str2);
                sb.append('=');
                sb.append(xs6.d0(obj.toString(), ' ', '_'));
            }
        }
        Log.i("RASubmission", sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r14 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(String str, boolean z, s41 s41Var) {
        kl klVar;
        int i;
        Object k;
        ga5 ga5Var;
        Object t;
        long j;
        String str2;
        boolean z2;
        Throwable a;
        if (s41Var instanceof kl) {
            klVar = (kl) s41Var;
            int i2 = klVar.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                klVar.e0 = i2 - Integer.MIN_VALUE;
                kl klVar2 = klVar;
                Object obj = klVar2.Z;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = klVar2.e0;
                Object obj3 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j = klVar2.Y;
                            z2 = klVar2.X;
                            str2 = klVar2.R;
                            oi2.Y(obj);
                            t = ((hm5) obj).A;
                            if (!(t instanceof em5)) {
                                jg7 jg7Var = (jg7) t;
                                u("session_start_success", new vr4("game_hash", str2), new vr4("game_id", new Long(j)), new vr4("hardcore", Boolean.valueOf(z2)));
                            }
                            a = hm5.a(t);
                            if (a != null) {
                                vr4 vr4Var = new vr4("game_hash", str2);
                                vr4 vr4Var2 = new vr4("game_id", new Long(j));
                                vr4 vr4Var3 = new vr4("hardcore", Boolean.valueOf(z2));
                                String c = gh5.a(a.getClass()).c();
                                if (c == null) {
                                    c = "Unknown";
                                }
                                u("session_start_failed", vr4Var, vr4Var2, vr4Var3, new vr4("error", c));
                            }
                            return t;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = klVar2.X;
                    str = klVar2.R;
                    oi2.Y(obj);
                    k = ((hm5) obj).A;
                } else {
                    oi2.Y(obj);
                    klVar2.R = str;
                    klVar2.X = z;
                    klVar2.e0 = 1;
                    k = k(str, false, klVar2);
                }
                String str3 = str;
                boolean z3 = z;
                if (!(k instanceof em5)) {
                    obj3 = k;
                }
                ga5Var = (ga5) obj3;
                if (ga5Var == null) {
                    long j2 = ga5Var.a;
                    u("session_start_attempt", new vr4("game_hash", str3), new vr4("game_id", new Long(j2)), new vr4("hardcore", Boolean.valueOf(z3)));
                    klVar2.R = str3;
                    klVar2.X = z3;
                    klVar2.Y = j2;
                    klVar2.e0 = 2;
                    t = this.a.t(j2, klVar2, str3, z3);
                    if (t != obj2) {
                        j = j2;
                        str2 = str3;
                        z2 = z3;
                        if (!(t instanceof em5)) {
                        }
                        a = hm5.a(t);
                        if (a != null) {
                        }
                        return t;
                    }
                    return obj2;
                }
                str3.getClass();
                return new em5(new Exception("There is no game for hash ".concat(str3)));
            }
        }
        klVar = new kl(this, s41Var);
        kl klVar22 = klVar;
        Object obj4 = klVar22.Z;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = klVar22.e0;
        Object obj32 = null;
        if (i == 0) {
        }
        String str32 = str;
        boolean z32 = z;
        if (!(k instanceof em5)) {
        }
        ga5Var = (ga5) obj32;
        if (ga5Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0223, code lost:
        if (r25 > 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02ea, code lost:
        if (r1 == r13) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x043b  */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Long, fb5, hb5] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(long j, long j2, boolean z, Long l, hb5 hb5Var, s41 s41Var) {
        ll llVar;
        int i;
        boolean z2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        long j3;
        long j4;
        hb5 hb5Var2;
        Object obj7;
        fb5 fb5Var;
        Long l2;
        fb5 fb5Var2;
        Object o;
        hb5 hb5Var3;
        Long l3;
        boolean z3;
        long j5;
        Long l4;
        qf4 qf4Var;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        pl plVar;
        String str;
        x61 x61Var;
        ?? r9;
        Object obj17;
        Long l5;
        boolean z4;
        boolean z5;
        boolean z6;
        Object obj18;
        ll llVar2;
        x61 x61Var2;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        boolean z7;
        Object obj23;
        o85 o85Var;
        qf4 qf4Var2;
        Long l6;
        Object obj24;
        boolean z8;
        long j6;
        Throwable a;
        ab5 ab5Var;
        long j7;
        long j8;
        Object obj25;
        if (s41Var instanceof ll) {
            llVar = (ll) s41Var;
            int i2 = llVar.m0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                llVar.m0 = i2 - Integer.MIN_VALUE;
                ll llVar3 = llVar;
                Object obj26 = llVar3.k0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                i = llVar3.m0;
                qf4 qf4Var3 = this.b;
                switch (i) {
                    case 0:
                        oi2.Y(obj26);
                        z2 = z;
                        obj = "submit_path";
                        obj2 = "hardcore";
                        obj3 = "offset_seconds";
                        obj4 = "game_hash";
                        obj5 = "achievement_id";
                        obj6 = "game_id";
                        fb5 fb5Var3 = new fb5(j2, j, true, z2);
                        if (!z2) {
                            llVar3.Z = l;
                            llVar3.d0 = hb5Var;
                            llVar3.e0 = fb5Var3;
                            j3 = j;
                            llVar3.R = j3;
                            j4 = j2;
                            llVar3.X = j4;
                            llVar3.Y = z2;
                            llVar3.m0 = 1;
                            if (qf4Var3.b(fb5Var3, llVar3) != x61Var3) {
                                hb5Var2 = hb5Var;
                                fb5Var2 = fb5Var3;
                                l2 = l;
                                fb5 fb5Var4 = fb5Var2;
                                obj7 = obj6;
                                fb5Var = fb5Var4;
                                llVar3.Z = l2;
                                llVar3.d0 = hb5Var2;
                                llVar3.e0 = fb5Var;
                                llVar3.R = j3;
                                llVar3.X = j4;
                                llVar3.Y = z2;
                                Long l7 = l2;
                                llVar3.m0 = 2;
                                o = qf4Var3.a.o(j4, llVar3);
                                if (o != x61Var3) {
                                    hb5Var3 = hb5Var2;
                                    long j9 = j4;
                                    l3 = l7;
                                    z3 = z2;
                                    j5 = j9;
                                    String str2 = (String) o;
                                    if (l3 != null) {
                                        long longValue = l3.longValue();
                                        if (longValue > 0) {
                                            long b = (u83.a.b().b() - longValue) / 1000;
                                            if (b < 0) {
                                                b = 0;
                                            }
                                            if (b > 1209600) {
                                                b = 1209600;
                                            }
                                            l4 = Long.valueOf(b);
                                            break;
                                        }
                                    }
                                    l4 = null;
                                    qf4Var = qf4Var3;
                                    obj8 = "awardachievement";
                                    Object obj27 = obj7;
                                    obj9 = obj4;
                                    obj10 = "expected_api";
                                    obj11 = obj;
                                    Object obj28 = obj2;
                                    obj12 = obj3;
                                    obj13 = "kotlin_api";
                                    t("kotlin_award_submit_start", new vr4(obj5, new Long(j3)), new vr4(obj, "kotlin_api"), new vr4("expected_api", "awardachievement"), new vr4(obj27, new Long(j5)), new vr4(obj9, str2), new vr4(obj28, Boolean.valueOf(z3)), new vr4(obj12, l4));
                                    obj14 = obj5;
                                    obj15 = obj27;
                                    obj16 = obj28;
                                    vr4[] vr4VarArr = {new vr4(obj5, new Long(j3)), new vr4(obj27, new Long(j5)), new vr4(obj28, Boolean.valueOf(z3)), new vr4(obj9, str2), new vr4(obj12, l4)};
                                    plVar = this;
                                    plVar.u("achievement_submit_attempt", vr4VarArr);
                                    l85 l85Var = plVar.a;
                                    if (hb5Var3 != null) {
                                        z5 = false;
                                        llVar3.Z = null;
                                        llVar3.d0 = null;
                                        llVar3.e0 = fb5Var;
                                        llVar3.f0 = str2;
                                        llVar3.g0 = l4;
                                        llVar3.R = j3;
                                        llVar3.X = j5;
                                        llVar3.Y = z3;
                                        llVar3.m0 = 3;
                                        boolean z9 = z3;
                                        obj17 = l85Var.d(j3, z9, str2, l4, llVar3);
                                        z6 = z9;
                                        str = str2;
                                        x61Var = x61Var3;
                                        break;
                                    } else {
                                        boolean z10 = z3;
                                        str = str2;
                                        x61Var = x61Var3;
                                        r9 = 0;
                                        llVar3.Z = null;
                                        llVar3.d0 = null;
                                        llVar3.e0 = fb5Var;
                                        llVar3.f0 = str;
                                        llVar3.g0 = l4;
                                        llVar3.R = j3;
                                        llVar3.X = j5;
                                        llVar3.Y = z10;
                                        llVar3.m0 = 4;
                                        Object e = l85Var.e(j3, z10, hb5Var3, str, l4, llVar3);
                                        if (e != x61Var) {
                                            obj17 = e;
                                            l5 = l4;
                                            z4 = z10;
                                            if (!(obj17 instanceof em5)) {
                                                o85Var = (o85) obj17;
                                                if (z4) {
                                                    llVar3.Z = r9;
                                                    llVar3.d0 = r9;
                                                    llVar3.e0 = r9;
                                                    llVar3.f0 = str;
                                                    llVar3.g0 = l5;
                                                    llVar3.h0 = obj17;
                                                    llVar3.i0 = o85Var;
                                                    llVar3.R = j3;
                                                    llVar3.X = j5;
                                                    llVar3.Y = z4;
                                                    llVar3.m0 = 5;
                                                    qf4Var2 = qf4Var;
                                                    if (qf4Var2.b(fb5Var, llVar3) != x61Var) {
                                                        long j10 = j3;
                                                        l6 = l5;
                                                        obj24 = obj17;
                                                        z8 = z4;
                                                        j6 = j10;
                                                        long j11 = j6;
                                                        obj17 = obj24;
                                                        z4 = z8;
                                                        l5 = l6;
                                                        j3 = j11;
                                                        Object obj29 = obj17;
                                                        boolean z11 = z4;
                                                        obj23 = obj14;
                                                        x61Var2 = x61Var;
                                                        obj19 = obj13;
                                                        obj20 = obj11;
                                                        llVar2 = llVar3;
                                                        qf4Var = qf4Var2;
                                                        obj21 = obj15;
                                                        obj22 = obj16;
                                                        t("kotlin_award_submit_success", new vr4(obj23, new Long(j3)), new vr4(obj20, obj19), new vr4(obj10, obj8), new vr4(obj21, new Long(j5)), new vr4(obj9, str), new vr4(obj22, Boolean.valueOf(z11)), new vr4(obj12, l5), new vr4("ra_awarded", Boolean.valueOf(o85Var.a)), new vr4("remaining", new Integer(o85Var.b)));
                                                        plVar.u("achievement_submit_success", new vr4(obj23, new Long(j3)), new vr4(obj21, new Long(j5)), new vr4(obj22, Boolean.valueOf(z11)), new vr4("awarded", Boolean.valueOf(o85Var.a)));
                                                        obj18 = obj29;
                                                        z7 = z11;
                                                        str = str;
                                                        j3 = j3;
                                                        a = hm5.a(obj18);
                                                        if (a != null) {
                                                            t("kotlin_award_submit_failed", new vr4(obj23, new Long(j3)), new vr4(obj20, obj19), new vr4(obj10, obj8), new vr4(obj21, new Long(j5)), new vr4(obj9, str), new vr4(obj22, Boolean.valueOf(z7)), new vr4("error", a.getClass().getSimpleName()));
                                                            vr4 vr4Var = new vr4(obj23, new Long(j3));
                                                            vr4 vr4Var2 = new vr4(obj21, new Long(j5));
                                                            vr4 vr4Var3 = new vr4(obj22, Boolean.valueOf(z7));
                                                            String c = gh5.a(a.getClass()).c();
                                                            if (c == null) {
                                                                c = "Unknown";
                                                            }
                                                            long j12 = j3;
                                                            plVar.u("achievement_submit_failed", vr4Var, vr4Var2, vr4Var3, new vr4("error", c));
                                                            if (!z7 && plVar.g.a().i) {
                                                                ll llVar4 = llVar2;
                                                                ab5Var = new ab5(j12, j5, false, u83.a.b().b());
                                                                llVar4.Z = null;
                                                                llVar4.d0 = null;
                                                                llVar4.e0 = null;
                                                                llVar4.f0 = null;
                                                                llVar4.g0 = null;
                                                                llVar4.h0 = obj18;
                                                                llVar4.i0 = null;
                                                                llVar4.j0 = ab5Var;
                                                                llVar4.R = j12;
                                                                llVar4.X = j5;
                                                                llVar4.Y = z7;
                                                                llVar4.m0 = 6;
                                                                x61 x61Var4 = x61Var2;
                                                                if (qf4Var.a(ab5Var, llVar4) == x61Var4) {
                                                                    return x61Var4;
                                                                }
                                                                j7 = j12;
                                                                j8 = j5;
                                                                obj25 = obj18;
                                                                vr4 vr4Var4 = new vr4(obj23, new Long(j7));
                                                                vr4 vr4Var5 = new vr4(obj20, "pending_submission_worker");
                                                                vr4 vr4Var6 = new vr4(obj21, new Long(j8));
                                                                Boolean bool = Boolean.FALSE;
                                                                t("kotlin_award_queued_pending", vr4Var4, vr4Var5, vr4Var6, new vr4(obj22, bool), new vr4("created_at_epoch_ms", new Long(ab5Var.d)));
                                                                u("achievement_submit_queued_pending", new vr4(obj23, new Long(j7)), new vr4(obj21, new Long(j8)), new vr4(obj22, bool));
                                                                return obj25;
                                                            } else if (z7) {
                                                                vr4 vr4Var7 = new vr4(obj23, new Long(j12));
                                                                vr4 vr4Var8 = new vr4(obj20, "hardcore_memory_queue");
                                                                vr4 vr4Var9 = new vr4(obj21, new Long(j5));
                                                                Boolean bool2 = Boolean.TRUE;
                                                                t("kotlin_award_hardcore_not_persisted", vr4Var7, vr4Var8, vr4Var9, new vr4(obj22, bool2));
                                                                plVar.u("achievement_submit_hardcore_not_persisted", new vr4(obj23, new Long(j12)), new vr4(obj21, new Long(j5)), new vr4(obj22, bool2));
                                                                return obj18;
                                                            } else {
                                                                t("kotlin_award_proxy_retry_not_persisted", new vr4(obj23, new Long(j12)), new vr4(obj20, "raofflineproxy"), new vr4(obj21, new Long(j5)), new vr4(obj22, Boolean.FALSE));
                                                            }
                                                        }
                                                        return obj18;
                                                    }
                                                } else {
                                                    qf4Var2 = qf4Var;
                                                    Object obj292 = obj17;
                                                    boolean z112 = z4;
                                                    obj23 = obj14;
                                                    x61Var2 = x61Var;
                                                    obj19 = obj13;
                                                    obj20 = obj11;
                                                    llVar2 = llVar3;
                                                    qf4Var = qf4Var2;
                                                    obj21 = obj15;
                                                    obj22 = obj16;
                                                    t("kotlin_award_submit_success", new vr4(obj23, new Long(j3)), new vr4(obj20, obj19), new vr4(obj10, obj8), new vr4(obj21, new Long(j5)), new vr4(obj9, str), new vr4(obj22, Boolean.valueOf(z112)), new vr4(obj12, l5), new vr4("ra_awarded", Boolean.valueOf(o85Var.a)), new vr4("remaining", new Integer(o85Var.b)));
                                                    plVar.u("achievement_submit_success", new vr4(obj23, new Long(j3)), new vr4(obj21, new Long(j5)), new vr4(obj22, Boolean.valueOf(z112)), new vr4("awarded", Boolean.valueOf(o85Var.a)));
                                                    obj18 = obj292;
                                                    z7 = z112;
                                                    str = str;
                                                    j3 = j3;
                                                    a = hm5.a(obj18);
                                                    if (a != null) {
                                                    }
                                                    return obj18;
                                                }
                                            } else {
                                                obj18 = obj17;
                                                llVar2 = llVar3;
                                                x61Var2 = x61Var;
                                                obj19 = obj13;
                                                obj20 = obj11;
                                                obj21 = obj15;
                                                obj22 = obj16;
                                                z7 = z4;
                                                obj23 = obj14;
                                                a = hm5.a(obj18);
                                                if (a != null) {
                                                }
                                                return obj18;
                                            }
                                        }
                                    }
                                    return x61Var;
                                }
                            }
                            return x61Var3;
                        }
                        j3 = j;
                        j4 = j2;
                        hb5Var2 = hb5Var;
                        obj7 = obj6;
                        fb5Var = fb5Var3;
                        l2 = l;
                        llVar3.Z = l2;
                        llVar3.d0 = hb5Var2;
                        llVar3.e0 = fb5Var;
                        llVar3.R = j3;
                        llVar3.X = j4;
                        llVar3.Y = z2;
                        Long l72 = l2;
                        llVar3.m0 = 2;
                        o = qf4Var3.a.o(j4, llVar3);
                        if (o != x61Var3) {
                        }
                        return x61Var3;
                    case 1:
                        z2 = llVar3.Y;
                        long j13 = llVar3.X;
                        long j14 = llVar3.R;
                        fb5 fb5Var5 = llVar3.e0;
                        hb5 hb5Var4 = llVar3.d0;
                        l2 = llVar3.Z;
                        oi2.Y(obj26);
                        fb5Var2 = fb5Var5;
                        obj = "submit_path";
                        obj2 = "hardcore";
                        obj3 = "offset_seconds";
                        obj4 = "game_hash";
                        obj6 = "game_id";
                        obj5 = "achievement_id";
                        j3 = j14;
                        hb5Var2 = hb5Var4;
                        j4 = j13;
                        fb5 fb5Var42 = fb5Var2;
                        obj7 = obj6;
                        fb5Var = fb5Var42;
                        llVar3.Z = l2;
                        llVar3.d0 = hb5Var2;
                        llVar3.e0 = fb5Var;
                        llVar3.R = j3;
                        llVar3.X = j4;
                        llVar3.Y = z2;
                        Long l722 = l2;
                        llVar3.m0 = 2;
                        o = qf4Var3.a.o(j4, llVar3);
                        if (o != x61Var3) {
                        }
                        return x61Var3;
                    case 2:
                        boolean z12 = llVar3.Y;
                        long j15 = llVar3.X;
                        long j16 = llVar3.R;
                        fb5 fb5Var6 = llVar3.e0;
                        hb5 hb5Var5 = llVar3.d0;
                        Long l8 = llVar3.Z;
                        oi2.Y(obj26);
                        hb5Var3 = hb5Var5;
                        obj = "submit_path";
                        obj2 = "hardcore";
                        obj7 = "game_id";
                        z3 = z12;
                        obj3 = "offset_seconds";
                        obj4 = "game_hash";
                        j3 = j16;
                        fb5Var = fb5Var6;
                        l3 = l8;
                        obj5 = "achievement_id";
                        j5 = j15;
                        o = obj26;
                        String str22 = (String) o;
                        if (l3 != null) {
                        }
                        l4 = null;
                        qf4Var = qf4Var3;
                        obj8 = "awardachievement";
                        Object obj272 = obj7;
                        obj9 = obj4;
                        obj10 = "expected_api";
                        obj11 = obj;
                        Object obj282 = obj2;
                        obj12 = obj3;
                        obj13 = "kotlin_api";
                        t("kotlin_award_submit_start", new vr4(obj5, new Long(j3)), new vr4(obj, "kotlin_api"), new vr4("expected_api", "awardachievement"), new vr4(obj272, new Long(j5)), new vr4(obj9, str22), new vr4(obj282, Boolean.valueOf(z3)), new vr4(obj12, l4));
                        obj14 = obj5;
                        obj15 = obj272;
                        obj16 = obj282;
                        vr4[] vr4VarArr2 = {new vr4(obj5, new Long(j3)), new vr4(obj272, new Long(j5)), new vr4(obj282, Boolean.valueOf(z3)), new vr4(obj9, str22), new vr4(obj12, l4)};
                        plVar = this;
                        plVar.u("achievement_submit_attempt", vr4VarArr2);
                        l85 l85Var2 = plVar.a;
                        if (hb5Var3 != null) {
                        }
                        return x61Var;
                    case 3:
                        boolean z13 = llVar3.Y;
                        long j17 = llVar3.X;
                        long j18 = llVar3.R;
                        Long l9 = llVar3.g0;
                        String str3 = llVar3.f0;
                        fb5 fb5Var7 = llVar3.e0;
                        oi2.Y(obj26);
                        obj17 = ((hm5) obj26).A;
                        obj11 = "submit_path";
                        obj16 = "hardcore";
                        obj15 = "game_id";
                        obj14 = "achievement_id";
                        obj8 = "awardachievement";
                        obj10 = "expected_api";
                        obj13 = "kotlin_api";
                        qf4Var = qf4Var3;
                        j3 = j18;
                        plVar = this;
                        str = str3;
                        z6 = z13;
                        x61Var = x61Var3;
                        obj12 = "offset_seconds";
                        obj9 = "game_hash";
                        z5 = false;
                        j5 = j17;
                        l4 = l9;
                        fb5Var = fb5Var7;
                        Long l10 = l4;
                        z4 = z6;
                        l5 = l10;
                        r9 = z5;
                        if (!(obj17 instanceof em5)) {
                        }
                        break;
                    case 4:
                        boolean z14 = llVar3.Y;
                        long j19 = llVar3.X;
                        long j20 = llVar3.R;
                        Long l11 = llVar3.g0;
                        String str4 = llVar3.f0;
                        fb5 fb5Var8 = llVar3.e0;
                        oi2.Y(obj26);
                        obj17 = ((hm5) obj26).A;
                        obj11 = "submit_path";
                        obj16 = "hardcore";
                        obj15 = "game_id";
                        obj14 = "achievement_id";
                        obj8 = "awardachievement";
                        obj10 = "expected_api";
                        obj13 = "kotlin_api";
                        qf4Var = qf4Var3;
                        j3 = j20;
                        plVar = this;
                        str = str4;
                        z4 = z14;
                        x61Var = x61Var3;
                        obj12 = "offset_seconds";
                        obj9 = "game_hash";
                        r9 = 0;
                        j5 = j19;
                        l5 = l11;
                        fb5Var = fb5Var8;
                        if (!(obj17 instanceof em5)) {
                        }
                        break;
                    case 5:
                        boolean z15 = llVar3.Y;
                        long j21 = llVar3.X;
                        long j22 = llVar3.R;
                        o85 o85Var2 = llVar3.i0;
                        Object obj30 = llVar3.h0;
                        Long l12 = llVar3.g0;
                        String str5 = llVar3.f0;
                        oi2.Y(obj26);
                        obj11 = "submit_path";
                        obj16 = "hardcore";
                        obj15 = "game_id";
                        obj14 = "achievement_id";
                        obj8 = "awardachievement";
                        obj10 = "expected_api";
                        obj13 = "kotlin_api";
                        z8 = z15;
                        plVar = this;
                        str = str5;
                        l6 = l12;
                        x61Var = x61Var3;
                        obj12 = "offset_seconds";
                        qf4Var2 = qf4Var3;
                        j6 = j22;
                        obj24 = obj30;
                        obj9 = "game_hash";
                        o85Var = o85Var2;
                        j5 = j21;
                        long j112 = j6;
                        obj17 = obj24;
                        z4 = z8;
                        l5 = l6;
                        j3 = j112;
                        Object obj2922 = obj17;
                        boolean z1122 = z4;
                        obj23 = obj14;
                        x61Var2 = x61Var;
                        obj19 = obj13;
                        obj20 = obj11;
                        llVar2 = llVar3;
                        qf4Var = qf4Var2;
                        obj21 = obj15;
                        obj22 = obj16;
                        t("kotlin_award_submit_success", new vr4(obj23, new Long(j3)), new vr4(obj20, obj19), new vr4(obj10, obj8), new vr4(obj21, new Long(j5)), new vr4(obj9, str), new vr4(obj22, Boolean.valueOf(z1122)), new vr4(obj12, l5), new vr4("ra_awarded", Boolean.valueOf(o85Var.a)), new vr4("remaining", new Integer(o85Var.b)));
                        plVar.u("achievement_submit_success", new vr4(obj23, new Long(j3)), new vr4(obj21, new Long(j5)), new vr4(obj22, Boolean.valueOf(z1122)), new vr4("awarded", Boolean.valueOf(o85Var.a)));
                        obj18 = obj2922;
                        z7 = z1122;
                        str = str;
                        j3 = j3;
                        a = hm5.a(obj18);
                        if (a != null) {
                        }
                        return obj18;
                    case 6:
                        long j23 = llVar3.X;
                        long j24 = llVar3.R;
                        ab5 ab5Var2 = llVar3.j0;
                        Throwable th = (Throwable) llVar3.i0;
                        obj25 = llVar3.h0;
                        oi2.Y(obj26);
                        ab5Var = ab5Var2;
                        obj20 = "submit_path";
                        obj23 = "achievement_id";
                        obj22 = "hardcore";
                        obj21 = "game_id";
                        j8 = j23;
                        j7 = j24;
                        vr4 vr4Var42 = new vr4(obj23, new Long(j7));
                        vr4 vr4Var52 = new vr4(obj20, "pending_submission_worker");
                        vr4 vr4Var62 = new vr4(obj21, new Long(j8));
                        Boolean bool3 = Boolean.FALSE;
                        t("kotlin_award_queued_pending", vr4Var42, vr4Var52, vr4Var62, new vr4(obj22, bool3), new vr4("created_at_epoch_ms", new Long(ab5Var.d)));
                        u("achievement_submit_queued_pending", new vr4(obj23, new Long(j7)), new vr4(obj21, new Long(j8)), new vr4(obj22, bool3));
                        return obj25;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        llVar = new ll(this, s41Var);
        ll llVar32 = llVar;
        Object obj262 = llVar32.k0;
        x61 x61Var32 = x61.COROUTINE_SUSPENDED;
        i = llVar32.m0;
        qf4 qf4Var32 = this.b;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r0 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(long j, int i, hb5 hb5Var, s41 s41Var) {
        ml mlVar;
        Object obj;
        int i2;
        if (s41Var instanceof ml) {
            mlVar = (ml) s41Var;
            int i3 = mlVar.e0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mlVar.e0 = i3 - Integer.MIN_VALUE;
                ml mlVar2 = mlVar;
                obj = mlVar2.Z;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i2 = mlVar2.e0;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            return ((hm5) obj).A;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = mlVar2.X;
                    j = mlVar2.R;
                    hb5Var = mlVar2.Y;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    mlVar2.Y = hb5Var;
                    mlVar2.R = j;
                    mlVar2.X = i;
                    mlVar2.e0 = 1;
                    obj = b(hb5Var, mlVar2);
                }
                if (((Boolean) obj).booleanValue()) {
                    return new em5(new rj7());
                }
                mlVar2.Y = null;
                mlVar2.R = j;
                mlVar2.X = i;
                mlVar2.e0 = 2;
                Object D = D(j, i, hb5Var, mlVar2);
                if (D == obj2) {
                    return obj2;
                }
                return D;
            }
        }
        mlVar = new ml(this, s41Var);
        ml mlVar22 = mlVar;
        obj = mlVar22.Z;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i2 = mlVar22.e0;
        if (i2 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        if (r3 == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(long j, int i, hb5 hb5Var, s41 s41Var) {
        nl nlVar;
        int i2;
        long j2;
        hb5 hb5Var2;
        int i3;
        va5 va5Var;
        String str;
        long j3;
        long j4;
        hb5 hb5Var3;
        Object v;
        long j5;
        Throwable a;
        vm5 vm5Var = this.b.a;
        if (s41Var instanceof nl) {
            nlVar = (nl) s41Var;
            int i4 = nlVar.e0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nlVar.e0 = i4 - Integer.MIN_VALUE;
                nl nlVar2 = nlVar;
                Object obj = nlVar2.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = nlVar2.e0;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3 || i2 == 4) {
                                j5 = nlVar2.R;
                                oi2.Y(obj);
                                v = ((hm5) obj).A;
                                if (!(v instanceof em5)) {
                                    cb5 cb5Var = (cb5) v;
                                    u("leaderboard_submit_success", new vr4("leaderboard_id", new Long(j5)), new vr4("rank", new Integer(cb5Var.a)), new vr4("entries", new Integer(cb5Var.b)));
                                }
                                a = hm5.a(v);
                                if (a != null) {
                                    vr4 vr4Var = new vr4("leaderboard_id", new Long(j5));
                                    String c = gh5.a(a.getClass()).c();
                                    if (c == null) {
                                        c = "Unknown";
                                    }
                                    u("leaderboard_submit_failed", vr4Var, new vr4("error", c));
                                }
                                return v;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = nlVar2.X;
                        j4 = nlVar2.R;
                        hb5Var2 = nlVar2.Y;
                        oi2.Y(obj);
                        str = (String) obj;
                        j3 = j4;
                        int i5 = i3;
                        hb5Var3 = hb5Var2;
                        u("leaderboard_submit_attempt", new vr4("leaderboard_id", new Long(j3)), new vr4("value", new Integer(i5)), new vr4("game_hash", str));
                        l85 l85Var = this.a;
                        if (hb5Var3 == null) {
                            nlVar2.Y = null;
                            nlVar2.R = j3;
                            nlVar2.X = i5;
                            nlVar2.e0 = 3;
                            Object u = l85Var.u(j3, i5, str, nlVar2);
                            if (u != x61Var) {
                                v = u;
                                j5 = j3;
                            }
                            return x61Var;
                        }
                        nlVar2.Y = null;
                        nlVar2.R = j3;
                        nlVar2.X = i5;
                        nlVar2.e0 = 4;
                        v = l85Var.v(j3, i5, hb5Var3, str, nlVar2);
                        if (!(v instanceof em5)) {
                        }
                        a = hm5.a(v);
                        if (a != null) {
                        }
                        return v;
                    }
                    i3 = nlVar2.X;
                    j2 = nlVar2.R;
                    hb5Var2 = nlVar2.Y;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    nlVar2.Y = hb5Var;
                    nlVar2.R = j;
                    nlVar2.X = i;
                    nlVar2.e0 = 1;
                    Object t = vm5Var.t(j, nlVar2);
                    if (t != x61Var) {
                        j2 = j;
                        hb5Var2 = hb5Var;
                        i3 = i;
                        obj = t;
                    }
                    return x61Var;
                }
                va5Var = (va5) obj;
                if (va5Var == null) {
                    long j6 = va5Var.b;
                    nlVar2.Y = hb5Var2;
                    nlVar2.R = j2;
                    nlVar2.X = i3;
                    nlVar2.e0 = 2;
                    obj = vm5Var.o(j6, nlVar2);
                    if (obj != x61Var) {
                        j4 = j2;
                        str = (String) obj;
                        j3 = j4;
                        int i52 = i3;
                        hb5Var3 = hb5Var2;
                        u("leaderboard_submit_attempt", new vr4("leaderboard_id", new Long(j3)), new vr4("value", new Integer(i52)), new vr4("game_hash", str));
                        l85 l85Var2 = this.a;
                        if (hb5Var3 == null) {
                        }
                        if (!(v instanceof em5)) {
                        }
                        a = hm5.a(v);
                        if (a != null) {
                        }
                        return v;
                    }
                    return x61Var;
                }
                str = null;
                j3 = j2;
                int i522 = i3;
                hb5Var3 = hb5Var2;
                u("leaderboard_submit_attempt", new vr4("leaderboard_id", new Long(j3)), new vr4("value", new Integer(i522)), new vr4("game_hash", str));
                l85 l85Var22 = this.a;
                if (hb5Var3 == null) {
                }
                if (!(v instanceof em5)) {
                }
                a = hm5.a(v);
                if (a != null) {
                }
                return v;
            }
        }
        nlVar = new nl(this, s41Var);
        nl nlVar22 = nlVar;
        Object obj2 = nlVar22.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = nlVar22.e0;
        if (i2 == 0) {
        }
        va5Var = (va5) obj2;
        if (va5Var == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (r1 == r9) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01bf, code lost:
        if (r4.C(r14, r2) == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c9 -> B:56:0x01ee). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01bf -> B:55:0x01c2). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object E(s41 s41Var) {
        ol olVar;
        int i;
        Iterator it;
        int i2;
        qf4 qf4Var;
        ab5 ab5Var;
        String str;
        String str2;
        String str3;
        Iterator it2;
        int i3;
        int i4;
        Object obj;
        boolean z;
        qf4 qf4Var2;
        String str4;
        ab5 ab5Var2;
        if (s41Var instanceof ol) {
            olVar = (ol) s41Var;
            int i5 = olVar.f0;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                olVar.f0 = i5 - Integer.MIN_VALUE;
                Object obj2 = olVar.d0;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i = olVar.f0;
                int i6 = 0;
                int i7 = 2;
                qf4 qf4Var3 = this.b;
                jg7 jg7Var = jg7.a;
                String str5 = "hardcore";
                String str6 = "game_id";
                String str7 = "achievement_id";
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    i4 = olVar.Y;
                                    ab5 ab5Var3 = olVar.X;
                                    it2 = olVar.R;
                                    oi2.Y(obj2);
                                    ab5Var = ab5Var3;
                                    qf4Var2 = qf4Var3;
                                    str3 = "hardcore";
                                    str = "game_id";
                                    str2 = "achievement_id";
                                    u("pending_award_retry_success", new vr4(str2, new Long(ab5Var.a)), new vr4(str, new Long(ab5Var.b)), new vr4(str3, Boolean.valueOf(ab5Var.c)));
                                    qf4Var3 = qf4Var2;
                                    it = it2;
                                    str5 = str3;
                                    str7 = str2;
                                    str6 = str;
                                    i6 = 0;
                                    i7 = 2;
                                    i2 = i4;
                                    ol olVar2 = olVar;
                                    if (it.hasNext()) {
                                        ab5 ab5Var4 = (ab5) it.next();
                                        if (ab5Var4.c) {
                                            olVar2.R = it;
                                            olVar2.X = ab5Var4;
                                            olVar2.Y = i2;
                                            olVar2.Z = i6;
                                            olVar2.f0 = i7;
                                            if (qf4Var3.C(ab5Var4, olVar2) != obj3) {
                                                ab5Var2 = ab5Var4;
                                                olVar = olVar2;
                                                i4 = i2;
                                                it2 = it;
                                                qf4 qf4Var4 = qf4Var3;
                                                u("pending_award_hardcore_discarded", new vr4(str7, new Long(ab5Var2.a)), new vr4(str6, new Long(ab5Var2.b)), new vr4(str5, Boolean.TRUE));
                                                str3 = str5;
                                                str = str6;
                                                str2 = str7;
                                                qf4Var2 = qf4Var4;
                                                qf4Var3 = qf4Var2;
                                                it = it2;
                                                str5 = str3;
                                                str7 = str2;
                                                str6 = str;
                                                i6 = 0;
                                                i7 = 2;
                                                i2 = i4;
                                                ol olVar22 = olVar;
                                                if (it.hasNext()) {
                                                }
                                            }
                                        } else {
                                            qf4Var = qf4Var3;
                                            u("pending_award_retry_attempt", new vr4(str7, new Long(ab5Var4.a)), new vr4(str6, new Long(ab5Var4.b)), new vr4(str5, Boolean.valueOf(ab5Var4.c)));
                                            long j = ab5Var4.a;
                                            long j2 = ab5Var4.b;
                                            String str8 = str5;
                                            boolean z2 = ab5Var4.c;
                                            String str9 = str6;
                                            Long l = new Long(ab5Var4.d);
                                            olVar22.R = it;
                                            olVar22.X = ab5Var4;
                                            olVar22.Y = i2;
                                            olVar22.Z = i6;
                                            olVar22.f0 = 3;
                                            str = str9;
                                            str3 = str8;
                                            ab5Var = ab5Var4;
                                            Iterator it3 = it;
                                            int i8 = i2;
                                            str2 = str7;
                                            obj = B(j, j2, z2, l, null, olVar22);
                                            if (obj != obj3) {
                                                olVar = olVar22;
                                                it2 = it3;
                                                i4 = i8;
                                                i3 = 0;
                                                z = obj instanceof em5;
                                                if (!z) {
                                                    vr4 vr4Var = new vr4(str2, new Long(ab5Var.a));
                                                    vr4 vr4Var2 = new vr4(str, new Long(ab5Var.b));
                                                    vr4 vr4Var3 = new vr4(str3, Boolean.valueOf(ab5Var.c));
                                                    Throwable a = hm5.a(obj);
                                                    if (a != null) {
                                                        str4 = a.getClass().getSimpleName();
                                                    } else {
                                                        str4 = "Unknown";
                                                    }
                                                    u("pending_award_retry_failed", vr4Var, vr4Var2, vr4Var3, new vr4("error", str4));
                                                    if (!z) {
                                                        o85 o85Var = (o85) obj;
                                                        return jg7Var;
                                                    }
                                                    return obj;
                                                }
                                                olVar.R = it2;
                                                olVar.X = ab5Var;
                                                olVar.Y = i4;
                                                olVar.Z = i3;
                                                olVar.f0 = 4;
                                                qf4Var2 = qf4Var;
                                            }
                                        }
                                        return obj3;
                                    }
                                    return jg7Var;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i9 = olVar.Z;
                            int i10 = olVar.Y;
                            ab5 ab5Var5 = olVar.X;
                            Iterator it4 = olVar.R;
                            oi2.Y(obj2);
                            obj = ((hm5) obj2).A;
                            i3 = i9;
                            i4 = i10;
                            str3 = "hardcore";
                            str = "game_id";
                            qf4Var = qf4Var3;
                            ab5Var = ab5Var5;
                            it2 = it4;
                            str2 = "achievement_id";
                            z = obj instanceof em5;
                            if (!z) {
                            }
                        } else {
                            i4 = olVar.Y;
                            ab5Var2 = olVar.X;
                            it2 = olVar.R;
                            oi2.Y(obj2);
                            qf4 qf4Var42 = qf4Var3;
                            u("pending_award_hardcore_discarded", new vr4(str7, new Long(ab5Var2.a)), new vr4(str6, new Long(ab5Var2.b)), new vr4(str5, Boolean.TRUE));
                            str3 = str5;
                            str = str6;
                            str2 = str7;
                            qf4Var2 = qf4Var42;
                            qf4Var3 = qf4Var2;
                            it = it2;
                            str5 = str3;
                            str7 = str2;
                            str6 = str;
                            i6 = 0;
                            i7 = 2;
                            i2 = i4;
                            ol olVar222 = olVar;
                            if (it.hasNext()) {
                            }
                            return jg7Var;
                        }
                    } else {
                        oi2.Y(obj2);
                    }
                } else {
                    oi2.Y(obj2);
                    if (this.g.a().i) {
                        olVar.f0 = 1;
                        obj2 = qf4Var3.a.u(olVar);
                    }
                    return jg7Var;
                }
                it = ((Iterable) obj2).iterator();
                i2 = 0;
                ol olVar2222 = olVar;
                if (it.hasNext()) {
                }
                return jg7Var;
            }
        }
        olVar = new ol(this, s41Var);
        Object obj22 = olVar.d0;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i = olVar.f0;
        int i62 = 0;
        int i72 = 2;
        qf4 qf4Var32 = this.b;
        jg7 jg7Var2 = jg7.a;
        String str52 = "hardcore";
        String str62 = "game_id";
        String str72 = "achievement_id";
        if (i == 0) {
        }
        it = ((Iterable) obj22).iterator();
        i2 = 0;
        ol olVar22222 = olVar;
        if (it.hasNext()) {
        }
        return jg7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #1 {all -> 0x002c, blocks: (B:12:0x0028, B:42:0x0084, B:45:0x008c, B:39:0x0075), top: B:55:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, hb5 hb5Var, s41 s41Var) {
        lk lkVar;
        Object obj;
        int i;
        boolean z;
        try {
            if (s41Var instanceof lk) {
                lkVar = (lk) s41Var;
                int i2 = lkVar.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lkVar.d0 = i2 - Integer.MIN_VALUE;
                    obj = lkVar.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = lkVar.d0;
                    boolean z2 = false;
                    if (i == 0) {
                        if (i == 1) {
                            hb5Var = lkVar.X;
                            str = lkVar.R;
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        if (!qs6.v0(str)) {
                            bk1 bk1Var = this.h;
                            bk1Var.getClass();
                            hb5Var.getClass();
                            synchronized (bk1Var.L) {
                                try {
                                    if (!bk1Var.A) {
                                        mb5 mb5Var = (mb5) bk1Var.B;
                                        if (mb5Var != null) {
                                            if (nb3.k(mb5Var.a, str) && nb3.k(mb5Var.b, hb5Var)) {
                                            }
                                        } else {
                                            bk1Var.B = new mb5(str, hb5Var);
                                        }
                                        z = true;
                                    }
                                    z = false;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (z) {
                                hk hkVar = this.c;
                                lkVar.R = str;
                                lkVar.X = hb5Var;
                                lkVar.d0 = 1;
                                obj = hkVar.b(lkVar);
                                if (obj == x61Var) {
                                    return x61Var;
                                }
                            }
                        }
                        return Boolean.FALSE;
                    }
                    if (!nb3.k(obj, hb5Var)) {
                        z2 = true;
                    } else {
                        this.h.n(str);
                    }
                    return Boolean.valueOf(z2);
                }
            }
            if (i == 0) {
            }
            if (!nb3.k(obj, hb5Var)) {
            }
            return Boolean.valueOf(z2);
        } catch (Throwable th2) {
            this.h.n(str);
            throw th2;
        }
        lkVar = new lk(this, s41Var);
        obj = lkVar.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = lkVar.d0;
        boolean z22 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(hb5 hb5Var, s41 s41Var) {
        mk mkVar;
        int i;
        if (s41Var instanceof mk) {
            mkVar = (mk) s41Var;
            int i2 = mkVar.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mkVar.Z = i2 - Integer.MIN_VALUE;
                Object obj = mkVar.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = mkVar.Z;
                if (i == 0) {
                    if (i == 1) {
                        hb5Var = mkVar.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    mkVar.R = hb5Var;
                    mkVar.Z = 1;
                    obj = this.c.b(mkVar);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return Boolean.valueOf(nb3.k(obj, hb5Var));
            }
        }
        mkVar = new mk(this, s41Var);
        Object obj2 = mkVar.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = mkVar.Z;
        if (i == 0) {
        }
        return Boolean.valueOf(nb3.k(obj2, hb5Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o75 o75Var, boolean z, hb5 hb5Var, s41 s41Var) {
        nk nkVar;
        int i;
        o75 o75Var2;
        hb5 hb5Var2;
        Object obj;
        boolean z2;
        Object B;
        boolean z3;
        cn5 cn5Var;
        if (s41Var instanceof nk) {
            nkVar = (nk) s41Var;
            int i2 = nkVar.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nkVar.e0 = i2 - Integer.MIN_VALUE;
                nk nkVar2 = nkVar;
                Object obj2 = nkVar2.Z;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i = nkVar2.e0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            z3 = nkVar2.Y;
                            oi2.Y(obj2);
                            B = ((hm5) obj2).A;
                            if ((B instanceof em5) && !z3) {
                                cn5Var = this.g;
                                if (cn5Var.a().i && cn5Var.a().i) {
                                    kf4 kf4Var = kf4.NOT_REQUIRED;
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    kf4 kf4Var2 = kf4.CONNECTED;
                                    kf4Var2.getClass();
                                    p21 p21Var = new p21(new af4(null), kf4Var2, false, false, false, false, -1L, -1L, gt0.p1(linkedHashSet));
                                    bk1 bk1Var = new bk1(RetroAchievementsSubmissionWorker.class);
                                    ((yw7) bk1Var.B).j = p21Var;
                                    w10 w10Var = w10.EXPONENTIAL;
                                    w10Var.getClass();
                                    TimeUnit.SECONDS.getClass();
                                    bk1Var.A = true;
                                    yw7 yw7Var = (yw7) bk1Var.B;
                                    yw7Var.l = w10Var;
                                    fa6 fa6Var = yw7.z;
                                    yw7Var.m = gi2.s(60000L, 10000L, 18000000L);
                                    oo4 oo4Var = oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
                                    oo4Var.getClass();
                                    yw7 yw7Var2 = (yw7) bk1Var.B;
                                    yw7Var2.q = true;
                                    yw7Var2.r = oo4Var;
                                    gm4 c = bk1Var.c();
                                    lw7 b = lw7.b(this.f);
                                    b.getClass();
                                    b.a("ra_pending_achievement_submission_worker", y72.APPEND_OR_REPLACE, c);
                                }
                            }
                            return B;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = nkVar2.Y;
                    hb5 hb5Var3 = nkVar2.X;
                    o75 o75Var3 = nkVar2.R;
                    oi2.Y(obj2);
                    z2 = z4;
                    obj = obj2;
                    o75Var2 = o75Var3;
                    hb5Var2 = hb5Var3;
                } else {
                    oi2.Y(obj2);
                    o75Var2 = o75Var;
                    nkVar2.R = o75Var2;
                    nkVar2.X = hb5Var;
                    nkVar2.Y = z;
                    nkVar2.e0 = 1;
                    Object b2 = b(hb5Var, nkVar2);
                    if (b2 != obj3) {
                        hb5Var2 = hb5Var;
                        obj = b2;
                        z2 = z;
                    }
                    return obj3;
                }
                if (((Boolean) obj).booleanValue()) {
                    return new em5(new rj7());
                }
                long j = o75Var2.a;
                long j2 = o75Var2.b;
                nkVar2.R = null;
                nkVar2.X = null;
                nkVar2.Y = z2;
                nkVar2.e0 = 2;
                B = B(j, j2, z2, null, hb5Var2, nkVar2);
                if (B != obj3) {
                    z3 = z2;
                    if (B instanceof em5) {
                        cn5Var = this.g;
                        if (cn5Var.a().i) {
                            kf4 kf4Var3 = kf4.NOT_REQUIRED;
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            kf4 kf4Var22 = kf4.CONNECTED;
                            kf4Var22.getClass();
                            p21 p21Var2 = new p21(new af4(null), kf4Var22, false, false, false, false, -1L, -1L, gt0.p1(linkedHashSet2));
                            bk1 bk1Var2 = new bk1(RetroAchievementsSubmissionWorker.class);
                            ((yw7) bk1Var2.B).j = p21Var2;
                            w10 w10Var2 = w10.EXPONENTIAL;
                            w10Var2.getClass();
                            TimeUnit.SECONDS.getClass();
                            bk1Var2.A = true;
                            yw7 yw7Var3 = (yw7) bk1Var2.B;
                            yw7Var3.l = w10Var2;
                            fa6 fa6Var2 = yw7.z;
                            yw7Var3.m = gi2.s(60000L, 10000L, 18000000L);
                            oo4 oo4Var2 = oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
                            oo4Var2.getClass();
                            yw7 yw7Var22 = (yw7) bk1Var2.B;
                            yw7Var22.q = true;
                            yw7Var22.r = oo4Var2;
                            gm4 c2 = bk1Var2.c();
                            lw7 b3 = lw7.b(this.f);
                            b3.getClass();
                            b3.a("ra_pending_achievement_submission_worker", y72.APPEND_OR_REPLACE, c2);
                        }
                    }
                    return B;
                }
                return obj3;
            }
        }
        nkVar = new nk(this, s41Var);
        nk nkVar22 = nkVar;
        Object obj22 = nkVar22.Z;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i = nkVar22.e0;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final kb5 d(da5 da5Var, List list, boolean z) {
        boolean z2 = this.e.getBoolean("ra_unofficial_enabled", false);
        if (da5Var != null) {
            List list2 = da5Var.e;
            ArrayList arrayList = new ArrayList(ht0.v0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                s75 s75Var = (s75) it.next();
                long j = s75Var.a;
                long j2 = s75Var.b;
                String str = s75Var.c;
                r75 r75Var = s75Var.d;
                URL url = s75Var.e;
                ArrayList arrayList2 = s75Var.f;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    boolean z3 = z2;
                    Object obj = arrayList2.get(i);
                    i++;
                    Iterator it2 = it;
                    n75 n75Var = ((o75) obj).m;
                    int i2 = size;
                    if (n75Var == n75.CORE || (z3 && n75Var == n75.UNOFFICIAL)) {
                        arrayList3.add(obj);
                    }
                    size = i2;
                    z2 = z3;
                    it = it2;
                }
                boolean z4 = z2;
                Iterator it3 = it;
                ArrayList arrayList4 = new ArrayList(ht0.v0(arrayList3, 10));
                int size2 = arrayList3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    o75 o75Var = (o75) arrayList3.get(i3);
                    arrayList4.add(new eb5(o75Var, list.contains(Long.valueOf(o75Var.a)), z));
                    size2 = size2;
                }
                ArrayList arrayList5 = s75Var.g;
                ArrayList arrayList6 = new ArrayList();
                int size3 = arrayList5.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj2 = arrayList5.get(i4);
                    i4++;
                    ArrayList arrayList7 = arrayList4;
                    if (!((ta5) obj2).i) {
                        arrayList6.add(obj2);
                    }
                    arrayList4 = arrayList7;
                }
                arrayList.add(new gb5(j, j2, r75Var, str, url, arrayList4, arrayList6));
                z2 = z4;
                it = it3;
            }
            return new kb5(da5Var.a, da5Var.b, da5Var.c, da5Var.d, arrayList);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:72:0x00f9, B:21:0x0040, B:65:0x00dd, B:67:0x00e6, B:24:0x0049, B:62:0x00c4, B:27:0x0054, B:46:0x0096, B:48:0x009a, B:51:0x00a0, B:53:0x00a4, B:55:0x00aa, B:58:0x00b3, B:75:0x0104, B:43:0x0083), top: B:81:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:72:0x00f9, B:21:0x0040, B:65:0x00dd, B:67:0x00e6, B:24:0x0049, B:62:0x00c4, B:27:0x0054, B:46:0x0096, B:48:0x009a, B:51:0x00a0, B:53:0x00a4, B:55:0x00aa, B:58:0x00b3, B:75:0x0104, B:43:0x0083), top: B:81:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x0031, B:72:0x00f9, B:21:0x0040, B:65:0x00dd, B:67:0x00e6, B:24:0x0049, B:62:0x00c4, B:27:0x0054, B:46:0x0096, B:48:0x009a, B:51:0x00a0, B:53:0x00a4, B:55:0x00aa, B:58:0x00b3, B:75:0x0104, B:43:0x0083), top: B:81:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, String str3, s41 s41Var) {
        ok okVar;
        Object obj;
        x61 x61Var;
        int i;
        boolean z;
        String str4;
        String str5;
        hb5 hb5Var;
        String str6;
        Boolean bool;
        qf4 qf4Var;
        String str7;
        String str8;
        Object obj2;
        try {
            if (s41Var instanceof ok) {
                okVar = (ok) s41Var;
                int i2 = okVar.e0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    okVar.e0 = i2 - Integer.MIN_VALUE;
                    obj = okVar.Z;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = okVar.e0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4) {
                                        obj2 = okVar.Y;
                                        oi2.Y(obj);
                                        obj = obj2;
                                        bool = (Boolean) obj;
                                        bool.getClass();
                                        return bool;
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oi2.Y(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    jk jkVar = this.d;
                                    okVar.R = null;
                                    okVar.X = null;
                                    okVar.Y = obj;
                                    okVar.e0 = 4;
                                    if (jkVar.b(okVar) != x61Var) {
                                        obj2 = obj;
                                        obj = obj2;
                                    }
                                    return x61Var;
                                }
                                bool = (Boolean) obj;
                                bool.getClass();
                                return bool;
                            }
                            String str9 = okVar.X;
                            String str10 = okVar.R;
                            oi2.Y(obj);
                            str8 = str9;
                            str7 = str10;
                            hk hkVar = this.c;
                            okVar.R = null;
                            okVar.X = null;
                            okVar.e0 = 3;
                            xe1 xe1Var = xk1.a;
                            obj = hv.d0(de1.L, new gk(hkVar, str7, str8, null, 0), okVar);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            bool = (Boolean) obj;
                            bool.getClass();
                            return bool;
                        }
                        String str11 = okVar.X;
                        String str12 = okVar.R;
                        oi2.Y(obj);
                        str5 = str11;
                        str4 = str12;
                    } else {
                        oi2.Y(obj);
                        bk1 bk1Var = this.h;
                        bk1Var.getClass();
                        str.getClass();
                        synchronized (bk1Var.L) {
                            if (bk1Var.A) {
                                if (nb3.k((String) bk1Var.R, str)) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        if (!z) {
                            return Boolean.FALSE;
                        }
                        hk hkVar2 = this.c;
                        str4 = str2;
                        okVar.R = str4;
                        str5 = str3;
                        okVar.X = str5;
                        okVar.e0 = 1;
                        obj = hkVar2.b(okVar);
                        if (obj == x61Var) {
                            return x61Var;
                        }
                    }
                    if (!(obj instanceof hb5)) {
                        hb5Var = (hb5) obj;
                    } else {
                        hb5Var = null;
                    }
                    if (hb5Var == null) {
                        str6 = hb5Var.a;
                    } else {
                        str6 = null;
                    }
                    if (nb3.k(str6, str4) && nb3.k(hb5Var.b, str5)) {
                        qf4Var = this.b;
                        okVar.R = str4;
                        okVar.X = str5;
                        okVar.e0 = 2;
                        if (qf4Var.d(okVar) == x61Var) {
                            str7 = str4;
                            str8 = str5;
                            hk hkVar3 = this.c;
                            okVar.R = null;
                            okVar.X = null;
                            okVar.e0 = 3;
                            xe1 xe1Var2 = xk1.a;
                            obj = hv.d0(de1.L, new gk(hkVar3, str7, str8, null, 0), okVar);
                            if (obj == x61Var) {
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                            bool = (Boolean) obj;
                            bool.getClass();
                            return bool;
                        }
                        return x61Var;
                    }
                    bool = Boolean.FALSE;
                    return bool;
                }
            }
            if (i == 0) {
            }
            if (!(obj instanceof hb5)) {
            }
            if (hb5Var == null) {
            }
            if (nb3.k(str6, str4)) {
                qf4Var = this.b;
                okVar.R = str4;
                okVar.X = str5;
                okVar.e0 = 2;
                if (qf4Var.d(okVar) == x61Var) {
                }
            }
            bool = Boolean.FALSE;
            return bool;
        } finally {
            this.h.h();
        }
        okVar = new ok(this, s41Var);
        obj = okVar.Z;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = okVar.e0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x011f, code lost:
        if (r0 == r10) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0354 A[Catch: all -> 0x0359, TryCatch #4 {all -> 0x0359, blocks: (B:132:0x037c, B:134:0x0380, B:136:0x0386, B:122:0x0350, B:124:0x0354, B:114:0x0326, B:116:0x032c, B:119:0x0332, B:128:0x035d), top: B:147:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x003d, blocks: (B:12:0x0038, B:51:0x00f6, B:53:0x00fa, B:48:0x00e0), top: B:150:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0380 A[Catch: all -> 0x0359, TryCatch #4 {all -> 0x0359, blocks: (B:132:0x037c, B:134:0x0380, B:136:0x0386, B:122:0x0350, B:124:0x0354, B:114:0x0326, B:116:0x032c, B:119:0x0332, B:128:0x035d), top: B:147:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0386 A[Catch: all -> 0x0359, TRY_LEAVE, TryCatch #4 {all -> 0x0359, blocks: (B:132:0x037c, B:134:0x0380, B:136:0x0386, B:122:0x0350, B:124:0x0354, B:114:0x0326, B:116:0x032c, B:119:0x0332, B:128:0x035d), top: B:147:0x0326 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0326 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #7 {all -> 0x003d, blocks: (B:12:0x0038, B:51:0x00f6, B:53:0x00fa, B:48:0x00e0), top: B:150:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ff A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v30, types: [em5] */
    /* JADX WARN: Type inference failed for: r5v34, types: [em5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j, String str, kk kkVar, boolean z, s41 s41Var) {
        pk pkVar;
        l61 l61Var;
        l61 l61Var2;
        Object m;
        s83 s83Var;
        kk kkVar2;
        long j2;
        boolean z2;
        da5 da5Var;
        qf4 qf4Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ea5 ea5Var;
        ia5 ia5Var;
        pk pkVar2;
        long j3;
        kk kkVar3;
        int i;
        int i2;
        int i3;
        int i4;
        da5 da5Var2;
        Throwable a;
        s83 s83Var2;
        Throwable th;
        ka5 ka5Var;
        da5 da5Var3;
        ka5 ka5Var2;
        ka5 ka5Var3;
        long j4 = j;
        kk kkVar4 = kkVar;
        boolean z3 = z;
        qf4 qf4Var2 = this.b;
        vm5 vm5Var = qf4Var2.a;
        try {
            try {
                if (s41Var instanceof pk) {
                    pkVar = (pk) s41Var;
                    int i5 = pkVar.k0;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        pkVar.k0 = i5 - Integer.MIN_VALUE;
                        l61Var = pkVar.B;
                        Object obj = pkVar.i0;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        switch (pkVar.k0) {
                            case 0:
                                oi2.Y(obj);
                                if (!z3) {
                                    ia5 ia5Var2 = (ia5) kkVar4.L;
                                    if (ia5Var2 != null) {
                                        s83Var = ia5Var2.b;
                                    } else {
                                        s83Var = null;
                                    }
                                    if (s83Var != null) {
                                        long a2 = u83.a.b().a(ia5Var2.b);
                                        jd1 jd1Var = oq1.B;
                                        if (oq1.c(a2, n16.L(7, uq1.DAYS)) < 0) {
                                            pkVar.X = null;
                                            pkVar.R = j4;
                                            pkVar.d0 = z3;
                                            pkVar.e0 = 0;
                                            pkVar.f0 = 0;
                                            pkVar.k0 = 6;
                                            obj = vm5Var.s(j4, pkVar);
                                            if (obj == x61Var) {
                                                return x61Var;
                                            }
                                            ka5Var3 = (ka5) obj;
                                            if (ka5Var3 == null) {
                                                return ln2.O(ka5Var3);
                                            }
                                            return null;
                                        }
                                    }
                                }
                                pkVar.X = kkVar4;
                                pkVar.R = j4;
                                pkVar.d0 = z3;
                                pkVar.k0 = 1;
                                m = this.a.m(str, pkVar);
                                break;
                            case 1:
                                boolean z4 = pkVar.d0;
                                j4 = pkVar.R;
                                kkVar4 = pkVar.X;
                                oi2.Y(obj);
                                z3 = z4;
                                m = ((hm5) obj).A;
                                if (!(m instanceof em5)) {
                                    try {
                                        oi2.Y(m);
                                        da5Var = (da5) m;
                                        List list = da5Var.e;
                                        ArrayList arrayList4 = new ArrayList(ht0.v0(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            s75 s75Var = (s75) it.next();
                                            s75Var.getClass();
                                            Iterator it2 = it;
                                            long j5 = s75Var.a;
                                            l61Var2 = l61Var;
                                            qf4 qf4Var3 = qf4Var2;
                                            try {
                                                long j6 = s75Var.b;
                                                String str2 = s75Var.c;
                                                String name = s75Var.d.name();
                                                String url = s75Var.e.toString();
                                                url.getClass();
                                                arrayList4.add(new t75(j5, j6, str2, name, url));
                                                it = it2;
                                                qf4Var2 = qf4Var3;
                                                l61Var = l61Var2;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                boolean z5 = z3;
                                                kkVar2 = kkVar4;
                                                j2 = j4;
                                                z2 = z5;
                                                l61Var2.getClass();
                                                yh2.o(l61Var2);
                                                ?? em5Var = new em5(th);
                                                kk kkVar5 = kkVar2;
                                                z3 = z2;
                                                j4 = j2;
                                                kkVar4 = kkVar5;
                                                da5Var2 = em5Var;
                                                da5Var = da5Var2;
                                                a = hm5.a(da5Var);
                                                if (a == null) {
                                                }
                                            }
                                        }
                                        l61Var2 = l61Var;
                                        qf4Var = qf4Var2;
                                        ArrayList arrayList5 = new ArrayList();
                                        Iterator it3 = list.iterator();
                                        while (it3.hasNext()) {
                                            ArrayList arrayList6 = ((s75) it3.next()).f;
                                            Iterator it4 = it3;
                                            ArrayList arrayList7 = new ArrayList(ht0.v0(arrayList6, 10));
                                            int i6 = 0;
                                            for (int size = arrayList6.size(); i6 < size; size = size) {
                                                Object obj2 = arrayList6.get(i6);
                                                i6++;
                                                arrayList7.add(kn2.R((o75) obj2));
                                            }
                                            gt0.A0(arrayList5, arrayList7);
                                            it3 = it4;
                                        }
                                        arrayList = new ArrayList();
                                        Iterator it5 = list.iterator();
                                        while (it5.hasNext()) {
                                            ArrayList arrayList8 = ((s75) it5.next()).g;
                                            ArrayList arrayList9 = arrayList5;
                                            ArrayList arrayList10 = new ArrayList(ht0.v0(arrayList8, 10));
                                            int size2 = arrayList8.size();
                                            int i7 = 0;
                                            while (i7 < size2) {
                                                Object obj3 = arrayList8.get(i7);
                                                i7++;
                                                int i8 = size2;
                                                ta5 ta5Var = (ta5) obj3;
                                                ta5Var.getClass();
                                                arrayList10.add(new va5(ta5Var.a, ta5Var.b, ta5Var.c, ta5Var.d, ta5Var.e, ta5Var.f, ta5Var.g, ta5Var.h, ta5Var.i));
                                                size2 = i8;
                                                arrayList4 = arrayList4;
                                                it5 = it5;
                                                arrayList8 = arrayList8;
                                            }
                                            gt0.A0(arrayList, arrayList10);
                                            arrayList4 = arrayList4;
                                            arrayList5 = arrayList9;
                                            it5 = it5;
                                        }
                                        arrayList2 = arrayList5;
                                        arrayList3 = arrayList4;
                                        long j7 = da5Var.a;
                                        String str3 = da5Var.d;
                                        String str4 = da5Var.b;
                                        String url2 = da5Var.c.toString();
                                        url2.getClass();
                                        ea5Var = new ea5(j7, str3, str4, url2);
                                        ia5 ia5Var3 = (ia5) kkVar4.L;
                                        if (ia5Var3 != null) {
                                            ia5Var = ia5.a(ia5Var3, u83.a.b(), null, null, 13);
                                        } else {
                                            ia5Var = new ia5(kkVar4.B, u83.a.b(), null, null);
                                        }
                                        kkVar4.L = ia5Var;
                                        pkVar.X = kkVar4;
                                        pkVar.Y = da5Var;
                                        pkVar.Z = null;
                                        pkVar.R = j4;
                                        pkVar.d0 = z3;
                                        pkVar.e0 = 0;
                                        pkVar.f0 = 0;
                                        pkVar.g0 = 0;
                                        pkVar.h0 = 0;
                                        pkVar.k0 = 2;
                                        pkVar2 = pkVar;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        l61Var2 = l61Var;
                                    }
                                    try {
                                        pkVar = pkVar2;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        pkVar = pkVar2;
                                        boolean z52 = z3;
                                        kkVar2 = kkVar4;
                                        j2 = j4;
                                        z2 = z52;
                                        l61Var2.getClass();
                                        yh2.o(l61Var2);
                                        ?? em5Var2 = new em5(th);
                                        kk kkVar52 = kkVar2;
                                        z3 = z2;
                                        j4 = j2;
                                        kkVar4 = kkVar52;
                                        da5Var2 = em5Var2;
                                        da5Var = da5Var2;
                                        a = hm5.a(da5Var);
                                        if (a == null) {
                                        }
                                    }
                                    if (qf4Var.E(ea5Var, arrayList3, arrayList2, arrayList, pkVar2) != x61Var) {
                                        j3 = j4;
                                        kkVar3 = kkVar4;
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                        i4 = 0;
                                        try {
                                            pkVar.X = kkVar3;
                                            pkVar.Y = da5Var;
                                            pkVar.Z = null;
                                            pkVar.R = j3;
                                            pkVar.d0 = z3;
                                            pkVar.e0 = i4;
                                            pkVar.f0 = i3;
                                            pkVar.g0 = i2;
                                            pkVar.h0 = i;
                                            pkVar.k0 = 3;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            z2 = z3;
                                            kkVar2 = kkVar3;
                                            j2 = j3;
                                            l61Var2.getClass();
                                            yh2.o(l61Var2);
                                            ?? em5Var22 = new em5(th);
                                            kk kkVar522 = kkVar2;
                                            z3 = z2;
                                            j4 = j2;
                                            kkVar4 = kkVar522;
                                            da5Var2 = em5Var22;
                                            da5Var = da5Var2;
                                            a = hm5.a(da5Var);
                                            if (a == null) {
                                            }
                                        }
                                        if (jg7.a != x61Var) {
                                            z2 = z3;
                                            kkVar2 = kkVar3;
                                            j2 = j3;
                                            kk kkVar6 = kkVar2;
                                            z3 = z2;
                                            j4 = j2;
                                            kkVar4 = kkVar6;
                                            a = hm5.a(da5Var);
                                            if (a == null) {
                                                try {
                                                    ia5 ia5Var4 = (ia5) kkVar4.L;
                                                    if (ia5Var4 != null) {
                                                        s83Var2 = ia5Var4.b;
                                                    } else {
                                                        s83Var2 = null;
                                                    }
                                                    if (s83Var2 != null) {
                                                        pkVar.X = null;
                                                        pkVar.Y = null;
                                                        pkVar.Z = null;
                                                        pkVar.R = j4;
                                                        pkVar.d0 = z3;
                                                        pkVar.e0 = 0;
                                                        pkVar.f0 = 0;
                                                        pkVar.g0 = 0;
                                                        pkVar.h0 = 0;
                                                        pkVar.k0 = 4;
                                                        obj = vm5Var.s(j4, pkVar);
                                                        if (obj == x61Var) {
                                                        }
                                                        ka5Var = (ka5) obj;
                                                        if (ka5Var == null) {
                                                            da5Var3 = ln2.O(ka5Var);
                                                        } else {
                                                            da5Var3 = null;
                                                        }
                                                        return da5Var3;
                                                    }
                                                    pkVar.X = null;
                                                    pkVar.Y = null;
                                                    pkVar.Z = a;
                                                    pkVar.R = j4;
                                                    pkVar.d0 = z3;
                                                    pkVar.e0 = 0;
                                                    pkVar.f0 = 0;
                                                    pkVar.g0 = 0;
                                                    pkVar.h0 = 0;
                                                    pkVar.k0 = 5;
                                                    obj = vm5Var.s(j4, pkVar);
                                                    if (obj != x61Var) {
                                                        th = a;
                                                        ka5Var2 = (ka5) obj;
                                                        if (ka5Var2 == null) {
                                                            da5Var3 = ln2.O(ka5Var2);
                                                            return da5Var3;
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    l61Var2.getClass();
                                                    yh2.o(l61Var2);
                                                    return new em5(th);
                                                }
                                            } else {
                                                return da5Var;
                                            }
                                        }
                                    }
                                    return x61Var;
                                }
                                l61Var2 = l61Var;
                                Throwable a3 = hm5.a(m);
                                a3.getClass();
                                da5Var2 = new em5(a3);
                                da5Var = da5Var2;
                                a = hm5.a(da5Var);
                                if (a == null) {
                                }
                            case 2:
                                int i9 = pkVar.h0;
                                int i10 = pkVar.g0;
                                int i11 = pkVar.f0;
                                int i12 = pkVar.e0;
                                z3 = pkVar.d0;
                                j3 = pkVar.R;
                                List list2 = (List) pkVar.Z;
                                da5 da5Var4 = pkVar.Y;
                                kkVar3 = pkVar.X;
                                try {
                                    oi2.Y(obj);
                                    l61Var2 = l61Var;
                                    i4 = i12;
                                    i3 = i11;
                                    i2 = i10;
                                    i = i9;
                                    da5Var = da5Var4;
                                    pkVar.X = kkVar3;
                                    pkVar.Y = da5Var;
                                    pkVar.Z = null;
                                    pkVar.R = j3;
                                    pkVar.d0 = z3;
                                    pkVar.e0 = i4;
                                    pkVar.f0 = i3;
                                    pkVar.g0 = i2;
                                    pkVar.h0 = i;
                                    pkVar.k0 = 3;
                                    if (jg7.a != x61Var) {
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    z2 = z3;
                                    l61Var2 = l61Var;
                                    kkVar2 = kkVar3;
                                    j2 = j3;
                                    l61Var2.getClass();
                                    yh2.o(l61Var2);
                                    ?? em5Var222 = new em5(th);
                                    kk kkVar5222 = kkVar2;
                                    z3 = z2;
                                    j4 = j2;
                                    kkVar4 = kkVar5222;
                                    da5Var2 = em5Var222;
                                    da5Var = da5Var2;
                                    a = hm5.a(da5Var);
                                    if (a == null) {
                                    }
                                }
                                return x61Var;
                            case 3:
                                z2 = pkVar.d0;
                                j2 = pkVar.R;
                                List list3 = (List) pkVar.Z;
                                da5Var = pkVar.Y;
                                kkVar2 = pkVar.X;
                                try {
                                    oi2.Y(obj);
                                    l61Var2 = l61Var;
                                    kk kkVar62 = kkVar2;
                                    z3 = z2;
                                    j4 = j2;
                                    kkVar4 = kkVar62;
                                } catch (Throwable th8) {
                                    th = th8;
                                    l61Var2 = l61Var;
                                    l61Var2.getClass();
                                    yh2.o(l61Var2);
                                    ?? em5Var2222 = new em5(th);
                                    kk kkVar52222 = kkVar2;
                                    z3 = z2;
                                    j4 = j2;
                                    kkVar4 = kkVar52222;
                                    da5Var2 = em5Var2222;
                                    da5Var = da5Var2;
                                    a = hm5.a(da5Var);
                                    if (a == null) {
                                    }
                                }
                                a = hm5.a(da5Var);
                                if (a == null) {
                                }
                                break;
                            case 4:
                                Throwable th9 = (Throwable) pkVar.Y;
                                oi2.Y(obj);
                                ka5Var = (ka5) obj;
                                if (ka5Var == null) {
                                }
                                return da5Var3;
                            case 5:
                                th = pkVar.Z;
                                Throwable th10 = (Throwable) pkVar.Y;
                                oi2.Y(obj);
                                ka5Var2 = (ka5) obj;
                                if (ka5Var2 == null) {
                                }
                                break;
                            case 6:
                                oi2.Y(obj);
                                ka5Var3 = (ka5) obj;
                                if (ka5Var3 == null) {
                                }
                                break;
                            default:
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (pkVar.k0) {
                }
            } catch (Throwable th11) {
                th = th11;
                l61Var2 = l61Var;
            }
        } catch (Throwable th12) {
            l61Var.getClass();
            yh2.o(l61Var);
            return new em5(th12);
        }
        pkVar = new pk(this, s41Var);
        l61Var = pkVar.B;
        Object obj4 = pkVar.i0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0288, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022c, code lost:
        if (r0 != null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025e A[Catch: all -> 0x026f, LOOP:1: B:101:0x0258->B:103:0x025e, LOOP_END, TryCatch #3 {all -> 0x026f, blocks: (B:110:0x028b, B:111:0x029c, B:113:0x02a2, B:100:0x0247, B:101:0x0258, B:103:0x025e, B:86:0x0217, B:89:0x021f, B:97:0x022e, B:107:0x0272, B:94:0x0228), top: B:123:0x0217 }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0217 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107 A[Catch: all -> 0x0118, LOOP:3: B:46:0x0101->B:48:0x0107, LOOP_END, TRY_LEAVE, TryCatch #2 {all -> 0x0118, blocks: (B:45:0x00f0, B:46:0x0101, B:48:0x0107, B:42:0x00da), top: B:121:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(long j, boolean z, kk kkVar, boolean z2, s41 s41Var) {
        qk qkVar;
        l61 l61Var;
        l61 l61Var2;
        qf4 qf4Var;
        Object p;
        Object obj;
        boolean z3;
        boolean z4;
        long j2;
        s83 s83Var;
        kk kkVar2;
        ia5 ia5Var;
        kk kkVar3;
        long j3;
        boolean z5;
        boolean z6;
        int i;
        boolean z7;
        Object obj2;
        s83 s83Var2;
        s83 s83Var3;
        kk kkVar4 = kkVar;
        qf4 qf4Var2 = this.b;
        vm5 vm5Var = qf4Var2.a;
        try {
            if (s41Var instanceof qk) {
                qkVar = (qk) s41Var;
                int i2 = qkVar.i0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    qkVar.i0 = i2 - Integer.MIN_VALUE;
                    l61Var = qkVar.B;
                    Object obj3 = qkVar.g0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    switch (qkVar.i0) {
                        case 0:
                            oi2.Y(obj3);
                            if (!z2) {
                                ia5 ia5Var2 = (ia5) kkVar4.L;
                                if (z) {
                                    if (ia5Var2 != null) {
                                        s83Var = ia5Var2.d;
                                        if (s83Var != null) {
                                            long a = u83.a.b().a(s83Var);
                                            jd1 jd1Var = oq1.B;
                                            l61Var2 = l61Var;
                                            qf4Var = qf4Var2;
                                            if (oq1.c(a, n16.L(1, uq1.DAYS)) < 0) {
                                                try {
                                                    qkVar.Z = null;
                                                    qkVar.R = j;
                                                    qkVar.X = z;
                                                    qkVar.Y = z2;
                                                    qkVar.f0 = 0;
                                                    qkVar.i0 = 6;
                                                    obj3 = vm5Var.r(j, z, qkVar);
                                                    if (obj3 == x61Var) {
                                                        return x61Var;
                                                    }
                                                    Iterable<fb5> iterable = (Iterable) obj3;
                                                    ArrayList arrayList = new ArrayList(ht0.v0(iterable, 10));
                                                    for (fb5 fb5Var : iterable) {
                                                        arrayList.add(new Long(fb5Var.b));
                                                    }
                                                    return arrayList;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    l61Var2.getClass();
                                                    yh2.o(l61Var2);
                                                    return new em5(th);
                                                }
                                            }
                                            qkVar.Z = kkVar4;
                                            qkVar.R = j;
                                            qkVar.X = z;
                                            qkVar.Y = z2;
                                            qkVar.i0 = 1;
                                            p = this.a.p(j, z, qkVar);
                                            if (p != x61Var) {
                                                obj = p;
                                                z3 = z;
                                                z4 = z2;
                                                j2 = j;
                                                kkVar2 = kkVar4;
                                                if (!(obj instanceof em5)) {
                                                    List<Number> list = (List) obj;
                                                    ArrayList arrayList2 = new ArrayList(ht0.v0(list, 10));
                                                    for (Number number : list) {
                                                        arrayList2.add(new fb5(j2, number.longValue(), true, z3));
                                                    }
                                                    ia5 ia5Var3 = (ia5) kkVar2.L;
                                                    if (z3) {
                                                        if (ia5Var3 != null) {
                                                            ia5Var = ia5.a(ia5Var3, null, null, u83.a.b(), 7);
                                                        } else {
                                                            ia5Var = new ia5(kkVar2.B, null, null, u83.a.b());
                                                            kkVar2.L = ia5Var;
                                                        }
                                                    } else if (ia5Var3 != null) {
                                                        ia5Var = ia5.a(ia5Var3, null, u83.a.b(), null, 11);
                                                    } else {
                                                        ia5Var = new ia5(kkVar2.B, null, u83.a.b(), null);
                                                        kkVar2.L = ia5Var;
                                                    }
                                                    qkVar.Z = kkVar2;
                                                    qkVar.d0 = obj;
                                                    qkVar.e0 = ia5Var;
                                                    qkVar.R = j2;
                                                    qkVar.X = z3;
                                                    qkVar.Y = z4;
                                                    qkVar.f0 = 0;
                                                    qkVar.i0 = 2;
                                                    if (qf4Var.I(j2, arrayList2, qkVar) != x61Var) {
                                                        kkVar3 = kkVar2;
                                                        j3 = j2;
                                                        z5 = z3;
                                                        z6 = z4;
                                                        i = 0;
                                                        qkVar.Z = kkVar3;
                                                        qkVar.d0 = obj;
                                                        qkVar.e0 = null;
                                                        qkVar.R = j3;
                                                        qkVar.X = z5;
                                                        qkVar.Y = z6;
                                                        qkVar.f0 = i;
                                                        qkVar.i0 = 3;
                                                        if (jg7.a != x61Var) {
                                                            z7 = z5;
                                                            j2 = j3;
                                                            obj2 = obj;
                                                            z4 = z6;
                                                            z3 = z7;
                                                            obj = obj2;
                                                            kkVar2 = kkVar3;
                                                        }
                                                    }
                                                }
                                            }
                                            return x61Var;
                                        }
                                    }
                                    s83Var = null;
                                    if (s83Var != null) {
                                    }
                                } else {
                                    if (ia5Var2 != null) {
                                        s83Var = ia5Var2.c;
                                        if (s83Var != null) {
                                        }
                                    }
                                    s83Var = null;
                                    if (s83Var != null) {
                                    }
                                }
                                if (hm5.a(obj) == null) {
                                    return obj;
                                }
                                try {
                                    ia5 ia5Var4 = (ia5) kkVar2.L;
                                    if (z3) {
                                        if (ia5Var4 != null) {
                                            s83Var3 = ia5Var4.d;
                                        } else {
                                            s83Var3 = null;
                                        }
                                        if (s83Var3 != null) {
                                            qkVar.Z = null;
                                            qkVar.d0 = null;
                                            qkVar.e0 = null;
                                            qkVar.R = j2;
                                            qkVar.X = z3;
                                            qkVar.Y = z4;
                                            qkVar.f0 = 0;
                                            qkVar.i0 = 4;
                                            obj3 = vm5Var.r(j2, z3, qkVar);
                                            if (obj3 == x61Var) {
                                                return x61Var;
                                            }
                                            Iterable<fb5> iterable2 = (Iterable) obj3;
                                            ArrayList arrayList3 = new ArrayList(ht0.v0(iterable2, 10));
                                            for (fb5 fb5Var2 : iterable2) {
                                                arrayList3.add(new Long(fb5Var2.b));
                                            }
                                            return arrayList3;
                                        }
                                        qkVar.Z = null;
                                        qkVar.d0 = null;
                                        qkVar.e0 = null;
                                        qkVar.R = j2;
                                        qkVar.X = z3;
                                        qkVar.Y = z4;
                                        qkVar.f0 = 0;
                                        qkVar.i0 = 5;
                                        obj3 = vm5Var.r(j2, z3, qkVar);
                                        break;
                                    } else if (ia5Var4 != null) {
                                        s83Var2 = ia5Var4.c;
                                        break;
                                    } else {
                                        s83Var2 = null;
                                        break;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    l61Var2.getClass();
                                    yh2.o(l61Var2);
                                    return new em5(th);
                                }
                            }
                            l61Var2 = l61Var;
                            qf4Var = qf4Var2;
                            qkVar.Z = kkVar4;
                            qkVar.R = j;
                            qkVar.X = z;
                            qkVar.Y = z2;
                            qkVar.i0 = 1;
                            p = this.a.p(j, z, qkVar);
                            if (p != x61Var) {
                            }
                            return x61Var;
                        case 1:
                            boolean z8 = qkVar.Y;
                            boolean z9 = qkVar.X;
                            j2 = qkVar.R;
                            kkVar4 = qkVar.Z;
                            oi2.Y(obj3);
                            Object obj4 = ((hm5) obj3).A;
                            z4 = z8;
                            obj = obj4;
                            l61Var2 = l61Var;
                            qf4Var = qf4Var2;
                            z3 = z9;
                            kkVar2 = kkVar4;
                            if (!(obj instanceof em5)) {
                            }
                            if (hm5.a(obj) == null) {
                            }
                            break;
                        case 2:
                            int i3 = qkVar.f0;
                            boolean z10 = qkVar.Y;
                            z5 = qkVar.X;
                            j3 = qkVar.R;
                            Object obj5 = qkVar.d0;
                            kk kkVar5 = qkVar.Z;
                            oi2.Y(obj3);
                            i = i3;
                            z6 = z10;
                            obj = obj5;
                            l61Var2 = l61Var;
                            kkVar3 = kkVar5;
                            qkVar.Z = kkVar3;
                            qkVar.d0 = obj;
                            qkVar.e0 = null;
                            qkVar.R = j3;
                            qkVar.X = z5;
                            qkVar.Y = z6;
                            qkVar.f0 = i;
                            qkVar.i0 = 3;
                            if (jg7.a != x61Var) {
                            }
                            return x61Var;
                        case 3:
                            z6 = qkVar.Y;
                            z7 = qkVar.X;
                            j2 = qkVar.R;
                            obj2 = qkVar.d0;
                            kkVar3 = qkVar.Z;
                            oi2.Y(obj3);
                            l61Var2 = l61Var;
                            z4 = z6;
                            z3 = z7;
                            obj = obj2;
                            kkVar2 = kkVar3;
                            if (hm5.a(obj) == null) {
                            }
                            break;
                        case 4:
                            Throwable th3 = (Throwable) qkVar.e0;
                            oi2.Y(obj3);
                            Iterable<fb5> iterable22 = (Iterable) obj3;
                            ArrayList arrayList32 = new ArrayList(ht0.v0(iterable22, 10));
                            while (r1.hasNext()) {
                            }
                            return arrayList32;
                        case 5:
                            Throwable th4 = (Throwable) qkVar.e0;
                            oi2.Y(obj3);
                            Iterable<fb5> iterable3 = (Iterable) obj3;
                            ArrayList arrayList4 = new ArrayList(ht0.v0(iterable3, 10));
                            for (fb5 fb5Var3 : iterable3) {
                                arrayList4.add(new Long(fb5Var3.b));
                            }
                            return arrayList4;
                        case 6:
                            try {
                                oi2.Y(obj3);
                                l61Var2 = l61Var;
                                Iterable<fb5> iterable4 = (Iterable) obj3;
                                ArrayList arrayList5 = new ArrayList(ht0.v0(iterable4, 10));
                                while (r1.hasNext()) {
                                }
                                return arrayList5;
                            } catch (Throwable th5) {
                                th = th5;
                                l61Var2 = l61Var;
                                l61Var2.getClass();
                                yh2.o(l61Var2);
                                return new em5(th);
                            }
                        default:
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (qkVar.i0) {
            }
        } catch (Throwable th6) {
            th = th6;
            l61Var2 = l61Var;
        }
        qkVar = new qk(this, s41Var);
        l61Var = qkVar.B;
        Object obj32 = qkVar.g0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:22|23))(3:24|25|(1:27))|11|12|(4:14|(1:16)|17|18)(1:20)))|30|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
        r6 = r0.B;
        r6.getClass();
        defpackage.yh2.o(r6);
        r8 = new defpackage.em5(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(long j, s41 s41Var) {
        rk rkVar;
        int i;
        Object em5Var;
        if (s41Var instanceof rk) {
            rkVar = (rk) s41Var;
            int i2 = rkVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rkVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = rkVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = rkVar.Y;
                o75 o75Var = null;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    qf4 qf4Var = this.b;
                    rkVar.Y = 1;
                    obj = qf4Var.a.m(j, rkVar);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                em5Var = (p75) obj;
                if (em5Var instanceof em5) {
                    p75 p75Var = (p75) em5Var;
                    if (p75Var != null) {
                        o75Var = kn2.S(p75Var);
                    }
                    return o75Var;
                }
                return em5Var;
            }
        }
        rkVar = new rk(this, s41Var);
        Object obj2 = rkVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = rkVar.Y;
        o75 o75Var2 = null;
        if (i == 0) {
        }
        em5Var = (p75) obj2;
        if (em5Var instanceof em5) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(long j, s41 s41Var) {
        sk skVar;
        int i;
        t75 t75Var;
        if (s41Var instanceof sk) {
            skVar = (sk) s41Var;
            int i2 = skVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                skVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = skVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = skVar.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    skVar.Y = 1;
                    obj = this.b.a.n(j, skVar);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                t75Var = (t75) obj;
                if (t75Var != null) {
                    return null;
                }
                return new u75(t75Var.a, t75Var.b, t75Var.c, (r75) jw2.o(t75Var.d, r75.values()), new URL(t75Var.e));
            }
        }
        skVar = new sk(this, s41Var);
        Object obj2 = skVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = skVar.Y;
        if (i == 0) {
        }
        t75Var = (t75) obj2;
        if (t75Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0032, B:44:0x00a7, B:45:0x00b8, B:47:0x00be, B:48:0x00cf, B:21:0x0048, B:37:0x008a, B:39:0x008e, B:40:0x0092, B:24:0x0052, B:31:0x0070, B:33:0x0074, B:27:0x005d), top: B:53:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0032, B:44:0x00a7, B:45:0x00b8, B:47:0x00be, B:48:0x00cf, B:21:0x0048, B:37:0x008a, B:39:0x008e, B:40:0x0092, B:24:0x0052, B:31:0x0070, B:33:0x0074, B:27:0x005d), top: B:53:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be A[Catch: all -> 0x0037, LOOP:0: B:45:0x00b8->B:47:0x00be, LOOP_END, TryCatch #0 {all -> 0x0037, blocks: (B:14:0x0032, B:44:0x00a7, B:45:0x00b8, B:47:0x00be, B:48:0x00cf, B:21:0x0048, B:37:0x008a, B:39:0x008e, B:40:0x0092, B:24:0x0052, B:31:0x0070, B:33:0x0074, B:27:0x005d), top: B:53:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, boolean z, s41 s41Var) {
        tk tkVar;
        int i;
        int i2;
        int i3;
        fa5 fa5Var;
        int i4;
        boolean z2;
        long j;
        ka5 ka5Var;
        boolean z3;
        da5 da5Var;
        vm5 vm5Var = this.b.a;
        try {
            if (s41Var instanceof tk) {
                tkVar = (tk) s41Var;
                int i5 = tkVar.g0;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    tkVar.g0 = i5 - Integer.MIN_VALUE;
                    Object obj = tkVar.e0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = tkVar.g0;
                    da5 da5Var2 = null;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    z3 = tkVar.X;
                                    da5Var = tkVar.R;
                                    oi2.Y(obj);
                                    Iterable<fb5> iterable = (Iterable) obj;
                                    ArrayList arrayList = new ArrayList(ht0.v0(iterable, 10));
                                    for (fb5 fb5Var : iterable) {
                                        arrayList.add(new Long(fb5Var.b));
                                    }
                                    return d(da5Var, arrayList, z3);
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = tkVar.d0;
                            i2 = tkVar.Z;
                            i4 = tkVar.Y;
                            z2 = tkVar.X;
                            oi2.Y(obj);
                            ka5Var = (ka5) obj;
                            if (ka5Var != null) {
                                da5Var2 = ln2.O(ka5Var);
                            }
                            tkVar.R = da5Var2;
                            tkVar.X = z2;
                            tkVar.Y = i4;
                            tkVar.Z = i2;
                            tkVar.d0 = j;
                            tkVar.g0 = 3;
                            obj = vm5Var.r(j, z2, tkVar);
                            if (obj != x61Var) {
                                z3 = z2;
                                da5Var = da5Var2;
                                Iterable<fb5> iterable2 = (Iterable) obj;
                                ArrayList arrayList2 = new ArrayList(ht0.v0(iterable2, 10));
                                while (r14.hasNext()) {
                                }
                                return d(da5Var, arrayList2, z3);
                            }
                            return x61Var;
                        }
                        int i6 = tkVar.Z;
                        int i7 = tkVar.Y;
                        boolean z4 = tkVar.X;
                        oi2.Y(obj);
                        i2 = i6;
                        i3 = i7;
                        z = z4;
                    } else {
                        oi2.Y(obj);
                        tkVar.X = z;
                        tkVar.Y = 0;
                        tkVar.Z = 0;
                        tkVar.g0 = 1;
                        Object q = vm5Var.q(str, tkVar);
                        if (q != x61Var) {
                            i2 = 0;
                            obj = q;
                            i3 = 0;
                        } else {
                            return x61Var;
                        }
                    }
                    fa5Var = (fa5) obj;
                    if (fa5Var != null) {
                        return null;
                    }
                    long j2 = fa5Var.b;
                    tkVar.X = z;
                    tkVar.Y = i3;
                    tkVar.Z = i2;
                    tkVar.d0 = j2;
                    tkVar.g0 = 2;
                    obj = vm5Var.s(j2, tkVar);
                    if (obj != x61Var) {
                        i4 = i3;
                        z2 = z;
                        j = j2;
                        ka5Var = (ka5) obj;
                        if (ka5Var != null) {
                        }
                        tkVar.R = da5Var2;
                        tkVar.X = z2;
                        tkVar.Y = i4;
                        tkVar.Z = i2;
                        tkVar.d0 = j;
                        tkVar.g0 = 3;
                        obj = vm5Var.r(j, z2, tkVar);
                        if (obj != x61Var) {
                        }
                        return x61Var;
                    }
                    return x61Var;
                }
            }
            if (i == 0) {
            }
            fa5Var = (fa5) obj;
            if (fa5Var != null) {
            }
        } catch (Throwable th) {
            l61 l61Var = tkVar.B;
            l61Var.getClass();
            yh2.o(l61Var);
            return new em5(th);
        }
        tkVar = new tk(this, s41Var);
        Object obj2 = tkVar.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = tkVar.g0;
        da5 da5Var22 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0168, code lost:
        if (r7 == r8) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003f, B:35:0x00ab, B:37:0x00af, B:32:0x009c), top: B:73:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b A[Catch: all -> 0x0051, TRY_ENTER, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004c, B:66:0x016b, B:68:0x016f, B:63:0x015b), top: B:73:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:21:0x004c, B:66:0x016b, B:68:0x016f, B:63:0x015b), top: B:73:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(String str, boolean z, s41 s41Var) {
        uk ukVar;
        l61 l61Var;
        int i;
        String str2;
        Object obj;
        boolean z2;
        SharedPreferences sharedPreferences;
        String str3;
        Object obj2;
        fa5 fa5Var;
        fa5 fa5Var2;
        String str4 = str;
        qf4 qf4Var = this.b;
        vm5 vm5Var = qf4Var.a;
        try {
            try {
                if (s41Var instanceof uk) {
                    ukVar = (uk) s41Var;
                    int i2 = ukVar.e0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ukVar.e0 = i2 - Integer.MIN_VALUE;
                        l61Var = ukVar.B;
                        Object obj3 = ukVar.Z;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i = ukVar.e0;
                        SharedPreferences sharedPreferences2 = this.e;
                        if (i == 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            oi2.Y(obj3);
                                            fa5Var2 = (fa5) obj3;
                                            if (fa5Var2 != null) {
                                                return new ga5(fa5Var2.b);
                                            }
                                            return null;
                                        }
                                        i.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    oi2.Y(obj3);
                                } else {
                                    z2 = ukVar.Y;
                                    obj2 = ukVar.X;
                                    str3 = ukVar.R;
                                    oi2.Y(obj3);
                                    str2 = "ra_hash_library_last_updated";
                                    sharedPreferences = sharedPreferences2;
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.putLong(str2, u83.a.b().b());
                                    edit.apply();
                                    String str5 = str3;
                                    obj = obj2;
                                    str4 = str5;
                                    if (!(obj instanceof em5)) {
                                        obj = (ga5) ((Map) obj).get(str4);
                                    }
                                    if (hm5.a(obj) == null) {
                                        return obj;
                                    }
                                    ukVar.R = null;
                                    ukVar.X = null;
                                    ukVar.Y = z2;
                                    ukVar.e0 = 3;
                                    obj3 = vm5Var.q(str4, ukVar);
                                }
                            } else {
                                z2 = ukVar.Y;
                                str4 = ukVar.R;
                                oi2.Y(obj3);
                                obj = ((hm5) obj3).A;
                                str2 = "ra_hash_library_last_updated";
                                if (!(obj instanceof em5)) {
                                    Map map = (Map) obj;
                                    ArrayList arrayList = new ArrayList(map.size());
                                    for (Map.Entry entry : map.entrySet()) {
                                        arrayList.add(new fa5((String) entry.getKey(), ((ga5) entry.getValue()).a));
                                        sharedPreferences2 = sharedPreferences2;
                                    }
                                    sharedPreferences = sharedPreferences2;
                                    ukVar.R = str4;
                                    ukVar.X = obj;
                                    ukVar.Y = z2;
                                    ukVar.e0 = 2;
                                    if (qf4Var.G(arrayList, ukVar) != x61Var) {
                                        Object obj4 = obj;
                                        str3 = str4;
                                        obj2 = obj4;
                                        SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                        edit2.putLong(str2, u83.a.b().b());
                                        edit2.apply();
                                        String str52 = str3;
                                        obj = obj2;
                                        str4 = str52;
                                    }
                                    return x61Var;
                                }
                                if (!(obj instanceof em5)) {
                                }
                                if (hm5.a(obj) == null) {
                                }
                            }
                        } else {
                            oi2.Y(obj3);
                            if (z) {
                                str2 = "ra_hash_library_last_updated";
                            } else {
                                long j = sharedPreferences2.getLong("ra_hash_library_last_updated", 0L);
                                s83 s83Var = s83.L;
                                long a = u83.a.b().a(bl2.z(j));
                                jd1 jd1Var = oq1.B;
                                str2 = "ra_hash_library_last_updated";
                                if (oq1.c(a, n16.L(1, uq1.DAYS)) <= 0) {
                                    ukVar.R = null;
                                    ukVar.Y = z;
                                    ukVar.e0 = 4;
                                    obj3 = vm5Var.q(str4, ukVar);
                                    if (obj3 == x61Var) {
                                        return x61Var;
                                    }
                                    fa5Var2 = (fa5) obj3;
                                    if (fa5Var2 != null) {
                                    }
                                    return null;
                                }
                            }
                            ukVar.R = str4;
                            ukVar.Y = z;
                            ukVar.e0 = 1;
                            Object n = this.a.n(ukVar);
                            if (n != x61Var) {
                                obj = n;
                                z2 = z;
                                if (!(obj instanceof em5)) {
                                }
                                if (!(obj instanceof em5)) {
                                }
                                if (hm5.a(obj) == null) {
                                }
                            }
                            return x61Var;
                        }
                        fa5Var = (fa5) obj3;
                        if (fa5Var != null) {
                            return new ga5(fa5Var.b);
                        }
                        return null;
                    }
                }
                if (i == 0) {
                }
                fa5Var = (fa5) obj3;
                if (fa5Var != null) {
                }
                return null;
            } catch (Throwable th) {
                l61Var.getClass();
                yh2.o(l61Var);
                return new em5(th);
            }
        } catch (Throwable th2) {
            l61Var.getClass();
            yh2.o(l61Var);
            return new em5(th2);
        }
        ukVar = new uk(this, s41Var);
        l61Var = ukVar.B;
        Object obj32 = ukVar.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ukVar.e0;
        SharedPreferences sharedPreferences22 = this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(String str, s41 s41Var) {
        vk vkVar;
        int i;
        Object k;
        ga5 ga5Var;
        if (s41Var instanceof vk) {
            vkVar = (vk) s41Var;
            int i2 = vkVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vkVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = vkVar.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = vkVar.Y;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    k = ((hm5) obj).A;
                } else {
                    oi2.Y(obj);
                    vkVar.Y = 1;
                    k = k(str, false, vkVar);
                }
                if (k instanceof em5) {
                    k = null;
                }
                ga5Var = (ga5) k;
                if (ga5Var != null) {
                    return null;
                }
                long j = ga5Var.a;
                vkVar.Y = 2;
                Object m = m(j, vkVar);
                if (m == obj2) {
                    return obj2;
                }
                return m;
            }
        }
        vkVar = new vk(this, s41Var);
        Object obj3 = vkVar.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = vkVar.Y;
        if (i == 0) {
        }
        if (k instanceof em5) {
        }
        ga5Var = (ga5) k;
        if (ga5Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(long j, s41 s41Var) {
        wk wkVar;
        int i;
        ea5 ea5Var;
        if (s41Var instanceof wk) {
            wkVar = (wk) s41Var;
            int i2 = wkVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wkVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = wkVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = wkVar.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    wkVar.Y = 1;
                    obj = this.b.a.p(j, wkVar);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                ea5Var = (ea5) obj;
                if (ea5Var != null) {
                    return null;
                }
                return new ja5(ea5Var.c, new URL(ea5Var.d), ea5Var.b);
            }
        }
        wkVar = new wk(this, s41Var);
        Object obj2 = wkVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = wkVar.Y;
        if (i == 0) {
        }
        ea5Var = (ea5) obj2;
        if (ea5Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(long j, s41 s41Var) {
        xk xkVar;
        int i;
        va5 va5Var;
        if (s41Var instanceof xk) {
            xkVar = (xk) s41Var;
            int i2 = xkVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xkVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = xkVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = xkVar.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xkVar.Y = 1;
                    obj = this.b.a.t(j, xkVar);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                va5Var = (va5) obj;
                if (va5Var != null) {
                    return null;
                }
                return new ta5(va5Var.a, va5Var.b, va5Var.c, va5Var.d, va5Var.e, va5Var.f, va5Var.g, va5Var.h, va5Var.i);
            }
        }
        xkVar = new xk(this, s41Var);
        Object obj2 = xkVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = xkVar.Y;
        if (i == 0) {
        }
        va5Var = (va5) obj2;
        if (va5Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(long j, int i, int i2, s41 s41Var) {
        yk ykVar;
        int i3;
        if (s41Var instanceof yk) {
            ykVar = (yk) s41Var;
            int i4 = ykVar.Y;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ykVar.Y = i4 - Integer.MIN_VALUE;
                yk ykVar2 = ykVar;
                Object obj = ykVar2.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i3 = ykVar2.Y;
                if (i3 == 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ykVar2.Y = 1;
                Object o = this.a.o(j, i, i2, ykVar2);
                if (o == x61Var) {
                    return x61Var;
                }
                return o;
            }
        }
        ykVar = new yk(this, s41Var);
        yk ykVar22 = ykVar;
        Object obj2 = ykVar22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i3 = ykVar22.Y;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, boolean z, s41 s41Var) {
        al alVar;
        int i;
        if (s41Var instanceof al) {
            alVar = (al) s41Var;
            int i2 = alVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = alVar.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = alVar.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                alVar.Y = 1;
                Object q = q(str, z, false, alVar);
                if (q == obj2) {
                    return obj2;
                }
                return q;
            }
        }
        alVar = new al(this, s41Var);
        Object obj3 = alVar.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = alVar.Y;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r14 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(String str, boolean z, boolean z2, s41 s41Var) {
        bl blVar;
        int i;
        Object k;
        String str2;
        boolean z3;
        ga5 ga5Var;
        kk kkVar;
        pl plVar;
        Object f;
        boolean z4;
        Object obj;
        Object g;
        boolean z5;
        if (s41Var instanceof bl) {
            blVar = (bl) s41Var;
            int i2 = blVar.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                blVar.h0 = i2 - Integer.MIN_VALUE;
                bl blVar2 = blVar;
                Object obj2 = blVar2.f0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = blVar2.h0;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    z5 = blVar2.d0;
                                    obj = blVar2.Z;
                                    oi2.Y(obj2);
                                    g = ((hm5) obj2).A;
                                    plVar = this;
                                    if (!(g instanceof em5)) {
                                        Throwable a = hm5.a(g);
                                        a.getClass();
                                        return new em5(a);
                                    }
                                    oi2.Y(obj);
                                    oi2.Y(g);
                                    return plVar.d((da5) obj, (List) g, z5);
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            boolean z6 = blVar2.e0;
                            boolean z7 = blVar2.d0;
                            kk kkVar2 = blVar2.Y;
                            ga5 ga5Var2 = blVar2.X;
                            oi2.Y(obj2);
                            z3 = z6;
                            z4 = z7;
                            kkVar = kkVar2;
                            obj = ((hm5) obj2).A;
                            ga5Var = ga5Var2;
                            plVar = this;
                            if (!(obj instanceof em5)) {
                                Throwable a2 = hm5.a(obj);
                                a2.getClass();
                                return new em5(a2);
                            }
                            long j = ga5Var.a;
                            blVar2.R = null;
                            blVar2.X = null;
                            blVar2.Y = null;
                            blVar2.Z = obj;
                            blVar2.d0 = z4;
                            blVar2.e0 = z3;
                            blVar2.h0 = 4;
                            g = plVar.g(j, z4, kkVar, z3, blVar2);
                            if (g != x61Var) {
                                z5 = z4;
                                if (!(g instanceof em5)) {
                                }
                            }
                            return x61Var;
                        }
                        boolean z8 = blVar2.e0;
                        z = blVar2.d0;
                        ga5Var = blVar2.X;
                        String str3 = blVar2.R;
                        oi2.Y(obj2);
                        z3 = z8;
                        str2 = str3;
                        long j2 = ga5Var.a;
                        kkVar = new kk((ia5) obj2, j2, 0);
                        blVar2.R = null;
                        blVar2.X = ga5Var;
                        blVar2.Y = kkVar;
                        blVar2.d0 = z;
                        blVar2.e0 = z3;
                        blVar2.h0 = 3;
                        plVar = this;
                        f = plVar.f(j2, str2, kkVar, z3, blVar2);
                        if (f != x61Var) {
                            z4 = z;
                            obj = f;
                            if (!(obj instanceof em5)) {
                            }
                        }
                        return x61Var;
                    }
                    z2 = blVar2.e0;
                    z = blVar2.d0;
                    str = blVar2.R;
                    oi2.Y(obj2);
                    k = ((hm5) obj2).A;
                } else {
                    oi2.Y(obj2);
                    blVar2.R = str;
                    blVar2.d0 = z;
                    blVar2.e0 = z2;
                    blVar2.h0 = 1;
                    k = k(str, z2, blVar2);
                }
                if (!(k instanceof em5)) {
                    Throwable a3 = hm5.a(k);
                    a3.getClass();
                    return new em5(a3);
                }
                oi2.Y(k);
                ga5 ga5Var3 = (ga5) k;
                if (ga5Var3 == null) {
                    return null;
                }
                blVar2.R = str;
                blVar2.X = ga5Var3;
                blVar2.d0 = z;
                blVar2.e0 = z2;
                blVar2.h0 = 2;
                if (x61Var != null) {
                    str2 = str;
                    z3 = z2;
                    ga5Var = ga5Var3;
                    obj2 = null;
                    long j22 = ga5Var.a;
                    kkVar = new kk((ia5) obj2, j22, 0);
                    blVar2.R = null;
                    blVar2.X = ga5Var;
                    blVar2.Y = kkVar;
                    blVar2.d0 = z;
                    blVar2.e0 = z3;
                    blVar2.h0 = 3;
                    plVar = this;
                    f = plVar.f(j22, str2, kkVar, z3, blVar2);
                    if (f != x61Var) {
                    }
                }
                return x61Var;
            }
        }
        blVar = new bl(this, s41Var);
        bl blVar22 = blVar;
        Object obj22 = blVar22.f0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = blVar22.h0;
        if (i == 0) {
        }
        if (!(k instanceof em5)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:32|33))(3:34|35|(1:37))|12|(3:25|(3:28|(1:30)|26)|31)|16|17|18|(2:20|21)(1:23)))|40|6|7|(0)(0)|12|(1:14)|25|(1:26)|31|16|17|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        r4 = new defpackage.em5(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e A[Catch: all -> 0x006f, TryCatch #0 {all -> 0x006f, blocks: (B:12:0x0025, B:20:0x0042, B:22:0x0049, B:30:0x006a, B:25:0x0054, B:26:0x0058, B:28:0x005e, B:17:0x0033), top: B:38:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable r(long j, long j2, boolean z, s41 s41Var) {
        cl clVar;
        int i;
        Serializable em5Var;
        Iterable iterable;
        Iterator it;
        if (s41Var instanceof cl) {
            clVar = (cl) s41Var;
            int i2 = clVar.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                clVar.Z = i2 - Integer.MIN_VALUE;
                Object obj = clVar.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = clVar.Z;
                boolean z2 = true;
                if (i == 0) {
                    if (i == 1) {
                        j2 = clVar.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    qf4 qf4Var = this.b;
                    clVar.R = j2;
                    clVar.Z = 1;
                    obj = qf4Var.a.r(j, z, clVar);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                iterable = (Iterable) obj;
                if ((iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        if (((fb5) it.next()).b == j2) {
                            break;
                        }
                    }
                }
                z2 = false;
                em5Var = Boolean.valueOf(z2);
                Boolean bool = Boolean.FALSE;
                if (!(em5Var instanceof em5)) {
                    return bool;
                }
                return em5Var;
            }
        }
        clVar = new cl(this, s41Var);
        Object obj2 = clVar.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = clVar.Z;
        boolean z22 = true;
        if (i == 0) {
        }
        iterable = (Iterable) obj2;
        if (iterable instanceof Collection) {
        }
        it = iterable.iterator();
        while (it.hasNext()) {
        }
        z22 = false;
        em5Var = Boolean.valueOf(z22);
        Boolean bool2 = Boolean.FALSE;
        if (!(em5Var instanceof em5)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(s41 s41Var) {
        dl dlVar;
        int i;
        if (s41Var instanceof dl) {
            dlVar = (dl) s41Var;
            int i2 = dlVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dlVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = dlVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = dlVar.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    dlVar.Y = 1;
                    obj = this.c.b(dlVar);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return Boolean.valueOf(obj instanceof hb5);
            }
        }
        dlVar = new dl(this, s41Var);
        Object obj2 = dlVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = dlVar.Y;
        if (i == 0) {
        }
        return Boolean.valueOf(obj2 instanceof hb5);
    }

    public final void u(String str, vr4... vr4VarArr) {
        if ((this.f.getApplicationInfo().flags & 2) != 0) {
            StringBuilder t = i61.t("event_type=", str, " submit_path=kotlin_api");
            for (vr4 vr4Var : vr4VarArr) {
                String str2 = (String) vr4Var.A;
                Object obj = vr4Var.B;
                if (obj != null) {
                    t.append(' ');
                    t.append(str2);
                    t.append('=');
                    t.append(xs6.d0(obj.toString(), ' ', '_'));
                }
            }
            Log.i("RATrace", t.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:52:0x00d2, B:21:0x0044, B:46:0x00b7, B:22:0x0049, B:36:0x0085, B:38:0x008e, B:40:0x0094, B:42:0x009f, B:51:0x00c9, B:33:0x0075), top: B:59:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x0031, B:52:0x00d2, B:21:0x0044, B:46:0x00b7, B:22:0x0049, B:36:0x0085, B:38:0x008e, B:40:0x0094, B:42:0x009f, B:51:0x00c9, B:33:0x0075), top: B:59:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(String str, String str2, s41 s41Var) {
        el elVar;
        int i;
        bk1 bk1Var;
        Object q;
        hm5 hm5Var;
        String str3;
        int i2;
        jk jkVar;
        hm5 hm5Var2;
        try {
            if (s41Var instanceof el) {
                elVar = (el) s41Var;
                int i3 = elVar.d0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    elVar.d0 = i3 - Integer.MIN_VALUE;
                    Object obj = elVar.Y;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = elVar.d0;
                    bk1Var = this.h;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    hm5Var2 = elVar.R;
                                    oi2.Y(obj);
                                    hm5Var = hm5Var2;
                                    return hm5Var.A;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = elVar.X;
                            hm5Var = elVar.R;
                            oi2.Y(obj);
                            jkVar = this.d;
                            elVar.R = hm5Var;
                            elVar.X = i2;
                            elVar.d0 = 3;
                            if (jkVar.b(elVar) != x61Var) {
                                hm5Var2 = hm5Var;
                                hm5Var = hm5Var2;
                                return hm5Var.A;
                            }
                            return x61Var;
                        }
                        oi2.Y(obj);
                        q = ((hm5) obj).A;
                    } else {
                        oi2.Y(obj);
                        if (!qs6.v0(str) && str2.length() != 0) {
                            if (!bk1Var.p()) {
                                return new em5(new IllegalStateException("RetroAchievements authentication is locked by an active session"));
                            }
                            Log.i("RATrace", "login start");
                            l85 l85Var = this.a;
                            elVar.d0 = 1;
                            q = l85Var.q(str, str2, elVar);
                            if (q == x61Var) {
                                return x61Var;
                            }
                        } else {
                            Log.w("RATrace", "login skipped: blank username or password");
                            return new em5(new IllegalArgumentException("Username and password cannot be blank"));
                        }
                    }
                    hm5Var = new hm5(q);
                    if (!(q instanceof em5)) {
                        Throwable a = hm5.a(q);
                        if (a != null) {
                            str3 = a.getClass().getSimpleName();
                        } else {
                            str3 = "unknown";
                        }
                        Log.w("RATrace", "login failed: ".concat(str3));
                        hk hkVar = this.c;
                        elVar.R = hm5Var;
                        elVar.X = 0;
                        elVar.d0 = 2;
                        if (hkVar.a(elVar) != x61Var) {
                            i2 = 0;
                            jkVar = this.d;
                            elVar.R = hm5Var;
                            elVar.X = i2;
                            elVar.d0 = 3;
                            if (jkVar.b(elVar) != x61Var) {
                            }
                            return x61Var;
                        }
                        return x61Var;
                    }
                    vy7.P(Log.i("RATrace", "login success"));
                    return hm5Var.A;
                }
            }
            if (i == 0) {
            }
            hm5Var = new hm5(q);
            if (!(q instanceof em5)) {
            }
        } finally {
            bk1Var.h();
        }
        elVar = new el(this, s41Var);
        Object obj2 = elVar.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = elVar.d0;
        bk1Var = this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
        if (r7.b(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(s41 s41Var) {
        fl flVar;
        x61 x61Var;
        int i;
        bk1 bk1Var;
        hk hkVar;
        try {
            if (s41Var instanceof fl) {
                flVar = (fl) s41Var;
                int i2 = flVar.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flVar.Y = i2 - Integer.MIN_VALUE;
                    Object obj = flVar.R;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = flVar.Y;
                    bk1Var = this.h;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    oi2.Y(obj);
                                    bk1Var.h();
                                    return Boolean.TRUE;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oi2.Y(obj);
                            jk jkVar = this.d;
                            flVar.Y = 3;
                        } else {
                            oi2.Y(obj);
                        }
                    } else {
                        oi2.Y(obj);
                        if (!bk1Var.p()) {
                            return Boolean.FALSE;
                        }
                        qf4 qf4Var = this.b;
                        flVar.Y = 1;
                        if (qf4Var.d(flVar) == x61Var) {
                            return x61Var;
                        }
                    }
                    hkVar = this.c;
                    flVar.Y = 2;
                    if (hkVar.a(flVar) == x61Var) {
                        return x61Var;
                    }
                    jk jkVar2 = this.d;
                    flVar.Y = 3;
                }
            }
            if (i == 0) {
            }
            hkVar = this.c;
            flVar.Y = 2;
            if (hkVar.a(flVar) == x61Var) {
            }
            jk jkVar22 = this.d;
            flVar.Y = 3;
        } catch (Throwable th) {
            bk1Var.h();
            throw th;
        }
        flVar = new fl(this, s41Var);
        Object obj2 = flVar.R;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = flVar.Y;
        bk1Var = this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(String str, boolean z, s41 s41Var) {
        hl hlVar;
        int i;
        if (s41Var instanceof hl) {
            hlVar = (hl) s41Var;
            int i2 = hlVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hlVar.Y = i2 - Integer.MIN_VALUE;
                Object obj = hlVar.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = hlVar.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                hlVar.Y = 1;
                Object q = q(str, z, true, hlVar);
                if (q == obj2) {
                    return obj2;
                }
                return q;
            }
        }
        hlVar = new hl(this, s41Var);
        Object obj3 = hlVar.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = hlVar.Y;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(s41 s41Var) {
        il ilVar;
        Object obj;
        int i;
        Object r;
        if (s41Var instanceof il) {
            ilVar = (il) s41Var;
            int i2 = ilVar.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ilVar.Y = i2 - Integer.MIN_VALUE;
                obj = ilVar.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ilVar.Y;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            r = ((hm5) obj).A;
                            Throwable a = hm5.a(r);
                            if (a != null) {
                                Log.w("RATrace", "profile refresh failed: ".concat(a.getClass().getSimpleName()));
                            }
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    ilVar.Y = 1;
                    obj = this.c.b(ilVar);
                }
                if (obj instanceof hb5) {
                    ilVar.Y = 2;
                    r = this.a.r(ilVar);
                }
                return jg7Var;
            }
        }
        ilVar = new il(this, s41Var);
        obj = ilVar.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ilVar.Y;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        if (obj instanceof hb5) {
        }
        return jg7Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(String str, boolean z, String str2, s41 s41Var) {
        jl jlVar;
        int i;
        String str3;
        Object obj;
        boolean z2;
        boolean z3;
        ga5 ga5Var;
        boolean z4;
        String str4 = str;
        if (s41Var instanceof jl) {
            jlVar = (jl) s41Var;
            int i2 = jlVar.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jlVar.e0 = i2 - Integer.MIN_VALUE;
                jl jlVar2 = jlVar;
                Object obj2 = jlVar2.Z;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i = jlVar2.e0;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj2);
                            ((hm5) obj2).getClass();
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = jlVar2.Y;
                    String str5 = jlVar2.X;
                    String str6 = jlVar2.R;
                    oi2.Y(obj2);
                    obj = ((hm5) obj2).A;
                    z2 = true;
                    z3 = z5;
                    str4 = str6;
                    str3 = str5;
                } else {
                    oi2.Y(obj2);
                    jlVar2.R = str4;
                    jlVar2.X = str2;
                    jlVar2.Y = z;
                    jlVar2.e0 = 1;
                    Object k = k(str4, false, jlVar2);
                    if (k != obj3) {
                        str3 = str2;
                        obj = k;
                        z2 = true;
                        z3 = z;
                    }
                    return obj3;
                }
                boolean z6 = z2;
                if (obj instanceof em5) {
                    obj = null;
                }
                ga5Var = (ga5) obj;
                if (ga5Var != null) {
                    long j = ga5Var.a;
                    vr4 vr4Var = new vr4("game_hash", str4);
                    vr4 vr4Var2 = new vr4("game_id", new Long(j));
                    vr4 vr4Var3 = new vr4("hardcore", Boolean.valueOf(z3));
                    if (str3 != null && !qs6.v0(str3)) {
                        z4 = false;
                    } else {
                        z4 = z6;
                    }
                    u("session_ping", vr4Var, vr4Var2, vr4Var3, new vr4("rich_presence", Boolean.valueOf(!z4)));
                    jlVar2.R = null;
                    jlVar2.X = null;
                    jlVar2.Y = z3;
                    jlVar2.e0 = 2;
                    if (this.a.s(j, str4, z3, str3, jlVar2) == obj3) {
                        return obj3;
                    }
                }
                return jg7Var;
            }
        }
        jlVar = new jl(this, s41Var);
        jl jlVar22 = jlVar;
        Object obj22 = jlVar22.Z;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i = jlVar22.e0;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        boolean z62 = z2;
        if (obj instanceof em5) {
        }
        ga5Var = (ga5) obj;
        if (ga5Var != null) {
        }
        return jg7Var2;
    }
}
