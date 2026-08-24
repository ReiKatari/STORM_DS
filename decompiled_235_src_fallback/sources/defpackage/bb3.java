package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb3  reason: default package */
/* loaded from: classes.dex */
public final class bb3 {
    public final int a;
    public final int b;
    public final defpackage.vp3 c;

    public bb3(int r1, int r2, defpackage.vp3 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            if (r1 < 0) goto Lc
            goto L11
        Lc:
            java.lang.String r0 = "startIndex should be >= 0"
            defpackage.s53.a(r0)
        L11:
            if (r2 <= 0) goto L14
            return
        L14:
            java.lang.String r0 = "size should be > 0"
            defpackage.s53.a(r0)
            return
    }
}
