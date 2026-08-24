package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ws1  reason: default package */
/* loaded from: classes.dex */
public final class ws1 {
    public static final java.lang.Object j = null;
    public static volatile defpackage.ws1 k;
    public final java.util.concurrent.locks.ReentrantReadWriteLock a;
    public final defpackage.zu b;
    public volatile int c;
    public final android.os.Handler d;
    public final defpackage.ss1 e;
    public final defpackage.vs1 f;
    public final defpackage.x31 g;
    public final int h;
    public final defpackage.ae1 i;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ws1.j = r0
            return
    }

    public ws1(defpackage.wi2 r6) {
            r5 = this;
            r5.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r5.a = r0
            r1 = 3
            r5.c = r1
            java.lang.Object r1 = r6.b
            vs1 r1 = (defpackage.vs1) r1
            r5.f = r1
            int r2 = r6.a
            r5.h = r2
            java.lang.Object r6 = r6.c
            ae1 r6 = (defpackage.ae1) r6
            r5.i = r6
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r6.<init>(r3)
            r5.d = r6
            zu r6 = new zu
            r3 = 0
            r6.<init>(r3)
            r5.b = r6
            x31 r6 = new x31
            r4 = 2
            r6.<init>(r4)
            r5.g = r6
            ss1 r6 = new ss1
            r6.<init>(r5)
            r5.e = r6
            java.util.concurrent.locks.Lock r4 = r0.writeLock()
            r4.lock()
            if (r2 != 0) goto L56
            r5.c = r3     // Catch: java.lang.Throwable -> L4b
            goto L56
        L4b:
            r6 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r5.a
            java.util.concurrent.locks.Lock r5 = r5.writeLock()
            r5.unlock()
            throw r6
        L56:
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            int r0 = r5.c()
            if (r0 != 0) goto L70
            rs1 r0 = new rs1     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L6c
            r1.a(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r6 = move-exception
            r5.f(r6)
        L70:
            return
    }

    public static defpackage.ws1 a() {
            java.lang.Object r0 = defpackage.ws1.j
            monitor-enter(r0)
            ws1 r1 = defpackage.ws1.k     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            java.lang.String r3 = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message."
            defpackage.np2.A(r3, r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
    }

    public static boolean d() {
            ws1 r0 = defpackage.ws1.k
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final int b(int r10, java.lang.CharSequence r11) {
            r9 = this;
            int r0 = r9.c()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L9
            goto La
        L9:
            r2 = r1
        La:
            java.lang.String r0 = "Not initialized yet"
            defpackage.np2.A(r0, r2)
            java.lang.String r0 = "charSequence cannot be null"
            defpackage.np2.x(r11, r0)
            ss1 r9 = r9.e
            bt r2 = r9.b
            r2.getClass()
            if (r10 < 0) goto L62
            int r9 = r11.length()
            if (r10 < r9) goto L24
            goto L62
        L24:
            boolean r9 = r11 instanceof android.text.Spanned
            if (r9 == 0) goto L3f
            r9 = r11
            android.text.Spanned r9 = (android.text.Spanned) r9
            int r0 = r10 + 1
            java.lang.Class<se7> r3 = defpackage.se7.class
            java.lang.Object[] r0 = r9.getSpans(r10, r0, r3)
            se7[] r0 = (defpackage.se7[]) r0
            int r3 = r0.length
            if (r3 <= 0) goto L3f
            r10 = r0[r1]
            int r9 = r9.getSpanStart(r10)
            return r9
        L3f:
            int r9 = r10 + (-16)
            int r4 = java.lang.Math.max(r1, r9)
            int r9 = r11.length()
            int r0 = r10 + 16
            int r5 = java.lang.Math.min(r9, r0)
            ht1 r8 = new ht1
            r8.<init>(r10)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            r3 = r11
            java.lang.Object r9 = r2.Q(r3, r4, r5, r6, r7, r8)
            ht1 r9 = (defpackage.ht1) r9
            int r9 = r9.B
            return r9
        L62:
            r9 = -1
            return r9
    }

    public final int c() {
            r1 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r1.a
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            int r0 = r1.c     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.a
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            return r0
        L15:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r1.a
            java.util.concurrent.locks.Lock r1 = r1.readLock()
            r1.unlock()
            throw r0
    }

    public final void e() {
            r4 = this;
            int r0 = r4.h
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            java.lang.String r3 = "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading"
            defpackage.np2.A(r3, r0)
            int r0 = r4.c()
            if (r0 != r2) goto L15
            return
        L15:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r4.c     // Catch: java.lang.Throwable -> L4b
            if (r0 != 0) goto L2c
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.a
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            return
        L2c:
            r4.c = r1     // Catch: java.lang.Throwable -> L4b
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            ss1 r4 = r4.e
            ws1 r0 = r4.a
            rs1 r1 = new rs1     // Catch: java.lang.Throwable -> L46
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L46
            vs1 r4 = r0.f     // Catch: java.lang.Throwable -> L46
            r4.a(r1)     // Catch: java.lang.Throwable -> L46
            return
        L46:
            r4 = move-exception
            r0.f(r4)
            return
        L4b:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.a
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            throw r0
    }

    public final void f(java.lang.Throwable r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.lock()
            r1 = 2
            r3.c = r1     // Catch: java.lang.Throwable -> L31
            zu r1 = r3.b     // Catch: java.lang.Throwable -> L31
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L31
            zu r1 = r3.b     // Catch: java.lang.Throwable -> L31
            r1.clear()     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r3.a
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            android.os.Handler r1 = r3.d
            ub0 r2 = new ub0
            int r3 = r3.c
            r2.<init>(r0, r3, r4)
            r1.post(r2)
            return
        L31:
            r4 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r3.a
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            throw r4
    }

    public final java.lang.CharSequence g(int r12, int r13, int r14, java.lang.CharSequence r15) {
            r11 = this;
            int r0 = r11.c()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            java.lang.String r3 = "Not initialized yet"
            defpackage.np2.A(r3, r0)
            r0 = 0
            if (r12 < 0) goto L114
            if (r13 < 0) goto L10e
            if (r12 > r13) goto L19
            r3 = r2
            goto L1a
        L19:
            r3 = r1
        L1a:
            java.lang.String r4 = "start should be <= than end"
            defpackage.np2.s(r4, r3)
            if (r15 != 0) goto L22
            return r0
        L22:
            int r3 = r15.length()
            if (r12 > r3) goto L2a
            r3 = r2
            goto L2b
        L2a:
            r3 = r1
        L2b:
            java.lang.String r4 = "start should be < than charSequence length"
            defpackage.np2.s(r4, r3)
            int r3 = r15.length()
            if (r13 > r3) goto L38
            r3 = r2
            goto L39
        L38:
            r3 = r1
        L39:
            java.lang.String r4 = "end should be < than charSequence length"
            defpackage.np2.s(r4, r3)
            int r3 = r15.length()
            if (r3 == 0) goto L46
            if (r12 != r13) goto L49
        L46:
            r5 = r15
            goto L10d
        L49:
            if (r14 == r2) goto L4d
            r9 = r1
            goto L4e
        L4d:
            r9 = r2
        L4e:
            ss1 r11 = r11.e
            bt r4 = r11.b
            r4.getClass()
            boolean r11 = r15 instanceof defpackage.tn6
            if (r11 == 0) goto L5f
            r14 = r15
            tn6 r14 = (defpackage.tn6) r14
            r14.a()
        L5f:
            java.lang.Class<se7> r14 = defpackage.se7.class
            if (r11 != 0) goto L8e
            boolean r2 = r15 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L68
            goto L8e
        L68:
            boolean r2 = r15 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L96
            r2 = r15
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L8b
            int r3 = r12 + (-1)
            int r5 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r5, r14)     // Catch: java.lang.Throwable -> L8b
            if (r2 > r13) goto L96
            tg7 r0 = new tg7     // Catch: java.lang.Throwable -> L8b
            r0.<init>()     // Catch: java.lang.Throwable -> L8b
            r0.A = r1     // Catch: java.lang.Throwable -> L8b
            android.text.SpannableString r2 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r15)     // Catch: java.lang.Throwable -> L8b
            r0.B = r2     // Catch: java.lang.Throwable -> L8b
            goto L96
        L88:
            r5 = r15
            goto L104
        L8b:
            r0 = move-exception
            r12 = r0
            goto L88
        L8e:
            tg7 r0 = new tg7     // Catch: java.lang.Throwable -> Lfe
            r2 = r15
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch: java.lang.Throwable -> Lfe
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lfe
        L96:
            if (r0 == 0) goto Lc6
            android.text.Spannable r2 = r0.B     // Catch: java.lang.Throwable -> L8b
            java.lang.Object[] r14 = r2.getSpans(r12, r13, r14)     // Catch: java.lang.Throwable -> L8b
            se7[] r14 = (defpackage.se7[]) r14     // Catch: java.lang.Throwable -> L8b
            if (r14 == 0) goto Lc6
            int r2 = r14.length     // Catch: java.lang.Throwable -> L8b
            if (r2 <= 0) goto Lc6
            int r2 = r14.length     // Catch: java.lang.Throwable -> L8b
        La6:
            if (r1 >= r2) goto Lc6
            r3 = r14[r1]     // Catch: java.lang.Throwable -> L8b
            android.text.Spannable r5 = r0.B     // Catch: java.lang.Throwable -> L8b
            int r5 = r5.getSpanStart(r3)     // Catch: java.lang.Throwable -> L8b
            android.text.Spannable r6 = r0.B     // Catch: java.lang.Throwable -> L8b
            int r6 = r6.getSpanEnd(r3)     // Catch: java.lang.Throwable -> L8b
            if (r5 == r13) goto Lbb
            r0.removeSpan(r3)     // Catch: java.lang.Throwable -> L8b
        Lbb:
            int r12 = java.lang.Math.min(r5, r12)     // Catch: java.lang.Throwable -> L8b
            int r13 = java.lang.Math.max(r6, r13)     // Catch: java.lang.Throwable -> L8b
            int r1 = r1 + 1
            goto La6
        Lc6:
            r6 = r12
            r7 = r13
            if (r6 == r7) goto Ld0
            int r12 = r15.length()     // Catch: java.lang.Throwable -> Lfe
            if (r6 < r12) goto Ld2
        Ld0:
            r5 = r15
            goto L101
        Ld2:
            yc1 r10 = new yc1     // Catch: java.lang.Throwable -> Lfe
            java.lang.Object r12 = r4.B     // Catch: java.lang.Throwable -> Lfe
            x31 r12 = (defpackage.x31) r12     // Catch: java.lang.Throwable -> Lfe
            r10.<init>(r0, r12)     // Catch: java.lang.Throwable -> Lfe
            r8 = 2147483647(0x7fffffff, float:NaN)
            r5 = r15
            java.lang.Object r12 = r4.Q(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lf2
            tg7 r12 = (defpackage.tg7) r12     // Catch: java.lang.Throwable -> Lf2
            if (r12 == 0) goto Lf5
            android.text.Spannable r12 = r12.B     // Catch: java.lang.Throwable -> Lf2
            if (r11 == 0) goto Lf1
            r15 = r5
            tn6 r15 = (defpackage.tn6) r15
            r15.b()
        Lf1:
            return r12
        Lf2:
            r0 = move-exception
        Lf3:
            r12 = r0
            goto L104
        Lf5:
            if (r11 == 0) goto L10d
        Lf7:
            r15 = r5
            tn6 r15 = (defpackage.tn6) r15
            r15.b()
            return r5
        Lfe:
            r0 = move-exception
            r5 = r15
            goto Lf3
        L101:
            if (r11 == 0) goto L10d
            goto Lf7
        L104:
            if (r11 == 0) goto L10c
            r15 = r5
            tn6 r15 = (defpackage.tn6) r15
            r15.b()
        L10c:
            throw r12
        L10d:
            return r5
        L10e:
            java.lang.String r11 = "end cannot be negative"
            defpackage.i.h(r11)
            return r0
        L114:
            java.lang.String r11 = "start cannot be negative"
            defpackage.i.h(r11)
            return r0
    }

    public final void h(defpackage.us1 r5) {
            r4 = this;
            java.lang.String r0 = "initCallback cannot be null"
            defpackage.np2.x(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.a
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            int r0 = r4.c     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            if (r0 == r1) goto L21
            int r0 = r4.c     // Catch: java.lang.Throwable -> L1f
            r1 = 2
            if (r0 != r1) goto L19
            goto L21
        L19:
            zu r0 = r4.b     // Catch: java.lang.Throwable -> L1f
            r0.add(r5)     // Catch: java.lang.Throwable -> L1f
            goto L36
        L1f:
            r5 = move-exception
            goto L40
        L21:
            android.os.Handler r0 = r4.d     // Catch: java.lang.Throwable -> L1f
            ub0 r1 = new ub0     // Catch: java.lang.Throwable -> L1f
            int r2 = r4.c     // Catch: java.lang.Throwable -> L1f
            us1[] r5 = new defpackage.us1[]{r5}     // Catch: java.lang.Throwable -> L1f
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            r1.<init>(r5, r2, r3)     // Catch: java.lang.Throwable -> L1f
            r0.post(r1)     // Catch: java.lang.Throwable -> L1f
        L36:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.a
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            return
        L40:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.a
            java.util.concurrent.locks.Lock r4 = r4.writeLock()
            r4.unlock()
            throw r5
    }

    public final void i(android.view.inputmethod.EditorInfo r5) {
            r4 = this;
            int r0 = r4.c()
            r1 = 1
            if (r0 != r1) goto L43
            if (r5 != 0) goto La
            return
        La:
            android.os.Bundle r0 = r5.extras
            if (r0 != 0) goto L15
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r5.extras = r0
        L15:
            ss1 r4 = r4.e
            r4.getClass()
            android.os.Bundle r0 = r5.extras
            eb r4 = r4.c
            java.lang.Object r4 = r4.B
            q54 r4 = (defpackage.q54) r4
            r1 = 4
            int r1 = r4.a(r1)
            r2 = 0
            if (r1 == 0) goto L36
            java.lang.Object r3 = r4.R
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r4 = r4.A
            int r1 = r1 + r4
            int r4 = r3.getInt(r1)
            goto L37
        L36:
            r4 = r2
        L37:
            java.lang.String r1 = "android.support.text.emoji.emojiCompat_metadataVersion"
            r0.putInt(r1, r4)
            android.os.Bundle r4 = r5.extras
            java.lang.String r5 = "android.support.text.emoji.emojiCompat_replaceAll"
            r4.putBoolean(r5, r2)
        L43:
            return
    }
}
