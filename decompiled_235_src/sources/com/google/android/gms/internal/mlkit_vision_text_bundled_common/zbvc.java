package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvc implements zbvk {
    private final zbvk[] zba;

    public zbvc(zbvk... zbvkVarArr) {
        this.zba = zbvkVarArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final zbvj zbb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zbvk zbvkVar = this.zba[i];
            if (zbvkVar.zbc(cls)) {
                return zbvkVar.zbb(cls);
            }
        }
        fa6.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final boolean zbc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zba[i].zbc(cls)) {
                return true;
            }
        }
        return false;
    }
}
