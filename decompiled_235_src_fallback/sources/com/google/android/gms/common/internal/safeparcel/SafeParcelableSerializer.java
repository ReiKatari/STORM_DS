package com.google.android.gms.common.internal.safeparcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SafeParcelableSerializer {
    private SafeParcelableSerializer() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromBytes(byte[] r3, android.os.Parcelable.Creator<T> r4) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            int r1 = r3.length
            r2 = 0
            r0.unmarshall(r3, r2, r1)
            r0.setDataPosition(r2)
            java.lang.Object r3 = r4.createFromParcel(r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r3 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r3
            r0.recycle()
            return r3
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromIntentExtra(android.content.Intent r0, java.lang.String r1, android.os.Parcelable.Creator<T> r2) {
            byte[] r0 = r0.getByteArrayExtra(r1)
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = deserializeFromBytes(r0, r2)
            return r0
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> T deserializeFromString(java.lang.String r0, android.os.Parcelable.Creator<T> r1) {
            byte[] r0 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = deserializeFromBytes(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBundle(android.os.Bundle r3, java.lang.String r4, android.os.Parcelable.Creator<T> r5) {
            java.io.Serializable r3 = r3.getSerializable(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto La
            r3 = 0
            return r3
        La:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r3.size()
            r4.<init>(r0)
            int r0 = r3.size()
            r1 = 0
        L18:
            if (r1 >= r0) goto L2a
            java.lang.Object r2 = r3.get(r1)
            byte[] r2 = (byte[]) r2
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r2 = deserializeFromBytes(r2, r5)
            r4.add(r2)
            int r1 = r1 + 1
            goto L18
        L2a:
            return r4
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBundleSafe(android.os.Bundle r0, java.lang.String r1, android.os.Parcelable.Creator<T> r2) {
            byte[] r0 = r0.getByteArray(r1)
            java.util.ArrayList r0 = deserializeIterableFromBytes(r0, r2)
            return r0
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromBytes(byte[] r3, android.os.Parcelable.Creator<T> r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            int r1 = r3.length
            r2 = 0
            r0.unmarshall(r3, r2, r1)
            r0.setDataPosition(r2)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1c
            r3.<init>()     // Catch: java.lang.Throwable -> L1c
            r0.readTypedList(r3, r4)     // Catch: java.lang.Throwable -> L1c
            r0.recycle()
            return r3
        L1c:
            r3 = move-exception
            r0.recycle()
            throw r3
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromIntentExtra(android.content.Intent r3, java.lang.String r4, android.os.Parcelable.Creator<T> r5) {
            java.io.Serializable r3 = r3.getSerializableExtra(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 != 0) goto La
            r3 = 0
            return r3
        La:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r3.size()
            r4.<init>(r0)
            int r0 = r3.size()
            r1 = 0
        L18:
            if (r1 >= r0) goto L2a
            java.lang.Object r2 = r3.get(r1)
            byte[] r2 = (byte[]) r2
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r2 = deserializeFromBytes(r2, r5)
            r4.add(r2)
            int r1 = r1 + 1
            goto L18
        L2a:
            return r4
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.util.ArrayList<T> deserializeIterableFromIntentExtraSafe(android.content.Intent r0, java.lang.String r1, android.os.Parcelable.Creator<T> r2) {
            byte[] r0 = r0.getByteArrayExtra(r1)
            java.util.ArrayList r0 = deserializeIterableFromBytes(r0, r2)
            return r0
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToBundle(java.lang.Iterable<T> r2, android.os.Bundle r3, java.lang.String r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r1
            byte[] r1 = serializeToBytes(r1)
            r0.add(r1)
            goto L9
        L1d:
            r3.putSerializable(r4, r0)
            return
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToBundleSafe(java.lang.Iterable<T> r0, android.os.Bundle r1, java.lang.String r2) {
            byte[] r0 = zza(r0)
            r1.putByteArray(r2, r0)
            return
    }

    @java.lang.Deprecated
    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToIntentExtra(java.lang.Iterable<T> r2, android.content.Intent r3, java.lang.String r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r1 = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) r1
            byte[] r1 = serializeToBytes(r1)
            r0.add(r1)
            goto L9
        L1d:
            r3.putExtra(r4, r0)
            return
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeIterableToIntentExtraSafe(java.lang.Iterable<T> r0, android.content.Intent r1, java.lang.String r2) {
            byte[] r0 = zza(r0)
            r1.putExtra(r2, r0)
            return
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> byte[] serializeToBytes(T r2) {
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r2.writeToParcel(r0, r1)
            byte[] r2 = r0.marshall()
            r0.recycle()
            return r2
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> void serializeToIntentExtra(T r0, android.content.Intent r1, java.lang.String r2) {
            byte[] r0 = serializeToBytes(r0)
            r1.putExtra(r2, r0)
            return
    }

    public static <T extends com.google.android.gms.common.internal.safeparcel.SafeParcelable> java.lang.String serializeToString(T r0) {
            byte[] r0 = serializeToBytes(r0)
            java.lang.String r0 = com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(r0)
            return r0
    }

    private static byte[] zza(java.lang.Iterable r1) {
            android.os.Parcel r0 = android.os.Parcel.obtain()
            s28 r1 = defpackage.s28.i(r1)     // Catch: java.lang.Throwable -> L13
            r0.writeTypedList(r1)     // Catch: java.lang.Throwable -> L13
            byte[] r1 = r0.marshall()     // Catch: java.lang.Throwable -> L13
            r0.recycle()
            return r1
        L13:
            r1 = move-exception
            r0.recycle()
            throw r1
    }
}
