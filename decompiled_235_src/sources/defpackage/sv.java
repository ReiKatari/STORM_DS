package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sv  reason: default package */
/* loaded from: classes.dex */
public final class sv implements ka2 {
    public final /* synthetic */ int a;

    public /* synthetic */ sv(int i) {
        this.a = i;
    }

    @Override // defpackage.ka2
    public final la2 a(Object obj, fo4 fo4Var, pe5 pe5Var) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!k.c(uri)) {
                    return null;
                }
                return new tv(uri, fo4Var, 0);
            case 1:
                return new t40((Bitmap) obj, fo4Var, 0);
            case 2:
                return new t40((ByteBuffer) obj, fo4Var, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (!nb3.k(uri2.getScheme(), "content")) {
                    return null;
                }
                return new tv(uri2, fo4Var, 1);
            case 4:
                return new t40((Drawable) obj, fo4Var, 2);
            case 5:
                return new ua2((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (!nb3.k(uri3.getScheme(), "android.resource")) {
                    return null;
                }
                return new tv(uri3, fo4Var, 2);
        }
    }
}
