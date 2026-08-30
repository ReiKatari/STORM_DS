package defpackage;

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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mo1  reason: default package */
/* loaded from: classes.dex */
public final class mo1 {
    public static final Object j = new Object();
    public static volatile mo1 k;
    public final ReentrantReadWriteLock a;
    public final hu b;
    public volatile int c;
    public final Handler d;
    public final ho1 e;
    public final lo1 f;
    public final jo1 g;
    public final int h;
    public final ea1 i;

    public mo1(zd2 zd2Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        lo1 lo1Var = (lo1) zd2Var.b;
        this.f = lo1Var;
        int i = zd2Var.a;
        this.h = i;
        this.i = (ea1) zd2Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new hu(0);
        this.g = new jo1(0);
        ho1 ho1Var = new ho1(this);
        this.e = ho1Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                lo1Var.a(new go1(ho1Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static mo1 a() {
        mo1 mo1Var;
        boolean z;
        synchronized (j) {
            mo1Var = k;
            if (mo1Var != null) {
                z = true;
            } else {
                z = false;
            }
            nl2.D("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z);
        }
        return mo1Var;
    }

    public static boolean d() {
        if (k != null) {
            return true;
        }
        return false;
    }

    public final int b(int i, CharSequence charSequence) {
        boolean z = true;
        if (c() != 1) {
            z = false;
        }
        nl2.D("Not initialized yet", z);
        nl2.C(charSequence, "charSequence cannot be null");
        os osVar = this.e.b;
        osVar.getClass();
        if (i >= 0 && i < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                x07[] x07VarArr = (x07[]) spanned.getSpans(i, i + 1, x07.class);
                if (x07VarArr.length > 0) {
                    return spanned.getSpanStart(x07VarArr[0]);
                }
            }
            return ((yo1) osVar.K(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Preference.DEFAULT_ORDER, true, new yo1(i))).B;
        }
        return -1;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        boolean z;
        if (this.h == 1) {
            z = true;
        } else {
            z = false;
        }
        nl2.D("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z);
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            ho1 ho1Var = this.e;
            mo1 mo1Var = ho1Var.a;
            try {
                mo1Var.f.a(new go1(ho1Var));
            } catch (Throwable th) {
                mo1Var.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new m90(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:92:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, y27] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence g(int r12, int r13, int r14, java.lang.CharSequence r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo1.g(int, int, int, java.lang.CharSequence):java.lang.CharSequence");
    }

    public final void h(ko1 ko1Var) {
        nl2.C(ko1Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(ko1Var);
                this.a.writeLock().unlock();
            }
            this.d.post(new m90(Arrays.asList(ko1Var), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        int i;
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        ho1 ho1Var = this.e;
        ho1Var.getClass();
        Bundle bundle = editorInfo.extras;
        xx3 xx3Var = (xx3) ho1Var.c.B;
        int a = xx3Var.a(4);
        if (a != 0) {
            i = ((ByteBuffer) xx3Var.R).getInt(a + xx3Var.A);
        } else {
            i = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
