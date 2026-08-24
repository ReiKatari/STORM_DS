package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zble implements Iterator {
    final Iterator zbb;

    public zble(Iterator it) {
        it.getClass();
        this.zbb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zbb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return zba(this.zbb.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zbb.remove();
    }

    public abstract Object zba(Object obj);
}
