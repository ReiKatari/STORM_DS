package com.google.android.gms.internal.mlkit_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzbe implements defpackage.rh4 {
    private static final java.nio.charset.Charset zza = null;
    private static final defpackage.na2 zzb = null;
    private static final defpackage.na2 zzc = null;
    private static final defpackage.qh4 zzd = null;
    private java.io.OutputStream zze;
    private final java.util.Map zzf;
    private final java.util.Map zzg;
    private final defpackage.qh4 zzh;
    private final com.google.android.gms.internal.mlkit_common.zzbi zzi;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.google.android.gms.internal.mlkit_common.zzbe.zza = r0
            r0 = 1
            com.google.android.gms.internal.mlkit_common.zzbc r0 = defpackage.xg6.h(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "key"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_common.zzbe.zzb = r0
            r0 = 2
            com.google.android.gms.internal.mlkit_common.zzbc r0 = defpackage.xg6.h(r0)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            na2 r0 = new na2
            java.util.Map r1 = defpackage.xg6.u(r1)
            java.lang.String r2 = "value"
            r0.<init>(r2, r1)
            com.google.android.gms.internal.mlkit_common.zzbe.zzc = r0
            com.google.android.gms.internal.mlkit_common.zzbd r0 = new com.google.android.gms.internal.mlkit_common.zzbd
            r0.<init>()
            com.google.android.gms.internal.mlkit_common.zzbe.zzd = r0
            return
    }

    public zzbe(java.io.OutputStream r2, java.util.Map r3, java.util.Map r4, defpackage.qh4 r5) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.mlkit_common.zzbi r0 = new com.google.android.gms.internal.mlkit_common.zzbi
            r0.<init>(r1)
            r1.zzi = r0
            r1.zze = r2
            r1.zzf = r3
            r1.zzg = r4
            r1.zzh = r5
            return
    }

    public static /* synthetic */ void zzg(java.util.Map.Entry r2, defpackage.rh4 r3) {
            na2 r0 = com.google.android.gms.internal.mlkit_common.zzbe.zzb
            java.lang.Object r1 = r2.getKey()
            r3.add(r0, r1)
            na2 r0 = com.google.android.gms.internal.mlkit_common.zzbe.zzc
            java.lang.Object r2 = r2.getValue()
            r3.add(r0, r2)
            return
    }

    private static int zzh(defpackage.na2 r1) {
            java.lang.Class<com.google.android.gms.internal.mlkit_common.zzbc> r0 = com.google.android.gms.internal.mlkit_common.zzbc.class
            java.lang.annotation.Annotation r1 = r1.b(r0)
            com.google.android.gms.internal.mlkit_common.zzbc r1 = (com.google.android.gms.internal.mlkit_common.zzbc) r1
            if (r1 == 0) goto Lf
            int r1 = r1.zza()
            return r1
        Lf:
            d42 r1 = new d42
            java.lang.String r0 = "Field has no @Protobuf config"
            r1.<init>(r0)
            throw r1
    }

    private final long zzi(defpackage.qh4 r3, java.lang.Object r4) {
            r2 = this;
            com.google.android.gms.internal.mlkit_common.zzaz r0 = new com.google.android.gms.internal.mlkit_common.zzaz
            r0.<init>()
            java.io.OutputStream r1 = r2.zze     // Catch: java.lang.Throwable -> L16
            r2.zze = r0     // Catch: java.lang.Throwable -> L16
            r3.encode(r4, r2)     // Catch: java.lang.Throwable -> L18
            r2.zze = r1     // Catch: java.lang.Throwable -> L16
            long r2 = r0.zza()     // Catch: java.lang.Throwable -> L16
            r0.close()
            return r2
        L16:
            r2 = move-exception
            goto L1c
        L18:
            r3 = move-exception
            r2.zze = r1     // Catch: java.lang.Throwable -> L16
            throw r3     // Catch: java.lang.Throwable -> L16
        L1c:
            r0.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r3 = move-exception
            r2.addSuppressed(r3)
        L24:
            throw r2
    }

    private static com.google.android.gms.internal.mlkit_common.zzbc zzj(defpackage.na2 r1) {
            java.lang.Class<com.google.android.gms.internal.mlkit_common.zzbc> r0 = com.google.android.gms.internal.mlkit_common.zzbc.class
            java.lang.annotation.Annotation r1 = r1.b(r0)
            com.google.android.gms.internal.mlkit_common.zzbc r1 = (com.google.android.gms.internal.mlkit_common.zzbc) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            d42 r1 = new d42
            java.lang.String r0 = "Field has no @Protobuf config"
            r1.<init>(r0)
            throw r1
    }

    private final com.google.android.gms.internal.mlkit_common.zzbe zzk(defpackage.qh4 r5, defpackage.na2 r6, java.lang.Object r7, boolean r8) {
            r4 = this;
            long r0 = r4.zzi(r5, r7)
            if (r8 == 0) goto Ld
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto Ld
            return r4
        Ld:
            int r6 = zzh(r6)
            int r6 = r6 << 3
            r6 = r6 | 2
            r4.zzn(r6)
            r4.zzo(r0)
            r5.encode(r7, r4)
            return r4
    }

    private final com.google.android.gms.internal.mlkit_common.zzbe zzl(defpackage.lk7 r2, defpackage.na2 r3, java.lang.Object r4, boolean r5) {
            r1 = this;
            com.google.android.gms.internal.mlkit_common.zzbi r0 = r1.zzi
            r0.zza(r3, r5)
            com.google.android.gms.internal.mlkit_common.zzbi r3 = r1.zzi
            r2.encode(r4, r3)
            return r1
    }

    private static java.nio.ByteBuffer zzm(int r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
            return r1
    }

    private final void zzn(int r5) {
            r4 = this;
        L0:
            r0 = r5 & (-128(0xffffffffffffff80, float:NaN))
            long r0 = (long) r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = r5 & 127(0x7f, float:1.78E-43)
            java.io.OutputStream r2 = r4.zze
            if (r0 == 0) goto L15
            r0 = r1 | 128(0x80, float:1.8E-43)
            r2.write(r0)
            int r5 = r5 >>> 7
            goto L0
        L15:
            r2.write(r1)
            return
    }

    private final void zzo(long r6) {
            r5 = this;
        L0:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            int r2 = (int) r6
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r1 = r2 & 127(0x7f, float:1.78E-43)
            java.io.OutputStream r2 = r5.zze
            if (r0 == 0) goto L16
            r0 = r1 | 128(0x80, float:1.8E-43)
            r2.write(r0)
            r0 = 7
            long r6 = r6 >>> r0
            goto L0
        L16:
            r2.write(r1)
            return
    }

    public final defpackage.rh4 add(java.lang.String r2, double r3) {
            r1 = this;
            na2 r2 = defpackage.na2.c(r2)
            r0 = 1
            r1.zza(r2, r3, r0)
            return r1
    }

    public final defpackage.rh4 add(java.lang.String r2, int r3) {
            r1 = this;
            na2 r2 = defpackage.na2.c(r2)
            r0 = 1
            r1.zzd(r2, r3, r0)
            return r1
    }

    public final defpackage.rh4 add(java.lang.String r2, long r3) {
            r1 = this;
            na2 r2 = defpackage.na2.c(r2)
            r0 = 1
            r1.zze(r2, r3, r0)
            return r1
    }

    public final defpackage.rh4 add(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            na2 r2 = defpackage.na2.c(r2)
            r0 = 1
            r1.zzc(r2, r3, r0)
            return r1
    }

    public final defpackage.rh4 add(java.lang.String r2, boolean r3) {
            r1 = this;
            na2 r2 = defpackage.na2.c(r2)
            r0 = 1
            r1.zzd(r2, r3, r0)
            return r1
    }

    public final defpackage.rh4 add(defpackage.na2 r2, double r3) {
            r1 = this;
            r0 = 1
            r1.zza(r2, r3, r0)
            return r1
    }

    public final defpackage.rh4 add(defpackage.na2 r2, float r3) {
            r1 = this;
            r0 = 1
            r1.zzb(r2, r3, r0)
            return r1
    }

    public final /* synthetic */ defpackage.rh4 add(defpackage.na2 r2, int r3) {
            r1 = this;
            r0 = 1
            r1.zzd(r2, r3, r0)
            return r1
    }

    @Override // defpackage.rh4
    public final /* synthetic */ defpackage.rh4 add(defpackage.na2 r2, long r3) {
            r1 = this;
            r0 = 1
            r1.zze(r2, r3, r0)
            return r1
    }

    @Override // defpackage.rh4
    public final defpackage.rh4 add(defpackage.na2 r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            r1.zzc(r2, r3, r0)
            return r1
    }

    public final /* synthetic */ defpackage.rh4 add(defpackage.na2 r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.zzd(r2, r3, r0)
            return r1
    }

    public final defpackage.rh4 inline(java.lang.Object r1) {
            r0 = this;
            r0.zzf(r1)
            return r0
    }

    public final defpackage.rh4 nested(java.lang.String r1) {
            r0 = this;
            na2 r1 = defpackage.na2.c(r1)
            rh4 r0 = r0.nested(r1)
            return r0
    }

    public final defpackage.rh4 nested(defpackage.na2 r1) {
            r0 = this;
            d42 r0 = new d42
            java.lang.String r1 = "nested() is not implemented for protobuf encoding."
            r0.<init>(r1)
            throw r0
    }

    public final defpackage.rh4 zza(defpackage.na2 r3, double r4, boolean r6) {
            r2 = this;
            if (r6 == 0) goto L9
            r0 = 0
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L9
            return r2
        L9:
            int r3 = zzh(r3)
            int r3 = r3 << 3
            r3 = r3 | 1
            r2.zzn(r3)
            java.io.OutputStream r3 = r2.zze
            r6 = 8
            java.nio.ByteBuffer r6 = zzm(r6)
            java.nio.ByteBuffer r4 = r6.putDouble(r4)
            byte[] r4 = r4.array()
            r3.write(r4)
            return r2
    }

    public final defpackage.rh4 zzb(defpackage.na2 r1, float r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L8
            r3 = 0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 != 0) goto L8
            return r0
        L8:
            int r1 = zzh(r1)
            int r1 = r1 << 3
            r1 = r1 | 5
            r0.zzn(r1)
            java.io.OutputStream r1 = r0.zze
            r3 = 4
            java.nio.ByteBuffer r3 = zzm(r3)
            java.nio.ByteBuffer r2 = r3.putFloat(r2)
            byte[] r2 = r2.array()
            r1.write(r2)
            return r0
    }

    public final defpackage.rh4 zzc(defpackage.na2 r3, java.lang.Object r4, boolean r5) {
            r2 = this;
            if (r4 != 0) goto L4
            goto Lae
        L4:
            boolean r0 = r4 instanceof java.lang.CharSequence
            if (r0 == 0) goto L31
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r5 == 0) goto L12
            int r5 = r4.length()
            if (r5 == 0) goto Lae
        L12:
            int r3 = zzh(r3)
            int r3 = r3 << 3
            r3 = r3 | 2
            r2.zzn(r3)
            java.lang.String r3 = r4.toString()
            java.nio.charset.Charset r4 = com.google.android.gms.internal.mlkit_common.zzbe.zza
            byte[] r3 = r3.getBytes(r4)
            int r4 = r3.length
            r2.zzn(r4)
            java.io.OutputStream r4 = r2.zze
            r4.write(r3)
            return r2
        L31:
            boolean r0 = r4 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L4a
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r4.next()
            r2.zzc(r3, r5, r1)
            goto L3c
        L4a:
            boolean r0 = r4 instanceof java.util.Map
            if (r0 == 0) goto L6a
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L58:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lae
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            qh4 r0 = com.google.android.gms.internal.mlkit_common.zzbe.zzd
            r2.zzk(r0, r3, r5, r1)
            goto L58
        L6a:
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L78
            java.lang.Double r4 = (java.lang.Double) r4
            double r0 = r4.doubleValue()
            r2.zza(r3, r0, r5)
            return r2
        L78:
            boolean r0 = r4 instanceof java.lang.Float
            if (r0 == 0) goto L86
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.zzb(r3, r4, r5)
            return r2
        L86:
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto L94
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            r2.zze(r3, r0, r5)
            return r2
        L94:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto La2
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.zzd(r3, r4, r5)
            return r2
        La2:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto Lc4
            byte[] r4 = (byte[]) r4
            if (r5 == 0) goto Laf
            int r5 = r4.length
            if (r5 == 0) goto Lae
            goto Laf
        Lae:
            return r2
        Laf:
            int r3 = zzh(r3)
            int r3 = r3 << 3
            r3 = r3 | 2
            r2.zzn(r3)
            int r3 = r4.length
            r2.zzn(r3)
            java.io.OutputStream r3 = r2.zze
            r3.write(r4)
            return r2
        Lc4:
            java.util.Map r0 = r2.zzf
            java.lang.Class r1 = r4.getClass()
            java.lang.Object r0 = r0.get(r1)
            qh4 r0 = (defpackage.qh4) r0
            if (r0 == 0) goto Ld6
            r2.zzk(r0, r3, r4, r5)
            return r2
        Ld6:
            java.util.Map r0 = r2.zzg
            java.lang.Class r1 = r4.getClass()
            java.lang.Object r0 = r0.get(r1)
            lk7 r0 = (defpackage.lk7) r0
            if (r0 == 0) goto Le8
            r2.zzl(r0, r3, r4, r5)
            return r2
        Le8:
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_common.zzba
            r1 = 1
            if (r0 == 0) goto Lf7
            com.google.android.gms.internal.mlkit_common.zzba r4 = (com.google.android.gms.internal.mlkit_common.zzba) r4
            int r4 = r4.zza()
            r2.zzd(r3, r4, r1)
            return r2
        Lf7:
            boolean r0 = r4 instanceof java.lang.Enum
            if (r0 == 0) goto L105
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r4 = r4.ordinal()
            r2.zzd(r3, r4, r1)
            return r2
        L105:
            qh4 r0 = r2.zzh
            r2.zzk(r0, r3, r4, r5)
            return r2
    }

    public final com.google.android.gms.internal.mlkit_common.zzbe zzd(defpackage.na2 r2, int r3, boolean r4) {
            r1 = this;
            if (r4 == 0) goto L4
            if (r3 == 0) goto L18
        L4:
            com.google.android.gms.internal.mlkit_common.zzbc r2 = zzj(r2)
            com.google.android.gms.internal.mlkit_common.zzbb r4 = r2.zzb()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L49
            r0 = 1
            if (r4 == r0) goto L37
            r0 = 2
            if (r4 == r0) goto L19
        L18:
            return r1
        L19:
            int r2 = r2.zza()
            int r2 = r2 << 3
            r2 = r2 | 5
            r1.zzn(r2)
            java.io.OutputStream r2 = r1.zze
            r4 = 4
            java.nio.ByteBuffer r4 = zzm(r4)
            java.nio.ByteBuffer r3 = r4.putInt(r3)
            byte[] r3 = r3.array()
            r2.write(r3)
            return r1
        L37:
            int r2 = r2.zza()
            int r2 = r2 << 3
            r1.zzn(r2)
            int r2 = r3 + r3
            int r3 = r3 >> 31
            r2 = r2 ^ r3
            r1.zzn(r2)
            return r1
        L49:
            int r2 = r2.zza()
            int r2 = r2 << 3
            r1.zzn(r2)
            r1.zzn(r3)
            return r1
    }

    public final com.google.android.gms.internal.mlkit_common.zzbe zze(defpackage.na2 r3, long r4, boolean r6) {
            r2 = this;
            if (r6 == 0) goto L8
            r0 = 0
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L1c
        L8:
            com.google.android.gms.internal.mlkit_common.zzbc r3 = zzj(r3)
            com.google.android.gms.internal.mlkit_common.zzbb r6 = r3.zzb()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L4f
            r0 = 1
            if (r6 == r0) goto L3b
            r1 = 2
            if (r6 == r1) goto L1d
        L1c:
            return r2
        L1d:
            int r3 = r3.zza()
            int r3 = r3 << 3
            r3 = r3 | r0
            r2.zzn(r3)
            java.io.OutputStream r3 = r2.zze
            r6 = 8
            java.nio.ByteBuffer r6 = zzm(r6)
            java.nio.ByteBuffer r4 = r6.putLong(r4)
            byte[] r4 = r4.array()
            r3.write(r4)
            return r2
        L3b:
            int r3 = r3.zza()
            int r3 = r3 << 3
            r2.zzn(r3)
            long r0 = r4 + r4
            r3 = 63
            long r3 = r4 >> r3
            long r3 = r3 ^ r0
            r2.zzo(r3)
            return r2
        L4f:
            int r3 = r3.zza()
            int r3 = r3 << 3
            r2.zzn(r3)
            r2.zzo(r4)
            return r2
    }

    public final com.google.android.gms.internal.mlkit_common.zzbe zzf(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return r2
        L3:
            java.util.Map r0 = r2.zzf
            java.lang.Class r1 = r3.getClass()
            java.lang.Object r0 = r0.get(r1)
            qh4 r0 = (defpackage.qh4) r0
            if (r0 == 0) goto L15
            r0.encode(r3, r2)
            return r2
        L15:
            java.lang.Class r2 = r3.getClass()
            d42 r3 = new d42
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = "No encoder for "
            java.lang.String r2 = r0.concat(r2)
            r3.<init>(r2)
            throw r3
    }
}
