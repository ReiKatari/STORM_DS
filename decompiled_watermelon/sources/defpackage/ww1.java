package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ww1  reason: default package */
/* loaded from: classes.dex */
public final class ww1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ hv1 Y;
    public final /* synthetic */ rg5 Z;
    public final /* synthetic */ ft5 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ww1(hv1 hv1Var, rg5 rg5Var, ft5 ft5Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = hv1Var;
        this.Z = rg5Var;
        this.c0 = ft5Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ww1) t(j11Var, o31Var)).v(o27Var);
            default:
                ((ww1) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        switch (this.X) {
            case 0:
                return new ww1(this.Y, this.Z, this.c0, j11Var, 0);
            default:
                return new ww1(this.Y, this.Z, this.c0, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        ft5 ft5Var = this.c0;
        rg5 rg5Var = this.Z;
        hv1 hv1Var = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return hv1Var.s.b(rg5Var, ft5Var);
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                e72 e72Var = hv1Var.s;
                e72Var.getClass();
                rg5Var.getClass();
                ft5Var.getClass();
                et5 et5Var = e72Var.b;
                File a = et5Var.a(rg5Var, ft5Var, false);
                if (a != null) {
                    et5Var.c(a);
                    a.delete();
                }
                qv5 qv5Var = hv1Var.t;
                ByteBuffer byteBuffer = qv5Var.a;
                if (byteBuffer == null) {
                    byteBuffer = ByteBuffer.allocateDirect(393216).order(ByteOrder.nativeOrder());
                    qv5Var.a = byteBuffer;
                    byteBuffer.getClass();
                }
                Bitmap createBitmap = Bitmap.createBitmap(256, RendererDebugBridge.CAPTURE_HEIGHT, Bitmap.Config.ARGB_8888);
                for (int i2 = 0; i2 < 256; i2++) {
                    for (int i3 = 0; i3 < 384; i3++) {
                        createBitmap.setPixel(i2, i3, byteBuffer.getInt(((i3 * 256) + i2) * 4));
                    }
                }
                createBitmap.getClass();
                e72Var.getClass();
                et5 et5Var2 = e72Var.b;
                File a2 = et5Var2.a(rg5Var, ft5Var, true);
                if (a2 != null) {
                    FileOutputStream fileOutputStream = new FileOutputStream(a2);
                    try {
                        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        et5Var2.c(a2);
                    } finally {
                    }
                }
                return o27.a;
        }
    }
}
