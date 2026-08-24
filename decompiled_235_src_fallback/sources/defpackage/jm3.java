package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jm3  reason: default package */
/* loaded from: classes.dex */
public interface jm3 extends defpackage.xg1 {
    default int Z(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            ce1 r0 = new ce1
            hg4 r1 = defpackage.hg4.Max
            ig4 r2 = defpackage.ig4.Height
            r3 = 2
            r0.<init>(r6, r1, r2, r3)
            r6 = 0
            r1 = 13
            long r6 = defpackage.s21.b(r6, r7, r6, r6, r1)
            sb3 r1 = new sb3
            kk3 r2 = r5.getLayoutDirection()
            r1.<init>(r5, r2)
            f34 r4 = r4.c(r1, r0, r6)
            int r4 = r4.getHeight()
            return r4
    }

    defpackage.f34 c(defpackage.g34 r1, defpackage.x24 r2, long r3);

    default int f(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            ce1 r0 = new ce1
            hg4 r1 = defpackage.hg4.Max
            ig4 r2 = defpackage.ig4.Width
            r3 = 2
            r0.<init>(r6, r1, r2, r3)
            r6 = 0
            r1 = 7
            long r6 = defpackage.s21.b(r6, r6, r6, r7, r1)
            sb3 r1 = new sb3
            kk3 r2 = r5.getLayoutDirection()
            r1.<init>(r5, r2)
            f34 r4 = r4.c(r1, r0, r6)
            int r4 = r4.getWidth()
            return r4
    }

    default int h0(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            ce1 r0 = new ce1
            hg4 r1 = defpackage.hg4.Min
            ig4 r2 = defpackage.ig4.Height
            r3 = 2
            r0.<init>(r6, r1, r2, r3)
            r6 = 0
            r1 = 13
            long r6 = defpackage.s21.b(r6, r7, r6, r6, r1)
            sb3 r1 = new sb3
            kk3 r2 = r5.getLayoutDirection()
            r1.<init>(r5, r2)
            f34 r4 = r4.c(r1, r0, r6)
            int r4 = r4.getHeight()
            return r4
    }

    default int s0(defpackage.kz3 r5, defpackage.x24 r6, int r7) {
            r4 = this;
            ce1 r0 = new ce1
            hg4 r1 = defpackage.hg4.Min
            ig4 r2 = defpackage.ig4.Width
            r3 = 2
            r0.<init>(r6, r1, r2, r3)
            r6 = 0
            r1 = 7
            long r6 = defpackage.s21.b(r6, r6, r6, r7, r1)
            sb3 r1 = new sb3
            kk3 r2 = r5.getLayoutDirection()
            r1.<init>(r5, r2)
            f34 r4 = r4.c(r1, r0, r6)
            int r4 = r4.getWidth()
            return r4
    }
}
