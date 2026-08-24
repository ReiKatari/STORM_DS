package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dr2  reason: default package */
/* loaded from: classes.dex */
public final class dr2 implements Runnable {
    public static final ThreadLocal X = new ThreadLocal();
    public static final zh2 Y = new zh2(17);
    public long B;
    public long L;
    public final ArrayList A = new ArrayList();
    public final ArrayList R = new ArrayList();

    public static wg5 c(RecyclerView recyclerView, int i, long j) {
        int t = recyclerView.e0.t();
        for (int i2 = 0; i2 < t; i2++) {
            wg5 N = RecyclerView.N(recyclerView.e0.s(i2));
            if (N.c == i && !N.f()) {
                return null;
            }
        }
        mg5 mg5Var = recyclerView.L;
        if (j == Long.MAX_VALUE) {
            try {
                if (v87.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.V(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.U();
        wg5 o = mg5Var.o(i, j);
        if (o != null) {
            if (o.e() && !o.f()) {
                mg5Var.l(o.a);
            } else {
                mg5Var.a(o, false);
            }
        }
        recyclerView.V(false);
        Trace.endSection();
        return o;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.r0) {
            if (RecyclerView.y1 && !this.A.contains(recyclerView)) {
                i.m("attempting to post unregistered view!");
                return;
            } else if (this.B == 0) {
                this.B = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        ls0 ls0Var = recyclerView.c1;
        ls0Var.b = i;
        ls0Var.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j) {
        cr2 cr2Var;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        String str;
        cr2 cr2Var2;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i3);
            int windowVisibility = recyclerView3.getWindowVisibility();
            ls0 ls0Var = recyclerView3.c1;
            if (windowVisibility == 0) {
                ls0Var.c(recyclerView3, false);
                i2 += ls0Var.d;
            }
        }
        ArrayList arrayList2 = this.R;
        arrayList2.ensureCapacity(i2);
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                ls0 ls0Var2 = recyclerView4.c1;
                int abs = Math.abs(ls0Var2.c) + Math.abs(ls0Var2.b);
                int i6 = i;
                boolean z = i;
                while (i6 < ls0Var2.d * 2) {
                    if (i5 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        cr2Var2 = obj;
                    } else {
                        cr2Var2 = (cr2) arrayList2.get(i5);
                    }
                    int[] iArr = (int[]) ls0Var2.e;
                    int i7 = iArr[i6 + 1];
                    if (i7 <= abs) {
                        z = 1;
                    }
                    cr2Var2.a = z;
                    cr2Var2.b = abs;
                    cr2Var2.c = i7;
                    cr2Var2.d = recyclerView4;
                    cr2Var2.e = iArr[i6];
                    i5++;
                    i6 += 2;
                    z = 0;
                }
            }
            i4++;
            i = 0;
        }
        Collections.sort(arrayList2, Y);
        for (int i8 = 0; i8 < arrayList2.size() && (recyclerView = (cr2Var = (cr2) arrayList2.get(i8)).d) != null; i8++) {
            if (cr2Var.a) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j;
            }
            wg5 c = c(recyclerView, cr2Var.e, j2);
            if (c != null && c.b != null && c.e() && !c.f() && (recyclerView2 = (RecyclerView) c.b.get()) != null) {
                if (recyclerView2.C0 && recyclerView2.e0.t() != 0) {
                    mg5 mg5Var = recyclerView2.L;
                    cg5 cg5Var = recyclerView2.L0;
                    if (cg5Var != null) {
                        cg5Var.e();
                    }
                    gg5 gg5Var = recyclerView2.m0;
                    if (gg5Var != null) {
                        gg5Var.j0(mg5Var);
                        recyclerView2.m0.k0(mg5Var);
                    }
                    ((ArrayList) mg5Var.c).clear();
                    mg5Var.j();
                }
                ls0 ls0Var3 = recyclerView2.c1;
                ls0Var3.c(recyclerView2, true);
                if (ls0Var3.d != 0) {
                    if (j == Long.MAX_VALUE) {
                        str = "RV Nested Prefetch";
                    } else {
                        str = "RV Nested Prefetch forced - needed next frame";
                    }
                    try {
                        Trace.beginSection(str);
                        sg5 sg5Var = recyclerView2.d1;
                        wf5 wf5Var = recyclerView2.l0;
                        sg5Var.d = 1;
                        sg5Var.e = wf5Var.a();
                        sg5Var.g = false;
                        sg5Var.h = false;
                        sg5Var.i = false;
                        for (int i9 = 0; i9 < ls0Var3.d * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) ls0Var3.e)[i9], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            cr2Var.a = false;
            cr2Var.b = 0;
            cr2Var.c = 0;
            cr2Var.d = null;
            cr2Var.e = 0;
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
