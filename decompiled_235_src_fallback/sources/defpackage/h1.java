package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h1  reason: default package */
/* loaded from: classes.dex */
public abstract class h1 extends defpackage.z0 {
    public abstract defpackage.h1 b(int r1, java.lang.Object r2);

    public abstract defpackage.h1 c(java.lang.Object r1);

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean containsAll(java.util.Collection r3) {
            r2 = this;
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 1
            if (r0 == 0) goto L11
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L15
            r2 = 0
            return r2
        L27:
            return r1
    }

    public defpackage.h1 d(java.util.Collection r1) {
            r0 = this;
            jw4 r0 = r0.f()
            r0.addAll(r1)
            h1 r0 = r0.c()
            return r0
    }

    public abstract defpackage.jw4 f();

    public abstract defpackage.h1 g(defpackage.g1 r1);

    public abstract defpackage.h1 h(int r1);

    public abstract defpackage.h1 i(int r1, java.lang.Object r2);

    @Override // defpackage.z0, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // defpackage.z0, java.util.List
    public final java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            java.util.ListIterator r1 = r1.listIterator(r0)
            return r1
    }

    @Override // defpackage.z0, java.util.List
    public final java.util.List subList(int r2, int r3) {
            r1 = this;
            r33 r0 = new r33
            r0.<init>(r1, r2, r3)
            return r0
    }
}
