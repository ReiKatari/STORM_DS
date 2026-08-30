package defpackage;

import android.util.Log;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qe0  reason: default package */
/* loaded from: classes.dex */
public final class qe0 {
    public final c63 a;
    public final Object b;
    public final ArrayList c;
    public final Object d;
    public final ArrayList e;
    public final Object f;
    public final ArrayList g;

    public qe0(c63 c63Var) {
        c63Var.getClass();
        this.a = c63Var;
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new Object();
        this.e = new ArrayList();
        this.f = new Object();
        this.g = new ArrayList();
    }

    public final void a(ne0 ne0Var, Runnable runnable) {
        boolean add;
        ne0Var.getClass();
        int i = oe0.a[ne0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    synchronized (this.f) {
                        add = this.g.add(runnable);
                    }
                } else {
                    i.c();
                    return;
                }
            } else {
                synchronized (this.d) {
                    add = this.e.add(runnable);
                }
            }
        } else {
            synchronized (this.b) {
                add = this.c.add(runnable);
            }
        }
        if (!add) {
            Log.e("CXCP", "CameraPipeLifetime already shut down. This is unexpected. Executing " + ne0Var + " shutdown action immediately...");
            runnable.run();
        }
    }

    public final void b() {
        int i;
        synchronized (this.b) {
            Log.d("CXCP", "Shutting down cameras...");
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((Runnable) obj).run();
            }
        }
        synchronized (this.d) {
            try {
                Log.d("CXCP", "Shutting down scopes...");
                ArrayList arrayList2 = this.e;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    ((Runnable) obj2).run();
                }
                o27 o27Var = (o27) tq5.A(mp1.A, new pe0(this, null, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f) {
            Log.d("CXCP", "Shutting down threads...");
            ArrayList arrayList3 = this.g;
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                ((Runnable) obj3).run();
            }
        }
    }
}
