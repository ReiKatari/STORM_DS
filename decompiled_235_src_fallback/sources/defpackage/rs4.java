package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs4  reason: default package */
/* loaded from: classes.dex */
public final class rs4 extends defpackage.fq6 implements android.os.Parcelable, defpackage.gm6, defpackage.pp6, defpackage.qa4 {
    public static final android.os.Parcelable.Creator<defpackage.rs4> CREATOR = null;
    public defpackage.dm6 B;

    static {
            y8 r0 = new y8
            r1 = 24
            r0.<init>(r1)
            defpackage.rs4.CREATOR = r0
            return
    }

    public rs4(float r5) {
            r4 = this;
            r4.<init>()
            vl6 r0 = defpackage.bm6.j()
            dm6 r1 = new dm6
            long r2 = r0.g()
            r1.<init>(r5, r2)
            boolean r0 = r0 instanceof defpackage.os2
            if (r0 != 0) goto L1d
            dm6 r0 = new dm6
            r2 = 1
            r0.<init>(r5, r2)
            r1.b = r0
        L1d:
            r4.B = r1
            return
    }

    @Override // defpackage.eq6
    public final defpackage.hq6 a() {
            r0 = this;
            dm6 r0 = r0.B
            return r0
    }

    @Override // defpackage.eq6
    public final defpackage.hq6 b(defpackage.hq6 r1, defpackage.hq6 r2, defpackage.hq6 r3) {
            r0 = this;
            r0 = r2
            dm6 r0 = (defpackage.dm6) r0
            dm6 r3 = (defpackage.dm6) r3
            float r0 = r0.c
            float r1 = r3.c
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le
            return r2
        Le:
            r0 = 0
            return r0
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
            dm6 r1 = (defpackage.dm6) r1
            r0.B = r1
            return
    }

    @Override // defpackage.pp6
    public final java.lang.Object getValue() {
            r0 = this;
            float r0 = r0.h()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public final float h() {
            r1 = this;
            dm6 r0 = r1.B
            hq6 r1 = defpackage.bm6.t(r0, r1)
            dm6 r1 = (defpackage.dm6) r1
            float r1 = r1.c
            return r1
    }

    public final void i(float r5) {
            r4 = this;
            dm6 r0 = r4.B
            hq6 r0 = defpackage.bm6.h(r0)
            dm6 r0 = (defpackage.dm6) r0
            float r1 = r0.c
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto Lf
            return
        Lf:
            dm6 r1 = r4.B
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            vl6 r3 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L25
            hq6 r0 = defpackage.bm6.o(r1, r4, r3, r0)     // Catch: java.lang.Throwable -> L25
            dm6 r0 = (defpackage.dm6) r0     // Catch: java.lang.Throwable -> L25
            r0.c = r5     // Catch: java.lang.Throwable -> L25
            monitor-exit(r2)
            defpackage.bm6.n(r3, r4)
            return
        L25:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
    }

    @Override // defpackage.qa4
    public final void setValue(java.lang.Object r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r0.i(r1)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            dm6 r0 = r3.B
            hq6 r0 = defpackage.bm6.h(r0)
            dm6 r0 = (defpackage.dm6) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MutableFloatState(value="
            r1.<init>(r2)
            float r0 = r0.c
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
            float r0 = r0.h()
            r1.writeFloat(r0)
            return
    }
}
