package p7;

import k7.b0;
import k7.c0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public b0 Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f11413b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ k7.t f11414c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ mc.l f11415d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(k7.t tVar, cc.c cVar, mc.l lVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f11414c0 = tVar;
        this.f11415d0 = lVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        c0 c0Var = (c0) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((g) t(cVar, c0Var)).v(y.f14813a);
            default:
                return ((g) t(cVar, c0Var)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                g gVar = new g(this.f11414c0, cVar, this.f11415d0, 0);
                gVar.f11413b0 = obj;
                return gVar;
            default:
                g gVar2 = new g(this.f11414c0, cVar, this.f11415d0, 1);
                gVar2.f11413b0 = obj;
                return gVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
        if (r11 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
        if (r11 == r0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016c  */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.g.v(java.lang.Object):java.lang.Object");
    }
}
