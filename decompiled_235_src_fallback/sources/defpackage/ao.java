package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ao  reason: default package */
/* loaded from: classes.dex */
public final class ao implements android.graphics.drawable.Drawable.Callback {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ ao(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r2 = r2.B
            switch(r0) {
                case 0: goto L50;
                default: goto L7;
            }
        L7:
            r3.getClass()
            uo1 r2 = (defpackage.uo1) r2
            vs4 r3 = r2.Y
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.setValue(r0)
            android.graphics.drawable.Drawable r3 = r2.X
            go3 r0 = defpackage.vo1.a
            int r0 = r3.getIntrinsicWidth()
            if (r0 < 0) goto L40
            int r0 = r3.getIntrinsicHeight()
            if (r0 < 0) goto L40
            int r0 = r3.getIntrinsicWidth()
            float r0 = (float) r0
            int r3 = r3.getIntrinsicHeight()
            float r3 = (float) r3
            long r0 = defpackage.ii2.n(r0, r3)
            goto L45
        L40:
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L45:
            vs4 r2 = r2.Z
            xi6 r3 = new xi6
            r3.<init>(r0)
            r2.setValue(r3)
            return
        L50:
            eo r2 = (defpackage.eo) r2
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3, long r4) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            r2.getClass()
            r3.getClass()
            go3 r1 = defpackage.vo1.a
            java.lang.Object r1 = r1.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            r1.postAtTime(r3, r4)
            return
        L17:
            java.lang.Object r1 = r1.B
            eo r1 = (defpackage.eo) r1
            r1.scheduleSelf(r3, r4)
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(android.graphics.drawable.Drawable r2, java.lang.Runnable r3) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            r2.getClass()
            r3.getClass()
            go3 r1 = defpackage.vo1.a
            java.lang.Object r1 = r1.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            r1.removeCallbacks(r3)
            return
        L17:
            java.lang.Object r1 = r1.B
            eo r1 = (defpackage.eo) r1
            r1.unscheduleSelf(r3)
            return
    }
}
