package defpackage;

import java.io.IOException;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vk6  reason: default package */
/* loaded from: classes.dex */
public final class vk6 {
    public final s35 a;
    public final oj4 b;
    public final ck4 c;
    public final on2 d;
    public final eo2 e;
    public final on2 f;

    public vk6(s35 s35Var, oj4 oj4Var, ck4 ck4Var, v34 v34Var) {
        kt5 kt5Var = new kt5(9);
        l56 l56Var = new l56(25, (byte) 0);
        this.a = s35Var;
        this.b = oj4Var;
        this.c = ck4Var;
        this.d = kt5Var;
        this.e = l56Var;
        this.f = v34Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01c4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x03a3 -> B:57:0x03af). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(vk6 vk6Var, long j, boolean z, String str, Long l, s41 s41Var) {
        rk6 rk6Var;
        int i;
        int i2;
        Object obj;
        Long l2;
        bh5 obj2;
        rk6 rk6Var2;
        x61 x61Var;
        Object obj3;
        long j2;
        long j3;
        boolean z2;
        String str2;
        String str3;
        x61 x61Var2;
        long j4;
        Object obj4;
        bh5 bh5Var;
        String str4;
        Object obj5;
        rk6 rk6Var3;
        long j5;
        Long l3;
        boolean z3;
        Object obj6;
        boolean z4;
        boolean z5;
        String str5;
        Throwable th;
        Object obj7;
        rk6 rk6Var4;
        Object obj8;
        Throwable th2;
        String message;
        Object p;
        x61 x61Var3;
        vk6 vk6Var2 = vk6Var;
        if (s41Var instanceof rk6) {
            rk6Var = (rk6) s41Var;
            int i3 = rk6Var.h0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rk6Var.h0 = i3 - Integer.MIN_VALUE;
                Object obj9 = rk6Var.f0;
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                i = rk6Var.h0;
                String str6 = "awardachievement";
                String str7 = "expected_api";
                String str8 = "smart_sync_kotlin_api";
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            long j6 = rk6Var.X;
                            boolean z6 = rk6Var.Y;
                            long j7 = rk6Var.R;
                            bh5 bh5Var2 = rk6Var.e0;
                            Long l4 = rk6Var.d0;
                            String str9 = rk6Var.Z;
                            oi2.Y(obj9);
                            boolean z7 = z6;
                            String str10 = "awardachievement";
                            rk6 rk6Var5 = rk6Var;
                            String str11 = str9;
                            obj3 = "offset_seconds";
                            String str12 = "expected_api";
                            String str13 = "smart_sync_kotlin_api";
                            Object obj10 = "hardcore";
                            bh5 bh5Var3 = bh5Var2;
                            x61 x61Var5 = x61Var4;
                            l3 = l4;
                            jd1 jd1Var = oq1.B;
                            boolean z8 = z7;
                            long min = Math.min(j6 * 2, oq1.e(n16.L(60, uq1.SECONDS)));
                            String str14 = str10;
                            rk6Var2 = rk6Var5;
                            str6 = str14;
                            z2 = z8;
                            j3 = min;
                            str2 = str11;
                            x61Var = x61Var5;
                            j2 = j7;
                            str8 = str13;
                            str7 = str12;
                            obj = obj10;
                            i2 = 1;
                            vk6Var2 = vk6Var;
                            l2 = l3;
                            obj2 = bh5Var3;
                            obj2.A++;
                            vr4 vr4Var = new vr4("achievement_id", new Long(j2));
                            vr4 vr4Var2 = new vr4("submit_path", str8);
                            vr4 vr4Var3 = new vr4(str7, str6);
                            str3 = str6;
                            obj5 = obj;
                            Object obj11 = obj3;
                            obj4 = obj11;
                            vk6Var2.b("smart_sync_award_submit_start", vr4Var, vr4Var2, vr4Var3, new vr4(obj5, Boolean.valueOf(z2)), new vr4("attempt", new Integer(obj2.A)), new vr4(obj11, l2));
                            s35 s35Var = vk6Var2.a;
                            rk6Var2.Z = str2;
                            rk6Var2.d0 = l2;
                            rk6Var2.e0 = obj2;
                            rk6Var2.R = j2;
                            rk6Var2.Y = z2;
                            long j8 = j2;
                            long j9 = j3;
                            rk6Var2.X = j9;
                            rk6Var2.h0 = i2;
                            boolean z9 = z2;
                            String str15 = str2;
                            Long l5 = l2;
                            rk6 rk6Var6 = rk6Var2;
                            p = s35Var.p(j8, z9, str15, l5, rk6Var6);
                            x61Var3 = x61Var;
                            if (p == x61Var3) {
                                return x61Var3;
                            }
                            x61Var2 = x61Var3;
                            j5 = j8;
                            str4 = str15;
                            rk6Var3 = rk6Var6;
                            j4 = j9;
                            obj6 = p;
                            z3 = z9;
                            l3 = l5;
                            bh5Var = obj2;
                            z4 = obj6 instanceof em5;
                            jg7 jg7Var = jg7.a;
                            if (z4) {
                                o85 o85Var = (o85) obj6;
                                vk6Var2.b("smart_sync_award_submit_success", new vr4("achievement_id", new Long(j5)), new vr4("submit_path", str8), new vr4(str7, str3), new vr4(obj5, Boolean.valueOf(z3)), new vr4("attempt", new Integer(bh5Var.A)), new vr4(obj4, l3), new vr4("ra_awarded", Boolean.valueOf(o85Var.a)), new vr4("remaining", new Integer(o85Var.b)));
                                return jg7Var;
                            }
                            Object obj12 = obj4;
                            str10 = str3;
                            Throwable a = hm5.a(obj6);
                            if (a == null) {
                                str5 = str4;
                                z5 = z3;
                                th = new Exception("Unknown error");
                            } else {
                                z5 = z3;
                                str5 = str4;
                                th = a;
                            }
                            if ((th instanceof kh7) && (message = th.getMessage()) != null) {
                                rk6Var4 = rk6Var3;
                                obj7 = obj12;
                                if (qs6.j0(message, "User already has", true)) {
                                    return jg7Var;
                                }
                            } else {
                                obj7 = obj12;
                                rk6Var4 = rk6Var3;
                            }
                            if (th instanceof rj7) {
                                vk6Var2.c("smart_sync_award_unauthenticated", new vr4("achievement_id", new Long(j5)), new vr4(obj5, Boolean.valueOf(z5)));
                                return new em5(th);
                            }
                            if (!(th instanceof IOException)) {
                                if (th.getCause() instanceof IOException) {
                                    th2 = th;
                                    obj8 = obj7;
                                } else {
                                    Throwable th3 = th;
                                    vk6Var2.b("smart_sync_award_submit_failed", new vr4("achievement_id", new Long(j5)), new vr4("submit_path", str8), new vr4(str7, str10), new vr4(obj5, Boolean.valueOf(z5)), new vr4("attempt", new Integer(bh5Var.A)), new vr4(obj7, l3), new vr4("error", th3.getClass().getSimpleName()));
                                    vk6Var2.c("smart_sync_award_failed", new vr4("achievement_id", new Long(j5)), new vr4(obj5, Boolean.valueOf(z5)), new vr4("error", th3.getClass().getSimpleName()));
                                    return new em5(th3);
                                }
                            } else {
                                obj8 = obj7;
                                th2 = th;
                            }
                            if (bh5Var.A >= 5) {
                                vk6Var.b("smart_sync_award_submit_failed", new vr4("achievement_id", new Long(j5)), new vr4("submit_path", str8), new vr4(str7, str10), new vr4(obj5, Boolean.valueOf(z5)), new vr4("attempt", new Integer(bh5Var.A)), new vr4(obj8, l3), new vr4("error", th2.getClass().getSimpleName()));
                                vk6Var.c("smart_sync_award_io_exhausted", new vr4("achievement_id", new Long(j5)), new vr4(obj5, Boolean.valueOf(z5)), new vr4("attempts", new Integer(bh5Var.A)));
                                return new em5(th2);
                            }
                            obj10 = obj5;
                            str12 = str7;
                            long j10 = j4;
                            obj3 = obj8;
                            str13 = str8;
                            vk6Var.c("smart_sync_award_io_retry", new vr4("achievement_id", new Long(j5)), new vr4("attempt", new Integer(bh5Var.A)), new vr4("backoff_ms", new Long(j10)));
                            String str16 = str5;
                            rk6 rk6Var7 = rk6Var4;
                            rk6Var7.Z = str16;
                            rk6Var7.d0 = l3;
                            rk6Var7.e0 = bh5Var;
                            rk6Var7.R = j5;
                            boolean z10 = z5;
                            rk6Var7.Y = z10;
                            rk6Var7.X = j10;
                            rk6Var7.h0 = 2;
                            x61Var5 = x61Var2;
                            if (q60.t(j10, rk6Var7) == x61Var5) {
                                return x61Var5;
                            }
                            long j11 = j5;
                            bh5Var3 = bh5Var;
                            j7 = j11;
                            str11 = str16;
                            z7 = z10;
                            j6 = j10;
                            rk6Var5 = rk6Var7;
                            jd1 jd1Var2 = oq1.B;
                            boolean z82 = z7;
                            long min2 = Math.min(j6 * 2, oq1.e(n16.L(60, uq1.SECONDS)));
                            String str142 = str10;
                            rk6Var2 = rk6Var5;
                            str6 = str142;
                            z2 = z82;
                            j3 = min2;
                            str2 = str11;
                            x61Var = x61Var5;
                            j2 = j7;
                            str8 = str13;
                            str7 = str12;
                            obj = obj10;
                            i2 = 1;
                            vk6Var2 = vk6Var;
                            l2 = l3;
                            obj2 = bh5Var3;
                            obj2.A++;
                            vr4 vr4Var4 = new vr4("achievement_id", new Long(j2));
                            vr4 vr4Var22 = new vr4("submit_path", str8);
                            vr4 vr4Var32 = new vr4(str7, str6);
                            str3 = str6;
                            obj5 = obj;
                            Object obj112 = obj3;
                            obj4 = obj112;
                            vk6Var2.b("smart_sync_award_submit_start", vr4Var4, vr4Var22, vr4Var32, new vr4(obj5, Boolean.valueOf(z2)), new vr4("attempt", new Integer(obj2.A)), new vr4(obj112, l2));
                            s35 s35Var2 = vk6Var2.a;
                            rk6Var2.Z = str2;
                            rk6Var2.d0 = l2;
                            rk6Var2.e0 = obj2;
                            rk6Var2.R = j2;
                            rk6Var2.Y = z2;
                            long j82 = j2;
                            long j92 = j3;
                            rk6Var2.X = j92;
                            rk6Var2.h0 = i2;
                            boolean z92 = z2;
                            String str152 = str2;
                            Long l52 = l2;
                            rk6 rk6Var62 = rk6Var2;
                            p = s35Var2.p(j82, z92, str152, l52, rk6Var62);
                            x61Var3 = x61Var;
                            if (p == x61Var3) {
                            }
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        long j12 = rk6Var.X;
                        boolean z11 = rk6Var.Y;
                        long j13 = rk6Var.R;
                        bh5 bh5Var4 = rk6Var.e0;
                        Long l6 = rk6Var.d0;
                        String str17 = rk6Var.Z;
                        oi2.Y(obj9);
                        obj6 = ((hm5) obj9).A;
                        x61Var2 = x61Var4;
                        j4 = j12;
                        str3 = "awardachievement";
                        obj5 = "hardcore";
                        l3 = l6;
                        rk6Var3 = rk6Var;
                        obj4 = "offset_seconds";
                        j5 = j13;
                        bh5Var = bh5Var4;
                        z3 = z11;
                        str4 = str17;
                        z4 = obj6 instanceof em5;
                        jg7 jg7Var2 = jg7.a;
                        if (z4) {
                        }
                    }
                } else {
                    i2 = 1;
                    obj = "hardcore";
                    oi2.Y(obj9);
                    l2 = l;
                    obj2 = new Object();
                    rk6Var2 = rk6Var;
                    x61Var = x61Var4;
                    obj3 = "offset_seconds";
                    j2 = j;
                    j3 = 2000;
                    z2 = z;
                    str2 = str;
                    obj2.A++;
                    vr4 vr4Var42 = new vr4("achievement_id", new Long(j2));
                    vr4 vr4Var222 = new vr4("submit_path", str8);
                    vr4 vr4Var322 = new vr4(str7, str6);
                    str3 = str6;
                    obj5 = obj;
                    Object obj1122 = obj3;
                    obj4 = obj1122;
                    vk6Var2.b("smart_sync_award_submit_start", vr4Var42, vr4Var222, vr4Var322, new vr4(obj5, Boolean.valueOf(z2)), new vr4("attempt", new Integer(obj2.A)), new vr4(obj1122, l2));
                    s35 s35Var22 = vk6Var2.a;
                    rk6Var2.Z = str2;
                    rk6Var2.d0 = l2;
                    rk6Var2.e0 = obj2;
                    rk6Var2.R = j2;
                    rk6Var2.Y = z2;
                    long j822 = j2;
                    long j922 = j3;
                    rk6Var2.X = j922;
                    rk6Var2.h0 = i2;
                    boolean z922 = z2;
                    String str1522 = str2;
                    Long l522 = l2;
                    rk6 rk6Var622 = rk6Var2;
                    p = s35Var22.p(j822, z922, str1522, l522, rk6Var622);
                    x61Var3 = x61Var;
                    if (p == x61Var3) {
                    }
                }
            }
        }
        rk6Var = new rk6(vk6Var2, s41Var);
        Object obj92 = rk6Var.f0;
        x61 x61Var42 = x61.COROUTINE_SUSPENDED;
        i = rk6Var.h0;
        String str62 = "awardachievement";
        String str72 = "expected_api";
        String str82 = "smart_sync_kotlin_api";
        if (i == 0) {
        }
    }

    public final void b(String str, vr4... vr4VarArr) {
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
        this.e.o("RASubmission", sb.toString());
    }

    public final void c(String str, vr4... vr4VarArr) {
        StringBuilder t = i61.t("event_type=", str, " submit_path=smart_sync_engine");
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
        this.e.o("RATrace", t.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, Set set, s41 s41Var) {
        sk6 sk6Var;
        int i;
        if (s41Var instanceof sk6) {
            sk6Var = (sk6) s41Var;
            int i2 = sk6Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sk6Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = sk6Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = sk6Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    tk6 tk6Var = new tk6(this, set, str2, str, null);
                    sk6Var.Y = 1;
                    obj = hv.d0(de1Var, tk6Var, sk6Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return ((hm5) obj).A;
            }
        }
        sk6Var = new sk6(this, s41Var);
        Object obj2 = sk6Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = sk6Var.Y;
        if (i == 0) {
        }
        return ((hm5) obj2).A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, s41 s41Var) {
        uk6 uk6Var;
        int i;
        if (s41Var instanceof uk6) {
            uk6Var = (uk6) s41Var;
            int i2 = uk6Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uk6Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = uk6Var.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = uk6Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                Set R = ii2.R(gk4.SOFTCORE);
                uk6Var.Y = 1;
                Object d = d(str, str2, R, uk6Var);
                if (d == obj2) {
                    return obj2;
                }
                return d;
            }
        }
        uk6Var = new uk6(this, s41Var);
        Object obj3 = uk6Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = uk6Var.Y;
        if (i == 0) {
        }
    }
}
