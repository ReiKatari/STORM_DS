package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l42  reason: default package */
/* loaded from: classes.dex */
public final class l42 {
    public final /* synthetic */ defpackage.n42 a;

    public l42(defpackage.n42 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final void a(com.google.android.material.textfield.TextInputLayout r4) {
            r3 = this;
            n42 r3 = r3.a
            k42 r0 = r3.u0
            android.widget.EditText r1 = r3.r0
            android.widget.EditText r2 = r4.getEditText()
            if (r1 != r2) goto Ld
            return
        Ld:
            android.widget.EditText r1 = r3.r0
            if (r1 == 0) goto L2a
            r1.removeTextChangedListener(r0)
            android.widget.EditText r1 = r3.r0
            android.view.View$OnFocusChangeListener r1 = r1.getOnFocusChangeListener()
            o42 r2 = r3.b()
            android.view.View$OnFocusChangeListener r2 = r2.e()
            if (r1 != r2) goto L2a
            android.widget.EditText r1 = r3.r0
            r2 = 0
            r1.setOnFocusChangeListener(r2)
        L2a:
            android.widget.EditText r4 = r4.getEditText()
            r3.r0 = r4
            if (r4 == 0) goto L35
            r4.addTextChangedListener(r0)
        L35:
            o42 r4 = r3.b()
            android.widget.EditText r0 = r3.r0
            r4.l(r0)
            o42 r4 = r3.b()
            r3.j(r4)
            return
    }
}
