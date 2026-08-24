package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pa7  reason: default package */
/* loaded from: classes.dex */
public final class pa7 extends defpackage.la7 {
    public final /* synthetic */ int a;
    public defpackage.ea7 b;

    public /* synthetic */ pa7() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            return
    }

    public /* synthetic */ pa7(defpackage.ea7 r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.la7, defpackage.da7
    public void a(defpackage.ea7 r3) {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 1: goto Lf;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            ea7 r0 = r2.b
            r0.G()
            r3.D(r2)
            return
        Lf:
            ea7 r0 = r2.b
            qa7 r0 = (defpackage.qa7) r0
            int r1 = r0.C0
            int r1 = r1 + (-1)
            r0.C0 = r1
            if (r1 != 0) goto L21
            r1 = 0
            r0.D0 = r1
            r0.n()
        L21:
            r3.D(r2)
            return
    }

    @Override // defpackage.la7, defpackage.da7
    public void c(defpackage.ea7 r1) {
            r0 = this;
            int r1 = r0.a
            switch(r1) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            ea7 r0 = r0.b
            qa7 r0 = (defpackage.qa7) r0
            boolean r1 = r0.D0
            if (r1 != 0) goto L14
            r0.O()
            r1 = 1
            r0.D0 = r1
        L14:
            return
    }

    @Override // defpackage.la7, defpackage.da7
    public void f(defpackage.ea7 r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            ea7 r1 = r1.b
            qa7 r1 = (defpackage.qa7) r1
            java.util.ArrayList r0 = r1.A0
            r0.remove(r2)
            boolean r2 = r1.u()
            if (r2 != 0) goto L23
            fa6 r2 = defpackage.fa6.R
            r0 = 0
            r1.A(r1, r2, r0)
            r2 = 1
            r1.n0 = r2
            fa6 r2 = defpackage.fa6.L
            r1.A(r1, r2, r0)
        L23:
            return
    }
}
