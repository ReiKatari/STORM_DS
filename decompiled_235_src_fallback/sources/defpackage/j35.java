package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j35  reason: default package */
/* loaded from: classes.dex */
public final class j35 {
    public final int a;

    public j35(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.j35
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            j35 r3 = (defpackage.j35) r3
            int r3 = r3.a
            int r2 = r2.a
            if (r2 != r3) goto L10
            r2 = 1
            return r2
        L10:
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            return r0
    }
}
