package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvg extends java.util.LinkedHashMap {
    private static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg zba = null;
    private boolean zbb;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg.zba = r0
            r1 = 0
            r0.zbb = r1
            return
    }

    private zbvg() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zbb = r0
            return
    }

    private zbvg(java.util.Map r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.zbb = r1
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg zba() {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg.zba
            return r0
    }

    private static int zbf(java.lang.Object r2) {
            boolean r0 = r2 instanceof byte[]
            r1 = 0
            if (r0 == 0) goto L10
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb(r0, r2, r1, r0)
            if (r2 != 0) goto Lf
            r2 = 1
        Lf:
            return r2
        L10:
            boolean r0 = r2 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuh
            if (r0 != 0) goto L19
            int r2 = r2.hashCode()
            return r2
        L19:
            defpackage.e41.t()
            return r1
    }

    private final void zbg() {
            r0 = this;
            boolean r0 = r0.zbb
            if (r0 == 0) goto L5
            return
        L5:
            defpackage.e41.t()
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
            r0 = this;
            r0.zbg()
            super.clear()
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L9
            java.util.Set r1 = java.util.Collections.EMPTY_SET
            return r1
        L9:
            java.util.Set r1 = super.entrySet()
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L58
            java.util.Map r4 = (java.util.Map) r4
            if (r3 != r4) goto L9
            goto L56
        L9:
            int r0 = r3.size()
            int r1 = r4.size()
            if (r0 == r1) goto L14
            goto L58
        L14:
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            boolean r1 = r4.containsKey(r1)
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.getValue()
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r0 = r4.get(r0)
            boolean r2 = r1 instanceof byte[]
            if (r2 == 0) goto L4f
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L4f
            byte[] r1 = (byte[]) r1
            byte[] r0 = (byte[]) r0
            boolean r0 = java.util.Arrays.equals(r1, r0)
            goto L53
        L4f:
            boolean r0 = r1.equals(r0)
        L53:
            if (r0 != 0) goto L1c
            goto L58
        L56:
            r3 = 1
            return r3
        L58:
            r3 = 0
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r3 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            int r2 = zbf(r2)
            java.lang.Object r1 = r1.getValue()
            int r1 = zbf(r1)
            r1 = r1 ^ r2
            int r0 = r0 + r1
            goto L9
        L28:
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            r1.zbg()
            byte[] r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r2.getClass()
            r3.getClass()
            java.lang.Object r1 = super.put(r2, r3)
            return r1
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map r4) {
            r3 = this;
            r3.zbg()
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            byte[] r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            r1.getClass()
            java.lang.Object r1 = r4.get(r1)
            r1.getClass()
            goto Lb
        L22:
            super.putAll(r4)
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            r0.zbg()
            java.lang.Object r0 = super.remove(r1)
            return r0
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg zbb() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg
            r1.<init>()
            return r1
        Lc:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg
            r0.<init>(r1)
            return r0
    }

    public final void zbc() {
            r1 = this;
            r0 = 0
            r1.zbb = r0
            return
    }

    public final void zbd(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r2) {
            r1 = this;
            r1.zbg()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lc
            r1.putAll(r2)
        Lc:
            return
    }

    public final boolean zbe() {
            r0 = this;
            boolean r0 = r0.zbb
            return r0
    }
}
