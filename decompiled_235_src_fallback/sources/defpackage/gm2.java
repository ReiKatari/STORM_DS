package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gm2  reason: default package */
/* loaded from: classes.dex */
public final class gm2 implements defpackage.da7 {
    public final /* synthetic */ android.view.View a;
    public final /* synthetic */ java.util.ArrayList b;

    public gm2(android.view.View r1, java.util.ArrayList r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.da7
    public final void a(defpackage.ea7 r4) {
            r3 = this;
            r4.D(r3)
            android.view.View r4 = r3.a
            r0 = 8
            r4.setVisibility(r0)
            java.util.ArrayList r3 = r3.b
            int r4 = r3.size()
            r0 = 0
            r1 = r0
        L12:
            if (r1 >= r4) goto L20
            java.lang.Object r2 = r3.get(r1)
            android.view.View r2 = (android.view.View) r2
            r2.setVisibility(r0)
            int r1 = r1 + 1
            goto L12
        L20:
            return
    }

    @Override // defpackage.da7
    public final void b() {
            r0 = this;
            return
    }

    @Override // defpackage.da7
    public final void c(defpackage.ea7 r1) {
            r0 = this;
            r1.D(r0)
            r1.a(r0)
            return
    }

    @Override // defpackage.da7
    public final void e() {
            r0 = this;
            return
    }

    @Override // defpackage.da7
    public final void f(defpackage.ea7 r1) {
            r0 = this;
            return
    }
}
