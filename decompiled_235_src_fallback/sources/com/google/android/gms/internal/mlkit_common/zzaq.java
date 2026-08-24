package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzaq extends com.google.android.gms.internal.mlkit_common.zzai {
    static final com.google.android.gms.internal.mlkit_common.zzai zza = null;
    final transient java.lang.Object[] zzb;
    private final transient java.lang.Object zzc;
    private final transient int zzd;

    static {
            com.google.android.gms.internal.mlkit_common.zzaq r0 = new com.google.android.gms.internal.mlkit_common.zzaq
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r0.<init>(r3, r2, r1)
            com.google.android.gms.internal.mlkit_common.zzaq.zza = r0
            return
    }

    private zzaq(java.lang.Object r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzb = r2
            r0.zzd = r3
            return
    }

    public static com.google.android.gms.internal.mlkit_common.zzaq zzg(int r19, java.lang.Object[] r20, com.google.android.gms.internal.mlkit_common.zzah r21) {
            r0 = r19
            r1 = r20
            r2 = r21
            if (r0 != 0) goto Ld
            com.google.android.gms.internal.mlkit_common.zzai r0 = com.google.android.gms.internal.mlkit_common.zzaq.zza
            com.google.android.gms.internal.mlkit_common.zzaq r0 = (com.google.android.gms.internal.mlkit_common.zzaq) r0
            return r0
        Ld:
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L25
            r0 = r1[r4]
            java.util.Objects.requireNonNull(r0)
            r2 = r1[r5]
            java.util.Objects.requireNonNull(r2)
            com.google.android.gms.internal.mlkit_common.zzw.zza(r0, r2)
            com.google.android.gms.internal.mlkit_common.zzaq r0 = new com.google.android.gms.internal.mlkit_common.zzaq
            r0.<init>(r3, r1, r5)
            return r0
        L25:
            int r6 = r1.length
            int r6 = r6 >> r5
            java.lang.String r7 = "index"
            com.google.android.gms.internal.mlkit_common.zzt.zzb(r0, r6, r7)
            r6 = 2
            int r7 = java.lang.Math.max(r0, r6)
            r8 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r7 >= r8) goto L4a
            int r8 = r7 + (-1)
            int r8 = java.lang.Integer.highestOneBit(r8)
        L3c:
            int r8 = r8 + r8
            double r9 = (double) r8
            r11 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r9 = r9 * r11
            double r11 = (double) r7
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L4e
            goto L3c
        L4a:
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r8) goto L1f9
        L4e:
            if (r0 != r5) goto L66
            r0 = r1[r4]
            java.util.Objects.requireNonNull(r0)
            r7 = r1[r5]
            java.util.Objects.requireNonNull(r7)
            com.google.android.gms.internal.mlkit_common.zzw.zza(r0, r7)
            r16 = r4
            r0 = r5
            r17 = r0
        L62:
            r18 = r6
            goto L1cd
        L66:
            int r7 = r8 + (-1)
            r9 = 128(0x80, float:1.8E-43)
            r10 = 3
            r11 = -1
            if (r8 > r9) goto Lea
            byte[] r8 = new byte[r8]
            java.util.Arrays.fill(r8, r11)
            r9 = r4
            r11 = r9
        L75:
            if (r9 >= r0) goto Ld0
            int r12 = r11 + r11
            int r13 = r9 + r9
            r14 = r1[r13]
            java.util.Objects.requireNonNull(r14)
            r13 = r13 ^ r5
            r13 = r1[r13]
            java.util.Objects.requireNonNull(r13)
            com.google.android.gms.internal.mlkit_common.zzw.zza(r14, r13)
            int r15 = r14.hashCode()
            int r15 = com.google.android.gms.internal.mlkit_common.zzy.zza(r15)
        L91:
            r15 = r15 & r7
            r16 = r4
            r4 = r8[r15]
            r17 = r5
            r5 = 255(0xff, float:3.57E-43)
            r4 = r4 & r5
            if (r4 != r5) goto Lab
            byte r4 = (byte) r12
            r8[r15] = r4
            if (r11 >= r9) goto La8
            r1[r12] = r14
            r4 = r12 ^ 1
            r1[r4] = r13
        La8:
            int r11 = r11 + 1
            goto Lc2
        Lab:
            r5 = r1[r4]
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto Lc9
            r3 = r4 ^ 1
            com.google.android.gms.internal.mlkit_common.zzag r4 = new com.google.android.gms.internal.mlkit_common.zzag
            r5 = r1[r3]
            java.util.Objects.requireNonNull(r5)
            r4.<init>(r14, r13, r5)
            r1[r3] = r13
            r3 = r4
        Lc2:
            int r9 = r9 + 1
            r4 = r16
            r5 = r17
            goto L75
        Lc9:
            int r15 = r15 + 1
            r4 = r16
            r5 = r17
            goto L91
        Ld0:
            r16 = r4
            r17 = r5
            if (r11 != r0) goto Ldb
            r18 = r6
            r3 = r8
            goto L1cd
        Ldb:
            java.lang.Object[] r4 = new java.lang.Object[r10]
            r4[r16] = r8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r4[r17] = r5
            r4[r6] = r3
        Le7:
            r3 = r4
            goto L62
        Lea:
            r16 = r4
            r17 = r5
            r4 = 32768(0x8000, float:4.5918E-41)
            if (r8 > r4) goto L15e
            short[] r4 = new short[r8]
            java.util.Arrays.fill(r4, r11)
            r5 = r16
            r8 = r5
        Lfb:
            if (r5 >= r0) goto L14c
            int r9 = r8 + r8
            int r11 = r5 + r5
            r12 = r1[r11]
            java.util.Objects.requireNonNull(r12)
            r11 = r11 ^ 1
            r11 = r1[r11]
            java.util.Objects.requireNonNull(r11)
            com.google.android.gms.internal.mlkit_common.zzw.zza(r12, r11)
            int r13 = r12.hashCode()
            int r13 = com.google.android.gms.internal.mlkit_common.zzy.zza(r13)
        L118:
            r13 = r13 & r7
            short r14 = r4[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L12f
            short r14 = (short) r9
            r4[r13] = r14
            if (r8 >= r5) goto L12c
            r1[r9] = r12
            r9 = r9 ^ 1
            r1[r9] = r11
        L12c:
            int r8 = r8 + 1
            goto L146
        L12f:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L149
            r3 = r14 ^ 1
            com.google.android.gms.internal.mlkit_common.zzag r9 = new com.google.android.gms.internal.mlkit_common.zzag
            r13 = r1[r3]
            java.util.Objects.requireNonNull(r13)
            r9.<init>(r12, r11, r13)
            r1[r3] = r11
            r3 = r9
        L146:
            int r5 = r5 + 1
            goto Lfb
        L149:
            int r13 = r13 + 1
            goto L118
        L14c:
            if (r8 != r0) goto L14f
            goto Le7
        L14f:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r16] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r5[r17] = r4
            r5[r6] = r3
            r3 = r5
            goto L62
        L15e:
            int[] r4 = new int[r8]
            java.util.Arrays.fill(r4, r11)
            r5 = r16
            r8 = r5
        L166:
            if (r5 >= r0) goto L1ba
            int r9 = r8 + r8
            int r12 = r5 + r5
            r13 = r1[r12]
            java.util.Objects.requireNonNull(r13)
            r12 = r12 ^ 1
            r12 = r1[r12]
            java.util.Objects.requireNonNull(r12)
            com.google.android.gms.internal.mlkit_common.zzw.zza(r13, r12)
            int r14 = r13.hashCode()
            int r14 = com.google.android.gms.internal.mlkit_common.zzy.zza(r14)
        L183:
            r14 = r14 & r7
            r15 = r4[r14]
            if (r15 != r11) goto L197
            r4[r14] = r9
            if (r8 >= r5) goto L192
            r1[r9] = r13
            r9 = r9 ^ 1
            r1[r9] = r12
        L192:
            int r8 = r8 + 1
            r18 = r6
            goto L1b0
        L197:
            r18 = r6
            r6 = r1[r15]
            boolean r6 = r13.equals(r6)
            if (r6 == 0) goto L1b5
            r3 = r15 ^ 1
            com.google.android.gms.internal.mlkit_common.zzag r6 = new com.google.android.gms.internal.mlkit_common.zzag
            r9 = r1[r3]
            java.util.Objects.requireNonNull(r9)
            r6.<init>(r13, r12, r9)
            r1[r3] = r12
            r3 = r6
        L1b0:
            int r5 = r5 + 1
            r6 = r18
            goto L166
        L1b5:
            int r14 = r14 + 1
            r6 = r18
            goto L183
        L1ba:
            r18 = r6
            if (r8 != r0) goto L1c0
            r3 = r4
            goto L1cd
        L1c0:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r16] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r5[r17] = r4
            r5[r18] = r3
            r3 = r5
        L1cd:
            boolean r4 = r3 instanceof java.lang.Object[]
            if (r4 == 0) goto L1f3
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r18]
            com.google.android.gms.internal.mlkit_common.zzag r0 = (com.google.android.gms.internal.mlkit_common.zzag) r0
            if (r2 == 0) goto L1ee
            r2.zzc = r0
            r0 = r3[r16]
            r2 = r3[r17]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r3 = r0
            r0 = r2
            goto L1f3
        L1ee:
            java.lang.IllegalArgumentException r0 = r0.zza()
            throw r0
        L1f3:
            com.google.android.gms.internal.mlkit_common.zzaq r2 = new com.google.android.gms.internal.mlkit_common.zzaq
            r2.<init>(r3, r1, r0)
            return r2
        L1f9:
            java.lang.String r0 = "collection too large"
            defpackage.i.h(r0)
            return r3
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai, java.util.Map
    public final java.lang.Object get(java.lang.Object r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r8 = r0
            goto L9c
        L6:
            int r1 = r8.zzd
            java.lang.Object[] r2 = r8.zzb
            r3 = 1
            if (r1 != r3) goto L20
            r8 = 0
            r8 = r2[r8]
            java.util.Objects.requireNonNull(r8)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L3
            r8 = r2[r3]
            java.util.Objects.requireNonNull(r8)
            goto L9c
        L20:
            java.lang.Object r8 = r8.zzc
            if (r8 != 0) goto L25
            goto L3
        L25:
            boolean r1 = r8 instanceof byte[]
            r4 = -1
            if (r1 == 0) goto L51
            r1 = r8
            byte[] r1 = (byte[]) r1
            int r8 = r1.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = com.google.android.gms.internal.mlkit_common.zzy.zza(r8)
        L38:
            r8 = r8 & r5
            r4 = r1[r8]
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            if (r4 != r6) goto L41
            goto L3
        L41:
            r6 = r2[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L4e
            r8 = r4 ^ 1
            r8 = r2[r8]
            goto L9c
        L4e:
            int r8 = r8 + 1
            goto L38
        L51:
            boolean r1 = r8 instanceof short[]
            if (r1 == 0) goto L7d
            r1 = r8
            short[] r1 = (short[]) r1
            int r8 = r1.length
            int r5 = r8 + (-1)
            int r8 = r9.hashCode()
            int r8 = com.google.android.gms.internal.mlkit_common.zzy.zza(r8)
        L63:
            r8 = r8 & r5
            short r4 = r1[r8]
            char r4 = (char) r4
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r4 != r6) goto L6d
            goto L3
        L6d:
            r6 = r2[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L7a
            r8 = r4 ^ 1
            r8 = r2[r8]
            goto L9c
        L7a:
            int r8 = r8 + 1
            goto L63
        L7d:
            int[] r8 = (int[]) r8
            int r1 = r8.length
            int r1 = r1 + r4
            int r5 = r9.hashCode()
            int r5 = com.google.android.gms.internal.mlkit_common.zzy.zza(r5)
        L89:
            r5 = r5 & r1
            r6 = r8[r5]
            if (r6 != r4) goto L90
            goto L3
        L90:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r8 = r6 ^ 1
            r8 = r2[r8]
        L9c:
            if (r8 != 0) goto L9f
            return r0
        L9f:
            return r8
        La0:
            int r5 = r5 + 1
            goto L89
    }

    @Override // java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.zzd
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final com.google.android.gms.internal.mlkit_common.zzab zza() {
            r3 = this;
            int r0 = r3.zzd
            com.google.android.gms.internal.mlkit_common.zzap r1 = new com.google.android.gms.internal.mlkit_common.zzap
            java.lang.Object[] r3 = r3.zzb
            r2 = 1
            r1.<init>(r3, r2, r0)
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final com.google.android.gms.internal.mlkit_common.zzaj zzd() {
            r4 = this;
            int r0 = r4.zzd
            java.lang.Object[] r1 = r4.zzb
            com.google.android.gms.internal.mlkit_common.zzan r2 = new com.google.android.gms.internal.mlkit_common.zzan
            r3 = 0
            r2.<init>(r4, r1, r3, r0)
            return r2
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzai
    public final com.google.android.gms.internal.mlkit_common.zzaj zze() {
            r4 = this;
            int r0 = r4.zzd
            com.google.android.gms.internal.mlkit_common.zzap r1 = new com.google.android.gms.internal.mlkit_common.zzap
            java.lang.Object[] r2 = r4.zzb
            r3 = 0
            r1.<init>(r2, r3, r0)
            com.google.android.gms.internal.mlkit_common.zzao r0 = new com.google.android.gms.internal.mlkit_common.zzao
            r0.<init>(r4, r1)
            return r0
    }
}
