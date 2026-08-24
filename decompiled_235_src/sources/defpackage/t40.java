package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t40  reason: default package */
/* loaded from: classes.dex */
public final class t40 implements la2 {
    public final /* synthetic */ int a;
    public final fo4 b;
    public final Object c;

    public /* synthetic */ t40(Object obj, fo4 fo4Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = fo4Var;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [k80, z80, java.lang.Object] */
    @Override // defpackage.la2
    public final Object a(r41 r41Var) {
        int i = this.a;
        boolean z = false;
        Object obj = this.c;
        fo4 fo4Var = this.b;
        switch (i) {
            case 0:
                return new wo1(new BitmapDrawable(fo4Var.a.getResources(), (Bitmap) obj), false, zb1.MEMORY);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ?? obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = fo4Var.a;
                    return new mn6(new jn6(obj2, null), null, zb1.MEMORY);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = k.a;
                z = ((drawable instanceof VectorDrawable) || (drawable instanceof bl7)) ? true : true;
                if (z) {
                    drawable = new BitmapDrawable(fo4Var.a.getResources(), g04.A(drawable, fo4Var.b, fo4Var.d, fo4Var.e, fo4Var.f));
                }
                return new wo1(drawable, z, zb1.MEMORY);
        }
    }
}
