package ai;

import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends ec.j implements mc.p {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ int Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f828b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f829c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Object f830d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(cd.h[] hVarArr, int i2, AtomicInteger atomicInteger, bd.h hVar, cc.c cVar) {
        super(2, cVar);
        this.f828b0 = hVarArr;
        this.Z = i2;
        this.f829c0 = atomicInteger;
        this.f830d0 = hVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((g) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((g) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                g gVar = new g((n1.x) this.f829c0, (d1.c) this.f830d0, this.Z, cVar);
                gVar.f828b0 = obj;
                return gVar;
            default:
                return new g((cd.h[]) this.f828b0, this.Z, (AtomicInteger) this.f829c0, (bd.h) this.f830d0, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b5 -> B:45:0x00b8). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.g.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n1.x xVar, d1.c cVar, int i2, cc.c cVar2) {
        super(2, cVar2);
        this.f829c0 = xVar;
        this.f830d0 = cVar;
        this.Z = i2;
    }
}
