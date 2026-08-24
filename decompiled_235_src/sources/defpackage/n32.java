package defpackage;

import defpackage.sz1;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n32  reason: default package */
/* loaded from: classes.dex */
public final class n32 extends hw6 implements eo2 {
    public Object X;
    public Throwable Y;
    public RARuntimeBridgeConfig Z;
    public int d0;
    public long e0;
    public int f0;
    public /* synthetic */ Object g0;
    public final /* synthetic */ dh5 h0;
    public final /* synthetic */ sz1 i0;
    public final /* synthetic */ ep2 j0;
    public final /* synthetic */ pq5 k0;
    public final /* synthetic */ dh5 l0;
    public final /* synthetic */ String m0;
    public final /* synthetic */ dh5 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n32(dh5 dh5Var, sz1 sz1Var, ep2 ep2Var, pq5 pq5Var, dh5 dh5Var2, String str, dh5 dh5Var3, r41 r41Var) {
        super(2, r41Var);
        this.h0 = dh5Var;
        this.i0 = sz1Var;
        this.j0 = ep2Var;
        this.k0 = pq5Var;
        this.l0 = dh5Var2;
        this.m0 = str;
        this.n0 = dh5Var3;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((n32) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        n32 n32Var = new n32(this.h0, this.i0, this.j0, this.k0, this.l0, this.m0, this.n0, r41Var);
        n32Var.g0 = obj;
        return n32Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x0825, code lost:
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x027e, code lost:
        if (defpackage.f04.D(r3, r60) == r14) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02be, code lost:
        if (r4 == r14) goto L238;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x07ce  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03e6  */
    /* JADX WARN: Type inference failed for: r11v50, types: [java.lang.Throwable, java.lang.Object, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig] */
    /* JADX WARN: Type inference failed for: r11v54, types: [java.lang.Throwable, java.lang.Object, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig] */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x0677 -> B:153:0x0641). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x0717 -> B:153:0x0641). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:223:0x07ce -> B:224:0x07cf). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x07ef -> B:224:0x07cf). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        char c;
        sz1.c cVar;
        URL url;
        String str;
        Object obj2;
        String str2;
        String str3;
        Object obj3;
        dh5 dh5Var;
        String str4;
        int i;
        sz1 sz1Var;
        ep2 ep2Var;
        of6 of6Var;
        kd6 kd6Var;
        x61 x61Var;
        sx1 sx1Var;
        String str5;
        Object obj4;
        String str6;
        String str7;
        Object obj5;
        dh5 dh5Var2;
        of6 of6Var2;
        String str8;
        w61 w61Var;
        Object h;
        pz1 pz1Var;
        Object b;
        RARuntimeBridgeConfig rARuntimeBridgeConfig;
        RARuntimeBridgeMode rARuntimeBridgeMode;
        of6 of6Var3;
        of6 of6Var4;
        String str9;
        w61 w61Var2;
        Object obj6;
        RARuntimeBridgeConfig rARuntimeBridgeConfig2;
        boolean z;
        ep2 ep2Var2;
        sz1 sz1Var2;
        URL url2;
        of6 of6Var5;
        int i2;
        Object obj7;
        RARuntimeBridgeConfig rARuntimeBridgeConfig3;
        int i3;
        sz1.d dVar;
        sz1.d dVar2;
        q77 q77Var;
        boolean z2;
        Throwable th;
        w61 w61Var3;
        Object obj8;
        of6 of6Var6;
        pq5 pq5Var;
        int i4;
        Object obj9;
        Throwable th2;
        int i5;
        sz1 sz1Var3;
        URL url3;
        of6 of6Var7;
        of6 of6Var8;
        int i6;
        Object obj10;
        de1 de1Var;
        f12 f12Var;
        boolean z3;
        sz1 sz1Var4;
        int i7;
        de5 de5Var;
        bv4 bv4Var;
        long L;
        Object obj11;
        long L2;
        ?? r12;
        hb5 hb5Var;
        of6 of6Var9;
        dh5 dh5Var3;
        RARuntimeBridgeConfig rARuntimeBridgeConfig4;
        of6 of6Var10;
        of6 of6Var11;
        x61 x61Var2;
        sx1 sx1Var2;
        sz1 sz1Var5;
        long j;
        Throwable th3;
        dh5 dh5Var4;
        of6 of6Var12;
        long j2;
        Throwable th4;
        long j3;
        ep2 ep2Var3;
        RARuntimeBridgeConfig rARuntimeBridgeConfig5;
        Object em5Var;
        ?? r11;
        Throwable a;
        long j4;
        Throwable th5;
        ?? r112;
        ep2 ep2Var4 = this.j0;
        URL url4 = ep2Var4.f;
        sz1 sz1Var6 = this.i0;
        of6 of6Var13 = sz1Var6.J0;
        jh jhVar = sz1Var6.v;
        of6 of6Var14 = sz1Var6.N0;
        sx1 sx1Var3 = sz1Var6.w;
        kd6 kd6Var2 = sz1Var6.c;
        w61 w61Var4 = (w61) this.g0;
        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
        int i8 = this.f0;
        dh5 dh5Var5 = this.h0;
        Object obj12 = "error";
        String str10 = this.m0;
        sx1 sx1Var4 = sx1Var3;
        pq5 pq5Var2 = this.k0;
        Object obj13 = jg7.a;
        dh5 dh5Var6 = this.l0;
        switch (i8) {
            case 0:
                oi2.Y(obj);
                int i9 = m32.a[((sz1.b) dh5Var5.A).ordinal()];
                if (i9 != 1 && i9 != 2) {
                    c = 3;
                    if (i9 == 3) {
                        cVar = sz1.c.RC_CLIENT_OFFLINE;
                    } else {
                        i.d();
                        return null;
                    }
                } else {
                    c = 3;
                    cVar = sz1.c.RC_CLIENT;
                }
                url = url4;
                str = "ra_unofficial_enabled";
                obj2 = obj12;
                str2 = "ra_setup_failed";
                str3 = str10;
                obj3 = "runtime_path";
                dh5Var = dh5Var6;
                str4 = "ra_encore_enabled";
                i = 1;
                sz1.F0(sz1Var6, "waiting_for_running", cVar, ep2Var4, null, 24);
                g21 o = sz1.o(sz1Var6);
                this.g0 = w61Var4;
                this.f0 = 1;
                break;
            case 1:
                oi2.Y(obj);
                str4 = "ra_encore_enabled";
                url = url4;
                str = "ra_unofficial_enabled";
                obj2 = obj12;
                str2 = "ra_setup_failed";
                str3 = str10;
                obj3 = "runtime_path";
                dh5Var = dh5Var6;
                i = 1;
                int i10 = m32.a[((sz1.b) dh5Var5.A).ordinal()];
                if (i10 != i && i10 != 2) {
                    if (i10 == 3) {
                        pz1Var = (pz1) this.n0.A;
                        if (pz1Var != null) {
                            sz1Var6.L = new Long(pz1Var.c.b);
                            pn5 pn5Var = sz1Var6.g;
                            this.g0 = w61Var4;
                            this.X = pz1Var;
                            this.f0 = 16;
                            b = ((pl) pn5Var).c.b(this);
                            break;
                        }
                        return obj13;
                    }
                    i.d();
                    return null;
                }
                sz1Var = sz1Var6;
                ep2Var = ep2Var4;
                of6Var = of6Var14;
                kd6Var = kd6Var2;
                x61Var = x61Var3;
                sx1Var = sx1Var4;
                str5 = str4;
                obj4 = obj2;
                str6 = str2;
                str7 = str3;
                obj5 = obj3;
                dh5Var2 = dh5Var;
                of6Var2 = of6Var13;
                str8 = str;
                this.g0 = w61Var4;
                w61Var = w61Var4;
                this.f0 = 2;
                h = sz1.h(sz1Var, pq5Var2, (uz1) dh5Var2.A, this);
                if (h == x61Var) {
                    return x61Var;
                }
                rARuntimeBridgeConfig = (RARuntimeBridgeConfig) h;
                if (rARuntimeBridgeConfig == null) {
                    rARuntimeBridgeMode = rARuntimeBridgeConfig.getRuntimeMode();
                } else {
                    rARuntimeBridgeMode = null;
                }
                of6Var3 = of6Var2;
                if (rARuntimeBridgeMode == RARuntimeBridgeMode.RC_CLIENT_ONLINE) {
                    sz1Var.N = null;
                    sz1Var.O = sz1.c.DISABLED;
                    sz1.R(sz1Var, str7, "missing_runtime_config");
                    sz1Var.H0(str6, new vr4(obj5, sz1Var.O.name()), new vr4(obj4, "missing_rc_client_config"));
                    sx1Var.d(dp2.DISABLED_LOAD_ERROR);
                    of6Var.k(new la5(url));
                    return obj13;
                }
                sz1Var.N = rARuntimeBridgeConfig;
                sz1.c cVar2 = sz1.c.RC_CLIENT;
                sz1Var.O = cVar2;
                sz1Var6 = sz1Var;
                of6Var4 = of6Var;
                str9 = str6;
                ep2 ep2Var5 = ep2Var;
                w61Var2 = w61Var;
                obj6 = obj5;
                sx1Var4 = sx1Var;
                obj12 = obj4;
                rARuntimeBridgeConfig2 = rARuntimeBridgeConfig;
                sz1.F0(sz1Var6, "running_state_ready", cVar2, ep2Var5, rARuntimeBridgeConfig2, 16);
                vr4 vr4Var = new vr4(obj6, sz1Var6.O.name());
                vr4 vr4Var2 = new vr4("encore", Boolean.valueOf(((ng6) kd6Var).b.getBoolean(str5, false)));
                if (((uz1) dh5Var2.A).b == sz1.d.HARDCORE) {
                    z = true;
                } else {
                    z = false;
                }
                ep2Var2 = ep2Var5;
                str10 = str7;
                sz1Var6.H0("ra_setup_started", vr4Var, vr4Var2, new vr4("hardcore", Boolean.valueOf(z)), new vr4("unofficial", Boolean.valueOf(((ng6) kd6Var).b.getBoolean(str8, false))), new vr4("game_id", sz1Var6.L));
                this.g0 = w61Var2;
                this.X = rARuntimeBridgeConfig2;
                this.f0 = 3;
                if (sz1.E(sz1Var6, rARuntimeBridgeConfig2, pq5Var2, this) == x61Var) {
                    return x61Var;
                }
                try {
                    ep2Var4 = ep2Var2;
                    try {
                        sz1.F0(sz1Var6, "native_setup_start", sz1Var6.O, ep2Var4, rARuntimeBridgeConfig2, 16);
                        this.g0 = w61Var2;
                        this.X = rARuntimeBridgeConfig2;
                        this.f0 = 4;
                        if (jhVar.k(ep2Var4, rARuntimeBridgeConfig2, this) == x61Var) {
                            return x61Var;
                        }
                        sz1Var6.w.d = false;
                        sz1.F0(sz1Var6, "native_setup_completed", sz1Var6.O, ep2Var4, rARuntimeBridgeConfig2, 16);
                        sz1Var6.H0("ra_setup_completed", new vr4(obj6, sz1Var6.O.name()));
                        if (sz1Var6.O == sz1.c.LEGACY) {
                            hv.L(w61Var2, null, null, new hz1(26, null, sz1Var6), 3);
                        }
                        i3 = 0;
                        sz1Var6.K = false;
                        dVar = ((uz1) dh5Var2.A).b;
                        dVar2 = sz1.d.HARDCORE;
                        if (dVar == dVar2) {
                            q77Var = q77.HARDCORE;
                        } else {
                            q77Var = q77.SOFTCORE;
                        }
                        of6Var3.k(new p77(q77Var, false, false));
                        if (((uz1) dh5Var2.A).b == dVar2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.g0 = w61Var2;
                        this.X = null;
                        this.f0 = 6;
                        if (sz1.m(sz1Var6, ep2Var4, z2, this) == x61Var) {
                            return x61Var;
                        }
                        w61Var3 = w61Var2;
                        if (g04.H(w61Var3)) {
                            if (!sz1Var6.o.a()) {
                                this.g0 = w61Var3;
                                obj8 = null;
                                this.X = null;
                                this.Y = null;
                                this.f0 = 7;
                                if (sz1Var6.f1(this) == x61Var) {
                                    return x61Var;
                                }
                                jd1 jd1Var = oq1.B;
                                L2 = n16.L(15, uq1.SECONDS);
                                this.g0 = w61Var3;
                                this.X = obj8;
                                this.f0 = 8;
                                if (q60.u(L2, this) == x61Var) {
                                    return x61Var;
                                }
                                if (g04.H(w61Var3)) {
                                }
                            } else {
                                i5 = 15;
                                sz1.b bVar = sz1Var6.G;
                                if (bVar == sz1.b.OFFLINE_ACCUMULATING || bVar == sz1.b.RECONCILING_RA_SUBMISSIONS) {
                                    pq5Var = pq5Var2;
                                    of6Var6 = of6Var4;
                                    sz1Var4 = sz1Var6;
                                    url3 = url;
                                    jd1 jd1Var2 = oq1.B;
                                    long L3 = n16.L(5, uq1.SECONDS);
                                    this.g0 = w61Var3;
                                    this.X = null;
                                    this.Y = null;
                                    this.f0 = 9;
                                    if (q60.u(L3, this) == x61Var) {
                                        return x61Var;
                                    }
                                    url = url3;
                                    of6Var4 = of6Var6;
                                    sz1Var6 = sz1Var4;
                                    i3 = 0;
                                    pq5Var2 = pq5Var;
                                    if (g04.H(w61Var3)) {
                                    }
                                } else if (!sz1Var6.K) {
                                    if (((uz1) dh5Var2.A).b == sz1.d.HARDCORE) {
                                        r12 = 1;
                                    } else {
                                        r12 = i3;
                                    }
                                    xe1 xe1Var = xk1.a;
                                    de1 de1Var2 = de1.L;
                                    sz1Var3 = sz1Var6;
                                    url3 = url;
                                    e12 e12Var = new e12(sz1Var3, pq5Var2, r12, null, 2);
                                    pq5Var = pq5Var2;
                                    th2 = null;
                                    this.g0 = w61Var3;
                                    this.X = null;
                                    this.Y = null;
                                    this.d0 = r12;
                                    this.f0 = 10;
                                    obj9 = hv.d0(de1Var2, e12Var, this);
                                    if (obj9 != x61Var) {
                                        w61Var4 = w61Var3;
                                        i4 = r12;
                                        obj11 = ((hm5) obj9).A;
                                        if (obj11 instanceof em5) {
                                            if (hm5.a(obj11) instanceof sj7) {
                                                of6Var4.k(new oa5(url3));
                                                this.g0 = th2;
                                                this.X = th2;
                                                this.Y = th2;
                                                this.d0 = i4;
                                                this.f0 = 11;
                                                if (q60.j(this) == x61Var) {
                                                    return x61Var;
                                                }
                                                e41.c();
                                                return null;
                                            }
                                            of6Var7 = of6Var4;
                                            jd1 jd1Var3 = oq1.B;
                                            long L4 = n16.L(i5, uq1.SECONDS);
                                            this.g0 = w61Var4;
                                            this.X = th2;
                                            this.Y = th2;
                                            this.d0 = i4;
                                            this.f0 = 12;
                                            if (q60.u(L4, this) == x61Var) {
                                                return x61Var;
                                            }
                                            w61Var3 = w61Var4;
                                            url = url3;
                                            pq5Var2 = pq5Var;
                                            of6Var4 = of6Var7;
                                            sz1Var6 = sz1Var3;
                                            if (g04.H(w61Var3)) {
                                            }
                                        } else {
                                            of6Var8 = of6Var4;
                                            sz1Var3.K = true;
                                            jd1 jd1Var4 = oq1.B;
                                            L = n16.L(2, uq1.MINUTES);
                                            this.g0 = w61Var4;
                                            this.X = th2;
                                            this.Y = th2;
                                            this.f0 = 13;
                                            if (q60.u(L, this) == x61Var) {
                                            }
                                            if (((uz1) dh5Var2.A).b == sz1.d.HARDCORE) {
                                            }
                                            if (i6 != 0) {
                                            }
                                        }
                                    } else {
                                        return x61Var;
                                    }
                                } else {
                                    sz1Var3 = sz1Var6;
                                    pq5Var = pq5Var2;
                                    th2 = null;
                                    url3 = url;
                                    of6Var8 = of6Var4;
                                    w61Var4 = w61Var3;
                                    jd1 jd1Var42 = oq1.B;
                                    L = n16.L(2, uq1.MINUTES);
                                    this.g0 = w61Var4;
                                    this.X = th2;
                                    this.Y = th2;
                                    this.f0 = 13;
                                    if (q60.u(L, this) == x61Var) {
                                        return x61Var;
                                    }
                                    if (((uz1) dh5Var2.A).b == sz1.d.HARDCORE) {
                                        i6 = 1;
                                    } else {
                                        i6 = i3;
                                    }
                                    if (i6 != 0) {
                                        nv4 nv4Var = sz1Var3.b0;
                                        if (nv4Var != null && (de5Var = nv4Var.i) != null && (bv4Var = (bv4) de5Var.A.getValue()) != null) {
                                            i7 = bv4Var.c.a;
                                        } else {
                                            i7 = i3;
                                        }
                                        if (i7 > 0) {
                                            fd5 fd5Var = fd5.BEFORE_ONLINE_SUBMISSION;
                                            this.g0 = w61Var4;
                                            this.X = th2;
                                            this.d0 = i6;
                                            this.f0 = 14;
                                            if (sz1Var3.d1(fd5Var, this) == x61Var) {
                                                return x61Var;
                                            }
                                        }
                                        obj10 = obj13;
                                        String richPresenceStatus = MelonEmulator.a.getRichPresenceStatus();
                                        xe1 xe1Var2 = xk1.a;
                                        de1Var = de1.L;
                                        of6 of6Var15 = of6Var8;
                                        obj13 = obj10;
                                        if (i6 != 0) {
                                        }
                                        w61 w61Var5 = w61Var4;
                                        of6Var6 = of6Var15;
                                        f12Var = new f12(sz1Var3, this.k0, z3, richPresenceStatus, (r41) null);
                                        sz1Var4 = sz1Var3;
                                        this.g0 = w61Var5;
                                        this.X = th2;
                                        this.Y = th2;
                                        this.d0 = i6;
                                        this.f0 = i5;
                                        if (hv.d0(de1Var, f12Var, this) != x61Var) {
                                        }
                                    } else {
                                        obj10 = obj13;
                                        ((v80) sz1Var3.x.h).c(obj10);
                                        String richPresenceStatus2 = MelonEmulator.a.getRichPresenceStatus();
                                        xe1 xe1Var22 = xk1.a;
                                        de1Var = de1.L;
                                        of6 of6Var152 = of6Var8;
                                        obj13 = obj10;
                                        if (i6 != 0) {
                                            z3 = 1;
                                        } else {
                                            z3 = i3;
                                        }
                                        w61 w61Var52 = w61Var4;
                                        of6Var6 = of6Var152;
                                        f12Var = new f12(sz1Var3, this.k0, z3, richPresenceStatus2, (r41) null);
                                        sz1Var4 = sz1Var3;
                                        this.g0 = w61Var52;
                                        this.X = th2;
                                        this.Y = th2;
                                        this.d0 = i6;
                                        this.f0 = i5;
                                        if (hv.d0(de1Var, f12Var, this) != x61Var) {
                                            w61Var3 = w61Var52;
                                            url = url3;
                                            of6Var4 = of6Var6;
                                            sz1Var6 = sz1Var4;
                                            i3 = 0;
                                            pq5Var2 = pq5Var;
                                            if (g04.H(w61Var3)) {
                                            }
                                        } else {
                                            return x61Var;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        sz1Var2 = sz1Var6;
                        url2 = url;
                        of6Var5 = of6Var4;
                        i2 = 5;
                        obj7 = null;
                        if (sz1Var2.h1(str10, "native_setup_failed", new dz1(sz1Var2, 3))) {
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    sz1Var2 = sz1Var6;
                    ep2Var4 = ep2Var2;
                }
                return obj13;
            case 2:
                oi2.Y(obj);
                ep2Var = ep2Var4;
                of6Var = of6Var14;
                of6Var2 = of6Var13;
                str8 = "ra_unofficial_enabled";
                url = url4;
                kd6Var = kd6Var2;
                x61Var = x61Var3;
                obj4 = obj12;
                str6 = "ra_setup_failed";
                str7 = str10;
                sx1Var = sx1Var4;
                obj5 = "runtime_path";
                dh5Var2 = dh5Var6;
                w61Var = w61Var4;
                str5 = "ra_encore_enabled";
                sz1Var = sz1Var6;
                h = obj;
                rARuntimeBridgeConfig = (RARuntimeBridgeConfig) h;
                if (rARuntimeBridgeConfig == null) {
                }
                of6Var3 = of6Var2;
                if (rARuntimeBridgeMode == RARuntimeBridgeMode.RC_CLIENT_ONLINE) {
                }
                break;
            case 3:
                oi2.Y(obj);
                rARuntimeBridgeConfig2 = (RARuntimeBridgeConfig) this.X;
                ep2Var2 = ep2Var4;
                url = url4;
                of6Var4 = of6Var14;
                w61Var2 = w61Var4;
                x61Var = x61Var3;
                str9 = "ra_setup_failed";
                obj6 = "runtime_path";
                dh5Var2 = dh5Var6;
                of6Var3 = of6Var13;
                ep2Var4 = ep2Var2;
                sz1.F0(sz1Var6, "native_setup_start", sz1Var6.O, ep2Var4, rARuntimeBridgeConfig2, 16);
                this.g0 = w61Var2;
                this.X = rARuntimeBridgeConfig2;
                this.f0 = 4;
                if (jhVar.k(ep2Var4, rARuntimeBridgeConfig2, this) == x61Var) {
                }
                sz1Var6.w.d = false;
                sz1.F0(sz1Var6, "native_setup_completed", sz1Var6.O, ep2Var4, rARuntimeBridgeConfig2, 16);
                sz1Var6.H0("ra_setup_completed", new vr4(obj6, sz1Var6.O.name()));
                if (sz1Var6.O == sz1.c.LEGACY) {
                }
                i3 = 0;
                sz1Var6.K = false;
                dVar = ((uz1) dh5Var2.A).b;
                dVar2 = sz1.d.HARDCORE;
                if (dVar == dVar2) {
                }
                of6Var3.k(new p77(q77Var, false, false));
                if (((uz1) dh5Var2.A).b == dVar2) {
                }
                this.g0 = w61Var2;
                this.X = null;
                this.f0 = 6;
                if (sz1.m(sz1Var6, ep2Var4, z2, this) == x61Var) {
                }
                w61Var3 = w61Var2;
                if (g04.H(w61Var3)) {
                }
                return obj13;
            case 4:
                RARuntimeBridgeConfig rARuntimeBridgeConfig6 = (RARuntimeBridgeConfig) this.X;
                try {
                    oi2.Y(obj);
                    rARuntimeBridgeConfig2 = rARuntimeBridgeConfig6;
                    url = url4;
                    of6Var3 = of6Var13;
                    of6Var4 = of6Var14;
                    w61Var2 = w61Var4;
                    x61Var = x61Var3;
                    obj6 = "runtime_path";
                    dh5Var2 = dh5Var6;
                    sz1Var6.w.d = false;
                    sz1.F0(sz1Var6, "native_setup_completed", sz1Var6.O, ep2Var4, rARuntimeBridgeConfig2, 16);
                    sz1Var6.H0("ra_setup_completed", new vr4(obj6, sz1Var6.O.name()));
                    if (sz1Var6.O == sz1.c.LEGACY) {
                    }
                    i3 = 0;
                    sz1Var6.K = false;
                    dVar = ((uz1) dh5Var2.A).b;
                    dVar2 = sz1.d.HARDCORE;
                    if (dVar == dVar2) {
                    }
                    of6Var3.k(new p77(q77Var, false, false));
                    if (((uz1) dh5Var2.A).b == dVar2) {
                    }
                    this.g0 = w61Var2;
                    this.X = null;
                    this.f0 = 6;
                    if (sz1.m(sz1Var6, ep2Var4, z2, this) == x61Var) {
                    }
                    w61Var3 = w61Var2;
                    if (g04.H(w61Var3)) {
                    }
                } catch (Throwable th8) {
                    th = th8;
                    sz1Var2 = sz1Var6;
                    rARuntimeBridgeConfig2 = rARuntimeBridgeConfig6;
                    obj7 = null;
                    url2 = url4;
                    of6Var5 = of6Var14;
                    x61Var = x61Var3;
                    str9 = "ra_setup_failed";
                    obj6 = "runtime_path";
                    i2 = 5;
                    if (sz1Var2.h1(str10, "native_setup_failed", new dz1(sz1Var2, 3))) {
                        if (th instanceof CancellationException) {
                            throw th;
                        }
                        return obj13;
                    }
                    this.g0 = obj7;
                    this.X = rARuntimeBridgeConfig2;
                    this.Y = th;
                    this.f0 = i2;
                    if (sz1Var2.g0("native_setup_failed", true, this) == x61Var) {
                        return x61Var;
                    }
                    rARuntimeBridgeConfig3 = rARuntimeBridgeConfig2;
                    th = th;
                    if (th instanceof CancellationException) {
                    }
                }
                return obj13;
            case 5:
                th = this.Y;
                rARuntimeBridgeConfig3 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                sz1Var2 = sz1Var6;
                url2 = url4;
                of6Var5 = of6Var14;
                str9 = "ra_setup_failed";
                obj6 = "runtime_path";
                th = th;
                if (th instanceof CancellationException) {
                    ep2 ep2Var6 = ep2Var4;
                    RARuntimeBridgeConfig rARuntimeBridgeConfig7 = rARuntimeBridgeConfig3;
                    sz1 sz1Var7 = sz1Var2;
                    sz1Var7.E0("native_setup_failed", sz1Var2.O, ep2Var6, rARuntimeBridgeConfig7, th);
                    sz1Var7.H0(str9, new vr4(obj6, sz1Var7.O.name()), new vr4(obj12, th.getClass().getSimpleName()));
                    sx1Var4.d(dp2.DISABLED_LOAD_ERROR);
                    of6Var5.k(new la5(url2));
                    return obj13;
                }
                throw th;
            case 6:
                RARuntimeBridgeConfig rARuntimeBridgeConfig8 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                url = url4;
                of6Var4 = of6Var14;
                w61Var2 = w61Var4;
                x61Var = x61Var3;
                dh5Var2 = dh5Var6;
                i3 = 0;
                w61Var3 = w61Var2;
                if (g04.H(w61Var3)) {
                }
                return obj13;
            case 7:
                RARuntimeBridgeConfig rARuntimeBridgeConfig9 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                url = url4;
                of6Var4 = of6Var14;
                w61Var3 = w61Var4;
                x61Var = x61Var3;
                dh5Var2 = dh5Var6;
                obj8 = null;
                i3 = 0;
                jd1 jd1Var5 = oq1.B;
                L2 = n16.L(15, uq1.SECONDS);
                this.g0 = w61Var3;
                this.X = obj8;
                this.f0 = 8;
                if (q60.u(L2, this) == x61Var) {
                }
                if (g04.H(w61Var3)) {
                }
                return obj13;
            case 8:
                RARuntimeBridgeConfig rARuntimeBridgeConfig10 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                url = url4;
                of6Var4 = of6Var14;
                w61Var3 = w61Var4;
                x61Var = x61Var3;
                dh5Var2 = dh5Var6;
                i3 = 0;
                if (g04.H(w61Var3)) {
                }
                return obj13;
            case 9:
                RARuntimeBridgeConfig rARuntimeBridgeConfig11 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                of6Var6 = of6Var14;
                pq5Var = pq5Var2;
                w61Var3 = w61Var4;
                dh5Var2 = dh5Var6;
                sz1Var4 = sz1Var6;
                url3 = url4;
                x61Var = x61Var3;
                url = url3;
                of6Var4 = of6Var6;
                sz1Var6 = sz1Var4;
                i3 = 0;
                pq5Var2 = pq5Var;
                if (g04.H(w61Var3)) {
                }
                return obj13;
            case 10:
                i4 = this.d0;
                RARuntimeBridgeConfig rARuntimeBridgeConfig12 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                obj9 = obj;
                th2 = null;
                of6Var4 = of6Var14;
                pq5Var = pq5Var2;
                dh5Var2 = dh5Var6;
                i5 = 15;
                i3 = 0;
                sz1Var3 = sz1Var6;
                url3 = url4;
                x61Var = x61Var3;
                obj11 = ((hm5) obj9).A;
                if (obj11 instanceof em5) {
                }
                break;
            case 11:
                RARuntimeBridgeConfig rARuntimeBridgeConfig13 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                e41.c();
                return null;
            case 12:
                RARuntimeBridgeConfig rARuntimeBridgeConfig14 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                of6Var7 = of6Var14;
                pq5Var = pq5Var2;
                dh5Var2 = dh5Var6;
                i3 = 0;
                sz1Var3 = sz1Var6;
                url3 = url4;
                x61Var = x61Var3;
                w61Var3 = w61Var4;
                url = url3;
                pq5Var2 = pq5Var;
                of6Var4 = of6Var7;
                sz1Var6 = sz1Var3;
                if (g04.H(w61Var3)) {
                }
                return obj13;
            case 13:
                RARuntimeBridgeConfig rARuntimeBridgeConfig15 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                th2 = null;
                of6Var8 = of6Var14;
                pq5Var = pq5Var2;
                dh5Var2 = dh5Var6;
                i5 = 15;
                i3 = 0;
                sz1Var3 = sz1Var6;
                url3 = url4;
                x61Var = x61Var3;
                if (((uz1) dh5Var2.A).b == sz1.d.HARDCORE) {
                }
                if (i6 != 0) {
                }
                break;
            case 14:
                i6 = this.d0;
                RARuntimeBridgeConfig rARuntimeBridgeConfig16 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                th2 = null;
                of6Var8 = of6Var14;
                pq5Var = pq5Var2;
                dh5Var2 = dh5Var6;
                i5 = 15;
                i3 = 0;
                sz1Var3 = sz1Var6;
                url3 = url4;
                x61Var = x61Var3;
                obj10 = obj13;
                String richPresenceStatus22 = MelonEmulator.a.getRichPresenceStatus();
                xe1 xe1Var222 = xk1.a;
                de1Var = de1.L;
                of6 of6Var1522 = of6Var8;
                obj13 = obj10;
                if (i6 != 0) {
                }
                w61 w61Var522 = w61Var4;
                of6Var6 = of6Var1522;
                f12Var = new f12(sz1Var3, this.k0, z3, richPresenceStatus22, (r41) null);
                sz1Var4 = sz1Var3;
                this.g0 = w61Var522;
                this.X = th2;
                this.Y = th2;
                this.d0 = i6;
                this.f0 = i5;
                if (hv.d0(de1Var, f12Var, this) != x61Var) {
                }
                break;
            case 15:
                String str11 = (String) this.Y;
                RARuntimeBridgeConfig rARuntimeBridgeConfig17 = (RARuntimeBridgeConfig) this.X;
                oi2.Y(obj);
                of6Var6 = of6Var14;
                pq5Var = pq5Var2;
                w61Var3 = w61Var4;
                dh5Var2 = dh5Var6;
                sz1Var4 = sz1Var6;
                url3 = url4;
                x61Var = x61Var3;
                url = url3;
                of6Var4 = of6Var6;
                sz1Var6 = sz1Var4;
                i3 = 0;
                pq5Var2 = pq5Var;
                if (g04.H(w61Var3)) {
                }
                return obj13;
            case 16:
                pz1Var = (pz1) this.X;
                oi2.Y(obj);
                str4 = "ra_encore_enabled";
                str = "ra_unofficial_enabled";
                obj2 = obj12;
                str2 = "ra_setup_failed";
                str3 = str10;
                obj3 = "runtime_path";
                dh5Var = dh5Var6;
                b = obj;
                pz1 pz1Var2 = pz1Var;
                if (b instanceof hb5) {
                    hb5Var = (hb5) b;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    RARuntimeBridgeMode rARuntimeBridgeMode2 = RARuntimeBridgeMode.RC_CLIENT_OFFLINE;
                    String str12 = sz1Var6.M0;
                    String str13 = hb5Var.a;
                    String str14 = hb5Var.b;
                    String str15 = pq5Var2.i;
                    of6Var9 = of6Var13;
                    Long l = new Long(pz1Var2.c.b);
                    boolean z4 = ((ng6) kd6Var2).b.getBoolean(str, false);
                    boolean z5 = ((ng6) kd6Var2).b.getBoolean(str4, false);
                    dh5 dh5Var7 = dh5Var;
                    uz1 uz1Var = (uz1) dh5Var7.A;
                    dh5Var3 = dh5Var7;
                    rARuntimeBridgeConfig4 = new RARuntimeBridgeConfig(rARuntimeBridgeMode2, str12, str13, str14, str15, l, 0L, false, z4, z5, uz1Var.h, false, uz1Var.i);
                } else {
                    of6Var9 = of6Var13;
                    dh5Var3 = dh5Var;
                    rARuntimeBridgeConfig4 = null;
                }
                sz1Var6.N = rARuntimeBridgeConfig4;
                sz1.c cVar3 = sz1.c.RC_CLIENT_OFFLINE;
                sz1Var6.O = cVar3;
                sz1.F0(sz1Var6, "running_state_ready", cVar3, ep2Var4, rARuntimeBridgeConfig4, 16);
                long currentTimeMillis = System.currentTimeMillis();
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                gk4 gk4Var = gk4.SOFTCORE;
                dh5 dh5Var8 = dh5Var3;
                ik4 ik4Var = ((uz1) dh5Var8.A).c;
                if (ik4Var == null) {
                    ik4Var = ik4.OFFLINE_FROM_START;
                }
                ik4 ik4Var2 = ik4Var;
                sz1Var6.M = new qz1(pz1Var2.a, pz1Var2.b, pz1Var2.c.b, gk4Var, ik4Var2, uuid, currentTimeMillis);
                xe1 xe1Var3 = xk1.a;
                de1 de1Var3 = de1.L;
                of6Var10 = of6Var9;
                of6Var11 = of6Var14;
                x61Var2 = x61Var3;
                sx1Var2 = sx1Var4;
                sz1Var5 = sz1Var6;
                j = currentTimeMillis;
                n31 n31Var = new n31(sz1Var5, pz1Var2, uuid, j, gk4Var, ik4Var2, (r41) null);
                this.g0 = w61Var4;
                th3 = null;
                this.X = null;
                this.Y = null;
                this.Z = rARuntimeBridgeConfig4;
                this.e0 = j;
                this.f0 = 17;
                if (hv.d0(de1Var3, n31Var, this) != x61Var2) {
                    dh5Var6 = dh5Var8;
                    try {
                        sz1.c cVar4 = sz1Var5.O;
                        sz1Var6 = sz1Var5;
                        of6Var12 = of6Var10;
                        dh5Var4 = dh5Var6;
                    } catch (Throwable th9) {
                        th = th9;
                        sz1Var6 = sz1Var5;
                        dh5Var4 = dh5Var6;
                        of6Var12 = of6Var10;
                    }
                    try {
                        sz1.F0(sz1Var6, "native_setup_start", cVar4, ep2Var4, rARuntimeBridgeConfig4, 16);
                        this.g0 = th3;
                        this.X = th3;
                        this.Y = th3;
                        this.Z = rARuntimeBridgeConfig4;
                        this.e0 = j;
                        this.d0 = 0;
                        this.f0 = 18;
                    } catch (Throwable th10) {
                        th = th10;
                        j2 = j;
                        th4 = th3;
                        j3 = j2;
                        ep2Var3 = ep2Var4;
                        rARuntimeBridgeConfig5 = rARuntimeBridgeConfig4;
                        em5Var = new em5(th);
                        r11 = th4;
                        a = hm5.a(em5Var);
                        if (a == null) {
                        }
                    }
                    if (jhVar.k(ep2Var4, rARuntimeBridgeConfig4, this) == x61Var2) {
                        j2 = j;
                        th5 = th3;
                        j3 = j2;
                        ep2Var3 = ep2Var4;
                        rARuntimeBridgeConfig5 = rARuntimeBridgeConfig4;
                        em5Var = obj13;
                        r11 = th5;
                        a = hm5.a(em5Var);
                        if (a == null) {
                            if (!sz1Var6.h1(str3, "offline_native_setup_failed", new dz1(sz1Var6, 4))) {
                                if (a instanceof CancellationException) {
                                    throw a;
                                }
                                return obj13;
                            }
                            sz1Var6.r0();
                            sx1 sx1Var5 = sx1Var2;
                            sx1Var5.d = false;
                            if (!(a instanceof CancellationException)) {
                                sz1 sz1Var8 = sz1Var6;
                                sz1Var8.E0("native_setup_failed", sz1Var6.O, ep2Var3, rARuntimeBridgeConfig5, a);
                                sz1Var8.H0(str2, new vr4(obj3, sz1Var8.O.name()), new vr4(obj2, a.getClass().getSimpleName()));
                                sx1Var5.d(dp2.DISABLED_LOAD_ERROR);
                                of6Var11.k(new la5(ep2Var3.f));
                                return obj13;
                            }
                            throw a;
                        }
                        RARuntimeBridgeConfig rARuntimeBridgeConfig18 = rARuntimeBridgeConfig5;
                        ep2 ep2Var7 = ep2Var3;
                        sx1Var2.e(true);
                        sz1.F0(sz1Var6, "native_setup_completed", sz1Var6.O, ep2Var7, rARuntimeBridgeConfig18, 16);
                        q77 q77Var2 = q77.SOFTCORE_OFFLINE;
                        uz1 uz1Var2 = (uz1) dh5Var4.A;
                        of6Var12.k(new p77(q77Var2, uz1Var2.e, uz1Var2.f));
                        this.g0 = r11;
                        this.X = r11;
                        this.Y = r11;
                        this.Z = r11;
                        this.e0 = j3;
                        this.f0 = 19;
                        if (sz1.m(sz1Var6, ep2Var7, false, this) != x61Var2) {
                            j4 = j3;
                            r112 = r11;
                            this.g0 = r112;
                            this.X = r112;
                            this.Y = r112;
                            this.Z = r112;
                            this.e0 = j4;
                            this.f0 = 20;
                            if (q60.j(this) == x61Var2) {
                                return x61Var2;
                            }
                            e41.c();
                            return null;
                        }
                        return x61Var2;
                    }
                    return x61Var2;
                }
                return x61Var2;
            case 17:
                long j5 = this.e0;
                RARuntimeBridgeConfig rARuntimeBridgeConfig19 = this.Z;
                hb5 hb5Var2 = (hb5) this.Y;
                pz1 pz1Var3 = (pz1) this.X;
                oi2.Y(obj);
                th3 = null;
                rARuntimeBridgeConfig4 = rARuntimeBridgeConfig19;
                of6Var10 = of6Var13;
                of6Var11 = of6Var14;
                x61Var2 = x61Var3;
                obj2 = obj12;
                str2 = "ra_setup_failed";
                str3 = str10;
                sx1Var2 = sx1Var4;
                obj3 = "runtime_path";
                sz1Var5 = sz1Var6;
                j = j5;
                sz1.c cVar42 = sz1Var5.O;
                sz1Var6 = sz1Var5;
                of6Var12 = of6Var10;
                dh5Var4 = dh5Var6;
                sz1.F0(sz1Var6, "native_setup_start", cVar42, ep2Var4, rARuntimeBridgeConfig4, 16);
                this.g0 = th3;
                this.X = th3;
                this.Y = th3;
                this.Z = rARuntimeBridgeConfig4;
                this.e0 = j;
                this.d0 = 0;
                this.f0 = 18;
                if (jhVar.k(ep2Var4, rARuntimeBridgeConfig4, this) == x61Var2) {
                }
                break;
            case 18:
                j2 = this.e0;
                RARuntimeBridgeConfig rARuntimeBridgeConfig20 = this.Z;
                hb5 hb5Var3 = (hb5) this.Y;
                pz1 pz1Var4 = (pz1) this.X;
                try {
                    oi2.Y(obj);
                    th5 = null;
                    rARuntimeBridgeConfig4 = rARuntimeBridgeConfig20;
                    of6Var11 = of6Var14;
                    x61Var2 = x61Var3;
                    obj2 = obj12;
                    str2 = "ra_setup_failed";
                    str3 = str10;
                    sx1Var2 = sx1Var4;
                    obj3 = "runtime_path";
                    of6Var12 = of6Var13;
                    dh5Var4 = dh5Var6;
                    j3 = j2;
                    ep2Var3 = ep2Var4;
                    rARuntimeBridgeConfig5 = rARuntimeBridgeConfig4;
                    em5Var = obj13;
                    r11 = th5;
                } catch (Throwable th11) {
                    th = th11;
                    th4 = null;
                    rARuntimeBridgeConfig4 = rARuntimeBridgeConfig20;
                    of6Var11 = of6Var14;
                    x61Var2 = x61Var3;
                    obj2 = obj12;
                    str2 = "ra_setup_failed";
                    str3 = str10;
                    sx1Var2 = sx1Var4;
                    obj3 = "runtime_path";
                    of6Var12 = of6Var13;
                    dh5Var4 = dh5Var6;
                    j3 = j2;
                    ep2Var3 = ep2Var4;
                    rARuntimeBridgeConfig5 = rARuntimeBridgeConfig4;
                    em5Var = new em5(th);
                    r11 = th4;
                    a = hm5.a(em5Var);
                    if (a == null) {
                    }
                }
                a = hm5.a(em5Var);
                if (a == null) {
                }
                break;
            case 19:
                j4 = this.e0;
                hb5 hb5Var4 = (hb5) this.Y;
                pz1 pz1Var5 = (pz1) this.X;
                oi2.Y(obj);
                r112 = 0;
                x61Var2 = x61Var3;
                this.g0 = r112;
                this.X = r112;
                this.Y = r112;
                this.Z = r112;
                this.e0 = j4;
                this.f0 = 20;
                if (q60.j(this) == x61Var2) {
                }
                e41.c();
                return null;
            case 20:
                hb5 hb5Var5 = (hb5) this.Y;
                pz1 pz1Var6 = (pz1) this.X;
                oi2.Y(obj);
                e41.c();
                return null;
            default:
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
