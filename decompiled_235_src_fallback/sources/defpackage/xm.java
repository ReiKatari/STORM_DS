package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xm  reason: default package */
/* loaded from: classes.dex */
public final class xm implements defpackage.fo7 {
    public final android.view.ViewConfiguration a;

    public xm(android.view.ViewConfiguration r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.fo7
    public final long a() {
            r2 = this;
            int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r0 = (long) r2
            return r0
    }

    @Override // defpackage.fo7
    public final long b() {
            r2 = this;
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r2
            return r0
    }

    @Override // defpackage.fo7
    public final float c() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            android.view.ViewConfiguration r2 = r2.a
            int r2 = defpackage.gi.c(r2)
            float r2 = (float) r2
            return r2
        Le:
            r2 = 1073741824(0x40000000, float:2.0)
            return r2
    }

    @Override // defpackage.fo7
    public final float e() {
            r0 = this;
            android.view.ViewConfiguration r0 = r0.a
            int r0 = r0.getScaledMaximumFlingVelocity()
            float r0 = (float) r0
            return r0
    }

    @Override // defpackage.fo7
    public final float f() {
            r0 = this;
            android.view.ViewConfiguration r0 = r0.a
            int r0 = r0.getScaledTouchSlop()
            float r0 = (float) r0
            return r0
    }

    @Override // defpackage.fo7
    public final float g() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Le
            android.view.ViewConfiguration r2 = r2.a
            int r2 = defpackage.gi.u(r2)
            float r2 = (float) r2
            return r2
        Le:
            r2 = 1098907648(0x41800000, float:16.0)
            return r2
    }
}
