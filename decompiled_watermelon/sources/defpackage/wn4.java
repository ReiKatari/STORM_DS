package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wn4  reason: default package */
/* loaded from: classes.dex */
public final class wn4 {
    public final Object a;
    public final CopyOnWriteArrayList b;
    public List c;
    public Throwable d;
    public boolean e;
    public final u92 f;
    public final g11 g;
    public final AtomicBoolean h;
    public kd6 i;
    public final CameraManager j;

    public wn4(o45 o45Var, g11 g11Var, List list, Context context) {
        o45Var.getClass();
        this.a = new Object();
        this.b = new CopyOnWriteArrayList();
        this.d = null;
        this.e = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(dk7.p(str, null, null));
        }
        this.c = arrayList;
        this.f = o45Var;
        this.g = g11Var;
        this.h = new AtomicBoolean(false);
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        this.j = (CameraManager) systemService;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [pb5, java.lang.Object] */
    public final fq3 a() {
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = b31.class;
        try {
            tq5.w(this.g, null, null, new n5(this, (Object) obj, (j11) null, 19), 3);
            obj.a = "FetchData for PipeCameraPresence0";
            return l90Var;
        } catch (Exception e) {
            l90Var.b(e);
            return l90Var;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [j75, java.lang.Object] */
    public final void b() {
        if (!this.h.compareAndSet(false, true)) {
            Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
        kd6 kd6Var = this.i;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        ?? obj = new Object();
        obj.A = true;
        this.i = tq5.w(this.g, null, null, new a6(new ln0(1, new la2(new a7(this.f, 11), new wx1(this, obj, null, 17), 2), new bw1(this, null)), null, 19), 3);
    }

    public final void c(List list, Throwable th) {
        boolean z;
        boolean z2;
        boolean z3;
        List unmodifiableList;
        Throwable th2;
        synchronized (this.a) {
            z = true;
            try {
                if (th != null) {
                    if (this.d != null && this.c.isEmpty()) {
                        z3 = false;
                        this.d = th;
                        this.c = Collections.EMPTY_LIST;
                    }
                    z3 = true;
                    this.d = th;
                    this.c = Collections.EMPTY_LIST;
                } else {
                    list.getClass();
                    if (this.d == null && this.c.equals(list)) {
                        z2 = false;
                        this.d = null;
                        this.c = list;
                        z3 = z2;
                    }
                    z2 = true;
                    this.d = null;
                    this.c = list;
                    z3 = z2;
                }
                unmodifiableList = Collections.unmodifiableList(this.c);
                th2 = this.d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z3) {
            StringBuilder sb = new StringBuilder("Data changed. Notifying ");
            sb.append(this.b.size());
            sb.append(" observers. Error: ");
            if (th2 == null) {
                z = false;
            }
            sb.append(z);
            Log.d("CameraPresenceSrc", sb.toString());
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                v vVar = (v) it.next();
                vVar.a.execute(new u(th2, vVar, unmodifiableList, 0));
            }
        }
    }
}
