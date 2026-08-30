package mh;

import android.content.Context;
import android.net.ConnectivityManager;
import cd.q1;
import f2.b1;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f9695b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(cc.c cVar, k7.t tVar, mc.l lVar) {
        super(2, cVar);
        this.X = 3;
        this.Z = tVar;
        this.f9695b0 = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 2:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 3:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 4:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 7:
                return ((m) t((cc.c) obj2, (UUID) obj)).v(yb.y.f14813a);
            case 8:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8508d /* 9 */:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8510f /* 10 */:
                return ((m) t((cc.c) obj2, (cd.i) obj)).v(yb.y.f14813a);
            case 11:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 12:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 13:
                return ((m) t((cc.c) obj2, (bd.v) obj)).v(yb.y.f14813a);
            case 14:
                return ((m) t((cc.c) obj2, (bd.v) obj)).v(yb.y.f14813a);
            case l1.c.f8512h /* 15 */:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 16:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 17:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 18:
                return ((m) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                return ((m) t((cc.c) obj2, (ze.a) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new m((ah.e0) this.Z, (Context) this.f9695b0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new m((cd.h) this.Z, (a0) this.f9695b0, cVar, 1);
            case 2:
                return new m((d) this.Z, (w0) this.f9695b0, cVar, 2);
            case 3:
                return new m(cVar, (k7.t) this.Z, (mc.l) this.f9695b0);
            case 4:
                return new m((v3.w) this.Z, (q1.a0) this.f9695b0, cVar, 4);
            case l1.c.f8511g /* 5 */:
                return new m((cd.h) this.Z, (g3.l) this.f9695b0, cVar, 5);
            case l1.c.f8509e /* 6 */:
                return new m((r1.h) this.Z, (ai.p) this.f9695b0, cVar, 6);
            case 7:
                m mVar = new m(7, cVar, (me.magnum.melonds.ui.layouteditor.b) this.f9695b0);
                mVar.Z = obj;
                return mVar;
            case 8:
                return new m((rh.e0) this.Z, (UUID) this.f9695b0, cVar, 8);
            case l1.c.f8508d /* 9 */:
                return new m((rh.e0) this.Z, (ve.f) this.f9695b0, cVar, 9);
            case l1.c.f8510f /* 10 */:
                return new m((sd.h) this.Z, (String) this.f9695b0, cVar, 10);
            case 11:
                return new m((t8.d) this.Z, (bd.v) this.f9695b0, cVar, 11);
            case 12:
                return new m((v3.w) this.Z, (b1) this.f9695b0, cVar, 12);
            case 13:
                m mVar2 = new m(13, cVar, (u8.b) this.f9695b0);
                mVar2.Z = obj;
                return mVar2;
            case 14:
                m mVar3 = new m(14, cVar, (ConnectivityManager) this.f9695b0);
                mVar3.Z = obj;
                return mVar3;
            case l1.c.f8512h /* 15 */:
                return new m((vg.c) this.Z, (ze.a) this.f9695b0, cVar, 15);
            case 16:
                return new m((kf.b1) this.Z, (xh.c) this.f9695b0, cVar, 16);
            case 17:
                return new m((kf.b1) this.Z, (xh.d) this.f9695b0, cVar, 17);
            case 18:
                return new m((yh.j) this.Z, (q1) this.f9695b0, cVar, 18);
            default:
                m mVar4 = new m(19, cVar, (xg.k) this.f9695b0);
                mVar4.Z = obj;
                return mVar4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:214:0x0446, code lost:
        if (zc.x.i(r3, r11) == r0) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0461, code lost:
        if (zc.x.i(r3, r11) == r0) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:?, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v98 */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.m.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.X = i2;
        this.f9695b0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Object obj, Object obj2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
        this.f9695b0 = obj2;
    }
}
