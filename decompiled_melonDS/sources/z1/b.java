package z1;

import kf.s0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import y3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ f B;
    public final /* synthetic */ b2.g L;

    public /* synthetic */ b(f fVar, b2.g gVar, int i2) {
        this.A = i2;
        this.B = fVar;
        this.L = gVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [nc.t, java.lang.Object] */
    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                f fVar = this.B;
                a aVar = fVar.f14872f;
                s0 s0Var = new s0(25, this.L);
                ?? obj = new Object();
                fVar.f14871e.c("dataBuilder", aVar, new q1.e(16, (Object) obj, s0Var));
                Object obj2 = obj.A;
                if (obj2 != null) {
                    return (x1.c) obj2;
                }
                nc.k.f("result");
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                f fVar2 = this.B;
                a aVar2 = fVar2.f14873g;
                b bVar = new b(fVar2, this.L, 2);
                ?? obj3 = new Object();
                fVar2.f14871e.c("positioner", aVar2, new q1.e(16, (Object) obj3, bVar));
                Object obj4 = obj3.A;
                if (obj4 != null) {
                    return (h3.c) obj4;
                }
                nc.k.f("result");
                throw null;
            default:
                Object b10 = this.B.f14869c.b();
                if (!((z) b10).U()) {
                    b10 = null;
                }
                z zVar = (z) b10;
                if (zVar == null) {
                    return h3.c.f6051e;
                }
                return this.L.u(zVar).i(zVar.a0(0L));
        }
    }
}
