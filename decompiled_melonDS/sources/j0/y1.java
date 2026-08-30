package j0;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: b0  reason: collision with root package name */
    public static final Object f7327b0 = new Object();
    public final Executor A;
    public final d2.t B;
    public final AtomicReference R;
    public final AtomicBoolean L = new AtomicBoolean(true);
    public Object X = f7327b0;
    public int Y = -1;
    public boolean Z = false;

    public y1(AtomicReference atomicReference, Executor executor, d2.t tVar) {
        this.R = atomicReference;
        this.A = executor;
        this.B = tVar;
    }

    public final void a(int i2) {
        synchronized (this) {
            try {
                if (!this.L.get()) {
                    return;
                }
                if (i2 <= this.Y) {
                    return;
                }
                this.Y = i2;
                if (this.Z) {
                    return;
                }
                this.Z = true;
                try {
                    this.A.execute(this);
                } catch (Throwable unused) {
                    synchronized (this) {
                        this.Z = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.L.get()) {
                    this.Z = false;
                    return;
                }
                Object obj = this.R.get();
                int i2 = this.Y;
                while (true) {
                    if (!Objects.equals(this.X, obj)) {
                        this.X = obj;
                        boolean z10 = obj instanceof j;
                        d2.t tVar = this.B;
                        if (z10) {
                            tVar.C(null);
                        } else {
                            tVar.D(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i2 == this.Y || !this.L.get()) {
                                break;
                            }
                            obj = this.R.get();
                            i2 = this.Y;
                        } finally {
                        }
                    }
                }
                this.Z = false;
            } finally {
            }
        }
    }
}
