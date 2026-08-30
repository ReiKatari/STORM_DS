package j7;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import c1.h2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements Runnable {
    public static final ThreadLocal X = new ThreadLocal();
    public static final ah.b0 Y = new ah.b0(6);
    public long B;
    public long L;
    public final ArrayList A = new ArrayList();
    public final ArrayList R = new ArrayList();

    public static j1 c(RecyclerView recyclerView, int i2, long j2) {
        int o5 = recyclerView.f1624c0.o();
        for (int i10 = 0; i10 < o5; i10++) {
            j1 M = RecyclerView.M(recyclerView.f1624c0.n(i10));
            if (M.f7596c == i2 && !M.f()) {
                return null;
            }
        }
        h2 h2Var = recyclerView.L;
        if (j2 == Long.MAX_VALUE) {
            try {
                if (u5.e.a()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th2) {
                recyclerView.V(false);
                Trace.endSection();
                throw th2;
            }
        }
        recyclerView.U();
        j1 o8 = h2Var.o(i2, j2);
        if (o8 != null) {
            if (o8.e() && !o8.f()) {
                h2Var.l(o8.f7594a);
            } else {
                h2Var.a(o8, false);
            }
        }
        recyclerView.V(false);
        Trace.endSection();
        return o8;
    }

    public final void a(RecyclerView recyclerView, int i2, int i10) {
        if (recyclerView.p0) {
            if (RecyclerView.f1616v1 && !this.A.contains(recyclerView)) {
                a0.j.p("attempting to post unregistered view!");
                return;
            } else if (this.B == 0) {
                this.B = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        f2.s sVar = recyclerView.Z0;
        sVar.f4789b = i2;
        sVar.f4790c = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(long j2) {
        u uVar;
        RecyclerView recyclerView;
        long j10;
        RecyclerView recyclerView2;
        String str;
        u uVar2;
        boolean z10;
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        int i2 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i11);
            int windowVisibility = recyclerView3.getWindowVisibility();
            f2.s sVar = recyclerView3.Z0;
            if (windowVisibility == 0) {
                sVar.c(recyclerView3, false);
                i10 += sVar.f4791d;
            }
        }
        ArrayList arrayList2 = this.R;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i12);
            if (recyclerView4.getWindowVisibility() == 0) {
                f2.s sVar2 = recyclerView4.Z0;
                int abs = Math.abs(sVar2.f4790c) + Math.abs(sVar2.f4789b);
                for (int i14 = i2; i14 < sVar2.f4791d * 2; i14 += 2) {
                    if (i13 >= arrayList2.size()) {
                        Object obj = new Object();
                        arrayList2.add(obj);
                        uVar2 = obj;
                    } else {
                        uVar2 = (u) arrayList2.get(i13);
                    }
                    int[] iArr = (int[]) sVar2.f4792e;
                    int i15 = iArr[i14 + 1];
                    if (i15 <= abs) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    uVar2.f7703a = z10;
                    uVar2.f7704b = abs;
                    uVar2.f7705c = i15;
                    uVar2.f7706d = recyclerView4;
                    uVar2.f7707e = iArr[i14];
                    i13++;
                }
            }
            i12++;
            i2 = 0;
        }
        Collections.sort(arrayList2, Y);
        for (int i16 = 0; i16 < arrayList2.size() && (recyclerView = (uVar = (u) arrayList2.get(i16)).f7706d) != null; i16++) {
            if (uVar.f7703a) {
                j10 = Long.MAX_VALUE;
            } else {
                j10 = j2;
            }
            j1 c4 = c(recyclerView, uVar.f7707e, j10);
            if (c4 != null && c4.f7595b != null && c4.e() && !c4.f() && (recyclerView2 = (RecyclerView) c4.f7595b.get()) != null) {
                if (recyclerView2.f1665z0 && recyclerView2.f1624c0.o() != 0) {
                    h2 h2Var = recyclerView2.L;
                    q0 q0Var = recyclerView2.I0;
                    if (q0Var != null) {
                        q0Var.e();
                    }
                    u0 u0Var = recyclerView2.f1640k0;
                    if (u0Var != null) {
                        u0Var.j0(h2Var);
                        recyclerView2.f1640k0.k0(h2Var);
                    }
                    ((ArrayList) h2Var.f2431c).clear();
                    h2Var.j();
                }
                f2.s sVar3 = recyclerView2.Z0;
                sVar3.c(recyclerView2, true);
                if (sVar3.f4791d != 0) {
                    if (j2 == Long.MAX_VALUE) {
                        str = "RV Nested Prefetch";
                    } else {
                        str = "RV Nested Prefetch forced - needed next frame";
                    }
                    try {
                        Trace.beginSection(str);
                        f1 f1Var = recyclerView2.f1621a1;
                        k0 k0Var = recyclerView2.f1638j0;
                        f1Var.f7553d = 1;
                        f1Var.f7554e = k0Var.a();
                        f1Var.f7556g = false;
                        f1Var.f7557h = false;
                        f1Var.f7558i = false;
                        for (int i17 = 0; i17 < sVar3.f4791d * 2; i17 += 2) {
                            c(recyclerView2, ((int[]) sVar3.f4792e)[i17], j2);
                        }
                        Trace.endSection();
                        uVar.f7703a = false;
                        uVar.f7704b = 0;
                        uVar.f7705c = 0;
                        uVar.f7706d = null;
                        uVar.f7707e = 0;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            uVar.f7703a = false;
            uVar.f7704b = 0;
            uVar.f7705c = 0;
            uVar.f7706d = null;
            uVar.f7707e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.A;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j2 = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j2) + this.L);
                }
            }
        } finally {
            this.B = 0L;
            Trace.endSection();
        }
    }
}
