package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o04  reason: default package */
/* loaded from: classes.dex */
public abstract class o04 {
    public int A;
    public int B;
    public int L;
    public Object R;

    /* JADX WARN: Type inference failed for: r0v2, types: [yj7, java.lang.Object] */
    public o04() {
        if (yj7.a == null) {
            yj7.a = new Object();
        }
    }

    public int a(int i) {
        if (i < this.L) {
            return ((ByteBuffer) this.R).getShort(this.B + i);
        }
        return 0;
    }

    public void b() {
        if (((p04) this.R).d0 == this.L) {
            return;
        }
        i.l();
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.A;
            p04 p04Var = (p04) this.R;
            if (i < p04Var.Y && p04Var.L[i] < 0) {
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
        b2 b2Var = null;
        if (Build.VERSION.SDK_INT >= this.B) {
            tag = c(view);
        } else {
            tag = view.getTag(this.A);
            if (!((Class) this.R).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate e = ao7.e(view);
            if (e != null) {
                if (e instanceof a2) {
                    b2Var = ((a2) e).a;
                } else {
                    b2Var = new b2(e);
                }
            }
            if (b2Var == null) {
                b2Var = new b2();
            }
            ao7.n(view, b2Var);
            view.setTag(this.A, obj);
            ao7.i(view, this.L);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        if (this.A < ((p04) this.R).Y) {
            return true;
        }
        return false;
    }

    public void remove() {
        p04 p04Var = (p04) this.R;
        b();
        if (this.B != -1) {
            p04Var.c();
            p04Var.k(this.B);
            this.B = -1;
            this.L = p04Var.d0;
            return;
        }
        i.m("Call next() before removing element from the iterator.");
    }
}
