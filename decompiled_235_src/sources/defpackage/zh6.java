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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh6  reason: default package */
/* loaded from: classes.dex */
public final class zh6 implements gt7 {
    public static volatile zh6 c;
    public static final ReentrantLock d = new ReentrantLock();
    public final e82 a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public zh6(xh6 xh6Var) {
        this.a = xh6Var;
        if (xh6Var != null) {
            xh6Var.d(new s35(this));
        }
    }

    @Override // defpackage.gt7
    public final void a(b31 b31Var) {
        synchronized (d) {
            try {
                if (this.a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    yh6 yh6Var = (yh6) it.next();
                    if (yh6Var.c == b31Var) {
                        arrayList.add(yh6Var);
                    }
                }
                this.b.removeAll(arrayList);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Activity activity = ((yh6) obj).a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            if (((yh6) it2.next()).a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    e82 e82Var = this.a;
                    if (e82Var != null) {
                        ((xh6) e82Var).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gt7
    public final void b(Context context, Executor executor, b31 b31Var) {
        Activity activity;
        Object obj;
        WindowManager.LayoutParams attributes;
        kv7 kv7Var = null;
        r1 = null;
        IBinder iBinder = null;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        yt1 yt1Var = yt1.A;
        if (activity != null) {
            ReentrantLock reentrantLock = d;
            reentrantLock.lock();
            try {
                e82 e82Var = this.a;
                if (e82Var == null) {
                    b31Var.accept(new kv7(yt1Var));
                    return;
                }
                CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                boolean z = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (((yh6) it.next()).a.equals(activity)) {
                            z = true;
                            break;
                        }
                    }
                }
                yh6 yh6Var = new yh6(activity, executor, b31Var);
                copyOnWriteArrayList.add(yh6Var);
                if (!z) {
                    xh6 xh6Var = (xh6) e82Var;
                    Window window = activity.getWindow();
                    if (window != null && (attributes = window.getAttributes()) != null) {
                        iBinder = attributes.token;
                    }
                    if (iBinder != null) {
                        xh6Var.c(iBinder, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new wh6(xh6Var, activity));
                    }
                } else {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (activity.equals(((yh6) obj).a)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    yh6 yh6Var2 = (yh6) obj;
                    if (yh6Var2 != null) {
                        kv7Var = yh6Var2.d;
                    }
                    if (kv7Var != null) {
                        yh6Var.d = kv7Var;
                        yh6Var.b.execute(new q64(6, yh6Var, kv7Var));
                    }
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        b31Var.accept(new kv7(yt1Var));
    }
}
