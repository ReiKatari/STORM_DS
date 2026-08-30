package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: av  reason: default package */
/* loaded from: classes.dex */
public final class av implements r52 {
    public final /* synthetic */ int a;

    public /* synthetic */ av(int i) {
        this.a = i;
    }

    @Override // defpackage.r52
    public final s52 a(Object obj, df4 df4Var, c55 c55Var) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!k.c(uri)) {
                    return null;
                }
                return new bv(uri, df4Var, 0);
            case 1:
                return new u20((Bitmap) obj, df4Var, 0);
            case 2:
                return new u20((ByteBuffer) obj, df4Var, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (!b53.x(uri2.getScheme(), "content")) {
                    return null;
                }
                return new bv(uri2, df4Var, 1);
            case 4:
                return new u20((Drawable) obj, df4Var, 2);
            case 5:
                return new b62((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (!b53.x(uri3.getScheme(), "android.resource")) {
                    return null;
                }
                return new bv(uri3, df4Var, 2);
        }
    }
}
