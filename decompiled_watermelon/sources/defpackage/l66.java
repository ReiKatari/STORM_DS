package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l66  reason: default package */
/* loaded from: classes.dex */
public final class l66 implements ee7 {
    public static volatile l66 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final m32 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public l66(j66 j66Var) {
        this.a = j66Var;
        if (j66Var != null) {
            j66Var.d(new dz4(this));
        }
    }

    @Override // defpackage.ee7
    public final void a(wz0 wz0Var) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    k66 k66Var = (k66) it.next();
                    if (k66Var.c == wz0Var) {
                        arrayList.add(k66Var);
                    }
                }
                this.b.removeAll(arrayList);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Activity activity = ((k66) obj).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((k66) it2.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    m32 m32Var = this.a;
                    if (m32Var != null) {
                        ((j66) m32Var).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ee7
    public final void b(Context context, Executor executor, wz0 wz0Var) {
        Activity activity;
        Object obj;
        WindowManager.LayoutParams attributes;
        kg7 kg7Var = null;
        r1 = null;
        IBinder iBinder = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        pp1 pp1Var = pp1.A;
        if (activity != null) {
            ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                m32 m32Var = this.a;
                if (m32Var == null) {
                    wz0Var.accept(new kg7(pp1Var));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((k66) it.next()).a.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                k66 k66Var = new k66(activity, executor, wz0Var);
                copyOnWriteArrayList.add(k66Var);
                if (!z) {
                    j66 j66Var = (j66) m32Var;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        j66Var.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new i66(j66Var, activity));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (activity.equals(((k66) obj).a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    k66 k66Var2 = (k66) obj;
                    if (k66Var2 != null) {
                        kg7Var = k66Var2.d;
                    }
                    if (kg7Var != null) {
                        k66Var.d = kg7Var;
                        k66Var.b.execute(new xc4(4, k66Var, kg7Var));
                    }
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        wz0Var.accept(new kg7(pp1Var));
    }
}
