package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: up  reason: default package */
/* loaded from: classes.dex */
public abstract class up {
    public static android.widget.EdgeEffect a(android.content.Context r2) {
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect     // Catch: java.lang.Throwable -> L7
            r1 = 0
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L7
            return r0
        L7:
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            r0.<init>(r2)
            return r0
    }

    public static defpackage.ey b(android.media.EncoderProfiles r17) {
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
            if (r5 == 0) goto L85
            java.lang.Object r5 = r2.next()
            android.media.EncoderProfiles$VideoProfile r5 = (android.media.EncoderProfiles.VideoProfile) r5
            int r7 = r5.getCodec()
            java.lang.String r8 = r5.getMediaType()
            int r9 = r5.getBitrate()
            int r10 = r5.getFrameRate()
            int r11 = r5.getWidth()
            int r12 = r5.getHeight()
            int r13 = r5.getProfile()
            fy r6 = new fy
            r14 = 8
            r15 = 0
            r16 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4.add(r6)
            goto L4f
        L85:
            ey r0 = defpackage.ey.a(r0, r1, r3, r4)
            return r0
    }

    public static android.media.EncoderProfiles c(int r0, java.lang.String r1) {
            android.media.EncoderProfiles r0 = android.media.CamcorderProfile.getAll(r1, r0)
            return r0
    }

    public static android.graphics.Path d(android.view.DisplayCutout r0) {
            android.graphics.Path r0 = r0.getCutoutPath()
            return r0
    }

    public static float e(android.widget.EdgeEffect r0) {
            float r0 = r0.getDistance()     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static int f(android.app.job.JobParameters r1) {
            int r1 = r1.getStopReason()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.X
            switch(r1) {
                case 0: goto Lb;
                case 1: goto Lb;
                case 2: goto Lb;
                case 3: goto Lb;
                case 4: goto Lb;
                case 5: goto Lb;
                case 6: goto Lb;
                case 7: goto Lb;
                case 8: goto Lb;
                case 9: goto Lb;
                case 10: goto Lb;
                case 11: goto Lb;
                case 12: goto Lb;
                case 13: goto Lb;
                case 14: goto Lb;
                case 15: goto Lb;
                default: goto L9;
            }
        L9:
            r1 = -512(0xfffffffffffffe00, float:NaN)
        Lb:
            return r1
    }

    public static float g(android.widget.EdgeEffect r0, float r1, float r2) {
            float r0 = r0.onPullDistance(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r0
        L5:
            r0.onPull(r1, r2)
            r0 = 0
            return r0
    }

    public static void h(android.app.Notification.Action.Builder r1) {
            r0 = 0
            r1.setAuthenticationRequired(r0)
            return
    }
}
