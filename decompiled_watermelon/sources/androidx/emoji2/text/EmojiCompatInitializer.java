package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements gz2 {
    @Override // defpackage.gz2
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zd2, io1] */
    @Override // defpackage.gz2
    public final Object b(Context context) {
        Object obj;
        ?? io1Var = new io1(new fh(context, 3));
        io1Var.a = 1;
        if (mo1.k == null) {
            synchronized (mo1.j) {
                try {
                    if (mo1.k == null) {
                        mo1.k = new mo1(io1Var);
                    }
                } finally {
                }
            }
        }
        os y = os.y(context);
        y.getClass();
        synchronized (os.Y) {
            try {
                obj = ((HashMap) y.B).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = y.r(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        rm3 lifecycle = ((fn3) obj).getLifecycle();
        lifecycle.a(new no1(this, lifecycle));
        return Boolean.TRUE;
    }
}
