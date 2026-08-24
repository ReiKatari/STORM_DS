package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dw4  reason: default package */
/* loaded from: classes.dex */
public final class dw4 implements Iterator, zf3 {
    public final /* synthetic */ int A = 0;
    public final Iterator B;

    public dw4(aw4 aw4Var) {
        bc7[] bc7VarArr = new bc7[8];
        for (int i = 0; i < 8; i++) {
            bc7VarArr[i] = new dc7(this);
        }
        this.B = new bw4(aw4Var, bc7VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return ((bw4) this.B).L;
            default:
                return this.B.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                return (Map.Entry) ((bw4) this.B).next();
            default:
                return (fl7) this.B.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                ((bw4) this.B).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dw4(dl7 dl7Var) {
        this.B = dl7Var.f0.iterator();
    }
}
