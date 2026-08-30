package ed;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class j {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater L = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean b(j jVar, int i2) {
        while (true) {
            j c4 = c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            if (c4 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c4 = (j) obj;
                    if (!c4.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c4);
                }
            }
            if (c4 instanceof h) {
                if ((((h) c4).R & i2) == 0 && c4.b(jVar, i2)) {
                    return true;
                }
                return false;
            }
            atomicReferenceFieldUpdater.set(jVar, c4);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = A;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(c4, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(c4) != this) {
                    break;
                }
            }
            jVar.f(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        r6 = ((ed.o) r6).f4466a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
        if (r5.get(r4) == r3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ed.j c() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = ed.j.B
            java.lang.Object r1 = r0.get(r9)
            ed.j r1 = (ed.j) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = ed.j.A
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            goto L1c
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
        L1c:
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.h()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof ed.o
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            ed.o r6 = (ed.o) r6
            ed.j r6 = r6.f4466a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            ed.j r3 = (ed.j) r3
            goto Lb
        L4b:
            r6.getClass()
            r4 = r6
            ed.j r4 = (ed.j) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: ed.j.c():ed.j");
    }

    public final void f(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (A.get(this) == jVar) {
                while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                    if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                        break;
                    }
                }
                if (h()) {
                    jVar.c();
                    return;
                }
                return;
            }
            return;
        }
    }

    public final j g() {
        o oVar;
        Object obj = A.get(this);
        if (obj instanceof o) {
            oVar = (o) obj;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            return oVar.f4466a;
        }
        obj.getClass();
        return (j) obj;
    }

    public boolean h() {
        return A.get(this) instanceof o;
    }

    public String toString() {
        return new i(1, 0, zc.x.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + zc.x.n(this);
    }
}
