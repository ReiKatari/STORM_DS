package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iq2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iq2 implements android.speech.tts.TextToSpeech.OnInitListener {
    public final /* synthetic */ defpackage.qq2 a;

    public /* synthetic */ iq2(defpackage.qq2 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int r6) {
            r5 = this;
            java.lang.String r0 = "TTS initialized. Available voices: "
            java.lang.String r1 = "GameTtsManager"
            if (r6 != 0) goto L115
            r6 = 1
            qq2 r5 = r5.a
            r5.d = r6
            android.content.SharedPreferences r6 = r5.b
            java.lang.String r2 = "translator_tts_lang"
            java.lang.String r3 = "ru"
            java.lang.String r6 = r6.getString(r2, r3)
            if (r6 != 0) goto L18
            r6 = r3
        L18:
            int r2 = r6.hashCode()
            r4 = 3201(0xc81, float:4.486E-42)
            if (r2 == r4) goto Lbe
            r4 = 3241(0xca9, float:4.542E-42)
            if (r2 == r4) goto Laf
            r4 = 3246(0xcae, float:4.549E-42)
            if (r2 == r4) goto La0
            r4 = 3276(0xccc, float:4.59E-42)
            if (r2 == r4) goto L91
            r4 = 3371(0xd2b, float:4.724E-42)
            if (r2 == r4) goto L82
            r4 = 3383(0xd37, float:4.74E-42)
            if (r2 == r4) goto L73
            r4 = 3428(0xd64, float:4.804E-42)
            if (r2 == r4) goto L64
            r4 = 3734(0xe96, float:5.232E-42)
            if (r2 == r4) goto L53
            r4 = 3886(0xf2e, float:5.445E-42)
            if (r2 == r4) goto L42
            goto Lc6
        L42:
            java.lang.String r2 = "zh"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L4c
            goto Lc6
        L4c:
            java.util.Locale r6 = java.util.Locale.CHINESE
            r6.getClass()
            goto Ld1
        L53:
            java.lang.String r2 = "uk"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L5d
            goto Lc6
        L5d:
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r2)
            goto Ld1
        L64:
            java.lang.String r2 = "ko"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L6d
            goto Lc6
        L6d:
            java.util.Locale r6 = java.util.Locale.KOREAN
            r6.getClass()
            goto Ld1
        L73:
            java.lang.String r2 = "ja"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L7c
            goto Lc6
        L7c:
            java.util.Locale r6 = java.util.Locale.JAPANESE
            r6.getClass()
            goto Ld1
        L82:
            java.lang.String r2 = "it"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L8b
            goto Lc6
        L8b:
            java.util.Locale r6 = java.util.Locale.ITALIAN
            r6.getClass()
            goto Ld1
        L91:
            java.lang.String r2 = "fr"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L9a
            goto Lc6
        L9a:
            java.util.Locale r6 = java.util.Locale.FRENCH
            r6.getClass()
            goto Ld1
        La0:
            java.lang.String r2 = "es"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto La9
            goto Lc6
        La9:
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r2)
            goto Ld1
        Laf:
            java.lang.String r2 = "en"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto Lb8
            goto Lc6
        Lb8:
            java.util.Locale r6 = java.util.Locale.ENGLISH
            r6.getClass()
            goto Ld1
        Lbe:
            java.lang.String r2 = "de"
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto Lcc
        Lc6:
            java.util.Locale r6 = new java.util.Locale
            r6.<init>(r3)
            goto Ld1
        Lcc:
            java.util.Locale r6 = java.util.Locale.GERMAN
            r6.getClass()
        Ld1:
            r5.a(r6)
            android.speech.tts.TextToSpeech r6 = r5.c     // Catch: java.lang.Throwable -> Le5
            if (r6 == 0) goto Le7
            java.util.Set r6 = r6.getVoices()     // Catch: java.lang.Throwable -> Le5
            if (r6 == 0) goto Le7
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> Le5
            java.util.List r6 = defpackage.gt0.k1(r6)     // Catch: java.lang.Throwable -> Le5
            goto Le9
        Le5:
            r5 = move-exception
            goto Lff
        Le7:
            yt1 r6 = defpackage.yt1.A     // Catch: java.lang.Throwable -> Le5
        Le9:
            r5.e = r6     // Catch: java.lang.Throwable -> Le5
            int r5 = r6.size()     // Catch: java.lang.Throwable -> Le5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le5
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Le5
            r6.append(r5)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> Le5
            android.util.Log.i(r1, r5)     // Catch: java.lang.Throwable -> Le5
            return
        Lff:
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot query voices: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.w(r1, r5)
            return
        L115:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "TextToSpeech init failed with code: "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r1, r5)
            return
    }
}
