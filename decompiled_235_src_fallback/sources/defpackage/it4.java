package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: it4  reason: default package */
/* loaded from: classes.dex */
public final class it4 extends defpackage.o42 {
    public final int e;
    public android.widget.EditText f;
    public final defpackage.hr0 g;

    public it4(defpackage.n42 r2, int r3) {
            r1 = this;
            r1.<init>(r2)
            r2 = 2131230920(0x7f0800c8, float:1.8077906E38)
            r1.e = r2
            hr0 r2 = new hr0
            r0 = 4
            r2.<init>(r1, r0)
            r1.g = r2
            if (r3 == 0) goto L14
            r1.e = r3
        L14:
            return
    }

    @Override // defpackage.o42
    public final void b() {
            r0 = this;
            r0.p()
            return
    }

    @Override // defpackage.o42
    public final int c() {
            r0 = this;
            r0 = 2131952361(0x7f1302e9, float:1.9541163E38)
            return r0
    }

    @Override // defpackage.o42
    public final int d() {
            r0 = this;
            int r0 = r0.e
            return r0
    }

    @Override // defpackage.o42
    public final android.view.View.OnClickListener f() {
            r0 = this;
            hr0 r0 = r0.g
            return r0
    }

    @Override // defpackage.o42
    public final boolean j() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.o42
    public final boolean k() {
            r1 = this;
            android.widget.EditText r1 = r1.f
            r0 = 1
            if (r1 == 0) goto Lf
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            boolean r1 = r1 instanceof android.text.method.PasswordTransformationMethod
            if (r1 == 0) goto Lf
            r1 = r0
            goto L10
        Lf:
            r1 = 0
        L10:
            r1 = r1 ^ r0
            return r1
    }

    @Override // defpackage.o42
    public final void l(android.widget.EditText r1) {
            r0 = this;
            r0.f = r1
            r0.p()
            return
    }

    @Override // defpackage.o42
    public final void q() {
            r3 = this;
            android.widget.EditText r0 = r3.f
            if (r0 == 0) goto L2d
            int r1 = r0.getInputType()
            r2 = 16
            if (r1 == r2) goto L24
            int r1 = r0.getInputType()
            r2 = 128(0x80, float:1.8E-43)
            if (r1 == r2) goto L24
            int r1 = r0.getInputType()
            r2 = 144(0x90, float:2.02E-43)
            if (r1 == r2) goto L24
            int r0 = r0.getInputType()
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 != r1) goto L2d
        L24:
            android.widget.EditText r3 = r3.f
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            r3.setTransformationMethod(r0)
        L2d:
            return
    }

    @Override // defpackage.o42
    public final void r() {
            r1 = this;
            android.widget.EditText r1 = r1.f
            if (r1 == 0) goto Lb
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            r1.setTransformationMethod(r0)
        Lb:
            return
    }
}
