package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ld4  reason: default package */
/* loaded from: classes.dex */
public abstract class ld4 {
    public defpackage.eb a;
    public boolean b;

    public final void a() {
            r6 = this;
            eb r0 = r6.a
            if (r0 == 0) goto L50
            boolean r1 = r6.b
            r2 = 0
            if (r1 != 0) goto Lc
            r0.v(r6, r2)
        Lc:
            java.lang.Object r1 = r0.L
            md4 r1 = (defpackage.md4) r1
            java.lang.Object r0 = r0.B
            h61 r0 = (defpackage.h61) r0
            r1.getClass()
            ld4 r3 = r1.h
            boolean r3 = r6.equals(r3)
            r4 = 0
            if (r3 == 0) goto L4d
            int r3 = r1.g
            r5 = -1
            if (r5 == r3) goto L26
            goto L4d
        L26:
            jd4 r3 = r1.f
            if (r3 != 0) goto L2e
            jd4 r3 = r1.c(r5)
        L2e:
            r1.f = r2
            r1.g = r4
            r1.h = r2
            if (r3 != 0) goto L40
            java.lang.Object r0 = r0.B
            il4 r0 = (defpackage.il4) r0
            java.lang.Runnable r0 = r0.a
            r0.run()
            goto L43
        L40:
            r3.b()
        L43:
            tp6 r0 = r1.a
            r0.getClass()
            nd4 r1 = defpackage.nd4.i
            r0.m(r2, r1)
        L4d:
            r6.b = r4
            return
        L50:
            java.lang.String r6 = "This input is not added to any dispatcher."
            defpackage.i.m(r6)
            return
    }

    public void b(boolean r1) {
            r0 = this;
            return
    }
}
