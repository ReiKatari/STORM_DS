package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b8  reason: default package */
/* loaded from: classes.dex */
public final class b8 extends defpackage.ik2 {
    public final /* synthetic */ int f0;
    public final /* synthetic */ android.view.View g0;

    public b8(androidx.appcompat.view.menu.ActionMenuItemView r2) {
            r1 = this;
            r0 = 0
            r1.f0 = r0
            r1.g0 = r2
            r1.<init>(r2)
            return
    }

    public b8(defpackage.f8 r2, defpackage.f8 r3) {
            r1 = this;
            r0 = 1
            r1.f0 = r0
            r1.g0 = r2
            r1.<init>(r3)
            return
    }

    @Override // defpackage.ik2
    public final defpackage.lh6 b() {
            r2 = this;
            int r0 = r2.f0
            r1 = 0
            android.view.View r2 = r2.g0
            switch(r0) {
                case 0: goto L16;
                default: goto L8;
            }
        L8:
            f8 r2 = (defpackage.f8) r2
            g8 r2 = r2.R
            d8 r2 = r2.o0
            if (r2 != 0) goto L11
            goto L15
        L11:
            t44 r1 = r2.a()
        L15:
            return r1
        L16:
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            c8 r2 = r2.l0
            if (r2 == 0) goto L28
            e8 r2 = (defpackage.e8) r2
            g8 r2 = r2.a
            d8 r2 = r2.p0
            if (r2 == 0) goto L28
            t44 r1 = r2.a()
        L28:
            return r1
    }

    @Override // defpackage.ik2
    public final boolean c() {
            r3 = this;
            int r0 = r3.f0
            r1 = 1
            android.view.View r2 = r3.g0
            switch(r0) {
                case 0: goto L10;
                default: goto L8;
            }
        L8:
            f8 r2 = (defpackage.f8) r2
            g8 r3 = r2.R
            r3.l()
            return r1
        L10:
            androidx.appcompat.view.menu.ActionMenuItemView r2 = (androidx.appcompat.view.menu.ActionMenuItemView) r2
            h44 r0 = r2.j0
            if (r0 == 0) goto L2b
            o44 r2 = r2.g0
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto L2b
            lh6 r3 = r3.b()
            if (r3 == 0) goto L2b
            boolean r3 = r3.a()
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            return r1
    }

    @Override // defpackage.ik2
    public boolean d() {
            r1 = this;
            int r0 = r1.f0
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.d()
            return r1
        La:
            android.view.View r1 = r1.g0
            f8 r1 = (defpackage.f8) r1
            g8 r1 = r1.R
            uo2 r0 = r1.q0
            if (r0 == 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1.e()
            r1 = 1
        L1a:
            return r1
    }
}
