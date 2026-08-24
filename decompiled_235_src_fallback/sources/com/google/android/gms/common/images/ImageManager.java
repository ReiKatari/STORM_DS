package com.google.android.gms.common.images;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ImageManager {
    private static final java.lang.Object zaa = null;
    private static final java.util.HashSet zab = null;
    private static com.google.android.gms.common.images.ImageManager zac;
    private final android.content.Context zad;
    private final android.os.Handler zae;
    private final java.util.concurrent.ExecutorService zaf;
    private final defpackage.zz7 zag;
    private final java.util.Map zah;
    private final java.util.Map zai;
    private final java.util.Map zaj;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public final class ImageReceiver extends android.os.ResultReceiver {
        final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
        private final android.net.Uri zab;
        private final java.util.ArrayList zac;

        public ImageReceiver(com.google.android.gms.common.images.ImageManager r2, android.net.Uri r3) {
                r1 = this;
                r1.zaa = r2
                b08 r2 = new b08
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r2.<init>(r0)
                r1.<init>(r2)
                r1.zab = r3
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.zac = r2
                return
        }

        public static /* bridge */ /* synthetic */ java.util.ArrayList zaa(com.google.android.gms.common.images.ImageManager.ImageReceiver r0) {
                java.util.ArrayList r0 = r0.zac
                return r0
        }

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int r3, android.os.Bundle r4) {
                r2 = this;
                java.lang.String r3 = "com.google.android.gms.extra.fileDescriptor"
                android.os.Parcelable r3 = r4.getParcelable(r3)
                android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3
                com.google.android.gms.common.images.ImageManager r4 = r2.zaa
                android.net.Uri r2 = r2.zab
                java.util.concurrent.ExecutorService r0 = com.google.android.gms.common.images.ImageManager.zai(r4)
                com.google.android.gms.common.images.zaa r1 = new com.google.android.gms.common.images.zaa
                r1.<init>(r4, r2, r3)
                r0.execute(r1)
                return
        }

        public final void zab(com.google.android.gms.common.images.zag r2) {
                r1 = this;
                java.lang.String r0 = "ImageReceiver.addImageRequest() must be called in the main thread"
                com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
                java.util.ArrayList r1 = r1.zac
                r1.add(r2)
                return
        }

        public final void zac(com.google.android.gms.common.images.zag r2) {
                r1 = this;
                java.lang.String r0 = "ImageReceiver.removeImageRequest() must be called in the main thread"
                com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
                java.util.ArrayList r1 = r1.zac
                r1.remove(r2)
                return
        }

        public final void zad() {
                r3 = this;
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "com.google.android.gms.common.images.LOAD_IMAGE"
                r0.<init>(r1)
                java.lang.String r1 = "com.google.android.gms"
                r0.setPackage(r1)
                java.lang.String r1 = "com.google.android.gms.extras.uri"
                android.net.Uri r2 = r3.zab
                r0.putExtra(r1, r2)
                java.lang.String r1 = "com.google.android.gms.extras.resultReceiver"
                r0.putExtra(r1, r3)
                java.lang.String r1 = "com.google.android.gms.extras.priority"
                r2 = 3
                r0.putExtra(r1, r2)
                com.google.android.gms.common.images.ImageManager r3 = r3.zaa
                android.content.Context r3 = com.google.android.gms.common.images.ImageManager.zaa(r3)
                r3.sendBroadcast(r0)
                return
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface OnImageLoadedListener {
        void onImageLoaded(android.net.Uri r1, android.graphics.drawable.Drawable r2, boolean r3);
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.gms.common.images.ImageManager.zaa = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.android.gms.common.images.ImageManager.zab = r0
            return
    }

    private ImageManager(android.content.Context r9, boolean r10) {
            r8 = this;
            r8.<init>()
            android.content.Context r9 = r9.getApplicationContext()
            r8.zad = r9
            b08 r9 = new b08
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            r9.<init>(r10)
            r8.zae = r9
            java.util.concurrent.ThreadFactory r7 = java.util.concurrent.Executors.defaultThreadFactory()
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 4
            r3 = 60
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r2 = r1
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r9 = 1
            r0.allowCoreThreadTimeOut(r9)
            java.util.concurrent.ExecutorService r9 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r8.zaf = r9
            zz7 r9 = new zz7
            r10 = 10
            r9.<init>(r10)
            r8.zag = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r8.zah = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r8.zai = r9
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r8.zaj = r9
            return
    }

    public static com.google.android.gms.common.images.ImageManager create(android.content.Context r2) {
            com.google.android.gms.common.images.ImageManager r0 = com.google.android.gms.common.images.ImageManager.zac
            if (r0 != 0) goto Lc
            com.google.android.gms.common.images.ImageManager r0 = new com.google.android.gms.common.images.ImageManager
            r1 = 0
            r0.<init>(r2, r1)
            com.google.android.gms.common.images.ImageManager.zac = r0
        Lc:
            com.google.android.gms.common.images.ImageManager r2 = com.google.android.gms.common.images.ImageManager.zac
            return r2
    }

    public static /* bridge */ /* synthetic */ android.content.Context zaa(com.google.android.gms.common.images.ImageManager r0) {
            android.content.Context r0 = r0.zad
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Handler zab(com.google.android.gms.common.images.ImageManager r0) {
            android.os.Handler r0 = r0.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ defpackage.zz7 zac(com.google.android.gms.common.images.ImageManager r0) {
            zz7 r0 = r0.zag
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zad() {
            java.lang.Object r0 = com.google.android.gms.common.images.ImageManager.zaa
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.HashSet zae() {
            java.util.HashSet r0 = com.google.android.gms.common.images.ImageManager.zab
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zaf(com.google.android.gms.common.images.ImageManager r0) {
            java.util.Map r0 = r0.zaj
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zag(com.google.android.gms.common.images.ImageManager r0) {
            java.util.Map r0 = r0.zah
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.Map zah(com.google.android.gms.common.images.ImageManager r0) {
            java.util.Map r0 = r0.zai
            return r0
    }

    public static /* bridge */ /* synthetic */ java.util.concurrent.ExecutorService zai(com.google.android.gms.common.images.ImageManager r0) {
            java.util.concurrent.ExecutorService r0 = r0.zaf
            return r0
    }

    public void loadImage(android.widget.ImageView r2, int r3) {
            r1 = this;
            com.google.android.gms.common.images.zae r0 = new com.google.android.gms.common.images.zae
            r0.<init>(r2, r3)
            r1.zaj(r0)
            return
    }

    public void loadImage(android.widget.ImageView r2, android.net.Uri r3) {
            r1 = this;
            com.google.android.gms.common.images.zae r0 = new com.google.android.gms.common.images.zae
            r0.<init>(r2, r3)
            r1.zaj(r0)
            return
    }

    public void loadImage(android.widget.ImageView r2, android.net.Uri r3, int r4) {
            r1 = this;
            com.google.android.gms.common.images.zae r0 = new com.google.android.gms.common.images.zae
            r0.<init>(r2, r3)
            r0.zab = r4
            r1.zaj(r0)
            return
    }

    public void loadImage(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener r2, android.net.Uri r3) {
            r1 = this;
            com.google.android.gms.common.images.zaf r0 = new com.google.android.gms.common.images.zaf
            r0.<init>(r2, r3)
            r1.zaj(r0)
            return
    }

    public void loadImage(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener r2, android.net.Uri r3, int r4) {
            r1 = this;
            com.google.android.gms.common.images.zaf r0 = new com.google.android.gms.common.images.zaf
            r0.<init>(r2, r3)
            r0.zab = r4
            r1.zaj(r0)
            return
    }

    public final void zaj(com.google.android.gms.common.images.zag r2) {
            r1 = this;
            java.lang.String r0 = "ImageManager.loadImage() must be called in the main thread"
            com.google.android.gms.common.internal.Asserts.checkMainThread(r0)
            com.google.android.gms.common.images.zab r0 = new com.google.android.gms.common.images.zab
            r0.<init>(r1, r2)
            r0.run()
            return
    }
}
