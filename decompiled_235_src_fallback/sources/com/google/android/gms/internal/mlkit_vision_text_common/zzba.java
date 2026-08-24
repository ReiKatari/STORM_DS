package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzba extends java.util.AbstractMap implements java.io.Serializable {
    private static final java.lang.Object zzd = null;
    transient int[] zza;
    transient java.lang.Object[] zzb;
    transient java.lang.Object[] zzc;
    private transient java.lang.Object zze;
    private transient int zzf;
    private transient int zzg;
    private transient java.util.Set zzh;
    private transient java.util.Set zzi;
    private transient java.util.Collection zzj;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzd = r0
            return
    }

    public zzba() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.zzp(r0)
            return
    }

    public zzba(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 12
            r0.zzp(r1)
            return
    }

    private final int[] zzA() {
            r0 = this;
            int[] r0 = r0.zza
            java.util.Objects.requireNonNull(r0)
            int[] r0 = (int[]) r0
            return r0
    }

    private final java.lang.Object[] zzB() {
            r0 = this;
            java.lang.Object[] r0 = r0.zzb
            java.util.Objects.requireNonNull(r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    private final java.lang.Object[] zzC() {
            r0 = this;
            java.lang.Object[] r0 = r0.zzc
            java.util.Objects.requireNonNull(r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ int zza(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0) {
            int r0 = r0.zzf
            return r0
    }

    public static /* bridge */ /* synthetic */ int zzb(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0) {
            int r0 = r0.zzg
            return r0
    }

    public static /* bridge */ /* synthetic */ int zzc(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0) {
            int r0 = r0.zzv()
            return r0
    }

    public static /* bridge */ /* synthetic */ int zzd(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0, java.lang.Object r1) {
            int r0 = r0.zzw(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object zzg(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0, int r1) {
            java.lang.Object[] r0 = r0.zzB()
            r0 = r0[r1]
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zzh(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0, java.lang.Object r1) {
            java.lang.Object r0 = r0.zzy(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object zzi(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0) {
            java.lang.Object r0 = r0.zze
            java.util.Objects.requireNonNull(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object zzj(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0, int r1) {
            java.lang.Object[] r0 = r0.zzC()
            r0 = r0[r1]
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zzk() {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzd
            return r0
    }

    public static /* bridge */ /* synthetic */ void zzm(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0, int r1) {
            r0.zzg = r1
            return
    }

    public static /* synthetic */ void zzn(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0, int r1, java.lang.Object r2) {
            java.lang.Object[] r0 = r0.zzC()
            r0[r1] = r2
            return
    }

    public static /* bridge */ /* synthetic */ int[] zzs(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0) {
            int[] r0 = r0.zzA()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object[] zzt(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0) {
            java.lang.Object[] r0 = r0.zzB()
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object[] zzu(com.google.android.gms.internal.mlkit_vision_text_common.zzba r0) {
            java.lang.Object[] r0 = r0.zzC()
            return r0
    }

    private final int zzv() {
            r1 = this;
            int r1 = r1.zzf
            r1 = r1 & 31
            r0 = 1
            int r1 = r0 << r1
            int r1 = r1 + (-1)
            return r1
    }

    private final int zzw(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r7.zzr()
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = com.google.android.gms.internal.mlkit_vision_text_common.zzbc.zza(r8)
            int r2 = r7.zzv()
            java.lang.Object r3 = r7.zze
            java.util.Objects.requireNonNull(r3)
            r4 = r0 & r2
            int r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zzc(r3, r4)
            if (r3 == 0) goto L3c
            int r4 = ~r2
            r0 = r0 & r4
        L1f:
            int r3 = r3 + r1
            int[] r5 = r7.zzA()
            r5 = r5[r3]
            r6 = r5 & r4
            if (r6 != r0) goto L38
            java.lang.Object[] r6 = r7.zzB()
            r6 = r6[r3]
            boolean r6 = com.google.android.gms.internal.mlkit_vision_text_common.zzw.zza(r8, r6)
            if (r6 != 0) goto L37
            goto L38
        L37:
            return r3
        L38:
            r3 = r5 & r2
            if (r3 != 0) goto L1f
        L3c:
            return r1
    }

    private final int zzx(int r9, int r10, int r11, int r12) {
            r8 = this;
            int r0 = r10 + (-1)
            java.lang.Object r10 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zzd(r10)
            if (r12 == 0) goto Le
            r11 = r11 & r0
            int r12 = r12 + 1
            com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zze(r10, r11, r12)
        Le:
            java.lang.Object r11 = r8.zze
            java.util.Objects.requireNonNull(r11)
            int[] r12 = r8.zzA()
            r1 = 0
        L18:
            if (r1 > r9) goto L3d
            int r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zzc(r11, r1)
        L1e:
            if (r2 == 0) goto L3a
            int r3 = r2 + (-1)
            r4 = r12[r3]
            int r5 = ~r9
            r5 = r5 & r4
            r5 = r5 | r1
            r6 = r5 & r0
            int r7 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zzc(r10, r6)
            com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zze(r10, r6, r2)
            int r2 = ~r0
            r6 = r7 & r0
            r2 = r2 & r5
            r2 = r2 | r6
            r12[r3] = r2
            r2 = r4 & r9
            goto L1e
        L3a:
            int r1 = r1 + 1
            goto L18
        L3d:
            r8.zze = r10
            r8.zzz(r0)
            return r0
    }

    private final java.lang.Object zzy(java.lang.Object r9) {
            r8 = this;
            boolean r0 = r8.zzr()
            if (r0 == 0) goto L7
            goto L34
        L7:
            int r3 = r8.zzv()
            java.lang.Object r4 = r8.zze
            java.util.Objects.requireNonNull(r4)
            int[] r5 = r8.zzA()
            java.lang.Object[] r6 = r8.zzB()
            r7 = 0
            r2 = 0
            r1 = r9
            int r9 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zzb(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            if (r9 == r0) goto L34
            java.lang.Object[] r1 = r8.zzC()
            r1 = r1[r9]
            r8.zzq(r9, r3)
            int r9 = r8.zzg
            int r9 = r9 + r0
            r8.zzg = r9
            r8.zzo()
            return r1
        L34:
            java.lang.Object r8 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzd
            return r8
    }

    private final void zzz(int r2) {
            r1 = this;
            int r2 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r2 = 32 - r2
            int r0 = r1.zzf
            r0 = r0 & (-32)
            r2 = r2 & 31
            r2 = r2 | r0
            r1.zzf = r2
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r6 = this;
            boolean r0 = r6.zzr()
            if (r0 == 0) goto L7
            return
        L7:
            r6.zzo()
            java.util.Map r0 = r6.zzl()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L28
            int r3 = r6.size()
            r4 = 3
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzcq.zza(r3, r4, r5)
            r6.zzf = r3
            r0.clear()
            r6.zze = r1
            r6.zzg = r2
            return
        L28:
            java.lang.Object[] r0 = r6.zzB()
            int r3 = r6.zzg
            java.util.Arrays.fill(r0, r2, r3, r1)
            java.lang.Object[] r0 = r6.zzC()
            int r3 = r6.zzg
            java.util.Arrays.fill(r0, r2, r3, r1)
            java.lang.Object r0 = r6.zze
            java.util.Objects.requireNonNull(r0)
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L49
            byte[] r0 = (byte[]) r0
            java.util.Arrays.fill(r0, r2)
            goto L58
        L49:
            boolean r1 = r0 instanceof short[]
            if (r1 == 0) goto L53
            short[] r0 = (short[]) r0
            java.util.Arrays.fill(r0, r2)
            goto L58
        L53:
            int[] r0 = (int[]) r0
            java.util.Arrays.fill(r0, r2)
        L58:
            int[] r0 = r6.zzA()
            int r1 = r6.zzg
            java.util.Arrays.fill(r0, r2, r1, r2)
            r6.zzg = r2
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzl()
            if (r0 == 0) goto Lb
            boolean r1 = r0.containsKey(r2)
            return r1
        Lb:
            int r1 = r1.zzw(r2)
            r2 = -1
            if (r1 != r2) goto L14
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(java.lang.Object r4) {
            r3 = this;
            java.util.Map r0 = r3.zzl()
            if (r0 != 0) goto L1e
            r0 = 0
            r1 = r0
        L8:
            int r2 = r3.zzg
            if (r1 >= r2) goto L1d
            java.lang.Object[] r2 = r3.zzC()
            r2 = r2[r1]
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzw.zza(r4, r2)
            if (r2 == 0) goto L1a
            r3 = 1
            return r3
        L1a:
            int r1 = r1 + 1
            goto L8
        L1d:
            return r0
        L1e:
            boolean r3 = r0.containsValue(r4)
            return r3
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r1 = this;
            java.util.Set r0 = r1.zzi
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_text_common.zzau r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzau
            r0.<init>(r1)
            r1.zzi = r0
        Lb:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzl()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r0.get(r2)
            return r1
        Lb:
            int r2 = r1.zzw(r2)
            r0 = -1
            if (r2 != r0) goto L14
            r1 = 0
            return r1
        L14:
            java.lang.Object[] r1 = r1.zzC()
            r1 = r1[r2]
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r1 = this;
            java.util.Set r0 = r1.zzh
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_text_common.zzax r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzax
            r0.<init>(r1)
            r1.zzh = r0
        Lb:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.zzr()
            if (r3 == 0) goto L47
            boolean r3 = r0.zzr()
            java.lang.String r4 = "Arrays already allocated"
            com.google.android.gms.internal.mlkit_vision_text_common.zzx.zzd(r3, r4)
            int r3 = r0.zzf
            int r4 = r3 + 1
            r5 = 2
            int r4 = java.lang.Math.max(r4, r5)
            int r5 = java.lang.Integer.highestOneBit(r4)
            double r6 = (double) r5
            int r6 = (int) r6
            if (r4 <= r6) goto L2b
            int r5 = r5 + r5
            if (r5 > 0) goto L2b
            r5 = 1073741824(0x40000000, float:2.0)
        L2b:
            r4 = 4
            int r4 = java.lang.Math.max(r4, r5)
            java.lang.Object r5 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zzd(r4)
            r0.zze = r5
            int r4 = r4 + (-1)
            r0.zzz(r4)
            int[] r4 = new int[r3]
            r0.zza = r4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r0.zzb = r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.zzc = r3
        L47:
            java.util.Map r3 = r0.zzl()
            if (r3 == 0) goto L52
            java.lang.Object r0 = r3.put(r1, r2)
            return r0
        L52:
            int[] r3 = r0.zzA()
            java.lang.Object[] r4 = r0.zzB()
            java.lang.Object[] r5 = r0.zzC()
            int r6 = r0.zzg
            int r7 = r6 + 1
            int r8 = com.google.android.gms.internal.mlkit_vision_text_common.zzbc.zza(r1)
            int r9 = r0.zzv()
            r10 = r8 & r9
            java.lang.Object r11 = r0.zze
            java.util.Objects.requireNonNull(r11)
            int r11 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zzc(r11, r10)
            if (r11 != 0) goto L8e
            if (r7 <= r9) goto L85
            int r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zza(r9)
            int r9 = r0.zzx(r9, r3, r8, r6)
        L81:
            r17 = 1
            goto Lfc
        L85:
            java.lang.Object r3 = r0.zze
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zze(r3, r10, r7)
            goto L81
        L8e:
            int r10 = ~r9
            r14 = r8 & r10
            r15 = 0
        L92:
            int r11 = r11 + (-1)
            r16 = r3[r11]
            r17 = 1
            r13 = r16 & r10
            if (r13 != r14) goto Laa
            r12 = r4[r11]
            boolean r12 = com.google.android.gms.internal.mlkit_vision_text_common.zzw.zza(r1, r12)
            if (r12 != 0) goto La5
            goto Laa
        La5:
            r0 = r5[r11]
            r5[r11] = r2
            return r0
        Laa:
            r12 = r16 & r9
            int r15 = r15 + 1
            if (r12 != 0) goto L150
            r4 = 9
            if (r15 < r4) goto Lec
            int r3 = r0.zzv()
            int r3 = r3 + 1
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r3, r5)
            int r3 = r0.zze()
        Lc5:
            if (r3 < 0) goto Ldb
            java.lang.Object[] r5 = r0.zzB()
            r5 = r5[r3]
            java.lang.Object[] r6 = r0.zzC()
            r6 = r6[r3]
            r4.put(r5, r6)
            int r3 = r0.zzf(r3)
            goto Lc5
        Ldb:
            r0.zze = r4
            r3 = 0
            r0.zza = r3
            r0.zzb = r3
            r0.zzc = r3
            r0.zzo()
            java.lang.Object r0 = r4.put(r1, r2)
            return r0
        Lec:
            if (r7 <= r9) goto Lf7
            int r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zza(r9)
            int r9 = r0.zzx(r9, r3, r8, r6)
            goto Lfc
        Lf7:
            r4 = r7 & r9
            r4 = r4 | r13
            r3[r11] = r4
        Lfc:
            int[] r3 = r0.zzA()
            int r3 = r3.length
            if (r7 <= r3) goto L134
            int r4 = r3 >>> 1
            r11 = r17
            int r4 = java.lang.Math.max(r11, r4)
            int r4 = r4 + r3
            r4 = r4 | r11
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            int r4 = java.lang.Math.min(r5, r4)
            if (r4 == r3) goto L134
            int[] r3 = r0.zzA()
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.zza = r3
            java.lang.Object[] r3 = r0.zzB()
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.zzb = r3
            java.lang.Object[] r3 = r0.zzC()
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r0.zzc = r3
        L134:
            int r3 = ~r9
            r3 = r3 & r8
            int[] r4 = r0.zzA()
            r4[r6] = r3
            java.lang.Object[] r3 = r0.zzB()
            r3[r6] = r1
            java.lang.Object[] r1 = r0.zzC()
            r1[r6] = r2
            r0.zzg = r7
            r0.zzo()
            r18 = 0
            return r18
        L150:
            r18 = 0
            r11 = r12
            goto L92
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            java.util.Map r0 = r1.zzl()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r0.remove(r2)
            return r1
        Lb:
            java.lang.Object r1 = r1.zzy(r2)
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzba.zzd
            if (r1 != r2) goto L14
            r1 = 0
        L14:
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r1 = this;
            java.util.Map r0 = r1.zzl()
            if (r0 == 0) goto Lb
            int r1 = r0.size()
            return r1
        Lb:
            int r1 = r1.zzg
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            java.util.Collection r0 = r1.zzj
            if (r0 != 0) goto Lb
            com.google.android.gms.internal.mlkit_vision_text_common.zzaz r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzaz
            r0.<init>(r1)
            r1.zzj = r0
        Lb:
            return r0
    }

    public final int zze() {
            r0 = this;
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final int zzf(int r1) {
            r0 = this;
            int r1 = r1 + 1
            int r0 = r0.zzg
            if (r1 >= r0) goto L7
            return r1
        L7:
            r0 = -1
            return r0
    }

    public final java.util.Map zzl() {
            r1 = this;
            java.lang.Object r1 = r1.zze
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto L9
            java.util.Map r1 = (java.util.Map) r1
            return r1
        L9:
            r1 = 0
            return r1
    }

    public final void zzo() {
            r1 = this;
            int r0 = r1.zzf
            int r0 = r0 + 32
            r1.zzf = r0
            return
    }

    public final void zzp(int r3) {
            r2 = this;
            r0 = 1
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_common.zzcq.zza(r3, r0, r1)
            r2.zzf = r3
            return
    }

    public final void zzq(int r11, int r12) {
            r10 = this;
            java.lang.Object r0 = r10.zze
            java.util.Objects.requireNonNull(r0)
            int[] r1 = r10.zzA()
            java.lang.Object[] r2 = r10.zzB()
            java.lang.Object[] r3 = r10.zzC()
            int r10 = r10.size()
            int r4 = r10 + (-1)
            r5 = 0
            r6 = 0
            if (r11 >= r4) goto L50
            int r7 = r11 + 1
            r8 = r2[r4]
            r2[r11] = r8
            r9 = r3[r4]
            r3[r11] = r9
            r2[r4] = r6
            r3[r4] = r6
            r2 = r1[r4]
            r1[r11] = r2
            r1[r4] = r5
            int r11 = com.google.android.gms.internal.mlkit_vision_text_common.zzbc.zza(r8)
            r11 = r11 & r12
            int r2 = com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zzc(r0, r11)
            if (r2 == r10) goto L4c
        L3a:
            int r2 = r2 + (-1)
            r11 = r1[r2]
            r0 = r11 & r12
            if (r0 == r10) goto L44
            r2 = r0
            goto L3a
        L44:
            int r10 = ~r12
            r10 = r10 & r11
            r11 = r7 & r12
            r10 = r10 | r11
            r1[r2] = r10
            return
        L4c:
            com.google.android.gms.internal.mlkit_vision_text_common.zzbb.zze(r0, r11, r7)
            return
        L50:
            r2[r11] = r6
            r3[r11] = r6
            r1[r11] = r5
            return
    }

    public final boolean zzr() {
            r0 = this;
            java.lang.Object r0 = r0.zze
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
