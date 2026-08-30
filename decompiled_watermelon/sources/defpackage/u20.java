package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u20  reason: default package */
/* loaded from: classes.dex */
public final class u20 implements s52 {
    public final /* synthetic */ int a;
    public final df4 b;
    public final Object c;

    public /* synthetic */ u20(Object obj, df4 df4Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = df4Var;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [f60, java.lang.Object, u60] */
    @Override // defpackage.s52
    public final Object a(j11 j11Var) {
        int i = this.a;
        boolean z = false;
        Object obj = this.c;
        df4 df4Var = this.b;
        switch (i) {
            case 0:
                return new qk1(new BitmapDrawable(df4Var.a.getResources(), (Bitmap) obj), false, i81.MEMORY);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ?? obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = df4Var.a;
                    return new wb6(new tb6(obj2, null), null, i81.MEMORY);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = k.a;
                z = ((drawable instanceof VectorDrawable) || (drawable instanceof c77)) ? true : true;
                if (z) {
                    drawable = new BitmapDrawable(df4Var.a.getResources(), w81.j(drawable, df4Var.b, df4Var.d, df4Var.e, df4Var.f));
                }
                return new qk1(drawable, z, i81.MEMORY);
        }
    }
}
