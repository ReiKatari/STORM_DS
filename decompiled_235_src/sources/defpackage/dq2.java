package defpackage;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq2  reason: default package */
/* loaded from: classes.dex */
public final class dq2 extends hw6 implements eo2 {
    public int X;
    public int Y;
    public int Z;
    public final /* synthetic */ hq2 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq2(hq2 hq2Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = hq2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((dq2) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new dq2(this.d0, r41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
        if (r6 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ba, code lost:
        if (r0 != r1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bc, code lost:
        return r1;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i;
        int height;
        Object N;
        Object N2;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.Z;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    oi2.Y(obj);
                    N2 = obj;
                    Bitmap bitmap = (Bitmap) N2;
                    if (bitmap == null) {
                        return null;
                    }
                    return bitmap;
                }
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            height = this.Y;
            int i3 = this.X;
            oi2.Y(obj);
            i = i3;
            N = obj;
        } else {
            oi2.Y(obj);
            hq2 hq2Var = this.d0;
            SurfaceView surfaceView = (SurfaceView) hq2Var.b.c();
            View decorView = hq2Var.a.getWindow().getDecorView();
            decorView.getClass();
            int width = decorView.getWidth();
            if (width < 1) {
                i = 1;
            } else {
                i = width;
            }
            height = decorView.getHeight();
            if (height < 1) {
                height = 1;
            }
            if (surfaceView.getHolder().getSurface().isValid() && surfaceView.getWidth() > 0 && surfaceView.getHeight() > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                createBitmap.getClass();
                u12 u12Var = new u12(surfaceView, createBitmap, hq2Var, (r41) null, 9);
                this.X = i;
                this.Y = height;
                this.Z = 1;
                N = xk2.N(400L, u12Var, this);
            }
            int i4 = i;
            Bitmap createBitmap2 = Bitmap.createBitmap(i4, height, Bitmap.Config.ARGB_8888);
            createBitmap2.getClass();
            cq2 cq2Var = new cq2(i4, height, this.d0, createBitmap2, null);
            this.X = i4;
            this.Y = height;
            this.Z = 2;
            N2 = xk2.N(400L, cq2Var, this);
        }
        Bitmap bitmap2 = (Bitmap) N;
        if (bitmap2 != null) {
            return bitmap2;
        }
        int i42 = i;
        Bitmap createBitmap22 = Bitmap.createBitmap(i42, height, Bitmap.Config.ARGB_8888);
        createBitmap22.getClass();
        cq2 cq2Var2 = new cq2(i42, height, this.d0, createBitmap22, null);
        this.X = i42;
        this.Y = height;
        this.Z = 2;
        N2 = xk2.N(400L, cq2Var2, this);
    }
}
