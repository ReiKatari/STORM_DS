package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BitmapTeleporter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.data.BitmapTeleporter> CREATOR = null;
    final int zaa;
    android.os.ParcelFileDescriptor zab;
    final int zac;
    private android.graphics.Bitmap zad;
    private boolean zae;
    private java.io.File zaf;

    static {
            com.google.android.gms.common.data.zaa r0 = new com.google.android.gms.common.data.zaa
            r0.<init>()
            com.google.android.gms.common.data.BitmapTeleporter.CREATOR = r0
            return
    }

    public BitmapTeleporter(int r1, android.os.ParcelFileDescriptor r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r1 = 0
            r0.zad = r1
            r1 = 0
            r0.zae = r1
            return
    }

    public BitmapTeleporter(android.graphics.Bitmap r3) {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.zaa = r0
            r1 = 0
            r2.zab = r1
            r1 = 0
            r2.zac = r1
            r2.zad = r3
            r2.zae = r0
            return
    }

    private static final void zaa(java.io.Closeable r2) {
            r2.close()     // Catch: java.io.IOException -> L4
            return
        L4:
            r2 = move-exception
            java.lang.String r0 = "BitmapTeleporter"
            java.lang.String r1 = "Could not close stream"
            android.util.Log.w(r0, r1, r2)
            return
    }

    public android.graphics.Bitmap get() {
            r5 = this;
            boolean r0 = r5.zae
            if (r0 != 0) goto L52
            java.io.DataInputStream r0 = new java.io.DataInputStream
            android.os.ParcelFileDescriptor$AutoCloseInputStream r1 = new android.os.ParcelFileDescriptor$AutoCloseInputStream
            android.os.ParcelFileDescriptor r2 = r5.zab
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
            r1.<init>(r2)
            r0.<init>(r1)
            int r1 = r0.readInt()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            int r3 = r0.readInt()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            java.lang.String r4 = r0.readUTF()     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.valueOf(r4)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            r0.read(r1)     // Catch: java.lang.Throwable -> L43 java.io.IOException -> L45
            zaa(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r1)
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            r1.copyPixelsFromBuffer(r0)
            r5.zad = r1
            r0 = 1
            r5.zae = r0
            goto L52
        L43:
            r5 = move-exception
            goto L4e
        L45:
            r5 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "Could not read from parcel file descriptor"
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L43
            throw r1     // Catch: java.lang.Throwable -> L43
        L4e:
            zaa(r0)
            throw r5
        L52:
            android.graphics.Bitmap r5 = r5.zad
            return r5
    }

    public void release() {
            r2 = this;
            boolean r0 = r2.zae
            if (r0 != 0) goto L18
            android.os.ParcelFileDescriptor r2 = r2.zab     // Catch: java.io.IOException -> L10
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.io.IOException -> L10
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2     // Catch: java.io.IOException -> L10
            r2.close()     // Catch: java.io.IOException -> L10
            return
        L10:
            r2 = move-exception
            java.lang.String r0 = "BitmapTeleporter"
            java.lang.String r1 = "Could not close PFD"
            android.util.Log.w(r0, r1, r2)
        L18:
            return
    }

    public void setTempDir(java.io.File r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.zaf = r1
            return
        L5:
            java.lang.String r0 = "Cannot set null temp directory"
            defpackage.u34.x(r0)
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r7, int r8) {
            r6 = this;
            android.os.ParcelFileDescriptor r0 = r6.zab
            if (r0 != 0) goto L8e
            android.graphics.Bitmap r0 = r6.zad
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            int r1 = r0.getRowBytes()
            int r2 = r0.getHeight()
            int r2 = r2 * r1
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r0.copyPixelsToBuffer(r1)
            byte[] r1 = r1.array()
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            java.io.File r3 = r6.zaf
            if (r3 == 0) goto L88
            java.lang.String r4 = "teleporter"
            java.lang.String r5 = ".tmp"
            java.io.File r3 = java.io.File.createTempFile(r4, r5, r3)     // Catch: java.io.IOException -> L7f
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L79
            r4.<init>(r3)     // Catch: java.io.FileNotFoundException -> L79
            r5 = 268435456(0x10000000, float:2.524355E-29)
            android.os.ParcelFileDescriptor r5 = android.os.ParcelFileDescriptor.open(r3, r5)     // Catch: java.io.FileNotFoundException -> L79
            r6.zab = r5     // Catch: java.io.FileNotFoundException -> L79
            r3.delete()
            r2.<init>(r4)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            r3.<init>(r2)
            int r2 = r1.length     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r3.writeInt(r2)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            int r2 = r0.getWidth()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r3.writeInt(r2)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            int r2 = r0.getHeight()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r3.writeInt(r2)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            android.graphics.Bitmap$Config r0 = r0.getConfig()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r3.writeUTF(r0)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            r3.write(r1)     // Catch: java.lang.Throwable -> L6a java.io.IOException -> L6c
            zaa(r3)
            goto L8e
        L6a:
            r6 = move-exception
            goto L75
        L6c:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6a
            java.lang.String r8 = "Could not write into unlinked file"
            r7.<init>(r8, r6)     // Catch: java.lang.Throwable -> L6a
            throw r7     // Catch: java.lang.Throwable -> L6a
        L75:
            zaa(r3)
            throw r6
        L79:
            java.lang.String r6 = "Temporary file is somehow already deleted"
            defpackage.i.m(r6)
            return
        L7f:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Could not create temporary file"
            r7.<init>(r8, r6)
            throw r7
        L88:
            java.lang.String r6 = "setTempDir() must be called before writing this object to a parcel"
            defpackage.i.m(r6)
            return
        L8e:
            r0 = 1
            r8 = r8 | r0
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r7)
            int r2 = r6.zaa
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r7, r0, r2)
            android.os.ParcelFileDescriptor r0 = r6.zab
            r2 = 0
            r3 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r7, r3, r0, r8, r2)
            r8 = 3
            int r0 = r6.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r7, r8, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r7, r1)
            r7 = 0
            r6.zab = r7
            return
    }
}
