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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx4  reason: default package */
/* loaded from: classes.dex */
public final class bx4 {
    public final Object a;
    public final CopyOnWriteArrayList b;
    public List c;
    public Throwable d;
    public boolean e;
    public final le2 f;
    public final o41 g;
    public final AtomicBoolean h;
    public ap6 i;
    public final CameraManager j;

    public bx4(be5 be5Var, o41 o41Var, List list, Context context) {
        be5Var.getClass();
        this.a = new Object();
        this.b = new CopyOnWriteArrayList();
        this.d = null;
        this.e = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(nc1.J(str, null, null));
        }
        this.c = arrayList;
        this.f = be5Var;
        this.g = o41Var;
        this.h = new AtomicBoolean(false);
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        this.j = (CameraManager) systemService;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [hl5, java.lang.Object] */
    public final gx3 a() {
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = i61.class;
        try {
            hv.L(this.g, null, null, new m5(this, (Object) obj, (r41) null, 22), 3);
            obj.a = "FetchData for PipeCameraPresence0";
            return tb0Var;
        } catch (Exception e) {
            tb0Var.b(e);
            return tb0Var;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [zg5, java.lang.Object] */
    public final void b() {
        if (!this.h.compareAndSet(false, true)) {
            Log.i("PipePresenceSrc", "Monitoring is already active. Ignoring redundant start call.");
            return;
        }
        Log.i("PipePresenceSrc", "Starting to collect camera ID flow.");
        ap6 ap6Var = this.i;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        ?? obj = new Object();
        obj.A = true;
        this.i = hv.L(this.g, null, null, new a6(new wp0(1, new cf2(new b7(this.f, 11), new u12(this, (Object) obj, (r41) null, 21), 2), new m02(this, null)), null, 20), 3);
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
                w wVar = (w) it.next();
                wVar.a.execute(new v(th2, wVar, unmodifiableList, 0));
            }
        }
    }
}
