package m8;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import b4.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import l.i0;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements k8.a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile l f9359c;

    /* renamed from: d  reason: collision with root package name */
    public static final ReentrantLock f9360d = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public final a f9361a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f9362b = new CopyOnWriteArrayList();

    public l(j jVar) {
        this.f9361a = jVar;
        if (jVar != null) {
            jVar.d(new i0(6, this));
        }
    }

    @Override // k8.a
    public final void a(z5.a aVar) {
        synchronized (f9360d) {
            try {
                if (this.f9361a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f9362b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.f9357c == aVar) {
                        arrayList.add(kVar);
                    }
                }
                this.f9362b.removeAll(arrayList);
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Activity activity = ((k) obj).f9355a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f9362b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((k) it2.next()).f9355a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    a aVar2 = this.f9361a;
                    if (aVar2 != null) {
                        ((j) aVar2).b(activity);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // k8.a
    public final void b(Context context, Executor executor, z5.a aVar) {
        Activity activity;
        Object obj;
        WindowManager.LayoutParams attributes;
        j8.i iVar = null;
        r1 = null;
        IBinder iBinder = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        q qVar = q.A;
        if (activity != null) {
            ReentrantLock reentrantLock = f9360d;
            reentrantLock.lock();
            try {
                a aVar2 = this.f9361a;
                if (aVar2 == null) {
                    aVar.accept(new j8.i(qVar));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.f9362b;
                boolean z10 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((k) it.next()).f9355a.equals(activity)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                k kVar = new k(activity, executor, aVar);
                copyOnWriteArrayList.add(kVar);
                if (!z10) {
                    j jVar = (j) aVar2;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        jVar.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new w2(jVar, activity));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (activity.equals(((k) obj).f9355a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    k kVar2 = (k) obj;
                    if (kVar2 != null) {
                        iVar = kVar2.f9358d;
                    }
                    if (iVar != null) {
                        kVar.f9358d = iVar;
                        kVar.f9356b.execute(new ad.c(18, kVar, iVar));
                    }
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        aVar.accept(new j8.i(qVar));
    }
}
