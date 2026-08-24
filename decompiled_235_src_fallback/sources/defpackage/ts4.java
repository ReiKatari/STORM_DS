package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ts4  reason: default package */
/* loaded from: classes.dex */
public final class ts4 extends defpackage.fq6 implements android.os.Parcelable, defpackage.gm6, defpackage.pp6, defpackage.qa4 {
    public static final android.os.Parcelable.Creator<defpackage.ts4> CREATOR = null;
    public defpackage.fm6 B;

    static {
            y8 r0 = new y8
            r1 = 26
            r0.<init>(r1)
            defpackage.ts4.CREATOR = r0
            return
    }

    public ts4(long r5) {
            r4 = this;
            r4.<init>()
            vl6 r0 = defpackage.bm6.j()
            fm6 r1 = new fm6
            long r2 = r0.g()
            r1.<init>(r2, r5)
            boolean r0 = r0 instanceof defpackage.os2
            if (r0 != 0) goto L1d
            fm6 r0 = new fm6
            r2 = 1
            r0.<init>(r2, r5)
            r1.b = r0
        L1d:
            r4.B = r1
            return
    }

    @Override // defpackage.eq6
    public final defpackage.hq6 a() {
            r0 = this;
            fm6 r0 = r0.B
            return r0
    }

    @Override // defpackage.eq6
    public final defpackage.hq6 b(defpackage.hq6 r3, defpackage.hq6 r4, defpackage.hq6 r5) {
            r2 = this;
            r2 = r4
            fm6 r2 = (defpackage.fm6) r2
            fm6 r5 = (defpackage.fm6) r5
            long r2 = r2.c
            long r0 = r5.c
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto Le
            return r4
        Le:
            r2 = 0
            return r2
    }

    @Override // defpackage.gm6
    public final defpackage.im6 d() {
            r0 = this;
            xd5 r0 = defpackage.xd5.s0
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
            fm6 r1 = (defpackage.fm6) r1
            r0.B = r1
            return
    }

    @Override // defpackage.pp6
    public final java.lang.Object getValue() {
            r2 = this;
            long r0 = r2.h()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
    }

    public final long h() {
            r2 = this;
            fm6 r0 = r2.B
            hq6 r2 = defpackage.bm6.t(r0, r2)
            fm6 r2 = (defpackage.fm6) r2
            long r0 = r2.c
            return r0
    }

    public final void i(long r5) {
            r4 = this;
            fm6 r0 = r4.B
            hq6 r0 = defpackage.bm6.h(r0)
            fm6 r0 = (defpackage.fm6) r0
            long r1 = r0.c
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L27
            fm6 r1 = r4.B
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            vl6 r3 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L24
            hq6 r0 = defpackage.bm6.o(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L24
            fm6 r0 = (defpackage.fm6) r0     // Catch: java.lang.Throwable -> L24
            r0.c = r5     // Catch: java.lang.Throwable -> L24
            monitor-exit(r2)
            defpackage.bm6.n(r3, r4)
            return
        L24:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L27:
            return
    }

    @Override // defpackage.qa4
    public final void setValue(java.lang.Object r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            r2.i(r0)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            fm6 r0 = r4.B
            hq6 r0 = defpackage.bm6.h(r0)
            fm6 r0 = (defpackage.fm6) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MutableLongState(value="
            r1.<init>(r2)
            long r2 = r0.c
            r1.append(r2)
            java.lang.String r0 = ")@"
            r1.append(r0)
            int r4 = r4.hashCode()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.h()
            r3.writeLong(r0)
            return
    }
}
