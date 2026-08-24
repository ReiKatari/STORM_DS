package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MultiFlavorDetectorCreator {
    private final java.util.Map zza;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface DetectorCreator<DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> {
        DetectorT create(OptionsT r1);
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface DetectorOptions<DetectorT> {
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public interface MultiFlavorDetector {
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Registration {
        private final java.lang.Class zza;
        private final defpackage.o55 zzb;
        private final int zzc;

        public <DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> Registration(java.lang.Class<? extends OptionsT> r2, defpackage.o55 r3) {
                r1 = this;
                r0 = 100
                r1.<init>(r2, r3, r0)
                return
        }

        public <DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> Registration(java.lang.Class<? extends OptionsT> r1, defpackage.o55 r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.zza = r1
                r0.zzb = r2
                r0.zzc = r3
                return
        }

        public final int zza() {
                r0 = this;
                int r0 = r0.zzc
                return r0
        }

        public final defpackage.o55 zzb() {
                r0 = this;
                o55 r0 = r0.zzb
                return r0
        }

        public final java.lang.Class zzc() {
                r0 = this;
                java.lang.Class r0 = r0.zza
                return r0
        }
    }

    public MultiFlavorDetectorCreator(java.util.Set r6) {
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.zza = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L13:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L56
            java.lang.Object r1 = r6.next()
            com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator$Registration r1 = (com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.Registration) r1
            java.lang.Class r2 = r1.zzc()
            java.util.Map r3 = r5.zza
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L41
            int r3 = r1.zza()
            java.lang.Object r4 = r0.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r4 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r3 < r4) goto L13
        L41:
            java.util.Map r3 = r5.zza
            o55 r4 = r1.zzb()
            r3.put(r2, r4)
            int r1 = r1.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
            goto L13
        L56:
            return
    }

    public static synchronized com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator getInstance() {
            java.lang.Class<com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator> r0 = com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.class
            monitor-enter(r0)
            com.google.mlkit.common.sdkinternal.MlKitContext r1 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()     // Catch: java.lang.Throwable -> L11
            java.lang.Class<com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator> r2 = com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.class
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L11
            com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator r1 = (com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator) r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public <DetectorT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.MultiFlavorDetector, OptionsT extends com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorOptions<DetectorT>> DetectorT create(OptionsT r2) {
            r1 = this;
            java.util.Map r1 = r1.zza
            java.lang.Class r0 = r2.getClass()
            java.lang.Object r1 = r1.get(r0)
            o55 r1 = (defpackage.o55) r1
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            o55 r1 = (defpackage.o55) r1
            java.lang.Object r1 = r1.get()
            com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator$DetectorCreator r1 = (com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator.DetectorCreator) r1
            com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator$MultiFlavorDetector r1 = r1.create(r2)
            return r1
    }
}
