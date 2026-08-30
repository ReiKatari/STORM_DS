package bh;

import java.util.Iterator;
import mc.p;
import q.q3;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends ec.j implements p {
    public c X;
    public f Y;
    public Iterator Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f2273b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f2274c0;

    /* renamed from: d0  reason: collision with root package name */
    public /* synthetic */ Object f2275d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ bd.h f2276e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ q3 f2277f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bd.h hVar, q3 q3Var, cc.c cVar) {
        super(2, cVar);
        this.f2276e0 = hVar;
        this.f2277f0 = q3Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((n) t((cc.c) obj2, (cd.i) obj)).v(y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        n nVar = new n(this.f2276e0, this.f2277f0, cVar);
        nVar.f2275d0 = obj;
        return nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
        if (r13.f2276e0.p(r13) != r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
        if (r14 == r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
        if (r14 == r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
        if (cd.q.s(r9, r13) == r1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017f, code lost:
        if (r0.a(hh.u0.f6580a, r13) == r1) goto L13;
     */
    /* JADX WARN: Path cross not found for [B:36:0x00d5, B:42:0x0153], limit reached: 52 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0049 -> B:14:0x004d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a5 -> B:29:0x00b0). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.n.v(java.lang.Object):java.lang.Object");
    }
}
