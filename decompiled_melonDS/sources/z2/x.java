package z2;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements Iterator, oc.a {
    public final s A;
    public final Iterator B;
    public int L;
    public Map.Entry R;
    public Map.Entry X;
    public final /* synthetic */ int Y;

    public x(s sVar, Iterator it, int i2) {
        this.Y = i2;
        this.A = sVar;
        this.B = it;
        this.L = sVar.e().f14932d;
        a();
    }

    public final void a() {
        Map.Entry entry;
        this.R = this.X;
        Iterator it = this.B;
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        this.X = entry;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.X != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.Y) {
            case 0:
                a();
                if (this.R != null) {
                    return new w(this);
                }
                throw new IllegalStateException();
            case DSiCameraSource.FrontCamera /* 1 */:
                Map.Entry entry = this.X;
                if (entry != null) {
                    a();
                    return entry.getKey();
                }
                throw new IllegalStateException();
            default:
                Map.Entry entry2 = this.X;
                if (entry2 != null) {
                    a();
                    return entry2.getValue();
                }
                throw new IllegalStateException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        s sVar = this.A;
        if (sVar.e().f14932d == this.L) {
            Map.Entry entry = this.R;
            if (entry != null) {
                sVar.remove(entry.getKey());
                this.R = null;
                this.L = sVar.e().f14932d;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
