package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jt0  reason: default package */
/* loaded from: classes.dex */
public abstract class jt0 extends defpackage.it0 {
    public static void w0(java.util.List r2) {
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto La
            java.util.Collections.sort(r2)
        La:
            return
    }

    public static void x0(java.util.List r2, java.util.Comparator r3) {
            r2.getClass()
            r3.getClass()
            int r0 = r2.size()
            r1 = 1
            if (r0 <= r1) goto L10
            java.util.Collections.sort(r2, r3)
        L10:
            return
    }
}
