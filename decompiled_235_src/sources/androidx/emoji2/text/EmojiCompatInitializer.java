package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements j53 {
    @Override // defpackage.j53
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wi2, ts1] */
    @Override // defpackage.j53
    public final Object b(Context context) {
        Object obj;
        ?? ts1Var = new ts1(new rh(context, 4));
        ts1Var.a = 1;
        if (ws1.k == null) {
            synchronized (ws1.j) {
                try {
                    if (ws1.k == null) {
                        ws1.k = new ws1(ts1Var);
                    }
                } finally {
                }
            }
        }
        bt J = bt.J(context);
        J.getClass();
        synchronized (bt.Y) {
            try {
                obj = ((HashMap) J.B).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = J.F(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        ut3 lifecycle = ((hu3) obj).getLifecycle();
        lifecycle.a(new xs1(this, lifecycle));
        return Boolean.TRUE;
    }
}
