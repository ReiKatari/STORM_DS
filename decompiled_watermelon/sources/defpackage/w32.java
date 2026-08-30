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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w32  reason: default package */
/* loaded from: classes.dex */
public class w32 extends u32 {
    public final WindowLayoutComponent a;
    public final zz0 b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public w32(WindowLayoutComponent windowLayoutComponent, zz0 zz0Var) {
        this.a = windowLayoutComponent;
        this.b = zz0Var;
    }

    @Override // defpackage.u32, defpackage.ee7
    public void a(wz0 wz0Var) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(wz0Var);
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
            linkedHashSet.remove(wz0Var);
            reentrantLock2.unlock();
            linkedHashMap2.remove(wz0Var);
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove(context);
                yz0 yz0Var = (yz0) this.f.remove(multicastConsumer);
                if (yz0Var != null) {
                    yz0Var.a.invoke(yz0Var.b, yz0Var.c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [v32, lj2] */
    @Override // defpackage.u32, defpackage.ee7
    public void b(Context context, Executor executor, wz0 wz0Var) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(wz0Var);
                linkedHashMap2.put(wz0Var, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(wz0Var, context);
                multicastConsumer2.a(wz0Var);
                if (context instanceof Activity) {
                    this.f.put(multicastConsumer2, this.b.a(this.a, q75.a(WindowLayoutInfo.class), (Activity) context, new lj2(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0, 0)));
                } else {
                    multicastConsumer2.accept(new WindowLayoutInfo(pp1.A));
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
