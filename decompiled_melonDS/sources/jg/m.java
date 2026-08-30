package jg;

import ah.l0;
import androidx.lifecycle.s0;
import cd.n1;
import cd.z0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ u B;

    public /* synthetic */ m(u uVar, int i2) {
        this.A = i2;
        this.B = uVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                u uVar = this.B;
                return cd.q.y(new z0(new di.b(17, (cc.c) null, uVar)), s0.h(uVar), new n1(1000L, Long.MAX_VALUE), 1);
            case DSiCameraSource.FrontCamera /* 1 */:
                u uVar2 = this.B;
                return cd.q.y(cd.q.z(uVar2.f7881g, new n(null, uVar2, 2)), s0.h(uVar2), new n1(1000L, Long.MAX_VALUE), 1);
            case 2:
                u uVar3 = this.B;
                return cd.q.y(cd.q.z(cd.q.z(new l0(uVar3.f7882h, 6), new n(null, uVar3, 0)), new n(null, uVar3, 1)), s0.h(uVar3), new n1(1000L, Long.MAX_VALUE), 1);
            case 3:
                u uVar4 = this.B;
                return cd.q.y(cd.q.z(cd.q.z(uVar4.f7881g, new n(null, uVar4, 3)), new n(null, uVar4, 4)), s0.h(uVar4), new n1(0L, Long.MAX_VALUE), 1);
            default:
                bd.h hVar = this.B.f7891r;
                y yVar = y.f14813a;
                hVar.a(yVar);
                return yVar;
        }
    }
}
