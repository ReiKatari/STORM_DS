package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbwa extends zbwh {
    public zbwa() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh
    public final void zba() {
        if (!zbj()) {
            for (int i = 0; i < zbc(); i++) {
                ((zbtt) ((zbwb) zbg(i)).zba()).zbg();
            }
            for (Map.Entry entry : zbd()) {
                ((zbtt) entry.getKey()).zbg();
            }
        }
        super.zba();
    }
}
