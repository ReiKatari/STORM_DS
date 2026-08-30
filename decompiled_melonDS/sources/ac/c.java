package ac;

import a6.m0;
import fj.j;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends m0 implements Iterator, oc.a {
    public final /* synthetic */ int X;

    public c(e eVar, int i2) {
        this.X = i2;
        eVar.getClass();
        this.R = eVar;
        this.B = -1;
        this.L = eVar.f699b0;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.X) {
            case 0:
                b();
                int i2 = this.A;
                e eVar = (e) this.R;
                if (i2 < eVar.Y) {
                    this.A = i2 + 1;
                    this.B = i2;
                    d dVar = new d(eVar, i2);
                    e();
                    return dVar;
                }
                j.l();
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                b();
                int i10 = this.A;
                e eVar2 = (e) this.R;
                if (i10 < eVar2.Y) {
                    this.A = i10 + 1;
                    this.B = i10;
                    Object obj = eVar2.A[i10];
                    e();
                    return obj;
                }
                j.l();
                return null;
            default:
                b();
                int i11 = this.A;
                e eVar3 = (e) this.R;
                if (i11 < eVar3.Y) {
                    this.A = i11 + 1;
                    this.B = i11;
                    Object[] objArr = eVar3.B;
                    objArr.getClass();
                    Object obj2 = objArr[this.B];
                    e();
                    return obj2;
                }
                j.l();
                return null;
        }
    }
}
