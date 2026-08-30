package b4;

import android.view.Choreographer;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a1 implements cc.e {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    /* JADX WARN: Type inference failed for: r2v1, types: [e9.a, java.lang.Object] */
    public a1(a1 a1Var) {
        this.A = 2;
        this.B = a1Var;
        ?? obj = new Object();
        obj.f4415b = new Object();
        obj.f4416c = new ArrayList();
        obj.f4417d = new ArrayList();
        obj.f4414a = true;
        this.L = obj;
    }

    @Override // cc.g
    public final cc.g H(cc.g gVar) {
        switch (this.A) {
            case 0:
                return pc.a.G(this, gVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                return pc.a.G(this, gVar);
            default:
                return pc.a.G(this, gVar);
        }
    }

    @Override // cc.g
    public final Object L(Object obj, mc.p pVar) {
        switch (this.A) {
            case 0:
                return pVar.j(obj, this);
            case DSiCameraSource.FrontCamera /* 1 */:
                return pVar.j(obj, this);
            default:
                return pVar.j(obj, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
        if (r10 == r4) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v1, types: [v2.b, n2.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mc.l r9, cc.c r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.a1.a(mc.l, cc.c):java.lang.Object");
    }

    @Override // cc.e
    public cc.f getKey() {
        return n2.e.L;
    }

    @Override // cc.g
    public final cc.g m(cc.f fVar) {
        switch (this.A) {
            case 0:
                return pc.a.F(this, fVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                return pc.a.F(this, fVar);
            default:
                return pc.a.F(this, fVar);
        }
    }

    @Override // cc.g
    public final cc.e t(cc.f fVar) {
        switch (this.A) {
            case 0:
                return pc.a.w(this, fVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                return pc.a.w(this, fVar);
            default:
                return pc.a.w(this, fVar);
        }
    }

    public a1(Choreographer choreographer, y0 y0Var) {
        this.A = 0;
        this.B = choreographer;
        this.L = y0Var;
    }

    public a1(n2.q1 q1Var) {
        this.A = 1;
        this.B = q1Var;
        this.L = new a7.v(9);
    }
}
