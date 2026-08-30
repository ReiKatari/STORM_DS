package bi;

import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import oe.p0;
import oe.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends ec.j implements mc.q {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f2284b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i2, cc.c cVar, Object obj) {
        super(3, cVar);
        this.X = i2;
        this.f2284b0 = obj;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                g0 g0Var = new g0(0, (cc.c) obj3, (i0) this.f2284b0);
                g0Var.Y = (p0) obj;
                g0Var.Z = (q0) obj2;
                yb.y yVar = yb.y.f14813a;
                g0Var.v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                g0 g0Var2 = new g0(1, (cc.c) obj3, (eh.c) this.f2284b0);
                g0Var2.Y = (List) obj;
                g0Var2.Z = (oe.j) obj2;
                return g0Var2.v(yb.y.f14813a);
            default:
                g0 g0Var3 = new g0(2, (cc.c) obj3, (d5.f) this.f2284b0);
                g0Var3.Y = (ve.f) obj;
                g0Var3.Z = (ve.o) obj2;
                return g0Var3.v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x050f A[LOOP:7: B:179:0x0490->B:214:0x050f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x050d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x043b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0432 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0340  */
    /* JADX WARN: Type inference failed for: r11v6, types: [oe.x] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [oe.x] */
    /* JADX WARN: Type inference failed for: r9v13 */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.g0.v(java.lang.Object):java.lang.Object");
    }
}
