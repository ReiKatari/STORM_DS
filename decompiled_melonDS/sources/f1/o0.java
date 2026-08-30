package f1;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 extends a4.k implements a4.p {

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f4629k0 = 1;

    /* renamed from: l0  reason: collision with root package name */
    public final i f4630l0;

    /* renamed from: m0  reason: collision with root package name */
    public final i0 f4631m0;

    /* renamed from: n0  reason: collision with root package name */
    public Object f4632n0;

    public o0(v3.h0 h0Var, i iVar, i0 i0Var, l1.d1 d1Var) {
        this.f4630l0 = iVar;
        this.f4631m0 = i0Var;
        this.f4632n0 = d1Var;
        O0(h0Var);
    }

    public static boolean R0(float f8, EdgeEffect edgeEffect, Canvas canvas) {
        if (f8 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f8);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean S0(float f8, long j2, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f8);
        canvas.translate(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode T0() {
        RenderNode renderNode = (RenderNode) this.f4632n0;
        if (renderNode == null) {
            RenderNode e6 = e4.a.e();
            this.f4632n0 = e6;
            return e6;
        }
        return renderNode;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e6  */
    @Override // a4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(a4.r0 r25) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.o0.z(a4.r0):void");
    }

    public o0(v3.h0 h0Var, i iVar, i0 i0Var) {
        this.f4630l0 = iVar;
        this.f4631m0 = i0Var;
        O0(h0Var);
    }
}
