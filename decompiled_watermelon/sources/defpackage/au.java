package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: au  reason: default package */
/* loaded from: classes.dex */
public final class au implements Iterator, f93 {
    public int A;
    public int B;
    public boolean L;
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public au(eu euVar, int i) {
        this(euVar.L);
        this.R = i;
        switch (i) {
            case 1:
                this.X = euVar;
                this(euVar.L);
                return;
            default:
                this.X = euVar;
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
                    f = ((eu) obj).f(i);
                    break;
                case 1:
                    f = ((eu) obj).i(i);
                    break;
                default:
                    f = ((hu) obj).B[i];
                    break;
            }
            this.B++;
            this.L = true;
            return f;
        }
        vd6.b();
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
                    ((eu) obj).g(i);
                    break;
                case 1:
                    ((eu) obj).g(i);
                    break;
                default:
                    ((hu) obj).b(i);
                    break;
            }
            this.A--;
            this.L = false;
            return;
        }
        i.n("Call next() before removing an element.");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public au(hu huVar) {
        this(huVar.L);
        this.R = 2;
        this.X = huVar;
    }

    public au(int i) {
        this.A = i;
    }
}
