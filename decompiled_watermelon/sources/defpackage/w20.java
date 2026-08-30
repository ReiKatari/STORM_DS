package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w20  reason: default package */
/* loaded from: classes.dex */
public final class w20 implements Runnable {
    public final /* synthetic */ int A;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                throw null;
            default:
                try {
                    Method method = iw6.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (mo1.d()) {
                        mo1.a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Method method2 = iw6.b;
                    Trace.endSection();
                    throw th;
                }
        }
    }
}
