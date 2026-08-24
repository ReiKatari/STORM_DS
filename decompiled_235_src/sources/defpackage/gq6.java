package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq6  reason: default package */
/* loaded from: classes.dex */
public final class gq6 implements Runnable {
    public static final Object d0 = new Object();
    public final Executor A;
    public final bi4 B;
    public final AtomicReference R;
    public final AtomicBoolean L = new AtomicBoolean(true);
    public Object X = d0;
    public int Y = -1;
    public boolean Z = false;

    public gq6(AtomicReference atomicReference, Executor executor, bi4 bi4Var) {
        this.R = atomicReference;
        this.A = executor;
        this.B = bi4Var;
    }

    public final void a(int i) {
        synchronized (this) {
            try {
                if (!this.L.get()) {
                    return;
                }
                if (i <= this.Y) {
                    return;
                }
                this.Y = i;
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
            } catch (Throwable th) {
                throw th;
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
                int i = this.Y;
                while (true) {
                    if (!Objects.equals(this.X, obj)) {
                        this.X = obj;
                        boolean z = obj instanceof xy;
                        bi4 bi4Var = this.B;
                        if (z) {
                            bi4Var.onError(null);
                        } else {
                            bi4Var.u(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i == this.Y || !this.L.get()) {
                                break;
                            }
                            obj = this.R.get();
                            i = this.Y;
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
