package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbko {
    private final zbkm zba;

    private zbko(zbkm zbkmVar) {
        int i = zbkc.zbb;
        this.zba = zbkmVar;
    }

    public static zbko zba(String str) {
        return new zbko(new zbkm("#vk "));
    }

    public final List zbb(CharSequence charSequence) {
        charSequence.getClass();
        zbkl zbklVar = new zbkl(this.zba, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zbklVar.hasNext()) {
            arrayList.add((String) zbklVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
