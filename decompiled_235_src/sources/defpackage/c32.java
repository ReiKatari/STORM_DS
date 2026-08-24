package defpackage;

import defpackage.sz1;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c32  reason: default package */
/* loaded from: classes.dex */
public final class c32 implements ne2 {
    public final /* synthetic */ sz1 A;

    public c32(sz1 sz1Var) {
        this.A = sz1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb  */
    @Override // defpackage.ne2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r41 r41Var) {
        boolean z;
        Object obj2;
        Object obj3;
        Object obj4;
        ws3 ws3Var;
        Object obj5;
        String str;
        l95 l95Var = (l95) obj;
        i95 i95Var = i95.a;
        u85 u85Var = u85.a;
        jg7 jg7Var = jg7.a;
        sz1 sz1Var = this.A;
        vr4 vr4Var = new vr4("event", gh5.a(l95Var.getClass()).c());
        sz1.c cVar = sz1Var.O;
        kd6 kd6Var = sz1Var.c;
        sz1Var.H0("runtime_event_kotlin_received", vr4Var, new vr4("runtime_path", cVar.name()));
        boolean z2 = l95Var instanceof s85;
        if (z2) {
            LinkedHashMap linkedHashMap = sz1Var.X;
            long j = ((s85) l95Var).a;
            z = z2;
            linkedHashMap.put(Long.valueOf(j), Long.valueOf(System.currentTimeMillis()));
            sz1Var.H0("runtime_event_achievement_triggered", new vr4("achievement_id", Long.valueOf(j)));
            obj2 = "reason";
        } else {
            z = z2;
            if (!(l95Var instanceof x85)) {
                obj2 = "reason";
                if (l95Var instanceof v85) {
                    sz1Var.H0("runtime_event_game_completed", new vr4("subset_id", Long.valueOf(((v85) l95Var).a)));
                } else if (l95Var instanceof k95) {
                    sz1Var.H0("runtime_event_subset_completed", new vr4("subset_id", Long.valueOf(((k95) l95Var).a)));
                } else {
                    if (!(l95Var instanceof j95)) {
                        obj3 = "api";
                        obj4 = "leaderboard_id";
                        if (l95Var.equals(u85Var)) {
                            sz1Var.H0("runtime_event_disconnected", new vr4[0]);
                        } else if (l95Var.equals(i95Var)) {
                            sz1Var.H0("runtime_event_reconnected", new vr4[0]);
                        } else if (!(l95Var instanceof p85) && !(l95Var instanceof t85) && !(l95Var instanceof r85) && !(l95Var instanceof q85) && !(l95Var instanceof y85) && !(l95Var instanceof a95) && !(l95Var instanceof z85) && !(l95Var instanceof c95) && !(l95Var instanceof d95) && !(l95Var instanceof w85) && !(l95Var instanceof e95) && !(l95Var instanceof b95) && !(l95Var instanceof f95) && !(l95Var instanceof h95) && !(l95Var instanceof g95)) {
                            i.d();
                            return null;
                        }
                    } else {
                        j95 j95Var = (j95) l95Var;
                        obj3 = "api";
                        obj4 = "leaderboard_id";
                        sz1Var.H0("runtime_event_server_error", new vr4("api", j95Var.a), new vr4("related_id", Long.valueOf(j95Var.b)), new vr4("result_code", Integer.valueOf(j95Var.c)));
                    }
                    if (!(l95Var instanceof p85)) {
                        long j2 = ((p85) l95Var).a;
                        if (((ng6) kd6Var).b.getBoolean("ra_active_challenge_indicators", true)) {
                            hv.L(sz1Var.z, null, null, new g22(sz1Var, j2, null, 0), 3);
                            return jg7Var;
                        }
                    } else if (l95Var instanceof t85) {
                        hv.L(sz1Var.z, null, null, new g22(sz1Var, ((t85) l95Var).a, null, 1), 3);
                        return jg7Var;
                    } else if (z) {
                        long j3 = ((s85) l95Var).a;
                        hv.L(sz1Var.z, null, null, new i22(sz1Var.O, sz1Var, j3, sz1Var.N, null), 3);
                        return jg7Var;
                    } else if (l95Var instanceof r85) {
                        r85 r85Var = (r85) l95Var;
                        if (((ng6) kd6Var).b.getBoolean("ra_progress_indicators", true)) {
                            hv.L(sz1Var.z, null, null, new u12(sz1Var, (Object) r85Var, (r41) null, 2), 3);
                            return jg7Var;
                        }
                    } else if (l95Var instanceof v85) {
                        hv.L(sz1Var.z, null, null, new h22(sz1Var, ((v85) l95Var).a, null, 2), 3);
                        return jg7Var;
                    } else if (l95Var instanceof k95) {
                        hv.L(sz1Var.z, null, null, new h22(sz1Var, ((k95) l95Var).a, null, 2), 3);
                        return jg7Var;
                    } else if (l95Var instanceof j95) {
                        j95 j95Var2 = (j95) l95Var;
                        String str2 = j95Var2.a;
                        vr4 vr4Var2 = new vr4(obj3, str2);
                        long j4 = j95Var2.b;
                        vr4 vr4Var3 = new vr4("related_id", Long.valueOf(j4));
                        int i = j95Var2.c;
                        sz1Var.G0("runtime_server_error", vr4Var2, vr4Var3, new vr4("result_code", Integer.valueOf(i)));
                        sz1Var.H0("runtime_server_error", new vr4(obj3, str2), new vr4("related_id", Long.valueOf(j4)), new vr4("result_code", Integer.valueOf(i)));
                        sz1.c cVar2 = sz1Var.O;
                        if (cVar2 != sz1.c.RC_CLIENT && cVar2 != sz1.c.DISABLED) {
                            if (str2.equalsIgnoreCase("awardachievement") && j4 > 0) {
                                hv.L(sz1Var.z, null, null, new h22(sz1Var, j4, null, 1), 3);
                                return jg7Var;
                            }
                        } else {
                            sz1Var.G0("runtime_server_error_not_owned_by_kotlin", new vr4(obj3, str2), new vr4("related_id", Long.valueOf(j4)), new vr4("result_code", Integer.valueOf(i)), new vr4("kotlin_submit", Boolean.FALSE), new vr4("runtime_path", sz1Var.O.getTraceValue()));
                            return jg7Var;
                        }
                    } else if (l95Var.equals(u85Var)) {
                        sz1Var.H0("runtime_disconnected", new vr4[0]);
                        q33 q33Var = sz1Var.f0;
                        synchronized (q33Var) {
                            q33Var.A = true;
                        }
                        Object f1 = sz1Var.f1(r41Var);
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        if (f1 != x61Var) {
                            f1 = jg7Var;
                        }
                        if (f1 == x61Var) {
                            return f1;
                        }
                    } else if (l95Var.equals(i95Var)) {
                        sz1Var.H0("runtime_reconnected", new vr4[0]);
                        sz1Var.R0();
                        return jg7Var;
                    } else if (!(l95Var instanceof y85) && !(l95Var instanceof a95) && !(l95Var instanceof z85) && !(l95Var instanceof c95) && !(l95Var instanceof d95) && !(l95Var instanceof w85) && !(l95Var instanceof e95) && !(l95Var instanceof b95)) {
                        if (l95Var instanceof x85) {
                            x85 x85Var = (x85) l95Var;
                            us3 us3Var = us3.a;
                            int i2 = wz1.j[sz1Var.O.ordinal()];
                            if (i2 != 1 && i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 == 4) {
                                        ws3Var = ws3.NONE;
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    ws3Var = ws3.LEGACY;
                                }
                            } else {
                                ws3Var = ws3.RC_CLIENT;
                            }
                            ws3Var.getClass();
                            long j5 = x85Var.a;
                            ts3 ts3Var = ts3.a;
                            int i3 = xs3.a[ws3Var.ordinal()];
                            if (i3 != 1 && i3 != 2) {
                                if (i3 == 3) {
                                    obj5 = new vs3(x85Var.c, x85Var.b, j5);
                                } else {
                                    i.d();
                                    return null;
                                }
                            } else {
                                obj5 = ts3Var;
                            }
                            boolean z3 = obj5 instanceof vs3;
                            if (z3) {
                                hv.L(sz1Var.z, null, null, new u12(sz1Var, (Object) x85Var, (Object) ((vs3) obj5), (r41) null, 4), 3);
                            }
                            if (!obj5.equals(us3Var) && !obj5.equals(ts3Var)) {
                                if (!z3) {
                                    i.d();
                                    return null;
                                }
                            } else {
                                vr4 vr4Var4 = new vr4(obj4, Long.valueOf(j5));
                                vr4 vr4Var5 = new vr4("runtime_path", sz1Var.O.getTraceValue());
                                if (ws3Var == ws3.RC_CLIENT) {
                                    str = "rc_client_owns_submit";
                                } else {
                                    str = "no_submit_owner";
                                }
                                sz1Var.C0("leaderboard_legacy_completion_ignored", vr4Var4, vr4Var5, new vr4(obj2, str), new vr4("kotlin_submit", Boolean.FALSE));
                                return jg7Var;
                            }
                        } else {
                            Object obj6 = obj2;
                            if (l95Var instanceof q85) {
                                hv.L(sz1Var.z, null, null, new h22(sz1Var, ((q85) l95Var).a, null, 0), 3);
                                return jg7Var;
                            } else if (l95Var instanceof f95) {
                                Object J = sz1.J(sz1Var, (f95) l95Var, r41Var);
                                if (J == x61.COROUTINE_SUSPENDED) {
                                    return J;
                                }
                            } else if (l95Var instanceof h95) {
                                Object K = sz1.K(sz1Var, (h95) l95Var, r41Var);
                                if (K == x61.COROUTINE_SUSPENDED) {
                                    return K;
                                }
                            } else if (l95Var instanceof g95) {
                                g95 g95Var = (g95) l95Var;
                                long j6 = g95Var.b;
                                long j7 = g95Var.a;
                                nv4 nv4Var = sz1Var.b0;
                                if (nv4Var != null) {
                                    gd5 gd5Var = nv4Var.a;
                                    if (j7 == gd5Var.e && sz1Var.O0(gd5Var)) {
                                        tp6 tp6Var = sz1Var.i0;
                                        tz1 tz1Var = new tz1(j7, j6);
                                        tp6Var.getClass();
                                        tp6Var.m(null, tz1Var);
                                        return jg7Var;
                                    }
                                }
                                sz1Var.G0("ra_pending_barrier_rejected", new vr4("barrier_id", Long.valueOf(j6)), new vr4(obj6, "submission_session_mismatch"));
                                return jg7Var;
                            } else {
                                i.d();
                                return null;
                            }
                        }
                    } else {
                        Object L = sz1.L(sz1Var, l95Var, r41Var);
                        if (L == x61.COROUTINE_SUSPENDED) {
                            return L;
                        }
                    }
                    return jg7Var;
                }
            } else {
                LinkedHashMap linkedHashMap2 = sz1Var.Y;
                x85 x85Var2 = (x85) l95Var;
                long j8 = x85Var2.a;
                linkedHashMap2.put(Long.valueOf(j8), Long.valueOf(System.currentTimeMillis()));
                obj2 = "reason";
                sz1Var.H0("runtime_event_leaderboard_completed", new vr4("leaderboard_id", Long.valueOf(j8)), new vr4("value", Integer.valueOf(x85Var2.b)));
            }
        }
        obj3 = "api";
        obj4 = "leaderboard_id";
        if (!(l95Var instanceof p85)) {
        }
        return jg7Var;
    }
}
