package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o82  reason: default package */
/* loaded from: classes.dex */
public class o82 extends m82 {
    public final WindowLayoutComponent a;
    public final e31 b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public o82(WindowLayoutComponent windowLayoutComponent, e31 e31Var) {
        this.a = windowLayoutComponent;
        this.b = e31Var;
    }

    @Override // defpackage.m82, defpackage.gt7
    public void a(b31 b31Var) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(b31Var);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.d;
            ReentrantLock reentrantLock2 = multicastConsumer.b;
            reentrantLock2.lock();
            linkedHashSet.remove(b31Var);
            reentrantLock2.unlock();
            linkedHashMap2.remove(b31Var);
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove(context);
                d31 d31Var = (d31) this.f.remove(multicastConsumer);
                if (d31Var != null) {
                    d31Var.a.invoke(d31Var.b, d31Var.c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [po2, n82] */
    @Override // defpackage.m82, defpackage.gt7
    public void b(Context context, Executor executor, b31 b31Var) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(b31Var);
                linkedHashMap2.put(b31Var, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(b31Var, context);
                multicastConsumer2.a(b31Var);
                if (context instanceof Activity) {
                    this.f.put(multicastConsumer2, this.b.a(this.a, gh5.a(WindowLayoutInfo.class), (Activity) context, new po2(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0, 0)));
                } else {
                    multicastConsumer2.accept(new WindowLayoutInfo(yt1.A));
                    reentrantLock.unlock();
                    return;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
