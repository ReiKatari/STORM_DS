package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zble implements java.util.Iterator {
    final java.util.Iterator zbb;

    public zble(java.util.Iterator r1) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            r0.zbb = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            java.util.Iterator r0 = r0.zbb
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            java.util.Iterator r0 = r1.zbb
            java.lang.Object r0 = r0.next()
            java.lang.Object r1 = r1.zba(r0)
            return r1
    }

    @Override // java.util.Iterator
    public final void remove() {
            r0 = this;
            java.util.Iterator r0 = r0.zbb
            r0.remove()
            return
    }

    public abstract java.lang.Object zba(java.lang.Object r1);
}
