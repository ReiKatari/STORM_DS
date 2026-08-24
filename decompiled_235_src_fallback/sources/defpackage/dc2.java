package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc2  reason: default package */
/* loaded from: classes.dex */
public final class dc2 extends defpackage.ac2 {
    public boolean b;
    public java.io.File[] c;
    public int d;
    public final /* synthetic */ defpackage.fc2 e;

    public dc2(defpackage.fc2 r1, java.io.File r2) {
            r0 = this;
            r2.getClass()
            r0.e = r1
            r0.<init>(r2)
            return
    }

    @Override // defpackage.gc2
    public final java.io.File a() {
            r5 = this;
            boolean r0 = r5.b
            java.io.File r1 = r5.a
            if (r0 != 0) goto La
            r0 = 1
            r5.b = r0
            return r1
        La:
            java.io.File[] r0 = r5.c
            r2 = 0
            if (r0 == 0) goto L16
            int r3 = r5.d
            int r4 = r0.length
            if (r3 >= r4) goto L15
            goto L16
        L15:
            return r2
        L16:
            if (r0 != 0) goto L38
            java.io.File[] r0 = r1.listFiles()
            r5.c = r0
            if (r0 != 0) goto L30
            fc2 r0 = r5.e
            hc2 r0 = r0.R
            eo2 r0 = r0.c
            if (r0 == 0) goto L30
            x1 r3 = new x1
            r3.<init>(r1)
            r0.o(r1, r3)
        L30:
            java.io.File[] r0 = r5.c
            if (r0 == 0) goto L37
            int r0 = r0.length
            if (r0 != 0) goto L38
        L37:
            return r2
        L38:
            java.io.File[] r0 = r5.c
            r0.getClass()
            int r1 = r5.d
            int r2 = r1 + 1
            r5.d = r2
            r5 = r0[r1]
            return r5
    }
}
