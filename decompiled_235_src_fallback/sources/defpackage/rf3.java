package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rf3  reason: default package */
/* loaded from: classes.dex */
public final class rf3 extends defpackage.hf3 {
    public static final defpackage.nf3 q0 = null;
    public static final java.lang.Object r0 = null;
    public java.lang.Object[] m0;
    public int n0;
    public java.lang.String[] o0;
    public int[] p0;

    static {
            nf3 r0 = new nf3
            r0.<init>()
            defpackage.rf3.q0 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.rf3.r0 = r0
            return
    }

    public final java.lang.String A0() {
            r1 = this;
            r0 = 0
            java.lang.String r1 = r1.z0(r0)
            java.lang.String r0 = " at path "
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    public final java.lang.String B0(boolean r5) {
            r4 = this;
            jf3 r0 = defpackage.jf3.NAME
            r4.y0(r0)
            java.lang.Object r0 = r4.C0()
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String[] r2 = r4.o0
            int r3 = r4.n0
            int r3 = r3 + (-1)
            if (r5 == 0) goto L22
            java.lang.String r5 = "<skipped>"
            goto L23
        L22:
            r5 = r1
        L23:
            r2[r3] = r5
            java.lang.Object r5 = r0.getValue()
            r4.E0(r5)
            return r1
    }

    public final java.lang.Object C0() {
            r1 = this;
            java.lang.Object[] r0 = r1.m0
            int r1 = r1.n0
            int r1 = r1 + (-1)
            r1 = r0[r1]
            return r1
    }

    @Override // defpackage.hf3
    public final java.lang.String D() {
            r1 = this;
            r0 = 1
            java.lang.String r1 = r1.z0(r0)
            return r1
    }

    public final java.lang.Object D0() {
            r3 = this;
            java.lang.Object[] r0 = r3.m0
            int r1 = r3.n0
            int r1 = r1 + (-1)
            r3.n0 = r1
            r3 = r0[r1]
            r2 = 0
            r0[r1] = r2
            return r3
    }

    public final void E0(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.n0
            java.lang.Object[] r1 = r3.m0
            int r2 = r1.length
            if (r0 != r2) goto L21
            int r0 = r0 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.m0 = r1
            int[] r1 = r3.p0
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.p0 = r1
            java.lang.String[] r1 = r3.o0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.o0 = r0
        L21:
            java.lang.Object[] r0 = r3.m0
            int r1 = r3.n0
            int r2 = r1 + 1
            r3.n0 = r2
            r0[r1] = r4
            return
    }

    @Override // defpackage.hf3
    public final boolean F() {
            r1 = this;
            jf3 r1 = r1.n0()
            jf3 r0 = defpackage.jf3.END_OBJECT
            if (r1 == r0) goto L12
            jf3 r0 = defpackage.jf3.END_ARRAY
            if (r1 == r0) goto L12
            jf3 r0 = defpackage.jf3.END_DOCUMENT
            if (r1 == r0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    @Override // defpackage.hf3
    public final boolean U() {
            r3 = this;
            jf3 r0 = defpackage.jf3.BOOLEAN
            r3.y0(r0)
            java.lang.Object r0 = r3.D0()
            ef3 r0 = (defpackage.ef3) r0
            java.io.Serializable r1 = r0.A
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            goto L20
        L18:
            java.lang.String r0 = r0.c()
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
        L20:
            int r1 = r3.n0
            if (r1 <= 0) goto L2e
            int[] r3 = r3.p0
            int r1 = r1 + (-1)
            r2 = r3[r1]
            int r2 = r2 + 1
            r3[r1] = r2
        L2e:
            return r0
    }

    @Override // defpackage.hf3
    public final double X() {
            r4 = this;
            jf3 r0 = r4.n0()
            jf3 r1 = defpackage.jf3.NUMBER
            if (r0 == r1) goto L29
            jf3 r2 = defpackage.jf3.STRING
            if (r0 != r2) goto Ld
            goto L29
        Ld:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " but was "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r4.A0()
            defpackage.u34.r(r2, r4)
            r0 = 0
            return r0
        L29:
            java.lang.Object r0 = r4.C0()
            ef3 r0 = (defpackage.ef3) r0
            double r0 = r0.f()
            ls6 r2 = r4.B
            ls6 r3 = defpackage.ls6.LENIENT
            if (r2 != r3) goto L3a
            goto L46
        L3a:
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L58
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 != 0) goto L58
        L46:
            r4.D0()
            int r2 = r4.n0
            if (r2 <= 0) goto L57
            int[] r4 = r4.p0
            int r2 = r2 + (-1)
            r3 = r4[r2]
            int r3 = r3 + 1
            r4[r2] = r3
        L57:
            return r0
        L58:
            i04 r4 = new i04
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "JSON forbids NaN and infinities: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // defpackage.hf3
    public final int Z() {
            r4 = this;
            jf3 r0 = r4.n0()
            jf3 r1 = defpackage.jf3.NUMBER
            if (r0 == r1) goto L28
            jf3 r2 = defpackage.jf3.STRING
            if (r0 != r2) goto Ld
            goto L28
        Ld:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " but was "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r4.A0()
            defpackage.u34.r(r2, r4)
            r4 = 0
            return r4
        L28:
            java.lang.Object r0 = r4.C0()
            ef3 r0 = (defpackage.ef3) r0
            int r0 = r0.a()
            r4.D0()
            int r1 = r4.n0
            if (r1 <= 0) goto L43
            int[] r4 = r4.p0
            int r1 = r1 + (-1)
            r2 = r4[r1]
            int r2 = r2 + 1
            r4[r1] = r2
        L43:
            return r0
    }

    @Override // defpackage.hf3
    public final long a0() {
            r4 = this;
            jf3 r0 = r4.n0()
            jf3 r1 = defpackage.jf3.NUMBER
            if (r0 == r1) goto L29
            jf3 r2 = defpackage.jf3.STRING
            if (r0 != r2) goto Ld
            goto L29
        Ld:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " but was "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r4.A0()
            defpackage.u34.r(r2, r4)
            r0 = 0
            return r0
        L29:
            java.lang.Object r0 = r4.C0()
            ef3 r0 = (defpackage.ef3) r0
            java.io.Serializable r1 = r0.A
            boolean r1 = r1 instanceof java.lang.Number
            if (r1 == 0) goto L3e
            java.lang.Number r0 = r0.g()
            long r0 = r0.longValue()
            goto L46
        L3e:
            java.lang.String r0 = r0.c()
            long r0 = java.lang.Long.parseLong(r0)
        L46:
            r4.D0()
            int r2 = r4.n0
            if (r2 <= 0) goto L57
            int[] r4 = r4.p0
            int r2 = r2 + (-1)
            r3 = r4[r2]
            int r3 = r3 + 1
            r4[r2] = r3
        L57:
            return r0
    }

    @Override // defpackage.hf3
    public final java.lang.String c0() {
            r1 = this;
            r0 = 0
            java.lang.String r1 = r1.B0(r0)
            return r1
    }

    @Override // defpackage.hf3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.lang.Object r0 = defpackage.rf3.r0
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1.m0 = r0
            r0 = 1
            r1.n0 = r0
            return
    }

    @Override // defpackage.hf3
    public final void e() {
            r2 = this;
            jf3 r0 = defpackage.jf3.BEGIN_ARRAY
            r2.y0(r0)
            java.lang.Object r0 = r2.C0()
            od3 r0 = (defpackage.od3) r0
            java.util.ArrayList r0 = r0.A
            java.util.Iterator r0 = r0.iterator()
            r2.E0(r0)
            int[] r0 = r2.p0
            int r2 = r2.n0
            int r2 = r2 + (-1)
            r1 = 0
            r0[r2] = r1
            return
    }

    @Override // defpackage.hf3
    public final void h() {
            r1 = this;
            jf3 r0 = defpackage.jf3.BEGIN_OBJECT
            r1.y0(r0)
            java.lang.Object r0 = r1.C0()
            ze3 r0 = (defpackage.ze3) r0
            aw3 r0 = r0.A
            java.util.Set r0 = r0.entrySet()
            yv3 r0 = (defpackage.yv3) r0
            java.util.Iterator r0 = r0.iterator()
            r1.E0(r0)
            return
    }

    @Override // defpackage.hf3
    public final void j0() {
            r2 = this;
            jf3 r0 = defpackage.jf3.NULL
            r2.y0(r0)
            r2.D0()
            int r0 = r2.n0
            if (r0 <= 0) goto L16
            int[] r2 = r2.p0
            int r0 = r0 + (-1)
            r1 = r2[r0]
            int r1 = r1 + 1
            r2[r0] = r1
        L16:
            return
    }

    @Override // defpackage.hf3
    public final java.lang.String l0() {
            r4 = this;
            jf3 r0 = r4.n0()
            jf3 r1 = defpackage.jf3.STRING
            if (r0 == r1) goto L28
            jf3 r2 = defpackage.jf3.NUMBER
            if (r0 != r2) goto Ld
            goto L28
        Ld:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " but was "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r4.A0()
            defpackage.u34.r(r2, r4)
            r4 = 0
            return r4
        L28:
            java.lang.Object r0 = r4.D0()
            ef3 r0 = (defpackage.ef3) r0
            java.lang.String r0 = r0.c()
            int r1 = r4.n0
            if (r1 <= 0) goto L40
            int[] r4 = r4.p0
            int r1 = r1 + (-1)
            r2 = r4[r1]
            int r2 = r2 + 1
            r4[r1] = r2
        L40:
            return r0
    }

    @Override // defpackage.hf3
    public final defpackage.jf3 n0() {
            r3 = this;
            int r0 = r3.n0
            if (r0 != 0) goto L7
            jf3 r3 = defpackage.jf3.END_DOCUMENT
            return r3
        L7:
            java.lang.Object r0 = r3.C0()
            boolean r1 = r0 instanceof java.util.Iterator
            if (r1 == 0) goto L3a
            java.lang.Object[] r1 = r3.m0
            int r2 = r3.n0
            int r2 = r2 + (-2)
            r1 = r1[r2]
            boolean r1 = r1 instanceof defpackage.ze3
            java.util.Iterator r0 = (java.util.Iterator) r0
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            if (r1 == 0) goto L26
            jf3 r3 = defpackage.jf3.NAME
            return r3
        L26:
            java.lang.Object r0 = r0.next()
            r3.E0(r0)
            jf3 r3 = r3.n0()
            return r3
        L32:
            if (r1 == 0) goto L37
            jf3 r3 = defpackage.jf3.END_OBJECT
            return r3
        L37:
            jf3 r3 = defpackage.jf3.END_ARRAY
            return r3
        L3a:
            boolean r3 = r0 instanceof defpackage.ze3
            if (r3 == 0) goto L41
            jf3 r3 = defpackage.jf3.BEGIN_OBJECT
            return r3
        L41:
            boolean r3 = r0 instanceof defpackage.od3
            if (r3 == 0) goto L48
            jf3 r3 = defpackage.jf3.BEGIN_ARRAY
            return r3
        L48:
            boolean r3 = r0 instanceof defpackage.ef3
            if (r3 == 0) goto L6b
            ef3 r0 = (defpackage.ef3) r0
            java.io.Serializable r3 = r0.A
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L57
            jf3 r3 = defpackage.jf3.STRING
            return r3
        L57:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L5e
            jf3 r3 = defpackage.jf3.BOOLEAN
            return r3
        L5e:
            boolean r3 = r3 instanceof java.lang.Number
            if (r3 == 0) goto L65
            jf3 r3 = defpackage.jf3.NUMBER
            return r3
        L65:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L6b:
            boolean r3 = r0 instanceof defpackage.ve3
            if (r3 == 0) goto L72
            jf3 r3 = defpackage.jf3.NULL
            return r3
        L72:
            java.lang.Object r3 = defpackage.rf3.r0
            if (r0 != r3) goto L7d
            java.lang.String r3 = "JsonReader is closed"
            defpackage.i.m(r3)
            r3 = 0
            return r3
        L7d:
            i04 r3 = new i04
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Custom JsonElement subclass "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " is not supported"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // defpackage.hf3
    public final void r() {
            r2 = this;
            jf3 r0 = defpackage.jf3.END_ARRAY
            r2.y0(r0)
            r2.D0()
            r2.D0()
            int r0 = r2.n0
            if (r0 <= 0) goto L19
            int[] r2 = r2.p0
            int r0 = r0 + (-1)
            r1 = r2[r0]
            int r1 = r1 + 1
            r2[r0] = r1
        L19:
            return
    }

    @Override // defpackage.hf3
    public final java.lang.String toString() {
            r1 = this;
            java.lang.Class<rf3> r0 = defpackage.rf3.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = r1.A0()
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    @Override // defpackage.hf3
    public final void u() {
            r3 = this;
            jf3 r0 = defpackage.jf3.END_OBJECT
            r3.y0(r0)
            java.lang.String[] r0 = r3.o0
            int r1 = r3.n0
            int r1 = r1 + (-1)
            r2 = 0
            r0[r1] = r2
            r3.D0()
            r3.D0()
            int r0 = r3.n0
            if (r0 <= 0) goto L22
            int[] r3 = r3.p0
            int r0 = r0 + (-1)
            r1 = r3[r0]
            int r1 = r1 + 1
            r3[r0] = r1
        L22:
            return
    }

    @Override // defpackage.hf3
    public final void u0() {
            r3 = this;
            jf3 r0 = r3.n0()
            int[] r1 = defpackage.of3.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L30
            r2 = 2
            if (r0 == r2) goto L2c
            r2 = 3
            if (r0 == r2) goto L28
            r2 = 4
            if (r0 == r2) goto L27
            r3.D0()
            int r0 = r3.n0
            if (r0 <= 0) goto L27
            int[] r3 = r3.p0
            int r0 = r0 - r1
            r2 = r3[r0]
            int r2 = r2 + r1
            r3[r0] = r2
        L27:
            return
        L28:
            r3.u()
            return
        L2c:
            r3.r()
            return
        L30:
            r3.B0(r1)
            return
    }

    @Override // defpackage.hf3
    public final java.lang.String x() {
            r1 = this;
            r0 = 0
            java.lang.String r1 = r1.z0(r0)
            return r1
    }

    public final void y0(defpackage.jf3 r3) {
            r2 = this;
            jf3 r0 = r2.n0()
            if (r0 != r3) goto L7
            return
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " but was "
            r0.append(r3)
            jf3 r3 = r2.n0()
            r0.append(r3)
            java.lang.String r2 = r2.A0()
            defpackage.u34.r(r0, r2)
            return
    }

    public final java.lang.String z0(boolean r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "$"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.n0
            if (r1 >= r2) goto L5d
            java.lang.Object[] r3 = r6.m0
            r4 = r3[r1]
            boolean r5 = r4 instanceof defpackage.od3
            if (r5 == 0) goto L3e
            int r1 = r1 + 1
            if (r1 >= r2) goto L5a
            r3 = r3[r1]
            boolean r3 = r3 instanceof java.util.Iterator
            if (r3 == 0) goto L5a
            int[] r3 = r6.p0
            r3 = r3[r1]
            if (r7 == 0) goto L30
            if (r3 <= 0) goto L30
            int r4 = r2 + (-1)
            if (r1 == r4) goto L2e
            int r2 = r2 + (-2)
            if (r1 != r2) goto L30
        L2e:
            int r3 = r3 + (-1)
        L30:
            r2 = 91
            r0.append(r2)
            r0.append(r3)
            r2 = 93
            r0.append(r2)
            goto L5a
        L3e:
            boolean r4 = r4 instanceof defpackage.ze3
            if (r4 == 0) goto L5a
            int r1 = r1 + 1
            if (r1 >= r2) goto L5a
            r2 = r3[r1]
            boolean r2 = r2 instanceof java.util.Iterator
            if (r2 == 0) goto L5a
            r2 = 46
            r0.append(r2)
            java.lang.String[] r2 = r6.o0
            r2 = r2[r1]
            if (r2 == 0) goto L5a
            r0.append(r2)
        L5a:
            int r1 = r1 + 1
            goto L8
        L5d:
            java.lang.String r6 = r0.toString()
            return r6
    }
}
