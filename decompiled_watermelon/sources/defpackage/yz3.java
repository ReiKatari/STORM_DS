package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yz3  reason: default package */
/* loaded from: classes.dex */
public final class yz3 implements View.OnClickListener {
    public final zz3 A;
    public final int B;
    public final int L;

    public yz3(Context context, zz3 zz3Var, XmlResourceParser xmlResourceParser) {
        this.B = -1;
        this.L = 17;
        this.A = zz3Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), tx4.n);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.B = obtainStyledAttributes.getResourceId(index, this.B);
            } else if (index == 0) {
                this.L = obtainStyledAttributes.getInt(index, this.L);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
    public final void a(MotionLayout motionLayout, int i, zz3 zz3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = this.B;
        MotionLayout motionLayout2 = motionLayout;
        if (i2 != -1) {
            motionLayout2 = motionLayout.findViewById(i2);
        }
        if (motionLayout2 == null) {
            Log.e("MotionScene", "OnClick could not find id " + i2);
            return;
        }
        int i3 = zz3Var.d;
        int i4 = zz3Var.c;
        if (i3 == -1) {
            motionLayout2.setOnClickListener(this);
            return;
        }
        int i5 = this.L;
        int i6 = i5 & 1;
        boolean z5 = false;
        if (i6 != 0 && i == i3) {
            z = true;
        } else {
            z = false;
        }
        if ((i5 & 256) != 0 && i == i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if (i6 != 0 && i == i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z3 | z6;
        if ((i5 & 16) != 0 && i == i4) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z8 = z7 | z4;
        if ((i5 & 4096) != 0 && i == i4) {
            z5 = true;
        }
        if (z8 | z5) {
            motionLayout2.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i = this.B;
        if (i == -1) {
            return;
        }
        View findViewById = motionLayout.findViewById(i);
        if (findViewById == null) {
            Log.e("MotionScene", " (*)  could not find id " + i);
            return;
        }
        findViewById.setOnClickListener(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            zz3 r13 = r12.A
            androidx.constraintlayout.motion.widget.b r0 = r13.j
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.a
            boolean r2 = r1.x0
            if (r2 != 0) goto Lc
            goto Lb4
        Lc:
            int r2 = r13.d
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1
            if (r2 != r5) goto L34
            int r12 = r1.getCurrentState()
            if (r12 != r5) goto L20
            int r12 = r13.c
            r1.z(r12)
            return
        L20:
            zz3 r2 = new zz3
            r2.<init>(r0, r13)
            r2.d = r12
            int r12 = r13.c
            r2.c = r12
            r1.setTransition(r2)
            r1.p(r4)
            r1.j1 = r3
            return
        L34:
            zz3 r0 = r0.c
            int r12 = r12.L
            r2 = r12 & 1
            r6 = 0
            r7 = 1
            if (r2 != 0) goto L45
            r8 = r12 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L43
            goto L45
        L43:
            r8 = r6
            goto L46
        L45:
            r8 = r7
        L46:
            r9 = r12 & 16
            if (r9 != 0) goto L50
            r10 = r12 & 4096(0x1000, float:5.74E-42)
            if (r10 == 0) goto L4f
            goto L50
        L4f:
            r7 = r6
        L50:
            if (r8 == 0) goto L6f
            if (r7 == 0) goto L6f
            if (r0 == r13) goto L59
            r1.setTransition(r13)
        L59:
            int r10 = r1.getCurrentState()
            int r11 = r1.getEndState()
            if (r10 == r11) goto L70
            float r10 = r1.getProgress()
            r11 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L6e
            goto L70
        L6e:
            r7 = r6
        L6f:
            r6 = r8
        L70:
            if (r13 != r0) goto L73
            goto L82
        L73:
            int r0 = r13.c
            int r8 = r13.d
            int r10 = r1.t0
            if (r8 != r5) goto L7e
            if (r10 == r0) goto Lb4
            goto L82
        L7e:
            if (r10 == r8) goto L82
            if (r10 != r0) goto Lb4
        L82:
            if (r6 == 0) goto L8f
            if (r2 == 0) goto L8f
            r1.setTransition(r13)
            r1.p(r4)
            r1.j1 = r3
            return
        L8f:
            r0 = 0
            if (r7 == 0) goto L9b
            if (r9 == 0) goto L9b
            r1.setTransition(r13)
            r1.p(r0)
            return
        L9b:
            if (r6 == 0) goto La8
            r2 = r12 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto La8
            r1.setTransition(r13)
            r1.setProgress(r4)
            return
        La8:
            if (r7 == 0) goto Lb4
            r12 = r12 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto Lb4
            r1.setTransition(r13)
            r1.setProgress(r0)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz3.onClick(android.view.View):void");
    }
}
