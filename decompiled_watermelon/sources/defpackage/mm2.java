package defpackage;

import android.graphics.Canvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mm2  reason: default package */
/* loaded from: classes.dex */
public final class mm2 extends xc1 implements gk1 {
    public final /* synthetic */ int l0 = 1;
    public final eg m0;
    public final gn1 n0;
    public Object o0;

    public mm2(uk6 uk6Var, eg egVar, gn1 gn1Var, ih4 ih4Var) {
        this.m0 = egVar;
        this.n0 = gn1Var;
        this.o0 = ih4Var;
        R0(uk6Var);
    }

    public static boolean U0(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == RecyclerView.A1) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean V0(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02e0  */
    @Override // defpackage.gk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(defpackage.xf3 r26) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mm2.T(xf3):void");
    }

    public RenderNode W0() {
        RenderNode renderNode = (RenderNode) this.o0;
        if (renderNode == null) {
            RenderNode c = zq4.c();
            this.o0 = c;
            return c;
        }
        return renderNode;
    }

    public mm2(uk6 uk6Var, eg egVar, gn1 gn1Var) {
        this.m0 = egVar;
        this.n0 = gn1Var;
        R0(uk6Var);
    }
}
