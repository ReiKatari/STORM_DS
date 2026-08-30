package com.squareup.picasso;

import android.os.Trace;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements Runnable {
    public final /* synthetic */ int A;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                throw null;
            default:
                try {
                    Method method = u5.e.f13494b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (m6.i.d()) {
                        m6.i.a().e();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th2) {
                    Method method2 = u5.e.f13494b;
                    Trace.endSection();
                    throw th2;
                }
        }
    }
}
