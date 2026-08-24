package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qg5  reason: default package */
/* loaded from: classes.dex */
public final class qg5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public android.view.animation.Interpolator e;
    public boolean f;
    public int g;

    public final void a(androidx.recyclerview.widget.RecyclerView r7) {
            r6 = this;
            int r0 = r6.d
            r1 = 0
            if (r0 < 0) goto Le
            r2 = -1
            r6.d = r2
            r7.R(r0)
            r6.f = r1
            return
        Le:
            boolean r0 = r6.f
            if (r0 == 0) goto L48
            android.view.animation.Interpolator r0 = r6.e
            r2 = 1
            if (r0 == 0) goto L22
            int r3 = r6.c
            if (r3 < r2) goto L1c
            goto L22
        L1c:
            java.lang.String r6 = "If you provide an interpolator, you must set a positive duration"
            defpackage.i.m(r6)
            return
        L22:
            int r3 = r6.c
            if (r3 < r2) goto L42
            vg5 r7 = r7.a1
            int r4 = r6.a
            int r5 = r6.b
            r7.c(r4, r5, r3, r0)
            int r7 = r6.g
            int r7 = r7 + r2
            r6.g = r7
            r0 = 10
            if (r7 <= r0) goto L3f
            java.lang.String r7 = "RecyclerView"
            java.lang.String r0 = "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"
            android.util.Log.e(r7, r0)
        L3f:
            r6.f = r1
            return
        L42:
            java.lang.String r6 = "Scroll duration must be a positive number"
            defpackage.i.m(r6)
            return
        L48:
            r6.g = r1
            return
    }
}
