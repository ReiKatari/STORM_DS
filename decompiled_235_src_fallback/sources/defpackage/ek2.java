package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek2  reason: default package */
/* loaded from: classes.dex */
public abstract class ek2 extends defpackage.db2 {
    public final defpackage.db2 B;

    public ek2(defpackage.db2 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.db2
    public final defpackage.ai1 D(defpackage.lt4 r10) {
            r9 = this;
            r10.getClass()
            db2 r9 = r9.B
            ai1 r9 = r9.D(r10)
            if (r9 != 0) goto Ld
            r9 = 0
            return r9
        Ld:
            java.lang.Object r10 = r9.d
            r3 = r10
            lt4 r3 = (defpackage.lt4) r3
            if (r3 != 0) goto L15
            return r9
        L15:
            boolean r1 = r9.b
            boolean r2 = r9.c
            java.lang.Object r10 = r9.e
            r4 = r10
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r10 = r9.f
            r5 = r10
            java.lang.Long r5 = (java.lang.Long) r5
            java.lang.Object r10 = r9.g
            r6 = r10
            java.lang.Long r6 = (java.lang.Long) r6
            java.lang.Object r10 = r9.h
            r7 = r10
            java.lang.Long r7 = (java.lang.Long) r7
            java.lang.Object r9 = r9.i
            r8 = r9
            java.util.Map r8 = (java.util.Map) r8
            r8.getClass()
            ai1 r0 = new ai1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // defpackage.db2
    public final defpackage.wf3 F(defpackage.lt4 r1) {
            r0 = this;
            db2 r0 = r0.B
            wf3 r0 = r0.F(r1)
            return r0
    }

    @Override // defpackage.db2
    public final defpackage.in6 N(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            db2 r0 = r0.B
            in6 r0 = r0.N(r1)
            return r0
    }

    @Override // defpackage.db2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            db2 r0 = r0.B
            r0.close()
            return
    }

    @Override // defpackage.db2
    public final defpackage.ui6 e(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            db2 r0 = r0.B
            ui6 r0 = r0.e(r1)
            return r0
    }

    @Override // defpackage.db2
    public final void h(defpackage.lt4 r1, defpackage.lt4 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            db2 r0 = r0.B
            r0.h(r1, r2)
            return
    }

    @Override // defpackage.db2
    public final void n(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            db2 r0 = r0.B
            r0.n(r1)
            return
    }

    @Override // defpackage.db2
    public final void r(defpackage.lt4 r1) {
            r0 = this;
            r1.getClass()
            db2 r0 = r0.B
            r0.r(r1)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r1 = r1.c()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            db2 r2 = r2.B
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.db2
    public final java.util.List x(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            db2 r1 = r1.B
            java.util.List r1 = r1.x(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r1.next()
            lt4 r0 = (defpackage.lt4) r0
            r0.getClass()
            r2.add(r0)
            goto L12
        L25:
            defpackage.jt0.w0(r2)
            return r2
    }
}
