package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa7  reason: default package */
/* loaded from: classes.dex */
public interface aa7 {
    java.lang.Object a();

    default boolean b(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r0 = r1.a()
            boolean r2 = defpackage.nb3.k(r2, r0)
            if (r2 == 0) goto L16
            java.lang.Object r1 = r1.c()
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    java.lang.Object c();
}
