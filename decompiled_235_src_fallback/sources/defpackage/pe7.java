package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pe7  reason: default package */
/* loaded from: classes.dex */
public class pe7 extends defpackage.bl2 {
    public static android.graphics.fonts.Font X(android.graphics.fonts.FontFamily r5, int r6) {
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r6 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r6 = r6 & 2
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L13
            r6 = r3
            goto L14
        L13:
            r6 = r2
        L14:
            r0.<init>(r1, r6)
            android.graphics.fonts.Font r6 = r5.getFont(r2)
            android.graphics.fonts.FontStyle r1 = r6.getStyle()
            int r1 = a0(r0, r1)
        L23:
            int r2 = r5.getSize()
            if (r3 >= r2) goto L3c
            android.graphics.fonts.Font r2 = r5.getFont(r3)
            android.graphics.fonts.FontStyle r4 = r2.getStyle()
            int r4 = a0(r0, r4)
            if (r4 >= r1) goto L39
            r6 = r2
            r1 = r4
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r6
    }

    public static int a0(android.graphics.fonts.FontStyle r2, android.graphics.fonts.FontStyle r3) {
            int r0 = r2.getWeight()
            int r1 = r3.getWeight()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 / 100
            int r2 = r2.getSlant()
            int r3 = r3.getSlant()
            if (r2 != r3) goto L1b
            r2 = 0
            goto L1c
        L1b:
            r2 = 2
        L1c:
            int r0 = r0 + r2
            return r0
    }

    public final android.graphics.fonts.FontFamily Y(defpackage.rj2[] r10, android.content.ContentResolver r11) {
            r9 = this;
            int r0 = r10.length
            r1 = 0
            r2 = 0
            r3 = r1
        L4:
            if (r2 >= r0) goto L7d
            r4 = r10[r2]
            android.net.Uri r5 = r4.a
            java.lang.String r5 = r5.getScheme()
            java.lang.String r6 = "systemfont"
            boolean r5 = java.util.Objects.equals(r5, r6)
            if (r5 == 0) goto L1b
            android.graphics.fonts.Font r4 = r9.Z(r4)
            goto L6c
        L1b:
            android.net.Uri r5 = r4.a     // Catch: java.io.IOException -> L2e
            java.lang.String r6 = r4.e     // Catch: java.io.IOException -> L2e
            java.lang.String r7 = "r"
            android.os.ParcelFileDescriptor r5 = r11.openFileDescriptor(r5, r7, r1)     // Catch: java.io.IOException -> L2e
            if (r5 != 0) goto L30
            if (r5 == 0) goto L2c
            r5.close()     // Catch: java.io.IOException -> L2e
        L2c:
            r4 = r1
            goto L6c
        L2e:
            r4 = move-exception
            goto L64
        L30:
            android.graphics.fonts.Font$Builder r7 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L51
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L51
            int r8 = r4.c     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r7 = r7.setWeight(r8)     // Catch: java.lang.Throwable -> L51
            boolean r8 = r4.d     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r7 = r7.setSlant(r8)     // Catch: java.lang.Throwable -> L51
            int r4 = r4.b     // Catch: java.lang.Throwable -> L51
            android.graphics.fonts.Font$Builder r4 = r7.setTtcIndex(r4)     // Catch: java.lang.Throwable -> L51
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L53
            r4.setFontVariationSettings(r6)     // Catch: java.lang.Throwable -> L51
            goto L53
        L51:
            r4 = move-exception
            goto L5b
        L53:
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.lang.Throwable -> L51
            r5.close()     // Catch: java.io.IOException -> L2e
            goto L6c
        L5b:
            r5.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L2e
        L63:
            throw r4     // Catch: java.io.IOException -> L2e
        L64:
            java.lang.String r5 = "TypefaceCompatApi29Impl"
            java.lang.String r6 = "Font load failed"
            android.util.Log.w(r5, r6, r4)
            goto L2c
        L6c:
            if (r4 != 0) goto L6f
            goto L7a
        L6f:
            if (r3 != 0) goto L77
            android.graphics.fonts.FontFamily$Builder r3 = new android.graphics.fonts.FontFamily$Builder
            r3.<init>(r4)
            goto L7a
        L77:
            r3.addFont(r4)
        L7a:
            int r2 = r2 + 1
            goto L4
        L7d:
            if (r3 != 0) goto L80
            return r1
        L80:
            android.graphics.fonts.FontFamily r9 = r3.build()
            return r9
    }

    public android.graphics.fonts.Font Z(defpackage.rj2 r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Getting font from Typeface is not supported before API31"
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.bl2
    public final android.graphics.Typeface o(android.content.Context r6, defpackage.bj2 r7, android.content.res.Resources r8, int r9) {
            r5 = this;
            r5 = 0
            cj2[] r6 = r7.a     // Catch: java.lang.Exception -> L36
            int r7 = r6.length     // Catch: java.lang.Exception -> L36
            r0 = 0
            r1 = r5
        L6:
            if (r0 >= r7) goto L3e
            r2 = r6[r0]     // Catch: java.lang.Exception -> L36
            android.graphics.fonts.Font$Builder r3 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            int r4 = r2.f     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            r3.<init>(r8, r4)     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            int r4 = r2.b     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            android.graphics.fonts.Font$Builder r3 = r3.setWeight(r4)     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            boolean r4 = r2.c     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            android.graphics.fonts.Font$Builder r3 = r3.setSlant(r4)     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            int r4 = r2.e     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            android.graphics.fonts.Font$Builder r3 = r3.setTtcIndex(r4)     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            java.lang.String r2 = r2.d     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            android.graphics.fonts.Font$Builder r2 = r3.setFontVariationSettings(r2)     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            android.graphics.fonts.Font r2 = r2.build()     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            if (r1 != 0) goto L38
            android.graphics.fonts.FontFamily$Builder r3 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            r3.<init>(r2)     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
            r1 = r3
            goto L3b
        L36:
            r6 = move-exception
            goto L5b
        L38:
            r1.addFont(r2)     // Catch: java.lang.Exception -> L36 java.io.IOException -> L3b
        L3b:
            int r0 = r0 + 1
            goto L6
        L3e:
            if (r1 != 0) goto L41
            return r5
        L41:
            android.graphics.fonts.FontFamily r6 = r1.build()     // Catch: java.lang.Exception -> L36
            android.graphics.Typeface$CustomFallbackBuilder r7 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L36
            r7.<init>(r6)     // Catch: java.lang.Exception -> L36
            android.graphics.fonts.Font r6 = X(r6, r9)     // Catch: java.lang.Exception -> L36
            android.graphics.fonts.FontStyle r6 = r6.getStyle()     // Catch: java.lang.Exception -> L36
            android.graphics.Typeface$CustomFallbackBuilder r6 = r7.setStyle(r6)     // Catch: java.lang.Exception -> L36
            android.graphics.Typeface r5 = r6.build()     // Catch: java.lang.Exception -> L36
            return r5
        L5b:
            java.lang.String r7 = "TypefaceCompatApi29Impl"
            java.lang.String r8 = "Font load failed"
            android.util.Log.w(r7, r8, r6)
            return r5
    }

    @Override // defpackage.bl2
    public final android.graphics.Typeface p(android.content.Context r2, defpackage.rj2[] r3, int r4) {
            r1 = this;
            android.content.ContentResolver r2 = r2.getContentResolver()
            r0 = 0
            android.graphics.fonts.FontFamily r1 = r1.Y(r3, r2)     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto Lc
            return r0
        Lc:
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L22
            r2.<init>(r1)     // Catch: java.lang.Exception -> L22
            android.graphics.fonts.Font r1 = X(r1, r4)     // Catch: java.lang.Exception -> L22
            android.graphics.fonts.FontStyle r1 = r1.getStyle()     // Catch: java.lang.Exception -> L22
            android.graphics.Typeface$CustomFallbackBuilder r1 = r2.setStyle(r1)     // Catch: java.lang.Exception -> L22
            android.graphics.Typeface r1 = r1.build()     // Catch: java.lang.Exception -> L22
            return r1
        L22:
            r1 = move-exception
            java.lang.String r2 = "TypefaceCompatApi29Impl"
            java.lang.String r3 = "Font load failed"
            android.util.Log.w(r2, r3, r1)
            return r0
    }

    @Override // defpackage.bl2
    public final android.graphics.Typeface q(android.content.Context r6, java.util.List r7, int r8) {
            r5 = this;
            android.content.ContentResolver r6 = r6.getContentResolver()
            r0 = 0
            r1 = 0
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Exception -> L2f
            rj2[] r0 = (defpackage.rj2[]) r0     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontFamily r0 = r5.Y(r0, r6)     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L13
            return r1
        L13:
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L2f
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2f
            r3 = 1
        L19:
            int r4 = r7.size()     // Catch: java.lang.Exception -> L2f
            if (r3 >= r4) goto L34
            java.lang.Object r4 = r7.get(r3)     // Catch: java.lang.Exception -> L2f
            rj2[] r4 = (defpackage.rj2[]) r4     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontFamily r4 = r5.Y(r4, r6)     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L31
            r2.addCustomFallback(r4)     // Catch: java.lang.Exception -> L2f
            goto L31
        L2f:
            r5 = move-exception
            goto L45
        L31:
            int r3 = r3 + 1
            goto L19
        L34:
            android.graphics.fonts.Font r5 = X(r0, r8)     // Catch: java.lang.Exception -> L2f
            android.graphics.fonts.FontStyle r5 = r5.getStyle()     // Catch: java.lang.Exception -> L2f
            android.graphics.Typeface$CustomFallbackBuilder r5 = r2.setStyle(r5)     // Catch: java.lang.Exception -> L2f
            android.graphics.Typeface r5 = r5.build()     // Catch: java.lang.Exception -> L2f
            return r5
        L45:
            java.lang.String r6 = "TypefaceCompatApi29Impl"
            java.lang.String r7 = "Font load failed"
            android.util.Log.w(r6, r7, r5)
            return r1
    }

    @Override // defpackage.bl2
    public final android.graphics.Typeface r(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            android.graphics.fonts.Font$Builder r0 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L24
            r0.<init>(r2, r3)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.Font r0 = r0.build()     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily$Builder r1 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L24
            r1.<init>(r0)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily r1 = r1.build()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r2 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L24
            r2.<init>(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontStyle r0 = r0.getStyle()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r0 = r2.setStyle(r0)     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface r0 = r0.build()     // Catch: java.lang.Exception -> L24
            return r0
        L24:
            r0 = move-exception
            java.lang.String r1 = "TypefaceCompatApi29Impl"
            java.lang.String r2 = "Font load failed"
            android.util.Log.w(r1, r2, r0)
            r0 = 0
            return r0
    }
}
