package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s70  reason: default package */
/* loaded from: classes.dex */
public final class s70 implements Iterator {
    public int A = 0;
    public final int B;
    public final /* synthetic */ x70 L;

    public s70(x70 x70Var) {
        this.L = x70Var;
        this.B = x70Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A < this.B) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A;
        if (i < this.B) {
            this.A = i + 1;
            return Byte.valueOf(this.L.j(i));
        }
        vd6.b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
