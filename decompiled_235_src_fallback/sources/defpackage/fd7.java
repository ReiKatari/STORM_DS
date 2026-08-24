package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fd7  reason: default package */
/* loaded from: classes.dex */
public class fd7 extends defpackage.yc7 {
    public fd7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r4) {
            r3 = this;
            jf3 r3 = r4.n0()
            jf3 r0 = defpackage.jf3.NULL
            if (r3 != r0) goto Ld
            r4.j0()
            r3 = 0
            return r3
        Ld:
            java.lang.String r3 = r4.l0()
            int r0 = r3.length()
            r1 = 1
            if (r0 != r1) goto L22
            r4 = 0
            char r3 = r3.charAt(r4)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            return r3
        L22:
            ne3 r0 = new ne3
            java.lang.String r1 = "Expecting character, got: "
            java.lang.String r2 = "; at "
            java.lang.StringBuilder r3 = defpackage.i61.t(r1, r3, r2)
            java.lang.String r4 = r4.D()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Character r2 = (java.lang.Character) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r2)
        La:
            r1.c0(r0)
            return
    }
}
