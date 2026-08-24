package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lu7  reason: default package */
/* loaded from: classes.dex */
public class lu7 extends defpackage.ku7 {
    public lu7(defpackage.vu7 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.ru7
    public defpackage.vu7 a() {
            r1 = this;
            android.view.WindowInsets r1 = r1.c
            android.view.WindowInsets r1 = defpackage.o05.d(r1)
            r0 = 0
            vu7 r1 = defpackage.vu7.g(r0, r1)
            return r1
    }

    @Override // defpackage.ju7, defpackage.ru7
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.lu7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lu7 r5 = (defpackage.lu7) r5
            android.view.WindowInsets r1 = r4.c
            android.view.WindowInsets r3 = r5.c
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            e83 r1 = r4.g
            e83 r3 = r5.g
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            int r4 = r4.h
            int r5 = r5.h
            boolean r4 = defpackage.ju7.L(r4, r5)
            if (r4 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    @Override // defpackage.ru7
    public defpackage.yk1 g() {
            r1 = this;
            android.view.WindowInsets r1 = r1.c
            android.view.DisplayCutout r1 = defpackage.o05.c(r1)
            if (r1 != 0) goto La
            r1 = 0
            return r1
        La:
            yk1 r0 = new yk1
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.ru7
    public int hashCode() {
            r0 = this;
            android.view.WindowInsets r0 = r0.c
            int r0 = r0.hashCode()
            return r0
    }
}
