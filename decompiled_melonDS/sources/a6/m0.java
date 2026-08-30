package a6;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class m0 {
    public int A;
    public int B;
    public int L;
    public Object R;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k0.g] */
    public m0() {
        if (k0.g.A == null) {
            k0.g.A = new Object();
        }
    }

    public int a(int i2) {
        if (i2 < this.L) {
            return ((ByteBuffer) this.R).getShort(this.B + i2);
        }
        return 0;
    }

    public void b() {
        if (((ac.e) this.R).f699b0 == this.L) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i2 = this.A;
            ac.e eVar = (ac.e) this.R;
            if (i2 < eVar.Y && eVar.L[i2] < 0) {
                this.A = i2 + 1;
            } else {
                return;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        b bVar;
        if (Build.VERSION.SDK_INT >= this.B) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.B) {
            tag = c(view);
        } else {
            tag = view.getTag(this.A);
            if (!((Class) this.R).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate e6 = x0.e(view);
            if (e6 == null) {
                bVar = null;
            } else if (e6 instanceof a) {
                bVar = ((a) e6).f440a;
            } else {
                bVar = new b(e6);
            }
            if (bVar == null) {
                bVar = new b();
            }
            x0.o(view, bVar);
            view.setTag(this.A, obj);
            x0.i(view, this.L);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        if (this.A < ((ac.e) this.R).Y) {
            return true;
        }
        return false;
    }

    public void remove() {
        ac.e eVar = (ac.e) this.R;
        b();
        if (this.B != -1) {
            eVar.c();
            eVar.k(this.B);
            this.B = -1;
            this.L = eVar.f699b0;
            return;
        }
        a0.j.p("Call next() before removing element from the iterator.");
    }
}
