package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yd7  reason: default package */
/* loaded from: classes.dex */
public class yd7 extends defpackage.yc7 {
    public yd7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r2) {
            r1 = this;
            jf3 r1 = r2.n0()
            jf3 r0 = defpackage.jf3.NULL
            if (r1 != r0) goto Ld
            r2.j0()
            r1 = 0
            return r1
        Ld:
            java.lang.String r1 = r2.l0()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto L7
            java.lang.String r0 = "null"
            goto Lb
        L7:
            java.lang.String r0 = r2.toString()
        Lb:
            r1.c0(r0)
            return
    }
}
