package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.x;
import d7.c;
import j7.e0;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import m6.i;
import m6.j;
import y7.a;
import y7.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // y7.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j7.e0, m6.q] */
    @Override // y7.b
    public final Object b(Context context) {
        Object obj;
        ?? e0Var = new e0(new c(context));
        e0Var.f7541a = 1;
        if (i.f9275k == null) {
            synchronized (i.f9274j) {
                try {
                    if (i.f9275k == null) {
                        i.f9275k = new i(e0Var);
                    }
                } finally {
                }
            }
        }
        a c4 = a.c(context);
        c4.getClass();
        synchronized (a.f14787e) {
            try {
                obj = c4.f14788a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c4.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        r lifecycle = ((x) obj).getLifecycle();
        lifecycle.a(new j(this, lifecycle));
        return Boolean.TRUE;
    }
}
