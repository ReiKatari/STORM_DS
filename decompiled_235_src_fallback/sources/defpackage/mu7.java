package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu7  reason: default package */
/* loaded from: classes.dex */
public class mu7 extends defpackage.lu7 {
    public defpackage.e83 s;
    public defpackage.e83 t;
    public defpackage.e83 u;

    public mu7(defpackage.vu7 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.s = r1
            r0.t = r1
            r0.u = r1
            return
    }

    @Override // defpackage.ru7
    public defpackage.e83 j() {
            r1 = this;
            e83 r0 = r1.t
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.c
            android.graphics.Insets r0 = defpackage.fq7.i(r0)
            e83 r0 = defpackage.e83.d(r0)
            r1.t = r0
        L10:
            e83 r1 = r1.t
            return r1
    }

    @Override // defpackage.ru7
    public defpackage.e83 l() {
            r1 = this;
            e83 r0 = r1.s
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.c
            android.graphics.Insets r0 = defpackage.fq7.k(r0)
            e83 r0 = defpackage.e83.d(r0)
            r1.s = r0
        L10:
            e83 r1 = r1.s
            return r1
    }

    @Override // defpackage.ru7
    public defpackage.e83 n() {
            r1 = this;
            e83 r0 = r1.u
            if (r0 != 0) goto L10
            android.view.WindowInsets r0 = r1.c
            android.graphics.Insets r0 = defpackage.fq7.a(r0)
            e83 r0 = defpackage.e83.d(r0)
            r1.u = r0
        L10:
            e83 r1 = r1.u
            return r1
    }

    @Override // defpackage.ju7, defpackage.ru7
    public defpackage.vu7 q(int r1, int r2, int r3, int r4) {
            r0 = this;
            android.view.WindowInsets r0 = r0.c
            android.view.WindowInsets r0 = defpackage.fq7.e(r0, r1, r2, r3, r4)
            r1 = 0
            vu7 r0 = defpackage.vu7.g(r1, r0)
            return r0
    }

    @Override // defpackage.ku7, defpackage.ru7
    public void x(defpackage.e83 r1) {
            r0 = this;
            return
    }
}
