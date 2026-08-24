package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bc2  reason: default package */
/* loaded from: classes.dex */
public final class bc2 extends defpackage.ac2 {
    public boolean b;
    public java.io.File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ defpackage.fc2 f;

    public bc2(defpackage.fc2 r1, java.io.File r2) {
            r0 = this;
            r2.getClass()
            r0.f = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.gc2
    public final java.io.File a() {
            r5 = this;
            boolean r0 = r5.e
            r1 = 1
            java.io.File r2 = r5.a
            if (r0 != 0) goto L25
            java.io.File[] r0 = r5.c
            if (r0 != 0) goto L25
            java.io.File[] r0 = r2.listFiles()
            r5.c = r0
            if (r0 != 0) goto L25
            fc2 r0 = r5.f
            hc2 r0 = r0.R
            eo2 r0 = r0.c
            if (r0 == 0) goto L23
            x1 r3 = new x1
            r3.<init>(r2)
            r0.o(r2, r3)
        L23:
            r5.e = r1
        L25:
            java.io.File[] r0 = r5.c
            if (r0 == 0) goto L3a
            int r3 = r5.d
            int r4 = r0.length
            if (r3 >= r4) goto L3a
            r0.getClass()
            int r1 = r5.d
            int r2 = r1 + 1
            r5.d = r2
            r5 = r0[r1]
            return r5
        L3a:
            boolean r0 = r5.b
            if (r0 != 0) goto L41
            r5.b = r1
            return r2
        L41:
            r5 = 0
            return r5
    }
}
