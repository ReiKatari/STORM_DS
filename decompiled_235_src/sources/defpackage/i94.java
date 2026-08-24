package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i94  reason: default package */
/* loaded from: classes.dex */
public final class i94 implements b31, Consumer2 {
    public final Context a;
    public kv7 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public i94(Context context) {
        this.a = context;
    }

    public final void a(b31 b31Var) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            kv7 kv7Var = this.c;
            if (kv7Var != null) {
                b31Var.accept(kv7Var);
            }
            this.d.add(b31Var);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.b31
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            kv7 c = t82.c(this.a, windowLayoutInfo);
            this.c = c;
            for (b31 b31Var : this.d) {
                b31Var.accept(c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
