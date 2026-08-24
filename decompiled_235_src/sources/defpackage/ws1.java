package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ws1  reason: default package */
/* loaded from: classes.dex */
public final class ws1 {
    public static final Object j = new Object();
    public static volatile ws1 k;
    public final ReentrantReadWriteLock a;
    public final zu b;
    public volatile int c;
    public final Handler d;
    public final ss1 e;
    public final vs1 f;
    public final x31 g;
    public final int h;
    public final ae1 i;

    public ws1(wi2 wi2Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        vs1 vs1Var = (vs1) wi2Var.b;
        this.f = vs1Var;
        int i = wi2Var.a;
        this.h = i;
        this.i = (ae1) wi2Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new zu(0);
        this.g = new x31(2);
        ss1 ss1Var = new ss1(this);
        this.e = ss1Var;
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
                vs1Var.a(new rs1(ss1Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static ws1 a() {
        ws1 ws1Var;
        boolean z;
        synchronized (j) {
            ws1Var = k;
            if (ws1Var != null) {
                z = true;
            } else {
                z = false;
            }
            np2.A("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z);
        }
        return ws1Var;
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
        np2.A("Not initialized yet", z);
        np2.x(charSequence, "charSequence cannot be null");
        bt btVar = this.e.b;
        btVar.getClass();
        if (i >= 0 && i < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                se7[] se7VarArr = (se7[]) spanned.getSpans(i, i + 1, se7.class);
                if (se7VarArr.length > 0) {
                    return spanned.getSpanStart(se7VarArr[0]);
                }
            }
            return ((ht1) btVar.Q(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new ht1(i))).B;
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
        np2.A("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z);
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
            ss1 ss1Var = this.e;
            ws1 ws1Var = ss1Var.a;
            try {
                ws1Var.f.a(new rs1(ss1Var));
            } catch (Throwable th) {
                ws1Var.f(th);
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
            this.d.post(new ub0(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8 A[Catch: all -> 0x008b, TryCatch #1 {all -> 0x008b, blocks: (B:35:0x0063, B:38:0x0068, B:40:0x006c, B:42:0x0079, B:49:0x0098, B:51:0x00a2, B:53:0x00a5, B:55:0x00a8, B:57:0x00b8, B:58:0x00bb), top: B:92:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [tg7, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Throwable th;
        CharSequence charSequence2;
        int i4;
        int i5;
        se7[] se7VarArr;
        if (c() == 1) {
            z = true;
        } else {
            z = false;
        }
        np2.A("Not initialized yet", z);
        tg7 tg7Var = null;
        tg7Var = null;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                np2.s("start should be <= than end", z2);
                if (charSequence == null) {
                    return null;
                }
                if (i <= charSequence.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                np2.s("start should be < than charSequence length", z3);
                if (i2 <= charSequence.length()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                np2.s("end should be < than charSequence length", z4);
                if (charSequence.length() == 0 || i == i2) {
                    return charSequence;
                }
                if (i3 != 1) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                bt btVar = this.e.b;
                btVar.getClass();
                boolean z6 = charSequence instanceof tn6;
                if (z6) {
                    ((tn6) charSequence).a();
                }
                try {
                    if (!z6) {
                        try {
                            if (!(charSequence instanceof Spannable)) {
                                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, se7.class) <= i2) {
                                    ?? obj = new Object();
                                    obj.A = false;
                                    obj.B = new SpannableString(charSequence);
                                    tg7Var = obj;
                                }
                                if (tg7Var != null && (se7VarArr = (se7[]) tg7Var.B.getSpans(i, i2, se7.class)) != null && se7VarArr.length > 0) {
                                    for (se7 se7Var : se7VarArr) {
                                        int spanStart = tg7Var.B.getSpanStart(se7Var);
                                        int spanEnd = tg7Var.B.getSpanEnd(se7Var);
                                        if (spanStart != i2) {
                                            tg7Var.removeSpan(se7Var);
                                        }
                                        i = Math.min(spanStart, i);
                                        i2 = Math.max(spanEnd, i2);
                                    }
                                }
                                i4 = i;
                                i5 = i2;
                                if (i4 != i5 || i4 >= charSequence.length()) {
                                    charSequence2 = charSequence;
                                    if (!z6) {
                                        return charSequence2;
                                    }
                                } else {
                                    charSequence2 = charSequence;
                                    try {
                                        tg7 tg7Var2 = (tg7) btVar.Q(charSequence2, i4, i5, Integer.MAX_VALUE, z5, new yc1(tg7Var, (x31) btVar.B));
                                        if (tg7Var2 != null) {
                                            Spannable spannable = tg7Var2.B;
                                            if (z6) {
                                                ((tn6) charSequence2).b();
                                            }
                                            return spannable;
                                        } else if (!z6) {
                                            return charSequence2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        th = th;
                                        if (z6) {
                                            ((tn6) charSequence2).b();
                                        }
                                        throw th;
                                    }
                                }
                                ((tn6) charSequence2).b();
                                return charSequence2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            charSequence2 = charSequence;
                            if (z6) {
                            }
                            throw th;
                        }
                    }
                    tg7Var = new tg7((Spannable) charSequence);
                    if (tg7Var != null) {
                        while (r1 < r2) {
                        }
                    }
                    i4 = i;
                    i5 = i2;
                    if (i4 != i5) {
                    }
                    charSequence2 = charSequence;
                    if (!z6) {
                    }
                    ((tn6) charSequence2).b();
                    return charSequence2;
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    th = th;
                    if (z6) {
                    }
                    throw th;
                }
            }
            i.h("end cannot be negative");
            return null;
        }
        i.h("start cannot be negative");
        return null;
    }

    public final void h(us1 us1Var) {
        np2.x(us1Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(us1Var);
                this.a.writeLock().unlock();
            }
            this.d.post(new ub0(Arrays.asList(us1Var), this.c, (Throwable) null));
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
        ss1 ss1Var = this.e;
        ss1Var.getClass();
        Bundle bundle = editorInfo.extras;
        q54 q54Var = (q54) ss1Var.c.B;
        int a = q54Var.a(4);
        if (a != 0) {
            i = ((ByteBuffer) q54Var.R).getInt(a + q54Var.A);
        } else {
            i = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
