package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v27  reason: default package */
/* loaded from: classes.dex */
public final class v27 implements Iterator {
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
