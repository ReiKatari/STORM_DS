package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f17  reason: default package */
/* loaded from: classes.dex */
public final class f17 implements Collection, f93 {
    public final byte[] A;

    public /* synthetic */ f17(byte[] bArr) {
        this.A = bArr;
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof e17)) {
            return false;
        }
        byte b = ((e17) obj).A;
        byte[] bArr = this.A;
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (b == bArr[i]) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
        continue;
     */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsAll(java.util.Collection r7) {
        /*
            r6 = this;
            r7.getClass()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            goto L39
        Lf:
            java.util.Iterator r7 = r7.iterator()
        L13:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r7.next()
            boolean r1 = r0 instanceof defpackage.e17
            r2 = 0
            if (r1 == 0) goto L38
            e17 r0 = (defpackage.e17) r0
            byte r0 = r0.A
            byte[] r1 = r6.A
            int r3 = r1.length
            r4 = r2
        L2a:
            if (r4 >= r3) goto L34
            r5 = r1[r4]
            if (r0 != r5) goto L31
            goto L35
        L31:
            int r4 = r4 + 1
            goto L2a
        L34:
            r4 = -1
        L35:
            if (r4 < 0) goto L38
            goto L13
        L38:
            return r2
        L39:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f17.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof f17) {
            if (!this.A.equals(((f17) obj).A)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.A.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new v0(6, this.A);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.A.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return b53.i0(this, objArr);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.A) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return b53.h0(this);
    }
}
