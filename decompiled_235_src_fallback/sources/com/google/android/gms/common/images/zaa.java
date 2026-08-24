package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zaa implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.os.ParcelFileDescriptor zac;

    public zaa(com.google.android.gms.common.images.ImageManager r1, android.net.Uri r2, android.os.ParcelFileDescriptor r3) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            r0.zab = r2
            r0.zac = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            java.lang.String r0 = "LoadBitmapFromDiskRunnable can't be executed in the main thread"
            com.google.android.gms.common.internal.Asserts.checkNotMainThread(r0)
            android.os.ParcelFileDescriptor r0 = r12.zac
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.String r4 = "ImageManager"
            if (r0 == 0) goto L34
            java.io.FileDescriptor r0 = r0.getFileDescriptor()     // Catch: java.lang.OutOfMemoryError -> L17
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFileDescriptor(r0)     // Catch: java.lang.OutOfMemoryError -> L17
            goto L28
        L17:
            r0 = move-exception
            android.net.Uri r3 = r12.zab
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "OOM while loading bitmap for uri: "
            java.lang.String r3 = r5.concat(r3)
            android.util.Log.e(r4, r3, r0)
            r3 = r1
        L28:
            android.os.ParcelFileDescriptor r0 = r12.zac     // Catch: java.io.IOException -> L2e
            r0.close()     // Catch: java.io.IOException -> L2e
            goto L34
        L2e:
            r0 = move-exception
            java.lang.String r5 = "closed failed"
            android.util.Log.e(r4, r5, r0)
        L34:
            r9 = r2
            r10 = r3
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch
            r11.<init>(r1)
            com.google.android.gms.common.images.ImageManager r7 = r12.zaa
            android.net.Uri r8 = r12.zab
            android.os.Handler r0 = com.google.android.gms.common.images.ImageManager.zab(r7)
            com.google.android.gms.common.images.zac r6 = new com.google.android.gms.common.images.zac
            r6.<init>(r7, r8, r9, r10, r11)
            r0.post(r6)
            r11.await()     // Catch: java.lang.InterruptedException -> L4f
            return
        L4f:
            android.net.Uri r12 = r12.zab
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "Latch interrupted while posting "
            java.lang.String r12 = r0.concat(r12)
            android.util.Log.w(r4, r12)
            return
    }
}
