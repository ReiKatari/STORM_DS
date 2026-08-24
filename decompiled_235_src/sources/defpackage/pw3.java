package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw3  reason: default package */
/* loaded from: classes.dex */
public final class pw3 implements gx3 {
    public ArrayList A;
    public ArrayList B;
    public final boolean L;
    public final AtomicInteger R;
    public final gx3 X = ak7.W(new s63(this, 13));
    public qb0 Y;

    public pw3(ArrayList arrayList, boolean z, uj1 uj1Var) {
        this.A = arrayList;
        this.B = new ArrayList(arrayList.size());
        this.L = z;
        this.R = new AtomicInteger(arrayList.size());
        a(u24.j(), new g15(this, 14));
        if (this.A.isEmpty()) {
            this.Y.a(new ArrayList(this.B));
            return;
        }
        for (int i = 0; i < this.A.size(); i++) {
            this.B.add(null);
        }
        ArrayList arrayList2 = this.A;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            gx3 gx3Var = (gx3) arrayList2.get(i2);
            gx3Var.a(uj1Var, new is(this, i2, gx3Var));
        }
    }

    @Override // defpackage.gx3
    public final void a(Executor executor, Runnable runnable) {
        this.X.a(executor, runnable);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((gx3) obj).cancel(z);
            }
        }
        return this.X.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = this.A;
        gx3 gx3Var = this.X;
        if (arrayList != null && !gx3Var.isDone()) {
            int size = arrayList.size();
            int i = 0;
            loop0: while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                gx3 gx3Var2 = (gx3) obj;
                while (!gx3Var2.isDone()) {
                    try {
                        gx3Var2.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.L) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) gx3Var.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.X.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.X.get(j, timeUnit);
    }
}
