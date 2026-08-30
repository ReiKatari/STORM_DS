package h5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y implements View.OnClickListener {
    public final z A;
    public final int B;
    public final int L;

    public y(Context context, z zVar, XmlResourceParser xmlResourceParser) {
        this.B = -1;
        this.L = 17;
        this.A = zVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), i5.v.f7005n);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
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
    public final void a(MotionLayout motionLayout, int i2, z zVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = this.B;
        MotionLayout motionLayout2 = motionLayout;
        if (i10 != -1) {
            motionLayout2 = motionLayout.findViewById(i10);
        }
        if (motionLayout2 == null) {
            Log.e("MotionScene", "OnClick could not find id " + i10);
            return;
        }
        int i11 = zVar.f6275d;
        int i12 = zVar.f6274c;
        if (i11 == -1) {
            motionLayout2.setOnClickListener(this);
            return;
        }
        int i13 = this.L;
        int i14 = i13 & 1;
        boolean z14 = false;
        if (i14 != 0 && i2 == i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i13 & 256) != 0 && i2 == i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z15 = z10 | z11;
        if (i14 != 0 && i2 == i11) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z16 = z12 | z15;
        if ((i13 & 16) != 0 && i2 == i12) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z17 = z16 | z13;
        if ((i13 & 4096) != 0 && i2 == i12) {
            z14 = true;
        }
        if (z17 | z14) {
            motionLayout2.setOnClickListener(this);
        }
    }

    public final void b(MotionLayout motionLayout) {
        int i2 = this.B;
        if (i2 == -1) {
            return;
        }
        View findViewById = motionLayout.findViewById(i2);
        if (findViewById == null) {
            Log.e("MotionScene", " (*)  could not find id " + i2);
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
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            h5.z r14 = r13.A
            androidx.constraintlayout.motion.widget.b r0 = r14.f6281j
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f1109a
            boolean r2 = r1.f1100w0
            if (r2 != 0) goto Lc
            goto Lb4
        Lc:
            int r2 = r14.f6275d
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = -1
            if (r2 != r5) goto L34
            int r2 = r1.getCurrentState()
            if (r2 != r5) goto L20
            int r14 = r14.f6274c
            r1.z(r14)
            return
        L20:
            h5.z r5 = new h5.z
            r5.<init>(r0, r14)
            r5.f6275d = r2
            int r14 = r14.f6274c
            r5.f6274c = r14
            r1.setTransition(r5)
            r1.p(r4)
            r1.f1083i1 = r3
            return
        L34:
            h5.z r0 = r0.f1111c
            int r2 = r13.L
            r6 = r2 & 1
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L45
            r9 = r2 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L43
            goto L45
        L43:
            r9 = r7
            goto L46
        L45:
            r9 = r8
        L46:
            r10 = r2 & 16
            if (r10 != 0) goto L50
            r11 = r2 & 4096(0x1000, float:5.74E-42)
            if (r11 == 0) goto L4f
            goto L50
        L4f:
            r8 = r7
        L50:
            if (r9 == 0) goto L6f
            if (r8 == 0) goto L6f
            if (r0 == r14) goto L59
            r1.setTransition(r14)
        L59:
            int r11 = r1.getCurrentState()
            int r12 = r1.getEndState()
            if (r11 == r12) goto L70
            float r11 = r1.getProgress()
            r12 = 1056964608(0x3f000000, float:0.5)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L6e
            goto L70
        L6e:
            r8 = r7
        L6f:
            r7 = r9
        L70:
            if (r14 != r0) goto L73
            goto L82
        L73:
            int r0 = r14.f6274c
            int r9 = r14.f6275d
            int r11 = r1.f1096s0
            if (r9 != r5) goto L7e
            if (r11 == r0) goto Lb4
            goto L82
        L7e:
            if (r11 == r9) goto L82
            if (r11 != r0) goto Lb4
        L82:
            if (r7 == 0) goto L8f
            if (r6 == 0) goto L8f
            r1.setTransition(r14)
            r1.p(r4)
            r1.f1083i1 = r3
            return
        L8f:
            r0 = 0
            if (r8 == 0) goto L9b
            if (r10 == 0) goto L9b
            r1.setTransition(r14)
            r1.p(r0)
            return
        L9b:
            if (r7 == 0) goto La8
            r3 = r2 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto La8
            r1.setTransition(r14)
            r1.setProgress(r4)
            return
        La8:
            if (r8 == 0) goto Lb4
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto Lb4
            r1.setTransition(r14)
            r1.setProgress(r0)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.y.onClick(android.view.View):void");
    }
}
