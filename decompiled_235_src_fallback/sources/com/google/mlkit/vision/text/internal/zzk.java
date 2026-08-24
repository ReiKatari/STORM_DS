package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzk {
    static final com.google.android.gms.internal.mlkit_vision_text_common.zzv zza = null;
    public static final /* synthetic */ int zzb = 0;
    private static final java.util.Comparator zzc = null;

    static {
            java.lang.String r0 = "\n"
            com.google.android.gms.internal.mlkit_vision_text_common.zzv r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzv.zza(r0)
            com.google.mlkit.vision.text.internal.zzk.zza = r0
            com.google.mlkit.vision.text.internal.zzf r0 = new com.google.mlkit.vision.text.internal.zzf
            r0.<init>()
            com.google.mlkit.vision.text.internal.zzk.zzc = r0
            return
    }

    public static com.google.mlkit.vision.text.Text zza(com.google.android.gms.internal.mlkit_vision_text_common.zzl[] r29, android.graphics.Matrix r30) {
            r0 = r29
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L2a
            r5 = r0[r4]
            int r6 = r5.zzj
            java.lang.Object r6 = r1.get(r6)
            android.util.SparseArray r6 = (android.util.SparseArray) r6
            if (r6 != 0) goto L22
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            int r7 = r5.zzj
            r1.append(r7, r6)
        L22:
            int r7 = r5.zzk
            r6.append(r7, r5)
            int r4 = r4 + 1
            goto La
        L2a:
            com.google.android.gms.internal.mlkit_vision_text_common.zzbh r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzbh
            r0.<init>()
            r2 = r3
        L30:
            int r4 = r1.size()
            if (r2 >= r4) goto L1c3
            java.lang.Object r4 = r1.valueAt(r2)
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            com.google.android.gms.internal.mlkit_vision_text_common.zzbh r5 = new com.google.android.gms.internal.mlkit_vision_text_common.zzbh
            r5.<init>()
            r6 = r3
        L42:
            int r7 = r4.size()
            if (r6 >= r7) goto L54
            java.lang.Object r7 = r4.valueAt(r6)
            com.google.android.gms.internal.mlkit_vision_text_common.zzl r7 = (com.google.android.gms.internal.mlkit_vision_text_common.zzl) r7
            r5.zza(r7)
            int r6 = r6 + 1
            goto L42
        L54:
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r4 = r5.zzb()
            com.google.mlkit.vision.text.internal.zzh r5 = new com.google.mlkit.vision.text.internal.zzh
            r11 = r30
            r5.<init>(r11)
            java.util.List r12 = com.google.android.gms.internal.mlkit_vision_text_common.zzbu.zza(r4, r5)
            java.lang.Object r5 = r4.get(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzl r5 = (com.google.android.gms.internal.mlkit_vision_text_common.zzl) r5
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r5 = r5.zzb
            com.google.android.gms.internal.mlkit_vision_text_common.zzcp r4 = r4.zzj(r3)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = r7
            r9 = r8
            r7 = r6
        L77:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L135
            java.lang.Object r10 = r4.next()
            com.google.android.gms.internal.mlkit_vision_text_common.zzl r10 = (com.google.android.gms.internal.mlkit_vision_text_common.zzl) r10
            com.google.android.gms.internal.mlkit_vision_text_common.zzf r10 = r10.zzb
            int r14 = r5.zza
            int r14 = -r14
            int r15 = r5.zzb
            int r15 = -r15
            r16 = r3
            float r3 = r5.zze
            r17 = r14
            double r13 = (double) r3
            double r13 = java.lang.Math.toRadians(r13)
            double r13 = java.lang.Math.sin(r13)
            float r3 = r5.zze
            r18 = r1
            r19 = r2
            double r1 = (double) r3
            double r1 = java.lang.Math.toRadians(r1)
            double r1 = java.lang.Math.cos(r1)
            r20 = r1
            r3 = 4
            android.graphics.Point[] r1 = new android.graphics.Point[r3]
            android.graphics.Point r2 = new android.graphics.Point
            int r3 = r10.zza
            r22 = r1
            int r1 = r10.zzb
            r2.<init>(r3, r1)
            r22[r16] = r2
            r1 = r17
            r2.offset(r1, r15)
            r1 = r22[r16]
            int r2 = r1.x
            r15 = r4
            double r3 = (double) r2
            double r3 = r3 * r20
            r23 = r3
            int r3 = r1.y
            r25 = r13
            double r13 = (double) r3
            double r13 = r13 * r25
            int r2 = -r2
            r27 = r13
            double r13 = (double) r2
            double r13 = r13 * r25
            double r2 = (double) r3
            double r2 = r2 * r20
            r20 = r2
            double r2 = r23 + r27
            int r2 = (int) r2
            r1.x = r2
            double r13 = r13 + r20
            int r3 = (int) r13
            r1.y = r3
            android.graphics.Point r1 = new android.graphics.Point
            int r4 = r10.zzc
            int r4 = r4 + r2
            r1.<init>(r4, r3)
            r4 = 1
            r22[r4] = r1
            android.graphics.Point r1 = new android.graphics.Point
            int r4 = r10.zzc
            int r4 = r4 + r2
            int r13 = r10.zzd
            int r13 = r13 + r3
            r1.<init>(r4, r13)
            r4 = 2
            r22[r4] = r1
            android.graphics.Point r1 = new android.graphics.Point
            int r4 = r10.zzd
            int r3 = r3 + r4
            r1.<init>(r2, r3)
            r2 = 3
            r22[r2] = r1
            r1 = r16
        L10c:
            r3 = 4
            if (r1 >= r3) goto L12c
            r2 = r22[r1]
            int r3 = r2.x
            int r8 = java.lang.Math.min(r8, r3)
            int r3 = r2.x
            int r6 = java.lang.Math.max(r6, r3)
            int r3 = r2.y
            int r9 = java.lang.Math.min(r9, r3)
            int r2 = r2.y
            int r7 = java.lang.Math.max(r7, r2)
            int r1 = r1 + 1
            goto L10c
        L12c:
            r4 = r15
            r3 = r16
            r1 = r18
            r2 = r19
            goto L77
        L135:
            r18 = r1
            r19 = r2
            r16 = r3
            int r1 = r5.zza
            int r2 = r5.zzb
            float r3 = r5.zze
            double r3 = (double) r3
            double r3 = java.lang.Math.toRadians(r3)
            double r3 = java.lang.Math.sin(r3)
            float r5 = r5.zze
            double r13 = (double) r5
            double r13 = java.lang.Math.toRadians(r13)
            double r13 = java.lang.Math.cos(r13)
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>(r8, r9)
            android.graphics.Point r10 = new android.graphics.Point
            r10.<init>(r6, r9)
            android.graphics.Point r9 = new android.graphics.Point
            r9.<init>(r6, r7)
            android.graphics.Point r6 = new android.graphics.Point
            r6.<init>(r8, r7)
            android.graphics.Point[] r5 = new android.graphics.Point[]{r5, r10, r9, r6}
            r6 = r16
        L16f:
            r7 = 4
            if (r6 >= r7) goto L198
            r8 = r5[r6]
            int r9 = r8.x
            r20 = r3
            double r3 = (double) r9
            double r3 = r3 * r13
            int r10 = r8.y
            r15 = r8
            double r7 = (double) r10
            double r7 = r7 * r20
            r22 = r3
            double r3 = (double) r9
            double r3 = r3 * r20
            double r9 = (double) r10
            double r9 = r9 * r13
            double r7 = r22 - r7
            int r7 = (int) r7
            r15.x = r7
            double r3 = r3 + r9
            int r3 = (int) r3
            r15.y = r3
            r15.offset(r1, r2)
            int r6 = r6 + 1
            r3 = r20
            goto L16f
        L198:
            java.util.List r9 = java.util.Arrays.asList(r5)
            com.google.mlkit.vision.text.Text$TextBlock r6 = new com.google.mlkit.vision.text.Text$TextBlock
            com.google.android.gms.internal.mlkit_vision_text_common.zzv r1 = com.google.mlkit.vision.text.internal.zzk.zza
            com.google.mlkit.vision.text.internal.zzi r2 = new com.google.mlkit.vision.text.internal.zzi
            r2.<init>()
            java.util.List r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzbu.zza(r12, r2)
            java.lang.String r7 = r1.zzb(r2)
            android.graphics.Rect r8 = com.google.mlkit.vision.text.internal.zza.zza(r9)
            java.lang.String r10 = zzb(r12)
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.zza(r6)
            int r2 = r19 + 1
            r3 = r16
            r1 = r18
            goto L30
        L1c3:
            com.google.android.gms.internal.mlkit_vision_text_common.zzbk r0 = r0.zzb()
            com.google.mlkit.vision.text.Text r1 = new com.google.mlkit.vision.text.Text
            com.google.android.gms.internal.mlkit_vision_text_common.zzv r2 = com.google.mlkit.vision.text.internal.zzk.zza
            com.google.mlkit.vision.text.internal.zzg r3 = new com.google.mlkit.vision.text.internal.zzg
            r3.<init>()
            java.util.List r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzbu.zza(r0, r3)
            java.lang.String r2 = r2.zzb(r3)
            r1.<init>(r2, r0)
            return r1
    }

    private static java.lang.String zzb(java.util.List r3) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r3.next()
            com.google.mlkit.vision.text.Text$Line r1 = (com.google.mlkit.vision.text.Text.Line) r1
            java.lang.String r1 = r1.getRecognizedLanguage()
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L2b
        L2a:
            r2 = 0
        L2b:
            int r2 = r2 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L9
        L35:
            java.util.Set r3 = r0.entrySet()
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L40
            goto L55
        L40:
            java.util.Comparator r0 = com.google.mlkit.vision.text.internal.zzk.zzc
            java.lang.Object r3 = java.util.Collections.max(r3, r0)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzy.zzb(r3)
            if (r0 != 0) goto L55
            return r3
        L55:
            java.lang.String r3 = "und"
            return r3
    }
}
