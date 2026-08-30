package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ou2  reason: default package */
/* loaded from: classes.dex */
public final class ou2 extends q00 {
    public final /* synthetic */ int B;
    public final ip4 L;
    public boolean R;

    public ou2(qu2 qu2Var, int i) {
        this.B = i;
        switch (i) {
            case 1:
                qu2Var.getClass();
                this.A = qu2Var;
                this.L = new ip4(0, 0);
                return;
            default:
                qu2Var.getClass();
                this.A = qu2Var;
                this.L = new ip4(0, 0);
                return;
        }
    }

    public ip4 a(MotionEvent motionEvent, int i, int i2) {
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        int pointerCount = motionEvent.getPointerCount();
        float f = RecyclerView.A1;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            motionEvent.getPointerCoords(i3, pointerCoords);
            f += pointerCoords.x;
            f2 += pointerCoords.y;
        }
        float pointerCount2 = f2 / motionEvent.getPointerCount();
        int m = io2.m((int) (((f / motionEvent.getPointerCount()) / i) * 256.0f), 0, 255);
        ip4 ip4Var = this.L;
        ip4Var.a = m;
        ip4Var.b = io2.m((int) ((pointerCount2 / i2) * 192.0f), 0, 191);
        return ip4Var;
    }

    public ip4 b(MotionEvent motionEvent, int i, int i2, float f) {
        int pointerCount = motionEvent.getPointerCount();
        float f2 = RecyclerView.A1;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            f3 += motionEvent.getX(i3);
        }
        float pointerCount2 = f3 / motionEvent.getPointerCount();
        int pointerCount3 = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount3; i4++) {
            f2 += motionEvent.getY(i4);
        }
        float pointerCount4 = f2 / motionEvent.getPointerCount();
        float f4 = i2 - f;
        if (f4 < 1.0f) {
            f4 = 1.0f;
        }
        int m = io2.m((int) ((pointerCount2 / i) * 256.0f), 0, 255);
        ip4 ip4Var = this.L;
        ip4Var.a = m;
        ip4Var.b = io2.m((int) (((pointerCount4 - f) / f4) * 192.0f), 0, 191);
        return ip4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
        if (r8 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r6 != 3) goto L8;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            int r0 = r10.B
            r1 = 0
            me.magnum.melonds.MelonEmulator r2 = me.magnum.melonds.MelonEmulator.a
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r0) {
                case 0: goto L5a;
                default: goto Lb;
            }
        Lb:
            qu2 r0 = r10.A
            r11.getClass()
            r12.getClass()
            int r6 = r12.getActionMasked()
            if (r6 == 0) goto L43
            if (r6 == r5) goto L34
            if (r6 == r4) goto L20
            if (r6 == r3) goto L34
            goto L59
        L20:
            boolean r1 = r10.R
            if (r1 == 0) goto L59
            int r1 = r11.getWidth()
            int r11 = r11.getHeight()
            ip4 r10 = r10.a(r12, r1, r11)
            r0.a(r10)
            goto L59
        L34:
            boolean r11 = r10.R
            if (r11 == 0) goto L59
            yz2 r11 = defpackage.yz2.TOUCHSCREEN
            r0.b(r11)
            r2.onScreenRelease()
            r10.R = r1
            goto L59
        L43:
            r10.R = r5
            yz2 r1 = defpackage.yz2.TOUCHSCREEN
            r0.c(r1)
            int r1 = r11.getWidth()
            int r11 = r11.getHeight()
            ip4 r10 = r10.a(r12, r1, r11)
            r0.a(r10)
        L59:
            return r5
        L5a:
            qu2 r0 = r10.A
            r11.getClass()
            r12.getClass()
            int r6 = r12.getPointerCount()
            r7 = 0
            r8 = r1
        L68:
            if (r8 >= r6) goto L72
            float r9 = r12.getY(r8)
            float r7 = r7 + r9
            int r8 = r8 + 1
            goto L68
        L72:
            int r6 = r12.getPointerCount()
            float r6 = (float) r6
            float r7 = r7 / r6
            int r6 = r11.getHeight()
            float r6 = (float) r6
            r8 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r8
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 < 0) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r1
        L87:
            int r8 = r12.getActionMasked()
            if (r8 == 0) goto Lb7
            if (r8 == r5) goto La8
            if (r8 == r4) goto L94
            if (r8 == r3) goto La8
            goto Ld0
        L94:
            boolean r1 = r10.R
            if (r1 == 0) goto Ld0
            int r1 = r11.getWidth()
            int r11 = r11.getHeight()
            ip4 r10 = r10.b(r12, r1, r11, r6)
            r0.a(r10)
            goto Ld0
        La8:
            boolean r11 = r10.R
            if (r11 == 0) goto Ld0
            yz2 r11 = defpackage.yz2.TOUCHSCREEN
            r0.b(r11)
            r2.onScreenRelease()
            r10.R = r1
            goto Ld0
        Lb7:
            if (r7 != 0) goto Lba
            goto Ld0
        Lba:
            r10.R = r5
            yz2 r1 = defpackage.yz2.TOUCHSCREEN
            r0.c(r1)
            int r1 = r11.getWidth()
            int r11 = r11.getHeight()
            ip4 r10 = r10.b(r12, r1, r11, r6)
            r0.a(r10)
        Ld0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ou2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
