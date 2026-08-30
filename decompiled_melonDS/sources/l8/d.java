package l8;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: g  reason: collision with root package name */
    public final ReentrantLock f8978g;

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f8979h;

    /* renamed from: i  reason: collision with root package name */
    public final LinkedHashMap f8980i;

    public d(WindowLayoutComponent windowLayoutComponent, g8.a aVar) {
        super(windowLayoutComponent, aVar);
        this.f8978g = new ReentrantLock();
        this.f8979h = new LinkedHashMap();
        this.f8980i = new LinkedHashMap();
    }

    @Override // l8.c, l8.a, k8.a
    public final void a(z5.a aVar) {
        LinkedHashMap linkedHashMap = this.f8979h;
        LinkedHashMap linkedHashMap2 = this.f8980i;
        ReentrantLock reentrantLock = this.f8978g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(aVar);
            if (context == null) {
                return;
            }
            h hVar = (h) linkedHashMap.get(context);
            if (hVar == null) {
                return;
            }
            ReentrantLock reentrantLock2 = hVar.f8982b;
            reentrantLock2.lock();
            hVar.f8984d.remove(aVar);
            reentrantLock2.unlock();
            linkedHashMap2.remove(aVar);
            if (hVar.f8984d.isEmpty()) {
                linkedHashMap.remove(context);
                this.f8972a.removeWindowLayoutInfoListener(hVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // l8.c, l8.a, k8.a
    public final void b(Context context, Executor executor, z5.a aVar) {
        LinkedHashMap linkedHashMap = this.f8979h;
        ReentrantLock reentrantLock = this.f8978g;
        reentrantLock.lock();
        try {
            h hVar = (h) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f8980i;
            if (hVar != null) {
                hVar.a(aVar);
                linkedHashMap2.put(aVar, context);
            } else {
                h hVar2 = new h(context);
                linkedHashMap.put(context, hVar2);
                linkedHashMap2.put(aVar, context);
                hVar2.a(aVar);
                this.f8972a.addWindowLayoutInfoListener(context, hVar2);
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
