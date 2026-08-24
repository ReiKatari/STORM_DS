package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: br0  reason: default package */
/* loaded from: classes.dex */
public final class br0 {
    public final java.lang.String a;
    public java.util.List b;
    public final java.util.ArrayList c;
    public final java.util.HashSet d;
    public final java.util.ArrayList e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;

    public br0(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            yt1 r1 = defpackage.yt1.A
            r0.b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.c = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.g = r1
            return
    }

    public static void a(defpackage.br0 r1, java.lang.String r2, defpackage.wb6 r3) {
            r1.getClass()
            r3.getClass()
            java.util.HashSet r0 = r1.d
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L2a
            java.util.ArrayList r0 = r1.c
            r0.add(r2)
            java.util.ArrayList r2 = r1.e
            r2.add(r3)
            java.util.ArrayList r2 = r1.f
            yt1 r3 = defpackage.yt1.A
            r2.add(r3)
            java.util.ArrayList r1 = r1.g
            r2 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r1.add(r2)
            return
        L2a:
            java.lang.String r3 = "Element with name '"
            java.lang.String r0 = "' is already registered in "
            java.lang.StringBuilder r2 = defpackage.i61.t(r3, r2, r0)
            java.lang.String r1 = r1.a
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }
}
