package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bc7  reason: default package */
/* loaded from: classes.dex */
public abstract class bc7 implements Iterator, zf3 {
    public Object[] A = ac7.e.d;
    public int B;
    public int L;

    public final void a(Object[] objArr, int i, int i2) {
        this.A = objArr;
        this.B = i;
        this.L = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.L < this.B) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
