package m0;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l.i0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements ta.a {
    public ArrayList A;
    public ArrayList B;
    public final boolean L;
    public final AtomicInteger R;
    public final b5.l X = a.a.A(new i0(5, this));
    public b5.i Y;

    public m(ArrayList arrayList, boolean z10, l0.a aVar) {
        this.A = arrayList;
        this.B = new ArrayList(arrayList.size());
        this.L = z10;
        this.R = new AtomicInteger(arrayList.size());
        a(new ad.g(12, this), ij.a.D());
        if (this.A.isEmpty()) {
            this.Y.b(new ArrayList(this.B));
            return;
        }
        for (int i2 = 0; i2 < this.A.size(); i2++) {
            this.B.add(null);
        }
        ArrayList arrayList2 = this.A;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ta.a aVar2 = (ta.a) arrayList2.get(i10);
            aVar2.a(new l(this, i10, aVar2), aVar);
        }
    }

    @Override // ta.a
    public final void a(Runnable runnable, Executor executor) {
        this.X.B.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        ArrayList arrayList = this.A;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ta.a) obj).cancel(z10);
            }
        }
        return this.X.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = this.A;
        if (arrayList != null && !isDone()) {
            int size = arrayList.size();
            int i2 = 0;
            loop0: while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ta.a aVar = (ta.a) obj;
                while (!aVar.isDone()) {
                    try {
                        aVar.get();
                    } catch (Error e6) {
                        throw e6;
                    } catch (InterruptedException e10) {
                        throw e10;
                    } catch (Throwable unused) {
                        if (this.L) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.X.B.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.X.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.X.B.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return (List) this.X.B.get(j2, timeUnit);
    }
}
