package b7;

import android.graphics.Bitmap;
import b4.a1;
import b4.t0;
import d1.q1;
import d1.x0;
import f2.b1;
import g2.t3;
import h1.r1;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.t1;
import n2.u1;
import n2.w0;
import u1.k1;
import u1.p0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f2107b0;

    /* renamed from: c0  reason: collision with root package name */
    public Object f2108c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Object f2109d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ Object f2110e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p0 p0Var, w0 w0Var, q4.y yVar, b1 b1Var, q4.j jVar, cc.c cVar) {
        super(2, cVar);
        this.X = 7;
        this.Z = p0Var;
        this.f2108c0 = w0Var;
        this.f2107b0 = yVar;
        this.f2109d0 = b1Var;
        this.f2110e0 = jVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((z) t((cc.c) obj2, (cd.h) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((z) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 2:
                return ((z) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 3:
                return ((z) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 4:
                return ((z) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((z) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((z) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 7:
                return ((z) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                return ((z) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [ec.j, mc.q] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                z zVar = new z((i) this.f2107b0, (w0) this.f2108c0, (n2.b1) this.f2110e0, (w0) this.f2109d0, cVar);
                zVar.Z = obj;
                return zVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new z((m9.j) this.Z, (b9.h) this.f2107b0, (n9.g) this.f2108c0, (b9.c) this.f2109d0, (Bitmap) this.f2110e0, cVar, 1);
            case 2:
                return new z((x0) this.f2109d0, this.Z, (q1) this.f2110e0, cVar);
            case 3:
                z zVar2 = new z((t0) this.f2107b0, (mc.l) this.f2108c0, (d2.c) this.f2109d0, (d2.o) this.f2110e0, cVar);
                zVar2.Z = obj;
                return zVar2;
            case 4:
                z zVar3 = new z((v3.w) this.f2107b0, (mc.q) ((ec.j) this.f2108c0), (mc.l) this.f2109d0, (r1) this.f2110e0, cVar);
                zVar3.Z = obj;
                return zVar3;
            case l1.c.f8511g /* 5 */:
                return new z((t3) this.Z, (String) this.f2107b0, (String) this.f2108c0, (hg.l) this.f2109d0, (oe.a) this.f2110e0, cVar, 5);
            case l1.c.f8509e /* 6 */:
                z zVar4 = new z((u1) this.f2108c0, (t1) this.f2109d0, (a1) this.f2110e0, cVar);
                zVar4.Z = obj;
                return zVar4;
            case 7:
                return new z((p0) this.Z, (w0) this.f2108c0, (q4.y) this.f2107b0, (b1) this.f2109d0, (q4.j) this.f2110e0, cVar);
            default:
                return new z((r1.c) this.Z, (q4.x) this.f2107b0, (p0) this.f2108c0, (k1) this.f2109d0, (q4.q) this.f2110e0, cVar, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x03f6, code lost:
        if (r2 == r13) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03fd, code lost:
        if (r2 == r13) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0400, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0401, code lost:
        if (r2 != r13) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x040a, code lost:
        if (d1.x0.m(r12, r24) == r13) goto L237;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b6 A[Catch: all -> 0x0210, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00f1, blocks: (B:43:0x00ec, B:73:0x01af, B:74:0x01b5, B:76:0x01ba, B:77:0x01bb, B:79:0x01c2, B:80:0x01ce, B:75:0x01b6), top: B:294:0x00de }] */
    /* JADX WARN: Type inference failed for: r10v26, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v14, types: [ec.j, mc.q] */
    /* JADX WARN: Type inference failed for: r2v53, types: [int, ah.e] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.z.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(i iVar, w0 w0Var, n2.b1 b1Var, w0 w0Var2, cc.c cVar) {
        super(2, cVar);
        this.X = 0;
        this.f2107b0 = iVar;
        this.f2108c0 = w0Var;
        this.f2110e0 = b1Var;
        this.f2109d0 = w0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x0 x0Var, Object obj, q1 q1Var, cc.c cVar) {
        super(2, cVar);
        this.X = 2;
        this.f2109d0 = x0Var;
        this.Z = obj;
        this.f2110e0 = q1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
        this.f2107b0 = obj2;
        this.f2108c0 = obj3;
        this.f2109d0 = obj4;
        this.f2110e0 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(u1 u1Var, t1 t1Var, a1 a1Var, cc.c cVar) {
        super(2, cVar);
        this.X = 6;
        this.f2108c0 = u1Var;
        this.f2109d0 = t1Var;
        this.f2110e0 = a1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t0 t0Var, mc.l lVar, d2.c cVar, d2.o oVar, cc.c cVar2) {
        super(2, cVar2);
        this.X = 3;
        this.f2107b0 = t0Var;
        this.f2108c0 = lVar;
        this.f2109d0 = cVar;
        this.f2110e0 = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(v3.w wVar, mc.q qVar, mc.l lVar, r1 r1Var, cc.c cVar) {
        super(2, cVar);
        this.X = 4;
        this.f2107b0 = wVar;
        this.f2108c0 = (ec.j) qVar;
        this.f2109d0 = lVar;
        this.f2110e0 = r1Var;
    }
}
