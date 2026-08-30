package a5;

import ah.h1;
import android.net.Uri;
import android.view.View;
import b4.c2;
import b4.i2;
import c1.p1;
import cd.o1;
import d1.a1;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import n2.u1;
import zc.y0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f423b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, Object obj2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
        this.f423b0 = obj2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 2:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 3:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 4:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 7:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 8:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8508d /* 9 */:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8510f /* 10 */:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 11:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 12:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 13:
                return ((o) t((cc.c) obj2, (c2) obj)).v(yb.y.f14813a);
            case 14:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8512h /* 15 */:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 16:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 17:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 18:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 19:
                return ((o) t((cc.c) obj2, (m9.j) obj)).v(yb.y.f14813a);
            case 20:
                return ((o) t((cc.c) obj2, (bd.v) obj)).v(yb.y.f14813a);
            case 21:
                return ((o) t((cc.c) obj2, (cd.i) obj)).v(yb.y.f14813a);
            case 22:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 23:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 24:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 25:
                return ((o) t((cc.c) obj2, (bd.v) obj)).v(yb.y.f14813a);
            case 26:
                return ((o) t((cc.c) obj2, (cd.i) obj)).v(yb.y.f14813a);
            case 27:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 28:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                return ((o) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                o oVar = new o(0, cVar, (m0) this.f423b0);
                oVar.Z = obj;
                return oVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new o((EmulatorActivity) this.Z, (ah.e0) this.f423b0, cVar, 1);
            case 2:
                return new o((h1) this.Z, (ConsoleType) this.f423b0, cVar, 2);
            case 3:
                return new o((h1) this.Z, (Uri) this.f423b0, cVar, 3);
            case 4:
                return new o((h1) this.Z, (String) this.f423b0, cVar, 4);
            case l1.c.f8511g /* 5 */:
                return new o((h1) this.Z, (oe.e0) this.f423b0, cVar, 5);
            case l1.c.f8509e /* 6 */:
                return new o((h1) this.Z, (xe.h) this.f423b0, cVar, 6);
            case 7:
                return new o((h1) this.Z, (xe.i) this.f423b0, cVar, 7);
            case 8:
                return new o((h1) this.Z, (xe.k) this.f423b0, cVar, 8);
            case l1.c.f8508d /* 9 */:
                return new o((h1) this.Z, (RewindSaveState) this.f423b0, cVar, 9);
            case l1.c.f8510f /* 10 */:
                return new o((cd.h) this.Z, (h1) this.f423b0, cVar, 10);
            case 11:
                o oVar2 = new o(11, cVar, (h1) this.f423b0);
                oVar2.Z = obj;
                return oVar2;
            case 12:
                o oVar3 = new o(12, cVar, (mc.p) this.f423b0);
                oVar3.Z = obj;
                return oVar3;
            case 13:
                o oVar4 = new o(13, cVar, (b4.t0) this.f423b0);
                oVar4.Z = obj;
                return oVar4;
            case 14:
                return new o((u1) this.Z, (View) this.f423b0, cVar, 14);
            case l1.c.f8512h /* 15 */:
                return new o((o1) this.Z, (i2) this.f423b0, cVar, 15);
            case 16:
                return new o((b9.h) this.Z, (m9.j) this.f423b0, cVar, 16);
            case 17:
                return new o((bi.j0) this.Z, (pe.b) this.f423b0, cVar, 17);
            case 18:
                return new o((p1) this.Z, (a1) this.f423b0, cVar, 18);
            case 19:
                o oVar5 = new o(19, cVar, (c9.k) this.f423b0);
                oVar5.Z = obj;
                return oVar5;
            case 20:
                o oVar6 = new o(20, cVar, (cd.h) this.f423b0);
                oVar6.Z = obj;
                return oVar6;
            case 21:
                o oVar7 = new o(21, cVar, (dd.a0) this.f423b0);
                oVar7.Z = obj;
                return oVar7;
            case 22:
                return new o((d2.c) this.Z, (d2.m) this.f423b0, cVar, 22);
            case 23:
                return new o((y0) this.Z, (d2.i) this.f423b0, cVar, 23);
            case 24:
                return new o((d2.o) this.Z, (a9.d) this.f423b0, cVar, 24);
            case 25:
                o oVar8 = new o(25, cVar, (dd.e) this.f423b0);
                oVar8.Z = obj;
                return oVar8;
            case 26:
                o oVar9 = new o(26, cVar, (dd.f) this.f423b0);
                oVar9.Z = obj;
                return oVar9;
            case 27:
                return new o((cd.h) this.Z, (dd.y) this.f423b0, cVar, 27);
            case 28:
                return new o((CheatImportWorker) this.Z, (String) this.f423b0, cVar, 28);
            default:
                return new o((CheatImportWorker) this.Z, (oe.q) this.f423b0, cVar, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c1, code lost:
        if (n2.s.t(r2).a(new n2.t0(r1, 0), r16) == r0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01dd, code lost:
        if (cd.e1.k((cd.e1) r1, r2, r16) == r0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02d4, code lost:
        if (r1 == r0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (((kf.u1) r0).d(r10, r16) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0635, code lost:
        if (r2 == r1) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x014f, code lost:
        if (r9 == r0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x017e, code lost:
        if (zc.x.h(500, r16) == r0) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:464:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:497:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0172  */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:265:0x04b6 -> B:267:0x04ba). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:401:0x079a -> B:403:0x079e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x017e -> B:100:0x0182). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 2050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.o.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.X = i2;
        this.f423b0 = obj;
    }
}
