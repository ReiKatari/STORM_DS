package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: np3  reason: default package */
/* loaded from: classes.dex */
public final class np3 implements fq3 {
    public ArrayList A;
    public ArrayList B;
    public final boolean L;
    public final AtomicInteger R;
    public final fq3 X = ct3.k0(new ka3(9, this));
    public i90 Y;

    public np3(ArrayList arrayList, boolean z, qf1 qf1Var) {
        this.A = arrayList;
        this.B = new ArrayList(arrayList.size());
        this.L = z;
        this.R = new AtomicInteger(arrayList.size());
        a(new es4(14, this), iq2.l());
        if (this.A.isEmpty()) {
            this.Y.a(new ArrayList(this.B));
            return;
        }
        for (int i = 0; i < this.A.size(); i++) {
            this.B.add(null);
        }
        ArrayList arrayList2 = this.A;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            fq3 fq3Var = (fq3) arrayList2.get(i2);
            fq3Var.a(new vr(this, i2, fq3Var), qf1Var);
        }
    }

    @Override // defpackage.fq3
    public final void a(Runnable runnable, Executor executor) {
        this.X.a(runnable, executor);
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
                ((fq3) obj).cancel(z);
            }
        }
        return this.X.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = this.A;
        fq3 fq3Var = this.X;
        if (arrayList != null && !fq3Var.isDone()) {
            int size = arrayList.size();
            int i = 0;
            loop0: while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                fq3 fq3Var2 = (fq3) obj;
                while (!fq3Var2.isDone()) {
                    try {
                        fq3Var2.get();
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
        return (List) fq3Var.get();
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
