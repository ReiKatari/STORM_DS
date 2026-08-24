package defpackage;

import android.util.Log;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zg0  reason: default package */
/* loaded from: classes.dex */
public final class zg0 {
    public final rc3 a;
    public final Object b;
    public final ArrayList c;
    public final Object d;
    public final ArrayList e;
    public final Object f;
    public final ArrayList g;

    public zg0(rc3 rc3Var) {
        rc3Var.getClass();
        this.a = rc3Var;
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new Object();
        this.e = new ArrayList();
        this.f = new Object();
        this.g = new ArrayList();
    }

    public final void a(wg0 wg0Var, Runnable runnable) {
        boolean add;
        wg0Var.getClass();
        int i = xg0.a[wg0Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    synchronized (this.f) {
                        add = this.g.add(runnable);
                    }
                } else {
                    i.d();
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
            Log.e("CXCP", "CameraPipeLifetime already shut down. This is unexpected. Executing " + wg0Var + " shutdown action immediately...");
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
                jg7 jg7Var = (jg7) hv.V(vt1.A, new yg0(this, null, 1));
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
