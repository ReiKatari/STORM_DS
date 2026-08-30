package b4;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i3 extends ec.j implements mc.p {
    public final /* synthetic */ int X = 0;
    public Object Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f1858b0;

    /* renamed from: c0  reason: collision with root package name */
    public Object f1859c0;

    /* renamed from: d0  reason: collision with root package name */
    public Object f1860d0;

    /* renamed from: e0  reason: collision with root package name */
    public Object f1861e0;

    /* renamed from: f0  reason: collision with root package name */
    public /* synthetic */ Object f1862f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ Object f1863g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(h9.g gVar, m9.j jVar, Object obj, m9.n nVar, b9.c cVar, k9.a aVar, d0.i1 i1Var, cc.c cVar2) {
        super(2, cVar2);
        this.f1858b0 = gVar;
        this.f1859c0 = jVar;
        this.Y = obj;
        this.f1860d0 = nVar;
        this.f1861e0 = cVar;
        this.f1862f0 = aVar;
        this.f1863g0 = i1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((i3) t((cc.c) obj2, (cd.i) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((i3) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 2:
                return ((i3) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 3:
                return ((i3) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 4:
                return ((i3) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((i3) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                return ((i3) t((cc.c) obj2, (cd.i) obj)).v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ec.j, mc.l] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ec.j, mc.l] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ec.j, mc.l] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                i3 i3Var = new i3((ContentResolver) this.f1859c0, (Uri) this.f1860d0, (j3) this.f1861e0, (bd.h) this.f1862f0, (Context) this.f1863g0, cVar);
                i3Var.Y = obj;
                return i3Var;
            case DSiCameraSource.FrontCamera /* 1 */:
                i3 i3Var2 = new i3((d1.j0) this.f1861e0, (d1.m0) this.f1862f0, (mc.l) ((ec.j) this.f1863g0), cVar);
                i3Var2.f1860d0 = obj;
                return i3Var2;
            case 2:
                i3 i3Var3 = new i3((f1.f1) this.f1861e0, (f1.j1) this.f1862f0, (mc.l) ((ec.j) this.f1863g0), cVar);
                i3Var3.f1860d0 = obj;
                return i3Var3;
            case 3:
                i3 i3Var4 = new i3((f1.f1) this.f1861e0, (g2.f2) this.f1862f0, (mc.l) ((ec.j) this.f1863g0), cVar);
                i3Var4.f1860d0 = obj;
                return i3Var4;
            case 4:
                return new i3((h9.g) this.f1858b0, (nc.t) this.f1859c0, (nc.t) this.f1860d0, (m9.j) this.f1861e0, this.Y, (nc.t) this.f1862f0, (b9.c) this.f1863g0, cVar);
            case l1.c.f8511g /* 5 */:
                return new i3((h9.g) this.f1858b0, (m9.j) this.f1859c0, this.Y, (m9.n) this.f1860d0, (b9.c) this.f1861e0, (k9.a) this.f1862f0, (d0.i1) this.f1863g0, cVar);
            default:
                i3 i3Var5 = new i3((mc.a) this.f1863g0, cVar);
                i3Var5.f1862f0 = obj;
                return i3Var5;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f0, code lost:
        if (r12 == r0) goto L16;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d9 A[LOOP:0: B:39:0x00f7->B:101:0x01d9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0417 A[Catch: all -> 0x0422, TRY_LEAVE, TryCatch #23 {all -> 0x0422, blocks: (B:212:0x040e, B:213:0x0410, B:216:0x0417, B:224:0x0428, B:225:0x042a, B:227:0x0430, B:230:0x0437), top: B:405:0x0356 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04e7 A[Catch: all -> 0x04f2, TRY_LEAVE, TryCatch #14 {all -> 0x04f2, blocks: (B:258:0x04de, B:259:0x04e0, B:262:0x04e7, B:270:0x04f8, B:271:0x04fa, B:273:0x0500, B:276:0x0507), top: B:388:0x044c }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05dd A[Catch: all -> 0x05e8, TRY_LEAVE, TryCatch #6 {all -> 0x05e8, blocks: (B:313:0x05d4, B:314:0x05d6, B:317:0x05dd, B:325:0x05ee, B:326:0x05f0, B:328:0x05f6, B:331:0x05fd), top: B:374:0x0514 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x067d A[Catch: all -> 0x0630, TRY_LEAVE, TryCatch #11 {all -> 0x0630, blocks: (B:344:0x0628, B:354:0x0662, B:358:0x0675, B:360:0x067d, B:350:0x0642, B:353:0x0659), top: B:382:0x0618 }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int, id.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, id.a] */
    /* JADX WARN: Type inference failed for: r2v34, types: [int, id.a] */
    /* JADX WARN: Type inference failed for: r4v27, types: [mc.l] */
    /* JADX WARN: Type inference failed for: r4v39, types: [mc.l] */
    /* JADX WARN: Type inference failed for: r4v53, types: [mc.l] */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x01d6 -> B:85:0x01b5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:363:0x06a4 -> B:354:0x0662). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01b2 -> B:84:0x01b4). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 1732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.i3.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(d1.j0 j0Var, d1.m0 m0Var, mc.l lVar, cc.c cVar) {
        super(2, cVar);
        this.f1861e0 = j0Var;
        this.f1862f0 = m0Var;
        this.f1863g0 = (ec.j) lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(f1.f1 f1Var, f1.j1 j1Var, mc.l lVar, cc.c cVar) {
        super(2, cVar);
        this.f1861e0 = f1Var;
        this.f1862f0 = j1Var;
        this.f1863g0 = (ec.j) lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(f1.f1 f1Var, g2.f2 f2Var, mc.l lVar, cc.c cVar) {
        super(2, cVar);
        this.f1861e0 = f1Var;
        this.f1862f0 = f2Var;
        this.f1863g0 = (ec.j) lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(ContentResolver contentResolver, Uri uri, j3 j3Var, bd.h hVar, Context context, cc.c cVar) {
        super(2, cVar);
        this.f1859c0 = contentResolver;
        this.f1860d0 = uri;
        this.f1861e0 = j3Var;
        this.f1862f0 = hVar;
        this.f1863g0 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(h9.g gVar, nc.t tVar, nc.t tVar2, m9.j jVar, Object obj, nc.t tVar3, b9.c cVar, cc.c cVar2) {
        super(2, cVar2);
        this.f1858b0 = gVar;
        this.f1859c0 = tVar;
        this.f1860d0 = tVar2;
        this.f1861e0 = jVar;
        this.Y = obj;
        this.f1862f0 = tVar3;
        this.f1863g0 = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(mc.a aVar, cc.c cVar) {
        super(2, cVar);
        this.f1863g0 = aVar;
    }
}
