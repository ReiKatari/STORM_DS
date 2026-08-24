package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx2  reason: default package */
/* loaded from: classes.dex */
public abstract class tx2 extends androidx.fragment.app.o implements defpackage.kr2 {
    public defpackage.bo7 A;
    public boolean B;
    public volatile defpackage.mt L;
    public final java.lang.Object R;
    public boolean X;

    public tx2() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.B = r0
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r2.R = r1
            r2.X = r0
            return
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r2 = this;
            mt r0 = r2.L
            if (r0 != 0) goto L19
            java.lang.Object r0 = r2.R
            monitor-enter(r0)
            mt r1 = r2.L     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            mt r1 = new mt     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r2.L = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            mt r2 = r2.L
            java.lang.Object r2 = r2.c()
            return r2
    }

    @Override // androidx.fragment.app.o
    public final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = super.getContext()
            if (r0 != 0) goto Lc
            boolean r0 = r1.B
            if (r0 != 0) goto Lc
            r1 = 0
            return r1
        Lc:
            r1.h()
            bo7 r1 = r1.A
            return r1
    }

    @Override // androidx.fragment.app.o, defpackage.mw2
    public final defpackage.yo7 getDefaultViewModelProviderFactory() {
            r1 = this;
            yo7 r0 = super.getDefaultViewModelProviderFactory()
            qx2 r1 = defpackage.hf.T(r1, r0)
            return r1
    }

    public final void h() {
            r2 = this;
            bo7 r0 = r2.A
            if (r0 != 0) goto L19
            android.content.Context r0 = super.getContext()
            bo7 r1 = new bo7
            r1.<init>(r0, r2)
            r2.A = r1
            android.content.Context r0 = super.getContext()
            boolean r0 = defpackage.bl2.I(r0)
            r2.B = r0
        L19:
            return
    }

    public final void i() {
            r2 = this;
            boolean r0 = r2.X
            if (r0 != 0) goto L25
            r0 = 1
            r2.X = r0
            java.lang.Object r0 = r2.c()
            yy5 r0 = (defpackage.yy5) r0
            me.magnum.melonds.ui.romlist.a r2 = (me.magnum.melonds.ui.romlist.a) r2
            qb1 r0 = (defpackage.qb1) r0
            sb1 r0 = r0.a
            m55 r1 = r0.s
            java.lang.Object r1 = r1.get()
            kd6 r1 = (defpackage.kd6) r1
            m55 r0 = r0.N
            java.lang.Object r0 = r0.get()
            l06 r0 = (defpackage.l06) r0
            r2.Y = r0
        L25:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(android.app.Activity r3) {
            r2 = this;
            super.onAttach(r3)
            bo7 r0 = r2.A
            r1 = 0
            if (r0 == 0) goto L11
            android.content.Context r0 = defpackage.mt.d(r0)
            if (r0 != r3) goto Lf
            goto L11
        Lf:
            r3 = r1
            goto L12
        L11:
            r3 = 1
        L12:
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            java.lang.Object[] r1 = new java.lang.Object[r1]
            defpackage.qo2.o(r3, r0, r1)
            r2.h()
            r2.i()
            return
    }

    @Override // androidx.fragment.app.o
    public final void onAttach(android.content.Context r1) {
            r0 = this;
            super.onAttach(r1)
            r0.h()
            r0.i()
            return
    }

    @Override // androidx.fragment.app.o
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r2) {
            r1 = this;
            android.view.LayoutInflater r2 = super.onGetLayoutInflater(r2)
            bo7 r0 = new bo7
            r0.<init>(r2, r1)
            android.view.LayoutInflater r1 = r2.cloneInContext(r0)
            return r1
    }
}
