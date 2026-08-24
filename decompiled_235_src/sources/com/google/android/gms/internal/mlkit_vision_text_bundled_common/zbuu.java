package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Iterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbuu implements Iterator {
    private final Iterator zba;

    public zbuu(Iterator it) {
        this.zba = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zba.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zba.next();
        if (entry.getValue() instanceof zbuv) {
            return new zbut(entry, null);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zba.remove();
    }
}
