package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gy6  reason: default package */
/* loaded from: classes.dex */
public abstract class gy6 implements Iterator, f93 {
    public Object[] A = fy6.e.d;
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
