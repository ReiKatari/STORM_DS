package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr0  reason: default package */
/* loaded from: classes.dex */
public final class lr0 extends defpackage.o42 {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public final android.animation.TimeInterpolator h;
    public android.widget.EditText i;
    public final defpackage.hr0 j;
    public final defpackage.ir0 k;
    public android.animation.AnimatorSet l;
    public android.animation.ValueAnimator m;

    public lr0(defpackage.n42 r4) {
            r3 = this;
            r3.<init>(r4)
            hr0 r0 = new hr0
            r1 = 0
            r0.<init>(r3, r1)
            r3.j = r0
            ir0 r0 = new ir0
            r0.<init>(r3, r1)
            r3.k = r0
            android.content.Context r0 = r4.getContext()
            r1 = 100
            r2 = 2130969532(0x7f0403bc, float:1.7547749E38)
            int r0 = defpackage.kj2.W(r0, r2, r1)
            r3.e = r0
            android.content.Context r0 = r4.getContext()
            r1 = 150(0x96, float:2.1E-43)
            int r0 = defpackage.kj2.W(r0, r2, r1)
            r3.f = r0
            android.content.Context r0 = r4.getContext()
            r1 = 2130969541(0x7f0403c5, float:1.7547767E38)
            android.view.animation.LinearInterpolator r2 = defpackage.vo.a
            android.animation.TimeInterpolator r0 = defpackage.kj2.X(r0, r1, r2)
            r3.g = r0
            android.content.Context r4 = r4.getContext()
            r0 = 2130969539(0x7f0403c3, float:1.7547763E38)
            q92 r1 = defpackage.vo.d
            android.animation.TimeInterpolator r4 = defpackage.kj2.X(r4, r0, r1)
            r3.h = r4
            return
    }

    @Override // defpackage.o42
    public final void a() {
            r1 = this;
            n42 r0 = r1.b
            java.lang.CharSequence r0 = r0.o0
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r1.t()
            r1.s(r0)
            return
    }

    @Override // defpackage.o42
    public final int c() {
            r0 = this;
            r0 = 2131951793(0x7f1300b1, float:1.954001E38)
            return r0
    }

    @Override // defpackage.o42
    public final int d() {
            r0 = this;
            r0 = 2131231030(0x7f080136, float:1.807813E38)
            return r0
    }

    @Override // defpackage.o42
    public final android.view.View.OnFocusChangeListener e() {
            r0 = this;
            ir0 r0 = r0.k
            return r0
    }

    @Override // defpackage.o42
    public final android.view.View.OnClickListener f() {
            r0 = this;
            hr0 r0 = r0.j
            return r0
    }

    @Override // defpackage.o42
    public final android.view.View.OnFocusChangeListener g() {
            r0 = this;
            ir0 r0 = r0.k
            return r0
    }

    @Override // defpackage.o42
    public final void l(android.widget.EditText r1) {
            r0 = this;
            r0.i = r1
            com.google.android.material.textfield.TextInputLayout r1 = r0.a
            boolean r0 = r0.t()
            r1.setEndIconVisible(r0)
            return
    }

    @Override // defpackage.o42
    public final void o(boolean r2) {
            r1 = this;
            n42 r0 = r1.b
            java.lang.CharSequence r0 = r0.o0
            if (r0 != 0) goto L7
            return
        L7:
            r1.s(r2)
            return
    }

    @Override // defpackage.o42
    public final void q() {
            r9 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0078: FILL_ARRAY_DATA  , data: [1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            android.animation.TimeInterpolator r2 = r9.h
            r1.setInterpolator(r2)
            int r2 = r9.f
            long r2 = (long) r2
            r1.setDuration(r2)
            jr0 r2 = new jr0
            r3 = 1
            r2.<init>(r9, r3)
            r1.addUpdateListener(r2)
            float[] r2 = new float[r0]
            r2 = {x0080: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.animation.TimeInterpolator r4 = r9.g
            r2.setInterpolator(r4)
            int r5 = r9.e
            long r6 = (long) r5
            r2.setDuration(r6)
            jr0 r6 = new jr0
            r7 = 0
            r6.<init>(r9, r7)
            r2.addUpdateListener(r6)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            r9.l = r6
            android.animation.Animator[] r8 = new android.animation.Animator[r0]
            r8[r7] = r1
            r8[r3] = r2
            r6.playTogether(r8)
            android.animation.AnimatorSet r1 = r9.l
            kr0 r2 = new kr0
            r2.<init>(r9, r7)
            r1.addListener(r2)
            float[] r0 = new float[r0]
            r0 = {x0088: FILL_ARRAY_DATA  , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r0.setInterpolator(r4)
            long r1 = (long) r5
            r0.setDuration(r1)
            jr0 r1 = new jr0
            r1.<init>(r9, r7)
            r0.addUpdateListener(r1)
            r9.m = r0
            kr0 r1 = new kr0
            r1.<init>(r9, r3)
            r0.addListener(r1)
            return
    }

    @Override // defpackage.o42
    public final void r() {
            r3 = this;
            android.widget.EditText r0 = r3.i
            if (r0 == 0) goto Le
            n0 r1 = new n0
            r2 = 11
            r1.<init>(r3, r2)
            r0.post(r1)
        Le:
            return
    }

    public final void s(boolean r3) {
            r2 = this;
            n42 r0 = r2.b
            boolean r0 = r0.d()
            if (r0 != r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r3 == 0) goto L27
            android.animation.AnimatorSet r1 = r2.l
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L27
            android.animation.ValueAnimator r3 = r2.m
            r3.cancel()
            android.animation.AnimatorSet r3 = r2.l
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.AnimatorSet r2 = r2.l
            r2.end()
            return
        L27:
            if (r3 != 0) goto L3a
            android.animation.AnimatorSet r3 = r2.l
            r3.cancel()
            android.animation.ValueAnimator r3 = r2.m
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.ValueAnimator r2 = r2.m
            r2.end()
        L3a:
            return
    }

    public final boolean t() {
            r1 = this;
            android.widget.EditText r0 = r1.i
            if (r0 == 0) goto L20
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L12
            com.google.android.material.internal.CheckableImageButton r0 = r1.d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L20
        L12:
            android.widget.EditText r1 = r1.i
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            if (r1 <= 0) goto L20
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }
}
