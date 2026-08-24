package defpackage;

import android.graphics.Bitmap;
import me.magnum.melonds.translator.capture.ScreenCaptureService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s66  reason: default package */
/* loaded from: classes.dex */
public final class s66 extends hw6 implements eo2 {
    public int X;
    public int Y;

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((s66) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new hw6(2, r41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003a -> B:19:0x003d). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.Y;
        if (i2 != 0) {
            if (i2 == 1) {
                i = this.X;
                oi2.Y(obj);
                i--;
                if (i > 0) {
                    Bitmap bitmap = ScreenCaptureService.d0;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        try {
                            return bitmap.copy(Bitmap.Config.ARGB_8888, false);
                        } catch (Exception unused) {
                        }
                    } else {
                        this.X = i;
                        this.Y = 1;
                        if (q60.t(50L, this) == x61Var) {
                            return x61Var;
                        }
                        i--;
                        if (i > 0) {
                        }
                    }
                }
                return null;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        i = 10;
        if (i > 0) {
        }
        return null;
    }
}
