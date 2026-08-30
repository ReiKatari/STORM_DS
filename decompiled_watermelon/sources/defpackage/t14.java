package defpackage;

import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t14  reason: default package */
/* loaded from: classes.dex */
public final class t14 implements ListIterator, f93 {
    public final /* synthetic */ int A;
    public final List B;
    public int L;

    public t14(int i, int i2, List list) {
        this.A = i2;
        switch (i2) {
            case 1:
                this.B = list;
                this.L = i;
                return;
            default:
                this.B = list;
                this.L = i - 1;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                int i2 = this.L + 1;
                this.L = i2;
                list.add(i2, obj);
                return;
            default:
                list.add(this.L, obj);
                this.L++;
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                if (this.L >= list.size() - 1) {
                    return false;
                }
                return true;
            default:
                if (this.L >= list.size()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.A) {
            case 0:
                if (this.L >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.L > 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                int i2 = this.L + 1;
                this.L = i2;
                return list.get(i2);
            default:
                int i3 = this.L;
                this.L = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.A) {
            case 0:
                return this.L + 1;
            default:
                return this.L;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                int i2 = this.L;
                this.L = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.L - 1;
                this.L = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.A) {
            case 0:
                return this.L;
            default:
                return this.L - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                list.remove(this.L);
                this.L--;
                return;
            default:
                int i2 = this.L - 1;
                this.L = i2;
                list.remove(i2);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                list.set(this.L, obj);
                return;
            default:
                list.set(this.L, obj);
                return;
        }
    }
}
