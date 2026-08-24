package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nu5  reason: default package */
/* loaded from: classes.dex */
public final class nu5 extends defpackage.tu5 {
    public final defpackage.u26 a;

    public nu5(defpackage.u26 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.nu5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nu5 r4 = (defpackage.nu5) r4
            u26 r3 = r3.a
            u26 r4 = r4.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            u26 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RuntimeConsoleUpdate(newRuntimeConsole="
            r0.<init>(r1)
            u26 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
