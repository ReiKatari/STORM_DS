package h1;

import java.util.concurrent.CancellationException;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final p2.b f5838a;

    public a(int i2) {
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f5838a = new p2.b(new p1.j[16]);
                return;
            default:
                this.f5838a = new p2.b(new g[16]);
                return;
        }
    }

    public void a(CancellationException cancellationException) {
        p2.b bVar = this.f5838a;
        int i2 = bVar.L;
        zc.g[] gVarArr = new zc.g[i2];
        for (int i10 = 0; i10 < i2; i10++) {
            gVarArr[i10] = ((g) bVar.A[i10]).f5901b;
        }
        for (int i11 = 0; i11 < i2; i11++) {
            gVarArr[i11].n(cancellationException);
        }
        if (bVar.L == 0) {
            return;
        }
        k1.b.c("uncancelled requests present");
    }

    public void b() {
        p2.b bVar = this.f5838a;
        sc.d L = p7.j.L(0, bVar.L);
        int i2 = L.A;
        int i10 = L.B;
        if (i2 <= i10) {
            while (true) {
                ((g) bVar.A[i2]).f5901b.h(yb.y.f14813a);
                if (i2 == i10) {
                    break;
                }
                i2++;
            }
        }
        bVar.g();
    }
}
