package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hd3  reason: default package */
/* loaded from: classes.dex */
public final class hd3 {
    public final View a;
    public final vc3 b;
    public float c;
    public boolean d;

    public hd3(View view, vc3 vc3Var) {
        view.getClass();
        vc3Var.getClass();
        this.a = view;
        this.b = vc3Var;
        this.c = 1.0f;
    }

    public final ip4 a() {
        ip4 ip4Var = new ip4(0, 0);
        View view = this.a;
        ip4Var.a = (int) view.getX();
        ip4Var.b = (int) view.getY();
        return ip4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final me.magnum.melonds.domain.model.Rect b() {
        /*
            r6 = this;
            android.view.View r6 = r6.a
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto Ld
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            int r1 = r6.getWidth()
            int r2 = r6.getHeight()
            r3 = 0
            if (r1 <= 0) goto L1b
            r4 = r1
            goto L22
        L1b:
            if (r0 == 0) goto L21
            int r4 = r0.width
            if (r4 >= 0) goto L22
        L21:
            r4 = r3
        L22:
            if (r2 <= 0) goto L26
            r3 = r2
            goto L2e
        L26:
            if (r0 == 0) goto L2e
            int r5 = r0.height
            if (r5 >= 0) goto L2d
            goto L2e
        L2d:
            r3 = r5
        L2e:
            if (r1 <= 0) goto L36
            float r1 = r6.getX()
        L34:
            int r1 = (int) r1
            goto L40
        L36:
            if (r0 == 0) goto L3b
            int r1 = r0.leftMargin
            goto L40
        L3b:
            float r1 = r6.getX()
            goto L34
        L40:
            if (r2 <= 0) goto L48
            float r6 = r6.getY()
        L46:
            int r6 = (int) r6
            goto L52
        L48:
            if (r0 == 0) goto L4d
            int r6 = r0.topMargin
            goto L52
        L4d:
            float r6 = r6.getY()
            goto L46
        L52:
            me.magnum.melonds.domain.model.Rect r0 = new me.magnum.melonds.domain.model.Rect
            r0.<init>(r1, r6, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd3.b():me.magnum.melonds.domain.model.Rect");
    }

    public final void c(boolean z) {
        this.a.setSelected(z);
    }
}
