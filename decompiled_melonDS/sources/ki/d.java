package ki;

import java.util.Map;
import mc.p;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ m Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Map f8303b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ mc.l f8304c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ nc.e f8305d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(m mVar, Map map, mc.l lVar, nc.e eVar, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = mVar;
        this.f8303b0 = map;
        this.f8304c0 = lVar;
        this.f8305d0 = eVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((d) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((d) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new d(this.Z, this.f8303b0, this.f8304c0, this.f8305d0, cVar, 0);
            default:
                return new d(this.Z, this.f8303b0, this.f8304c0, this.f8305d0, cVar, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.d.v(java.lang.Object):java.lang.Object");
    }
}
