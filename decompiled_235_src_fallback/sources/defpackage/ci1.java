package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci1  reason: default package */
/* loaded from: classes.dex */
public class ci1 implements defpackage.xh1 {
    public defpackage.ct7 a;
    public boolean b;
    public boolean c;
    public final defpackage.ct7 d;
    public defpackage.bi1 e;
    public int f;
    public int g;
    public int h;
    public defpackage.rj1 i;
    public boolean j;
    public final java.util.ArrayList k;
    public final java.util.ArrayList l;

    public ci1(defpackage.ct7 r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r1 = 0
            r3.b = r1
            r3.c = r1
            bi1 r2 = defpackage.bi1.UNKNOWN
            r3.e = r2
            r2 = 1
            r3.h = r2
            r3.i = r0
            r3.j = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.k = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.l = r0
            r3.d = r4
            return
    }

    @Override // defpackage.xh1
    public final void a(defpackage.xh1 r8) {
            r7 = this;
            java.util.ArrayList r8 = r7.l
            int r0 = r8.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L17
            java.lang.Object r3 = r8.get(r2)
            int r2 = r2 + 1
            ci1 r3 = (defpackage.ci1) r3
            boolean r3 = r3.j
            if (r3 != 0) goto L8
            goto L6b
        L17:
            r0 = 1
            r7.c = r0
            ct7 r2 = r7.a
            if (r2 == 0) goto L21
            r2.a(r7)
        L21:
            boolean r2 = r7.b
            if (r2 == 0) goto L2b
            ct7 r8 = r7.d
            r8.a(r7)
            return
        L2b:
            int r2 = r8.size()
            r3 = 0
            r4 = r3
            r3 = r1
        L32:
            if (r3 >= r2) goto L45
            java.lang.Object r5 = r8.get(r3)
            int r3 = r3 + 1
            ci1 r5 = (defpackage.ci1) r5
            boolean r6 = r5 instanceof defpackage.rj1
            if (r6 == 0) goto L41
            goto L32
        L41:
            int r1 = r1 + 1
            r4 = r5
            goto L32
        L45:
            if (r4 == 0) goto L64
            if (r1 != r0) goto L64
            boolean r8 = r4.j
            if (r8 == 0) goto L64
            rj1 r8 = r7.i
            if (r8 == 0) goto L5c
            boolean r0 = r8.j
            if (r0 == 0) goto L6b
            int r0 = r7.h
            int r8 = r8.g
            int r0 = r0 * r8
            r7.f = r0
        L5c:
            int r8 = r4.g
            int r0 = r7.f
            int r8 = r8 + r0
            r7.d(r8)
        L64:
            ct7 r8 = r7.a
            if (r8 == 0) goto L6b
            r8.a(r7)
        L6b:
            return
    }

    public final void b(defpackage.ct7 r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.k
            r0.add(r2)
            boolean r1 = r1.j
            if (r1 == 0) goto Lc
            r2.a(r2)
        Lc:
            return
    }

    public final void c() {
            r1 = this;
            java.util.ArrayList r0 = r1.l
            r0.clear()
            java.util.ArrayList r0 = r1.k
            r0.clear()
            r0 = 0
            r1.j = r0
            r1.g = r0
            r1.c = r0
            r1.b = r0
            return
    }

    public void d(int r3) {
            r2 = this;
            boolean r0 = r2.j
            if (r0 == 0) goto L5
            goto L1f
        L5:
            r0 = 1
            r2.j = r0
            r2.g = r3
            java.util.ArrayList r2 = r2.k
            int r3 = r2.size()
            r0 = 0
        L11:
            if (r0 >= r3) goto L1f
            java.lang.Object r1 = r2.get(r0)
            int r0 = r0 + 1
            xh1 r1 = (defpackage.xh1) r1
            r1.a(r1)
            goto L11
        L1f:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            ct7 r1 = r2.d
            l21 r1 = r1.b
            java.lang.String r1 = r1.j0
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            bi1 r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            boolean r1 = r2.j
            if (r1 == 0) goto L28
            int r1 = r2.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L2a
        L28:
            java.lang.String r1 = "unresolved"
        L2a:
            r0.append(r1)
            java.lang.String r1 = ") <t="
            r0.append(r1)
            java.util.ArrayList r1 = r2.l
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ":d="
            r0.append(r1)
            java.util.ArrayList r2 = r2.k
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = ">"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
