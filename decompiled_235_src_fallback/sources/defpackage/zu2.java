package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu2  reason: default package */
/* loaded from: classes.dex */
public final class zu2 extends android.view.View {
    public boolean A;

    public zu2(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1
            r0.A = r1
            r1 = 8
            super.setVisibility(r1)
            return
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas r1) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r1 = 0
            r0.setMeasuredDimension(r1, r1)
            return
    }

    public void setFilterRedundantCalls(boolean r1) {
            r0 = this;
            r0.A = r1
            return
    }

    public void setGuidelineBegin(int r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            o11 r0 = (defpackage.o11) r0
            boolean r1 = r2.A
            if (r1 == 0) goto Lf
            int r1 = r0.a
            if (r1 != r3) goto Lf
            return
        Lf:
            r0.a = r3
            r2.setLayoutParams(r0)
            return
    }

    public void setGuidelineEnd(int r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            o11 r0 = (defpackage.o11) r0
            boolean r1 = r2.A
            if (r1 == 0) goto Lf
            int r1 = r0.b
            if (r1 != r3) goto Lf
            return
        Lf:
            r0.b = r3
            r2.setLayoutParams(r0)
            return
    }

    public void setGuidelinePercent(float r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            o11 r0 = (defpackage.o11) r0
            boolean r1 = r2.A
            if (r1 == 0) goto L11
            float r1 = r0.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L11
            return
        L11:
            r0.c = r3
            r2.setLayoutParams(r0)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            return
    }
}
