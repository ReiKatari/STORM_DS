package qb;

import java.util.HashMap;
import m9.o;
import me.magnum.melonds.common.camera.DSiCameraSource;
import ob.b;
import ob.d;
import rb.c;
import rb.e;
import rb.f;
import rb.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12508a;

    public final Object a(b bVar, d dVar) {
        switch (this.f12508a) {
            case 0:
                return new rb.a(bVar.f10863a, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new c(bVar.f10863a);
            case 2:
                return new o4.b(2, bVar.f10863a);
            case 3:
                return new rb.d(0);
            case 4:
                return new e(bVar.f10863a, ((Integer) pb.e.f11537d.a(dVar)).intValue());
            case l1.c.f8511g /* 5 */:
                return new f(bVar.f10863a, (String) pb.e.f11538e.a(dVar), bVar.f10866d);
            case l1.c.f8509e /* 6 */:
                pb.f fVar = bVar.f10863a;
                if (pb.d.BULLET == pb.e.f11534a.a(dVar)) {
                    return new rb.b(fVar, ((Integer) pb.e.f11535b.a(dVar)).intValue());
                }
                return new h(fVar, String.valueOf(pb.e.f11536c.a(dVar)).concat(". "));
            case 7:
                return new rb.d(1);
            case 8:
                return new rb.a(bVar.f10863a, 1);
            default:
                pb.f fVar2 = bVar.f10863a;
                String str = (String) sb.b.f12860a.a(dVar);
                sb.b bVar2 = bVar.f10864b;
                l7.a aVar = bVar.f10868f;
                HashMap hashMap = dVar.f10873a;
                if (hashMap.get(sb.b.f12862c) == null) {
                    sb.a aVar2 = new sb.a(str, bVar2, aVar);
                    Object obj = Boolean.FALSE;
                    Object obj2 = hashMap.get(sb.b.f12861b);
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    return new sb.c(fVar2, aVar2, ((Boolean) obj).booleanValue());
                }
                o.b();
                return null;
        }
    }
}
