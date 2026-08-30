package a1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 implements List, oc.b {
    public final /* synthetic */ int A;
    public final Object B;
    public final int L;
    public int R;

    public /* synthetic */ g0(List list, int i2, int i10, int i11) {
        this.A = i11;
        this.B = list;
        this.L = i2;
        this.R = i10;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final void add(int i2, Object obj) {
        switch (this.A) {
            case 0:
                this.B.add(i2 + this.L, obj);
                this.R++;
                return;
            default:
                this.B.add(i2 + this.L, obj);
                this.R++;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final boolean addAll(int i2, Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                this.B.addAll(i2 + this.L, collection);
                this.R = collection.size() + this.R;
                if (collection.size() > 0) {
                    return true;
                }
                return false;
            default:
                this.B.addAll(i2 + this.L, collection);
                int size = collection.size();
                this.R += size;
                if (size > 0) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.A) {
            case 0:
                int i2 = this.R - 1;
                int i10 = this.L;
                if (i10 <= i2) {
                    while (true) {
                        this.B.remove(i2);
                        if (i2 != i10) {
                            i2--;
                        }
                    }
                }
                this.R = i10;
                return;
            default:
                int i11 = this.R - 1;
                int i12 = this.L;
                if (i12 <= i11) {
                    while (true) {
                        this.B.remove(i11);
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                }
                this.R = i12;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                int i2 = this.R;
                for (int i10 = this.L; i10 < i2; i10++) {
                    if (nc.k.a(this.B.get(i10), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i11 = this.R;
                for (int i12 = this.L; i12 < i11; i12++) {
                    if (nc.k.a(this.B.get(i12), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                for (Object obj : collection) {
                    if (!contains(obj)) {
                        return false;
                    }
                }
                return true;
            default:
                for (Object obj2 : collection) {
                    if (!contains(obj2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object get(int i2) {
        switch (this.A) {
            case 0:
                s0.a(i2, this);
                return this.B.get(i2 + this.L);
            default:
                p2.c.a(i2, this);
                return this.B.get(i2 + this.L);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.A) {
            case 0:
                int i2 = this.R;
                int i10 = this.L;
                for (int i11 = i10; i11 < i2; i11++) {
                    if (nc.k.a(this.B.get(i11), obj)) {
                        return i11 - i10;
                    }
                }
                return -1;
            default:
                int i12 = this.R;
                int i13 = this.L;
                for (int i14 = i13; i14 < i12; i14++) {
                    if (nc.k.a(this.B.get(i14), obj)) {
                        return i14 - i13;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                if (this.R == this.L) {
                    return true;
                }
                return false;
            default:
                if (this.R == this.L) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new e0(this, 0, 0);
            default:
                return new e0(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.A) {
            case 0:
                int i2 = this.R - 1;
                int i10 = this.L;
                if (i10 <= i2) {
                    while (!nc.k.a(this.B.get(i2), obj)) {
                        if (i2 != i10) {
                            i2--;
                        }
                    }
                    return i2 - i10;
                }
                return -1;
            default:
                int i11 = this.R - 1;
                int i12 = this.L;
                if (i12 <= i11) {
                    while (!nc.k.a(this.B.get(i11), obj)) {
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                    return i11 - i12;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.A) {
            case 0:
                return new e0(this, 0, 0);
            default:
                return new e0(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                int i2 = this.R;
                for (int i10 = this.L; i10 < i2; i10++) {
                    ?? r22 = this.B;
                    if (nc.k.a(r22.get(i10), obj)) {
                        r22.remove(i10);
                        this.R--;
                        return true;
                    }
                }
                return false;
            default:
                int i11 = this.R;
                for (int i12 = this.L; i12 < i11; i12++) {
                    ?? r23 = this.B;
                    if (nc.k.a(r23.get(i12), obj)) {
                        r23.remove(i12);
                        this.R--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                int i2 = this.R;
                for (Object obj : collection) {
                    remove(obj);
                }
                if (i2 != this.R) {
                    return true;
                }
                return false;
            default:
                int i10 = this.R;
                for (Object obj2 : collection) {
                    remove(obj2);
                }
                if (i10 != this.R) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                int i2 = this.R;
                int i10 = i2 - 1;
                int i11 = this.L;
                if (i11 <= i10) {
                    while (true) {
                        ?? r32 = this.B;
                        if (!collection.contains(r32.get(i10))) {
                            r32.remove(i10);
                            this.R--;
                        }
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                if (i2 != this.R) {
                    return true;
                }
                return false;
            default:
                int i12 = this.R;
                int i13 = i12 - 1;
                int i14 = this.L;
                if (i14 <= i13) {
                    while (true) {
                        ?? r33 = this.B;
                        if (!collection.contains(r33.get(i13))) {
                            r33.remove(i13);
                            this.R--;
                        }
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                }
                if (i12 != this.R) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object set(int i2, Object obj) {
        switch (this.A) {
            case 0:
                s0.a(i2, this);
                return this.B.set(i2 + this.L, obj);
            default:
                p2.c.a(i2, this);
                return this.B.set(i2 + this.L, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i2;
        int i10;
        switch (this.A) {
            case 0:
                i2 = this.R;
                i10 = this.L;
                break;
            default:
                i2 = this.R;
                i10 = this.L;
                break;
        }
        return i2 - i10;
    }

    @Override // java.util.List
    public final List subList(int i2, int i10) {
        switch (this.A) {
            case 0:
                s0.b(this, i2, i10);
                return new g0(this, i2, i10, 0);
            default:
                p2.c.b(this, i2, i10);
                return new g0(this, i2, i10, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                objArr.getClass();
                return nc.j.b(this, objArr);
            default:
                return nc.j.b(this, objArr);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                return nc.j.a(this);
            default:
                return nc.j.a(this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i2) {
        switch (this.A) {
            case 0:
                return new e0(this, i2, 0);
            default:
                return new e0(this, i2, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                int i2 = this.R;
                this.R = i2 + 1;
                this.B.add(i2, obj);
                return true;
            default:
                int i10 = this.R;
                this.R = i10 + 1;
                this.B.add(i10, obj);
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                this.B.addAll(this.R, collection);
                this.R = collection.size() + this.R;
                return collection.size() > 0;
            default:
                this.B.addAll(this.R, collection);
                int size = collection.size();
                this.R += size;
                return size > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object remove(int i2) {
        switch (this.A) {
            case 0:
                s0.a(i2, this);
                this.R--;
                return this.B.remove(i2 + this.L);
            default:
                p2.c.a(i2, this);
                this.R--;
                return this.B.remove(i2 + this.L);
        }
    }
}
