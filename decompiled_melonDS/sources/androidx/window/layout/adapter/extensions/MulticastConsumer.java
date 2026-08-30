package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import j8.i;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import l8.g;
import z5.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class MulticastConsumer implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1701a;

    /* renamed from: c  reason: collision with root package name */
    public i f1703c;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f1702b = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f1704d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.f1701a = context;
    }

    public final void a(a aVar) {
        ReentrantLock reentrantLock = this.f1702b;
        reentrantLock.lock();
        try {
            i iVar = this.f1703c;
            if (iVar != null) {
                aVar.accept(iVar);
            }
            this.f1704d.add(aVar);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // z5.a
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.f1702b;
        reentrantLock.lock();
        try {
            i b10 = g.b(this.f1701a, windowLayoutInfo);
            this.f1703c = b10;
            for (a aVar : this.f1704d) {
                aVar.accept(b10);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
