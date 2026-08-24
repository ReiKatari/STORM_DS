package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic4  reason: default package */
/* loaded from: classes.dex */
public abstract class ic4 {
    public static final /* synthetic */ int X = 0;
    public final java.lang.String A;
    public final defpackage.z9 B;
    public defpackage.mc4 L;
    public final defpackage.un6 R;

    static {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            return
    }

    public ic4(defpackage.qd4 r2) {
            r1 = this;
            r2.getClass()
            java.util.LinkedHashMap r0 = defpackage.rd4.b
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = defpackage.xk2.o(r2)
            r1.<init>()
            r1.A = r2
            z9 r2 = new z9
            r2.<init>()
            r2.b = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.c = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.d = r0
            r1.B = r2
            un6 r2 = new un6
            r0 = 0
            r2.<init>(r0)
            r1.R = r2
            return
    }

    public final android.os.Bundle a(android.os.Bundle r6) {
            r5 = this;
            z9 r5 = r5.B
            java.lang.Object r5 = r5.d
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            r0 = 0
            if (r6 != 0) goto L10
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L10
            return r0
        L10:
            r1 = 0
            vr4[] r2 = new defpackage.vr4[r1]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            vr4[] r1 = (defpackage.vr4[]) r1
            android.os.Bundle r1 = defpackage.jw2.l(r1)
            java.util.Set r2 = r5.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            rb4 r3 = (defpackage.rb4) r3
            r3.getClass()
            r4.getClass()
            goto L25
        L44:
            if (r6 == 0) goto L98
            r1.putAll(r6)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L51:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L98
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r2 = r6.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r6.getValue()
            rb4 r6 = (defpackage.rb4) r6
            boolean r3 = r6.d
            fd4 r4 = r6.a
            if (r3 != 0) goto L51
            r2.getClass()
            boolean r6 = r6.b
            if (r6 != 0) goto L82
            boolean r6 = r1.containsKey(r2)
            if (r6 == 0) goto L82
            boolean r6 = defpackage.uj2.X(r1, r2)
            if (r6 != 0) goto L86
        L82:
            r4.a(r1, r2)     // Catch: java.lang.IllegalStateException -> L86
            goto L51
        L86:
            java.lang.String r5 = "Wrong argument type for '"
            java.lang.String r6 = "' in argument savedState. "
            java.lang.StringBuilder r5 = defpackage.i61.t(r5, r2, r6)
            java.lang.String r6 = r4.b()
            java.lang.String r1 = " expected."
            defpackage.u34.s(r5, r6, r1)
            return r0
        L98:
            return r1
    }

    public final int[] b(defpackage.ic4 r6) {
            r5 = this;
            pu r0 = new pu
            r0.<init>()
        L5:
            z9 r1 = r5.B
            mc4 r2 = r5.L
            if (r6 == 0) goto Le
            mc4 r3 = r6.L
            goto Lf
        Le:
            r3 = 0
        Lf:
            if (r3 == 0) goto L24
            mc4 r3 = r6.L
            r3.getClass()
            int r4 = r1.a
            dk0 r3 = r3.Y
            ic4 r3 = r3.l(r4)
            if (r3 != r5) goto L24
            r0.addFirst(r5)
            goto L3a
        L24:
            if (r2 == 0) goto L2e
            dk0 r3 = r2.Y
            int r3 = r3.L
            int r1 = r1.a
            if (r3 == r1) goto L31
        L2e:
            r0.addFirst(r5)
        L31:
            boolean r5 = defpackage.nb3.k(r2, r6)
            if (r5 == 0) goto L38
            goto L3a
        L38:
            if (r2 != 0) goto L6a
        L3a:
            java.util.List r5 = defpackage.gt0.k1(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ht0.v0(r5, r0)
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L4d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r5.next()
            ic4 r0 = (defpackage.ic4) r0
            z9 r0 = r0.B
            int r0 = r0.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            goto L4d
        L65:
            int[] r5 = defpackage.gt0.j1(r6)
            return r5
        L6a:
            r5 = r2
            goto L5
    }

    public final java.util.Map c() {
            r0 = this;
            z9 r0 = r0.B
            java.lang.Object r0 = r0.d
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Map r0 = defpackage.c14.s0(r0)
            return r0
    }

    public defpackage.hc4 d(defpackage.m44 r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            z9 r0 = r0.B
            java.lang.Object r2 = r0.d
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.lang.Object r3 = r1.B
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.Object r4 = r0.c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r5 = r4.isEmpty()
            r6 = 0
            if (r5 == 0) goto L1a
            return r6
        L1a:
            int r5 = r4.size()
            r7 = 0
            r8 = r6
            r9 = r7
        L21:
            if (r9 >= r5) goto Ld8
            java.lang.Object r10 = r4.get(r9)
            int r9 = r9 + 1
            fc4 r10 = (defpackage.fc4) r10
            r10.getClass()
            ex6 r11 = r10.d
            java.lang.Object r12 = r11.getValue()
            xh5 r12 = (defpackage.xh5) r12
            r13 = 1
            if (r12 != 0) goto L3b
            r12 = r13
            goto L50
        L3b:
            if (r3 != 0) goto L3f
            r12 = r7
            goto L50
        L3f:
            java.lang.Object r12 = r11.getValue()
            xh5 r12 = (defpackage.xh5) r12
            r12.getClass()
            java.lang.String r14 = r3.toString()
            boolean r12 = r12.d(r14)
        L50:
            if (r12 == 0) goto L21
            if (r3 == 0) goto L5b
            android.os.Bundle r12 = r10.d(r3, r2)
            r16 = r12
            goto L5d
        L5b:
            r16 = r6
        L5d:
            int r18 = r10.b(r3)
            java.lang.Object r12 = r1.L
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L70
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L70
            r19 = r13
            goto L72
        L70:
            r19 = r7
        L72:
            if (r16 != 0) goto Lbf
            if (r19 != 0) goto L77
            goto L21
        L77:
            r2.getClass()
            vr4[] r12 = new defpackage.vr4[r7]
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r7)
            vr4[] r12 = (defpackage.vr4[]) r12
            android.os.Bundle r12 = defpackage.jw2.l(r12)
            if (r3 != 0) goto L89
            goto Lb0
        L89:
            java.lang.Object r11 = r11.getValue()
            xh5 r11 = (defpackage.xh5) r11
            if (r11 == 0) goto Lb0
            java.lang.String r14 = r3.toString()
            n14 r11 = r11.c(r14)
            if (r11 != 0) goto L9c
            goto Lb0
        L9c:
            r10.e(r11, r12, r2)
            ex6 r11 = r10.e
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lb0
            r10.f(r3, r12, r2)
        Lb0:
            dc4 r11 = new dc4
            r11.<init>(r13, r12)
            java.util.ArrayList r11 = defpackage.xk2.C(r2, r11)
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L21
        Lbf:
            hc4 r14 = new hc4
            java.lang.Object r11 = r0.b
            r15 = r11
            ic4 r15 = (defpackage.ic4) r15
            boolean r10 = r10.l
            r17 = r10
            r14.<init>(r15, r16, r17, r18, r19)
            if (r8 == 0) goto Ld5
            int r10 = r14.a(r8)
            if (r10 <= 0) goto L21
        Ld5:
            r8 = r14
            goto L21
        Ld8:
            return r8
    }

    public boolean equals(java.lang.Object r11) {
            r10 = this;
            r0 = 1
            if (r10 != r11) goto L5
            goto Ld5
        L5:
            r1 = 0
            if (r11 == 0) goto Ld6
            boolean r2 = r11 instanceof defpackage.ic4
            if (r2 != 0) goto Le
            goto Ld6
        Le:
            z9 r2 = r10.B
            java.lang.Object r3 = r2.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            ic4 r11 = (defpackage.ic4) r11
            un6 r4 = r11.R
            z9 r5 = r11.B
            java.lang.Object r6 = r5.c
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r3 = defpackage.nb3.k(r3, r6)
            un6 r6 = r10.R
            int r7 = r6.f()
            int r8 = r4.f()
            if (r7 != r8) goto L5e
            vn6 r7 = new vn6
            r7.<init>(r6)
            qb6 r7 = defpackage.sb6.Y(r7)
            f11 r7 = (defpackage.f11) r7
            java.util.Iterator r7 = r7.iterator()
        L3d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5c
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            java.lang.Object r9 = r6.c(r8)
            java.lang.Object r8 = r4.c(r8)
            boolean r8 = defpackage.nb3.k(r9, r8)
            if (r8 != 0) goto L3d
            goto L5e
        L5c:
            r4 = r0
            goto L5f
        L5e:
            r4 = r1
        L5f:
            java.util.Map r6 = r10.c()
            int r6 = r6.size()
            java.util.Map r7 = r11.c()
            int r7 = r7.size()
            if (r6 != r7) goto Lba
            java.util.Map r10 = r10.c()
            java.util.Set r10 = r10.entrySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            ev r10 = defpackage.gt0.B0(r10)
            java.lang.Object r10 = r10.b
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L87:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto Lb8
            java.lang.Object r6 = r10.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.util.Map r7 = r11.c()
            java.lang.Object r8 = r6.getKey()
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto Lba
            java.util.Map r7 = r11.c()
            java.lang.Object r8 = r6.getKey()
            java.lang.Object r7 = r7.get(r8)
            java.lang.Object r6 = r6.getValue()
            boolean r6 = defpackage.nb3.k(r7, r6)
            if (r6 == 0) goto Lba
            goto L87
        Lb8:
            r10 = r0
            goto Lbb
        Lba:
            r10 = r1
        Lbb:
            int r11 = r2.a
            int r6 = r5.a
            if (r11 != r6) goto Ld6
            java.lang.Object r11 = r2.e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r2 = r5.e
            java.lang.String r2 = (java.lang.String) r2
            boolean r11 = defpackage.nb3.k(r11, r2)
            if (r11 == 0) goto Ld6
            if (r3 == 0) goto Ld6
            if (r4 == 0) goto Ld6
            if (r10 == 0) goto Ld6
        Ld5:
            return r0
        Ld6:
            return r1
    }

    public int hashCode() {
            r7 = this;
            z9 r0 = r7.B
            int r1 = r0.a
            r2 = 31
            int r1 = r1 * r2
            java.lang.Object r3 = r0.e
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            if (r3 == 0) goto L13
            int r3 = r3.hashCode()
            goto L14
        L13:
            r3 = r4
        L14:
            int r1 = r1 + r3
            java.lang.Object r0 = r0.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            r5 = r4
        L1e:
            if (r5 >= r3) goto L34
            java.lang.Object r6 = r0.get(r5)
            int r5 = r5 + 1
            fc4 r6 = (defpackage.fc4) r6
            int r1 = r1 * 31
            java.lang.String r6 = r6.a
            int r6 = r6.hashCode()
            int r6 = r6 + r1
            int r1 = r6 * 961
            goto L1e
        L34:
            un6 r0 = r7.R
            r0.getClass()
            int r3 = r0.f()
            if (r3 <= 0) goto L41
            r3 = 1
            goto L42
        L41:
            r3 = r4
        L42:
            if (r3 != 0) goto L77
            java.util.Map r0 = r7.c()
            java.util.Set r0 = r0.keySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L52:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L76
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            int r1 = r1 * 31
            int r1 = defpackage.xg6.d(r1, r2, r3)
            java.util.Map r5 = r7.c()
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L73
            int r3 = r3.hashCode()
            goto L74
        L73:
            r3 = r4
        L74:
            int r1 = r1 + r3
            goto L52
        L76:
            return r1
        L77:
            java.lang.Object r7 = r0.g(r4)
            r7.getClass()
            defpackage.u34.a()
            return r4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "(0x"
            r0.append(r1)
            z9 r2 = r2.B
            r2.getClass()
            int r1 = r2.a
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.Object r1 = r2.e
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L41
            boolean r1 = defpackage.qs6.v0(r1)
            if (r1 == 0) goto L35
            goto L41
        L35:
            java.lang.String r1 = " route="
            r0.append(r1)
            java.lang.Object r2 = r2.e
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
        L41:
            java.lang.String r2 = r0.toString()
            return r2
    }
}
