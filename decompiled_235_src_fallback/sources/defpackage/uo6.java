package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo6  reason: default package */
/* loaded from: classes.dex */
public final class uo6 implements defpackage.nh1 {
    public final char a;
    public int b;
    public final java.util.LinkedList c;

    public uo6(char r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.c = r0
            r1.a = r2
            return
    }

    @Override // defpackage.nh1
    public final void a(defpackage.vz6 r4, defpackage.vz6 r5, int r6) {
            r3 = this;
            java.util.LinkedList r3 = r3.c
            java.util.Iterator r0 = r3.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            nh1 r1 = (defpackage.nh1) r1
            int r2 = r1.c()
            if (r2 > r6) goto L6
            goto L20
        L19:
            java.lang.Object r3 = r3.getFirst()
            r1 = r3
            nh1 r1 = (defpackage.nh1) r1
        L20:
            r1.a(r4, r5, r6)
            return
    }

    @Override // defpackage.nh1
    public final char b() {
            r0 = this;
            char r0 = r0.a
            return r0
    }

    @Override // defpackage.nh1
    public final int c() {
            r0 = this;
            int r0 = r0.b
            return r0
    }

    @Override // defpackage.nh1
    public final int d(defpackage.mh1 r5, defpackage.mh1 r6) {
            r4 = this;
            int r0 = r5.g
            java.util.LinkedList r4 = r4.c
            java.util.Iterator r1 = r4.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r1.next()
            nh1 r2 = (defpackage.nh1) r2
            int r3 = r2.c()
            if (r3 > r0) goto L8
            goto L22
        L1b:
            java.lang.Object r4 = r4.getFirst()
            r2 = r4
            nh1 r2 = (defpackage.nh1) r2
        L22:
            int r4 = r2.d(r5, r6)
            return r4
    }

    @Override // defpackage.nh1
    public final char e() {
            r0 = this;
            char r0 = r0.a
            return r0
    }

    public final void f(defpackage.nh1 r5) {
            r4 = this;
            int r0 = r5.c()
            java.util.LinkedList r1 = r4.c
            java.util.ListIterator r2 = r1.listIterator()
        La:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            nh1 r3 = (defpackage.nh1) r3
            int r3 = r3.c()
            if (r0 <= r3) goto L23
            r2.previous()
            r2.add(r5)
            return
        L23:
            if (r0 == r3) goto L26
            goto La
        L26:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot add two delimiter processors for char '"
            r1.<init>(r2)
            char r4 = r4.a
            r1.append(r4)
            java.lang.String r4 = "' and minimum length "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            throw r5
        L44:
            r1.add(r5)
            r4.b = r0
            return
    }
}
