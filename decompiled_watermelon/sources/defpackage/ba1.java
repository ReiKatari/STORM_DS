package defpackage;

import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Vibrator;
import java.util.Set;
import java.util.UUID;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ba1  reason: default package */
/* loaded from: classes.dex */
public final class ba1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;
    public final /* synthetic */ Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba1(Object obj, Object obj2, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = obj;
        this.c0 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    private final Object A(Object obj) {
        eh3 eh3Var = (eh3) this.c0;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        o27 o27Var = o27.a;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
                return o27Var;
            }
            i.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        me2.a0(obj);
        k43 k43Var = (k43) this.Z;
        la2 la2Var = new la2(new g43(k43Var, null, 0), k43Var.f);
        n5 n5Var = new n5(eh3Var, null, 16);
        ee6 ee6Var = eh3Var.c;
        this.Y = 1;
        Object a = la2Var.a(new z6(new r90(10, ee6Var, n5Var), 18), this);
        if (a != p31.COROUTINE_SUSPENDED) {
            a = o27Var;
        }
        if (a != p31Var) {
            a = o27Var;
        }
        if (a == p31Var) {
            return p31Var;
        }
        return o27Var;
    }

    private final Object B(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            lj3 lj3Var = new lj3((ya1) this.c0, null, 0);
            this.Y = 1;
            if (ve2.m((vp4) this.Z, lj3Var, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (defpackage.dk7.r(r4, r6) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        if (defpackage.dk7.r(r3, r6) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object C(java.lang.Object r7) {
        /*
            r6 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            defpackage.me2.a0(r7)
            goto L4c
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            r6 = 0
            return r6
        L17:
            defpackage.me2.a0(r7)
            goto L31
        L1b:
            defpackage.me2.a0(r7)
            hm1 r7 = defpackage.im1.B
            r7 = 500(0x1f4, float:7.0E-43)
            om1 r1 = defpackage.om1.MILLISECONDS
            long r4 = defpackage.b53.k0(r7, r1)
            r6.Y = r3
            java.lang.Object r7 = defpackage.dk7.r(r4, r6)
            if (r7 != r0) goto L31
            goto L4b
        L31:
            java.lang.Object r7 = r6.c0
            k24 r7 = (defpackage.k24) r7
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.setValue(r1)
            hm1 r7 = defpackage.im1.B
            r7 = 4
            om1 r1 = defpackage.om1.SECONDS
            long r3 = defpackage.b53.k0(r7, r1)
            r6.Y = r2
            java.lang.Object r7 = defpackage.dk7.r(r3, r6)
            if (r7 != r0) goto L4c
        L4b:
            return r0
        L4c:
            java.lang.Object r6 = r6.Z
            o3 r6 = (defpackage.o3) r6
            os r6 = r6.i
            r6.q()
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba1.C(java.lang.Object):java.lang.Object");
    }

    private final Object D(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i != 1) {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            me2.a0(obj);
        } else {
            me2.a0(obj);
            this.Y = 1;
            if (bp4.a((cm3) this.Z, (m5) this.c0, this) == p31Var) {
                return p31Var;
            }
        }
        f81.c();
        return null;
    }

    private final Object E(Object obj) {
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i != 1) {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            me2.a0(obj);
        } else {
            me2.a0(obj);
            x6 x6Var = new x6(12, (nz3) this.c0);
            this.Y = 1;
            if (((ce6) this.Z).a(x6Var, this) == p31Var) {
                return p31Var;
            }
        }
        f81.c();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:17:0x0035, B:19:0x003f, B:23:0x0051, B:14:0x0029), top: B:32:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0072 -> B:27:0x0073). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object F(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.c0
            r1 = r0
            h04 r1 = (defpackage.h04) r1
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r11.Y
            r7 = 0
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L2e
            if (r2 == r9) goto L25
            if (r2 != r8) goto L1f
            java.lang.Object r2 = r11.Z
            o31 r2 = (defpackage.o31) r2
            defpackage.me2.a0(r12)     // Catch: java.lang.Throwable -> L1c
            r6 = r11
            r12 = r2
            goto L73
        L1c:
            r0 = move-exception
            r11 = r0
            goto L7a
        L1f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            return r7
        L25:
            java.lang.Object r2 = r11.Z
            o31 r2 = (defpackage.o31) r2
            defpackage.me2.a0(r12)     // Catch: java.lang.Throwable -> L1c
            r10 = r2
            goto L51
        L2e:
            defpackage.me2.a0(r12)
            java.lang.Object r12 = r11.Z
            o31 r12 = (defpackage.o31) r12
        L35:
            e31 r2 = r12.w()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = defpackage.ln2.G(r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L75
            q60 r2 = r1.g     // Catch: java.lang.Throwable -> L1c
            r11.Z = r12     // Catch: java.lang.Throwable -> L1c
            r11.Y = r9     // Catch: java.lang.Throwable -> L1c
            r2.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = defpackage.q60.L(r2, r11)     // Catch: java.lang.Throwable -> L1c
            if (r2 != r0) goto L4f
            goto L71
        L4f:
            r10 = r12
            r12 = r2
        L51:
            r3 = r12
            d04 r3 = (defpackage.d04) r3     // Catch: java.lang.Throwable -> L1c
            od1 r12 = r1.c     // Catch: java.lang.Throwable -> L1c
            r2 = 1086324736(0x40c00000, float:6.0)
            float r4 = r12.C(r2)     // Catch: java.lang.Throwable -> L1c
            od1 r12 = r1.c     // Catch: java.lang.Throwable -> L1c
            r2 = 1065353216(0x3f800000, float:1.0)
            float r5 = r12.C(r2)     // Catch: java.lang.Throwable -> L1c
            ax5 r2 = r1.a     // Catch: java.lang.Throwable -> L1c
            r11.Z = r10     // Catch: java.lang.Throwable -> L1c
            r11.Y = r8     // Catch: java.lang.Throwable -> L1c
            r6 = r11
            java.lang.Object r11 = defpackage.h04.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L72
        L71:
            return r0
        L72:
            r12 = r10
        L73:
            r11 = r6
            goto L35
        L75:
            r1.h = r7
            o27 r11 = defpackage.o27.a
            return r11
        L7a:
            r1.h = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba1.F(java.lang.Object):java.lang.Object");
    }

    private final Object G(Object obj) {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.c0;
        nu4 nu4Var = (nu4) this.Z;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            yy2 yy2Var = new yy2(1, nu4Var);
            connectivityManager.registerDefaultNetworkCallback(yy2Var);
            jd2 jd2Var = new jd2(12, connectivityManager, yy2Var);
            this.Z = null;
            this.Y = 1;
            if (yf2.j(nu4Var, jd2Var, this) == p31Var) {
                return p31Var;
            }
        }
        return o27.a;
    }

    private final Object x(Object obj) {
        b bVar = (b) this.Z;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            vp5 vp5Var = bVar.c;
            Uri uri = ((rg5) this.c0).d;
            this.Y = 1;
            obj = ((d72) vp5Var).j(uri, this);
            if (obj == p31Var) {
                return p31Var;
            }
        }
        rg5 rg5Var = (rg5) obj;
        o27 o27Var = o27.a;
        if (rg5Var == null || bVar.o) {
            return o27Var;
        }
        m11 m11Var = rg5Var.f.h;
        if (m11Var == null) {
            m11Var = (m11) ((ee6) ((b56) bVar.b).g.getValue()).getValue();
        }
        bVar.d = rg5Var;
        bVar.e.k(m11Var.a().b);
        bVar.g.k(m11Var.a);
        return o27Var;
    }

    private final Object y(Object obj) {
        bf3 bf3Var = (bf3) this.Z;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            this.Y = 1;
            obj = bf3Var.b.d((UUID) this.c0, this);
            if (obj == p31Var) {
                return p31Var;
            }
        }
        nd3 nd3Var = (nd3) obj;
        bf3Var.g = nd3Var;
        bf3Var.i.k(nd3Var);
        return o27.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    private final Object z(Object obj) {
        sg3 sg3Var = (sg3) this.c0;
        k43 k43Var = (k43) this.Z;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.Y;
        o27 o27Var = o27.a;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
                return o27Var;
            }
            i.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        me2.a0(obj);
        la2 la2Var = new la2(new g43(k43Var, null, 0), k43Var.f);
        n5 n5Var = new n5(sg3Var, null, 15);
        r90 r90Var = new r90(12, k43Var, sg3Var);
        this.Y = 1;
        Object a = la2Var.a(new z6(new r90(10, r90Var, n5Var), 18), this);
        if (a != p31.COROUTINE_SUSPENDED) {
            a = o27Var;
        }
        if (a != p31Var) {
            a = o27Var;
        }
        if (a == p31Var) {
            return p31Var;
        }
        return o27Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 1:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 2:
                return ((ba1) t((j11) obj2, (wt1) obj)).v(o27Var);
            case 3:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 4:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 5:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case ig7.b /* 6 */:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 7:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 8:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 9:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 10:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 11:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case mj2.L /* 12 */:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 13:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 14:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case ig7.e /* 15 */:
                return ((ba1) t((j11) obj2, (w92) obj)).v(o27Var);
            case 16:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 17:
                return ((ba1) t((j11) obj2, (nu4) obj)).v(o27Var);
            case 18:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 19:
                return ((ba1) t((j11) obj2, (UUID) obj)).v(o27Var);
            case 20:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 21:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 22:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 23:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 24:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 25:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 26:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 27:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
            case 28:
                return ((ba1) t((j11) obj2, (nu4) obj)).v(o27Var);
            default:
                return ((ba1) t((j11) obj2, (o31) obj)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Object obj2 = this.c0;
        switch (i) {
            case 0:
                return new ba1((q92) this.Z, (ca1) obj2, j11Var, 0);
            case 1:
                return new ba1((q92) this.Z, (l33) obj2, j11Var, 1);
            case 2:
                ba1 ba1Var = new ba1((EmulatorActivity) obj2, j11Var, 2);
                ba1Var.Z = obj;
                return ba1Var;
            case 3:
                return new ba1((EmulatorActivity) this.Z, (ct1) obj2, j11Var, 3);
            case 4:
                return new ba1((r9) obj2, j11Var, 4);
            case 5:
                return new ba1((js1) this.Z, (ConsoleType) obj2, j11Var, 5);
            case ig7.b /* 6 */:
                return new ba1((js1) this.Z, (rg5) obj2, j11Var, 6);
            case 7:
                return new ba1((os) this.Z, (Vibrator) obj2, j11Var, 7);
            case 8:
                return new ba1((hv1) this.Z, (ConsoleType) obj2, j11Var, 8);
            case 9:
                return new ba1((hv1) this.Z, (Uri) obj2, j11Var, 9);
            case 10:
                return new ba1((hv1) this.Z, (String) obj2, j11Var, 10);
            case 11:
                return new ba1((hv1) this.Z, (a25) obj2, j11Var, 11);
            case mj2.L /* 12 */:
                return new ba1((hv1) this.Z, (wm5) obj2, j11Var, 12);
            case 13:
                return new ba1((hv1) this.Z, (RewindSaveState) obj2, j11Var, 13);
            case 14:
                return new ba1((os) this.Z, (fd0) obj2, j11Var, 14);
            case ig7.e /* 15 */:
                ba1 ba1Var2 = new ba1((d72) obj2, j11Var, 15);
                ba1Var2.Z = obj;
                return ba1Var2;
            case 16:
                return new ba1((d72) this.Z, (Set) obj2, j11Var, 16);
            case 17:
                ba1 ba1Var3 = new ba1((u92) obj2, j11Var, 17);
                ba1Var3.Z = obj;
                return ba1Var3;
            case 18:
                return new ba1((b) this.Z, (rg5) obj2, j11Var, 18);
            case 19:
                ba1 ba1Var4 = new ba1((me.magnum.melonds.ui.layouteditor.b) obj2, j11Var, 19);
                ba1Var4.Z = obj;
                return ba1Var4;
            case 20:
                return new ba1((bf3) this.Z, (UUID) obj2, j11Var, 20);
            case 21:
                return new ba1((k43) this.Z, (sg3) obj2, j11Var, 21);
            case 22:
                return new ba1((k43) this.Z, (eh3) obj2, j11Var, 22);
            case 23:
                return new ba1((vp4) this.Z, (ya1) obj2, j11Var, 23);
            case 24:
                return new ba1((o3) this.Z, (k24) obj2, j11Var, 24);
            case 25:
                return new ba1((cm3) this.Z, (m5) obj2, j11Var, 25);
            case 26:
                return new ba1((ce6) this.Z, (nz3) obj2, j11Var, 26);
            case 27:
                ba1 ba1Var5 = new ba1((h04) obj2, j11Var, 27);
                ba1Var5.Z = obj;
                return ba1Var5;
            case 28:
                ba1 ba1Var6 = new ba1((ConnectivityManager) obj2, j11Var, 28);
                ba1Var6.Z = obj;
                return ba1Var6;
            default:
                return new ba1((n64) this.Z, (nu4) obj2, j11Var, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ed, code lost:
        if (r4 == r3) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0308, code lost:
        if (r1 == r3) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x030b, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010e, code lost:
        if (r1 == r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
        if (r9.a(r3, r16) == r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0134, code lost:
        if (r1 == r7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0137, code lost:
        return r7;
     */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 3038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba1.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba1(Object obj, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.c0 = obj;
    }
}
