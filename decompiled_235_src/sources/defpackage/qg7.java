package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qg7  reason: default package */
/* loaded from: classes.dex */
public final class qg7 implements Iterator {
    public Iterator A;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.A.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
