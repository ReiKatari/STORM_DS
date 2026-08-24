package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv3  reason: default package */
/* loaded from: classes.dex */
public final class wv3 extends defpackage.qo2 {
    public final defpackage.ar0 b;
    public final java.lang.Object c;
    public final defpackage.qo2 d;

    public wv3(defpackage.ar0 r1, java.lang.Object r2, defpackage.qo2 r3) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.d = r3
            return
    }

    @Override // defpackage.qo2
    public final java.lang.Object A(defpackage.ar0 r2) {
            r1 = this;
            ar0 r0 = r1.b
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            java.lang.Class r2 = r2.a
            r2.getClass()
            java.lang.Object r1 = r1.c
            java.lang.Object r1 = r2.cast(r1)
            return r1
        L14:
            qo2 r1 = r1.d
            java.lang.Object r1 = r1.A(r2)
            return r1
    }

    @Override // defpackage.qo2
    public final defpackage.qo2 F(defpackage.ar0 r4, java.lang.Object r5) {
            r3 = this;
            ar0 r0 = r3.b
            boolean r1 = r4.equals(r0)
            qo2 r2 = r3.d
            if (r1 == 0) goto Lb
            goto L1c
        Lb:
            r1 = 0
            qo2 r1 = r2.F(r4, r1)
            if (r1 != r2) goto L13
            goto L1b
        L13:
            wv3 r2 = new wv3
            java.lang.Object r3 = r3.c
            r2.<init>(r0, r3, r1)
            r3 = r2
        L1b:
            r2 = r3
        L1c:
            if (r5 == 0) goto L24
            wv3 r3 = new wv3
            r3.<init>(r4, r5, r2)
            return r3
        L24:
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            v83 r0 = new v83
            r1 = 20
            r0.<init>(r1)
            qb6 r6 = defpackage.sb6.Z(r6, r0)
            java.util.List r6 = defpackage.sb6.c0(r6)
            java.util.List r0 = defpackage.gt0.a1(r6)
            v83 r4 = new v83
            r6 = 21
            r4.<init>(r6)
            r5 = 25
            r1 = 0
            java.lang.String r2 = "{"
            java.lang.String r3 = "}"
            java.lang.String r6 = defpackage.gt0.P0(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
