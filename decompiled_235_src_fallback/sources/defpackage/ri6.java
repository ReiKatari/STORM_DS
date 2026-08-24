package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri6  reason: default package */
/* loaded from: classes.dex */
public final class ri6 extends defpackage.gi2 {
    public final defpackage.j41 e;
    public final defpackage.vs4 f;

    public ri6(defpackage.j41 r1) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.f = r1
            return
    }

    @Override // defpackage.gi2
    public final java.lang.Object D(defpackage.j41 r2) {
            r1 = this;
            j41 r0 = r1.e
            if (r2 != r0) goto L5
            goto La
        L5:
            java.lang.String r2 = "Check failed."
            defpackage.p53.c(r2)
        La:
            vs4 r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            if (r1 != 0) goto L13
            r1 = 0
        L13:
            return r1
    }

    @Override // defpackage.gi2
    public final boolean z(defpackage.j41 r1) {
            r0 = this;
            j41 r0 = r0.e
            if (r1 != r0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}
