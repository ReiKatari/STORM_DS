package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z15  reason: default package */
/* loaded from: classes.dex */
public final class z15 {
    public final java.util.List a;
    public final java.util.List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ defpackage.a25 f;

    public z15(defpackage.a25 r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f = r1
            r0.a = r2
            int r1 = r2.size()
            java.util.List[] r1 = new java.util.List[r1]
            r0.b = r1
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1a
            java.lang.String r0 = "NestedPrefetchController shouldn't be created with no states"
            defpackage.s53.a(r0)
        L1a:
            return
    }
}
