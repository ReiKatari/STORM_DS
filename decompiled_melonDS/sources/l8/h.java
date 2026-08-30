package l8;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import j8.i;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements z5.a, Consumer2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8981a;

    /* renamed from: c  reason: collision with root package name */
    public i f8983c;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f8982b = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f8984d = new LinkedHashSet();

    public h(Context context) {
        this.f8981a = context;
    }

    public final void a(z5.a aVar) {
        ReentrantLock reentrantLock = this.f8982b;
        reentrantLock.lock();
        try {
            i iVar = this.f8983c;
            if (iVar != null) {
                aVar.accept(iVar);
            }
            this.f8984d.add(aVar);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // z5.a
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f8982b;
        reentrantLock.lock();
        try {
            i b10 = g.b(this.f8981a, windowLayoutInfo);
            this.f8983c = b10;
            for (z5.a aVar : this.f8984d) {
                aVar.accept(b10);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
