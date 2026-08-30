package zj;

import java.io.InputStream;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends i {
    public final /* synthetic */ int A;

    /* JADX WARN: Type inference failed for: r0v5, types: [fk.c, fk.b, java.lang.Object] */
    @Override // zj.i
    public final InputStream a(InputStream inputStream, b bVar) {
        switch (this.A) {
            case 0:
                fk.a aVar = new fk.a(1);
                aVar.f4993b = 8;
                return new m(inputStream, aVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                fk.a aVar2 = new fk.a(2);
                aVar2.f4993b = 4;
                return new m(inputStream, aVar2);
            case 2:
                fk.a aVar3 = new fk.a(0);
                aVar3.f4993b = 0;
                return new m(inputStream, aVar3);
            case 3:
                fk.a aVar4 = new fk.a(3);
                aVar4.f4993b = 0;
                return new m(inputStream, aVar4);
            case 4:
                fk.a aVar5 = new fk.a(4);
                aVar5.f4993b = 0;
                return new m(inputStream, aVar5);
            default:
                ?? obj = new Object();
                obj.f4997b = 0;
                obj.f4996a = 5;
                return new m(inputStream, obj);
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
