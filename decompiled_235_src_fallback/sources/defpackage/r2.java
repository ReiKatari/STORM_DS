package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r2  reason: default package */
/* loaded from: classes.dex */
public abstract class r2 {
    public static defpackage.ey a(android.media.EncoderProfiles r17) {
            int r0 = r17.getDefaultDurationSeconds()
            int r1 = r17.getRecommendedFileFormat()
            java.util.List r2 = r17.getAudioProfiles()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L15:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L42
            java.lang.Object r4 = r2.next()
            android.media.EncoderProfiles$AudioProfile r4 = (android.media.EncoderProfiles.AudioProfile) r4
            int r6 = r4.getCodec()
            java.lang.String r7 = r4.getMediaType()
            int r8 = r4.getBitrate()
            int r9 = r4.getSampleRate()
            int r10 = r4.getChannels()
            int r11 = r4.getProfile()
            dy r5 = new dy
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r3.add(r5)
            goto L15
        L42:
            java.util.List r2 = r17.getVideoProfiles()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L4f:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r2.next()
            android.media.EncoderProfiles$VideoProfile r5 = (android.media.EncoderProfiles.VideoProfile) r5
            int r7 = r5.getCodec()
            java.lang.String r8 = r5.getMediaType()
            int r9 = r5.getBitrate()
            int r10 = r5.getFrameRate()
            int r11 = r5.getWidth()
            int r12 = r5.getHeight()
            int r13 = r5.getProfile()
            int r14 = r5.getBitDepth()
            int r15 = r5.getChromaSubsampling()
            int r16 = r5.getHdrFormat()
            fy r6 = new fy
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.add(r6)
            goto L4f
        L8c:
            ey r0 = defpackage.ey.a(r0, r1, r3, r4)
            return r0
    }

    public static android.content.pm.PackageInfo b(android.content.pm.PackageManager r2, android.content.Context r3) {
            java.lang.String r3 = r3.getPackageName()
            r0 = 0
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r0)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
            return r2
    }

    public static java.lang.Object c(android.os.Bundle r0, java.lang.String r1, java.lang.Class r2) {
            java.lang.Object r0 = r0.getParcelable(r1, r2)
            return r0
    }

    public static java.util.ArrayList d(android.os.Bundle r0, java.lang.String r1, java.lang.Class r2) {
            java.util.ArrayList r0 = r0.getParcelableArrayList(r1, r2)
            return r0
    }

    public static java.lang.Object e(android.content.Intent r2) {
            java.lang.String r0 = "key_rom_info"
            java.lang.Class<mx5> r1 = defpackage.mx5.class
            java.lang.Object r2 = r2.getParcelableExtra(r0, r1)
            return r2
    }

    public static defpackage.yq1 f(defpackage.lg0 r1) {
            r1.getClass()
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE
            r0.getClass()
            qc0 r1 = (defpackage.qc0) r1
            java.lang.Object r1 = r1.c(r0)
            java.lang.Long r1 = (java.lang.Long) r1
            if (r1 == 0) goto L1b
            java.util.LinkedHashMap r0 = defpackage.zq1.a
            java.lang.Object r1 = r0.get(r1)
            yq1 r1 = (defpackage.yq1) r1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static java.lang.String g(android.view.accessibility.AccessibilityNodeInfo r0) {
            java.lang.String r0 = r0.getUniqueId()
            return r0
    }

    public static boolean h(android.view.accessibility.AccessibilityNodeInfo r0) {
            boolean r0 = r0.isTextSelectable()
            return r0
    }

    public static final void i(defpackage.c05 r1, defpackage.vp r2) {
            if (r2 == 0) goto Le
            android.window.OnBackInvokedDispatcher r1 = r1.findOnBackInvokedDispatcher()
            if (r1 == 0) goto Le
            r0 = 1000000(0xf4240, float:1.401298E-39)
            r1.registerOnBackInvokedCallback(r0, r2)
        Le:
            return
    }

    public static final void j(defpackage.c05 r0, defpackage.vp r1) {
            if (r1 == 0) goto Lb
            android.window.OnBackInvokedDispatcher r0 = r0.findOnBackInvokedDispatcher()
            if (r0 == 0) goto Lb
            r0.unregisterOnBackInvokedCallback(r1)
        Lb:
            return
    }

    public static android.os.Parcelable k(android.os.Parcel r0, java.lang.ClassLoader r1, java.lang.Class r2) {
            java.lang.Object r0 = r0.readParcelable(r1, r2)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            return r0
    }

    public static void l(android.content.pm.ShortcutInfo.Builder r1) {
            r0 = 0
            r1.setExcludedFromSurfaces(r0)
            return
    }
}
