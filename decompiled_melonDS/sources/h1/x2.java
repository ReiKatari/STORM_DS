package h1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.LinkedHashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.shortcutsetup.ShortcutSetupActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x2 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f6040b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f6041c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(mc.p pVar, b5.i iVar, cc.c cVar) {
        super(2, cVar);
        this.X = 16;
        this.f6041c0 = (ec.j) pVar;
        this.f6040b0 = iVar;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [nc.p, java.lang.Object] */
    private final Object x(Object obj) {
        mc.a pVar;
        NetworkCapabilities networkCapabilities;
        Object bVar;
        boolean canBeSatisfiedBy;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i2 = this.Y;
        if (i2 != 0) {
            if (i2 == 1) {
                p7.j.I(obj);
            } else {
                a0.j.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            p7.j.I(obj);
            bd.v vVar = (bd.v) this.Z;
            NetworkRequest a10 = ((p8.e) this.f6040b0).a();
            if (a10 == null) {
                vVar.getClass();
                vVar.k0(null);
                return yb.y.f14813a;
            }
            he.g gVar = new he.g(25, zc.x.v(vVar, null, null, new mh.m((t8.d) this.f6041c0, vVar, null, 11), 3), vVar);
            boolean z10 = false;
            if (Build.VERSION.SDK_INT >= 30) {
                t8.g gVar2 = t8.g.f13143a;
                ConnectivityManager connectivityManager = ((t8.d) this.f6041c0).f13137a;
                gVar2.getClass();
                synchronized (t8.g.f13144b) {
                    try {
                        LinkedHashMap linkedHashMap = t8.g.f13145c;
                        boolean isEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(gVar, a10);
                        if (isEmpty) {
                            p8.v.e().a(t8.h.f13149a, "NetworkRequestConstraintController register shared callback");
                            connectivityManager.registerDefaultNetworkCallback(gVar2);
                        }
                        p8.v.e().a(t8.h.f13149a, "NetworkRequestConstraintController send initial capabilities");
                        if (t8.g.f13147e) {
                            networkCapabilities = t8.g.f13146d;
                        } else {
                            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                            t8.g.f13146d = networkCapabilities;
                            t8.g.f13147e = true;
                        }
                        if (!t8.g.f13148f) {
                            canBeSatisfiedBy = a10.canBeSatisfiedBy(networkCapabilities);
                            if (canBeSatisfiedBy) {
                                z10 = true;
                            }
                        }
                        if (z10) {
                            bVar = t8.a.f13135a;
                        } else {
                            bVar = new t8.b(7);
                        }
                        gVar.k(bVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                pVar = new q1.e(3, gVar, connectivityManager);
            } else {
                int i10 = l9.f.f9004c;
                ConnectivityManager connectivityManager2 = ((t8.d) this.f6041c0).f13137a;
                l9.f fVar = new l9.f(gVar);
                ?? obj2 = new Object();
                try {
                    p8.v.e().a(t8.h.f13149a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(a10, fVar);
                    obj2.A = true;
                } catch (RuntimeException e6) {
                    if (vc.o.O(e6.getClass().getName(), "TooManyRequestsException", false)) {
                        p8.v.e().b(t8.h.f13149a, "NetworkRequestConstraintController couldn't register callback", e6);
                        gVar.k(new t8.b(7));
                    } else {
                        throw e6;
                    }
                }
                pVar = new ai.p((Object) obj2, connectivityManager2, fVar, 10);
            }
            lg.e eVar = new lg.e(6, pVar);
            this.Y = 1;
            if (k0.d.m(vVar, eVar, this) == aVar) {
                return aVar;
            }
        }
        return yb.y.f14813a;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 2:
                return ((x2) t((cc.c) obj2, (bd.v) obj)).v(yb.y.f14813a);
            case 3:
                return ((x2) t((cc.c) obj2, (bd.v) obj)).v(yb.y.f14813a);
            case 4:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((x2) t((cc.c) obj2, (cd.i) obj)).v(yb.y.f14813a);
            case 7:
                return ((x2) t((cc.c) obj2, (k7.c0) obj)).v(yb.y.f14813a);
            case 8:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8508d /* 9 */:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8510f /* 10 */:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 11:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 12:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 13:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 14:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8512h /* 15 */:
                return ((x2) t((cc.c) obj2, (n2.m1) obj)).v(yb.y.f14813a);
            case 16:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 17:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 18:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 19:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 20:
                return ((x2) t((cc.c) obj2, (bd.v) obj)).v(yb.y.f14813a);
            case 21:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 22:
                return ((x2) t((cc.c) obj2, (cd.i) obj)).v(yb.y.f14813a);
            default:
                return ((x2) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r1v11, types: [ec.j, mc.p] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                x2 x2Var = new x2((zc.y0) this.f6040b0, (mc.p) ((ec.j) this.f6041c0), cVar);
                x2Var.Z = obj;
                return x2Var;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new x2((ShortcutSetupActivity) this.Z, (ze.a) this.f6040b0, (Intent) this.f6041c0, cVar, 1);
            case 2:
                x2 x2Var2 = new x2((j8.b) this.f6040b0, (Context) this.f6041c0, cVar, 2);
                x2Var2.Z = obj;
                return x2Var2;
            case 3:
                x2 x2Var3 = new x2((j8.b) this.f6040b0, (Activity) this.f6041c0, cVar, 3);
                x2Var3.Z = obj;
                return x2Var3;
            case 4:
                return new x2((jg.u) this.Z, (fg.a) this.f6040b0, (kg.e) this.f6041c0, cVar, 4);
            case l1.c.f8511g /* 5 */:
                return new x2((jg.u) this.Z, (Cheat) this.f6040b0, (fg.a) this.f6041c0, cVar, 5);
            case l1.c.f8509e /* 6 */:
                x2 x2Var4 = new x2((oe.q) this.f6040b0, (jg.u) this.f6041c0, cVar, 6);
                x2Var4.Z = obj;
                return x2Var4;
            case 7:
                x2 x2Var5 = new x2(7, cVar, (k7.m0) this.f6041c0);
                x2Var5.Z = obj;
                return x2Var5;
            case 8:
                return new x2(8, cVar, (kf.r0) this.f6041c0);
            case l1.c.f8508d /* 9 */:
                return new x2(9, cVar, (kf.b1) this.f6041c0);
            case l1.c.f8510f /* 10 */:
                return new x2((nc.t) this.f6040b0, (m7.u) this.f6041c0, cVar, 10);
            case 11:
                x2 x2Var6 = new x2((zc.m) this.f6040b0, (mc.p) ((ec.j) this.f6041c0), cVar);
                x2Var6.Z = obj;
                return x2Var6;
            case 12:
                return new x2((cd.h) this.Z, (n2.w0) this.f6040b0, (n2.b1) this.f6041c0, cVar, 12);
            case 13:
                return new x2((mc.a) this.Z, (n2.w0) this.f6040b0, (n2.w0) this.f6041c0, cVar, 13);
            case 14:
                x2 x2Var7 = new x2((n2.t1) this.f6040b0, (b4.a1) this.f6041c0, cVar, 14);
                x2Var7.Z = obj;
                return x2Var7;
            case l1.c.f8512h /* 15 */:
                x2 x2Var8 = new x2((cc.g) this.f6040b0, (cd.h) this.f6041c0, cVar, 15);
                x2Var8.Z = obj;
                return x2Var8;
            case 16:
                x2 x2Var9 = new x2((mc.p) ((ec.j) this.f6041c0), (b5.i) this.f6040b0, cVar);
                x2Var9.Z = obj;
                return x2Var9;
            case 17:
                return new x2((q8.b0) this.Z, (p8.u) this.f6040b0, (y8.n) this.f6041c0, cVar, 17);
            case 18:
                return new x2((yh.e) this.Z, (String) this.f6040b0, (String) this.f6041c0, cVar, 18);
            case 19:
                return new x2((r1.h) this.Z, (a4.r1) this.f6040b0, (a4.n0) this.f6041c0, cVar, 19);
            case 20:
                x2 x2Var10 = new x2((p8.e) this.f6040b0, (t8.d) this.f6041c0, cVar, 20);
                x2Var10.Z = obj;
                return x2Var10;
            case 21:
                return new x2((j0.o1) this.Z, (x8.p) this.f6040b0, (t8.f) this.f6041c0, cVar, 21);
            case 22:
                x2 x2Var11 = new x2(22, cVar, (Context) this.f6041c0);
                x2Var11.Z = obj;
                return x2Var11;
            default:
                return new x2((mc.l) this.f6040b0, (n2.w0) this.f6041c0, cVar, 23);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x02a2, code lost:
        if (r2 == r10) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0354, code lost:
        if (r0.c(r2, r27) == r4) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0362, code lost:
        if (zc.x.F(r3, r6, r27) == r4) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x062b, code lost:
        if (r7 == r3) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0687, code lost:
        if (r15 != false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
        if (r3.a(r6, r27) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if (r3.a(r6, r27) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0714, code lost:
        if (r12.a(r3, r27) == r13) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0726, code lost:
        if (r12.a(r3, r27) == r13) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0734, code lost:
        if (r3 == r13) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0782, code lost:
        if (r12.a(r3, r27) == r13) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0792, code lost:
        if (r12.a(r4, r27) == r13) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x07af, code lost:
        if (r2 == r13) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
        if (r3.a(r6, r27) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x07fa, code lost:
        if (r2 == r5) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
        if (r5.c(r3, r27) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e0, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0a19, code lost:
        if (((zc.y0) r27.f6040b0).G(r27) == r0) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0a29, code lost:
        if (((ec.j) r27.f6041c0).j(r3, r27) == r0) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:?, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f4, code lost:
        if (r2 == dc.a.COROUTINE_SUSPENDED) goto L78;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x046c  */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r4v51, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r5v47, types: [ec.j, mc.p] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 2676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.x2.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj, Object obj2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f6040b0 = obj;
        this.f6041c0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(Object obj, Object obj2, Object obj3, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
        this.f6040b0 = obj2;
        this.f6041c0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.X = i2;
        this.f6041c0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(zc.m mVar, mc.p pVar, cc.c cVar) {
        super(2, cVar);
        this.X = 11;
        this.f6040b0 = mVar;
        this.f6041c0 = (ec.j) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(zc.y0 y0Var, mc.p pVar, cc.c cVar) {
        super(2, cVar);
        this.X = 0;
        this.f6040b0 = y0Var;
        this.f6041c0 = (ec.j) pVar;
    }
}
