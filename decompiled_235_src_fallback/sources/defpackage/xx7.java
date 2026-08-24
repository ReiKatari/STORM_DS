package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx7  reason: default package */
/* loaded from: classes.dex */
public final class xx7 implements defpackage.yx0, defpackage.fu3 {
    public final defpackage.te A;
    public final defpackage.ey0 B;
    public boolean L;
    public defpackage.ut3 R;
    public defpackage.eo2 X;

    public xx7(defpackage.te r1, defpackage.ey0 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            zv0 r1 = defpackage.ow0.a
            r0.X = r1
            return
    }

    public final void a() {
            r3 = this;
            boolean r0 = r3.L
            if (r0 != 0) goto L1d
            r0 = 1
            r3.L = r0
            te r0 = r3.A
            android.view.View r0 = r0.getView()
            r1 = 2131428091(0x7f0b02fb, float:1.8477817E38)
            r2 = 0
            r0.setTag(r1, r2)
            ut3 r0 = r3.R
            if (r0 == 0) goto L1b
            r0.c(r3)
        L1b:
            r3.R = r2
        L1d:
            ey0 r3 = r3.B
            r3.m()
            return
    }

    public final void b(defpackage.eo2 r3) {
            r2 = this;
            qj r0 = new qj
            r1 = 8
            r0.<init>(r1, r2, r3)
            te r2 = r2.A
            r2.setOnReadyForComposition(r0)
            return
    }

    @Override // defpackage.fu3
    public final void h(defpackage.hu3 r1, defpackage.st3 r2) {
            r0 = this;
            st3 r1 = defpackage.st3.ON_DESTROY
            if (r2 != r1) goto L8
            r0.a()
            return
        L8:
            st3 r1 = defpackage.st3.ON_CREATE
            if (r2 != r1) goto L15
            boolean r1 = r0.L
            if (r1 != 0) goto L15
            eo2 r1 = r0.X
            r0.b(r1)
        L15:
            return
    }
}
