package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lv3  reason: default package */
/* loaded from: classes.dex */
public final class lv3 implements Iterator, zf3 {
    public String A;
    public boolean B;
    public final /* synthetic */ ev L;

    public lv3(ev evVar) {
        this.L = evVar;
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
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
