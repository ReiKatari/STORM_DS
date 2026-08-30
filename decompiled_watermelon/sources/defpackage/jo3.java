package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jo3  reason: default package */
/* loaded from: classes.dex */
public final class jo3 implements Iterator, f93 {
    public String A;
    public boolean B;
    public final /* synthetic */ mu L;

    public jo3(mu muVar) {
        this.L = muVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A == null && !this.B) {
            String readLine = ((BufferedReader) this.L.b).readLine();
            this.A = readLine;
            if (readLine == null) {
                this.B = true;
            }
        }
        if (this.A != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.A;
            this.A = null;
            str.getClass();
            return str;
        }
        vd6.b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
