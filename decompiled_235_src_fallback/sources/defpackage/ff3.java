package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff3  reason: default package */
/* loaded from: classes.dex */
public final class ff3 extends defpackage.v0 {
    public final defpackage.de3 Y;

    public ff3(defpackage.id3 r1, defpackage.de3 r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>(r1, r3)
            r0.Y = r2
            java.lang.String r1 = "primitive"
            java.util.ArrayList r0 = r0.A
            r0.add(r1)
            return
    }

    @Override // defpackage.v0
    public final defpackage.de3 E() {
            r0 = this;
            de3 r0 = r0.Y
            return r0
    }

    @Override // defpackage.v0
    public final defpackage.de3 d(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "primitive"
            if (r2 != r0) goto La
            de3 r1 = r1.Y
            return r1
        La:
            java.lang.String r1 = "This input can only handle primitives with 'primitive' tag"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.ux0
    public final int q(defpackage.wb6 r1) {
            r0 = this;
            r1.getClass()
            r0 = 0
            return r0
    }
}
