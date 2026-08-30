package a1;

import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Iterator, oc.a {
    public int A;
    public int B;
    public boolean L;
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i2) {
        this(eVar.L);
        this.R = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.X = eVar;
                this(eVar.L);
                return;
            default:
                this.X = eVar;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.B < this.A) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f8;
        if (hasNext()) {
            int i2 = this.B;
            switch (this.R) {
                case 0:
                    f8 = ((e) this.X).f(i2);
                    break;
                case DSiCameraSource.FrontCamera /* 1 */:
                    f8 = ((e) this.X).i(i2);
                    break;
                default:
                    f8 = ((f) this.X).B[i2];
                    break;
            }
            this.B++;
            this.L = true;
            return f8;
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.L) {
            int i2 = this.B - 1;
            this.B = i2;
            switch (this.R) {
                case 0:
                    ((e) this.X).g(i2);
                    break;
                case DSiCameraSource.FrontCamera /* 1 */:
                    ((e) this.X).g(i2);
                    break;
                default:
                    ((f) this.X).a(i2);
                    break;
            }
            this.A--;
            this.L = false;
            return;
        }
        a0.j.p("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.L);
        this.R = 2;
        this.X = fVar;
    }

    public a(int i2) {
        this.A = i2;
    }
}
