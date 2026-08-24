package com.google.mlkit.vision.text;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Text {
    private final java.util.List zza;
    private final java.lang.String zzb;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Element extends com.google.mlkit.vision.text.Text.TextBase {
        private final java.util.List zza;
        private final float zzb;
        private final float zzc;

        public Element(com.google.android.gms.internal.mlkit_vision_text_common.zzvb r7, android.graphics.Matrix r8) {
                r6 = this;
                java.lang.String r1 = r7.zze()
                android.graphics.Rect r2 = r7.zzc()
                java.util.List r3 = r7.zzf()
                java.lang.String r4 = r7.zzd()
                r0 = r6
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                float r6 = r7.zzb()
                r0.zzb = r6
                float r6 = r7.zza()
                r0.zzc = r6
                java.util.List r6 = r7.zzg()
                if (r6 != 0) goto L2c
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
            L2c:
                com.google.mlkit.vision.text.zzb r7 = new com.google.mlkit.vision.text.zzb
                r7.<init>(r5)
                java.util.List r6 = com.google.android.gms.internal.mlkit_vision_text_common.zzbu.zza(r6, r7)
                r0.zza = r6
                return
        }

        public Element(java.lang.String r1, android.graphics.Rect r2, java.util.List r3, java.lang.String r4, android.graphics.Matrix r5, float r6, float r7, java.util.List r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                r0.zzb = r6
                r0.zzc = r7
                r0.zza = r8
                return
        }

        public float getAngle() {
                r0 = this;
                float r0 = r0.zzc
                return r0
        }

        public float getConfidence() {
                r0 = this;
                float r0 = r0.zzb
                return r0
        }

        public synchronized java.util.List<com.google.mlkit.vision.text.Text.Symbol> getSymbols() {
                r1 = this;
                monitor-enter(r1)
                java.util.List r0 = r1.zza     // Catch: java.lang.Throwable -> L5
                monitor-exit(r1)
                return r0
            L5:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
                throw r0
        }

        public java.lang.String getText() {
                r0 = this;
                java.lang.String r0 = r0.zza()
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Line extends com.google.mlkit.vision.text.Text.TextBase {
        private final java.util.List zza;
        private final float zzb;
        private final float zzc;

        public Line(com.google.android.gms.internal.mlkit_vision_text_common.zzvd r7, android.graphics.Matrix r8, float r9, float r10) {
                r6 = this;
                java.lang.String r1 = r7.zze()
                android.graphics.Rect r2 = r7.zzc()
                java.util.List r3 = r7.zzf()
                java.lang.String r4 = r7.zzd()
                r0 = r6
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                java.util.List r6 = r7.zzg()
                com.google.mlkit.vision.text.zzc r7 = new com.google.mlkit.vision.text.zzc
                r7.<init>(r5)
                java.util.List r6 = com.google.android.gms.internal.mlkit_vision_text_common.zzbu.zza(r6, r7)
                r0.zza = r6
                r0.zzb = r9
                r0.zzc = r10
                return
        }

        public Line(java.lang.String r1, android.graphics.Rect r2, java.util.List r3, java.lang.String r4, android.graphics.Matrix r5, java.util.List r6, float r7, float r8) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                r0.zza = r6
                r0.zzb = r7
                r0.zzc = r8
                return
        }

        public float getAngle() {
                r0 = this;
                float r0 = r0.zzc
                return r0
        }

        public float getConfidence() {
                r0 = this;
                float r0 = r0.zzb
                return r0
        }

        public synchronized java.util.List<com.google.mlkit.vision.text.Text.Element> getElements() {
                r1 = this;
                monitor-enter(r1)
                java.util.List r0 = r1.zza     // Catch: java.lang.Throwable -> L5
                monitor-exit(r1)
                return r0
            L5:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
                throw r0
        }

        public java.lang.String getText() {
                r0 = this;
                java.lang.String r0 = r0.zza()
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Symbol extends com.google.mlkit.vision.text.Text.TextBase {
        private final float zza;
        private final float zzb;

        public Symbol(com.google.android.gms.internal.mlkit_vision_text_common.zzvj r7, android.graphics.Matrix r8) {
                r6 = this;
                java.lang.String r1 = r7.zzd()
                android.graphics.Rect r2 = r7.zzc()
                java.util.List r3 = r7.zze()
                java.lang.String r4 = ""
                r0 = r6
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                float r6 = r7.zzb()
                r0.zza = r6
                float r6 = r7.zza()
                r0.zzb = r6
                return
        }

        public float getAngle() {
                r0 = this;
                float r0 = r0.zzb
                return r0
        }

        public float getConfidence() {
                r0 = this;
                float r0 = r0.zza
                return r0
        }

        public java.lang.String getText() {
                r0 = this;
                java.lang.String r0 = r0.zza()
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class TextBase {
        private final java.lang.String zza;
        private final android.graphics.Rect zzb;
        private final android.graphics.Point[] zzc;
        private final java.lang.String zzd;

        public TextBase(java.lang.String r3, android.graphics.Rect r4, java.util.List r5, java.lang.String r6, android.graphics.Matrix r7) {
                r2 = this;
                r2.<init>()
                r2.zza = r3
                android.graphics.Rect r3 = new android.graphics.Rect
                r3.<init>(r4)
                if (r7 == 0) goto Lf
                com.google.mlkit.vision.common.internal.CommonConvertUtils.transformRect(r3, r7)
            Lf:
                r2.zzb = r3
                int r3 = r5.size()
                android.graphics.Point[] r3 = new android.graphics.Point[r3]
                r4 = 0
            L18:
                int r0 = r5.size()
                if (r4 >= r0) goto L2e
                android.graphics.Point r0 = new android.graphics.Point
                java.lang.Object r1 = r5.get(r4)
                android.graphics.Point r1 = (android.graphics.Point) r1
                r0.<init>(r1)
                r3[r4] = r0
                int r4 = r4 + 1
                goto L18
            L2e:
                if (r7 == 0) goto L33
                com.google.mlkit.vision.common.internal.CommonConvertUtils.transformPointArray(r3, r7)
            L33:
                r2.zzc = r3
                r2.zzd = r6
                return
        }

        public android.graphics.Rect getBoundingBox() {
                r0 = this;
                android.graphics.Rect r0 = r0.zzb
                return r0
        }

        public android.graphics.Point[] getCornerPoints() {
                r0 = this;
                android.graphics.Point[] r0 = r0.zzc
                return r0
        }

        public java.lang.String getRecognizedLanguage() {
                r0 = this;
                java.lang.String r0 = r0.zzd
                return r0
        }

        public final java.lang.String zza() {
                r0 = this;
                java.lang.String r0 = r0.zza
                if (r0 != 0) goto L6
                java.lang.String r0 = ""
            L6:
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class TextBlock extends com.google.mlkit.vision.text.Text.TextBase {
        private final java.util.List zza;

        public TextBlock(com.google.android.gms.internal.mlkit_vision_text_common.zzuz r7, android.graphics.Matrix r8) {
                r6 = this;
                java.lang.String r1 = r7.zzc()
                android.graphics.Rect r2 = r7.zza()
                java.util.List r3 = r7.zzd()
                java.lang.String r4 = r7.zzb()
                r0 = r6
                r5 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                java.util.List r6 = r7.zze()
                com.google.mlkit.vision.text.zzd r7 = new com.google.mlkit.vision.text.zzd
                r7.<init>(r5)
                java.util.List r6 = com.google.android.gms.internal.mlkit_vision_text_common.zzbu.zza(r6, r7)
                r0.zza = r6
                return
        }

        public TextBlock(java.lang.String r1, android.graphics.Rect r2, java.util.List r3, java.lang.String r4, android.graphics.Matrix r5, java.util.List r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                r0.zza = r6
                return
        }

        public synchronized java.util.List<com.google.mlkit.vision.text.Text.Line> getLines() {
                r1 = this;
                monitor-enter(r1)
                java.util.List r0 = r1.zza     // Catch: java.lang.Throwable -> L5
                monitor-exit(r1)
                return r0
            L5:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
                throw r0
        }

        public java.lang.String getText() {
                r0 = this;
                java.lang.String r0 = r0.zza()
                return r0
        }
    }

    public Text(com.google.android.gms.internal.mlkit_vision_text_common.zzvf r3, android.graphics.Matrix r4) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.zza = r0
            java.lang.String r1 = r3.zza()
            r2.zzb = r1
            java.util.List r2 = r3.zzb()
            com.google.mlkit.vision.text.zza r3 = new com.google.mlkit.vision.text.zza
            r3.<init>(r4)
            java.util.List r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzbu.zza(r2, r3)
            r0.addAll(r2)
            return
    }

    public Text(java.lang.String r2, java.util.List r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zza = r0
            r0.addAll(r3)
            r1.zzb = r2
            return
    }

    public java.lang.String getText() {
            r0 = this;
            java.lang.String r0 = r0.zzb
            return r0
    }

    public java.util.List<com.google.mlkit.vision.text.Text.TextBlock> getTextBlocks() {
            r0 = this;
            java.util.List r0 = r0.zza
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }
}
