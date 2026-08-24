package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oc4  reason: default package */
/* loaded from: classes.dex */
public final class oc4 implements Iterator, zf3 {
    public int A = -1;
    public boolean B;
    public final /* synthetic */ dk0 L;

    public oc4(dk0 dk0Var) {
        this.L = dk0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A + 1 < ((un6) this.L.X).f()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.B = true;
            int i = this.A + 1;
            this.A = i;
            return (ic4) ((un6) this.L.X).g(i);
        }
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.B) {
            un6 un6Var = (un6) this.L.X;
            ((ic4) un6Var.g(this.A)).L = null;
            int i = this.A;
            Object[] objArr = un6Var.L;
            Object obj = objArr[i];
            Object obj2 = vy7.d0;
            if (obj != obj2) {
                objArr[i] = obj2;
                un6Var.A = true;
            }
            this.A = i - 1;
            this.B = false;
            return;
        }
        i.m("You must call next() before you can remove an element");
    }
}
