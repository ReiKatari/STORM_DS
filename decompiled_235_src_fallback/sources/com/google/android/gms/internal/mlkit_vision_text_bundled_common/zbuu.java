package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbuu implements java.util.Iterator {
    private final java.util.Iterator zba;

    public zbuu(java.util.Iterator r1) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            java.util.Iterator r0 = r0.zba
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
            r2 = this;
            java.util.Iterator r2 = r2.zba
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r0 = r2.getValue()
            boolean r0 = r0 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv
            if (r0 == 0) goto L17
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbut r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbut
            r1 = 0
            r0.<init>(r2, r1)
            return r0
        L17:
            return r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r0 = this;
            java.util.Iterator r0 = r0.zba
            r0.remove()
            return
    }
}
