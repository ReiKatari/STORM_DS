package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: zo0  reason: default package */
/* loaded from: classes.dex */
public final class zo0 extends defpackage.vy7 {
    public static final defpackage.yo0 Companion = null;
    public final java.lang.String h0;

    static {
            yo0 r0 = new yo0
            r0.<init>()
            defpackage.zo0.Companion = r0
            return
    }

    public zo0(int r3, java.lang.String r4) {
            r2 = this;
            r0 = r3 & 1
            r1 = 1
            if (r1 != r0) goto Lb
            r2.<init>()
            r2.h0 = r4
            return
        Lb:
            xo0 r2 = defpackage.xo0.a
            wb6 r2 = r2.e()
            defpackage.ii2.S(r3, r1, r2)
            r2 = 0
            throw r2
    }

    public zo0(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.h0 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.zo0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            zo0 r4 = (defpackage.zo0) r4
            java.lang.String r3 = r3.h0
            java.lang.String r4 = r4.h0
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.h0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "FolderCheats(folderName="
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.h0
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            return r2
    }
}
