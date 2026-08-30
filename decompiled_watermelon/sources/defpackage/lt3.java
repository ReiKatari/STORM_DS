package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lt3  reason: default package */
/* loaded from: classes.dex */
public abstract class lt3 {
    public int A;
    public int B;
    public int L;
    public Object R;

    public lt3() {
        if (jo1.R == null) {
            jo1.R = new jo1(27);
        }
    }

    public int a(int i) {
        if (i < this.L) {
            return ((ByteBuffer) this.R).getShort(this.B + i);
        }
        return 0;
    }

    public void b() {
        if (((mt3) this.R).c0 == this.L) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.A;
            mt3 mt3Var = (mt3) this.R;
            if (i < mt3Var.Y && mt3Var.L[i] < 0) {
                this.A = i + 1;
            } else {
                return;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.B) {
            d(view, obj);
            return;
        }
        z1 z1Var = null;
        if (Build.VERSION.SDK_INT >= this.B) {
            tag = c(view);
        } else {
            tag = view.getTag(this.A);
            if (!((Class) this.R).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate e = aa7.e(view);
            if (e != null) {
                if (e instanceof y1) {
                    z1Var = ((y1) e).a;
                } else {
                    z1Var = new z1(e);
                }
            }
            if (z1Var == null) {
                z1Var = new z1();
            }
            aa7.n(view, z1Var);
            view.setTag(this.A, obj);
            aa7.i(view, this.L);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        if (this.A < ((mt3) this.R).Y) {
            return true;
        }
        return false;
    }

    public void remove() {
        mt3 mt3Var = (mt3) this.R;
        b();
        if (this.B != -1) {
            mt3Var.c();
            mt3Var.k(this.B);
            this.B = -1;
            this.L = mt3Var.c0;
            return;
        }
        i.n("Call next() before removing element from the iterator.");
    }
}
