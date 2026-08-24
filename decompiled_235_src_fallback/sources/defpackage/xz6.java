package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz6  reason: default package */
/* loaded from: classes.dex */
public abstract class xz6 {
    public static final android.text.Layout.Alignment a = null;
    public static final android.text.Layout.Alignment b = null;

    static {
            android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r3 = r1
        La:
            if (r4 >= r2) goto L2c
            r5 = r0[r4]
            java.lang.String r6 = r5.name()
            java.lang.String r7 = "ALIGN_LEFT"
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L1c
            r1 = r5
            goto L29
        L1c:
            java.lang.String r6 = r5.name()
            java.lang.String r7 = "ALIGN_RIGHT"
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L29
            r3 = r5
        L29:
            int r4 = r4 + 1
            goto La
        L2c:
            defpackage.xz6.a = r1
            defpackage.xz6.b = r3
            return
    }
}
