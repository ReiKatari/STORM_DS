package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vs4  reason: default package */
/* loaded from: classes.dex */
public final class vs4 extends defpackage.fq6 implements android.os.Parcelable, defpackage.gm6 {
    public static final android.os.Parcelable.Creator<defpackage.vs4> CREATOR = null;
    public final defpackage.im6 B;
    public defpackage.hm6 L;

    static {
            us4 r0 = new us4
            r1 = 0
            r0.<init>(r1)
            defpackage.vs4.CREATOR = r0
            return
    }

    public vs4(java.lang.Object r4, defpackage.im6 r5) {
            r3 = this;
            r3.<init>()
            r3.B = r5
            vl6 r5 = defpackage.bm6.j()
            hm6 r0 = new hm6
            long r1 = r5.g()
            r0.<init>(r1, r4)
            boolean r5 = r5 instanceof defpackage.os2
            if (r5 != 0) goto L1f
            hm6 r5 = new hm6
            r1 = 1
            r5.<init>(r1, r4)
            r0.b = r5
        L1f:
            r3.L = r0
            return
    }

    @Override // defpackage.eq6
    public final defpackage.hq6 a() {
            r0 = this;
            hm6 r0 = r0.L
            return r0
    }

    @Override // defpackage.eq6
    public final defpackage.hq6 b(defpackage.hq6 r1, defpackage.hq6 r2, defpackage.hq6 r3) {
            r0 = this;
            hm6 r1 = (defpackage.hm6) r1
            r1 = r2
            hm6 r1 = (defpackage.hm6) r1
            hm6 r3 = (defpackage.hm6) r3
            java.lang.Object r1 = r1.c
            java.lang.Object r3 = r3.c
            im6 r0 = r0.B
            boolean r0 = r0.i(r1, r3)
            if (r0 == 0) goto L14
            return r2
        L14:
            r0 = 0
            return r0
    }

    @Override // defpackage.gm6
    public final defpackage.im6 d() {
            r0 = this;
            im6 r0 = r0.B
            return r0
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.eq6
    public final void f(defpackage.hq6 r1) {
            r0 = this;
            r1.getClass()
            hm6 r1 = (defpackage.hm6) r1
            r0.L = r1
            return
    }

    @Override // defpackage.pp6
    public final java.lang.Object getValue() {
            r1 = this;
            hm6 r0 = r1.L
            hq6 r1 = defpackage.bm6.t(r0, r1)
            hm6 r1 = (defpackage.hm6) r1
            java.lang.Object r1 = r1.c
            return r1
    }

    @Override // defpackage.qa4
    public final void setValue(java.lang.Object r5) {
            r4 = this;
            hm6 r0 = r4.L
            hq6 r0 = defpackage.bm6.h(r0)
            hm6 r0 = (defpackage.hm6) r0
            im6 r1 = r4.B
            java.lang.Object r2 = r0.c
            boolean r1 = r1.i(r2, r5)
            if (r1 != 0) goto L2b
            hm6 r1 = r4.L
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            vl6 r3 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L28
            hq6 r0 = defpackage.bm6.o(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L28
            hm6 r0 = (defpackage.hm6) r0     // Catch: java.lang.Throwable -> L28
            r0.c = r5     // Catch: java.lang.Throwable -> L28
            monitor-exit(r2)
            defpackage.bm6.n(r3, r4)
            return
        L28:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L2b:
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            hm6 r0 = r3.L
            hq6 r0 = defpackage.bm6.h(r0)
            hm6 r0 = (defpackage.hm6) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MutableState(value="
            r1.<init>(r2)
            java.lang.Object r0 = r0.c
            r1.append(r0)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r3 = r3.hashCode()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.Object r2 = r0.getValue()
            r1.writeValue(r2)
            vs0 r2 = defpackage.vs0.j0
            im6 r0 = r0.B
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 == 0) goto L13
            r0 = 0
            goto L26
        L13:
            xd5 r2 = defpackage.xd5.s0
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 == 0) goto L1d
            r0 = 1
            goto L26
        L1d:
            vs0 r2 = defpackage.vs0.s0
            boolean r0 = defpackage.nb3.k(r0, r2)
            if (r0 == 0) goto L2a
            r0 = 2
        L26:
            r1.writeInt(r0)
            return
        L2a:
            java.lang.String r0 = "Only known types of MutableState's SnapshotMutationPolicy are supported"
            defpackage.i.m(r0)
            return
    }
}
