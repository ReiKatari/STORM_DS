package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbut implements java.util.Map.Entry {
    private final java.util.Map.Entry zba;

    public /* synthetic */ zbut(java.util.Map.Entry r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbus r2) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            return
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.util.Map$Entry r0 = r0.zba
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            java.util.Map$Entry r1 = r1.zba
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv) r1
            r0 = 0
            if (r1 != 0) goto Lc
            return r0
        Lc:
            throw r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
            if (r0 == 0) goto L13
            java.util.Map$Entry r1 = r1.zba
            java.lang.Object r1 = r1.getValue()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1 = r1.zbc(r2)
            return r1
        L13:
            java.lang.String r1 = "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv zba() {
            r0 = this;
            java.util.Map$Entry r0 = r0.zba
            java.lang.Object r0 = r0.getValue()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuv) r0
            return r0
    }
}
