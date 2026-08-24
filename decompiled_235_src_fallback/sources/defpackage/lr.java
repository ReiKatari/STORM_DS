package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr  reason: default package */
/* loaded from: classes.dex */
public final class lr {
    public final android.widget.TextView a;
    public final defpackage.d51 b;

    public lr(android.widget.TextView r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            d51 r0 = new d51
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public final android.text.InputFilter[] a(android.text.InputFilter[] r1) {
            r0 = this;
            d51 r0 = r0.b
            java.lang.Object r0 = r0.B
            jw2 r0 = (defpackage.jw2) r0
            android.text.InputFilter[] r0 = r0.s(r1)
            return r0
    }

    public final void b(android.util.AttributeSet r4, int r5) {
            r3 = this;
            android.widget.TextView r0 = r3.a
            android.content.Context r0 = r0.getContext()
            int[] r1 = defpackage.m75.i
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            r5 = 14
            boolean r0 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r0 == 0) goto L1d
            boolean r1 = r4.getBoolean(r5, r1)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r3 = move-exception
            goto L24
        L1d:
            r4.recycle()
            r3.d(r1)
            return
        L24:
            r4.recycle()
            throw r3
    }

    public final void c(boolean r1) {
            r0 = this;
            d51 r0 = r0.b
            java.lang.Object r0 = r0.B
            jw2 r0 = (defpackage.jw2) r0
            r0.A(r1)
            return
    }

    public final void d(boolean r1) {
            r0 = this;
            d51 r0 = r0.b
            java.lang.Object r0 = r0.B
            jw2 r0 = (defpackage.jw2) r0
            r0.B(r1)
            return
    }
}
