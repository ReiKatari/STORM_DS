package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su  reason: default package */
/* loaded from: classes.dex */
public final class su implements Iterator, zf3 {
    public int A;
    public int B;
    public boolean L;
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public su(wu wuVar, int i) {
        this(wuVar.L);
        this.R = i;
        switch (i) {
            case 1:
                this.X = wuVar;
                this(wuVar.L);
                return;
            default:
                this.X = wuVar;
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.B < this.A) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f;
        if (hasNext()) {
            int i = this.B;
            int i2 = this.R;
            Object obj = this.X;
            switch (i2) {
                case 0:
                    f = ((wu) obj).f(i);
                    break;
                case 1:
                    f = ((wu) obj).i(i);
                    break;
                default:
                    f = ((zu) obj).B[i];
                    break;
            }
            this.B++;
            this.L = true;
            return f;
        }
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.L) {
            int i = this.B - 1;
            this.B = i;
            int i2 = this.R;
            Object obj = this.X;
            switch (i2) {
                case 0:
                    ((wu) obj).g(i);
                    break;
                case 1:
                    ((wu) obj).g(i);
                    break;
                default:
                    ((zu) obj).a(i);
                    break;
            }
            this.A--;
            this.L = false;
            return;
        }
        i.m("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public su(zu zuVar) {
        this(zuVar.L);
        this.R = 2;
        this.X = zuVar;
    }

    public su(int i) {
        this.A = i;
    }
}
