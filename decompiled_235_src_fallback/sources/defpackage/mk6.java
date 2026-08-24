package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mk6  reason: default package */
/* loaded from: classes.dex */
public final class mk6 implements defpackage.by0, java.lang.Iterable, defpackage.zf3 {
    public int[] A;
    public int B;
    public java.lang.Object[] L;
    public int R;
    public int X;
    public final java.lang.Object Y;
    public boolean Z;
    public int d0;
    public java.util.ArrayList e0;
    public java.util.HashMap f0;
    public defpackage.p94 g0;

    public mk6() {
            r2 = this;
            r2.<init>()
            r0 = 0
            int[] r1 = new int[r0]
            r2.A = r1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.L = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.Y = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.e0 = r0
            return
    }

    public final int a(defpackage.sq2 r1) {
            r0 = this;
            boolean r0 = r0.Z
            if (r0 == 0) goto L9
            java.lang.String r0 = "Use active SlotWriter to determine anchor location instead"
            defpackage.tx0.a(r0)
        L9:
            boolean r0 = r1.a()
            if (r0 != 0) goto L14
            java.lang.String r0 = "Anchor refers to a group that was removed"
            defpackage.r05.a(r0)
        L14:
            int r0 = r1.a
            return r0
    }

    public final void b() {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f0 = r0
            return
    }

    public final defpackage.lk6 c() {
            r1 = this;
            boolean r0 = r1.Z
            if (r0 != 0) goto L10
            int r0 = r1.X
            int r0 = r0 + 1
            r1.X = r0
            lk6 r0 = new lk6
            r0.<init>(r1)
            return r0
        L10:
            java.lang.String r1 = "Cannot read while a writer is pending"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    public final defpackage.pk6 d() {
            r2 = this;
            boolean r0 = r2.Z
            if (r0 == 0) goto L9
            java.lang.String r0 = "Cannot start a writer when another writer is pending"
            defpackage.tx0.a(r0)
        L9:
            int r0 = r2.X
            if (r0 > 0) goto Le
            goto L13
        Le:
            java.lang.String r0 = "Cannot start a writer when a reader is pending"
            defpackage.tx0.a(r0)
        L13:
            r0 = 1
            r2.Z = r0
            int r1 = r2.d0
            int r1 = r1 + r0
            r2.d0 = r1
            pk6 r0 = new pk6
            r0.<init>(r2)
            return r0
    }

    public final boolean f(defpackage.sq2 r4) {
            r3 = this;
            boolean r0 = r4.a()
            if (r0 == 0) goto L20
            java.util.ArrayList r0 = r3.e0
            int r1 = r4.a
            int r2 = r3.B
            int r0 = defpackage.ok6.e(r0, r1, r2)
            if (r0 < 0) goto L20
            java.util.ArrayList r3 = r3.e0
            java.lang.Object r3 = r3.get(r0)
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L20
            r3 = 1
            return r3
        L20:
            r3 = 0
            return r3
    }

    public final defpackage.zq2 g(int r4) {
            r3 = this;
            java.util.HashMap r0 = r3.f0
            r1 = 0
            if (r0 == 0) goto L2d
            boolean r2 = r3.Z
            if (r2 == 0) goto Le
            java.lang.String r2 = "use active SlotWriter to crate an anchor for location instead"
            defpackage.tx0.a(r2)
        Le:
            if (r4 < 0) goto L23
            int r2 = r3.B
            if (r4 >= r2) goto L23
            java.util.ArrayList r3 = r3.e0
            int r4 = defpackage.ok6.e(r3, r4, r2)
            if (r4 < 0) goto L23
            java.lang.Object r3 = r3.get(r4)
            sq2 r3 = (defpackage.sq2) r3
            goto L24
        L23:
            r3 = r1
        L24:
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.get(r3)
            zq2 r3 = (defpackage.zq2) r3
            return r3
        L2d:
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r3 = this;
            ou2 r0 = new ou2
            r1 = 0
            int r2 = r3.B
            r0.<init>(r3, r1, r2)
            return r0
    }
}
