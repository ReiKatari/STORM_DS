package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbty implements zbvk {
    private static final zbty zba = new zbty();

    private zbty() {
    }

    public static zbty zba() {
        return zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final zbvj zbb(Class cls) {
        if (zbuf.class.isAssignableFrom(cls)) {
            try {
                return (zbvj) zbuf.zbs(cls.asSubclass(zbuf.class)).zbb(3, null, null);
            } catch (Exception e) {
                u34.p("Unable to get message info for ".concat(cls.getName()), e);
                return null;
            }
        }
        i.h("Unsupported message type: ".concat(cls.getName()));
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvk
    public final boolean zbc(Class cls) {
        return zbuf.class.isAssignableFrom(cls);
    }
}
