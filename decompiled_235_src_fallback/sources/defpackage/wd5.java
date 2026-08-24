package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wd5  reason: default package */
/* loaded from: classes.dex */
public final class wd5 {
    public final defpackage.c1 a;
    public final java.lang.String b;
    public final java.lang.Object[] c;
    public final int d;

    public wd5(defpackage.c1 r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r4 = 0
            char r4 = r5.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 >= r6) goto L16
            r3.d = r4
            return
        L16:
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
            r1 = 1
        L1b:
            int r2 = r1 + 1
            char r1 = r5.charAt(r1)
            if (r1 < r6) goto L2b
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r0
            r4 = r4 | r1
            int r0 = r0 + 13
            r1 = r2
            goto L1b
        L2b:
            int r5 = r1 << r0
            r4 = r4 | r5
            r3.d = r4
            return
    }
}
