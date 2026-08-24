package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e34  reason: default package */
/* loaded from: classes.dex */
public interface e34 {
    default int a(defpackage.eb3 r9, java.util.List r10, int r11) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            int r1 = r10.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L26
            java.lang.Object r4 = r10.get(r3)
            x24 r4 = (defpackage.x24) r4
            ce1 r5 = new ce1
            fb3 r6 = defpackage.fb3.Max
            jb3 r7 = defpackage.jb3.Width
            r5.<init>(r4, r6, r7, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L26:
            r10 = 7
            long r10 = defpackage.s21.b(r2, r2, r2, r11, r10)
            sb3 r1 = new sb3
            kk3 r2 = r9.getLayoutDirection()
            r1.<init>(r9, r2)
            f34 r8 = r8.d(r1, r0, r10)
            int r8 = r8.getWidth()
            return r8
    }

    defpackage.f34 d(defpackage.g34 r1, java.util.List r2, long r3);

    default int e(defpackage.eb3 r9, java.util.List r10, int r11) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            int r1 = r10.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L26
            java.lang.Object r4 = r10.get(r3)
            x24 r4 = (defpackage.x24) r4
            ce1 r5 = new ce1
            fb3 r6 = defpackage.fb3.Min
            jb3 r7 = defpackage.jb3.Width
            r5.<init>(r4, r6, r7, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L26:
            r10 = 7
            long r10 = defpackage.s21.b(r2, r2, r2, r11, r10)
            sb3 r1 = new sb3
            kk3 r2 = r9.getLayoutDirection()
            r1.<init>(r9, r2)
            f34 r8 = r8.d(r1, r0, r10)
            int r8 = r8.getWidth()
            return r8
    }

    default int g(defpackage.eb3 r9, java.util.List r10, int r11) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            int r1 = r10.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L26
            java.lang.Object r4 = r10.get(r3)
            x24 r4 = (defpackage.x24) r4
            ce1 r5 = new ce1
            fb3 r6 = defpackage.fb3.Max
            jb3 r7 = defpackage.jb3.Height
            r5.<init>(r4, r6, r7, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L26:
            r10 = 13
            long r10 = defpackage.s21.b(r2, r11, r2, r2, r10)
            sb3 r1 = new sb3
            kk3 r2 = r9.getLayoutDirection()
            r1.<init>(r9, r2)
            f34 r8 = r8.d(r1, r0, r10)
            int r8 = r8.getHeight()
            return r8
    }

    default int i(defpackage.eb3 r9, java.util.List r10, int r11) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            int r1 = r10.size()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L26
            java.lang.Object r4 = r10.get(r3)
            x24 r4 = (defpackage.x24) r4
            ce1 r5 = new ce1
            fb3 r6 = defpackage.fb3.Min
            jb3 r7 = defpackage.jb3.Height
            r5.<init>(r4, r6, r7, r2)
            r0.add(r5)
            int r3 = r3 + 1
            goto Lf
        L26:
            r10 = 13
            long r10 = defpackage.s21.b(r2, r11, r2, r2, r10)
            sb3 r1 = new sb3
            kk3 r2 = r9.getLayoutDirection()
            r1.<init>(r9, r2)
            f34 r8 = r8.d(r1, r0, r10)
            int r8 = r8.getHeight()
            return r8
    }
}
