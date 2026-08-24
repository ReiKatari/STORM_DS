package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq3  reason: default package */
/* loaded from: classes.dex */
public final class nq3 {
    public final int a;
    public final java.util.ArrayList b;
    public final /* synthetic */ defpackage.pq3 c;

    public nq3(defpackage.pq3 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.a = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.b = r1
            return
    }

    public final void a(int r5) {
            r4 = this;
            pq3 r0 = r4.c
            bk1 r1 = r0.c
            if (r1 != 0) goto L7
            return
        L7:
            m44 r0 = r0.b
            a25 r2 = new a25
            r3 = 0
            r2.<init>(r1, r5, r0, r3)
            java.util.ArrayList r4 = r4.b
            r4.add(r2)
            return
    }
}
