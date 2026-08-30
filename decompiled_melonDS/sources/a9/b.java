package a9;

import a4.n;
import ah.e0;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import bi.i0;
import bi.j0;
import d0.b1;
import d1.x0;
import f1.d1;
import f1.f0;
import f1.l0;
import h1.j2;
import h1.u1;
import k7.m0;
import kf.r0;
import mc.p;
import me.magnum.melonds.MelonDSApplication;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.common.workers.RetroAchievementsSubmissionWorker;
import n1.x;
import o1.t;
import p1.a0;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(mc.l lVar, cc.c cVar) {
        super(2, cVar);
        this.X = 14;
        this.Z = (ec.j) lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 2:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 3:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 4:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 7:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 8:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8508d /* 9 */:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8510f /* 10 */:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 11:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 12:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 13:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 14:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8512h /* 15 */:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 16:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 17:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 18:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 19:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 20:
                return ((b) t((cc.c) obj2, (cd.i) obj)).v(y.f14813a);
            case 21:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 22:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 23:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 24:
                cc.c cVar = (cc.c) obj2;
                y yVar = y.f14813a;
                ((b) t(cVar, (u1) obj)).v(yVar);
                return yVar;
            case 25:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 26:
                cc.c cVar2 = (cc.c) obj2;
                y yVar2 = y.f14813a;
                ((b) t(cVar2, (u1) obj)).v(yVar2);
                return yVar2;
            case 27:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 28:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            default:
                return ((b) t((cc.c) obj2, (u) obj)).v(y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [ec.j, mc.l] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new b(0, cVar, (ConstraintTrackingWorker) this.Z);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new b(1, cVar, (e0) this.Z);
            case 2:
                return new b(2, cVar, (i0) this.Z);
            case 3:
                return new b(3, cVar, (j0) this.Z);
            case 4:
                return new b(4, cVar, (c9.k) this.Z);
            case l1.c.f8511g /* 5 */:
                return new b(5, cVar, (cd.h) this.Z);
            case l1.c.f8509e /* 6 */:
                return new b(6, cVar, (x0) this.Z);
            case 7:
                return new b(7, cVar, (RetroAchievementsSubmissionWorker) this.Z);
            case 8:
                return new b(8, cVar, (eh.c) this.Z);
            case l1.c.f8508d /* 9 */:
                return new b(9, cVar, (n) this.Z);
            case l1.c.f8510f /* 10 */:
                return new b(10, cVar, (n) this.Z);
            case 11:
                return new b(11, cVar, (f0) this.Z);
            case 12:
                return new b(12, cVar, (l0) this.Z);
            case 13:
                return new b(13, cVar, (d1) this.Z);
            case 14:
                return new b((ec.j) this.Z, cVar);
            case l1.c.f8512h /* 15 */:
                return new b(15, cVar, (b1) this.Z);
            case 16:
                return new b(16, cVar, (hg.l) this.Z);
            case 17:
                return new b(17, cVar, (jg.u) this.Z);
            case 18:
                return new b(18, cVar, (k7.g) this.Z);
            case 19:
                return new b(19, cVar, (m0) this.Z);
            case 20:
                return new b(20, cVar, (r0) this.Z);
            case 21:
                return new b(21, cVar, (lf.c) this.Z);
            case 22:
                return new b(22, cVar, (lf.f) this.Z);
            case 23:
                return new b(23, cVar, (zc.m) this.Z);
            case 24:
                return new b((x) this.Z, this.Y, cVar, 24);
            case 25:
                return new b(25, cVar, (mh.b) this.Z);
            case 26:
                return new b((t) this.Z, this.Y, cVar, 26);
            case 27:
                return new b(27, cVar, (a0) this.Z);
            case 28:
                return new b(28, cVar, (MelonDSApplication) this.Z);
            default:
                return new b(29, cVar, (d2.i) this.Z);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0335  */
    /* JADX WARN: Type inference failed for: r10v13, types: [ec.j, mc.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x0333 -> B:171:0x0324). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x034c -> B:182:0x0350). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.b.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j2 j2Var, int i2, cc.c cVar, int i10) {
        super(2, cVar);
        this.X = i10;
        this.Z = j2Var;
        this.Y = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
    }
}
