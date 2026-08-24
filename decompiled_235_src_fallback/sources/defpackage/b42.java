package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b42  reason: default package */
/* loaded from: classes.dex */
public final class b42 implements defpackage.a42 {
    public final java.lang.String b;
    public final defpackage.y65 c;
    public final boolean d;
    public final int e;
    public final java.util.LinkedHashMap f;

    public b42(java.lang.String r1, defpackage.y65 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.b = r1
            r0.c = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.f = r2
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L17
            r2 = 1
            goto L33
        L17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Camera id is not an integer:  "
            r1.<init>(r2)
            java.lang.String r2 = r0.b
            r1.append(r2)
            java.lang.String r2 = ", unable to create EncoderProfilesProviderAdapter."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "EncoderProfilesProviderAdapter"
            defpackage.kj2.f0(r2, r1)
            r2 = 0
            r1 = -1
        L33:
            r0.d = r2
            r0.e = r1
            return
    }

    @Override // defpackage.a42
    public final boolean a(int r3) {
            r2 = this;
            boolean r0 = r2.d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            ey r2 = r2.b(r3)
            if (r2 == 0) goto Le
            r2 = 1
            return r2
        Le:
            return r1
    }

    @Override // defpackage.a42
    public final defpackage.ey b(int r22) {
            r21 = this;
            r1 = r21
            r2 = r22
            boolean r0 = r1.d
            r3 = 0
            if (r0 != 0) goto La
            goto L12
        La:
            int r4 = r1.e
            boolean r0 = android.media.CamcorderProfile.hasProfile(r4, r2)
            if (r0 != 0) goto L13
        L12:
            return r3
        L13:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.util.LinkedHashMap r5 = r1.f
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L2a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r5.get(r0)
            ey r0 = (defpackage.ey) r0
            return r0
        L2a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = -1
            java.lang.String r7 = "EncoderProfilesProviderAdapter"
            r8 = 31
            if (r0 < r8) goto L82
            java.lang.String r9 = r1.b
            android.media.EncoderProfiles r9 = defpackage.up.c(r2, r9)
            if (r9 != 0) goto L3e
        L3b:
            r0 = r3
            goto L13a
        L3e:
            java.lang.Class<androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk> r10 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.class
            y65 r11 = defpackage.si1.a()
            u65 r10 = r11.b(r10)
            if (r10 == 0) goto L50
            java.lang.String r0 = "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy."
            defpackage.kj2.t(r7, r0)
            goto L82
        L50:
            r10 = 33
            if (r0 < r10) goto L5c
            ey r0 = defpackage.r2.a(r9)     // Catch: java.lang.NullPointerException -> L5a
            goto L13a
        L5a:
            r0 = move-exception
            goto L7d
        L5c:
            if (r0 < r8) goto L64
            ey r0 = defpackage.up.b(r9)     // Catch: java.lang.NullPointerException -> L5a
            goto L13a
        L64:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch: java.lang.NullPointerException -> L5a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.NullPointerException -> L5a
            java.lang.String r11 = "Unable to call from(EncoderProfiles) on API "
            r10.<init>(r11)     // Catch: java.lang.NullPointerException -> L5a
            r10.append(r0)     // Catch: java.lang.NullPointerException -> L5a
            java.lang.String r0 = ". Version 31 or higher required."
            r10.append(r0)     // Catch: java.lang.NullPointerException -> L5a
            java.lang.String r0 = r10.toString()     // Catch: java.lang.NullPointerException -> L5a
            r9.<init>(r0)     // Catch: java.lang.NullPointerException -> L5a
            throw r9     // Catch: java.lang.NullPointerException -> L5a
        L7d:
            java.lang.String r9 = "Failed to create EncoderProfilesProxy, EncoderProfiles might contain invalid video profiles. Use CamcorderProfile instead."
            defpackage.kj2.g0(r7, r9, r0)
        L82:
            android.media.CamcorderProfile r0 = android.media.CamcorderProfile.get(r4, r2)     // Catch: java.lang.RuntimeException -> L87
            goto L9a
        L87:
            r0 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "Unable to get CamcorderProfile by quality: "
            r4.<init>(r9)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            defpackage.kj2.g0(r7, r4, r0)
            r0 = r3
        L9a:
            if (r0 == 0) goto L3b
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r8) goto Lb8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Should use from(EncoderProfiles) on API "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = "instead. CamcorderProfile is deprecated on API 31."
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.String r7 = "EncoderProfilesProxyCompat"
            defpackage.kj2.f0(r7, r4)
        Lb8:
            int r4 = r0.duration
            int r7 = r0.fileFormat
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r10 = r0.audioCodec
            switch(r10) {
                case 1: goto Ld6;
                case 2: goto Ld3;
                case 3: goto Ld0;
                case 4: goto Ld0;
                case 5: goto Ld0;
                case 6: goto Lcd;
                case 7: goto Lca;
                default: goto Lc6;
            }
        Lc6:
            java.lang.String r9 = "audio/none"
        Lc8:
            r11 = r9
            goto Ld9
        Lca:
            java.lang.String r9 = "audio/opus"
            goto Lc8
        Lcd:
            java.lang.String r9 = "audio/vorbis"
            goto Lc8
        Ld0:
            java.lang.String r9 = "audio/mp4a-latm"
            goto Lc8
        Ld3:
            java.lang.String r9 = "audio/amr-wb"
            goto Lc8
        Ld6:
            java.lang.String r9 = "audio/3gpp"
            goto Lc8
        Ld9:
            int r12 = r0.audioBitRate
            int r13 = r0.audioSampleRate
            int r14 = r0.audioChannels
            r9 = 3
            if (r10 == r9) goto Led
            r9 = 4
            r15 = 5
            if (r10 == r9) goto Lee
            if (r10 == r15) goto Lea
            r15 = r6
            goto Lee
        Lea:
            r15 = 39
            goto Lee
        Led:
            r15 = 2
        Lee:
            dy r9 = new dy
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r8.add(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r11 = r0.videoCodec
            switch(r11) {
                case 1: goto L119;
                case 2: goto L116;
                case 3: goto L113;
                case 4: goto L110;
                case 5: goto L10d;
                case 6: goto L10a;
                case 7: goto L107;
                case 8: goto L104;
                default: goto L100;
            }
        L100:
            java.lang.String r10 = "video/none"
        L102:
            r12 = r10
            goto L11c
        L104:
            java.lang.String r10 = "video/av01"
            goto L102
        L107:
            java.lang.String r10 = "video/dolby-vision"
            goto L102
        L10a:
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            goto L102
        L10d:
            java.lang.String r10 = "video/hevc"
            goto L102
        L110:
            java.lang.String r10 = "video/x-vnd.on2.vp8"
            goto L102
        L113:
            java.lang.String r10 = "video/mp4v-es"
            goto L102
        L116:
            java.lang.String r10 = "video/avc"
            goto L102
        L119:
            java.lang.String r10 = "video/3gpp"
            goto L102
        L11c:
            int r13 = r0.videoBitRate
            int r14 = r0.videoFrameRate
            int r15 = r0.videoFrameWidth
            int r0 = r0.videoFrameHeight
            fy r10 = new fy
            r17 = -1
            r18 = 8
            r19 = 0
            r20 = 0
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9.add(r10)
            ey r0 = defpackage.ey.a(r4, r7, r8, r9)
        L13a:
            if (r0 == 0) goto L1c5
            y65 r4 = r1.c
            java.lang.Class<androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk> r7 = androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk.class
            u65 r4 = r4.b(r7)
            androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk r4 = (androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk) r4
            r7 = 1
            if (r4 != 0) goto L14b
        L149:
            r4 = r7
            goto L17a
        L14b:
            java.util.List r8 = r0.d
            r8.getClass()
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L157
            goto L149
        L157:
            r9 = 0
            java.lang.Object r8 = r8.get(r9)
            fy r8 = (defpackage.fy) r8
            ex6 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.List r4 = defpackage.gt0.k1(r4)
            r8.getClass()
            android.util.Size r9 = new android.util.Size
            int r10 = r8.e
            int r8 = r8.f
            r9.<init>(r10, r8)
            boolean r4 = r4.contains(r9)
        L17a:
            if (r4 != 0) goto L1c5
            java.util.List r0 = defpackage.a42.a
            if (r2 == 0) goto L1a2
            if (r2 == r7) goto L183
            goto L1c4
        L183:
            java.util.Iterator r0 = r0.iterator()
        L187:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L1c4
            java.lang.Object r4 = r0.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            int r4 = r4.intValue()
            ey r4 = r1.b(r4)
            if (r4 == 0) goto L187
            r3 = r4
            goto L1c4
        L1a2:
            r0.getClass()
            int r4 = r0.size()
            int r4 = r4 - r7
        L1aa:
            if (r6 >= r4) goto L1c4
            java.lang.Object r7 = r0.get(r4)
            r7.getClass()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            ey r7 = r1.b(r7)
            if (r7 == 0) goto L1c1
            r3 = r7
            goto L1c4
        L1c1:
            int r4 = r4 + (-1)
            goto L1aa
        L1c4:
            r0 = r3
        L1c5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5.put(r1, r0)
            return r0
    }
}
