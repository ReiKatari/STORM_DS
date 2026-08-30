package ah;

import java.util.List;
import kf.z1;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends ec.j implements mc.q {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f799b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f800c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(mc.p pVar, cc.c cVar) {
        super(3, cVar);
        this.X = 2;
        this.f800c0 = (ec.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ec.j, mc.p] */
    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                n0 n0Var = new n0(0, (cc.c) obj3, (h1) this.f800c0);
                n0Var.Z = (cd.i) obj;
                n0Var.f799b0 = obj2;
                return n0Var.v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                n0 n0Var2 = new n0((bi.i0) this.f800c0, (cc.c) obj3);
                n0Var2.Z = (List) obj;
                n0Var2.f799b0 = (String) obj2;
                return n0Var2.v(yb.y.f14813a);
            case 2:
                n0 n0Var3 = new n0((mc.p) ((ec.j) this.f800c0), (cc.c) obj3);
                n0Var3.Z = (cd.i) obj;
                n0Var3.f799b0 = obj2;
                return n0Var3.v(yb.y.f14813a);
            default:
                n0 n0Var4 = new n0(3, (cc.c) obj3, (z1) this.f800c0);
                n0Var4.Z = (cd.i) obj;
                n0Var4.f799b0 = (Object[]) obj2;
                return n0Var4.v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Type inference failed for: r4v6, types: [ec.j, mc.p] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.n0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(bi.i0 i0Var, cc.c cVar) {
        super(3, cVar);
        this.X = 1;
        this.f800c0 = i0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i2, cc.c cVar, Object obj) {
        super(3, cVar);
        this.X = i2;
        this.f800c0 = obj;
    }
}
