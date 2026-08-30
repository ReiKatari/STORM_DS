package m6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import androidx.preference.Preference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f9274j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile i f9275k;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f9276a;

    /* renamed from: b  reason: collision with root package name */
    public final a1.f f9277b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f9278c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f9279d;

    /* renamed from: e  reason: collision with root package name */
    public final f f9280e;

    /* renamed from: f  reason: collision with root package name */
    public final h f9281f;

    /* renamed from: g  reason: collision with root package name */
    public final l7.a f9282g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9283h;

    /* renamed from: i  reason: collision with root package name */
    public final d f9284i;

    public i(q qVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f9276a = reentrantReadWriteLock;
        this.f9278c = 3;
        h hVar = (h) qVar.f7542b;
        this.f9281f = hVar;
        int i2 = qVar.f7541a;
        this.f9283h = i2;
        this.f9284i = (d) qVar.f7543c;
        this.f9279d = new Handler(Looper.getMainLooper());
        this.f9277b = new a1.f(0);
        this.f9282g = new l7.a(2);
        f fVar = new f(this);
        this.f9280e = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f9278c = 0;
            } catch (Throwable th2) {
                this.f9276a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                hVar.b(new e(fVar));
            } catch (Throwable th3) {
                f(th3);
            }
        }
    }

    public static i a() {
        i iVar;
        boolean z10;
        synchronized (f9274j) {
            iVar = f9275k;
            if (iVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7.m.o("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z10);
        }
        return iVar;
    }

    public static boolean d() {
        if (f9275k != null) {
            return true;
        }
        return false;
    }

    public final int b(int i2, CharSequence charSequence) {
        boolean z10 = true;
        if (c() != 1) {
            z10 = false;
        }
        p7.m.o("Not initialized yet", z10);
        p7.m.l(charSequence, "charSequence cannot be null");
        a4.n nVar = this.f9280e.f9272b;
        nVar.getClass();
        if (i2 >= 0 && i2 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                v[] vVarArr = (v[]) spanned.getSpans(i2, i2 + 1, v.class);
                if (vVarArr.length > 0) {
                    return spanned.getSpanStart(vVarArr[0]);
                }
            }
            return ((n) nVar.E(charSequence, Math.max(0, i2 - 16), Math.min(charSequence.length(), i2 + 16), Preference.DEFAULT_ORDER, true, new n(i2))).B;
        }
        return -1;
    }

    public final int c() {
        this.f9276a.readLock().lock();
        try {
            return this.f9278c;
        } finally {
            this.f9276a.readLock().unlock();
        }
    }

    public final void e() {
        boolean z10;
        if (this.f9283h == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.o("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z10);
        if (c() == 1) {
            return;
        }
        this.f9276a.writeLock().lock();
        try {
            if (this.f9278c == 0) {
                return;
            }
            this.f9278c = 0;
            this.f9276a.writeLock().unlock();
            f fVar = this.f9280e;
            i iVar = fVar.f9271a;
            try {
                iVar.f9281f.b(new e(fVar));
            } catch (Throwable th2) {
                iVar.f(th2);
            }
        } finally {
            this.f9276a.writeLock().unlock();
        }
    }

    public final void f(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f9276a.writeLock().lock();
        try {
            this.f9278c = 2;
            arrayList.addAll(this.f9277b);
            this.f9277b.clear();
            this.f9276a.writeLock().unlock();
            this.f9279d.post(new com.google.android.material.datepicker.g(arrayList, this.f9278c, th2));
        } catch (Throwable th3) {
            this.f9276a.writeLock().unlock();
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #2 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:94:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [m6.x, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(int r12, int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.i.g(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void h(g gVar) {
        p7.m.l(gVar, "initCallback cannot be null");
        this.f9276a.writeLock().lock();
        try {
            if (this.f9278c != 1 && this.f9278c != 2) {
                this.f9277b.add(gVar);
                this.f9276a.writeLock().unlock();
            }
            this.f9279d.post(new com.google.android.material.datepicker.g(Arrays.asList(gVar), this.f9278c, (Throwable) null));
            this.f9276a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f9276a.writeLock().unlock();
            throw th2;
        }
    }

    public final void i(EditorInfo editorInfo) {
        int i2;
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.f9280e;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        n6.b bVar = (n6.b) fVar.f9273c.B;
        int a10 = bVar.a(4);
        if (a10 != 0) {
            i2 = ((ByteBuffer) bVar.R).getInt(a10 + bVar.A);
        } else {
            i2 = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i2);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
