package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vt3  reason: default package */
/* loaded from: classes.dex */
public final class vt3 implements gu3, pd0 {
    public final hu3 B;
    public final zi0 L;
    public final Object A = new Object();
    public boolean R = false;
    public qi1 X = null;

    public vt3(hu3 hu3Var, zi0 zi0Var, t16 t16Var) {
        this.B = hu3Var;
        this.L = zi0Var;
        if (hu3Var.getLifecycle().b().isAtLeast(tt3.STARTED)) {
            zi0Var.h();
        } else {
            zi0Var.v();
        }
        hu3Var.getLifecycle().a(this);
    }

    @Override // defpackage.pd0
    public final zf0 a() {
        return this.L.A.B;
    }

    public final void b(qi1 qi1Var) {
        synchronized (this.A) {
            try {
                qi1 qi1Var2 = this.X;
                if (qi1Var2 == null) {
                    this.X = qi1Var;
                } else {
                    boolean z = qi1Var.b;
                    boolean z2 = qi1Var2.b;
                    if (z) {
                        if (z2) {
                            ArrayList arrayList = new ArrayList((List) this.X.g);
                            arrayList.addAll((List) qi1Var.g);
                            this.X = new qi1(arrayList, (List) qi1Var.c);
                        } else {
                            throw new IllegalStateException("Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first");
                        }
                    } else if (!z2) {
                        this.X = qi1Var;
                        zi0 zi0Var = this.L;
                        zi0Var.B((ArrayList) zi0Var.z());
                    } else {
                        throw new IllegalStateException("Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first");
                    }
                }
                synchronized (this.L.g0) {
                }
                zi0 zi0Var2 = this.L;
                List list = (List) qi1Var.c;
                synchronized (zi0Var2.g0) {
                    zi0Var2.d0 = list;
                }
                synchronized (this.L.g0) {
                }
                zi0 zi0Var3 = this.L;
                Range range = (Range) qi1Var.d;
                synchronized (zi0Var3.g0) {
                    zi0Var3.e0 = range;
                }
                cg0 cg0Var = (cg0) a();
                cg0Var.getClass();
                il5 o = q61.o(cg0Var, qi1Var);
                ((ov2) qi1Var.i).execute(new mf(27, o, qi1Var));
                this.L.b((List) qi1Var.g, o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final hu3 d() {
        hu3 hu3Var;
        synchronized (this.A) {
            hu3Var = this.B;
        }
        return hu3Var;
    }

    public final List g() {
        List unmodifiableList;
        synchronized (this.A) {
            unmodifiableList = Collections.unmodifiableList(this.L.z());
        }
        return unmodifiableList;
    }

    @ql4(st3.ON_DESTROY)
    public void onDestroy(hu3 hu3Var) {
        synchronized (this.A) {
            zi0 zi0Var = this.L;
            zi0Var.B((ArrayList) zi0Var.z());
        }
    }

    @ql4(st3.ON_PAUSE)
    public void onPause(hu3 hu3Var) {
        this.L.A.j(false);
    }

    @ql4(st3.ON_RESUME)
    public void onResume(hu3 hu3Var) {
        this.L.A.j(true);
    }

    @ql4(st3.ON_START)
    public void onStart(hu3 hu3Var) {
        synchronized (this.A) {
            try {
                if (!this.R) {
                    this.L.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @ql4(st3.ON_STOP)
    public void onStop(hu3 hu3Var) {
        synchronized (this.A) {
            try {
                if (!this.R) {
                    this.L.v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        synchronized (this.A) {
            try {
                if (this.R) {
                    return;
                }
                onStop(this.B);
                this.R = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.A) {
            List z = this.L.z();
            this.L.B((ArrayList) z);
            ArrayList arrayList = (ArrayList) z;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                di7 di7Var = (di7) obj;
                if (di7Var.n()) {
                    synchronized (di7Var.c) {
                    }
                }
            }
            this.X = null;
        }
    }

    public final void t() {
        synchronized (this.A) {
            try {
                if (!this.R) {
                    return;
                }
                this.R = false;
                if (this.B.getLifecycle().b().isAtLeast(tt3.STARTED)) {
                    onStart(this.B);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
