package defpackage;

import defpackage.sz1;
import java.io.Serializable;
import java.util.List;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i22  reason: default package */
/* loaded from: classes.dex */
public final class i22 extends hw6 implements eo2 {
    public o75 X;
    public boolean Y;
    public boolean Z;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ sz1.c f0;
    public final /* synthetic */ sz1 g0;
    public final /* synthetic */ long h0;
    public final /* synthetic */ RARuntimeBridgeConfig i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i22(sz1.c cVar, sz1 sz1Var, long j, RARuntimeBridgeConfig rARuntimeBridgeConfig, r41 r41Var) {
        super(2, r41Var);
        this.f0 = cVar;
        this.g0 = sz1Var;
        this.h0 = j;
        this.i0 = rARuntimeBridgeConfig;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((i22) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        i22 i22Var = new i22(this.f0, this.g0, this.h0, this.i0, r41Var);
        i22Var.e0 = obj;
        return i22Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x010d, code lost:
        if (r0 == r11) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0253, code lost:
        if (r3.a(r4, r6) == r11) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0282, code lost:
        if (r7.f1(r6) == r11) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c9  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        pn5 pn5Var;
        String str;
        Object obj2;
        Object obj3;
        Object obj4;
        Object h;
        boolean z;
        RARuntimeBridgeConfig rARuntimeBridgeConfig;
        i22 i22Var;
        w61 w61Var;
        String str2;
        Object obj5;
        Object obj6;
        Object obj7;
        int i;
        o75 o75Var;
        boolean z2;
        Serializable r;
        boolean z3;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        String str3;
        w61 w61Var2;
        String str4;
        o75 o75Var2;
        boolean z4;
        sz1.b bVar;
        boolean z5;
        String str5;
        String str6;
        pq5 pq5Var;
        String str7;
        hb5 W0;
        Object n;
        o75 o75Var3;
        boolean z6;
        Object value;
        sz1 sz1Var = this.g0;
        pn5 pn5Var2 = sz1Var.g;
        jf4 jf4Var = sz1Var.o;
        sx1 sx1Var = sz1Var.w;
        w61 w61Var3 = (w61) this.e0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.d0;
        RARuntimeBridgeConfig rARuntimeBridgeConfig2 = this.i0;
        sz1.c cVar = this.f0;
        jg7 jg7Var = jg7.a;
        long j = this.h0;
        switch (i2) {
            case 0:
                oi2.Y(obj);
                if (cVar == sz1.c.DISABLED) {
                    sz1Var.h0(j, "runtime_disabled");
                    return jg7Var;
                }
                pn5Var = pn5Var2;
                str = "achievement_submit_expected";
                obj2 = "game_id";
                obj3 = "session_mode";
                obj4 = "hardcore";
                sz1Var.H0("achievement_trigger_received", new vr4("achievement_id", new Long(j)), new vr4("network_mode", sz1Var.G.name()), new vr4("session_mode", sz1Var.H.name()), new vr4("online", Boolean.valueOf(jf4Var.b())));
                this.e0 = w61Var3;
                this.d0 = 1;
                h = ((pl) pn5Var).h(j, this);
                break;
            case 1:
                oi2.Y(obj);
                pn5Var = pn5Var2;
                h = ((hm5) obj).A;
                str = "achievement_submit_expected";
                obj3 = "session_mode";
                obj2 = "game_id";
                obj4 = "hardcore";
                if (h instanceof em5) {
                    h = null;
                }
                o75 o75Var4 = (o75) h;
                if (sz1Var.O == cVar && sz1Var.N == rARuntimeBridgeConfig2) {
                    boolean z7 = ((ng6) sz1Var.c).b.getBoolean("ra_encore_enabled", false);
                    if (!z7 && o75Var4 != null) {
                        boolean z8 = sx1Var.a;
                        long j2 = o75Var4.b;
                        this.e0 = w61Var3;
                        this.X = o75Var4;
                        this.Y = z7;
                        this.Z = z8;
                        this.d0 = 2;
                        rARuntimeBridgeConfig = rARuntimeBridgeConfig2;
                        z = z7;
                        i22Var = this;
                        z2 = z8;
                        w61Var = w61Var3;
                        i = 2;
                        str2 = str;
                        obj5 = obj2;
                        obj6 = obj3;
                        r = ((pl) pn5Var).r(j2, this.h0, z2, i22Var);
                        if (r != x61Var) {
                            o75Var = o75Var4;
                            if (!((Boolean) r).booleanValue()) {
                                sz1Var.H0("achievement_trigger_suppressed", new vr4("achievement_id", new Long(j)), new vr4("reason", "already_unlocked_no_encore"), new vr4(obj4, Boolean.valueOf(z2)));
                                sz1Var.h0(j, "already_unlocked_no_encore");
                                return jg7Var;
                            }
                            obj7 = obj4;
                            z3 = z;
                            if (cVar == sz1.c.RC_CLIENT) {
                            }
                        }
                        return x61Var;
                    }
                    z = z7;
                    rARuntimeBridgeConfig = rARuntimeBridgeConfig2;
                    i22Var = this;
                    w61Var = w61Var3;
                    str2 = str;
                    obj5 = obj2;
                    obj6 = obj3;
                    obj7 = obj4;
                    i = 2;
                    o75Var = o75Var4;
                    z3 = z;
                    if (cVar == sz1.c.RC_CLIENT) {
                        obj8 = "game_hash";
                        obj9 = "expected_api";
                        obj10 = "submit_path";
                        obj11 = obj5;
                        str3 = str2;
                        if (sz1Var.G == sz1.b.ONLINE_LIVE && !jf4Var.a()) {
                            w61Var2 = w61Var;
                            i22Var.e0 = w61Var2;
                            i22Var.X = o75Var;
                            i22Var.Y = z3;
                            i22Var.d0 = 4;
                            break;
                        } else {
                            w61Var2 = w61Var;
                        }
                        o75Var2 = o75Var;
                        z4 = z3;
                        bVar = sz1Var.G;
                        Object obj12 = obj8;
                        if (bVar != sz1.b.OFFLINE_ACCUMULATING || bVar == sz1.b.RECONCILING_RA_SUBMISSIONS) {
                            z5 = false;
                            if (sz1Var.I && o75Var2 != null) {
                                z5 = true;
                            }
                            vr4 vr4Var = new vr4("achievement_id", new Long(j));
                            if (!z5) {
                                str5 = "hardcore_memory_queue";
                            } else {
                                str5 = "offline_ledger";
                            }
                            vr4 vr4Var2 = new vr4(obj10, str5);
                            if (!z5) {
                                str6 = "awardachievement_retry_in_session";
                            } else {
                                str6 = "awardachievement_after_smart_sync";
                            }
                            vr4 vr4Var3 = new vr4(obj9, str6);
                            vr4 vr4Var4 = new vr4("pending_sync", Boolean.TRUE);
                            vr4 vr4Var5 = new vr4(obj11, sz1Var.L);
                            pq5Var = sz1Var.n1;
                            if (pq5Var == null) {
                                str7 = pq5Var.i;
                            } else {
                                str7 = null;
                            }
                            sz1Var.G0(str3, vr4Var, vr4Var2, vr4Var3, vr4Var4, vr4Var5, new vr4(obj12, str7), new vr4(obj7, Boolean.valueOf(z5)));
                            sz1Var.H0("achievement_trigger_offline_queued", new vr4("achievement_id", new Long(j)), new vr4(obj6, sz1Var.H.name()));
                            sz1Var.h0(j, "offline_queued");
                            W0 = sz1.W0(rARuntimeBridgeConfig);
                            i22Var.e0 = null;
                            i22Var.X = null;
                            i22Var.Y = z4;
                            i22Var.d0 = 5;
                            if (sz1.B(sz1Var, i22Var.h0, o75Var2, W0, i22Var) != x61Var) {
                                return jg7Var;
                            }
                        } else if (o75Var2 != null) {
                            boolean z9 = sx1Var.a;
                            i22Var.e0 = w61Var2;
                            i22Var.X = o75Var2;
                            i22Var.Y = z4;
                            i22Var.Z = z9;
                            i22Var.d0 = 6;
                            n = sz1.n(sz1Var, o75Var2, i22Var);
                            if (n != x61Var) {
                                o75Var3 = o75Var2;
                                z6 = z9;
                                if (((Boolean) n).booleanValue()) {
                                    sz1Var.h0(j, "context_mismatch");
                                    return jg7Var;
                                }
                                hb5 W02 = sz1.W0(rARuntimeBridgeConfig);
                                if (W02 == null) {
                                    sz1Var.h0(j, "missing_runtime_authentication");
                                    return jg7Var;
                                }
                                if (z6) {
                                    i22Var.e0 = null;
                                    i22Var.X = null;
                                    i22Var.Y = z4;
                                    i22Var.Z = z6;
                                    i22Var.d0 = 7;
                                    if (sz1Var.u0(o75Var3, W02, i22Var) == x61Var) {
                                    }
                                } else {
                                    sz1Var.H0("achievement_submit_attempt", new vr4("achievement_id", new Long(j)), new vr4(obj7, Boolean.FALSE), new vr4(obj11, sz1Var.L));
                                    ci0 ci0Var = sz1Var.x;
                                    ci0Var.getClass();
                                    o75Var3.getClass();
                                    tp6 tp6Var = (tp6) ci0Var.g;
                                    do {
                                        value = tp6Var.getValue();
                                    } while (!tp6Var.j(value, gt0.U0(new tn5(o75Var3, false, W02, true), (List) value)));
                                    v80 v80Var = (v80) ci0Var.f;
                                    if (v80Var != null) {
                                        v80Var.c(jg7Var);
                                        return jg7Var;
                                    }
                                }
                                return jg7Var;
                            }
                        } else {
                            sz1Var.h0(j, "achievement_missing");
                            return jg7Var;
                        }
                    } else {
                        i6 i6Var = i6.RC_CLIENT;
                        i6Var.getClass();
                        int i3 = j6.a[i6Var.ordinal()];
                        if (i3 != 1) {
                            if (i3 == i) {
                                i.m("rc_client achievement ownership cannot invoke Kotlin submit");
                                return null;
                            }
                            i.d();
                            return null;
                        }
                        h6 h6Var = h6.RUNTIME_OWNS_SUBMIT;
                        if (o75Var != null) {
                            boolean z10 = sx1Var.a;
                            vr4 vr4Var6 = new vr4("achievement_id", new Long(j));
                            vr4 vr4Var7 = new vr4("submit_path", "rc_client_http");
                            vr4 vr4Var8 = new vr4("expected_api", "awardachievement");
                            vr4 vr4Var9 = new vr4(obj5, new Long(o75Var.b));
                            pq5 pq5Var2 = sz1Var.n1;
                            if (pq5Var2 != null) {
                                str4 = pq5Var2.i;
                            } else {
                                str4 = null;
                            }
                            sz1Var.G0(str2, vr4Var6, vr4Var7, vr4Var8, vr4Var9, new vr4("game_hash", str4), new vr4(obj7, Boolean.valueOf(z10)));
                            of6 of6Var = sz1Var.F0;
                            q95 q95Var = new q95(o75Var);
                            i22Var.e0 = null;
                            i22Var.X = null;
                            i22Var.Y = z3;
                            i22Var.Z = z10;
                            i22Var.d0 = 3;
                            break;
                        }
                        sz1Var.h0(j, "owned_by_rc_client");
                        return jg7Var;
                    }
                    return x61Var;
                }
                sz1Var.h0(j, "stale_runtime_event");
                return jg7Var;
            case 2:
                boolean z11 = this.Z;
                boolean z12 = this.Y;
                o75 o75Var5 = this.X;
                oi2.Y(obj);
                z = z12;
                rARuntimeBridgeConfig = rARuntimeBridgeConfig2;
                obj6 = "session_mode";
                obj5 = "game_id";
                obj4 = "hardcore";
                o75Var = o75Var5;
                str2 = "achievement_submit_expected";
                i22Var = this;
                z2 = z11;
                r = obj;
                w61Var = w61Var3;
                i = 2;
                if (!((Boolean) r).booleanValue()) {
                }
                break;
            case 3:
                oi2.Y(obj);
                sz1Var.h0(j, "owned_by_rc_client");
                return jg7Var;
            case 4:
                z3 = this.Y;
                o75Var = this.X;
                oi2.Y(obj);
                str3 = "achievement_submit_expected";
                rARuntimeBridgeConfig = rARuntimeBridgeConfig2;
                obj6 = "session_mode";
                obj11 = "game_id";
                w61Var2 = w61Var3;
                obj8 = "game_hash";
                obj9 = "expected_api";
                obj10 = "submit_path";
                i22Var = this;
                obj7 = "hardcore";
                o75Var2 = o75Var;
                z4 = z3;
                bVar = sz1Var.G;
                Object obj122 = obj8;
                if (bVar != sz1.b.OFFLINE_ACCUMULATING) {
                    break;
                }
                z5 = false;
                if (sz1Var.I) {
                    z5 = true;
                }
                vr4 vr4Var10 = new vr4("achievement_id", new Long(j));
                if (!z5) {
                }
                vr4 vr4Var22 = new vr4(obj10, str5);
                if (!z5) {
                }
                vr4 vr4Var32 = new vr4(obj9, str6);
                vr4 vr4Var42 = new vr4("pending_sync", Boolean.TRUE);
                vr4 vr4Var52 = new vr4(obj11, sz1Var.L);
                pq5Var = sz1Var.n1;
                if (pq5Var == null) {
                }
                sz1Var.G0(str3, vr4Var10, vr4Var22, vr4Var32, vr4Var42, vr4Var52, new vr4(obj122, str7), new vr4(obj7, Boolean.valueOf(z5)));
                sz1Var.H0("achievement_trigger_offline_queued", new vr4("achievement_id", new Long(j)), new vr4(obj6, sz1Var.H.name()));
                sz1Var.h0(j, "offline_queued");
                W0 = sz1.W0(rARuntimeBridgeConfig);
                i22Var.e0 = null;
                i22Var.X = null;
                i22Var.Y = z4;
                i22Var.d0 = 5;
                if (sz1.B(sz1Var, i22Var.h0, o75Var2, W0, i22Var) != x61Var) {
                    return x61Var;
                }
                break;
            case 5:
                oi2.Y(obj);
                return jg7Var;
            case 6:
                z6 = this.Z;
                z4 = this.Y;
                o75 o75Var6 = this.X;
                oi2.Y(obj);
                n = obj;
                rARuntimeBridgeConfig = rARuntimeBridgeConfig2;
                o75Var3 = o75Var6;
                obj11 = "game_id";
                i22Var = this;
                obj7 = "hardcore";
                if (((Boolean) n).booleanValue()) {
                }
                break;
            case 7:
                oi2.Y(obj);
                return jg7Var;
            default:
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
