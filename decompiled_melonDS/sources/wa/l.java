package wa;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements Iterator {
    public n A;
    public n B = null;
    public int L;
    public final /* synthetic */ o R;
    public final /* synthetic */ int X;

    public l(o oVar, int i2) {
        this.X = i2;
        this.R = oVar;
        this.A = oVar.Y.R;
        this.L = oVar.X;
    }

    public final Object a() {
        return b();
    }

    public final n b() {
        n nVar = this.A;
        o oVar = this.R;
        if (nVar != oVar.Y) {
            if (oVar.X == this.L) {
                this.A = nVar.R;
                this.B = nVar;
                return nVar;
            }
            throw new ConcurrentModificationException();
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A != this.R.Y) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.X) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return b().Y;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        n nVar = this.B;
        if (nVar != null) {
            o oVar = this.R;
            oVar.c(nVar, true);
            this.B = null;
            this.L = oVar.X;
            return;
        }
        throw new IllegalStateException();
    }
}
