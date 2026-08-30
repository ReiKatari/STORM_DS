package a9;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b4.t0;
import bd.o;
import cd.g1;
import cd.j1;
import cd.w0;
import d1.e0;
import d1.q1;
import d1.x0;
import g2.n;
import g2.y4;
import j0.o1;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k7.m0;
import k7.v;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import n2.m1;
import nc.t;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f667b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f668c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Object f669d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j1 j1Var, cd.h hVar, w0 w0Var, Object obj, cc.c cVar) {
        super(2, cVar);
        this.X = 8;
        this.Z = j1Var;
        this.f667b0 = hVar;
        this.f668c0 = (dd.b) w0Var;
        this.f669d0 = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 2:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 3:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 4:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((d) t((cc.c) obj2, new o(((o) obj).f2192a))).v(y.f14813a);
            case 7:
                return ((d) t((cc.c) obj2, (g1) obj)).v(y.f14813a);
            case 8:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8508d /* 9 */:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8510f /* 10 */:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 11:
                return ((d) t((cc.c) obj2, (t0) obj)).v(y.f14813a);
            case 12:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 13:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 14:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case l1.c.f8512h /* 15 */:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 16:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 17:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 18:
                return ((d) t((cc.c) obj2, (cd.i) obj)).v(y.f14813a);
            case 19:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 20:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 21:
                cc.c cVar = (cc.c) obj2;
                y yVar = y.f14813a;
                ((d) t(cVar, (u) obj)).v(yVar);
                return yVar;
            case 22:
                return ((d) t((cc.c) obj2, (m1) obj)).v(y.f14813a);
            case 23:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            default:
                return ((d) t((cc.c) obj2, (u) obj)).v(y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r0v2, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r0v6, types: [nc.l, mc.l] */
    /* JADX WARN: Type inference failed for: r1v7, types: [cd.w0, dd.b] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r5v7, types: [cd.w0, dd.b] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new d((o1) this.Z, (x8.p) this.f667b0, (AtomicInteger) this.f668c0, (ta.a) this.f669d0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new d((ConstraintTrackingWorker) this.f668c0, (p8.u) this.f669d0, (o1) this.Z, (x8.p) this.f667b0, cVar);
            case 2:
                return new d((id.c) this.f668c0, (p) ((ec.j) this.f669d0), cVar);
            case 3:
                d dVar = new d((r) this.f667b0, (q) this.f668c0, (p) ((ec.j) this.f669d0), cVar);
                dVar.Z = obj;
                return dVar;
            case 4:
                d dVar2 = new d((mc.l) ((nc.l) this.f667b0), (AtomicReference) this.f668c0, (p) this.f669d0, cVar);
                dVar2.Z = obj;
                return dVar2;
            case l1.c.f8511g /* 5 */:
                d dVar3 = new d((x0) this.f667b0, (a7.i) this.f668c0, (q1) this.f669d0, cVar, 5);
                dVar3.Z = obj;
                return dVar3;
            case l1.c.f8509e /* 6 */:
                d dVar4 = new d((t) this.f668c0, (cd.i) this.f669d0, cVar, 6);
                dVar4.f667b0 = obj;
                return dVar4;
            case 7:
                d dVar5 = new d((cd.h) this.f667b0, (w0) ((dd.b) this.f668c0), this.f669d0, cVar);
                dVar5.Z = obj;
                return dVar5;
            case 8:
                return new d((j1) this.Z, (cd.h) this.f667b0, (w0) ((dd.b) this.f668c0), this.f669d0, cVar);
            case l1.c.f8508d /* 9 */:
                return new d(this.Z, (d1.c) this.f667b0, (n2.w0) this.f668c0, (n2.w0) this.f669d0, cVar, 9);
            case l1.c.f8510f /* 10 */:
                d dVar6 = new d((n2.w0) this.f668c0, (e0) this.f669d0, cVar, 10);
                dVar6.f667b0 = obj;
                return dVar6;
            case 11:
                d dVar7 = new d((mc.l) this.f667b0, (d2.c) this.f668c0, (d2.o) this.f669d0, cVar, 11);
                dVar7.Z = obj;
                return dVar7;
            case 12:
                return new d((f2.p) this.f668c0, (p) ((ec.j) this.f669d0), cVar);
            case 13:
                return new d((n) this.Z, (n2.w0) this.f667b0, (n2.w0) this.f668c0, (n2.w0) this.f669d0, cVar, 13);
            case 14:
                return new d((gi.e) this.f667b0, (String) this.f668c0, (String) this.f669d0, cVar, 14);
            case l1.c.f8512h /* 15 */:
                return new d((h4.c) this.Z, (ScrollCaptureSession) this.f667b0, (Rect) this.f668c0, (Consumer) this.f669d0, cVar, 15);
            case 16:
                return new d((oe.q) this.f667b0, (jg.u) this.f668c0, (String) this.f669d0, cVar, 16);
            case 17:
                d dVar8 = new d((k7.t) this.f667b0, (zc.h) this.f668c0, (v) this.f669d0, cVar, 17);
                dVar8.Z = obj;
                return dVar8;
            case 18:
                d dVar9 = new d((m0) this.f667b0, (int[]) this.f668c0, (String[]) this.f669d0, cVar, 18);
                dVar9.Z = obj;
                return dVar9;
            case 19:
                return new d((y4) this.Z, (Resources) this.f667b0, (Cheat) this.f668c0, (jg.u) this.f669d0, cVar, 19);
            case 20:
                return new d((UUID) this.f667b0, (n2.w0) this.f668c0, (n2.w0) this.f669d0, cVar, 20);
            case 21:
                return new d((sh.c) this.Z, (rg.d) this.f667b0, this.Y, (mc.a) this.f668c0, (mc.l) this.f669d0, cVar);
            case 22:
                d dVar10 = new d((r) this.f667b0, (q) this.f668c0, (cd.h) this.f669d0, cVar, 22);
                dVar10.Z = obj;
                return dVar10;
            case 23:
                return new d((w0) this.Z, (y4) this.f667b0, (Resources) this.f668c0, (mc.l) this.f669d0, cVar, 23);
            default:
                return new d((p8.u) this.Z, (x8.p) this.f667b0, (y8.n) this.f668c0, (Context) this.f669d0, cVar, 24);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x02ad, code lost:
        if (r7 == r0) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02dd, code lost:
        if (r7.t(r8, r24) != r0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r3 == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03d5, code lost:
        if (r5 == r3) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04ba, code lost:
        if (r5 == r3) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0663, code lost:
        if (n2.s.t(g()).a(r12, r24) == r0) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0685, code lost:
        if (cd.q.r(r2, r3, r24) == r0) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0723, code lost:
        if (r0.c(r2, r24) == r3) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0739, code lost:
        if (cd.q.r(r1, r5, r24) == r3) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0742, code lost:
        if (r0.c(r2, r24) == r3) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x075e, code lost:
        if (cd.q.j(r5, r6, r24) == r3) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x085d, code lost:
        if (r0 == r12) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x089b, code lost:
        if (d1.d.e(r3, 0.0f, 0.0f, r5, r6, r24, 4) == r12) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x089e, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x08fd, code lost:
        if (r2 == r0) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0910, code lost:
        if (r3 == r0) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:?, code lost:
        return r0;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f9 A[Catch: all -> 0x030b, TryCatch #7 {all -> 0x030b, blocks: (B:133:0x02f5, B:135:0x02f9, B:137:0x0307, B:140:0x030d, B:142:0x0312, B:144:0x0316), top: B:526:0x02f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:570:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v34, types: [cd.i, cd.w0, dd.b] */
    /* JADX WARN: Type inference failed for: r0v37, types: [cd.h] */
    /* JADX WARN: Type inference failed for: r15v3, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r2v100, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v121 */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v14, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v49, types: [cd.h] */
    /* JADX WARN: Type inference failed for: r2v52, types: [cd.i, cd.w0, dd.b] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, nc.q] */
    /* JADX WARN: Type inference failed for: r2v77, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r2v89, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r5v18, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r6v2, types: [nc.l, mc.l] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:296:0x0689 -> B:286:0x0632). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 2684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.d.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ConstraintTrackingWorker constraintTrackingWorker, p8.u uVar, o1 o1Var, x8.p pVar, cc.c cVar) {
        super(2, cVar);
        this.X = 1;
        this.f668c0 = constraintTrackingWorker;
        this.f669d0 = uVar;
        this.Z = o1Var;
        this.f667b0 = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(cd.h hVar, w0 w0Var, Object obj, cc.c cVar) {
        super(2, cVar);
        this.X = 7;
        this.f667b0 = hVar;
        this.f668c0 = (dd.b) w0Var;
        this.f669d0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r rVar, q qVar, p pVar, cc.c cVar) {
        super(2, cVar);
        this.X = 3;
        this.f667b0 = rVar;
        this.f668c0 = qVar;
        this.f669d0 = (ec.j) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f2.p pVar, p pVar2, cc.c cVar) {
        super(2, cVar);
        this.X = 12;
        this.f668c0 = pVar;
        this.f669d0 = (ec.j) pVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(id.c cVar, p pVar, cc.c cVar2) {
        super(2, cVar2);
        this.X = 2;
        this.f668c0 = cVar;
        this.f669d0 = (ec.j) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f668c0 = obj;
        this.f669d0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f667b0 = obj;
        this.f668c0 = obj2;
        this.f669d0 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
        this.f667b0 = obj2;
        this.f668c0 = obj3;
        this.f669d0 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mc.l lVar, AtomicReference atomicReference, p pVar, cc.c cVar) {
        super(2, cVar);
        this.X = 4;
        this.f667b0 = (nc.l) lVar;
        this.f668c0 = atomicReference;
        this.f669d0 = pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(sh.c cVar, rg.d dVar, int i2, mc.a aVar, mc.l lVar, cc.c cVar2) {
        super(2, cVar2);
        this.X = 21;
        this.Z = cVar;
        this.f667b0 = dVar;
        this.Y = i2;
        this.f668c0 = aVar;
        this.f669d0 = lVar;
    }
}
