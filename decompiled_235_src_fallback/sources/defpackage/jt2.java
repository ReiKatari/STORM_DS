package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt2  reason: default package */
/* loaded from: classes.dex */
public final class jt2 {
    public final defpackage.hb4 a;

    public jt2() {
            r1 = this;
            r1.<init>()
            hb4 r0 = new hb4
            r0.<init>()
            r1.a = r0
            return
    }

    public final java.lang.Object a(defpackage.s41 r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.it2
            if (r0 == 0) goto L13
            r0 = r5
            it2 r0 = (defpackage.it2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            it2 r0 = new it2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            hb4 r4 = r0.R
            defpackage.oi2.Y(r5)
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L30:
            defpackage.oi2.Y(r5)
            hb4 r4 = r4.a
            r0.R = r4
            r0.Z = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            jb4 r5 = new jb4
            r5.<init>(r4)
            return r5
    }
}
