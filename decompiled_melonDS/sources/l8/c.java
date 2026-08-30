package l8;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import nc.i;
import nc.u;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f8972a;

    /* renamed from: b  reason: collision with root package name */
    public final g8.a f8973b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f8974c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f8975d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashMap f8976e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f8977f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, g8.a aVar) {
        this.f8972a = windowLayoutComponent;
        this.f8973b = aVar;
    }

    @Override // l8.a, k8.a
    public void a(z5.a aVar) {
        LinkedHashMap linkedHashMap = this.f8975d;
        LinkedHashMap linkedHashMap2 = this.f8976e;
        ReentrantLock reentrantLock = this.f8974c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(aVar);
            if (context == null) {
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.f1704d;
            ReentrantLock reentrantLock2 = multicastConsumer.f1702b;
            reentrantLock2.lock();
            linkedHashSet.remove(aVar);
            reentrantLock2.unlock();
            linkedHashMap2.remove(aVar);
            if (linkedHashSet.isEmpty()) {
                linkedHashMap.remove(context);
                h8.d dVar = (h8.d) this.f8977f.remove(multicastConsumer);
                if (dVar != null) {
                    dVar.f6325a.invoke(dVar.f6326b, dVar.f6327c);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l8.b, nc.i] */
    @Override // l8.a, k8.a
    public void b(Context context, Executor executor, z5.a aVar) {
        LinkedHashMap linkedHashMap = this.f8975d;
        ReentrantLock reentrantLock = this.f8974c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f8976e;
            if (multicastConsumer != null) {
                multicastConsumer.a(aVar);
                linkedHashMap2.put(aVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(aVar, context);
                multicastConsumer2.a(aVar);
                if (context instanceof Activity) {
                    this.f8977f.put(multicastConsumer2, this.f8973b.a(this.f8972a, u.a(WindowLayoutInfo.class), (Activity) context, new i(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0, 0)));
                } else {
                    multicastConsumer2.accept(new WindowLayoutInfo(q.A));
                    reentrantLock.unlock();
                    return;
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
