package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v14  reason: default package */
/* loaded from: classes.dex */
public final class v14 implements List, g93 {
    public final /* synthetic */ int A;
    public final List B;
    public final int L;
    public int R;

    public /* synthetic */ v14(List list, int i, int i2, int i3) {
        this.A = i3;
        this.B = list;
        this.L = i;
        this.R = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.A;
        int i3 = this.L;
        List list = this.B;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.R++;
                return;
            default:
                list.add(i + i3, obj);
                this.R++;
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.A;
        int i3 = this.L;
        List list = this.B;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.R = collection.size() + this.R;
                if (collection.size() <= 0) {
                    return false;
                }
                return true;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.R += size;
                if (size <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.A;
        List list = this.B;
        int i2 = this.L;
        switch (i) {
            case 0:
                int i3 = this.R - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.R = i2;
                return;
            default:
                int i4 = this.R - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.R = i2;
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.A;
        List list = this.B;
        int i2 = this.L;
        switch (i) {
            case 0:
                int i3 = this.R;
                while (i2 < i3) {
                    if (b53.x(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.R;
                while (i2 < i4) {
                    if (b53.x(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
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

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.A;
        int i3 = this.L;
        List list = this.B;
        switch (i2) {
            case 0:
                b94.a(i, this);
                return list.get(i + i3);
            default:
                p24.a(i, this);
                return list.get(i + i3);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.A;
        List list = this.B;
        int i2 = this.L;
        switch (i) {
            case 0:
                int i3 = this.R;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (b53.x(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.R;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (b53.x(list.get(i6), obj)) {
                        return i6 - i2;
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
                return new t14(0, 0, this);
            default:
                return new t14(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.A;
        List list = this.B;
        int i2 = this.L;
        switch (i) {
            case 0:
                int i3 = this.R - 1;
                if (i2 > i3) {
                    return -1;
                }
                while (!b53.x(list.get(i3), obj)) {
                    if (i3 == i2) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i2;
            default:
                int i4 = this.R - 1;
                if (i2 > i4) {
                    return -1;
                }
                while (!b53.x(list.get(i4), obj)) {
                    if (i4 == i2) {
                        return -1;
                    }
                    i4--;
                }
                return i4 - i2;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.A) {
            case 0:
                return new t14(0, 0, this);
            default:
                return new t14(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.A;
        int i2 = this.L;
        List list = this.B;
        switch (i) {
            case 0:
                int i3 = this.R;
                while (i2 < i3) {
                    if (b53.x(list.get(i2), obj)) {
                        list.remove(i2);
                        this.R--;
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.R;
                while (i2 < i4) {
                    if (b53.x(list.get(i2), obj)) {
                        list.remove(i2);
                        this.R--;
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                collection.getClass();
                int i = this.R;
                for (Object obj : collection) {
                    remove(obj);
                }
                if (i == this.R) {
                    return false;
                }
                return true;
            default:
                int i2 = this.R;
                for (Object obj2 : collection) {
                    remove(obj2);
                }
                if (i2 == this.R) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.A;
        int i2 = this.L;
        List list = this.B;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.R;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.R--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                if (i3 == this.R) {
                    return false;
                }
                return true;
            default:
                int i5 = this.R;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.R--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                if (i5 == this.R) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.A;
        int i3 = this.L;
        List list = this.B;
        switch (i2) {
            case 0:
                b94.a(i, this);
                return list.set(i + i3, obj);
            default:
                p24.a(i, this);
                return list.set(i + i3, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.A) {
            case 0:
                i = this.R;
                i2 = this.L;
                break;
            default:
                i = this.R;
                i2 = this.L;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.A) {
            case 0:
                b94.b(i, i2, this);
                return new v14(this, i, i2, 0);
            default:
                p24.b(i, i2, this);
                return new v14(this, i, i2, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                objArr.getClass();
                return b53.i0(this, objArr);
            default:
                return b53.i0(this, objArr);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                return b53.h0(this);
            default:
                return b53.h0(this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.A) {
            case 0:
                return new t14(i, 0, this);
            default:
                return new t14(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                int i2 = this.R;
                this.R = i2 + 1;
                list.add(i2, obj);
                return true;
            default:
                int i3 = this.R;
                this.R = i3 + 1;
                list.add(i3, obj);
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.A;
        List list = this.B;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.R, collection);
                this.R = collection.size() + this.R;
                return collection.size() > 0;
            default:
                list.addAll(this.R, collection);
                int size = collection.size();
                this.R += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.A;
        int i3 = this.L;
        List list = this.B;
        switch (i2) {
            case 0:
                b94.a(i, this);
                this.R--;
                return list.remove(i + i3);
            default:
                p24.a(i, this);
                this.R--;
                return list.remove(i + i3);
        }
    }
}
