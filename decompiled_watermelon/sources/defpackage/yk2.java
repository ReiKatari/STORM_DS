package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yk2  reason: default package */
/* loaded from: classes.dex */
public final class yk2 implements Runnable {
    public static final ThreadLocal X = new ThreadLocal();
    public static final hd2 Y = new hd2(16);
    public long B;
    public long L;
    public final ArrayList A = new ArrayList();
    public final ArrayList R = new ArrayList();

    public static g75 c(RecyclerView recyclerView, int i, long j) {
        int q = recyclerView.d0.q();
        for (int i2 = 0; i2 < q; i2++) {
            g75 N = RecyclerView.N(recyclerView.d0.p(i2));
            if (N.c == i && !N.f()) {
                return null;
            }
        }
        w65 w65Var = recyclerView.L;
        if (j == Long.MAX_VALUE) {
            try {
                if (iw6.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.V(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.U();
        g75 o = w65Var.o(i, j);
        if (o != null) {
            if (o.e() && !o.f()) {
                w65Var.l(o.a);
            } else {
                w65Var.a(o, false);
            }
        }
        recyclerView.V(false);
        Trace.endSection();
        return o;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.q0) {
            if (RecyclerView.x1 && !this.A.contains(recyclerView)) {
                i.n("attempting to post unregistered view!");
                return;
            } else if (this.B == 0) {
                this.B = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        yp0 yp0Var = recyclerView.b1;
        yp0Var.b = i;
        yp0Var.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        xk2 xk2Var;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        String str;
        xk2 xk2Var2;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            int windowVisibility = recyclerView3.getWindowVisibility();
            yp0 yp0Var = recyclerView3.b1;
            if (windowVisibility == 0) {
                yp0Var.c(recyclerView3, false);
                i2 += yp0Var.d;
            }
        }
        ArrayList arrayList2 = this.R;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                yp0 yp0Var2 = recyclerView4.b1;
                int abs = Math.abs(yp0Var2.c) + Math.abs(yp0Var2.b);
                int i6 = i;
                boolean z = i;
                while (i6 < yp0Var2.d * 2) {
                    if (i5 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        xk2Var2 = obj;
                    } else {
                        xk2Var2 = (xk2) arrayList2.get(i5);
                    }
                    int[] iArr = (int[]) yp0Var2.e;
                    int i7 = iArr[i6 + 1];
                    if (i7 <= abs) {
                        z = 1;
                    }
                    xk2Var2.a = z;
                    xk2Var2.b = abs;
                    xk2Var2.c = i7;
                    xk2Var2.d = recyclerView4;
                    xk2Var2.e = iArr[i6];
                    i5++;
                    i6 += 2;
                    z = 0;
                }
            }
            i4++;
            i = 0;
        }
        Collections.sort(arrayList2, Y);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (xk2Var = (xk2) arrayList2.get(i8)).d) != null; i8++) {
            if (xk2Var.a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            g75 c = c(recyclerView, xk2Var.e, j2);
            if (c != null && c.b != null && c.e() && !c.f() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.B0 && recyclerView2.d0.q() != 0) {
                    w65 w65Var = recyclerView2.L;
                    m65 m65Var = recyclerView2.K0;
                    if (m65Var != null) {
                        m65Var.e();
                    }
                    q65 q65Var = recyclerView2.l0;
                    if (q65Var != null) {
                        q65Var.j0(w65Var);
                        recyclerView2.l0.k0(w65Var);
                    }
                    ((ArrayList) w65Var.c).clear();
                    w65Var.j();
                }
                yp0 yp0Var3 = recyclerView2.b1;
                yp0Var3.c(recyclerView2, true);
                if (yp0Var3.d != 0) {
                    if (j == Long.MAX_VALUE) {
                        str = "RV Nested Prefetch";
                    } else {
                        str = "RV Nested Prefetch forced - needed next frame";
                    }
                    try {
                        Trace.beginSection(str);
                        c75 c75Var = recyclerView2.c1;
                        g65 g65Var = recyclerView2.k0;
                        c75Var.d = 1;
                        c75Var.e = g65Var.a();
                        c75Var.g = false;
                        c75Var.h = false;
                        c75Var.i = false;
                        for (int i9 = 0; i9 < yp0Var3.d * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) yp0Var3.e)[i9], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            xk2Var.a = false;
            xk2Var.b = 0;
            xk2Var.c = 0;
            xk2Var.d = null;
            xk2Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.A;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.L);
                }
            }
        } finally {
            this.B = 0L;
            Trace.endSection();
        }
    }
}
