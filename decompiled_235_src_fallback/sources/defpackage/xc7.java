package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc7  reason: default package */
/* loaded from: classes.dex */
public final class xc7 extends defpackage.yc7 {
    public final /* synthetic */ defpackage.yc7 a;

    public xc7(defpackage.yc7 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r3) {
            r2 = this;
            jf3 r0 = r3.n0()
            jf3 r1 = defpackage.jf3.NULL
            if (r0 != r1) goto Ld
            r3.j0()
            r2 = 0
            return r2
        Ld:
            yc7 r2 = r2.a
            java.lang.Object r2 = r2.b(r3)
            return r2
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            if (r2 != 0) goto L6
            r1.A()
            return
        L6:
            yc7 r0 = r0.a
            r0.c(r1, r2)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NullSafeTypeAdapter["
            r0.<init>(r1)
            yc7 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
